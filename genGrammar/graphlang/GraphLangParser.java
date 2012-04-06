<<<<<<< HEAD
// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-04-06 06:03:52
=======
// $ANTLR 3.3 Nov 30, 2010 12:50:56 F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-04-03 23:34:59
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
      ArrayList<String> tmpVarNamesList = new ArrayList<String>(); 


    protected static class programm_scope {
        String curBlock;
    }
    protected Stack programm_stack = new Stack();


    // $ANTLR start "programm"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:24:1: programm : ( globalExpression )* mainBlock ;
    public final void programm() throws RecognitionException {
        programm_stack.push(new programm_scope());

          ((programm_scope)programm_stack.peek()).curBlock = "";

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:4: ( ( globalExpression )* mainBlock )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:6: ( globalExpression )* mainBlock
            {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:6: ( globalExpression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:31:6: globalExpression
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:1: globalExpression : ( globalVariableDeclaration | functionDeclaration );
    public final void globalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:4: ( globalVariableDeclaration | functionDeclaration )
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:7: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression81);
                    globalVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: functionDeclaration
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:1: globalVariableDeclaration : variableDeclarationStatement ';' ;
    public final void globalVariableDeclaration() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:4: ( variableDeclarationStatement ';' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:7: variableDeclarationStatement ';'
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:45:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' ;
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:62:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:63:8: TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}'
            {
            TYPE1=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration147); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE1!=null?TYPE1.getText():null); 
            ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration158); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID2!=null?ID2.getText():null);
            match(input,12,FOLLOW_12_in_functionDeclaration171); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:65:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:65:12: functionArgumentList
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
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:12: ( blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==19||(LA4_0>=21 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:12: blockStatement
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

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:29: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:29: returnOperator
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:84:1: returnOperator : 'return' ( ID )? ';' ;
    public final void returnOperator() throws RecognitionException {
        Token ID3=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:11: 'return' ( ID )? ';'
            {
            match(input,16,FOLLOW_16_in_returnOperator238); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:20: ID
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:92:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final void functionArgumentList() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList273);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:36: ',' functionArgumentDeclarator
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:96:1: functionArgumentDeclarator : TYPE ID ;
    public final void functionArgumentDeclarator() throws RecognitionException {
        Token TYPE4=null;
        Token ID5=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:97:5: ( TYPE ID )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:97:8: TYPE ID
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:111:1: mainBlock : 'main' '{' ( blockStatement )* '}' ;
    public final void mainBlock() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:4: ( 'main' '{' ( blockStatement )* '}' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:6: 'main' '{' ( blockStatement )* '}'
            {
            match(input,18,FOLLOW_18_in_mainBlock323); 
            match(input,14,FOLLOW_14_in_mainBlock325); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:17: ( blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==19||(LA8_0>=21 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:17: blockStatement
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:115:1: blockStatement : ( variableDeclarationStatement ';' | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:116:5: ( variableDeclarationStatement ';' | statement )
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:116:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement348);
                    variableDeclarationStatement();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_blockStatement350); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:117:9: statement
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:121:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:5: ( '{' ( statement )* '}' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:7: '{' ( statement )* '}'
            {
            match(input,14,FOLLOW_14_in_block386); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:11: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==19||(LA10_0>=21 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:11: statement
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:125:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' '{' statement '}' 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:5: ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' '{' statement '}' 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:9: 'if' '(' logicalExpression ')' block ( 'else' block )?
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

                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:46: ( 'else' block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:47: 'else' block
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:9: 'for' '(' forControl ')' block
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:9: 'foreach' '(' foreachControl ')' block
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:9: 'while' '(' logicalExpression ')' block
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:9: 'do' '{' statement '}' 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,24,FOLLOW_24_in_statement489); 
                    match(input,14,FOLLOW_14_in_statement492); 
                    pushFollow(FOLLOW_statement_in_statement494);
                    statement();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement496); 
                    match(input,23,FOLLOW_23_in_statement498); 
                    match(input,12,FOLLOW_12_in_statement500); 
                    pushFollow(FOLLOW_logicalExpression_in_statement502);
                    logicalExpression();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement504); 
                    match(input,11,FOLLOW_11_in_statement506); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:131:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement517);
                    assignmentOperation();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement519); 

                    }
                    break;
                case 7 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:132:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement529);
                    setArcOperation();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement531); 

                    }
                    break;
                case 8 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:133:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement541);
                    setGraphOperation();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement543); 

                    }
                    break;
                case 9 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement553);
                    callClassMethod();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement555); 

                    }
                    break;
                case 10 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:135:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement565);
                    callInlineFunction();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_statement567); 

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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:1: foreachControl : idLiteral ';' idLiteral ( ';' ( foreachType )? )? ;
    public final void foreachControl() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:5: ( idLiteral ';' idLiteral ( ';' ( foreachType )? )? )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:9: idLiteral ';' idLiteral ( ';' ( foreachType )? )?
            {
            pushFollow(FOLLOW_idLiteral_in_foreachControl590);
            idLiteral();

            state._fsp--;

            match(input,11,FOLLOW_11_in_foreachControl592); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl594);
            idLiteral();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:33: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:34: ';' ( foreachType )?
                    {
                    match(input,11,FOLLOW_11_in_foreachControl597); 
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:38: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=25 && LA13_0<=26)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:38: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl599);
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:1: foreachType : ( 'output' | 'input' );
    public final void foreachType() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:143:5: ( 'output' | 'input' )
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:1: forControl : ( forInit )? ';' logicalExpression ';' ( forUpdate )? ;
    public final void forControl() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:5: ( ( forInit )? ';' logicalExpression ';' ( forUpdate )? )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:9: ( forInit )? ';' logicalExpression ';' ( forUpdate )?
            {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:9: ( forInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID||LA15_0==INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:9: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forControl648);
                    forInit();

                    state._fsp--;


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_forControl651); 
            pushFollow(FOLLOW_logicalExpression_in_forControl653);
            logicalExpression();

            state._fsp--;

            match(input,11,FOLLOW_11_in_forControl655); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:44: ( forUpdate )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||LA16_0==INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:44: forUpdate
                    {
                    pushFollow(FOLLOW_forUpdate_in_forControl657);
                    forUpdate();

                    state._fsp--;


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
    // $ANTLR end "forControl"


    // $ANTLR start "forUpdate"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:1: forUpdate : ( intLiteral | idLiteral );
    public final void forUpdate() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:152:5: ( intLiteral | idLiteral )
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
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:152:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forUpdate677);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forUpdate687);
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
    // $ANTLR end "forUpdate"


    // $ANTLR start "forInit"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:156:1: forInit : ( intLiteral | idLiteral );
    public final void forInit() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:157:5: ( intLiteral | idLiteral )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:157:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forInit706);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:158:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forInit716);
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:1: callInlineFunction : ID '(' ( argumentList )? ')' ;
    public final void callInlineFunction() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:162:5: ( ID '(' ( argumentList )? ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:162:8: ID '(' ( argumentList )? ')'
            {
            match(input,ID,FOLLOW_ID_in_callInlineFunction734); 
            match(input,12,FOLLOW_12_in_callInlineFunction736); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:162:15: ( argumentList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=ID && LA19_0<=STRING)||(LA19_0>=51 && LA19_0<=52)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:162:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction738);
                    argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_callInlineFunction741); 

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
    // $ANTLR end "callInlineFunction"

    protected static class callClassMethod_scope {
        String variableId;
        String methodName;
        //ArrayList<String> argumentTypeList;
    }
    protected Stack callClassMethod_stack = new Stack();


    // $ANTLR start "callClassMethod"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:167:1: callClassMethod : varId= ID '.' mName= ID '(' ( argumentList )? ')' ;
    public final void callClassMethod() throws RecognitionException {
        callClassMethod_stack.push(new callClassMethod_scope());
        Token varId=null;
        Token mName=null;
        ArrayList<String> argumentList6 = null;



          ((callClassMethod_scope)callClassMethod_stack.peek()).variableId ="";
          ((callClassMethod_scope)callClassMethod_stack.peek()).methodName ="";
          //((callClassMethod_scope)callClassMethod_stack.peek()).argumentTypeList = new ArrayList<String>();

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod771); 
            match(input,27,FOLLOW_27_in_callClassMethod773); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null);
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod788); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            match(input,12,FOLLOW_12_in_callClassMethod802); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:180:13: ( argumentList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=ID && LA20_0<=STRING)||(LA20_0>=51 && LA20_0<=52)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:180:13: argumentList
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_argumentList_in_callClassMethod804);
=======
                    pushFollow(FOLLOW_argumentList_in_callClassMethod789);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    argumentList6=argumentList();

                    state._fsp--;


                    }
                    break;

            }

