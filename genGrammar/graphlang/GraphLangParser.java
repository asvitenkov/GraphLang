// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-04-26 04:55:28

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:36:1: globalExpression : ( globalVariableDeclaration | functionDeclaration );
    public final void globalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:4: ( globalVariableDeclaration | functionDeclaration )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression81);
                    globalVariableDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:7: functionDeclaration
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:1: globalVariableDeclaration : variableDeclarationStatement ';' ;
    public final void globalVariableDeclaration() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:4: ( variableDeclarationStatement ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:7: variableDeclarationStatement ';'
            {
            ((programm_scope)programm_stack.peek()).curBlock = "global";
            pushFollow(FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration113);
            variableDeclarationStatement();

            state._fsp--;

            match(input,12,FOLLOW_12_in_globalVariableDeclaration115); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:63:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:64:8: TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}'
            {
            TYPE1=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration147); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE1!=null?TYPE1.getText():null); 
            ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration158); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID2!=null?ID2.getText():null);
            match(input,13,FOLLOW_13_in_functionDeclaration171); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:66:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:66:12: functionArgumentList
                    {
                    pushFollow(FOLLOW_functionArgumentList_in_functionDeclaration173);
                    functionArgumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_functionDeclaration176); 

            	            //add functon in namestable if it's not exists
            	            if(!names.isExistFunction((ID2!=null?ID2.getText():null))){
            	              names.addFunction(names.new FunctionName((ID2!=null?ID2.getText():null), (TYPE1!=null?TYPE1.getText():null) ,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames, (ID2!=null?ID2.getLine():0)));
            	            }
            	            else{
            	              errors.add("line "+(ID2!=null?ID2.getLine():0)+": duplicated function declaration "+(ID2!=null?ID2.getText():null));
            	            }
            	          
            match(input,15,FOLLOW_15_in_functionDeclaration200); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:12: ( blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==20||(LA4_0>=22 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:12: blockStatement
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

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:29: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:76:29: returnOperator
                    {
                    pushFollow(FOLLOW_returnOperator_in_functionDeclaration206);
                    returnOperator();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_functionDeclaration209); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:85:1: returnOperator : 'return' ( ID )? ';' ;
    public final void returnOperator() throws RecognitionException {
        Token ID3=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:11: 'return' ( ID )? ';'
            {
            match(input,17,FOLLOW_17_in_returnOperator238); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:86:20: ID
                    {
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_returnOperator240); 

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_returnOperator243); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:93:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final void functionArgumentList() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList273);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:36: ',' functionArgumentDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_functionArgumentList276); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:97:1: functionArgumentDeclarator : TYPE ID ;
    public final void functionArgumentDeclarator() throws RecognitionException {
        Token TYPE4=null;
        Token ID5=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:98:5: ( TYPE ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:98:8: TYPE ID
            {
            TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionArgumentDeclarator298); 
            ID5=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentDeclarator300); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:112:1: mainBlock : 'main' '{' ( blockStatement )* '}' ;
    public final void mainBlock() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:4: ( 'main' '{' ( blockStatement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:6: 'main' '{' ( blockStatement )* '}'
            {
            match(input,19,FOLLOW_19_in_mainBlock323); 
            match(input,15,FOLLOW_15_in_mainBlock325); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:17: ( blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==20||(LA8_0>=22 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:113:17: blockStatement
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

            match(input,16,FOLLOW_16_in_mainBlock330); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:116:1: blockStatement : ( variableDeclarationStatement ';' | statement );
    public final void blockStatement() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:117:5: ( variableDeclarationStatement ';' | statement )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:117:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement348);
                    variableDeclarationStatement();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_blockStatement350); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:118:9: statement
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:122:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:5: ( '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:7: '{' ( statement )* '}'
            {
            match(input,15,FOLLOW_15_in_block386); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:11: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==20||(LA10_0>=22 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:11: statement
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

            match(input,16,FOLLOW_16_in_block391); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:126:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:5: ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:9: 'if' '(' logicalExpression ')' block ( 'else' block )?
                    {
                    match(input,20,FOLLOW_20_in_statement410); 
                    match(input,13,FOLLOW_13_in_statement412); 
                    pushFollow(FOLLOW_logicalExpression_in_statement414);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement416); 
                    pushFollow(FOLLOW_block_in_statement418);
                    block();

                    state._fsp--;

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:46: ( 'else' block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:47: 'else' block
                            {
                            match(input,21,FOLLOW_21_in_statement421); 
                            pushFollow(FOLLOW_block_in_statement423);
                            block();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:9: 'for' '(' forControl ')' block
                    {
                    match(input,22,FOLLOW_22_in_statement435); 
                    match(input,13,FOLLOW_13_in_statement437); 
                    pushFollow(FOLLOW_forControl_in_statement439);
                    forControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement441); 
                    pushFollow(FOLLOW_block_in_statement443);
                    block();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:9: 'foreach' '(' foreachControl ')' block
                    {
                    match(input,23,FOLLOW_23_in_statement453); 
                    match(input,13,FOLLOW_13_in_statement455); 
                    pushFollow(FOLLOW_foreachControl_in_statement457);
                    foreachControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement459); 
                    pushFollow(FOLLOW_block_in_statement461);
                    block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:9: 'while' '(' logicalExpression ')' block
                    {
                    match(input,24,FOLLOW_24_in_statement471); 
                    match(input,13,FOLLOW_13_in_statement473); 
                    pushFollow(FOLLOW_logicalExpression_in_statement475);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement477); 
                    pushFollow(FOLLOW_block_in_statement479);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:131:9: 'do' block 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,25,FOLLOW_25_in_statement489); 
                    pushFollow(FOLLOW_block_in_statement492);
                    block();

                    state._fsp--;

                    match(input,24,FOLLOW_24_in_statement494); 
                    match(input,13,FOLLOW_13_in_statement496); 
                    pushFollow(FOLLOW_logicalExpression_in_statement498);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement500); 
                    match(input,12,FOLLOW_12_in_statement502); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:132:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement513);
                    assignmentOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement515); 

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:133:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement525);
                    setArcOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement527); 

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement537);
                    setGraphOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement539); 

                    }
                    break;
                case 9 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:135:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement549);
                    callClassMethod();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement551); 

                    }
                    break;
                case 10 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:136:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement561);
                    callInlineFunction();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement563); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:1: foreachControl : f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? ;
    public final void foreachControl() throws RecognitionException {
        GraphLangParser.idLiteral_return f = null;

        GraphLangParser.idLiteral_return s = null;

        GraphLangParser.foreachType_return foreachType6 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:5: (f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:9: f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )?
            {
            pushFollow(FOLLOW_idLiteral_in_foreachControl588);
            f=idLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_foreachControl590); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl594);
            s=idLiteral();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:37: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:38: ';' ( foreachType )?
                    {
                    match(input,12,FOLLOW_12_in_foreachControl597); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:42: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:42: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl599);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:148:1: foreachType : ( 'output' | 'input' );
    public final GraphLangParser.foreachType_return foreachType() throws RecognitionException {
        GraphLangParser.foreachType_return retval = new GraphLangParser.foreachType_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:149:5: ( 'output' | 'input' )
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:153:1: forControl : ( forInit )? ';' forLiteral ';' forLiteral ;
    public final void forControl() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:154:5: ( ( forInit )? ';' forLiteral ';' forLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:154:9: ( forInit )? ';' forLiteral ';' forLiteral
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:154:9: ( forInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:154:9: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forControl656);
                    forInit();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_forControl659); 
            pushFollow(FOLLOW_forLiteral_in_forControl661);
            forLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_forControl663); 
            pushFollow(FOLLOW_forLiteral_in_forControl665);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:158:1: forLiteral : ( intLiteral | idLiteral | callClassMethod | callInlineFunction );
    public final void forLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return idLiteral7 = null;

        GraphLangParser.callClassMethod_return callClassMethod8 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction9 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:159:5: ( intLiteral | idLiteral | callClassMethod | callInlineFunction )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:159:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forLiteral689);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:160:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forLiteral700);
                    idLiteral7=idLiteral();

                    state._fsp--;

                    if(!(idLiteral7!=null?idLiteral7.idType:null).equals("Int")){errors.add("line "+(idLiteral7!=null?idLiteral7.curLine:0)+": for  variable must have type int ");}

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_forLiteral712);
                    callClassMethod8=callClassMethod();

                    state._fsp--;

                    if(!(callClassMethod8!=null?callClassMethod8.methodType:null).equals("Int")){errors.add("line "+(callClassMethod8!=null?callClassMethod8.curLine:0)+": for variable must have type int ");}

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:162:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_forLiteral724);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:166:1: forInit : idLiteral ;
    public final void forInit() throws RecognitionException {
        GraphLangParser.idLiteral_return idLiteral10 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:167:5: ( idLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:167:9: idLiteral
            {
            pushFollow(FOLLOW_idLiteral_in_forInit746);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:175:1: callInlineFunction returns [String functionType, int curLine] : ID '(' ( argumentList )? ')' ;
    public final GraphLangParser.callInlineFunction_return callInlineFunction() throws RecognitionException {
        GraphLangParser.callInlineFunction_return retval = new GraphLangParser.callInlineFunction_return();
        retval.start = input.LT(1);

        Token ID11=null;
        ArrayList<String> argumentList12 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:176:5: ( ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:176:8: ID '(' ( argumentList )? ')'
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_callInlineFunction775); 
            match(input,13,FOLLOW_13_in_callInlineFunction777); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:176:15: ( argumentList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=FLOAT && LA17_0<=STRING)||(LA17_0>=43 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:176:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction779);
                    argumentList12=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callInlineFunction782); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:194:1: callClassMethod returns [String methodType, int curLine] : varId= ID '.' mName= ID '(' ( argumentList )? ')' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:205:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:205:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod821); 
            match(input,28,FOLLOW_28_in_callClassMethod823); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null); 
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod838); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            match(input,13,FOLLOW_13_in_callClassMethod852); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:207:13: ( argumentList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||(LA18_0>=FLOAT && LA18_0<=STRING)||(LA18_0>=43 && LA18_0<=44)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:207:13: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callClassMethod854);
                    argumentList13=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callClassMethod857); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:223:1: assignmentOperation : ID assignmentOperator mathExpression ;
    public final void assignmentOperation() throws RecognitionException {
        assignmentOperation_stack.push(new assignmentOperation_scope());
        Token ID14=null;
        GraphLangParser.assignmentOperator_return assignmentOperator15 = null;

        String mathExpression16 = null;



            ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = "none";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:230:5: ( ID assignmentOperator mathExpression )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:230:8: ID assignmentOperator mathExpression
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_assignmentOperation893); 

                      if(names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID14!=null?ID14.getText():null))){
                        ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID14!=null?ID14.getText():null)).getType();
                      }
                   
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation913);
            assignmentOperator15=assignmentOperator();

            state._fsp--;

            pushFollow(FOLLOW_mathExpression_in_assignmentOperation923);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:245:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' ;
    public final void setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        Token ID17=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:256:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:256:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation957); 
            match(input,29,FOLLOW_29_in_setGraphOperation959); 
            match(input,13,FOLLOW_13_in_setGraphOperation961); 
            match(input,15,FOLLOW_15_in_setGraphOperation964); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation966);
            variableList();

            state._fsp--;

            match(input,16,FOLLOW_16_in_setGraphOperation968); 
            match(input,18,FOLLOW_18_in_setGraphOperation970); 
            match(input,15,FOLLOW_15_in_setGraphOperation972); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:256:49: ( setArcExpressions )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:256:49: setArcExpressions
                    {
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation974);
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_setGraphOperation977); 
            match(input,14,FOLLOW_14_in_setGraphOperation980); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:263:1: variableList : a= ID ( ',' b= ID )* ;
    public final void variableList() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:264:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:264:8: a= ID ( ',' b= ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList1010); 
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:264:58: ( ',' b= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:264:59: ',' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_variableList1015); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList1019); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:268:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final void setArcExpressions() throws RecognitionException {
        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:269:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:269:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1047); 
            match(input,30,FOLLOW_30_in_setArcExpressions1049); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1053); 

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:274:8: ( ',' a= ID '->' b= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:274:9: ',' a= ID '->' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_setArcExpressions1076); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1080); 
            	    match(input,30,FOLLOW_30_in_setArcExpressions1082); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1086); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:279:1: variableDeclarationStatement : variableDeclaration ;
    public final void variableDeclarationStatement() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:280:4: ( variableDeclaration )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:280:6: variableDeclaration
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1109);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:283:1: variableDeclaration : TYPE variableDeclarators ;
    public final void variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        Token TYPE18=null;


          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:5: ( TYPE variableDeclarators )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:9: TYPE variableDeclarators
            {
            TYPE18=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1134); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE18!=null?TYPE18.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1138);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:293:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
    public final void variableDeclarators() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:5: ( variableDeclarator ( ',' variableDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:9: variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1157);
            variableDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:28: ( ',' variableDeclarator )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:29: ',' variableDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_variableDeclarators1160); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1162);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:297:1: variableDeclarator : ID ;
    public final void variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        Token ID19=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:5: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:9: ID
            {
            ID19=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1190); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:316:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' ;
    public final void setArcOperation() throws RecognitionException {
        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:317:5: (id= ID '=' '(' from= ID '->' to= ID ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:317:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1217); 
            match(input,29,FOLLOW_29_in_setArcOperation1219); 
            match(input,13,FOLLOW_13_in_setArcOperation1221); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1225); 
            match(input,30,FOLLOW_30_in_setArcOperation1227); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1231); 
            match(input,14,FOLLOW_14_in_setArcOperation1232); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:326:1: mathTerm returns [String mathTermType] : ( literal | '(' mathExpression ')' );
    public final String mathTerm() throws RecognitionException {
        String mathTermType = null;

        GraphLangParser.literal_return literal20 = null;

        String mathExpression21 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:327:5: ( literal | '(' mathExpression ')' )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:327:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_mathTerm1263);
                    literal20=literal();

                    state._fsp--;

                    mathTermType = (literal20!=null?literal20.literalType:null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:328:8: '(' mathExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_mathTerm1274); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1276);
                    mathExpression21=mathExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_mathTerm1278); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:331:1: unaryExpression returns [String unaryExpressionType] : ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm );
    public final String unaryExpression() throws RecognitionException {
        String unaryExpressionType = null;

        String a = null;

        String b = null;

        String mathTerm22 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:332:5: ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:332:8: '+' a= unaryExpression
                    {
                    match(input,31,FOLLOW_31_in_unaryExpression1302); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1306);
                    a=unaryExpression();

                    state._fsp--;

                    unaryExpressionType = a;

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:333:8: '-' b= unaryExpression
                    {
                    match(input,32,FOLLOW_32_in_unaryExpression1317); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1321);
                    b=unaryExpression();

                    state._fsp--;

                    unaryExpressionType = b;

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:334:8: mathTerm
                    {
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1332);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:337:1: multiplicativeExpression returns [String multiplicativeExpressionType] : a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* ;
    public final String multiplicativeExpression() throws RecognitionException {
        String multiplicativeExpressionType = null;

        String a = null;

        String b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:338:5: (a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:338:7: a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1367);
            a=unaryExpression();

            state._fsp--;

            type.add(a);
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:339:61: ( ( '*' | '/' ) b= unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:339:62: ( '*' | '/' ) b= unaryExpression
            	    {
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1380);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:346:1: mathExpression returns [String mathExpressionType] : a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* ;
    public final String mathExpression() throws RecognitionException {
        String mathExpressionType = null;

        String a = null;

        String b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:5: (a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:9: a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1437);
            a=multiplicativeExpression();

            state._fsp--;

            type.add(a);
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:348:82: ( ( '-' | '+' ) b= multiplicativeExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=31 && LA26_0<=32)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:348:83: ( '-' | '+' ) b= multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1451);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:1: logicalExpression : relationExpression ( ( '&&' | '||' ) relationExpression )* ;
    public final void logicalExpression() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:355:4: ( relationExpression ( ( '&&' | '||' ) relationExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:355:7: relationExpression ( ( '&&' | '||' ) relationExpression )*
            {
            pushFollow(FOLLOW_relationExpression_in_logicalExpression1485);
            relationExpression();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:355:26: ( ( '&&' | '||' ) relationExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=35 && LA27_0<=36)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:355:27: ( '&&' | '||' ) relationExpression
            	    {
            	    if ( (input.LA(1)>=35 && input.LA(1)<=36) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression1494);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:1: relationExpression : ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) ;
    public final void relationExpression() throws RecognitionException {
        Token RELATIONALOP23=null;
        String t1 = null;

        String t2 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:5: ( ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:9: '(' logicalExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_relationExpression1515); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression1517);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_relationExpression1519); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:361:8: t1= logicalAtom RELATIONALOP t2= logicalAtom
                    {
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1530);
                    t1=logicalAtom();

                    state._fsp--;

                    RELATIONALOP23=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_relationExpression1533); 
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1537);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );
    public final String logicalAtom() throws RecognitionException {
        String atomType = null;

        GraphLangParser.idLiteral_return idLiteral24 = null;

        GraphLangParser.callClassMethod_return callClassMethod25 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction26 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:384:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:384:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom1575);
                    intLiteral();

                    state._fsp--;

                    atomType = "Int"; 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:385:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom1587);
                    floatLiteral();

                    state._fsp--;

                    atomType = "Float"; 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:386:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom1599);
                    idLiteral24=idLiteral();

                    state._fsp--;

                    atomType = (idLiteral24!=null?idLiteral24.idType:null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:387:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom1611);
                    stringLiteral();

                    state._fsp--;

                    atomType = "Text"; 

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:388:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_logicalAtom1623);
                    booleanLiteral();

                    state._fsp--;

                    atomType = "Bool"; 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:389:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom1635);
                    callClassMethod25=callClassMethod();

                    state._fsp--;

                    atomType = (callClassMethod25!=null?callClassMethod25.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:390:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom1647);
                    callInlineFunction26=callInlineFunction();

                    state._fsp--;

                    atomType = (callInlineFunction26!=null?callInlineFunction26.functionType:null);

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:391:9: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom1659);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:1: nullLiteral : 'null' ;
    public final void nullLiteral() throws RecognitionException {
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:395:5: ( 'null' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:395:7: 'null'
            {
            match(input,37,FOLLOW_37_in_nullLiteral1678); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:407:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
    public final GraphLangParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        GraphLangParser.assignmentOperator_return retval = new GraphLangParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:408:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:427:1: literal returns [String literalType, String literalValue] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction );
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:428:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:428:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_literal1895);
                    intLiteral27=intLiteral();

                    state._fsp--;

                    retval.literalType = "Int"; retval.literalValue =(intLiteral27!=null?input.toString(intLiteral27.start,intLiteral27.stop):null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:429:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_literal1907);
                    floatLiteral28=floatLiteral();

                    state._fsp--;

                    retval.literalType = "Float"; retval.literalValue =(floatLiteral28!=null?input.toString(floatLiteral28.start,floatLiteral28.stop):null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:430:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_literal1919);
                    idLiteral29=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral29!=null?idLiteral29.idType:null); retval.literalValue =(idLiteral29!=null?input.toString(idLiteral29.start,idLiteral29.stop):null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:431:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal1931);
                    stringLiteral30=stringLiteral();

                    state._fsp--;

                    retval.literalType = "Text"; retval.literalValue =(stringLiteral30!=null?input.toString(stringLiteral30.start,stringLiteral30.stop):null);

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:432:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal1943);
                    booleanLiteral31=booleanLiteral();

                    state._fsp--;

                    retval.literalType = "Bool"; retval.literalValue =(booleanLiteral31!=null?input.toString(booleanLiteral31.start,booleanLiteral31.stop):null); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:433:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_literal1955);
                    callClassMethod32=callClassMethod();

                    state._fsp--;

                    retval.literalType = (callClassMethod32!=null?callClassMethod32.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:434:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_literal1967);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:437:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* ;
    public final ArrayList<String> argumentList() throws RecognitionException {
        ArrayList<String> argumentTypeList = null;

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:438:3: (a= literal ( ',' b= literal )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:438:6: a= literal ( ',' b= literal )*
            {

                    argumentTypeList = new ArrayList<String>();
                 
            pushFollow(FOLLOW_literal_in_argumentList1996);
            a=literal();

            state._fsp--;

            argumentTypeList.add((a!=null?a.literalType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:442:3: ( ',' b= literal )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:442:4: ',' b= literal
            	    {
            	    match(input,18,FOLLOW_18_in_argumentList2005); 
            	    pushFollow(FOLLOW_literal_in_argumentList2009);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:445:1: floatLiteral : FLOAT ;
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:446:3: ( FLOAT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:446:5: FLOAT
            {
            match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral2027); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:1: idLiteral returns [String idType, int curLine] : ID ;
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID34=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:450:3: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:450:5: ID
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_idLiteral2045); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:464:1: intLiteral : INT ;
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:3: ( INT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:5: INT
            {
            match(input,INT,FOLLOW_INT_in_intLiteral2066); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:1: stringLiteral : STRING ;
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:469:3: ( STRING )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:469:6: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2081); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:1: booleanLiteral : ( 'true' | 'false' );
    public final GraphLangParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        GraphLangParser.booleanLiteral_return retval = new GraphLangParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:473:5: ( 'true' | 'false' )
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
            return "126:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );";
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
            return "383:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_globalExpression_in_programm58 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_mainBlock_in_programm63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalExpression81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_globalExpression89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration113 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_globalVariableDeclaration115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_functionDeclaration171 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_functionArgumentList_in_functionDeclaration173 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDeclaration176 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration200 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_blockStatement_in_functionDeclaration202 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_returnOperator_in_functionDeclaration206 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_returnOperator238 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ID_in_returnOperator240 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_returnOperator243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList273 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_functionArgumentList276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList278 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_TYPE_in_functionArgumentDeclarator298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionArgumentDeclarator300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_mainBlock323 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_mainBlock325 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_blockStatement_in_mainBlock327 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_mainBlock330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_blockStatement348 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_blockStatement350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_block386 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_statement_in_block388 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_block391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_statement410 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement412 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement414 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement416 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement418 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_statement421 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_statement435 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement437 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_forControl_in_statement439 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement453 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_foreachControl_in_statement457 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement459 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement471 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement473 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement475 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement492 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement494 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement496 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement500 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement513 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement525 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement549 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement561 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_foreachControl590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl594 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_foreachControl597 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl656 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl659 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl661 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl663 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forLiteral689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forLiteral700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_forLiteral712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_forLiteral724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction775 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callInlineFunction777 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction779 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callInlineFunction782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod821 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_callClassMethod823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod838 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callClassMethod852 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod854 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callClassMethod857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation893 = new BitSet(new long[]{0x000007C020000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation913 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation957 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setGraphOperation959 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setGraphOperation961 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation966 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation968 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_setGraphOperation970 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation972 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation974 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation977 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList1010 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableList1015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList1019 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1047 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1053 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_setArcExpressions1076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1080 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1086 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1157 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableDeclarators1160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1162 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1217 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcOperation1219 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setArcOperation1221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1225 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcOperation1227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1231 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setArcOperation1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_mathTerm1274 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1276 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_mathTerm1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unaryExpression1302 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unaryExpression1317 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1367 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1372 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1380 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1437 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_mathExpression1443 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1451 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1485 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_logicalExpression1488 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1494 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_13_in_relationExpression1515 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression1517 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_relationExpression1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1530 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_relationExpression1533 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_logicalAtom1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nullLiteral1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList1996 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_argumentList2005 = new BitSet(new long[]{0x0000180003D003B0L});
    public static final BitSet FOLLOW_literal_in_argumentList2009 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});

}