package org.mofgen.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mofgen.services.MGLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ASSIGNMENT_OP", "RULE_NEWLINE", "RULE_TRUE", "RULE_FALSE", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'config'", "'('", "')'", "'{'", "'}'", "'test'", "'pattern'", "','", "'return'", "'this'", "'.'", "'->'", "'gen'", "'for'", "'in'", "'-'", "'switch'", "'case'", "':'", "'default'", "'when'", "'List'", "'['", "']'", "'Map'", "'!'", "'sqrt'", "'abs'", "'int'", "'char'", "'double'", "'String'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'+'", "'||'", "'%'", "'^'", "'*'", "'/'", "'&&'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FALSE=9;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=4;
    public static final int RULE_ASSIGNMENT_OP=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=10;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_TRUE=8;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMGLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMGLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMGLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMGLang.g"; }



     	private MGLangGrammarAccess grammarAccess;

        public InternalMGLangParser(TokenStream input, MGLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MofgenFile";
       	}

       	@Override
       	protected MGLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMofgenFile"
    // InternalMGLang.g:65:1: entryRuleMofgenFile returns [EObject current=null] : iv_ruleMofgenFile= ruleMofgenFile EOF ;
    public final EObject entryRuleMofgenFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMofgenFile = null;


        try {
            // InternalMGLang.g:65:51: (iv_ruleMofgenFile= ruleMofgenFile EOF )
            // InternalMGLang.g:66:2: iv_ruleMofgenFile= ruleMofgenFile EOF
            {
             newCompositeNode(grammarAccess.getMofgenFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMofgenFile=ruleMofgenFile();

            state._fsp--;

             current =iv_ruleMofgenFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMofgenFile"


    // $ANTLR start "ruleMofgenFile"
    // InternalMGLang.g:72:1: ruleMofgenFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_config_1_0= ruleConfig ) ) ( ( (lv_patterns_2_0= rulePattern ) ) | ( (lv_generators_3_0= ruleGenerator ) ) )* ) ;
    public final EObject ruleMofgenFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_config_1_0 = null;

        EObject lv_patterns_2_0 = null;

        EObject lv_generators_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_config_1_0= ruleConfig ) ) ( ( (lv_patterns_2_0= rulePattern ) ) | ( (lv_generators_3_0= ruleGenerator ) ) )* ) )
            // InternalMGLang.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_config_1_0= ruleConfig ) ) ( ( (lv_patterns_2_0= rulePattern ) ) | ( (lv_generators_3_0= ruleGenerator ) ) )* )
            {
            // InternalMGLang.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_config_1_0= ruleConfig ) ) ( ( (lv_patterns_2_0= rulePattern ) ) | ( (lv_generators_3_0= ruleGenerator ) ) )* )
            // InternalMGLang.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_config_1_0= ruleConfig ) ) ( ( (lv_patterns_2_0= rulePattern ) ) | ( (lv_generators_3_0= ruleGenerator ) ) )*
            {
            // InternalMGLang.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMGLang.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalMGLang.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalMGLang.g:82:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.mofgen.MGLang.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMGLang.g:99:3: ( (lv_config_1_0= ruleConfig ) )
            // InternalMGLang.g:100:4: (lv_config_1_0= ruleConfig )
            {
            // InternalMGLang.g:100:4: (lv_config_1_0= ruleConfig )
            // InternalMGLang.g:101:5: lv_config_1_0= ruleConfig
            {

            					newCompositeNode(grammarAccess.getMofgenFileAccess().getConfigConfigParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_config_1_0=ruleConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_1_0,
            						"org.mofgen.MGLang.Config");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:118:3: ( ( (lv_patterns_2_0= rulePattern ) ) | ( (lv_generators_3_0= ruleGenerator ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }
                else if ( (LA2_0==30) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMGLang.g:119:4: ( (lv_patterns_2_0= rulePattern ) )
            	    {
            	    // InternalMGLang.g:119:4: ( (lv_patterns_2_0= rulePattern ) )
            	    // InternalMGLang.g:120:5: (lv_patterns_2_0= rulePattern )
            	    {
            	    // InternalMGLang.g:120:5: (lv_patterns_2_0= rulePattern )
            	    // InternalMGLang.g:121:6: lv_patterns_2_0= rulePattern
            	    {

            	    						newCompositeNode(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_patterns_2_0=rulePattern();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"patterns",
            	    							lv_patterns_2_0,
            	    							"org.mofgen.MGLang.Pattern");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMGLang.g:139:4: ( (lv_generators_3_0= ruleGenerator ) )
            	    {
            	    // InternalMGLang.g:139:4: ( (lv_generators_3_0= ruleGenerator ) )
            	    // InternalMGLang.g:140:5: (lv_generators_3_0= ruleGenerator )
            	    {
            	    // InternalMGLang.g:140:5: (lv_generators_3_0= ruleGenerator )
            	    // InternalMGLang.g:141:6: lv_generators_3_0= ruleGenerator
            	    {

            	    						newCompositeNode(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_generators_3_0=ruleGenerator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generators",
            	    							lv_generators_3_0,
            	    							"org.mofgen.MGLang.Generator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMofgenFile"


    // $ANTLR start "entryRuleImport"
    // InternalMGLang.g:163:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMGLang.g:163:47: (iv_ruleImport= ruleImport EOF )
            // InternalMGLang.g:164:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMGLang.g:170:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:176:2: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) )
            // InternalMGLang.g:177:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:177:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
            // InternalMGLang.g:178:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMGLang.g:182:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMGLang.g:183:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMGLang.g:183:4: (lv_name_1_0= RULE_STRING )
            // InternalMGLang.g:184:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
            		
            // InternalMGLang.g:204:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalMGLang.g:205:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalMGLang.g:205:4: (lv_alias_3_0= RULE_ID )
            // InternalMGLang.g:206:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_alias_3_0, grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alias",
            						lv_alias_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleConfig"
    // InternalMGLang.g:226:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalMGLang.g:226:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalMGLang.g:227:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalMGLang.g:233:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= 'config' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_expressions_5_0= ruleConfigExpression ) )* otherlv_6= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_expressions_5_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:239:2: ( ( () otherlv_1= 'config' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_expressions_5_0= ruleConfigExpression ) )* otherlv_6= '}' ) )
            // InternalMGLang.g:240:2: ( () otherlv_1= 'config' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_expressions_5_0= ruleConfigExpression ) )* otherlv_6= '}' )
            {
            // InternalMGLang.g:240:2: ( () otherlv_1= 'config' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_expressions_5_0= ruleConfigExpression ) )* otherlv_6= '}' )
            // InternalMGLang.g:241:3: () otherlv_1= 'config' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_expressions_5_0= ruleConfigExpression ) )* otherlv_6= '}'
            {
            // InternalMGLang.g:241:3: ()
            // InternalMGLang.g:242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMGLang.g:264:3: ( (lv_expressions_5_0= ruleConfigExpression ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMGLang.g:265:4: (lv_expressions_5_0= ruleConfigExpression )
            	    {
            	    // InternalMGLang.g:265:4: (lv_expressions_5_0= ruleConfigExpression )
            	    // InternalMGLang.g:266:5: lv_expressions_5_0= ruleConfigExpression
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getExpressionsConfigExpressionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_expressions_5_0=ruleConfigExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_5_0,
            	    						"org.mofgen.MGLang.ConfigExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConfigExpression"
    // InternalMGLang.g:291:1: entryRuleConfigExpression returns [String current=null] : iv_ruleConfigExpression= ruleConfigExpression EOF ;
    public final String entryRuleConfigExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConfigExpression = null;


        try {
            // InternalMGLang.g:291:56: (iv_ruleConfigExpression= ruleConfigExpression EOF )
            // InternalMGLang.g:292:2: iv_ruleConfigExpression= ruleConfigExpression EOF
            {
             newCompositeNode(grammarAccess.getConfigExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigExpression=ruleConfigExpression();

            state._fsp--;

             current =iv_ruleConfigExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigExpression"


    // $ANTLR start "ruleConfigExpression"
    // InternalMGLang.g:298:1: ruleConfigExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'test' ;
    public final AntlrDatatypeRuleToken ruleConfigExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMGLang.g:304:2: (kw= 'test' )
            // InternalMGLang.g:305:2: kw= 'test'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConfigExpressionAccess().getTestKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigExpression"


    // $ANTLR start "entryRulePattern"
    // InternalMGLang.g:313:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMGLang.g:313:48: (iv_rulePattern= rulePattern EOF )
            // InternalMGLang.g:314:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMGLang.g:320:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_colls_9_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_paramManipulations_11_0 = null;

        EObject lv_switches_12_0 = null;

        EObject lv_return_14_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:326:2: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? ) )
            // InternalMGLang.g:327:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? )
            {
            // InternalMGLang.g:327:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? )
            // InternalMGLang.g:328:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalMGLang.g:332:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:333:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:333:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:334:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMGLang.g:350:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            // InternalMGLang.g:351:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMGLang.g:355:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=46 && LA5_0<=49)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGLang.g:356:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalMGLang.g:356:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMGLang.g:357:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMGLang.g:357:6: (lv_parameters_3_0= ruleParameter )
                    // InternalMGLang.g:358:7: lv_parameters_3_0= ruleParameter
                    {

                    							newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPatternRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_3_0,
                    								"org.mofgen.MGLang.Parameter");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMGLang.g:375:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==25) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMGLang.g:376:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_14); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0());
                    	    					
                    	    // InternalMGLang.g:380:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMGLang.g:381:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMGLang.g:381:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMGLang.g:382:8: lv_parameters_5_0= ruleParameter
                    	    {

                    	    								newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPatternRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameters",
                    	    									lv_parameters_5_0,
                    	    									"org.mofgen.MGLang.Parameter");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_10); 

            				newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2());
            			

            }

            otherlv_7=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMGLang.g:410:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) )
            // InternalMGLang.g:411:4: ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) )
            {
            // InternalMGLang.g:411:4: ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) )
            // InternalMGLang.g:412:5: ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            				
            // InternalMGLang.g:415:5: ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* )
            // InternalMGLang.g:416:6: ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )*
            {
            // InternalMGLang.g:416:6: ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )*
            loop10:
            do {
                int alt10=5;
                int LA10_0 = input.LA(1);

                if ( ( LA10_0 == 39 || LA10_0 == 42 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                    int LA10_3 = input.LA(2);

                    if ( LA10_3 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                        alt10=3;
                    }
                    else if ( LA10_3 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                        alt10=2;
                    }


                }
                else if ( LA10_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                    alt10=4;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMGLang.g:417:4: ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:417:4: ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) )
            	    // InternalMGLang.g:418:5: {...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalMGLang.g:418:104: ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ )
            	    // InternalMGLang.g:419:6: ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalMGLang.g:422:9: ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==39) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }
            	        else if ( (LA6_0==42) ) {
            	            int LA6_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMGLang.g:422:10: {...}? => ( (lv_colls_9_0= ruleCollection ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:422:19: ( (lv_colls_9_0= ruleCollection ) )
            	    	    // InternalMGLang.g:422:20: (lv_colls_9_0= ruleCollection )
            	    	    {
            	    	    // InternalMGLang.g:422:20: (lv_colls_9_0= ruleCollection )
            	    	    // InternalMGLang.g:423:10: lv_colls_9_0= ruleCollection
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getCollsCollectionParserRuleCall_4_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_colls_9_0=ruleCollection();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"colls",
            	    	    											lv_colls_9_0,
            	    	    											"org.mofgen.MGLang.Collection");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMGLang.g:445:4: ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:445:4: ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) )
            	    // InternalMGLang.g:446:5: {...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalMGLang.g:446:104: ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ )
            	    // InternalMGLang.g:447:6: ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalMGLang.g:450:9: ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMGLang.g:450:10: {...}? => ( (lv_nodes_10_0= ruleNode ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:450:19: ( (lv_nodes_10_0= ruleNode ) )
            	    	    // InternalMGLang.g:450:20: (lv_nodes_10_0= ruleNode )
            	    	    {
            	    	    // InternalMGLang.g:450:20: (lv_nodes_10_0= ruleNode )
            	    	    // InternalMGLang.g:451:10: lv_nodes_10_0= ruleNode
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_nodes_10_0=ruleNode();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"nodes",
            	    	    											lv_nodes_10_0,
            	    	    											"org.mofgen.MGLang.Node");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMGLang.g:473:4: ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:473:4: ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) )
            	    // InternalMGLang.g:474:5: {...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalMGLang.g:474:104: ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ )
            	    // InternalMGLang.g:475:6: ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalMGLang.g:478:9: ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ID) ) {
            	            int LA8_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMGLang.g:478:10: {...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:478:19: ( (lv_paramManipulations_11_0= ruleParamManipulation ) )
            	    	    // InternalMGLang.g:478:20: (lv_paramManipulations_11_0= ruleParamManipulation )
            	    	    {
            	    	    // InternalMGLang.g:478:20: (lv_paramManipulations_11_0= ruleParamManipulation )
            	    	    // InternalMGLang.g:479:10: lv_paramManipulations_11_0= ruleParamManipulation
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getParamManipulationsParamManipulationParserRuleCall_4_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_paramManipulations_11_0=ruleParamManipulation();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"paramManipulations",
            	    	    											lv_paramManipulations_11_0,
            	    	    											"org.mofgen.MGLang.ParamManipulation");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMGLang.g:501:4: ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:501:4: ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) )
            	    // InternalMGLang.g:502:5: {...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalMGLang.g:502:104: ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ )
            	    // InternalMGLang.g:503:6: ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalMGLang.g:506:9: ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==34) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMGLang.g:506:10: {...}? => ( (lv_switches_12_0= ruleSwitch ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:506:19: ( (lv_switches_12_0= ruleSwitch ) )
            	    	    // InternalMGLang.g:506:20: (lv_switches_12_0= ruleSwitch )
            	    	    {
            	    	    // InternalMGLang.g:506:20: (lv_switches_12_0= ruleSwitch )
            	    	    // InternalMGLang.g:507:10: lv_switches_12_0= ruleSwitch
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getSwitchesSwitchParserRuleCall_4_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_switches_12_0=ruleSwitch();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"switches",
            	    	    											lv_switches_12_0,
            	    	    											"org.mofgen.MGLang.Switch");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            				

            }

            otherlv_13=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_13, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMGLang.g:540:3: ( (lv_return_14_0= rulePatternReturn ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:541:4: (lv_return_14_0= rulePatternReturn )
                    {
                    // InternalMGLang.g:541:4: (lv_return_14_0= rulePatternReturn )
                    // InternalMGLang.g:542:5: lv_return_14_0= rulePatternReturn
                    {

                    					newCompositeNode(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_return_14_0=rulePatternReturn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternRule());
                    					}
                    					set(
                    						current,
                    						"return",
                    						lv_return_14_0,
                    						"org.mofgen.MGLang.PatternReturn");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePatternReturn"
    // InternalMGLang.g:563:1: entryRulePatternReturn returns [EObject current=null] : iv_rulePatternReturn= rulePatternReturn EOF ;
    public final EObject entryRulePatternReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternReturn = null;


        try {
            // InternalMGLang.g:563:54: (iv_rulePatternReturn= rulePatternReturn EOF )
            // InternalMGLang.g:564:2: iv_rulePatternReturn= rulePatternReturn EOF
            {
             newCompositeNode(grammarAccess.getPatternReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternReturn=rulePatternReturn();

            state._fsp--;

             current =iv_rulePatternReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternReturn"


    // $ANTLR start "rulePatternReturn"
    // InternalMGLang.g:570:1: rulePatternReturn returns [EObject current=null] : ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject rulePatternReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMGLang.g:576:2: ( ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalMGLang.g:577:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalMGLang.g:577:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalMGLang.g:578:3: () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalMGLang.g:578:3: ()
            // InternalMGLang.g:579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternReturnAccess().getPatternReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternReturnAccess().getReturnKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternReturnAccess().getThisKeyword_2());
            		
            // InternalMGLang.g:593:3: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:594:4: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0());
                    			
                    // InternalMGLang.g:598:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMGLang.g:599:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMGLang.g:599:5: (otherlv_4= RULE_ID )
                    // InternalMGLang.g:600:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatternReturnRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternReturn"


    // $ANTLR start "entryRuleParamManipulation"
    // InternalMGLang.g:616:1: entryRuleParamManipulation returns [EObject current=null] : iv_ruleParamManipulation= ruleParamManipulation EOF ;
    public final EObject entryRuleParamManipulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamManipulation = null;


        try {
            // InternalMGLang.g:616:58: (iv_ruleParamManipulation= ruleParamManipulation EOF )
            // InternalMGLang.g:617:2: iv_ruleParamManipulation= ruleParamManipulation EOF
            {
             newCompositeNode(grammarAccess.getParamManipulationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamManipulation=ruleParamManipulation();

            state._fsp--;

             current =iv_ruleParamManipulation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamManipulation"


    // $ANTLR start "ruleParamManipulation"
    // InternalMGLang.g:623:1: ruleParamManipulation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) ) ;
    public final EObject ruleParamManipulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:629:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) ) )
            // InternalMGLang.g:630:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) )
            {
            // InternalMGLang.g:630:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) )
            // InternalMGLang.g:631:3: ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) )
            {
            // InternalMGLang.g:631:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:632:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:632:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:633:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamManipulationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:644:3: ( (lv_content_1_0= ruleNodeContent ) )
            // InternalMGLang.g:645:4: (lv_content_1_0= ruleNodeContent )
            {
            // InternalMGLang.g:645:4: (lv_content_1_0= ruleNodeContent )
            // InternalMGLang.g:646:5: lv_content_1_0= ruleNodeContent
            {

            					newCompositeNode(grammarAccess.getParamManipulationAccess().getContentNodeContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleNodeContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamManipulationRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.mofgen.MGLang.NodeContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamManipulation"


    // $ANTLR start "entryRuleNode"
    // InternalMGLang.g:667:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMGLang.g:667:45: (iv_ruleNode= ruleNode EOF )
            // InternalMGLang.g:668:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMGLang.g:674:1: ruleNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_3=null;
        EObject lv_createdBy_2_0 = null;

        EObject lv_createdBy_4_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:680:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? ) )
            // InternalMGLang.g:681:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? )
            {
            // InternalMGLang.g:681:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? )
            // InternalMGLang.g:682:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )?
            {
            // InternalMGLang.g:682:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:683:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:683:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:684:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:695:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:696:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:696:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:697:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMGLang.g:713:3: ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ASSIGNMENT_OP) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:714:4: ( (lv_createdBy_2_0= ruleNodeContent ) )
                    {
                    // InternalMGLang.g:714:4: ( (lv_createdBy_2_0= ruleNodeContent ) )
                    // InternalMGLang.g:715:5: (lv_createdBy_2_0= ruleNodeContent )
                    {
                    // InternalMGLang.g:715:5: (lv_createdBy_2_0= ruleNodeContent )
                    // InternalMGLang.g:716:6: lv_createdBy_2_0= ruleNodeContent
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_createdBy_2_0=ruleNodeContent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						set(
                    							current,
                    							"createdBy",
                    							lv_createdBy_2_0,
                    							"org.mofgen.MGLang.NodeContent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:734:4: (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) )
                    {
                    // InternalMGLang.g:734:4: (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) )
                    // InternalMGLang.g:735:5: this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) )
                    {
                    this_ASSIGNMENT_OP_3=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_7); 

                    					newLeafNode(this_ASSIGNMENT_OP_3, grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_2_1_0());
                    				
                    // InternalMGLang.g:739:5: ( (lv_createdBy_4_0= rulePatternCall ) )
                    // InternalMGLang.g:740:6: (lv_createdBy_4_0= rulePatternCall )
                    {
                    // InternalMGLang.g:740:6: (lv_createdBy_4_0= rulePatternCall )
                    // InternalMGLang.g:741:7: lv_createdBy_4_0= rulePatternCall
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_createdBy_4_0=rulePatternCall();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							set(
                    								current,
                    								"createdBy",
                    								lv_createdBy_4_0,
                    								"org.mofgen.MGLang.PatternCall");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeContent"
    // InternalMGLang.g:764:1: entryRuleNodeContent returns [EObject current=null] : iv_ruleNodeContent= ruleNodeContent EOF ;
    public final EObject entryRuleNodeContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeContent = null;


        try {
            // InternalMGLang.g:764:52: (iv_ruleNodeContent= ruleNodeContent EOF )
            // InternalMGLang.g:765:2: iv_ruleNodeContent= ruleNodeContent EOF
            {
             newCompositeNode(grammarAccess.getNodeContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeContent=ruleNodeContent();

            state._fsp--;

             current =iv_ruleNodeContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeContent"


    // $ANTLR start "ruleNodeContent"
    // InternalMGLang.g:771:1: ruleNodeContent returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow ) )* otherlv_3= '}' ) ;
    public final EObject ruleNodeContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refsAssigns_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:777:2: ( ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow ) )* otherlv_3= '}' ) )
            // InternalMGLang.g:778:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow ) )* otherlv_3= '}' )
            {
            // InternalMGLang.g:778:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow ) )* otherlv_3= '}' )
            // InternalMGLang.g:779:3: () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow ) )* otherlv_3= '}'
            {
            // InternalMGLang.g:779:3: ()
            // InternalMGLang.g:780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeContentAccess().getNodeContentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMGLang.g:790:3: ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGLang.g:791:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow )
            	    {
            	    // InternalMGLang.g:791:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow )
            	    // InternalMGLang.g:792:5: lv_refsAssigns_2_0= ruleNodeReferenceOrAssignmentOrControlFlow
            	    {

            	    					newCompositeNode(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentOrControlFlowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_refsAssigns_2_0=ruleNodeReferenceOrAssignmentOrControlFlow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeContentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refsAssigns",
            	    						lv_refsAssigns_2_0,
            	    						"org.mofgen.MGLang.NodeReferenceOrAssignmentOrControlFlow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeContent"


    // $ANTLR start "entryRulePatternCall"
    // InternalMGLang.g:817:1: entryRulePatternCall returns [EObject current=null] : iv_rulePatternCall= rulePatternCall EOF ;
    public final EObject entryRulePatternCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternCall = null;


        try {
            // InternalMGLang.g:817:52: (iv_rulePatternCall= rulePatternCall EOF )
            // InternalMGLang.g:818:2: iv_rulePatternCall= rulePatternCall EOF
            {
             newCompositeNode(grammarAccess.getPatternCallRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternCall=rulePatternCall();

            state._fsp--;

             current =iv_rulePatternCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternCall"


    // $ANTLR start "rulePatternCall"
    // InternalMGLang.g:824:1: rulePatternCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleArithmeticExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject rulePatternCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:830:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleArithmeticExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalMGLang.g:831:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleArithmeticExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalMGLang.g:831:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleArithmeticExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )* )? otherlv_5= ')' )
            // InternalMGLang.g:832:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleArithmeticExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalMGLang.g:832:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:833:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:833:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:834:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGLang.g:849:3: ( ( (lv_params_2_0= ruleArithmeticExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=RULE_TRUE && LA16_0<=RULE_DOUBLE)||LA16_0==19||(LA16_0>=43 && LA16_0<=45)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:850:4: ( (lv_params_2_0= ruleArithmeticExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )*
                    {
                    // InternalMGLang.g:850:4: ( (lv_params_2_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:851:5: (lv_params_2_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:851:5: (lv_params_2_0= ruleArithmeticExpression )
                    // InternalMGLang.g:852:6: lv_params_2_0= ruleArithmeticExpression
                    {

                    						newCompositeNode(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_params_2_0=ruleArithmeticExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternCallRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"org.mofgen.MGLang.ArithmeticExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMGLang.g:869:4: (otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==25) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMGLang.g:870:5: otherlv_3= ',' ( (lv_params_4_0= ruleArithmeticExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPatternCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMGLang.g:874:5: ( (lv_params_4_0= ruleArithmeticExpression ) )
                    	    // InternalMGLang.g:875:6: (lv_params_4_0= ruleArithmeticExpression )
                    	    {
                    	    // InternalMGLang.g:875:6: (lv_params_4_0= ruleArithmeticExpression )
                    	    // InternalMGLang.g:876:7: lv_params_4_0= ruleArithmeticExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_params_4_0=ruleArithmeticExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"org.mofgen.MGLang.ArithmeticExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternCall"


    // $ANTLR start "entryRuleNodeReferenceOrAssignmentOrControlFlow"
    // InternalMGLang.g:903:1: entryRuleNodeReferenceOrAssignmentOrControlFlow returns [EObject current=null] : iv_ruleNodeReferenceOrAssignmentOrControlFlow= ruleNodeReferenceOrAssignmentOrControlFlow EOF ;
    public final EObject entryRuleNodeReferenceOrAssignmentOrControlFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReferenceOrAssignmentOrControlFlow = null;


        try {
            // InternalMGLang.g:903:79: (iv_ruleNodeReferenceOrAssignmentOrControlFlow= ruleNodeReferenceOrAssignmentOrControlFlow EOF )
            // InternalMGLang.g:904:2: iv_ruleNodeReferenceOrAssignmentOrControlFlow= ruleNodeReferenceOrAssignmentOrControlFlow EOF
            {
             newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeReferenceOrAssignmentOrControlFlow=ruleNodeReferenceOrAssignmentOrControlFlow();

            state._fsp--;

             current =iv_ruleNodeReferenceOrAssignmentOrControlFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeReferenceOrAssignmentOrControlFlow"


    // $ANTLR start "ruleNodeReferenceOrAssignmentOrControlFlow"
    // InternalMGLang.g:910:1: ruleNodeReferenceOrAssignmentOrControlFlow returns [EObject current=null] : (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment | this_Switch_2= ruleSwitch ) ;
    public final EObject ruleNodeReferenceOrAssignmentOrControlFlow() throws RecognitionException {
        EObject current = null;

        EObject this_PatternNodeReference_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Switch_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:916:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment | this_Switch_2= ruleSwitch ) )
            // InternalMGLang.g:917:2: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment | this_Switch_2= ruleSwitch )
            {
            // InternalMGLang.g:917:2: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment | this_Switch_2= ruleSwitch )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ASSIGNMENT_OP) ) {
                    alt17=2;
                }
                else if ( (LA17_1==29) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==34) ) {
                alt17=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:918:3: this_PatternNodeReference_0= rulePatternNodeReference
                    {

                    			newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getPatternNodeReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternNodeReference_0=rulePatternNodeReference();

                    state._fsp--;


                    			current = this_PatternNodeReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:927:3: this_Assignment_1= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:936:3: this_Switch_2= ruleSwitch
                    {

                    			newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getSwitchParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Switch_2=ruleSwitch();

                    state._fsp--;


                    			current = this_Switch_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeReferenceOrAssignmentOrControlFlow"


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:948:1: entryRulePatternNodeReference returns [EObject current=null] : iv_rulePatternNodeReference= rulePatternNodeReference EOF ;
    public final EObject entryRulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternNodeReference = null;


        try {
            // InternalMGLang.g:948:61: (iv_rulePatternNodeReference= rulePatternNodeReference EOF )
            // InternalMGLang.g:949:2: iv_rulePatternNodeReference= rulePatternNodeReference EOF
            {
             newCompositeNode(grammarAccess.getPatternNodeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternNodeReference=rulePatternNodeReference();

            state._fsp--;

             current =iv_rulePatternNodeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternNodeReference"


    // $ANTLR start "rulePatternNodeReference"
    // InternalMGLang.g:955:1: rulePatternNodeReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:961:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:962:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:962:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:963:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:963:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:964:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:964:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:965:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMGLang.g:980:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:981:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:981:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:982:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternNodeReference"


    // $ANTLR start "entryRuleAssignment"
    // InternalMGLang.g:997:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMGLang.g:997:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMGLang.g:998:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMGLang.g:1004:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1010:2: ( ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) ) )
            // InternalMGLang.g:1011:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) )
            {
            // InternalMGLang.g:1011:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) )
            // InternalMGLang.g:1012:3: ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) )
            {
            // InternalMGLang.g:1012:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1013:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1013:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1014:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0());
            				

            }


            }

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_21); 

            			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1());
            		
            // InternalMGLang.g:1029:3: ( (lv_value_2_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:1030:4: (lv_value_2_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:1030:4: (lv_value_2_0= ruleArithmeticExpression )
            // InternalMGLang.g:1031:5: lv_value_2_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueArithmeticExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleParameter"
    // InternalMGLang.g:1052:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMGLang.g:1052:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMGLang.g:1053:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMGLang.g:1059:1: ruleParameter returns [EObject current=null] : (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveParameter_0 = null;

        EObject this_ParameterNode_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1065:2: ( (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode ) )
            // InternalMGLang.g:1066:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode )
            {
            // InternalMGLang.g:1066:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=46 && LA18_0<=49)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMGLang.g:1067:3: this_PrimitiveParameter_0= rulePrimitiveParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveParameter_0=rulePrimitiveParameter();

                    state._fsp--;


                    			current = this_PrimitiveParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1076:3: this_ParameterNode_1= ruleParameterNode
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getParameterNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterNode_1=ruleParameterNode();

                    state._fsp--;


                    			current = this_ParameterNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePrimitiveParameter"
    // InternalMGLang.g:1088:1: entryRulePrimitiveParameter returns [EObject current=null] : iv_rulePrimitiveParameter= rulePrimitiveParameter EOF ;
    public final EObject entryRulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveParameter = null;


        try {
            // InternalMGLang.g:1088:59: (iv_rulePrimitiveParameter= rulePrimitiveParameter EOF )
            // InternalMGLang.g:1089:2: iv_rulePrimitiveParameter= rulePrimitiveParameter EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveParameter=rulePrimitiveParameter();

            state._fsp--;

             current =iv_rulePrimitiveParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveParameter"


    // $ANTLR start "rulePrimitiveParameter"
    // InternalMGLang.g:1095:1: rulePrimitiveParameter returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1101:2: ( ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1102:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1102:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:1103:3: ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:1103:3: ( (lv_type_0_0= rulePrimitiveType ) )
            // InternalMGLang.g:1104:4: (lv_type_0_0= rulePrimitiveType )
            {
            // InternalMGLang.g:1104:4: (lv_type_0_0= rulePrimitiveType )
            // InternalMGLang.g:1105:5: lv_type_0_0= rulePrimitiveType
            {

            					newCompositeNode(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=rulePrimitiveType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.mofgen.MGLang.PrimitiveType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:1122:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1123:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1123:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1124:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveParameter"


    // $ANTLR start "entryRuleParameterNode"
    // InternalMGLang.g:1144:1: entryRuleParameterNode returns [EObject current=null] : iv_ruleParameterNode= ruleParameterNode EOF ;
    public final EObject entryRuleParameterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterNode = null;


        try {
            // InternalMGLang.g:1144:54: (iv_ruleParameterNode= ruleParameterNode EOF )
            // InternalMGLang.g:1145:2: iv_ruleParameterNode= ruleParameterNode EOF
            {
             newCompositeNode(grammarAccess.getParameterNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterNode=ruleParameterNode();

            state._fsp--;

             current =iv_ruleParameterNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterNode"


    // $ANTLR start "ruleParameterNode"
    // InternalMGLang.g:1151:1: ruleParameterNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1157:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1158:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1158:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:1159:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:1159:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1160:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1160:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1161:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterNodeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1172:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1173:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1173:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1174:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterNode"


    // $ANTLR start "entryRuleRefOrCall"
    // InternalMGLang.g:1194:1: entryRuleRefOrCall returns [EObject current=null] : iv_ruleRefOrCall= ruleRefOrCall EOF ;
    public final EObject entryRuleRefOrCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOrCall = null;


        try {
            // InternalMGLang.g:1194:50: (iv_ruleRefOrCall= ruleRefOrCall EOF )
            // InternalMGLang.g:1195:2: iv_ruleRefOrCall= ruleRefOrCall EOF
            {
             newCompositeNode(grammarAccess.getRefOrCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefOrCall=ruleRefOrCall();

            state._fsp--;

             current =iv_ruleRefOrCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefOrCall"


    // $ANTLR start "ruleRefOrCall"
    // InternalMGLang.g:1201:1: ruleRefOrCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )? )* ) ;
    public final EObject ruleRefOrCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1207:2: ( ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )? )* ) )
            // InternalMGLang.g:1208:2: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )? )* )
            {
            // InternalMGLang.g:1208:2: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )? )* )
            // InternalMGLang.g:1209:3: ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )? )*
            {
            // InternalMGLang.g:1209:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1210:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1210:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1211:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefOrCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1222:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:1223:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )?
            	    {
            	    // InternalMGLang.g:1223:4: ()
            	    // InternalMGLang.g:1224:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRefOrCallAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalMGLang.g:1234:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMGLang.g:1235:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMGLang.g:1235:5: (otherlv_3= RULE_ID )
            	    // InternalMGLang.g:1236:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRefOrCallRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_3, grammarAccess.getRefOrCallAccess().getRefETypedElementCrossReference_1_2_0());
            	    					

            	    }


            	    }

            	    // InternalMGLang.g:1247:4: (otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==19) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMGLang.g:1248:5: otherlv_4= '(' ( (lv_params_5_0= ruleRefParams ) )? otherlv_6= ')'
            	            {
            	            otherlv_4=(Token)match(input,19,FOLLOW_20); 

            	            					newLeafNode(otherlv_4, grammarAccess.getRefOrCallAccess().getLeftParenthesisKeyword_1_3_0());
            	            				
            	            // InternalMGLang.g:1252:5: ( (lv_params_5_0= ruleRefParams ) )?
            	            int alt19=2;
            	            int LA19_0 = input.LA(1);

            	            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||(LA19_0>=RULE_TRUE && LA19_0<=RULE_DOUBLE)||LA19_0==19||(LA19_0>=43 && LA19_0<=45)) ) {
            	                alt19=1;
            	            }
            	            switch (alt19) {
            	                case 1 :
            	                    // InternalMGLang.g:1253:6: (lv_params_5_0= ruleRefParams )
            	                    {
            	                    // InternalMGLang.g:1253:6: (lv_params_5_0= ruleRefParams )
            	                    // InternalMGLang.g:1254:7: lv_params_5_0= ruleRefParams
            	                    {

            	                    							newCompositeNode(grammarAccess.getRefOrCallAccess().getParamsRefParamsParserRuleCall_1_3_1_0());
            	                    						
            	                    pushFollow(FOLLOW_9);
            	                    lv_params_5_0=ruleRefParams();

            	                    state._fsp--;


            	                    							if (current==null) {
            	                    								current = createModelElementForParent(grammarAccess.getRefOrCallRule());
            	                    							}
            	                    							set(
            	                    								current,
            	                    								"params",
            	                    								lv_params_5_0,
            	                    								"org.mofgen.MGLang.RefParams");
            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_6=(Token)match(input,20,FOLLOW_18); 

            	            					newLeafNode(otherlv_6, grammarAccess.getRefOrCallAccess().getRightParenthesisKeyword_1_3_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefOrCall"


    // $ANTLR start "entryRuleRefParams"
    // InternalMGLang.g:1281:1: entryRuleRefParams returns [EObject current=null] : iv_ruleRefParams= ruleRefParams EOF ;
    public final EObject entryRuleRefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefParams = null;


        try {
            // InternalMGLang.g:1281:50: (iv_ruleRefParams= ruleRefParams EOF )
            // InternalMGLang.g:1282:2: iv_ruleRefParams= ruleRefParams EOF
            {
             newCompositeNode(grammarAccess.getRefParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefParams=ruleRefParams();

            state._fsp--;

             current =iv_ruleRefParams; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefParams"


    // $ANTLR start "ruleRefParams"
    // InternalMGLang.g:1288:1: ruleRefParams returns [EObject current=null] : ( ( (lv_params_0_0= ruleArithmeticExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleArithmeticExpression ) ) )* ) ;
    public final EObject ruleRefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1294:2: ( ( ( (lv_params_0_0= ruleArithmeticExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleArithmeticExpression ) ) )* ) )
            // InternalMGLang.g:1295:2: ( ( (lv_params_0_0= ruleArithmeticExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleArithmeticExpression ) ) )* )
            {
            // InternalMGLang.g:1295:2: ( ( (lv_params_0_0= ruleArithmeticExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleArithmeticExpression ) ) )* )
            // InternalMGLang.g:1296:3: ( (lv_params_0_0= ruleArithmeticExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleArithmeticExpression ) ) )*
            {
            // InternalMGLang.g:1296:3: ( (lv_params_0_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:1297:4: (lv_params_0_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:1297:4: (lv_params_0_0= ruleArithmeticExpression )
            // InternalMGLang.g:1298:5: lv_params_0_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_params_0_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefParamsRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:1315:3: (otherlv_1= ',' ( (lv_params_2_0= ruleArithmeticExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGLang.g:1316:4: otherlv_1= ',' ( (lv_params_2_0= ruleArithmeticExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRefParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMGLang.g:1320:4: ( (lv_params_2_0= ruleArithmeticExpression ) )
            	    // InternalMGLang.g:1321:5: (lv_params_2_0= ruleArithmeticExpression )
            	    {
            	    // InternalMGLang.g:1321:5: (lv_params_2_0= ruleArithmeticExpression )
            	    // InternalMGLang.g:1322:6: lv_params_2_0= ruleArithmeticExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_params_2_0=ruleArithmeticExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRefParamsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"org.mofgen.MGLang.ArithmeticExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefParams"


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:1344:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalMGLang.g:1344:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalMGLang.g:1345:2: iv_ruleGenerator= ruleGenerator EOF
            {
             newCompositeNode(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;

             current =iv_ruleGenerator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalMGLang.g:1351:1: ruleGenerator returns [EObject current=null] : ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_params_3_0 = null;

        EObject lv_commands_6_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1357:2: ( ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' ) )
            // InternalMGLang.g:1358:2: ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' )
            {
            // InternalMGLang.g:1358:2: ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' )
            // InternalMGLang.g:1359:3: () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}'
            {
            // InternalMGLang.g:1359:3: ()
            // InternalMGLang.g:1360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeneratorAccess().getGeneratorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getGenKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMGLang.g:1374:3: ( (lv_params_3_0= ruleParameter ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=46 && LA23_0<=49)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMGLang.g:1375:4: (lv_params_3_0= ruleParameter )
            	    {
            	    // InternalMGLang.g:1375:4: (lv_params_3_0= ruleParameter )
            	    // InternalMGLang.g:1376:5: lv_params_3_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getGeneratorAccess().getParamsParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_params_3_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_3_0,
            	    						"org.mofgen.MGLang.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMGLang.g:1401:3: ( (lv_commands_6_0= ruleGeneratorExpression ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==31||LA24_0==34||LA24_0==39||LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:1402:4: (lv_commands_6_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:1402:4: (lv_commands_6_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:1403:5: lv_commands_6_0= ruleGeneratorExpression
            	    {

            	    					newCompositeNode(grammarAccess.getGeneratorAccess().getCommandsGeneratorExpressionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_commands_6_0=ruleGeneratorExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_6_0,
            	    						"org.mofgen.MGLang.GeneratorExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleGeneratorExpression"
    // InternalMGLang.g:1428:1: entryRuleGeneratorExpression returns [EObject current=null] : iv_ruleGeneratorExpression= ruleGeneratorExpression EOF ;
    public final EObject entryRuleGeneratorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorExpression = null;


        try {
            // InternalMGLang.g:1428:60: (iv_ruleGeneratorExpression= ruleGeneratorExpression EOF )
            // InternalMGLang.g:1429:2: iv_ruleGeneratorExpression= ruleGeneratorExpression EOF
            {
             newCompositeNode(grammarAccess.getGeneratorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneratorExpression=ruleGeneratorExpression();

            state._fsp--;

             current =iv_ruleGeneratorExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneratorExpression"


    // $ANTLR start "ruleGeneratorExpression"
    // InternalMGLang.g:1435:1: ruleGeneratorExpression returns [EObject current=null] : (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternVariable_4= rulePatternVariable ) ;
    public final EObject ruleGeneratorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ForStatement_0 = null;

        EObject this_Switch_1 = null;

        EObject this_Collection_2 = null;

        EObject this_PatternCall_3 = null;

        EObject this_PatternVariable_4 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1441:2: ( (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternVariable_4= rulePatternVariable ) )
            // InternalMGLang.g:1442:2: (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternVariable_4= rulePatternVariable )
            {
            // InternalMGLang.g:1442:2: (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternVariable_4= rulePatternVariable )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 39:
            case 42:
                {
                alt25=3;
                }
                break;
            case RULE_ID:
                {
                int LA25_4 = input.LA(2);

                if ( (LA25_4==19) ) {
                    alt25=4;
                }
                else if ( (LA25_4==RULE_ID) ) {
                    alt25=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMGLang.g:1443:3: this_ForStatement_0= ruleForStatement
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getForStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForStatement_0=ruleForStatement();

                    state._fsp--;


                    			current = this_ForStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1452:3: this_Switch_1= ruleSwitch
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getSwitchParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Switch_1=ruleSwitch();

                    state._fsp--;


                    			current = this_Switch_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1461:3: this_Collection_2= ruleCollection
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Collection_2=ruleCollection();

                    state._fsp--;


                    			current = this_Collection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1470:3: this_PatternCall_3= rulePatternCall
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternCall_3=rulePatternCall();

                    state._fsp--;


                    			current = this_PatternCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1479:3: this_PatternVariable_4= rulePatternVariable
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getPatternVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternVariable_4=rulePatternVariable();

                    state._fsp--;


                    			current = this_PatternVariable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneratorExpression"


    // $ANTLR start "entryRulePatternVariable"
    // InternalMGLang.g:1491:1: entryRulePatternVariable returns [EObject current=null] : iv_rulePatternVariable= rulePatternVariable EOF ;
    public final EObject entryRulePatternVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternVariable = null;


        try {
            // InternalMGLang.g:1491:56: (iv_rulePatternVariable= rulePatternVariable EOF )
            // InternalMGLang.g:1492:2: iv_rulePatternVariable= rulePatternVariable EOF
            {
             newCompositeNode(grammarAccess.getPatternVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternVariable=rulePatternVariable();

            state._fsp--;

             current =iv_rulePatternVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternVariable"


    // $ANTLR start "rulePatternVariable"
    // InternalMGLang.g:1498:1: rulePatternVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_patternCall_3_0= rulePatternCall ) ) ) ;
    public final EObject rulePatternVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_2=null;
        EObject lv_patternCall_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1504:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_patternCall_3_0= rulePatternCall ) ) ) )
            // InternalMGLang.g:1505:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_patternCall_3_0= rulePatternCall ) ) )
            {
            // InternalMGLang.g:1505:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_patternCall_3_0= rulePatternCall ) ) )
            // InternalMGLang.g:1506:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_patternCall_3_0= rulePatternCall ) )
            {
            // InternalMGLang.g:1506:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1507:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1507:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1508:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternVariableAccess().getTypePatternCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1519:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1520:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1520:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1521:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_ASSIGNMENT_OP_2=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_7); 

            			newLeafNode(this_ASSIGNMENT_OP_2, grammarAccess.getPatternVariableAccess().getASSIGNMENT_OPTerminalRuleCall_2());
            		
            // InternalMGLang.g:1541:3: ( (lv_patternCall_3_0= rulePatternCall ) )
            // InternalMGLang.g:1542:4: (lv_patternCall_3_0= rulePatternCall )
            {
            // InternalMGLang.g:1542:4: (lv_patternCall_3_0= rulePatternCall )
            // InternalMGLang.g:1543:5: lv_patternCall_3_0= rulePatternCall
            {

            					newCompositeNode(grammarAccess.getPatternVariableAccess().getPatternCallPatternCallParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_patternCall_3_0=rulePatternCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternVariableRule());
            					}
            					set(
            						current,
            						"patternCall",
            						lv_patternCall_3_0,
            						"org.mofgen.MGLang.PatternCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternVariable"


    // $ANTLR start "entryRuleForStatement"
    // InternalMGLang.g:1564:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalMGLang.g:1564:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMGLang.g:1565:2: iv_ruleForStatement= ruleForStatement EOF
            {
             newCompositeNode(grammarAccess.getForStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;

             current =iv_ruleForStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMGLang.g:1571:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1577:2: ( (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' ) )
            // InternalMGLang.g:1578:2: (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' )
            {
            // InternalMGLang.g:1578:2: (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' )
            // InternalMGLang.g:1579:3: otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
            		
            // InternalMGLang.g:1583:3: ( (lv_head_1_0= ruleForHead ) )
            // InternalMGLang.g:1584:4: (lv_head_1_0= ruleForHead )
            {
            // InternalMGLang.g:1584:4: (lv_head_1_0= ruleForHead )
            // InternalMGLang.g:1585:5: lv_head_1_0= ruleForHead
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getHeadForHeadParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_head_1_0=ruleForHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStatementRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.mofgen.MGLang.ForHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMGLang.g:1606:3: ( (lv_body_3_0= ruleForBody ) )
            // InternalMGLang.g:1607:4: (lv_body_3_0= ruleForBody )
            {
            // InternalMGLang.g:1607:4: (lv_body_3_0= ruleForBody )
            // InternalMGLang.g:1608:5: lv_body_3_0= ruleForBody
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getBodyForBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_body_3_0=ruleForBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStatementRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.mofgen.MGLang.ForBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleForHead"
    // InternalMGLang.g:1633:1: entryRuleForHead returns [EObject current=null] : iv_ruleForHead= ruleForHead EOF ;
    public final EObject entryRuleForHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForHead = null;


        try {
            // InternalMGLang.g:1633:48: (iv_ruleForHead= ruleForHead EOF )
            // InternalMGLang.g:1634:2: iv_ruleForHead= ruleForHead EOF
            {
             newCompositeNode(grammarAccess.getForHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForHead=ruleForHead();

            state._fsp--;

             current =iv_ruleForHead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForHead"


    // $ANTLR start "ruleForHead"
    // InternalMGLang.g:1640:1: ruleForHead returns [EObject current=null] : (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead ) ;
    public final EObject ruleForHead() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralForHead_0 = null;

        EObject this_ForEachHead_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1646:2: ( (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead ) )
            // InternalMGLang.g:1647:2: (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead )
            {
            // InternalMGLang.g:1647:2: (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==28||LA26_1==33) ) {
                    alt26=2;
                }
                else if ( (LA26_1==32) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMGLang.g:1648:3: this_GeneralForHead_0= ruleGeneralForHead
                    {

                    			newCompositeNode(grammarAccess.getForHeadAccess().getGeneralForHeadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralForHead_0=ruleGeneralForHead();

                    state._fsp--;


                    			current = this_GeneralForHead_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1657:3: this_ForEachHead_1= ruleForEachHead
                    {

                    			newCompositeNode(grammarAccess.getForHeadAccess().getForEachHeadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForEachHead_1=ruleForEachHead();

                    state._fsp--;


                    			current = this_ForEachHead_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForHead"


    // $ANTLR start "entryRuleGeneralForHead"
    // InternalMGLang.g:1669:1: entryRuleGeneralForHead returns [EObject current=null] : iv_ruleGeneralForHead= ruleGeneralForHead EOF ;
    public final EObject entryRuleGeneralForHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralForHead = null;


        try {
            // InternalMGLang.g:1669:55: (iv_ruleGeneralForHead= ruleGeneralForHead EOF )
            // InternalMGLang.g:1670:2: iv_ruleGeneralForHead= ruleGeneralForHead EOF
            {
             newCompositeNode(grammarAccess.getGeneralForHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralForHead=ruleGeneralForHead();

            state._fsp--;

             current =iv_ruleGeneralForHead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralForHead"


    // $ANTLR start "ruleGeneralForHead"
    // InternalMGLang.g:1676:1: ruleGeneralForHead returns [EObject current=null] : ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) ) ;
    public final EObject ruleGeneralForHead() throws RecognitionException {
        EObject current = null;

        Token lv_iteratorVar_0_0=null;
        Token otherlv_1=null;
        EObject lv_range_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1682:2: ( ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) ) )
            // InternalMGLang.g:1683:2: ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) )
            {
            // InternalMGLang.g:1683:2: ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) )
            // InternalMGLang.g:1684:3: ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) )
            {
            // InternalMGLang.g:1684:3: ( (lv_iteratorVar_0_0= RULE_ID ) )
            // InternalMGLang.g:1685:4: (lv_iteratorVar_0_0= RULE_ID )
            {
            // InternalMGLang.g:1685:4: (lv_iteratorVar_0_0= RULE_ID )
            // InternalMGLang.g:1686:5: lv_iteratorVar_0_0= RULE_ID
            {
            lv_iteratorVar_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_iteratorVar_0_0, grammarAccess.getGeneralForHeadAccess().getIteratorVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralForHeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iteratorVar",
            						lv_iteratorVar_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralForHeadAccess().getInKeyword_1());
            		
            // InternalMGLang.g:1706:3: ( (lv_range_2_0= ruleForRange ) )
            // InternalMGLang.g:1707:4: (lv_range_2_0= ruleForRange )
            {
            // InternalMGLang.g:1707:4: (lv_range_2_0= ruleForRange )
            // InternalMGLang.g:1708:5: lv_range_2_0= ruleForRange
            {

            					newCompositeNode(grammarAccess.getGeneralForHeadAccess().getRangeForRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_range_2_0=ruleForRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralForHeadRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_2_0,
            						"org.mofgen.MGLang.ForRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralForHead"


    // $ANTLR start "entryRuleForEachHead"
    // InternalMGLang.g:1729:1: entryRuleForEachHead returns [EObject current=null] : iv_ruleForEachHead= ruleForEachHead EOF ;
    public final EObject entryRuleForEachHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachHead = null;


        try {
            // InternalMGLang.g:1729:52: (iv_ruleForEachHead= ruleForEachHead EOF )
            // InternalMGLang.g:1730:2: iv_ruleForEachHead= ruleForEachHead EOF
            {
             newCompositeNode(grammarAccess.getForEachHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachHead=ruleForEachHead();

            state._fsp--;

             current =iv_ruleForEachHead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEachHead"


    // $ANTLR start "ruleForEachHead"
    // InternalMGLang.g:1736:1: ruleForEachHead returns [EObject current=null] : ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) ) ;
    public final EObject ruleForEachHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_iteratorVar_4_0=null;
        EObject lv_src_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1742:2: ( ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1743:2: ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1743:2: ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) )
            // InternalMGLang.g:1744:3: ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) )
            {
            // InternalMGLang.g:1744:3: ( (lv_src_0_0= ruleRefOrCall ) )
            // InternalMGLang.g:1745:4: (lv_src_0_0= ruleRefOrCall )
            {
            // InternalMGLang.g:1745:4: (lv_src_0_0= ruleRefOrCall )
            // InternalMGLang.g:1746:5: lv_src_0_0= ruleRefOrCall
            {

            					newCompositeNode(grammarAccess.getForEachHeadAccess().getSrcRefOrCallParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_src_0_0=ruleRefOrCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachHeadRule());
            					}
            					set(
            						current,
            						"src",
            						lv_src_0_0,
            						"org.mofgen.MGLang.RefOrCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1());
            		
            // InternalMGLang.g:1767:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:1768:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:1768:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:1769:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachHeadRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMGLang.g:1784:3: ( (lv_iteratorVar_4_0= RULE_ID ) )
            // InternalMGLang.g:1785:4: (lv_iteratorVar_4_0= RULE_ID )
            {
            // InternalMGLang.g:1785:4: (lv_iteratorVar_4_0= RULE_ID )
            // InternalMGLang.g:1786:5: lv_iteratorVar_4_0= RULE_ID
            {
            lv_iteratorVar_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_iteratorVar_4_0, grammarAccess.getForEachHeadAccess().getIteratorVarIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachHeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iteratorVar",
            						lv_iteratorVar_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForEachHead"


    // $ANTLR start "entryRuleForBody"
    // InternalMGLang.g:1806:1: entryRuleForBody returns [EObject current=null] : iv_ruleForBody= ruleForBody EOF ;
    public final EObject entryRuleForBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBody = null;


        try {
            // InternalMGLang.g:1806:48: (iv_ruleForBody= ruleForBody EOF )
            // InternalMGLang.g:1807:2: iv_ruleForBody= ruleForBody EOF
            {
             newCompositeNode(grammarAccess.getForBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForBody=ruleForBody();

            state._fsp--;

             current =iv_ruleForBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForBody"


    // $ANTLR start "ruleForBody"
    // InternalMGLang.g:1813:1: ruleForBody returns [EObject current=null] : ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* ) ;
    public final EObject ruleForBody() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1819:2: ( ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* ) )
            // InternalMGLang.g:1820:2: ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* )
            {
            // InternalMGLang.g:1820:2: ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* )
            // InternalMGLang.g:1821:3: () ( (lv_commands_1_0= ruleGeneratorExpression ) )*
            {
            // InternalMGLang.g:1821:3: ()
            // InternalMGLang.g:1822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForBodyAccess().getForBodyAction_0(),
            					current);
            			

            }

            // InternalMGLang.g:1828:3: ( (lv_commands_1_0= ruleGeneratorExpression ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==31||LA27_0==34||LA27_0==39||LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMGLang.g:1829:4: (lv_commands_1_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:1829:4: (lv_commands_1_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:1830:5: lv_commands_1_0= ruleGeneratorExpression
            	    {

            	    					newCompositeNode(grammarAccess.getForBodyAccess().getCommandsGeneratorExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_commands_1_0=ruleGeneratorExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_1_0,
            	    						"org.mofgen.MGLang.GeneratorExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForBody"


    // $ANTLR start "entryRuleSwitchExpression"
    // InternalMGLang.g:1851:1: entryRuleSwitchExpression returns [EObject current=null] : iv_ruleSwitchExpression= ruleSwitchExpression EOF ;
    public final EObject entryRuleSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchExpression = null;


        try {
            // InternalMGLang.g:1851:57: (iv_ruleSwitchExpression= ruleSwitchExpression EOF )
            // InternalMGLang.g:1852:2: iv_ruleSwitchExpression= ruleSwitchExpression EOF
            {
             newCompositeNode(grammarAccess.getSwitchExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchExpression=ruleSwitchExpression();

            state._fsp--;

             current =iv_ruleSwitchExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // InternalMGLang.g:1858:1: ruleSwitchExpression returns [EObject current=null] : (this_ForStatement_0= ruleForStatement | this_Collection_1= ruleCollection | this_PatternCall_2= rulePatternCall | this_PatternVariable_3= rulePatternVariable | this_NodeReferenceOrAssignmentOrControlFlow_4= ruleNodeReferenceOrAssignmentOrControlFlow ) ;
    public final EObject ruleSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ForStatement_0 = null;

        EObject this_Collection_1 = null;

        EObject this_PatternCall_2 = null;

        EObject this_PatternVariable_3 = null;

        EObject this_NodeReferenceOrAssignmentOrControlFlow_4 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1864:2: ( (this_ForStatement_0= ruleForStatement | this_Collection_1= ruleCollection | this_PatternCall_2= rulePatternCall | this_PatternVariable_3= rulePatternVariable | this_NodeReferenceOrAssignmentOrControlFlow_4= ruleNodeReferenceOrAssignmentOrControlFlow ) )
            // InternalMGLang.g:1865:2: (this_ForStatement_0= ruleForStatement | this_Collection_1= ruleCollection | this_PatternCall_2= rulePatternCall | this_PatternVariable_3= rulePatternVariable | this_NodeReferenceOrAssignmentOrControlFlow_4= ruleNodeReferenceOrAssignmentOrControlFlow )
            {
            // InternalMGLang.g:1865:2: (this_ForStatement_0= ruleForStatement | this_Collection_1= ruleCollection | this_PatternCall_2= rulePatternCall | this_PatternVariable_3= rulePatternVariable | this_NodeReferenceOrAssignmentOrControlFlow_4= ruleNodeReferenceOrAssignmentOrControlFlow )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt28=1;
                }
                break;
            case 39:
            case 42:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_ASSIGNMENT_OP:
                case 29:
                    {
                    alt28=5;
                    }
                    break;
                case 19:
                    {
                    alt28=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt28=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMGLang.g:1866:3: this_ForStatement_0= ruleForStatement
                    {

                    			newCompositeNode(grammarAccess.getSwitchExpressionAccess().getForStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForStatement_0=ruleForStatement();

                    state._fsp--;


                    			current = this_ForStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1875:3: this_Collection_1= ruleCollection
                    {

                    			newCompositeNode(grammarAccess.getSwitchExpressionAccess().getCollectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Collection_1=ruleCollection();

                    state._fsp--;


                    			current = this_Collection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1884:3: this_PatternCall_2= rulePatternCall
                    {

                    			newCompositeNode(grammarAccess.getSwitchExpressionAccess().getPatternCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternCall_2=rulePatternCall();

                    state._fsp--;


                    			current = this_PatternCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1893:3: this_PatternVariable_3= rulePatternVariable
                    {

                    			newCompositeNode(grammarAccess.getSwitchExpressionAccess().getPatternVariableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternVariable_3=rulePatternVariable();

                    state._fsp--;


                    			current = this_PatternVariable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1902:3: this_NodeReferenceOrAssignmentOrControlFlow_4= ruleNodeReferenceOrAssignmentOrControlFlow
                    {

                    			newCompositeNode(grammarAccess.getSwitchExpressionAccess().getNodeReferenceOrAssignmentOrControlFlowParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeReferenceOrAssignmentOrControlFlow_4=ruleNodeReferenceOrAssignmentOrControlFlow();

                    state._fsp--;


                    			current = this_NodeReferenceOrAssignmentOrControlFlow_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleSwitch"
    // InternalMGLang.g:1914:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalMGLang.g:1914:47: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalMGLang.g:1915:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalMGLang.g:1921:1: ruleSwitch returns [EObject current=null] : (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        EObject this_IfElseSwitch_0 = null;

        EObject this_SwitchCase_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1927:2: ( (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase ) )
            // InternalMGLang.g:1928:2: (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase )
            {
            // InternalMGLang.g:1928:2: (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==21) ) {
                    alt29=1;
                }
                else if ( (LA29_1==19) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMGLang.g:1929:3: this_IfElseSwitch_0= ruleIfElseSwitch
                    {

                    			newCompositeNode(grammarAccess.getSwitchAccess().getIfElseSwitchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfElseSwitch_0=ruleIfElseSwitch();

                    state._fsp--;


                    			current = this_IfElseSwitch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1938:3: this_SwitchCase_1= ruleSwitchCase
                    {

                    			newCompositeNode(grammarAccess.getSwitchAccess().getSwitchCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchCase_1=ruleSwitchCase();

                    state._fsp--;


                    			current = this_SwitchCase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleIfElseSwitch"
    // InternalMGLang.g:1950:1: entryRuleIfElseSwitch returns [EObject current=null] : iv_ruleIfElseSwitch= ruleIfElseSwitch EOF ;
    public final EObject entryRuleIfElseSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseSwitch = null;


        try {
            // InternalMGLang.g:1950:53: (iv_ruleIfElseSwitch= ruleIfElseSwitch EOF )
            // InternalMGLang.g:1951:2: iv_ruleIfElseSwitch= ruleIfElseSwitch EOF
            {
             newCompositeNode(grammarAccess.getIfElseSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElseSwitch=ruleIfElseSwitch();

            state._fsp--;

             current =iv_ruleIfElseSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfElseSwitch"


    // $ANTLR start "ruleIfElseSwitch"
    // InternalMGLang.g:1957:1: ruleIfElseSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) ;
    public final EObject ruleIfElseSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_cases_2_0 = null;

        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1963:2: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) )
            // InternalMGLang.g:1964:2: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            {
            // InternalMGLang.g:1964:2: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            // InternalMGLang.g:1965:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getIfElseSwitchAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMGLang.g:1973:3: ( (lv_cases_2_0= ruleIfElseCase ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==35) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMGLang.g:1974:4: (lv_cases_2_0= ruleIfElseCase )
            	    {
            	    // InternalMGLang.g:1974:4: (lv_cases_2_0= ruleIfElseCase )
            	    // InternalMGLang.g:1975:5: lv_cases_2_0= ruleIfElseCase
            	    {

            	    					newCompositeNode(grammarAccess.getIfElseSwitchAccess().getCasesIfElseCaseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_cases_2_0=ruleIfElseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfElseSwitchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cases",
            	    						lv_cases_2_0,
            	    						"org.mofgen.MGLang.IfElseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // InternalMGLang.g:1992:3: ( (lv_default_3_0= ruleDefault ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMGLang.g:1993:4: (lv_default_3_0= ruleDefault )
                    {
                    // InternalMGLang.g:1993:4: (lv_default_3_0= ruleDefault )
                    // InternalMGLang.g:1994:5: lv_default_3_0= ruleDefault
                    {

                    					newCompositeNode(grammarAccess.getIfElseSwitchAccess().getDefaultDefaultParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_default_3_0=ruleDefault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfElseSwitchRule());
                    					}
                    					set(
                    						current,
                    						"default",
                    						lv_default_3_0,
                    						"org.mofgen.MGLang.Default");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIfElseSwitchAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfElseSwitch"


    // $ANTLR start "entryRuleIfElseCase"
    // InternalMGLang.g:2019:1: entryRuleIfElseCase returns [EObject current=null] : iv_ruleIfElseCase= ruleIfElseCase EOF ;
    public final EObject entryRuleIfElseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseCase = null;


        try {
            // InternalMGLang.g:2019:51: (iv_ruleIfElseCase= ruleIfElseCase EOF )
            // InternalMGLang.g:2020:2: iv_ruleIfElseCase= ruleIfElseCase EOF
            {
             newCompositeNode(grammarAccess.getIfElseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElseCase=ruleIfElseCase();

            state._fsp--;

             current =iv_ruleIfElseCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfElseCase"


    // $ANTLR start "ruleIfElseCase"
    // InternalMGLang.g:2026:1: ruleIfElseCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) ;
    public final EObject ruleIfElseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2032:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) )
            // InternalMGLang.g:2033:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            {
            // InternalMGLang.g:2033:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            // InternalMGLang.g:2034:3: otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseCaseAccess().getCaseKeyword_0());
            		
            // InternalMGLang.g:2038:3: ( (lv_val_1_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2039:4: (lv_val_1_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2039:4: (lv_val_1_0= ruleArithmeticExpression )
            // InternalMGLang.g:2040:5: lv_val_1_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getIfElseCaseAccess().getValArithmeticExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_val_1_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseCaseRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseCaseAccess().getColonKeyword_2());
            		
            // InternalMGLang.g:2061:3: ( (lv_body_3_0= ruleCaseBody ) )
            // InternalMGLang.g:2062:4: (lv_body_3_0= ruleCaseBody )
            {
            // InternalMGLang.g:2062:4: (lv_body_3_0= ruleCaseBody )
            // InternalMGLang.g:2063:5: lv_body_3_0= ruleCaseBody
            {

            					newCompositeNode(grammarAccess.getIfElseCaseAccess().getBodyCaseBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleCaseBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseCaseRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.mofgen.MGLang.CaseBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfElseCase"


    // $ANTLR start "entryRuleDefault"
    // InternalMGLang.g:2084:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalMGLang.g:2084:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalMGLang.g:2085:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalMGLang.g:2091:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_CaseBody_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2097:2: ( (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody ) )
            // InternalMGLang.g:2098:2: (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody )
            {
            // InternalMGLang.g:2098:2: (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody )
            // InternalMGLang.g:2099:3: otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody
            {
            otherlv_0=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDefaultKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDefaultAccess().getCaseBodyParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_CaseBody_2=ruleCaseBody();

            state._fsp--;


            			current = this_CaseBody_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleSwitchCase"
    // InternalMGLang.g:2119:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalMGLang.g:2119:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalMGLang.g:2120:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;

             current =iv_ruleSwitchCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // InternalMGLang.g:2126:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_attribute_2_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_default_6_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2132:2: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' ) )
            // InternalMGLang.g:2133:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' )
            {
            // InternalMGLang.g:2133:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' )
            // InternalMGLang.g:2134:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGLang.g:2142:3: ( (lv_attribute_2_0= ruleRefOrCall ) )
            // InternalMGLang.g:2143:4: (lv_attribute_2_0= ruleRefOrCall )
            {
            // InternalMGLang.g:2143:4: (lv_attribute_2_0= ruleRefOrCall )
            // InternalMGLang.g:2144:5: lv_attribute_2_0= ruleRefOrCall
            {

            					newCompositeNode(grammarAccess.getSwitchCaseAccess().getAttributeRefOrCallParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_attribute_2_0=ruleRefOrCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.mofgen.MGLang.RefOrCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMGLang.g:2169:3: ( (lv_cases_5_0= ruleCase ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMGLang.g:2170:4: (lv_cases_5_0= ruleCase )
            	    {
            	    // InternalMGLang.g:2170:4: (lv_cases_5_0= ruleCase )
            	    // InternalMGLang.g:2171:5: lv_cases_5_0= ruleCase
            	    {

            	    					newCompositeNode(grammarAccess.getSwitchCaseAccess().getCasesCaseParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_cases_5_0=ruleCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cases",
            	    						lv_cases_5_0,
            	    						"org.mofgen.MGLang.Case");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            // InternalMGLang.g:2188:3: ( (lv_default_6_0= ruleDefault ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMGLang.g:2189:4: (lv_default_6_0= ruleDefault )
                    {
                    // InternalMGLang.g:2189:4: (lv_default_6_0= ruleDefault )
                    // InternalMGLang.g:2190:5: lv_default_6_0= ruleDefault
                    {

                    					newCompositeNode(grammarAccess.getSwitchCaseAccess().getDefaultDefaultParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_default_6_0=ruleDefault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
                    					}
                    					set(
                    						current,
                    						"default",
                    						lv_default_6_0,
                    						"org.mofgen.MGLang.Default");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleCase"
    // InternalMGLang.g:2215:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalMGLang.g:2215:45: (iv_ruleCase= ruleCase EOF )
            // InternalMGLang.g:2216:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalMGLang.g:2222:1: ruleCase returns [EObject current=null] : (this_CaseWithCast_0= ruleCaseWithCast | this_CaseWithoutCast_1= ruleCaseWithoutCast ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        EObject this_CaseWithCast_0 = null;

        EObject this_CaseWithoutCast_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2228:2: ( (this_CaseWithCast_0= ruleCaseWithCast | this_CaseWithoutCast_1= ruleCaseWithoutCast ) )
            // InternalMGLang.g:2229:2: (this_CaseWithCast_0= ruleCaseWithCast | this_CaseWithoutCast_1= ruleCaseWithoutCast )
            {
            // InternalMGLang.g:2229:2: (this_CaseWithCast_0= ruleCaseWithCast | this_CaseWithoutCast_1= ruleCaseWithoutCast )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_STRING||(LA34_1>=RULE_TRUE && LA34_1<=RULE_DOUBLE)||LA34_1==19||(LA34_1>=43 && LA34_1<=45)) ) {
                    alt34=2;
                }
                else if ( (LA34_1==RULE_ID) ) {
                    int LA34_3 = input.LA(3);

                    if ( (LA34_3==28||LA34_3==33||LA34_3==36||(LA34_3>=50 && LA34_3<=62)) ) {
                        alt34=2;
                    }
                    else if ( (LA34_3==RULE_ID) ) {
                        alt34=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMGLang.g:2230:3: this_CaseWithCast_0= ruleCaseWithCast
                    {

                    			newCompositeNode(grammarAccess.getCaseAccess().getCaseWithCastParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CaseWithCast_0=ruleCaseWithCast();

                    state._fsp--;


                    			current = this_CaseWithCast_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2239:3: this_CaseWithoutCast_1= ruleCaseWithoutCast
                    {

                    			newCompositeNode(grammarAccess.getCaseAccess().getCaseWithoutCastParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CaseWithoutCast_1=ruleCaseWithoutCast();

                    state._fsp--;


                    			current = this_CaseWithoutCast_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleCaseWithCast"
    // InternalMGLang.g:2251:1: entryRuleCaseWithCast returns [EObject current=null] : iv_ruleCaseWithCast= ruleCaseWithCast EOF ;
    public final EObject entryRuleCaseWithCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseWithCast = null;


        try {
            // InternalMGLang.g:2251:53: (iv_ruleCaseWithCast= ruleCaseWithCast EOF )
            // InternalMGLang.g:2252:2: iv_ruleCaseWithCast= ruleCaseWithCast EOF
            {
             newCompositeNode(grammarAccess.getCaseWithCastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseWithCast=ruleCaseWithCast();

            state._fsp--;

             current =iv_ruleCaseWithCast; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseWithCast"


    // $ANTLR start "ruleCaseWithCast"
    // InternalMGLang.g:2258:1: ruleCaseWithCast returns [EObject current=null] : (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) ) ;
    public final EObject ruleCaseWithCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_node_1_0 = null;

        EObject lv_when_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2264:2: ( (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) ) )
            // InternalMGLang.g:2265:2: (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) )
            {
            // InternalMGLang.g:2265:2: (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) )
            // InternalMGLang.g:2266:3: otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseWithCastAccess().getCaseKeyword_0());
            		
            // InternalMGLang.g:2270:3: ( (lv_node_1_0= ruleNode ) )
            // InternalMGLang.g:2271:4: (lv_node_1_0= ruleNode )
            {
            // InternalMGLang.g:2271:4: (lv_node_1_0= ruleNode )
            // InternalMGLang.g:2272:5: lv_node_1_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getCaseWithCastAccess().getNodeNodeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_node_1_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseWithCastRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_1_0,
            						"org.mofgen.MGLang.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:2289:3: (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMGLang.g:2290:4: otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getCaseWithCastAccess().getWhenKeyword_2_0());
                    			
                    // InternalMGLang.g:2294:4: ( (lv_when_3_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:2295:5: (lv_when_3_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:2295:5: (lv_when_3_0= ruleArithmeticExpression )
                    // InternalMGLang.g:2296:6: lv_when_3_0= ruleArithmeticExpression
                    {

                    						newCompositeNode(grammarAccess.getCaseWithCastAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_when_3_0=ruleArithmeticExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseWithCastRule());
                    						}
                    						set(
                    							current,
                    							"when",
                    							lv_when_3_0,
                    							"org.mofgen.MGLang.ArithmeticExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getCaseWithCastAccess().getColonKeyword_3());
            		
            // InternalMGLang.g:2318:3: ( (lv_body_5_0= ruleCaseBody ) )
            // InternalMGLang.g:2319:4: (lv_body_5_0= ruleCaseBody )
            {
            // InternalMGLang.g:2319:4: (lv_body_5_0= ruleCaseBody )
            // InternalMGLang.g:2320:5: lv_body_5_0= ruleCaseBody
            {

            					newCompositeNode(grammarAccess.getCaseWithCastAccess().getBodyCaseBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleCaseBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseWithCastRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"org.mofgen.MGLang.CaseBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseWithCast"


    // $ANTLR start "entryRuleCaseWithoutCast"
    // InternalMGLang.g:2341:1: entryRuleCaseWithoutCast returns [EObject current=null] : iv_ruleCaseWithoutCast= ruleCaseWithoutCast EOF ;
    public final EObject entryRuleCaseWithoutCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseWithoutCast = null;


        try {
            // InternalMGLang.g:2341:56: (iv_ruleCaseWithoutCast= ruleCaseWithoutCast EOF )
            // InternalMGLang.g:2342:2: iv_ruleCaseWithoutCast= ruleCaseWithoutCast EOF
            {
             newCompositeNode(grammarAccess.getCaseWithoutCastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseWithoutCast=ruleCaseWithoutCast();

            state._fsp--;

             current =iv_ruleCaseWithoutCast; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseWithoutCast"


    // $ANTLR start "ruleCaseWithoutCast"
    // InternalMGLang.g:2348:1: ruleCaseWithoutCast returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) ;
    public final EObject ruleCaseWithoutCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2354:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) )
            // InternalMGLang.g:2355:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            {
            // InternalMGLang.g:2355:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            // InternalMGLang.g:2356:3: otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseWithoutCastAccess().getCaseKeyword_0());
            		
            // InternalMGLang.g:2360:3: ( (lv_val_1_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2361:4: (lv_val_1_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2361:4: (lv_val_1_0= ruleArithmeticExpression )
            // InternalMGLang.g:2362:5: lv_val_1_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getCaseWithoutCastAccess().getValArithmeticExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_val_1_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseWithoutCastRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseWithoutCastAccess().getColonKeyword_2());
            		
            // InternalMGLang.g:2383:3: ( (lv_body_3_0= ruleCaseBody ) )
            // InternalMGLang.g:2384:4: (lv_body_3_0= ruleCaseBody )
            {
            // InternalMGLang.g:2384:4: (lv_body_3_0= ruleCaseBody )
            // InternalMGLang.g:2385:5: lv_body_3_0= ruleCaseBody
            {

            					newCompositeNode(grammarAccess.getCaseWithoutCastAccess().getBodyCaseBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleCaseBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseWithoutCastRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.mofgen.MGLang.CaseBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseWithoutCast"


    // $ANTLR start "entryRuleCaseBody"
    // InternalMGLang.g:2406:1: entryRuleCaseBody returns [EObject current=null] : iv_ruleCaseBody= ruleCaseBody EOF ;
    public final EObject entryRuleCaseBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseBody = null;


        try {
            // InternalMGLang.g:2406:49: (iv_ruleCaseBody= ruleCaseBody EOF )
            // InternalMGLang.g:2407:2: iv_ruleCaseBody= ruleCaseBody EOF
            {
             newCompositeNode(grammarAccess.getCaseBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseBody=ruleCaseBody();

            state._fsp--;

             current =iv_ruleCaseBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseBody"


    // $ANTLR start "ruleCaseBody"
    // InternalMGLang.g:2413:1: ruleCaseBody returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleSwitchExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleSwitchExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) ) ;
    public final EObject ruleCaseBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NEWLINE_5=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2419:2: ( ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleSwitchExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleSwitchExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) ) )
            // InternalMGLang.g:2420:2: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleSwitchExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleSwitchExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) )
            {
            // InternalMGLang.g:2420:2: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleSwitchExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleSwitchExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID||LA37_0==31||LA37_0==34||LA37_0==39||LA37_0==42) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMGLang.g:2421:3: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleSwitchExpression ) )* otherlv_3= '}' )
                    {
                    // InternalMGLang.g:2421:3: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleSwitchExpression ) )* otherlv_3= '}' )
                    // InternalMGLang.g:2422:4: () otherlv_1= '{' ( (lv_expressions_2_0= ruleSwitchExpression ) )* otherlv_3= '}'
                    {
                    // InternalMGLang.g:2422:4: ()
                    // InternalMGLang.g:2423:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalMGLang.g:2433:4: ( (lv_expressions_2_0= ruleSwitchExpression ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID||LA36_0==31||LA36_0==34||LA36_0==39||LA36_0==42) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMGLang.g:2434:5: (lv_expressions_2_0= ruleSwitchExpression )
                    	    {
                    	    // InternalMGLang.g:2434:5: (lv_expressions_2_0= ruleSwitchExpression )
                    	    // InternalMGLang.g:2435:6: lv_expressions_2_0= ruleSwitchExpression
                    	    {

                    	    						newCompositeNode(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_expressions_2_0=ruleSwitchExpression();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCaseBodyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"expressions",
                    	    							lv_expressions_2_0,
                    	    							"org.mofgen.MGLang.SwitchExpression");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2458:3: ( ( (lv_expressions_4_0= ruleSwitchExpression ) ) this_NEWLINE_5= RULE_NEWLINE )
                    {
                    // InternalMGLang.g:2458:3: ( ( (lv_expressions_4_0= ruleSwitchExpression ) ) this_NEWLINE_5= RULE_NEWLINE )
                    // InternalMGLang.g:2459:4: ( (lv_expressions_4_0= ruleSwitchExpression ) ) this_NEWLINE_5= RULE_NEWLINE
                    {
                    // InternalMGLang.g:2459:4: ( (lv_expressions_4_0= ruleSwitchExpression ) )
                    // InternalMGLang.g:2460:5: (lv_expressions_4_0= ruleSwitchExpression )
                    {
                    // InternalMGLang.g:2460:5: (lv_expressions_4_0= ruleSwitchExpression )
                    // InternalMGLang.g:2461:6: lv_expressions_4_0= ruleSwitchExpression
                    {

                    						newCompositeNode(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_expressions_4_0=ruleSwitchExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseBodyRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_4_0,
                    							"org.mofgen.MGLang.SwitchExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_5, grammarAccess.getCaseBodyAccess().getNEWLINETerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseBody"


    // $ANTLR start "entryRuleCollection"
    // InternalMGLang.g:2487:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMGLang.g:2487:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMGLang.g:2488:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMGLang.g:2494:1: ruleCollection returns [EObject current=null] : (this_List_0= ruleList | this_Map_1= ruleMap ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Map_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2500:2: ( (this_List_0= ruleList | this_Map_1= ruleMap ) )
            // InternalMGLang.g:2501:2: (this_List_0= ruleList | this_Map_1= ruleMap )
            {
            // InternalMGLang.g:2501:2: (this_List_0= ruleList | this_Map_1= ruleMap )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            else if ( (LA38_0==42) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMGLang.g:2502:3: this_List_0= ruleList
                    {

                    			newCompositeNode(grammarAccess.getCollectionAccess().getListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_0=ruleList();

                    state._fsp--;


                    			current = this_List_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2511:3: this_Map_1= ruleMap
                    {

                    			newCompositeNode(grammarAccess.getCollectionAccess().getMapParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Map_1=ruleMap();

                    state._fsp--;


                    			current = this_Map_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleList"
    // InternalMGLang.g:2523:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMGLang.g:2523:45: (iv_ruleList= ruleList EOF )
            // InternalMGLang.g:2524:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMGLang.g:2530:1: ruleList returns [EObject current=null] : (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleListAssignment ) ) )? ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_2=null;
        EObject lv_createdBy_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2536:2: ( (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleListAssignment ) ) )? ) )
            // InternalMGLang.g:2537:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleListAssignment ) ) )? )
            {
            // InternalMGLang.g:2537:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleListAssignment ) ) )? )
            // InternalMGLang.g:2538:3: otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleListAssignment ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
            		
            // InternalMGLang.g:2542:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:2543:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:2543:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:2544:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_1_0, grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMGLang.g:2560:3: (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleListAssignment ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ASSIGNMENT_OP) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMGLang.g:2561:4: this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleListAssignment ) )
                    {
                    this_ASSIGNMENT_OP_2=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_39); 

                    				newLeafNode(this_ASSIGNMENT_OP_2, grammarAccess.getListAccess().getASSIGNMENT_OPTerminalRuleCall_2_0());
                    			
                    // InternalMGLang.g:2565:4: ( (lv_createdBy_3_0= ruleListAssignment ) )
                    // InternalMGLang.g:2566:5: (lv_createdBy_3_0= ruleListAssignment )
                    {
                    // InternalMGLang.g:2566:5: (lv_createdBy_3_0= ruleListAssignment )
                    // InternalMGLang.g:2567:6: lv_createdBy_3_0= ruleListAssignment
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getCreatedByListAssignmentParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_createdBy_3_0=ruleListAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"createdBy",
                    							lv_createdBy_3_0,
                    							"org.mofgen.MGLang.ListAssignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleListAssignment"
    // InternalMGLang.g:2589:1: entryRuleListAssignment returns [EObject current=null] : iv_ruleListAssignment= ruleListAssignment EOF ;
    public final EObject entryRuleListAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAssignment = null;


        try {
            // InternalMGLang.g:2589:55: (iv_ruleListAssignment= ruleListAssignment EOF )
            // InternalMGLang.g:2590:2: iv_ruleListAssignment= ruleListAssignment EOF
            {
             newCompositeNode(grammarAccess.getListAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListAssignment=ruleListAssignment();

            state._fsp--;

             current =iv_ruleListAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListAssignment"


    // $ANTLR start "ruleListAssignment"
    // InternalMGLang.g:2596:1: ruleListAssignment returns [EObject current=null] : (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall ) ;
    public final EObject ruleListAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_ListAdHoc_0 = null;

        EObject this_RefOrCall_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2602:2: ( (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall ) )
            // InternalMGLang.g:2603:2: (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall )
            {
            // InternalMGLang.g:2603:2: (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMGLang.g:2604:3: this_ListAdHoc_0= ruleListAdHoc
                    {

                    			newCompositeNode(grammarAccess.getListAssignmentAccess().getListAdHocParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListAdHoc_0=ruleListAdHoc();

                    state._fsp--;


                    			current = this_ListAdHoc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2613:3: this_RefOrCall_1= ruleRefOrCall
                    {

                    			newCompositeNode(grammarAccess.getListAssignmentAccess().getRefOrCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefOrCall_1=ruleRefOrCall();

                    state._fsp--;


                    			current = this_RefOrCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListAssignment"


    // $ANTLR start "entryRuleListAdHoc"
    // InternalMGLang.g:2625:1: entryRuleListAdHoc returns [EObject current=null] : iv_ruleListAdHoc= ruleListAdHoc EOF ;
    public final EObject entryRuleListAdHoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAdHoc = null;


        try {
            // InternalMGLang.g:2625:50: (iv_ruleListAdHoc= ruleListAdHoc EOF )
            // InternalMGLang.g:2626:2: iv_ruleListAdHoc= ruleListAdHoc EOF
            {
             newCompositeNode(grammarAccess.getListAdHocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListAdHoc=ruleListAdHoc();

            state._fsp--;

             current =iv_ruleListAdHoc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListAdHoc"


    // $ANTLR start "ruleListAdHoc"
    // InternalMGLang.g:2632:1: ruleListAdHoc returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListAdHoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2638:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) )
            // InternalMGLang.g:2639:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            {
            // InternalMGLang.g:2639:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            // InternalMGLang.g:2640:3: otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMGLang.g:2644:3: ( (lv_elements_1_0= ruleLiteral ) )
            // InternalMGLang.g:2645:4: (lv_elements_1_0= ruleLiteral )
            {
            // InternalMGLang.g:2645:4: (lv_elements_1_0= ruleLiteral )
            // InternalMGLang.g:2646:5: lv_elements_1_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_elements_1_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListAdHocRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.mofgen.MGLang.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:2663:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMGLang.g:2664:4: otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getListAdHocAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMGLang.g:2668:4: ( (lv_elements_3_0= ruleLiteral ) )
            	    // InternalMGLang.g:2669:5: (lv_elements_3_0= ruleLiteral )
            	    {
            	    // InternalMGLang.g:2669:5: (lv_elements_3_0= ruleLiteral )
            	    // InternalMGLang.g:2670:6: lv_elements_3_0= ruleLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_elements_3_0=ruleLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListAdHocRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"org.mofgen.MGLang.Literal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListAdHoc"


    // $ANTLR start "entryRuleMap"
    // InternalMGLang.g:2696:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalMGLang.g:2696:44: (iv_ruleMap= ruleMap EOF )
            // InternalMGLang.g:2697:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalMGLang.g:2703:1: ruleMap returns [EObject current=null] : (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleMapAssignment ) ) )? ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_2=null;
        EObject lv_createdBy_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2709:2: ( (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleMapAssignment ) ) )? ) )
            // InternalMGLang.g:2710:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleMapAssignment ) ) )? )
            {
            // InternalMGLang.g:2710:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleMapAssignment ) ) )? )
            // InternalMGLang.g:2711:3: otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleMapAssignment ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getMapKeyword_0());
            		
            // InternalMGLang.g:2715:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:2716:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:2716:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:2717:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMapAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMGLang.g:2733:3: (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleMapAssignment ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ASSIGNMENT_OP) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMGLang.g:2734:4: this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP ( (lv_createdBy_3_0= ruleMapAssignment ) )
                    {
                    this_ASSIGNMENT_OP_2=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_39); 

                    				newLeafNode(this_ASSIGNMENT_OP_2, grammarAccess.getMapAccess().getASSIGNMENT_OPTerminalRuleCall_2_0());
                    			
                    // InternalMGLang.g:2738:4: ( (lv_createdBy_3_0= ruleMapAssignment ) )
                    // InternalMGLang.g:2739:5: (lv_createdBy_3_0= ruleMapAssignment )
                    {
                    // InternalMGLang.g:2739:5: (lv_createdBy_3_0= ruleMapAssignment )
                    // InternalMGLang.g:2740:6: lv_createdBy_3_0= ruleMapAssignment
                    {

                    						newCompositeNode(grammarAccess.getMapAccess().getCreatedByMapAssignmentParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_createdBy_3_0=ruleMapAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapRule());
                    						}
                    						set(
                    							current,
                    							"createdBy",
                    							lv_createdBy_3_0,
                    							"org.mofgen.MGLang.MapAssignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapAssignment"
    // InternalMGLang.g:2762:1: entryRuleMapAssignment returns [EObject current=null] : iv_ruleMapAssignment= ruleMapAssignment EOF ;
    public final EObject entryRuleMapAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapAssignment = null;


        try {
            // InternalMGLang.g:2762:54: (iv_ruleMapAssignment= ruleMapAssignment EOF )
            // InternalMGLang.g:2763:2: iv_ruleMapAssignment= ruleMapAssignment EOF
            {
             newCompositeNode(grammarAccess.getMapAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapAssignment=ruleMapAssignment();

            state._fsp--;

             current =iv_ruleMapAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapAssignment"


    // $ANTLR start "ruleMapAssignment"
    // InternalMGLang.g:2769:1: ruleMapAssignment returns [EObject current=null] : (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall ) ;
    public final EObject ruleMapAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_MapAdHoc_0 = null;

        EObject this_RefOrCall_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2775:2: ( (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall ) )
            // InternalMGLang.g:2776:2: (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall )
            {
            // InternalMGLang.g:2776:2: (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMGLang.g:2777:3: this_MapAdHoc_0= ruleMapAdHoc
                    {

                    			newCompositeNode(grammarAccess.getMapAssignmentAccess().getMapAdHocParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapAdHoc_0=ruleMapAdHoc();

                    state._fsp--;


                    			current = this_MapAdHoc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2786:3: this_RefOrCall_1= ruleRefOrCall
                    {

                    			newCompositeNode(grammarAccess.getMapAssignmentAccess().getRefOrCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefOrCall_1=ruleRefOrCall();

                    state._fsp--;


                    			current = this_RefOrCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapAssignment"


    // $ANTLR start "entryRuleMapAdHoc"
    // InternalMGLang.g:2798:1: entryRuleMapAdHoc returns [EObject current=null] : iv_ruleMapAdHoc= ruleMapAdHoc EOF ;
    public final EObject entryRuleMapAdHoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapAdHoc = null;


        try {
            // InternalMGLang.g:2798:49: (iv_ruleMapAdHoc= ruleMapAdHoc EOF )
            // InternalMGLang.g:2799:2: iv_ruleMapAdHoc= ruleMapAdHoc EOF
            {
             newCompositeNode(grammarAccess.getMapAdHocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapAdHoc=ruleMapAdHoc();

            state._fsp--;

             current =iv_ruleMapAdHoc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapAdHoc"


    // $ANTLR start "ruleMapAdHoc"
    // InternalMGLang.g:2805:1: ruleMapAdHoc returns [EObject current=null] : (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMapAdHoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2811:2: ( (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' ) )
            // InternalMGLang.g:2812:2: (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' )
            {
            // InternalMGLang.g:2812:2: (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' )
            // InternalMGLang.g:2813:3: otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMGLang.g:2817:3: ( (lv_entries_1_0= ruleMapTupel ) )
            // InternalMGLang.g:2818:4: (lv_entries_1_0= ruleMapTupel )
            {
            // InternalMGLang.g:2818:4: (lv_entries_1_0= ruleMapTupel )
            // InternalMGLang.g:2819:5: lv_entries_1_0= ruleMapTupel
            {

            					newCompositeNode(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_entries_1_0=ruleMapTupel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapAdHocRule());
            					}
            					add(
            						current,
            						"entries",
            						lv_entries_1_0,
            						"org.mofgen.MGLang.MapTupel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:2836:3: (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==25) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMGLang.g:2837:4: otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMGLang.g:2841:4: ( (lv_entries_3_0= ruleMapTupel ) )
            	    // InternalMGLang.g:2842:5: (lv_entries_3_0= ruleMapTupel )
            	    {
            	    // InternalMGLang.g:2842:5: (lv_entries_3_0= ruleMapTupel )
            	    // InternalMGLang.g:2843:6: lv_entries_3_0= ruleMapTupel
            	    {

            	    						newCompositeNode(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_entries_3_0=ruleMapTupel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMapAdHocRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entries",
            	    							lv_entries_3_0,
            	    							"org.mofgen.MGLang.MapTupel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapAdHoc"


    // $ANTLR start "entryRuleMapTupel"
    // InternalMGLang.g:2869:1: entryRuleMapTupel returns [EObject current=null] : iv_ruleMapTupel= ruleMapTupel EOF ;
    public final EObject entryRuleMapTupel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTupel = null;


        try {
            // InternalMGLang.g:2869:49: (iv_ruleMapTupel= ruleMapTupel EOF )
            // InternalMGLang.g:2870:2: iv_ruleMapTupel= ruleMapTupel EOF
            {
             newCompositeNode(grammarAccess.getMapTupelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapTupel=ruleMapTupel();

            state._fsp--;

             current =iv_ruleMapTupel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapTupel"


    // $ANTLR start "ruleMapTupel"
    // InternalMGLang.g:2876:1: ruleMapTupel returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapTupel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2882:2: ( (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' ) )
            // InternalMGLang.g:2883:2: (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' )
            {
            // InternalMGLang.g:2883:2: (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' )
            // InternalMGLang.g:2884:3: otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTupelAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMGLang.g:2888:3: ( (lv_key_1_0= ruleLiteral ) )
            // InternalMGLang.g:2889:4: (lv_key_1_0= ruleLiteral )
            {
            // InternalMGLang.g:2889:4: (lv_key_1_0= ruleLiteral )
            // InternalMGLang.g:2890:5: lv_key_1_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getMapTupelAccess().getKeyLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
            lv_key_1_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapTupelRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.mofgen.MGLang.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMapTupelAccess().getCommaKeyword_2());
            		
            // InternalMGLang.g:2911:3: ( (lv_value_3_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2912:4: (lv_value_3_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2912:4: (lv_value_3_0= ruleArithmeticExpression )
            // InternalMGLang.g:2913:5: lv_value_3_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getMapTupelAccess().getValueArithmeticExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_3_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapTupelRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMapTupelAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapTupel"


    // $ANTLR start "entryRuleForRange"
    // InternalMGLang.g:2938:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalMGLang.g:2938:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalMGLang.g:2939:2: iv_ruleForRange= ruleForRange EOF
            {
             newCompositeNode(grammarAccess.getForRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForRange=ruleForRange();

            state._fsp--;

             current =iv_ruleForRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForRange"


    // $ANTLR start "ruleForRange"
    // InternalMGLang.g:2945:1: ruleForRange returns [EObject current=null] : ( ( (lv_start_0_0= ruleArithmeticExpression ) ) otherlv_1= ':' ( (lv_end_2_0= ruleArithmeticExpression ) ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2951:2: ( ( ( (lv_start_0_0= ruleArithmeticExpression ) ) otherlv_1= ':' ( (lv_end_2_0= ruleArithmeticExpression ) ) ) )
            // InternalMGLang.g:2952:2: ( ( (lv_start_0_0= ruleArithmeticExpression ) ) otherlv_1= ':' ( (lv_end_2_0= ruleArithmeticExpression ) ) )
            {
            // InternalMGLang.g:2952:2: ( ( (lv_start_0_0= ruleArithmeticExpression ) ) otherlv_1= ':' ( (lv_end_2_0= ruleArithmeticExpression ) ) )
            // InternalMGLang.g:2953:3: ( (lv_start_0_0= ruleArithmeticExpression ) ) otherlv_1= ':' ( (lv_end_2_0= ruleArithmeticExpression ) )
            {
            // InternalMGLang.g:2953:3: ( (lv_start_0_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2954:4: (lv_start_0_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2954:4: (lv_start_0_0= ruleArithmeticExpression )
            // InternalMGLang.g:2955:5: lv_start_0_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getForRangeAccess().getStartArithmeticExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_start_0_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRangeRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
            		
            // InternalMGLang.g:2976:3: ( (lv_end_2_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2977:4: (lv_end_2_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2977:4: (lv_end_2_0= ruleArithmeticExpression )
            // InternalMGLang.g:2978:5: lv_end_2_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getForRangeAccess().getEndArithmeticExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRangeRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForRange"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalMGLang.g:2999:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalMGLang.g:2999:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalMGLang.g:3000:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalMGLang.g:3006:1: ruleArithmeticExpression returns [EObject current=null] : this_TertiaryExpression_0= ruleTertiaryExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TertiaryExpression_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3012:2: (this_TertiaryExpression_0= ruleTertiaryExpression )
            // InternalMGLang.g:3013:2: this_TertiaryExpression_0= ruleTertiaryExpression
            {

            		newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTertiaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TertiaryExpression_0=ruleTertiaryExpression();

            state._fsp--;


            		current = this_TertiaryExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleTertiaryExpression"
    // InternalMGLang.g:3024:1: entryRuleTertiaryExpression returns [EObject current=null] : iv_ruleTertiaryExpression= ruleTertiaryExpression EOF ;
    public final EObject entryRuleTertiaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTertiaryExpression = null;


        try {
            // InternalMGLang.g:3024:59: (iv_ruleTertiaryExpression= ruleTertiaryExpression EOF )
            // InternalMGLang.g:3025:2: iv_ruleTertiaryExpression= ruleTertiaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTertiaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTertiaryExpression=ruleTertiaryExpression();

            state._fsp--;

             current =iv_ruleTertiaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTertiaryExpression"


    // $ANTLR start "ruleTertiaryExpression"
    // InternalMGLang.g:3031:1: ruleTertiaryExpression returns [EObject current=null] : (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* ) ;
    public final EObject ruleTertiaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SecondaryExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3037:2: ( (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* ) )
            // InternalMGLang.g:3038:2: (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* )
            {
            // InternalMGLang.g:3038:2: (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* )
            // InternalMGLang.g:3039:3: this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getSecondaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_SecondaryExpression_0=ruleSecondaryExpression();

            state._fsp--;


            			current = this_SecondaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:3047:3: ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33||(LA45_0>=56 && LA45_0<=57)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMGLang.g:3048:4: () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) )
            	    {
            	    // InternalMGLang.g:3048:4: ()
            	    // InternalMGLang.g:3049:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:3055:4: ( (lv_op_2_0= ruleTertiaryOp ) )
            	    // InternalMGLang.g:3056:5: (lv_op_2_0= ruleTertiaryOp )
            	    {
            	    // InternalMGLang.g:3056:5: (lv_op_2_0= ruleTertiaryOp )
            	    // InternalMGLang.g:3057:6: lv_op_2_0= ruleTertiaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getOpTertiaryOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_op_2_0=ruleTertiaryOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTertiaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.mofgen.MGLang.TertiaryOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMGLang.g:3074:4: ( (lv_right_3_0= ruleSecondaryExpression ) )
            	    // InternalMGLang.g:3075:5: (lv_right_3_0= ruleSecondaryExpression )
            	    {
            	    // InternalMGLang.g:3075:5: (lv_right_3_0= ruleSecondaryExpression )
            	    // InternalMGLang.g:3076:6: lv_right_3_0= ruleSecondaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getRightSecondaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=ruleSecondaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTertiaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.mofgen.MGLang.SecondaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTertiaryExpression"


    // $ANTLR start "entryRuleSecondaryExpression"
    // InternalMGLang.g:3098:1: entryRuleSecondaryExpression returns [EObject current=null] : iv_ruleSecondaryExpression= ruleSecondaryExpression EOF ;
    public final EObject entryRuleSecondaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryExpression = null;


        try {
            // InternalMGLang.g:3098:60: (iv_ruleSecondaryExpression= ruleSecondaryExpression EOF )
            // InternalMGLang.g:3099:2: iv_ruleSecondaryExpression= ruleSecondaryExpression EOF
            {
             newCompositeNode(grammarAccess.getSecondaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondaryExpression=ruleSecondaryExpression();

            state._fsp--;

             current =iv_ruleSecondaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecondaryExpression"


    // $ANTLR start "ruleSecondaryExpression"
    // InternalMGLang.g:3105:1: ruleSecondaryExpression returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleSecondaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpr_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3111:2: ( (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) )
            // InternalMGLang.g:3112:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            {
            // InternalMGLang.g:3112:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            // InternalMGLang.g:3113:3: this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getPrimaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;


            			current = this_PrimaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:3121:3: ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=58 && LA46_0<=59)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMGLang.g:3122:4: () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) )
            	    {
            	    // InternalMGLang.g:3122:4: ()
            	    // InternalMGLang.g:3123:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:3129:4: ( (lv_op_2_0= ruleSecondaryOp ) )
            	    // InternalMGLang.g:3130:5: (lv_op_2_0= ruleSecondaryOp )
            	    {
            	    // InternalMGLang.g:3130:5: (lv_op_2_0= ruleSecondaryOp )
            	    // InternalMGLang.g:3131:6: lv_op_2_0= ruleSecondaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getOpSecondaryOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_op_2_0=ruleSecondaryOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSecondaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.mofgen.MGLang.SecondaryOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMGLang.g:3148:4: ( (lv_right_3_0= rulePrimaryExpr ) )
            	    // InternalMGLang.g:3149:5: (lv_right_3_0= rulePrimaryExpr )
            	    {
            	    // InternalMGLang.g:3149:5: (lv_right_3_0= rulePrimaryExpr )
            	    // InternalMGLang.g:3150:6: lv_right_3_0= rulePrimaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getRightPrimaryExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_right_3_0=rulePrimaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSecondaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.mofgen.MGLang.PrimaryExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecondaryExpression"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalMGLang.g:3172:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalMGLang.g:3172:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalMGLang.g:3173:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalMGLang.g:3179:1: rulePrimaryExpr returns [EObject current=null] : (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_RelationExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3185:2: ( (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) )
            // InternalMGLang.g:3186:2: (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            {
            // InternalMGLang.g:3186:2: (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            // InternalMGLang.g:3187:3: this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExprAccess().getRelationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_RelationExpression_0=ruleRelationExpression();

            state._fsp--;


            			current = this_RelationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:3195:3: ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=60 && LA47_0<=62)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMGLang.g:3196:4: () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) )
            	    {
            	    // InternalMGLang.g:3196:4: ()
            	    // InternalMGLang.g:3197:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:3203:4: ( (lv_op_2_0= rulePrimaryOp ) )
            	    // InternalMGLang.g:3204:5: (lv_op_2_0= rulePrimaryOp )
            	    {
            	    // InternalMGLang.g:3204:5: (lv_op_2_0= rulePrimaryOp )
            	    // InternalMGLang.g:3205:6: lv_op_2_0= rulePrimaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getPrimaryExprAccess().getOpPrimaryOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_op_2_0=rulePrimaryOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.mofgen.MGLang.PrimaryOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMGLang.g:3222:4: ( (lv_right_3_0= ruleRelationExpression ) )
            	    // InternalMGLang.g:3223:5: (lv_right_3_0= ruleRelationExpression )
            	    {
            	    // InternalMGLang.g:3223:5: (lv_right_3_0= ruleRelationExpression )
            	    // InternalMGLang.g:3224:6: lv_right_3_0= ruleRelationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPrimaryExprAccess().getRightRelationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_right_3_0=ruleRelationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.mofgen.MGLang.RelationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleRelationExpression"
    // InternalMGLang.g:3246:1: entryRuleRelationExpression returns [EObject current=null] : iv_ruleRelationExpression= ruleRelationExpression EOF ;
    public final EObject entryRuleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationExpression = null;


        try {
            // InternalMGLang.g:3246:59: (iv_ruleRelationExpression= ruleRelationExpression EOF )
            // InternalMGLang.g:3247:2: iv_ruleRelationExpression= ruleRelationExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationExpression=ruleRelationExpression();

            state._fsp--;

             current =iv_ruleRelationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationExpression"


    // $ANTLR start "ruleRelationExpression"
    // InternalMGLang.g:3253:1: ruleRelationExpression returns [EObject current=null] : (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* ) ;
    public final EObject ruleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BaseExpr_0 = null;

        Enumerator lv_relation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3259:2: ( (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* ) )
            // InternalMGLang.g:3260:2: (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* )
            {
            // InternalMGLang.g:3260:2: (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* )
            // InternalMGLang.g:3261:3: this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationExpressionAccess().getBaseExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_BaseExpr_0=ruleBaseExpr();

            state._fsp--;


            			current = this_BaseExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:3269:3: ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=50 && LA48_0<=55)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMGLang.g:3270:4: () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) )
            	    {
            	    // InternalMGLang.g:3270:4: ()
            	    // InternalMGLang.g:3271:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:3277:4: ( (lv_relation_2_0= ruleRelationalOp ) )
            	    // InternalMGLang.g:3278:5: (lv_relation_2_0= ruleRelationalOp )
            	    {
            	    // InternalMGLang.g:3278:5: (lv_relation_2_0= ruleRelationalOp )
            	    // InternalMGLang.g:3279:6: lv_relation_2_0= ruleRelationalOp
            	    {

            	    						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_relation_2_0=ruleRelationalOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"relation",
            	    							lv_relation_2_0,
            	    							"org.mofgen.MGLang.RelationalOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMGLang.g:3296:4: ( (lv_right_3_0= ruleBaseExpr ) )
            	    // InternalMGLang.g:3297:5: (lv_right_3_0= ruleBaseExpr )
            	    {
            	    // InternalMGLang.g:3297:5: (lv_right_3_0= ruleBaseExpr )
            	    // InternalMGLang.g:3298:6: lv_right_3_0= ruleBaseExpr
            	    {

            	    						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRightBaseExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_right_3_0=ruleBaseExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.mofgen.MGLang.BaseExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationExpression"


    // $ANTLR start "entryRuleBaseExpr"
    // InternalMGLang.g:3320:1: entryRuleBaseExpr returns [EObject current=null] : iv_ruleBaseExpr= ruleBaseExpr EOF ;
    public final EObject entryRuleBaseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpr = null;


        try {
            // InternalMGLang.g:3320:49: (iv_ruleBaseExpr= ruleBaseExpr EOF )
            // InternalMGLang.g:3321:2: iv_ruleBaseExpr= ruleBaseExpr EOF
            {
             newCompositeNode(grammarAccess.getBaseExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpr=ruleBaseExpr();

            state._fsp--;

             current =iv_ruleBaseExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseExpr"


    // $ANTLR start "ruleBaseExpr"
    // InternalMGLang.g:3327:1: ruleBaseExpr returns [EObject current=null] : ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | this_Literal_11= ruleLiteral | this_RefOrCall_12= ruleRefOrCall ) ;
    public final EObject ruleBaseExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_ArithmeticExpression_1 = null;

        EObject lv_expr_5_0 = null;

        Enumerator lv_func_7_0 = null;

        EObject lv_expr_9_0 = null;

        EObject this_Literal_11 = null;

        EObject this_RefOrCall_12 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3333:2: ( ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | this_Literal_11= ruleLiteral | this_RefOrCall_12= ruleRefOrCall ) )
            // InternalMGLang.g:3334:2: ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | this_Literal_11= ruleLiteral | this_RefOrCall_12= ruleRefOrCall )
            {
            // InternalMGLang.g:3334:2: ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | this_Literal_11= ruleLiteral | this_RefOrCall_12= ruleRefOrCall )
            int alt49=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt49=1;
                }
                break;
            case 43:
                {
                alt49=2;
                }
                break;
            case 44:
            case 45:
                {
                alt49=3;
                }
                break;
            case RULE_STRING:
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_DOUBLE:
                {
                alt49=4;
                }
                break;
            case RULE_ID:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalMGLang.g:3335:3: (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' )
                    {
                    // InternalMGLang.g:3335:3: (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' )
                    // InternalMGLang.g:3336:4: otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExprAccess().getArithmeticExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_ArithmeticExpression_1=ruleArithmeticExpression();

                    state._fsp--;


                    				current = this_ArithmeticExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3354:3: ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) )
                    {
                    // InternalMGLang.g:3354:3: ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) )
                    // InternalMGLang.g:3355:4: () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) )
                    {
                    // InternalMGLang.g:3355:4: ()
                    // InternalMGLang.g:3356:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalMGLang.g:3366:4: ( (lv_expr_5_0= ruleBaseExpr ) )
                    // InternalMGLang.g:3367:5: (lv_expr_5_0= ruleBaseExpr )
                    {
                    // InternalMGLang.g:3367:5: (lv_expr_5_0= ruleBaseExpr )
                    // InternalMGLang.g:3368:6: lv_expr_5_0= ruleBaseExpr
                    {

                    						newCompositeNode(grammarAccess.getBaseExprAccess().getExprBaseExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_5_0=ruleBaseExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseExprRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_5_0,
                    							"org.mofgen.MGLang.BaseExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3387:3: ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' )
                    {
                    // InternalMGLang.g:3387:3: ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' )
                    // InternalMGLang.g:3388:4: () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')'
                    {
                    // InternalMGLang.g:3388:4: ()
                    // InternalMGLang.g:3389:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMGLang.g:3395:4: ( (lv_func_7_0= ruleMathFunc ) )
                    // InternalMGLang.g:3396:5: (lv_func_7_0= ruleMathFunc )
                    {
                    // InternalMGLang.g:3396:5: (lv_func_7_0= ruleMathFunc )
                    // InternalMGLang.g:3397:6: lv_func_7_0= ruleMathFunc
                    {

                    						newCompositeNode(grammarAccess.getBaseExprAccess().getFuncMathFuncEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_func_7_0=ruleMathFunc();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseExprRule());
                    						}
                    						set(
                    							current,
                    							"func",
                    							lv_func_7_0,
                    							"org.mofgen.MGLang.MathFunc");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalMGLang.g:3418:4: ( (lv_expr_9_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:3419:5: (lv_expr_9_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:3419:5: (lv_expr_9_0= ruleArithmeticExpression )
                    // InternalMGLang.g:3420:6: lv_expr_9_0= ruleArithmeticExpression
                    {

                    						newCompositeNode(grammarAccess.getBaseExprAccess().getExprArithmeticExpressionParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_expr_9_0=ruleArithmeticExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseExprRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_9_0,
                    							"org.mofgen.MGLang.ArithmeticExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3443:3: this_Literal_11= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_11=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMGLang.g:3452:3: this_RefOrCall_12= ruleRefOrCall
                    {

                    			newCompositeNode(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefOrCall_12=ruleRefOrCall();

                    state._fsp--;


                    			current = this_RefOrCall_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseExpr"


    // $ANTLR start "entryRuleLiteral"
    // InternalMGLang.g:3464:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalMGLang.g:3464:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMGLang.g:3465:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMGLang.g:3471:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3477:2: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral ) )
            // InternalMGLang.g:3478:2: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral )
            {
            // InternalMGLang.g:3478:2: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt50=1;
                }
                break;
            case RULE_STRING:
                {
                alt50=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalMGLang.g:3479:3: this_BooleanLiteral_0= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3488:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3497:3: this_NumberLiteral_2= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMGLang.g:3509:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalMGLang.g:3509:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalMGLang.g:3510:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMGLang.g:3516:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3522:2: ( ( ( (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE ) ) ) )
            // InternalMGLang.g:3523:2: ( ( (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE ) ) )
            {
            // InternalMGLang.g:3523:2: ( ( (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE ) ) )
            // InternalMGLang.g:3524:3: ( (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE ) )
            {
            // InternalMGLang.g:3524:3: ( (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE ) )
            // InternalMGLang.g:3525:4: (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE )
            {
            // InternalMGLang.g:3525:4: (lv_val_0_1= RULE_TRUE | lv_val_0_2= RULE_FALSE )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_TRUE) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_FALSE) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalMGLang.g:3526:5: lv_val_0_1= RULE_TRUE
                    {
                    lv_val_0_1=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getBooleanLiteralAccess().getValTRUETerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_0_1,
                    						"org.mofgen.MGLang.TRUE");
                    				

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3541:5: lv_val_0_2= RULE_FALSE
                    {
                    lv_val_0_2=(Token)match(input,RULE_FALSE,FOLLOW_2); 

                    					newLeafNode(lv_val_0_2, grammarAccess.getBooleanLiteralAccess().getValFALSETerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_0_2,
                    						"org.mofgen.MGLang.FALSE");
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMGLang.g:3561:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMGLang.g:3561:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMGLang.g:3562:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMGLang.g:3568:1: ruleStringLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:3574:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalMGLang.g:3575:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalMGLang.g:3575:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalMGLang.g:3576:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalMGLang.g:3576:3: (lv_val_0_0= RULE_STRING )
            // InternalMGLang.g:3577:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMGLang.g:3596:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMGLang.g:3596:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMGLang.g:3597:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMGLang.g:3603:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:3609:2: ( ( (lv_val_0_0= RULE_DOUBLE ) ) )
            // InternalMGLang.g:3610:2: ( (lv_val_0_0= RULE_DOUBLE ) )
            {
            // InternalMGLang.g:3610:2: ( (lv_val_0_0= RULE_DOUBLE ) )
            // InternalMGLang.g:3611:3: (lv_val_0_0= RULE_DOUBLE )
            {
            // InternalMGLang.g:3611:3: (lv_val_0_0= RULE_DOUBLE )
            // InternalMGLang.g:3612:4: lv_val_0_0= RULE_DOUBLE
            {
            lv_val_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getNumberLiteralAccess().getValDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.mofgen.MGLang.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "ruleMathFunc"
    // InternalMGLang.g:3631:1: ruleMathFunc returns [Enumerator current=null] : ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) ;
    public final Enumerator ruleMathFunc() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:3637:2: ( ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) )
            // InternalMGLang.g:3638:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            {
            // InternalMGLang.g:3638:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                alt52=1;
            }
            else if ( (LA52_0==45) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalMGLang.g:3639:3: (enumLiteral_0= 'sqrt' )
                    {
                    // InternalMGLang.g:3639:3: (enumLiteral_0= 'sqrt' )
                    // InternalMGLang.g:3640:4: enumLiteral_0= 'sqrt'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3647:3: (enumLiteral_1= 'abs' )
                    {
                    // InternalMGLang.g:3647:3: (enumLiteral_1= 'abs' )
                    // InternalMGLang.g:3648:4: enumLiteral_1= 'abs'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathFunc"


    // $ANTLR start "rulePrimitiveType"
    // InternalMGLang.g:3658:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMGLang.g:3664:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // InternalMGLang.g:3665:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // InternalMGLang.g:3665:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt53=1;
                }
                break;
            case 47:
                {
                alt53=2;
                }
                break;
            case 48:
                {
                alt53=3;
                }
                break;
            case 49:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalMGLang.g:3666:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMGLang.g:3666:3: (enumLiteral_0= 'int' )
                    // InternalMGLang.g:3667:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3674:3: (enumLiteral_1= 'char' )
                    {
                    // InternalMGLang.g:3674:3: (enumLiteral_1= 'char' )
                    // InternalMGLang.g:3675:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3682:3: (enumLiteral_2= 'double' )
                    {
                    // InternalMGLang.g:3682:3: (enumLiteral_2= 'double' )
                    // InternalMGLang.g:3683:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3690:3: (enumLiteral_3= 'String' )
                    {
                    // InternalMGLang.g:3690:3: (enumLiteral_3= 'String' )
                    // InternalMGLang.g:3691:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleRelationalOp"
    // InternalMGLang.g:3701:1: ruleRelationalOp returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleRelationalOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMGLang.g:3707:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalMGLang.g:3708:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalMGLang.g:3708:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt54=1;
                }
                break;
            case 51:
                {
                alt54=2;
                }
                break;
            case 52:
                {
                alt54=3;
                }
                break;
            case 53:
                {
                alt54=4;
                }
                break;
            case 54:
                {
                alt54=5;
                }
                break;
            case 55:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalMGLang.g:3709:3: (enumLiteral_0= '>' )
                    {
                    // InternalMGLang.g:3709:3: (enumLiteral_0= '>' )
                    // InternalMGLang.g:3710:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3717:3: (enumLiteral_1= '>=' )
                    {
                    // InternalMGLang.g:3717:3: (enumLiteral_1= '>=' )
                    // InternalMGLang.g:3718:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3725:3: (enumLiteral_2= '==' )
                    {
                    // InternalMGLang.g:3725:3: (enumLiteral_2= '==' )
                    // InternalMGLang.g:3726:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3733:3: (enumLiteral_3= '!=' )
                    {
                    // InternalMGLang.g:3733:3: (enumLiteral_3= '!=' )
                    // InternalMGLang.g:3734:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:3741:3: (enumLiteral_4= '<=' )
                    {
                    // InternalMGLang.g:3741:3: (enumLiteral_4= '<=' )
                    // InternalMGLang.g:3742:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:3749:3: (enumLiteral_5= '<' )
                    {
                    // InternalMGLang.g:3749:3: (enumLiteral_5= '<' )
                    // InternalMGLang.g:3750:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getLESSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOpAccess().getLESSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "ruleTertiaryOp"
    // InternalMGLang.g:3760:1: ruleTertiaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) ) ;
    public final Enumerator ruleTertiaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3766:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) ) )
            // InternalMGLang.g:3767:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) )
            {
            // InternalMGLang.g:3767:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt55=1;
                }
                break;
            case 33:
                {
                alt55=2;
                }
                break;
            case 57:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalMGLang.g:3768:3: (enumLiteral_0= '+' )
                    {
                    // InternalMGLang.g:3768:3: (enumLiteral_0= '+' )
                    // InternalMGLang.g:3769:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3776:3: (enumLiteral_1= '-' )
                    {
                    // InternalMGLang.g:3776:3: (enumLiteral_1= '-' )
                    // InternalMGLang.g:3777:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3784:3: (enumLiteral_2= '||' )
                    {
                    // InternalMGLang.g:3784:3: (enumLiteral_2= '||' )
                    // InternalMGLang.g:3785:4: enumLiteral_2= '||'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTertiaryOp"


    // $ANTLR start "ruleSecondaryOp"
    // InternalMGLang.g:3795:1: ruleSecondaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) ) ;
    public final Enumerator ruleSecondaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:3801:2: ( ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) ) )
            // InternalMGLang.g:3802:2: ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) )
            {
            // InternalMGLang.g:3802:2: ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==58) ) {
                alt56=1;
            }
            else if ( (LA56_0==59) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalMGLang.g:3803:3: (enumLiteral_0= '%' )
                    {
                    // InternalMGLang.g:3803:3: (enumLiteral_0= '%' )
                    // InternalMGLang.g:3804:4: enumLiteral_0= '%'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3811:3: (enumLiteral_1= '^' )
                    {
                    // InternalMGLang.g:3811:3: (enumLiteral_1= '^' )
                    // InternalMGLang.g:3812:4: enumLiteral_1= '^'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecondaryOp"


    // $ANTLR start "rulePrimaryOp"
    // InternalMGLang.g:3822:1: rulePrimaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) ) ;
    public final Enumerator rulePrimaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3828:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) ) )
            // InternalMGLang.g:3829:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) )
            {
            // InternalMGLang.g:3829:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt57=1;
                }
                break;
            case 61:
                {
                alt57=2;
                }
                break;
            case 62:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMGLang.g:3830:3: (enumLiteral_0= '*' )
                    {
                    // InternalMGLang.g:3830:3: (enumLiteral_0= '*' )
                    // InternalMGLang.g:3831:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3838:3: (enumLiteral_1= '/' )
                    {
                    // InternalMGLang.g:3838:3: (enumLiteral_1= '/' )
                    // InternalMGLang.g:3839:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3846:3: (enumLiteral_2= '&&' )
                    {
                    // InternalMGLang.g:3846:3: (enumLiteral_2= '&&' )
                    // InternalMGLang.g:3847:4: enumLiteral_2= '&&'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000041000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0003C00000100020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003C00000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000048400400020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000380000180730L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000380000080730L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010080002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000048480400020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000048480000022L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002800400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000048480200020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000048480600020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000390000080730L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000710L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0300000200000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00FC000000000002L});

}