<<<<<<< HEAD
            match(input,13,FOLLOW_13_in_callClassMethod807); 
=======
            match(input,13,FOLLOW_13_in_callClassMethod792); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            System.out.println(argumentList6);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            callClassMethod_stack.pop();
        }
        return ;
    }
    // $ANTLR end "callClassMethod"


    // $ANTLR start "assignmentOperation"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:183:1: assignmentOperation : ID assignmentOperator mathExpression ;
    public final void assignmentOperation() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:184:5: ( ID assignmentOperator mathExpression )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:184:8: ID assignmentOperator mathExpression
            {
<<<<<<< HEAD
            match(input,ID,FOLLOW_ID_in_assignmentOperation827); 
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation829);
=======
            match(input,ID,FOLLOW_ID_in_assignmentOperation812); 
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation814);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            assignmentOperator();

            state._fsp--;

<<<<<<< HEAD
            pushFollow(FOLLOW_mathExpression_in_assignmentOperation831);
=======
            pushFollow(FOLLOW_mathExpression_in_assignmentOperation816);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            mathExpression();

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
    // $ANTLR end "assignmentOperation"

    protected static class setGraphOperation_scope {
        ArrayList<String> varList;
        ArrayList<String> firstIdList;
        ArrayList<String> secondIdList;
    }
    protected Stack setGraphOperation_stack = new Stack();


    // $ANTLR start "setGraphOperation"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:187:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' ;
    public final void setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        Token ID7=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:198:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:198:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
