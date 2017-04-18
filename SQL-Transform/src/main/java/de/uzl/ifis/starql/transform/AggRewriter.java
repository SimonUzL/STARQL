/**
 * Rewriting for AggOperators
 *
 * @author Christian Neuenstadt
 */

package de.uzl.ifis.starql.transform;

// package de.tuhh.sts.optique.starql.transform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openrdf.model.Statement;

public class AggRewriter extends Rewriter {
	private String qryNoOp = query;
	private String replacedOp = "";
	private HashMap<String, String> operators = new HashMap<String, String>();

	public AggRewriter(String qry) {
		super(qry);
	}

	public static Set<String> get_matches(String s, String p) {
		// returns all matches of p in s for first group in regular expression
		Set<String> matches = new HashSet<String>();
		Matcher m = Pattern.compile(p).matcher(s);
		while (m.find()) {
			matches.add(m.group());
		}
		return matches;
	}

	public static ArrayList<String> get_matchesList(String s, String p) {
		// returns all matches of p in s for first group in regular expression

		ArrayList<String> matches = new ArrayList<String>();
		// Set<String> matches = new HashSet<String>();
		Matcher m = Pattern.compile(p).matcher(s);
		while (m.find()) {
			matches.add(m.group());
		}
		return matches;
	}

	/**
	 * 
	 * the aggregator's name is returned
	 * 
	 * @param op
	 * @return
	 */
	private String exOpName(String op) {
		String name = "";
		op = op.replace("CREATE AGGREGATE OPERATOR", "");
		name = op.substring(0, op.indexOf("("));
		return name.trim();
	}

	public void getAggOperatorsSorted() {

		String tempQry = query;
		String operator = "";
		int ind = 0;
		while (tempQry.indexOf("CREATE AGGREGATE OPERATOR") != -1) {
			ind = tempQry.indexOf("CREATE AGGREGATE OPERATOR");
			operator = tempQry.substring(ind,
					tempQry.indexOf("CREATE", ind + 1));
			tempQry = tempQry.replace(
					tempQry.substring(ind, tempQry.indexOf("CREATE", ind + 1)),
					"");
			operators.put(exOpName(operator), operator);
		}
		qryNoOp = tempQry;
	}

	public void getAggOperators() {
		String tempQry = query;
		String subStringContainingCreate = "";
		int ind = 0;
		String newQuery = "";
		ArrayList<String> matches;

		while (tempQry.indexOf("PREFIX") != -1) {
			ind = tempQry.indexOf("PREFIX");			
			subStringContainingCreate = tempQry.substring(ind,
					tempQry.indexOf("CREATE", ind + 1));
			newQuery += subStringContainingCreate;
			tempQry = tempQry.replace(
					tempQry.substring(ind,
							tempQry.indexOf("CREATE", ind + 1)), "");			
		}
		while (tempQry.indexOf("CREATE") != -1) {
			ind = tempQry.indexOf("CREATE");
			matches = get_matchesList(tempQry, "CREATE");
			if (!(matches.size() == 1)) {
				subStringContainingCreate = tempQry.substring(ind,
						tempQry.indexOf("CREATE", ind + 1));
				if (subStringContainingCreate
						.contains("CREATE AGGREGATE OPERATOR")) {
					operators.put(exOpName(subStringContainingCreate),
							subStringContainingCreate);
				} else {
					newQuery += subStringContainingCreate;
				}
				tempQry = tempQry.replace(
						tempQry.substring(ind,
								tempQry.indexOf("CREATE", ind + 1)), "");

			}
			else {
				subStringContainingCreate = tempQry;
				if (subStringContainingCreate
						.contains("CREATE AGGREGATE OPERATOR")) {
					operators.put(exOpName(subStringContainingCreate),
							subStringContainingCreate);
				} else {
					newQuery += subStringContainingCreate;
				}
				tempQry = "";
			}
		}
		qryNoOp = newQuery;
	}

	private String exRegExpFromOp(String op) {
		String regEx = "";
		regEx = op.substring(op.indexOf(",") + 1, op.indexOf("AS")); // regEx =>
																		// f(*))
		return regEx.trim().substring(0, regEx.trim().length() - 1)
				.replace("*", "[^\\)]*");
	}

	private String delTitlefromOp(String op) {
		op = op.substring(op.indexOf("AS") + 2).trim();
		return op;
	}

	private String buildOpPattern() {
		String str = "";
		return str;
	}

	public void replaceOps() {
		String curOp, curName, regExp = "";
		Set<String> starMatches = new HashSet<String>();
		getAggOperators();
		Iterator it = operators.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			curName = (String) entry.getKey();
			curOp = (String) entry.getValue();
			regExp = exRegExpFromOp(curOp);
			curOp = delTitlefromOp(curOp);
			starMatches = get_matches(curOp, regExp);
			String tempStr, insertStr, splitChar = "";
			////system.out.println("curName: " + curName);
			while (qryNoOp.indexOf(curName) != -1) {
				tempStr = qryNoOp.substring(qryNoOp.indexOf(curName),
						qryNoOp.indexOf(")", qryNoOp.indexOf(curName)) + 1)
						.trim();
				if (tempStr.contains(",")) {
					splitChar = ",";
				} else {
					splitChar = "(";
				}
				for (String pattern : starMatches) {
					if (pattern.contains("*"))
						continue;
					String replStar = pattern
							.substring(pattern.indexOf("(") + 1);
					insertStr = tempStr
							.substring(tempStr.indexOf(splitChar) + 1,
									tempStr.indexOf(")")).trim()
							.replace("*", replStar);
					pattern += ")";
					curOp = curOp.replace(pattern, insertStr);
				}
				////system.out.println("tempStr: " + tempStr);
				////system.out.println("curOp: " + curOp);
				qryNoOp = qryNoOp.replace(tempStr, curOp);
			}

		}
		query = qryNoOp;
		////system.out.println("newQry: " + query);
	}
}
