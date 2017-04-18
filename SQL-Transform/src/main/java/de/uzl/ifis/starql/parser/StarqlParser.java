// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g 2016-06-23 22:33:59

    package de.uzl.ifis.starql.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class StarqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUERY", "SUBSELECT", "CONSTRUCT_CLAUSE", "SELECT_CLAUSE", "WHERE_CLAUSE", "VAR", "GROUP_GRAPH_PATTERN", "ARG_LIST", "EXPRESSION_LIST", "INDEXED_TRIPLE", "TRIPLE", "INDEX", "SUBJECT", "PREDICATE", "OBJECT", "NOT_EXISTS", "FUNCTION", "UNARY_NOT", "UNARY_PLUS", "UNARY_MINUS", "UNARY", "BLANK_NODE", "WINDOW", "BOUND_INDEXES", "BOUND_VALUES", "START", "FREQUENCE", "SLACK", "SLIDE", "TIME", "LOGICAL", "VALUE_ATOM", "INDEX_ARITH", "PREFIX", "PNAME_NS", "IRI_REF", "CREATE", "STREAM", "IDENT", "AS", "AGGREGATE", "OPERATOR", "OPEN_BRACE", "COMMA", "CLOSE_BRACE", "ASTERISK", "LESS", "GREATER", "PULSE", "WITH", "EQUAL", "END", "FREQUENCY", "USING", "FROM", "SELECT", "DISTINCT", "CONSTRUCT", "OPEN_CURLY_BRACE", "CLOSE_CURLY_BRACE", "NOW", "PLUS", "MINUS", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "LEFT_ARROW", "RIGHT_ARROW", "BY", "SEQUENCE", "WHERE", "GROUP", "HAVING", "STATIC", "ABOX", "TEMPORAL", "TBOX", "DOT", "OR", "AND", "NOT", "GRAPH", "FORALL", "IN", "IF", "THEN", "SEMICOLON", "A", "VAR_VALUE", "VAR_INDEX", "NOT_EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "DIVIDE", "ABS", "EXISTS", "LANGTAG", "REFERENCE", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "PNAME_LN", "RESSOURCE", "EOL", "WS", "NAMED", "OPTIONAL", "FILTER", "IRI", "URI", "YEAR", "MONTH", "DAY", "HOURS", "MINUTES", "SECONDS", "ELSE", "EQUALS", "PN_PREFIX", "PN_LOCAL", "QUESTION_MARK", "VARNAME", "VARNAME_SEQ", "DIGIT", "EXPONENT", "SIGN", "ECHAR", "IRI_REF_CHARACTERS", "PIPE", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "COMMENT", "NEGATION", "ANY", "LETTER", "'|_'", "'_|'"
    };
    public static final int SIGN=140;
    public static final int INDEX_ARITH=36;
    public static final int FUNCTION=20;
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
    public static final int EOL=118;
    public static final int GREATER=51;
    public static final int USING=57;
    public static final int NOT_EQUAL=93;
    public static final int QUESTION_MARK=135;
    public static final int LESS=50;
    public static final int BOUND_INDEXES=27;
    public static final int DOUBLE=103;
    public static final int PN_CHARS_U=145;
    public static final int UNARY_NOT=21;
    public static final int SELECT_CLAUSE=7;
    public static final int VAR=9;
    public static final int COMMENT=147;
    public static final int STREAM=41;
    public static final int SELECT=59;
    public static final int OPEN_CURLY_BRACE=62;
    public static final int CLOSE_CURLY_BRACE=63;
    public static final int DOUBLE_POSITIVE=106;
    public static final int DIVIDE=96;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int A=90;
    public static final int VAR_VALUE=91;
    public static final int STATIC=76;
    public static final int ELSE=131;
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
    public static final int TIME=33;
    public static final int INDEX=15;
    public static final int AS=43;
    public static final int WHERE_CLAUSE=8;
    public static final int IN=86;
    public static final int THEN=88;
    public static final int EXPRESSION_LIST=12;
    public static final int OBJECT=18;
    public static final int PULSE=52;
    public static final int COMMA=47;
    public static final int IRI=123;
    public static final int DECIMAL_POSITIVE=105;
    public static final int EQUAL=54;
    public static final int IDENT=42;
    public static final int PIPE=143;
    public static final int PLUS=65;
    public static final int DIGIT=138;
    public static final int EXISTS=98;
    public static final int TRIPLE=14;
    public static final int UNARY=24;
    public static final int LEFT_ARROW=69;
    public static final int DOT=80;
    public static final int WITH=53;
    public static final int VARNAME_SEQ=137;
    public static final int INTEGER=101;
    public static final int BY=71;
    public static final int BLANK_NODE=25;
    public static final int OPEN_SQUARE_BRACKET=67;
    public static final int OPERATOR=45;
    public static final int INTEGER_NEGATIVE=107;
    public static final int RESSOURCE=117;
    public static final int PN_LOCAL=134;
    public static final int FORALL=85;
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
    public static final int NEGATION=148;
    public static final int PN_CHARS_BASE=144;
    public static final int STRING_LITERAL_LONG2=115;
    public static final int DECIMAL=102;
    public static final int STRING_LITERAL_LONG1=114;
    public static final int TBOX=79;
    public static final int DECIMAL_NEGATIVE=108;
    public static final int PN_PREFIX=133;
    public static final int START=29;
    public static final int WINDOW=26;
    public static final int LOGICAL=34;
    public static final int ABOX=77;
    public static final int OPEN_BRACE=46;
    public static final int GREATER_EQUAL=95;
    public static final int AGGREGATE=44;
    public static final int HOURS=128;
    public static final int LANGTAG=99;
    public static final int TEMPORAL=78;

    // delegates
    // delegators


        public StarqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public StarqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[171+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return StarqlParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g"; }


    public static class query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:53:1: query : ( prefixDecl )* ( createClause )* EOF -> ^( QUERY ( prefixDecl )* ( createClause )* ) ;
    public final StarqlParser.query_return query() throws RecognitionException {
        StarqlParser.query_return retval = new StarqlParser.query_return();
        retval.start = input.LT(1);
        int query_StartIndex = input.index();
        Object root_0 = null;

        Token EOF3=null;
        StarqlParser.prefixDecl_return prefixDecl1 = null;

        StarqlParser.createClause_return createClause2 = null;


        Object EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_prefixDecl=new RewriteRuleSubtreeStream(adaptor,"rule prefixDecl");
        RewriteRuleSubtreeStream stream_createClause=new RewriteRuleSubtreeStream(adaptor,"rule createClause");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:54:5: ( ( prefixDecl )* ( createClause )* EOF -> ^( QUERY ( prefixDecl )* ( createClause )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:54:7: ( prefixDecl )* ( createClause )* EOF
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:54:7: ( prefixDecl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PREFIX) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: prefixDecl
            	    {
            	    pushFollow(FOLLOW_prefixDecl_in_query159);
            	    prefixDecl1=prefixDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_prefixDecl.add(prefixDecl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:54:19: ( createClause )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CREATE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: createClause
            	    {
            	    pushFollow(FOLLOW_createClause_in_query162);
            	    createClause2=createClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_createClause.add(createClause2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_query166); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: createClause, prefixDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:38: -> ^( QUERY ( prefixDecl )* ( createClause )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:54:41: ^( QUERY ( prefixDecl )* ( createClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUERY, "QUERY"), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:54:49: ( prefixDecl )*
                while ( stream_prefixDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefixDecl.nextTree());

                }
                stream_prefixDecl.reset();
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:54:61: ( createClause )*
                while ( stream_createClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_createClause.nextTree());

                }
                stream_createClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, query_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "query"

    public static class prefixDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixDecl"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:57:1: prefixDecl : PREFIX PNAME_NS IRI_REF -> ^( PREFIX PNAME_NS IRI_REF ) ;
    public final StarqlParser.prefixDecl_return prefixDecl() throws RecognitionException {
        StarqlParser.prefixDecl_return retval = new StarqlParser.prefixDecl_return();
        retval.start = input.LT(1);
        int prefixDecl_StartIndex = input.index();
        Object root_0 = null;

        Token PREFIX4=null;
        Token PNAME_NS5=null;
        Token IRI_REF6=null;

        Object PREFIX4_tree=null;
        Object PNAME_NS5_tree=null;
        Object IRI_REF6_tree=null;
        RewriteRuleTokenStream stream_PREFIX=new RewriteRuleTokenStream(adaptor,"token PREFIX");
        RewriteRuleTokenStream stream_PNAME_NS=new RewriteRuleTokenStream(adaptor,"token PNAME_NS");
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:58:5: ( PREFIX PNAME_NS IRI_REF -> ^( PREFIX PNAME_NS IRI_REF ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:58:7: PREFIX PNAME_NS IRI_REF
            {
            PREFIX4=(Token)match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PREFIX.add(PREFIX4);

            PNAME_NS5=(Token)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDecl198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PNAME_NS.add(PNAME_NS5);

            IRI_REF6=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDecl200); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IRI_REF.add(IRI_REF6);



            // AST REWRITE
            // elements: PREFIX, PNAME_NS, IRI_REF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:31: -> ^( PREFIX PNAME_NS IRI_REF )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:58:34: ^( PREFIX PNAME_NS IRI_REF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PREFIX.nextNode(), root_1);

                adaptor.addChild(root_1, stream_PNAME_NS.nextNode());
                adaptor.addChild(root_1, stream_IRI_REF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, prefixDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixDecl"

    public static class createClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "createClause"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:61:1: createClause : ( CREATE STREAM IDENT AS queryDef -> CREATE ^( STREAM IDENT queryDef ) | CREATE AGGREGATE OPERATOR operatorDef AS ( hvgOrConstraint )? -> CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE pulseExp -> CREATE pulseExp ) ;
    public final StarqlParser.createClause_return createClause() throws RecognitionException {
        StarqlParser.createClause_return retval = new StarqlParser.createClause_return();
        retval.start = input.LT(1);
        int createClause_StartIndex = input.index();
        Object root_0 = null;

        Token CREATE7=null;
        Token STREAM8=null;
        Token IDENT9=null;
        Token AS10=null;
        Token CREATE12=null;
        Token AGGREGATE13=null;
        Token OPERATOR14=null;
        Token AS16=null;
        Token CREATE18=null;
        StarqlParser.queryDef_return queryDef11 = null;

        StarqlParser.operatorDef_return operatorDef15 = null;

        StarqlParser.hvgOrConstraint_return hvgOrConstraint17 = null;

        StarqlParser.pulseExp_return pulseExp19 = null;


        Object CREATE7_tree=null;
        Object STREAM8_tree=null;
        Object IDENT9_tree=null;
        Object AS10_tree=null;
        Object CREATE12_tree=null;
        Object AGGREGATE13_tree=null;
        Object OPERATOR14_tree=null;
        Object AS16_tree=null;
        Object CREATE18_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_STREAM=new RewriteRuleTokenStream(adaptor,"token STREAM");
        RewriteRuleTokenStream stream_AGGREGATE=new RewriteRuleTokenStream(adaptor,"token AGGREGATE");
        RewriteRuleTokenStream stream_OPERATOR=new RewriteRuleTokenStream(adaptor,"token OPERATOR");
        RewriteRuleSubtreeStream stream_operatorDef=new RewriteRuleSubtreeStream(adaptor,"rule operatorDef");
        RewriteRuleSubtreeStream stream_pulseExp=new RewriteRuleSubtreeStream(adaptor,"rule pulseExp");
        RewriteRuleSubtreeStream stream_hvgOrConstraint=new RewriteRuleSubtreeStream(adaptor,"rule hvgOrConstraint");
        RewriteRuleSubtreeStream stream_queryDef=new RewriteRuleSubtreeStream(adaptor,"rule queryDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:62:2: ( ( CREATE STREAM IDENT AS queryDef -> CREATE ^( STREAM IDENT queryDef ) | CREATE AGGREGATE OPERATOR operatorDef AS ( hvgOrConstraint )? -> CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE pulseExp -> CREATE pulseExp ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:63:2: ( CREATE STREAM IDENT AS queryDef -> CREATE ^( STREAM IDENT queryDef ) | CREATE AGGREGATE OPERATOR operatorDef AS ( hvgOrConstraint )? -> CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE pulseExp -> CREATE pulseExp )
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:63:2: ( CREATE STREAM IDENT AS queryDef -> CREATE ^( STREAM IDENT queryDef ) | CREATE AGGREGATE OPERATOR operatorDef AS ( hvgOrConstraint )? -> CREATE AGGREGATE operatorDef ( hvgOrConstraint )? | CREATE pulseExp -> CREATE pulseExp )
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:63:4: CREATE STREAM IDENT AS queryDef
                    {
                    CREATE7=(Token)match(input,CREATE,FOLLOW_CREATE_in_createClause231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE7);

                    STREAM8=(Token)match(input,STREAM,FOLLOW_STREAM_in_createClause233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STREAM.add(STREAM8);

                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_createClause235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT9);

                    AS10=(Token)match(input,AS,FOLLOW_AS_in_createClause237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS10);

                    pushFollow(FOLLOW_queryDef_in_createClause239);
                    queryDef11=queryDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_queryDef.add(queryDef11.getTree());


                    // AST REWRITE
                    // elements: CREATE, queryDef, STREAM, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:36: -> CREATE ^( STREAM IDENT queryDef )
                    {
                        adaptor.addChild(root_0, stream_CREATE.nextNode());
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:63:46: ^( STREAM IDENT queryDef )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STREAM.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_queryDef.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:64:4: CREATE AGGREGATE OPERATOR operatorDef AS ( hvgOrConstraint )?
                    {
                    CREATE12=(Token)match(input,CREATE,FOLLOW_CREATE_in_createClause256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE12);

                    AGGREGATE13=(Token)match(input,AGGREGATE,FOLLOW_AGGREGATE_in_createClause258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGGREGATE.add(AGGREGATE13);

                    OPERATOR14=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_createClause260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPERATOR.add(OPERATOR14);

                    pushFollow(FOLLOW_operatorDef_in_createClause262);
                    operatorDef15=operatorDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operatorDef.add(operatorDef15.getTree());
                    AS16=(Token)match(input,AS,FOLLOW_AS_in_createClause264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS16);

                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:64:45: ( hvgOrConstraint )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=PNAME_NS && LA3_0<=IRI_REF)||LA3_0==IDENT||LA3_0==OPEN_BRACE||LA3_0==ASTERISK||(LA3_0>=NOT && LA3_0<=FORALL)||(LA3_0>=VAR_VALUE && LA3_0<=VAR_INDEX)||(LA3_0>=ABS && LA3_0<=EXISTS)||(LA3_0>=INTEGER && LA3_0<=DOUBLE_NEGATIVE)||(LA3_0>=STRING_LITERAL1 && LA3_0<=PNAME_LN)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: hvgOrConstraint
                            {
                            pushFollow(FOLLOW_hvgOrConstraint_in_createClause266);
                            hvgOrConstraint17=hvgOrConstraint();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_hvgOrConstraint.add(hvgOrConstraint17.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: AGGREGATE, hvgOrConstraint, operatorDef, CREATE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:62: -> CREATE AGGREGATE operatorDef ( hvgOrConstraint )?
                    {
                        adaptor.addChild(root_0, stream_CREATE.nextNode());
                        adaptor.addChild(root_0, stream_AGGREGATE.nextNode());
                        adaptor.addChild(root_0, stream_operatorDef.nextTree());
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:64:94: ( hvgOrConstraint )?
                        if ( stream_hvgOrConstraint.hasNext() ) {
                            adaptor.addChild(root_0, stream_hvgOrConstraint.nextTree());

                        }
                        stream_hvgOrConstraint.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:65:4: CREATE pulseExp
                    {
                    CREATE18=(Token)match(input,CREATE,FOLLOW_CREATE_in_createClause284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE18);

                    pushFollow(FOLLOW_pulseExp_in_createClause286);
                    pulseExp19=pulseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pulseExp.add(pulseExp19.getTree());


                    // AST REWRITE
                    // elements: CREATE, pulseExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:20: -> CREATE pulseExp
                    {
                        adaptor.addChild(root_0, stream_CREATE.nextNode());
                        adaptor.addChild(root_0, stream_pulseExp.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, createClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "createClause"

    public static class operatorDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operatorDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:69:1: operatorDef : macroName OPEN_BRACE ( seqName COMMA )? starPattern ( COMMA starPattern )? CLOSE_BRACE -> ^( macroName ( seqName )* ( starPattern )* ) ;
    public final StarqlParser.operatorDef_return operatorDef() throws RecognitionException {
        StarqlParser.operatorDef_return retval = new StarqlParser.operatorDef_return();
        retval.start = input.LT(1);
        int operatorDef_StartIndex = input.index();
        Object root_0 = null;

        Token OPEN_BRACE21=null;
        Token COMMA23=null;
        Token COMMA25=null;
        Token CLOSE_BRACE27=null;
        StarqlParser.macroName_return macroName20 = null;

        StarqlParser.seqName_return seqName22 = null;

        StarqlParser.starPattern_return starPattern24 = null;

        StarqlParser.starPattern_return starPattern26 = null;


        Object OPEN_BRACE21_tree=null;
        Object COMMA23_tree=null;
        Object COMMA25_tree=null;
        Object CLOSE_BRACE27_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_starPattern=new RewriteRuleSubtreeStream(adaptor,"rule starPattern");
        RewriteRuleSubtreeStream stream_macroName=new RewriteRuleSubtreeStream(adaptor,"rule macroName");
        RewriteRuleSubtreeStream stream_seqName=new RewriteRuleSubtreeStream(adaptor,"rule seqName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:2: ( macroName OPEN_BRACE ( seqName COMMA )? starPattern ( COMMA starPattern )? CLOSE_BRACE -> ^( macroName ( seqName )* ( starPattern )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:4: macroName OPEN_BRACE ( seqName COMMA )? starPattern ( COMMA starPattern )? CLOSE_BRACE
            {
            pushFollow(FOLLOW_macroName_in_operatorDef307);
            macroName20=macroName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_macroName.add(macroName20.getTree());
            OPEN_BRACE21=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_operatorDef309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE21);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:25: ( seqName COMMA )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:27: seqName COMMA
                    {
                    pushFollow(FOLLOW_seqName_in_operatorDef313);
                    seqName22=seqName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_seqName.add(seqName22.getTree());
                    COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_operatorDef315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA23);


                    }
                    break;

            }

            pushFollow(FOLLOW_starPattern_in_operatorDef320);
            starPattern24=starPattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_starPattern.add(starPattern24.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:56: ( COMMA starPattern )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==COMMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:57: COMMA starPattern
                    {
                    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_operatorDef323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA25);

                    pushFollow(FOLLOW_starPattern_in_operatorDef325);
                    starPattern26=starPattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_starPattern.add(starPattern26.getTree());

                    }
                    break;

            }

            CLOSE_BRACE27=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_operatorDef329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE27);



            // AST REWRITE
            // elements: starPattern, macroName, seqName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:89: -> ^( macroName ( seqName )* ( starPattern )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:92: ^( macroName ( seqName )* ( starPattern )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_macroName.nextNode(), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:104: ( seqName )*
                while ( stream_seqName.hasNext() ) {
                    adaptor.addChild(root_1, stream_seqName.nextTree());

                }
                stream_seqName.reset();
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:70:113: ( starPattern )*
                while ( stream_starPattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_starPattern.nextTree());

                }
                stream_starPattern.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, operatorDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operatorDef"

    public static class seqName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "seqName"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:73:1: seqName : IDENT ;
    public final StarqlParser.seqName_return seqName() throws RecognitionException {
        StarqlParser.seqName_return retval = new StarqlParser.seqName_return();
        retval.start = input.LT(1);
        int seqName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT28=null;

        Object IDENT28_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:74:2: ( IDENT )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:74:4: IDENT
            {
            root_0 = (Object)adaptor.nil();

            IDENT28=(Token)match(input,IDENT,FOLLOW_IDENT_in_seqName354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT28_tree = (Object)adaptor.create(IDENT28);
            adaptor.addChild(root_0, IDENT28_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, seqName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "seqName"

    public static class macroName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "macroName"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:76:1: macroName : IDENT ;
    public final StarqlParser.macroName_return macroName() throws RecognitionException {
        StarqlParser.macroName_return retval = new StarqlParser.macroName_return();
        retval.start = input.LT(1);
        int macroName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT29=null;

        Object IDENT29_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:77:2: ( IDENT )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:77:4: IDENT
            {
            root_0 = (Object)adaptor.nil();

            IDENT29=(Token)match(input,IDENT,FOLLOW_IDENT_in_macroName364); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT29_tree = (Object)adaptor.create(IDENT29);
            adaptor.addChild(root_0, IDENT29_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, macroName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "macroName"

    public static class starPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "starPattern"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:80:1: starPattern : ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS resultTime GREATER | ( ASTERISK | subject ) verb ( object | ASTERISK ) ) ;
    public final StarqlParser.starPattern_return starPattern() throws RecognitionException {
        StarqlParser.starPattern_return retval = new StarqlParser.starPattern_return();
        retval.start = input.LT(1);
        int starPattern_StartIndex = input.index();
        Object root_0 = null;

        Token OPEN_BRACE31=null;
        Token ASTERISK32=null;
        Token CLOSE_BRACE33=null;
        Token OPEN_BRACE35=null;
        Token CLOSE_BRACE37=null;
        Token LESS38=null;
        Token GREATER40=null;
        Token ASTERISK41=null;
        Token ASTERISK45=null;
        StarqlParser.var_return var30 = null;

        StarqlParser.var_return var34 = null;

        StarqlParser.var_return var36 = null;

        StarqlParser.resultTime_return resultTime39 = null;

        StarqlParser.subject_return subject42 = null;

        StarqlParser.verb_return verb43 = null;

        StarqlParser.object_return object44 = null;


        Object OPEN_BRACE31_tree=null;
        Object ASTERISK32_tree=null;
        Object CLOSE_BRACE33_tree=null;
        Object OPEN_BRACE35_tree=null;
        Object CLOSE_BRACE37_tree=null;
        Object LESS38_tree=null;
        Object GREATER40_tree=null;
        Object ASTERISK41_tree=null;
        Object ASTERISK45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:81:2: ( ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS resultTime GREATER | ( ASTERISK | subject ) verb ( object | ASTERISK ) ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:82:2: ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS resultTime GREATER | ( ASTERISK | subject ) verb ( object | ASTERISK ) )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:82:2: ( var OPEN_BRACE ASTERISK CLOSE_BRACE | var OPEN_BRACE var CLOSE_BRACE LESS resultTime GREATER | ( ASTERISK | subject ) verb ( object | ASTERISK ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case VAR_VALUE:
                {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=PNAME_NS && LA9_1<=IRI_REF)||(LA9_1>=A && LA9_1<=VAR_INDEX)||LA9_1==PNAME_LN) ) {
                    alt9=3;
                }
                else if ( (LA9_1==OPEN_BRACE) ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==ASTERISK) ) {
                        alt9=1;
                    }
                    else if ( ((LA9_4>=VAR_VALUE && LA9_4<=VAR_INDEX)) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case VAR_INDEX:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==OPEN_BRACE) ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==ASTERISK) ) {
                        alt9=1;
                    }
                    else if ( ((LA9_4>=VAR_VALUE && LA9_4<=VAR_INDEX)) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA9_2>=PNAME_NS && LA9_2<=IRI_REF)||(LA9_2>=A && LA9_2<=VAR_INDEX)||LA9_2==PNAME_LN) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case PNAME_NS:
            case IRI_REF:
            case ASTERISK:
            case PNAME_LN:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:82:4: var OPEN_BRACE ASTERISK CLOSE_BRACE
                    {
                    pushFollow(FOLLOW_var_in_starPattern380);
                    var30=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var30.getTree());
                    OPEN_BRACE31=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_starPattern382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_BRACE31_tree = (Object)adaptor.create(OPEN_BRACE31);
                    adaptor.addChild(root_0, OPEN_BRACE31_tree);
                    }
                    ASTERISK32=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_starPattern384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASTERISK32_tree = (Object)adaptor.create(ASTERISK32);
                    adaptor.addChild(root_0, ASTERISK32_tree);
                    }
                    CLOSE_BRACE33=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_starPattern386); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_BRACE33_tree = (Object)adaptor.create(CLOSE_BRACE33);
                    adaptor.addChild(root_0, CLOSE_BRACE33_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:83:5: var OPEN_BRACE var CLOSE_BRACE LESS resultTime GREATER
                    {
                    pushFollow(FOLLOW_var_in_starPattern392);
                    var34=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var34.getTree());
                    OPEN_BRACE35=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_starPattern394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_BRACE35_tree = (Object)adaptor.create(OPEN_BRACE35);
                    adaptor.addChild(root_0, OPEN_BRACE35_tree);
                    }
                    pushFollow(FOLLOW_var_in_starPattern396);
                    var36=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var36.getTree());
                    CLOSE_BRACE37=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_starPattern398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_BRACE37_tree = (Object)adaptor.create(CLOSE_BRACE37);
                    adaptor.addChild(root_0, CLOSE_BRACE37_tree);
                    }
                    LESS38=(Token)match(input,LESS,FOLLOW_LESS_in_starPattern400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS38_tree = (Object)adaptor.create(LESS38);
                    adaptor.addChild(root_0, LESS38_tree);
                    }
                    pushFollow(FOLLOW_resultTime_in_starPattern402);
                    resultTime39=resultTime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, resultTime39.getTree());
                    GREATER40=(Token)match(input,GREATER,FOLLOW_GREATER_in_starPattern404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER40_tree = (Object)adaptor.create(GREATER40);
                    adaptor.addChild(root_0, GREATER40_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:84:4: ( ASTERISK | subject ) verb ( object | ASTERISK )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:84:4: ( ASTERISK | subject )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ASTERISK) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_0>=PNAME_NS && LA7_0<=IRI_REF)||(LA7_0>=VAR_VALUE && LA7_0<=VAR_INDEX)||LA7_0==PNAME_LN) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:84:5: ASTERISK
                            {
                            ASTERISK41=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_starPattern410); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ASTERISK41_tree = (Object)adaptor.create(ASTERISK41);
                            adaptor.addChild(root_0, ASTERISK41_tree);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:84:16: subject
                            {
                            pushFollow(FOLLOW_subject_in_starPattern414);
                            subject42=subject();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, subject42.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_verb_in_starPattern417);
                    verb43=verb();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, verb43.getTree());
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:84:30: ( object | ASTERISK )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=PNAME_NS && LA8_0<=IRI_REF)||LA8_0==IDENT||(LA8_0>=VAR_VALUE && LA8_0<=VAR_INDEX)||(LA8_0>=INTEGER && LA8_0<=DOUBLE_NEGATIVE)||(LA8_0>=STRING_LITERAL1 && LA8_0<=PNAME_LN)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==ASTERISK) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:84:31: object
                            {
                            pushFollow(FOLLOW_object_in_starPattern420);
                            object44=object();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, object44.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:84:40: ASTERISK
                            {
                            ASTERISK45=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_starPattern424); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ASTERISK45_tree = (Object)adaptor.create(ASTERISK45);
                            adaptor.addChild(root_0, ASTERISK45_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, starPattern_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "starPattern"

    public static class aggDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aggDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:88:1: aggDef : valueLogical ;
    public final StarqlParser.aggDef_return aggDef() throws RecognitionException {
        StarqlParser.aggDef_return retval = new StarqlParser.aggDef_return();
        retval.start = input.LT(1);
        int aggDef_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.valueLogical_return valueLogical46 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:89:2: ( valueLogical )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:89:4: valueLogical
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_valueLogical_in_aggDef441);
            valueLogical46=valueLogical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, valueLogical46.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, aggDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "aggDef"

    public static class unaryAggDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryAggDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:92:1: unaryAggDef : valueLogical ;
    public final StarqlParser.unaryAggDef_return unaryAggDef() throws RecognitionException {
        StarqlParser.unaryAggDef_return retval = new StarqlParser.unaryAggDef_return();
        retval.start = input.LT(1);
        int unaryAggDef_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.valueLogical_return valueLogical47 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:93:2: ( valueLogical )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:93:4: valueLogical
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_valueLogical_in_unaryAggDef453);
            valueLogical47=valueLogical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, valueLogical47.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, unaryAggDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryAggDef"

    public static class binaryAggDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryAggDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:96:1: binaryAggDef : valueLogical ;
    public final StarqlParser.binaryAggDef_return binaryAggDef() throws RecognitionException {
        StarqlParser.binaryAggDef_return retval = new StarqlParser.binaryAggDef_return();
        retval.start = input.LT(1);
        int binaryAggDef_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.valueLogical_return valueLogical48 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:97:2: ( valueLogical )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:97:5: valueLogical
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_valueLogical_in_binaryAggDef466);
            valueLogical48=valueLogical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, valueLogical48.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, binaryAggDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "binaryAggDef"

    public static class pulseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pulseExp"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:100:1: pulseExp : PULSE IDENT WITH ( START EQUAL startTime COMMA )? ( END EQUAL endTime COMMA )? FREQUENCY EQUAL frequence -> ^( PULSE IDENT ( startTime )* ( endTime )* frequence ) ;
    public final StarqlParser.pulseExp_return pulseExp() throws RecognitionException {
        StarqlParser.pulseExp_return retval = new StarqlParser.pulseExp_return();
        retval.start = input.LT(1);
        int pulseExp_StartIndex = input.index();
        Object root_0 = null;

        Token PULSE49=null;
        Token IDENT50=null;
        Token WITH51=null;
        Token START52=null;
        Token EQUAL53=null;
        Token COMMA55=null;
        Token END56=null;
        Token EQUAL57=null;
        Token COMMA59=null;
        Token FREQUENCY60=null;
        Token EQUAL61=null;
        StarqlParser.startTime_return startTime54 = null;

        StarqlParser.endTime_return endTime58 = null;

        StarqlParser.frequence_return frequence62 = null;


        Object PULSE49_tree=null;
        Object IDENT50_tree=null;
        Object WITH51_tree=null;
        Object START52_tree=null;
        Object EQUAL53_tree=null;
        Object COMMA55_tree=null;
        Object END56_tree=null;
        Object EQUAL57_tree=null;
        Object COMMA59_tree=null;
        Object FREQUENCY60_tree=null;
        Object EQUAL61_tree=null;
        RewriteRuleTokenStream stream_FREQUENCY=new RewriteRuleTokenStream(adaptor,"token FREQUENCY");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_PULSE=new RewriteRuleTokenStream(adaptor,"token PULSE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_startTime=new RewriteRuleSubtreeStream(adaptor,"rule startTime");
        RewriteRuleSubtreeStream stream_endTime=new RewriteRuleSubtreeStream(adaptor,"rule endTime");
        RewriteRuleSubtreeStream stream_frequence=new RewriteRuleSubtreeStream(adaptor,"rule frequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:2: ( PULSE IDENT WITH ( START EQUAL startTime COMMA )? ( END EQUAL endTime COMMA )? FREQUENCY EQUAL frequence -> ^( PULSE IDENT ( startTime )* ( endTime )* frequence ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:4: PULSE IDENT WITH ( START EQUAL startTime COMMA )? ( END EQUAL endTime COMMA )? FREQUENCY EQUAL frequence
            {
            PULSE49=(Token)match(input,PULSE,FOLLOW_PULSE_in_pulseExp477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PULSE.add(PULSE49);

            IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_pulseExp479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT50);

            WITH51=(Token)match(input,WITH,FOLLOW_WITH_in_pulseExp481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WITH.add(WITH51);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:21: ( START EQUAL startTime COMMA )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==START) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:22: START EQUAL startTime COMMA
                    {
                    START52=(Token)match(input,START,FOLLOW_START_in_pulseExp484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_START.add(START52);

                    EQUAL53=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_pulseExp486); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL53);

                    pushFollow(FOLLOW_startTime_in_pulseExp488);
                    startTime54=startTime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_startTime.add(startTime54.getTree());
                    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_pulseExp490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);


                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:52: ( END EQUAL endTime COMMA )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==END) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:53: END EQUAL endTime COMMA
                    {
                    END56=(Token)match(input,END,FOLLOW_END_in_pulseExp495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END56);

                    EQUAL57=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_pulseExp497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL57);

                    pushFollow(FOLLOW_endTime_in_pulseExp499);
                    endTime58=endTime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_endTime.add(endTime58.getTree());
                    COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_pulseExp501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA59);


                    }
                    break;

            }

            FREQUENCY60=(Token)match(input,FREQUENCY,FOLLOW_FREQUENCY_in_pulseExp505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FREQUENCY.add(FREQUENCY60);

            EQUAL61=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_pulseExp507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL61);

            pushFollow(FOLLOW_frequence_in_pulseExp509);
            frequence62=frequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_frequence.add(frequence62.getTree());


            // AST REWRITE
            // elements: endTime, IDENT, frequence, startTime, PULSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 101:105: -> ^( PULSE IDENT ( startTime )* ( endTime )* frequence )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:108: ^( PULSE IDENT ( startTime )* ( endTime )* frequence )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PULSE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:123: ( startTime )*
                while ( stream_startTime.hasNext() ) {
                    adaptor.addChild(root_1, stream_startTime.nextTree());

                }
                stream_startTime.reset();
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:101:134: ( endTime )*
                while ( stream_endTime.hasNext() ) {
                    adaptor.addChild(root_1, stream_endTime.nextTree());

                }
                stream_endTime.reset();
                adaptor.addChild(root_1, stream_frequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, pulseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pulseExp"

    public static class startTime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "startTime"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:104:1: startTime : rdfLiteral -> ^( START rdfLiteral ) ;
    public final StarqlParser.startTime_return startTime() throws RecognitionException {
        StarqlParser.startTime_return retval = new StarqlParser.startTime_return();
        retval.start = input.LT(1);
        int startTime_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.rdfLiteral_return rdfLiteral63 = null;


        RewriteRuleSubtreeStream stream_rdfLiteral=new RewriteRuleSubtreeStream(adaptor,"rule rdfLiteral");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:105:2: ( rdfLiteral -> ^( START rdfLiteral ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:105:4: rdfLiteral
            {
            pushFollow(FOLLOW_rdfLiteral_in_startTime538);
            rdfLiteral63=rdfLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rdfLiteral.add(rdfLiteral63.getTree());


            // AST REWRITE
            // elements: rdfLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:15: -> ^( START rdfLiteral )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:105:18: ^( START rdfLiteral )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(START, "START"), root_1);

                adaptor.addChild(root_1, stream_rdfLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, startTime_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "startTime"

    public static class endTime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endTime"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:108:1: endTime : rdfLiteral -> ^( END rdfLiteral ) ;
    public final StarqlParser.endTime_return endTime() throws RecognitionException {
        StarqlParser.endTime_return retval = new StarqlParser.endTime_return();
        retval.start = input.LT(1);
        int endTime_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.rdfLiteral_return rdfLiteral64 = null;


        RewriteRuleSubtreeStream stream_rdfLiteral=new RewriteRuleSubtreeStream(adaptor,"rule rdfLiteral");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:109:2: ( rdfLiteral -> ^( END rdfLiteral ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:109:4: rdfLiteral
            {
            pushFollow(FOLLOW_rdfLiteral_in_endTime558);
            rdfLiteral64=rdfLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rdfLiteral.add(rdfLiteral64.getTree());


            // AST REWRITE
            // elements: rdfLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:15: -> ^( END rdfLiteral )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:109:18: ^( END rdfLiteral )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(END, "END"), root_1);

                adaptor.addChild(root_1, stream_rdfLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, endTime_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "endTime"

    public static class frequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "frequence"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:113:1: frequence : rdfLiteral -> ^( FREQUENCY rdfLiteral ) ;
    public final StarqlParser.frequence_return frequence() throws RecognitionException {
        StarqlParser.frequence_return retval = new StarqlParser.frequence_return();
        retval.start = input.LT(1);
        int frequence_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.rdfLiteral_return rdfLiteral65 = null;


        RewriteRuleSubtreeStream stream_rdfLiteral=new RewriteRuleSubtreeStream(adaptor,"rule rdfLiteral");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:114:2: ( rdfLiteral -> ^( FREQUENCY rdfLiteral ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:114:4: rdfLiteral
            {
            pushFollow(FOLLOW_rdfLiteral_in_frequence579);
            rdfLiteral65=rdfLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rdfLiteral.add(rdfLiteral65.getTree());


            // AST REWRITE
            // elements: rdfLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 114:15: -> ^( FREQUENCY rdfLiteral )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:114:18: ^( FREQUENCY rdfLiteral )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FREQUENCY, "FREQUENCY"), root_1);

                adaptor.addChild(root_1, stream_rdfLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, frequence_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "frequence"

    public static class pulseRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pulseRef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:117:1: pulseRef : USING PULSE IDENT -> ^( USING IDENT ) ;
    public final StarqlParser.pulseRef_return pulseRef() throws RecognitionException {
        StarqlParser.pulseRef_return retval = new StarqlParser.pulseRef_return();
        retval.start = input.LT(1);
        int pulseRef_StartIndex = input.index();
        Object root_0 = null;

        Token USING66=null;
        Token PULSE67=null;
        Token IDENT68=null;

        Object USING66_tree=null;
        Object PULSE67_tree=null;
        Object IDENT68_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_PULSE=new RewriteRuleTokenStream(adaptor,"token PULSE");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:118:5: ( USING PULSE IDENT -> ^( USING IDENT ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:118:7: USING PULSE IDENT
            {
            USING66=(Token)match(input,USING,FOLLOW_USING_in_pulseRef602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USING.add(USING66);

            PULSE67=(Token)match(input,PULSE,FOLLOW_PULSE_in_pulseRef604); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PULSE.add(PULSE67);

            IDENT68=(Token)match(input,IDENT,FOLLOW_IDENT_in_pulseRef606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT68);



            // AST REWRITE
            // elements: IDENT, USING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:25: -> ^( USING IDENT )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:118:28: ^( USING IDENT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_USING.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, pulseRef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pulseRef"

    public static class queryDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "queryDef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:121:1: queryDef : queryHead FROM listOfWindowedStreamExp ( listOfRessources )? ( pulseRef )? ( whereClause )? ( seqMethod havingClause )? ( groupBy )? ( hvgAgg )? -> ^( CONSTRUCT queryHead ^( FROM listOfWindowedStreamExp ( listOfRessources )* ) ( pulseRef )* ( whereClause )* ( seqMethod havingClause )? ( groupBy )* ( hvgAgg )* ) ;
    public final StarqlParser.queryDef_return queryDef() throws RecognitionException {
        StarqlParser.queryDef_return retval = new StarqlParser.queryDef_return();
        retval.start = input.LT(1);
        int queryDef_StartIndex = input.index();
        Object root_0 = null;

        Token FROM70=null;
        StarqlParser.queryHead_return queryHead69 = null;

        StarqlParser.listOfWindowedStreamExp_return listOfWindowedStreamExp71 = null;

        StarqlParser.listOfRessources_return listOfRessources72 = null;

        StarqlParser.pulseRef_return pulseRef73 = null;

        StarqlParser.whereClause_return whereClause74 = null;

        StarqlParser.seqMethod_return seqMethod75 = null;

        StarqlParser.havingClause_return havingClause76 = null;

        StarqlParser.groupBy_return groupBy77 = null;

        StarqlParser.hvgAgg_return hvgAgg78 = null;


        Object FROM70_tree=null;
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleSubtreeStream stream_groupBy=new RewriteRuleSubtreeStream(adaptor,"rule groupBy");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_pulseRef=new RewriteRuleSubtreeStream(adaptor,"rule pulseRef");
        RewriteRuleSubtreeStream stream_listOfWindowedStreamExp=new RewriteRuleSubtreeStream(adaptor,"rule listOfWindowedStreamExp");
        RewriteRuleSubtreeStream stream_listOfRessources=new RewriteRuleSubtreeStream(adaptor,"rule listOfRessources");
        RewriteRuleSubtreeStream stream_havingClause=new RewriteRuleSubtreeStream(adaptor,"rule havingClause");
        RewriteRuleSubtreeStream stream_hvgAgg=new RewriteRuleSubtreeStream(adaptor,"rule hvgAgg");
        RewriteRuleSubtreeStream stream_seqMethod=new RewriteRuleSubtreeStream(adaptor,"rule seqMethod");
        RewriteRuleSubtreeStream stream_queryHead=new RewriteRuleSubtreeStream(adaptor,"rule queryHead");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:5: ( queryHead FROM listOfWindowedStreamExp ( listOfRessources )? ( pulseRef )? ( whereClause )? ( seqMethod havingClause )? ( groupBy )? ( hvgAgg )? -> ^( CONSTRUCT queryHead ^( FROM listOfWindowedStreamExp ( listOfRessources )* ) ( pulseRef )* ( whereClause )* ( seqMethod havingClause )? ( groupBy )* ( hvgAgg )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:7: queryHead FROM listOfWindowedStreamExp ( listOfRessources )? ( pulseRef )? ( whereClause )? ( seqMethod havingClause )? ( groupBy )? ( hvgAgg )?
            {
            pushFollow(FOLLOW_queryHead_in_queryDef633);
            queryHead69=queryHead();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_queryHead.add(queryHead69.getTree());
            FROM70=(Token)match(input,FROM,FOLLOW_FROM_in_queryDef635); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM70);

            pushFollow(FOLLOW_listOfWindowedStreamExp_in_queryDef637);
            listOfWindowedStreamExp71=listOfWindowedStreamExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listOfWindowedStreamExp.add(listOfWindowedStreamExp71.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:46: ( listOfRessources )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==COMMA||LA12_0==STATIC||(LA12_0>=TEMPORAL && LA12_0<=TBOX)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: listOfRessources
                    {
                    pushFollow(FOLLOW_listOfRessources_in_queryDef639);
                    listOfRessources72=listOfRessources();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_listOfRessources.add(listOfRessources72.getTree());

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:64: ( pulseRef )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==USING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: pulseRef
                    {
                    pushFollow(FOLLOW_pulseRef_in_queryDef642);
                    pulseRef73=pulseRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pulseRef.add(pulseRef73.getTree());

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:74: ( whereClause )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WHERE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_queryDef645);
                    whereClause74=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(whereClause74.getTree());

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:87: ( seqMethod havingClause )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SEQUENCE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:88: seqMethod havingClause
                    {
                    pushFollow(FOLLOW_seqMethod_in_queryDef649);
                    seqMethod75=seqMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_seqMethod.add(seqMethod75.getTree());
                    pushFollow(FOLLOW_havingClause_in_queryDef651);
                    havingClause76=havingClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_havingClause.add(havingClause76.getTree());

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:113: ( groupBy )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==GROUP) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: groupBy
                    {
                    pushFollow(FOLLOW_groupBy_in_queryDef655);
                    groupBy77=groupBy();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupBy.add(groupBy77.getTree());

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:122: ( hvgAgg )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HAVING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: hvgAgg
                    {
                    pushFollow(FOLLOW_hvgAgg_in_queryDef658);
                    hvgAgg78=hvgAgg();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hvgAgg.add(hvgAgg78.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: havingClause, groupBy, seqMethod, whereClause, pulseRef, listOfWindowedStreamExp, FROM, queryHead, hvgAgg, listOfRessources
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:129: -> ^( CONSTRUCT queryHead ^( FROM listOfWindowedStreamExp ( listOfRessources )* ) ( pulseRef )* ( whereClause )* ( seqMethod havingClause )? ( groupBy )* ( hvgAgg )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:132: ^( CONSTRUCT queryHead ^( FROM listOfWindowedStreamExp ( listOfRessources )* ) ( pulseRef )* ( whereClause )* ( seqMethod havingClause )? ( groupBy )* ( hvgAgg )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRUCT, "CONSTRUCT"), root_1);

                adaptor.addChild(root_1, stream_queryHead.nextTree());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:154: ^( FROM listOfWindowedStreamExp ( listOfRessources )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                adaptor.addChild(root_2, stream_listOfWindowedStreamExp.nextTree());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:185: ( listOfRessources )*
                while ( stream_listOfRessources.hasNext() ) {
                    adaptor.addChild(root_2, stream_listOfRessources.nextTree());

                }
                stream_listOfRessources.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:204: ( pulseRef )*
                while ( stream_pulseRef.hasNext() ) {
                    adaptor.addChild(root_1, stream_pulseRef.nextTree());

                }
                stream_pulseRef.reset();
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:214: ( whereClause )*
                while ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:227: ( seqMethod havingClause )?
                if ( stream_havingClause.hasNext()||stream_seqMethod.hasNext() ) {
                    adaptor.addChild(root_1, stream_seqMethod.nextTree());
                    adaptor.addChild(root_1, stream_havingClause.nextTree());

                }
                stream_havingClause.reset();
                stream_seqMethod.reset();
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:253: ( groupBy )*
                while ( stream_groupBy.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupBy.nextTree());

                }
                stream_groupBy.reset();
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:122:262: ( hvgAgg )*
                while ( stream_hvgAgg.hasNext() ) {
                    adaptor.addChild(root_1, stream_hvgAgg.nextTree());

                }
                stream_hvgAgg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, queryDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "queryDef"

    public static class queryHead_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "queryHead"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:125:1: queryHead : ( SELECT ( DISTINCT )? bindingList -> ^( SELECT_CLAUSE ( DISTINCT )? bindingList ) | CONSTRUCT ( DISTINCT )? constructBlock -> ^( CONSTRUCT_CLAUSE ( DISTINCT )? constructBlock ) );
    public final StarqlParser.queryHead_return queryHead() throws RecognitionException {
        StarqlParser.queryHead_return retval = new StarqlParser.queryHead_return();
        retval.start = input.LT(1);
        int queryHead_StartIndex = input.index();
        Object root_0 = null;

        Token SELECT79=null;
        Token DISTINCT80=null;
        Token CONSTRUCT82=null;
        Token DISTINCT83=null;
        StarqlParser.bindingList_return bindingList81 = null;

        StarqlParser.constructBlock_return constructBlock84 = null;


        Object SELECT79_tree=null;
        Object DISTINCT80_tree=null;
        Object CONSTRUCT82_tree=null;
        Object DISTINCT83_tree=null;
        RewriteRuleTokenStream stream_CONSTRUCT=new RewriteRuleTokenStream(adaptor,"token CONSTRUCT");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleSubtreeStream stream_bindingList=new RewriteRuleSubtreeStream(adaptor,"rule bindingList");
        RewriteRuleSubtreeStream stream_constructBlock=new RewriteRuleSubtreeStream(adaptor,"rule constructBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:126:5: ( SELECT ( DISTINCT )? bindingList -> ^( SELECT_CLAUSE ( DISTINCT )? bindingList ) | CONSTRUCT ( DISTINCT )? constructBlock -> ^( CONSTRUCT_CLAUSE ( DISTINCT )? constructBlock ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==SELECT) ) {
                alt20=1;
            }
            else if ( (LA20_0==CONSTRUCT) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:126:7: SELECT ( DISTINCT )? bindingList
                    {
                    SELECT79=(Token)match(input,SELECT,FOLLOW_SELECT_in_queryHead715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SELECT.add(SELECT79);

                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:126:14: ( DISTINCT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DISTINCT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: DISTINCT
                            {
                            DISTINCT80=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_queryHead717); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT80);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bindingList_in_queryHead720);
                    bindingList81=bindingList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bindingList.add(bindingList81.getTree());


                    // AST REWRITE
                    // elements: bindingList, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:36: -> ^( SELECT_CLAUSE ( DISTINCT )? bindingList )
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:126:39: ^( SELECT_CLAUSE ( DISTINCT )? bindingList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CLAUSE, "SELECT_CLAUSE"), root_1);

                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:126:55: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_bindingList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:127:7: CONSTRUCT ( DISTINCT )? constructBlock
                    {
                    CONSTRUCT82=(Token)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_queryHead739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTRUCT.add(CONSTRUCT82);

                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:127:17: ( DISTINCT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==DISTINCT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: DISTINCT
                            {
                            DISTINCT83=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_queryHead741); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT83);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_constructBlock_in_queryHead744);
                    constructBlock84=constructBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructBlock.add(constructBlock84.getTree());


                    // AST REWRITE
                    // elements: DISTINCT, constructBlock
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:42: -> ^( CONSTRUCT_CLAUSE ( DISTINCT )? constructBlock )
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:127:45: ^( CONSTRUCT_CLAUSE ( DISTINCT )? constructBlock )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRUCT_CLAUSE, "CONSTRUCT_CLAUSE"), root_1);

                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:127:64: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_constructBlock.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, queryHead_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "queryHead"

    public static class bindingList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingList"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:130:1: bindingList : OPEN_CURLY_BRACE binding ( binding )* CLOSE_CURLY_BRACE -> ( binding )* ;
    public final StarqlParser.bindingList_return bindingList() throws RecognitionException {
        StarqlParser.bindingList_return retval = new StarqlParser.bindingList_return();
        retval.start = input.LT(1);
        int bindingList_StartIndex = input.index();
        Object root_0 = null;

        Token OPEN_CURLY_BRACE85=null;
        Token CLOSE_CURLY_BRACE88=null;
        StarqlParser.binding_return binding86 = null;

        StarqlParser.binding_return binding87 = null;


        Object OPEN_CURLY_BRACE85_tree=null;
        Object CLOSE_CURLY_BRACE88_tree=null;
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_binding=new RewriteRuleSubtreeStream(adaptor,"rule binding");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:131:3: ( OPEN_CURLY_BRACE binding ( binding )* CLOSE_CURLY_BRACE -> ( binding )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:131:5: OPEN_CURLY_BRACE binding ( binding )* CLOSE_CURLY_BRACE
            {
            OPEN_CURLY_BRACE85=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_bindingList774); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE85);

            pushFollow(FOLLOW_binding_in_bindingList776);
            binding86=binding();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_binding.add(binding86.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:131:30: ( binding )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=PNAME_NS && LA21_0<=IRI_REF)||LA21_0==IDENT||LA21_0==OPEN_BRACE||(LA21_0>=VAR_VALUE && LA21_0<=VAR_INDEX)||LA21_0==ABS||(LA21_0>=INTEGER && LA21_0<=DOUBLE_NEGATIVE)||(LA21_0>=STRING_LITERAL1 && LA21_0<=PNAME_LN)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:131:32: binding
            	    {
            	    pushFollow(FOLLOW_binding_in_bindingList780);
            	    binding87=binding();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_binding.add(binding87.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            CLOSE_CURLY_BRACE88=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_bindingList785); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE88);



            // AST REWRITE
            // elements: binding
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 131:61: -> ( binding )*
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:131:64: ( binding )*
                while ( stream_binding.hasNext() ) {
                    adaptor.addChild(root_0, stream_binding.nextTree());

                }
                stream_binding.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, bindingList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bindingList"

    public static class binding_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:134:1: binding : primaryExpression ( AS hvgValueAtom )? -> primaryExpression ( hvgValueAtom )? ;
    public final StarqlParser.binding_return binding() throws RecognitionException {
        StarqlParser.binding_return retval = new StarqlParser.binding_return();
        retval.start = input.LT(1);
        int binding_StartIndex = input.index();
        Object root_0 = null;

        Token AS90=null;
        StarqlParser.primaryExpression_return primaryExpression89 = null;

        StarqlParser.hvgValueAtom_return hvgValueAtom91 = null;


        Object AS90_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_hvgValueAtom=new RewriteRuleSubtreeStream(adaptor,"rule hvgValueAtom");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:135:3: ( primaryExpression ( AS hvgValueAtom )? -> primaryExpression ( hvgValueAtom )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:135:5: primaryExpression ( AS hvgValueAtom )?
            {
            pushFollow(FOLLOW_primaryExpression_in_binding805);
            primaryExpression89=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primaryExpression.add(primaryExpression89.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:135:23: ( AS hvgValueAtom )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:135:24: AS hvgValueAtom
                    {
                    AS90=(Token)match(input,AS,FOLLOW_AS_in_binding808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS90);

                    pushFollow(FOLLOW_hvgValueAtom_in_binding810);
                    hvgValueAtom91=hvgValueAtom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hvgValueAtom.add(hvgValueAtom91.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: hvgValueAtom, primaryExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:42: -> primaryExpression ( hvgValueAtom )?
            {
                adaptor.addChild(root_0, stream_primaryExpression.nextTree());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:135:63: ( hvgValueAtom )?
                if ( stream_hvgValueAtom.hasNext() ) {
                    adaptor.addChild(root_0, stream_hvgValueAtom.nextTree());

                }
                stream_hvgValueAtom.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, binding_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "binding"

    public static class constructBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructBlock"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:138:1: constructBlock : hvgIndAt ;
    public final StarqlParser.constructBlock_return constructBlock() throws RecognitionException {
        StarqlParser.constructBlock_return retval = new StarqlParser.constructBlock_return();
        retval.start = input.LT(1);
        int constructBlock_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.hvgIndAt_return hvgIndAt92 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:139:2: ( hvgIndAt )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:139:4: hvgIndAt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_hvgIndAt_in_constructBlock833);
            hvgIndAt92=hvgIndAt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgIndAt92.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, constructBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constructBlock"

    public static class resultTime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resultTime"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:142:1: resultTime : ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) rdfLiteral ) | ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )? ) | var ) ;
    public final StarqlParser.resultTime_return resultTime() throws RecognitionException {
        StarqlParser.resultTime_return retval = new StarqlParser.resultTime_return();
        retval.start = input.LT(1);
        int resultTime_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal93=null;
        Token NOW94=null;
        Token set95=null;
        Token ASTERISK97=null;
        Token string_literal99=null;
        Token ASTERISK100=null;
        StarqlParser.rdfLiteral_return rdfLiteral96 = null;

        StarqlParser.numericLiteral_return numericLiteral98 = null;

        StarqlParser.numericLiteral_return numericLiteral101 = null;

        StarqlParser.var_return var102 = null;


        Object string_literal93_tree=null;
        Object NOW94_tree=null;
        Object set95_tree=null;
        Object ASTERISK97_tree=null;
        Object string_literal99_tree=null;
        Object ASTERISK100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:2: ( ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) rdfLiteral ) | ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )? ) | var ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:4: ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) rdfLiteral ) | ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )? ) | var )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:4: ( ( '|_' )? NOW ( ( ( PLUS | MINUS ) rdfLiteral ) | ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )? ) | var )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NOW||LA26_0==151) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=VAR_VALUE && LA26_0<=VAR_INDEX)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:5: ( '|_' )? NOW ( ( ( PLUS | MINUS ) rdfLiteral ) | ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )? )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:5: ( '|_' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==151) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:6: '|_'
                            {
                            string_literal93=(Token)match(input,151,FOLLOW_151_in_resultTime847); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal93_tree = (Object)adaptor.create(string_literal93);
                            adaptor.addChild(root_0, string_literal93_tree);
                            }

                            }
                            break;

                    }

                    NOW94=(Token)match(input,NOW,FOLLOW_NOW_in_resultTime851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOW94_tree = (Object)adaptor.create(NOW94);
                    adaptor.addChild(root_0, NOW94_tree);
                    }
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:17: ( ( ( PLUS | MINUS ) rdfLiteral ) | ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )? )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=PLUS && LA25_0<=MINUS)) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==COMMA||LA25_0==ASTERISK||LA25_0==GREATER||LA25_0==OPEN_CURLY_BRACE||LA25_0==CLOSE_SQUARE_BRACKET) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:19: ( ( PLUS | MINUS ) rdfLiteral )
                            {
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:19: ( ( PLUS | MINUS ) rdfLiteral )
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:21: ( PLUS | MINUS ) rdfLiteral
                            {
                            set95=(Token)input.LT(1);
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set95));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            pushFollow(FOLLOW_rdfLiteral_in_resultTime867);
                            rdfLiteral96=rdfLiteral();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rdfLiteral96.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:53: ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )?
                            {
                            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:53: ( ASTERISK numericLiteral '_|' ASTERISK numericLiteral )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==ASTERISK) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:54: ASTERISK numericLiteral '_|' ASTERISK numericLiteral
                                    {
                                    ASTERISK97=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_resultTime874); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    ASTERISK97_tree = (Object)adaptor.create(ASTERISK97);
                                    adaptor.addChild(root_0, ASTERISK97_tree);
                                    }
                                    pushFollow(FOLLOW_numericLiteral_in_resultTime876);
                                    numericLiteral98=numericLiteral();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteral98.getTree());
                                    string_literal99=(Token)match(input,152,FOLLOW_152_in_resultTime878); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    string_literal99_tree = (Object)adaptor.create(string_literal99);
                                    adaptor.addChild(root_0, string_literal99_tree);
                                    }
                                    ASTERISK100=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_resultTime880); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    ASTERISK100_tree = (Object)adaptor.create(ASTERISK100);
                                    adaptor.addChild(root_0, ASTERISK100_tree);
                                    }
                                    pushFollow(FOLLOW_numericLiteral_in_resultTime882);
                                    numericLiteral101=numericLiteral();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteral101.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:143:113: var
                    {
                    pushFollow(FOLLOW_var_in_resultTime890);
                    var102=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var102.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, resultTime_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "resultTime"

    public static class listOfWindowedStreamExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listOfWindowedStreamExp"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:146:1: listOfWindowedStreamExp : STREAM IDENT windowExp ( COMMA IDENT windowExp )* -> ^( STREAM ( IDENT windowExp )* ) ;
    public final StarqlParser.listOfWindowedStreamExp_return listOfWindowedStreamExp() throws RecognitionException {
        StarqlParser.listOfWindowedStreamExp_return retval = new StarqlParser.listOfWindowedStreamExp_return();
        retval.start = input.LT(1);
        int listOfWindowedStreamExp_StartIndex = input.index();
        Object root_0 = null;

        Token STREAM103=null;
        Token IDENT104=null;
        Token COMMA106=null;
        Token IDENT107=null;
        StarqlParser.windowExp_return windowExp105 = null;

        StarqlParser.windowExp_return windowExp108 = null;


        Object STREAM103_tree=null;
        Object IDENT104_tree=null;
        Object COMMA106_tree=null;
        Object IDENT107_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_STREAM=new RewriteRuleTokenStream(adaptor,"token STREAM");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_windowExp=new RewriteRuleSubtreeStream(adaptor,"rule windowExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:147:5: ( STREAM IDENT windowExp ( COMMA IDENT windowExp )* -> ^( STREAM ( IDENT windowExp )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:147:7: STREAM IDENT windowExp ( COMMA IDENT windowExp )*
            {
            STREAM103=(Token)match(input,STREAM,FOLLOW_STREAM_in_listOfWindowedStreamExp906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STREAM.add(STREAM103);

            IDENT104=(Token)match(input,IDENT,FOLLOW_IDENT_in_listOfWindowedStreamExp908); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT104);

            pushFollow(FOLLOW_windowExp_in_listOfWindowedStreamExp910);
            windowExp105=windowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_windowExp.add(windowExp105.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:147:30: ( COMMA IDENT windowExp )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==IDENT) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:147:32: COMMA IDENT windowExp
            	    {
            	    COMMA106=(Token)match(input,COMMA,FOLLOW_COMMA_in_listOfWindowedStreamExp914); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA106);

            	    IDENT107=(Token)match(input,IDENT,FOLLOW_IDENT_in_listOfWindowedStreamExp916); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT107);

            	    pushFollow(FOLLOW_windowExp_in_listOfWindowedStreamExp918);
            	    windowExp108=windowExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_windowExp.add(windowExp108.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);



            // AST REWRITE
            // elements: STREAM, IDENT, windowExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:57: -> ^( STREAM ( IDENT windowExp )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:147:60: ^( STREAM ( IDENT windowExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_STREAM.nextNode(), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:147:69: ( IDENT windowExp )*
                while ( stream_IDENT.hasNext()||stream_windowExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_windowExp.nextTree());

                }
                stream_IDENT.reset();
                stream_windowExp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, listOfWindowedStreamExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listOfWindowedStreamExp"

    public static class windowExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "windowExp"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:150:1: windowExp : ( slackConst )? OPEN_SQUARE_BRACKET timeExpNOW COMMA timeExpNOW CLOSE_SQUARE_BRACKET ( slideConst )? -> ^( WINDOW ( slackConst )* timeExpNOW timeExpNOW ( slideConst )* ) ;
    public final StarqlParser.windowExp_return windowExp() throws RecognitionException {
        StarqlParser.windowExp_return retval = new StarqlParser.windowExp_return();
        retval.start = input.LT(1);
        int windowExp_StartIndex = input.index();
        Object root_0 = null;

        Token OPEN_SQUARE_BRACKET110=null;
        Token COMMA112=null;
        Token CLOSE_SQUARE_BRACKET114=null;
        StarqlParser.slackConst_return slackConst109 = null;

        StarqlParser.timeExpNOW_return timeExpNOW111 = null;

        StarqlParser.timeExpNOW_return timeExpNOW113 = null;

        StarqlParser.slideConst_return slideConst115 = null;


        Object OPEN_SQUARE_BRACKET110_tree=null;
        Object COMMA112_tree=null;
        Object CLOSE_SQUARE_BRACKET114_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_SQUARE_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_SQUARE_BRACKET");
        RewriteRuleTokenStream stream_CLOSE_SQUARE_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_SQUARE_BRACKET");
        RewriteRuleSubtreeStream stream_slideConst=new RewriteRuleSubtreeStream(adaptor,"rule slideConst");
        RewriteRuleSubtreeStream stream_slackConst=new RewriteRuleSubtreeStream(adaptor,"rule slackConst");
        RewriteRuleSubtreeStream stream_timeExpNOW=new RewriteRuleSubtreeStream(adaptor,"rule timeExpNOW");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:151:2: ( ( slackConst )? OPEN_SQUARE_BRACKET timeExpNOW COMMA timeExpNOW CLOSE_SQUARE_BRACKET ( slideConst )? -> ^( WINDOW ( slackConst )* timeExpNOW timeExpNOW ( slideConst )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:151:4: ( slackConst )? OPEN_SQUARE_BRACKET timeExpNOW COMMA timeExpNOW CLOSE_SQUARE_BRACKET ( slideConst )?
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:151:4: ( slackConst )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=STRING_LITERAL1 && LA28_0<=STRING_LITERAL_LONG2)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: slackConst
                    {
                    pushFollow(FOLLOW_slackConst_in_windowExp952);
                    slackConst109=slackConst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slackConst.add(slackConst109.getTree());

                    }
                    break;

            }

            OPEN_SQUARE_BRACKET110=(Token)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_windowExp955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_SQUARE_BRACKET.add(OPEN_SQUARE_BRACKET110);

            pushFollow(FOLLOW_timeExpNOW_in_windowExp957);
            timeExpNOW111=timeExpNOW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_timeExpNOW.add(timeExpNOW111.getTree());
            COMMA112=(Token)match(input,COMMA,FOLLOW_COMMA_in_windowExp959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA112);

            pushFollow(FOLLOW_timeExpNOW_in_windowExp961);
            timeExpNOW113=timeExpNOW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_timeExpNOW.add(timeExpNOW113.getTree());
            CLOSE_SQUARE_BRACKET114=(Token)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_windowExp963); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_SQUARE_BRACKET.add(CLOSE_SQUARE_BRACKET114);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:151:85: ( slideConst )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RIGHT_ARROW) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: slideConst
                    {
                    pushFollow(FOLLOW_slideConst_in_windowExp965);
                    slideConst115=slideConst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slideConst.add(slideConst115.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: timeExpNOW, slideConst, timeExpNOW, slackConst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:97: -> ^( WINDOW ( slackConst )* timeExpNOW timeExpNOW ( slideConst )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:151:100: ^( WINDOW ( slackConst )* timeExpNOW timeExpNOW ( slideConst )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WINDOW, "WINDOW"), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:151:109: ( slackConst )*
                while ( stream_slackConst.hasNext() ) {
                    adaptor.addChild(root_1, stream_slackConst.nextTree());

                }
                stream_slackConst.reset();
                adaptor.addChild(root_1, stream_timeExpNOW.nextTree());
                adaptor.addChild(root_1, stream_timeExpNOW.nextTree());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:151:143: ( slideConst )*
                while ( stream_slideConst.hasNext() ) {
                    adaptor.addChild(root_1, stream_slideConst.nextTree());

                }
                stream_slideConst.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, windowExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "windowExp"

    public static class slackConst_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slackConst"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:154:1: slackConst : rdfLiteral LEFT_ARROW -> ^( SLACK rdfLiteral ) ;
    public final StarqlParser.slackConst_return slackConst() throws RecognitionException {
        StarqlParser.slackConst_return retval = new StarqlParser.slackConst_return();
        retval.start = input.LT(1);
        int slackConst_StartIndex = input.index();
        Object root_0 = null;

        Token LEFT_ARROW117=null;
        StarqlParser.rdfLiteral_return rdfLiteral116 = null;


        Object LEFT_ARROW117_tree=null;
        RewriteRuleTokenStream stream_LEFT_ARROW=new RewriteRuleTokenStream(adaptor,"token LEFT_ARROW");
        RewriteRuleSubtreeStream stream_rdfLiteral=new RewriteRuleSubtreeStream(adaptor,"rule rdfLiteral");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:155:2: ( rdfLiteral LEFT_ARROW -> ^( SLACK rdfLiteral ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:155:4: rdfLiteral LEFT_ARROW
            {
            pushFollow(FOLLOW_rdfLiteral_in_slackConst993);
            rdfLiteral116=rdfLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rdfLiteral.add(rdfLiteral116.getTree());
            LEFT_ARROW117=(Token)match(input,LEFT_ARROW,FOLLOW_LEFT_ARROW_in_slackConst995); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_ARROW.add(LEFT_ARROW117);



            // AST REWRITE
            // elements: rdfLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 155:26: -> ^( SLACK rdfLiteral )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:155:29: ^( SLACK rdfLiteral )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLACK, "SLACK"), root_1);

                adaptor.addChild(root_1, stream_rdfLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, slackConst_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slackConst"

    public static class slideConst_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slideConst"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:158:1: slideConst : RIGHT_ARROW rdfLiteral -> ^( SLIDE rdfLiteral ) ;
    public final StarqlParser.slideConst_return slideConst() throws RecognitionException {
        StarqlParser.slideConst_return retval = new StarqlParser.slideConst_return();
        retval.start = input.LT(1);
        int slideConst_StartIndex = input.index();
        Object root_0 = null;

        Token RIGHT_ARROW118=null;
        StarqlParser.rdfLiteral_return rdfLiteral119 = null;


        Object RIGHT_ARROW118_tree=null;
        RewriteRuleTokenStream stream_RIGHT_ARROW=new RewriteRuleTokenStream(adaptor,"token RIGHT_ARROW");
        RewriteRuleSubtreeStream stream_rdfLiteral=new RewriteRuleSubtreeStream(adaptor,"rule rdfLiteral");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:159:2: ( RIGHT_ARROW rdfLiteral -> ^( SLIDE rdfLiteral ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:159:4: RIGHT_ARROW rdfLiteral
            {
            RIGHT_ARROW118=(Token)match(input,RIGHT_ARROW,FOLLOW_RIGHT_ARROW_in_slideConst1015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_ARROW.add(RIGHT_ARROW118);

            pushFollow(FOLLOW_rdfLiteral_in_slideConst1017);
            rdfLiteral119=rdfLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rdfLiteral.add(rdfLiteral119.getTree());


            // AST REWRITE
            // elements: rdfLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 159:27: -> ^( SLIDE rdfLiteral )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:159:30: ^( SLIDE rdfLiteral )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLIDE, "SLIDE"), root_1);

                adaptor.addChild(root_1, stream_rdfLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, slideConst_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slideConst"

    public static class timeExpNOW_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeExpNOW"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:162:1: timeExpNOW : resultTime -> ^( TIME resultTime ) ;
    public final StarqlParser.timeExpNOW_return timeExpNOW() throws RecognitionException {
        StarqlParser.timeExpNOW_return retval = new StarqlParser.timeExpNOW_return();
        retval.start = input.LT(1);
        int timeExpNOW_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.resultTime_return resultTime120 = null;


        RewriteRuleSubtreeStream stream_resultTime=new RewriteRuleSubtreeStream(adaptor,"rule resultTime");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:163:2: ( resultTime -> ^( TIME resultTime ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:163:4: resultTime
            {
            pushFollow(FOLLOW_resultTime_in_timeExpNOW1037);
            resultTime120=resultTime();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_resultTime.add(resultTime120.getTree());


            // AST REWRITE
            // elements: resultTime
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:15: -> ^( TIME resultTime )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:163:18: ^( TIME resultTime )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIME, "TIME"), root_1);

                adaptor.addChild(root_1, stream_resultTime.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, timeExpNOW_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "timeExpNOW"

    public static class seqClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "seqClass"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:166:1: seqClass : BY IDENT -> ^( BY IDENT ) ;
    public final StarqlParser.seqClass_return seqClass() throws RecognitionException {
        StarqlParser.seqClass_return retval = new StarqlParser.seqClass_return();
        retval.start = input.LT(1);
        int seqClass_StartIndex = input.index();
        Object root_0 = null;

        Token BY121=null;
        Token IDENT122=null;

        Object BY121_tree=null;
        Object IDENT122_tree=null;
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:167:2: ( BY IDENT -> ^( BY IDENT ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:167:4: BY IDENT
            {
            BY121=(Token)match(input,BY,FOLLOW_BY_in_seqClass1057); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BY.add(BY121);

            IDENT122=(Token)match(input,IDENT,FOLLOW_IDENT_in_seqClass1059); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT122);



            // AST REWRITE
            // elements: BY, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 167:13: -> ^( BY IDENT )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:167:16: ^( BY IDENT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_BY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, seqClass_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "seqClass"

    public static class seqMethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "seqMethod"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:170:1: seqMethod : SEQUENCE seqClass ( AS seqName )? -> ^( SEQUENCE seqClass ( ^( AS seqName ) )? ) ;
    public final StarqlParser.seqMethod_return seqMethod() throws RecognitionException {
        StarqlParser.seqMethod_return retval = new StarqlParser.seqMethod_return();
        retval.start = input.LT(1);
        int seqMethod_StartIndex = input.index();
        Object root_0 = null;

        Token SEQUENCE123=null;
        Token AS125=null;
        StarqlParser.seqClass_return seqClass124 = null;

        StarqlParser.seqName_return seqName126 = null;


        Object SEQUENCE123_tree=null;
        Object AS125_tree=null;
        RewriteRuleTokenStream stream_SEQUENCE=new RewriteRuleTokenStream(adaptor,"token SEQUENCE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_seqClass=new RewriteRuleSubtreeStream(adaptor,"rule seqClass");
        RewriteRuleSubtreeStream stream_seqName=new RewriteRuleSubtreeStream(adaptor,"rule seqName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:171:2: ( SEQUENCE seqClass ( AS seqName )? -> ^( SEQUENCE seqClass ( ^( AS seqName ) )? ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:171:4: SEQUENCE seqClass ( AS seqName )?
            {
            SEQUENCE123=(Token)match(input,SEQUENCE,FOLLOW_SEQUENCE_in_seqMethod1078); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEQUENCE.add(SEQUENCE123);

            pushFollow(FOLLOW_seqClass_in_seqMethod1080);
            seqClass124=seqClass();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_seqClass.add(seqClass124.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:171:22: ( AS seqName )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==AS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:171:23: AS seqName
                    {
                    AS125=(Token)match(input,AS,FOLLOW_AS_in_seqMethod1083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(AS125);

                    pushFollow(FOLLOW_seqName_in_seqMethod1085);
                    seqName126=seqName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_seqName.add(seqName126.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: SEQUENCE, seqClass, seqName, AS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 171:36: -> ^( SEQUENCE seqClass ( ^( AS seqName ) )? )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:171:39: ^( SEQUENCE seqClass ( ^( AS seqName ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SEQUENCE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_seqClass.nextTree());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:171:59: ( ^( AS seqName ) )?
                if ( stream_seqName.hasNext()||stream_AS.hasNext() ) {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:171:59: ^( AS seqName )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_AS.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_seqName.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_seqName.reset();
                stream_AS.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, seqMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "seqMethod"

    public static class whereClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:174:1: whereClause : WHERE OPEN_CURLY_BRACE triplesBlock CLOSE_CURLY_BRACE -> ^( WHERE_CLAUSE triplesBlock ) ;
    public final StarqlParser.whereClause_return whereClause() throws RecognitionException {
        StarqlParser.whereClause_return retval = new StarqlParser.whereClause_return();
        retval.start = input.LT(1);
        int whereClause_StartIndex = input.index();
        Object root_0 = null;

        Token WHERE127=null;
        Token OPEN_CURLY_BRACE128=null;
        Token CLOSE_CURLY_BRACE130=null;
        StarqlParser.triplesBlock_return triplesBlock129 = null;


        Object WHERE127_tree=null;
        Object OPEN_CURLY_BRACE128_tree=null;
        Object CLOSE_CURLY_BRACE130_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_triplesBlock=new RewriteRuleSubtreeStream(adaptor,"rule triplesBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:175:5: ( WHERE OPEN_CURLY_BRACE triplesBlock CLOSE_CURLY_BRACE -> ^( WHERE_CLAUSE triplesBlock ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:175:7: WHERE OPEN_CURLY_BRACE triplesBlock CLOSE_CURLY_BRACE
            {
            WHERE127=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause1116); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHERE.add(WHERE127);

            OPEN_CURLY_BRACE128=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_whereClause1118); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE128);

            pushFollow(FOLLOW_triplesBlock_in_whereClause1120);
            triplesBlock129=triplesBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_triplesBlock.add(triplesBlock129.getTree());
            CLOSE_CURLY_BRACE130=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_whereClause1122); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE130);



            // AST REWRITE
            // elements: triplesBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 175:61: -> ^( WHERE_CLAUSE triplesBlock )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:175:64: ^( WHERE_CLAUSE triplesBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHERE_CLAUSE, "WHERE_CLAUSE"), root_1);

                adaptor.addChild(root_1, stream_triplesBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, whereClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whereClause"

    public static class groupBy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupBy"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:178:1: groupBy : GROUP BY ( var )* -> ^( GROUP ( var )* ) ;
    public final StarqlParser.groupBy_return groupBy() throws RecognitionException {
        StarqlParser.groupBy_return retval = new StarqlParser.groupBy_return();
        retval.start = input.LT(1);
        int groupBy_StartIndex = input.index();
        Object root_0 = null;

        Token GROUP131=null;
        Token BY132=null;
        StarqlParser.var_return var133 = null;


        Object GROUP131_tree=null;
        Object BY132_tree=null;
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:179:3: ( GROUP BY ( var )* -> ^( GROUP ( var )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:179:5: GROUP BY ( var )*
            {
            GROUP131=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupBy1149); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GROUP.add(GROUP131);

            BY132=(Token)match(input,BY,FOLLOW_BY_in_groupBy1151); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BY.add(BY132);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:179:14: ( var )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=VAR_VALUE && LA31_0<=VAR_INDEX)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: var
            	    {
            	    pushFollow(FOLLOW_var_in_groupBy1153);
            	    var133=var();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_var.add(var133.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



            // AST REWRITE
            // elements: GROUP, var
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:19: -> ^( GROUP ( var )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:179:22: ^( GROUP ( var )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_GROUP.nextNode(), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:179:30: ( var )*
                while ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextTree());

                }
                stream_var.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, groupBy_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "groupBy"

    public static class hvgAgg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgAgg"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:182:1: hvgAgg : HAVING AGGREGATE orLogical -> ^( AGGREGATE orLogical ) ;
    public final StarqlParser.hvgAgg_return hvgAgg() throws RecognitionException {
        StarqlParser.hvgAgg_return retval = new StarqlParser.hvgAgg_return();
        retval.start = input.LT(1);
        int hvgAgg_StartIndex = input.index();
        Object root_0 = null;

        Token HAVING134=null;
        Token AGGREGATE135=null;
        StarqlParser.orLogical_return orLogical136 = null;


        Object HAVING134_tree=null;
        Object AGGREGATE135_tree=null;
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleTokenStream stream_AGGREGATE=new RewriteRuleTokenStream(adaptor,"token AGGREGATE");
        RewriteRuleSubtreeStream stream_orLogical=new RewriteRuleSubtreeStream(adaptor,"rule orLogical");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:183:3: ( HAVING AGGREGATE orLogical -> ^( AGGREGATE orLogical ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:183:5: HAVING AGGREGATE orLogical
            {
            HAVING134=(Token)match(input,HAVING,FOLLOW_HAVING_in_hvgAgg1176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HAVING.add(HAVING134);

            AGGREGATE135=(Token)match(input,AGGREGATE,FOLLOW_AGGREGATE_in_hvgAgg1178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AGGREGATE.add(AGGREGATE135);

            pushFollow(FOLLOW_orLogical_in_hvgAgg1180);
            orLogical136=orLogical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orLogical.add(orLogical136.getTree());


            // AST REWRITE
            // elements: orLogical, AGGREGATE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 183:32: -> ^( AGGREGATE orLogical )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:183:35: ^( AGGREGATE orLogical )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_AGGREGATE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_orLogical.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, hvgAgg_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgAgg"

    public static class havingClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "havingClause"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:185:1: havingClause : HAVING hvgConstraint -> ^( HAVING hvgConstraint ) ;
    public final StarqlParser.havingClause_return havingClause() throws RecognitionException {
        StarqlParser.havingClause_return retval = new StarqlParser.havingClause_return();
        retval.start = input.LT(1);
        int havingClause_StartIndex = input.index();
        Object root_0 = null;

        Token HAVING137=null;
        StarqlParser.hvgConstraint_return hvgConstraint138 = null;


        Object HAVING137_tree=null;
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleSubtreeStream stream_hvgConstraint=new RewriteRuleSubtreeStream(adaptor,"rule hvgConstraint");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:186:5: ( HAVING hvgConstraint -> ^( HAVING hvgConstraint ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:186:7: HAVING hvgConstraint
            {
            HAVING137=(Token)match(input,HAVING,FOLLOW_HAVING_in_havingClause1202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HAVING.add(HAVING137);

            pushFollow(FOLLOW_hvgConstraint_in_havingClause1204);
            hvgConstraint138=hvgConstraint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hvgConstraint.add(hvgConstraint138.getTree());


            // AST REWRITE
            // elements: HAVING, hvgConstraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 186:28: -> ^( HAVING hvgConstraint )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:186:31: ^( HAVING hvgConstraint )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_HAVING.nextNode(), root_1);

                adaptor.addChild(root_1, stream_hvgConstraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, havingClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "havingClause"

    public static class listOfRessources_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listOfRessources"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:189:1: listOfRessources : ( COMMA )? typedRessourceList ( COMMA typedRessourceList )* -> ^( RESSOURCE ( typedRessourceList )* ) ;
    public final StarqlParser.listOfRessources_return listOfRessources() throws RecognitionException {
        StarqlParser.listOfRessources_return retval = new StarqlParser.listOfRessources_return();
        retval.start = input.LT(1);
        int listOfRessources_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA139=null;
        Token COMMA141=null;
        StarqlParser.typedRessourceList_return typedRessourceList140 = null;

        StarqlParser.typedRessourceList_return typedRessourceList142 = null;


        Object COMMA139_tree=null;
        Object COMMA141_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_typedRessourceList=new RewriteRuleSubtreeStream(adaptor,"rule typedRessourceList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:190:5: ( ( COMMA )? typedRessourceList ( COMMA typedRessourceList )* -> ^( RESSOURCE ( typedRessourceList )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:190:7: ( COMMA )? typedRessourceList ( COMMA typedRessourceList )*
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:190:7: ( COMMA )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COMMA) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: COMMA
                    {
                    COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_listOfRessources1235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA139);


                    }
                    break;

            }

            pushFollow(FOLLOW_typedRessourceList_in_listOfRessources1238);
            typedRessourceList140=typedRessourceList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedRessourceList.add(typedRessourceList140.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:190:33: ( COMMA typedRessourceList )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:190:34: COMMA typedRessourceList
            	    {
            	    COMMA141=(Token)match(input,COMMA,FOLLOW_COMMA_in_listOfRessources1241); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA141);

            	    pushFollow(FOLLOW_typedRessourceList_in_listOfRessources1243);
            	    typedRessourceList142=typedRessourceList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typedRessourceList.add(typedRessourceList142.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: typedRessourceList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:61: -> ^( RESSOURCE ( typedRessourceList )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:190:64: ^( RESSOURCE ( typedRessourceList )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RESSOURCE, "RESSOURCE"), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:190:76: ( typedRessourceList )*
                while ( stream_typedRessourceList.hasNext() ) {
                    adaptor.addChild(root_1, stream_typedRessourceList.nextTree());

                }
                stream_typedRessourceList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, listOfRessources_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listOfRessources"

    public static class typedRessourceList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedRessourceList"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:193:1: typedRessourceList : ( STATIC ABOX iriRef ( COMMA iriRef )* -> STATIC ABOX ( iriRef )+ | TEMPORAL ABOX iriRef ( COMMA iriRef )* -> TEMPORAL ABOX ( iriRef )+ | TBOX iriRef ( COMMA iriRef )* -> TBOX ABOX ( iriRef )+ );
    public final StarqlParser.typedRessourceList_return typedRessourceList() throws RecognitionException {
        StarqlParser.typedRessourceList_return retval = new StarqlParser.typedRessourceList_return();
        retval.start = input.LT(1);
        int typedRessourceList_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC143=null;
        Token ABOX144=null;
        Token COMMA146=null;
        Token TEMPORAL148=null;
        Token ABOX149=null;
        Token COMMA151=null;
        Token TBOX153=null;
        Token COMMA155=null;
        StarqlParser.iriRef_return iriRef145 = null;

        StarqlParser.iriRef_return iriRef147 = null;

        StarqlParser.iriRef_return iriRef150 = null;

        StarqlParser.iriRef_return iriRef152 = null;

        StarqlParser.iriRef_return iriRef154 = null;

        StarqlParser.iriRef_return iriRef156 = null;


        Object STATIC143_tree=null;
        Object ABOX144_tree=null;
        Object COMMA146_tree=null;
        Object TEMPORAL148_tree=null;
        Object ABOX149_tree=null;
        Object COMMA151_tree=null;
        Object TBOX153_tree=null;
        Object COMMA155_tree=null;
        RewriteRuleTokenStream stream_TBOX=new RewriteRuleTokenStream(adaptor,"token TBOX");
        RewriteRuleTokenStream stream_ABOX=new RewriteRuleTokenStream(adaptor,"token ABOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_TEMPORAL=new RewriteRuleTokenStream(adaptor,"token TEMPORAL");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:194:2: ( STATIC ABOX iriRef ( COMMA iriRef )* -> STATIC ABOX ( iriRef )+ | TEMPORAL ABOX iriRef ( COMMA iriRef )* -> TEMPORAL ABOX ( iriRef )+ | TBOX iriRef ( COMMA iriRef )* -> TBOX ABOX ( iriRef )+ )
            int alt37=3;
            switch ( input.LA(1) ) {
            case STATIC:
                {
                alt37=1;
                }
                break;
            case TEMPORAL:
                {
                alt37=2;
                }
                break;
            case TBOX:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:194:4: STATIC ABOX iriRef ( COMMA iriRef )*
                    {
                    STATIC143=(Token)match(input,STATIC,FOLLOW_STATIC_in_typedRessourceList1268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC.add(STATIC143);

                    ABOX144=(Token)match(input,ABOX,FOLLOW_ABOX_in_typedRessourceList1270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ABOX.add(ABOX144);

                    pushFollow(FOLLOW_iriRef_in_typedRessourceList1272);
                    iriRef145=iriRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iriRef.add(iriRef145.getTree());
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:194:23: ( COMMA iriRef )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==COMMA) ) {
                            int LA34_1 = input.LA(2);

                            if ( ((LA34_1>=PNAME_NS && LA34_1<=IRI_REF)||LA34_1==PNAME_LN) ) {
                                alt34=1;
                            }


                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:194:24: COMMA iriRef
                    	    {
                    	    COMMA146=(Token)match(input,COMMA,FOLLOW_COMMA_in_typedRessourceList1275); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA146);

                    	    pushFollow(FOLLOW_iriRef_in_typedRessourceList1277);
                    	    iriRef147=iriRef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_iriRef.add(iriRef147.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: ABOX, iriRef, STATIC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:39: -> STATIC ABOX ( iriRef )+
                    {
                        adaptor.addChild(root_0, stream_STATIC.nextNode());
                        adaptor.addChild(root_0, stream_ABOX.nextNode());
                        if ( !(stream_iriRef.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_iriRef.hasNext() ) {
                            adaptor.addChild(root_0, stream_iriRef.nextTree());

                        }
                        stream_iriRef.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:195:4: TEMPORAL ABOX iriRef ( COMMA iriRef )*
                    {
                    TEMPORAL148=(Token)match(input,TEMPORAL,FOLLOW_TEMPORAL_in_typedRessourceList1293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEMPORAL.add(TEMPORAL148);

                    ABOX149=(Token)match(input,ABOX,FOLLOW_ABOX_in_typedRessourceList1295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ABOX.add(ABOX149);

                    pushFollow(FOLLOW_iriRef_in_typedRessourceList1297);
                    iriRef150=iriRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iriRef.add(iriRef150.getTree());
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:195:25: ( COMMA iriRef )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==COMMA) ) {
                            int LA35_1 = input.LA(2);

                            if ( ((LA35_1>=PNAME_NS && LA35_1<=IRI_REF)||LA35_1==PNAME_LN) ) {
                                alt35=1;
                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:195:26: COMMA iriRef
                    	    {
                    	    COMMA151=(Token)match(input,COMMA,FOLLOW_COMMA_in_typedRessourceList1300); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA151);

                    	    pushFollow(FOLLOW_iriRef_in_typedRessourceList1302);
                    	    iriRef152=iriRef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_iriRef.add(iriRef152.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: iriRef, ABOX, TEMPORAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:41: -> TEMPORAL ABOX ( iriRef )+
                    {
                        adaptor.addChild(root_0, stream_TEMPORAL.nextNode());
                        adaptor.addChild(root_0, stream_ABOX.nextNode());
                        if ( !(stream_iriRef.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_iriRef.hasNext() ) {
                            adaptor.addChild(root_0, stream_iriRef.nextTree());

                        }
                        stream_iriRef.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:196:4: TBOX iriRef ( COMMA iriRef )*
                    {
                    TBOX153=(Token)match(input,TBOX,FOLLOW_TBOX_in_typedRessourceList1318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TBOX.add(TBOX153);

                    pushFollow(FOLLOW_iriRef_in_typedRessourceList1320);
                    iriRef154=iriRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iriRef.add(iriRef154.getTree());
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:196:16: ( COMMA iriRef )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==COMMA) ) {
                            int LA36_1 = input.LA(2);

                            if ( ((LA36_1>=PNAME_NS && LA36_1<=IRI_REF)||LA36_1==PNAME_LN) ) {
                                alt36=1;
                            }


                        }


                        switch (alt36) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:196:17: COMMA iriRef
                    	    {
                    	    COMMA155=(Token)match(input,COMMA,FOLLOW_COMMA_in_typedRessourceList1323); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA155);

                    	    pushFollow(FOLLOW_iriRef_in_typedRessourceList1325);
                    	    iriRef156=iriRef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_iriRef.add(iriRef156.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: TBOX, iriRef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:32: -> TBOX ABOX ( iriRef )+
                    {
                        adaptor.addChild(root_0, stream_TBOX.nextNode());
                        adaptor.addChild(root_0, (Object)adaptor.create(ABOX, "ABOX"));
                        if ( !(stream_iriRef.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_iriRef.hasNext() ) {
                            adaptor.addChild(root_0, stream_iriRef.nextTree());

                        }
                        stream_iriRef.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, typedRessourceList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedRessourceList"

    public static class triplesBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesBlock"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:199:1: triplesBlock : triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ( triplesSameSubject )+ ;
    public final StarqlParser.triplesBlock_return triplesBlock() throws RecognitionException {
        StarqlParser.triplesBlock_return retval = new StarqlParser.triplesBlock_return();
        retval.start = input.LT(1);
        int triplesBlock_StartIndex = input.index();
        Object root_0 = null;

        Token DOT158=null;
        Token DOT160=null;
        StarqlParser.triplesSameSubject_return triplesSameSubject157 = null;

        StarqlParser.triplesSameSubject_return triplesSameSubject159 = null;


        Object DOT158_tree=null;
        Object DOT160_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesSameSubject=new RewriteRuleSubtreeStream(adaptor,"rule triplesSameSubject");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:200:5: ( triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ( triplesSameSubject )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:200:7: triplesSameSubject ( DOT triplesSameSubject )* ( DOT )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesBlock1350);
            triplesSameSubject157=triplesSameSubject();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_triplesSameSubject.add(triplesSameSubject157.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:200:26: ( DOT triplesSameSubject )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==DOT) ) {
                    int LA38_1 = input.LA(2);

                    if ( ((LA38_1>=PNAME_NS && LA38_1<=IRI_REF)||(LA38_1>=VAR_VALUE && LA38_1<=VAR_INDEX)||LA38_1==PNAME_LN) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:200:27: DOT triplesSameSubject
            	    {
            	    DOT158=(Token)match(input,DOT,FOLLOW_DOT_in_triplesBlock1353); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT158);

            	    pushFollow(FOLLOW_triplesSameSubject_in_triplesBlock1355);
            	    triplesSameSubject159=triplesSameSubject();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_triplesSameSubject.add(triplesSameSubject159.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:200:52: ( DOT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DOT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: DOT
                    {
                    DOT160=(Token)match(input,DOT,FOLLOW_DOT_in_triplesBlock1359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT160);


                    }
                    break;

            }



            // AST REWRITE
            // elements: triplesSameSubject
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 200:57: -> ( triplesSameSubject )+
            {
                if ( !(stream_triplesSameSubject.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_triplesSameSubject.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesSameSubject.nextTree());

                }
                stream_triplesSameSubject.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, triplesBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "triplesBlock"

    public static class triplesSameSubject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesSameSubject"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:203:1: triplesSameSubject : subject propertyListNotEmpty -> ^( TRIPLE ^( SUBJECT subject ) propertyListNotEmpty ) ;
    public final StarqlParser.triplesSameSubject_return triplesSameSubject() throws RecognitionException {
        StarqlParser.triplesSameSubject_return retval = new StarqlParser.triplesSameSubject_return();
        retval.start = input.LT(1);
        int triplesSameSubject_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.subject_return subject161 = null;

        StarqlParser.propertyListNotEmpty_return propertyListNotEmpty162 = null;


        RewriteRuleSubtreeStream stream_propertyListNotEmpty=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmpty");
        RewriteRuleSubtreeStream stream_subject=new RewriteRuleSubtreeStream(adaptor,"rule subject");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:204:5: ( subject propertyListNotEmpty -> ^( TRIPLE ^( SUBJECT subject ) propertyListNotEmpty ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:204:7: subject propertyListNotEmpty
            {
            pushFollow(FOLLOW_subject_in_triplesSameSubject1382);
            subject161=subject();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_subject.add(subject161.getTree());
            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject1384);
            propertyListNotEmpty162=propertyListNotEmpty();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propertyListNotEmpty.add(propertyListNotEmpty162.getTree());


            // AST REWRITE
            // elements: subject, propertyListNotEmpty
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 204:36: -> ^( TRIPLE ^( SUBJECT subject ) propertyListNotEmpty )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:204:39: ^( TRIPLE ^( SUBJECT subject ) propertyListNotEmpty )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLE, "TRIPLE"), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:204:48: ^( SUBJECT subject )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBJECT, "SUBJECT"), root_2);

                adaptor.addChild(root_2, stream_subject.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, triplesSameSubject_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubject"

    public static class brackettedConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "brackettedConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:207:1: brackettedConstraint : OPEN_BRACE hvgOrConstraint CLOSE_BRACE ;
    public final StarqlParser.brackettedConstraint_return brackettedConstraint() throws RecognitionException {
        StarqlParser.brackettedConstraint_return retval = new StarqlParser.brackettedConstraint_return();
        retval.start = input.LT(1);
        int brackettedConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token OPEN_BRACE163=null;
        Token CLOSE_BRACE165=null;
        StarqlParser.hvgOrConstraint_return hvgOrConstraint164 = null;


        Object OPEN_BRACE163_tree=null;
        Object CLOSE_BRACE165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:208:5: ( OPEN_BRACE hvgOrConstraint CLOSE_BRACE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:208:7: OPEN_BRACE hvgOrConstraint CLOSE_BRACE
            {
            root_0 = (Object)adaptor.nil();

            OPEN_BRACE163=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_brackettedConstraint1419); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OPEN_BRACE163_tree = (Object)adaptor.create(OPEN_BRACE163);
            adaptor.addChild(root_0, OPEN_BRACE163_tree);
            }
            pushFollow(FOLLOW_hvgOrConstraint_in_brackettedConstraint1421);
            hvgOrConstraint164=hvgOrConstraint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgOrConstraint164.getTree());
            CLOSE_BRACE165=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_brackettedConstraint1423); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLOSE_BRACE165_tree = (Object)adaptor.create(CLOSE_BRACE165);
            adaptor.addChild(root_0, CLOSE_BRACE165_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, brackettedConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "brackettedConstraint"

    public static class hvgOrConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgOrConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:215:3: hvgOrConstraint : hvgAndConstraint ( OR hvgOrConstraint )* ;
    public final StarqlParser.hvgOrConstraint_return hvgOrConstraint() throws RecognitionException {
        StarqlParser.hvgOrConstraint_return retval = new StarqlParser.hvgOrConstraint_return();
        retval.start = input.LT(1);
        int hvgOrConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token OR167=null;
        StarqlParser.hvgAndConstraint_return hvgAndConstraint166 = null;

        StarqlParser.hvgOrConstraint_return hvgOrConstraint168 = null;


        Object OR167_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:216:7: ( hvgAndConstraint ( OR hvgOrConstraint )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:216:12: hvgAndConstraint ( OR hvgOrConstraint )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_hvgAndConstraint_in_hvgOrConstraint1456);
            hvgAndConstraint166=hvgAndConstraint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgAndConstraint166.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:216:29: ( OR hvgOrConstraint )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==OR) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred44_Starql()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:216:30: OR hvgOrConstraint
            	    {
            	    OR167=(Token)match(input,OR,FOLLOW_OR_in_hvgOrConstraint1459); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR167_tree = (Object)adaptor.create(OR167);
            	    root_0 = (Object)adaptor.becomeRoot(OR167_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_hvgOrConstraint_in_hvgOrConstraint1462);
            	    hvgOrConstraint168=hvgOrConstraint();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgOrConstraint168.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, hvgOrConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgOrConstraint"

    public static class hvgAndConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgAndConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:223:1: hvgAndConstraint : hvgConstraint ( AND hvgAndConstraint )* ;
    public final StarqlParser.hvgAndConstraint_return hvgAndConstraint() throws RecognitionException {
        StarqlParser.hvgAndConstraint_return retval = new StarqlParser.hvgAndConstraint_return();
        retval.start = input.LT(1);
        int hvgAndConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token AND170=null;
        StarqlParser.hvgConstraint_return hvgConstraint169 = null;

        StarqlParser.hvgAndConstraint_return hvgAndConstraint171 = null;


        Object AND170_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:224:5: ( hvgConstraint ( AND hvgAndConstraint )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:224:8: hvgConstraint ( AND hvgAndConstraint )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_hvgConstraint_in_hvgAndConstraint1495);
            hvgConstraint169=hvgConstraint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgConstraint169.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:224:22: ( AND hvgAndConstraint )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==AND) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred45_Starql()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:224:23: AND hvgAndConstraint
            	    {
            	    AND170=(Token)match(input,AND,FOLLOW_AND_in_hvgAndConstraint1498); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND170_tree = (Object)adaptor.create(AND170);
            	    root_0 = (Object)adaptor.becomeRoot(AND170_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_hvgAndConstraint_in_hvgAndConstraint1501);
            	    hvgAndConstraint171=hvgAndConstraint();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgAndConstraint171.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, hvgAndConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgAndConstraint"

    public static class andLogical_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andLogical"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:231:1: andLogical : valueLogical ( AND andLogical )* ;
    public final StarqlParser.andLogical_return andLogical() throws RecognitionException {
        StarqlParser.andLogical_return retval = new StarqlParser.andLogical_return();
        retval.start = input.LT(1);
        int andLogical_StartIndex = input.index();
        Object root_0 = null;

        Token AND173=null;
        StarqlParser.valueLogical_return valueLogical172 = null;

        StarqlParser.andLogical_return andLogical174 = null;


        Object AND173_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:232:5: ( valueLogical ( AND andLogical )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:232:7: valueLogical ( AND andLogical )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_valueLogical_in_andLogical1533);
            valueLogical172=valueLogical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, valueLogical172.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:232:20: ( AND andLogical )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==AND) ) {
                    int LA42_1 = input.LA(2);

                    if ( (synpred46_Starql()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:232:21: AND andLogical
            	    {
            	    AND173=(Token)match(input,AND,FOLLOW_AND_in_andLogical1536); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND173_tree = (Object)adaptor.create(AND173);
            	    root_0 = (Object)adaptor.becomeRoot(AND173_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andLogical_in_andLogical1539);
            	    andLogical174=andLogical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andLogical174.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, andLogical_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andLogical"

    public static class orLogical_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orLogical"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:239:1: orLogical : andLogical ( OR orLogical )* ;
    public final StarqlParser.orLogical_return orLogical() throws RecognitionException {
        StarqlParser.orLogical_return retval = new StarqlParser.orLogical_return();
        retval.start = input.LT(1);
        int orLogical_StartIndex = input.index();
        Object root_0 = null;

        Token OR176=null;
        StarqlParser.andLogical_return andLogical175 = null;

        StarqlParser.orLogical_return orLogical177 = null;


        Object OR176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:240:5: ( andLogical ( OR orLogical )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:240:10: andLogical ( OR orLogical )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andLogical_in_orLogical1570);
            andLogical175=andLogical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andLogical175.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:240:21: ( OR orLogical )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==OR) ) {
                    int LA43_2 = input.LA(2);

                    if ( (synpred47_Starql()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:240:22: OR orLogical
            	    {
            	    OR176=(Token)match(input,OR,FOLLOW_OR_in_orLogical1573); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR176_tree = (Object)adaptor.create(OR176);
            	    root_0 = (Object)adaptor.becomeRoot(OR176_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_orLogical_in_orLogical1576);
            	    orLogical177=orLogical();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, orLogical177.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, orLogical_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "orLogical"

    public static class hvgAt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgAt"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:243:1: hvgAt : ( hvgIndAt | hvgValAt );
    public final StarqlParser.hvgAt_return hvgAt() throws RecognitionException {
        StarqlParser.hvgAt_return retval = new StarqlParser.hvgAt_return();
        retval.start = input.LT(1);
        int hvgAt_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.hvgIndAt_return hvgIndAt178 = null;

        StarqlParser.hvgValAt_return hvgValAt179 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:244:3: ( hvgIndAt | hvgValAt )
            int alt44=2;
            switch ( input.LA(1) ) {
            case ASTERISK:
            case GRAPH:
                {
                alt44=1;
                }
                break;
            case VAR_VALUE:
                {
                int LA44_2 = input.LA(2);

                if ( ((LA44_2>=PNAME_NS && LA44_2<=IRI_REF)||LA44_2==OPEN_BRACE||(LA44_2>=A && LA44_2<=VAR_INDEX)||LA44_2==PNAME_LN) ) {
                    alt44=1;
                }
                else if ( (LA44_2==EOF||LA44_2==CREATE||LA44_2==CLOSE_BRACE||(LA44_2>=LESS && LA44_2<=GREATER)||LA44_2==EQUAL||(LA44_2>=GROUP && LA44_2<=HAVING)||(LA44_2>=OR && LA44_2<=AND)||LA44_2==THEN||(LA44_2>=NOT_EQUAL && LA44_2<=GREATER_EQUAL)) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case VAR_INDEX:
                {
                int LA44_3 = input.LA(2);

                if ( ((LA44_3>=PNAME_NS && LA44_3<=IRI_REF)||LA44_3==OPEN_BRACE||(LA44_3>=A && LA44_3<=VAR_INDEX)||LA44_3==PNAME_LN) ) {
                    alt44=1;
                }
                else if ( (LA44_3==EOF||LA44_3==CREATE||LA44_3==CLOSE_BRACE||(LA44_3>=LESS && LA44_3<=GREATER)||LA44_3==EQUAL||(LA44_3>=GROUP && LA44_3<=HAVING)||(LA44_3>=OR && LA44_3<=AND)||LA44_3==THEN||(LA44_3>=NOT_EQUAL && LA44_3<=GREATER_EQUAL)) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 3, input);

                    throw nvae;
                }
                }
                break;
            case PNAME_NS:
            case PNAME_LN:
                {
                int LA44_4 = input.LA(2);

                if ( (LA44_4==EOF||LA44_4==CREATE||LA44_4==CLOSE_BRACE||(LA44_4>=LESS && LA44_4<=GREATER)||LA44_4==EQUAL||(LA44_4>=GROUP && LA44_4<=HAVING)||(LA44_4>=OR && LA44_4<=AND)||LA44_4==THEN||(LA44_4>=NOT_EQUAL && LA44_4<=GREATER_EQUAL)) ) {
                    alt44=2;
                }
                else if ( ((LA44_4>=PNAME_NS && LA44_4<=IRI_REF)||(LA44_4>=A && LA44_4<=VAR_INDEX)||LA44_4==PNAME_LN) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 4, input);

                    throw nvae;
                }
                }
                break;
            case IRI_REF:
                {
                int LA44_5 = input.LA(2);

                if ( ((LA44_5>=PNAME_NS && LA44_5<=IRI_REF)||(LA44_5>=A && LA44_5<=VAR_INDEX)||LA44_5==PNAME_LN) ) {
                    alt44=1;
                }
                else if ( (LA44_5==EOF||LA44_5==CREATE||LA44_5==CLOSE_BRACE||(LA44_5>=LESS && LA44_5<=GREATER)||LA44_5==EQUAL||(LA44_5>=GROUP && LA44_5<=HAVING)||(LA44_5>=OR && LA44_5<=AND)||LA44_5==THEN||(LA44_5>=NOT_EQUAL && LA44_5<=GREATER_EQUAL)) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case IDENT:
            case OPEN_BRACE:
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
                {
                alt44=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:244:5: hvgIndAt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hvgIndAt_in_hvgAt1597);
                    hvgIndAt178=hvgIndAt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgIndAt178.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:245:5: hvgValAt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hvgValAt_in_hvgAt1603);
                    hvgValAt179=hvgValAt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgValAt179.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, hvgAt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgAt"

    public static class hvgConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgConstraint"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:248:1: hvgConstraint : ( hvgAt | operatorDef | forAll | existsFunction | NOT brackettedConstraint | brackettedConstraint );
    public final StarqlParser.hvgConstraint_return hvgConstraint() throws RecognitionException {
        StarqlParser.hvgConstraint_return retval = new StarqlParser.hvgConstraint_return();
        retval.start = input.LT(1);
        int hvgConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token NOT184=null;
        StarqlParser.hvgAt_return hvgAt180 = null;

        StarqlParser.operatorDef_return operatorDef181 = null;

        StarqlParser.forAll_return forAll182 = null;

        StarqlParser.existsFunction_return existsFunction183 = null;

        StarqlParser.brackettedConstraint_return brackettedConstraint185 = null;

        StarqlParser.brackettedConstraint_return brackettedConstraint186 = null;


        Object NOT184_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:249:5: ( hvgAt | operatorDef | forAll | existsFunction | NOT brackettedConstraint | brackettedConstraint )
            int alt45=6;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:249:7: hvgAt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hvgAt_in_hvgConstraint1621);
                    hvgAt180=hvgAt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hvgAt180.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:250:7: operatorDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operatorDef_in_hvgConstraint1629);
                    operatorDef181=operatorDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operatorDef181.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:251:7: forAll
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forAll_in_hvgConstraint1637);
                    forAll182=forAll();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forAll182.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:252:7: existsFunction
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_existsFunction_in_hvgConstraint1645);
                    existsFunction183=existsFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, existsFunction183.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:253:7: NOT brackettedConstraint
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT184=(Token)match(input,NOT,FOLLOW_NOT_in_hvgConstraint1653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT184_tree = (Object)adaptor.create(NOT184);
                    adaptor.addChild(root_0, NOT184_tree);
                    }
                    pushFollow(FOLLOW_brackettedConstraint_in_hvgConstraint1655);
                    brackettedConstraint185=brackettedConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackettedConstraint185.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:254:7: brackettedConstraint
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_brackettedConstraint_in_hvgConstraint1664);
                    brackettedConstraint186=brackettedConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackettedConstraint186.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, hvgConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgConstraint"

    public static class hvgIndAt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgIndAt"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:257:1: hvgIndAt : ( GRAPH resultTime OPEN_CURLY_BRACE triplesBlock CLOSE_CURLY_BRACE -> GRAPH ^( INDEXED_TRIPLE triplesBlock ^( INDEX resultTime ) ) | starPattern -> starPattern );
    public final StarqlParser.hvgIndAt_return hvgIndAt() throws RecognitionException {
        StarqlParser.hvgIndAt_return retval = new StarqlParser.hvgIndAt_return();
        retval.start = input.LT(1);
        int hvgIndAt_StartIndex = input.index();
        Object root_0 = null;

        Token GRAPH187=null;
        Token OPEN_CURLY_BRACE189=null;
        Token CLOSE_CURLY_BRACE191=null;
        StarqlParser.resultTime_return resultTime188 = null;

        StarqlParser.triplesBlock_return triplesBlock190 = null;

        StarqlParser.starPattern_return starPattern192 = null;


        Object GRAPH187_tree=null;
        Object OPEN_CURLY_BRACE189_tree=null;
        Object CLOSE_CURLY_BRACE191_tree=null;
        RewriteRuleTokenStream stream_GRAPH=new RewriteRuleTokenStream(adaptor,"token GRAPH");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_starPattern=new RewriteRuleSubtreeStream(adaptor,"rule starPattern");
        RewriteRuleSubtreeStream stream_triplesBlock=new RewriteRuleSubtreeStream(adaptor,"rule triplesBlock");
        RewriteRuleSubtreeStream stream_resultTime=new RewriteRuleSubtreeStream(adaptor,"rule resultTime");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:258:2: ( GRAPH resultTime OPEN_CURLY_BRACE triplesBlock CLOSE_CURLY_BRACE -> GRAPH ^( INDEXED_TRIPLE triplesBlock ^( INDEX resultTime ) ) | starPattern -> starPattern )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==GRAPH) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=PNAME_NS && LA46_0<=IRI_REF)||LA46_0==ASTERISK||(LA46_0>=VAR_VALUE && LA46_0<=VAR_INDEX)||LA46_0==PNAME_LN) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:258:4: GRAPH resultTime OPEN_CURLY_BRACE triplesBlock CLOSE_CURLY_BRACE
                    {
                    GRAPH187=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_hvgIndAt1681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GRAPH.add(GRAPH187);

                    pushFollow(FOLLOW_resultTime_in_hvgIndAt1683);
                    resultTime188=resultTime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_resultTime.add(resultTime188.getTree());
                    OPEN_CURLY_BRACE189=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_hvgIndAt1685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE189);

                    pushFollow(FOLLOW_triplesBlock_in_hvgIndAt1687);
                    triplesBlock190=triplesBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_triplesBlock.add(triplesBlock190.getTree());
                    CLOSE_CURLY_BRACE191=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_hvgIndAt1689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE191);



                    // AST REWRITE
                    // elements: triplesBlock, resultTime, GRAPH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 258:69: -> GRAPH ^( INDEXED_TRIPLE triplesBlock ^( INDEX resultTime ) )
                    {
                        adaptor.addChild(root_0, stream_GRAPH.nextNode());
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:258:78: ^( INDEXED_TRIPLE triplesBlock ^( INDEX resultTime ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXED_TRIPLE, "INDEXED_TRIPLE"), root_1);

                        adaptor.addChild(root_1, stream_triplesBlock.nextTree());
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:258:108: ^( INDEX resultTime )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEX, "INDEX"), root_2);

                        adaptor.addChild(root_2, stream_resultTime.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:259:4: starPattern
                    {
                    pushFollow(FOLLOW_starPattern_in_hvgIndAt1710);
                    starPattern192=starPattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_starPattern.add(starPattern192.getTree());


                    // AST REWRITE
                    // elements: starPattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 259:16: -> starPattern
                    {
                        adaptor.addChild(root_0, stream_starPattern.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, hvgIndAt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgIndAt"

    public static class hvgValAt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgValAt"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:262:1: hvgValAt : valueLogical -> ^( LOGICAL valueLogical ) ;
    public final StarqlParser.hvgValAt_return hvgValAt() throws RecognitionException {
        StarqlParser.hvgValAt_return retval = new StarqlParser.hvgValAt_return();
        retval.start = input.LT(1);
        int hvgValAt_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.valueLogical_return valueLogical193 = null;


        RewriteRuleSubtreeStream stream_valueLogical=new RewriteRuleSubtreeStream(adaptor,"rule valueLogical");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:263:2: ( valueLogical -> ^( LOGICAL valueLogical ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:263:4: valueLogical
            {
            pushFollow(FOLLOW_valueLogical_in_hvgValAt1726);
            valueLogical193=valueLogical();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valueLogical.add(valueLogical193.getTree());


            // AST REWRITE
            // elements: valueLogical
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 263:17: -> ^( LOGICAL valueLogical )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:263:20: ^( LOGICAL valueLogical )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOGICAL, "LOGICAL"), root_1);

                adaptor.addChild(root_1, stream_valueLogical.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, hvgValAt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgValAt"

    public static class boundIndVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boundIndVar"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:266:1: boundIndVar : hvgIndAriAtom ( COMMA hvgIndAriAtom )* -> ^( BOUND_INDEXES ( hvgIndAriAtom )* ) ;
    public final StarqlParser.boundIndVar_return boundIndVar() throws RecognitionException {
        StarqlParser.boundIndVar_return retval = new StarqlParser.boundIndVar_return();
        retval.start = input.LT(1);
        int boundIndVar_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA195=null;
        StarqlParser.hvgIndAriAtom_return hvgIndAriAtom194 = null;

        StarqlParser.hvgIndAriAtom_return hvgIndAriAtom196 = null;


        Object COMMA195_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hvgIndAriAtom=new RewriteRuleSubtreeStream(adaptor,"rule hvgIndAriAtom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:267:2: ( hvgIndAriAtom ( COMMA hvgIndAriAtom )* -> ^( BOUND_INDEXES ( hvgIndAriAtom )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:267:4: hvgIndAriAtom ( COMMA hvgIndAriAtom )*
            {
            pushFollow(FOLLOW_hvgIndAriAtom_in_boundIndVar1746);
            hvgIndAriAtom194=hvgIndAriAtom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hvgIndAriAtom.add(hvgIndAriAtom194.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:267:18: ( COMMA hvgIndAriAtom )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:267:19: COMMA hvgIndAriAtom
            	    {
            	    COMMA195=(Token)match(input,COMMA,FOLLOW_COMMA_in_boundIndVar1749); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA195);

            	    pushFollow(FOLLOW_hvgIndAriAtom_in_boundIndVar1751);
            	    hvgIndAriAtom196=hvgIndAriAtom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hvgIndAriAtom.add(hvgIndAriAtom196.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);



            // AST REWRITE
            // elements: hvgIndAriAtom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 267:41: -> ^( BOUND_INDEXES ( hvgIndAriAtom )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:267:44: ^( BOUND_INDEXES ( hvgIndAriAtom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BOUND_INDEXES, "BOUND_INDEXES"), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:267:60: ( hvgIndAriAtom )*
                while ( stream_hvgIndAriAtom.hasNext() ) {
                    adaptor.addChild(root_1, stream_hvgIndAriAtom.nextTree());

                }
                stream_hvgIndAriAtom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, boundIndVar_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "boundIndVar"

    public static class boundValVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boundValVar"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:270:1: boundValVar : hvgValueAtom ( COMMA hvgValueAtom )* -> ^( BOUND_VALUES ( hvgValueAtom )* ) ;
    public final StarqlParser.boundValVar_return boundValVar() throws RecognitionException {
        StarqlParser.boundValVar_return retval = new StarqlParser.boundValVar_return();
        retval.start = input.LT(1);
        int boundValVar_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA198=null;
        StarqlParser.hvgValueAtom_return hvgValueAtom197 = null;

        StarqlParser.hvgValueAtom_return hvgValueAtom199 = null;


        Object COMMA198_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hvgValueAtom=new RewriteRuleSubtreeStream(adaptor,"rule hvgValueAtom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:271:2: ( hvgValueAtom ( COMMA hvgValueAtom )* -> ^( BOUND_VALUES ( hvgValueAtom )* ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:271:4: hvgValueAtom ( COMMA hvgValueAtom )*
            {
            pushFollow(FOLLOW_hvgValueAtom_in_boundValVar1774);
            hvgValueAtom197=hvgValueAtom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hvgValueAtom.add(hvgValueAtom197.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:271:17: ( COMMA hvgValueAtom )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:271:18: COMMA hvgValueAtom
            	    {
            	    COMMA198=(Token)match(input,COMMA,FOLLOW_COMMA_in_boundValVar1777); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA198);

            	    pushFollow(FOLLOW_hvgValueAtom_in_boundValVar1779);
            	    hvgValueAtom199=hvgValueAtom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hvgValueAtom.add(hvgValueAtom199.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);



            // AST REWRITE
            // elements: hvgValueAtom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 271:39: -> ^( BOUND_VALUES ( hvgValueAtom )* )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:271:42: ^( BOUND_VALUES ( hvgValueAtom )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BOUND_VALUES, "BOUND_VALUES"), root_1);

                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:271:57: ( hvgValueAtom )*
                while ( stream_hvgValueAtom.hasNext() ) {
                    adaptor.addChild(root_1, stream_hvgValueAtom.nextTree());

                }
                stream_hvgValueAtom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, boundValVar_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "boundValVar"

    public static class forAll_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forAll"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:279:1: forAll : FORALL boundIndVar IN seqName ( boundValVar )? OPEN_BRACE ifStatement CLOSE_BRACE -> ^( FORALL boundIndVar ^( IN seqName ) ( boundValVar )? ifStatement ) ;
    public final StarqlParser.forAll_return forAll() throws RecognitionException {
        StarqlParser.forAll_return retval = new StarqlParser.forAll_return();
        retval.start = input.LT(1);
        int forAll_StartIndex = input.index();
        Object root_0 = null;

        Token FORALL200=null;
        Token IN202=null;
        Token OPEN_BRACE205=null;
        Token CLOSE_BRACE207=null;
        StarqlParser.boundIndVar_return boundIndVar201 = null;

        StarqlParser.seqName_return seqName203 = null;

        StarqlParser.boundValVar_return boundValVar204 = null;

        StarqlParser.ifStatement_return ifStatement206 = null;


        Object FORALL200_tree=null;
        Object IN202_tree=null;
        Object OPEN_BRACE205_tree=null;
        Object CLOSE_BRACE207_tree=null;
        RewriteRuleTokenStream stream_FORALL=new RewriteRuleTokenStream(adaptor,"token FORALL");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_boundIndVar=new RewriteRuleSubtreeStream(adaptor,"rule boundIndVar");
        RewriteRuleSubtreeStream stream_boundValVar=new RewriteRuleSubtreeStream(adaptor,"rule boundValVar");
        RewriteRuleSubtreeStream stream_seqName=new RewriteRuleSubtreeStream(adaptor,"rule seqName");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:280:3: ( FORALL boundIndVar IN seqName ( boundValVar )? OPEN_BRACE ifStatement CLOSE_BRACE -> ^( FORALL boundIndVar ^( IN seqName ) ( boundValVar )? ifStatement ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:280:5: FORALL boundIndVar IN seqName ( boundValVar )? OPEN_BRACE ifStatement CLOSE_BRACE
            {
            FORALL200=(Token)match(input,FORALL,FOLLOW_FORALL_in_forAll1807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FORALL.add(FORALL200);

            pushFollow(FOLLOW_boundIndVar_in_forAll1809);
            boundIndVar201=boundIndVar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_boundIndVar.add(boundIndVar201.getTree());
            IN202=(Token)match(input,IN,FOLLOW_IN_in_forAll1811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN202);

            pushFollow(FOLLOW_seqName_in_forAll1813);
            seqName203=seqName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_seqName.add(seqName203.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:280:35: ( boundValVar )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==VAR_VALUE) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: boundValVar
                    {
                    pushFollow(FOLLOW_boundValVar_in_forAll1815);
                    boundValVar204=boundValVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boundValVar.add(boundValVar204.getTree());

                    }
                    break;

            }

            OPEN_BRACE205=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_forAll1818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE205);

            pushFollow(FOLLOW_ifStatement_in_forAll1820);
            ifStatement206=ifStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifStatement.add(ifStatement206.getTree());
            CLOSE_BRACE207=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_forAll1822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE207);



            // AST REWRITE
            // elements: IN, seqName, ifStatement, boundValVar, FORALL, boundIndVar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:83: -> ^( FORALL boundIndVar ^( IN seqName ) ( boundValVar )? ifStatement )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:280:86: ^( FORALL boundIndVar ^( IN seqName ) ( boundValVar )? ifStatement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FORALL.nextNode(), root_1);

                adaptor.addChild(root_1, stream_boundIndVar.nextTree());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:280:107: ^( IN seqName )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                adaptor.addChild(root_2, stream_seqName.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:280:121: ( boundValVar )?
                if ( stream_boundValVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_boundValVar.nextTree());

                }
                stream_boundValVar.reset();
                adaptor.addChild(root_1, stream_ifStatement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, forAll_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forAll"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:283:1: ifStatement : IF hvgConstraint THEN hvgConstraint -> ^( IF hvgConstraint ) ^( THEN hvgConstraint ) ;
    public final StarqlParser.ifStatement_return ifStatement() throws RecognitionException {
        StarqlParser.ifStatement_return retval = new StarqlParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token IF208=null;
        Token THEN210=null;
        StarqlParser.hvgConstraint_return hvgConstraint209 = null;

        StarqlParser.hvgConstraint_return hvgConstraint211 = null;


        Object IF208_tree=null;
        Object THEN210_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_hvgConstraint=new RewriteRuleSubtreeStream(adaptor,"rule hvgConstraint");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:284:2: ( IF hvgConstraint THEN hvgConstraint -> ^( IF hvgConstraint ) ^( THEN hvgConstraint ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:284:4: IF hvgConstraint THEN hvgConstraint
            {
            IF208=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF208);

            pushFollow(FOLLOW_hvgConstraint_in_ifStatement1856);
            hvgConstraint209=hvgConstraint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hvgConstraint.add(hvgConstraint209.getTree());
            THEN210=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1858); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN210);

            pushFollow(FOLLOW_hvgConstraint_in_ifStatement1860);
            hvgConstraint211=hvgConstraint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hvgConstraint.add(hvgConstraint211.getTree());


            // AST REWRITE
            // elements: hvgConstraint, IF, THEN, hvgConstraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 284:40: -> ^( IF hvgConstraint ) ^( THEN hvgConstraint )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:284:43: ^( IF hvgConstraint )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_hvgConstraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:284:63: ^( THEN hvgConstraint )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_THEN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_hvgConstraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class propertyListNotEmpty_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyListNotEmpty"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:287:1: propertyListNotEmpty : verb objectList ( SEMICOLON ( verb objectList )? )* -> ( ^( PREDICATE verb ) objectList )+ ;
    public final StarqlParser.propertyListNotEmpty_return propertyListNotEmpty() throws RecognitionException {
        StarqlParser.propertyListNotEmpty_return retval = new StarqlParser.propertyListNotEmpty_return();
        retval.start = input.LT(1);
        int propertyListNotEmpty_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON214=null;
        StarqlParser.verb_return verb212 = null;

        StarqlParser.objectList_return objectList213 = null;

        StarqlParser.verb_return verb215 = null;

        StarqlParser.objectList_return objectList216 = null;


        Object SEMICOLON214_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_verb=new RewriteRuleSubtreeStream(adaptor,"rule verb");
        RewriteRuleSubtreeStream stream_objectList=new RewriteRuleSubtreeStream(adaptor,"rule objectList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:288:5: ( verb objectList ( SEMICOLON ( verb objectList )? )* -> ( ^( PREDICATE verb ) objectList )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:288:7: verb objectList ( SEMICOLON ( verb objectList )? )*
            {
            pushFollow(FOLLOW_verb_in_propertyListNotEmpty1888);
            verb212=verb();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_verb.add(verb212.getTree());
            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty1890);
            objectList213=objectList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_objectList.add(objectList213.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:288:23: ( SEMICOLON ( verb objectList )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==SEMICOLON) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:288:24: SEMICOLON ( verb objectList )?
            	    {
            	    SEMICOLON214=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_propertyListNotEmpty1893); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON214);

            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:288:34: ( verb objectList )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( ((LA50_0>=PNAME_NS && LA50_0<=IRI_REF)||(LA50_0>=A && LA50_0<=VAR_INDEX)||LA50_0==PNAME_LN) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:288:35: verb objectList
            	            {
            	            pushFollow(FOLLOW_verb_in_propertyListNotEmpty1896);
            	            verb215=verb();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_verb.add(verb215.getTree());
            	            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty1898);
            	            objectList216=objectList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_objectList.add(objectList216.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);



            // AST REWRITE
            // elements: verb, objectList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 288:55: -> ( ^( PREDICATE verb ) objectList )+
            {
                if ( !(stream_verb.hasNext()||stream_objectList.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_verb.hasNext()||stream_objectList.hasNext() ) {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:288:59: ^( PREDICATE verb )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATE, "PREDICATE"), root_1);

                    adaptor.addChild(root_1, stream_verb.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_objectList.nextTree());

                }
                stream_verb.reset();
                stream_objectList.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, propertyListNotEmpty_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmpty"

    public static class objectList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectList"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:291:1: objectList : object ( COMMA object )* -> ( ^( OBJECT object ) )+ ;
    public final StarqlParser.objectList_return objectList() throws RecognitionException {
        StarqlParser.objectList_return retval = new StarqlParser.objectList_return();
        retval.start = input.LT(1);
        int objectList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA218=null;
        StarqlParser.object_return object217 = null;

        StarqlParser.object_return object219 = null;


        Object COMMA218_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:292:5: ( object ( COMMA object )* -> ( ^( OBJECT object ) )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:292:7: object ( COMMA object )*
            {
            pushFollow(FOLLOW_object_in_objectList1933);
            object217=object();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_object.add(object217.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:292:14: ( COMMA object )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:292:15: COMMA object
            	    {
            	    COMMA218=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectList1936); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA218);

            	    pushFollow(FOLLOW_object_in_objectList1938);
            	    object219=object();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_object.add(object219.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);



            // AST REWRITE
            // elements: object
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:30: -> ( ^( OBJECT object ) )+
            {
                if ( !(stream_object.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_object.hasNext() ) {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:292:33: ^( OBJECT object )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECT, "OBJECT"), root_1);

                    adaptor.addChild(root_1, stream_object.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_object.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, objectList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objectList"

    public static class verb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verb"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:295:1: verb : ( var | iriRef | A );
    public final StarqlParser.verb_return verb() throws RecognitionException {
        StarqlParser.verb_return retval = new StarqlParser.verb_return();
        retval.start = input.LT(1);
        int verb_StartIndex = input.index();
        Object root_0 = null;

        Token A222=null;
        StarqlParser.var_return var220 = null;

        StarqlParser.iriRef_return iriRef221 = null;


        Object A222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:296:5: ( var | iriRef | A )
            int alt53=3;
            switch ( input.LA(1) ) {
            case VAR_VALUE:
            case VAR_INDEX:
                {
                alt53=1;
                }
                break;
            case PNAME_NS:
            case IRI_REF:
            case PNAME_LN:
                {
                alt53=2;
                }
                break;
            case A:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:296:7: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_verb1966);
                    var220=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var220.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:296:13: iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRef_in_verb1970);
                    iriRef221=iriRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iriRef221.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:297:7: A
                    {
                    root_0 = (Object)adaptor.nil();

                    A222=(Token)match(input,A,FOLLOW_A_in_verb1978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A222_tree = (Object)adaptor.create(A222);
                    adaptor.addChild(root_0, A222_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, verb_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "verb"

    public static class subject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subject"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:300:1: subject : ( var | iriRef );
    public final StarqlParser.subject_return subject() throws RecognitionException {
        StarqlParser.subject_return retval = new StarqlParser.subject_return();
        retval.start = input.LT(1);
        int subject_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.var_return var223 = null;

        StarqlParser.iriRef_return iriRef224 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:301:2: ( var | iriRef )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=VAR_VALUE && LA54_0<=VAR_INDEX)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=PNAME_NS && LA54_0<=IRI_REF)||LA54_0==PNAME_LN) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:301:4: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_subject1994);
                    var223=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var223.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:301:10: iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRef_in_subject1998);
                    iriRef224=iriRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iriRef224.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, subject_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "subject"

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:304:1: object : starqlVar ;
    public final StarqlParser.object_return object() throws RecognitionException {
        StarqlParser.object_return retval = new StarqlParser.object_return();
        retval.start = input.LT(1);
        int object_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.starqlVar_return starqlVar225 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:305:5: ( starqlVar )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:305:7: starqlVar
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_starqlVar_in_object2012);
            starqlVar225=starqlVar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, starqlVar225.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, object_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "object"

    public static class var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:308:1: var : ( hvgValueAtom -> ^( VALUE_ATOM hvgValueAtom ) | hvgIndAriAtom -> ^( INDEX_ARITH hvgIndAriAtom ) );
    public final StarqlParser.var_return var() throws RecognitionException {
        StarqlParser.var_return retval = new StarqlParser.var_return();
        retval.start = input.LT(1);
        int var_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.hvgValueAtom_return hvgValueAtom226 = null;

        StarqlParser.hvgIndAriAtom_return hvgIndAriAtom227 = null;


        RewriteRuleSubtreeStream stream_hvgValueAtom=new RewriteRuleSubtreeStream(adaptor,"rule hvgValueAtom");
        RewriteRuleSubtreeStream stream_hvgIndAriAtom=new RewriteRuleSubtreeStream(adaptor,"rule hvgIndAriAtom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:309:5: ( hvgValueAtom -> ^( VALUE_ATOM hvgValueAtom ) | hvgIndAriAtom -> ^( INDEX_ARITH hvgIndAriAtom ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==VAR_VALUE) ) {
                alt55=1;
            }
            else if ( (LA55_0==VAR_INDEX) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:309:7: hvgValueAtom
                    {
                    pushFollow(FOLLOW_hvgValueAtom_in_var2029);
                    hvgValueAtom226=hvgValueAtom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hvgValueAtom.add(hvgValueAtom226.getTree());


                    // AST REWRITE
                    // elements: hvgValueAtom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:21: -> ^( VALUE_ATOM hvgValueAtom )
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:309:24: ^( VALUE_ATOM hvgValueAtom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VALUE_ATOM, "VALUE_ATOM"), root_1);

                        adaptor.addChild(root_1, stream_hvgValueAtom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:310:7: hvgIndAriAtom
                    {
                    pushFollow(FOLLOW_hvgIndAriAtom_in_var2047);
                    hvgIndAriAtom227=hvgIndAriAtom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hvgIndAriAtom.add(hvgIndAriAtom227.getTree());


                    // AST REWRITE
                    // elements: hvgIndAriAtom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:21: -> ^( INDEX_ARITH hvgIndAriAtom )
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:310:24: ^( INDEX_ARITH hvgIndAriAtom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEX_ARITH, "INDEX_ARITH"), root_1);

                        adaptor.addChild(root_1, stream_hvgIndAriAtom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, var_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "var"

    public static class hvgValueAtom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgValueAtom"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:313:1: hvgValueAtom : VAR_VALUE ;
    public final StarqlParser.hvgValueAtom_return hvgValueAtom() throws RecognitionException {
        StarqlParser.hvgValueAtom_return retval = new StarqlParser.hvgValueAtom_return();
        retval.start = input.LT(1);
        int hvgValueAtom_StartIndex = input.index();
        Object root_0 = null;

        Token VAR_VALUE228=null;

        Object VAR_VALUE228_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:314:2: ( VAR_VALUE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:314:4: VAR_VALUE
            {
            root_0 = (Object)adaptor.nil();

            VAR_VALUE228=(Token)match(input,VAR_VALUE,FOLLOW_VAR_VALUE_in_hvgValueAtom2069); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_VALUE228_tree = (Object)adaptor.create(VAR_VALUE228);
            adaptor.addChild(root_0, VAR_VALUE228_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, hvgValueAtom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgValueAtom"

    public static class hvgIndAriAtom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvgIndAriAtom"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:317:1: hvgIndAriAtom : VAR_INDEX ;
    public final StarqlParser.hvgIndAriAtom_return hvgIndAriAtom() throws RecognitionException {
        StarqlParser.hvgIndAriAtom_return retval = new StarqlParser.hvgIndAriAtom_return();
        retval.start = input.LT(1);
        int hvgIndAriAtom_StartIndex = input.index();
        Object root_0 = null;

        Token VAR_INDEX229=null;

        Object VAR_INDEX229_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:318:2: ( VAR_INDEX )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:318:4: VAR_INDEX
            {
            root_0 = (Object)adaptor.nil();

            VAR_INDEX229=(Token)match(input,VAR_INDEX,FOLLOW_VAR_INDEX_in_hvgIndAriAtom2081); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_INDEX229_tree = (Object)adaptor.create(VAR_INDEX229);
            adaptor.addChild(root_0, VAR_INDEX229_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, hvgIndAriAtom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "hvgIndAriAtom"

    public static class valueLogical_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valueLogical"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:321:1: valueLogical : (n1= primaryExpression -> $n1) ( ( EQUAL n2= primaryExpression -> ^( EQUAL primaryExpression $n2) ) | ( NOT_EQUAL n3= primaryExpression -> ^( NOT_EQUAL primaryExpression $n3) ) | ( LESS n4= primaryExpression -> ^( LESS primaryExpression $n4) ) | ( GREATER n5= primaryExpression -> ^( GREATER primaryExpression $n5) ) | ( LESS_EQUAL n6= primaryExpression -> ^( LESS_EQUAL primaryExpression $n6) ) | ( GREATER_EQUAL n7= primaryExpression -> ^( GREATER_EQUAL primaryExpression $n7) ) )? ;
    public final StarqlParser.valueLogical_return valueLogical() throws RecognitionException {
        StarqlParser.valueLogical_return retval = new StarqlParser.valueLogical_return();
        retval.start = input.LT(1);
        int valueLogical_StartIndex = input.index();
        Object root_0 = null;

        Token EQUAL230=null;
        Token NOT_EQUAL231=null;
        Token LESS232=null;
        Token GREATER233=null;
        Token LESS_EQUAL234=null;
        Token GREATER_EQUAL235=null;
        StarqlParser.primaryExpression_return n1 = null;

        StarqlParser.primaryExpression_return n2 = null;

        StarqlParser.primaryExpression_return n3 = null;

        StarqlParser.primaryExpression_return n4 = null;

        StarqlParser.primaryExpression_return n5 = null;

        StarqlParser.primaryExpression_return n6 = null;

        StarqlParser.primaryExpression_return n7 = null;


        Object EQUAL230_tree=null;
        Object NOT_EQUAL231_tree=null;
        Object LESS232_tree=null;
        Object GREATER233_tree=null;
        Object LESS_EQUAL234_tree=null;
        Object GREATER_EQUAL235_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_LESS_EQUAL=new RewriteRuleTokenStream(adaptor,"token LESS_EQUAL");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_GREATER_EQUAL=new RewriteRuleTokenStream(adaptor,"token GREATER_EQUAL");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:322:5: ( (n1= primaryExpression -> $n1) ( ( EQUAL n2= primaryExpression -> ^( EQUAL primaryExpression $n2) ) | ( NOT_EQUAL n3= primaryExpression -> ^( NOT_EQUAL primaryExpression $n3) ) | ( LESS n4= primaryExpression -> ^( LESS primaryExpression $n4) ) | ( GREATER n5= primaryExpression -> ^( GREATER primaryExpression $n5) ) | ( LESS_EQUAL n6= primaryExpression -> ^( LESS_EQUAL primaryExpression $n6) ) | ( GREATER_EQUAL n7= primaryExpression -> ^( GREATER_EQUAL primaryExpression $n7) ) )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:322:7: (n1= primaryExpression -> $n1) ( ( EQUAL n2= primaryExpression -> ^( EQUAL primaryExpression $n2) ) | ( NOT_EQUAL n3= primaryExpression -> ^( NOT_EQUAL primaryExpression $n3) ) | ( LESS n4= primaryExpression -> ^( LESS primaryExpression $n4) ) | ( GREATER n5= primaryExpression -> ^( GREATER primaryExpression $n5) ) | ( LESS_EQUAL n6= primaryExpression -> ^( LESS_EQUAL primaryExpression $n6) ) | ( GREATER_EQUAL n7= primaryExpression -> ^( GREATER_EQUAL primaryExpression $n7) ) )?
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:322:7: (n1= primaryExpression -> $n1)
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:322:8: n1= primaryExpression
            {
            pushFollow(FOLLOW_primaryExpression_in_valueLogical2098);
            n1=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primaryExpression.add(n1.getTree());


            // AST REWRITE
            // elements: n1
            // token labels: 
            // rule labels: n1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 322:29: -> $n1
            {
                adaptor.addChild(root_0, stream_n1.nextTree());

            }

            retval.tree = root_0;}
            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:322:37: ( ( EQUAL n2= primaryExpression -> ^( EQUAL primaryExpression $n2) ) | ( NOT_EQUAL n3= primaryExpression -> ^( NOT_EQUAL primaryExpression $n3) ) | ( LESS n4= primaryExpression -> ^( LESS primaryExpression $n4) ) | ( GREATER n5= primaryExpression -> ^( GREATER primaryExpression $n5) ) | ( LESS_EQUAL n6= primaryExpression -> ^( LESS_EQUAL primaryExpression $n6) ) | ( GREATER_EQUAL n7= primaryExpression -> ^( GREATER_EQUAL primaryExpression $n7) ) )?
            int alt56=7;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt56=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt56=2;
                    }
                    break;
                case LESS:
                    {
                    alt56=3;
                    }
                    break;
                case GREATER:
                    {
                    alt56=4;
                    }
                    break;
                case LESS_EQUAL:
                    {
                    alt56=5;
                    }
                    break;
                case GREATER_EQUAL:
                    {
                    alt56=6;
                    }
                    break;
            }

            switch (alt56) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:323:14: ( EQUAL n2= primaryExpression -> ^( EQUAL primaryExpression $n2) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:323:14: ( EQUAL n2= primaryExpression -> ^( EQUAL primaryExpression $n2) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:323:15: EQUAL n2= primaryExpression
                    {
                    EQUAL230=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_valueLogical2122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL230);

                    pushFollow(FOLLOW_primaryExpression_in_valueLogical2126);
                    n2=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(n2.getTree());


                    // AST REWRITE
                    // elements: n2, EQUAL, primaryExpression
                    // token labels: 
                    // rule labels: retval, n2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:42: -> ^( EQUAL primaryExpression $n2)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:323:45: ^( EQUAL primaryExpression $n2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_n2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:324:40: ( NOT_EQUAL n3= primaryExpression -> ^( NOT_EQUAL primaryExpression $n3) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:324:40: ( NOT_EQUAL n3= primaryExpression -> ^( NOT_EQUAL primaryExpression $n3) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:324:41: NOT_EQUAL n3= primaryExpression
                    {
                    NOT_EQUAL231=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_valueLogical2183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT_EQUAL.add(NOT_EQUAL231);

                    pushFollow(FOLLOW_primaryExpression_in_valueLogical2187);
                    n3=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(n3.getTree());


                    // AST REWRITE
                    // elements: primaryExpression, NOT_EQUAL, n3
                    // token labels: 
                    // rule labels: retval, n3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n3=new RewriteRuleSubtreeStream(adaptor,"rule n3",n3!=null?n3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:72: -> ^( NOT_EQUAL primaryExpression $n3)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:324:75: ^( NOT_EQUAL primaryExpression $n3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NOT_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_n3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:325:40: ( LESS n4= primaryExpression -> ^( LESS primaryExpression $n4) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:325:40: ( LESS n4= primaryExpression -> ^( LESS primaryExpression $n4) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:325:41: LESS n4= primaryExpression
                    {
                    LESS232=(Token)match(input,LESS,FOLLOW_LESS_in_valueLogical2242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LESS.add(LESS232);

                    pushFollow(FOLLOW_primaryExpression_in_valueLogical2246);
                    n4=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(n4.getTree());


                    // AST REWRITE
                    // elements: primaryExpression, LESS, n4
                    // token labels: 
                    // rule labels: retval, n4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n4=new RewriteRuleSubtreeStream(adaptor,"rule n4",n4!=null?n4.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:67: -> ^( LESS primaryExpression $n4)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:325:70: ^( LESS primaryExpression $n4)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LESS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_n4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:326:40: ( GREATER n5= primaryExpression -> ^( GREATER primaryExpression $n5) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:326:40: ( GREATER n5= primaryExpression -> ^( GREATER primaryExpression $n5) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:326:41: GREATER n5= primaryExpression
                    {
                    GREATER233=(Token)match(input,GREATER,FOLLOW_GREATER_in_valueLogical2301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GREATER.add(GREATER233);

                    pushFollow(FOLLOW_primaryExpression_in_valueLogical2305);
                    n5=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(n5.getTree());


                    // AST REWRITE
                    // elements: GREATER, primaryExpression, n5
                    // token labels: 
                    // rule labels: retval, n5
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n5=new RewriteRuleSubtreeStream(adaptor,"rule n5",n5!=null?n5.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 326:70: -> ^( GREATER primaryExpression $n5)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:326:73: ^( GREATER primaryExpression $n5)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_GREATER.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_n5.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:327:40: ( LESS_EQUAL n6= primaryExpression -> ^( LESS_EQUAL primaryExpression $n6) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:327:40: ( LESS_EQUAL n6= primaryExpression -> ^( LESS_EQUAL primaryExpression $n6) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:327:41: LESS_EQUAL n6= primaryExpression
                    {
                    LESS_EQUAL234=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_valueLogical2359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LESS_EQUAL.add(LESS_EQUAL234);

                    pushFollow(FOLLOW_primaryExpression_in_valueLogical2363);
                    n6=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(n6.getTree());


                    // AST REWRITE
                    // elements: primaryExpression, LESS_EQUAL, n6
                    // token labels: 
                    // rule labels: retval, n6
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n6=new RewriteRuleSubtreeStream(adaptor,"rule n6",n6!=null?n6.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:73: -> ^( LESS_EQUAL primaryExpression $n6)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:327:76: ^( LESS_EQUAL primaryExpression $n6)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LESS_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_n6.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:328:40: ( GREATER_EQUAL n7= primaryExpression -> ^( GREATER_EQUAL primaryExpression $n7) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:328:40: ( GREATER_EQUAL n7= primaryExpression -> ^( GREATER_EQUAL primaryExpression $n7) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:328:41: GREATER_EQUAL n7= primaryExpression
                    {
                    GREATER_EQUAL235=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_valueLogical2417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GREATER_EQUAL.add(GREATER_EQUAL235);

                    pushFollow(FOLLOW_primaryExpression_in_valueLogical2421);
                    n7=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(n7.getTree());


                    // AST REWRITE
                    // elements: GREATER_EQUAL, primaryExpression, n7
                    // token labels: 
                    // rule labels: retval, n7
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n7=new RewriteRuleSubtreeStream(adaptor,"rule n7",n7!=null?n7.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:76: -> ^( GREATER_EQUAL primaryExpression $n7)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:328:79: ^( GREATER_EQUAL primaryExpression $n7)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_GREATER_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_n7.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, valueLogical_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "valueLogical"

    public static class multiplyExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplyExpression"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:343:1: multiplyExpression : ( (c1= primaryExpression -> $c1) ( MINUS c2= primaryExpression -> ^( MINUS $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( PLUS c2= primaryExpression -> ^( PLUS $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( DIVIDE c2= primaryExpression -> ^( DIVIDE $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( ASTERISK c2= primaryExpression -> ^( ASTERISK $multiplyExpression $c2) ) );
    public final StarqlParser.multiplyExpression_return multiplyExpression() throws RecognitionException {
        StarqlParser.multiplyExpression_return retval = new StarqlParser.multiplyExpression_return();
        retval.start = input.LT(1);
        int multiplyExpression_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS236=null;
        Token PLUS237=null;
        Token DIVIDE238=null;
        Token ASTERISK239=null;
        StarqlParser.primaryExpression_return c1 = null;

        StarqlParser.primaryExpression_return c2 = null;


        Object MINUS236_tree=null;
        Object PLUS237_tree=null;
        Object DIVIDE238_tree=null;
        Object ASTERISK239_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:5: ( (c1= primaryExpression -> $c1) ( MINUS c2= primaryExpression -> ^( MINUS $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( PLUS c2= primaryExpression -> ^( PLUS $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( DIVIDE c2= primaryExpression -> ^( DIVIDE $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( ASTERISK c2= primaryExpression -> ^( ASTERISK $multiplyExpression $c2) ) )
            int alt57=4;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:7: (c1= primaryExpression -> $c1) ( MINUS c2= primaryExpression -> ^( MINUS $multiplyExpression $c2) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:7: (c1= primaryExpression -> $c1)
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:8: c1= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2559);
                    c1=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c1.getTree());


                    // AST REWRITE
                    // elements: c1
                    // token labels: 
                    // rule labels: retval, c1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:29: -> $c1
                    {
                        adaptor.addChild(root_0, stream_c1.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:37: ( MINUS c2= primaryExpression -> ^( MINUS $multiplyExpression $c2) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:38: MINUS c2= primaryExpression
                    {
                    MINUS236=(Token)match(input,MINUS,FOLLOW_MINUS_in_multiplyExpression2568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS236);

                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2572);
                    c2=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c2.getTree());


                    // AST REWRITE
                    // elements: multiplyExpression, MINUS, c2
                    // token labels: 
                    // rule labels: retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:65: -> ^( MINUS $multiplyExpression $c2)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:68: ^( MINUS $multiplyExpression $c2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_MINUS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_c2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:7: (c1= primaryExpression -> $c1) ( PLUS c2= primaryExpression -> ^( PLUS $multiplyExpression $c2) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:7: (c1= primaryExpression -> $c1)
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:8: c1= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2596);
                    c1=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c1.getTree());


                    // AST REWRITE
                    // elements: c1
                    // token labels: 
                    // rule labels: retval, c1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:29: -> $c1
                    {
                        adaptor.addChild(root_0, stream_c1.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:37: ( PLUS c2= primaryExpression -> ^( PLUS $multiplyExpression $c2) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:38: PLUS c2= primaryExpression
                    {
                    PLUS237=(Token)match(input,PLUS,FOLLOW_PLUS_in_multiplyExpression2605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS237);

                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2609);
                    c2=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c2.getTree());


                    // AST REWRITE
                    // elements: c2, PLUS, multiplyExpression
                    // token labels: 
                    // rule labels: retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:64: -> ^( PLUS $multiplyExpression $c2)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:67: ^( PLUS $multiplyExpression $c2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PLUS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_c2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:7: (c1= primaryExpression -> $c1) ( DIVIDE c2= primaryExpression -> ^( DIVIDE $multiplyExpression $c2) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:7: (c1= primaryExpression -> $c1)
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:8: c1= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2633);
                    c1=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c1.getTree());


                    // AST REWRITE
                    // elements: c1
                    // token labels: 
                    // rule labels: retval, c1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:29: -> $c1
                    {
                        adaptor.addChild(root_0, stream_c1.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:37: ( DIVIDE c2= primaryExpression -> ^( DIVIDE $multiplyExpression $c2) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:38: DIVIDE c2= primaryExpression
                    {
                    DIVIDE238=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplyExpression2642); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE238);

                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2646);
                    c2=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c2.getTree());


                    // AST REWRITE
                    // elements: c2, DIVIDE, multiplyExpression
                    // token labels: 
                    // rule labels: retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:66: -> ^( DIVIDE $multiplyExpression $c2)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:69: ^( DIVIDE $multiplyExpression $c2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DIVIDE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_c2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:347:7: (c1= primaryExpression -> $c1) ( ASTERISK c2= primaryExpression -> ^( ASTERISK $multiplyExpression $c2) )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:347:7: (c1= primaryExpression -> $c1)
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:347:8: c1= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2670);
                    c1=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c1.getTree());


                    // AST REWRITE
                    // elements: c1
                    // token labels: 
                    // rule labels: retval, c1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:29: -> $c1
                    {
                        adaptor.addChild(root_0, stream_c1.nextTree());

                    }

                    retval.tree = root_0;}
                    }

                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:347:37: ( ASTERISK c2= primaryExpression -> ^( ASTERISK $multiplyExpression $c2) )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:347:38: ASTERISK c2= primaryExpression
                    {
                    ASTERISK239=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_multiplyExpression2679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK239);

                    pushFollow(FOLLOW_primaryExpression_in_multiplyExpression2683);
                    c2=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(c2.getTree());


                    // AST REWRITE
                    // elements: c2, ASTERISK, multiplyExpression
                    // token labels: 
                    // rule labels: retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:68: -> ^( ASTERISK $multiplyExpression $c2)
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:347:71: ^( ASTERISK $multiplyExpression $c2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ASTERISK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_c2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, multiplyExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplyExpression"

    public static class starqlVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "starqlVar"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:351:1: starqlVar : ( iriRef | rdfLiteral | numericLiteral | var | aggregate );
    public final StarqlParser.starqlVar_return starqlVar() throws RecognitionException {
        StarqlParser.starqlVar_return retval = new StarqlParser.starqlVar_return();
        retval.start = input.LT(1);
        int starqlVar_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.iriRef_return iriRef240 = null;

        StarqlParser.rdfLiteral_return rdfLiteral241 = null;

        StarqlParser.numericLiteral_return numericLiteral242 = null;

        StarqlParser.var_return var243 = null;

        StarqlParser.aggregate_return aggregate244 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:352:5: ( iriRef | rdfLiteral | numericLiteral | var | aggregate )
            int alt58=5;
            switch ( input.LA(1) ) {
            case PNAME_NS:
            case IRI_REF:
            case PNAME_LN:
                {
                alt58=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt58=2;
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
                alt58=3;
                }
                break;
            case VAR_VALUE:
            case VAR_INDEX:
                {
                alt58=4;
                }
                break;
            case IDENT:
                {
                alt58=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:352:7: iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRef_in_starqlVar2723);
                    iriRef240=iriRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iriRef240.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:353:7: rdfLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rdfLiteral_in_starqlVar2731);
                    rdfLiteral241=rdfLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rdfLiteral241.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:354:7: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_starqlVar2739);
                    numericLiteral242=numericLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteral242.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:355:7: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_starqlVar2748);
                    var243=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var243.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:356:7: aggregate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_aggregate_in_starqlVar2756);
                    aggregate244=aggregate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, starqlVar_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "starqlVar"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:359:1: primaryExpression : ( starqlVar | OPEN_BRACE multiplyExpression CLOSE_BRACE -> ^( EXPRESSION_LIST multiplyExpression ) | ABS OPEN_BRACE multiplyExpression CLOSE_BRACE -> ^( ABS multiplyExpression ) );
    public final StarqlParser.primaryExpression_return primaryExpression() throws RecognitionException {
        StarqlParser.primaryExpression_return retval = new StarqlParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        Object root_0 = null;

        Token OPEN_BRACE246=null;
        Token CLOSE_BRACE248=null;
        Token ABS249=null;
        Token OPEN_BRACE250=null;
        Token CLOSE_BRACE252=null;
        StarqlParser.starqlVar_return starqlVar245 = null;

        StarqlParser.multiplyExpression_return multiplyExpression247 = null;

        StarqlParser.multiplyExpression_return multiplyExpression251 = null;


        Object OPEN_BRACE246_tree=null;
        Object CLOSE_BRACE248_tree=null;
        Object ABS249_tree=null;
        Object OPEN_BRACE250_tree=null;
        Object CLOSE_BRACE252_tree=null;
        RewriteRuleTokenStream stream_ABS=new RewriteRuleTokenStream(adaptor,"token ABS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_multiplyExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplyExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:360:5: ( starqlVar | OPEN_BRACE multiplyExpression CLOSE_BRACE -> ^( EXPRESSION_LIST multiplyExpression ) | ABS OPEN_BRACE multiplyExpression CLOSE_BRACE -> ^( ABS multiplyExpression ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case PNAME_NS:
            case IRI_REF:
            case IDENT:
            case VAR_VALUE:
            case VAR_INDEX:
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
                alt59=1;
                }
                break;
            case OPEN_BRACE:
                {
                alt59=2;
                }
                break;
            case ABS:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:360:7: starqlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_starqlVar_in_primaryExpression2777);
                    starqlVar245=starqlVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, starqlVar245.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:361:7: OPEN_BRACE multiplyExpression CLOSE_BRACE
                    {
                    OPEN_BRACE246=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_primaryExpression2785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE246);

                    pushFollow(FOLLOW_multiplyExpression_in_primaryExpression2787);
                    multiplyExpression247=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multiplyExpression.add(multiplyExpression247.getTree());
                    CLOSE_BRACE248=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_primaryExpression2789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE248);



                    // AST REWRITE
                    // elements: multiplyExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:49: -> ^( EXPRESSION_LIST multiplyExpression )
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:361:52: ^( EXPRESSION_LIST multiplyExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION_LIST, "EXPRESSION_LIST"), root_1);

                        adaptor.addChild(root_1, stream_multiplyExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:362:7: ABS OPEN_BRACE multiplyExpression CLOSE_BRACE
                    {
                    ABS249=(Token)match(input,ABS,FOLLOW_ABS_in_primaryExpression2805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ABS.add(ABS249);

                    OPEN_BRACE250=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_primaryExpression2807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE250);

                    pushFollow(FOLLOW_multiplyExpression_in_primaryExpression2809);
                    multiplyExpression251=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multiplyExpression.add(multiplyExpression251.getTree());
                    CLOSE_BRACE252=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_primaryExpression2811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE252);



                    // AST REWRITE
                    // elements: ABS, multiplyExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:53: -> ^( ABS multiplyExpression )
                    {
                        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:362:56: ^( ABS multiplyExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ABS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_multiplyExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class existsFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "existsFunction"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:365:1: existsFunction : EXISTS boundIndVar IN seqName ( boundValVar )? OPEN_BRACE hvgConstraint CLOSE_BRACE -> ^( EXISTS boundIndVar ^( IN seqName ) ( boundValVar )? hvgConstraint ) ;
    public final StarqlParser.existsFunction_return existsFunction() throws RecognitionException {
        StarqlParser.existsFunction_return retval = new StarqlParser.existsFunction_return();
        retval.start = input.LT(1);
        int existsFunction_StartIndex = input.index();
        Object root_0 = null;

        Token EXISTS253=null;
        Token IN255=null;
        Token OPEN_BRACE258=null;
        Token CLOSE_BRACE260=null;
        StarqlParser.boundIndVar_return boundIndVar254 = null;

        StarqlParser.seqName_return seqName256 = null;

        StarqlParser.boundValVar_return boundValVar257 = null;

        StarqlParser.hvgConstraint_return hvgConstraint259 = null;


        Object EXISTS253_tree=null;
        Object IN255_tree=null;
        Object OPEN_BRACE258_tree=null;
        Object CLOSE_BRACE260_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_hvgConstraint=new RewriteRuleSubtreeStream(adaptor,"rule hvgConstraint");
        RewriteRuleSubtreeStream stream_boundIndVar=new RewriteRuleSubtreeStream(adaptor,"rule boundIndVar");
        RewriteRuleSubtreeStream stream_boundValVar=new RewriteRuleSubtreeStream(adaptor,"rule boundValVar");
        RewriteRuleSubtreeStream stream_seqName=new RewriteRuleSubtreeStream(adaptor,"rule seqName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:366:2: ( EXISTS boundIndVar IN seqName ( boundValVar )? OPEN_BRACE hvgConstraint CLOSE_BRACE -> ^( EXISTS boundIndVar ^( IN seqName ) ( boundValVar )? hvgConstraint ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:366:4: EXISTS boundIndVar IN seqName ( boundValVar )? OPEN_BRACE hvgConstraint CLOSE_BRACE
            {
            EXISTS253=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_existsFunction2834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXISTS.add(EXISTS253);

            pushFollow(FOLLOW_boundIndVar_in_existsFunction2836);
            boundIndVar254=boundIndVar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_boundIndVar.add(boundIndVar254.getTree());
            IN255=(Token)match(input,IN,FOLLOW_IN_in_existsFunction2838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN255);

            pushFollow(FOLLOW_seqName_in_existsFunction2840);
            seqName256=seqName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_seqName.add(seqName256.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:366:34: ( boundValVar )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==VAR_VALUE) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:0:0: boundValVar
                    {
                    pushFollow(FOLLOW_boundValVar_in_existsFunction2842);
                    boundValVar257=boundValVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boundValVar.add(boundValVar257.getTree());

                    }
                    break;

            }

            OPEN_BRACE258=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_existsFunction2845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE258);

            pushFollow(FOLLOW_hvgConstraint_in_existsFunction2847);
            hvgConstraint259=hvgConstraint();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hvgConstraint.add(hvgConstraint259.getTree());
            CLOSE_BRACE260=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_existsFunction2849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE260);



            // AST REWRITE
            // elements: boundIndVar, EXISTS, IN, hvgConstraint, boundValVar, seqName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 366:84: -> ^( EXISTS boundIndVar ^( IN seqName ) ( boundValVar )? hvgConstraint )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:366:87: ^( EXISTS boundIndVar ^( IN seqName ) ( boundValVar )? hvgConstraint )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXISTS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_boundIndVar.nextTree());
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:366:108: ^( IN seqName )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                adaptor.addChild(root_2, stream_seqName.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:366:122: ( boundValVar )?
                if ( stream_boundValVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_boundValVar.nextTree());

                }
                stream_boundValVar.reset();
                adaptor.addChild(root_1, stream_hvgConstraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, existsFunction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "existsFunction"

    public static class aggregate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aggregate"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:369:1: aggregate : IDENT OPEN_BRACE var ( COMMA var )* CLOSE_BRACE -> ^( IDENT ( var )+ ) ;
    public final StarqlParser.aggregate_return aggregate() throws RecognitionException {
        StarqlParser.aggregate_return retval = new StarqlParser.aggregate_return();
        retval.start = input.LT(1);
        int aggregate_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT261=null;
        Token OPEN_BRACE262=null;
        Token COMMA264=null;
        Token CLOSE_BRACE266=null;
        StarqlParser.var_return var263 = null;

        StarqlParser.var_return var265 = null;


        Object IDENT261_tree=null;
        Object OPEN_BRACE262_tree=null;
        Object COMMA264_tree=null;
        Object CLOSE_BRACE266_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:370:5: ( IDENT OPEN_BRACE var ( COMMA var )* CLOSE_BRACE -> ^( IDENT ( var )+ ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:370:7: IDENT OPEN_BRACE var ( COMMA var )* CLOSE_BRACE
            {
            IDENT261=(Token)match(input,IDENT,FOLLOW_IDENT_in_aggregate2887); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT261);

            OPEN_BRACE262=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate2889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE262);

            pushFollow(FOLLOW_var_in_aggregate2891);
            var263=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_var.add(var263.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:370:28: ( COMMA var )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:370:29: COMMA var
            	    {
            	    COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_aggregate2894); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA264);

            	    pushFollow(FOLLOW_var_in_aggregate2896);
            	    var265=var();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_var.add(var265.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            CLOSE_BRACE266=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate2900); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE266);



            // AST REWRITE
            // elements: IDENT, var
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 370:53: -> ^( IDENT ( var )+ )
            {
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:370:56: ^( IDENT ( var )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);

                if ( !(stream_var.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextTree());

                }
                stream_var.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, aggregate_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "aggregate"

    public static class rdfLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rdfLiteral"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:373:1: rdfLiteral : string ( LANGTAG | ( REFERENCE iriRef ) )? ;
    public final StarqlParser.rdfLiteral_return rdfLiteral() throws RecognitionException {
        StarqlParser.rdfLiteral_return retval = new StarqlParser.rdfLiteral_return();
        retval.start = input.LT(1);
        int rdfLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token LANGTAG268=null;
        Token REFERENCE269=null;
        StarqlParser.string_return string267 = null;

        StarqlParser.iriRef_return iriRef270 = null;


        Object LANGTAG268_tree=null;
        Object REFERENCE269_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:374:5: ( string ( LANGTAG | ( REFERENCE iriRef ) )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:374:7: string ( LANGTAG | ( REFERENCE iriRef ) )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_string_in_rdfLiteral2926);
            string267=string();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string267.getTree());
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:374:14: ( LANGTAG | ( REFERENCE iriRef ) )?
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LANGTAG) ) {
                alt62=1;
            }
            else if ( (LA62_0==REFERENCE) ) {
                alt62=2;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:374:15: LANGTAG
                    {
                    LANGTAG268=(Token)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral2929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LANGTAG268_tree = (Object)adaptor.create(LANGTAG268);
                    adaptor.addChild(root_0, LANGTAG268_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:374:25: ( REFERENCE iriRef )
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:374:25: ( REFERENCE iriRef )
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:374:26: REFERENCE iriRef
                    {
                    REFERENCE269=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_rdfLiteral2934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REFERENCE269_tree = (Object)adaptor.create(REFERENCE269);
                    adaptor.addChild(root_0, REFERENCE269_tree);
                    }
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral2936);
                    iriRef270=iriRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iriRef270.getTree());

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, rdfLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rdfLiteral"

    public static class numeric_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:377:1: numeric : INTEGER ;
    public final StarqlParser.numeric_return numeric() throws RecognitionException {
        StarqlParser.numeric_return retval = new StarqlParser.numeric_return();
        retval.start = input.LT(1);
        int numeric_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER271=null;

        Object INTEGER271_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:378:2: ( INTEGER )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:378:4: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            INTEGER271=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numeric2953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER271_tree = (Object)adaptor.create(INTEGER271);
            adaptor.addChild(root_0, INTEGER271_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, numeric_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numeric"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteral"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:381:1: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final StarqlParser.numericLiteral_return numericLiteral() throws RecognitionException {
        StarqlParser.numericLiteral_return retval = new StarqlParser.numericLiteral_return();
        retval.start = input.LT(1);
        int numericLiteral_StartIndex = input.index();
        Object root_0 = null;

        StarqlParser.numericLiteralUnsigned_return numericLiteralUnsigned272 = null;

        StarqlParser.numericLiteralPositive_return numericLiteralPositive273 = null;

        StarqlParser.numericLiteralNegative_return numericLiteralNegative274 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:382:5: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
            int alt63=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt63=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt63=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:382:7: numericLiteralUnsigned
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral2967);
                    numericLiteralUnsigned272=numericLiteralUnsigned();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralUnsigned272.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:383:7: numericLiteralPositive
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral2975);
                    numericLiteralPositive273=numericLiteralPositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralPositive273.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:384:7: numericLiteralNegative
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral2983);
                    numericLiteralNegative274=numericLiteralNegative();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralNegative274.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, numericLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"

    public static class numericLiteralUnsigned_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralUnsigned"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:387:1: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final StarqlParser.numericLiteralUnsigned_return numericLiteralUnsigned() throws RecognitionException {
        StarqlParser.numericLiteralUnsigned_return retval = new StarqlParser.numericLiteralUnsigned_return();
        retval.start = input.LT(1);
        int numericLiteralUnsigned_StartIndex = input.index();
        Object root_0 = null;

        Token set275=null;

        Object set275_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:388:5: ( INTEGER | DECIMAL | DOUBLE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            root_0 = (Object)adaptor.nil();

            set275=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=DOUBLE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set275));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, numericLiteralUnsigned_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralUnsigned"

    public static class numericLiteralPositive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralPositive"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:393:1: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final StarqlParser.numericLiteralPositive_return numericLiteralPositive() throws RecognitionException {
        StarqlParser.numericLiteralPositive_return retval = new StarqlParser.numericLiteralPositive_return();
        retval.start = input.LT(1);
        int numericLiteralPositive_StartIndex = input.index();
        Object root_0 = null;

        Token set276=null;

        Object set276_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:394:5: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            root_0 = (Object)adaptor.nil();

            set276=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER_POSITIVE && input.LA(1)<=DOUBLE_POSITIVE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set276));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, numericLiteralPositive_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralPositive"

    public static class numericLiteralNegative_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralNegative"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:399:1: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final StarqlParser.numericLiteralNegative_return numericLiteralNegative() throws RecognitionException {
        StarqlParser.numericLiteralNegative_return retval = new StarqlParser.numericLiteralNegative_return();
        retval.start = input.LT(1);
        int numericLiteralNegative_StartIndex = input.index();
        Object root_0 = null;

        Token set277=null;

        Object set277_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:400:5: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            root_0 = (Object)adaptor.nil();

            set277=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER_NEGATIVE && input.LA(1)<=DOUBLE_NEGATIVE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set277));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, numericLiteralNegative_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralNegative"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:405:1: booleanLiteral : ( TRUE | FALSE );
    public final StarqlParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        StarqlParser.booleanLiteral_return retval = new StarqlParser.booleanLiteral_return();
        retval.start = input.LT(1);
        int booleanLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token set278=null;

        Object set278_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:406:5: ( TRUE | FALSE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            root_0 = (Object)adaptor.nil();

            set278=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set278));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, booleanLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:410:1: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final StarqlParser.string_return string() throws RecognitionException {
        StarqlParser.string_return retval = new StarqlParser.string_return();
        retval.start = input.LT(1);
        int string_StartIndex = input.index();
        Object root_0 = null;

        Token set279=null;

        Object set279_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:411:5: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            root_0 = (Object)adaptor.nil();

            set279=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING_LITERAL1 && input.LA(1)<=STRING_LITERAL_LONG2) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set279));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, string_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class iriRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iriRef"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:417:1: iriRef : ( prefixedName | IRI_REF );
    public final StarqlParser.iriRef_return iriRef() throws RecognitionException {
        StarqlParser.iriRef_return retval = new StarqlParser.iriRef_return();
        retval.start = input.LT(1);
        int iriRef_StartIndex = input.index();
        Object root_0 = null;

        Token IRI_REF281=null;
        StarqlParser.prefixedName_return prefixedName280 = null;


        Object IRI_REF281_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:418:5: ( prefixedName | IRI_REF )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==PNAME_NS||LA64_0==PNAME_LN) ) {
                alt64=1;
            }
            else if ( (LA64_0==IRI_REF) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:418:7: prefixedName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixedName_in_iriRef3165);
                    prefixedName280=prefixedName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixedName280.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:419:7: IRI_REF
                    {
                    root_0 = (Object)adaptor.nil();

                    IRI_REF281=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef3173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IRI_REF281_tree = (Object)adaptor.create(IRI_REF281);
                    adaptor.addChild(root_0, IRI_REF281_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, iriRef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iriRef"

    public static class prefixedName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixedName"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:422:1: prefixedName : ( PNAME_LN | PNAME_NS );
    public final StarqlParser.prefixedName_return prefixedName() throws RecognitionException {
        StarqlParser.prefixedName_return retval = new StarqlParser.prefixedName_return();
        retval.start = input.LT(1);
        int prefixedName_StartIndex = input.index();
        Object root_0 = null;

        Token set282=null;

        Object set282_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:423:5: ( PNAME_LN | PNAME_NS )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            root_0 = (Object)adaptor.nil();

            set282=(Token)input.LT(1);
            if ( input.LA(1)==PNAME_NS||input.LA(1)==PNAME_LN ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set282));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, prefixedName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixedName"

    public static class anon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anon"
    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:427:1: anon : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET ;
    public final StarqlParser.anon_return anon() throws RecognitionException {
        StarqlParser.anon_return retval = new StarqlParser.anon_return();
        retval.start = input.LT(1);
        int anon_StartIndex = input.index();
        Object root_0 = null;

        Token OPEN_SQUARE_BRACKET283=null;
        Token CLOSE_SQUARE_BRACKET284=null;

        Object OPEN_SQUARE_BRACKET283_tree=null;
        Object CLOSE_SQUARE_BRACKET284_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:428:5: ( OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:428:7: OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            OPEN_SQUARE_BRACKET283=(Token)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_anon3215); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OPEN_SQUARE_BRACKET283_tree = (Object)adaptor.create(OPEN_SQUARE_BRACKET283);
            adaptor.addChild(root_0, OPEN_SQUARE_BRACKET283_tree);
            }
            CLOSE_SQUARE_BRACKET284=(Token)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_anon3217); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLOSE_SQUARE_BRACKET284_tree = (Object)adaptor.create(CLOSE_SQUARE_BRACKET284);
            adaptor.addChild(root_0, CLOSE_SQUARE_BRACKET284_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, anon_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anon"

    // $ANTLR start synpred44_Starql
    public final void synpred44_Starql_fragment() throws RecognitionException {   
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:216:30: ( OR hvgOrConstraint )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:216:30: OR hvgOrConstraint
        {
        match(input,OR,FOLLOW_OR_in_synpred44_Starql1459); if (state.failed) return ;
        pushFollow(FOLLOW_hvgOrConstraint_in_synpred44_Starql1462);
        hvgOrConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Starql

    // $ANTLR start synpred45_Starql
    public final void synpred45_Starql_fragment() throws RecognitionException {   
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:224:23: ( AND hvgAndConstraint )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:224:23: AND hvgAndConstraint
        {
        match(input,AND,FOLLOW_AND_in_synpred45_Starql1498); if (state.failed) return ;
        pushFollow(FOLLOW_hvgAndConstraint_in_synpred45_Starql1501);
        hvgAndConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Starql

    // $ANTLR start synpred46_Starql
    public final void synpred46_Starql_fragment() throws RecognitionException {   
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:232:21: ( AND andLogical )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:232:21: AND andLogical
        {
        match(input,AND,FOLLOW_AND_in_synpred46_Starql1536); if (state.failed) return ;
        pushFollow(FOLLOW_andLogical_in_synpred46_Starql1539);
        andLogical();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_Starql

    // $ANTLR start synpred47_Starql
    public final void synpred47_Starql_fragment() throws RecognitionException {   
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:240:22: ( OR orLogical )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:240:22: OR orLogical
        {
        match(input,OR,FOLLOW_OR_in_synpred47_Starql1573); if (state.failed) return ;
        pushFollow(FOLLOW_orLogical_in_synpred47_Starql1576);
        orLogical();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Starql

    // $ANTLR start synpred49_Starql
    public final void synpred49_Starql_fragment() throws RecognitionException {   
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:249:7: ( hvgAt )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:249:7: hvgAt
        {
        pushFollow(FOLLOW_hvgAt_in_synpred49_Starql1621);
        hvgAt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Starql

    // $ANTLR start synpred50_Starql
    public final void synpred50_Starql_fragment() throws RecognitionException {   
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:250:7: ( operatorDef )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:250:7: operatorDef
        {
        pushFollow(FOLLOW_operatorDef_in_synpred50_Starql1629);
        operatorDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Starql

    // $ANTLR start synpred71_Starql
    public final void synpred71_Starql_fragment() throws RecognitionException {   
        StarqlParser.primaryExpression_return c1 = null;

        StarqlParser.primaryExpression_return c2 = null;


        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:7: ( (c1= primaryExpression ) ( MINUS c2= primaryExpression ) )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:7: (c1= primaryExpression ) ( MINUS c2= primaryExpression )
        {
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:7: (c1= primaryExpression )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:8: c1= primaryExpression
        {
        pushFollow(FOLLOW_primaryExpression_in_synpred71_Starql2559);
        c1=primaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }

        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:37: ( MINUS c2= primaryExpression )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:344:38: MINUS c2= primaryExpression
        {
        match(input,MINUS,FOLLOW_MINUS_in_synpred71_Starql2568); if (state.failed) return ;
        pushFollow(FOLLOW_primaryExpression_in_synpred71_Starql2572);
        c2=primaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred71_Starql

    // $ANTLR start synpred72_Starql
    public final void synpred72_Starql_fragment() throws RecognitionException {   
        StarqlParser.primaryExpression_return c1 = null;

        StarqlParser.primaryExpression_return c2 = null;


        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:7: ( (c1= primaryExpression ) ( PLUS c2= primaryExpression ) )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:7: (c1= primaryExpression ) ( PLUS c2= primaryExpression )
        {
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:7: (c1= primaryExpression )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:8: c1= primaryExpression
        {
        pushFollow(FOLLOW_primaryExpression_in_synpred72_Starql2596);
        c1=primaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }

        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:37: ( PLUS c2= primaryExpression )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:345:38: PLUS c2= primaryExpression
        {
        match(input,PLUS,FOLLOW_PLUS_in_synpred72_Starql2605); if (state.failed) return ;
        pushFollow(FOLLOW_primaryExpression_in_synpred72_Starql2609);
        c2=primaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred72_Starql

    // $ANTLR start synpred73_Starql
    public final void synpred73_Starql_fragment() throws RecognitionException {   
        StarqlParser.primaryExpression_return c1 = null;

        StarqlParser.primaryExpression_return c2 = null;


        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:7: ( (c1= primaryExpression ) ( DIVIDE c2= primaryExpression ) )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:7: (c1= primaryExpression ) ( DIVIDE c2= primaryExpression )
        {
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:7: (c1= primaryExpression )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:8: c1= primaryExpression
        {
        pushFollow(FOLLOW_primaryExpression_in_synpred73_Starql2633);
        c1=primaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }

        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:37: ( DIVIDE c2= primaryExpression )
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:346:38: DIVIDE c2= primaryExpression
        {
        match(input,DIVIDE,FOLLOW_DIVIDE_in_synpred73_Starql2642); if (state.failed) return ;
        pushFollow(FOLLOW_primaryExpression_in_synpred73_Starql2646);
        c2=primaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred73_Starql

    // Delegated rules

    public final boolean synpred72_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_Starql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_Starql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA45_eotS =
        "\23\uffff";
    static final String DFA45_eofS =
        "\23\uffff";
    static final String DFA45_minS =
        "\1\46\12\uffff\2\0\6\uffff";
    static final String DFA45_maxS =
        "\1\164\12\uffff\2\0\6\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\14\uffff\1\3\1\4\1\5\1\2\1\6";
    static final String DFA45_specialS =
        "\13\uffff\1\0\1\1\6\uffff}>";
    static final String[] DFA45_transitionS = {
            "\2\1\2\uffff\1\13\3\uffff\1\14\2\uffff\1\1\41\uffff\1\20\1"+
            "\1\1\16\5\uffff\2\1\4\uffff\1\1\1\17\2\uffff\11\1\2\uffff\5"+
            "\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "248:1: hvgConstraint : ( hvgAt | operatorDef | forAll | existsFunction | NOT brackettedConstraint | brackettedConstraint );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_11 = input.LA(1);

                         
                        int index45_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_Starql()) ) {s = 1;}

                        else if ( (synpred50_Starql()) ) {s = 17;}

                         
                        input.seek(index45_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_12 = input.LA(1);

                         
                        int index45_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_Starql()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index45_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\20\uffff";
    static final String DFA57_eofS =
        "\20\uffff";
    static final String DFA57_minS =
        "\1\46\13\0\4\uffff";
    static final String DFA57_maxS =
        "\1\164\13\0\4\uffff";
    static final String DFA57_acceptS =
        "\14\uffff\1\1\1\2\1\3\1\4";
    static final String DFA57_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\4\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\1\2\2\uffff\1\11\3\uffff\1\12\54\uffff\1\7\1\10\4\uffff"+
            "\1\13\3\uffff\3\4\3\5\3\6\2\uffff\4\3\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "343:1: multiplyExpression : ( (c1= primaryExpression -> $c1) ( MINUS c2= primaryExpression -> ^( MINUS $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( PLUS c2= primaryExpression -> ^( PLUS $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( DIVIDE c2= primaryExpression -> ^( DIVIDE $multiplyExpression $c2) ) | (c1= primaryExpression -> $c1) ( ASTERISK c2= primaryExpression -> ^( ASTERISK $multiplyExpression $c2) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_3 = input.LA(1);

                         
                        int index57_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_4 = input.LA(1);

                         
                        int index57_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA57_5 = input.LA(1);

                         
                        int index57_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA57_6 = input.LA(1);

                         
                        int index57_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA57_7 = input.LA(1);

                         
                        int index57_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA57_8 = input.LA(1);

                         
                        int index57_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA57_9 = input.LA(1);

                         
                        int index57_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA57_10 = input.LA(1);

                         
                        int index57_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA57_11 = input.LA(1);

                         
                        int index57_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Starql()) ) {s = 12;}

                        else if ( (synpred72_Starql()) ) {s = 13;}

                        else if ( (synpred73_Starql()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_prefixDecl_in_query159 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_createClause_in_query162 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_EOF_in_query166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl196 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDecl198 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDecl200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createClause231 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STREAM_in_createClause233 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_createClause235 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_createClause237 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_queryDef_in_createClause239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createClause256 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AGGREGATE_in_createClause258 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPERATOR_in_createClause260 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_operatorDef_in_createClause262 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_createClause264 = new BitSet(new long[]{0x000244C000000002L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_createClause266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createClause284 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_pulseExp_in_createClause286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroName_in_operatorDef307 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_operatorDef309 = new BitSet(new long[]{0x000204C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_seqName_in_operatorDef313 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_COMMA_in_operatorDef315 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_starPattern_in_operatorDef320 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_COMMA_in_operatorDef323 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_starPattern_in_operatorDef325 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_operatorDef329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_seqName354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_macroName364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_starPattern380 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_starPattern382 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_starPattern384 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_starPattern386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_starPattern392 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_starPattern394 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_var_in_starPattern396 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_starPattern398 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LESS_in_starPattern400 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000001L,0x0000000000800000L});
    public static final BitSet FOLLOW_resultTime_in_starPattern402 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GREATER_in_starPattern404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_starPattern410 = new BitSet(new long[]{0x000200C000000000L,0x001000001C100000L});
    public static final BitSet FOLLOW_subject_in_starPattern414 = new BitSet(new long[]{0x000200C000000000L,0x001000001C100000L});
    public static final BitSet FOLLOW_verb_in_starPattern417 = new BitSet(new long[]{0x000204C000000000L,0x001F3FE018100000L});
    public static final BitSet FOLLOW_object_in_starPattern420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_starPattern424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLogical_in_aggDef441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLogical_in_unaryAggDef453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLogical_in_binaryAggDef466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PULSE_in_pulseExp477 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_pulseExp479 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_WITH_in_pulseExp481 = new BitSet(new long[]{0x0180000020000000L});
    public static final BitSet FOLLOW_START_in_pulseExp484 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_pulseExp486 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_startTime_in_pulseExp488 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_COMMA_in_pulseExp490 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_END_in_pulseExp495 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_pulseExp497 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_endTime_in_pulseExp499 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_COMMA_in_pulseExp501 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FREQUENCY_in_pulseExp505 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_pulseExp507 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_frequence_in_pulseExp509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_startTime538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_endTime558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_frequence579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_pulseRef602 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_PULSE_in_pulseRef604 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_pulseRef606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryHead_in_queryDef633 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FROM_in_queryDef635 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_listOfWindowedStreamExp_in_queryDef637 = new BitSet(new long[]{0x0200800000000002L,0x000000000000DF00L});
    public static final BitSet FOLLOW_listOfRessources_in_queryDef639 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_pulseRef_in_queryDef642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_whereClause_in_queryDef645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000D00L});
    public static final BitSet FOLLOW_seqMethod_in_queryDef649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_havingClause_in_queryDef651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_groupBy_in_queryDef655 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_hvgAgg_in_queryDef658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_queryHead715 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_DISTINCT_in_queryHead717 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_bindingList_in_queryHead720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCT_in_queryHead739 = new BitSet(new long[]{0x100200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_DISTINCT_in_queryHead741 = new BitSet(new long[]{0x100200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_constructBlock_in_queryHead744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_bindingList774 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_binding_in_bindingList776 = new BitSet(new long[]{0x800244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_binding_in_bindingList780 = new BitSet(new long[]{0x800244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_bindingList785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_binding805 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_AS_in_binding808 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_hvgValueAtom_in_binding810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgIndAt_in_constructBlock833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_resultTime847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOW_in_resultTime851 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_resultTime857 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_rdfLiteral_in_resultTime867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_resultTime874 = new BitSet(new long[]{0x0000000000000000L,0x00003FE000000000L});
    public static final BitSet FOLLOW_numericLiteral_in_resultTime876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_resultTime878 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_resultTime880 = new BitSet(new long[]{0x0000000000000000L,0x00003FE000000000L});
    public static final BitSet FOLLOW_numericLiteral_in_resultTime882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_resultTime890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_in_listOfWindowedStreamExp906 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_listOfWindowedStreamExp908 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000008L});
    public static final BitSet FOLLOW_windowExp_in_listOfWindowedStreamExp910 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_listOfWindowedStreamExp914 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_listOfWindowedStreamExp916 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000008L});
    public static final BitSet FOLLOW_windowExp_in_listOfWindowedStreamExp918 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_slackConst_in_windowExp952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_windowExp955 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000001L,0x0000000000800000L});
    public static final BitSet FOLLOW_timeExpNOW_in_windowExp957 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_COMMA_in_windowExp959 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000001L,0x0000000000800000L});
    public static final BitSet FOLLOW_timeExpNOW_in_windowExp961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_windowExp963 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_slideConst_in_windowExp965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_slackConst993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LEFT_ARROW_in_slackConst995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_ARROW_in_slideConst1015 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_rdfLiteral_in_slideConst1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resultTime_in_timeExpNOW1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BY_in_seqClass1057 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IDENT_in_seqClass1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_in_seqMethod1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_seqClass_in_seqMethod1080 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_AS_in_seqMethod1083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_seqName_in_seqMethod1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause1116 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_whereClause1118 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_triplesBlock_in_whereClause1120 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_whereClause1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_groupBy1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BY_in_groupBy1151 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_var_in_groupBy1153 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_HAVING_in_hvgAgg1176 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AGGREGATE_in_hvgAgg1178 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_orLogical_in_hvgAgg1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAVING_in_havingClause1202 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgConstraint_in_havingClause1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_listOfRessources1235 = new BitSet(new long[]{0x0000800000000000L,0x000000000000D000L});
    public static final BitSet FOLLOW_typedRessourceList_in_listOfRessources1238 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_listOfRessources1241 = new BitSet(new long[]{0x0000800000000000L,0x000000000000D000L});
    public static final BitSet FOLLOW_typedRessourceList_in_listOfRessources1243 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_STATIC_in_typedRessourceList1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ABOX_in_typedRessourceList1270 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1272 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_typedRessourceList1275 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1277 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_TEMPORAL_in_typedRessourceList1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ABOX_in_typedRessourceList1295 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1297 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_typedRessourceList1300 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1302 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_TBOX_in_typedRessourceList1318 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1320 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_typedRessourceList1323 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_iriRef_in_typedRessourceList1325 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesBlock1350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_triplesBlock1353 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesBlock1355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_triplesBlock1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subject_in_triplesSameSubject1382 = new BitSet(new long[]{0x000200C000000000L,0x001000001C100000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_brackettedConstraint1419 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_brackettedConstraint1421 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_brackettedConstraint1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgAndConstraint_in_hvgOrConstraint1456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_hvgOrConstraint1459 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_hvgOrConstraint1462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_hvgConstraint_in_hvgAndConstraint1495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AND_in_hvgAndConstraint1498 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgAndConstraint_in_hvgAndConstraint1501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_valueLogical_in_andLogical1533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AND_in_andLogical1536 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_andLogical_in_andLogical1539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_andLogical_in_orLogical1570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_orLogical1573 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_orLogical_in_orLogical1576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_hvgIndAt_in_hvgAt1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgValAt_in_hvgAt1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgAt_in_hvgConstraint1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operatorDef_in_hvgConstraint1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forAll_in_hvgConstraint1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunction_in_hvgConstraint1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_hvgConstraint1653 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_brackettedConstraint_in_hvgConstraint1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedConstraint_in_hvgConstraint1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_hvgIndAt1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000001L,0x0000000000800000L});
    public static final BitSet FOLLOW_resultTime_in_hvgIndAt1683 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_hvgIndAt1685 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_triplesBlock_in_hvgIndAt1687 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_hvgIndAt1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_starPattern_in_hvgIndAt1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLogical_in_hvgValAt1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgIndAriAtom_in_boundIndVar1746 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_boundIndVar1749 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_hvgIndAriAtom_in_boundIndVar1751 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_hvgValueAtom_in_boundValVar1774 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_boundValVar1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_hvgValueAtom_in_boundValVar1779 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_FORALL_in_forAll1807 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_boundIndVar_in_forAll1809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IN_in_forAll1811 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_seqName_in_forAll1813 = new BitSet(new long[]{0x0000400000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_boundValVar_in_forAll1815 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_forAll1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ifStatement_in_forAll1820 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_forAll1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1854 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgConstraint_in_ifStatement1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1858 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgConstraint_in_ifStatement1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty1888 = new BitSet(new long[]{0x000204C000000000L,0x001F3FE018100000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty1890 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_propertyListNotEmpty1893 = new BitSet(new long[]{0x000200C000000002L,0x001000001E100000L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty1896 = new BitSet(new long[]{0x000204C000000000L,0x001F3FE018100000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty1898 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_object_in_objectList1933 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_objectList1936 = new BitSet(new long[]{0x000204C000000000L,0x001F3FE018100000L});
    public static final BitSet FOLLOW_object_in_objectList1938 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_var_in_verb1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_verb1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_verb1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_subject1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_subject1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_starqlVar_in_object2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgValueAtom_in_var2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgIndAriAtom_in_var2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_VALUE_in_hvgValueAtom2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_INDEX_in_hvgIndAriAtom2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_valueLogical2098 = new BitSet(new long[]{0x004C000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_EQUAL_in_valueLogical2122 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_valueLogical2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_valueLogical2183 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_valueLogical2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_valueLogical2242 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_valueLogical2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_valueLogical2301 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_valueLogical2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_valueLogical2359 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_valueLogical2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_valueLogical2417 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_valueLogical2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_multiplyExpression2568 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_multiplyExpression2605 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplyExpression2642 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2670 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_multiplyExpression2679 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_multiplyExpression2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_starqlVar2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_starqlVar2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_starqlVar2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_starqlVar2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_starqlVar2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_starqlVar_in_primaryExpression2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_primaryExpression2785 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_multiplyExpression_in_primaryExpression2787 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_primaryExpression2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_primaryExpression2805 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_primaryExpression2807 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_multiplyExpression_in_primaryExpression2809 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_primaryExpression2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunction2834 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_boundIndVar_in_existsFunction2836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IN_in_existsFunction2838 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_seqName_in_existsFunction2840 = new BitSet(new long[]{0x0000400000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_boundValVar_in_existsFunction2842 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_existsFunction2845 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgConstraint_in_existsFunction2847 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_existsFunction2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_aggregate2887 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate2889 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_var_in_aggregate2891 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_COMMA_in_aggregate2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_var_in_aggregate2896 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral2926 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_rdfLiteral2934 = new BitSet(new long[]{0x000200C000000000L,0x0010000018100000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numeric2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralUnsigned0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralPositive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralNegative0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixedName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_anon3215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_anon3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred44_Starql1459 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgOrConstraint_in_synpred44_Starql1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred45_Starql1498 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE618380000L});
    public static final BitSet FOLLOW_hvgAndConstraint_in_synpred45_Starql1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred46_Starql1536 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_andLogical_in_synpred46_Starql1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred47_Starql1573 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_orLogical_in_synpred47_Starql1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hvgAt_in_synpred49_Starql1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operatorDef_in_synpred50_Starql1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_synpred71_Starql2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_synpred71_Starql2568 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_synpred71_Starql2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_synpred72_Starql2596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_synpred72_Starql2605 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_synpred72_Starql2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_synpred73_Starql2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DIVIDE_in_synpred73_Starql2642 = new BitSet(new long[]{0x000244C000000000L,0x001F3FE218100000L});
    public static final BitSet FOLLOW_primaryExpression_in_synpred73_Starql2646 = new BitSet(new long[]{0x0000000000000002L});

}