<<<<<<< HEAD
            ID7=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation856); 
            match(input,28,FOLLOW_28_in_setGraphOperation858); 
            match(input,12,FOLLOW_12_in_setGraphOperation860); 
            match(input,14,FOLLOW_14_in_setGraphOperation863); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation865);
=======
            ID7=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation841); 
            match(input,28,FOLLOW_28_in_setGraphOperation843); 
            match(input,12,FOLLOW_12_in_setGraphOperation845); 
            match(input,14,FOLLOW_14_in_setGraphOperation848); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation850);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            variableList();

            state._fsp--;

<<<<<<< HEAD
            match(input,15,FOLLOW_15_in_setGraphOperation867); 
            match(input,17,FOLLOW_17_in_setGraphOperation869); 
            match(input,14,FOLLOW_14_in_setGraphOperation871); 
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:198:49: ( setArcExpressions )?
            int alt21=2;
            int LA21_0 = input.LA(1);
=======
            match(input,15,FOLLOW_15_in_setGraphOperation852); 
            match(input,17,FOLLOW_17_in_setGraphOperation854); 
            match(input,14,FOLLOW_14_in_setGraphOperation856); 
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:196:49: ( setArcExpressions )?
            int alt20=2;
            int LA20_0 = input.LA(1);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:198:49: setArcExpressions
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation873);
=======
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation858);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

<<<<<<< HEAD
            match(input,15,FOLLOW_15_in_setGraphOperation876); 
            match(input,13,FOLLOW_13_in_setGraphOperation879); 
=======
            match(input,15,FOLLOW_15_in_setGraphOperation861); 
            match(input,13,FOLLOW_13_in_setGraphOperation864); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

                        names.checkSetGraphOperator((ID7!=null?ID7.getText():null),((programm_scope)programm_stack.peek()).curBlock,((setGraphOperation_scope)setGraphOperation_stack.peek()).varList,((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList,((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList,(ID7!=null?ID7.getLine():0));
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:205:1: variableList : a= ID ( ',' b= ID )* ;
    public final void variableList() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:206:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:206:8: a= ID ( ',' b= ID )*
            {
<<<<<<< HEAD
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList909); 
=======
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList894); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:206:58: ( ',' b= ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:206:59: ',' b= ID
            	    {
<<<<<<< HEAD
            	    match(input,17,FOLLOW_17_in_variableList914); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList918); 
=======
            	    match(input,17,FOLLOW_17_in_variableList899); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList903); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            	     ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((b!=null?b.getText():null));

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
    // $ANTLR end "variableList"


    // $ANTLR start "setArcExpressions"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:210:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final void setArcExpressions() throws RecognitionException {
        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:211:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:211:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
<<<<<<< HEAD
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions946); 
            match(input,29,FOLLOW_29_in_setArcExpressions948); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions952); 
=======
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions931); 
            match(input,29,FOLLOW_29_in_setArcExpressions933); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions937); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:216:8: ( ',' a= ID '->' b= ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:216:9: ',' a= ID '->' b= ID
            	    {
<<<<<<< HEAD
            	    match(input,17,FOLLOW_17_in_setArcExpressions975); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions979); 
            	    match(input,29,FOLLOW_29_in_setArcExpressions981); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions985); 
