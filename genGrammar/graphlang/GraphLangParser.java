// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-04-06 16:55:08

  package graphlang;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GraphLangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "ID", "FLOAT", "INT", "STRING", "COMMENT", "WS", "';'", "'('", "')'", "'{'", "'}'", "'return'", "','", "'main'", "'if'", "'else'", "'for'", "'foreach'", "'while'", "'do'", "'output'", "'input'", "'.'", "'='", "'->'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'null'", "'>'", "'<'", "'<='", "'>='", "'!='", "'=='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'true'", "'false'"
    };
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


        public GraphLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GraphLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GraphLangParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g"; }


      // list of programs variable
      protected NamesTable names = new NamesTable();
      protected ArrayList<String> errors = new ArrayList<String>();
      protected ExpressionTypeChecker typeCheker = new ExpressionTypeChecker();
      ArrayList<String> tmpVarNamesList = new ArrayList<String>(); 


    protected static class programm_scope {
        String curBlock;
    }
    protected Stack programm_stack = new Stack();


    // $ANTLR start "programm"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:1: programm : ( globalExpression )* mainBlock ;
    public final void programm() throws RecognitionException {
        programm_stack.push(new programm_scope());

          ((programm_scope)programm_stack.peek()).curBlock = "";

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:4: ( ( globalExpression )* mainBlock )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:6: ( globalExpression )* mainBlock
            {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:6: ( globalExpression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:6: globalExpression
            	    {
            	    pushFollow(FOLLOW_globalExpression_in_programm58);
            	    globalExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            ((programm_scope)programm_stack.peek()).curBlock = "main";
            pushFollow(FOLLOW_mainBlock_in_programm63);
            mainBlock();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            programm_stack.pop();
        }
        return ;
    }
    // $ANTLR end "programm"


    // $ANTLR start "globalExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:1: globalExpression : ( globalVariableDeclaration | functionDeclaration );
    public final void globalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:4: ( globalVariableDeclaration | functionDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TYPE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==11||LA2_2==17) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==12) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression81);
                    globalVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:7: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_globalExpression89);
                    functionDeclaration();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "globalExpression"


    // $ANTLR start "globalVariableDeclaration"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:1: globalVariableDeclaration : variableDeclarationStatement ';' ;
    public final void globalVariableDeclaration() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:4: ( variableDeclarationStatement ';' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:7: variableDeclarationStatement ';'
            {
            ((programm_scope)programm_stack.peek()).curBlock = "global";
            pushFollow(FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration113);
            variableDeclarationStatement();

            state._fsp--;

            match(input,11,FOLLOW_11_in_globalVariableDeclaration115); 

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
    // $ANTLR end "globalVariableDeclaration"

    protected static class functionDeclaration_scope {
        String funcType;
        String funcName;
        ArrayList<String> funcArgTypes;
        ArrayList<String> funcArgNames;
        String returnVariable;
        boolean isReturnUsed;
    }
    protected Stack functionDeclaration_stack = new Stack();


    // $ANTLR start "functionDeclaration"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' ;
    public final void functionDeclaration() throws RecognitionException {
        functionDeclaration_stack.push(new functionDeclaration_scope());
        Token TYPE1=null;
        Token ID2=null;


          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = false;
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable ="";

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:63:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:64:8: TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}'
            {
            TYPE1=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration147); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE1!=null?TYPE1.getText():null); 
            ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration158); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID2!=null?ID2.getText():null);
            match(input,12,FOLLOW_12_in_functionDeclaration171); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:66:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:66:12: functionArgumentList
                    {
                    pushFollow(FOLLOW_functionArgumentList_in_functionDeclaration173);
                    functionArgumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_functionDeclaration176); 

            	            //add functon in namestable if it's not exists
            	            if(!names.isExistFunction((ID2!=null?ID2.getText():null))){
            	              names.addFunction(names.new FunctionName((ID2!=null?ID2.getText():null), (TYPE1!=null?TYPE1.getText():null) ,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames, (ID2!=null?ID2.getLine():0)));
            	            }
            	            else{
            	              errors.add("line "+(ID2!=null?ID2.getLine():0)+": duplicated function declaration "+(ID2!=null?ID2.getText():null));
            	            }
            	          
            match(input,14,FOLLOW_14_in_functionDeclaration200); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:12: ( blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==19||(LA4_0>=21 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:12: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_functionDeclaration202);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:29: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:29: returnOperator
                    {
                    pushFollow(FOLLOW_returnOperator_in_functionDeclaration206);
                    returnOperator();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_functionDeclaration209); 

            	        boolean result = names.checkReturnType((ID2!=null?ID2.getText():null), ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable, ((programm_scope)programm_stack.peek()).curBlock, ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed, (ID2!=null?ID2.getLine():0));
            	        if(result==false){
            	          errors.add(names.getLAstError());
            	        }
            	      

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            functionDeclaration_stack.pop();
        }
        return ;
    }
    // $ANTLR end "functionDeclaration"


    // $ANTLR start "returnOperator"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:1: returnOperator : 'return' ( ID )? ';' ;
    public final void returnOperator() throws RecognitionException {
        Token ID3=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:11: 'return' ( ID )? ';'
            {
            match(input,16,FOLLOW_16_in_returnOperator238); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:20: ID
                    {
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_returnOperator240); 

                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_returnOperator243); 

                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = true;
                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable =(ID3!=null?ID3.getText():null);
                      

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
    // $ANTLR end "returnOperator"


    // $ANTLR start "functionArgumentList"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final void functionArgumentList() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList273);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:36: ',' functionArgumentDeclarator
            	    {
            	    match(input,17,FOLLOW_17_in_functionArgumentList276); 
            	    pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList278);
            	    functionArgumentDeclarator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
        return ;
    }
    // $ANTLR end "functionArgumentList"


    // $ANTLR start "functionArgumentDeclarator"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:97:1: functionArgumentDeclarator : TYPE ID ;
    public final void functionArgumentDeclarator() throws RecognitionException {
        Token TYPE4=null;
        Token ID5=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:98:5: ( TYPE ID )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:98:8: TYPE ID
            {
            TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionArgumentDeclarator298); 
            ID5=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentDeclarator300); 

                  // add variable and it's type in lists funcArgTypes and funcArgNames
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes.add((TYPE4!=null?TYPE4.getText():null));
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames.add((ID5!=null?ID5.getText():null));
                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID5!=null?ID5.getText():null))){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID5!=null?ID5.getText():null), (TYPE4!=null?TYPE4.getText():null), (ID5!=null?ID5.getLine():0)));
                  }
                  else{
                      errors.add("line "+(ID5!=null?ID5.getLine():0)+": duplicated variable name "+(ID5!=null?ID5.getText():null));
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
    // $ANTLR end "functionArgumentDeclarator"


    // $ANTLR start "mainBlock"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:1: mainBlock : 'main' '{' ( blockStatement )* '}' ;
    public final void mainBlock() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:4: ( 'main' '{' ( blockStatement )* '}' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:6: 'main' '{' ( blockStatement )* '}'
            {
            match(input,18,FOLLOW_18_in_mainBlock323); 
            match(input,14,FOLLOW_14_in_mainBlock325); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:17: ( blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==19||(LA8_0>=21 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:17: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_mainBlock327);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_mainBlock330); 

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
    // $ANTLR end "mainBlock"


    // $ANTLR start "blockStatement"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:116:1: blockStatement : ( variableDeclarationStatement ';' | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:117:5: ( variableDeclarationStatement ';' | statement )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TYPE) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID||LA9_0==19||(LA9_0>=21 && LA9_0<=24)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:117:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement348);
                    variableDeclarationStatement();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_blockStatement350); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:118:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement360);
                    statement();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "blockStatement"


    // $ANTLR start "block"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:5: ( '{' ( statement )* '}' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:7: '{' ( statement )* '}'
            {
            match(input,14,FOLLOW_14_in_block386); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:11: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==19||(LA10_0>=21 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block388);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_block391); 

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
    // $ANTLR end "block"


    // $ANTLR start "statement"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:5: ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:9: 'if' '(' logicalExpression ')' block ( 'else' block )?
                    {
                    match(input,19,FOLLOW_19_in_statement410); 
                    match(input,12,FOLLOW_12_in_statement412); 
                    pushFollow(FOLLOW_logicalExpression_in_statement414);
                    logicalExpression();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement416); 
                    pushFollow(FOLLOW_block_in_statement418);
                    block();

                    state._fsp--;

                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:46: ( 'else' block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:47: 'else' block
                            {
                            match(input,20,FOLLOW_20_in_statement421); 
                            pushFollow(FOLLOW_block_in_statement423);
                            block();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:9: 'for' '(' forControl ')' block
                    {
                    match(input,21,FOLLOW_21_in_statement435); 
                    match(input,12,FOLLOW_12_in_statement437); 
                    pushFollow(FOLLOW_forControl_in_statement439);
                    forControl();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement441); 
                    pushFollow(FOLLOW_block_in_statement443);
                    block();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:9: 'foreach' '(' foreachControl ')' block
                    {
                    match(input,22,FOLLOW_22_in_statement453); 
                    match(input,12,FOLLOW_12_in_statement455); 
                    pushFollow(FOLLOW_foreachControl_in_statement457);
                    foreachControl();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement459); 
                    pushFollow(FOLLOW_block_in_statement461);
                    block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:9: 'while' '(' logicalExpression ')' block
                    {
                    match(input,23,FOLLOW_23_in_statement471); 
                    match(input,12,FOLLOW_12_in_statement473); 
                    pushFollow(FOLLOW_logicalExpression_in_statement475);
                    logicalExpression();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement477); 
                    pushFollow(FOLLOW_block_in_statement479);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:131:9: 'do' block 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,24,FOLLOW_24_in_statement489); 
                    pushFollow(FOLLOW_block_in_statement492);
                    block();

                    state._fsp--;

                    match(input,23,FOLLOW_23_in_statement494); 
                    match(input,12,FOLLOW_12_in_statement496); 
                    pushFollow(FOLLOW_logicalExpression_in_statement498);
                    logicalExpression();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement500); 
                    match(input,11,FOLLOW_11_in_statement502); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:132:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement513);
                    assignmentOperation();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement515); 

                    }
                    break;
                case 7 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:133:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement525);
                    setArcOperation();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement527); 

                    }
                    break;
                case 8 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement537);
                    setGraphOperation();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement539); 

                    }
                    break;
                case 9 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:135:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement549);
                    callClassMethod();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement551); 

                    }
                    break;
                case 10 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:136:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement561);
                    callInlineFunction();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement563); 

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
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "foreachControl"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:1: foreachControl : idLiteral ';' idLiteral ( ';' ( foreachType )? )? ;
    public final void foreachControl() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:5: ( idLiteral ';' idLiteral ( ';' ( foreachType )? )? )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:9: idLiteral ';' idLiteral ( ';' ( foreachType )? )?
            {
            pushFollow(FOLLOW_idLiteral_in_foreachControl586);
            idLiteral();

            state._fsp--;

            match(input,11,FOLLOW_11_in_foreachControl588); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl590);
            idLiteral();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:33: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:34: ';' ( foreachType )?
                    {
                    match(input,11,FOLLOW_11_in_foreachControl593); 
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:38: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=25 && LA13_0<=26)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:38: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl595);
                            foreachType();

                            state._fsp--;


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
    // $ANTLR end "foreachControl"


    // $ANTLR start "foreachType"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:143:1: foreachType : ( 'output' | 'input' );
    public final void foreachType() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:144:5: ( 'output' | 'input' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( (input.LA(1)>=25 && input.LA(1)<=26) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "foreachType"


    // $ANTLR start "forControl"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:1: forControl : forInit ';' forBegin ';' forEnd ;
    public final void forControl() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:149:5: ( forInit ';' forBegin ';' forEnd )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:149:9: forInit ';' forBegin ';' forEnd
            {
            pushFollow(FOLLOW_forInit_in_forControl644);
            forInit();

            state._fsp--;

            match(input,11,FOLLOW_11_in_forControl646); 
            pushFollow(FOLLOW_forBegin_in_forControl648);
            forBegin();

            state._fsp--;

            match(input,11,FOLLOW_11_in_forControl650); 
            pushFollow(FOLLOW_forEnd_in_forControl652);
            forEnd();

            state._fsp--;


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
    // $ANTLR end "forControl"


    // $ANTLR start "forBegin"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:152:1: forBegin : ( intLiteral | idLiteral );
    public final void forBegin() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:5: ( intLiteral | idLiteral )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forBegin671);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:154:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forBegin681);
                    idLiteral();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "forBegin"


    // $ANTLR start "forEnd"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:157:1: forEnd : ( intLiteral | idLiteral | callClassMethod | callInlineFunction );
    public final void forEnd() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:158:5: ( intLiteral | idLiteral | callClassMethod | callInlineFunction )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==ID) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt16=3;
                    }
                    break;
                case 12:
                    {
                    alt16=4;
                    }
                    break;
                case 13:
                    {
                    alt16=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:158:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forEnd704);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:159:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forEnd714);
                    idLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:160:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_forEnd724);
                    callClassMethod();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_forEnd734);
                    callInlineFunction();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "forEnd"


    // $ANTLR start "forInit"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:164:1: forInit : ( intLiteral | idLiteral );
    public final void forInit() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:5: ( intLiteral | idLiteral )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==INT) ) {
                alt17=1;
            }
            else if ( (LA17_0==ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forInit753);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:166:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forInit763);
                    idLiteral();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "forInit"


    // $ANTLR start "callInlineFunction"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:1: callInlineFunction returns [String functionType] : ID '(' ( argumentList )? ')' ;
    public final String callInlineFunction() throws RecognitionException {
        String functionType = null;

        Token ID7=null;
        ArrayList<String> argumentList6 = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:170:5: ( ID '(' ( argumentList )? ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:170:8: ID '(' ( argumentList )? ')'
            {
            ID7=(Token)match(input,ID,FOLLOW_ID_in_callInlineFunction785); 
            match(input,12,FOLLOW_12_in_callInlineFunction787); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:170:15: ( argumentList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ID && LA18_0<=STRING)||(LA18_0>=51 && LA18_0<=52)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:170:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction789);
                    argumentList6=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_callInlineFunction792); 

                      functionType = "?";
                      ArrayList list = null;
                      if(argumentList6==null) list = new ArrayList<String>();
                      else list =  argumentList6;
                      if(!names.checkCallFunction(((programm_scope)programm_stack.peek()).curBlock, (ID7!=null?ID7.getText():null), list, (ID7!=null?ID7.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      else{
                          functionType = names.getFunction((ID7!=null?ID7.getText():null)).getReturnType();
                      }
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return functionType;
    }
    // $ANTLR end "callInlineFunction"

    protected static class callClassMethod_scope {
        String variableId;
        String methodName;
        //ArrayList<String> argumentTypeList;
    }
    protected Stack callClassMethod_stack = new Stack();


    // $ANTLR start "callClassMethod"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:187:1: callClassMethod returns [String methodType] : varId= ID '.' mName= ID '(' ( argumentList )? ')' ;
    public final String callClassMethod() throws RecognitionException {
        callClassMethod_stack.push(new callClassMethod_scope());
        String methodType = null;

        Token varId=null;
        Token mName=null;
        ArrayList<String> argumentList8 = null;



          ((callClassMethod_scope)callClassMethod_stack.peek()).variableId ="";
          ((callClassMethod_scope)callClassMethod_stack.peek()).methodName ="";
          //((callClassMethod_scope)callClassMethod_stack.peek()).argumentTypeList = new ArrayList<String>();

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:198:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:198:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod831); 
            match(input,27,FOLLOW_27_in_callClassMethod833); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null);
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod848); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            match(input,12,FOLLOW_12_in_callClassMethod862); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:200:13: ( argumentList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=ID && LA19_0<=STRING)||(LA19_0>=51 && LA19_0<=52)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:200:13: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callClassMethod864);
                    argumentList8=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_callClassMethod867); 

                      methodType="?";
                      ArrayList list = null;
                      if(argumentList8==null) list = new ArrayList<String>();
                      else list =  argumentList8;
                      if(!names.checkCallClassMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null), argumentList8, (varId!=null?varId.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      if(names.isExistMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null))){
                        methodType = names.getMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null)).getReturnType();
                      }
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            callClassMethod_stack.pop();
        }
        return methodType;
    }
    // $ANTLR end "callClassMethod"

    protected static class assignmentOperation_scope {
        String idType;
    }
    protected Stack assignmentOperation_stack = new Stack();


    // $ANTLR start "assignmentOperation"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:215:1: assignmentOperation : ID assignmentOperator mathExpression ;
    public final void assignmentOperation() throws RecognitionException {
        assignmentOperation_stack.push(new assignmentOperation_scope());

            ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = "none";

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:222:5: ( ID assignmentOperator mathExpression )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:222:8: ID assignmentOperator mathExpression
            {
            match(input,ID,FOLLOW_ID_in_assignmentOperation903); 

                      
                   
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation923);
            assignmentOperator();

            state._fsp--;

            pushFollow(FOLLOW_mathExpression_in_assignmentOperation933);
            mathExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            assignmentOperation_stack.pop();
        }
        return ;
    }
    // $ANTLR end "assignmentOperation"

    protected static class setGraphOperation_scope {
        ArrayList<String> varList;
        ArrayList<String> firstIdList;
        ArrayList<String> secondIdList;
    }
    protected Stack setGraphOperation_stack = new Stack();


    // $ANTLR start "setGraphOperation"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:230:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' ;
    public final void setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        Token ID9=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:241:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:241:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation958); 
            match(input,28,FOLLOW_28_in_setGraphOperation960); 
            match(input,12,FOLLOW_12_in_setGraphOperation962); 
            match(input,14,FOLLOW_14_in_setGraphOperation965); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation967);
            variableList();

            state._fsp--;

            match(input,15,FOLLOW_15_in_setGraphOperation969); 
            match(input,17,FOLLOW_17_in_setGraphOperation971); 
            match(input,14,FOLLOW_14_in_setGraphOperation973); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:241:49: ( setArcExpressions )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:241:49: setArcExpressions
                    {
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation975);
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_setGraphOperation978); 
            match(input,13,FOLLOW_13_in_setGraphOperation981); 

                        names.checkSetGraphOperator((ID9!=null?ID9.getText():null),((programm_scope)programm_stack.peek()).curBlock,((setGraphOperation_scope)setGraphOperation_stack.peek()).varList,((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList,((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList,(ID9!=null?ID9.getLine():0));
                        names.getAllErrors(errors);
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            setGraphOperation_stack.pop();
        }
        return ;
    }
    // $ANTLR end "setGraphOperation"


    // $ANTLR start "variableList"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:248:1: variableList : a= ID ( ',' b= ID )* ;
    public final void variableList() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:249:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:249:8: a= ID ( ',' b= ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList1011); 
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:249:58: ( ',' b= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:249:59: ',' b= ID
            	    {
            	    match(input,17,FOLLOW_17_in_variableList1016); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList1020); 
            	     ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((b!=null?b.getText():null));

            	    }
            	    break;

            	default :
            	    break loop21;
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
        return ;
    }
    // $ANTLR end "variableList"


    // $ANTLR start "setArcExpressions"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:253:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final void setArcExpressions() throws RecognitionException {
        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:254:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:254:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1048); 
            match(input,29,FOLLOW_29_in_setArcExpressions1050); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1054); 

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:259:8: ( ',' a= ID '->' b= ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:259:9: ',' a= ID '->' b= ID
            	    {
            	    match(input,17,FOLLOW_17_in_setArcExpressions1077); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1081); 
            	    match(input,29,FOLLOW_29_in_setArcExpressions1083); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1087); 
            	    ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((a!=null?a.getText():null)); ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((b!=null?b.getText():null)); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
        return ;
    }
    // $ANTLR end "setArcExpressions"


    // $ANTLR start "expression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:262:1: expression : ;
    public final void expression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:263:4: ()
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:264:4: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "variableDeclarationStatement"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:266:1: variableDeclarationStatement : variableDeclaration ;
    public final void variableDeclarationStatement() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:267:4: ( variableDeclaration )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:267:6: variableDeclaration
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1123);
            variableDeclaration();

            state._fsp--;


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
    // $ANTLR end "variableDeclarationStatement"

    protected static class variableDeclaration_scope {
        String varType;
    }
    protected Stack variableDeclaration_stack = new Stack();


    // $ANTLR start "variableDeclaration"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:270:1: variableDeclaration : TYPE variableDeclarators ;
    public final void variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        Token TYPE10=null;


          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:277:5: ( TYPE variableDeclarators )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:277:9: TYPE variableDeclarators
            {
            TYPE10=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1148); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE10!=null?TYPE10.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1152);
            variableDeclarators();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variableDeclaration_stack.pop();
        }
        return ;
    }
    // $ANTLR end "variableDeclaration"


    // $ANTLR start "variableDeclarators"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:280:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
    public final void variableDeclarators() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:281:5: ( variableDeclarator ( ',' variableDeclarator )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:281:9: variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1171);
            variableDeclarator();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:281:28: ( ',' variableDeclarator )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:281:29: ',' variableDeclarator
            	    {
            	    match(input,17,FOLLOW_17_in_variableDeclarators1174); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1176);
            	    variableDeclarator();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "variableDeclarators"

    protected static class variableDeclarator_scope {
        ArrayList<String> varList;
    }
    protected Stack variableDeclarator_stack = new Stack();


    // $ANTLR start "variableDeclarator"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:284:1: variableDeclarator : ID ;
    public final void variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        Token ID11=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:291:5: ( ID )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:291:9: ID
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1204); 

                    if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID11!=null?ID11.getText():null)) ){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID11!=null?ID11.getText():null), ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType, (ID11!=null?ID11.getLine():0)));
                      ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList.add(((programm_scope)programm_stack.peek()).curBlock+"."+(ID11!=null?ID11.getText():null));
            	      }
            	      else{
            	          errors.add("line "+(ID11!=null?ID11.getLine():0)+": duplicated variable name "+(ID11!=null?ID11.getText():null));
            	      }
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variableDeclarator_stack.pop();
        }
        return ;
    }
    // $ANTLR end "variableDeclarator"


    // $ANTLR start "setArcOperation"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:303:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' ;
    public final void setArcOperation() throws RecognitionException {
        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:5: (id= ID '=' '(' from= ID '->' to= ID ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1231); 
            match(input,28,FOLLOW_28_in_setArcOperation1233); 
            match(input,12,FOLLOW_12_in_setArcOperation1235); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1239); 
            match(input,29,FOLLOW_29_in_setArcOperation1241); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1245); 
            match(input,13,FOLLOW_13_in_setArcOperation1246); 

                    boolean result = names.checkSetArcOperator((id!=null?id.getText():null), (from!=null?from.getText():null), (to!=null?to.getText():null), ((programm_scope)programm_stack.peek()).curBlock, (id!=null?id.getLine():0));
                    if(result==false){
                      names.getAllErrors(errors);
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
    // $ANTLR end "setArcOperation"


    // $ANTLR start "mathTerm"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:313:1: mathTerm returns [String mathTermType] : ( literal | '(' mathExpression ')' );
    public final String mathTerm() throws RecognitionException {
        String mathTermType = null;

        GraphLangParser.literal_return literal12 = null;

        String mathExpression13 = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:314:5: ( literal | '(' mathExpression ')' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ID && LA24_0<=STRING)||(LA24_0>=51 && LA24_0<=52)) ) {
                alt24=1;
            }
            else if ( (LA24_0==12) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:314:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_mathTerm1277);
                    literal12=literal();

                    state._fsp--;

                    mathTermType = (literal12!=null?literal12.literalType:null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:315:8: '(' mathExpression ')'
                    {
                    match(input,12,FOLLOW_12_in_mathTerm1288); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1290);
                    mathExpression13=mathExpression();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_mathTerm1292); 
                    mathTermType = mathExpression13;

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
        return mathTermType;
    }
    // $ANTLR end "mathTerm"


    // $ANTLR start "unaryExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:318:1: unaryExpression returns [String unaryExpressionType] : ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm );
    public final String unaryExpression() throws RecognitionException {
        String unaryExpressionType = null;

        String a = null;

        String b = null;

        String mathTerm14 = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:319:5: ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case ID:
            case FLOAT:
            case INT:
            case STRING:
            case 12:
            case 51:
            case 52:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:319:8: '+' a= unaryExpression
                    {
                    match(input,30,FOLLOW_30_in_unaryExpression1316); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1320);
                    a=unaryExpression();

                    state._fsp--;

                    unaryExpressionType = a;

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:320:8: '-' b= unaryExpression
                    {
                    match(input,31,FOLLOW_31_in_unaryExpression1331); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1335);
                    b=unaryExpression();

                    state._fsp--;

                    unaryExpressionType = b;

                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:321:8: mathTerm
                    {
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1346);
                    mathTerm14=mathTerm();

                    state._fsp--;

                    unaryExpressionType = mathTerm14;

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
        return unaryExpressionType;
    }
    // $ANTLR end "unaryExpression"


    // $ANTLR start "multiplicativeExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:324:1: multiplicativeExpression returns [String multiplicativeExpressionType] : a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* ;
    public final String multiplicativeExpression() throws RecognitionException {
        String multiplicativeExpressionType = null;

        String a = null;

        String b = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:325:5: (a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:325:7: a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1381);
            a=unaryExpression();

            state._fsp--;

            type.add(a);
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:326:61: ( ( '*' | '/' ) b= unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=32 && LA26_0<=33)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:326:62: ( '*' | '/' ) b= unaryExpression
            	    {
            	    if ( (input.LA(1)>=32 && input.LA(1)<=33) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1394);
            	    b=unaryExpression();

            	    state._fsp--;

            	    type.add(b);

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


                      multiplicativeExpressionType = typeCheker.checkMathExpressionTypes(type);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return multiplicativeExpressionType;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "mathExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:333:1: mathExpression returns [String mathExpressionType] : a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* ;
    public final String mathExpression() throws RecognitionException {
        String mathExpressionType = null;

        String a = null;

        String b = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:334:5: (a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:334:9: a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1451);
            a=multiplicativeExpression();

            state._fsp--;

            type.add(a);
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:335:82: ( ( '-' | '+' ) b= multiplicativeExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=30 && LA27_0<=31)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:335:83: ( '-' | '+' ) b= multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=30 && input.LA(1)<=31) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1465);
            	    b=multiplicativeExpression();

            	    state._fsp--;

            	    type.add(b);

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


                      mathExpressionType = typeCheker.checkMathExpressionTypes(type);
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return mathExpressionType;
    }
    // $ANTLR end "mathExpression"


    // $ANTLR start "logicalExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:341:1: logicalExpression : relationExpression ( ( '&&' | '||' ) relationExpression )* ;
    public final void logicalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:342:4: ( relationExpression ( ( '&&' | '||' ) relationExpression )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:342:7: relationExpression ( ( '&&' | '||' ) relationExpression )*
            {
            pushFollow(FOLLOW_relationExpression_in_logicalExpression1499);
            relationExpression();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:342:26: ( ( '&&' | '||' ) relationExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=34 && LA28_0<=35)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:342:27: ( '&&' | '||' ) relationExpression
            	    {
            	    if ( (input.LA(1)>=34 && input.LA(1)<=35) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression1508);
            	    relationExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
        return ;
    }
    // $ANTLR end "logicalExpression"


    // $ANTLR start "relationExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:345:1: relationExpression : ( '(' logicalExpression ')' | logicalAtom relationalOp logicalAtom );
    public final void relationExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:346:5: ( '(' logicalExpression ')' | logicalAtom relationalOp logicalAtom )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==12) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=ID && LA29_0<=STRING)||LA29_0==36||(LA29_0>=51 && LA29_0<=52)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:346:8: '(' logicalExpression ')'
                    {
                    match(input,12,FOLLOW_12_in_relationExpression1527); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression1529);
                    logicalExpression();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_relationExpression1531); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:8: logicalAtom relationalOp logicalAtom
                    {
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1540);
                    logicalAtom();

                    state._fsp--;

                    pushFollow(FOLLOW_relationalOp_in_relationExpression1543);
                    relationalOp();

                    state._fsp--;

                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1545);
                    logicalAtom();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "relationExpression"


    // $ANTLR start "logicalAtom"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:350:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );
    public final String logicalAtom() throws RecognitionException {
        String atomType = null;

        GraphLangParser.idLiteral_return idLiteral15 = null;

        String callClassMethod16 = null;

        String callInlineFunction17 = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:351:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral )
            int alt30=8;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:351:7: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom1566);
                    intLiteral();

                    state._fsp--;

                    atomType = "Int"; 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:352:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom1578);
                    floatLiteral();

                    state._fsp--;

                    atomType = "Float"; 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:353:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom1590);
                    idLiteral15=idLiteral();

                    state._fsp--;

                    atomType = (idLiteral15!=null?idLiteral15.idType:null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom1602);
                    stringLiteral();

                    state._fsp--;

                    atomType = "Text"; 

                    }
                    break;
                case 5 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:355:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_logicalAtom1614);
                    booleanLiteral();

                    state._fsp--;

                    atomType = "Bool"; 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:356:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom1626);
                    callClassMethod16=callClassMethod();

                    state._fsp--;

                    atomType = callClassMethod16;

                    }
                    break;
                case 7 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:357:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom1638);
                    callInlineFunction17=callInlineFunction();

                    state._fsp--;

                    atomType = callInlineFunction17;

                    }
                    break;
                case 8 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:358:7: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom1648);
                    nullLiteral();

                    state._fsp--;

                    atomType = "null";

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
        return atomType;
    }
    // $ANTLR end "logicalAtom"


    // $ANTLR start "nullLiteral"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:361:1: nullLiteral : 'null' ;
    public final void nullLiteral() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:362:5: ( 'null' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:362:7: 'null'
            {
            match(input,36,FOLLOW_36_in_nullLiteral1667); 

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
    // $ANTLR end "nullLiteral"


    // $ANTLR start "relationalOp"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:365:1: relationalOp : ( '>' | '<' | '<=' | '>=' | '!=' | '==' );
    public final void relationalOp() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:366:4: ( '>' | '<' | '<=' | '>=' | '!=' | '==' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( (input.LA(1)>=37 && input.LA(1)<=42) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "relationalOp"


    // $ANTLR start "assignmentOperator"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:374:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' );
    public final void assignmentOperator() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:375:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( input.LA(1)==28||(input.LA(1)>=43 && input.LA(1)<=50) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "assignmentOperator"


    // $ANTLR start "test"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:1: test : logicalExpression ';' ;
    public final void test() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:399:5: ( logicalExpression ';' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:399:7: logicalExpression ';'
            {
            pushFollow(FOLLOW_logicalExpression_in_test1915);
            logicalExpression();

            state._fsp--;

            match(input,11,FOLLOW_11_in_test1917); 

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
    // $ANTLR end "test"

    public static class literal_return extends ParserRuleReturnScope {
        public String literalType;
        public String literalValue;
    };

    // $ANTLR start "literal"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:402:1: literal returns [String literalType, String literalValue] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.literal_return literal() throws RecognitionException {
        GraphLangParser.literal_return retval = new GraphLangParser.literal_return();
        retval.start = input.LT(1);

        GraphLangParser.intLiteral_return intLiteral18 = null;

        GraphLangParser.floatLiteral_return floatLiteral19 = null;

        GraphLangParser.idLiteral_return idLiteral20 = null;

        GraphLangParser.stringLiteral_return stringLiteral21 = null;

        GraphLangParser.booleanLiteral_return booleanLiteral22 = null;

        String callClassMethod23 = null;

        String callInlineFunction24 = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:403:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction )
            int alt31=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt31=1;
                }
                break;
            case FLOAT:
                {
                alt31=2;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt31=6;
                    }
                    break;
                case 12:
                    {
                    alt31=7;
                    }
                    break;
                case 11:
                case 13:
                case 17:
                case 30:
                case 31:
                case 32:
                case 33:
                    {
                    alt31=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }

                }
                break;
            case STRING:
                {
                alt31=4;
                }
                break;
            case 51:
            case 52:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:403:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_literal1940);
                    intLiteral18=intLiteral();

                    state._fsp--;

                    retval.literalType = "Int"; retval.literalValue =(intLiteral18!=null?input.toString(intLiteral18.start,intLiteral18.stop):null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:404:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_literal1952);
                    floatLiteral19=floatLiteral();

                    state._fsp--;

                    retval.literalType = "Float"; retval.literalValue =(floatLiteral19!=null?input.toString(floatLiteral19.start,floatLiteral19.stop):null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:405:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_literal1964);
                    idLiteral20=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral20!=null?idLiteral20.idType:null); retval.literalValue =(idLiteral20!=null?input.toString(idLiteral20.start,idLiteral20.stop):null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:406:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal1976);
                    stringLiteral21=stringLiteral();

                    state._fsp--;

                    retval.literalType = "Text"; retval.literalValue =(stringLiteral21!=null?input.toString(stringLiteral21.start,stringLiteral21.stop):null);

                    }
                    break;
                case 5 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:407:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal1988);
                    booleanLiteral22=booleanLiteral();

                    state._fsp--;

                    retval.literalType = "Bool"; retval.literalValue =(booleanLiteral22!=null?input.toString(booleanLiteral22.start,booleanLiteral22.stop):null);

                    }
                    break;
                case 6 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:408:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_literal2000);
                    callClassMethod23=callClassMethod();

                    state._fsp--;

                    retval.literalType = callClassMethod23;

                    }
                    break;
                case 7 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_literal2012);
                    callInlineFunction24=callInlineFunction();

                    state._fsp--;

                    retval.literalType = callInlineFunction24;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"


    // $ANTLR start "argumentList"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:412:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* ;
    public final ArrayList<String> argumentList() throws RecognitionException {
        ArrayList<String> argumentTypeList = null;

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:413:3: (a= literal ( ',' b= literal )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:413:6: a= literal ( ',' b= literal )*
            {

                    argumentTypeList = new ArrayList<String>();
                 
            pushFollow(FOLLOW_literal_in_argumentList2041);
            a=literal();

            state._fsp--;

            argumentTypeList.add((a!=null?a.literalType:null));
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:417:3: ( ',' b= literal )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==17) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:417:4: ',' b= literal
            	    {
            	    match(input,17,FOLLOW_17_in_argumentList2050); 
            	    pushFollow(FOLLOW_literal_in_argumentList2054);
            	    b=literal();

            	    state._fsp--;

            	    argumentTypeList.add((b!=null?b.literalType:null));

            	    }
            	    break;

            	default :
            	    break loop32;
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
        return argumentTypeList;
    }
    // $ANTLR end "argumentList"

    public static class floatLiteral_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "floatLiteral"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:420:1: floatLiteral : FLOAT ;
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:421:3: ( FLOAT )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:421:5: FLOAT
            {
            match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral2072); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "floatLiteral"

    public static class idLiteral_return extends ParserRuleReturnScope {
        public String idType;
    };

    // $ANTLR start "idLiteral"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:424:1: idLiteral returns [String idType] : ID ;
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID25=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:425:3: ( ID )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:425:5: ID
            {
            ID25=(Token)match(input,ID,FOLLOW_ID_in_idLiteral2090); 

                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID25!=null?ID25.getText():null))){
                    errors.add("line "+(ID25!=null?ID25.getLine():0)+": unknown variable "+(ID25!=null?ID25.getText():null));
                    retval.idType = "";
                  }
                  else{
                    names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID25!=null?ID25.getText():null)).addLineUses((ID25!=null?ID25.getLine():0));
                    retval.idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID25!=null?ID25.getText():null)).getType();
                  }
                

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idLiteral"

    public static class intLiteral_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "intLiteral"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:438:1: intLiteral : INT ;
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:439:3: ( INT )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:439:5: INT
            {
            match(input,INT,FOLLOW_INT_in_intLiteral2111); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "intLiteral"

    public static class stringLiteral_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "stringLiteral"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:442:1: stringLiteral : STRING ;
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:443:3: ( STRING )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:443:6: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2126); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stringLiteral"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "booleanLiteral"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:446:1: booleanLiteral : ( 'true' | 'false' );
    public final GraphLangParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        GraphLangParser.booleanLiteral_return retval = new GraphLangParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:447:5: ( 'true' | 'false' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA12_eotS =
        "\17\uffff";
    static final String DFA12_eofS =
        "\17\uffff";
    static final String DFA12_minS =
        "\1\5\5\uffff\1\14\1\5\3\uffff\1\5\1\14\2\uffff";
    static final String DFA12_maxS =
        "\1\30\5\uffff\1\62\1\64\3\uffff\1\64\1\41\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\11\1\12\1\6\2\uffff\1\10"+
        "\1\7";
    static final String DFA12_specialS =
        "\17\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\15\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\11\16\uffff\1\10\1\7\16\uffff\10\12",
            "\4\12\3\uffff\1\13\21\uffff\2\12\23\uffff\2\12",
            "",
            "",
            "",
            "\1\14\3\12\3\uffff\1\12\1\uffff\1\15\17\uffff\2\12\23\uffff"+
            "\2\12",
            "\2\12\15\uffff\1\12\1\uffff\1\16\4\12",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "126:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );";
        }
    }
    static final String DFA30_eotS =
        "\12\uffff";
    static final String DFA30_eofS =
        "\12\uffff";
    static final String DFA30_minS =
        "\1\5\2\uffff\1\13\6\uffff";
    static final String DFA30_maxS =
        "\1\64\2\uffff\1\52\6\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\10\1\6\1\7\1\3";
    static final String DFA30_specialS =
        "\12\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\3\1\2\1\1\1\4\33\uffff\1\6\16\uffff\2\5",
            "",
            "",
            "\1\11\1\10\1\11\15\uffff\1\7\6\uffff\2\11\1\uffff\6\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "350:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_globalExpression_in_programm58 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_mainBlock_in_programm63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalExpression81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_globalExpression89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration113 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_globalVariableDeclaration115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration158 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_functionDeclaration171 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_functionArgumentList_in_functionDeclaration173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_functionDeclaration176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDeclaration200 = new BitSet(new long[]{0x0000000001E98030L});
    public static final BitSet FOLLOW_blockStatement_in_functionDeclaration202 = new BitSet(new long[]{0x0000000001E98030L});
    public static final BitSet FOLLOW_returnOperator_in_functionDeclaration206 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_returnOperator238 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ID_in_returnOperator240 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_returnOperator243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList273 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_functionArgumentList276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList278 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TYPE_in_functionArgumentDeclarator298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionArgumentDeclarator300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_mainBlock323 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_mainBlock325 = new BitSet(new long[]{0x0000000001E88030L});
    public static final BitSet FOLLOW_blockStatement_in_mainBlock327 = new BitSet(new long[]{0x0000000001E88030L});
    public static final BitSet FOLLOW_15_in_mainBlock330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_blockStatement348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_blockStatement350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_block386 = new BitSet(new long[]{0x0000000001E88030L});
    public static final BitSet FOLLOW_statement_in_block388 = new BitSet(new long[]{0x0000000001E88030L});
    public static final BitSet FOLLOW_15_in_block391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_statement410 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement412 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement414 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement416 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement418 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_statement421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_statement435 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement437 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_forControl_in_statement439 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement441 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_statement453 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_foreachControl_in_statement457 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement459 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement471 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement473 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement477 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement489 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statement492 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement496 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement498 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement500 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement513 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement525 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement537 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement549 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement561 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl586 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_foreachControl588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl590 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_foreachControl593 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl644 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_forControl646 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_forBegin_in_forControl648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_forControl650 = new BitSet(new long[]{0x0000000001E800B0L});
    public static final BitSet FOLLOW_forEnd_in_forControl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forBegin671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forBegin681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forEnd704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forEnd714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_forEnd724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_forEnd734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forInit753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction785 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_callInlineFunction787 = new BitSet(new long[]{0x0018000001E821F0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction789 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callInlineFunction792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod831 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_callClassMethod833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod848 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_callClassMethod862 = new BitSet(new long[]{0x0018000001E821F0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod864 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callClassMethod867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation903 = new BitSet(new long[]{0x0007F80010000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation923 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation958 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_setGraphOperation960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_setGraphOperation962 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation967 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation969 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_setGraphOperation971 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation973 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation975 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation978 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setGraphOperation981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList1011 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_variableList1016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList1020 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1048 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcExpressions1050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1054 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_setArcExpressions1077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1081 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcExpressions1083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1087 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1171 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_variableDeclarators1174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1176 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_setArcOperation1233 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_setArcOperation1235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1239 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcOperation1241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1245 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setArcOperation1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_mathTerm1288 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1290 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_mathTerm1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_unaryExpression1316 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unaryExpression1331 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1381 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1386 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1394 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1451 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_set_in_mathExpression1457 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1465 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1499 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_logicalExpression1502 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1508 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_12_in_relationExpression1527 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression1529 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_relationExpression1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1540 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_relationalOp_in_relationExpression1543 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_logicalAtom1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nullLiteral1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExpression_in_test1915 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_test1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList2041 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_argumentList2050 = new BitSet(new long[]{0x0018000001E801F0L});
    public static final BitSet FOLLOW_literal_in_argumentList2054 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});

}