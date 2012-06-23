// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-06-23 16:07:24

  package graphlang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GraphLangLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int TYPE=4;
    public static final int ID=5;
    public static final int RELATIONALOP=6;
    public static final int BOOLEANLITERAL=7;
    public static final int FLOAT=8;
    public static final int INT=9;
    public static final int STRING=10;
    public static final int COMMENT=11;
    public static final int WS=12;

    // delegates
    // delegators

    public GraphLangLexer() {;} 
    public GraphLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GraphLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:11:7: ( ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:12:7: ( '(' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:13:7: ( ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:14:7: ( '{' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:15:7: ( '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:16:7: ( 'return' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:16:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:17:7: ( ',' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:18:7: ( 'main' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:18:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:19:7: ( 'if' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:20:7: ( 'else' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:20:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:21:7: ( 'for' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:21:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:22:7: ( 'foreach' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:22:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:23:7: ( 'while' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:23:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:24:7: ( 'do' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:24:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:7: ( 'output' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:7: ( 'input' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:27:7: ( 'all' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:27:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:28:7: ( '.' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:28:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:29:7: ( '=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:30:7: ( '->' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:30:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:7: ( '+' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:7: ( '-' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:33:7: ( '*' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:33:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:34:7: ( '/' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:34:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:7: ( '&&' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:7: ( '||' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: ( 'null' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:7: ( '+=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:7: ( '-=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:7: ( '*=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:7: ( '/=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:7: ( '%=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RELATIONALOP"
    public final void mRELATIONALOP() throws RecognitionException {
        try {
            int _type = RELATIONALOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:617:4: ( '>' | '<' | '<=' | '>=' | '!=' | '==' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=4;
                }
                else {
                    alt1=1;}
                }
                break;
            case '<':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=3;
                }
                else {
                    alt1=2;}
                }
                break;
            case '!':
                {
                alt1=5;
                }
                break;
            case '=':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:617:7: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:618:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:619:7: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:620:7: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:621:7: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:622:7: '=='
                    {
                    match("=="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELATIONALOP"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:635:4: ( 'int' | 'double' | 'OArc' | 'Graph' | 'String' | 'Node' | 'void' | 'bool' )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt2=1;
                }
                break;
            case 'd':
                {
                alt2=2;
                }
                break;
            case 'O':
                {
                alt2=3;
                }
                break;
            case 'G':
                {
                alt2=4;
                }
                break;
            case 'S':
                {
                alt2=5;
                }
                break;
            case 'N':
                {
                alt2=6;
                }
                break;
            case 'v':
                {
                alt2=7;
                }
                break;
            case 'b':
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:635:6: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:636:6: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:637:6: 'OArc'
                    {
                    match("OArc"); 


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:638:6: 'Graph'
                    {
                    match("Graph"); 


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:639:6: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:640:6: 'Node'
                    {
                    match("Node"); 


                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:641:6: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:642:6: 'bool'
                    {
                    match("bool"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "BOOLEANLITERAL"
    public final void mBOOLEANLITERAL() throws RecognitionException {
        try {
            int _type = BOOLEANLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:696:5: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:696:9: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:697:9: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEANLITERAL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:700:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:700:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:700:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:703:5: ( ( '0' .. '9' )+ )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:703:7: ( '0' .. '9' )+
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:703:7: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:703:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:707:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:707:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:707:9: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:707:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:707:25: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:707:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:708:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:708:13: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:708:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:709:9: ( '0' .. '9' )+
                    {
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:709:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:709:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:713:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='/') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='/') ) {
                    alt14=1;
                }
                else if ( (LA14_1=='*') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:713:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:713:14: (~ ( '\\n' | '\\r' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:713:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:713:28: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:713:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:714:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:714:14: ( options {greedy=false; } : . )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='*') ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1=='/') ) {
                                alt13=2;
                            }
                            else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:714:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:717:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:717:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:728:5: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:728:8: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:728:12: (~ ( '\\\\' | '\"' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:728:13: ~ ( '\\\\' | '\"' )
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

            	default :
            	    break loop15;
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
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RELATIONALOP | TYPE | BOOLEANLITERAL | ID | INT | FLOAT | COMMENT | WS | STRING )
        int alt16=41;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:202: RELATIONALOP
                {
                mRELATIONALOP(); 

                }
                break;
            case 34 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:215: TYPE
                {
                mTYPE(); 

                }
                break;
            case 35 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:220: BOOLEANLITERAL
                {
                mBOOLEANLITERAL(); 

                }
                break;
            case 36 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:235: ID
                {
                mID(); 

                }
                break;
            case 37 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:238: INT
                {
                mINT(); 

                }
                break;
            case 38 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:242: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 39 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:248: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 40 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:256: WS
                {
                mWS(); 

                }
                break;
            case 41 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:259: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA10_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\2\71\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "706:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA16_eotS =
        "\6\uffff\1\42\1\uffff\10\42\1\61\1\63\1\66\1\70\1\72\1\75\2\uffff"+
        "\1\42\2\uffff\7\42\1\uffff\1\106\2\uffff\2\42\1\111\5\42\1\121\2"+
        "\42\15\uffff\10\42\1\uffff\2\42\1\uffff\1\42\1\137\1\42\1\142\3"+
        "\42\1\uffff\1\42\1\147\11\42\1\161\1\42\1\uffff\1\163\1\42\1\uffff"+
        "\4\42\1\uffff\1\171\1\137\2\42\3\137\1\174\1\42\1\uffff\1\176\1"+
        "\uffff\1\42\1\174\1\u0080\2\42\1\uffff\1\137\1\42\1\uffff\1\u0084"+
        "\1\uffff\1\42\1\uffff\1\137\1\u0086\1\137\1\uffff\1\u0087\2\uffff";
    static final String DFA16_eofS =
        "\u0088\uffff";
    static final String DFA16_minS =
        "\1\11\5\uffff\1\145\1\uffff\1\141\1\146\1\154\1\141\1\150\1\157"+
        "\1\165\1\154\1\60\4\75\1\52\2\uffff\1\165\2\uffff\1\101\1\162\1"+
        "\164\3\157\1\162\1\uffff\1\56\2\uffff\1\164\1\151\1\60\1\160\1\163"+
        "\1\162\1\154\1\151\1\60\1\164\1\154\15\uffff\1\154\1\162\1\141\1"+
        "\162\1\144\1\151\1\157\1\165\1\uffff\1\165\1\156\1\uffff\1\165\1"+
        "\60\1\145\1\60\1\163\1\154\1\142\1\uffff\1\160\1\60\1\154\1\143"+
        "\1\160\1\151\1\145\1\144\1\154\1\145\1\162\1\60\1\164\1\uffff\1"+
        "\60\1\141\1\uffff\2\145\1\154\1\165\1\uffff\2\60\1\150\1\156\4\60"+
        "\1\156\1\uffff\1\60\1\uffff\1\143\2\60\1\145\1\164\1\uffff\1\60"+
        "\1\147\1\uffff\1\60\1\uffff\1\150\1\uffff\3\60\1\uffff\1\60\2\uffff";
    static final String DFA16_maxS =
        "\1\175\5\uffff\1\145\1\uffff\1\141\1\156\1\154\1\157\1\150\1\157"+
        "\1\165\1\154\1\71\1\75\1\76\3\75\2\uffff\1\165\2\uffff\1\101\1\162"+
        "\1\164\3\157\1\162\1\uffff\1\71\2\uffff\1\164\1\151\1\172\1\164"+
        "\1\163\1\162\1\154\1\151\1\172\1\164\1\154\15\uffff\1\154\1\162"+
        "\1\141\1\162\1\144\1\151\1\157\1\165\1\uffff\1\165\1\156\1\uffff"+
        "\1\165\1\172\1\145\1\172\1\163\1\154\1\142\1\uffff\1\160\1\172\1"+
        "\154\1\143\1\160\1\151\1\145\1\144\1\154\1\145\1\162\1\172\1\164"+
        "\1\uffff\1\172\1\141\1\uffff\2\145\1\154\1\165\1\uffff\2\172\1\150"+
        "\1\156\4\172\1\156\1\uffff\1\172\1\uffff\1\143\2\172\1\145\1\164"+
        "\1\uffff\1\172\1\147\1\uffff\1\172\1\uffff\1\150\1\uffff\3\172\1"+
        "\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\16\uffff\1\31\1\32\1\uffff"+
        "\1\40\1\41\7\uffff\1\44\1\uffff\1\50\1\51\13\uffff\1\22\1\46\1\23"+
        "\1\24\1\35\1\26\1\34\1\25\1\36\1\27\1\37\1\47\1\30\10\uffff\1\45"+
        "\2\uffff\1\11\7\uffff\1\16\15\uffff\1\42\2\uffff\1\13\4\uffff\1"+
        "\21\11\uffff\1\10\1\uffff\1\12\5\uffff\1\33\2\uffff\1\43\1\uffff"+
        "\1\20\1\uffff\1\15\3\uffff\1\6\1\uffff\1\17\1\14";
    static final String DFA16_specialS =
        "\u0088\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\32\1\45\2\uffff\1\31\1\26"+
            "\1\uffff\1\2\1\3\1\24\1\23\1\7\1\22\1\20\1\25\12\43\1\uffff"+
            "\1\1\1\32\1\21\1\32\2\uffff\6\42\1\34\6\42\1\36\1\33\3\42\1"+
            "\35\7\42\4\uffff\1\42\1\uffff\1\17\1\40\1\42\1\15\1\12\1\13"+
            "\2\42\1\11\3\42\1\10\1\30\1\16\2\42\1\6\1\42\1\41\1\42\1\37"+
            "\1\14\3\42\1\4\1\27\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "",
            "\1\47",
            "\1\50\7\uffff\1\51",
            "\1\52",
            "\1\54\15\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\62",
            "\1\32",
            "\1\65\1\64",
            "\1\67",
            "\1\71",
            "\1\74\4\uffff\1\74\15\uffff\1\73",
            "",
            "",
            "\1\76",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\62\1\uffff\12\43",
            "",
            "",
            "\1\107",
            "\1\110",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\112\3\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\120\5\42",
            "\1\122",
            "\1\123",
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
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\140",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\141\25\42",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\162",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\172",
            "\1\173",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\175",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\177",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0081",
            "\1\u0082",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0083",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0085",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RELATIONALOP | TYPE | BOOLEANLITERAL | ID | INT | FLOAT | COMMENT | WS | STRING );";
        }
    }
 

}