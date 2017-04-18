// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g 2016-06-23 22:34:05


  package de.uzl.ifis.starql.parser;
  
  import de.uzl.ifis.starql.query.*;
  import de.uzl.ifis.starql.query.base.*;
  import de.uzl.ifis.starql.query.having.*;
  import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;
  import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
  import de.uzl.ifis.starql.query.QueryHead.HeadType;
  import java.util.HashSet;
  import java.util.Set;
  


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class StarqlTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUERY", "SUBSELECT", "CONSTRUCT_CLAUSE", "SELECT_CLAUSE", "WHERE_CLAUSE", "VAR", "GROUP_GRAPH_PATTERN", "ARG_LIST", "EXPRESSION_LIST", "INDEXED_TRIPLE", "TRIPLE", "INDEX", "SUBJECT", "PREDICATE", "OBJECT", "NOT_EXISTS", "FUNCTION", "UNARY_NOT", "UNARY_PLUS", "UNARY_MINUS", "UNARY", "BLANK_NODE", "WINDOW", "BOUND_INDEXES", "BOUND_VALUES", "START", "FREQUENCE", "SLACK", "SLIDE", "TIME", "LOGICAL", "VALUE_ATOM", "INDEX_ARITH", "PREFIX", "PNAME_NS", "IRI_REF", "CREATE", "STREAM", "IDENT", "AS", "AGGREGATE", "OPERATOR", "OPEN_BRACE", "COMMA", "CLOSE_BRACE", "ASTERISK", "LESS", "GREATER", "PULSE", "WITH", "EQUAL", "END", "FREQUENCY", "USING", "FROM", "SELECT", "DISTINCT", "CONSTRUCT", "OPEN_CURLY_BRACE", "CLOSE_CURLY_BRACE", "NOW", "PLUS", "MINUS", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "LEFT_ARROW", "RIGHT_ARROW", "BY", "SEQUENCE", "WHERE", "GROUP", "HAVING", "STATIC", "ABOX", "TEMPORAL", "TBOX", "DOT", "OR", "AND", "NOT", "GRAPH", "FORALL", "IN", "IF", "THEN", "SEMICOLON", "A", "VAR_VALUE", "VAR_INDEX", "NOT_EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "DIVIDE", "ABS", "EXISTS", "LANGTAG", "REFERENCE", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "PNAME_LN", "RESSOURCE", "EOL", "WS", "NAMED", "OPTIONAL", "FILTER", "IRI", "URI", "YEAR", "MONTH", "DAY", "HOURS", "MINUTES", "SECONDS", "ELSE", "EQUALS", "PN_PREFIX", "PN_LOCAL", "QUESTION_MARK", "VARNAME", "VARNAME_SEQ", "DIGIT", "EXPONENT", "SIGN", "ECHAR", "IRI_REF_CHARACTERS", "PIPE", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "COMMENT", "NEGATION", "ANY", "LETTER", "'|_'", "'_|'", "BLANK_NODE_LABEL"
    };
    public static final int FUNCTION=20;
    public static final int INDEX_ARITH=36;
    public static final int SIGN=140;
    public static final int PREFIX=37;
    public static final int EXPONENT=139;
    public static final int GRAPH=84;
    public static final int LETTER=150;
    public static final int INDEXED_TRIPLE=13;
    public static final int RIGHT_ARROW=70;
    public static final int PNAME_LN=116;
    public static final int NOW=64;
    public static final int EQUALS=132;
    public static final int DAY=127;
    public static final int CONSTRUCT=61;
    public static final int NOT=83;
    public static final int EOF=-1;
    public static final int MONTH=126;
    public static final int UNARY_PLUS=22;
    public static final int VARNAME=136;
    public static final int CREATE=40;
    public static final int GREATER=51;
    public static final int EOL=118;
    public static final int USING=57;
    public static final int NOT_EQUAL=93;
    public static final int LESS=50;
    public static final int QUESTION_MARK=135;
    public static final int BOUND_INDEXES=27;
    public static final int DOUBLE=103;
    public static final int PN_CHARS_U=145;
    public static final int UNARY_NOT=21;
    public static final int VAR=9;
    public static final int SELECT_CLAUSE=7;
    public static final int STREAM=41;
    public static final int COMMENT=147;
    public static final int OPEN_CURLY_BRACE=62;
    public static final int SELECT=59;
    public static final int CLOSE_CURLY_BRACE=63;
    public static final int DOUBLE_POSITIVE=106;
    public static final int T__151=151;
    public static final int DIVIDE=96;
    public static final int T__152=152;
    public static final int A=90;
    public static final int VAR_VALUE=91;
    public static final int STATIC=76;
    public static final int ELSE=131;
    public static final int BLANK_NODE_LABEL=153;
    public static final int VAR_INDEX=92;
    public static final int ARG_LIST=11;
    public static final int UNARY_MINUS=23;
    public static final int SEMICOLON=89;
    public static final int URI=124;
    public static final int CLOSE_SQUARE_BRACKET=68;
    public static final int ABS=97;
    public static final int VALUE_ATOM=35;
    public static final int SEQUENCE=72;
    public static final int GROUP=74;
    public static final int WS=119;
    public static final int NAMED=120;
    public static final int INTEGER_POSITIVE=104;
    public static final int STRING_LITERAL2=113;
    public static final int OR=81;
    public static final int FILTER=122;
    public static final int STRING_LITERAL1=112;
    public static final int PN_CHARS=146;
    public static final int SUBSELECT=5;
    public static final int QUERY=4;
    public static final int LESS_EQUAL=94;
    public static final int GROUP_GRAPH_PATTERN=10;
    public static final int DOUBLE_NEGATIVE=109;
    public static final int SLACK=31;
    public static final int END=55;
    public static final int FROM=58;
    public static final int FALSE=111;
    public static final int DISTINCT=60;
    public static final int SLIDE=32;
    public static final int SUBJECT=16;
    public static final int FREQUENCY=56;
    public static final int IRI_REF=39;
    public static final int WHERE=73;
    public static final int YEAR=125;
    public static final int CONSTRUCT_CLAUSE=6;
    public static final int SECONDS=130;
    public static final int FREQUENCE=30;
    public static final int AND=82;
    public static final int BOUND_VALUES=28;
    public static final int PREDICATE=17;
    public static final int ASTERISK=49;
    public static final int IF=87;
    public static final int AS=43;
    public static final int INDEX=15;
    public static final int TIME=33;
    public static final int WHERE_CLAUSE=8;
    public static final int THEN=88;
    public static final int IN=86;
    public static final int EXPRESSION_LIST=12;
    public static final int PULSE=52;
    public static final int OBJECT=18;
    public static final int COMMA=47;
    public static final int IRI=123;
    public static final int EQUAL=54;
    public static final int DECIMAL_POSITIVE=105;
    public static final int IDENT=42;
    public static final int PLUS=65;
    public static final int PIPE=143;
    public static final int EXISTS=98;
    public static final int DIGIT=138;
    public static final int TRIPLE=14;
    public static final int DOT=80;
    public static final int LEFT_ARROW=69;
    public static final int UNARY=24;
    public static final int WITH=53;
    public static final int INTEGER=101;
    public static final int VARNAME_SEQ=137;
    public static final int BY=71;
    public static final int BLANK_NODE=25;
    public static final int OPEN_SQUARE_BRACKET=67;
    public static final int OPERATOR=45;
    public static final int INTEGER_NEGATIVE=107;
    public static final int RESSOURCE=117;
    public static final int FORALL=85;
    public static final int PN_LOCAL=134;
    public static final int PNAME_NS=38;
    public static final int REFERENCE=100;
    public static final int HAVING=75;
    public static final int CLOSE_BRACE=48;
    public static final int MINUS=66;
    public static final int TRUE=110;
    public static final int NOT_EXISTS=19;
    public static final int ECHAR=141;
    public static final int OPTIONAL=121;
    public static final int MINUTES=129;
    public static final int IRI_REF_CHARACTERS=142;
    public static final int ANY=149;
    public static final int STRING_LITERAL_LONG2=115;
    public static final int PN_CHARS_BASE=144;
    public static final int NEGATION=148;
    public static final int DECIMAL=102;
    public static final int TBOX=79;
    public static final int STRING_LITERAL_LONG1=114;
    public static final int DECIMAL_NEGATIVE=108;
    public static final int PN_PREFIX=133;
    public static final int START=29;
    public static final int WINDOW=26;
    public static final int LOGICAL=34;
    public static final int ABOX=77;
    public static final int OPEN_BRACE=46;
    public static final int AGGREGATE=44;
    public static final int GREATER_EQUAL=95;
    public static final int HOURS=128;
    public static final int LANGTAG=99;
    public static final int TEMPORAL=78;

    // delegates
    // delegators


        public StarqlTreeWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public StarqlTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return StarqlTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g"; }



    // $ANTLR start "query"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:25:1: query returns [QueryInfo qi] : ^( QUERY (p= prefixDecl )* (c= createClause )* ) ;
    public final QueryInfo query() throws RecognitionException {
        QueryInfo qi = null;

        Prefix p = null;

        CreateObject c = null;


         
        qi = new QueryInfo();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:29:5: ( ^( QUERY (p= prefixDecl )* (c= createClause )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:29:7: ^( QUERY (p= prefixDecl )* (c= createClause )* )
            {
            match(input,QUERY,FOLLOW_QUERY_in_query74); if (state.failed) return qi;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return qi;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:29:15: (p= prefixDecl )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==PREFIX) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:29:16: p= prefixDecl
                	    {
                	    pushFollow(FOLLOW_prefixDecl_in_query79);
                	    p=prefixDecl();

                	    state._fsp--;
                	    if (state.failed) return qi;
                	    if ( state.backtracking==0 ) {
                	      qi.setPrefix(p);
                	    }

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:29:51: (c= createClause )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==CREATE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:29:52: c= createClause
                	    {
                	    pushFollow(FOLLOW_createClause_in_query88);
                	    c=createClause();

                	    state._fsp--;
                	    if (state.failed) return qi;
                	    if ( state.backtracking==0 ) {
                	      if(c.isPulse()) qi.addPulse(c.getPulse());
                	          						   if(c.isStream())qi.setStream(c.getStream()); 
                	          						   if(c.isAgg()) qi.setAgg(c.getAgg());
                	          							
                	    }

                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return qi;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return qi;
    }
    // $ANTLR end "query"


    // $ANTLR start "createClause"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:35:1: createClause returns [CreateObject co] : ( CREATE ^( STREAM IDENT strm= queryDef ) | CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE p2= pulseExp ) ;
    public final CreateObject createClause() throws RecognitionException {
        CreateObject co = null;

        CommonTree IDENT1=null;
        Stream strm = null;

        Pulse p2 = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:36:2: ( ( CREATE ^( STREAM IDENT strm= queryDef ) | CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE p2= pulseExp ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:37:2: ( CREATE ^( STREAM IDENT strm= queryDef ) | CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE p2= pulseExp )
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:37:2: ( CREATE ^( STREAM IDENT strm= queryDef ) | CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE p2= pulseExp )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CREATE) ) {
                switch ( input.LA(2) ) {
                case STREAM:
                    {
                    alt4=1;
                    }
                    break;
                case AGGREGATE:
                    {
                    alt4=2;
                    }
                    break;
                case PULSE:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return co;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return co;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:37:4: CREATE ^( STREAM IDENT strm= queryDef )
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_createClause119); if (state.failed) return co;
                    match(input,STREAM,FOLLOW_STREAM_in_createClause122); if (state.failed) return co;

                    match(input, Token.DOWN, null); if (state.failed) return co;
                    IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_createClause124); if (state.failed) return co;
                    pushFollow(FOLLOW_queryDef_in_createClause130);
                    strm=queryDef();

                    state._fsp--;
                    if (state.failed) return co;

                    match(input, Token.UP, null); if (state.failed) return co;
                    if ( state.backtracking==0 ) {
                       strm.setName((IDENT1!=null?IDENT1.getText():null)); co = new CreateObject(strm, "stream"); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:38:4: CREATE AGGREGATE operatorDef ( hvgOrConstraint )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_createClause138); if (state.failed) return co;
                    match(input,AGGREGATE,FOLLOW_AGGREGATE_in_createClause140); if (state.failed) return co;
                    pushFollow(FOLLOW_operatorDef_in_createClause142);
                    operatorDef();

                    state._fsp--;
                    if (state.failed) return co;
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:38:33: ( hvgOrConstraint )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==LOGICAL||LA3_0==IDENT||LA3_0==OPEN_BRACE||(LA3_0>=OR && LA3_0<=FORALL)||LA3_0==IF||LA3_0==EXISTS) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: hvgOrConstraint
                            {
                            pushFollow(FOLLOW_hvgOrConstraint_in_createClause144);
                            hvgOrConstraint();

                            state._fsp--;
                            if (state.failed) return co;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      co = new CreateObject(new AggMacro(), "agg");
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:39:4: CREATE p2= pulseExp
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_createClause152); if (state.failed) return co;
                    pushFollow(FOLLOW_pulseExp_in_createClause158);
                    p2=pulseExp();

                    state._fsp--;
                    if (state.failed) return co;
                    if ( state.backtracking==0 ) {
                      co = new CreateObject(p2, "pulse");
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return co;
    }
    // $ANTLR end "createClause"


    // $ANTLR start "prefixDecl"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:43:1: prefixDecl returns [Prefix px] : ^( PREFIX PNAME_NS IRI_REF ) ;
    public final Prefix prefixDecl() throws RecognitionException {
        Prefix px = null;

        CommonTree PNAME_NS2=null;
        CommonTree IRI_REF3=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:44:5: ( ^( PREFIX PNAME_NS IRI_REF ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:44:7: ^( PREFIX PNAME_NS IRI_REF )
            {
            match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl183); if (state.failed) return px;

            match(input, Token.DOWN, null); if (state.failed) return px;
            PNAME_NS2=(CommonTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDecl185); if (state.failed) return px;
            IRI_REF3=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDecl187); if (state.failed) return px;
            if ( state.backtracking==0 ) {
              px = new Prefix((PNAME_NS2!=null?PNAME_NS2.getText():null), (IRI_REF3!=null?IRI_REF3.getText():null));
            }

            match(input, Token.UP, null); if (state.failed) return px;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return px;
    }
    // $ANTLR end "prefixDecl"


    // $ANTLR start "operatorDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:47:1: operatorDef : ^( macroName ( seqName )* ( starPattern )* ) ;
    public final void operatorDef() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:48:2: ( ^( macroName ( seqName )* ( starPattern )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:48:4: ^( macroName ( seqName )* ( starPattern )* )
            {
            pushFollow(FOLLOW_macroName_in_operatorDef206);
            macroName();

            state._fsp--;
            if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:48:16: ( seqName )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IDENT) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: seqName
                	    {
                	    pushFollow(FOLLOW_seqName_in_operatorDef208);
                	    seqName();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:48:25: ( starPattern )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=VALUE_ATOM && LA6_0<=INDEX_ARITH)||LA6_0==ASTERISK) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: starPattern
                	    {
                	    pushFollow(FOLLOW_starPattern_in_operatorDef211);
                	    starPattern();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operatorDef"


    // $ANTLR start "seqName"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:51:1: seqName returns [String str] : IDENT ;
    public final String seqName() throws RecognitionException {
        String str = null;

        CommonTree IDENT4=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:52:2: ( IDENT )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:52:4: IDENT
            {
            IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_seqName230); if (state.failed) return str;
            if ( state.backtracking==0 ) {
              str = (IDENT4!=null?IDENT4.getText():null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "seqName"


    // $ANTLR start "macroName"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:55:1: macroName : IDENT ;
    public final void macroName() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:56:2: ( IDENT )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:56:4: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_macroName244); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "macroName"


    // $ANTLR start "starPattern"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:59:1: starPattern : ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS var GREATER | ( var | ASTERISK ) verb ( object | ASTERISK ) ) ;
    public final void starPattern() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:60:2: ( ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS var GREATER | ( var | ASTERISK ) verb ( object | ASTERISK ) ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:61:2: ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS var GREATER | ( var | ASTERISK ) verb ( object | ASTERISK ) )
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:61:2: ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS var GREATER | ( var | ASTERISK ) verb ( object | ASTERISK ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:61:5: var OPEN_BRACE ASTERISK CLOSE_BRACE
                    {
                    pushFollow(FOLLOW_var_in_starPattern263);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_starPattern266); if (state.failed) return ;
                    match(input,ASTERISK,FOLLOW_ASTERISK_in_starPattern268); if (state.failed) return ;
                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_starPattern270); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:62:7: var OPEN_BRACE var CLOSE_BRACE LESS var GREATER
                    {
                    pushFollow(FOLLOW_var_in_starPattern279);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_starPattern281); if (state.failed) return ;
                    pushFollow(FOLLOW_var_in_starPattern283);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_starPattern285); if (state.failed) return ;
                    match(input,LESS,FOLLOW_LESS_in_starPattern287); if (state.failed) return ;
                    pushFollow(FOLLOW_var_in_starPattern289);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,GREATER,FOLLOW_GREATER_in_starPattern291); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:63:4: ( var | ASTERISK ) verb ( object | ASTERISK )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:63:4: ( var | ASTERISK )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=VALUE_ATOM && LA7_0<=INDEX_ARITH)) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==ASTERISK) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:63:5: var
                            {
                            pushFollow(FOLLOW_var_in_starPattern297);
                            var();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:63:11: ASTERISK
                            {
                            match(input,ASTERISK,FOLLOW_ASTERISK_in_starPattern301); if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_verb_in_starPattern304);
                    verb();

                    state._fsp--;
                    if (state.failed) return ;
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:63:26: ( object | ASTERISK )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=VALUE_ATOM && LA8_0<=INDEX_ARITH)||(LA8_0>=PNAME_NS && LA8_0<=IRI_REF)||LA8_0==IDENT||(LA8_0>=INTEGER && LA8_0<=DOUBLE_NEGATIVE)||(LA8_0>=STRING_LITERAL1 && LA8_0<=PNAME_LN)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==ASTERISK) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:63:27: object
                            {
                            pushFollow(FOLLOW_object_in_starPattern307);
                            object();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:63:36: ASTERISK
                            {
                            match(input,ASTERISK,FOLLOW_ASTERISK_in_starPattern311); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "starPattern"


    // $ANTLR start "aggDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:67:1: aggDef : valueLogical ;
    public final void aggDef() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:68:2: ( valueLogical )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:68:4: valueLogical
            {
            pushFollow(FOLLOW_valueLogical_in_aggDef329);
            valueLogical();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "aggDef"


    // $ANTLR start "unaryAggDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:71:1: unaryAggDef : valueLogical ;
    public final void unaryAggDef() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:72:2: ( valueLogical )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:72:5: valueLogical
            {
            pushFollow(FOLLOW_valueLogical_in_unaryAggDef342);
            valueLogical();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unaryAggDef"


    // $ANTLR start "binaryAggDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:75:1: binaryAggDef : valueLogical ;
    public final void binaryAggDef() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:76:2: ( valueLogical )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:76:5: valueLogical
            {
            pushFollow(FOLLOW_valueLogical_in_binaryAggDef355);
            valueLogical();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "binaryAggDef"


    // $ANTLR start "pulseExp"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:79:1: pulseExp returns [Pulse pls] : ^( PULSE IDENT (st= startTime )* (et= endTime )* dur= frequence ) ;
    public final Pulse pulseExp() throws RecognitionException {
        Pulse pls = null;

        CommonTree IDENT5=null;
        String st = null;

        String et = null;

        Duration dur = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:80:2: ( ^( PULSE IDENT (st= startTime )* (et= endTime )* dur= frequence ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:80:4: ^( PULSE IDENT (st= startTime )* (et= endTime )* dur= frequence )
            {
            match(input,PULSE,FOLLOW_PULSE_in_pulseExp372); if (state.failed) return pls;

            match(input, Token.DOWN, null); if (state.failed) return pls;
            IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_pulseExp374); if (state.failed) return pls;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:80:19: (st= startTime )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==START) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:80:20: st= startTime
            	    {
            	    pushFollow(FOLLOW_startTime_in_pulseExp381);
            	    st=startTime();

            	    state._fsp--;
            	    if (state.failed) return pls;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:80:37: (et= endTime )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==END) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:80:38: et= endTime
            	    {
            	    pushFollow(FOLLOW_endTime_in_pulseExp390);
            	    et=endTime();

            	    state._fsp--;
            	    if (state.failed) return pls;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            pushFollow(FOLLOW_frequence_in_pulseExp398);
            dur=frequence();

            state._fsp--;
            if (state.failed) return pls;
            if ( state.backtracking==0 ) {
              pls = new Pulse((IDENT5!=null?IDENT5.getText():null), st, et, dur.getInt());
            }

            match(input, Token.UP, null); if (state.failed) return pls;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pls;
    }
    // $ANTLR end "pulseExp"


    // $ANTLR start "pulseRef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:83:1: pulseRef returns [String value] : ^( USING IDENT ) ;
    public final String pulseRef() throws RecognitionException {
        String value = null;

        CommonTree IDENT6=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:84:5: ( ^( USING IDENT ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:84:8: ^( USING IDENT )
            {
            match(input,USING,FOLLOW_USING_in_pulseRef423); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_pulseRef425); if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = (IDENT6!=null?IDENT6.getText():null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "pulseRef"


    // $ANTLR start "startTime"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:87:1: startTime returns [String value] : ^( START v= rdfLiteral ) ;
    public final String startTime() throws RecognitionException {
        String value = null;

        StarqlVar v = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:88:2: ( ^( START v= rdfLiteral ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:88:4: ^( START v= rdfLiteral )
            {
            match(input,START,FOLLOW_START_in_startTime449); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_rdfLiteral_in_startTime455);
            v=rdfLiteral();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = v.getText();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "startTime"


    // $ANTLR start "endTime"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:91:1: endTime returns [String value] : ^( END v= rdfLiteral ) ;
    public final String endTime() throws RecognitionException {
        String value = null;

        StarqlVar v = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:92:2: ( ^( END v= rdfLiteral ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:92:4: ^( END v= rdfLiteral )
            {
            match(input,END,FOLLOW_END_in_endTime474); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_rdfLiteral_in_endTime480);
            v=rdfLiteral();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = v.getText();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "endTime"


    // $ANTLR start "frequence"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:95:1: frequence returns [Duration value] : ^( FREQUENCY dur= duration ) ;
    public final Duration frequence() throws RecognitionException {
        Duration value = null;

        Duration dur = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:96:2: ( ^( FREQUENCY dur= duration ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:96:4: ^( FREQUENCY dur= duration )
            {
            match(input,FREQUENCY,FOLLOW_FREQUENCY_in_frequence500); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_duration_in_frequence506);
            dur=duration();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = dur;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "frequence"


    // $ANTLR start "queryDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:99:1: queryDef returns [Stream strm] : ^( CONSTRUCT h= queryHead ^( FROM (win= listOfWindowedStreamExp )* (res= listOfRessources )* ) (pr= pulseRef )* (trpleList= whereClause )* (seq= seqMethod hvg= havingClause )? (gb= groupBy )? (hAgg= hvgAgg )? ) ;
    public final Stream queryDef() throws RecognitionException {
        Stream strm = null;

        QueryHead h = null;

        From win = null;

        ResourceList res = null;

        String pr = null;

        IndexedTriple trpleList = null;

        Sequence seq = null;

        HavingOr hvg = null;

        GroupBy gb = null;

        HavingOr hAgg = null;



        String str = "";
        strm = new Stream();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:104:5: ( ^( CONSTRUCT h= queryHead ^( FROM (win= listOfWindowedStreamExp )* (res= listOfRessources )* ) (pr= pulseRef )* (trpleList= whereClause )* (seq= seqMethod hvg= havingClause )? (gb= groupBy )? (hAgg= hvgAgg )? ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:104:7: ^( CONSTRUCT h= queryHead ^( FROM (win= listOfWindowedStreamExp )* (res= listOfRessources )* ) (pr= pulseRef )* (trpleList= whereClause )* (seq= seqMethod hvg= havingClause )? (gb= groupBy )? (hAgg= hvgAgg )? )
            {
            match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_queryDef535); if (state.failed) return strm;

            match(input, Token.DOWN, null); if (state.failed) return strm;
            pushFollow(FOLLOW_queryHead_in_queryDef539);
            h=queryHead();

            state._fsp--;
            if (state.failed) return strm;
            if ( state.backtracking==0 ) {
              strm.setReturn(h);
            }
            match(input,FROM,FOLLOW_FROM_in_queryDef549); if (state.failed) return strm;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return strm;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:105:15: (win= listOfWindowedStreamExp )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==STREAM) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: win= listOfWindowedStreamExp
                	    {
                	    pushFollow(FOLLOW_listOfWindowedStreamExp_in_queryDef553);
                	    win=listOfWindowedStreamExp();

                	    state._fsp--;
                	    if (state.failed) return strm;

                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);

                if ( state.backtracking==0 ) {
                  strm.setFrom(win);
                }
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:106:8: (res= listOfRessources )*
                loop13:
                do {
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RESSOURCE) ) {
                        alt13=1;
                    }


                    switch (alt13) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: res= listOfRessources
                	    {
                	    pushFollow(FOLLOW_listOfRessources_in_queryDef565);
                	    res=listOfRessources();

                	    state._fsp--;
                	    if (state.failed) return strm;

                	    }
                	    break;

                	default :
                	    break loop13;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return strm;
            }
            if ( state.backtracking==0 ) {
              strm.setResList(res);
            }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:107:7: (pr= pulseRef )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==USING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: pr= pulseRef
            	    {
            	    pushFollow(FOLLOW_pulseRef_in_queryDef578);
            	    pr=pulseRef();

            	    state._fsp--;
            	    if (state.failed) return strm;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              strm.usingPulse(pr);
            }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:108:5: (trpleList= whereClause )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WHERE_CLAUSE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:108:6: trpleList= whereClause
            	    {
            	    pushFollow(FOLLOW_whereClause_in_queryDef590);
            	    trpleList=whereClause();

            	    state._fsp--;
            	    if (state.failed) return strm;
            	    if ( state.backtracking==0 ) {
            	      strm.setWhere(trpleList);
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:109:5: (seq= seqMethod hvg= havingClause )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SEQUENCE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:109:6: seq= seqMethod hvg= havingClause
                    {
                    pushFollow(FOLLOW_seqMethod_in_queryDef604);
                    seq=seqMethod();

                    state._fsp--;
                    if (state.failed) return strm;
                    if ( state.backtracking==0 ) {
                      strm.setSeq(seq);
                    }
                    pushFollow(FOLLOW_havingClause_in_queryDef617);
                    hvg=havingClause();

                    state._fsp--;
                    if (state.failed) return strm;
                    if ( state.backtracking==0 ) {
                      strm.setHvg(hvg);
                    }

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:111:5: (gb= groupBy )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==GROUP) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:111:6: gb= groupBy
                    {
                    pushFollow(FOLLOW_groupBy_in_queryDef631);
                    gb=groupBy();

                    state._fsp--;
                    if (state.failed) return strm;
                    if ( state.backtracking==0 ) {
                      strm.setGrpby(gb);
                    }

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:112:6: (hAgg= hvgAgg )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AGGREGATE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:112:7: hAgg= hvgAgg
                    {
                    pushFollow(FOLLOW_hvgAgg_in_queryDef648);
                    hAgg=hvgAgg();

                    state._fsp--;
                    if (state.failed) return strm;
                    if ( state.backtracking==0 ) {
                      strm.setHvgAggregate(hAgg);
                    }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return strm;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return strm;
    }
    // $ANTLR end "queryDef"


    // $ANTLR start "queryHead"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:115:1: queryHead returns [QueryHead head] : ( ^( SELECT_CLAUSE ( DISTINCT )? bl= bindingList ) | ^( CONSTRUCT_CLAUSE ( DISTINCT )? sb= constructBlock ) );
    public final QueryHead queryHead() throws RecognitionException {
        QueryHead head = null;

        ArrayList<Binding> bl = null;

        IndexedTriple sb = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:116:5: ( ^( SELECT_CLAUSE ( DISTINCT )? bl= bindingList ) | ^( CONSTRUCT_CLAUSE ( DISTINCT )? sb= constructBlock ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SELECT_CLAUSE) ) {
                alt21=1;
            }
            else if ( (LA21_0==CONSTRUCT_CLAUSE) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return head;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:116:7: ^( SELECT_CLAUSE ( DISTINCT )? bl= bindingList )
                    {
                    match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_queryHead679); if (state.failed) return head;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return head;
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:116:23: ( DISTINCT )?
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==DISTINCT) ) {
                            alt19=1;
                        }
                        switch (alt19) {
                            case 1 :
                                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_queryHead681); if (state.failed) return head;

                                }
                                break;

                        }

                        pushFollow(FOLLOW_bindingList_in_queryHead688);
                        bl=bindingList();

                        state._fsp--;
                        if (state.failed) return head;
                        if ( state.backtracking==0 ) {
                          head = new QueryHead(HeadType.SELECT); head.setVars(bl);
                        }

                        match(input, Token.UP, null); if (state.failed) return head;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:117:7: ^( CONSTRUCT_CLAUSE ( DISTINCT )? sb= constructBlock )
                    {
                    match(input,CONSTRUCT_CLAUSE,FOLLOW_CONSTRUCT_CLAUSE_in_queryHead700); if (state.failed) return head;

                    match(input, Token.DOWN, null); if (state.failed) return head;
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:117:26: ( DISTINCT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DISTINCT) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_queryHead702); if (state.failed) return head;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_constructBlock_in_queryHead709);
                    sb=constructBlock();

                    state._fsp--;
                    if (state.failed) return head;
                    if ( state.backtracking==0 ) {
                       head = new QueryHead(HeadType.CONSTRUCT); head.setiTriple(sb);
                    }

                    match(input, Token.UP, null); if (state.failed) return head;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return head;
    }
    // $ANTLR end "queryHead"


    // $ANTLR start "binding"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:120:1: binding returns [Binding b] : aex= primaryExpression (sv= hvgValueAtom )? ;
    public final Binding binding() throws RecognitionException {
        Binding b = null;

        ArithmeticExpression aex = null;

        StarqlVar sv = null;



          b = new Binding();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:124:3: (aex= primaryExpression (sv= hvgValueAtom )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:124:5: aex= primaryExpression (sv= hvgValueAtom )?
            {
            pushFollow(FOLLOW_primaryExpression_in_binding743);
            aex=primaryExpression();

            state._fsp--;
            if (state.failed) return b;
            if ( state.backtracking==0 ) {
              b.setAex(aex);
            }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:124:46: (sv= hvgValueAtom )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VAR_VALUE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:124:47: sv= hvgValueAtom
                    {
                    pushFollow(FOLLOW_hvgValueAtom_in_binding752);
                    sv=hvgValueAtom();

                    state._fsp--;
                    if (state.failed) return b;
                    if ( state.backtracking==0 ) {
                      b.setRenameVar(sv);
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return b;
    }
    // $ANTLR end "binding"


    // $ANTLR start "bindingList"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:127:1: bindingList returns [ArrayList<Binding> bList] : (b= binding )* ;
    public final ArrayList<Binding> bindingList() throws RecognitionException {
        ArrayList<Binding> bList = null;

        Binding b = null;



          bList = new ArrayList<Binding>();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:131:3: ( (b= binding )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:131:5: (b= binding )*
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:131:5: (b= binding )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==EXPRESSION_LIST||(LA23_0>=VALUE_ATOM && LA23_0<=INDEX_ARITH)||(LA23_0>=PNAME_NS && LA23_0<=IRI_REF)||LA23_0==IDENT||LA23_0==ABS||(LA23_0>=INTEGER && LA23_0<=DOUBLE_NEGATIVE)||(LA23_0>=STRING_LITERAL1 && LA23_0<=PNAME_LN)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:131:6: b= binding
            	    {
            	    pushFollow(FOLLOW_binding_in_bindingList782);
            	    b=binding();

            	    state._fsp--;
            	    if (state.failed) return bList;
            	    if ( state.backtracking==0 ) {
            	      bList.add(b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return bList;
    }
    // $ANTLR end "bindingList"


    // $ANTLR start "constructBlock"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:134:1: constructBlock returns [IndexedTriple iTriple] : sb= hvgIndAt ;
    public final IndexedTriple constructBlock() throws RecognitionException {
        IndexedTriple iTriple = null;

        IndexedTriple sb = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:135:2: (sb= hvgIndAt )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:135:4: sb= hvgIndAt
            {
            pushFollow(FOLLOW_hvgIndAt_in_constructBlock813);
            sb=hvgIndAt();

            state._fsp--;
            if (state.failed) return iTriple;
            if ( state.backtracking==0 ) {
              iTriple = sb;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return iTriple;
    }
    // $ANTLR end "constructBlock"


    // $ANTLR start "resultTime"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:138:1: resultTime returns [ResultTime resTime] : ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) ts= duration ) | ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )? ) | v= var ) ;
    public final ResultTime resultTime() throws RecognitionException {
        ResultTime resTime = null;

        CommonTree NOW7=null;
        Duration ts = null;

        StarqlVar n1 = null;

        StarqlVar n2 = null;

        StarqlVar v = null;



        resTime = new ResultTime("0");

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:142:2: ( ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) ts= duration ) | ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )? ) | v= var ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:142:4: ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) ts= duration ) | ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )? ) | v= var )
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:142:4: ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) ts= duration ) | ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )? ) | v= var )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==NOW||LA28_0==151) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=VALUE_ATOM && LA28_0<=INDEX_ARITH)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return resTime;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:142:5: ( '|_' )? NOW ( ( ( PLUS | MINUS ) ts= duration ) | ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )? )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:142:5: ( '|_' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==151) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:142:6: '|_'
                            {
                            match(input,151,FOLLOW_151_in_resultTime837); if (state.failed) return resTime;
                            if ( state.backtracking==0 ) {
                               resTime.setFloor(true); 
                            }

                            }
                            break;

                    }

                    NOW7=(CommonTree)match(input,NOW,FOLLOW_NOW_in_resultTime843); if (state.failed) return resTime;
                    if ( state.backtracking==0 ) {
                      resTime.setNowVal((NOW7!=null?NOW7.getText():null));
                    }
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:143:2: ( ( ( PLUS | MINUS ) ts= duration ) | ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )? )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=PLUS && LA27_0<=MINUS)) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==UP||LA27_0==ASTERISK) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return resTime;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:144:3: ( ( PLUS | MINUS ) ts= duration )
                            {
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:144:3: ( ( PLUS | MINUS ) ts= duration )
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:144:5: ( PLUS | MINUS ) ts= duration
                            {
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:144:5: ( PLUS | MINUS )
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==PLUS) ) {
                                alt25=1;
                            }
                            else if ( (LA25_0==MINUS) ) {
                                alt25=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return resTime;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 0, input);

                                throw nvae;
                            }
                            switch (alt25) {
                                case 1 :
                                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:144:7: PLUS
                                    {
                                    match(input,PLUS,FOLLOW_PLUS_in_resultTime857); if (state.failed) return resTime;
                                    if ( state.backtracking==0 ) {
                                       resTime.setNowVal(resTime.getNowVal().toString() + " + " ); 
                                    }

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:144:77: MINUS
                                    {
                                    match(input,MINUS,FOLLOW_MINUS_in_resultTime862); if (state.failed) return resTime;
                                    if ( state.backtracking==0 ) {
                                       resTime.setNowVal(resTime.getNowVal().toString() + " - "); 
                                    }

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_duration_in_resultTime871);
                            ts=duration();

                            state._fsp--;
                            if (state.failed) return resTime;
                            if ( state.backtracking==0 ) {
                              resTime.setNowVal(resTime.getNowVal().toString() + String.valueOf(ts.getInt())); resTime.setFloor(false);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:146:5: ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )?
                            {
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:146:5: ( ASTERISK n1= numeric '_|' ASTERISK n2= numeric )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==ASTERISK) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:146:6: ASTERISK n1= numeric '_|' ASTERISK n2= numeric
                                    {
                                    match(input,ASTERISK,FOLLOW_ASTERISK_in_resultTime882); if (state.failed) return resTime;
                                    pushFollow(FOLLOW_numeric_in_resultTime886);
                                    n1=numeric();

                                    state._fsp--;
                                    if (state.failed) return resTime;
                                    match(input,152,FOLLOW_152_in_resultTime888); if (state.failed) return resTime;
                                    match(input,ASTERISK,FOLLOW_ASTERISK_in_resultTime890); if (state.failed) return resTime;
                                    pushFollow(FOLLOW_numeric_in_resultTime894);
                                    n2=numeric();

                                    state._fsp--;
                                    if (state.failed) return resTime;
                                    if ( state.backtracking==0 ) {
                                      resTime.setMultiplyA(Integer.parseInt(n1.getText())); resTime.setMultiplyB(Integer.parseInt(n2.getText()));
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:147:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_resultTime910);
                    v=var();

                    state._fsp--;
                    if (state.failed) return resTime;
                    if ( state.backtracking==0 ) {
                      resTime.setNowVal(v.getText());
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return resTime;
    }
    // $ANTLR end "resultTime"


    // $ANTLR start "listOfWindowedStreamExp"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:150:1: listOfWindowedStreamExp returns [From from] : ^( STREAM (i1= IDENT w= windowExp )* ) ;
    public final From listOfWindowedStreamExp() throws RecognitionException {
        From from = null;

        CommonTree i1=null;
        Window w = null;



        from = new From();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:154:5: ( ^( STREAM (i1= IDENT w= windowExp )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:154:7: ^( STREAM (i1= IDENT w= windowExp )* )
            {
            match(input,STREAM,FOLLOW_STREAM_in_listOfWindowedStreamExp940); if (state.failed) return from;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return from;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:154:16: (i1= IDENT w= windowExp )*
                loop29:
                do {
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENT) ) {
                        alt29=1;
                    }


                    switch (alt29) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:154:17: i1= IDENT w= windowExp
                	    {
                	    i1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_listOfWindowedStreamExp945); if (state.failed) return from;
                	    pushFollow(FOLLOW_windowExp_in_listOfWindowedStreamExp949);
                	    w=windowExp();

                	    state._fsp--;
                	    if (state.failed) return from;
                	    if ( state.backtracking==0 ) {
                	      w.setName((i1!=null?i1.getText():null)); from.addWindow(w);
                	    }

                	    }
                	    break;

                	default :
                	    break loop29;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return from;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return from;
    }
    // $ANTLR end "listOfWindowedStreamExp"


    // $ANTLR start "windowExp"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:157:1: windowExp returns [Window win] : ^( WINDOW (sla= slackConst )* ten1= timeExpNOW ten2= timeExpNOW sli= slideConst ) ;
    public final Window windowExp() throws RecognitionException {
        Window win = null;

        Duration sla = null;

        StarqlVar ten1 = null;

        StarqlVar ten2 = null;

        Duration sli = null;



        win = new Window();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:161:2: ( ^( WINDOW (sla= slackConst )* ten1= timeExpNOW ten2= timeExpNOW sli= slideConst ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:161:4: ^( WINDOW (sla= slackConst )* ten1= timeExpNOW ten2= timeExpNOW sli= slideConst )
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_windowExp981); if (state.failed) return win;

            match(input, Token.DOWN, null); if (state.failed) return win;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:161:16: (sla= slackConst )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==SLACK) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:0:0: sla= slackConst
            	    {
            	    pushFollow(FOLLOW_slackConst_in_windowExp985);
            	    sla=slackConst();

            	    state._fsp--;
            	    if (state.failed) return win;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              win.setSlack(sla);
            }
            pushFollow(FOLLOW_timeExpNOW_in_windowExp992);
            ten1=timeExpNOW();

            state._fsp--;
            if (state.failed) return win;
            if ( state.backtracking==0 ) {
              win.setStartTime(ten1.toString()); win.setTimewindow(ten1.toString().replace("NOW", "").replace("-", "").trim());
            }
            pushFollow(FOLLOW_timeExpNOW_in_windowExp999);
            ten2=timeExpNOW();

            state._fsp--;
            if (state.failed) return win;
            if ( state.backtracking==0 ) {
              win.setEndTime(ten2.toString());
            }
            pushFollow(FOLLOW_slideConst_in_windowExp1005);
            sli=slideConst();

            state._fsp--;
            if (state.failed) return win;
            if ( state.backtracking==0 ) {
              win.setSlide(sli);
            }

            match(input, Token.UP, null); if (state.failed) return win;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return win;
    }
    // $ANTLR end "windowExp"


    // $ANTLR start "slackConst"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:164:1: slackConst returns [Duration value] : ^( SLACK dur= duration ) ;
    public final Duration slackConst() throws RecognitionException {
        Duration value = null;

        Duration dur = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:165:2: ( ^( SLACK dur= duration ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:165:4: ^( SLACK dur= duration )
            {
            match(input,SLACK,FOLLOW_SLACK_in_slackConst1024); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_duration_in_slackConst1030);
            dur=duration();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = dur;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "slackConst"


    // $ANTLR start "slideConst"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:168:1: slideConst returns [Duration value] : ^( SLIDE dur= duration ) ;
    public final Duration slideConst() throws RecognitionException {
        Duration value = null;

        Duration dur = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:169:2: ( ^( SLIDE dur= duration ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:169:4: ^( SLIDE dur= duration )
            {
            match(input,SLIDE,FOLLOW_SLIDE_in_slideConst1050); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_duration_in_slideConst1056);
            dur=duration();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = dur;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "slideConst"


    // $ANTLR start "timeExpNOW"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:172:1: timeExpNOW returns [StarqlVar str] : ^( TIME rt= resultTime ) ;
    public final StarqlVar timeExpNOW() throws RecognitionException {
        StarqlVar str = null;

        ResultTime rt = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:173:2: ( ^( TIME rt= resultTime ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:173:4: ^( TIME rt= resultTime )
            {
            match(input,TIME,FOLLOW_TIME_in_timeExpNOW1076); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_resultTime_in_timeExpNOW1082);
            rt=resultTime();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;
            if ( state.backtracking==0 ) {
              str = rt.getNowVal();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "timeExpNOW"


    // $ANTLR start "duration"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:176:1: duration returns [Duration dur] : i= rdfLiteral ;
    public final Duration duration() throws RecognitionException {
        Duration dur = null;

        StarqlVar i = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:177:5: (i= rdfLiteral )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:177:7: i= rdfLiteral
            {
            pushFollow(FOLLOW_rdfLiteral_in_duration1111);
            i=rdfLiteral();

            state._fsp--;
            if (state.failed) return dur;
            if ( state.backtracking==0 ) {
              dur = new Duration(i.getText());
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dur;
    }
    // $ANTLR end "duration"


    // $ANTLR start "seqClass"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:180:1: seqClass returns [String cls] : ^( BY IDENT ) ;
    public final String seqClass() throws RecognitionException {
        String cls = null;

        CommonTree IDENT8=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:181:2: ( ^( BY IDENT ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:181:4: ^( BY IDENT )
            {
            match(input,BY,FOLLOW_BY_in_seqClass1134); if (state.failed) return cls;

            match(input, Token.DOWN, null); if (state.failed) return cls;
            IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_seqClass1136); if (state.failed) return cls;

            match(input, Token.UP, null); if (state.failed) return cls;
            if ( state.backtracking==0 ) {
              cls = (IDENT8!=null?IDENT8.getText():null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cls;
    }
    // $ANTLR end "seqClass"


    // $ANTLR start "seqMethod"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:184:1: seqMethod returns [Sequence seq] : ^( SEQUENCE i1= seqClass ( ^( AS i2= seqName ) )? ) ;
    public final Sequence seqMethod() throws RecognitionException {
        Sequence seq = null;

        String i1 = null;

        String i2 = null;



        seq = new Sequence("", "");

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:188:2: ( ^( SEQUENCE i1= seqClass ( ^( AS i2= seqName ) )? ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:188:4: ^( SEQUENCE i1= seqClass ( ^( AS i2= seqName ) )? )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_seqMethod1159); if (state.failed) return seq;

            match(input, Token.DOWN, null); if (state.failed) return seq;
            pushFollow(FOLLOW_seqClass_in_seqMethod1165);
            i1=seqClass();

            state._fsp--;
            if (state.failed) return seq;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:188:29: ( ^( AS i2= seqName ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==AS) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:188:30: ^( AS i2= seqName )
                    {
                    match(input,AS,FOLLOW_AS_in_seqMethod1169); if (state.failed) return seq;

                    match(input, Token.DOWN, null); if (state.failed) return seq;
                    pushFollow(FOLLOW_seqName_in_seqMethod1173);
                    i2=seqName();

                    state._fsp--;
                    if (state.failed) return seq;

                    match(input, Token.UP, null); if (state.failed) return seq;
                    if ( state.backtracking==0 ) {
                      seq.setsName(i2);
                    }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return seq;
            if ( state.backtracking==0 ) {
              seq.setsType(i1);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return seq;
    }
    // $ANTLR end "seqMethod"


    // $ANTLR start "whereClause"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:191:1: whereClause returns [IndexedTriple iTriple] : ^( WHERE_CLAUSE tL= triplesBlock ) ;
    public final IndexedTriple whereClause() throws RecognitionException {
        IndexedTriple iTriple = null;

        IndexedTriple tL = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:192:5: ( ^( WHERE_CLAUSE tL= triplesBlock ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:192:7: ^( WHERE_CLAUSE tL= triplesBlock )
            {
            match(input,WHERE_CLAUSE,FOLLOW_WHERE_CLAUSE_in_whereClause1200); if (state.failed) return iTriple;

            match(input, Token.DOWN, null); if (state.failed) return iTriple;
            pushFollow(FOLLOW_triplesBlock_in_whereClause1206);
            tL=triplesBlock();

            state._fsp--;
            if (state.failed) return iTriple;

            match(input, Token.UP, null); if (state.failed) return iTriple;
            if ( state.backtracking==0 ) {
              iTriple = tL;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return iTriple;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "groupBy"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:194:1: groupBy returns [GroupBy gb] : ^( GROUP (v= var )* ) ;
    public final GroupBy groupBy() throws RecognitionException {
        GroupBy gb = null;

        StarqlVar v = null;



        gb = new GroupBy();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:198:3: ( ^( GROUP (v= var )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:198:5: ^( GROUP (v= var )* )
            {
            match(input,GROUP,FOLLOW_GROUP_in_groupBy1233); if (state.failed) return gb;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return gb;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:198:13: (v= var )*
                loop32:
                do {
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=VALUE_ATOM && LA32_0<=INDEX_ARITH)) ) {
                        alt32=1;
                    }


                    switch (alt32) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:198:14: v= var
                	    {
                	    pushFollow(FOLLOW_var_in_groupBy1240);
                	    v=var();

                	    state._fsp--;
                	    if (state.failed) return gb;
                	    if ( state.backtracking==0 ) {
                	      gb.addGrpVar(v);
                	    }

                	    }
                	    break;

                	default :
                	    break loop32;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return gb;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return gb;
    }
    // $ANTLR end "groupBy"


    // $ANTLR start "andLogical"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:201:1: andLogical returns [HavingAnd hvg] : ( ^( AND hvg1= valueLogical hvg2= andLogical ) | hvg1= valueLogical );
    public final HavingAnd andLogical() throws RecognitionException {
        HavingAnd hvg = null;

        Logical hvg1 = null;

        HavingAnd hvg2 = null;



        hvg = new HavingAnd();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:205:5: ( ^( AND hvg1= valueLogical hvg2= andLogical ) | hvg1= valueLogical )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==AND) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=LESS && LA33_0<=GREATER)||LA33_0==EQUAL||(LA33_0>=NOT_EQUAL && LA33_0<=GREATER_EQUAL)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return hvg;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:205:7: ^( AND hvg1= valueLogical hvg2= andLogical )
                    {
                    match(input,AND,FOLLOW_AND_in_andLogical1272); if (state.failed) return hvg;

                    match(input, Token.DOWN, null); if (state.failed) return hvg;
                    pushFollow(FOLLOW_valueLogical_in_andLogical1278);
                    hvg1=valueLogical();

                    state._fsp--;
                    if (state.failed) return hvg;
                    pushFollow(FOLLOW_andLogical_in_andLogical1284);
                    hvg2=andLogical();

                    state._fsp--;
                    if (state.failed) return hvg;

                    match(input, Token.UP, null); if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1); hvg.addChildElem(hvg2);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:206:7: hvg1= valueLogical
                    {
                    pushFollow(FOLLOW_valueLogical_in_andLogical1300);
                    hvg1=valueLogical();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "andLogical"


    // $ANTLR start "orLogical"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:209:1: orLogical returns [HavingOr hvg] : ( ^( OR hvg1= andLogical hvg2= orLogical ) | hvg1= andLogical );
    public final HavingOr orLogical() throws RecognitionException {
        HavingOr hvg = null;

        HavingAnd hvg1 = null;

        HavingOr hvg2 = null;



        hvg = new HavingOr();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:213:5: ( ^( OR hvg1= andLogical hvg2= orLogical ) | hvg1= andLogical )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==OR) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=LESS && LA34_0<=GREATER)||LA34_0==EQUAL||LA34_0==AND||(LA34_0>=NOT_EQUAL && LA34_0<=GREATER_EQUAL)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return hvg;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:213:7: ^( OR hvg1= andLogical hvg2= orLogical )
                    {
                    match(input,OR,FOLLOW_OR_in_orLogical1337); if (state.failed) return hvg;

                    match(input, Token.DOWN, null); if (state.failed) return hvg;
                    pushFollow(FOLLOW_andLogical_in_orLogical1343);
                    hvg1=andLogical();

                    state._fsp--;
                    if (state.failed) return hvg;
                    pushFollow(FOLLOW_orLogical_in_orLogical1349);
                    hvg2=orLogical();

                    state._fsp--;
                    if (state.failed) return hvg;

                    match(input, Token.UP, null); if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1); hvg.addChildElem(hvg2);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:214:7: hvg1= andLogical
                    {
                    pushFollow(FOLLOW_andLogical_in_orLogical1364);
                    hvg1=andLogical();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "orLogical"


    // $ANTLR start "hvgAgg"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:217:1: hvgAgg returns [HavingOr hvg] : ^( AGGREGATE h= orLogical ) ;
    public final HavingOr hvgAgg() throws RecognitionException {
        HavingOr hvg = null;

        HavingOr h = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:218:3: ( ^( AGGREGATE h= orLogical ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:218:5: ^( AGGREGATE h= orLogical )
            {
            match(input,AGGREGATE,FOLLOW_AGGREGATE_in_hvgAgg1390); if (state.failed) return hvg;

            match(input, Token.DOWN, null); if (state.failed) return hvg;
            pushFollow(FOLLOW_orLogical_in_hvgAgg1396);
            h=orLogical();

            state._fsp--;
            if (state.failed) return hvg;

            match(input, Token.UP, null); if (state.failed) return hvg;
            if ( state.backtracking==0 ) {
              hvg = h;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "hvgAgg"


    // $ANTLR start "havingClause"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:221:1: havingClause returns [HavingOr hvg] : ^( HAVING hvg1= hvgOrConstraint ) ;
    public final HavingOr havingClause() throws RecognitionException {
        HavingOr hvg = null;

        HavingOr hvg1 = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:222:5: ( ^( HAVING hvg1= hvgOrConstraint ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:222:7: ^( HAVING hvg1= hvgOrConstraint )
            {
            match(input,HAVING,FOLLOW_HAVING_in_havingClause1423); if (state.failed) return hvg;

            match(input, Token.DOWN, null); if (state.failed) return hvg;
            pushFollow(FOLLOW_hvgOrConstraint_in_havingClause1429);
            hvg1=hvgOrConstraint();

            state._fsp--;
            if (state.failed) return hvg;
            if ( state.backtracking==0 ) {
              hvg = hvg1;
            }

            match(input, Token.UP, null); if (state.failed) return hvg;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "havingClause"


    // $ANTLR start "listOfRessources"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:225:1: listOfRessources returns [ResourceList rList] : ^( RESSOURCE (res= typedRessourceList )* ) ;
    public final ResourceList listOfRessources() throws RecognitionException {
        ResourceList rList = null;

        ResourceList res = null;



          rList = new ResourceList();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:229:5: ( ^( RESSOURCE (res= typedRessourceList )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:229:7: ^( RESSOURCE (res= typedRessourceList )* )
            {
            match(input,RESSOURCE,FOLLOW_RESSOURCE_in_listOfRessources1463); if (state.failed) return rList;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return rList;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:229:19: (res= typedRessourceList )*
                loop35:
                do {
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==STATIC||(LA35_0>=TEMPORAL && LA35_0<=TBOX)) ) {
                        alt35=1;
                    }


                    switch (alt35) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:229:20: res= typedRessourceList
                	    {
                	    pushFollow(FOLLOW_typedRessourceList_in_listOfRessources1470);
                	    res=typedRessourceList();

                	    state._fsp--;
                	    if (state.failed) return rList;
                	    if ( state.backtracking==0 ) {
                	      rList.addRes(res);
                	    }

                	    }
                	    break;

                	default :
                	    break loop35;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return rList;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return rList;
    }
    // $ANTLR end "listOfRessources"


    // $ANTLR start "typedRessourceList"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:232:1: typedRessourceList returns [ResourceList rList] : ( STATIC ABOX (s1= iriRef )* | TEMPORAL ABOX (s2= iriRef )* | TBOX (s3= iriRef )* );
    public final ResourceList typedRessourceList() throws RecognitionException {
        ResourceList rList = null;

        CommonTree STATIC9=null;
        CommonTree ABOX10=null;
        CommonTree TEMPORAL11=null;
        CommonTree ABOX12=null;
        CommonTree TBOX13=null;
        String s1 = null;

        String s2 = null;

        String s3 = null;



          rList = new ResourceList();
          Resource res = null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:237:2: ( STATIC ABOX (s1= iriRef )* | TEMPORAL ABOX (s2= iriRef )* | TBOX (s3= iriRef )* )
            int alt39=3;
            switch ( input.LA(1) ) {
            case STATIC:
                {
                alt39=1;
                }
                break;
            case TEMPORAL:
                {
                alt39=2;
                }
                break;
            case TBOX:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return rList;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:237:4: STATIC ABOX (s1= iriRef )*
                    {
                    STATIC9=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_typedRessourceList1497); if (state.failed) return rList;
                    ABOX10=(CommonTree)match(input,ABOX,FOLLOW_ABOX_in_typedRessourceList1499); if (state.failed) return rList;
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:237:16: (s1= iriRef )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=PNAME_NS && LA36_0<=IRI_REF)||LA36_0==PNAME_LN) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:237:17: s1= iriRef
                    	    {
                    	    pushFollow(FOLLOW_iriRef_in_typedRessourceList1504);
                    	    s1=iriRef();

                    	    state._fsp--;
                    	    if (state.failed) return rList;
                    	    if ( state.backtracking==0 ) {
                    	      res = new Resource((STATIC9!=null?STATIC9.getText():null) +" "+ (ABOX10!=null?ABOX10.getText():null),s1); rList.addRes(res);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:238:4: TEMPORAL ABOX (s2= iriRef )*
                    {
                    TEMPORAL11=(CommonTree)match(input,TEMPORAL,FOLLOW_TEMPORAL_in_typedRessourceList1513); if (state.failed) return rList;
                    ABOX12=(CommonTree)match(input,ABOX,FOLLOW_ABOX_in_typedRessourceList1515); if (state.failed) return rList;
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:238:18: (s2= iriRef )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=PNAME_NS && LA37_0<=IRI_REF)||LA37_0==PNAME_LN) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:238:19: s2= iriRef
                    	    {
                    	    pushFollow(FOLLOW_iriRef_in_typedRessourceList1520);
                    	    s2=iriRef();

                    	    state._fsp--;
                    	    if (state.failed) return rList;
                    	    if ( state.backtracking==0 ) {
                    	      res = new Resource((TEMPORAL11!=null?TEMPORAL11.getText():null) +" "+ (ABOX12!=null?ABOX12.getText():null),s2); rList.addRes(res);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:239:4: TBOX (s3= iriRef )*
                    {
                    TBOX13=(CommonTree)match(input,TBOX,FOLLOW_TBOX_in_typedRessourceList1529); if (state.failed) return rList;
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:239:9: (s3= iriRef )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=PNAME_NS && LA38_0<=IRI_REF)||LA38_0==PNAME_LN) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:239:10: s3= iriRef
                    	    {
                    	    pushFollow(FOLLOW_iriRef_in_typedRessourceList1534);
                    	    s3=iriRef();

                    	    state._fsp--;
                    	    if (state.failed) return rList;
                    	    if ( state.backtracking==0 ) {
                    	      res = new Resource((TBOX13!=null?TBOX13.getText():null),s3); rList.addRes(res);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return rList;
    }
    // $ANTLR end "typedRessourceList"


    // $ANTLR start "triplesBlock"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:242:1: triplesBlock returns [IndexedTriple iTriple] : (trSet= triplesSameSubject )+ ;
    public final IndexedTriple triplesBlock() throws RecognitionException {
        IndexedTriple iTriple = null;

        Set<Triple> trSet = null;



        iTriple = new IndexedTriple();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:246:5: ( (trSet= triplesSameSubject )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:246:7: (trSet= triplesSameSubject )+
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:246:7: (trSet= triplesSameSubject )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==TRIPLE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:246:8: trSet= triplesSameSubject
            	    {
            	    pushFollow(FOLLOW_triplesSameSubject_in_triplesBlock1568);
            	    trSet=triplesSameSubject();

            	    state._fsp--;
            	    if (state.failed) return iTriple;
            	    if ( state.backtracking==0 ) {

            	                      for(Triple tr : trSet)
            	                      iTriple.addTriple(tr, new ResultTime("0"));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return iTriple;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return iTriple;
    }
    // $ANTLR end "triplesBlock"


    // $ANTLR start "triplesSameSubject"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:251:1: triplesSameSubject returns [Set<Triple> trSet] : ^( TRIPLE ^( SUBJECT s= subject ) tSet= propertyListNotEmpty ) ;
    public final Set<Triple> triplesSameSubject() throws RecognitionException {
        Set<Triple> trSet = null;

        StarqlVar s = null;

        Set<Triple> tSet = null;



        trSet = new HashSet<Triple>();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:255:5: ( ^( TRIPLE ^( SUBJECT s= subject ) tSet= propertyListNotEmpty ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:255:7: ^( TRIPLE ^( SUBJECT s= subject ) tSet= propertyListNotEmpty )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triplesSameSubject1599); if (state.failed) return trSet;

            match(input, Token.DOWN, null); if (state.failed) return trSet;
            match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubject1602); if (state.failed) return trSet;

            match(input, Token.DOWN, null); if (state.failed) return trSet;
            pushFollow(FOLLOW_subject_in_triplesSameSubject1606);
            s=subject();

            state._fsp--;
            if (state.failed) return trSet;

            match(input, Token.UP, null); if (state.failed) return trSet;
            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject1611);
            tSet=propertyListNotEmpty();

            state._fsp--;
            if (state.failed) return trSet;
            if ( state.backtracking==0 ) {

                        for(Triple t : tSet){
                          Triple tr = new Triple();
                          tr.setSubject(s);
                          tr.setPredicate(t.getPredicate());
                          tr.setObject(t.getObject());
                          trSet.add(tr);
                        }
                    
            }

            match(input, Token.UP, null); if (state.failed) return trSet;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return trSet;
    }
    // $ANTLR end "triplesSameSubject"


    // $ANTLR start "brackettedConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:266:1: brackettedConstraint returns [HavingOr hvg] : OPEN_BRACE hvg1= hvgOrConstraint CLOSE_BRACE ;
    public final HavingOr brackettedConstraint() throws RecognitionException {
        HavingOr hvg = null;

        HavingOr hvg1 = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:267:5: ( OPEN_BRACE hvg1= hvgOrConstraint CLOSE_BRACE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:267:7: OPEN_BRACE hvg1= hvgOrConstraint CLOSE_BRACE
            {
            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_brackettedConstraint1635); if (state.failed) return hvg;
            pushFollow(FOLLOW_hvgOrConstraint_in_brackettedConstraint1641);
            hvg1=hvgOrConstraint();

            state._fsp--;
            if (state.failed) return hvg;
            if ( state.backtracking==0 ) {
              hvg = hvg1;
            }
            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_brackettedConstraint1645); if (state.failed) return hvg;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "brackettedConstraint"


    // $ANTLR start "hvgOrConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:270:1: hvgOrConstraint returns [HavingOr hvg] : ( ^( OR hvg1= hvgAndConstraint hvg2= hvgOrConstraint ) | hvg1= hvgAndConstraint );
    public final HavingOr hvgOrConstraint() throws RecognitionException {
        HavingOr hvg = null;

        HavingAnd hvg1 = null;

        HavingOr hvg2 = null;



        hvg = new HavingOr();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:274:5: ( ^( OR hvg1= hvgAndConstraint hvg2= hvgOrConstraint ) | hvg1= hvgAndConstraint )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==OR) ) {
                alt41=1;
            }
            else if ( (LA41_0==LOGICAL||LA41_0==IDENT||LA41_0==OPEN_BRACE||(LA41_0>=AND && LA41_0<=FORALL)||LA41_0==IF||LA41_0==EXISTS) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return hvg;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:274:10: ^( OR hvg1= hvgAndConstraint hvg2= hvgOrConstraint )
                    {
                    match(input,OR,FOLLOW_OR_in_hvgOrConstraint1682); if (state.failed) return hvg;

                    match(input, Token.DOWN, null); if (state.failed) return hvg;
                    pushFollow(FOLLOW_hvgAndConstraint_in_hvgOrConstraint1688);
                    hvg1=hvgAndConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;
                    pushFollow(FOLLOW_hvgOrConstraint_in_hvgOrConstraint1694);
                    hvg2=hvgOrConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;

                    match(input, Token.UP, null); if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1); hvg.addChildElem(hvg2);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:275:8: hvg1= hvgAndConstraint
                    {
                    pushFollow(FOLLOW_hvgAndConstraint_in_hvgOrConstraint1710);
                    hvg1=hvgAndConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "hvgOrConstraint"


    // $ANTLR start "hvgAndConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:278:1: hvgAndConstraint returns [HavingAnd hvg] : ( ^( AND hvg1= hvgAndConstraint hvg2= hvgConstraint ) | hvg1= hvgConstraint );
    public final HavingAnd hvgAndConstraint() throws RecognitionException {
        HavingAnd hvg = null;

        HvgTreeElem hvg1 = null;

        HvgTreeElem hvg2 = null;



        hvg = new HavingAnd();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:282:5: ( ^( AND hvg1= hvgAndConstraint hvg2= hvgConstraint ) | hvg1= hvgConstraint )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==AND) ) {
                alt42=1;
            }
            else if ( (LA42_0==LOGICAL||LA42_0==IDENT||LA42_0==OPEN_BRACE||(LA42_0>=NOT && LA42_0<=FORALL)||LA42_0==IF||LA42_0==EXISTS) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return hvg;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:282:8: ^( AND hvg1= hvgAndConstraint hvg2= hvgConstraint )
                    {
                    match(input,AND,FOLLOW_AND_in_hvgAndConstraint1744); if (state.failed) return hvg;

                    match(input, Token.DOWN, null); if (state.failed) return hvg;
                    pushFollow(FOLLOW_hvgAndConstraint_in_hvgAndConstraint1748);
                    hvg1=hvgAndConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;
                    pushFollow(FOLLOW_hvgConstraint_in_hvgAndConstraint1752);
                    hvg2=hvgConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1); hvg.addChildElem(hvg2);
                    }

                    match(input, Token.UP, null); if (state.failed) return hvg;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:283:8: hvg1= hvgConstraint
                    {
                    pushFollow(FOLLOW_hvgConstraint_in_hvgAndConstraint1768);
                    hvg1=hvgConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg.addChildElem(hvg1);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "hvgAndConstraint"


    // $ANTLR start "hvgAt"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:286:1: hvgAt returns [HvgTreeElem hvg] : (hia= hvgIndAt | hva= hvgValAt );
    public final HvgTreeElem hvgAt() throws RecognitionException {
        HvgTreeElem hvg = null;

        IndexedTriple hia = null;

        Logical hva = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:287:3: (hia= hvgIndAt | hva= hvgValAt )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==GRAPH) ) {
                alt43=1;
            }
            else if ( (LA43_0==LOGICAL) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return hvg;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:287:5: hia= hvgIndAt
                    {
                    pushFollow(FOLLOW_hvgIndAt_in_hvgAt1794);
                    hia=hvgIndAt();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = hia;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:288:5: hva= hvgValAt
                    {
                    pushFollow(FOLLOW_hvgValAt_in_hvgAt1806);
                    hva=hvgValAt();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = hva;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "hvgAt"


    // $ANTLR start "hvgConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:291:1: hvgConstraint returns [HvgTreeElem hvg] : (hvgelem= hvgAt | ifS= ifStatement | operatorDef | forA= forAll | exi= existsFunction | NOT hvg2= brackettedConstraint | hvg2= brackettedConstraint );
    public final HvgTreeElem hvgConstraint() throws RecognitionException {
        HvgTreeElem hvg = null;

        HvgTreeElem hvgelem = null;

        IfTreeElem ifS = null;

        Quantor forA = null;

        Quantor exi = null;

        HavingOr hvg2 = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:292:5: (hvgelem= hvgAt | ifS= ifStatement | operatorDef | forA= forAll | exi= existsFunction | NOT hvg2= brackettedConstraint | hvg2= brackettedConstraint )
            int alt44=7;
            switch ( input.LA(1) ) {
            case LOGICAL:
            case GRAPH:
                {
                alt44=1;
                }
                break;
            case IF:
                {
                alt44=2;
                }
                break;
            case IDENT:
                {
                alt44=3;
                }
                break;
            case FORALL:
                {
                alt44=4;
                }
                break;
            case EXISTS:
                {
                alt44=5;
                }
                break;
            case NOT:
                {
                alt44=6;
                }
                break;
            case OPEN_BRACE:
                {
                alt44=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return hvg;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:292:7: hvgelem= hvgAt
                    {
                    pushFollow(FOLLOW_hvgAt_in_hvgConstraint1831);
                    hvgelem=hvgAt();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = hvgelem;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:293:7: ifS= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_hvgConstraint1846);
                    ifS=ifStatement();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = ifS;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:294:7: operatorDef
                    {
                    pushFollow(FOLLOW_operatorDef_in_hvgConstraint1856);
                    operatorDef();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = new OperatorElem();
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:295:7: forA= forAll
                    {
                    pushFollow(FOLLOW_forAll_in_hvgConstraint1870);
                    forA=forAll();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = forA; 
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:296:7: exi= existsFunction
                    {
                    pushFollow(FOLLOW_existsFunction_in_hvgConstraint1884);
                    exi=existsFunction();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = exi; 
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:297:7: NOT hvg2= brackettedConstraint
                    {
                    match(input,NOT,FOLLOW_NOT_in_hvgConstraint1894); if (state.failed) return hvg;
                    pushFollow(FOLLOW_brackettedConstraint_in_hvgConstraint1900);
                    hvg2=brackettedConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = new NotElem(); hvg.addChildElem(hvg2); 
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:298:7: hvg2= brackettedConstraint
                    {
                    pushFollow(FOLLOW_brackettedConstraint_in_hvgConstraint1918);
                    hvg2=brackettedConstraint();

                    state._fsp--;
                    if (state.failed) return hvg;
                    if ( state.backtracking==0 ) {
                      hvg = hvg2;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return hvg;
    }
    // $ANTLR end "hvgConstraint"


    // $ANTLR start "hvgIndAt"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:301:1: hvgIndAt returns [IndexedTriple indTriple] : GRAPH ^( INDEXED_TRIPLE tb= triplesBlock ^( INDEX ti= resultTime ) ) ;
    public final IndexedTriple hvgIndAt() throws RecognitionException {
        IndexedTriple indTriple = null;

        IndexedTriple tb = null;

        ResultTime ti = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:302:2: ( GRAPH ^( INDEXED_TRIPLE tb= triplesBlock ^( INDEX ti= resultTime ) ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:302:3: GRAPH ^( INDEXED_TRIPLE tb= triplesBlock ^( INDEX ti= resultTime ) )
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_hvgIndAt1942); if (state.failed) return indTriple;
            match(input,INDEXED_TRIPLE,FOLLOW_INDEXED_TRIPLE_in_hvgIndAt1945); if (state.failed) return indTriple;

            match(input, Token.DOWN, null); if (state.failed) return indTriple;
            pushFollow(FOLLOW_triplesBlock_in_hvgIndAt1951);
            tb=triplesBlock();

            state._fsp--;
            if (state.failed) return indTriple;
            match(input,INDEX,FOLLOW_INDEX_in_hvgIndAt1954); if (state.failed) return indTriple;

            match(input, Token.DOWN, null); if (state.failed) return indTriple;
            pushFollow(FOLLOW_resultTime_in_hvgIndAt1958);
            ti=resultTime();

            state._fsp--;
            if (state.failed) return indTriple;

            match(input, Token.UP, null); if (state.failed) return indTriple;

            match(input, Token.UP, null); if (state.failed) return indTriple;
            if ( state.backtracking==0 ) {

              			tb.setTime(ti);	
              			indTriple = tb;							
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return indTriple;
    }
    // $ANTLR end "hvgIndAt"


    // $ANTLR start "hvgValAt"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:308:1: hvgValAt returns [Logical log] : ^( LOGICAL l= valueLogical ) ;
    public final Logical hvgValAt() throws RecognitionException {
        Logical log = null;

        Logical l = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:309:2: ( ^( LOGICAL l= valueLogical ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:309:4: ^( LOGICAL l= valueLogical )
            {
            match(input,LOGICAL,FOLLOW_LOGICAL_in_hvgValAt1981); if (state.failed) return log;

            match(input, Token.DOWN, null); if (state.failed) return log;
            pushFollow(FOLLOW_valueLogical_in_hvgValAt1987);
            l=valueLogical();

            state._fsp--;
            if (state.failed) return log;
            if ( state.backtracking==0 ) {
              log=l;
            }

            match(input, Token.UP, null); if (state.failed) return log;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return log;
    }
    // $ANTLR end "hvgValAt"


    // $ANTLR start "boundIndVar"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:312:1: boundIndVar returns [Set<StarqlVar> boundSet] : ^( BOUND_INDEXES (ind= hvgIndAriAtom )* ) ;
    public final Set<StarqlVar> boundIndVar() throws RecognitionException {
        Set<StarqlVar> boundSet = null;

        StarqlVar ind = null;



        boundSet = new HashSet<StarqlVar>();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:316:2: ( ^( BOUND_INDEXES (ind= hvgIndAriAtom )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:316:4: ^( BOUND_INDEXES (ind= hvgIndAriAtom )* )
            {
            match(input,BOUND_INDEXES,FOLLOW_BOUND_INDEXES_in_boundIndVar2013); if (state.failed) return boundSet;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return boundSet;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:316:20: (ind= hvgIndAriAtom )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==VAR_INDEX) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:316:21: ind= hvgIndAriAtom
                	    {
                	    pushFollow(FOLLOW_hvgIndAriAtom_in_boundIndVar2020);
                	    ind=hvgIndAriAtom();

                	    state._fsp--;
                	    if (state.failed) return boundSet;
                	    if ( state.backtracking==0 ) {
                	      boundSet.add(ind);
                	    }

                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return boundSet;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return boundSet;
    }
    // $ANTLR end "boundIndVar"


    // $ANTLR start "boundValVar"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:319:1: boundValVar returns [Set<StarqlVar> boundSet] : ^( BOUND_VALUES (val= hvgValueAtom )* ) ;
    public final Set<StarqlVar> boundValVar() throws RecognitionException {
        Set<StarqlVar> boundSet = null;

        StarqlVar val = null;



        boundSet = new HashSet<StarqlVar>();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:323:2: ( ^( BOUND_VALUES (val= hvgValueAtom )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:323:4: ^( BOUND_VALUES (val= hvgValueAtom )* )
            {
            match(input,BOUND_VALUES,FOLLOW_BOUND_VALUES_in_boundValVar2048); if (state.failed) return boundSet;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return boundSet;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:323:19: (val= hvgValueAtom )*
                loop46:
                do {
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==VAR_VALUE) ) {
                        alt46=1;
                    }


                    switch (alt46) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:323:20: val= hvgValueAtom
                	    {
                	    pushFollow(FOLLOW_hvgValueAtom_in_boundValVar2055);
                	    val=hvgValueAtom();

                	    state._fsp--;
                	    if (state.failed) return boundSet;
                	    if ( state.backtracking==0 ) {
                	      boundSet.add(val);
                	    }

                	    }
                	    break;

                	default :
                	    break loop46;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return boundSet;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return boundSet;
    }
    // $ANTLR end "boundValVar"


    // $ANTLR start "forAll"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:331:1: forAll returns [Quantor qtor] : ^( FORALL bVar= boundIndVar ^( IN seqName ) (bVar2= boundValVar )? ifElem= ifStatement ) ;
    public final Quantor forAll() throws RecognitionException {
        Quantor qtor = null;

        Set<StarqlVar> bVar = null;

        Set<StarqlVar> bVar2 = null;

        IfTreeElem ifElem = null;



          bVar = new HashSet<StarqlVar>();
          bVar2 = new HashSet<StarqlVar>();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:336:3: ( ^( FORALL bVar= boundIndVar ^( IN seqName ) (bVar2= boundValVar )? ifElem= ifStatement ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:336:5: ^( FORALL bVar= boundIndVar ^( IN seqName ) (bVar2= boundValVar )? ifElem= ifStatement )
            {
            match(input,FORALL,FOLLOW_FORALL_in_forAll2089); if (state.failed) return qtor;

            match(input, Token.DOWN, null); if (state.failed) return qtor;
            pushFollow(FOLLOW_boundIndVar_in_forAll2095);
            bVar=boundIndVar();

            state._fsp--;
            if (state.failed) return qtor;
            match(input,IN,FOLLOW_IN_in_forAll2098); if (state.failed) return qtor;

            match(input, Token.DOWN, null); if (state.failed) return qtor;
            pushFollow(FOLLOW_seqName_in_forAll2100);
            seqName();

            state._fsp--;
            if (state.failed) return qtor;

            match(input, Token.UP, null); if (state.failed) return qtor;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:336:47: (bVar2= boundValVar )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==BOUND_VALUES) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:336:48: bVar2= boundValVar
                    {
                    pushFollow(FOLLOW_boundValVar_in_forAll2108);
                    bVar2=boundValVar();

                    state._fsp--;
                    if (state.failed) return qtor;

                    }
                    break;

            }

            pushFollow(FOLLOW_ifStatement_in_forAll2116);
            ifElem=ifStatement();

            state._fsp--;
            if (state.failed) return qtor;

            match(input, Token.UP, null); if (state.failed) return qtor;
            if ( state.backtracking==0 ) {
              qtor = new Quantor(HavingType.FORALL, bVar, bVar2); qtor.buildQuantorValue(ifElem.getIfElem(), ifElem.getThenElem());
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return qtor;
    }
    // $ANTLR end "forAll"


    // $ANTLR start "ifStatement"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:339:1: ifStatement returns [IfTreeElem ifElem] : ^( IF hvg1= hvgConstraint ) ^( THEN hvg2= hvgConstraint ) ;
    public final IfTreeElem ifStatement() throws RecognitionException {
        IfTreeElem ifElem = null;

        HvgTreeElem hvg1 = null;

        HvgTreeElem hvg2 = null;



        ifElem = new IfTreeElem();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:343:2: ( ^( IF hvg1= hvgConstraint ) ^( THEN hvg2= hvgConstraint ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:343:4: ^( IF hvg1= hvgConstraint ) ^( THEN hvg2= hvgConstraint )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement2142); if (state.failed) return ifElem;

            match(input, Token.DOWN, null); if (state.failed) return ifElem;
            pushFollow(FOLLOW_hvgConstraint_in_ifStatement2148);
            hvg1=hvgConstraint();

            state._fsp--;
            if (state.failed) return ifElem;

            match(input, Token.UP, null); if (state.failed) return ifElem;
            match(input,THEN,FOLLOW_THEN_in_ifStatement2152); if (state.failed) return ifElem;

            match(input, Token.DOWN, null); if (state.failed) return ifElem;
            pushFollow(FOLLOW_hvgConstraint_in_ifStatement2158);
            hvg2=hvgConstraint();

            state._fsp--;
            if (state.failed) return ifElem;

            match(input, Token.UP, null); if (state.failed) return ifElem;
            if ( state.backtracking==0 ) {
               ifElem.setIfElem(hvg1); ifElem.setThenElem(hvg2);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ifElem;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "propertyListNotEmpty"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:346:1: propertyListNotEmpty returns [Set<Triple> trSet] : ( ^( PREDICATE s1= verb ) s2= objectList )+ ;
    public final Set<Triple> propertyListNotEmpty() throws RecognitionException {
        Set<Triple> trSet = null;

        StarqlVar s1 = null;

        StarqlVar s2 = null;



        trSet = new HashSet<Triple>();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:350:5: ( ( ^( PREDICATE s1= verb ) s2= objectList )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:350:7: ( ^( PREDICATE s1= verb ) s2= objectList )+
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:350:7: ( ^( PREDICATE s1= verb ) s2= objectList )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==PREDICATE) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:350:8: ^( PREDICATE s1= verb ) s2= objectList
            	    {
            	    match(input,PREDICATE,FOLLOW_PREDICATE_in_propertyListNotEmpty2185); if (state.failed) return trSet;

            	    match(input, Token.DOWN, null); if (state.failed) return trSet;
            	    pushFollow(FOLLOW_verb_in_propertyListNotEmpty2189);
            	    s1=verb();

            	    state._fsp--;
            	    if (state.failed) return trSet;

            	    match(input, Token.UP, null); if (state.failed) return trSet;
            	    pushFollow(FOLLOW_objectList_in_propertyListNotEmpty2195);
            	    s2=objectList();

            	    state._fsp--;
            	    if (state.failed) return trSet;
            	    if ( state.backtracking==0 ) {
            	       Triple tr = new Triple(); tr.setPredicate(s1); tr.setObject(s2); trSet.add(tr);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return trSet;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return trSet;
    }
    // $ANTLR end "propertyListNotEmpty"


    // $ANTLR start "objectList"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:353:1: objectList returns [StarqlVar var] : ( ^( OBJECT s= object ) )+ ;
    public final StarqlVar objectList() throws RecognitionException {
        StarqlVar var = null;

        StarqlVar s = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:354:5: ( ( ^( OBJECT s= object ) )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:354:7: ( ^( OBJECT s= object ) )+
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:354:7: ( ^( OBJECT s= object ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==OBJECT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:354:8: ^( OBJECT s= object )
            	    {
            	    match(input,OBJECT,FOLLOW_OBJECT_in_objectList2222); if (state.failed) return var;

            	    match(input, Token.DOWN, null); if (state.failed) return var;
            	    pushFollow(FOLLOW_object_in_objectList2226);
            	    s=object();

            	    state._fsp--;
            	    if (state.failed) return var;

            	    match(input, Token.UP, null); if (state.failed) return var;
            	    if ( state.backtracking==0 ) {
            	      var = s;
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return var;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "objectList"


    // $ANTLR start "verb"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:357:1: verb returns [StarqlVar var] : (v= var | s= iriRef | A );
    public final StarqlVar verb() throws RecognitionException {
        StarqlVar var = null;

        CommonTree A14=null;
        StarqlVar v = null;

        String s = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:358:5: (v= var | s= iriRef | A )
            int alt50=3;
            switch ( input.LA(1) ) {
            case VALUE_ATOM:
            case INDEX_ARITH:
                {
                alt50=1;
                }
                break;
            case PNAME_NS:
            case IRI_REF:
            case PNAME_LN:
                {
                alt50=2;
                }
                break;
            case A:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return var;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:358:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_verb2254);
                    v=var();

                    state._fsp--;
                    if (state.failed) return var;
                    if ( state.backtracking==0 ) {
                      var = v;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:359:7: s= iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_verb2267);
                    s=iriRef();

                    state._fsp--;
                    if (state.failed) return var;
                    if ( state.backtracking==0 ) {
                      var = new StarqlVar( StarqlVarType.IRIREF, s);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:360:7: A
                    {
                    A14=(CommonTree)match(input,A,FOLLOW_A_in_verb2277); if (state.failed) return var;
                    if ( state.backtracking==0 ) {
                      var = new StarqlVar( StarqlVarType.RDFLITERAL, (A14!=null?A14.getText():null));
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "verb"


    // $ANTLR start "subject"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:363:1: subject returns [StarqlVar var] : (v= var | s= iriRef );
    public final StarqlVar subject() throws RecognitionException {
        StarqlVar var = null;

        StarqlVar v = null;

        String s = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:364:2: (v= var | s= iriRef )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=VALUE_ATOM && LA51_0<=INDEX_ARITH)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=PNAME_NS && LA51_0<=IRI_REF)||LA51_0==PNAME_LN) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return var;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:364:5: v= var
                    {
                    pushFollow(FOLLOW_var_in_subject2302);
                    v=var();

                    state._fsp--;
                    if (state.failed) return var;
                    if ( state.backtracking==0 ) {
                      var = v;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:365:8: s= iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_subject2316);
                    s=iriRef();

                    state._fsp--;
                    if (state.failed) return var;
                    if ( state.backtracking==0 ) {
                      var = new StarqlVar(StarqlVarType.IRIREF, s);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "subject"


    // $ANTLR start "object"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:368:1: object returns [StarqlVar var] : v1= starqlVar ;
    public final StarqlVar object() throws RecognitionException {
        StarqlVar var = null;

        StarqlVar v1 = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:369:5: (v1= starqlVar )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:369:7: v1= starqlVar
            {
            pushFollow(FOLLOW_starqlVar_in_object2343);
            v1=starqlVar();

            state._fsp--;
            if (state.failed) return var;
            if ( state.backtracking==0 ) {
              var = v1;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "object"


    // $ANTLR start "var"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:372:1: var returns [StarqlVar var] : ( ^( VALUE_ATOM tVar= hvgValueAtom ) | ^( INDEX_ARITH tVar= hvgIndAriAtom ) );
    public final StarqlVar var() throws RecognitionException {
        StarqlVar var = null;

        StarqlVar tVar = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:373:5: ( ^( VALUE_ATOM tVar= hvgValueAtom ) | ^( INDEX_ARITH tVar= hvgIndAriAtom ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==VALUE_ATOM) ) {
                alt52=1;
            }
            else if ( (LA52_0==INDEX_ARITH) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return var;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:373:7: ^( VALUE_ATOM tVar= hvgValueAtom )
                    {
                    match(input,VALUE_ATOM,FOLLOW_VALUE_ATOM_in_var2367); if (state.failed) return var;

                    match(input, Token.DOWN, null); if (state.failed) return var;
                    pushFollow(FOLLOW_hvgValueAtom_in_var2373);
                    tVar=hvgValueAtom();

                    state._fsp--;
                    if (state.failed) return var;

                    match(input, Token.UP, null); if (state.failed) return var;
                    if ( state.backtracking==0 ) {
                      var = tVar;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:373:56: ^( INDEX_ARITH tVar= hvgIndAriAtom )
                    {
                    match(input,INDEX_ARITH,FOLLOW_INDEX_ARITH_in_var2380); if (state.failed) return var;

                    match(input, Token.DOWN, null); if (state.failed) return var;
                    pushFollow(FOLLOW_hvgIndAriAtom_in_var2386);
                    tVar=hvgIndAriAtom();

                    state._fsp--;
                    if (state.failed) return var;

                    match(input, Token.UP, null); if (state.failed) return var;
                    if ( state.backtracking==0 ) {
                      var = tVar;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "var"


    // $ANTLR start "hvgValueAtom"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:376:1: hvgValueAtom returns [StarqlVar var] : VAR_VALUE ;
    public final StarqlVar hvgValueAtom() throws RecognitionException {
        StarqlVar var = null;

        CommonTree VAR_VALUE15=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:377:2: ( VAR_VALUE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:377:4: VAR_VALUE
            {
            VAR_VALUE15=(CommonTree)match(input,VAR_VALUE,FOLLOW_VAR_VALUE_in_hvgValueAtom2411); if (state.failed) return var;
            if ( state.backtracking==0 ) {
              var = new StarqlVar( StarqlVarType.VALUE, (VAR_VALUE15!=null?VAR_VALUE15.getText():null));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "hvgValueAtom"


    // $ANTLR start "hvgIndAriAtom"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:380:1: hvgIndAriAtom returns [StarqlVar var] : VAR_INDEX ;
    public final StarqlVar hvgIndAriAtom() throws RecognitionException {
        StarqlVar var = null;

        CommonTree VAR_INDEX16=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:381:2: ( VAR_INDEX )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:381:4: VAR_INDEX
            {
            VAR_INDEX16=(CommonTree)match(input,VAR_INDEX,FOLLOW_VAR_INDEX_in_hvgIndAriAtom2430); if (state.failed) return var;
            if ( state.backtracking==0 ) {
              var = new StarqlVar( StarqlVarType.INDEX, (VAR_INDEX16!=null?VAR_INDEX16.getText():null));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "hvgIndAriAtom"


    // $ANTLR start "valueLogical"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:384:1: valueLogical returns [Logical log] : ( ( ^( EQUAL p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( NOT_EQUAL p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( LESS p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( GREATER p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( LESS_EQUAL p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( GREATER_EQUAL p1= multiplyExpression p2= multiplyExpression ) ) );
    public final Logical valueLogical() throws RecognitionException {
        Logical log = null;

        CommonTree EQUAL17=null;
        CommonTree NOT_EQUAL18=null;
        CommonTree LESS19=null;
        CommonTree GREATER20=null;
        CommonTree LESS_EQUAL21=null;
        CommonTree GREATER_EQUAL22=null;
        ArithmeticExpression p1 = null;

        ArithmeticExpression p2 = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:385:5: ( ( ^( EQUAL p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( NOT_EQUAL p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( LESS p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( GREATER p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( LESS_EQUAL p1= multiplyExpression p2= multiplyExpression ) ) | ( ^( GREATER_EQUAL p1= multiplyExpression p2= multiplyExpression ) ) )
            int alt53=6;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt53=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt53=2;
                }
                break;
            case LESS:
                {
                alt53=3;
                }
                break;
            case GREATER:
                {
                alt53=4;
                }
                break;
            case LESS_EQUAL:
                {
                alt53=5;
                }
                break;
            case GREATER_EQUAL:
                {
                alt53=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return log;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:386:6: ( ^( EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:386:6: ( ^( EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:386:7: ^( EQUAL p1= multiplyExpression p2= multiplyExpression )
                    {
                    EQUAL17=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_valueLogical2459); if (state.failed) return log;

                    match(input, Token.DOWN, null); if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2463);
                    p1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2467);
                    p2=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    if ( state.backtracking==0 ) {
                      log = new Logical(p1, (EQUAL17!=null?EQUAL17.getText():null), p2);
                    }

                    match(input, Token.UP, null); if (state.failed) return log;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:387:8: ( ^( NOT_EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:387:8: ( ^( NOT_EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:387:9: ^( NOT_EQUAL p1= multiplyExpression p2= multiplyExpression )
                    {
                    NOT_EQUAL18=(CommonTree)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_valueLogical2486); if (state.failed) return log;

                    match(input, Token.DOWN, null); if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2490);
                    p1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2494);
                    p2=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    if ( state.backtracking==0 ) {
                      log = new Logical(p1, (NOT_EQUAL18!=null?NOT_EQUAL18.getText():null), p2);
                    }

                    match(input, Token.UP, null); if (state.failed) return log;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:388:8: ( ^( LESS p1= multiplyExpression p2= multiplyExpression ) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:388:8: ( ^( LESS p1= multiplyExpression p2= multiplyExpression ) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:388:9: ^( LESS p1= multiplyExpression p2= multiplyExpression )
                    {
                    LESS19=(CommonTree)match(input,LESS,FOLLOW_LESS_in_valueLogical2510); if (state.failed) return log;

                    match(input, Token.DOWN, null); if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2514);
                    p1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2518);
                    p2=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    if ( state.backtracking==0 ) {
                      log = new Logical(p1, (LESS19!=null?LESS19.getText():null), p2);
                    }

                    match(input, Token.UP, null); if (state.failed) return log;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:389:8: ( ^( GREATER p1= multiplyExpression p2= multiplyExpression ) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:389:8: ( ^( GREATER p1= multiplyExpression p2= multiplyExpression ) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:389:9: ^( GREATER p1= multiplyExpression p2= multiplyExpression )
                    {
                    GREATER20=(CommonTree)match(input,GREATER,FOLLOW_GREATER_in_valueLogical2534); if (state.failed) return log;

                    match(input, Token.DOWN, null); if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2538);
                    p1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2542);
                    p2=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    if ( state.backtracking==0 ) {
                      log = new Logical(p1, (GREATER20!=null?GREATER20.getText():null), p2);
                    }

                    match(input, Token.UP, null); if (state.failed) return log;

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:390:8: ( ^( LESS_EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:390:8: ( ^( LESS_EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:390:9: ^( LESS_EQUAL p1= multiplyExpression p2= multiplyExpression )
                    {
                    LESS_EQUAL21=(CommonTree)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_valueLogical2558); if (state.failed) return log;

                    match(input, Token.DOWN, null); if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2562);
                    p1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2566);
                    p2=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    if ( state.backtracking==0 ) {
                      log = new Logical(p1, (LESS_EQUAL21!=null?LESS_EQUAL21.getText():null), p2);
                    }

                    match(input, Token.UP, null); if (state.failed) return log;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:391:8: ( ^( GREATER_EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:391:8: ( ^( GREATER_EQUAL p1= multiplyExpression p2= multiplyExpression ) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:391:9: ^( GREATER_EQUAL p1= multiplyExpression p2= multiplyExpression )
                    {
                    GREATER_EQUAL22=(CommonTree)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_valueLogical2582); if (state.failed) return log;

                    match(input, Token.DOWN, null); if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2586);
                    p1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    pushFollow(FOLLOW_multiplyExpression_in_valueLogical2590);
                    p2=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return log;
                    if ( state.backtracking==0 ) {
                      log = new Logical(p1, (GREATER_EQUAL22!=null?GREATER_EQUAL22.getText():null), p2);
                    }

                    match(input, Token.UP, null); if (state.failed) return log;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return log;
    }
    // $ANTLR end "valueLogical"


    // $ANTLR start "multiplyExpression"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:394:1: multiplyExpression returns [ArithmeticExpression ari] : ( ^( ASTERISK m1= multiplyExpression m2= sumExpression ) | ^( DIVIDE m1= multiplyExpression m2= sumExpression ) | m1= sumExpression );
    public final ArithmeticExpression multiplyExpression() throws RecognitionException {
        ArithmeticExpression ari = null;

        ArithmeticExpression m1 = null;

        ArithmeticExpression m2 = null;



          ari = new ArithmeticExpression();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:398:5: ( ^( ASTERISK m1= multiplyExpression m2= sumExpression ) | ^( DIVIDE m1= multiplyExpression m2= sumExpression ) | m1= sumExpression )
            int alt54=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt54=1;
                }
                break;
            case DIVIDE:
                {
                alt54=2;
                }
                break;
            case EXPRESSION_LIST:
            case VALUE_ATOM:
            case INDEX_ARITH:
            case PNAME_NS:
            case IRI_REF:
            case IDENT:
            case PLUS:
            case MINUS:
            case ABS:
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case PNAME_LN:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ari;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:398:7: ^( ASTERISK m1= multiplyExpression m2= sumExpression )
                    {
                    match(input,ASTERISK,FOLLOW_ASTERISK_in_multiplyExpression2629); if (state.failed) return ari;

                    match(input, Token.DOWN, null); if (state.failed) return ari;
                    pushFollow(FOLLOW_multiplyExpression_in_multiplyExpression2633);
                    m1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    pushFollow(FOLLOW_sumExpression_in_multiplyExpression2637);
                    m2=sumExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari.addVars(m1.getVars()); ari.addVars(m2.getVars()); ari.setString(m1.toString() +" * "+ m2.toString());
                    }

                    match(input, Token.UP, null); if (state.failed) return ari;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:399:7: ^( DIVIDE m1= multiplyExpression m2= sumExpression )
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplyExpression2648); if (state.failed) return ari;

                    match(input, Token.DOWN, null); if (state.failed) return ari;
                    pushFollow(FOLLOW_multiplyExpression_in_multiplyExpression2652);
                    m1=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    pushFollow(FOLLOW_sumExpression_in_multiplyExpression2656);
                    m2=sumExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari.addVars(m1.getVars()); ari.addVars(m2.getVars()); ari.setString(m1.toString() +" / "+ m2.toString());
                    }

                    match(input, Token.UP, null); if (state.failed) return ari;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:400:7: m1= sumExpression
                    {
                    pushFollow(FOLLOW_sumExpression_in_multiplyExpression2668);
                    m1=sumExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari = m1;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ari;
    }
    // $ANTLR end "multiplyExpression"


    // $ANTLR start "sumExpression"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:403:1: sumExpression returns [ArithmeticExpression ari] : ( ^( PLUS m1= sumExpression m2= primaryExpression ) | ^( MINUS m1= sumExpression m2= primaryExpression ) | m1= primaryExpression );
    public final ArithmeticExpression sumExpression() throws RecognitionException {
        ArithmeticExpression ari = null;

        ArithmeticExpression m1 = null;

        ArithmeticExpression m2 = null;



          ari = new ArithmeticExpression();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:407:5: ( ^( PLUS m1= sumExpression m2= primaryExpression ) | ^( MINUS m1= sumExpression m2= primaryExpression ) | m1= primaryExpression )
            int alt55=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt55=1;
                }
                break;
            case MINUS:
                {
                alt55=2;
                }
                break;
            case EXPRESSION_LIST:
            case VALUE_ATOM:
            case INDEX_ARITH:
            case PNAME_NS:
            case IRI_REF:
            case IDENT:
            case ABS:
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case PNAME_LN:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ari;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:407:7: ^( PLUS m1= sumExpression m2= primaryExpression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_sumExpression2702); if (state.failed) return ari;

                    match(input, Token.DOWN, null); if (state.failed) return ari;
                    pushFollow(FOLLOW_sumExpression_in_sumExpression2706);
                    m1=sumExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    pushFollow(FOLLOW_primaryExpression_in_sumExpression2710);
                    m2=primaryExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari.addVars(m1.getVars()); ari.addVars(m2.getVars()); ari.setString(m1.toString() +" + "+ m2.toString());
                    }

                    match(input, Token.UP, null); if (state.failed) return ari;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:408:7: ^( MINUS m1= sumExpression m2= primaryExpression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_sumExpression2721); if (state.failed) return ari;

                    match(input, Token.DOWN, null); if (state.failed) return ari;
                    pushFollow(FOLLOW_sumExpression_in_sumExpression2725);
                    m1=sumExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    pushFollow(FOLLOW_primaryExpression_in_sumExpression2729);
                    m2=primaryExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari.addVars(m1.getVars()); ari.addVars(m2.getVars()); ari.setString(m1.toString() +" - "+ m2.toString());
                    }

                    match(input, Token.UP, null); if (state.failed) return ari;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:409:7: m1= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_sumExpression2741);
                    m1=primaryExpression();

                    state._fsp--;
                    if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari = m1;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ari;
    }
    // $ANTLR end "sumExpression"


    // $ANTLR start "starqlVar"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:412:1: starqlVar returns [StarqlVar sVar] : (vString= iriRef | v= rdfLiteral | v= numericLiteral | v= var | v= aggregate );
    public final StarqlVar starqlVar() throws RecognitionException {
        StarqlVar sVar = null;

        String vString = null;

        StarqlVar v = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:413:5: (vString= iriRef | v= rdfLiteral | v= numericLiteral | v= var | v= aggregate )
            int alt56=5;
            switch ( input.LA(1) ) {
            case PNAME_NS:
            case IRI_REF:
            case PNAME_LN:
                {
                alt56=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt56=2;
                }
                break;
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt56=3;
                }
                break;
            case VALUE_ATOM:
            case INDEX_ARITH:
                {
                alt56=4;
                }
                break;
            case IDENT:
                {
                alt56=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return sVar;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:413:7: vString= iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_starqlVar2770);
                    vString=iriRef();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = new StarqlVar( StarqlVarType.IRIREF, vString);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:414:7: v= rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_starqlVar2785);
                    v=rdfLiteral();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = v;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:415:7: v= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_starqlVar2800);
                    v=numericLiteral();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = v; //system.out.println(v.getsType().toString());
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:416:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_starqlVar2814);
                    v=var();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = v;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:417:7: v= aggregate
                    {
                    pushFollow(FOLLOW_aggregate_in_starqlVar2827);
                    v=aggregate();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = v;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sVar;
    }
    // $ANTLR end "starqlVar"


    // $ANTLR start "primaryExpression"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:420:1: primaryExpression returns [ArithmeticExpression ari] : (v= starqlVar | ^( EXPRESSION_LIST a= multiplyExpression ) | ^( ABS a= multiplyExpression ) );
    public final ArithmeticExpression primaryExpression() throws RecognitionException {
        ArithmeticExpression ari = null;

        StarqlVar v = null;

        ArithmeticExpression a = null;



          ari = new ArithmeticExpression();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:424:5: (v= starqlVar | ^( EXPRESSION_LIST a= multiplyExpression ) | ^( ABS a= multiplyExpression ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case VALUE_ATOM:
            case INDEX_ARITH:
            case PNAME_NS:
            case IRI_REF:
            case IDENT:
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case PNAME_LN:
                {
                alt57=1;
                }
                break;
            case EXPRESSION_LIST:
                {
                alt57=2;
                }
                break;
            case ABS:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ari;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:424:7: v= starqlVar
                    {
                    pushFollow(FOLLOW_starqlVar_in_primaryExpression2858);
                    v=starqlVar();

                    state._fsp--;
                    if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari.addVar(v); ari.setString(v.toStringSQL());
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:425:7: ^( EXPRESSION_LIST a= multiplyExpression )
                    {
                    match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_primaryExpression2870); if (state.failed) return ari;

                    match(input, Token.DOWN, null); if (state.failed) return ari;
                    pushFollow(FOLLOW_multiplyExpression_in_primaryExpression2874);
                    a=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return ari;

                    match(input, Token.UP, null); if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari.addVars(a.getVars()); ari.setString("(" + a.toString() + ")");
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:426:7: ^( ABS a= multiplyExpression )
                    {
                    match(input,ABS,FOLLOW_ABS_in_primaryExpression2886); if (state.failed) return ari;

                    match(input, Token.DOWN, null); if (state.failed) return ari;
                    pushFollow(FOLLOW_multiplyExpression_in_primaryExpression2890);
                    a=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return ari;

                    match(input, Token.UP, null); if (state.failed) return ari;
                    if ( state.backtracking==0 ) {
                      ari.addVars(a.getVars()); ari.setString("ABS(" + a.toString() + ")");
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ari;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "existsFunction"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:429:1: existsFunction returns [Quantor qtor] : ^( EXISTS bVar= boundIndVar ^( IN seqName ) (bVar2= boundValVar )? hvg= hvgAndConstraint ) ;
    public final Quantor existsFunction() throws RecognitionException {
        Quantor qtor = null;

        Set<StarqlVar> bVar = null;

        Set<StarqlVar> bVar2 = null;

        HavingAnd hvg = null;



          bVar = new HashSet<StarqlVar>();
          bVar2 = new HashSet<StarqlVar>();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:434:2: ( ^( EXISTS bVar= boundIndVar ^( IN seqName ) (bVar2= boundValVar )? hvg= hvgAndConstraint ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:434:4: ^( EXISTS bVar= boundIndVar ^( IN seqName ) (bVar2= boundValVar )? hvg= hvgAndConstraint )
            {
            match(input,EXISTS,FOLLOW_EXISTS_in_existsFunction2920); if (state.failed) return qtor;

            match(input, Token.DOWN, null); if (state.failed) return qtor;
            pushFollow(FOLLOW_boundIndVar_in_existsFunction2926);
            bVar=boundIndVar();

            state._fsp--;
            if (state.failed) return qtor;
            match(input,IN,FOLLOW_IN_in_existsFunction2929); if (state.failed) return qtor;

            match(input, Token.DOWN, null); if (state.failed) return qtor;
            pushFollow(FOLLOW_seqName_in_existsFunction2931);
            seqName();

            state._fsp--;
            if (state.failed) return qtor;

            match(input, Token.UP, null); if (state.failed) return qtor;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:434:46: (bVar2= boundValVar )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BOUND_VALUES) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:434:47: bVar2= boundValVar
                    {
                    pushFollow(FOLLOW_boundValVar_in_existsFunction2939);
                    bVar2=boundValVar();

                    state._fsp--;
                    if (state.failed) return qtor;

                    }
                    break;

            }

            pushFollow(FOLLOW_hvgAndConstraint_in_existsFunction2947);
            hvg=hvgAndConstraint();

            state._fsp--;
            if (state.failed) return qtor;

            match(input, Token.UP, null); if (state.failed) return qtor;
            if ( state.backtracking==0 ) {
              qtor = new Quantor(HavingType.EXIST, bVar, bVar2); qtor.buildQuantorValue(hvg);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return qtor;
    }
    // $ANTLR end "existsFunction"


    // $ANTLR start "aggregate"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:437:1: aggregate returns [StarqlVar var] : ^( IDENT (sVar= starqlVar )* ) ;
    public final StarqlVar aggregate() throws RecognitionException {
        StarqlVar var = null;

        CommonTree IDENT23=null;
        StarqlVar sVar = null;



          var = new StarqlVar( StarqlVarType.VALUE, "agg");
          Aggregator agg = new Aggregator();

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:442:5: ( ^( IDENT (sVar= starqlVar )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:442:7: ^( IDENT (sVar= starqlVar )* )
            {
            IDENT23=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_aggregate2975); if (state.failed) return var;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return var;
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:442:15: (sVar= starqlVar )*
                loop59:
                do {
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0>=VALUE_ATOM && LA59_0<=INDEX_ARITH)||(LA59_0>=PNAME_NS && LA59_0<=IRI_REF)||LA59_0==IDENT||(LA59_0>=INTEGER && LA59_0<=DOUBLE_NEGATIVE)||(LA59_0>=STRING_LITERAL1 && LA59_0<=PNAME_LN)) ) {
                        alt59=1;
                    }


                    switch (alt59) {
                	case 1 :
                	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:442:16: sVar= starqlVar
                	    {
                	    pushFollow(FOLLOW_starqlVar_in_aggregate2982);
                	    sVar=starqlVar();

                	    state._fsp--;
                	    if (state.failed) return var;
                	    if ( state.backtracking==0 ) {
                	      agg.addColumns(sVar.toStringSQL()); var.addAgg(agg);
                	    }

                	    }
                	    break;

                	default :
                	    break loop59;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return var;
            }
            if ( state.backtracking==0 ) {
               agg.setAggType((IDENT23!=null?IDENT23.getText():null));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "aggregate"


    // $ANTLR start "rdfLiteral"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:445:1: rdfLiteral returns [StarqlVar sVar] : s= string (s2= LANGTAG | (s3= REFERENCE s4= iriRef ) )? ;
    public final StarqlVar rdfLiteral() throws RecognitionException {
        StarqlVar sVar = null;

        CommonTree s2=null;
        CommonTree s3=null;
        String s = null;

        String s4 = null;



        String str = "";

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:449:5: (s= string (s2= LANGTAG | (s3= REFERENCE s4= iriRef ) )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:449:7: s= string (s2= LANGTAG | (s3= REFERENCE s4= iriRef ) )?
            {
            pushFollow(FOLLOW_string_in_rdfLiteral3023);
            s=string();

            state._fsp--;
            if (state.failed) return sVar;
            if ( state.backtracking==0 ) {
              str = s;
            }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:450:6: (s2= LANGTAG | (s3= REFERENCE s4= iriRef ) )?
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LANGTAG) ) {
                alt60=1;
            }
            else if ( (LA60_0==REFERENCE) ) {
                alt60=2;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:450:7: s2= LANGTAG
                    {
                    s2=(CommonTree)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral3036); if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      str += s2;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:452:6: (s3= REFERENCE s4= iriRef )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:452:6: (s3= REFERENCE s4= iriRef )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:452:7: s3= REFERENCE s4= iriRef
                    {
                    s3=(CommonTree)match(input,REFERENCE,FOLLOW_REFERENCE_in_rdfLiteral3056); if (state.failed) return sVar;
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral3060);
                    s4=iriRef();

                    state._fsp--;
                    if (state.failed) return sVar;

                    }

                    if ( state.backtracking==0 ) {
                      str += s3+s4;
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              sVar = new StarqlVar( StarqlVarType.NUMERICLITERAL, str);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sVar;
    }
    // $ANTLR end "rdfLiteral"


    // $ANTLR start "numeric"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:456:1: numeric returns [StarqlVar sVar] : INTEGER ;
    public final StarqlVar numeric() throws RecognitionException {
        StarqlVar sVar = null;

        CommonTree INTEGER24=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:457:2: ( INTEGER )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:457:5: INTEGER
            {
            INTEGER24=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_numeric3096); if (state.failed) return sVar;
            if ( state.backtracking==0 ) {
              sVar = new StarqlVar( StarqlVarType.NUMERICLITERAL, (INTEGER24!=null?INTEGER24.getText():null));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sVar;
    }
    // $ANTLR end "numeric"


    // $ANTLR start "numericLiteral"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:460:1: numericLiteral returns [StarqlVar sVar] : (s1= numericLiteralUnsigned | s2= numericLiteralPositive | s3= numericLiteralNegative );
    public final StarqlVar numericLiteral() throws RecognitionException {
        StarqlVar sVar = null;

        String s1 = null;

        String s2 = null;

        String s3 = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:461:5: (s1= numericLiteralUnsigned | s2= numericLiteralPositive | s3= numericLiteralNegative )
            int alt61=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt61=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt61=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return sVar;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:461:7: s1= numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral3118);
                    s1=numericLiteralUnsigned();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = new StarqlVar( StarqlVarType.NUMERICLITERAL, s1);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:462:7: s2= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral3130);
                    s2=numericLiteralPositive();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = new StarqlVar( StarqlVarType.NUMERICLITERAL, s2);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:463:7: s3= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral3142);
                    s3=numericLiteralNegative();

                    state._fsp--;
                    if (state.failed) return sVar;
                    if ( state.backtracking==0 ) {
                      sVar = new StarqlVar( StarqlVarType.NUMERICLITERAL, s3);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sVar;
    }
    // $ANTLR end "numericLiteral"


    // $ANTLR start "numericLiteralUnsigned"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:466:1: numericLiteralUnsigned returns [String str] : ( INTEGER | DECIMAL | DOUBLE );
    public final String numericLiteralUnsigned() throws RecognitionException {
        String str = null;

        CommonTree INTEGER25=null;
        CommonTree DECIMAL26=null;
        CommonTree DOUBLE27=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:467:5: ( INTEGER | DECIMAL | DOUBLE )
            int alt62=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt62=1;
                }
                break;
            case DECIMAL:
                {
                alt62=2;
                }
                break;
            case DOUBLE:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:467:7: INTEGER
                    {
                    INTEGER25=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_numericLiteralUnsigned3165); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (INTEGER25!=null?INTEGER25.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:468:7: DECIMAL
                    {
                    DECIMAL26=(CommonTree)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericLiteralUnsigned3175); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (DECIMAL26!=null?DECIMAL26.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:469:7: DOUBLE
                    {
                    DOUBLE27=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned3185); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (DOUBLE27!=null?DOUBLE27.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "numericLiteralUnsigned"


    // $ANTLR start "numericLiteralPositive"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:472:1: numericLiteralPositive returns [String str] : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final String numericLiteralPositive() throws RecognitionException {
        String str = null;

        CommonTree INTEGER_POSITIVE28=null;
        CommonTree DECIMAL_POSITIVE29=null;
        CommonTree DOUBLE_POSITIVE30=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:473:5: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            int alt63=3;
            switch ( input.LA(1) ) {
            case INTEGER_POSITIVE:
                {
                alt63=1;
                }
                break;
            case DECIMAL_POSITIVE:
                {
                alt63=2;
                }
                break;
            case DOUBLE_POSITIVE:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:473:7: INTEGER_POSITIVE
                    {
                    INTEGER_POSITIVE28=(CommonTree)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive3208); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (INTEGER_POSITIVE28!=null?INTEGER_POSITIVE28.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:474:7: DECIMAL_POSITIVE
                    {
                    DECIMAL_POSITIVE29=(CommonTree)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive3218); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (DECIMAL_POSITIVE29!=null?DECIMAL_POSITIVE29.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:475:7: DOUBLE_POSITIVE
                    {
                    DOUBLE_POSITIVE30=(CommonTree)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive3228); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (DOUBLE_POSITIVE30!=null?DOUBLE_POSITIVE30.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "numericLiteralPositive"


    // $ANTLR start "numericLiteralNegative"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:478:1: numericLiteralNegative returns [String str] : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final String numericLiteralNegative() throws RecognitionException {
        String str = null;

        CommonTree INTEGER_NEGATIVE31=null;
        CommonTree DECIMAL_NEGATIVE32=null;
        CommonTree DOUBLE_NEGATIVE33=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:479:5: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            int alt64=3;
            switch ( input.LA(1) ) {
            case INTEGER_NEGATIVE:
                {
                alt64=1;
                }
                break;
            case DECIMAL_NEGATIVE:
                {
                alt64=2;
                }
                break;
            case DOUBLE_NEGATIVE:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:479:7: INTEGER_NEGATIVE
                    {
                    INTEGER_NEGATIVE31=(CommonTree)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative3251); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (INTEGER_NEGATIVE31!=null?INTEGER_NEGATIVE31.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:480:7: DECIMAL_NEGATIVE
                    {
                    DECIMAL_NEGATIVE32=(CommonTree)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative3261); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (DECIMAL_NEGATIVE32!=null?DECIMAL_NEGATIVE32.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:481:7: DOUBLE_NEGATIVE
                    {
                    DOUBLE_NEGATIVE33=(CommonTree)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative3271); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (DOUBLE_NEGATIVE33!=null?DOUBLE_NEGATIVE33.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "numericLiteralNegative"


    // $ANTLR start "booleanLiteral"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:484:1: booleanLiteral returns [String str] : ( TRUE | FALSE );
    public final String booleanLiteral() throws RecognitionException {
        String str = null;

        CommonTree TRUE34=null;
        CommonTree FALSE35=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:485:5: ( TRUE | FALSE )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==TRUE) ) {
                alt65=1;
            }
            else if ( (LA65_0==FALSE) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:485:7: TRUE
                    {
                    TRUE34=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral3294); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (TRUE34!=null?TRUE34.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:486:7: FALSE
                    {
                    FALSE35=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral3304); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (FALSE35!=null?FALSE35.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "string"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:489:1: string returns [String str] : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final String string() throws RecognitionException {
        String str = null;

        CommonTree STRING_LITERAL136=null;
        CommonTree STRING_LITERAL237=null;
        CommonTree STRING_LITERAL_LONG138=null;
        CommonTree STRING_LITERAL_LONG239=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:490:5: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            int alt66=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL1:
                {
                alt66=1;
                }
                break;
            case STRING_LITERAL2:
                {
                alt66=2;
                }
                break;
            case STRING_LITERAL_LONG1:
                {
                alt66=3;
                }
                break;
            case STRING_LITERAL_LONG2:
                {
                alt66=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:490:7: STRING_LITERAL1
                    {
                    STRING_LITERAL136=(CommonTree)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string3327); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                       str = (STRING_LITERAL136!=null?STRING_LITERAL136.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:491:7: STRING_LITERAL2
                    {
                    STRING_LITERAL237=(CommonTree)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_string3337); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                       str = (STRING_LITERAL237!=null?STRING_LITERAL237.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:492:7: STRING_LITERAL_LONG1
                    {
                    STRING_LITERAL_LONG138=(CommonTree)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string3347); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                       str = (STRING_LITERAL_LONG138!=null?STRING_LITERAL_LONG138.getText():null);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:493:7: STRING_LITERAL_LONG2
                    {
                    STRING_LITERAL_LONG239=(CommonTree)match(input,STRING_LITERAL_LONG2,FOLLOW_STRING_LITERAL_LONG2_in_string3357); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                       str = (STRING_LITERAL_LONG239!=null?STRING_LITERAL_LONG239.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "string"


    // $ANTLR start "iriRef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:496:1: iriRef returns [String str] : ( IRI_REF | s= prefixedName );
    public final String iriRef() throws RecognitionException {
        String str = null;

        CommonTree IRI_REF40=null;
        String s = null;


        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:497:5: ( IRI_REF | s= prefixedName )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IRI_REF) ) {
                alt67=1;
            }
            else if ( (LA67_0==PNAME_NS||LA67_0==PNAME_LN) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:497:7: IRI_REF
                    {
                    IRI_REF40=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef3380); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (IRI_REF40!=null?IRI_REF40.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:498:7: s= prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef3392);
                    s=prefixedName();

                    state._fsp--;
                    if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = s;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "iriRef"


    // $ANTLR start "prefixedName"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:501:1: prefixedName returns [String str] : ( PNAME_LN | PNAME_NS );
    public final String prefixedName() throws RecognitionException {
        String str = null;

        CommonTree PNAME_LN41=null;
        CommonTree PNAME_NS42=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:502:5: ( PNAME_LN | PNAME_NS )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==PNAME_LN) ) {
                alt68=1;
            }
            else if ( (LA68_0==PNAME_NS) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:502:7: PNAME_LN
                    {
                    PNAME_LN41=(CommonTree)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName3416); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (PNAME_LN41!=null?PNAME_LN41.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:503:7: PNAME_NS
                    {
                    PNAME_NS42=(CommonTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixedName3426); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (PNAME_NS42!=null?PNAME_NS42.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "prefixedName"


    // $ANTLR start "blankNode"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:506:1: blankNode returns [String str] : ( BLANK_NODE_LABEL | anon );
    public final String blankNode() throws RecognitionException {
        String str = null;

        CommonTree BLANK_NODE_LABEL43=null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:507:5: ( BLANK_NODE_LABEL | anon )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==BLANK_NODE_LABEL) ) {
                alt69=1;
            }
            else if ( (LA69_0==OPEN_SQUARE_BRACKET) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:507:7: BLANK_NODE_LABEL
                    {
                    BLANK_NODE_LABEL43=(CommonTree)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode3449); if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = (BLANK_NODE_LABEL43!=null?BLANK_NODE_LABEL43.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:508:7: anon
                    {
                    pushFollow(FOLLOW_anon_in_blankNode3459);
                    anon();

                    state._fsp--;
                    if (state.failed) return str;
                    if ( state.backtracking==0 ) {
                      str = "";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "blankNode"


    // $ANTLR start "anon"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:511:1: anon returns [String str] : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET ;
    public final String anon() throws RecognitionException {
        String str = null;

        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:512:5: ( OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\StarqlTreeWalker.g:512:7: OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
            {
            match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_anon3482); if (state.failed) return str;
            match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_anon3484); if (state.failed) return str;
            if ( state.backtracking==0 ) {
              str = "";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "anon"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\15\uffff";
    static final String DFA9_minS =
        "\1\43\2\2\1\uffff\1\133\1\134\2\3\3\43\2\uffff";
    static final String DFA9_maxS =
        "\1\61\2\2\1\uffff\1\133\1\134\2\3\2\164\1\61\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\3\7\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\15\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\14\uffff\1\3",
            "\1\4",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\2\3\1\uffff\2\3\6\uffff\1\12\53\uffff\1\3\31\uffff\1\3",
            "\2\3\1\uffff\2\3\6\uffff\1\12\53\uffff\1\3\31\uffff\1\3",
            "\2\14\14\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "61:2: ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS var GREATER | ( var | ASTERISK ) verb ( object | ASTERISK ) )";
        }
    }
 

    public static final BitSet FOLLOW_QUERY_in_query74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prefixDecl_in_query79 = new BitSet(new long[]{0x0000012000000008L});
    public static final BitSet FOLLOW_createClause_in_query88 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_CREATE_in_createClause119 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STREAM_in_createClause122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createClause124 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_queryDef_in_createClause130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_in_createClause138 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AGGREGATE_in_createClause140 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_operatorDef_in_createClause142 = new BitSet(new long[]{0x0000440400000002L,0x0000000400BE0000L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_createClause144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createClause152 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_pulseExp_in_createClause158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDecl185 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDecl187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_macroName_in_operatorDef206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seqName_in_operatorDef208 = new BitSet(new long[]{0x0002041800000008L});
    public static final BitSet FOLLOW_starPattern_in_operatorDef211 = new BitSet(new long[]{0x0002001800000008L});
    public static final BitSet FOLLOW_IDENT_in_seqName230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_macroName244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_starPattern263 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_starPattern266 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_starPattern268 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_starPattern270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_starPattern279 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_starPattern281 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_var_in_starPattern283 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_starPattern285 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LESS_in_starPattern287 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_var_in_starPattern289 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GREATER_in_starPattern291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_starPattern297 = new BitSet(new long[]{0x000000D800000000L,0x0010000004000000L});
    public static final BitSet FOLLOW_ASTERISK_in_starPattern301 = new BitSet(new long[]{0x000000D800000000L,0x0010000004000000L});
    public static final BitSet FOLLOW_verb_in_starPattern304 = new BitSet(new long[]{0x000204D800000000L,0x001F3FE000000000L});
    public static final BitSet FOLLOW_object_in_starPattern307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_starPattern311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLogical_in_aggDef329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLogical_in_unaryAggDef342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLogical_in_binaryAggDef355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PULSE_in_pulseExp372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_pulseExp374 = new BitSet(new long[]{0x0180000020000000L});
    public static final BitSet FOLLOW_startTime_in_pulseExp381 = new BitSet(new long[]{0x0180000020000000L});
    public static final BitSet FOLLOW_endTime_in_pulseExp390 = new BitSet(new long[]{0x0180000020000000L});
    public static final BitSet FOLLOW_frequence_in_pulseExp398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USING_in_pulseRef423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_pulseRef425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_START_in_startTime449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rdfLiteral_in_startTime455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_END_in_endTime474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rdfLiteral_in_endTime480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FREQUENCY_in_frequence500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_duration_in_frequence506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_queryDef535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_queryHead_in_queryDef539 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FROM_in_queryDef549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_listOfWindowedStreamExp_in_queryDef553 = new BitSet(new long[]{0x0000020000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_listOfRessources_in_queryDef565 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_pulseRef_in_queryDef578 = new BitSet(new long[]{0x0200100000000108L,0x0000000000000500L});
    public static final BitSet FOLLOW_whereClause_in_queryDef590 = new BitSet(new long[]{0x0000100000000108L,0x0000000000000500L});
    public static final BitSet FOLLOW_seqMethod_in_queryDef604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_havingClause_in_queryDef617 = new BitSet(new long[]{0x0000100000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_groupBy_in_queryDef631 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_hvgAgg_in_queryDef648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_queryHead679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_queryHead681 = new BitSet(new long[]{0x000004D800001008L,0x001F3FE200000000L});
    public static final BitSet FOLLOW_bindingList_in_queryHead688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_CLAUSE_in_queryHead700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_queryHead702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_constructBlock_in_queryHead709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_binding743 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_hvgValueAtom_in_binding752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_bindingList782 = new BitSet(new long[]{0x000004D800001002L,0x001F3FE200000000L});
    public static final BitSet FOLLOW_hvgIndAt_in_constructBlock813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_resultTime837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOW_in_resultTime843 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_PLUS_in_resultTime857 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_MINUS_in_resultTime862 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_duration_in_resultTime871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_resultTime882 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_numeric_in_resultTime886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_resultTime888 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_resultTime890 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_numeric_in_resultTime894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_resultTime910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_in_listOfWindowedStreamExp940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_listOfWindowedStreamExp945 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_windowExp_in_listOfWindowedStreamExp949 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_WINDOW_in_windowExp981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_slackConst_in_windowExp985 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_timeExpNOW_in_windowExp992 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_timeExpNOW_in_windowExp999 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_slideConst_in_windowExp1005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLACK_in_slackConst1024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_duration_in_slackConst1030 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLIDE_in_slideConst1050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_duration_in_slideConst1056 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_timeExpNOW1076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resultTime_in_timeExpNOW1082 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rdfLiteral_in_duration1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BY_in_seqClass1134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_seqClass1136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEQUENCE_in_seqMethod1159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seqClass_in_seqMethod1165 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_AS_in_seqMethod1169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seqName_in_seqMethod1173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_CLAUSE_in_whereClause1200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesBlock_in_whereClause1206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_in_groupBy1233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_groupBy1240 = new BitSet(new long[]{0x0000001800000008L});
    public static final BitSet FOLLOW_AND_in_andLogical1272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueLogical_in_andLogical1278 = new BitSet(new long[]{0x004C000000000000L,0x00000000E0040000L});
    public static final BitSet FOLLOW_andLogical_in_andLogical1284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueLogical_in_andLogical1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_orLogical1337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andLogical_in_orLogical1343 = new BitSet(new long[]{0x004C000000000000L,0x00000000E0060000L});
    public static final BitSet FOLLOW_orLogical_in_orLogical1349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_andLogical_in_orLogical1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGGREGATE_in_hvgAgg1390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orLogical_in_hvgAgg1396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_in_havingClause1423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_havingClause1429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESSOURCE_in_listOfRessources1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typedRessourceList_in_listOfRessources1470 = new BitSet(new long[]{0x0000000000000008L,0x000000000000D000L});
    public static final BitSet FOLLOW_STATIC_in_typedRessourceList1497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ABOX_in_typedRessourceList1499 = new BitSet(new long[]{0x000000C000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1504 = new BitSet(new long[]{0x000000C000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_TEMPORAL_in_typedRessourceList1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ABOX_in_typedRessourceList1515 = new BitSet(new long[]{0x000000C000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1520 = new BitSet(new long[]{0x000000C000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_TBOX_in_typedRessourceList1529 = new BitSet(new long[]{0x000000C000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1534 = new BitSet(new long[]{0x000000C000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesBlock1568 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_TRIPLE_in_triplesSameSubject1599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubject1602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subject_in_triplesSameSubject1606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject1611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_brackettedConstraint1635 = new BitSet(new long[]{0x0000440400000000L,0x0000000400BE0000L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_brackettedConstraint1641 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_brackettedConstraint1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_hvgOrConstraint1682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgAndConstraint_in_hvgOrConstraint1688 = new BitSet(new long[]{0x0000440400000000L,0x0000000400BE0000L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_hvgOrConstraint1694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_hvgAndConstraint_in_hvgOrConstraint1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_hvgAndConstraint1744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgAndConstraint_in_hvgAndConstraint1748 = new BitSet(new long[]{0x0000440400000000L,0x0000000400BE0000L});
    public static final BitSet FOLLOW_hvgConstraint_in_hvgAndConstraint1752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_hvgConstraint_in_hvgAndConstraint1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgIndAt_in_hvgAt1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgValAt_in_hvgAt1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgAt_in_hvgConstraint1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_hvgConstraint1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operatorDef_in_hvgConstraint1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forAll_in_hvgConstraint1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunction_in_hvgConstraint1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_hvgConstraint1894 = new BitSet(new long[]{0x0000440400000000L,0x0000000400BE0000L});
    public static final BitSet FOLLOW_brackettedConstraint_in_hvgConstraint1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedConstraint_in_hvgConstraint1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_hvgIndAt1942 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INDEXED_TRIPLE_in_hvgIndAt1945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesBlock_in_hvgIndAt1951 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INDEX_in_hvgIndAt1954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resultTime_in_hvgIndAt1958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_in_hvgValAt1981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueLogical_in_hvgValAt1987 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_INDEXES_in_boundIndVar2013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgIndAriAtom_in_boundIndVar2020 = new BitSet(new long[]{0x0000000000000008L,0x0000000010000000L});
    public static final BitSet FOLLOW_BOUND_VALUES_in_boundValVar2048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgValueAtom_in_boundValVar2055 = new BitSet(new long[]{0x0000000000000008L,0x0000000008000000L});
    public static final BitSet FOLLOW_FORALL_in_forAll2089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boundIndVar_in_forAll2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IN_in_forAll2098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seqName_in_forAll2100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_boundValVar_in_forAll2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ifStatement_in_forAll2116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStatement2142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgConstraint_in_ifStatement2148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_ifStatement2152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgConstraint_in_ifStatement2158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_propertyListNotEmpty2185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty2189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty2195 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_OBJECT_in_objectList2222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_objectList2226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_var_in_verb2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_verb2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_verb2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_subject2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_subject2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_starqlVar_in_object2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_ATOM_in_var2367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgValueAtom_in_var2373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_ARITH_in_var2380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_hvgIndAriAtom_in_var2386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_VALUE_in_hvgValueAtom2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_INDEX_in_hvgIndAriAtom2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_valueLogical2459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2463 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_valueLogical2486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2490 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_in_valueLogical2510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2514 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_in_valueLogical2534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2538 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_valueLogical2558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2562 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_valueLogical2582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2586 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_multiplyExpression_in_valueLogical2590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_multiplyExpression2629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_multiplyExpression2633 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_sumExpression_in_multiplyExpression2637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplyExpression2648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_multiplyExpression2652 = new BitSet(new long[]{0x000204D800001000L,0x001F3FE300000006L});
    public static final BitSet FOLLOW_sumExpression_in_multiplyExpression2656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sumExpression_in_multiplyExpression2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_sumExpression2702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sumExpression_in_sumExpression2706 = new BitSet(new long[]{0x000004D800001000L,0x001F3FE200000000L});
    public static final BitSet FOLLOW_primaryExpression_in_sumExpression2710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_sumExpression2721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sumExpression_in_sumExpression2725 = new BitSet(new long[]{0x000004D800001000L,0x001F3FE200000000L});
    public static final BitSet FOLLOW_primaryExpression_in_sumExpression2729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_sumExpression2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_starqlVar2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_starqlVar2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_starqlVar2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_starqlVar2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_starqlVar2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_starqlVar_in_primaryExpression2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_LIST_in_primaryExpression2870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_primaryExpression2874 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABS_in_primaryExpression2886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplyExpression_in_primaryExpression2890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunction2920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boundIndVar_in_existsFunction2926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IN_in_existsFunction2929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seqName_in_existsFunction2931 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_boundValVar_in_existsFunction2939 = new BitSet(new long[]{0x0000440400000000L,0x0000000400BE0000L});
    public static final BitSet FOLLOW_hvgAndConstraint_in_existsFunction2947 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_aggregate2975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_starqlVar_in_aggregate2982 = new BitSet(new long[]{0x000004D800000008L,0x001F3FE000000000L});
    public static final BitSet FOLLOW_string_in_rdfLiteral3023 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_rdfLiteral3056 = new BitSet(new long[]{0x000000C000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numeric3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numericLiteralUnsigned3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_numericLiteralUnsigned3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_string3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG2_in_string3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixedName3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_in_blankNode3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_anon3482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_anon3484 = new BitSet(new long[]{0x0000000000000002L});

}