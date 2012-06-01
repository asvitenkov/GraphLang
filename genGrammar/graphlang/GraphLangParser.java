// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-06-01 18:29:38

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:26:1: programm : (s+= globalExpression )* mainBlock -> print(value=$s);
    public final GraphLangParser.programm_return programm() throws RecognitionException {
        programm_stack.push(new programm_scope());
        GraphLangParser.programm_return retval = new GraphLangParser.programm_return();
        retval.start = input.LT(1);

        List list_s=null;
        RuleReturnScope s = null;

          ((programm_scope)programm_stack.peek()).curBlock = "";
          ((programm_scope)programm_stack.peek()).tGlobalVariables = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:35:4: ( (s+= globalExpression )* mainBlock -> print(value=$s))
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
            mainBlock();

            state._fsp--;



            // TEMPLATE REWRITE
            // 35:70: -> print(value=$s)
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:38:1: globalExpression : ( globalVariableDeclaration -> globalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;});
    public final GraphLangParser.globalExpression_return globalExpression() throws RecognitionException {
        GraphLangParser.globalExpression_return retval = new GraphLangParser.globalExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.globalVariableDeclaration_return globalVariableDeclaration1 = null;

        GraphLangParser.functionDeclaration_return functionDeclaration2 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:39:4: ( globalVariableDeclaration -> globalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;})
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
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression97);
                    globalVariableDeclaration1=globalVariableDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 39:34: -> globalVariableDeclaration(list=$globalVariableDeclaration.st)
                    {
                        retval.st = templateLib.getInstanceOf("globalVariableDeclaration",
                      new STAttrMap().put("list", (globalVariableDeclaration1!=null?globalVariableDeclaration1.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:40:7: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_globalExpression115);
                    functionDeclaration2=functionDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 40:27: -> {$functionDeclaration.st;}
                    {
                        retval.st = (functionDeclaration2!=null?functionDeclaration2.st:null);;
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

        GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement3 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:4: ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st;})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:44:7: variableDeclarationStatement ';'
            {
            ((programm_scope)programm_stack.peek()).curBlock = "global";
            pushFollow(FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration147);
            variableDeclarationStatement3=variableDeclarationStatement();

            state._fsp--;

            match(input,12,FOLLOW_12_in_globalVariableDeclaration149); 


            // TEMPLATE REWRITE
            // 45:40: -> {$variableDeclarationStatement.st;}
            {
                retval.st = (variableDeclarationStatement3!=null?variableDeclarationStatement3.st:null);;
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:48:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' ;
    public final GraphLangParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_stack.push(new functionDeclaration_scope());
        GraphLangParser.functionDeclaration_return retval = new GraphLangParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE4=null;
        Token ID5=null;


          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = false;
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable ="";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:65:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:66:8: TYPE ID '(' ( functionArgumentList )? ')' '{' ( blockStatement )* ( returnOperator )? '}'
            {
            TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration185); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE4!=null?TYPE4.getText():null); 
            ID5=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration196); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID5!=null?ID5.getText():null);
            match(input,13,FOLLOW_13_in_functionDeclaration209); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:68:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:68:12: functionArgumentList
                    {
                    pushFollow(FOLLOW_functionArgumentList_in_functionDeclaration211);
                    functionArgumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_functionDeclaration214); 

            	            //add functon in namestable if it's not exists
            	            if(!names.isExistFunction((ID5!=null?ID5.getText():null))){
            	              names.addFunction(names.new FunctionName((ID5!=null?ID5.getText():null), (TYPE4!=null?TYPE4.getText():null) ,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames, (ID5!=null?ID5.getLine():0)));
            	            }
            	            else{
            	              errors.add("line "+(ID5!=null?ID5.getLine():0)+": duplicated function declaration "+(ID5!=null?ID5.getText():null));
            	            }
            	          
            match(input,15,FOLLOW_15_in_functionDeclaration238); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:78:12: ( blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==20||(LA4_0>=22 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:78:12: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_functionDeclaration240);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:78:29: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:78:29: returnOperator
                    {
                    pushFollow(FOLLOW_returnOperator_in_functionDeclaration244);
                    returnOperator();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_functionDeclaration247); 

            	        boolean result = names.checkReturnType((ID5!=null?ID5.getText():null), ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable, ((programm_scope)programm_stack.peek()).curBlock, ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed, (ID5!=null?ID5.getLine():0));
            	        if(result==false){
            	          errors.add(names.getLAstError());
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:87:1: returnOperator : 'return' ( ID )? ';' ;
    public final GraphLangParser.returnOperator_return returnOperator() throws RecognitionException {
        GraphLangParser.returnOperator_return retval = new GraphLangParser.returnOperator_return();
        retval.start = input.LT(1);

        Token ID6=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:88:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:88:11: 'return' ( ID )? ';'
            {
            match(input,17,FOLLOW_17_in_returnOperator276); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:88:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:88:20: ID
                    {
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_returnOperator278); 

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_returnOperator281); 

                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = true;
                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable =(ID6!=null?ID6.getText():null);
                      

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:95:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final GraphLangParser.functionArgumentList_return functionArgumentList() throws RecognitionException {
        GraphLangParser.functionArgumentList_return retval = new GraphLangParser.functionArgumentList_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:96:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:96:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList311);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:96:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:96:36: ',' functionArgumentDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_functionArgumentList314); 
            	    pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList316);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:99:1: functionArgumentDeclarator : TYPE ID ;
    public final GraphLangParser.functionArgumentDeclarator_return functionArgumentDeclarator() throws RecognitionException {
        GraphLangParser.functionArgumentDeclarator_return retval = new GraphLangParser.functionArgumentDeclarator_return();
        retval.start = input.LT(1);

        Token TYPE7=null;
        Token ID8=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:100:5: ( TYPE ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:100:8: TYPE ID
            {
            TYPE7=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionArgumentDeclarator336); 
            ID8=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentDeclarator338); 

                  // add variable and it's type in lists funcArgTypes and funcArgNames
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes.add((TYPE7!=null?TYPE7.getText():null));
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames.add((ID8!=null?ID8.getText():null));
                  if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID8!=null?ID8.getText():null))){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID8!=null?ID8.getText():null), (TYPE7!=null?TYPE7.getText():null), (ID8!=null?ID8.getLine():0)));
                  }
                  else{
                      errors.add("line "+(ID8!=null?ID8.getLine():0)+": duplicated variable name "+(ID8!=null?ID8.getText():null));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:114:1: mainBlock : 'main' '{' ( blockStatement )* '}' ;
    public final GraphLangParser.mainBlock_return mainBlock() throws RecognitionException {
        GraphLangParser.mainBlock_return retval = new GraphLangParser.mainBlock_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:115:4: ( 'main' '{' ( blockStatement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:115:6: 'main' '{' ( blockStatement )* '}'
            {
            match(input,19,FOLLOW_19_in_mainBlock361); 
            match(input,15,FOLLOW_15_in_mainBlock363); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:115:17: ( blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==20||(LA8_0>=22 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:115:17: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_mainBlock365);
            	    blockStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_mainBlock368); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:118:1: blockStatement : ( variableDeclarationStatement ';' | statement );
    public final GraphLangParser.blockStatement_return blockStatement() throws RecognitionException {
        GraphLangParser.blockStatement_return retval = new GraphLangParser.blockStatement_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:119:5: ( variableDeclarationStatement ';' | statement )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:119:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement387);
                    variableDeclarationStatement();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_blockStatement389); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement399);
                    statement();

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
    // $ANTLR end "blockStatement"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:124:1: block : '{' ( statement )* '}' ;
    public final GraphLangParser.block_return block() throws RecognitionException {
        GraphLangParser.block_return retval = new GraphLangParser.block_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:125:5: ( '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:125:7: '{' ( statement )* '}'
            {
            match(input,15,FOLLOW_15_in_block425); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:125:11: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==20||(LA10_0>=22 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:125:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block427);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_block430); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );
    public final GraphLangParser.statement_return statement() throws RecognitionException {
        GraphLangParser.statement_return retval = new GraphLangParser.statement_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:5: ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:9: 'if' '(' logicalExpression ')' block ( 'else' block )?
                    {
                    match(input,20,FOLLOW_20_in_statement449); 
                    match(input,13,FOLLOW_13_in_statement451); 
                    pushFollow(FOLLOW_logicalExpression_in_statement453);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement455); 
                    pushFollow(FOLLOW_block_in_statement457);
                    block();

                    state._fsp--;

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:46: ( 'else' block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:129:47: 'else' block
                            {
                            match(input,21,FOLLOW_21_in_statement460); 
                            pushFollow(FOLLOW_block_in_statement462);
                            block();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:130:9: 'for' '(' forControl ')' block
                    {
                    match(input,22,FOLLOW_22_in_statement474); 
                    match(input,13,FOLLOW_13_in_statement476); 
                    pushFollow(FOLLOW_forControl_in_statement478);
                    forControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement480); 
                    pushFollow(FOLLOW_block_in_statement482);
                    block();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:131:9: 'foreach' '(' foreachControl ')' block
                    {
                    match(input,23,FOLLOW_23_in_statement492); 
                    match(input,13,FOLLOW_13_in_statement494); 
                    pushFollow(FOLLOW_foreachControl_in_statement496);
                    foreachControl();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement498); 
                    pushFollow(FOLLOW_block_in_statement500);
                    block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:132:9: 'while' '(' logicalExpression ')' block
                    {
                    match(input,24,FOLLOW_24_in_statement510); 
                    match(input,13,FOLLOW_13_in_statement512); 
                    pushFollow(FOLLOW_logicalExpression_in_statement514);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement516); 
                    pushFollow(FOLLOW_block_in_statement518);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:133:9: 'do' block 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,25,FOLLOW_25_in_statement528); 
                    pushFollow(FOLLOW_block_in_statement531);
                    block();

                    state._fsp--;

                    match(input,24,FOLLOW_24_in_statement533); 
                    match(input,13,FOLLOW_13_in_statement535); 
                    pushFollow(FOLLOW_logicalExpression_in_statement537);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_statement539); 
                    match(input,12,FOLLOW_12_in_statement541); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:134:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement552);
                    assignmentOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement554); 

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:135:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement564);
                    setArcOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement566); 

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:136:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement576);
                    setGraphOperation();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement578); 

                    }
                    break;
                case 9 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:137:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement588);
                    callClassMethod();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement590); 

                    }
                    break;
                case 10 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:138:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement600);
                    callInlineFunction();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_statement602); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:141:1: foreachControl : f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? ;
    public final GraphLangParser.foreachControl_return foreachControl() throws RecognitionException {
        GraphLangParser.foreachControl_return retval = new GraphLangParser.foreachControl_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return f = null;

        GraphLangParser.idLiteral_return s = null;

        GraphLangParser.foreachType_return foreachType9 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:5: (f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:9: f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )?
            {
            pushFollow(FOLLOW_idLiteral_in_foreachControl627);
            f=idLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_foreachControl629); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl633);
            s=idLiteral();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:37: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:38: ';' ( foreachType )?
                    {
                    match(input,12,FOLLOW_12_in_foreachControl636); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:42: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:142:42: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl638);
                            foreachType9=foreachType();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            		        if(!names.checkForeachControl(((programm_scope)programm_stack.peek()).curBlock+"."+(f!=null?input.toString(f.start,f.stop):null), ((programm_scope)programm_stack.peek()).curBlock+"."+(s!=null?input.toString(s.start,s.stop):null),(foreachType9!=null?input.toString(foreachType9.start,foreachType9.stop):null), (s!=null?s.curLine:0))){
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:150:1: foreachType : ( 'output' | 'input' );
    public final GraphLangParser.foreachType_return foreachType() throws RecognitionException {
        GraphLangParser.foreachType_return retval = new GraphLangParser.foreachType_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:151:5: ( 'output' | 'input' )
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:155:1: forControl : ( forInit )? ';' forLiteral ';' forLiteral ;
    public final GraphLangParser.forControl_return forControl() throws RecognitionException {
        GraphLangParser.forControl_return retval = new GraphLangParser.forControl_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:156:5: ( ( forInit )? ';' forLiteral ';' forLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:156:9: ( forInit )? ';' forLiteral ';' forLiteral
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:156:9: ( forInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:156:9: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forControl695);
                    forInit();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_forControl698); 
            pushFollow(FOLLOW_forLiteral_in_forControl700);
            forLiteral();

            state._fsp--;

            match(input,12,FOLLOW_12_in_forControl702); 
            pushFollow(FOLLOW_forLiteral_in_forControl704);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:160:1: forLiteral : ( intLiteral | idLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.forLiteral_return forLiteral() throws RecognitionException {
        GraphLangParser.forLiteral_return retval = new GraphLangParser.forLiteral_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral10 = null;

        GraphLangParser.callClassMethod_return callClassMethod11 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction12 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:5: ( intLiteral | idLiteral | callClassMethod | callInlineFunction )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:161:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forLiteral728);
                    intLiteral();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:162:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forLiteral739);
                    idLiteral10=idLiteral();

                    state._fsp--;

                    if(!(idLiteral10!=null?idLiteral10.idType:null).equals("Int")){errors.add("line "+(idLiteral10!=null?idLiteral10.curLine:0)+": for  variable must have type int ");}

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:163:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_forLiteral751);
                    callClassMethod11=callClassMethod();

                    state._fsp--;

                    if(!(callClassMethod11!=null?callClassMethod11.methodType:null).equals("Int")){errors.add("line "+(callClassMethod11!=null?callClassMethod11.curLine:0)+": for variable must have type int ");}

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:164:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_forLiteral763);
                    callInlineFunction12=callInlineFunction();

                    state._fsp--;

                    if(!(callInlineFunction12!=null?callInlineFunction12.functionType:null).equals("Int")){errors.add("line "+(callInlineFunction12!=null?callInlineFunction12.curLine:0)+": for variable must have type int ");}

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:168:1: forInit : idLiteral ;
    public final GraphLangParser.forInit_return forInit() throws RecognitionException {
        GraphLangParser.forInit_return retval = new GraphLangParser.forInit_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral13 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:5: ( idLiteral )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:9: idLiteral
            {
            pushFollow(FOLLOW_idLiteral_in_forInit785);
            idLiteral13=idLiteral();

            state._fsp--;


                    if(!(idLiteral13!=null?idLiteral13.idType:null).equals("Int")){
                      errors.add("line "+(idLiteral13!=null?idLiteral13.curLine:0)+": for init variable must have type int ");
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:177:1: callInlineFunction returns [String functionType, int curLine] : ID '(' ( argumentList )? ')' ;
    public final GraphLangParser.callInlineFunction_return callInlineFunction() throws RecognitionException {
        GraphLangParser.callInlineFunction_return retval = new GraphLangParser.callInlineFunction_return();
        retval.start = input.LT(1);

        Token ID14=null;
        GraphLangParser.argumentList_return argumentList15 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:5: ( ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:8: ID '(' ( argumentList )? ')'
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_callInlineFunction814); 
            match(input,13,FOLLOW_13_in_callInlineFunction816); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:15: ( argumentList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=FLOAT && LA17_0<=STRING)||(LA17_0>=43 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction818);
                    argumentList15=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callInlineFunction821); 

                      retval.functionType = "?";
                      ArrayList list = null;
                      retval.curLine = (ID14!=null?ID14.getLine():0);
                      if((argumentList15!=null?argumentList15.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList15!=null?argumentList15.argumentTypeList:null);
                      if(!names.checkCallFunction(((programm_scope)programm_stack.peek()).curBlock, (ID14!=null?ID14.getText():null), list, (ID14!=null?ID14.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      else{
                          retval.functionType = names.getFunction((ID14!=null?ID14.getText():null)).getReturnType();
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:196:1: callClassMethod returns [String methodType, int curLine] : varId= ID '.' mName= ID '(' ( argumentList )? ')' ;
    public final GraphLangParser.callClassMethod_return callClassMethod() throws RecognitionException {
        callClassMethod_stack.push(new callClassMethod_scope());
        GraphLangParser.callClassMethod_return retval = new GraphLangParser.callClassMethod_return();
        retval.start = input.LT(1);

        Token varId=null;
        Token mName=null;
        GraphLangParser.argumentList_return argumentList16 = null;



          ((callClassMethod_scope)callClassMethod_stack.peek()).variableId ="";
          ((callClassMethod_scope)callClassMethod_stack.peek()).methodName ="";
          //((callClassMethod_scope)callClassMethod_stack.peek()).argumentTypeList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:207:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:207:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod860); 
            match(input,28,FOLLOW_28_in_callClassMethod862); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null); 
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod877); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            match(input,13,FOLLOW_13_in_callClassMethod891); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:209:13: ( argumentList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||(LA18_0>=FLOAT && LA18_0<=STRING)||(LA18_0>=43 && LA18_0<=44)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:209:13: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callClassMethod893);
                    argumentList16=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_callClassMethod896); 

                      retval.methodType ="?";
                      retval.curLine = (varId!=null?varId.getLine():0);
                      ArrayList list = null;
                      if((argumentList16!=null?argumentList16.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList16!=null?argumentList16.argumentTypeList:null);
                      if(!names.checkCallClassMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null), (argumentList16!=null?argumentList16.argumentTypeList:null), (varId!=null?varId.getLine():0))){
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:225:1: assignmentOperation : ID assignmentOperator mathExpression ;
    public final GraphLangParser.assignmentOperation_return assignmentOperation() throws RecognitionException {
        assignmentOperation_stack.push(new assignmentOperation_scope());
        GraphLangParser.assignmentOperation_return retval = new GraphLangParser.assignmentOperation_return();
        retval.start = input.LT(1);

        Token ID17=null;
        GraphLangParser.assignmentOperator_return assignmentOperator18 = null;

        GraphLangParser.mathExpression_return mathExpression19 = null;



            ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = "none";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:232:5: ( ID assignmentOperator mathExpression )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:232:8: ID assignmentOperator mathExpression
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_assignmentOperation932); 

                      if(names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID17!=null?ID17.getText():null))){
                        ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID17!=null?ID17.getText():null)).getType();
                      }
                      else{
                        errors.add("line "+(ID17!=null?ID17.getLine():0)+": unknown variable "+(ID17!=null?ID17.getText():null));
                      }
                   
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation952);
            assignmentOperator18=assignmentOperator();

            state._fsp--;

            pushFollow(FOLLOW_mathExpression_in_assignmentOperation962);
            mathExpression19=mathExpression();

            state._fsp--;


                      if(!typeCheker.checkAssignOperation((assignmentOperator18!=null?input.toString(assignmentOperator18.start,assignmentOperator18.stop):null),  ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType, (mathExpression19!=null?mathExpression19.mathExpressionType:null), (ID17!=null?ID17.getLine():0))){
                          typeCheker.getAllErrors(errors);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:250:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' ;
    public final GraphLangParser.setGraphOperation_return setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        GraphLangParser.setGraphOperation_return retval = new GraphLangParser.setGraphOperation_return();
        retval.start = input.LT(1);

        Token ID20=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:261:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:261:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
            ID20=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation996); 
            match(input,29,FOLLOW_29_in_setGraphOperation998); 
            match(input,13,FOLLOW_13_in_setGraphOperation1000); 
            match(input,15,FOLLOW_15_in_setGraphOperation1003); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation1005);
            variableList();

            state._fsp--;

            match(input,16,FOLLOW_16_in_setGraphOperation1007); 
            match(input,18,FOLLOW_18_in_setGraphOperation1009); 
            match(input,15,FOLLOW_15_in_setGraphOperation1011); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:261:49: ( setArcExpressions )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:261:49: setArcExpressions
                    {
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation1013);
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_setGraphOperation1016); 
            match(input,14,FOLLOW_14_in_setGraphOperation1019); 

                        names.checkSetGraphOperator((ID20!=null?ID20.getText():null),((programm_scope)programm_stack.peek()).curBlock,((setGraphOperation_scope)setGraphOperation_stack.peek()).varList,((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList,((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList,(ID20!=null?ID20.getLine():0));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:268:1: variableList : a= ID ( ',' b= ID )* ;
    public final GraphLangParser.variableList_return variableList() throws RecognitionException {
        GraphLangParser.variableList_return retval = new GraphLangParser.variableList_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:269:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:269:8: a= ID ( ',' b= ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList1049); 
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:269:58: ( ',' b= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:269:59: ',' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_variableList1054); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList1058); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:273:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final GraphLangParser.setArcExpressions_return setArcExpressions() throws RecognitionException {
        GraphLangParser.setArcExpressions_return retval = new GraphLangParser.setArcExpressions_return();
        retval.start = input.LT(1);

        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:274:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:274:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1086); 
            match(input,30,FOLLOW_30_in_setArcExpressions1088); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1092); 

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:279:8: ( ',' a= ID '->' b= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:279:9: ',' a= ID '->' b= ID
            	    {
            	    match(input,18,FOLLOW_18_in_setArcExpressions1115); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1119); 
            	    match(input,30,FOLLOW_30_in_setArcExpressions1121); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1125); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:284:1: variableDeclarationStatement returns [String tVariableType,ArrayList<String> tVariableList] : variableDeclaration -> {$variableDeclaration.st};
    public final GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement() throws RecognitionException {
        GraphLangParser.variableDeclarationStatement_return retval = new GraphLangParser.variableDeclarationStatement_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclaration_return variableDeclaration21 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:285:4: ( variableDeclaration -> {$variableDeclaration.st})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:285:6: variableDeclaration
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1152);
            variableDeclaration21=variableDeclaration();

            state._fsp--;



            // TEMPLATE REWRITE
            // 285:26: -> {$variableDeclaration.st}
            {
                retval.st = (variableDeclaration21!=null?variableDeclaration21.st:null);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:290:1: variableDeclaration returns [String tVariableType,ArrayList<String> tVariableList] : TYPE variableDeclarators -> MyVariableDeclarators(type=$TYPE.textlist=$variableDeclarators.tVariableList);
    public final GraphLangParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        GraphLangParser.variableDeclaration_return retval = new GraphLangParser.variableDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE22=null;
        GraphLangParser.variableDeclarators_return variableDeclarators23 = null;



          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:297:5: ( TYPE variableDeclarators -> MyVariableDeclarators(type=$TYPE.textlist=$variableDeclarators.tVariableList))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:297:9: TYPE variableDeclarators
            {
            TYPE22=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1198); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE22!=null?TYPE22.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1202);
            variableDeclarators23=variableDeclarators();

            state._fsp--;



            // TEMPLATE REWRITE
            // 298:9: -> MyVariableDeclarators(type=$TYPE.textlist=$variableDeclarators.tVariableList)
            {
                retval.st = templateLib.getInstanceOf("MyVariableDeclarators",
              new STAttrMap().put("type", (TYPE22!=null?TYPE22.getText():null)).put("list", (variableDeclarators23!=null?variableDeclarators23.tVariableList:null)));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:304:1: variableDeclarators returns [ArrayList<String> tVariableList] : a= variableDeclarator ( ',' b= variableDeclarator )* ;
    public final GraphLangParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
        GraphLangParser.variableDeclarators_return retval = new GraphLangParser.variableDeclarators_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarator_return a = null;

        GraphLangParser.variableDeclarator_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:305:5: (a= variableDeclarator ( ',' b= variableDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:306:7: a= variableDeclarator ( ',' b= variableDeclarator )*
            {
            retval.tVariableList = new ArrayList<String>();
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1289);
            a=variableDeclarator();

            state._fsp--;

            retval.tVariableList.add((a!=null?a.tVariableId:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:308:7: ( ',' b= variableDeclarator )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:308:8: ',' b= variableDeclarator
            	    {
            	    match(input,18,FOLLOW_18_in_variableDeclarators1300); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1304);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:311:1: variableDeclarator returns [String tVariableId] : ID ;
    public final GraphLangParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        GraphLangParser.variableDeclarator_return retval = new GraphLangParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Token ID24=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:318:5: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:318:9: ID
            {
            ID24=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1339); 

                    if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID24!=null?ID24.getText():null)) ){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID24!=null?ID24.getText():null), ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType, (ID24!=null?ID24.getLine():0)));
                      ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList.add(((programm_scope)programm_stack.peek()).curBlock+"."+(ID24!=null?ID24.getText():null));
            	      }
            	      else{
            	          errors.add("line "+(ID24!=null?ID24.getLine():0)+": duplicated variable name "+(ID24!=null?ID24.getText():null));
            	      }
            	      retval.tVariableId = (ID24!=null?ID24.getText():null);
                

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:331:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' ;
    public final GraphLangParser.setArcOperation_return setArcOperation() throws RecognitionException {
        GraphLangParser.setArcOperation_return retval = new GraphLangParser.setArcOperation_return();
        retval.start = input.LT(1);

        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:332:5: (id= ID '=' '(' from= ID '->' to= ID ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:332:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1366); 
            match(input,29,FOLLOW_29_in_setArcOperation1368); 
            match(input,13,FOLLOW_13_in_setArcOperation1370); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1374); 
            match(input,30,FOLLOW_30_in_setArcOperation1376); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1380); 
            match(input,14,FOLLOW_14_in_setArcOperation1381); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:341:1: mathTerm returns [String mathTermType] : ( literal | '(' mathExpression ')' );
    public final GraphLangParser.mathTerm_return mathTerm() throws RecognitionException {
        GraphLangParser.mathTerm_return retval = new GraphLangParser.mathTerm_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return literal25 = null;

        GraphLangParser.mathExpression_return mathExpression26 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:342:5: ( literal | '(' mathExpression ')' )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:342:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_mathTerm1412);
                    literal25=literal();

                    state._fsp--;

                    retval.mathTermType = (literal25!=null?literal25.literalType:null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:343:8: '(' mathExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_mathTerm1423); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1425);
                    mathExpression26=mathExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_mathTerm1427); 
                    retval.mathTermType = (mathExpression26!=null?mathExpression26.mathExpressionType:null);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:346:1: unaryExpression returns [String unaryExpressionType] : ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm );
    public final GraphLangParser.unaryExpression_return unaryExpression() throws RecognitionException {
        GraphLangParser.unaryExpression_return retval = new GraphLangParser.unaryExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;

        GraphLangParser.mathTerm_return mathTerm27 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:5: ( '+' a= unaryExpression | '-' b= unaryExpression | mathTerm )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:347:8: '+' a= unaryExpression
                    {
                    match(input,31,FOLLOW_31_in_unaryExpression1451); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1455);
                    a=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (a!=null?a.unaryExpressionType:null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:348:8: '-' b= unaryExpression
                    {
                    match(input,32,FOLLOW_32_in_unaryExpression1466); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1470);
                    b=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (b!=null?b.unaryExpressionType:null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:349:8: mathTerm
                    {
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression1481);
                    mathTerm27=mathTerm();

                    state._fsp--;

                    retval.unaryExpressionType = (mathTerm27!=null?mathTerm27.mathTermType:null);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:352:1: multiplicativeExpression returns [String multiplicativeExpressionType] : a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* ;
    public final GraphLangParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        GraphLangParser.multiplicativeExpression_return retval = new GraphLangParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:353:5: (a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:353:7: a= unaryExpression ( ( '*' | '/' ) b= unaryExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1516);
            a=unaryExpression();

            state._fsp--;

            type.add((a!=null?a.unaryExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:61: ( ( '*' | '/' ) b= unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:354:62: ( '*' | '/' ) b= unaryExpression
            	    {
            	    if ( (input.LA(1)>=33 && input.LA(1)<=34) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1529);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:361:1: mathExpression returns [String mathExpressionType] : a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* ;
    public final GraphLangParser.mathExpression_return mathExpression() throws RecognitionException {
        GraphLangParser.mathExpression_return retval = new GraphLangParser.mathExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.multiplicativeExpression_return a = null;

        GraphLangParser.multiplicativeExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:362:5: (a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:362:9: a= multiplicativeExpression ( ( '-' | '+' ) b= multiplicativeExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1586);
            a=multiplicativeExpression();

            state._fsp--;

            type.add((a!=null?a.multiplicativeExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:363:82: ( ( '-' | '+' ) b= multiplicativeExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=31 && LA26_0<=32)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:363:83: ( '-' | '+' ) b= multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression1600);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:369:1: logicalExpression : relationExpression ( ( '&&' | '||' ) relationExpression )* ;
    public final GraphLangParser.logicalExpression_return logicalExpression() throws RecognitionException {
        GraphLangParser.logicalExpression_return retval = new GraphLangParser.logicalExpression_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:370:4: ( relationExpression ( ( '&&' | '||' ) relationExpression )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:370:7: relationExpression ( ( '&&' | '||' ) relationExpression )*
            {
            pushFollow(FOLLOW_relationExpression_in_logicalExpression1634);
            relationExpression();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:370:26: ( ( '&&' | '||' ) relationExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=35 && LA27_0<=36)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:370:27: ( '&&' | '||' ) relationExpression
            	    {
            	    if ( (input.LA(1)>=35 && input.LA(1)<=36) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression1643);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:374:1: relationExpression : ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) ;
    public final GraphLangParser.relationExpression_return relationExpression() throws RecognitionException {
        GraphLangParser.relationExpression_return retval = new GraphLangParser.relationExpression_return();
        retval.start = input.LT(1);

        Token RELATIONALOP28=null;
        GraphLangParser.logicalAtom_return t1 = null;

        GraphLangParser.logicalAtom_return t2 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:375:5: ( ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom ) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:375:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:375:8: ( '(' logicalExpression ')' | t1= logicalAtom RELATIONALOP t2= logicalAtom )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:375:9: '(' logicalExpression ')'
                    {
                    match(input,13,FOLLOW_13_in_relationExpression1664); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression1666);
                    logicalExpression();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_relationExpression1668); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:376:8: t1= logicalAtom RELATIONALOP t2= logicalAtom
                    {
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1679);
                    t1=logicalAtom();

                    state._fsp--;

                    RELATIONALOP28=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_relationExpression1682); 
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression1686);
                    t2=logicalAtom();

                    state._fsp--;


                              if(!(t1!=null?t1.atomType:null).equals((t2!=null?t2.atomType:null))){
                                if((t1!=null?t1.atomType:null).equals("null")){
                                  if(!(t2!=null?t2.atomType:null).equals("OArc") && !(t2!=null?t2.atomType:null).equals("Graph") && !(t2!=null?t2.atomType:null).equals("Node") && !(t2!=null?t2.atomType:null).equals("Text")){
                                      errors.add("line "+(RELATIONALOP28!=null?RELATIONALOP28.getLine():0)+": the operator "+(RELATIONALOP28!=null?RELATIONALOP28.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else if((t2!=null?t2.atomType:null).equals("null")){
                                  if(!(t1!=null?t1.atomType:null).equals("OArc") && !(t1!=null?t1.atomType:null).equals("Graph") && !(t1!=null?t1.atomType:null).equals("Node") && !(t1!=null?t1.atomType:null).equals("Text")){
                                      errors.add("line "+(RELATIONALOP28!=null?RELATIONALOP28.getLine():0)+": the operator "+(RELATIONALOP28!=null?RELATIONALOP28.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else {
                                  errors.add("line "+(RELATIONALOP28!=null?RELATIONALOP28.getLine():0)+": the operator "+(RELATIONALOP28!=null?RELATIONALOP28.getText():null) +" is undefined for arguments "+(t1!=null?t1.atomType:null)+","+(t2!=null?t2.atomType:null));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:398:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );
    public final GraphLangParser.logicalAtom_return logicalAtom() throws RecognitionException {
        GraphLangParser.logicalAtom_return retval = new GraphLangParser.logicalAtom_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral29 = null;

        GraphLangParser.callClassMethod_return callClassMethod30 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction31 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:399:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:399:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom1724);
                    intLiteral();

                    state._fsp--;

                    retval.atomType = "Int"; 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:400:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom1736);
                    floatLiteral();

                    state._fsp--;

                    retval.atomType = "Float"; 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:401:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom1748);
                    idLiteral29=idLiteral();

                    state._fsp--;

                    retval.atomType = (idLiteral29!=null?idLiteral29.idType:null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:402:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom1760);
                    stringLiteral();

                    state._fsp--;

                    retval.atomType = "Text"; 

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:403:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_logicalAtom1772);
                    booleanLiteral();

                    state._fsp--;

                    retval.atomType = "Bool"; 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:404:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom1784);
                    callClassMethod30=callClassMethod();

                    state._fsp--;

                    retval.atomType = (callClassMethod30!=null?callClassMethod30.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:405:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom1796);
                    callInlineFunction31=callInlineFunction();

                    state._fsp--;

                    retval.atomType = (callInlineFunction31!=null?callInlineFunction31.functionType:null);

                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:406:9: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom1808);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:409:1: nullLiteral : 'null' ;
    public final GraphLangParser.nullLiteral_return nullLiteral() throws RecognitionException {
        GraphLangParser.nullLiteral_return retval = new GraphLangParser.nullLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:410:5: ( 'null' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:410:7: 'null'
            {
            match(input,37,FOLLOW_37_in_nullLiteral1827); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:422:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
    public final GraphLangParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        GraphLangParser.assignmentOperator_return retval = new GraphLangParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:423:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:442:1: literal returns [String literalType, String literalValue] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction );
    public final GraphLangParser.literal_return literal() throws RecognitionException {
        GraphLangParser.literal_return retval = new GraphLangParser.literal_return();
        retval.start = input.LT(1);

        GraphLangParser.intLiteral_return intLiteral32 = null;

        GraphLangParser.floatLiteral_return floatLiteral33 = null;

        GraphLangParser.idLiteral_return idLiteral34 = null;

        GraphLangParser.stringLiteral_return stringLiteral35 = null;

        GraphLangParser.booleanLiteral_return booleanLiteral36 = null;

        GraphLangParser.callClassMethod_return callClassMethod37 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction38 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:443:5: ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:443:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_literal2049);
                    intLiteral32=intLiteral();

                    state._fsp--;

                    retval.literalType = "Int"; retval.literalValue =(intLiteral32!=null?input.toString(intLiteral32.start,intLiteral32.stop):null);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:444:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_literal2061);
                    floatLiteral33=floatLiteral();

                    state._fsp--;

                    retval.literalType = "Float"; retval.literalValue =(floatLiteral33!=null?input.toString(floatLiteral33.start,floatLiteral33.stop):null);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:445:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_literal2073);
                    idLiteral34=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral34!=null?idLiteral34.idType:null); retval.literalValue =(idLiteral34!=null?input.toString(idLiteral34.start,idLiteral34.stop):null);

                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:446:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal2085);
                    stringLiteral35=stringLiteral();

                    state._fsp--;

                    retval.literalType = "Text"; retval.literalValue =(stringLiteral35!=null?input.toString(stringLiteral35.start,stringLiteral35.stop):null);

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:447:9: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal2097);
                    booleanLiteral36=booleanLiteral();

                    state._fsp--;

                    retval.literalType = "Bool"; retval.literalValue =(booleanLiteral36!=null?input.toString(booleanLiteral36.start,booleanLiteral36.stop):null); 

                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:448:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_literal2109);
                    callClassMethod37=callClassMethod();

                    state._fsp--;

                    retval.literalType = (callClassMethod37!=null?callClassMethod37.methodType:null);

                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_literal2121);
                    callInlineFunction38=callInlineFunction();

                    state._fsp--;

                    retval.literalType = (callInlineFunction38!=null?callInlineFunction38.functionType:null);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:452:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* ;
    public final GraphLangParser.argumentList_return argumentList() throws RecognitionException {
        GraphLangParser.argumentList_return retval = new GraphLangParser.argumentList_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:453:3: (a= literal ( ',' b= literal )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:453:6: a= literal ( ',' b= literal )*
            {

                    retval.argumentTypeList = new ArrayList<String>();
                 
            pushFollow(FOLLOW_literal_in_argumentList2150);
            a=literal();

            state._fsp--;

            retval.argumentTypeList.add((a!=null?a.literalType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:457:3: ( ',' b= literal )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:457:4: ',' b= literal
            	    {
            	    match(input,18,FOLLOW_18_in_argumentList2159); 
            	    pushFollow(FOLLOW_literal_in_argumentList2163);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:460:1: floatLiteral : FLOAT ;
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:3: ( FLOAT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:461:5: FLOAT
            {
            match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral2181); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:464:1: idLiteral returns [String idType, int curLine] : ID ;
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID39=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:3: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:5: ID
            {
            ID39=(Token)match(input,ID,FOLLOW_ID_in_idLiteral2199); 

                  retval.curLine = (ID39!=null?ID39.getLine():0);
                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID39!=null?ID39.getText():null))){
                    errors.add("line "+(ID39!=null?ID39.getLine():0)+": unknown variable "+(ID39!=null?ID39.getText():null));
                    retval.idType = "";
                  }
                  else{
                    names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID39!=null?ID39.getText():null)).addLineUses((ID39!=null?ID39.getLine():0));
                    retval.idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID39!=null?ID39.getText():null)).getType();
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:479:1: intLiteral : INT ;
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:480:3: ( INT )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:480:5: INT
            {
            match(input,INT,FOLLOW_INT_in_intLiteral2220); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:483:1: stringLiteral : STRING ;
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:484:3: ( STRING )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:484:6: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2235); 

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:487:1: booleanLiteral : ( 'true' | 'false' );
    public final GraphLangParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        GraphLangParser.booleanLiteral_return retval = new GraphLangParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:488:5: ( 'true' | 'false' )
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
            return "128:1: statement : ( 'if' '(' logicalExpression ')' block ( 'else' block )? | 'for' '(' forControl ')' block | 'foreach' '(' foreachControl ')' block | 'while' '(' logicalExpression ')' block | 'do' block 'while' '(' logicalExpression ')' ';' | assignmentOperation ';' | setArcOperation ';' | setGraphOperation ';' | callClassMethod ';' | callInlineFunction ';' );";
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
            return "398:1: logicalAtom returns [String atomType] : ( intLiteral | floatLiteral | idLiteral | stringLiteral | booleanLiteral | callClassMethod | callInlineFunction | nullLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_globalExpression_in_programm68 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_mainBlock_in_programm73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalExpression97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_globalExpression115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration147 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_globalVariableDeclaration149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration196 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_functionDeclaration209 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_functionArgumentList_in_functionDeclaration211 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDeclaration214 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration238 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_blockStatement_in_functionDeclaration240 = new BitSet(new long[]{0x0000000003D30030L});
    public static final BitSet FOLLOW_returnOperator_in_functionDeclaration244 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_returnOperator276 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ID_in_returnOperator278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_returnOperator281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList311 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_functionArgumentList314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList316 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_TYPE_in_functionArgumentDeclarator336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionArgumentDeclarator338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_mainBlock361 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_mainBlock363 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_blockStatement_in_mainBlock365 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_mainBlock368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_blockStatement387 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_blockStatement389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_block425 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_statement_in_block427 = new BitSet(new long[]{0x0000000003D10030L});
    public static final BitSet FOLLOW_16_in_block430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_statement449 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement451 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement453 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement455 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement457 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_statement460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_statement474 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement476 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_forControl_in_statement478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement480 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement492 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_foreachControl_in_statement496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement498 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement510 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement512 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement514 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement516 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement528 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_block_in_statement531 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement533 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement535 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement537 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement539 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement552 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement564 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement576 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl627 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_foreachControl629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl633 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_foreachControl636 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl695 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl698 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl700 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forControl702 = new BitSet(new long[]{0x0000000003D00130L});
    public static final BitSet FOLLOW_forLiteral_in_forControl704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forLiteral728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forLiteral739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_forLiteral751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_forLiteral763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callInlineFunction816 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction818 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callInlineFunction821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod860 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_callClassMethod862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod877 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_callClassMethod891 = new BitSet(new long[]{0x0000180003D043B0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod893 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callClassMethod896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation932 = new BitSet(new long[]{0x000007C020000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation952 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation996 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setGraphOperation998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setGraphOperation1000 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation1003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation1005 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1007 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_setGraphOperation1009 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation1011 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation1013 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1016 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList1049 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableList1054 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList1058 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1086 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1092 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_setArcExpressions1115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1119 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcExpressions1121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1125 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1289 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variableDeclarators1300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1304 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1366 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_setArcOperation1368 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_setArcOperation1370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1374 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_setArcOperation1376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setArcOperation1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_mathTerm1423 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1425 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_mathTerm1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unaryExpression1451 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unaryExpression1466 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1516 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1521 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1529 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1586 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_mathExpression1592 = new BitSet(new long[]{0x0000180183D023B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression1600 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1634 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_logicalExpression1637 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression1643 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_13_in_relationExpression1664 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression1666 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_relationExpression1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1679 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_relationExpression1682 = new BitSet(new long[]{0x0000182003D023B0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_logicalAtom1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nullLiteral1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList2150 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_argumentList2159 = new BitSet(new long[]{0x0000180003D003B0L});
    public static final BitSet FOLLOW_literal_in_argumentList2163 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});

}