=======
            	    match(input,17,FOLLOW_17_in_setArcExpressions960); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions964); 
            	    match(input,29,FOLLOW_29_in_setArcExpressions966); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions970); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            	    ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((a!=null?a.getText():null)); ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((b!=null?b.getText():null)); 

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
    // $ANTLR end "setArcExpressions"


    // $ANTLR start "expression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:219:1: expression : ;
    public final void expression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:220:4: ()
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:221:4: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "variableDeclarationStatement"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:223:1: variableDeclarationStatement : variableDeclaration ;
    public final void variableDeclarationStatement() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:224:4: ( variableDeclaration )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:224:6: variableDeclaration
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1021);
=======
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1006);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:227:1: variableDeclaration : TYPE variableDeclarators ;
    public final void variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        Token TYPE8=null;


          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:234:5: ( TYPE variableDeclarators )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:234:9: TYPE variableDeclarators
            {
<<<<<<< HEAD
            TYPE8=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1046); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE8!=null?TYPE8.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1050);
=======
            TYPE8=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1031); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE8!=null?TYPE8.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1035);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:237:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
    public final void variableDeclarators() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:238:5: ( variableDeclarator ( ',' variableDeclarator )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:238:9: variableDeclarator ( ',' variableDeclarator )*
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1069);
=======
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1054);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            variableDeclarator();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:238:28: ( ',' variableDeclarator )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:238:29: ',' variableDeclarator
            	    {
<<<<<<< HEAD
            	    match(input,17,FOLLOW_17_in_variableDeclarators1072); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1074);
=======
            	    match(input,17,FOLLOW_17_in_variableDeclarators1057); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1059);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            	    variableDeclarator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:241:1: variableDeclarator : ID ;
    public final void variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        Token ID9=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:248:5: ( ID )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:248:9: ID
            {
<<<<<<< HEAD
            ID9=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1102); 

                    if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null)) ){
=======
            ID9=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1087); 

                    if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null))  && !names.isExistVariable("global"+"."+(ID9!=null?ID9.getText():null)) ){
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null), ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType, (ID9!=null?ID9.getLine():0)));
                      ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList.add(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null));
            	      }
            	      else{
            	          errors.add("line "+(ID9!=null?ID9.getLine():0)+": duplicated variable name "+(ID9!=null?ID9.getText():null));
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:260:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' ;
    public final void setArcOperation() throws RecognitionException {
        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:261:5: (id= ID '=' '(' from= ID '->' to= ID ')' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:261:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
<<<<<<< HEAD
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1129); 
            match(input,28,FOLLOW_28_in_setArcOperation1131); 
            match(input,12,FOLLOW_12_in_setArcOperation1133); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1137); 
            match(input,29,FOLLOW_29_in_setArcOperation1139); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1143); 
            match(input,13,FOLLOW_13_in_setArcOperation1144); 
=======
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1114); 
            match(input,28,FOLLOW_28_in_setArcOperation1116); 
            match(input,12,FOLLOW_12_in_setArcOperation1118); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1122); 
            match(input,29,FOLLOW_29_in_setArcOperation1124); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1128); 
            match(input,13,FOLLOW_13_in_setArcOperation1129); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:270:1: mathTerm : ( literal | '(' mathExpression ')' );
    public final void mathTerm() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:271:5: ( literal | '(' mathExpression ')' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=ID && LA25_0<=STRING)||(LA25_0>=51 && LA25_0<=52)) ) {
                alt25=1;
            }
            else if ( (LA25_0==12) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:271:8: literal
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_literal_in_mathTerm1171);
=======
                    pushFollow(FOLLOW_literal_in_mathTerm1156);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    literal();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:272:8: '(' mathExpression ')'
                    {
<<<<<<< HEAD
                    match(input,12,FOLLOW_12_in_mathTerm1180); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1182);
=======
                    match(input,12,FOLLOW_12_in_mathTerm1165); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1167);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    mathExpression();

                    state._fsp--;

<<<<<<< HEAD
                    match(input,13,FOLLOW_13_in_mathTerm1184); 
=======
                    match(input,13,FOLLOW_13_in_mathTerm1169); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
    // $ANTLR end "mathTerm"


    // $ANTLR start "unaryExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:275:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | mathTerm );
    public final void unaryExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:276:5: ( '+' unaryExpression | '-' unaryExpression | mathTerm )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt26=1;
                }
                break;
            case 31:
                {
                alt26=2;
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
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:276:8: '+' unaryExpression
                    {
<<<<<<< HEAD
                    match(input,30,FOLLOW_30_in_unaryExpression1202); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1204);
=======
                    match(input,30,FOLLOW_30_in_unaryExpression1187); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1189);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    unaryExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:277:8: '-' unaryExpression
                    {
<<<<<<< HEAD
                    match(input,31,FOLLOW_31_in_unaryExpression1213); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1215);
