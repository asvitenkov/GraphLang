// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-04-27 04:49:28

  package graphlang;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GraphLangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "ID", "RELATIONALOP", "FLOAT", "INT", "STRING", "COMMENT", "WS", "';'", "'('", "')'", "'{'", "'}'", "'return'", "','", "'main'", "'if'", "'else'", "'for'", "'foreach'", "'while'", "'do'", "'output'", "'input'", "'.'", "'='", "'->'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'null'", "'+='", "'-='", "'*='", "'/='", "'%='", "'true'", "'false'"
    };
    public static final int EOF=-1;
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
    public static final int TYPE=4;
    public static final int ID=5;
    public static final int RELATIONALOP=6;
    public static final int FLOAT=7;
    public static final int INT=8;
    public static final int STRING=9;
    public static final int COMMENT=10;
    public static final int WS=11;

    // delegates
    // delegators


        public GraphLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GraphLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GraphLangParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g"; }


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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:25:1: programm : ( globalExpression )* mainBlock ;
    public final void programm() throws RecognitionException {
        programm_stack.push(new programm_scope());

          ((programm_scope)programm_stack.peek()).curBlock = "";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:4: ( ( globalExpression )* mainBlock )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:6: ( globalExpression )* mainBlock
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:6: ( globalExpression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:32:6: globalExpression
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:1: globalExpression : ( globalVariableDeclaration | functionDeclaration );
    public final void globalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:4: ( globalVariableDeclaration | functionDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TYPE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==12||LA2_2==18) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==13) ) {
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:7: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression80);
                    globalVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_globalExpression88);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:1: globalVariableDeclaration : variableDeclarationStatement ';' ;
    public final void globalVariableDeclaration() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:4: ( variableDeclarationStatement ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:7: variableDeclarationStatement ';'
            {
            ((programm_scope)programm_stack.peek()).curBlock = "global";
            pushFollow(FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration112);
            variableDeclarationStatement();

            state._fsp--;

            match(input,12,FOLLOW_12_in_globalVariableDeclaration114); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:45:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:62:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:63:8: TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}'
            {
            TYPE1=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration146); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE1!=null?TYPE1.getText():null); 
            ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration157); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID2!=null?ID2.getText():null);
            match(input,13,FOLLOW_13_in_functionDeclaration170); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:65:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:65:12: functionArgumentList
                    {
                    pushFollow(FOLLOW_functionArgumentList_in_functionDeclaration172);
                    functionArgumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_functionDeclaration175); 

            	            //add functon in namestable if it's not exists
            	            if(!names.isExistFunction((ID2!=null?ID2.getText():null))){
            	              names.addFunction(names.new FunctionName((ID2!=null?ID2.getText():null), (TYPE1!=null?TYPE1.getText():null) ,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames, (ID2!=null?ID2.getLine():0)));
            	            }
            	            else{
            	              errors.add("line "+(ID2!=null?ID2.getLine():0)+": duplicated function declaration "+(ID2!=null?ID2.getText():null));
            	            }
            	          
            match(input,15,FOLLOW_15_in_functionDeclaration199); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:12: ( blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==20||(LA4_0>=22 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:12: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_functionDeclaration201);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:29: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:75:29: returnOperator
                    {
                    pushFollow(FOLLOW_returnOperator_in_functionDeclaration205);
                    returnOperator();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_functionDeclaration208); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:84:1: returnOperator : 'return' ( ID )? ';' ;
    public final void returnOperator() throws RecognitionException {
        Token ID3=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:11: 'return' ( ID )? ';'
            {
            match(input,17,FOLLOW_17_in_returnOperator237); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:20: ID
                    {
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_returnOperator239); 

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_returnOperator242); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:92:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final void functionArgumentList() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList272);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:36: ',' functionArgumentDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_functionArgumentList275); 
            	    pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList277);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:96:1: functionArgumentDeclarator : TYPE ID ;
    public final void functionArgumentDeclarator() throws RecognitionException {
        Token TYPE4=null;
        Token ID5=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:97:5: ( TYPE ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:97:8: TYPE ID
            {
            TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionArgumentDeclarator297); 
            ID5=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentDeclarator299); 

                  // add variable and it's type in lists funcArgTypes and funcArgNames
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes.add((TYPE4!=null?TYPE4.getText():null));
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames.add((ID5!=null?ID5.getText():null));
                  if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID5!=null?ID5.getText():null))){
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:111:1: mainBlock : 'main' '{' ( blockStatement )* '}' ;
    public final void mainBlock() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:4: ( 'main' '{' ( blockStatement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:6: 'main' '{' ( blockStatement )* '}'
            {
            match(input,19,FOLLOW_19_in_mainBlock322); 
            match(input,15,FOLLOW_15_in_mainBlock324); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:17: ( blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==20||(LA8_0>=22 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:17: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_mainBlock326);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_mainBlock329); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:115:1: blockStatement : ( variableDeclarationStatement ';' | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:116:5: ( variableDeclarationStatement ';' | statement )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TYPE) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID||LA9_0==20||(LA9_0>=22 && LA9_0<=25)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:116:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement347);
                    variableDeclarationStatement();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_blockStatement349); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:117:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement359);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:121:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:5: ( '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:7: '{' ( statement )* '}'
            {
            match(input,15,FOLLOW_15_in_block385); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:11: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==20||(LA10_0>=22 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block387);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_block390); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:125:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:5: ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:9: 'if' '(' logicalExpression ')' block ( 'else' block )?
                    {
                    match(input,20,FOLLOW_20_in_statement409); 
                    match(input,13,FOLLOW_13_in_statement411); 
                    pushFollow(FOLLOW_logicalExpression_in_statement413);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement415); 
                    pushFollow(FOLLOW_block_in_statement417);
                    block();

                    state._fsp--;

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:46: ( 'else' block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:47: 'else' block
                            {
                            match(input,21,FOLLOW_21_in_statement420); 
                            pushFollow(FOLLOW_block_in_statement422);
                            block();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:9: 'for' '(' forControl ')' block
                    {
                    match(input,22,FOLLOW_22_in_statement434); 
                    match(input,13,FOLLOW_13_in_statement436); 
                    pushFollow(FOLLOW_forControl_in_statement438);
                    forControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement440); 
                    pushFollow(FOLLOW_block_in_statement442);
                    block();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:9: 'foreach' '(' foreachControl ')' block
                    {
                    match(input,23,FOLLOW_23_in_statement452); 
                    match(input,13,FOLLOW_13_in_statement454); 
                    pushFollow(FOLLOW_foreachControl_in_statement456);
                    foreachControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement458); 
                    pushFollow(FOLLOW_block_in_statement460);
                    block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:9: 'while' '(' logicalExpression ')' block
                    {
                    match(input,24,FOLLOW_24_in_statement470); 
                    match(input,13,FOLLOW_13_in_statement472); 
                    pushFollow(FOLLOW_logicalExpression_in_statement474);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement476); 
                    pushFollow(FOLLOW_block_in_statement478);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:9: 'do' block 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,25,FOLLOW_25_in_statement488); 
                    pushFollow(FOLLOW_block_in_statement491);
                    block();

                    state._fsp--;

                    match(input,24,FOLLOW_24_in_statement493); 
                    match(input,13,FOLLOW_13_in_statement495); 
                    pushFollow(FOLLOW_logicalExpression_in_statement497);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement499); 
                    match(input,12,FOLLOW_12_in_statement501); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:131:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement512);
                    assignmentOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement514); 

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:132:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement524);
                    setArcOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement526); 

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:133:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement536);
                    setGraphOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement538); 

                    }
                    break;
                case 9 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement548);
                    callClassMethod();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement550); 

                    }
                    break;
                case 10 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:135:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement560);
                    callInlineFunction();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement562); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:1: foreachControl : f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? ;
    public final void foreachControl() throws RecognitionException {
        GraphLangParser.idLiteral_return f = null;

        GraphLangParser.idLiteral_return s = null;

        GraphLangParser.foreachType_return foreachType6 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:5: (f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:9: f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )?
            {
            pushFollow(FOLLOW_idLiteral_in_foreachControl587);
            f=idLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_foreachControl589); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl593);
            s=idLiteral();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:37: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:38: ';' ( foreachType )?
                    {
                    match(input,12,FOLLOW_12_in_foreachControl596); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:42: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:42: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl598);
                            foreachType6=foreachType();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            		        if(!names.checkForeachControl(((programm_scope)programm_stack.peek()).curBlock+"."+(f!=null?input.toString(f.start,f.stop):null), ((programm_scope)programm_stack.peek()).curBlock+"."+(s!=null?input.toString(s.start,s.stop):null),(foreachType6!=null?input.toString(foreachType6.start,foreachType6.stop):null), (s!=null?s.curLine:0))){
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
    // $ANTLR end "foreachControl"

    public static class foreachType_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "foreachType"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:1: foreachType : ( 'output' | 'input' );
    public final GraphLangParser.foreachType_return foreachType() throws RecognitionException {
        GraphLangParser.foreachType_return retval = new GraphLangParser.foreachType_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:5: ( 'output' | 'input' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( (input.LA(1)>=26 && input.LA(1)<=27) ) {
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
    // $ANTLR end "foreachType"


    // $ANTLR start "forControl"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:152:1: forControl : ( forInit )? ';' forLiteral ';' forLiteral ;
    public final void forControl() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:5: ( ( forInit )? ';' forLiteral ';' forLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:9: ( forInit )? ';' forLiteral ';' forLiteral
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:9: ( forInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:9: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forControl655);
                    forInit();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_forControl658); 
            pushFollow(FOLLOW_forLiteral_in_forControl660);
            forLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_forControl662); 
            pushFollow(FOLLOW_forLiteral_in_forControl664);
            forLiteral();

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


    // $ANTLR start "forLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:157:1: forLiteral : ( intLiteral | idLiteral | callClassMethod | callInlineFunction );
    public final void forLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return idLiteral7 = null;

        GraphLangParser.callClassMethod_return callClassMethod8 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction9 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:158:5: ( intLiteral | idLiteral | callClassMethod | callInlineFunction )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==ID) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt16=3;
                    }
                    break;
                case 13:
                    {
                    alt16=4;
                    }
                    break;
                case 12:
                case 14:
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:158:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forLiteral688);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:159:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forLiteral699);
                    idLiteral7=idLiteral();

                    state._fsp--;

                    if(!(idLiteral7!=null?idLiteral7.idType:null).equals("Int")){errors.add("line "+(idLiteral7!=null?idLiteral7.curLine:0)+": for  variable must have type int ");}

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:160:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_forLiteral711);
                    callClassMethod8=callClassMethod();

                    state._fsp--;

                    if(!(callClassMethod8!=null?callClassMethod8.methodType:null).equals("Int")){errors.add("line "+(callClassMethod8!=null?callClassMethod8.curLine:0)+": for variable must have type int ");}

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_forLiteral723);
                    callInlineFunction9=callInlineFunction();

                    state._fsp--;

                    if(!(callInlineFunction9!=null?callInlineFunction9.functionType:null).equals("Int")){errors.add("line "+(callInlineFunction9!=null?callInlineFunction9.curLine:0)+": for variable must have type int ");}

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
    // $ANTLR end "forLiteral"


    // $ANTLR start "forInit"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:1: forInit : idLiteral ;
    public final void forInit() throws RecognitionException {
        GraphLangParser.idLiteral_return idLiteral10 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:166:5: ( idLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:166:9: idLiteral
            {
            pushFollow(FOLLOW_idLiteral_in_forInit745);
            idLiteral10=idLiteral();

            state._fsp--;


                    if(!(idLiteral10!=null?idLiteral10.idType:null).equals("Int")){
                      errors.add("line "+(idLiteral10!=null?idLiteral10.curLine:0)+": for init variable must have type int ");
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
    // $ANTLR end "forInit"

    public static class callInlineFunction_return extends ParserRuleReturnScope {
        public String functionType;
        public int curLine;
    };

    // $ANTLR start "callInlineFunction"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:174:1: callInlineFunction returns [String functionType, int curLine] : ID '(' ( argumentList )? ')' ;
    public final GraphLangParser.callInlineFunction_return callInlineFunction() throws RecognitionException {
        GraphLangParser.callInlineFunction_return retval = new GraphLangParser.callInlineFunction_return();
        retval.start = input.LT(1);

        Token ID11=null;
        ArrayList<String> argumentList12 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:175:5: ( ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:175:8: ID '(' ( argumentList )? ')'
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_callInlineFunction774); 
            match(input,13,FOLLOW_13_in_callInlineFunction776); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:175:15: ( argumentList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=FLOAT && LA17_0<=STRING)||(LA17_0>=43 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:175:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction778);
                    argumentList12=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callInlineFunction781); 

                      retval.functionType = "?";
                      ArrayList list = null;
                      retval.curLine = (ID11!=null?ID11.getLine():0);
                      if(argumentList12==null) list = new ArrayList<String>();
                      else list =  argumentList12;
                      if(!names.checkCallFunction(((programm_scope)programm_stack.peek()).curBlock, (ID11!=null?ID11.getText():null), list, (ID11!=null?ID11.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      else{
                          retval.functionType = names.getFunction((ID11!=null?ID11.getText():null)).getReturnType();
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
    // $ANTLR end "callInlineFunction"

    protected static class callClassMethod_scope {
        String variableId;
        String methodName;
        //ArrayList<String> argumentTypeList;
    }
    protected Stack callClassMethod_stack = new Stack();

    public static class callClassMethod_return extends ParserRuleReturnScope {
        public String methodType;
        public int curLine;
    };

    // $ANTLR start "callClassMethod"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:193:1: callClassMethod returns [String methodType, int curLine] : varId= ID '.' mName= ID '(' ( argumentList )? ')' ;
    public final GraphLangParser.callClassMethod_return callClassMethod() throws RecognitionException {
        callClassMethod_stack.push(new callClassMethod_scope());
        GraphLangParser.callClassMethod_return retval = new GraphLangParser.callClassMethod_return();
        retval.start = input.LT(1);

        Token varId=null;
        Token mName=null;
        ArrayList<String> argumentList13 = null;



          ((callClassMethod_scope)callClassMethod_stack.peek()).variableId ="";
          ((callClassMethod_scope)callClassMethod_stack.peek()).methodName ="";
          //((callClassMethod_scope)callClassMethod_stack.peek()).argumentTypeList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:204:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:204:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod820); 
            match(input,28,FOLLOW_28_in_callClassMethod822); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null); 
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod837); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            match(input,13,FOLLOW_13_in_callClassMethod851); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:206:13: ( argumentList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||(LA18_0>=FLOAT && LA18_0<=STRING)||(LA18_0>=43 && LA18_0<=44)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:206:13: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callClassMethod853);
                    argumentList13=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callClassMethod856); 

                      retval.methodType ="?";
                      retval.curLine = (varId!=null?varId.getLine():0);
                      ArrayList list = null;
                      if(argumentList13==null) list = new ArrayList<String>();
                      else list =  argumentList13;
                      if(!names.checkCallClassMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null), argumentList13, (varId!=null?varId.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      if(names.isExistMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null))){
                        retval.methodType = names.getMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null)).getReturnType();
                      }
                    

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            callClassMethod_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "callClassMethod"

    protected static class assignmentOperation_scope {
        String idType;
    }
    protected Stack assignmentOperation_stack = new Stack();


    // $ANTLR start "assignmentOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:222:1: assignmentOperation : ID assignmentOperator mathExpression ;
    public final void assignmentOperation() throws RecognitionException {
        assignmentOperation_stack.push(new assignmentOperation_scope());
        Token ID14=null;
        GraphLangParser.assignmentOperator_return assignmentOperator15 = null;

        String mathExpression16 = null;



            ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = "none";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:229:5: ( ID assignmentOperator mathExpression )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:229:8: ID assignmentOperator mathExpression
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_assignmentOperation892); 

                      if(names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID14!=null?ID14.getText():null))){
                        ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID14!=null?ID14.getText():null)).getType();
                      }
                   
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation912);
            assignmentOperator15=assignmentOperator();

            state._fsp--;

            pushFollow(FOLLOW_mathExpression_in_assignmentOperation922);
            mathExpression16=mathExpression();

            state._fsp--;


                      if(!typeCheker.checkAssignOperation((assignmentOperator15!=null?input.toString(assignmentOperator15.start,assignmentOperator15.stop):null),  ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType, mathExpression16, (ID14!=null?ID14.getLine():0))){
                          typeCheker.getAllErrors(errors);
                      }
                   

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:244:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' ;
    public final void setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        Token ID17=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:255:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:255:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation956); 
            match(input,29,FOLLOW_29_in_setGraphOperation958); 
            match(input,13,FOLLOW_13_in_setGraphOperation960); 
            match(input,15,FOLLOW_15_in_setGraphOperation963); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation965);
            variableList();

            state._fsp--;

            match(input,16,FOLLOW_16_in_setGraphOperation967); 
            match(input,18,FOLLOW_18_in_setGraphOperation969); 
            match(input,15,FOLLOW_15_in_setGraphOperation971); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:255:49: ( setArcExpressions )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:255:49: setArcExpressions
                    {
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation973);
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_setGraphOperation976); 
            match(input,14,FOLLOW_14_in_setGraphOperation979); 

                        names.checkSetGraphOperator((ID17!=null?ID17.getText():null),((programm_scope)programm_stack.peek()).curBlock,((setGraphOperation_scope)setGraphOperation_stack.peek()).varList,((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList,((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList,(ID17!=null?ID17.getLine():0));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:262:1: variableList : a= ID ( ',' b= ID )* ;
    public final void variableList() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:263:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:263:8: a= ID ( ',' b= ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList1009); 
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:263:58: ( ',' b= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:263:59: ',' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_variableList1014); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList1018); 
            	     ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((b!=null?b.getText():null));

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:267:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final void setArcExpressions() throws RecognitionException {
        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:268:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:268:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1046); 
            match(input,30,FOLLOW_30_in_setArcExpressions1048); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1052); 

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:273:8: ( ',' a= ID '->' b= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:273:9: ',' a= ID '->' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_setArcExpressions1075); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1079); 
            	    match(input,30,FOLLOW_30_in_setArcExpressions1081); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1085); 
            	    ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((a!=null?a.getText():null)); ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((b!=null?b.getText():null)); 

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
    // $ANTLR end "setArcExpressions"


    // $ANTLR start "variableDeclarationStatement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:278:1: variableDeclarationStatement : variableDeclaration ;
    public final void variableDeclarationStatement() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:279:4: ( variableDeclaration )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:279:6: variableDeclaration
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1108);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:282:1: variableDeclaration : TYPE variableDeclarators ;
    public final void variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        Token TYPE18=null;


          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:289:5: ( TYPE variableDeclarators )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:289:9: TYPE variableDeclarators
            {
            TYPE18=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1133); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE18!=null?TYPE18.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1137);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:292:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
    public final void variableDeclarators() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:293:5: ( variableDeclarator ( ',' variableDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:293:9: variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1156);
            variableDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:293:28: ( ',' variableDeclarator )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:293:29: ',' variableDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_variableDeclarators1159); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1161);
            	    variableDeclarator();

            	    state._fsp--;


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
    // $ANTLR end "variableDeclarators"

    protected static class variableDeclarator_scope {
        ArrayList<String> varList;
    }
    protected Stack variableDeclarator_stack = new Stack();


    // $ANTLR start "variableDeclarator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:296:1: variableDeclarator : ID ;
    public final void variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        Token ID19=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:303:5: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:303:9: ID
            {
            ID19=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1189); 

                    if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID19!=null?ID19.getText():null)) ){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID19!=null?ID19.getText():null), ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType, (ID19!=null?ID19.getLine():0)));
                      ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList.add(((programm_scope)programm_stack.peek()).curBlock+"."+(ID19!=null?ID19.getText():null));
            	      }
            	      else{
            	          errors.add("line "+(ID19!=null?ID19.getLine():0)+": duplicated variable name "+(ID19!=null?ID19.getText():null));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:315:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' ;
    public final void setArcOperation() throws RecognitionException {
        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:316:5: (id= ID '=' '(' from= ID '->' to= ID ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:316:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1216); 
            match(input,29,FOLLOW_29_in_setArcOperation1218); 
            match(input,13,FOLLOW_13_in_setArcOperation1220); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1224); 
            match(input,30,FOLLOW_30_in_setArcOperation1226); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1230); 
            match(input,14,FOLLOW_14_in_setArcOperation1231); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:325:1: mathTerm returns [String mathTermType] : ( literal | '(' mathExpression ')' );
    public final String mathTerm() throws RecognitionException {
        String mathTermType = null;

        GraphLangParser.literal_return literal20 = null;

        String mathExpression21 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:326:5: ( literal | '(' mathExpression ')' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID||(LA23_0>=FLOAT && LA23_0<=STRING)||(LA23_0>=43 && LA23_0<=44)) ) {
                alt23=1;
            }
            else if ( (LA23_0==13) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:326:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_mathTerm1262);
                    literal20=literal();

                    state._fsp--;

                    mathTermType = (literal20!=null?literal20.literalType:null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:327:8: '(' mathExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_mathTerm1273); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1275);
                    mathExpression21=mathExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_mathTerm1277); 
                    mathTermType = mathExpression21;

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:330:1: unaryExpression returns [String unaryExpressionType] : ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm );
    public final String unaryExpression() throws RecognitionException {
        String unaryExpressionType = null;

        String a = null;

        String b = null;

        String mathTerm22 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:331:5: ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt24=1;
                }
                break;
            case 32:
                {
                alt24=2;
                }
                break;
            case ID:
            case FLOAT:
            case INT:
            case STRING:
            case 13:
            case 43:
            case 44:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:331:8: '+' a= unaryExpression
                    {
                    match(input,31,FOLLOW_31_in_unaryExpression1301); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1305);
                    a=unaryExpression();

                    state._fsp--;

                    unaryExpressionType = a;

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:332:8: '-' b= unaryExpression
                    {
                    match(input,32,FOLLOW_32_in_unaryExpression1316); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1320);
                    b=unaryExpression();

                    state._fsp--;

                    unaryExpressionType = b;

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:333:8: mathTerm
                    {
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1331);
                    mathTerm22=mathTerm();

                    state._fsp--;

                    unaryExpressionType = mathTerm22;

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:336:1: multiplicativeExpression returns [String multiplicativeExpressionType] : a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* ;
    public final String multiplicativeExpression() throws RecognitionException {
        String multiplicativeExpressionType = null;

        String a = null;

        String b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:337:5: (a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:337:7: a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1366);
            a=unaryExpression();

            state._fsp--;

            type.add(a);
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:338:61: ( ( '*' | '/' ) b= unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:338:62: ( '*' | '/' ) b= unaryExpression
            	    {
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1379);
            	    b=unaryExpression();

            	    state._fsp--;

            	    type.add(b);

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:345:1: mathExpression returns [String mathExpressionType] : a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* ;
    public final String mathExpression() throws RecognitionException {
        String mathExpressionType = null;

        String a = null;

        String b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:346:5: (a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:346:9: a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1436);
            a=multiplicativeExpression();

            state._fsp--;

            type.add(a);
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:82: ( ( '-' | '+' ) b= multiplicativeExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=31 && LA26_0<=32)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:83: ( '-' | '+' ) b= multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1450);
            	    b=multiplicativeExpression();

            	    state._fsp--;

            	    type.add(b);

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:353:1: logicalExpression : relationExpression ( ( '&&' | '||' ) relationExpression )* ;
    public final void logicalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:4: ( relationExpression ( ( '&&' | '||' ) relationExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:7: relationExpression ( ( '&&' | '||' ) relationExpression )*
            {
            pushFollow(FOLLOW_relationExpression_in_logicalExpression1484);
            relationExpression();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:26: ( ( '&&' | '||' ) relationExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=35 && LA27_0<=36)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:27: ( '&&' | '||' ) relationExpression
            	    {
            	    if ( (input.LA(1)>=35 && input.LA(1)<=36) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression1493);
            	    relationExpression();

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
    // $ANTLR end "logicalExpression"


    // $ANTLR start "relationExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:358:1: relationExpression : ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) ;
    public final void relationExpression() throws RecognitionException {
        Token RELATIONALOP23=null;
        String t1 = null;

        String t2 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:5: ( ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            else if ( (LA28_0==ID||(LA28_0>=FLOAT && LA28_0<=STRING)||LA28_0==37||(LA28_0>=43 && LA28_0<=44)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:9: '(' logicalExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_relationExpression1514); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression1516);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_relationExpression1518); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:8: t1= logicalAtom RELATIONALOP t2= logicalAtom
                    {
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1529);
                    t1=logicalAtom();

                    state._fsp--;

                    RELATIONALOP23=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_relationExpression1532); 
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1536);
                    t2=logicalAtom();

                    state._fsp--;


                              if(!t1.equals(t2)){
                                if(t1.equals("null")){
                                  if(!t2.equals("OArc") && !t2.equals("Graph") && !t2.equals("Node") && !t2.equals("Text")){
                                      errors.add("line "+(RELATIONALOP23!=null?RELATIONALOP23.getLine():0)+": the operator "+(RELATIONALOP23!=null?RELATIONALOP23.getText():null) +" is undefined for arguments null,"+t2);
                                  }
                                }
                                else if(t2.equals("null")){
                                  if(!t1.equals("OArc") && !t1.equals("Graph") && !t1.equals("Node") && !t1.equals("Text")){
                                      errors.add("line "+(RELATIONALOP23!=null?RELATIONALOP23.getLine():0)+": the operator "+(RELATIONALOP23!=null?RELATIONALOP23.getText():null) +" is undefined for arguments null,"+t2);
                                  }
                                }
                                else {
                                  errors.add("line "+(RELATIONALOP23!=null?RELATIONALOP23.getLine():0)+": the operator "+(RELATIONALOP23!=null?RELATIONALOP23.getText():null) +" is undefined for arguments "+t1+","+t2);
                                }
                                
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
    // $ANTLR end "relationExpression"


    // $ANTLR start "logicalAtom"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:382:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );
    public final String logicalAtom() throws RecognitionException {
        String atomType = null;

        GraphLangParser.idLiteral_return idLiteral24 = null;

        GraphLangParser.callClassMethod_return callClassMethod25 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction26 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom1574);
                    intLiteral();

                    state._fsp--;

                    atomType = "Int"; 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:384:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom1586);
                    floatLiteral();

                    state._fsp--;

                    atomType = "Float"; 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:385:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom1598);
                    idLiteral24=idLiteral();

                    state._fsp--;

                    atomType = (idLiteral24!=null?idLiteral24.idType:null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:386:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom1610);
                    stringLiteral();

                    state._fsp--;

                    atomType = "Text"; 

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:387:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_logicalAtom1622);
                    booleanLiteral();

                    state._fsp--;

                    atomType = "Bool"; 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:388:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom1634);
                    callClassMethod25=callClassMethod();

                    state._fsp--;

                    atomType = (callClassMethod25!=null?callClassMethod25.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:389:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom1646);
                    callInlineFunction26=callInlineFunction();

                    state._fsp--;

                    atomType = (callInlineFunction26!=null?callInlineFunction26.functionType:null);

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:390:9: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom1658);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:393:1: nullLiteral : 'null' ;
    public final void nullLiteral() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:5: ( 'null' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:7: 'null'
            {
            match(input,37,FOLLOW_37_in_nullLiteral1677); 

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

    public static class assignmentOperator_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "assignmentOperator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:406:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
    public final GraphLangParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        GraphLangParser.assignmentOperator_return retval = new GraphLangParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:407:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( input.LA(1)==29||(input.LA(1)>=38 && input.LA(1)<=42) ) {
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
    // $ANTLR end "assignmentOperator"

    public static class literal_return extends ParserRuleReturnScope {
        public String literalType;
        public String literalValue;
    };

    // $ANTLR start "literal"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:426:1: literal returns [String literalType, String literalValue] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.literal_return literal() throws RecognitionException {
        GraphLangParser.literal_return retval = new GraphLangParser.literal_return();
        retval.start = input.LT(1);

        GraphLangParser.intLiteral_return intLiteral27 = null;

        GraphLangParser.floatLiteral_return floatLiteral28 = null;

        GraphLangParser.idLiteral_return idLiteral29 = null;

        GraphLangParser.stringLiteral_return stringLiteral30 = null;

        GraphLangParser.booleanLiteral_return booleanLiteral31 = null;

        GraphLangParser.callClassMethod_return callClassMethod32 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction33 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:427:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction )
            int alt30=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt30=1;
                }
                break;
            case FLOAT:
                {
                alt30=2;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt30=6;
                    }
                    break;
                case 13:
                    {
                    alt30=7;
                    }
                    break;
                case 12:
                case 14:
                case 18:
                case 31:
                case 32:
                case 33:
                case 34:
                    {
                    alt30=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }

                }
                break;
            case STRING:
                {
                alt30=4;
                }
                break;
            case 43:
            case 44:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:427:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_literal1894);
                    intLiteral27=intLiteral();

                    state._fsp--;

                    retval.literalType = "Int"; retval.literalValue =(intLiteral27!=null?input.toString(intLiteral27.start,intLiteral27.stop):null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:428:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_literal1906);
                    floatLiteral28=floatLiteral();

                    state._fsp--;

                    retval.literalType = "Float"; retval.literalValue =(floatLiteral28!=null?input.toString(floatLiteral28.start,floatLiteral28.stop):null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:429:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_literal1918);
                    idLiteral29=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral29!=null?idLiteral29.idType:null); retval.literalValue =(idLiteral29!=null?input.toString(idLiteral29.start,idLiteral29.stop):null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:430:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal1930);
                    stringLiteral30=stringLiteral();

                    state._fsp--;

                    retval.literalType = "Text"; retval.literalValue =(stringLiteral30!=null?input.toString(stringLiteral30.start,stringLiteral30.stop):null);

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:431:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal1942);
                    booleanLiteral31=booleanLiteral();

                    state._fsp--;

                    retval.literalType = "Bool"; retval.literalValue =(booleanLiteral31!=null?input.toString(booleanLiteral31.start,booleanLiteral31.stop):null); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:432:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_literal1954);
                    callClassMethod32=callClassMethod();

                    state._fsp--;

                    retval.literalType = (callClassMethod32!=null?callClassMethod32.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:433:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_literal1966);
                    callInlineFunction33=callInlineFunction();

                    state._fsp--;

                    retval.literalType = (callInlineFunction33!=null?callInlineFunction33.functionType:null);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:436:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* ;
    public final ArrayList<String> argumentList() throws RecognitionException {
        ArrayList<String> argumentTypeList = null;

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:437:3: (a= literal ( ',' b= literal )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:437:6: a= literal ( ',' b= literal )*
            {

                    argumentTypeList = new ArrayList<String>();
                 
            pushFollow(FOLLOW_literal_in_argumentList1995);
            a=literal();

            state._fsp--;

            argumentTypeList.add((a!=null?a.literalType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:441:3: ( ',' b= literal )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:441:4: ',' b= literal
            	    {
            	    match(input,18,FOLLOW_18_in_argumentList2004); 
            	    pushFollow(FOLLOW_literal_in_argumentList2008);
            	    b=literal();

            	    state._fsp--;

            	    argumentTypeList.add((b!=null?b.literalType:null));

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:444:1: floatLiteral : FLOAT ;
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:445:3: ( FLOAT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:445:5: FLOAT
            {
            match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral2026); 

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
        public int curLine;
    };

    // $ANTLR start "idLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:448:1: idLiteral returns [String idType, int curLine] : ID ;
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID34=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:3: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:5: ID
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_idLiteral2044); 

                  retval.curLine = (ID34!=null?ID34.getLine():0);
                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID34!=null?ID34.getText():null))){
                    errors.add("line "+(ID34!=null?ID34.getLine():0)+": unknown variable "+(ID34!=null?ID34.getText():null));
                    retval.idType = "";
                  }
                  else{
                    names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID34!=null?ID34.getText():null)).addLineUses((ID34!=null?ID34.getLine():0));
                    retval.idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID34!=null?ID34.getText():null)).getType();
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:463:1: intLiteral : INT ;
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:464:3: ( INT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:464:5: INT
            {
            match(input,INT,FOLLOW_INT_in_intLiteral2065); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:1: stringLiteral : STRING ;
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:3: ( STRING )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:6: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2080); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:1: booleanLiteral : ( 'true' | 'false' );
    public final GraphLangParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        GraphLangParser.booleanLiteral_return retval = new GraphLangParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:5: ( 'true' | 'false' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( (input.LA(1)>=43 && input.LA(1)<=44) ) {
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
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA12_eotS =
        "\17\uffff";
    static final String DFA12_eofS =
        "\17\uffff";
    static final String DFA12_minS =
        "\1\5\5\uffff\1\15\1\5\3\uffff\1\5\1\15\2\uffff";
    static final String DFA12_maxS =
        "\1\31\5\uffff\1\52\1\54\3\uffff\1\54\1\42\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\11\1\12\1\6\2\uffff\1\10"+
        "\1\7";
    static final String DFA12_specialS =
        "\17\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\16\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\11\16\uffff\1\10\1\7\10\uffff\5\12",
            "\1\12\1\uffff\3\12\3\uffff\1\13\21\uffff\2\12\12\uffff\2\12",
            "",
            "",
            "",
            "\1\14\1\uffff\3\12\3\uffff\1\12\1\uffff\1\15\17\uffff\2\12"+
            "\12\uffff\2\12",
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
            return "125:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );";
        }
    }
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\1\5\2\uffff\1\6\6\uffff";
    static final String DFA29_maxS =
        "\1\54\2\uffff\1\44\6\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\10\1\6\1\7\1\3";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\3\1\uffff\1\2\1\1\1\4\33\uffff\1\6\5\uffff\2\5",
            "",
            "",
            "\1\11\6\uffff\1\10\1\11\15\uffff\1\7\6\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "382:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_globalExpression_in_programm58 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_mainBlock_in_programm63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalExpression80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_globalExpression88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration112 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_globalVariableDeclaration114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration157 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_functionDeclaration170 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_functionArgumentList_in_functionDeclaration172 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDeclaration175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration199 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_blockStatement_in_functionDeclaration201 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_returnOperator_in_functionDeclaration205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_returnOperator237 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ID_in_returnOperator239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_returnOperator242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList272 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_functionArgumentList275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList277 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_TYPE_in_functionArgumentDeclarator297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionArgumentDeclarator299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_mainBlock322 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_mainBlock324 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_blockStatement_in_mainBlock326 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_mainBlock329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_blockStatement347 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_blockStatement349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_block385 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_statement_in_block387 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_block390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_statement409 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement411 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement413 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement415 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement417 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_statement420 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_statement434 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement436 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_forControl_in_statement438 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement440 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement452 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_foreachControl_in_statement456 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement470 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement472 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement476 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement491 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement493 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement495 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement497 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement499 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement512 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement524 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement536 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement548 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement560 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl587 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_foreachControl589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl593 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_foreachControl596 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl655 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl658 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl660 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl662 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forLiteral688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forLiteral699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_forLiteral711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_forLiteral723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction774 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callInlineFunction776 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction778 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callInlineFunction781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod820 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_callClassMethod822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod837 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callClassMethod851 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callClassMethod856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation892 = new BitSet(new long[]{0x000007C020000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation912 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation956 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setGraphOperation958 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setGraphOperation960 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation965 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation967 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_setGraphOperation969 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation971 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation973 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation976 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList1009 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableList1014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList1018 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1046 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1052 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_setArcExpressions1075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1079 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1085 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1156 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableDeclarators1159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1161 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1216 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcOperation1218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setArcOperation1220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1224 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcOperation1226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setArcOperation1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_mathTerm1273 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1275 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_mathTerm1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unaryExpression1301 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unaryExpression1316 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1366 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1371 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1379 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1436 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_mathExpression1442 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1450 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1484 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_logicalExpression1487 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1493 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_13_in_relationExpression1514 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression1516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_relationExpression1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1529 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_relationExpression1532 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_logicalAtom1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nullLiteral1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList1995 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_argumentList2004 = new BitSet(new long[]{0x0000180003D003B0L});
    public static final BitSet FOLLOW_literal_in_argumentList2008 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});

}