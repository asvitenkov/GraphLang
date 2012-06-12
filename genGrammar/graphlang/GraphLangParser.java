// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-06-08 06:30:24

  package graphlang;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class GraphLangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "ID", "RELATIONALOP", "BOOLEANLITERAL", "FLOAT", "INT", "STRING", "COMMENT", "WS", "';'", "'('", "')'", "'{'", "'}'", "'return'", "','", "'main'", "'if'", "'else'", "'for'", "'foreach'", "'while'", "'do'", "'output'", "'input'", "'.'", "'='", "'->'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'null'", "'+='", "'-='", "'*='", "'/='", "'%='"
    };
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


        public GraphLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GraphLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("GraphLangParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
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
        ArrayList<String> tGlobalVariables;
    }
    protected Stack programm_stack = new Stack();

    public static class programm_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "programm"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:28:1: programm : (s+= globalExpression )* mainBlock -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st);
    public final GraphLangParser.programm_return programm() throws RecognitionException {
        programm_stack.push(new programm_scope());
        GraphLangParser.programm_return retval = new GraphLangParser.programm_return();
        retval.start = input.LT(1);

        List list_s=null;
        GraphLangParser.mainBlock_return mainBlock1 = null;

        RuleReturnScope s = null;

          ((programm_scope)programm_stack.peek()).curBlock = "";
          ((programm_scope)programm_stack.peek()).tGlobalVariables = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:4: ( (s+= globalExpression )* mainBlock -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:7: (s+= globalExpression )* mainBlock
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:8: (s+= globalExpression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:37:8: s+= globalExpression
            	    {
            	    pushFollow(FOLLOW_globalExpression_in_programm70);
            	    s=globalExpression();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            ((programm_scope)programm_stack.peek()).curBlock = "main";
            pushFollow(FOLLOW_mainBlock_in_programm76);
            mainBlock1=mainBlock();

            state._fsp--;



            // TEMPLATE REWRITE
            // 37:71: -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st)
            {
                retval.st = templateLib.getInstanceOf("MyMainBlock",
              new STAttrMap().put("globalExpression", list_s).put("mainBlock", (mainBlock1!=null?mainBlock1.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            programm_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "programm"

    public static class globalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "globalExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:1: globalExpression : ( globalVariableDeclaration -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;});
    public final GraphLangParser.globalExpression_return globalExpression() throws RecognitionException {
        GraphLangParser.globalExpression_return retval = new GraphLangParser.globalExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.globalVariableDeclaration_return globalVariableDeclaration2 = null;

        GraphLangParser.functionDeclaration_return functionDeclaration3 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:4: ( globalVariableDeclaration -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;})
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TYPE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==13||LA2_2==19) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==14) ) {
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:41:7: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression105);
                    globalVariableDeclaration2=globalVariableDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 41:34: -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyGlobalVariableDeclaration",
                      new STAttrMap().put("list", (globalVariableDeclaration2!=null?globalVariableDeclaration2.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:42:7: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_globalExpression123);
                    functionDeclaration3=functionDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 42:27: -> {$functionDeclaration.st;}
                    {
                        retval.st = (functionDeclaration3!=null?functionDeclaration3.st:null);;
                    }


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
    // $ANTLR end "globalExpression"

    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
        public String tVariableType;
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "globalVariableDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:45:1: globalVariableDeclaration returns [String tVariableType,ArrayList<String> tVariableList] : variableDeclarationStatement ';' -> {$variableDeclarationStatement.st;};
    public final GraphLangParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        GraphLangParser.globalVariableDeclaration_return retval = new GraphLangParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement4 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:4: ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st;})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:46:7: variableDeclarationStatement ';'
            {
            ((programm_scope)programm_stack.peek()).curBlock = "global";
            pushFollow(FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration155);
            variableDeclarationStatement4=variableDeclarationStatement();

            state._fsp--;

            match(input,13,FOLLOW_13_in_globalVariableDeclaration157); 


            // TEMPLATE REWRITE
            // 47:40: -> {$variableDeclarationStatement.st;}
            {
                retval.st = (variableDeclarationStatement4!=null?variableDeclarationStatement4.st:null);;
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
    // $ANTLR end "globalVariableDeclaration"

    protected static class functionDeclaration_scope {
        String funcType;
        String funcName;
        ArrayList<String> funcArgTypes;
        ArrayList<String> funcArgNames;
        ArrayList<String> functionArgumentDeclaratorList;
        String returnVariable;
        boolean isReturnUsed;
    }
    protected Stack functionDeclaration_stack = new Stack();

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:50:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' (st+= blockStatement )* ( returnOperator )? '}' -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorListstatements=$stretSt=$functionDeclaration::returnVariable);
    public final GraphLangParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_stack.push(new functionDeclaration_scope());
        GraphLangParser.functionDeclaration_return retval = new GraphLangParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE5=null;
        Token ID6=null;
        List list_st=null;
        RuleReturnScope st = null;

          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = false;
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable ="";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:69:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' (st+= blockStatement )* ( returnOperator )? '}' -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorListstatements=$stretSt=$functionDeclaration::returnVariable))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:70:8: TYPE ID '(' ( functionArgumentList )? ')' '{' (st+= blockStatement )* ( returnOperator )? '}'
            {
            TYPE5=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration193); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE5!=null?TYPE5.getText():null); 
            ID6=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration204); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID6!=null?ID6.getText():null);
            match(input,14,FOLLOW_14_in_functionDeclaration217); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:72:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:72:12: functionArgumentList
                    {
                    pushFollow(FOLLOW_functionArgumentList_in_functionDeclaration219);
                    functionArgumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_functionDeclaration222); 

            	            //add functon in namestable if it's not exists
            	            if(!names.isExistFunction((ID6!=null?ID6.getText():null))){
            	              names.addFunction(names.new FunctionName((ID6!=null?ID6.getText():null), (TYPE5!=null?TYPE5.getText():null) ,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames, (ID6!=null?ID6.getLine():0)));
            	            }
            	            else{
            	              errors.add("line "+(ID6!=null?ID6.getLine():0)+": duplicated function declaration "+(ID6!=null?ID6.getText():null));
            	            }
            	          
            match(input,16,FOLLOW_16_in_functionDeclaration255); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:83:14: (st+= blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==21||(LA4_0>=23 && LA4_0<=26)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:83:14: st+= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_functionDeclaration259);
            	    st=blockStatement();

            	    state._fsp--;

            	    if (list_st==null) list_st=new ArrayList();
            	    list_st.add(st.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:83:33: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:83:33: returnOperator
                    {
                    pushFollow(FOLLOW_returnOperator_in_functionDeclaration263);
                    returnOperator();

                    state._fsp--;


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_functionDeclaration266); 

            	        boolean result = names.checkReturnType((ID6!=null?ID6.getText():null), ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable, ((programm_scope)programm_stack.peek()).curBlock, ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed, (ID6!=null?ID6.getLine():0));
            	        if(result==false){
            	          errors.add(names.getLAstError());
            	        }
            	      
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable = "return "+((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable+";";


            // TEMPLATE REWRITE
            // 91:8: -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorListstatements=$stretSt=$functionDeclaration::returnVariable)
            {
                retval.st = templateLib.getInstanceOf("MyFunctionDeclaration",
              new STAttrMap().put("returnType", (TYPE5!=null?TYPE5.getText():null)).put("name", (ID6!=null?ID6.getText():null)).put("argumentList", ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList).put("statements", list_st).put("retSt", ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            functionDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class returnOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "returnOperator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:94:1: returnOperator : 'return' ( ID )? ';' ;
    public final GraphLangParser.returnOperator_return returnOperator() throws RecognitionException {
        GraphLangParser.returnOperator_return retval = new GraphLangParser.returnOperator_return();
        retval.start = input.LT(1);

        Token ID7=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:95:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:95:11: 'return' ( ID )? ';'
            {
            match(input,18,FOLLOW_18_in_returnOperator340); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:95:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:95:20: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_returnOperator342); 

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_returnOperator345); 

                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = true;
                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable =(ID7!=null?ID7.getText():null);
                      

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
    // $ANTLR end "returnOperator"

    public static class functionArgumentList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionArgumentList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:102:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final GraphLangParser.functionArgumentList_return functionArgumentList() throws RecognitionException {
        GraphLangParser.functionArgumentList_return retval = new GraphLangParser.functionArgumentList_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:103:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:103:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList375);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:103:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:103:36: ',' functionArgumentDeclarator
            	    {
            	    match(input,19,FOLLOW_19_in_functionArgumentList378); 
            	    pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList380);
            	    functionArgumentDeclarator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "functionArgumentList"

    public static class functionArgumentDeclarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionArgumentDeclarator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:106:1: functionArgumentDeclarator : TYPE ID ;
    public final GraphLangParser.functionArgumentDeclarator_return functionArgumentDeclarator() throws RecognitionException {
        GraphLangParser.functionArgumentDeclarator_return retval = new GraphLangParser.functionArgumentDeclarator_return();
        retval.start = input.LT(1);

        Token TYPE8=null;
        Token ID9=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:107:5: ( TYPE ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:107:8: TYPE ID
            {
            TYPE8=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionArgumentDeclarator400); 
            ID9=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentDeclarator402); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList.add((TYPE8!=null?TYPE8.getText():null)+" "+(ID9!=null?ID9.getText():null));

                  // add variable and it's type in lists funcArgTypes and funcArgNames
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes.add((TYPE8!=null?TYPE8.getText():null));
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames.add((ID9!=null?ID9.getText():null));
                  if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null))){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null), (TYPE8!=null?TYPE8.getText():null), (ID9!=null?ID9.getLine():0)));
                  }
                  else{
                      errors.add("line "+(ID9!=null?ID9.getLine():0)+": duplicated variable name "+(ID9!=null?ID9.getText():null));
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
    // $ANTLR end "functionArgumentDeclarator"

    public static class mainBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mainBlock"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:1: mainBlock : 'main' '{' (s+= blockStatement )* '}' -> print(value=$s);
    public final GraphLangParser.mainBlock_return mainBlock() throws RecognitionException {
        GraphLangParser.mainBlock_return retval = new GraphLangParser.mainBlock_return();
        retval.start = input.LT(1);

        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:124:4: ( 'main' '{' (s+= blockStatement )* '}' -> print(value=$s))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:124:6: 'main' '{' (s+= blockStatement )* '}'
            {
            match(input,20,FOLLOW_20_in_mainBlock438); 
            match(input,16,FOLLOW_16_in_mainBlock440); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:124:18: (s+= blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==21||(LA8_0>=23 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:124:18: s+= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_mainBlock444);
            	    s=blockStatement();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_mainBlock447); 


            // TEMPLATE REWRITE
            // 124:41: -> print(value=$s)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", list_s));
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
    // $ANTLR end "mainBlock"

    public static class blockStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:1: blockStatement : ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st} | statement -> {$statement.st});
    public final GraphLangParser.blockStatement_return blockStatement() throws RecognitionException {
        GraphLangParser.blockStatement_return retval = new GraphLangParser.blockStatement_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement10 = null;

        GraphLangParser.statement_return statement11 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:5: ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st} | statement -> {$statement.st})
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TYPE) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID||LA9_0==21||(LA9_0>=23 && LA9_0<=26)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement477);
                    variableDeclarationStatement10=variableDeclarationStatement();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_blockStatement479); 


                    // TEMPLATE REWRITE
                    // 128:42: -> {$variableDeclarationStatement.st}
                    {
                        retval.st = (variableDeclarationStatement10!=null?variableDeclarationStatement10.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement493);
                    statement11=statement();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 129:19: -> {$statement.st}
                    {
                        retval.st = (statement11!=null?statement11.st:null);
                    }


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
    // $ANTLR end "blockStatement"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:133:1: block : '{' (s+= statement )* '}' -> print(value=$s);
    public final GraphLangParser.block_return block() throws RecognitionException {
        GraphLangParser.block_return retval = new GraphLangParser.block_return();
        retval.start = input.LT(1);

        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:5: ( '{' (s+= statement )* '}' -> print(value=$s))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:7: '{' (s+= statement )* '}'
            {
            match(input,16,FOLLOW_16_in_block523); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:12: (s+= statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==21||(LA10_0>=23 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:12: s+= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block527);
            	    s=statement();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_block530); 


            // TEMPLATE REWRITE
            // 134:29: -> print(value=$s)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", list_s));
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
    // $ANTLR end "block"

    public static class statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:137:1: statement : ( 'if' '(' logicalExpression ')' a= block ( 'else' b= block )? -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st) | 'for' '(' forControl ')' block -> MyForControl() | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' -> print(value=$setArcOperation.st+\";\\n\") | setGraphOperation ';' -> print(value=$setGraphOperation.st+\";\\n\") | callClassMethod ';' -> print(value=$callClassMethod.st+\";\\n\") | callInlineFunction ';' -> print(value=$callInlineFunction.st+\";\\n\"));
    public final GraphLangParser.statement_return statement() throws RecognitionException {
        GraphLangParser.statement_return retval = new GraphLangParser.statement_return();
        retval.start = input.LT(1);

        GraphLangParser.block_return a = null;

        GraphLangParser.block_return b = null;

        GraphLangParser.logicalExpression_return logicalExpression12 = null;

        GraphLangParser.assignmentOperation_return assignmentOperation13 = null;

        GraphLangParser.setArcOperation_return setArcOperation14 = null;

        GraphLangParser.setGraphOperation_return setGraphOperation15 = null;

        GraphLangParser.callClassMethod_return callClassMethod16 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction17 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:5: ( 'if' '(' logicalExpression ')' a= block ( 'else' b= block )? -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st) | 'for' '(' forControl ')' block -> MyForControl() | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' -> print(value=$setArcOperation.st+\";\\n\") | setGraphOperation ';' -> print(value=$setGraphOperation.st+\";\\n\") | callClassMethod ';' -> print(value=$callClassMethod.st+\";\\n\") | callInlineFunction ';' -> print(value=$callInlineFunction.st+\";\\n\"))
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:9: 'if' '(' logicalExpression ')' a= block ( 'else' b= block )?
                    {
                    match(input,21,FOLLOW_21_in_statement557); 
                    match(input,14,FOLLOW_14_in_statement559); 
                    pushFollow(FOLLOW_logicalExpression_in_statement561);
                    logicalExpression12=logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement563); 
                    pushFollow(FOLLOW_block_in_statement567);
                    a=block();

                    state._fsp--;

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:48: ( 'else' b= block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:49: 'else' b= block
                            {
                            match(input,22,FOLLOW_22_in_statement570); 
                            pushFollow(FOLLOW_block_in_statement574);
                            b=block();

                            state._fsp--;


                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    // 138:66: -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyIfStatement",
                      new STAttrMap().put("logicalExpr", (logicalExpression12!=null?logicalExpression12.st:null)).put("blockIf", (a!=null?a.st:null)).put("blockElse", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:9: 'for' '(' forControl ')' block
                    {
                    match(input,23,FOLLOW_23_in_statement602); 
                    match(input,14,FOLLOW_14_in_statement604); 
                    pushFollow(FOLLOW_forControl_in_statement606);
                    forControl();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement608); 
                    pushFollow(FOLLOW_block_in_statement610);
                    block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 139:40: -> MyForControl()
                    {
                        retval.st = templateLib.getInstanceOf("MyForControl");
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:9: 'foreach' '(' foreachControl ')' block
                    {
                    match(input,24,FOLLOW_24_in_statement625); 
                    match(input,14,FOLLOW_14_in_statement627); 
                    pushFollow(FOLLOW_foreachControl_in_statement629);
                    foreachControl();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement631); 
                    pushFollow(FOLLOW_block_in_statement633);
                    block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:141:9: 'while' '(' logicalExpression ')' block
                    {
                    match(input,25,FOLLOW_25_in_statement644); 
                    match(input,14,FOLLOW_14_in_statement646); 
                    pushFollow(FOLLOW_logicalExpression_in_statement648);
                    logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement650); 
                    pushFollow(FOLLOW_block_in_statement652);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:9: 'do' block 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,26,FOLLOW_26_in_statement663); 
                    pushFollow(FOLLOW_block_in_statement666);
                    block();

                    state._fsp--;

                    match(input,25,FOLLOW_25_in_statement668); 
                    match(input,14,FOLLOW_14_in_statement670); 
                    pushFollow(FOLLOW_logicalExpression_in_statement672);
                    logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement674); 
                    match(input,13,FOLLOW_13_in_statement676); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:143:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement687);
                    assignmentOperation13=assignmentOperation();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement689); 


                    // TEMPLATE REWRITE
                    // 143:33: -> {$assignmentOperation.st}
                    {
                        retval.st = (assignmentOperation13!=null?assignmentOperation13.st:null);
                    }


                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:144:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement702);
                    setArcOperation14=setArcOperation();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement704); 


                    // TEMPLATE REWRITE
                    // 144:29: -> print(value=$setArcOperation.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (setArcOperation14!=null?setArcOperation14.st:null)+";\n"));
                    }


                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:145:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement722);
                    setGraphOperation15=setGraphOperation();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement724); 


                    // TEMPLATE REWRITE
                    // 145:31: -> print(value=$setGraphOperation.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (setGraphOperation15!=null?setGraphOperation15.st:null)+";\n"));
                    }


                    }
                    break;
                case 9 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:146:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement742);
                    callClassMethod16=callClassMethod();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement744); 


                    // TEMPLATE REWRITE
                    // 146:29: -> print(value=$callClassMethod.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (callClassMethod16!=null?callClassMethod16.st:null)+";\n"));
                    }


                    }
                    break;
                case 10 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement762);
                    callInlineFunction17=callInlineFunction();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement764); 


                    // TEMPLATE REWRITE
                    // 147:32: -> print(value=$callInlineFunction.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (callInlineFunction17!=null?callInlineFunction17.st:null)+";\n"));
                    }


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
    // $ANTLR end "statement"

    public static class foreachControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "foreachControl"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:150:1: foreachControl : f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? ;
    public final GraphLangParser.foreachControl_return foreachControl() throws RecognitionException {
        GraphLangParser.foreachControl_return retval = new GraphLangParser.foreachControl_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return f = null;

        GraphLangParser.idLiteral_return s = null;

        GraphLangParser.foreachType_return foreachType18 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:5: (f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:9: f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )?
            {
            pushFollow(FOLLOW_idLiteral_in_foreachControl797);
            f=idLiteral();

            state._fsp--;

            match(input,13,FOLLOW_13_in_foreachControl799); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl803);
            s=idLiteral();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:37: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:38: ';' ( foreachType )?
                    {
                    match(input,13,FOLLOW_13_in_foreachControl806); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:42: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=27 && LA13_0<=28)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:42: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl808);
                            foreachType18=foreachType();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            		        if(!names.checkForeachControl(((programm_scope)programm_stack.peek()).curBlock+"."+(f!=null?input.toString(f.start,f.stop):null), ((programm_scope)programm_stack.peek()).curBlock+"."+(s!=null?input.toString(s.start,s.stop):null),(foreachType18!=null?input.toString(foreachType18.start,foreachType18.stop):null), (s!=null?s.curLine:0))){
            		          names.getAllErrors(errors);
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
    // $ANTLR end "foreachControl"

    public static class foreachType_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "foreachType"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:159:1: foreachType : ( 'output' | 'input' );
    public final GraphLangParser.foreachType_return foreachType() throws RecognitionException {
        GraphLangParser.foreachType_return retval = new GraphLangParser.foreachType_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:160:5: ( 'output' | 'input' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
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

    public static class forControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forControl"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:164:1: forControl : ( forInit )? ';' forLiteral ';' forLiteral ;
    public final GraphLangParser.forControl_return forControl() throws RecognitionException {
        GraphLangParser.forControl_return retval = new GraphLangParser.forControl_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:5: ( ( forInit )? ';' forLiteral ';' forLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:9: ( forInit )? ';' forLiteral ';' forLiteral
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:9: ( forInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:9: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forControl865);
                    forInit();

                    state._fsp--;


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_forControl868); 
            pushFollow(FOLLOW_forLiteral_in_forControl870);
            forLiteral();

            state._fsp--;

            match(input,13,FOLLOW_13_in_forControl872); 
            pushFollow(FOLLOW_forLiteral_in_forControl874);
            forLiteral();

            state._fsp--;


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
    // $ANTLR end "forControl"

    public static class forLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:1: forLiteral : ( intLiteral | idLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.forLiteral_return forLiteral() throws RecognitionException {
        GraphLangParser.forLiteral_return retval = new GraphLangParser.forLiteral_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral19 = null;

        GraphLangParser.callClassMethod_return callClassMethod20 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction21 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:170:5: ( intLiteral | idLiteral | callClassMethod | callInlineFunction )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==ID) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt16=3;
                    }
                    break;
                case 14:
                    {
                    alt16=4;
                    }
                    break;
                case 13:
                case 15:
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:170:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forLiteral898);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:171:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forLiteral909);
                    idLiteral19=idLiteral();

                    state._fsp--;

                    if(!(idLiteral19!=null?idLiteral19.idType:null).equals("int")){errors.add("line "+(idLiteral19!=null?idLiteral19.curLine:0)+": for  variable must have type int ");}

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:172:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_forLiteral921);
                    callClassMethod20=callClassMethod();

                    state._fsp--;

                    if(!(callClassMethod20!=null?callClassMethod20.methodType:null).equals("int")){errors.add("line "+(callClassMethod20!=null?callClassMethod20.curLine:0)+": for variable must have type int ");}

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:173:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_forLiteral933);
                    callInlineFunction21=callInlineFunction();

                    state._fsp--;

                    if(!(callInlineFunction21!=null?callInlineFunction21.functionType:null).equals("int")){errors.add("line "+(callInlineFunction21!=null?callInlineFunction21.curLine:0)+": for variable must have type int ");}

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
    // $ANTLR end "forLiteral"

    public static class forInit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forInit"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:177:1: forInit : idLiteral ;
    public final GraphLangParser.forInit_return forInit() throws RecognitionException {
        GraphLangParser.forInit_return retval = new GraphLangParser.forInit_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral22 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:5: ( idLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:9: idLiteral
            {
            pushFollow(FOLLOW_idLiteral_in_forInit955);
            idLiteral22=idLiteral();

            state._fsp--;


                    if(!(idLiteral22!=null?idLiteral22.idType:null).equals("int")){
                      errors.add("line "+(idLiteral22!=null?idLiteral22.curLine:0)+": for init variable must have type int ");
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
    // $ANTLR end "forInit"

    public static class callInlineFunction_return extends ParserRuleReturnScope {
        public String functionType;
        public int curLine;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "callInlineFunction"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:186:1: callInlineFunction returns [String functionType, int curLine] : ID '(' ( argumentList )? ')' -> print(value=$ID.text+\"(\"+tmp+\")\");
    public final GraphLangParser.callInlineFunction_return callInlineFunction() throws RecognitionException {
        GraphLangParser.callInlineFunction_return retval = new GraphLangParser.callInlineFunction_return();
        retval.start = input.LT(1);

        Token ID23=null;
        GraphLangParser.argumentList_return argumentList24 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:187:5: ( ID '(' ( argumentList )? ')' -> print(value=$ID.text+\"(\"+tmp+\")\"))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:187:8: ID '(' ( argumentList )? ')'
            {
            ID23=(Token)match(input,ID,FOLLOW_ID_in_callInlineFunction984); 
            match(input,14,FOLLOW_14_in_callInlineFunction986); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:187:15: ( argumentList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=BOOLEANLITERAL && LA17_0<=STRING)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:187:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction988);
                    argumentList24=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_callInlineFunction991); 

                      String tmp="";
                      retval.functionType = "?";
                      ArrayList list = null;
                      retval.curLine = (ID23!=null?ID23.getLine():0);
                      if((argumentList24!=null?argumentList24.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList24!=null?argumentList24.argumentTypeList:null);
                      if(!names.checkCallFunction(((programm_scope)programm_stack.peek()).curBlock, (ID23!=null?ID23.getText():null), list, (ID23!=null?ID23.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      else{
                          retval.functionType = names.getFunction((ID23!=null?ID23.getText():null)).getReturnType();
                      }
                      
                      if((argumentList24!=null?argumentList24.st:null)!=null)
                        tmp+=(argumentList24!=null?argumentList24.st:null);
                


            // TEMPLATE REWRITE
            // 205:5: -> print(value=$ID.text+\"(\"+tmp+\")\")
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (ID23!=null?ID23.getText():null)+"("+tmp+")"));
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "callClassMethod"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:210:1: callClassMethod returns [String methodType, int curLine] : varId= ID '.' mName= ID '(' ( argumentList )? ')' -> print(value=$varId.text+\".\"+$mName.text+\"(\"+tmp+\")\");
    public final GraphLangParser.callClassMethod_return callClassMethod() throws RecognitionException {
        callClassMethod_stack.push(new callClassMethod_scope());
        GraphLangParser.callClassMethod_return retval = new GraphLangParser.callClassMethod_return();
        retval.start = input.LT(1);

        Token varId=null;
        Token mName=null;
        GraphLangParser.argumentList_return argumentList25 = null;



          ((callClassMethod_scope)callClassMethod_stack.peek()).variableId ="";
          ((callClassMethod_scope)callClassMethod_stack.peek()).methodName ="";
          //((callClassMethod_scope)callClassMethod_stack.peek()).argumentTypeList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:221:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' -> print(value=$varId.text+\".\"+$mName.text+\"(\"+tmp+\")\"))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:221:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod1042); 
            match(input,29,FOLLOW_29_in_callClassMethod1044); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null); 
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod1059); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            String tmp="";
            match(input,14,FOLLOW_14_in_callClassMethod1083); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:224:13: ( argumentList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||(LA18_0>=BOOLEANLITERAL && LA18_0<=STRING)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:224:13: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callClassMethod1085);
                    argumentList25=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_callClassMethod1088); 

                      retval.methodType ="?";
                      retval.curLine = (varId!=null?varId.getLine():0);
                      ArrayList list = null;
                      if((argumentList25!=null?argumentList25.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList25!=null?argumentList25.argumentTypeList:null);
                      if(!names.checkCallClassMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null), (argumentList25!=null?argumentList25.argumentTypeList:null), (varId!=null?varId.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      if(names.isExistMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null))){
                        retval.methodType = names.getMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null)).getReturnType();
                      }
                    

                      if((argumentList25!=null?input.toString(argumentList25.start,argumentList25.stop):null)!=null)
                        tmp+=(argumentList25!=null?argumentList25.st:null);
                    


            // TEMPLATE REWRITE
            // 242:9: -> print(value=$varId.text+\".\"+$mName.text+\"(\"+tmp+\")\")
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (varId!=null?varId.getText():null)+"."+(mName!=null?mName.getText():null)+"("+tmp+")"));
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

    public static class assignmentOperation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:245:1: assignmentOperation : ID assignmentOperator mathExpression -> MyAssignmentOperation(id=$ID.textoperator=$assignmentOperator.textmathExpr=$mathExpression.st);
    public final GraphLangParser.assignmentOperation_return assignmentOperation() throws RecognitionException {
        assignmentOperation_stack.push(new assignmentOperation_scope());
        GraphLangParser.assignmentOperation_return retval = new GraphLangParser.assignmentOperation_return();
        retval.start = input.LT(1);

        Token ID26=null;
        GraphLangParser.assignmentOperator_return assignmentOperator27 = null;

        GraphLangParser.mathExpression_return mathExpression28 = null;



            ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = "none";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:252:5: ( ID assignmentOperator mathExpression -> MyAssignmentOperation(id=$ID.textoperator=$assignmentOperator.textmathExpr=$mathExpression.st))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:252:8: ID assignmentOperator mathExpression
            {
            ID26=(Token)match(input,ID,FOLLOW_ID_in_assignmentOperation1150); 

                      if(names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID26!=null?ID26.getText():null))){
                        ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID26!=null?ID26.getText():null)).getType();
                      }
                      else{
                        errors.add("line "+(ID26!=null?ID26.getLine():0)+": unknown variable "+(ID26!=null?ID26.getText():null));
                      }
                   
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation1170);
            assignmentOperator27=assignmentOperator();

            state._fsp--;

            pushFollow(FOLLOW_mathExpression_in_assignmentOperation1180);
            mathExpression28=mathExpression();

            state._fsp--;


                      if(!typeCheker.checkAssignOperation((assignmentOperator27!=null?input.toString(assignmentOperator27.start,assignmentOperator27.stop):null),  ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType, (mathExpression28!=null?mathExpression28.mathExpressionType:null), (ID26!=null?ID26.getLine():0))){
                          typeCheker.getAllErrors(errors);
                      }
                   


            // TEMPLATE REWRITE
            // 270:8: -> MyAssignmentOperation(id=$ID.textoperator=$assignmentOperator.textmathExpr=$mathExpression.st)
            {
                retval.st = templateLib.getInstanceOf("MyAssignmentOperation",
              new STAttrMap().put("id", (ID26!=null?ID26.getText():null)).put("operator", (assignmentOperator27!=null?input.toString(assignmentOperator27.start,assignmentOperator27.stop):null)).put("mathExpr", (mathExpression28!=null?mathExpression28.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            assignmentOperation_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "assignmentOperation"

    protected static class setGraphOperation_scope {
        ArrayList<String> varList;
        ArrayList<String> firstIdList;
        ArrayList<String> secondIdList;
    }
    protected Stack setGraphOperation_stack = new Stack();

    public static class setGraphOperation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setGraphOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:273:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' -> MySetGraphOperation(idGraph=$ID.textvar=$setGraphOperation::varListfV=$setGraphOperation::firstIdListsV=$setGraphOperation::secondIdList);
    public final GraphLangParser.setGraphOperation_return setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        GraphLangParser.setGraphOperation_return retval = new GraphLangParser.setGraphOperation_return();
        retval.start = input.LT(1);

        Token ID29=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:284:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' -> MySetGraphOperation(idGraph=$ID.textvar=$setGraphOperation::varListfV=$setGraphOperation::firstIdListsV=$setGraphOperation::secondIdList))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:284:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
            ID29=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation1254); 
            match(input,30,FOLLOW_30_in_setGraphOperation1256); 
            match(input,14,FOLLOW_14_in_setGraphOperation1258); 
            match(input,16,FOLLOW_16_in_setGraphOperation1261); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation1263);
            variableList();

            state._fsp--;

            match(input,17,FOLLOW_17_in_setGraphOperation1265); 
            match(input,19,FOLLOW_19_in_setGraphOperation1267); 
            match(input,16,FOLLOW_16_in_setGraphOperation1269); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:284:49: ( setArcExpressions )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:284:49: setArcExpressions
                    {
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation1271);
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_setGraphOperation1274); 
            match(input,15,FOLLOW_15_in_setGraphOperation1277); 

                        names.checkSetGraphOperator((ID29!=null?ID29.getText():null),((programm_scope)programm_stack.peek()).curBlock,((setGraphOperation_scope)setGraphOperation_stack.peek()).varList,((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList,((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList,(ID29!=null?ID29.getLine():0));
                        names.getAllErrors(errors);
                    


            // TEMPLATE REWRITE
            // 290:9: -> MySetGraphOperation(idGraph=$ID.textvar=$setGraphOperation::varListfV=$setGraphOperation::firstIdListsV=$setGraphOperation::secondIdList)
            {
                retval.st = templateLib.getInstanceOf("MySetGraphOperation",
              new STAttrMap().put("idGraph", (ID29!=null?ID29.getText():null)).put("var", ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList).put("fV", ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList).put("sV", ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            setGraphOperation_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "setGraphOperation"

    public static class variableList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:293:1: variableList : a= ID ( ',' b= ID )* ;
    public final GraphLangParser.variableList_return variableList() throws RecognitionException {
        GraphLangParser.variableList_return retval = new GraphLangParser.variableList_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:8: a= ID ( ',' b= ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList1344); 
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:58: ( ',' b= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:59: ',' b= ID
            	    {
            	    match(input,19,FOLLOW_19_in_variableList1349); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList1353); 
            	     ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((b!=null?b.getText():null));

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "variableList"

    public static class setArcExpressions_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setArcExpressions"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:298:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final GraphLangParser.setArcExpressions_return setArcExpressions() throws RecognitionException {
        GraphLangParser.setArcExpressions_return retval = new GraphLangParser.setArcExpressions_return();
        retval.start = input.LT(1);

        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:299:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:299:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1381); 
            match(input,31,FOLLOW_31_in_setArcExpressions1383); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1387); 

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:8: ( ',' a= ID '->' b= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:9: ',' a= ID '->' b= ID
            	    {
            	    match(input,19,FOLLOW_19_in_setArcExpressions1410); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1414); 
            	    match(input,31,FOLLOW_31_in_setArcExpressions1416); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1420); 
            	    ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((a!=null?a.getText():null)); ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((b!=null?b.getText():null)); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "setArcExpressions"

    public static class variableDeclarationStatement_return extends ParserRuleReturnScope {
        public String tVariableType;
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarationStatement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:309:1: variableDeclarationStatement returns [String tVariableType,ArrayList<String> tVariableList] : variableDeclaration -> {$variableDeclaration.st};
    public final GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement() throws RecognitionException {
        GraphLangParser.variableDeclarationStatement_return retval = new GraphLangParser.variableDeclarationStatement_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclaration_return variableDeclaration30 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:310:4: ( variableDeclaration -> {$variableDeclaration.st})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:310:6: variableDeclaration
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1447);
            variableDeclaration30=variableDeclaration();

            state._fsp--;



            // TEMPLATE REWRITE
            // 310:26: -> {$variableDeclaration.st}
            {
                retval.st = (variableDeclaration30!=null?variableDeclaration30.st:null);
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
    // $ANTLR end "variableDeclarationStatement"

    protected static class variableDeclaration_scope {
        String varType;
    }
    protected Stack variableDeclaration_stack = new Stack();

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public String tVariableType;
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:315:1: variableDeclaration returns [String tVariableType,ArrayList<String> tVariableList] : TYPE variableDeclarators -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableList);
    public final GraphLangParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        GraphLangParser.variableDeclaration_return retval = new GraphLangParser.variableDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE31=null;
        GraphLangParser.variableDeclarators_return variableDeclarators32 = null;



          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:322:5: ( TYPE variableDeclarators -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableList))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:322:9: TYPE variableDeclarators
            {
            TYPE31=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1493); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE31!=null?TYPE31.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1497);
            variableDeclarators32=variableDeclarators();

            state._fsp--;

            if((TYPE31!=null?TYPE31.getText():null).equals("Text")) ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "String";


            // TEMPLATE REWRITE
            // 324:9: -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableList)
            {
                retval.st = templateLib.getInstanceOf("MyVariableDeclarators",
              new STAttrMap().put("type", ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType).put("list", (variableDeclarators32!=null?variableDeclarators32.tVariableList:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variableDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class variableDeclarators_return extends ParserRuleReturnScope {
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarators"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:330:1: variableDeclarators returns [ArrayList<String> tVariableList] : a= variableDeclarator ( ',' b= variableDeclarator )* ;
    public final GraphLangParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
        GraphLangParser.variableDeclarators_return retval = new GraphLangParser.variableDeclarators_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarator_return a = null;

        GraphLangParser.variableDeclarator_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:331:5: (a= variableDeclarator ( ',' b= variableDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:332:7: a= variableDeclarator ( ',' b= variableDeclarator )*
            {
            retval.tVariableList = new ArrayList<String>();
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1593);
            a=variableDeclarator();

            state._fsp--;

            retval.tVariableList.add((a!=null?a.tVariableId:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:334:7: ( ',' b= variableDeclarator )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:334:8: ',' b= variableDeclarator
            	    {
            	    match(input,19,FOLLOW_19_in_variableDeclarators1604); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1608);
            	    b=variableDeclarator();

            	    state._fsp--;

            	    retval.tVariableList.add((b!=null?b.tVariableId:null));

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "variableDeclarators"

    protected static class variableDeclarator_scope {
        ArrayList<String> varList;
    }
    protected Stack variableDeclarator_stack = new Stack();

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        public String tVariableId;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:337:1: variableDeclarator returns [String tVariableId] : ID ;
    public final GraphLangParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        GraphLangParser.variableDeclarator_return retval = new GraphLangParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Token ID33=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:344:5: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:344:9: ID
            {
            ID33=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1643); 

                    if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID33!=null?ID33.getText():null)) ){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID33!=null?ID33.getText():null), ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType, (ID33!=null?ID33.getLine():0)));
                      ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList.add(((programm_scope)programm_stack.peek()).curBlock+"."+(ID33!=null?ID33.getText():null));
            	      }
            	      else{
            	          errors.add("line "+(ID33!=null?ID33.getLine():0)+": duplicated variable name "+(ID33!=null?ID33.getText():null));
            	      }
            	      retval.tVariableId = (ID33!=null?ID33.getText():null);
                

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variableDeclarator_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class setArcOperation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setArcOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:357:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' -> print(value=$id.text+\".setVertex\"+\"(\"+$from.text+\",\"+$to.text+\")\");
    public final GraphLangParser.setArcOperation_return setArcOperation() throws RecognitionException {
        GraphLangParser.setArcOperation_return retval = new GraphLangParser.setArcOperation_return();
        retval.start = input.LT(1);

        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:358:5: (id= ID '=' '(' from= ID '->' to= ID ')' -> print(value=$id.text+\".setVertex\"+\"(\"+$from.text+\",\"+$to.text+\")\"))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:358:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1670); 
            match(input,30,FOLLOW_30_in_setArcOperation1672); 
            match(input,14,FOLLOW_14_in_setArcOperation1674); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1678); 
            match(input,31,FOLLOW_31_in_setArcOperation1680); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1684); 
            match(input,15,FOLLOW_15_in_setArcOperation1685); 

                    boolean result = names.checkSetArcOperator((id!=null?id.getText():null), (from!=null?from.getText():null), (to!=null?to.getText():null), ((programm_scope)programm_stack.peek()).curBlock, (id!=null?id.getLine():0));
                    if(result==false){
                      names.getAllErrors(errors);
                    }
                  


            // TEMPLATE REWRITE
            // 364:9: -> print(value=$id.text+\".setVertex\"+\"(\"+$from.text+\",\"+$to.text+\")\")
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (id!=null?id.getText():null)+".setVertex"+"("+(from!=null?from.getText():null)+","+(to!=null?to.getText():null)+")"));
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
    // $ANTLR end "setArcOperation"

    public static class mathTerm_return extends ParserRuleReturnScope {
        public String mathTermType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mathTerm"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:367:1: mathTerm returns [String mathTermType] : ( literal -> print(value=$literal.st) | '(' mathExpression ')' -> print(value=\"(\"+$mathExpression.st+\")\"));
    public final GraphLangParser.mathTerm_return mathTerm() throws RecognitionException {
        GraphLangParser.mathTerm_return retval = new GraphLangParser.mathTerm_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return literal34 = null;

        GraphLangParser.mathExpression_return mathExpression35 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:368:5: ( literal -> print(value=$literal.st) | '(' mathExpression ')' -> print(value=\"(\"+$mathExpression.st+\")\"))
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID||(LA23_0>=BOOLEANLITERAL && LA23_0<=STRING)) ) {
                alt23=1;
            }
            else if ( (LA23_0==14) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:368:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_mathTerm1724);
                    literal34=literal();

                    state._fsp--;

                    retval.mathTermType = (literal34!=null?literal34.literalType:null);


                    // TEMPLATE REWRITE
                    // 368:65: -> print(value=$literal.st)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (literal34!=null?literal34.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:369:8: '(' mathExpression ')'
                    {
                    match(input,14,FOLLOW_14_in_mathTerm1743); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1745);
                    mathExpression35=mathExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_mathTerm1747); 
                    retval.mathTermType = (mathExpression35!=null?mathExpression35.mathExpressionType:null);


                    // TEMPLATE REWRITE
                    // 369:94: -> print(value=\"(\"+$mathExpression.st+\")\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "("+(mathExpression35!=null?mathExpression35.st:null)+")"));
                    }


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
    // $ANTLR end "mathTerm"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public String unaryExpressionType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "unaryExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:372:1: unaryExpression returns [String unaryExpressionType] : ( '+' a= unaryExpression -> print(value=\"+\"+$a.st) | '-' b= unaryExpression -> print(value=\"-\"+$b.st) | mathTerm -> {$mathTerm.st});
    public final GraphLangParser.unaryExpression_return unaryExpression() throws RecognitionException {
        GraphLangParser.unaryExpression_return retval = new GraphLangParser.unaryExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;

        GraphLangParser.mathTerm_return mathTerm36 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:373:5: ( '+' a= unaryExpression -> print(value=\"+\"+$a.st) | '-' b= unaryExpression -> print(value=\"-\"+$b.st) | mathTerm -> {$mathTerm.st})
            int alt24=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt24=1;
                }
                break;
            case 33:
                {
                alt24=2;
                }
                break;
            case ID:
            case BOOLEANLITERAL:
            case FLOAT:
            case INT:
            case STRING:
            case 14:
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:373:8: '+' a= unaryExpression
                    {
                    match(input,32,FOLLOW_32_in_unaryExpression1779); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1783);
                    a=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (a!=null?a.unaryExpressionType:null);


                    // TEMPLATE REWRITE
                    // 373:95: -> print(value=\"+\"+$a.st)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "+"+(a!=null?a.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:374:8: '-' b= unaryExpression
                    {
                    match(input,33,FOLLOW_33_in_unaryExpression1802); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1806);
                    b=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (b!=null?b.unaryExpressionType:null);


                    // TEMPLATE REWRITE
                    // 374:95: -> print(value=\"-\"+$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "-"+(b!=null?b.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:375:8: mathTerm
                    {
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1825);
                    mathTerm36=mathTerm();

                    state._fsp--;

                    retval.unaryExpressionType = (mathTerm36!=null?mathTerm36.mathTermType:null);


                    // TEMPLATE REWRITE
                    // 375:82: -> {$mathTerm.st}
                    {
                        retval.st = (mathTerm36!=null?mathTerm36.st:null);
                    }


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
    // $ANTLR end "unaryExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public String multiplicativeExpressionType;
        public String textValue;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:380:1: multiplicativeExpression returns [String multiplicativeExpressionType, String textValue] : a= unaryExpression ( (c= '*' | c= '/' ) b= unaryExpression )* -> print(value=$a.st+tmp);
    public final GraphLangParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        GraphLangParser.multiplicativeExpression_return retval = new GraphLangParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Token c=null;
        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:381:5: (a= unaryExpression ( (c= '*' | c= '/' ) b= unaryExpression )* -> print(value=$a.st+tmp))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:381:7: a= unaryExpression ( (c= '*' | c= '/' ) b= unaryExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            String tmp="";
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1871);
            a=unaryExpression();

            state._fsp--;

            type.add((a!=null?a.unaryExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:61: ( (c= '*' | c= '/' ) b= unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=34 && LA26_0<=35)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:62: (c= '*' | c= '/' ) b= unaryExpression
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:62: (c= '*' | c= '/' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==34) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==35) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:63: c= '*'
            	            {
            	            c=(Token)match(input,34,FOLLOW_34_in_multiplicativeExpression1879); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:69: c= '/'
            	            {
            	            c=(Token)match(input,35,FOLLOW_35_in_multiplicativeExpression1883); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1888);
            	    b=unaryExpression();

            	    state._fsp--;

            	    tmp+=(c!=null?c.getText():null); tmp+=(b!=null?b.st:null); type.add((b!=null?b.unaryExpressionType:null));

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


                      retval.multiplicativeExpressionType = typeCheker.checkMathExpressionTypes(type);
                  

                    

                  


            // TEMPLATE REWRITE
            // 391:7: -> print(value=$a.st+tmp)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (a!=null?a.st:null)+tmp));
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
    // $ANTLR end "multiplicativeExpression"

    public static class mathExpression_return extends ParserRuleReturnScope {
        public String mathExpressionType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mathExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:394:1: mathExpression returns [String mathExpressionType] : a= multiplicativeExpression ( (c= '-' | c= '+' ) b= multiplicativeExpression )* -> print(value=$a.st +tmp);
    public final GraphLangParser.mathExpression_return mathExpression() throws RecognitionException {
        GraphLangParser.mathExpression_return retval = new GraphLangParser.mathExpression_return();
        retval.start = input.LT(1);

        Token c=null;
        GraphLangParser.multiplicativeExpression_return a = null;

        GraphLangParser.multiplicativeExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:395:5: (a= multiplicativeExpression ( (c= '-' | c= '+' ) b= multiplicativeExpression )* -> print(value=$a.st +tmp))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:395:9: a= multiplicativeExpression ( (c= '-' | c= '+' ) b= multiplicativeExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            String tmp=""; 
            String tmp2="";
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1980);
            a=multiplicativeExpression();

            state._fsp--;

            type.add((a!=null?a.multiplicativeExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:82: ( (c= '-' | c= '+' ) b= multiplicativeExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=32 && LA28_0<=33)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:83: (c= '-' | c= '+' ) b= multiplicativeExpression
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:83: (c= '-' | c= '+' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==33) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==32) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:84: c= '-'
            	            {
            	            c=(Token)match(input,33,FOLLOW_33_in_mathExpression1989); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:90: c= '+'
            	            {
            	            c=(Token)match(input,32,FOLLOW_32_in_mathExpression1993); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1998);
            	    b=multiplicativeExpression();

            	    state._fsp--;

            	    tmp+=(c!=null?c.getText():null); tmp+=(b!=null?b.st:null); type.add((b!=null?b.multiplicativeExpressionType:null));

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


                      retval.mathExpressionType = typeCheker.checkMathExpressionTypes(type);
                    


            // TEMPLATE REWRITE
            // 403:9: -> print(value=$a.st +tmp)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (a!=null?a.st:null) +tmp));
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
    // $ANTLR end "mathExpression"

    public static class logicalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:408:1: logicalExpression : relationExpression ( ( '&&' | '||' ) relationExpression )* -> print(value=\"logical expression\");
    public final GraphLangParser.logicalExpression_return logicalExpression() throws RecognitionException {
        GraphLangParser.logicalExpression_return retval = new GraphLangParser.logicalExpression_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:4: ( relationExpression ( ( '&&' | '||' ) relationExpression )* -> print(value=\"logical expression\"))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:7: relationExpression ( ( '&&' | '||' ) relationExpression )*
            {
            pushFollow(FOLLOW_relationExpression_in_logicalExpression2066);
            relationExpression();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:26: ( ( '&&' | '||' ) relationExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=36 && LA30_0<=37)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:27: ( '&&' | '||' ) relationExpression
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:27: ( '&&' | '||' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==36) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==37) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:28: '&&'
            	            {
            	            match(input,36,FOLLOW_36_in_logicalExpression2070); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:33: '||'
            	            {
            	            match(input,37,FOLLOW_37_in_logicalExpression2072); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression2075);
            	    relationExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 409:60: -> print(value=\"logical expression\")
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", "logical expression"));
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
    // $ANTLR end "logicalExpression"

    public static class relationExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:413:1: relationExpression : ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) ;
    public final GraphLangParser.relationExpression_return relationExpression() throws RecognitionException {
        GraphLangParser.relationExpression_return retval = new GraphLangParser.relationExpression_return();
        retval.start = input.LT(1);

        Token RELATIONALOP37=null;
        GraphLangParser.logicalAtom_return t1 = null;

        GraphLangParser.logicalAtom_return t2 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:414:5: ( ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:414:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:414:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            else if ( (LA31_0==ID||(LA31_0>=BOOLEANLITERAL && LA31_0<=STRING)||LA31_0==38) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:414:9: '(' logicalExpression ')'
                    {
                    match(input,14,FOLLOW_14_in_relationExpression2104); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression2106);
                    logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_relationExpression2108); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:415:8: t1= logicalAtom RELATIONALOP t2= logicalAtom
                    {
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression2119);
                    t1=logicalAtom();

                    state._fsp--;

                    RELATIONALOP37=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_relationExpression2122); 
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression2126);
                    t2=logicalAtom();

                    state._fsp--;


                              if(!(t1!=null?t1.atomType:null).equals((t2!=null?t2.atomType:null))){
                                if((t1!=null?t1.atomType:null).equals("null")){
                                  if(!(t2!=null?t2.atomType:null).equals("OArc") && !(t2!=null?t2.atomType:null).equals("Graph") && !(t2!=null?t2.atomType:null).equals("Node") && !(t2!=null?t2.atomType:null).equals("Text")){
                                      errors.add("line "+(RELATIONALOP37!=null?RELATIONALOP37.getLine():0)+": the operator "+(RELATIONALOP37!=null?RELATIONALOP37.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else if((t2!=null?t2.atomType:null).equals("null")){
                                  if(!(t1!=null?t1.atomType:null).equals("OArc") && !(t1!=null?t1.atomType:null).equals("Graph") && !(t1!=null?t1.atomType:null).equals("Node") && !(t1!=null?t1.atomType:null).equals("Text")){
                                      errors.add("line "+(RELATIONALOP37!=null?RELATIONALOP37.getLine():0)+": the operator "+(RELATIONALOP37!=null?RELATIONALOP37.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else {
                                  errors.add("line "+(RELATIONALOP37!=null?RELATIONALOP37.getLine():0)+": the operator "+(RELATIONALOP37!=null?RELATIONALOP37.getText():null) +" is undefined for arguments "+(t1!=null?t1.atomType:null)+","+(t2!=null?t2.atomType:null));
                                }
                                
                              }
                           

                    }
                    break;

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
    // $ANTLR end "relationExpression"

    public static class logicalAtom_return extends ParserRuleReturnScope {
        public String atomType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalAtom"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:437:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | BOOLEANLITERAL | callClassMethod | callInlineFunction | nullLiteral );
    public final GraphLangParser.logicalAtom_return logicalAtom() throws RecognitionException {
        GraphLangParser.logicalAtom_return retval = new GraphLangParser.logicalAtom_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral38 = null;

        GraphLangParser.callClassMethod_return callClassMethod39 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction40 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:438:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | BOOLEANLITERAL | callClassMethod | callInlineFunction | nullLiteral )
            int alt32=8;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:438:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom2164);
                    intLiteral();

                    state._fsp--;

                    retval.atomType = "int"; 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:439:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom2176);
                    floatLiteral();

                    state._fsp--;

                    retval.atomType = "float"; 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:440:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom2188);
                    idLiteral38=idLiteral();

                    state._fsp--;

                    retval.atomType = (idLiteral38!=null?idLiteral38.idType:null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:441:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom2200);
                    stringLiteral();

                    state._fsp--;

                    retval.atomType = "Text"; 

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:442:9: BOOLEANLITERAL
                    {
                    match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_logicalAtom2212); 
                    retval.atomType = "bool"; 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:443:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom2224);
                    callClassMethod39=callClassMethod();

                    state._fsp--;

                    retval.atomType = (callClassMethod39!=null?callClassMethod39.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:444:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom2236);
                    callInlineFunction40=callInlineFunction();

                    state._fsp--;

                    retval.atomType = (callInlineFunction40!=null?callInlineFunction40.functionType:null);

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:445:9: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom2248);
                    nullLiteral();

                    state._fsp--;

                    retval.atomType = "null";

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
    // $ANTLR end "logicalAtom"

    public static class nullLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "nullLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:448:1: nullLiteral : 'null' ;
    public final GraphLangParser.nullLiteral_return nullLiteral() throws RecognitionException {
        GraphLangParser.nullLiteral_return retval = new GraphLangParser.nullLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:5: ( 'null' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:7: 'null'
            {
            match(input,38,FOLLOW_38_in_nullLiteral2267); 

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
    // $ANTLR end "nullLiteral"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentOperator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
    public final GraphLangParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        GraphLangParser.assignmentOperator_return retval = new GraphLangParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:462:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( input.LA(1)==30||(input.LA(1)>=39 && input.LA(1)<=43) ) {
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:481:1: literal returns [String literalType, String literalValue] : ( intLiteral -> {$intLiteral.st;} | floatLiteral -> {$floatLiteral.st;} | idLiteral -> {$idLiteral.st;} | stringLiteral -> {$stringLiteral.st;} | BOOLEANLITERAL -> print(value=$BOOLEANLITERAL.text) | callClassMethod -> {$callClassMethod.st;} | callInlineFunction -> {$callInlineFunction.st;});
    public final GraphLangParser.literal_return literal() throws RecognitionException {
        GraphLangParser.literal_return retval = new GraphLangParser.literal_return();
        retval.start = input.LT(1);

        Token BOOLEANLITERAL45=null;
        GraphLangParser.intLiteral_return intLiteral41 = null;

        GraphLangParser.floatLiteral_return floatLiteral42 = null;

        GraphLangParser.idLiteral_return idLiteral43 = null;

        GraphLangParser.stringLiteral_return stringLiteral44 = null;

        GraphLangParser.callClassMethod_return callClassMethod46 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction47 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:482:5: ( intLiteral -> {$intLiteral.st;} | floatLiteral -> {$floatLiteral.st;} | idLiteral -> {$idLiteral.st;} | stringLiteral -> {$stringLiteral.st;} | BOOLEANLITERAL -> print(value=$BOOLEANLITERAL.text) | callClassMethod -> {$callClassMethod.st;} | callInlineFunction -> {$callInlineFunction.st;})
            int alt33=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt33=1;
                }
                break;
            case FLOAT:
                {
                alt33=2;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt33=6;
                    }
                    break;
                case 14:
                    {
                    alt33=7;
                    }
                    break;
                case 13:
                case 15:
                case 19:
                case 32:
                case 33:
                case 34:
                case 35:
                    {
                    alt33=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }

                }
                break;
            case STRING:
                {
                alt33=4;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:482:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_literal2489);
                    intLiteral41=intLiteral();

                    state._fsp--;

                    retval.literalType = "int"; retval.literalValue =(intLiteral41!=null?input.toString(intLiteral41.start,intLiteral41.stop):null);


                    // TEMPLATE REWRITE
                    // 482:76: -> {$intLiteral.st;}
                    {
                        retval.st = (intLiteral41!=null?intLiteral41.st:null);;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:483:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_literal2504);
                    floatLiteral42=floatLiteral();

                    state._fsp--;

                    retval.literalType = "float"; retval.literalValue =(floatLiteral42!=null?input.toString(floatLiteral42.start,floatLiteral42.stop):null);


                    // TEMPLATE REWRITE
                    // 483:82: -> {$floatLiteral.st;}
                    {
                        retval.st = (floatLiteral42!=null?floatLiteral42.st:null);;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:484:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_literal2519);
                    idLiteral43=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral43!=null?idLiteral43.idType:null); retval.literalValue =(idLiteral43!=null?input.toString(idLiteral43.start,idLiteral43.stop):null);


                    // TEMPLATE REWRITE
                    // 484:86: -> {$idLiteral.st;}
                    {
                        retval.st = (idLiteral43!=null?idLiteral43.st:null);;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:485:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal2534);
                    stringLiteral44=stringLiteral();

                    state._fsp--;

                    retval.literalType = "Text"; retval.literalValue =(stringLiteral44!=null?input.toString(stringLiteral44.start,stringLiteral44.stop):null);


                    // TEMPLATE REWRITE
                    // 485:83: -> {$stringLiteral.st;}
                    {
                        retval.st = (stringLiteral44!=null?stringLiteral44.st:null);;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:486:9: BOOLEANLITERAL
                    {
                    BOOLEANLITERAL45=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal2549); 
                    retval.literalType = "bool"; retval.literalValue =(BOOLEANLITERAL45!=null?BOOLEANLITERAL45.getText():null); 


                    // TEMPLATE REWRITE
                    // 486:86: -> print(value=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (BOOLEANLITERAL45!=null?BOOLEANLITERAL45.getText():null)));
                    }


                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:487:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_literal2569);
                    callClassMethod46=callClassMethod();

                    state._fsp--;

                    retval.literalType = (callClassMethod46!=null?callClassMethod46.methodType:null);  retval.literalValue ="callClassMethod\n"; 


                    // TEMPLATE REWRITE
                    // 487:108: -> {$callClassMethod.st;}
                    {
                        retval.st = (callClassMethod46!=null?callClassMethod46.st:null);;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:488:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_literal2584);
                    callInlineFunction47=callInlineFunction();

                    state._fsp--;

                    retval.literalType = (callInlineFunction47!=null?callInlineFunction47.functionType:null); retval.literalValue ="callInlineFunction\n";


                    // TEMPLATE REWRITE
                    // 488:117: -> {$callInlineFunction.st;}
                    {
                        retval.st = (callInlineFunction47!=null?callInlineFunction47.st:null);;
                    }


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

    public static class argumentList_return extends ParserRuleReturnScope {
        public ArrayList<String> argumentTypeList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "argumentList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:491:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* -> print(value=$a.st+tmp);
    public final GraphLangParser.argumentList_return argumentList() throws RecognitionException {
        GraphLangParser.argumentList_return retval = new GraphLangParser.argumentList_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:492:3: (a= literal ( ',' b= literal )* -> print(value=$a.st+tmp))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:492:6: a= literal ( ',' b= literal )*
            {

                    retval.argumentTypeList = new ArrayList<String>();
                    String tmp="";
                 
            pushFollow(FOLLOW_literal_in_argumentList2616);
            a=literal();

            state._fsp--;

            retval.argumentTypeList.add((a!=null?a.literalType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:497:3: ( ',' b= literal )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==19) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:497:4: ',' b= literal
            	    {
            	    match(input,19,FOLLOW_19_in_argumentList2625); 
            	    pushFollow(FOLLOW_literal_in_argumentList2629);
            	    b=literal();

            	    state._fsp--;

            	    retval.argumentTypeList.add((b!=null?b.literalType:null)); tmp+=","; tmp+=(b!=null?b.st:null);

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 498:5: -> print(value=$a.st+tmp)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (a!=null?a.st:null)+tmp));
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
    // $ANTLR end "argumentList"

    public static class floatLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "floatLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:501:1: floatLiteral : FLOAT -> print(value=$FLOAT.text);
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        Token FLOAT48=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:502:3: ( FLOAT -> print(value=$FLOAT.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:502:5: FLOAT
            {
            FLOAT48=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral2659); 


            // TEMPLATE REWRITE
            // 502:11: -> print(value=$FLOAT.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (FLOAT48!=null?FLOAT48.getText():null)));
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
    // $ANTLR end "floatLiteral"

    public static class idLiteral_return extends ParserRuleReturnScope {
        public String idType;
        public int curLine;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "idLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:505:1: idLiteral returns [String idType, int curLine] : ID -> print(value=$ID.text);
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID49=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:506:3: ( ID -> print(value=$ID.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:506:5: ID
            {
            ID49=(Token)match(input,ID,FOLLOW_ID_in_idLiteral2684); 

                  retval.curLine = (ID49!=null?ID49.getLine():0);
                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID49!=null?ID49.getText():null))){
                    errors.add("line "+(ID49!=null?ID49.getLine():0)+": unknown variable "+(ID49!=null?ID49.getText():null));
                    retval.idType = "";
                  }
                  else{
                    names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID49!=null?ID49.getText():null)).addLineUses((ID49!=null?ID49.getLine():0));
                    retval.idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID49!=null?ID49.getText():null)).getType();
                  }
                


            // TEMPLATE REWRITE
            // 518:5: -> print(value=$ID.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (ID49!=null?ID49.getText():null)));
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "intLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:521:1: intLiteral : INT -> print(value=$INT.text);
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        Token INT50=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:522:3: ( INT -> print(value=$INT.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:522:5: INT
            {
            INT50=(Token)match(input,INT,FOLLOW_INT_in_intLiteral2717); 


            // TEMPLATE REWRITE
            // 522:9: -> print(value=$INT.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (INT50!=null?INT50.getText():null)));
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
    // $ANTLR end "intLiteral"

    public static class stringLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stringLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:525:1: stringLiteral : STRING -> print(value=$STRING.text);
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        Token STRING51=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:526:3: ( STRING -> print(value=$STRING.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:526:6: STRING
            {
            STRING51=(Token)match(input,STRING,FOLLOW_STRING_in_stringLiteral2739); 


            // TEMPLATE REWRITE
            // 526:13: -> print(value=$STRING.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (STRING51!=null?STRING51.getText():null)));
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
    // $ANTLR end "stringLiteral"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA12_eotS =
        "\17\uffff";
    static final String DFA12_eofS =
        "\17\uffff";
    static final String DFA12_minS =
        "\1\5\5\uffff\1\16\1\5\3\uffff\1\5\1\16\2\uffff";
    static final String DFA12_maxS =
        "\1\32\5\uffff\1\53\1\41\3\uffff\1\41\1\43\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\11\1\12\1\6\2\uffff\1\10"+
        "\1\7";
    static final String DFA12_specialS =
        "\17\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\17\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\11\16\uffff\1\10\1\7\10\uffff\5\12",
            "\1\12\1\uffff\4\12\3\uffff\1\13\21\uffff\2\12",
            "",
            "",
            "",
            "\1\14\1\uffff\4\12\3\uffff\1\12\1\uffff\1\15\17\uffff\2\12",
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
            return "137:1: statement : ( 'if' '(' logicalExpression ')' a= block ( 'else' b= block )? -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st) | 'for' '(' forControl ')' block -> MyForControl() | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' -> print(value=$setArcOperation.st+\";\\n\") | setGraphOperation ';' -> print(value=$setGraphOperation.st+\";\\n\") | callClassMethod ';' -> print(value=$callClassMethod.st+\";\\n\") | callInlineFunction ';' -> print(value=$callInlineFunction.st+\";\\n\"));";
        }
    }
    static final String DFA32_eotS =
        "\12\uffff";
    static final String DFA32_eofS =
        "\12\uffff";
    static final String DFA32_minS =
        "\1\5\2\uffff\1\6\6\uffff";
    static final String DFA32_maxS =
        "\1\46\2\uffff\1\45\6\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\10\1\6\1\7\1\3";
    static final String DFA32_specialS =
        "\12\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\1\uffff\1\5\1\2\1\1\1\4\33\uffff\1\6",
            "",
            "",
            "\1\11\7\uffff\1\10\1\11\15\uffff\1\7\6\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "437:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | BOOLEANLITERAL | callClassMethod | callInlineFunction | nullLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_globalExpression_in_programm70 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_mainBlock_in_programm76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalExpression105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_globalExpression123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_globalVariableDeclaration157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration204 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDeclaration217 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_functionArgumentList_in_functionDeclaration219 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration222 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration255 = new BitSet(new long[]{0x0000000007A60030L});
    public static final BitSet FOLLOW_blockStatement_in_functionDeclaration259 = new BitSet(new long[]{0x0000000007A60030L});
    public static final BitSet FOLLOW_returnOperator_in_functionDeclaration263 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDeclaration266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_returnOperator340 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_ID_in_returnOperator342 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_returnOperator345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList375 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_functionArgumentList378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList380 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_TYPE_in_functionArgumentDeclarator400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionArgumentDeclarator402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_mainBlock438 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_mainBlock440 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_blockStatement_in_mainBlock444 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_17_in_mainBlock447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_blockStatement477 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_blockStatement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_block523 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_statement_in_block527 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_17_in_block530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_statement557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement559 = new BitSet(new long[]{0x0000004007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement561 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement563 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement567 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_statement570 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement602 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement604 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_forControl_in_statement606 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement608 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement625 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_foreachControl_in_statement629 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement631 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement644 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement646 = new BitSet(new long[]{0x0000004007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement648 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement650 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_statement663 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement666 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement668 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement670 = new BitSet(new long[]{0x0000004007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement672 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement674 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement687 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement702 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement722 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement742 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement762 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_foreachControl799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl803 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_foreachControl806 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_forControl868 = new BitSet(new long[]{0x0000000007A00230L});
    public static final BitSet FOLLOW_forLiteral_in_forControl870 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_forControl872 = new BitSet(new long[]{0x0000000007A00230L});
    public static final BitSet FOLLOW_forLiteral_in_forControl874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forLiteral898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forLiteral909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_forLiteral921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_forLiteral933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction984 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callInlineFunction986 = new BitSet(new long[]{0x0000000007A087B0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction988 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callInlineFunction991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod1042 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_callClassMethod1044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod1059 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callClassMethod1083 = new BitSet(new long[]{0x0000000007A087B0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod1085 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callClassMethod1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation1150 = new BitSet(new long[]{0x00000F8040000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation1170 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation1254 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setGraphOperation1256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation1258 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation1263 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_setGraphOperation1265 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_setGraphOperation1267 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1269 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation1271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_setGraphOperation1274 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList1344 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_variableList1349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList1353 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1381 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_setArcExpressions1383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1387 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_setArcExpressions1410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1414 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_setArcExpressions1416 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1420 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1593 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_variableDeclarators1604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1608 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1670 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcOperation1672 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setArcOperation1674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1678 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_setArcOperation1680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1684 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setArcOperation1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_mathTerm1743 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1745 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_mathTerm1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unaryExpression1779 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_unaryExpression1802 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1871 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_multiplicativeExpression1879 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_35_in_multiplicativeExpression1883 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1888 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1980 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_33_in_mathExpression1989 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_32_in_mathExpression1993 = new BitSet(new long[]{0x0000000307A047B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1998 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression2066 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_logicalExpression2070 = new BitSet(new long[]{0x0000004007A047B0L});
    public static final BitSet FOLLOW_37_in_logicalExpression2072 = new BitSet(new long[]{0x0000004007A047B0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression2075 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_14_in_relationExpression2104 = new BitSet(new long[]{0x0000004007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression2106 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_relationExpression2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression2119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_relationExpression2122 = new BitSet(new long[]{0x0000004007A047B0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_logicalAtom2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nullLiteral2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList2616 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_argumentList2625 = new BitSet(new long[]{0x0000000007A007B0L});
    public static final BitSet FOLLOW_literal_in_argumentList2629 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2739 = new BitSet(new long[]{0x0000000000000002L});

}