=======
                    match(input,31,FOLLOW_31_in_unaryExpression1198); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1200);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    unaryExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:278:8: mathTerm
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1224);
=======
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1209);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    mathTerm();

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
    // $ANTLR end "unaryExpression"


    // $ANTLR start "multiplicativeExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:281:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final void multiplicativeExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:282:5: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:282:8: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1244);
=======
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1229);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            unaryExpression();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:282:24: ( ( '*' | '/' ) unaryExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=32 && LA27_0<=33)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:282:25: ( '*' | '/' ) unaryExpression
            	    {
            	    if ( (input.LA(1)>=32 && input.LA(1)<=33) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

<<<<<<< HEAD
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1253);
=======
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1238);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "mathExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:285:1: mathExpression : multiplicativeExpression ( ( '-' | '+' ) multiplicativeExpression )* ;
    public final void mathExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:286:5: ( multiplicativeExpression ( ( '-' | '+' ) multiplicativeExpression )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:286:9: multiplicativeExpression ( ( '-' | '+' ) multiplicativeExpression )*
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1275);
=======
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1260);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            multiplicativeExpression();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:286:34: ( ( '-' | '+' ) multiplicativeExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=30 && LA28_0<=31)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:286:35: ( '-' | '+' ) multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=30 && input.LA(1)<=31) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

<<<<<<< HEAD
            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1284);
=======
            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1269);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            	    multiplicativeExpression();

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
    // $ANTLR end "mathExpression"


    // $ANTLR start "logicalExpression"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:289:1: logicalExpression : relationExpression ( ( '&&' | '||' ) relationExpression )* ;
    public final void logicalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:4: ( relationExpression ( ( '&&' | '||' ) relationExpression )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:7: relationExpression ( ( '&&' | '||' ) relationExpression )*
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_relationExpression_in_logicalExpression1303);
=======
            pushFollow(FOLLOW_relationExpression_in_logicalExpression1288);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            relationExpression();

            state._fsp--;

            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:26: ( ( '&&' | '||' ) relationExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=34 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:27: ( '&&' | '||' ) relationExpression
            	    {
            	    if ( (input.LA(1)>=34 && input.LA(1)<=35) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

<<<<<<< HEAD
            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression1312);
=======
            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression1297);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            	    relationExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:293:1: relationExpression : ( '(' logicalExpression ')' | logicalAtom relationalOp logicalAtom );
    public final void relationExpression() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:5: ( '(' logicalExpression ')' | logicalAtom relationalOp logicalAtom )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==12) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=ID && LA30_0<=STRING)||LA30_0==36||(LA30_0>=51 && LA30_0<=52)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:8: '(' logicalExpression ')'
                    {
<<<<<<< HEAD
                    match(input,12,FOLLOW_12_in_relationExpression1331); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression1333);
=======
                    match(input,12,FOLLOW_12_in_relationExpression1316); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression1318);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    logicalExpression();

                    state._fsp--;

<<<<<<< HEAD
                    match(input,13,FOLLOW_13_in_relationExpression1335); 
=======
                    match(input,13,FOLLOW_13_in_relationExpression1320); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:295:8: logicalAtom relationalOp logicalAtom
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1344);
=======
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1329);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    logicalAtom();

                    state._fsp--;

<<<<<<< HEAD
                    pushFollow(FOLLOW_relationalOp_in_relationExpression1347);
=======
                    pushFollow(FOLLOW_relationalOp_in_relationExpression1332);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    relationalOp();

                    state._fsp--;

<<<<<<< HEAD
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1349);
=======
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1334);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:298:1: logicalAtom : ( idLiteral | intLiteral | floatLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );
    public final void logicalAtom() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:299:5: ( idLiteral | intLiteral | floatLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral )
            int alt31=8;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:299:7: idLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom1366);
