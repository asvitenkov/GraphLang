// $ANTLR 3.3 Nov 30, 2010 12:50:56 F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-04-07 14:08:47

  package graphlang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GraphLangLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
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
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int TYPE=4;
    public static final int ID=5;
    public static final int FLOAT=6;
    public static final int INT=7;
    public static final int STRING=8;
    public static final int COMMENT=9;
    public static final int WS=10;

    // delegates
    // delegators

    public GraphLangLexer() {;} 
    public GraphLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GraphLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:11:7: ( ';' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:12:7: ( '(' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:13:7: ( ')' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:13:9: ')'
            {
            match(')'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:14:7: ( '{' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:14:9: '{'
            {
            match('{'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:15:7: ( '}' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:15:9: '}'
            {
            match('}'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:16:7: ( 'return' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:16:9: 'return'
            {
            match("return"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:17:7: ( ',' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:17:9: ','
            {
            match(','); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:18:7: ( 'main' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:18:9: 'main'
            {
            match("main"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:19:7: ( 'if' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:19:9: 'if'
            {
            match("if"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:20:7: ( 'else' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:20:9: 'else'
            {
            match("else"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:21:7: ( 'for' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:21:9: 'for'
            {
            match("for"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:22:7: ( 'foreach' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:22:9: 'foreach'
            {
            match("foreach"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:23:7: ( 'while' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:23:9: 'while'
            {
            match("while"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:24:7: ( 'do' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:24:9: 'do'
            {
            match("do"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:7: ( 'output' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:9: 'output'
            {
            match("output"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:7: ( 'input' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:9: 'input'
            {
            match("input"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:27:7: ( '.' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:27:9: '.'
            {
            match('.'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:28:7: ( '=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:28:9: '='
            {
            match('='); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:29:7: ( '->' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:29:9: '->'
            {
            match("->"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:30:7: ( '+' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:30:9: '+'
            {
            match('+'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:7: ( '-' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:9: '-'
            {
            match('-'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:7: ( '*' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:9: '*'
            {
            match('*'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:33:7: ( '/' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:33:9: '/'
            {
            match('/'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:34:7: ( '&&' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:34:9: '&&'
            {
            match("&&"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:7: ( '||' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:9: '||'
            {
            match("||"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:7: ( 'null' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:9: 'null'
            {
            match("null"); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: ( '>' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:9: '>'
            {
            match('>'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:7: ( '<' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:9: '<'
            {
            match('<'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:7: ( '<=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:9: '<='
            {
            match("<="); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:7: ( '>=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:9: '>='
            {
            match(">="); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:7: ( '!=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:9: '!='
            {
            match("!="); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:7: ( '==' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:9: '=='
            {
            match("=="); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:43:7: ( '+=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:43:9: '+='
            {
            match("+="); 


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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:7: ( '-=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:45:7: ( '*=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:45:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:7: ( '/=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:47:7: ( '%=' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:47:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:48:7: ( 'true' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:48:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:49:7: ( 'false' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:49:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:391:4: ( 'Int' | 'Float' | 'OArc' | 'Graph' | 'Text' | 'Node' | 'void' | 'Bool' )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 'I':
                {
                alt1=1;
                }
                break;
            case 'F':
                {
                alt1=2;
                }
                break;
            case 'O':
                {
                alt1=3;
                }
                break;
            case 'G':
                {
                alt1=4;
                }
                break;
            case 'T':
                {
                alt1=5;
                }
                break;
            case 'N':
                {
                alt1=6;
                }
                break;
            case 'v':
                {
                alt1=7;
                }
                break;
            case 'B':
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:391:6: 'Int'
                    {
                    match("Int"); 


                    }
                    break;
                case 2 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:392:6: 'Float'
                    {
                    match("Float"); 


                    }
                    break;
                case 3 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:393:6: 'OArc'
                    {
                    match("OArc"); 


                    }
                    break;
                case 4 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:6: 'Graph'
                    {
                    match("Graph"); 


                    }
                    break;
                case 5 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:395:6: 'Text'
                    {
                    match("Text"); 


                    }
                    break;
                case 6 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:396:6: 'Node'
                    {
                    match("Node"); 


                    }
                    break;
                case 7 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:397:6: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 8 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:6: 'Bool'
                    {
                    match("Bool"); 


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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:454:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:454:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:454:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
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
            	    break loop2;
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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:457:5: ( ( '0' .. '9' )+ )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:457:7: ( '0' .. '9' )+
            {
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:457:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:457:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:462:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:462:13: ( '0' .. '9' )+
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
                    	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:462:14: '0' .. '9'
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


                    }
                    break;
                case 3 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:463:9: ( '0' .. '9' )+
                    {
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:463:9: ( '0' .. '9' )+
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
                    	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:463:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='/') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='*') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:14: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop9;
                        }
                    } while (true);

                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:28: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:28: '\\r'
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
                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:14: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='/') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:479:5: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:479:8: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:479:12: (~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:479:13: ~ ( '\\\\' | '\"' )
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
            	    break loop13;
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
        // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TYPE | ID | INT | FLOAT | COMMENT | WS | STRING )
        int alt14=46;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:244: TYPE
                {
                mTYPE(); 

                }
                break;
            case 41 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:249: ID
                {
                mID(); 

                }
                break;
            case 42 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:252: INT
                {
                mINT(); 

                }
                break;
            case 43 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:256: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 44 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:262: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 45 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:270: WS
                {
                mWS(); 

                }
                break;
            case 46 :
                // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:273: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA8_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\2\56\3\uffff";
    static final String DFA8_maxS =
        "\2\71\3\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "460:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA14_eotS =
        "\6\uffff\1\45\1\uffff\7\45\1\63\1\66\1\71\1\73\1\75\1\100\2\uffff"+
        "\1\45\1\103\1\105\2\uffff\11\45\1\uffff\1\117\2\uffff\2\45\1\122"+
        "\5\45\1\130\1\45\16\uffff\1\45\4\uffff\11\45\1\uffff\2\45\1\uffff"+
        "\2\45\1\151\2\45\1\uffff\3\45\1\157\10\45\1\170\1\45\1\172\1\45"+
        "\1\uffff\3\45\1\177\1\u0080\1\uffff\1\45\1\157\1\45\4\157\1\45\1"+
        "\uffff\1\u0084\1\uffff\1\45\1\u0086\1\u0087\1\45\2\uffff\2\157\1"+
        "\u0089\1\uffff\1\45\2\uffff\1\u008b\1\uffff\1\u008c\2\uffff";
    static final String DFA14_eofS =
        "\u008d\uffff";
    static final String DFA14_minS =
        "\1\11\5\uffff\1\145\1\uffff\1\141\1\146\1\154\1\141\1\150\1\157"+
        "\1\165\1\60\4\75\1\52\2\uffff\1\165\2\75\2\uffff\1\162\1\156\1\154"+
        "\1\101\1\162\1\145\3\157\1\uffff\1\56\2\uffff\1\164\1\151\1\60\1"+
        "\160\1\163\1\162\1\154\1\151\1\60\1\164\16\uffff\1\154\4\uffff\1"+
        "\165\1\164\1\157\1\162\1\141\1\170\1\144\1\151\1\157\1\uffff\1\165"+
        "\1\156\1\uffff\1\165\1\145\1\60\1\163\1\154\1\uffff\1\160\1\154"+
        "\1\145\1\60\1\141\1\143\1\160\1\164\1\145\1\144\1\154\1\162\1\60"+
        "\1\164\1\60\1\141\1\uffff\2\145\1\165\2\60\1\uffff\1\164\1\60\1"+
        "\150\4\60\1\156\1\uffff\1\60\1\uffff\1\143\2\60\1\164\2\uffff\3"+
        "\60\1\uffff\1\150\2\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\175\5\uffff\1\145\1\uffff\1\141\1\156\1\154\1\157\1\150\1\157"+
        "\1\165\1\71\1\75\1\76\3\75\2\uffff\1\165\2\75\2\uffff\1\162\1\156"+
        "\1\154\1\101\1\162\1\145\3\157\1\uffff\1\71\2\uffff\1\164\1\151"+
        "\1\172\1\160\1\163\1\162\1\154\1\151\1\172\1\164\16\uffff\1\154"+
        "\4\uffff\1\165\1\164\1\157\1\162\1\141\1\170\1\144\1\151\1\157\1"+
        "\uffff\1\165\1\156\1\uffff\1\165\1\145\1\172\1\163\1\154\1\uffff"+
        "\1\160\1\154\1\145\1\172\1\141\1\143\1\160\1\164\1\145\1\144\1\154"+
        "\1\162\1\172\1\164\1\172\1\141\1\uffff\2\145\1\165\2\172\1\uffff"+
        "\1\164\1\172\1\150\4\172\1\156\1\uffff\1\172\1\uffff\1\143\2\172"+
        "\1\164\2\uffff\3\172\1\uffff\1\150\2\uffff\1\172\1\uffff\1\172\2"+
        "\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\15\uffff\1\30\1\31\3\uffff"+
        "\1\37\1\45\11\uffff\1\51\1\uffff\1\55\1\56\12\uffff\1\21\1\53\1"+
        "\40\1\22\1\23\1\42\1\25\1\41\1\24\1\43\1\26\1\44\1\54\1\27\1\uffff"+
        "\1\36\1\33\1\35\1\34\11\uffff\1\52\2\uffff\1\11\5\uffff\1\16\20"+
        "\uffff\1\13\5\uffff\1\50\10\uffff\1\10\1\uffff\1\12\4\uffff\1\32"+
        "\1\46\3\uffff\1\20\1\uffff\1\47\1\15\1\uffff\1\6\1\uffff\1\17\1"+
        "\14";
    static final String DFA14_specialS =
        "\u008d\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\32\1\50\2\uffff\1\33\1\25"+
            "\1\uffff\1\2\1\3\1\23\1\22\1\7\1\21\1\17\1\24\12\46\1\uffff"+
            "\1\1\1\31\1\20\1\30\2\uffff\1\45\1\44\3\45\1\36\1\40\1\45\1"+
            "\35\4\45\1\42\1\37\4\45\1\41\6\45\4\uffff\1\45\1\uffff\3\45"+
            "\1\15\1\12\1\13\2\45\1\11\3\45\1\10\1\27\1\16\2\45\1\6\1\45"+
            "\1\34\1\45\1\43\1\14\3\45\1\4\1\26\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "\1\52",
            "\1\53\7\uffff\1\54",
            "\1\55",
            "\1\57\15\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\64",
            "\1\65",
            "\1\70\1\67",
            "\1\72",
            "\1\74",
            "\1\77\4\uffff\1\77\15\uffff\1\76",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\104",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\64\1\uffff\12\46",
            "",
            "",
            "\1\120",
            "\1\121",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\131",
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
            "\1\132",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\150\25\45",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\171",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0081",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0082",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0083",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0085",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0088",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u008a",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TYPE | ID | INT | FLOAT | COMMENT | WS | STRING );";
        }
    }
 

}