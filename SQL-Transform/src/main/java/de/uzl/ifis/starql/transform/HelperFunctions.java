package de.uzl.ifis.starql.transform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.antlr.runtime.tree.CommonTree;

import com.google.common.collect.Multiset;

import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.StarqlVar;

public class HelperFunctions {

	
	public static void printTree(CommonTree ast) {
        print(ast, 0);
	}

	private static void print(CommonTree tree, int level) {
        //indent level
        for (int i = 0; i < level; i++)
                System.out.print("--");

        //print node description: type code followed by token text
        //system.out.println(" " + tree.getType() + " " + tree.getText());
        
        //print all children
        if (tree.getChildren() != null)
                for (Object ie : tree.getChildren()) {
                        print((CommonTree) ie, level + 1);
                }
	}
	
	public static String changeClmName(String str, String newSrc ){
		////system.out.println("SOURCE: "+str+ " VAR: "+ sVar);
		if(str.isEmpty())
			return "EMPTY";
		return newSrc + str.substring(str.indexOf("."));
	}
	
	public static Set<String> toHistorical(Set<String> constraints){
		Set<String> tempConstraints = new HashSet<String>();
		for(String constr : constraints){
			tempConstraints.add(constr.replace(".","_stream."));                     
		}
		return tempConstraints;
	}
	
	public static String toVarColumn(String source, String newSrc) {
		Boolean cast = false;
		if(source.isEmpty())
			return "EMPTY";
		////system.out.println("STRING: "+source);
		if(source.startsWith("CAST(")){
			cast = true;
			source = source.substring(source.indexOf("(") + 1, source.length() - 1);
		}else{
			if(source.startsWith("(")){
				source = source.substring(source.indexOf("(") + 1, source.length() - 1);
			}
		}
		String newSource = "";
		if(!source.contains("||")){
			newSource = changeClmName(source, newSrc);
		}else{			
			Integer cnt = 1;
			String[] srcSplit = source.split(Pattern.quote("||")); 
			for(String str : srcSplit){			
				////system.out.println("Part: " + str);
				if(str.startsWith("'")){
					newSource += str;
				}else{
					newSource += changeClmName(str.trim(), newSrc);
				}
				if(cnt == srcSplit.length)
					break;
				newSource += " || ";
				cnt++;
			}
			////system.out.println("Anzahl: " + cnt + " Real: " +srcSplit.length);
		}
		if(cast)
			newSource = "CAST(" + newSource + ")";
		else
			newSource = "(" + newSource + ")";
		////system.out.println("STRING2: "+newSource);
		return newSource;
	}
	
	public static String getSetAsString(Set<String> set, Boolean first, String delimiter){
		String str = "";
		for(String ele : set){
			if(!first){
				str += delimiter;
			}else{
				first = false;	
			}
			str += ele;
		}		
		return str;
	}
	
	public static String getSetAsString(List<String> set, Boolean first, String delimiter){
		String str = "";
		for(String ele : set){
			if(!first){
				str += delimiter;
			}else{
				first = false;	
			}
			str += ele;
		}		
		return str;
	}
	
	/*
	 * Collects all vars from underlying triples 
	 */
	public static Multiset<StarqlVar> fillVars(Multiset<StarqlVar> tripleVars, Set<IndexedTriple> iTriples){
		for(IndexedTriple iTriple : iTriples){						
				for(StarqlVar sVar : iTriple.getUnboundValues()){
					for(Triple trple : iTriple.getVarTriple(sVar)){
						tripleVars.add(sVar);
					}
			}				
		}	
		return tripleVars;
	}
	
	public static Multiset<StarqlVar> fillVarsFromTriple(Multiset<StarqlVar> tripleVars, Set<Triple> triples){					
		for(Triple trple : triples){
			for(StarqlVar sVar : trple.getUnboundValues())
				if(trple.containsVar(sVar))
					tripleVars.add(sVar);
		}					
		return tripleVars;
	}
	
	public static Set<StarqlVar> fillVarsFromTriple(Set<StarqlVar> tripleVars, Set<Triple> triples){					
		for(Triple trple : triples){
			for(StarqlVar sVar : trple.getUnboundValues())
				if(trple.containsVar(sVar))
					tripleVars.add(sVar);
		}					
		return tripleVars;
	}
	
	public static <K,V> Map<K, Set<V>> mapToSet(Map<K, Set<V>> varMap, K key, V val) {
		Set<V> set = new HashSet<V>();
		set.add(val);
		if(varMap.get(key) != null)
			set.addAll(varMap.get(key));
		varMap.put(key, set);
		return varMap;
		
	}
	
	public static <V> Set<V> addToSet(Set<V> varSet, V obj) {
		Set<V> set = new HashSet<V>();
		set.addAll(varSet);
		set.add(obj);
		return set;
		
	}
	
	public static <V> List<V> addToList(List<V> varSet, V obj) {
		List<V> set = new ArrayList<V>();
		set.addAll(varSet);
		set.add(obj);
		return set;
		
	}
	
}