=======
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom1351);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    idLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:300:7: intLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom1374);
=======
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom1359);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:301:7: floatLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom1382);
=======
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom1367);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    floatLiteral();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:302:7: stringLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom1390);
=======
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom1375);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    stringLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:303:7: booleanLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_booleanLiteral_in_logicalAtom1398);
=======
                    pushFollow(FOLLOW_booleanLiteral_in_logicalAtom1383);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:7: callClassMethod
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom1406);
=======
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom1391);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    callClassMethod();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:305:7: callInlineFunction
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom1414);
=======
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom1399);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    callInlineFunction();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:306:7: nullLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom1422);
=======
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom1407);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    nullLiteral();

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
    // $ANTLR end "logicalAtom"


    // $ANTLR start "nullLiteral"
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:309:1: nullLiteral : 'null' ;
    public final void nullLiteral() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:310:5: ( 'null' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:310:7: 'null'
            {
<<<<<<< HEAD
            match(input,36,FOLLOW_36_in_nullLiteral1439); 
=======
            match(input,36,FOLLOW_36_in_nullLiteral1424); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:313:1: relationalOp : ( '>' | '<' | '<=' | '>=' | '!=' | '==' );
    public final void relationalOp() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:314:4: ( '>' | '<' | '<=' | '>=' | '!=' | '==' )
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:322:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' );
    public final void assignmentOperator() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:323:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' )
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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:346:1: test : logicalExpression ';' ;
    public final void test() throws RecognitionException {
        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:5: ( logicalExpression ';' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:7: logicalExpression ';'
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_logicalExpression_in_test1687);
=======
            pushFollow(FOLLOW_logicalExpression_in_test1672);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            logicalExpression();

            state._fsp--;

<<<<<<< HEAD
            match(input,11,FOLLOW_11_in_test1689); 
=======
            match(input,11,FOLLOW_11_in_test1674); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:350:1: literal returns [String literalType, String literalValue] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.literal_return literal() throws RecognitionException {
        GraphLangParser.literal_return retval = new GraphLangParser.literal_return();
        retval.start = input.LT(1);

        GraphLangParser.intLiteral_return intLiteral10 = null;

        GraphLangParser.floatLiteral_return floatLiteral11 = null;

        GraphLangParser.idLiteral_return idLiteral12 = null;

        GraphLangParser.stringLiteral_return stringLiteral13 = null;

        GraphLangParser.booleanLiteral_return booleanLiteral14 = null;


        try {
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:351:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction )
            int alt32=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt32=1;
                }
                break;
            case FLOAT:
                {
                alt32=2;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt32=6;
                    }
                    break;
                case 12:
                    {
                    alt32=7;
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
                    alt32=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }

                }
                break;
            case STRING:
                {
                alt32=4;
                }
                break;
            case 51:
            case 52:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:351:9: intLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_intLiteral_in_literal1712);
=======
                    pushFollow(FOLLOW_intLiteral_in_literal1697);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    intLiteral10=intLiteral();

                    state._fsp--;

                    retval.literalType = "Int"; retval.literalValue =(intLiteral10!=null?input.toString(intLiteral10.start,intLiteral10.stop):null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:352:9: floatLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_floatLiteral_in_literal1724);
=======
                    pushFollow(FOLLOW_floatLiteral_in_literal1709);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    floatLiteral11=floatLiteral();

                    state._fsp--;

                    retval.literalType = "Float"; retval.literalValue =(floatLiteral11!=null?input.toString(floatLiteral11.start,floatLiteral11.stop):null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:353:9: idLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_idLiteral_in_literal1736);
=======
                    pushFollow(FOLLOW_idLiteral_in_literal1721);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    idLiteral12=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral12!=null?idLiteral12.idType:null); retval.literalValue =(idLiteral12!=null?input.toString(idLiteral12.start,idLiteral12.stop):null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:9: stringLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_stringLiteral_in_literal1748);
