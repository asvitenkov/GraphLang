// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-04-06 18:26:52

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
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public String getGrammarFileName() { return "D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:11:7: ( ';' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:11:9: ';'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:12:7: ( '(' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:12:9: '('
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:13:7: ( ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:13:9: ')'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:14:7: ( '{' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:14:9: '{'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:15:7: ( '}' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:15:9: '}'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:16:7: ( 'return' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:16:9: 'return'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:17:7: ( ',' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:17:9: ','
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:18:7: ( 'main' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:18:9: 'main'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:19:7: ( 'if' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:19:9: 'if'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:20:7: ( 'else' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:20:9: 'else'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:21:7: ( 'for' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:21:9: 'for'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:22:7: ( 'foreach' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:22:9: 'foreach'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:23:7: ( 'while' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:23:9: 'while'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:24:7: ( 'do' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:24:9: 'do'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:7: ( 'output' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:9: 'output'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:7: ( 'input' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:9: 'input'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:27:7: ( '.' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:27:9: '.'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:28:7: ( '=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:28:9: '='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:29:7: ( '->' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:29:9: '->'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:30:7: ( '+' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:30:9: '+'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:7: ( '-' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:9: '-'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:7: ( '*' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:9: '*'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:33:7: ( '/' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:33:9: '/'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:34:7: ( '&&' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:34:9: '&&'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:7: ( '||' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:9: '||'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:7: ( 'null' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:9: 'null'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: ( '>' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:9: '>'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:7: ( '<' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:9: '<'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:7: ( '<=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:9: '<='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:7: ( '>=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:9: '>='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:7: ( '!=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:9: '!='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:7: ( '==' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:9: '=='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:43:7: ( '+=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:43:9: '+='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:7: ( '-=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:9: '-='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:45:7: ( '*=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:45:9: '*='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:7: ( '/=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:9: '/='
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:47:7: ( '&=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:47:9: '&='
            {
            match("&="); 


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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:48:7: ( '|=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:48:9: '|='
            {
            match("|="); 


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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:49:7: ( '^=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:49:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:50:7: ( '%=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:50:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:51:7: ( 'true' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:51:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:52:7: ( 'false' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:52:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:4: ( 'Int' | 'Float' | 'OArc' | 'Graph' | 'Arc' | 'Text' | 'Node' | 'void' | 'Bool' )
            int alt1=9;
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
            case 'A':
                {
                alt1=5;
                }
                break;
            case 'T':
                {
                alt1=6;
                }
                break;
            case 'N':
                {
                alt1=7;
                }
                break;
            case 'v':
                {
                alt1=8;
                }
                break;
            case 'B':
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:6: 'Int'
                    {
                    match("Int"); 


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:395:6: 'Float'
                    {
                    match("Float"); 


                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:396:6: 'OArc'
                    {
                    match("OArc"); 


                    }
                    break;
                case 4 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:397:6: 'Graph'
                    {
                    match("Graph"); 


                    }
                    break;
                case 5 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:6: 'Arc'
                    {
                    match("Arc"); 


                    }
                    break;
                case 6 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:399:6: 'Text'
                    {
                    match("Text"); 


                    }
                    break;
                case 7 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:400:6: 'Node'
                    {
                    match("Node"); 


                    }
                    break;
                case 8 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:401:6: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 9 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:402:6: 'Bool'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:458:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:458:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:458:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:5: ( ( '0' .. '9' )+ )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:7: ( '0' .. '9' )+
            {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:7: ( '0' .. '9' )+
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
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:7: '0' .. '9'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:9: ( '0' .. '9' )+
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
                    	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:10: '0' .. '9'
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:26: '0' .. '9'
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:466:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:466:13: ( '0' .. '9' )+
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
                    	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:466:14: '0' .. '9'
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:9: ( '0' .. '9' )+
                    {
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:9: ( '0' .. '9' )+
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
                    	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:10: '0' .. '9'
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:14: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:14: ~ ( '\\n' | '\\r' )
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

                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:28: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:28: '\\r'
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:14: ( options {greedy=false; } : . )*
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
                    	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:42: .
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:475:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:475:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:483:5: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:483:8: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:483:12: (~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:483:13: ~ ( '\\\\' | '\"' )
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
        // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | TYPE | ID | INT | FLOAT | COMMENT | WS | STRING )
        int alt14=49;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:262: TYPE
                {
                mTYPE(); 

                }
                break;
            case 44 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:267: ID
                {
                mID(); 

                }
                break;
            case 45 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:270: INT
                {
                mINT(); 

                }
                break;
            case 46 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:274: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 47 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:280: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 48 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:288: WS
                {
                mWS(); 

                }
                break;
            case 49 :
                // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:1:291: STRING
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
            return "464:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA14_eotS =
        "\6\uffff\1\47\1\uffff\7\47\1\65\1\70\1\73\1\75\1\77\1\102\2\uffff"+
        "\1\47\1\111\1\113\3\uffff\12\47\1\uffff\1\126\2\uffff\2\47\1\131"+
        "\5\47\1\137\1\47\22\uffff\1\47\4\uffff\12\47\1\uffff\2\47\1\uffff"+
        "\2\47\1\161\2\47\1\uffff\3\47\1\167\3\47\1\167\5\47\1\u0080\1\47"+
        "\1\u0082\1\47\1\uffff\3\47\1\u0087\1\u0088\1\uffff\1\47\1\167\1"+
        "\47\4\167\1\47\1\uffff\1\u008c\1\uffff\1\47\1\u008e\1\u008f\1\47"+
        "\2\uffff\2\167\1\u0091\1\uffff\1\47\2\uffff\1\u0093\1\uffff\1\u0094"+
        "\2\uffff";
    static final String DFA14_eofS =
        "\u0095\uffff";
    static final String DFA14_minS =
        "\1\11\5\uffff\1\145\1\uffff\1\141\1\146\1\154\1\141\1\150\1\157"+
        "\1\165\1\60\4\75\1\52\1\46\1\75\1\165\2\75\3\uffff\1\162\1\156\1"+
        "\154\1\101\2\162\1\145\3\157\1\uffff\1\56\2\uffff\1\164\1\151\1"+
        "\60\1\160\1\163\1\162\1\154\1\151\1\60\1\164\22\uffff\1\154\4\uffff"+
        "\1\165\1\164\1\157\1\162\1\141\1\143\1\170\1\144\1\151\1\157\1\uffff"+
        "\1\165\1\156\1\uffff\1\165\1\145\1\60\1\163\1\154\1\uffff\1\160"+
        "\1\154\1\145\1\60\1\141\1\143\1\160\1\60\1\164\1\145\1\144\1\154"+
        "\1\162\1\60\1\164\1\60\1\141\1\uffff\2\145\1\165\2\60\1\uffff\1"+
        "\164\1\60\1\150\4\60\1\156\1\uffff\1\60\1\uffff\1\143\2\60\1\164"+
        "\2\uffff\3\60\1\uffff\1\150\2\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\175\5\uffff\1\145\1\uffff\1\141\1\156\1\154\1\157\1\150\1\157"+
        "\1\165\1\71\1\75\1\76\4\75\1\174\1\165\2\75\3\uffff\1\162\1\156"+
        "\1\154\1\101\2\162\1\145\3\157\1\uffff\1\71\2\uffff\1\164\1\151"+
        "\1\172\1\160\1\163\1\162\1\154\1\151\1\172\1\164\22\uffff\1\154"+
        "\4\uffff\1\165\1\164\1\157\1\162\1\141\1\143\1\170\1\144\1\151\1"+
        "\157\1\uffff\1\165\1\156\1\uffff\1\165\1\145\1\172\1\163\1\154\1"+
        "\uffff\1\160\1\154\1\145\1\172\1\141\1\143\1\160\1\172\1\164\1\145"+
        "\1\144\1\154\1\162\1\172\1\164\1\172\1\141\1\uffff\2\145\1\165\2"+
        "\172\1\uffff\1\164\1\172\1\150\4\172\1\156\1\uffff\1\172\1\uffff"+
        "\1\143\2\172\1\164\2\uffff\3\172\1\uffff\1\150\2\uffff\1\172\1\uffff"+
        "\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\22\uffff\1\37\1\47\1\50"+
        "\12\uffff\1\54\1\uffff\1\60\1\61\12\uffff\1\21\1\56\1\40\1\22\1"+
        "\23\1\42\1\25\1\41\1\24\1\43\1\26\1\44\1\57\1\27\1\30\1\45\1\31"+
        "\1\46\1\uffff\1\36\1\33\1\35\1\34\12\uffff\1\55\2\uffff\1\11\5\uffff"+
        "\1\16\21\uffff\1\13\5\uffff\1\53\10\uffff\1\10\1\uffff\1\12\4\uffff"+
        "\1\32\1\51\3\uffff\1\20\1\uffff\1\52\1\15\1\uffff\1\6\1\uffff\1"+
        "\17\1\14";
    static final String DFA14_specialS =
        "\u0095\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\32\1\52\2\uffff\1\34\1\25"+
            "\1\uffff\1\2\1\3\1\23\1\22\1\7\1\21\1\17\1\24\12\50\1\uffff"+
            "\1\1\1\31\1\20\1\30\2\uffff\1\42\1\46\3\47\1\37\1\41\1\47\1"+
            "\36\4\47\1\44\1\40\4\47\1\43\6\47\3\uffff\1\33\1\47\1\uffff"+
            "\3\47\1\15\1\12\1\13\2\47\1\11\3\47\1\10\1\27\1\16\2\47\1\6"+
            "\1\47\1\35\1\47\1\45\1\14\3\47\1\4\1\26\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55\7\uffff\1\56",
            "\1\57",
            "\1\61\15\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\66",
            "\1\67",
            "\1\72\1\71",
            "\1\74",
            "\1\76",
            "\1\101\4\uffff\1\101\15\uffff\1\100",
            "\1\103\26\uffff\1\104",
            "\1\106\76\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\112",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\66\1\uffff\12\50",
            "",
            "",
            "\1\127",
            "\1\130",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\140",
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
            "",
            "",
            "",
            "\1\141",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\160\25\47",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0081",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0089",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u008a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u008b",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u008d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0090",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0092",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | TYPE | ID | INT | FLOAT | COMMENT | WS | STRING );";
        }
    }
 

}