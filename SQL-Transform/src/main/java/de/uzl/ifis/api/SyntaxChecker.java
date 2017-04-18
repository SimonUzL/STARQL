package de.uzl.ifis.api;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import de.uzl.ifis.starql.parser.*;
import de.uzl.ifis.starql.query.*;
import de.uzl.ifis.starql.query.QueryHead.HeadType;
import de.uzl.ifis.starql.query.base.*;
import de.uzl.ifis.starql.query.having.*;
import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import de.uzl.ifis.starql.transform.AggRewriter;


public class SyntaxChecker {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	final static String starqlFile = "target/test-classes/SiemensPublic/Example3.txt";
	public static void main(String[] args) throws RecognitionException {			
		String starql = "";
		try {
			starql = readFile(starqlFile, StandardCharsets.UTF_8);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		CharStream charStream = new ANTLRStringStream(starql);
		StarqlLexer lexer = new StarqlLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		StarqlParser parser = new StarqlParser(tokenStream);		
		StarqlParser.query_return ret = parser.query();
		System.out.println("syntax tree");
		//System.out.println(charStream.substring(0, charStream.size()-1));
		printTree((CommonTree)ret.getTree());
		CommonTreeNodeStream ctns = new CommonTreeNodeStream(ret.getTree());	
		StarqlTreeWalker walker = new StarqlTreeWalker(ctns);	
		QueryInfo qi = walker.query();		
		
		
		for(Prefix pf : qi.getPrefixList()){	    		
    		System.out.println("-PREFIX- Variable="+pf.getVar() +" IRI="+pf.getIri());	    	
    	}
	    /*if(qi.getPulse().getStart() != null)
		 System.out.println("-PULSE- start: "+qi.getPulse().getStart());
	    if(qi.getPulse().getEnd() != null) 
	    System.out.println("-PULSE- end: "+qi.getPulse().getEnd());		    
	    System.out.println("-PULSE- frequency: "+qi.getPulse().getFreq()+"s");*/
	       
		  for(Stream s : qi.getStreamList()){	    	
		    	System.out.println("Is safe: "+ s.isSafe());
		    	if(s.getReturn().gethType().equals(HeadType.CONSTRUCT))
			    	for(Triple res : s.getReturn().getiTriple().getTriple()){	    		
			    		System.out.println("-RETURN CONSTRUCT- Subject="+res.getSubject().toString() +" Predicate="+res.getPredicate().toString()+" Object="+res.getObject().toString()+" Timestamp="+s.getReturn().getiTriple().getTime().toString()+ " uses flooroperator="+s.getReturn().getiTriple().isFloor());	    	
			    	}	 
		    	else
		    		System.out.println("-RETURN SELECT- " + s.getReturn().getVars());	    	
		    	for(Window win : s.getFrom().getList()){	    		
		    		System.out.print("-FROM STREAM- Stream="+win.getName()+" ");
		    		System.out.print("Slack="+win.getSlack().getPeriod().toStandardSeconds().getSeconds()+" ");
		    		if(qi.getPulse(s.getPulse()) != null){
		    			System.out.print("NewStart="+qi.getPulse(s.getPulse()).getStartInteger()+" ");
		    		}
		    		System.out.print("Slide="+win.getSlide().getPeriod().toStandardSeconds().getSeconds()+" " );
		    		System.out.print("WinStart="+win.getStartTime()+"s " );
		    		System.out.println("WinEnd="+win.getEndTime());	    	
		    	}
		    	if(qi.getPulse() != null){
		    		if(qi.getPulse(s.getPulse()).getStart() != null)
		    		 System.out.println("-USING- start: "+qi.getPulse(s.getPulse()).getStart());
		    	    if(qi.getPulse(s.getPulse()).getEnd() != null) 
		    	    System.out.println("-USING- end: "+qi.getPulse(s.getPulse()).getEnd());		    
		    	    System.out.println("-USING- frequency: "+qi.getPulse(s.getPulse()).getFreq().toStandardSeconds().getSeconds()+"s");}
		    	if(s.getResList() != null)
		    	for(Resource res : s.getResList().getRes()){	    
		    		System.out.println("-FROM RESSOURCE- ResourceType="+res.getResourceType()+" ResourceIri="+res.getResourceIri());
		    	}
		    	if(s.getWhere() != null)
		    	for(Triple res : s.getWhere().getTriple()){	    		
		    		System.out.println("-WHERE- Subject="+res.getSubject().toString() +" Predicate="+res.getPredicate().toString()+" Object="+res.getObject().toString());	    	
		    	}
		    	System.out.println("-SEQUENCE- "+" Type="+s.getSeq().getsType()+ " Name="+s.getSeq().getsName());
		    	if(s.getHvg() != null){
		    		System.out.println("-HAVING-");   		
		    		System.out.println("safeVars:" + s.getHvg().getSafeVars().getVars());
		    		printHaving(s.getHvg());
		    	}
		    	if(s.getHvgAggregate() != null)
		    		System.out.println("-AGGREGATE- "+TreeFunctions.printAggregate(s.getHvgAggregate()));
		    }
	    
	}
	
	private static void printTree(CommonTree ast) {
        print(ast, 0);
}

	private static void print(CommonTree tree, int level) {
        //indent level
        for (int i = 0; i < level; i++)
                System.out.print("--");

        //print node description: type code followed by token text
        System.out.println(" " + tree.getType() + " " + tree.getText());
        
        //print all children
        if (tree.getChildren() != null)
                for (Object ie : tree.getChildren()) {
                        print((CommonTree) ie, level + 1);
                }
}
	
	private static void printHaving(HvgTreeElem hvg){
		HvgTreeElem newTree = TreeFunctions.allFuncs(hvg);
		//if(newTree.getUnSafeVars().getVars().isEmpty())
		TreeFunctions.printHavingTree(newTree, 1);
		System.out.println(newTree.getUnboundValues());
		//else
		//	System.out.println("Not Safe: " + newTree.getUnSafeVars().getVars());
	}
	
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return encoding.decode(ByteBuffer.wrap(encoded)).toString();
			}

}