=======
                    pushFollow(FOLLOW_stringLiteral_in_literal1733);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    stringLiteral13=stringLiteral();

                    state._fsp--;

                    retval.literalType = "Text"; retval.literalValue =(stringLiteral13!=null?input.toString(stringLiteral13.start,stringLiteral13.stop):null);

                    }
                    break;
                case 5 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:355:9: booleanLiteral
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_booleanLiteral_in_literal1760);
=======
                    pushFollow(FOLLOW_booleanLiteral_in_literal1745);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    booleanLiteral14=booleanLiteral();

                    state._fsp--;

                    retval.literalType = "Bool"; retval.literalValue =(booleanLiteral14!=null?input.toString(booleanLiteral14.start,booleanLiteral14.stop):null);

                    }
                    break;
                case 6 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:356:9: callClassMethod
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_callClassMethod_in_literal1772);
=======
                    pushFollow(FOLLOW_callClassMethod_in_literal1757);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    callClassMethod();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:357:9: callInlineFunction
                    {
<<<<<<< HEAD
                    pushFollow(FOLLOW_callInlineFunction_in_literal1783);
=======
                    pushFollow(FOLLOW_callInlineFunction_in_literal1768);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
                    callInlineFunction();

                    state._fsp--;


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
<<<<<<< HEAD
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* ;
=======
    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:358:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* ;
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
    public final ArrayList<String> argumentList() throws RecognitionException {
        ArrayList<String> argumentTypeList = null;

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
<<<<<<< HEAD
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:361:3: (a= literal ( ',' b= literal )* )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:361:6: a= literal ( ',' b= literal )*
=======
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:3: (a= literal ( ',' b= literal )* )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:6: a= literal ( ',' b= literal )*
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            {

                    argumentTypeList = new ArrayList<String>();
                 
<<<<<<< HEAD
            pushFollow(FOLLOW_literal_in_argumentList1810);
=======
            pushFollow(FOLLOW_literal_in_argumentList1795);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            a=literal();

            state._fsp--;

            argumentTypeList.add((a!=null?a.literalType:null));
<<<<<<< HEAD
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:365:3: ( ',' b= literal )*
            loop33:
=======
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:363:3: ( ',' b= literal )*
            loop32:
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
<<<<<<< HEAD
            	    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:365:4: ',' b= literal
            	    {
            	    match(input,17,FOLLOW_17_in_argumentList1819); 
            	    pushFollow(FOLLOW_literal_in_argumentList1823);
=======
            	    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:363:4: ',' b= literal
            	    {
            	    match(input,17,FOLLOW_17_in_argumentList1804); 
            	    pushFollow(FOLLOW_literal_in_argumentList1808);
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
            	    b=literal();

            	    state._fsp--;

            	    argumentTypeList.add((b!=null?b.literalType:null));

            	    }
            	    break;

            	default :
            	    break loop33;
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
<<<<<<< HEAD
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:368:1: floatLiteral : FLOAT ;
=======
    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:366:1: floatLiteral : FLOAT ;
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        try {
<<<<<<< HEAD
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:369:3: ( FLOAT )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:369:5: FLOAT
            {
            match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral1841); 
=======
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:367:3: ( FLOAT )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:367:5: FLOAT
            {
            match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral1826); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
<<<<<<< HEAD
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:372:1: idLiteral returns [String idType] : ID ;
=======
    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:370:1: idLiteral returns [String idType] : ID ;
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID15=null;

        try {
<<<<<<< HEAD
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:373:3: ( ID )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:373:5: ID
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_idLiteral1859); 
=======
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:371:3: ( ID )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:371:5: ID
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_idLiteral1844); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID15!=null?ID15.getText():null))){
                    errors.add("line "+(ID15!=null?ID15.getLine():0)+": unknown variable "+(ID15!=null?ID15.getText():null));
                    retval.idType = "";
                  }
                  else{
                    names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID15!=null?ID15.getText():null)).addLineUses((ID15!=null?ID15.getLine():0));
                    retval.idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID15!=null?ID15.getText():null)).getType();
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
<<<<<<< HEAD
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:386:1: intLiteral : INT ;
=======
    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:384:1: intLiteral : INT ;
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        try {
<<<<<<< HEAD
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:387:3: ( INT )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:387:5: INT
            {
            match(input,INT,FOLLOW_INT_in_intLiteral1880); 
=======
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:385:3: ( INT )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:385:5: INT
            {
            match(input,INT,FOLLOW_INT_in_intLiteral1865); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
<<<<<<< HEAD
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:390:1: stringLiteral : STRING ;
=======
    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:388:1: stringLiteral : STRING ;
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        try {
<<<<<<< HEAD
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:391:3: ( STRING )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:391:6: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral1895); 
=======
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:389:3: ( STRING )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:389:6: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral1880); 
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de

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
<<<<<<< HEAD
    // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:1: booleanLiteral : ( 'true' | 'false' );
=======
    // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:392:1: booleanLiteral : ( 'true' | 'false' );
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
    public final GraphLangParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        GraphLangParser.booleanLiteral_return retval = new GraphLangParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
<<<<<<< HEAD
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:395:5: ( 'true' | 'false' )
            // D:\\Programming\\Projects\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
=======
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:393:5: ( 'true' | 'false' )
            // F:\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
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
    protected DFA31 dfa31 = new DFA31(this);
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
            return "125:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' '{' statement '}' 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );";
        }
    }
    static final String DFA31_eotS =
        "\12\uffff";
    static final String DFA31_eofS =
        "\12\uffff";
    static final String DFA31_minS =
        "\1\5\1\13\10\uffff";
    static final String DFA31_maxS =
        "\1\64\1\52\10\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\10\1\6\1\7\1\1";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\1\3\1\2\1\4\33\uffff\1\6\16\uffff\2\5",
            "\1\11\1\10\1\11\15\uffff\1\7\6\uffff\2\11\1\uffff\6\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "298:1: logicalAtom : ( idLiteral | intLiteral | floatLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );";
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
    public static final BitSet FOLLOW_12_in_statement437 = new BitSet(new long[]{0x00000000000008A0L});
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
    public static final BitSet FOLLOW_14_in_statement492 = new BitSet(new long[]{0x0000000001E80030L});
    public static final BitSet FOLLOW_statement_in_statement494 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement496 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement498 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement500 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement502 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement504 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement517 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement529 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement541 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement553 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement565 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_statement567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl590 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_foreachControl592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl594 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_foreachControl597 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< HEAD
    public static final BitSet FOLLOW_forInit_in_forControl648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_forControl651 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_forControl653 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_forControl655 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_forUpdate_in_forControl657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forUpdate677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forUpdate687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forInit706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction734 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_callInlineFunction736 = new BitSet(new long[]{0x0018000001E821F0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callInlineFunction741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod771 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_callClassMethod773 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod788 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_callClassMethod802 = new BitSet(new long[]{0x0018000001E821F0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod804 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callClassMethod807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation827 = new BitSet(new long[]{0x0007F80010000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation829 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation856 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_setGraphOperation858 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_setGraphOperation860 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation865 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation867 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_setGraphOperation869 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation871 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation873 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation876 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setGraphOperation879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList909 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_variableList914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList918 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions946 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcExpressions948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions952 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_setArcExpressions975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions979 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcExpressions981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions985 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1069 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_variableDeclarators1072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1074 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1129 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_setArcOperation1131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_setArcOperation1133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1137 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcOperation1139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setArcOperation1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_mathTerm1180 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_mathTerm1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_unaryExpression1202 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unaryExpression1213 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1244 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1247 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1253 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1275 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_set_in_mathExpression1278 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1284 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1303 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_logicalExpression1306 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1312 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_12_in_relationExpression1331 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression1333 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_relationExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1344 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_relationalOp_in_relationExpression1347 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_logicalAtom1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nullLiteral1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExpression_in_test1687 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_test1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList1810 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_argumentList1819 = new BitSet(new long[]{0x0018000001E801F0L});
    public static final BitSet FOLLOW_literal_in_argumentList1823 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral1895 = new BitSet(new long[]{0x0000000000000002L});
=======
    public static final BitSet FOLLOW_forInit_in_forControl643 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_forControl646 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_forControl648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_forControl650 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_forUpdate_in_forControl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forUpdate672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forUpdate682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_forInit701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_callInlineFunction721 = new BitSet(new long[]{0x0018000001E821F0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction723 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callInlineFunction726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod756 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_callClassMethod758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod773 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_callClassMethod787 = new BitSet(new long[]{0x0018000001E821F0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod789 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callClassMethod792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation812 = new BitSet(new long[]{0x0007F80010000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation814 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation841 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_setGraphOperation843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_setGraphOperation845 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation848 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation850 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation852 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_setGraphOperation854 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation856 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation858 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setGraphOperation864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList894 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_variableList899 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList903 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions931 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcExpressions933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions937 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_setArcExpressions960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions964 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcExpressions966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions970 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1054 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_variableDeclarators1057 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1059 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1114 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_setArcOperation1116 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_setArcOperation1118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1122 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcOperation1124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setArcOperation1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_mathTerm1165 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_mathTerm1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_unaryExpression1187 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unaryExpression1198 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1229 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1232 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1238 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1260 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_set_in_mathExpression1263 = new BitSet(new long[]{0x00180000C1E811F0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1269 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1288 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_logicalExpression1291 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1297 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_12_in_relationExpression1316 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression1318 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_relationExpression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1329 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_relationalOp_in_relationExpression1332 = new BitSet(new long[]{0x0018001001E811F0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_logicalAtom1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nullLiteral1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExpression_in_test1672 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_test1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList1795 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_argumentList1804 = new BitSet(new long[]{0x0018000001E801F0L});
    public static final BitSet FOLLOW_literal_in_argumentList1808 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral1880 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> bcf5113ac6307d3e5a68709d73679970b19308de
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});

}