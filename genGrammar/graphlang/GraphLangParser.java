// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-06-02 02:13:18

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:1: programm : (s+= globalExpression )* mainBlock -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st);
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:4: ( (s+= globalExpression )* mainBlock -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:7: (s+= globalExpression )* mainBlock
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:8: (s+= globalExpression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:8: s+= globalExpression
            	    {
            	    pushFollow(FOLLOW_globalExpression_in_programm68);
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
            pushFollow(FOLLOW_mainBlock_in_programm73);
            mainBlock1=mainBlock();

            state._fsp--;



            // TEMPLATE REWRITE
            // 35:70: -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st)
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:1: globalExpression : ( globalVariableDeclaration -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;});
    public final GraphLangParser.globalExpression_return globalExpression() throws RecognitionException {
        GraphLangParser.globalExpression_return retval = new GraphLangParser.globalExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.globalVariableDeclaration_return globalVariableDeclaration2 = null;

        GraphLangParser.functionDeclaration_return functionDeclaration3 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:4: ( globalVariableDeclaration -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;})
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:7: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression102);
                    globalVariableDeclaration2=globalVariableDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 39:34: -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyGlobalVariableDeclaration",
                      new STAttrMap().put("list", (globalVariableDeclaration2!=null?globalVariableDeclaration2.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:7: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_globalExpression120);
                    functionDeclaration3=functionDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 40:27: -> {$functionDeclaration.st;}
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:43:1: globalVariableDeclaration returns [String tVariableType,ArrayList<String> tVariableList] : variableDeclarationStatement ';' -> {$variableDeclarationStatement.st;};
    public final GraphLangParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        GraphLangParser.globalVariableDeclaration_return retval = new GraphLangParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement4 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:4: ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st;})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:7: variableDeclarationStatement ';'
            {
            ((programm_scope)programm_stack.peek()).curBlock = "global";
            pushFollow(FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration152);
            variableDeclarationStatement4=variableDeclarationStatement();

            state._fsp--;

            match(input,12,FOLLOW_12_in_globalVariableDeclaration154); 


            // TEMPLATE REWRITE
            // 45:40: -> {$variableDeclarationStatement.st;}
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:48:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorList);
    public final GraphLangParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_stack.push(new functionDeclaration_scope());
        GraphLangParser.functionDeclaration_return retval = new GraphLangParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE5=null;
        Token ID6=null;


          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = false;
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable ="";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:67:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorList))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:68:8: TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}'
            {
            TYPE5=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration190); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE5!=null?TYPE5.getText():null); 
            ID6=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration201); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID6!=null?ID6.getText():null);
            match(input,13,FOLLOW_13_in_functionDeclaration214); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:70:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:70:12: functionArgumentList
                    {
                    pushFollow(FOLLOW_functionArgumentList_in_functionDeclaration216);
                    functionArgumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_functionDeclaration219); 

            	            //add functon in namestable if it's not exists
            	            if(!names.isExistFunction((ID6!=null?ID6.getText():null))){
            	              names.addFunction(names.new FunctionName((ID6!=null?ID6.getText():null), (TYPE5!=null?TYPE5.getText():null) ,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames, (ID6!=null?ID6.getLine():0)));
            	            }
            	            else{
            	              errors.add("line "+(ID6!=null?ID6.getLine():0)+": duplicated function declaration "+(ID6!=null?ID6.getText():null));
            	            }
            	          
            match(input,15,FOLLOW_15_in_functionDeclaration243); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:80:12: ( blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==20||(LA4_0>=22 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:80:12: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_functionDeclaration245);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:80:29: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:80:29: returnOperator
                    {
                    pushFollow(FOLLOW_returnOperator_in_functionDeclaration249);
                    returnOperator();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_functionDeclaration252); 

            	        boolean result = names.checkReturnType((ID6!=null?ID6.getText():null), ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable, ((programm_scope)programm_stack.peek()).curBlock, ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed, (ID6!=null?ID6.getLine():0));
            	        if(result==false){
            	          errors.add(names.getLAstError());
            	        }
            	      


            // TEMPLATE REWRITE
            // 87:8: -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorList)
            {
                retval.st = templateLib.getInstanceOf("MyFunctionDeclaration",
              new STAttrMap().put("returnType", (TYPE5!=null?TYPE5.getText():null)).put("name", (ID6!=null?ID6.getText():null)).put("argumentList", ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:90:1: returnOperator : 'return' ( ID )? ';' ;
    public final GraphLangParser.returnOperator_return returnOperator() throws RecognitionException {
        GraphLangParser.returnOperator_return retval = new GraphLangParser.returnOperator_return();
        retval.start = input.LT(1);

        Token ID7=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:91:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:91:11: 'return' ( ID )? ';'
            {
            match(input,17,FOLLOW_17_in_returnOperator304); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:91:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:91:20: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_returnOperator306); 

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_returnOperator309); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:98:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final GraphLangParser.functionArgumentList_return functionArgumentList() throws RecognitionException {
        GraphLangParser.functionArgumentList_return retval = new GraphLangParser.functionArgumentList_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:99:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:99:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList339);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:99:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:99:36: ',' functionArgumentDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_functionArgumentList342); 
            	    pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList344);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:102:1: functionArgumentDeclarator : TYPE ID ;
    public final GraphLangParser.functionArgumentDeclarator_return functionArgumentDeclarator() throws RecognitionException {
        GraphLangParser.functionArgumentDeclarator_return retval = new GraphLangParser.functionArgumentDeclarator_return();
        retval.start = input.LT(1);

        Token TYPE8=null;
        Token ID9=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:103:5: ( TYPE ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:103:8: TYPE ID
            {
            TYPE8=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionArgumentDeclarator364); 
            ID9=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentDeclarator366); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:119:1: mainBlock : 'main' '{' (s+= blockStatement )* '}' -> print(value=$s);
    public final GraphLangParser.mainBlock_return mainBlock() throws RecognitionException {
        GraphLangParser.mainBlock_return retval = new GraphLangParser.mainBlock_return();
        retval.start = input.LT(1);

        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:4: ( 'main' '{' (s+= blockStatement )* '}' -> print(value=$s))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:6: 'main' '{' (s+= blockStatement )* '}'
            {
            match(input,19,FOLLOW_19_in_mainBlock402); 
            match(input,15,FOLLOW_15_in_mainBlock404); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:18: (s+= blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==20||(LA8_0>=22 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:18: s+= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_mainBlock408);
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

            match(input,16,FOLLOW_16_in_mainBlock411); 


            // TEMPLATE REWRITE
            // 120:41: -> print(value=$s)
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:123:1: blockStatement : ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st} | statement -> {$statement.st});
    public final GraphLangParser.blockStatement_return blockStatement() throws RecognitionException {
        GraphLangParser.blockStatement_return retval = new GraphLangParser.blockStatement_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement10 = null;

        GraphLangParser.statement_return statement11 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:124:5: ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st} | statement -> {$statement.st})
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:124:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement441);
                    variableDeclarationStatement10=variableDeclarationStatement();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_blockStatement443); 


                    // TEMPLATE REWRITE
                    // 124:42: -> {$variableDeclarationStatement.st}
                    {
                        retval.st = (variableDeclarationStatement10!=null?variableDeclarationStatement10.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:125:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement457);
                    statement11=statement();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 125:19: -> {$statement.st}
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:1: block : '{' ( statement )* '}' ;
    public final GraphLangParser.block_return block() throws RecognitionException {
        GraphLangParser.block_return retval = new GraphLangParser.block_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:5: ( '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:7: '{' ( statement )* '}'
            {
            match(input,15,FOLLOW_15_in_block487); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:11: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==20||(LA10_0>=22 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block489);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_block492); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:133:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block -> MyForControl() | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );
    public final GraphLangParser.statement_return statement() throws RecognitionException {
        GraphLangParser.statement_return retval = new GraphLangParser.statement_return();
        retval.start = input.LT(1);

        GraphLangParser.assignmentOperation_return assignmentOperation12 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:5: ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block -> MyForControl() | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:9: 'if' '(' logicalExpression ')' block ( 'else' block )?
                    {
                    match(input,20,FOLLOW_20_in_statement511); 
                    match(input,13,FOLLOW_13_in_statement513); 
                    pushFollow(FOLLOW_logicalExpression_in_statement515);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement517); 
                    pushFollow(FOLLOW_block_in_statement519);
                    block();

                    state._fsp--;

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:46: ( 'else' block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:47: 'else' block
                            {
                            match(input,21,FOLLOW_21_in_statement522); 
                            pushFollow(FOLLOW_block_in_statement524);
                            block();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:135:9: 'for' '(' forControl ')' block
                    {
                    match(input,22,FOLLOW_22_in_statement537); 
                    match(input,13,FOLLOW_13_in_statement539); 
                    pushFollow(FOLLOW_forControl_in_statement541);
                    forControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement543); 
                    pushFollow(FOLLOW_block_in_statement545);
                    block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 135:40: -> MyForControl()
                    {
                        retval.st = templateLib.getInstanceOf("MyForControl");
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:136:9: 'foreach' '(' foreachControl ')' block
                    {
                    match(input,23,FOLLOW_23_in_statement560); 
                    match(input,13,FOLLOW_13_in_statement562); 
                    pushFollow(FOLLOW_foreachControl_in_statement564);
                    foreachControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement566); 
                    pushFollow(FOLLOW_block_in_statement568);
                    block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:137:9: 'while' '(' logicalExpression ')' block
                    {
                    match(input,24,FOLLOW_24_in_statement579); 
                    match(input,13,FOLLOW_13_in_statement581); 
                    pushFollow(FOLLOW_logicalExpression_in_statement583);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement585); 
                    pushFollow(FOLLOW_block_in_statement587);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:9: 'do' block 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,25,FOLLOW_25_in_statement598); 
                    pushFollow(FOLLOW_block_in_statement601);
                    block();

                    state._fsp--;

                    match(input,24,FOLLOW_24_in_statement603); 
                    match(input,13,FOLLOW_13_in_statement605); 
                    pushFollow(FOLLOW_logicalExpression_in_statement607);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement609); 
                    match(input,12,FOLLOW_12_in_statement611); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:139:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement622);
                    assignmentOperation12=assignmentOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement624); 


                    // TEMPLATE REWRITE
                    // 139:33: -> {$assignmentOperation.st}
                    {
                        retval.st = (assignmentOperation12!=null?assignmentOperation12.st:null);
                    }


                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:140:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement637);
                    setArcOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement639); 

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:141:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement650);
                    setGraphOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement652); 

                    }
                    break;
                case 9 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement663);
                    callClassMethod();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement665); 

                    }
                    break;
                case 10 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:143:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement676);
                    callInlineFunction();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement678); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:146:1: foreachControl : f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? ;
    public final GraphLangParser.foreachControl_return foreachControl() throws RecognitionException {
        GraphLangParser.foreachControl_return retval = new GraphLangParser.foreachControl_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return f = null;

        GraphLangParser.idLiteral_return s = null;

        GraphLangParser.foreachType_return foreachType13 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:5: (f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:9: f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )?
            {
            pushFollow(FOLLOW_idLiteral_in_foreachControl704);
            f=idLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_foreachControl706); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl710);
            s=idLiteral();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:37: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:38: ';' ( foreachType )?
                    {
                    match(input,12,FOLLOW_12_in_foreachControl713); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:42: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:147:42: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl715);
                            foreachType13=foreachType();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            		        if(!names.checkForeachControl(((programm_scope)programm_stack.peek()).curBlock+"."+(f!=null?input.toString(f.start,f.stop):null), ((programm_scope)programm_stack.peek()).curBlock+"."+(s!=null?input.toString(s.start,s.stop):null),(foreachType13!=null?input.toString(foreachType13.start,foreachType13.stop):null), (s!=null?s.curLine:0))){
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:155:1: foreachType : ( 'output' | 'input' );
    public final GraphLangParser.foreachType_return foreachType() throws RecognitionException {
        GraphLangParser.foreachType_return retval = new GraphLangParser.foreachType_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:156:5: ( 'output' | 'input' )
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

    public static class forControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forControl"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:160:1: forControl : ( forInit )? ';' forLiteral ';' forLiteral ;
    public final GraphLangParser.forControl_return forControl() throws RecognitionException {
        GraphLangParser.forControl_return retval = new GraphLangParser.forControl_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:5: ( ( forInit )? ';' forLiteral ';' forLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:9: ( forInit )? ';' forLiteral ';' forLiteral
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:9: ( forInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:9: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forControl772);
                    forInit();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_forControl775); 
            pushFollow(FOLLOW_forLiteral_in_forControl777);
            forLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_forControl779); 
            pushFollow(FOLLOW_forLiteral_in_forControl781);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:1: forLiteral : ( intLiteral | idLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.forLiteral_return forLiteral() throws RecognitionException {
        GraphLangParser.forLiteral_return retval = new GraphLangParser.forLiteral_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral14 = null;

        GraphLangParser.callClassMethod_return callClassMethod15 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction16 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:166:5: ( intLiteral | idLiteral | callClassMethod | callInlineFunction )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:166:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forLiteral805);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:167:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forLiteral816);
                    idLiteral14=idLiteral();

                    state._fsp--;

                    if(!(idLiteral14!=null?idLiteral14.idType:null).equals("int")){errors.add("line "+(idLiteral14!=null?idLiteral14.curLine:0)+": for  variable must have type int ");}

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:168:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_forLiteral828);
                    callClassMethod15=callClassMethod();

                    state._fsp--;

                    if(!(callClassMethod15!=null?callClassMethod15.methodType:null).equals("int")){errors.add("line "+(callClassMethod15!=null?callClassMethod15.curLine:0)+": for variable must have type int ");}

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_forLiteral840);
                    callInlineFunction16=callInlineFunction();

                    state._fsp--;

                    if(!(callInlineFunction16!=null?callInlineFunction16.functionType:null).equals("int")){errors.add("line "+(callInlineFunction16!=null?callInlineFunction16.curLine:0)+": for variable must have type int ");}

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:173:1: forInit : idLiteral ;
    public final GraphLangParser.forInit_return forInit() throws RecognitionException {
        GraphLangParser.forInit_return retval = new GraphLangParser.forInit_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral17 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:174:5: ( idLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:174:9: idLiteral
            {
            pushFollow(FOLLOW_idLiteral_in_forInit862);
            idLiteral17=idLiteral();

            state._fsp--;


                    if(!(idLiteral17!=null?idLiteral17.idType:null).equals("int")){
                      errors.add("line "+(idLiteral17!=null?idLiteral17.curLine:0)+": for init variable must have type int ");
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:182:1: callInlineFunction returns [String functionType, int curLine] : ID '(' ( argumentList )? ')' ;
    public final GraphLangParser.callInlineFunction_return callInlineFunction() throws RecognitionException {
        GraphLangParser.callInlineFunction_return retval = new GraphLangParser.callInlineFunction_return();
        retval.start = input.LT(1);

        Token ID18=null;
        GraphLangParser.argumentList_return argumentList19 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:183:5: ( ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:183:8: ID '(' ( argumentList )? ')'
            {
            ID18=(Token)match(input,ID,FOLLOW_ID_in_callInlineFunction891); 
            match(input,13,FOLLOW_13_in_callInlineFunction893); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:183:15: ( argumentList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=FLOAT && LA17_0<=STRING)||(LA17_0>=43 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:183:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction895);
                    argumentList19=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callInlineFunction898); 

                      retval.functionType = "?";
                      ArrayList list = null;
                      retval.curLine = (ID18!=null?ID18.getLine():0);
                      if((argumentList19!=null?argumentList19.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList19!=null?argumentList19.argumentTypeList:null);
                      if(!names.checkCallFunction(((programm_scope)programm_stack.peek()).curBlock, (ID18!=null?ID18.getText():null), list, (ID18!=null?ID18.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      else{
                          retval.functionType = names.getFunction((ID18!=null?ID18.getText():null)).getReturnType();
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:201:1: callClassMethod returns [String methodType, int curLine] : varId= ID '.' mName= ID '(' ( argumentList )? ')' ;
    public final GraphLangParser.callClassMethod_return callClassMethod() throws RecognitionException {
        callClassMethod_stack.push(new callClassMethod_scope());
        GraphLangParser.callClassMethod_return retval = new GraphLangParser.callClassMethod_return();
        retval.start = input.LT(1);

        Token varId=null;
        Token mName=null;
        GraphLangParser.argumentList_return argumentList20 = null;



          ((callClassMethod_scope)callClassMethod_stack.peek()).variableId ="";
          ((callClassMethod_scope)callClassMethod_stack.peek()).methodName ="";
          //((callClassMethod_scope)callClassMethod_stack.peek()).argumentTypeList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:212:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:212:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod937); 
            match(input,28,FOLLOW_28_in_callClassMethod939); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null); 
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod954); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            match(input,13,FOLLOW_13_in_callClassMethod968); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:214:13: ( argumentList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||(LA18_0>=FLOAT && LA18_0<=STRING)||(LA18_0>=43 && LA18_0<=44)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:214:13: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callClassMethod970);
                    argumentList20=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callClassMethod973); 

                      retval.methodType ="?";
                      retval.curLine = (varId!=null?varId.getLine():0);
                      ArrayList list = null;
                      if((argumentList20!=null?argumentList20.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList20!=null?argumentList20.argumentTypeList:null);
                      if(!names.checkCallClassMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null), (argumentList20!=null?argumentList20.argumentTypeList:null), (varId!=null?varId.getLine():0))){
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

    public static class assignmentOperation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:230:1: assignmentOperation : ID assignmentOperator mathExpression -> test();
    public final GraphLangParser.assignmentOperation_return assignmentOperation() throws RecognitionException {
        assignmentOperation_stack.push(new assignmentOperation_scope());
        GraphLangParser.assignmentOperation_return retval = new GraphLangParser.assignmentOperation_return();
        retval.start = input.LT(1);

        Token ID21=null;
        GraphLangParser.assignmentOperator_return assignmentOperator22 = null;

        GraphLangParser.mathExpression_return mathExpression23 = null;



            ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = "none";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:237:5: ( ID assignmentOperator mathExpression -> test())
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:237:8: ID assignmentOperator mathExpression
            {
            ID21=(Token)match(input,ID,FOLLOW_ID_in_assignmentOperation1009); 

                      if(names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID21!=null?ID21.getText():null))){
                        ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID21!=null?ID21.getText():null)).getType();
                      }
                      else{
                        errors.add("line "+(ID21!=null?ID21.getLine():0)+": unknown variable "+(ID21!=null?ID21.getText():null));
                      }
                   
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation1029);
            assignmentOperator22=assignmentOperator();

            state._fsp--;

            pushFollow(FOLLOW_mathExpression_in_assignmentOperation1039);
            mathExpression23=mathExpression();

            state._fsp--;


                      if(!typeCheker.checkAssignOperation((assignmentOperator22!=null?input.toString(assignmentOperator22.start,assignmentOperator22.stop):null),  ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType, (mathExpression23!=null?mathExpression23.mathExpressionType:null), (ID21!=null?ID21.getLine():0))){
                          typeCheker.getAllErrors(errors);
                      }
                   


            // TEMPLATE REWRITE
            // 253:8: -> test()
            {
                retval.st = templateLib.getInstanceOf("test");
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:256:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' ;
    public final GraphLangParser.setGraphOperation_return setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        GraphLangParser.setGraphOperation_return retval = new GraphLangParser.setGraphOperation_return();
        retval.start = input.LT(1);

        Token ID24=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:267:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:267:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
            ID24=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation1085); 
            match(input,29,FOLLOW_29_in_setGraphOperation1087); 
            match(input,13,FOLLOW_13_in_setGraphOperation1089); 
            match(input,15,FOLLOW_15_in_setGraphOperation1092); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation1094);
            variableList();

            state._fsp--;

            match(input,16,FOLLOW_16_in_setGraphOperation1096); 
            match(input,18,FOLLOW_18_in_setGraphOperation1098); 
            match(input,15,FOLLOW_15_in_setGraphOperation1100); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:267:49: ( setArcExpressions )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:267:49: setArcExpressions
                    {
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation1102);
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_setGraphOperation1105); 
            match(input,14,FOLLOW_14_in_setGraphOperation1108); 

                        names.checkSetGraphOperator((ID24!=null?ID24.getText():null),((programm_scope)programm_stack.peek()).curBlock,((setGraphOperation_scope)setGraphOperation_stack.peek()).varList,((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList,((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList,(ID24!=null?ID24.getLine():0));
                        names.getAllErrors(errors);
                    

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:274:1: variableList : a= ID ( ',' b= ID )* ;
    public final GraphLangParser.variableList_return variableList() throws RecognitionException {
        GraphLangParser.variableList_return retval = new GraphLangParser.variableList_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:275:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:275:8: a= ID ( ',' b= ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList1138); 
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:275:58: ( ',' b= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:275:59: ',' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_variableList1143); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList1147); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:279:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final GraphLangParser.setArcExpressions_return setArcExpressions() throws RecognitionException {
        GraphLangParser.setArcExpressions_return retval = new GraphLangParser.setArcExpressions_return();
        retval.start = input.LT(1);

        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:280:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:280:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1175); 
            match(input,30,FOLLOW_30_in_setArcExpressions1177); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1181); 

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:285:8: ( ',' a= ID '->' b= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:285:9: ',' a= ID '->' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_setArcExpressions1204); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1208); 
            	    match(input,30,FOLLOW_30_in_setArcExpressions1210); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1214); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:1: variableDeclarationStatement returns [String tVariableType,ArrayList<String> tVariableList] : variableDeclaration -> {$variableDeclaration.st};
    public final GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement() throws RecognitionException {
        GraphLangParser.variableDeclarationStatement_return retval = new GraphLangParser.variableDeclarationStatement_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclaration_return variableDeclaration25 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:291:4: ( variableDeclaration -> {$variableDeclaration.st})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:291:6: variableDeclaration
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1241);
            variableDeclaration25=variableDeclaration();

            state._fsp--;



            // TEMPLATE REWRITE
            // 291:26: -> {$variableDeclaration.st}
            {
                retval.st = (variableDeclaration25!=null?variableDeclaration25.st:null);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:296:1: variableDeclaration returns [String tVariableType,ArrayList<String> tVariableList] : TYPE variableDeclarators -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableList);
    public final GraphLangParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        GraphLangParser.variableDeclaration_return retval = new GraphLangParser.variableDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE26=null;
        GraphLangParser.variableDeclarators_return variableDeclarators27 = null;



          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:303:5: ( TYPE variableDeclarators -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableList))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:303:9: TYPE variableDeclarators
            {
            TYPE26=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1287); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE26!=null?TYPE26.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1291);
            variableDeclarators27=variableDeclarators();

            state._fsp--;

            if((TYPE26!=null?TYPE26.getText():null).equals("Text")) ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "String";


            // TEMPLATE REWRITE
            // 305:9: -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableList)
            {
                retval.st = templateLib.getInstanceOf("MyVariableDeclarators",
              new STAttrMap().put("type", ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType).put("list", (variableDeclarators27!=null?variableDeclarators27.tVariableList:null)));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:311:1: variableDeclarators returns [ArrayList<String> tVariableList] : a= variableDeclarator ( ',' b= variableDeclarator )* ;
    public final GraphLangParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
        GraphLangParser.variableDeclarators_return retval = new GraphLangParser.variableDeclarators_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarator_return a = null;

        GraphLangParser.variableDeclarator_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:312:5: (a= variableDeclarator ( ',' b= variableDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:313:7: a= variableDeclarator ( ',' b= variableDeclarator )*
            {
            retval.tVariableList = new ArrayList<String>();
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1387);
            a=variableDeclarator();

            state._fsp--;

            retval.tVariableList.add((a!=null?a.tVariableId:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:315:7: ( ',' b= variableDeclarator )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:315:8: ',' b= variableDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_variableDeclarators1398); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1402);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:318:1: variableDeclarator returns [String tVariableId] : ID ;
    public final GraphLangParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        GraphLangParser.variableDeclarator_return retval = new GraphLangParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Token ID28=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:325:5: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:325:9: ID
            {
            ID28=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1437); 

                    if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID28!=null?ID28.getText():null)) ){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID28!=null?ID28.getText():null), ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType, (ID28!=null?ID28.getLine():0)));
                      ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList.add(((programm_scope)programm_stack.peek()).curBlock+"."+(ID28!=null?ID28.getText():null));
            	      }
            	      else{
            	          errors.add("line "+(ID28!=null?ID28.getLine():0)+": duplicated variable name "+(ID28!=null?ID28.getText():null));
            	      }
            	      retval.tVariableId = (ID28!=null?ID28.getText():null);
                

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:338:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' ;
    public final GraphLangParser.setArcOperation_return setArcOperation() throws RecognitionException {
        GraphLangParser.setArcOperation_return retval = new GraphLangParser.setArcOperation_return();
        retval.start = input.LT(1);

        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:339:5: (id= ID '=' '(' from= ID '->' to= ID ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:339:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1464); 
            match(input,29,FOLLOW_29_in_setArcOperation1466); 
            match(input,13,FOLLOW_13_in_setArcOperation1468); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1472); 
            match(input,30,FOLLOW_30_in_setArcOperation1474); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1478); 
            match(input,14,FOLLOW_14_in_setArcOperation1479); 

                    boolean result = names.checkSetArcOperator((id!=null?id.getText():null), (from!=null?from.getText():null), (to!=null?to.getText():null), ((programm_scope)programm_stack.peek()).curBlock, (id!=null?id.getLine():0));
                    if(result==false){
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
    // $ANTLR end "setArcOperation"

    public static class mathTerm_return extends ParserRuleReturnScope {
        public String mathTermType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mathTerm"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:348:1: mathTerm returns [String mathTermType] : ( literal | '(' mathExpression ')' );
    public final GraphLangParser.mathTerm_return mathTerm() throws RecognitionException {
        GraphLangParser.mathTerm_return retval = new GraphLangParser.mathTerm_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return literal29 = null;

        GraphLangParser.mathExpression_return mathExpression30 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:349:5: ( literal | '(' mathExpression ')' )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:349:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_mathTerm1510);
                    literal29=literal();

                    state._fsp--;

                    retval.mathTermType = (literal29!=null?literal29.literalType:null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:350:8: '(' mathExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_mathTerm1521); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1523);
                    mathExpression30=mathExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_mathTerm1525); 
                    retval.mathTermType = (mathExpression30!=null?mathExpression30.mathExpressionType:null);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:353:1: unaryExpression returns [String unaryExpressionType] : ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm );
    public final GraphLangParser.unaryExpression_return unaryExpression() throws RecognitionException {
        GraphLangParser.unaryExpression_return retval = new GraphLangParser.unaryExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;

        GraphLangParser.mathTerm_return mathTerm31 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:5: ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:8: '+' a= unaryExpression
                    {
                    match(input,31,FOLLOW_31_in_unaryExpression1549); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1553);
                    a=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (a!=null?a.unaryExpressionType:null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:355:8: '-' b= unaryExpression
                    {
                    match(input,32,FOLLOW_32_in_unaryExpression1564); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1568);
                    b=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (b!=null?b.unaryExpressionType:null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:356:8: mathTerm
                    {
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1579);
                    mathTerm31=mathTerm();

                    state._fsp--;

                    retval.unaryExpressionType = (mathTerm31!=null?mathTerm31.mathTermType:null);

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:359:1: multiplicativeExpression returns [String multiplicativeExpressionType] : a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* ;
    public final GraphLangParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        GraphLangParser.multiplicativeExpression_return retval = new GraphLangParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:5: (a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:360:7: a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1614);
            a=unaryExpression();

            state._fsp--;

            type.add((a!=null?a.unaryExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:361:61: ( ( '*' | '/' ) b= unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:361:62: ( '*' | '/' ) b= unaryExpression
            	    {
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1627);
            	    b=unaryExpression();

            	    state._fsp--;

            	    type.add((b!=null?b.unaryExpressionType:null));

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


                      retval.multiplicativeExpressionType = typeCheker.checkMathExpressionTypes(type);
                  

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:368:1: mathExpression returns [String mathExpressionType] : a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* ;
    public final GraphLangParser.mathExpression_return mathExpression() throws RecognitionException {
        GraphLangParser.mathExpression_return retval = new GraphLangParser.mathExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.multiplicativeExpression_return a = null;

        GraphLangParser.multiplicativeExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:369:5: (a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:369:9: a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1684);
            a=multiplicativeExpression();

            state._fsp--;

            type.add((a!=null?a.multiplicativeExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:370:82: ( ( '-' | '+' ) b= multiplicativeExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=31 && LA26_0<=32)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:370:83: ( '-' | '+' ) b= multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1698);
            	    b=multiplicativeExpression();

            	    state._fsp--;

            	    type.add((b!=null?b.multiplicativeExpressionType:null));

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


                      retval.mathExpressionType = typeCheker.checkMathExpressionTypes(type);
                    

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:376:1: logicalExpression : relationExpression ( ( '&&' | '||' ) relationExpression )* ;
    public final GraphLangParser.logicalExpression_return logicalExpression() throws RecognitionException {
        GraphLangParser.logicalExpression_return retval = new GraphLangParser.logicalExpression_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:377:4: ( relationExpression ( ( '&&' | '||' ) relationExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:377:7: relationExpression ( ( '&&' | '||' ) relationExpression )*
            {
            pushFollow(FOLLOW_relationExpression_in_logicalExpression1732);
            relationExpression();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:377:26: ( ( '&&' | '||' ) relationExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=35 && LA27_0<=36)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:377:27: ( '&&' | '||' ) relationExpression
            	    {
            	    if ( (input.LA(1)>=35 && input.LA(1)<=36) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression1741);
            	    relationExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "logicalExpression"

    public static class relationExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:381:1: relationExpression : ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) ;
    public final GraphLangParser.relationExpression_return relationExpression() throws RecognitionException {
        GraphLangParser.relationExpression_return retval = new GraphLangParser.relationExpression_return();
        retval.start = input.LT(1);

        Token RELATIONALOP32=null;
        GraphLangParser.logicalAtom_return t1 = null;

        GraphLangParser.logicalAtom_return t2 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:382:5: ( ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:382:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:382:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:382:9: '(' logicalExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_relationExpression1762); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression1764);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_relationExpression1766); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:383:8: t1= logicalAtom RELATIONALOP t2= logicalAtom
                    {
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1777);
                    t1=logicalAtom();

                    state._fsp--;

                    RELATIONALOP32=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_relationExpression1780); 
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1784);
                    t2=logicalAtom();

                    state._fsp--;


                              if(!(t1!=null?t1.atomType:null).equals((t2!=null?t2.atomType:null))){
                                if((t1!=null?t1.atomType:null).equals("null")){
                                  if(!(t2!=null?t2.atomType:null).equals("OArc") && !(t2!=null?t2.atomType:null).equals("Graph") && !(t2!=null?t2.atomType:null).equals("Node") && !(t2!=null?t2.atomType:null).equals("Text")){
                                      errors.add("line "+(RELATIONALOP32!=null?RELATIONALOP32.getLine():0)+": the operator "+(RELATIONALOP32!=null?RELATIONALOP32.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else if((t2!=null?t2.atomType:null).equals("null")){
                                  if(!(t1!=null?t1.atomType:null).equals("OArc") && !(t1!=null?t1.atomType:null).equals("Graph") && !(t1!=null?t1.atomType:null).equals("Node") && !(t1!=null?t1.atomType:null).equals("Text")){
                                      errors.add("line "+(RELATIONALOP32!=null?RELATIONALOP32.getLine():0)+": the operator "+(RELATIONALOP32!=null?RELATIONALOP32.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else {
                                  errors.add("line "+(RELATIONALOP32!=null?RELATIONALOP32.getLine():0)+": the operator "+(RELATIONALOP32!=null?RELATIONALOP32.getText():null) +" is undefined for arguments "+(t1!=null?t1.atomType:null)+","+(t2!=null?t2.atomType:null));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:405:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );
    public final GraphLangParser.logicalAtom_return logicalAtom() throws RecognitionException {
        GraphLangParser.logicalAtom_return retval = new GraphLangParser.logicalAtom_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral33 = null;

        GraphLangParser.callClassMethod_return callClassMethod34 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction35 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:406:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:406:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom1822);
                    intLiteral();

                    state._fsp--;

                    retval.atomType = "int"; 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:407:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom1834);
                    floatLiteral();

                    state._fsp--;

                    retval.atomType = "float"; 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:408:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom1846);
                    idLiteral33=idLiteral();

                    state._fsp--;

                    retval.atomType = (idLiteral33!=null?idLiteral33.idType:null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom1858);
                    stringLiteral();

                    state._fsp--;

                    retval.atomType = "Text"; 

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:410:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_logicalAtom1870);
                    booleanLiteral();

                    state._fsp--;

                    retval.atomType = "bool"; 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:411:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom1882);
                    callClassMethod34=callClassMethod();

                    state._fsp--;

                    retval.atomType = (callClassMethod34!=null?callClassMethod34.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:412:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom1894);
                    callInlineFunction35=callInlineFunction();

                    state._fsp--;

                    retval.atomType = (callInlineFunction35!=null?callInlineFunction35.functionType:null);

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:413:9: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom1906);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:416:1: nullLiteral : 'null' ;
    public final GraphLangParser.nullLiteral_return nullLiteral() throws RecognitionException {
        GraphLangParser.nullLiteral_return retval = new GraphLangParser.nullLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:417:5: ( 'null' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:417:7: 'null'
            {
            match(input,37,FOLLOW_37_in_nullLiteral1925); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:429:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
    public final GraphLangParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        GraphLangParser.assignmentOperator_return retval = new GraphLangParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:430:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:1: literal returns [String literalType, String literalValue] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.literal_return literal() throws RecognitionException {
        GraphLangParser.literal_return retval = new GraphLangParser.literal_return();
        retval.start = input.LT(1);

        GraphLangParser.intLiteral_return intLiteral36 = null;

        GraphLangParser.floatLiteral_return floatLiteral37 = null;

        GraphLangParser.idLiteral_return idLiteral38 = null;

        GraphLangParser.stringLiteral_return stringLiteral39 = null;

        GraphLangParser.booleanLiteral_return booleanLiteral40 = null;

        GraphLangParser.callClassMethod_return callClassMethod41 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction42 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:450:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:450:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_literal2147);
                    intLiteral36=intLiteral();

                    state._fsp--;

                    retval.literalType = "int"; retval.literalValue =(intLiteral36!=null?input.toString(intLiteral36.start,intLiteral36.stop):null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:451:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_literal2159);
                    floatLiteral37=floatLiteral();

                    state._fsp--;

                    retval.literalType = "float"; retval.literalValue =(floatLiteral37!=null?input.toString(floatLiteral37.start,floatLiteral37.stop):null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:452:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_literal2171);
                    idLiteral38=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral38!=null?idLiteral38.idType:null); retval.literalValue =(idLiteral38!=null?input.toString(idLiteral38.start,idLiteral38.stop):null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:453:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal2183);
                    stringLiteral39=stringLiteral();

                    state._fsp--;

                    retval.literalType = "Text"; retval.literalValue =(stringLiteral39!=null?input.toString(stringLiteral39.start,stringLiteral39.stop):null);

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:454:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal2195);
                    booleanLiteral40=booleanLiteral();

                    state._fsp--;

                    retval.literalType = "bool"; retval.literalValue =(booleanLiteral40!=null?input.toString(booleanLiteral40.start,booleanLiteral40.stop):null); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:455:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_literal2207);
                    callClassMethod41=callClassMethod();

                    state._fsp--;

                    retval.literalType = (callClassMethod41!=null?callClassMethod41.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:456:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_literal2219);
                    callInlineFunction42=callInlineFunction();

                    state._fsp--;

                    retval.literalType = (callInlineFunction42!=null?callInlineFunction42.functionType:null);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:459:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* ;
    public final GraphLangParser.argumentList_return argumentList() throws RecognitionException {
        GraphLangParser.argumentList_return retval = new GraphLangParser.argumentList_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:460:3: (a= literal ( ',' b= literal )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:460:6: a= literal ( ',' b= literal )*
            {

                    retval.argumentTypeList = new ArrayList<String>();
                 
            pushFollow(FOLLOW_literal_in_argumentList2248);
            a=literal();

            state._fsp--;

            retval.argumentTypeList.add((a!=null?a.literalType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:464:3: ( ',' b= literal )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:464:4: ',' b= literal
            	    {
            	    match(input,18,FOLLOW_18_in_argumentList2257); 
            	    pushFollow(FOLLOW_literal_in_argumentList2261);
            	    b=literal();

            	    state._fsp--;

            	    retval.argumentTypeList.add((b!=null?b.literalType:null));

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "argumentList"

    public static class floatLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "floatLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:467:1: floatLiteral : FLOAT ;
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:3: ( FLOAT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:468:5: FLOAT
            {
            match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral2279); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:471:1: idLiteral returns [String idType, int curLine] : ID ;
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID43=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:3: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:5: ID
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_idLiteral2297); 

                  retval.curLine = (ID43!=null?ID43.getLine():0);
                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID43!=null?ID43.getText():null))){
                    errors.add("line "+(ID43!=null?ID43.getLine():0)+": unknown variable "+(ID43!=null?ID43.getText():null));
                    retval.idType = "";
                  }
                  else{
                    names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID43!=null?ID43.getText():null)).addLineUses((ID43!=null?ID43.getLine():0));
                    retval.idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID43!=null?ID43.getText():null)).getType();
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:486:1: intLiteral : INT ;
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:487:3: ( INT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:487:5: INT
            {
            match(input,INT,FOLLOW_INT_in_intLiteral2318); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:490:1: stringLiteral : STRING ;
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:491:3: ( STRING )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:491:6: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2333); 

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "booleanLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:494:1: booleanLiteral : ( 'true' | 'false' );
    public final GraphLangParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        GraphLangParser.booleanLiteral_return retval = new GraphLangParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:495:5: ( 'true' | 'false' )
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
            return "133:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block -> MyForControl() | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );";
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
            return "405:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_globalExpression_in_programm68 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_mainBlock_in_programm73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalExpression102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_globalExpression120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_globalVariableDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_functionDeclaration214 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_functionArgumentList_in_functionDeclaration216 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDeclaration219 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration243 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_blockStatement_in_functionDeclaration245 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_returnOperator_in_functionDeclaration249 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_returnOperator304 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ID_in_returnOperator306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_returnOperator309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList339 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_functionArgumentList342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList344 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_TYPE_in_functionArgumentDeclarator364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionArgumentDeclarator366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_mainBlock402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_mainBlock404 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_blockStatement_in_mainBlock408 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_mainBlock411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_blockStatement441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_blockStatement443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_block487 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_statement_in_block489 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_block492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_statement511 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement513 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement515 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement517 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement519 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_statement522 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_statement537 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement539 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_forControl_in_statement541 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement543 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement560 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_foreachControl_in_statement564 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement566 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement579 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement581 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement583 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement598 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement605 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement609 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement622 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement637 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement650 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement663 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement676 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl704 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_foreachControl706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl710 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_foreachControl713 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl772 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl775 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl777 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl779 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forLiteral805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forLiteral816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_forLiteral828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_forLiteral840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction891 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callInlineFunction893 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction895 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callInlineFunction898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod937 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_callClassMethod939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod954 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callClassMethod968 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod970 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callClassMethod973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation1009 = new BitSet(new long[]{0x000007C020000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation1029 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation1085 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setGraphOperation1087 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setGraphOperation1089 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation1092 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation1094 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1096 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_setGraphOperation1098 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation1100 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation1102 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1105 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList1138 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableList1143 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList1147 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1175 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1181 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_setArcExpressions1204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1208 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1214 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1387 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableDeclarators1398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1402 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1464 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcOperation1466 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setArcOperation1468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1472 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcOperation1474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setArcOperation1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_mathTerm1521 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1523 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_mathTerm1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unaryExpression1549 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unaryExpression1564 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1614 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1619 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1627 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1684 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_mathExpression1690 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1698 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1732 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_logicalExpression1735 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1741 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_13_in_relationExpression1762 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression1764 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_relationExpression1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1777 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_relationExpression1780 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_logicalAtom1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nullLiteral1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList2248 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_argumentList2257 = new BitSet(new long[]{0x0000180003D003B0L});
    public static final BitSet FOLLOW_literal_in_argumentList2261 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});

}