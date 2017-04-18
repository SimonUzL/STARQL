// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g 2016-06-23 22:34:00

    package de.uzl.ifis.starql.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class StarqlLexer extends Lexer {
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

    public StarqlLexer() {;} 
    public StarqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public StarqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g"; }

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:7:8: ( '|_' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:7:10: '|_'
            {
            match("|_"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:8:8: ( '_|' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:8:10: '_|'
            {
            match("_|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "RESSOURCE"
    public final void mRESSOURCE() throws RecognitionException {
        try {
            int _type = RESSOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:434:11: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:434:13: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESSOURCE"

    // $ANTLR start "GRAPH"
    public final void mGRAPH() throws RecognitionException {
        try {
            int _type = GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:436:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:436:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRAPH"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:438:4: ( ( ' ' | '\\t' | EOL )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:438:6: ( ' ' | '\\t' | EOL )+
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:438:6: ( ' ' | '\\t' | EOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:440:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:440:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:442:8: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:442:10: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREFIX"

    // $ANTLR start "CONSTRUCT"
    public final void mCONSTRUCT() throws RecognitionException {
        try {
            int _type = CONSTRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:444:11: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:444:13: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRUCT"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:446:10: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:446:12: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:448:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:448:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "NAMED"
    public final void mNAMED() throws RecognitionException {
        try {
            int _type = NAMED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:450:7: ( ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:450:9: ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMED"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:452:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:452:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:454:10: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:454:12: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:456:8: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:456:10: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:458:3: ( 'a' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:458:5: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:460:7: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:460:9: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:462:4: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:462:6: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:464:8: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:464:10: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "IRI"
    public final void mIRI() throws RecognitionException {
        try {
            int _type = IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:466:5: ( ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:466:7: ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IRI"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:468:5: ( ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:468:7: ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "ABS"
    public final void mABS() throws RecognitionException {
        try {
            int _type = ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:470:4: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:470:6: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABS"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:472:6: ( ( 'Y' | 'y' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:472:8: ( 'Y' | 'y' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            int _type = MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:474:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:474:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:476:5: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) | ( 'D' | 'd' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='D'||LA2_0=='d') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='A'||LA2_1=='a') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:476:7: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:477:4: ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "HOURS"
    public final void mHOURS() throws RecognitionException {
        try {
            int _type = HOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:480:7: ( ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'S' | 's' ) | ( 'H' | 'h' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='H'||LA3_0=='h') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='O'||LA3_1=='o') ) {
                    alt3=1;
                }
                else {
                    alt3=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:480:9: ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'S' | 's' )
                    {
                    if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:481:6: ( 'H' | 'h' )
                    {
                    if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HOURS"

    // $ANTLR start "MINUTES"
    public final void mMINUTES() throws RecognitionException {
        try {
            int _type = MINUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:484:9: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) | ( 'M' | 'm' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='M'||LA4_0=='m') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='I'||LA4_1=='i') ) {
                    alt4=1;
                }
                else {
                    alt4=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:484:11: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:485:5: ( 'M' | 'm' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUTES"

    // $ANTLR start "SECONDS"
    public final void mSECONDS() throws RecognitionException {
        try {
            int _type = SECONDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:488:9: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) | ( 'S' | 's' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='S'||LA5_0=='s') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='E'||LA5_1=='e') ) {
                    alt5=1;
                }
                else {
                    alt5=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:488:11: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
                    {
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:489:5: ( 'S' | 's' )
                    {
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SECONDS"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:492:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:492:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "NOW"
    public final void mNOW() throws RecognitionException {
        try {
            int _type = NOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:494:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:494:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOW"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:496:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:496:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:498:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:498:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:500:6: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:500:8: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:502:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:502:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:504:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:504:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "SEQUENCE"
    public final void mSEQUENCE() throws RecognitionException {
        try {
            int _type = SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:506:10: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:506:12: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEQUENCE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:508:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:508:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:510:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:510:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:513:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:513:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:515:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:515:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:517:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:517:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:519:8: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:519:10: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "TEMPORAL"
    public final void mTEMPORAL() throws RecognitionException {
        try {
            int _type = TEMPORAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:521:10: ( ( 'T' | 't' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:521:12: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPORAL"

    // $ANTLR start "ABOX"
    public final void mABOX() throws RecognitionException {
        try {
            int _type = ABOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:523:6: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'X' | 'x' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:523:8: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABOX"

    // $ANTLR start "TBOX"
    public final void mTBOX() throws RecognitionException {
        try {
            int _type = TBOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:525:6: ( ( 'T' | 't' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'X' | 'x' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:525:8: ( 'T' | 't' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TBOX"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:527:8: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:527:10: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:529:10: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:529:12: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:531:8: ( ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:531:10: ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "AGGREGATE"
    public final void mAGGREGATE() throws RecognitionException {
        try {
            int _type = AGGREGATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:533:11: ( ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:533:13: ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AGGREGATE"

    // $ANTLR start "START"
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:535:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:535:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "START"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:537:5: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:537:7: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "STREAM"
    public final void mSTREAM() throws RecognitionException {
        try {
            int _type = STREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:539:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:539:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STREAM"

    // $ANTLR start "PULSE"
    public final void mPULSE() throws RecognitionException {
        try {
            int _type = PULSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:541:7: ( ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:541:9: ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PULSE"

    // $ANTLR start "FREQUENCY"
    public final void mFREQUENCY() throws RecognitionException {
        try {
            int _type = FREQUENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:543:11: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'Y' | 'y' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:543:13: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FREQUENCY"

    // $ANTLR start "FORALL"
    public final void mFORALL() throws RecognitionException {
        try {
            int _type = FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:545:8: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:545:10: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORALL"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:547:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:547:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:549:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:549:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:551:12: ( '(' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:551:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:553:13: ( ')' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:553:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "OPEN_CURLY_BRACE"
    public final void mOPEN_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:555:18: ( '{' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:555:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_CURLY_BRACE"

    // $ANTLR start "CLOSE_CURLY_BRACE"
    public final void mCLOSE_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:557:19: ( '}' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:557:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_CURLY_BRACE"

    // $ANTLR start "OPEN_SQUARE_BRACKET"
    public final void mOPEN_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = OPEN_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:559:21: ( '[' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:559:23: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_SQUARE_BRACKET"

    // $ANTLR start "CLOSE_SQUARE_BRACKET"
    public final void mCLOSE_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = CLOSE_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:561:22: ( ']' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:561:24: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_SQUARE_BRACKET"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:563:11: ( ';' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:563:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:565:5: ( '.' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:565:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:567:6: ( '+' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:567:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:569:7: ( '-' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:569:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PNAME_NS"
    public final void mPNAME_NS() throws RecognitionException {
        try {
            int _type = PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:570:10: ( ( PN_PREFIX )? ':' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:570:12: ( PN_PREFIX )? ':'
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:570:12: ( PN_PREFIX )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')||(LA6_0>='\u00C0' && LA6_0<='\u00D6')||(LA6_0>='\u00D8' && LA6_0<='\u00F6')||(LA6_0>='\u00F8' && LA6_0<='\u02FF')||(LA6_0>='\u0370' && LA6_0<='\u037D')||(LA6_0>='\u037F' && LA6_0<='\u1FFF')||(LA6_0>='\u200C' && LA6_0<='\u200D')||(LA6_0>='\u2070' && LA6_0<='\u218F')||(LA6_0>='\u2C00' && LA6_0<='\u2FEF')||(LA6_0>='\u3001' && LA6_0<='\uD7FF')||(LA6_0>='\uF900' && LA6_0<='\uFDCF')||(LA6_0>='\uFDF0' && LA6_0<='\uFFFD')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:570:12: PN_PREFIX
                    {
                    mPN_PREFIX(); 

                    }
                    break;

            }

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_NS"

    // $ANTLR start "PNAME_LN"
    public final void mPNAME_LN() throws RecognitionException {
        try {
            int _type = PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:572:10: ( PNAME_NS PN_LOCAL )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:572:12: PNAME_NS PN_LOCAL
            {
            mPNAME_NS(); 
            mPN_LOCAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_LN"

    // $ANTLR start "VAR_VALUE"
    public final void mVAR_VALUE() throws RecognitionException {
        try {
            int _type = VAR_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken v=null;

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:574:11: ( QUESTION_MARK v= VARNAME )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:574:13: QUESTION_MARK v= VARNAME
            {
            mQUESTION_MARK(); 
            int vStart2018 = getCharIndex();
            mVARNAME(); 
            v = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, vStart2018, getCharIndex()-1);
             setText((v!=null?v.getText():null)); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR_VALUE"

    // $ANTLR start "VAR_INDEX"
    public final void mVAR_INDEX() throws RecognitionException {
        try {
            int _type = VAR_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken v=null;

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:576:11: (v= VARNAME_SEQ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:576:13: v= VARNAME_SEQ
            {
            int vStart2031 = getCharIndex();
            mVARNAME_SEQ(); 
            v = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, vStart2031, getCharIndex()-1);
             setText((v!=null?v.getText():null)); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR_INDEX"

    // $ANTLR start "VARNAME_SEQ"
    public final void mVARNAME_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:579:13: ( 'a' .. 'z' ( ( DIGIT )+ )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:579:15: 'a' .. 'z' ( ( DIGIT )+ )?
            {
            matchRange('a','z'); 
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:579:24: ( ( DIGIT )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:579:25: ( DIGIT )+
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:579:25: ( DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:579:25: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "VARNAME_SEQ"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:581:9: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' )+ ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:581:11: '@' ( 'A' .. 'Z' | 'a' .. 'z' )+ ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )*
            {
            match('@'); 
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:581:15: ( 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:581:36: ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='-') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:581:37: MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+
            	    {
            	    mMINUS(); 
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:581:43: ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGTAG"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:9: ( ( ( DIGIT )+ | ( DIGIT )+ '^' ( DIGIT )+ ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:11: ( ( DIGIT )+ | ( DIGIT )+ '^' ( DIGIT )+ )
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:11: ( ( DIGIT )+ | ( DIGIT )+ '^' ( DIGIT )+ )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:12: ( DIGIT )+
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:12: ( DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:12: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:21: ( DIGIT )+ '^' ( DIGIT )+
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:21: ( DIGIT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:21: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    match('^'); 
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:32: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:583:32: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:586:5: ( ( DIGIT )+ DOT ( DIGIT )* | DOT ( DIGIT )+ )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='.') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:586:7: ( DIGIT )+ DOT ( DIGIT )*
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:586:7: ( DIGIT )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:586:7: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    mDOT(); 
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:586:18: ( DIGIT )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:586:18: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:587:7: DOT ( DIGIT )+
                    {
                    mDOT(); 
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:587:11: ( DIGIT )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:587:11: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:591:5: ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:591:7: ( DIGIT )+ DOT ( DIGIT )* EXPONENT
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:591:7: ( DIGIT )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:591:7: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    mDOT(); 
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:591:18: ( DIGIT )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:591:18: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:592:7: DOT ( DIGIT )+ EXPONENT
                    {
                    mDOT(); 
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:592:11: ( DIGIT )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:592:11: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:593:7: ( DIGIT )+ EXPONENT
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:593:7: ( DIGIT )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:593:7: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "INTEGER_POSITIVE"
    public final void mINTEGER_POSITIVE() throws RecognitionException {
        try {
            int _type = INTEGER_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:596:18: ( PLUS INTEGER )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:596:20: PLUS INTEGER
            {
            mPLUS(); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_POSITIVE"

    // $ANTLR start "DECIMAL_POSITIVE"
    public final void mDECIMAL_POSITIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:598:18: ( PLUS DECIMAL )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:598:20: PLUS DECIMAL
            {
            mPLUS(); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_POSITIVE"

    // $ANTLR start "DOUBLE_POSITIVE"
    public final void mDOUBLE_POSITIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:600:17: ( PLUS DOUBLE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:600:19: PLUS DOUBLE
            {
            mPLUS(); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_POSITIVE"

    // $ANTLR start "INTEGER_NEGATIVE"
    public final void mINTEGER_NEGATIVE() throws RecognitionException {
        try {
            int _type = INTEGER_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:602:18: ( MINUS INTEGER )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:602:20: MINUS INTEGER
            {
            mMINUS(); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_NEGATIVE"

    // $ANTLR start "DECIMAL_NEGATIVE"
    public final void mDECIMAL_NEGATIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:604:18: ( MINUS DECIMAL )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:604:20: MINUS DECIMAL
            {
            mMINUS(); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_NEGATIVE"

    // $ANTLR start "DOUBLE_NEGATIVE"
    public final void mDOUBLE_NEGATIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:606:17: ( MINUS DOUBLE )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:606:19: MINUS DOUBLE
            {
            mMINUS(); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_NEGATIVE"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:609:10: ( ( 'e' | 'E' ) ( SIGN )? ( DIGIT )+ )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:609:12: ( 'e' | 'E' ) ( SIGN )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:609:22: ( SIGN )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='+'||LA25_0=='-') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:609:22: SIGN
                    {
                    mSIGN(); 

                    }
                    break;

            }

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:609:28: ( DIGIT )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:609:28: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_LITERAL1"
    public final void mSTRING_LITERAL1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:611:17: ( '\\'' ( options {greedy=false; } : ~ ( '\\'' | '\\\\' | EOL ) | ECHAR )* '\\'' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:611:19: '\\'' ( options {greedy=false; } : ~ ( '\\'' | '\\\\' | EOL ) | ECHAR )* '\\''
            {
            match('\''); 
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:611:24: ( options {greedy=false; } : ~ ( '\\'' | '\\\\' | EOL ) | ECHAR )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }
                else if ( (LA27_0=='\\') ) {
                    alt27=2;
                }
                else if ( (LA27_0=='\'') ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:611:51: ~ ( '\\'' | '\\\\' | EOL )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:611:74: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL1"

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:613:17: ( '\"' ( options {greedy=false; } : ~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:613:19: '\"' ( options {greedy=false; } : ~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:613:23: ( options {greedy=false; } : ~ ( '\"' | '\\\\' | EOL ) | ECHAR )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='!')||(LA28_0>='#' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }
                else if ( (LA28_0=='\\') ) {
                    alt28=2;
                }
                else if ( (LA28_0=='\"') ) {
                    alt28=3;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:613:50: ~ ( '\"' | '\\\\' | EOL )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:613:72: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:22: ( '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:24: '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); 

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:33: ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='\'') ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1=='\'') ) {
                        int LA31_3 = input.LA(3);

                        if ( (LA31_3=='\'') ) {
                            alt31=2;
                        }
                        else if ( ((LA31_3>='\u0000' && LA31_3<='&')||(LA31_3>='(' && LA31_3<='\uFFFF')) ) {
                            alt31=1;
                        }


                    }
                    else if ( ((LA31_1>='\u0000' && LA31_1<='&')||(LA31_1>='(' && LA31_1<='\uFFFF')) ) {
                        alt31=1;
                    }


                }
                else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:60: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:60: ( '\\'' | '\\'\\'' )?
            	    int alt29=3;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0=='\'') ) {
            	        int LA29_1 = input.LA(2);

            	        if ( (LA29_1=='\'') ) {
            	            alt29=2;
            	        }
            	        else if ( ((LA29_1>='\u0000' && LA29_1<='&')||(LA29_1>='(' && LA29_1<='\uFFFF')) ) {
            	            alt29=1;
            	        }
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:61: '\\''
            	            {
            	            match('\''); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:68: '\\'\\''
            	            {
            	            match("''"); 


            	            }
            	            break;

            	    }

            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:77: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( ((LA30_0>='\u0000' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFF')) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0=='\\') ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:78: ~ ( '\\'' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:615:93: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG1"

    // $ANTLR start "STRING_LITERAL_LONG2"
    public final void mSTRING_LITERAL_LONG2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:22: ( '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:24: '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); 

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:30: ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0=='\"') ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1=='\"') ) {
                        int LA34_3 = input.LA(3);

                        if ( (LA34_3=='\"') ) {
                            alt34=2;
                        }
                        else if ( ((LA34_3>='\u0000' && LA34_3<='!')||(LA34_3>='#' && LA34_3<='\uFFFF')) ) {
                            alt34=1;
                        }


                    }
                    else if ( ((LA34_1>='\u0000' && LA34_1<='!')||(LA34_1>='#' && LA34_1<='\uFFFF')) ) {
                        alt34=1;
                    }


                }
                else if ( ((LA34_0>='\u0000' && LA34_0<='!')||(LA34_0>='#' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:57: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:57: ( '\"' | '\"\"' )?
            	    int alt32=3;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0=='\"') ) {
            	        int LA32_1 = input.LA(2);

            	        if ( (LA32_1=='\"') ) {
            	            alt32=2;
            	        }
            	        else if ( ((LA32_1>='\u0000' && LA32_1<='!')||(LA32_1>='#' && LA32_1<='\uFFFF')) ) {
            	            alt32=1;
            	        }
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:58: '\"'
            	            {
            	            match('\"'); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:64: '\"\"'
            	            {
            	            match("\"\""); 


            	            }
            	            break;

            	    }

            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:71: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0>='\u0000' && LA33_0<='!')||(LA33_0>='#' && LA33_0<='[')||(LA33_0>=']' && LA33_0<='\uFFFF')) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0=='\\') ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:72: ~ ( '\"' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:617:86: ECHAR
            	            {
            	            mECHAR(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG2"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:620:7: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:620:9: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ECHAR"

    // $ANTLR start "IRI_REF"
    public final void mIRI_REF() throws RecognitionException {
        try {
            int _type = IRI_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:623:5: ( ( LESS 'http' ( IRI_REF_CHARACTERS )+ GREATER ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:623:6: ( LESS 'http' ( IRI_REF_CHARACTERS )+ GREATER )
            {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:623:6: ( LESS 'http' ( IRI_REF_CHARACTERS )+ GREATER )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:623:7: LESS 'http' ( IRI_REF_CHARACTERS )+ GREATER
            {
            mLESS(); 
            match("http"); 

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:623:19: ( IRI_REF_CHARACTERS )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0=='!'||(LA35_0>='#' && LA35_0<=';')||LA35_0=='='||(LA35_0>='?' && LA35_0<='[')||(LA35_0>=']' && LA35_0<='_')||(LA35_0>='a' && LA35_0<='z')||(LA35_0>='~' && LA35_0<='\uFFFF')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:623:20: IRI_REF_CHARACTERS
            	    {
            	    mIRI_REF_CHARACTERS(); 

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            mGREATER(); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IRI_REF"

    // $ANTLR start "IRI_REF_CHARACTERS"
    public final void mIRI_REF_CHARACTERS() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:628:5: (~ ( LESS | GREATER | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:628:7: ~ ( LESS | GREATER | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) )
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "IRI_REF_CHARACTERS"

    // $ANTLR start "PN_CHARS_U"
    public final void mPN_CHARS_U() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:632:12: ( PN_CHARS_BASE | '_' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_U"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:635:9: ( ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:635:11: ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:635:32: ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>='0' && LA36_0<='9')||(LA36_0>='A' && LA36_0<='Z')||LA36_0=='_'||(LA36_0>='a' && LA36_0<='z')||LA36_0=='\u00B7'||(LA36_0>='\u00C0' && LA36_0<='\u00D6')||(LA36_0>='\u00D8' && LA36_0<='\u00F6')||(LA36_0>='\u00F8' && LA36_0<='\u037D')||(LA36_0>='\u037F' && LA36_0<='\u1FFF')||(LA36_0>='\u200C' && LA36_0<='\u200D')||(LA36_0>='\u203F' && LA36_0<='\u2040')||(LA36_0>='\u2070' && LA36_0<='\u218F')||(LA36_0>='\u2C00' && LA36_0<='\u2FEF')||(LA36_0>='\u3001' && LA36_0<='\uD7FF')||(LA36_0>='\uF900' && LA36_0<='\uFDCF')||(LA36_0>='\uFDF0' && LA36_0<='\uFFFD')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:639:5: ( PN_CHARS_U | MINUS | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS"

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:648:11: ( PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:648:13: PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); 
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:648:27: ( ( PN_CHARS | DOT )* PN_CHARS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>='-' && LA38_0<='.')||(LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='z')||LA38_0=='\u00B7'||(LA38_0>='\u00C0' && LA38_0<='\u00D6')||(LA38_0>='\u00D8' && LA38_0<='\u00F6')||(LA38_0>='\u00F8' && LA38_0<='\u037D')||(LA38_0>='\u037F' && LA38_0<='\u1FFF')||(LA38_0>='\u200C' && LA38_0<='\u200D')||(LA38_0>='\u203F' && LA38_0<='\u2040')||(LA38_0>='\u2070' && LA38_0<='\u218F')||(LA38_0>='\u2C00' && LA38_0<='\u2FEF')||(LA38_0>='\u3001' && LA38_0<='\uD7FF')||(LA38_0>='\uF900' && LA38_0<='\uFDCF')||(LA38_0>='\uFDF0' && LA38_0<='\uFFFD')) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:648:28: ( PN_CHARS | DOT )* PN_CHARS
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:648:28: ( PN_CHARS | DOT )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='-'||(LA37_0>='0' && LA37_0<='9')||(LA37_0>='A' && LA37_0<='Z')||LA37_0=='_'||(LA37_0>='a' && LA37_0<='z')||LA37_0=='\u00B7'||(LA37_0>='\u00C0' && LA37_0<='\u00D6')||(LA37_0>='\u00D8' && LA37_0<='\u00F6')||(LA37_0>='\u00F8' && LA37_0<='\u037D')||(LA37_0>='\u037F' && LA37_0<='\u1FFF')||(LA37_0>='\u200C' && LA37_0<='\u200D')||(LA37_0>='\u203F' && LA37_0<='\u2040')||(LA37_0>='\u2070' && LA37_0<='\u218F')||(LA37_0>='\u2C00' && LA37_0<='\u2FEF')||(LA37_0>='\u3001' && LA37_0<='\uD7FF')||(LA37_0>='\uF900' && LA37_0<='\uFDCF')||(LA37_0>='\uFDF0' && LA37_0<='\uFFFD')) ) {
                            int LA37_1 = input.LA(2);

                            if ( ((LA37_1>='-' && LA37_1<='.')||(LA37_1>='0' && LA37_1<='9')||(LA37_1>='A' && LA37_1<='Z')||LA37_1=='_'||(LA37_1>='a' && LA37_1<='z')||LA37_1=='\u00B7'||(LA37_1>='\u00C0' && LA37_1<='\u00D6')||(LA37_1>='\u00D8' && LA37_1<='\u00F6')||(LA37_1>='\u00F8' && LA37_1<='\u037D')||(LA37_1>='\u037F' && LA37_1<='\u1FFF')||(LA37_1>='\u200C' && LA37_1<='\u200D')||(LA37_1>='\u203F' && LA37_1<='\u2040')||(LA37_1>='\u2070' && LA37_1<='\u218F')||(LA37_1>='\u2C00' && LA37_1<='\u2FEF')||(LA37_1>='\u3001' && LA37_1<='\uD7FF')||(LA37_1>='\uF900' && LA37_1<='\uFDCF')||(LA37_1>='\uFDF0' && LA37_1<='\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0=='.') ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    mPN_CHARS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_PREFIX"

    // $ANTLR start "PN_LOCAL"
    public final void mPN_LOCAL() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:651:10: ( ( PN_CHARS_U | DIGIT ) ( ( PN_CHARS | DOT )* PN_CHARS )? )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:651:12: ( PN_CHARS_U | DIGIT ) ( ( PN_CHARS | DOT )* PN_CHARS )?
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:651:32: ( ( PN_CHARS | DOT )* PN_CHARS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>='-' && LA40_0<='.')||(LA40_0>='0' && LA40_0<='9')||(LA40_0>='A' && LA40_0<='Z')||LA40_0=='_'||(LA40_0>='a' && LA40_0<='z')||LA40_0=='\u00B7'||(LA40_0>='\u00C0' && LA40_0<='\u00D6')||(LA40_0>='\u00D8' && LA40_0<='\u00F6')||(LA40_0>='\u00F8' && LA40_0<='\u037D')||(LA40_0>='\u037F' && LA40_0<='\u1FFF')||(LA40_0>='\u200C' && LA40_0<='\u200D')||(LA40_0>='\u203F' && LA40_0<='\u2040')||(LA40_0>='\u2070' && LA40_0<='\u218F')||(LA40_0>='\u2C00' && LA40_0<='\u2FEF')||(LA40_0>='\u3001' && LA40_0<='\uD7FF')||(LA40_0>='\uF900' && LA40_0<='\uFDCF')||(LA40_0>='\uFDF0' && LA40_0<='\uFFFD')) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:651:33: ( PN_CHARS | DOT )* PN_CHARS
                    {
                    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:651:33: ( PN_CHARS | DOT )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='-'||(LA39_0>='0' && LA39_0<='9')||(LA39_0>='A' && LA39_0<='Z')||LA39_0=='_'||(LA39_0>='a' && LA39_0<='z')||LA39_0=='\u00B7'||(LA39_0>='\u00C0' && LA39_0<='\u00D6')||(LA39_0>='\u00D8' && LA39_0<='\u00F6')||(LA39_0>='\u00F8' && LA39_0<='\u037D')||(LA39_0>='\u037F' && LA39_0<='\u1FFF')||(LA39_0>='\u200C' && LA39_0<='\u200D')||(LA39_0>='\u203F' && LA39_0<='\u2040')||(LA39_0>='\u2070' && LA39_0<='\u218F')||(LA39_0>='\u2C00' && LA39_0<='\u2FEF')||(LA39_0>='\u3001' && LA39_0<='\uD7FF')||(LA39_0>='\uF900' && LA39_0<='\uFDCF')||(LA39_0>='\uFDF0' && LA39_0<='\uFFFD')) ) {
                            int LA39_1 = input.LA(2);

                            if ( ((LA39_1>='-' && LA39_1<='.')||(LA39_1>='0' && LA39_1<='9')||(LA39_1>='A' && LA39_1<='Z')||LA39_1=='_'||(LA39_1>='a' && LA39_1<='z')||LA39_1=='\u00B7'||(LA39_1>='\u00C0' && LA39_1<='\u00D6')||(LA39_1>='\u00D8' && LA39_1<='\u00F6')||(LA39_1>='\u00F8' && LA39_1<='\u037D')||(LA39_1>='\u037F' && LA39_1<='\u1FFF')||(LA39_1>='\u200C' && LA39_1<='\u200D')||(LA39_1>='\u203F' && LA39_1<='\u2040')||(LA39_1>='\u2070' && LA39_1<='\u218F')||(LA39_1>='\u2C00' && LA39_1<='\u2FEF')||(LA39_1>='\u3001' && LA39_1<='\uD7FF')||(LA39_1>='\uF900' && LA39_1<='\uFDCF')||(LA39_1>='\uFDF0' && LA39_1<='\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0=='.') ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:651:34: PN_CHARS
                    	    {
                    	    mPN_CHARS(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:651:43: DOT
                    	    {
                    	        
                    	                        	                       if (input.LA(1)=='.') {
                    	                        	                          int LA2 = input.LA(2);
                    	                        	       	                  if (!((LA2>='-' && LA2<='.')||(LA2>='0' && LA2<='9')||(LA2>='A' && LA2<='Z')||LA2=='_'||(LA2>='a' && LA2<='z')||LA2=='\u00B7'||(LA2>='\u00C0' && LA2<='\u00D6')||(LA2>='\u00D8' && LA2<='\u00F6')||(LA2>='\u00F8' && LA2<='\u037D')||(LA2>='\u037F' && LA2<='\u1FFF')||(LA2>='\u200C' && LA2<='\u200D')||(LA2>='\u203F' && LA2<='\u2040')||(LA2>='\u2070' && LA2<='\u218F')||(LA2>='\u2C00' && LA2<='\u2FEF')||(LA2>='\u3001' && LA2<='\uD7FF')||(LA2>='\uF900' && LA2<='\uFDCF')||(LA2>='\uFDF0' && LA2<='\uFFFD'))) {
                    	                        	       	                     return;
                    	                        	       	                  }
                    	                        	                       }
                    	                                               
                    	    mDOT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    mPN_CHARS(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_LOCAL"

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:662:5: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_BASE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:678:7: ( '0' .. '9' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:678:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:680:9: ( '#' ( options {greedy=false; } : . )* EOL )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:680:11: '#' ( options {greedy=false; } : . )* EOL
            {
            match('#'); 
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:680:15: ( options {greedy=false; } : . )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0=='\n'||LA41_0=='\r') ) {
                    alt41=2;
                }
                else if ( ((LA41_0>='\u0000' && LA41_0<='\t')||(LA41_0>='\u000B' && LA41_0<='\f')||(LA41_0>='\u000E' && LA41_0<='\uFFFF')) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:680:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            mEOL(); 
             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:683:5: ( '\\n' | '\\r' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "REFERENCE"
    public final void mREFERENCE() throws RecognitionException {
        try {
            int _type = REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:685:11: ( '^^' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:685:13: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCE"

    // $ANTLR start "LESS_EQUAL"
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:687:12: ( '<=' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:687:14: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_EQUAL"

    // $ANTLR start "GREATER_EQUAL"
    public final void mGREATER_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:689:15: ( '>=' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:689:17: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:691:11: ( '!=' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:691:13: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "SIGN"
    public final void mSIGN() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:696:6: ( ( PLUS | MINUS ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:696:8: ( PLUS | MINUS )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIGN"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:698:10: ( '*' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:698:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:700:15: ( '?' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:700:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:702:7: ( ',' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:702:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "NEGATION"
    public final void mNEGATION() throws RecognitionException {
        try {
            int _type = NEGATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:704:10: ( '!' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:704:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEGATION"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:706:8: ( '/' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:706:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:708:7: ( '=' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:708:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LEFT_ARROW"
    public final void mLEFT_ARROW() throws RecognitionException {
        try {
            int _type = LEFT_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:710:12: ( '<-' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:710:14: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_ARROW"

    // $ANTLR start "RIGHT_ARROW"
    public final void mRIGHT_ARROW() throws RecognitionException {
        try {
            int _type = RIGHT_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:712:13: ( '->' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:712:15: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_ARROW"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:714:6: ( '<' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:714:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:716:9: ( '>' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:716:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:718:6: ( '|' )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:718:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:720:5: ( . )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:720:7: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:722:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:722:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:723:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:723:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:723:16: ( LETTER | DIGIT )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='0' && LA42_0<='9')||(LA42_0>='A' && LA42_0<='Z')||LA42_0=='_'||(LA42_0>='a' && LA42_0<='z')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:8: ( T__151 | T__152 | RESSOURCE | GRAPH | WS | SELECT | PREFIX | CONSTRUCT | DISTINCT | FROM | NAMED | WHERE | OPTIONAL | FILTER | A | USING | AS | HAVING | IRI | URI | ABS | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | WITH | NOW | IF | ELSE | THEN | TRUE | FALSE | SEQUENCE | NOT | IN | GROUP | BY | STATIC | EXISTS | TEMPORAL | ABOX | TBOX | CREATE | OPERATOR | EQUALS | AGGREGATE | START | END | STREAM | PULSE | FREQUENCY | FORALL | AND | OR | OPEN_BRACE | CLOSE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | OPEN_SQUARE_BRACKET | CLOSE_SQUARE_BRACKET | SEMICOLON | DOT | PLUS | MINUS | PNAME_NS | PNAME_LN | VAR_VALUE | VAR_INDEX | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | IRI_REF | COMMENT | REFERENCE | LESS_EQUAL | GREATER_EQUAL | NOT_EQUAL | ASTERISK | QUESTION_MARK | COMMA | NEGATION | DIVIDE | EQUAL | LEFT_ARROW | RIGHT_ARROW | LESS | GREATER | PIPE | ANY | IDENT )
        int alt43=103;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:10: T__151
                {
                mT__151(); 

                }
                break;
            case 2 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:17: T__152
                {
                mT__152(); 

                }
                break;
            case 3 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:24: RESSOURCE
                {
                mRESSOURCE(); 

                }
                break;
            case 4 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:34: GRAPH
                {
                mGRAPH(); 

                }
                break;
            case 5 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:40: WS
                {
                mWS(); 

                }
                break;
            case 6 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:43: SELECT
                {
                mSELECT(); 

                }
                break;
            case 7 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:50: PREFIX
                {
                mPREFIX(); 

                }
                break;
            case 8 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:57: CONSTRUCT
                {
                mCONSTRUCT(); 

                }
                break;
            case 9 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:67: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 10 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:76: FROM
                {
                mFROM(); 

                }
                break;
            case 11 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:81: NAMED
                {
                mNAMED(); 

                }
                break;
            case 12 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:87: WHERE
                {
                mWHERE(); 

                }
                break;
            case 13 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:93: OPTIONAL
                {
                mOPTIONAL(); 

                }
                break;
            case 14 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:102: FILTER
                {
                mFILTER(); 

                }
                break;
            case 15 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:109: A
                {
                mA(); 

                }
                break;
            case 16 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:111: USING
                {
                mUSING(); 

                }
                break;
            case 17 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:117: AS
                {
                mAS(); 

                }
                break;
            case 18 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:120: HAVING
                {
                mHAVING(); 

                }
                break;
            case 19 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:127: IRI
                {
                mIRI(); 

                }
                break;
            case 20 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:131: URI
                {
                mURI(); 

                }
                break;
            case 21 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:135: ABS
                {
                mABS(); 

                }
                break;
            case 22 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:139: YEAR
                {
                mYEAR(); 

                }
                break;
            case 23 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:144: MONTH
                {
                mMONTH(); 

                }
                break;
            case 24 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:150: DAY
                {
                mDAY(); 

                }
                break;
            case 25 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:154: HOURS
                {
                mHOURS(); 

                }
                break;
            case 26 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:160: MINUTES
                {
                mMINUTES(); 

                }
                break;
            case 27 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:168: SECONDS
                {
                mSECONDS(); 

                }
                break;
            case 28 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:176: WITH
                {
                mWITH(); 

                }
                break;
            case 29 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:181: NOW
                {
                mNOW(); 

                }
                break;
            case 30 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:185: IF
                {
                mIF(); 

                }
                break;
            case 31 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:188: ELSE
                {
                mELSE(); 

                }
                break;
            case 32 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:193: THEN
                {
                mTHEN(); 

                }
                break;
            case 33 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:198: TRUE
                {
                mTRUE(); 

                }
                break;
            case 34 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:203: FALSE
                {
                mFALSE(); 

                }
                break;
            case 35 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:209: SEQUENCE
                {
                mSEQUENCE(); 

                }
                break;
            case 36 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:218: NOT
                {
                mNOT(); 

                }
                break;
            case 37 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:222: IN
                {
                mIN(); 

                }
                break;
            case 38 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:225: GROUP
                {
                mGROUP(); 

                }
                break;
            case 39 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:231: BY
                {
                mBY(); 

                }
                break;
            case 40 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:234: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 41 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:241: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 42 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:248: TEMPORAL
                {
                mTEMPORAL(); 

                }
                break;
            case 43 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:257: ABOX
                {
                mABOX(); 

                }
                break;
            case 44 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:262: TBOX
                {
                mTBOX(); 

                }
                break;
            case 45 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:267: CREATE
                {
                mCREATE(); 

                }
                break;
            case 46 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:274: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 47 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:283: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 48 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:290: AGGREGATE
                {
                mAGGREGATE(); 

                }
                break;
            case 49 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:300: START
                {
                mSTART(); 

                }
                break;
            case 50 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:306: END
                {
                mEND(); 

                }
                break;
            case 51 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:310: STREAM
                {
                mSTREAM(); 

                }
                break;
            case 52 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:317: PULSE
                {
                mPULSE(); 

                }
                break;
            case 53 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:323: FREQUENCY
                {
                mFREQUENCY(); 

                }
                break;
            case 54 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:333: FORALL
                {
                mFORALL(); 

                }
                break;
            case 55 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:340: AND
                {
                mAND(); 

                }
                break;
            case 56 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:344: OR
                {
                mOR(); 

                }
                break;
            case 57 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:347: OPEN_BRACE
                {
                mOPEN_BRACE(); 

                }
                break;
            case 58 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:358: CLOSE_BRACE
                {
                mCLOSE_BRACE(); 

                }
                break;
            case 59 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:370: OPEN_CURLY_BRACE
                {
                mOPEN_CURLY_BRACE(); 

                }
                break;
            case 60 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:387: CLOSE_CURLY_BRACE
                {
                mCLOSE_CURLY_BRACE(); 

                }
                break;
            case 61 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:405: OPEN_SQUARE_BRACKET
                {
                mOPEN_SQUARE_BRACKET(); 

                }
                break;
            case 62 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:425: CLOSE_SQUARE_BRACKET
                {
                mCLOSE_SQUARE_BRACKET(); 

                }
                break;
            case 63 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:446: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 64 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:456: DOT
                {
                mDOT(); 

                }
                break;
            case 65 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:460: PLUS
                {
                mPLUS(); 

                }
                break;
            case 66 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:465: MINUS
                {
                mMINUS(); 

                }
                break;
            case 67 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:471: PNAME_NS
                {
                mPNAME_NS(); 

                }
                break;
            case 68 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:480: PNAME_LN
                {
                mPNAME_LN(); 

                }
                break;
            case 69 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:489: VAR_VALUE
                {
                mVAR_VALUE(); 

                }
                break;
            case 70 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:499: VAR_INDEX
                {
                mVAR_INDEX(); 

                }
                break;
            case 71 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:509: LANGTAG
                {
                mLANGTAG(); 

                }
                break;
            case 72 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:517: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 73 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:525: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 74 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:533: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 75 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:540: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); 

                }
                break;
            case 76 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:557: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); 

                }
                break;
            case 77 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:574: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); 

                }
                break;
            case 78 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:590: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); 

                }
                break;
            case 79 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:607: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); 

                }
                break;
            case 80 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:624: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); 

                }
                break;
            case 81 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:640: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); 

                }
                break;
            case 82 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:656: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 

                }
                break;
            case 83 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:672: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); 

                }
                break;
            case 84 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:693: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); 

                }
                break;
            case 85 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:714: IRI_REF
                {
                mIRI_REF(); 

                }
                break;
            case 86 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:722: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 87 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:730: REFERENCE
                {
                mREFERENCE(); 

                }
                break;
            case 88 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:740: LESS_EQUAL
                {
                mLESS_EQUAL(); 

                }
                break;
            case 89 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:751: GREATER_EQUAL
                {
                mGREATER_EQUAL(); 

                }
                break;
            case 90 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:765: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 91 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:775: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 92 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:784: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 93 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:798: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 94 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:804: NEGATION
                {
                mNEGATION(); 

                }
                break;
            case 95 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:813: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 96 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:820: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 97 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:826: LEFT_ARROW
                {
                mLEFT_ARROW(); 

                }
                break;
            case 98 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:837: RIGHT_ARROW
                {
                mRIGHT_ARROW(); 

                }
                break;
            case 99 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:849: LESS
                {
                mLESS(); 

                }
                break;
            case 100 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:854: GREATER
                {
                mGREATER(); 

                }
                break;
            case 101 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:862: PIPE
                {
                mPIPE(); 

                }
                break;
            case 102 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:867: ANY
                {
                mANY(); 

                }
                break;
            case 103 :
                // C:\\Users\\Christian\\Dropbox\\ANTLER 3.x\\src\\com\\antlr\\Starql.g:1:871: IDENT
                {
                mIDENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA15_eotS =
        "\1\uffff\1\2\2\uffff";
    static final String DFA15_eofS =
        "\4\uffff";
    static final String DFA15_minS =
        "\2\60\2\uffff";
    static final String DFA15_maxS =
        "\1\71\1\136\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\12\1",
            "\12\1\44\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "583:11: ( ( DIGIT )+ | ( DIGIT )+ '^' ( DIGIT )+ )";
        }
    }
    static final String DFA24_eotS =
        "\5\uffff";
    static final String DFA24_eofS =
        "\5\uffff";
    static final String DFA24_minS =
        "\2\56\3\uffff";
    static final String DFA24_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA24_specialS =
        "\5\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "590:1: DOUBLE : ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT );";
        }
    }
    static final String DFA43_eotS =
        "\1\uffff\1\110\1\105\2\115\1\uffff\1\126\2\115\1\135\4\115\1\154"+
        "\1\115\1\105\1\161\2\115\1\170\3\115\7\uffff\1\u0089\1\u008b\1\u008f"+
        "\1\115\1\u0092\1\u0094\2\105\1\126\2\105\1\135\5\105\1\161\2\105"+
        "\1\170\5\105\1\u0097\2\105\1\u00a1\2\105\1\u00a6\1\u00a8\5\uffff"+
        "\1\105\4\uffff\1\112\1\115\1\uffff\1\112\2\uffff\1\u0092\1\112\1"+
        "\uffff\2\112\1\uffff\6\112\1\uffff\11\112\1\u00c7\1\u00c8\3\112"+
        "\1\uffff\4\112\1\uffff\1\112\1\u00d2\1\u00d3\3\112\1\uffff\10\112"+
        "\1\u00df\10\uffff\1\u00e0\1\uffff\1\u00e1\3\uffff\1\u00e5\7\uffff"+
        "\1\u00e0\1\u0097\1\uffff\1\u009c\1\uffff\1\u009e\17\uffff\15\112"+
        "\1\135\6\112\1\u0100\1\u0101\4\112\2\uffff\1\u0106\2\112\1\u0109"+
        "\1\112\1\u010b\2\112\1\u010e\2\uffff\6\112\1\u0115\4\112\3\uffff"+
        "\1\u011a\1\uffff\1\u011a\2\uffff\2\u011c\1\u00e0\2\uffff\16\112"+
        "\1\u012c\5\112\2\uffff\1\112\1\u0133\2\112\1\uffff\1\u0136\1\112"+
        "\1\uffff\1\112\1\uffff\2\112\1\uffff\1\u013b\2\112\1\u013e\2\112"+
        "\1\uffff\1\u0141\1\u0142\1\112\1\u0144\1\uffff\1\u011a\1\uffff\1"+
        "\u011c\1\112\1\u0146\1\u0147\4\112\1\u014c\2\112\1\u014f\3\112\1"+
        "\uffff\2\112\1\u0155\1\112\1\u0157\1\u0158\1\uffff\2\112\1\uffff"+
        "\1\112\1\u015c\1\112\1\161\1\uffff\1\u015e\1\112\1\uffff\2\112\2"+
        "\uffff\1\112\1\uffff\1\112\2\uffff\1\u0164\2\112\1\u0167\1\uffff"+
        "\1\u0168\1\u0169\1\uffff\1\112\1\u016b\2\112\1\u016e\1\uffff\1\u016f"+
        "\2\uffff\3\112\1\uffff\1\u0173\1\uffff\1\112\1\u0175\1\u0176\2\112"+
        "\1\uffff\1\126\1\112\3\uffff\1\112\1\uffff\2\112\2\uffff\3\112\1"+
        "\uffff\1\170\2\uffff\2\112\1\u0182\1\112\1\u0184\1\112\1\u0186\1"+
        "\u0187\1\112\1\u0189\1\u018a\1\uffff\1\u018b\1\uffff\1\u018c\2\uffff"+
        "\1\u018d\5\uffff";
    static final String DFA43_eofS =
        "\u018e\uffff";
    static final String DFA43_minS =
        "\1\0\1\137\1\60\2\55\1\uffff\22\55\7\uffff\1\60\2\56\1\55\2\60"+
        "\23\55\1\101\1\56\2\0\1\55\1\0\1\136\2\75\5\uffff\1\55\4\uffff\2"+
        "\55\1\uffff\3\55\1\60\1\55\1\uffff\2\55\1\uffff\6\55\1\uffff\16"+
        "\55\1\uffff\4\55\1\uffff\6\55\1\uffff\11\55\10\uffff\1\60\1\uffff"+
        "\1\56\1\60\2\uffff\1\56\1\60\6\uffff\1\60\1\56\1\uffff\1\47\1\uffff"+
        "\1\42\17\uffff\32\55\2\uffff\11\55\2\uffff\13\55\3\uffff\1\60\1"+
        "\uffff\1\60\2\uffff\3\60\2\uffff\24\55\2\uffff\4\55\1\uffff\2\55"+
        "\1\uffff\1\55\1\uffff\2\55\1\uffff\6\55\1\uffff\4\55\1\uffff\1\60"+
        "\1\uffff\1\60\16\55\1\uffff\6\55\1\uffff\2\55\1\uffff\4\55\1\uffff"+
        "\2\55\1\uffff\2\55\2\uffff\1\55\1\uffff\1\55\2\uffff\4\55\1\uffff"+
        "\2\55\1\uffff\5\55\1\uffff\1\55\2\uffff\3\55\1\uffff\1\55\1\uffff"+
        "\5\55\1\uffff\2\55\3\uffff\1\55\1\uffff\2\55\2\uffff\3\55\1\uffff"+
        "\1\55\2\uffff\13\55\1\uffff\1\55\1\uffff\1\55\2\uffff\1\55\5\uffff";
    static final String DFA43_maxS =
        "\1\uffff\1\137\1\174\2\ufffd\1\uffff\22\ufffd\7\uffff\2\71\1\76"+
        "\26\ufffd\1\172\1\145\2\uffff\1\150\1\uffff\1\136\2\75\5\uffff\1"+
        "\ufffd\4\uffff\2\ufffd\1\uffff\5\ufffd\1\uffff\2\ufffd\1\uffff\6"+
        "\ufffd\1\uffff\16\ufffd\1\uffff\4\ufffd\1\uffff\6\ufffd\1\uffff"+
        "\11\ufffd\10\uffff\1\145\1\uffff\1\145\1\71\2\uffff\1\145\1\71\6"+
        "\uffff\2\145\1\uffff\1\47\1\uffff\1\42\17\uffff\32\ufffd\2\uffff"+
        "\11\ufffd\2\uffff\13\ufffd\3\uffff\1\145\1\uffff\1\145\2\uffff\3"+
        "\145\2\uffff\24\ufffd\2\uffff\4\ufffd\1\uffff\2\ufffd\1\uffff\1"+
        "\ufffd\1\uffff\2\ufffd\1\uffff\6\ufffd\1\uffff\4\ufffd\1\uffff\1"+
        "\145\1\uffff\1\145\16\ufffd\1\uffff\6\ufffd\1\uffff\2\ufffd\1\uffff"+
        "\4\ufffd\1\uffff\2\ufffd\1\uffff\2\ufffd\2\uffff\1\ufffd\1\uffff"+
        "\1\ufffd\2\uffff\4\ufffd\1\uffff\2\ufffd\1\uffff\5\ufffd\1\uffff"+
        "\1\ufffd\2\uffff\3\ufffd\1\uffff\1\ufffd\1\uffff\5\ufffd\1\uffff"+
        "\2\ufffd\3\uffff\1\ufffd\1\uffff\2\ufffd\2\uffff\3\ufffd\1\uffff"+
        "\1\ufffd\2\uffff\13\ufffd\1\uffff\1\ufffd\1\uffff\1\ufffd\2\uffff"+
        "\1\ufffd\5\uffff";
    static final String DFA43_acceptS =
        "\5\uffff\1\5\22\uffff\1\71\1\72\1\73\1\74\1\75\1\76\1\77\42\uffff"+
        "\1\133\1\135\1\137\1\140\1\146\1\uffff\1\1\1\145\1\2\1\147\2\uffff"+
        "\1\106\5\uffff\1\5\2\uffff\1\33\6\uffff\1\30\16\uffff\1\17\4\uffff"+
        "\1\31\6\uffff\1\32\11\uffff\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1"+
        "\100\1\uffff\1\101\2\uffff\1\142\1\102\2\uffff\1\103\1\104\1\134"+
        "\1\105\1\107\1\110\2\uffff\1\112\1\uffff\1\121\1\uffff\1\122\1\130"+
        "\1\141\1\143\1\125\1\126\1\127\1\131\1\144\1\132\1\136\1\133\1\135"+
        "\1\137\1\140\32\uffff\1\70\1\21\11\uffff\1\36\1\45\13\uffff\1\47"+
        "\1\111\1\113\1\uffff\1\115\1\uffff\1\116\1\120\3\uffff\1\123\1\124"+
        "\24\uffff\1\35\1\44\4\uffff\1\25\2\uffff\1\67\1\uffff\1\24\2\uffff"+
        "\1\23\6\uffff\1\62\4\uffff\1\114\1\uffff\1\117\17\uffff\1\12\6\uffff"+
        "\1\34\2\uffff\1\53\4\uffff\1\26\2\uffff\1\37\2\uffff\1\40\1\41\1"+
        "\uffff\1\54\1\uffff\1\4\1\46\4\uffff\1\61\2\uffff\1\64\5\uffff\1"+
        "\42\1\uffff\1\13\1\14\3\uffff\1\20\1\uffff\1\27\5\uffff\1\6\2\uffff"+
        "\1\50\1\63\1\7\1\uffff\1\55\2\uffff\1\16\1\66\3\uffff\1\22\1\uffff"+
        "\1\51\1\57\13\uffff\1\43\1\uffff\1\11\1\uffff\1\15\1\56\1\uffff"+
        "\1\52\1\3\1\10\1\65\1\60";
    static final String DFA43_specialS =
        "\1\0\71\uffff\1\1\1\3\1\uffff\1\2\u0150\uffff}>";
    static final String[] DFA43_transitionS = {
            "\11\105\2\5\2\105\1\5\22\105\1\5\1\100\1\73\1\75\3\105\1\72"+
            "\1\30\1\31\1\101\1\40\1\102\1\41\1\37\1\103\12\71\1\43\1\36"+
            "\1\74\1\104\1\77\1\44\1\70\1\20\1\66\1\51\1\52\1\64\1\53\1\46"+
            "\1\60\1\61\3\67\1\63\1\54\1\56\1\50\1\67\1\45\1\47\1\65\1\57"+
            "\1\67\1\55\1\67\1\62\1\67\1\34\1\105\1\35\1\76\1\2\1\105\1\16"+
            "\1\27\1\10\1\11\1\25\1\12\1\4\1\21\1\22\3\42\1\24\1\13\1\15"+
            "\1\7\1\42\1\3\1\6\1\26\1\17\1\42\1\14\1\42\1\23\1\42\1\32\1"+
            "\1\1\33\102\105\27\106\1\105\37\106\1\105\u0208\106\160\105"+
            "\16\106\1\105\u1c81\106\14\105\2\106\142\105\u0120\106\u0a70"+
            "\105\u03f0\106\21\105\ua7ff\106\u2100\105\u04d0\106\40\105\u020e"+
            "\106\2\105",
            "\1\107",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112\1\uffff"+
            "\1\111",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\4\116\1\113\25\116"+
            "\4\uffff\1\116\1\uffff\4\116\1\113\25\116\74\uffff\1\117\10"+
            "\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\21\116\1\122\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\122\10\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\4\116\1\124\16\116"+
            "\1\125\6\116\4\uffff\1\116\1\uffff\4\116\1\124\16\116\1\125"+
            "\6\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\21\116\1\127\2\116"+
            "\1\130\5\116\4\uffff\1\116\1\uffff\21\116\1\127\2\116\1\130"+
            "\5\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\16\116\1\131\2\116"+
            "\1\132\10\116\4\uffff\1\116\1\uffff\16\116\1\131\2\116\1\132"+
            "\10\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\1\134\7\116\1\133"+
            "\21\116\4\uffff\1\116\1\uffff\1\134\7\116\1\133\21\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\1\140\7\116\1\137"+
            "\5\116\1\141\2\116\1\136\10\116\4\uffff\1\116\1\uffff\1\140"+
            "\7\116\1\137\5\116\1\141\2\116\1\136\10\116\74\uffff\1\117\10"+
            "\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\1\142\15\116\1\143"+
            "\13\116\4\uffff\1\116\1\uffff\1\142\15\116\1\143\13\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\7\116\1\144\1\145"+
            "\21\116\4\uffff\1\116\1\uffff\7\116\1\144\1\145\21\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\17\116\1\146\1\116"+
            "\1\147\10\116\4\uffff\1\116\1\uffff\17\116\1\146\1\116\1\147"+
            "\10\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\1\116\1\151\4\116"+
            "\1\152\6\116\1\153\4\116\1\150\7\116\4\uffff\1\116\1\uffff\1"+
            "\116\1\151\4\116\1\152\6\116\1\153\4\116\1\150\7\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\21\116\1\156\1\155"+
            "\7\116\4\uffff\1\116\1\uffff\21\116\1\156\1\155\7\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\116\1\151\4\116"+
            "\1\152\6\116\1\153\4\116\1\150\7\116\4\uffff\1\116\1\uffff\1"+
            "\116\1\151\4\116\1\152\6\116\1\153\4\116\1\150\7\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\1\157\15\116\1\160"+
            "\13\116\4\uffff\1\116\1\uffff\1\157\15\116\1\160\13\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\5\116\1\163\7\116"+
            "\1\164\3\116\1\162\10\116\4\uffff\1\116\1\uffff\5\116\1\163"+
            "\7\116\1\164\3\116\1\162\10\116\74\uffff\1\117\10\uffff\27\117"+
            "\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff"+
            "\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117"+
            "\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\4\116\1\165\25\116"+
            "\4\uffff\1\116\1\uffff\4\116\1\165\25\116\74\uffff\1\117\10"+
            "\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\10\116\1\167\5\116"+
            "\1\166\13\116\4\uffff\1\116\1\uffff\10\116\1\167\5\116\1\166"+
            "\13\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\13\116\1\171\1\116"+
            "\1\174\2\116\1\173\6\116\1\172\2\116\4\uffff\1\116\1\uffff\13"+
            "\116\1\171\1\116\1\174\2\116\1\173\6\116\1\172\2\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\1\116\1\u0080\2"+
            "\116\1\177\2\116\1\175\11\116\1\176\10\116\4\uffff\1\116\1\uffff"+
            "\1\116\1\u0080\2\116\1\177\2\116\1\175\11\116\1\176\10\116\74"+
            "\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117"+
            "\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120"+
            "\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\30\116\1\u0081\1"+
            "\116\4\uffff\1\116\1\uffff\30\116\1\u0081\1\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u008a",
            "\1\u008d\1\uffff\12\u008c",
            "\1\u0091\1\uffff\12\u0090\4\uffff\1\u008e",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\12\u0093\7\uffff\32\u0093\4\uffff\1\u0093\1\uffff\32\u0093"+
            "\105\uffff\27\u0093\1\uffff\37\u0093\1\uffff\u0208\u0093\160"+
            "\uffff\16\u0093\1\uffff\u1c81\u0093\14\uffff\2\u0093\142\uffff"+
            "\u0120\u0093\u0a70\uffff\u03f0\u0093\21\uffff\ua7ff\u0093\u2100"+
            "\uffff\u04d0\u0093\40\uffff\u020e\u0093",
            "\12\u0095\7\uffff\32\u0095\4\uffff\1\u0095\1\uffff\32\u0095"+
            "\105\uffff\27\u0095\1\uffff\37\u0095\1\uffff\u0208\u0095\160"+
            "\uffff\16\u0095\1\uffff\u1c81\u0095\14\uffff\2\u0095\142\uffff"+
            "\u0120\u0095\u0a70\uffff\u03f0\u0095\21\uffff\ua7ff\u0095\u2100"+
            "\uffff\u04d0\u0095\40\uffff\u020e\u0095",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\113\25\116"+
            "\4\uffff\1\116\1\uffff\4\116\1\113\25\116\74\uffff\1\117\10"+
            "\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\122\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\122\10\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\124\16\116"+
            "\1\125\6\116\4\uffff\1\116\1\uffff\4\116\1\124\16\116\1\125"+
            "\6\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\127\2\116"+
            "\1\130\5\116\4\uffff\1\116\1\uffff\21\116\1\127\2\116\1\130"+
            "\5\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\131\2\116"+
            "\1\132\10\116\4\uffff\1\116\1\uffff\16\116\1\131\2\116\1\132"+
            "\10\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\134\7\116\1\133"+
            "\21\116\4\uffff\1\116\1\uffff\1\134\7\116\1\133\21\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\140\7\116\1\137"+
            "\5\116\1\141\2\116\1\136\10\116\4\uffff\1\116\1\uffff\1\140"+
            "\7\116\1\137\5\116\1\141\2\116\1\136\10\116\74\uffff\1\117\10"+
            "\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\142\15\116\1\143"+
            "\13\116\4\uffff\1\116\1\uffff\1\142\15\116\1\143\13\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\7\116\1\144\1\145"+
            "\21\116\4\uffff\1\116\1\uffff\7\116\1\144\1\145\21\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\17\116\1\146\1\116"+
            "\1\147\10\116\4\uffff\1\116\1\uffff\17\116\1\146\1\116\1\147"+
            "\10\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\156\1\155"+
            "\7\116\4\uffff\1\116\1\uffff\21\116\1\156\1\155\7\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\157\15\116\1\160"+
            "\13\116\4\uffff\1\116\1\uffff\1\157\15\116\1\160\13\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\5\116\1\163\7\116"+
            "\1\164\3\116\1\162\10\116\4\uffff\1\116\1\uffff\5\116\1\163"+
            "\7\116\1\164\3\116\1\162\10\116\74\uffff\1\117\10\uffff\27\117"+
            "\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff"+
            "\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117"+
            "\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\165\25\116"+
            "\4\uffff\1\116\1\uffff\4\116\1\165\25\116\74\uffff\1\117\10"+
            "\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\167\5\116"+
            "\1\166\13\116\4\uffff\1\116\1\uffff\10\116\1\167\5\116\1\166"+
            "\13\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff"+
            "\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57"+
            "\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100"+
            "\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\171\1\116"+
            "\1\174\2\116\1\173\6\116\1\172\2\116\4\uffff\1\116\1\uffff\13"+
            "\116\1\171\1\116\1\174\2\116\1\173\6\116\1\172\2\116\74\uffff"+
            "\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\116\1\u0080\2"+
            "\116\1\177\2\116\1\175\11\116\1\176\10\116\4\uffff\1\116\1\uffff"+
            "\1\116\1\u0080\2\116\1\177\2\116\1\175\11\116\1\176\10\116\74"+
            "\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117"+
            "\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120"+
            "\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\30\116\1\u0081\1"+
            "\116\4\uffff\1\116\1\uffff\30\116\1\u0081\1\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\32\u0096\6\uffff\32\u0096",
            "\1\u0098\1\uffff\12\u0099\13\uffff\1\u009a\37\uffff\1\u009a",
            "\12\u009c\1\uffff\2\u009c\1\uffff\31\u009c\1\u009b\uffd8\u009c",
            "\12\u009e\1\uffff\2\u009e\1\uffff\24\u009e\1\u009d\uffdd\u009e",
            "\1\u00a0\17\uffff\1\u009f\52\uffff\1\u00a2",
            "\0\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a7",
            "",
            "",
            "",
            "",
            "",
            "\1\117\1\120\1\uffff\12\117\1\121\6\uffff\32\117\4\uffff\1"+
            "\117\1\uffff\32\117\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u00ad\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u00ad\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\114\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\117\1\121\6\uffff\32\117\4\uffff\1"+
            "\117\1\uffff\32\117\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\117\7\uffff\32\117\4\uffff\1\117\1"+
            "\uffff\32\117\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117"+
            "\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\12\u0093\7\uffff\32\u0093\4\uffff\1\u0093\1\uffff\32\u0093"+
            "\105\uffff\27\u0093\1\uffff\37\u0093\1\uffff\u0208\u0093\160"+
            "\uffff\16\u0093\1\uffff\u1c81\u0093\14\uffff\2\u0093\142\uffff"+
            "\u0120\u0093\u0a70\uffff\u03f0\u0093\21\uffff\ua7ff\u0093\u2100"+
            "\uffff\u04d0\u0093\40\uffff\u020e\u0093",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u00ae\15\116\1"+
            "\u00af\13\116\4\uffff\1\116\1\uffff\1\u00ae\15\116\1\u00af\13"+
            "\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286"+
            "\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff"+
            "\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff"+
            "\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u00b1\10"+
            "\116\1\u00b0\4\116\1\u00b2\11\116\4\uffff\1\116\1\uffff\2\116"+
            "\1\u00b1\10\116\1\u00b0\4\116\1\u00b2\11\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u00b3\20\116\1"+
            "\u00b4\10\116\4\uffff\1\116\1\uffff\1\u00b3\20\116\1\u00b4\10"+
            "\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286"+
            "\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff"+
            "\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff"+
            "\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00b5\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u00b5\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u00b6\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u00b6\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u00b7\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u00b7\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00b8\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u00b8\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u00b9\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u00b9\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\30\116\1\u00ba\1"+
            "\116\4\uffff\1\116\1\uffff\30\116\1\u00ba\1\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00bc\11"+
            "\116\1\u00bb\13\116\4\uffff\1\116\1\uffff\4\116\1\u00bc\11\116"+
            "\1\u00bb\13\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117"+
            "\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u00bd\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u00bd\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u00be\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u00be\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u00bf\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u00bf\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\14\116\1\u00c0\15"+
            "\116\4\uffff\1\116\1\uffff\14\116\1\u00c0\15\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u00c2\2"+
            "\116\1\u00c1\3\116\4\uffff\1\116\1\uffff\23\116\1\u00c2\2\116"+
            "\1\u00c1\3\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117"+
            "\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00c3\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u00c3\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u00c4\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u00c4\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00c6\16"+
            "\116\1\u00c5\6\116\4\uffff\1\116\1\uffff\4\116\1\u00c6\16\116"+
            "\1\u00c5\6\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117"+
            "\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\u00ca\3"+
            "\116\1\u00c9\7\116\4\uffff\1\116\1\uffff\16\116\1\u00ca\3\116"+
            "\1\u00c9\7\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117"+
            "\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\6\116\1\u00cb\23"+
            "\116\4\uffff\1\116\1\uffff\6\116\1\u00cb\23\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\3\116\1\u00cc\26"+
            "\116\4\uffff\1\116\1\uffff\3\116\1\u00cc\26\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u00cd\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u00cd\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u00ce\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u00ce\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\25\116\1\u00cf\4"+
            "\116\4\uffff\1\116\1\uffff\25\116\1\u00cf\4\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u00d0\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u00d0\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u00d1\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u00d1\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u00d4\31\116\4"+
            "\uffff\1\116\1\uffff\1\u00d4\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u00d5\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u00d5\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u00d6\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u00d6\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u00d7\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u00d7\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u00d8\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u00d8\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u00d9\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u00d9\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\3\116\1\u00da\26"+
            "\116\4\uffff\1\116\1\uffff\3\116\1\u00da\26\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00db\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u00db\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u00dc\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u00dc\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\14\116\1\u00dd\15"+
            "\116\4\uffff\1\116\1\uffff\14\116\1\u00dd\15\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\u00de\13"+
            "\116\4\uffff\1\116\1\uffff\16\116\1\u00de\13\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u008a\13\uffff\1\u009a\37\uffff\1\u009a",
            "",
            "\1\u00e2\1\uffff\12\u008c\13\uffff\1\u00e3\37\uffff\1\u00e3",
            "\12\u00e4",
            "",
            "",
            "\1\u00e7\1\uffff\12\u0090\13\uffff\1\u00e6\37\uffff\1\u00e6",
            "\12\u00e8",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00e9\13\uffff\1\u009a\37\uffff\1\u009a",
            "\1\u0098\1\uffff\12\u0099\13\uffff\1\u009a\37\uffff\1\u009a",
            "",
            "\1\u00ea",
            "",
            "\1\u00eb",
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
            "",
            "",
            "",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u00ec\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u00ec\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\17\116\1\u00ed\12"+
            "\116\4\uffff\1\116\1\uffff\17\116\1\u00ed\12\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u00ee\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u00ee\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00ef\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u00ef\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\u00f0\13"+
            "\116\4\uffff\1\116\1\uffff\16\116\1\u00f0\13\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u00f1\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u00f1\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u00f3\1"+
            "\116\1\u00f2\6\116\4\uffff\1\116\1\uffff\21\116\1\u00f3\1\116"+
            "\1\u00f2\6\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37\117"+
            "\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00f4\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u00f4\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\5\116\1\u00f5\24"+
            "\116\4\uffff\1\116\1\uffff\5\116\1\u00f5\24\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u00f6\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u00f6\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u00f7\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u00f7\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u00f8\31\116\4"+
            "\uffff\1\116\1\uffff\1\u00f8\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u00f9\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u00f9\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\14\116\1\u00fa\15"+
            "\116\4\uffff\1\116\1\uffff\14\116\1\u00fa\15\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\20\116\1\u00fb\11"+
            "\116\4\uffff\1\116\1\uffff\20\116\1\u00fb\11\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u00fc\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u00fc\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u00fd\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u00fd\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u00fe\31\116\4"+
            "\uffff\1\116\1\uffff\1\u00fe\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u00ff\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u00ff\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u0102\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u0102\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\7\116\1\u0103\22"+
            "\116\4\uffff\1\116\1\uffff\7\116\1\u0103\22\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u0104\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u0104\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u0105\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u0105\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\27\116\1\u0107\2"+
            "\116\4\uffff\1\116\1\uffff\27\116\1\u0107\2\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u0108\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u0108\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u010a\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u010a\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u010c\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u010c\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u010d\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u010d\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u010f\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u010f\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u0110\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u0110\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u0111\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u0111\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0112\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0112\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u0113\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u0113\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u0114\31\116\4"+
            "\uffff\1\116\1\uffff\1\u0114\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u0116\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u0116\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0117\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0117\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\17\116\1\u0118\12"+
            "\116\4\uffff\1\116\1\uffff\17\116\1\u0118\12\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\27\116\1\u0119\2"+
            "\116\4\uffff\1\116\1\uffff\27\116\1\u0119\2\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "",
            "",
            "\12\u011b\13\uffff\1\u00e3\37\uffff\1\u00e3",
            "",
            "\12\u00e4\13\uffff\1\u00e3\37\uffff\1\u00e3",
            "",
            "",
            "\12\u011d\13\uffff\1\u00e6\37\uffff\1\u00e6",
            "\12\u00e8\13\uffff\1\u00e6\37\uffff\1\u00e6",
            "\12\u00e9\13\uffff\1\u009a\37\uffff\1\u009a",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\u011e\13"+
            "\116\4\uffff\1\116\1\uffff\16\116\1\u011e\13\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\7\116\1\u011f\22"+
            "\116\4\uffff\1\116\1\uffff\7\116\1\u011f\22\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\17\116\1\u0120\12"+
            "\116\4\uffff\1\116\1\uffff\17\116\1\u0120\12\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u0121\27"+
            "\116\4\uffff\1\116\1\uffff\2\116\1\u0121\27\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u0122\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u0122\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0123\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0123\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u0124\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u0124\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u0125\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u0125\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u0126\31\116\4"+
            "\uffff\1\116\1\uffff\1\u0126\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u0127\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u0127\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0128\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0128\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u0129\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u0129\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u012a\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u012a\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\10\116\1\u012b\21"+
            "\116\4\uffff\1\116\1\uffff\10\116\1\u012b\21\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u012d\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u012d\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u012e\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u012e\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u012f\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u012f\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u0130\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u0130\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\3\116\1\u0131\26"+
            "\116\4\uffff\1\116\1\uffff\3\116\1\u0131\26\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0132\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0132\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\u0134\13"+
            "\116\4\uffff\1\116\1\uffff\16\116\1\u0134\13\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u0135\31\116\4"+
            "\uffff\1\116\1\uffff\1\u0135\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0137\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0137\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\6\116\1\u0138\23"+
            "\116\4\uffff\1\116\1\uffff\6\116\1\u0138\23\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u0139\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u0139\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u013a\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u013a\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\7\116\1\u013c\22"+
            "\116\4\uffff\1\116\1\uffff\7\116\1\u013c\22\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u013d\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u013d\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u013f\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u013f\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u0140\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u0140\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\u0143\13"+
            "\116\4\uffff\1\116\1\uffff\16\116\1\u0143\13\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\12\u011b\13\uffff\1\u00e3\37\uffff\1\u00e3",
            "",
            "\12\u011d\13\uffff\1\u00e6\37\uffff\1\u00e6",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u0145\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u0145\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u0148\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u0148\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\3\116\1\u0149\26"+
            "\116\4\uffff\1\116\1\uffff\3\116\1\u0149\26\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u014a\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u014a\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u014b\27"+
            "\116\4\uffff\1\116\1\uffff\2\116\1\u014b\27\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\14\116\1\u014d\15"+
            "\116\4\uffff\1\116\1\uffff\14\116\1\u014d\15\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\27\116\1\u014e\2"+
            "\116\4\uffff\1\116\1\uffff\27\116\1\u014e\2\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u0150\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u0150\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0151\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0151\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u0152\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u0152\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0153\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0153\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u0154\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u0154\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u0156\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u0156\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u0159\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u0159\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u015a\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u015a\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\6\116\1\u015b\23"+
            "\116\4\uffff\1\116\1\uffff\6\116\1\u015b\23\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\6\116\1\u015d\23"+
            "\116\4\uffff\1\116\1\uffff\6\116\1\u015d\23\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u015f\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u015f\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u0160\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u0160\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u0161\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u0161\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u0162\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u0162\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u0163\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u0163\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u0165\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u0165\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u0166\27"+
            "\116\4\uffff\1\116\1\uffff\2\116\1\u0166\27\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\24\116\1\u016a\5"+
            "\116\4\uffff\1\116\1\uffff\24\116\1\u016a\5\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u016c\27"+
            "\116\4\uffff\1\116\1\uffff\2\116\1\u016c\27\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\15\116\1\u016d\14"+
            "\116\4\uffff\1\116\1\uffff\15\116\1\u016d\14\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u0170\31\116\4"+
            "\uffff\1\116\1\uffff\1\u0170\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\16\116\1\u0171\13"+
            "\116\4\uffff\1\116\1\uffff\16\116\1\u0171\13\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u0172\31\116\4"+
            "\uffff\1\116\1\uffff\1\u0172\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\22\116\1\u0174\7"+
            "\116\4\uffff\1\116\1\uffff\22\116\1\u0174\7\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\1\u0177\31\116\4"+
            "\uffff\1\116\1\uffff\1\u0177\31\116\74\uffff\1\117\10\uffff"+
            "\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81\117\14"+
            "\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0"+
            "\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40\uffff\u020e"+
            "\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u0178\27"+
            "\116\4\uffff\1\116\1\uffff\2\116\1\u0178\27\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0179\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0179\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u017a\27"+
            "\116\4\uffff\1\116\1\uffff\2\116\1\u017a\27\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u017b\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u017b\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\2\116\1\u017c\27"+
            "\116\4\uffff\1\116\1\uffff\2\116\1\u017c\27\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u017d\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u017d\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\21\116\1\u017e\10"+
            "\116\4\uffff\1\116\1\uffff\21\116\1\u017e\10\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u017f\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u017f\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\13\116\1\u0180\16"+
            "\116\4\uffff\1\116\1\uffff\13\116\1\u0180\16\116\74\uffff\1"+
            "\117\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff"+
            "\u1c81\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117"+
            "\u0a70\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0"+
            "\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0181\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0181\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\23\116\1\u0183\6"+
            "\116\4\uffff\1\116\1\uffff\23\116\1\u0183\6\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\30\116\1\u0185\1"+
            "\116\4\uffff\1\116\1\uffff\30\116\1\u0185\1\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\4\116\1\u0188\25"+
            "\116\4\uffff\1\116\1\uffff\4\116\1\u0188\25\116\74\uffff\1\117"+
            "\10\uffff\27\117\1\uffff\37\117\1\uffff\u0286\117\1\uffff\u1c81"+
            "\117\14\uffff\2\117\61\uffff\2\117\57\uffff\u0120\117\u0a70"+
            "\uffff\u03f0\117\21\uffff\ua7ff\117\u2100\uffff\u04d0\117\40"+
            "\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "",
            "\1\117\1\120\1\uffff\12\116\1\121\6\uffff\32\116\4\uffff\1"+
            "\116\1\uffff\32\116\74\uffff\1\117\10\uffff\27\117\1\uffff\37"+
            "\117\1\uffff\u0286\117\1\uffff\u1c81\117\14\uffff\2\117\61\uffff"+
            "\2\117\57\uffff\u0120\117\u0a70\uffff\u03f0\117\21\uffff\ua7ff"+
            "\117\u2100\uffff\u04d0\117\40\uffff\u020e\117",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__151 | T__152 | RESSOURCE | GRAPH | WS | SELECT | PREFIX | CONSTRUCT | DISTINCT | FROM | NAMED | WHERE | OPTIONAL | FILTER | A | USING | AS | HAVING | IRI | URI | ABS | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | WITH | NOW | IF | ELSE | THEN | TRUE | FALSE | SEQUENCE | NOT | IN | GROUP | BY | STATIC | EXISTS | TEMPORAL | ABOX | TBOX | CREATE | OPERATOR | EQUALS | AGGREGATE | START | END | STREAM | PULSE | FREQUENCY | FORALL | AND | OR | OPEN_BRACE | CLOSE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | OPEN_SQUARE_BRACKET | CLOSE_SQUARE_BRACKET | SEMICOLON | DOT | PLUS | MINUS | PNAME_NS | PNAME_LN | VAR_VALUE | VAR_INDEX | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | IRI_REF | COMMENT | REFERENCE | LESS_EQUAL | GREATER_EQUAL | NOT_EQUAL | ASTERISK | QUESTION_MARK | COMMA | NEGATION | DIVIDE | EQUAL | LEFT_ARROW | RIGHT_ARROW | LESS | GREATER | PIPE | ANY | IDENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                        s = -1;
                        if ( (LA43_0=='|') ) {s = 1;}

                        else if ( (LA43_0=='_') ) {s = 2;}

                        else if ( (LA43_0=='r') ) {s = 3;}

                        else if ( (LA43_0=='g') ) {s = 4;}

                        else if ( ((LA43_0>='\t' && LA43_0<='\n')||LA43_0=='\r'||LA43_0==' ') ) {s = 5;}

                        else if ( (LA43_0=='s') ) {s = 6;}

                        else if ( (LA43_0=='p') ) {s = 7;}

                        else if ( (LA43_0=='c') ) {s = 8;}

                        else if ( (LA43_0=='d') ) {s = 9;}

                        else if ( (LA43_0=='f') ) {s = 10;}

                        else if ( (LA43_0=='n') ) {s = 11;}

                        else if ( (LA43_0=='w') ) {s = 12;}

                        else if ( (LA43_0=='o') ) {s = 13;}

                        else if ( (LA43_0=='a') ) {s = 14;}

                        else if ( (LA43_0=='u') ) {s = 15;}

                        else if ( (LA43_0=='A') ) {s = 16;}

                        else if ( (LA43_0=='h') ) {s = 17;}

                        else if ( (LA43_0=='i') ) {s = 18;}

                        else if ( (LA43_0=='y') ) {s = 19;}

                        else if ( (LA43_0=='m') ) {s = 20;}

                        else if ( (LA43_0=='e') ) {s = 21;}

                        else if ( (LA43_0=='t') ) {s = 22;}

                        else if ( (LA43_0=='b') ) {s = 23;}

                        else if ( (LA43_0=='(') ) {s = 24;}

                        else if ( (LA43_0==')') ) {s = 25;}

                        else if ( (LA43_0=='{') ) {s = 26;}

                        else if ( (LA43_0=='}') ) {s = 27;}

                        else if ( (LA43_0=='[') ) {s = 28;}

                        else if ( (LA43_0==']') ) {s = 29;}

                        else if ( (LA43_0==';') ) {s = 30;}

                        else if ( (LA43_0=='.') ) {s = 31;}

                        else if ( (LA43_0=='+') ) {s = 32;}

                        else if ( (LA43_0=='-') ) {s = 33;}

                        else if ( ((LA43_0>='j' && LA43_0<='l')||LA43_0=='q'||LA43_0=='v'||LA43_0=='x'||LA43_0=='z') ) {s = 34;}

                        else if ( (LA43_0==':') ) {s = 35;}

                        else if ( (LA43_0=='?') ) {s = 36;}

                        else if ( (LA43_0=='R') ) {s = 37;}

                        else if ( (LA43_0=='G') ) {s = 38;}

                        else if ( (LA43_0=='S') ) {s = 39;}

                        else if ( (LA43_0=='P') ) {s = 40;}

                        else if ( (LA43_0=='C') ) {s = 41;}

                        else if ( (LA43_0=='D') ) {s = 42;}

                        else if ( (LA43_0=='F') ) {s = 43;}

                        else if ( (LA43_0=='N') ) {s = 44;}

                        else if ( (LA43_0=='W') ) {s = 45;}

                        else if ( (LA43_0=='O') ) {s = 46;}

                        else if ( (LA43_0=='U') ) {s = 47;}

                        else if ( (LA43_0=='H') ) {s = 48;}

                        else if ( (LA43_0=='I') ) {s = 49;}

                        else if ( (LA43_0=='Y') ) {s = 50;}

                        else if ( (LA43_0=='M') ) {s = 51;}

                        else if ( (LA43_0=='E') ) {s = 52;}

                        else if ( (LA43_0=='T') ) {s = 53;}

                        else if ( (LA43_0=='B') ) {s = 54;}

                        else if ( ((LA43_0>='J' && LA43_0<='L')||LA43_0=='Q'||LA43_0=='V'||LA43_0=='X'||LA43_0=='Z') ) {s = 55;}

                        else if ( (LA43_0=='@') ) {s = 56;}

                        else if ( ((LA43_0>='0' && LA43_0<='9')) ) {s = 57;}

                        else if ( (LA43_0=='\'') ) {s = 58;}

                        else if ( (LA43_0=='\"') ) {s = 59;}

                        else if ( (LA43_0=='<') ) {s = 60;}

                        else if ( (LA43_0=='#') ) {s = 61;}

                        else if ( (LA43_0=='^') ) {s = 62;}

                        else if ( (LA43_0=='>') ) {s = 63;}

                        else if ( (LA43_0=='!') ) {s = 64;}

                        else if ( (LA43_0=='*') ) {s = 65;}

                        else if ( (LA43_0==',') ) {s = 66;}

                        else if ( (LA43_0=='/') ) {s = 67;}

                        else if ( (LA43_0=='=') ) {s = 68;}

                        else if ( ((LA43_0>='\u0000' && LA43_0<='\b')||(LA43_0>='\u000B' && LA43_0<='\f')||(LA43_0>='\u000E' && LA43_0<='\u001F')||(LA43_0>='$' && LA43_0<='&')||LA43_0=='\\'||LA43_0=='`'||(LA43_0>='~' && LA43_0<='\u00BF')||LA43_0=='\u00D7'||LA43_0=='\u00F7'||(LA43_0>='\u0300' && LA43_0<='\u036F')||LA43_0=='\u037E'||(LA43_0>='\u2000' && LA43_0<='\u200B')||(LA43_0>='\u200E' && LA43_0<='\u206F')||(LA43_0>='\u2190' && LA43_0<='\u2BFF')||(LA43_0>='\u2FF0' && LA43_0<='\u3000')||(LA43_0>='\uD800' && LA43_0<='\uF8FF')||(LA43_0>='\uFDD0' && LA43_0<='\uFDEF')||(LA43_0>='\uFFFE' && LA43_0<='\uFFFF')) ) {s = 69;}

                        else if ( ((LA43_0>='\u00C0' && LA43_0<='\u00D6')||(LA43_0>='\u00D8' && LA43_0<='\u00F6')||(LA43_0>='\u00F8' && LA43_0<='\u02FF')||(LA43_0>='\u0370' && LA43_0<='\u037D')||(LA43_0>='\u037F' && LA43_0<='\u1FFF')||(LA43_0>='\u200C' && LA43_0<='\u200D')||(LA43_0>='\u2070' && LA43_0<='\u218F')||(LA43_0>='\u2C00' && LA43_0<='\u2FEF')||(LA43_0>='\u3001' && LA43_0<='\uD7FF')||(LA43_0>='\uF900' && LA43_0<='\uFDCF')||(LA43_0>='\uFDF0' && LA43_0<='\uFFFD')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_58 = input.LA(1);

                        s = -1;
                        if ( (LA43_58=='\'') ) {s = 155;}

                        else if ( ((LA43_58>='\u0000' && LA43_58<='\t')||(LA43_58>='\u000B' && LA43_58<='\f')||(LA43_58>='\u000E' && LA43_58<='&')||(LA43_58>='(' && LA43_58<='\uFFFF')) ) {s = 156;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_61 = input.LA(1);

                        s = -1;
                        if ( ((LA43_61>='\u0000' && LA43_61<='\uFFFF')) ) {s = 163;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_59 = input.LA(1);

                        s = -1;
                        if ( (LA43_59=='\"') ) {s = 157;}

                        else if ( ((LA43_59>='\u0000' && LA43_59<='\t')||(LA43_59>='\u000B' && LA43_59<='\f')||(LA43_59>='\u000E' && LA43_59<='!')||(LA43_59>='#' && LA43_59<='\uFFFF')) ) {s = 158;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}