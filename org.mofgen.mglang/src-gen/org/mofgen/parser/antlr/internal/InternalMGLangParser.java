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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ASSIGNMENT_OP", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'pattern'", "'('", "','", "')'", "'{'", "'}'", "'return'", "'this'", "'.'", "'['", "']'", "'->'", "'||'", "'^'", "'&&'", "'!'", "'+'", "'gen'", "'for'", "'in'", "':'", "'true'", "'false'", "'int'", "'char'", "'double'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_ASSIGNMENT_OP=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalMGLang.g:72:1: ruleMofgenFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* ) ;
    public final EObject ruleMofgenFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_patterns_1_0 = null;

        EObject lv_generators_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* ) )
            // InternalMGLang.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* )
            {
            // InternalMGLang.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* )
            // InternalMGLang.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )*
            {
            // InternalMGLang.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
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

            // InternalMGLang.g:99:3: ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }
                else if ( (LA2_0==32) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMGLang.g:100:4: ( (lv_patterns_1_0= rulePattern ) )
            	    {
            	    // InternalMGLang.g:100:4: ( (lv_patterns_1_0= rulePattern ) )
            	    // InternalMGLang.g:101:5: (lv_patterns_1_0= rulePattern )
            	    {
            	    // InternalMGLang.g:101:5: (lv_patterns_1_0= rulePattern )
            	    // InternalMGLang.g:102:6: lv_patterns_1_0= rulePattern
            	    {

            	    						newCompositeNode(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_patterns_1_0=rulePattern();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"patterns",
            	    							lv_patterns_1_0,
            	    							"org.mofgen.MGLang.Pattern");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMGLang.g:120:4: ( (lv_generators_2_0= ruleGenerator ) )
            	    {
            	    // InternalMGLang.g:120:4: ( (lv_generators_2_0= ruleGenerator ) )
            	    // InternalMGLang.g:121:5: (lv_generators_2_0= ruleGenerator )
            	    {
            	    // InternalMGLang.g:121:5: (lv_generators_2_0= ruleGenerator )
            	    // InternalMGLang.g:122:6: lv_generators_2_0= ruleGenerator
            	    {

            	    						newCompositeNode(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_generators_2_0=ruleGenerator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generators",
            	    							lv_generators_2_0,
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
    // InternalMGLang.g:144:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMGLang.g:144:47: (iv_ruleImport= ruleImport EOF )
            // InternalMGLang.g:145:2: iv_ruleImport= ruleImport EOF
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
    // InternalMGLang.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:157:2: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) )
            // InternalMGLang.g:158:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:158:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
            // InternalMGLang.g:159:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMGLang.g:163:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMGLang.g:164:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMGLang.g:164:4: (lv_name_1_0= RULE_STRING )
            // InternalMGLang.g:165:5: lv_name_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
            		
            // InternalMGLang.g:185:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalMGLang.g:186:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalMGLang.g:186:4: (lv_alias_3_0= RULE_ID )
            // InternalMGLang.g:187:5: lv_alias_3_0= RULE_ID
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


    // $ANTLR start "entryRulePattern"
    // InternalMGLang.g:207:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMGLang.g:207:48: (iv_rulePattern= rulePattern EOF )
            // InternalMGLang.g:208:2: iv_rulePattern= rulePattern EOF
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
    // InternalMGLang.g:214:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' ( (lv_return_10_0= rulePatternReturn ) )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_nodes_8_0 = null;

        EObject lv_return_10_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:220:2: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' ( (lv_return_10_0= rulePatternReturn ) )? ) )
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' ( (lv_return_10_0= rulePatternReturn ) )? )
            {
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' ( (lv_return_10_0= rulePatternReturn ) )? )
            // InternalMGLang.g:222:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' ( (lv_return_10_0= rulePatternReturn ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalMGLang.g:226:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:227:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:227:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:228:5: lv_name_1_0= RULE_ID
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

            // InternalMGLang.g:244:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            // InternalMGLang.g:245:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            				newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMGLang.g:249:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=38 && LA4_0<=40)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:250:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalMGLang.g:250:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMGLang.g:251:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMGLang.g:251:6: (lv_parameters_3_0= ruleParameter )
                    // InternalMGLang.g:252:7: lv_parameters_3_0= ruleParameter
                    {

                    							newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_10);
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

                    // InternalMGLang.g:269:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMGLang.g:270:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_11); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0());
                    	    					
                    	    // InternalMGLang.g:274:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMGLang.g:275:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMGLang.g:275:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMGLang.g:276:8: lv_parameters_5_0= ruleParameter
                    	    {

                    	    								newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2());
            			

            }

            otherlv_7=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMGLang.g:304:3: ( (lv_nodes_8_0= ruleNode ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMGLang.g:305:4: (lv_nodes_8_0= ruleNode )
            	    {
            	    // InternalMGLang.g:305:4: (lv_nodes_8_0= ruleNode )
            	    // InternalMGLang.g:306:5: lv_nodes_8_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_nodes_8_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_8_0,
            	    						"org.mofgen.MGLang.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMGLang.g:327:3: ( (lv_return_10_0= rulePatternReturn ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:328:4: (lv_return_10_0= rulePatternReturn )
                    {
                    // InternalMGLang.g:328:4: (lv_return_10_0= rulePatternReturn )
                    // InternalMGLang.g:329:5: lv_return_10_0= rulePatternReturn
                    {

                    					newCompositeNode(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_return_10_0=rulePatternReturn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternRule());
                    					}
                    					set(
                    						current,
                    						"return",
                    						lv_return_10_0,
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
    // InternalMGLang.g:350:1: entryRulePatternReturn returns [EObject current=null] : iv_rulePatternReturn= rulePatternReturn EOF ;
    public final EObject entryRulePatternReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternReturn = null;


        try {
            // InternalMGLang.g:350:54: (iv_rulePatternReturn= rulePatternReturn EOF )
            // InternalMGLang.g:351:2: iv_rulePatternReturn= rulePatternReturn EOF
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
    // InternalMGLang.g:357:1: rulePatternReturn returns [EObject current=null] : ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject rulePatternReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMGLang.g:363:2: ( ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalMGLang.g:364:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalMGLang.g:364:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalMGLang.g:365:3: () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalMGLang.g:365:3: ()
            // InternalMGLang.g:366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternReturnAccess().getPatternReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternReturnAccess().getReturnKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternReturnAccess().getThisKeyword_2());
            		
            // InternalMGLang.g:380:3: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:381:4: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0());
                    			
                    // InternalMGLang.g:385:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMGLang.g:386:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMGLang.g:386:5: (otherlv_4= RULE_ID )
                    // InternalMGLang.g:387:6: otherlv_4= RULE_ID
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


    // $ANTLR start "entryRuleNode"
    // InternalMGLang.g:403:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMGLang.g:403:45: (iv_ruleNode= ruleNode EOF )
            // InternalMGLang.g:404:2: iv_ruleNode= ruleNode EOF
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
    // InternalMGLang.g:410:1: ruleNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_createdBy_2_1 = null;

        EObject lv_createdBy_2_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:416:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) ) )? ) )
            // InternalMGLang.g:417:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) ) )? )
            {
            // InternalMGLang.g:417:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) ) )? )
            // InternalMGLang.g:418:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) ) )?
            {
            // InternalMGLang.g:418:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:419:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:419:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:420:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:431:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:432:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:432:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:433:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            // InternalMGLang.g:449:3: ( ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==16) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:450:4: ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) )
                    {
                    // InternalMGLang.g:450:4: ( (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall ) )
                    // InternalMGLang.g:451:5: (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall )
                    {
                    // InternalMGLang.g:451:5: (lv_createdBy_2_1= ruleNodeConstructor | lv_createdBy_2_2= rulePatternCall )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_ID) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMGLang.g:452:6: lv_createdBy_2_1= ruleNodeConstructor
                            {

                            						newCompositeNode(grammarAccess.getNodeAccess().getCreatedByNodeConstructorParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_createdBy_2_1=ruleNodeConstructor();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNodeRule());
                            						}
                            						set(
                            							current,
                            							"createdBy",
                            							lv_createdBy_2_1,
                            							"org.mofgen.MGLang.NodeConstructor");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalMGLang.g:468:6: lv_createdBy_2_2= rulePatternCall
                            {

                            						newCompositeNode(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_createdBy_2_2=rulePatternCall();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNodeRule());
                            						}
                            						set(
                            							current,
                            							"createdBy",
                            							lv_createdBy_2_2,
                            							"org.mofgen.MGLang.PatternCall");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

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


    // $ANTLR start "entryRuleNodeConstructor"
    // InternalMGLang.g:490:1: entryRuleNodeConstructor returns [EObject current=null] : iv_ruleNodeConstructor= ruleNodeConstructor EOF ;
    public final EObject entryRuleNodeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeConstructor = null;


        try {
            // InternalMGLang.g:490:56: (iv_ruleNodeConstructor= ruleNodeConstructor EOF )
            // InternalMGLang.g:491:2: iv_ruleNodeConstructor= ruleNodeConstructor EOF
            {
             newCompositeNode(grammarAccess.getNodeConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeConstructor=ruleNodeConstructor();

            state._fsp--;

             current =iv_ruleNodeConstructor; 
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
    // $ANTLR end "entryRuleNodeConstructor"


    // $ANTLR start "ruleNodeConstructor"
    // InternalMGLang.g:497:1: ruleNodeConstructor returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' ) ;
    public final EObject ruleNodeConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refsAssigns_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:503:2: ( ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' ) )
            // InternalMGLang.g:504:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' )
            {
            // InternalMGLang.g:504:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' )
            // InternalMGLang.g:505:3: () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}'
            {
            // InternalMGLang.g:505:3: ()
            // InternalMGLang.g:506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeConstructorAccess().getNodeConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeConstructorAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMGLang.g:516:3: ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMGLang.g:517:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment )
            	    {
            	    // InternalMGLang.g:517:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment )
            	    // InternalMGLang.g:518:5: lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getNodeConstructorAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_refsAssigns_2_0=ruleNodeReferenceOrAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeConstructorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refsAssigns",
            	    						lv_refsAssigns_2_0,
            	    						"org.mofgen.MGLang.NodeReferenceOrAssignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeConstructorAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNodeConstructor"


    // $ANTLR start "entryRulePatternCall"
    // InternalMGLang.g:543:1: entryRulePatternCall returns [EObject current=null] : iv_rulePatternCall= rulePatternCall EOF ;
    public final EObject entryRulePatternCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternCall = null;


        try {
            // InternalMGLang.g:543:52: (iv_rulePatternCall= rulePatternCall EOF )
            // InternalMGLang.g:544:2: iv_rulePatternCall= rulePatternCall EOF
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
    // InternalMGLang.g:550:1: rulePatternCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleStringExpression ) )* otherlv_3= ')' ) ;
    public final EObject rulePatternCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:556:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleStringExpression ) )* otherlv_3= ')' ) )
            // InternalMGLang.g:557:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleStringExpression ) )* otherlv_3= ')' )
            {
            // InternalMGLang.g:557:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleStringExpression ) )* otherlv_3= ')' )
            // InternalMGLang.g:558:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleStringExpression ) )* otherlv_3= ')'
            {
            // InternalMGLang.g:558:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:559:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:559:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:560:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGLang.g:575:3: ( (lv_params_2_0= ruleStringExpression ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMGLang.g:576:4: (lv_params_2_0= ruleStringExpression )
            	    {
            	    // InternalMGLang.g:576:4: (lv_params_2_0= ruleStringExpression )
            	    // InternalMGLang.g:577:5: lv_params_2_0= ruleStringExpression
            	    {

            	    					newCompositeNode(grammarAccess.getPatternCallAccess().getParamsStringExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_params_2_0=ruleStringExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternCallRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_2_0,
            	    						"org.mofgen.MGLang.StringExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleNodeReferenceOrAssignment"
    // InternalMGLang.g:602:1: entryRuleNodeReferenceOrAssignment returns [EObject current=null] : iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF ;
    public final EObject entryRuleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReferenceOrAssignment = null;


        try {
            // InternalMGLang.g:602:66: (iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF )
            // InternalMGLang.g:603:2: iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF
            {
             newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeReferenceOrAssignment=ruleNodeReferenceOrAssignment();

            state._fsp--;

             current =iv_ruleNodeReferenceOrAssignment; 
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
    // $ANTLR end "entryRuleNodeReferenceOrAssignment"


    // $ANTLR start "ruleNodeReferenceOrAssignment"
    // InternalMGLang.g:609:1: ruleNodeReferenceOrAssignment returns [EObject current=null] : ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleBooleanExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PatternNodeReference_0 = null;

        EObject this_Assignment_1 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:615:2: ( ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleBooleanExpression ) ) otherlv_4= ']' )? ) )
            // InternalMGLang.g:616:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleBooleanExpression ) ) otherlv_4= ']' )? )
            {
            // InternalMGLang.g:616:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleBooleanExpression ) ) otherlv_4= ']' )? )
            // InternalMGLang.g:617:3: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleBooleanExpression ) ) otherlv_4= ']' )?
            {
            // InternalMGLang.g:617:3: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ASSIGNMENT_OP) ) {
                    alt12=2;
                }
                else if ( (LA12_1==26) ) {
                    alt12=1;
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
                    // InternalMGLang.g:618:4: this_PatternNodeReference_0= rulePatternNodeReference
                    {

                    				newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_19);
                    this_PatternNodeReference_0=rulePatternNodeReference();

                    state._fsp--;


                    				current = this_PatternNodeReference_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:627:4: this_Assignment_1= ruleAssignment
                    {

                    				newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;


                    				current = this_Assignment_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMGLang.g:636:3: (otherlv_2= '[' ( (lv_condition_3_0= ruleBooleanExpression ) ) otherlv_4= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:637:4: otherlv_2= '[' ( (lv_condition_3_0= ruleBooleanExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMGLang.g:641:4: ( (lv_condition_3_0= ruleBooleanExpression ) )
                    // InternalMGLang.g:642:5: (lv_condition_3_0= ruleBooleanExpression )
                    {
                    // InternalMGLang.g:642:5: (lv_condition_3_0= ruleBooleanExpression )
                    // InternalMGLang.g:643:6: lv_condition_3_0= ruleBooleanExpression
                    {

                    						newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionBooleanExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_condition_3_0=ruleBooleanExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeReferenceOrAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"org.mofgen.MGLang.BooleanExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleNodeReferenceOrAssignment"


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:669:1: entryRulePatternNodeReference returns [EObject current=null] : iv_rulePatternNodeReference= rulePatternNodeReference EOF ;
    public final EObject entryRulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternNodeReference = null;


        try {
            // InternalMGLang.g:669:61: (iv_rulePatternNodeReference= rulePatternNodeReference EOF )
            // InternalMGLang.g:670:2: iv_rulePatternNodeReference= rulePatternNodeReference EOF
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
    // InternalMGLang.g:676:1: rulePatternNodeReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:682:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:683:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:683:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:684:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:684:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:685:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:685:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:686:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMGLang.g:701:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:702:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:702:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:703:5: otherlv_2= RULE_ID
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
    // InternalMGLang.g:718:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMGLang.g:718:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMGLang.g:719:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalMGLang.g:725:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleStringExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:731:2: ( ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleStringExpression ) ) ) )
            // InternalMGLang.g:732:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleStringExpression ) ) )
            {
            // InternalMGLang.g:732:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleStringExpression ) ) )
            // InternalMGLang.g:733:3: ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleStringExpression ) )
            {
            // InternalMGLang.g:733:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:734:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:734:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:735:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0());
            				

            }


            }

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_5); 

            			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1());
            		
            // InternalMGLang.g:750:3: ( (lv_value_2_0= ruleStringExpression ) )
            // InternalMGLang.g:751:4: (lv_value_2_0= ruleStringExpression )
            {
            // InternalMGLang.g:751:4: (lv_value_2_0= ruleStringExpression )
            // InternalMGLang.g:752:5: lv_value_2_0= ruleStringExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueStringExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleStringExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.mofgen.MGLang.StringExpression");
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


    // $ANTLR start "entryRuleNodeAttributeCall"
    // InternalMGLang.g:773:1: entryRuleNodeAttributeCall returns [EObject current=null] : iv_ruleNodeAttributeCall= ruleNodeAttributeCall EOF ;
    public final EObject entryRuleNodeAttributeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttributeCall = null;


        try {
            // InternalMGLang.g:773:58: (iv_ruleNodeAttributeCall= ruleNodeAttributeCall EOF )
            // InternalMGLang.g:774:2: iv_ruleNodeAttributeCall= ruleNodeAttributeCall EOF
            {
             newCompositeNode(grammarAccess.getNodeAttributeCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeAttributeCall=ruleNodeAttributeCall();

            state._fsp--;

             current =iv_ruleNodeAttributeCall; 
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
    // $ANTLR end "entryRuleNodeAttributeCall"


    // $ANTLR start "ruleNodeAttributeCall"
    // InternalMGLang.g:780:1: ruleNodeAttributeCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleNodeAttributeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:786:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:787:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:787:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:788:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:788:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:789:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:789:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:790:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeAttributeCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeAttributeCallAccess().getNodeNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAttributeCallAccess().getFullStopKeyword_1());
            		
            // InternalMGLang.g:805:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:806:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:806:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:807:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeAttributeCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleNodeAttributeCall"


    // $ANTLR start "entryRuleParameter"
    // InternalMGLang.g:822:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMGLang.g:822:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMGLang.g:823:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMGLang.g:829:1: ruleParameter returns [EObject current=null] : (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ObjectParameter_1= ruleObjectParameter ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveParameter_0 = null;

        EObject this_ObjectParameter_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:835:2: ( (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ObjectParameter_1= ruleObjectParameter ) )
            // InternalMGLang.g:836:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ObjectParameter_1= ruleObjectParameter )
            {
            // InternalMGLang.g:836:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ObjectParameter_1= ruleObjectParameter )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=38 && LA14_0<=40)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMGLang.g:837:3: this_PrimitiveParameter_0= rulePrimitiveParameter
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
                    // InternalMGLang.g:846:3: this_ObjectParameter_1= ruleObjectParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getObjectParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectParameter_1=ruleObjectParameter();

                    state._fsp--;


                    			current = this_ObjectParameter_1;
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
    // InternalMGLang.g:858:1: entryRulePrimitiveParameter returns [EObject current=null] : iv_rulePrimitiveParameter= rulePrimitiveParameter EOF ;
    public final EObject entryRulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveParameter = null;


        try {
            // InternalMGLang.g:858:59: (iv_rulePrimitiveParameter= rulePrimitiveParameter EOF )
            // InternalMGLang.g:859:2: iv_rulePrimitiveParameter= rulePrimitiveParameter EOF
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
    // InternalMGLang.g:865:1: rulePrimitiveParameter returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:871:2: ( ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:872:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:872:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:873:3: ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:873:3: ( (lv_type_0_0= rulePrimitiveType ) )
            // InternalMGLang.g:874:4: (lv_type_0_0= rulePrimitiveType )
            {
            // InternalMGLang.g:874:4: (lv_type_0_0= rulePrimitiveType )
            // InternalMGLang.g:875:5: lv_type_0_0= rulePrimitiveType
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

            // InternalMGLang.g:892:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:893:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:893:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:894:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleObjectParameter"
    // InternalMGLang.g:914:1: entryRuleObjectParameter returns [EObject current=null] : iv_ruleObjectParameter= ruleObjectParameter EOF ;
    public final EObject entryRuleObjectParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectParameter = null;


        try {
            // InternalMGLang.g:914:56: (iv_ruleObjectParameter= ruleObjectParameter EOF )
            // InternalMGLang.g:915:2: iv_ruleObjectParameter= ruleObjectParameter EOF
            {
             newCompositeNode(grammarAccess.getObjectParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectParameter=ruleObjectParameter();

            state._fsp--;

             current =iv_ruleObjectParameter; 
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
    // $ANTLR end "entryRuleObjectParameter"


    // $ANTLR start "ruleObjectParameter"
    // InternalMGLang.g:921:1: ruleObjectParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:927:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:928:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:928:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:929:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:929:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:930:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:930:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:931:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectParameterAccess().getTypeEClassifierCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:942:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:943:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:943:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:944:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectParameterRule());
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
    // $ANTLR end "ruleObjectParameter"


    // $ANTLR start "entryRuleParameterOrMethodCall"
    // InternalMGLang.g:964:1: entryRuleParameterOrMethodCall returns [EObject current=null] : iv_ruleParameterOrMethodCall= ruleParameterOrMethodCall EOF ;
    public final EObject entryRuleParameterOrMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOrMethodCall = null;


        try {
            // InternalMGLang.g:964:62: (iv_ruleParameterOrMethodCall= ruleParameterOrMethodCall EOF )
            // InternalMGLang.g:965:2: iv_ruleParameterOrMethodCall= ruleParameterOrMethodCall EOF
            {
             newCompositeNode(grammarAccess.getParameterOrMethodCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterOrMethodCall=ruleParameterOrMethodCall();

            state._fsp--;

             current =iv_ruleParameterOrMethodCall; 
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
    // $ANTLR end "entryRuleParameterOrMethodCall"


    // $ANTLR start "ruleParameterOrMethodCall"
    // InternalMGLang.g:971:1: ruleParameterOrMethodCall returns [EObject current=null] : (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall ) ;
    public final EObject ruleParameterOrMethodCall() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterRef_0 = null;

        EObject this_MethodCall_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:977:2: ( (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall ) )
            // InternalMGLang.g:978:2: (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall )
            {
            // InternalMGLang.g:978:2: (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||LA15_1==18||LA15_1==25||(LA15_1>=27 && LA15_1<=29)||(LA15_1>=41 && LA15_1<=46)) ) {
                    alt15=1;
                }
                else if ( (LA15_1==23) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:979:3: this_ParameterRef_0= ruleParameterRef
                    {

                    			newCompositeNode(grammarAccess.getParameterOrMethodCallAccess().getParameterRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterRef_0=ruleParameterRef();

                    state._fsp--;


                    			current = this_ParameterRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:988:3: this_MethodCall_1= ruleMethodCall
                    {

                    			newCompositeNode(grammarAccess.getParameterOrMethodCallAccess().getMethodCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodCall_1=ruleMethodCall();

                    state._fsp--;


                    			current = this_MethodCall_1;
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
    // $ANTLR end "ruleParameterOrMethodCall"


    // $ANTLR start "entryRuleParameterRef"
    // InternalMGLang.g:1000:1: entryRuleParameterRef returns [EObject current=null] : iv_ruleParameterRef= ruleParameterRef EOF ;
    public final EObject entryRuleParameterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRef = null;


        try {
            // InternalMGLang.g:1000:53: (iv_ruleParameterRef= ruleParameterRef EOF )
            // InternalMGLang.g:1001:2: iv_ruleParameterRef= ruleParameterRef EOF
            {
             newCompositeNode(grammarAccess.getParameterRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterRef=ruleParameterRef();

            state._fsp--;

             current =iv_ruleParameterRef; 
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
    // $ANTLR end "entryRuleParameterRef"


    // $ANTLR start "ruleParameterRef"
    // InternalMGLang.g:1007:1: ruleParameterRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1013:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMGLang.g:1014:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMGLang.g:1014:2: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1015:3: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1015:3: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1016:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0());
            			

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
    // $ANTLR end "ruleParameterRef"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMGLang.g:1030:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalMGLang.g:1030:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalMGLang.g:1031:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMGLang.g:1037:1: ruleMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:1043:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:1044:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:1044:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:1045:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:1045:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1046:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1046:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1047:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getCalledNodeNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getFullStopKeyword_1());
            		
            // InternalMGLang.g:1062:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:1063:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:1063:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:1064:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getMethodCallAccess().getMethodEOperationCrossReference_2_0());
            				

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalMGLang.g:1079:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalMGLang.g:1079:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalMGLang.g:1080:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalMGLang.g:1086:1: ruleBooleanExpression returns [EObject current=null] : this_BooleanOr_0= ruleBooleanOr ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanOr_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1092:2: (this_BooleanOr_0= ruleBooleanOr )
            // InternalMGLang.g:1093:2: this_BooleanOr_0= ruleBooleanOr
            {

            		newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BooleanOr_0=ruleBooleanOr();

            state._fsp--;


            		current = this_BooleanOr_0;
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleRelationExpression"
    // InternalMGLang.g:1104:1: entryRuleRelationExpression returns [EObject current=null] : iv_ruleRelationExpression= ruleRelationExpression EOF ;
    public final EObject entryRuleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationExpression = null;


        try {
            // InternalMGLang.g:1104:59: (iv_ruleRelationExpression= ruleRelationExpression EOF )
            // InternalMGLang.g:1105:2: iv_ruleRelationExpression= ruleRelationExpression EOF
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
    // InternalMGLang.g:1111:1: ruleRelationExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleParameterOrMethodCall ) ) ( (lv_relation_1_0= ruleRelationalOp ) ) ( (lv_rhs_2_0= ruleParameterOrMethodCall ) ) ) ;
    public final EObject ruleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_relation_1_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1117:2: ( ( ( (lv_lhs_0_0= ruleParameterOrMethodCall ) ) ( (lv_relation_1_0= ruleRelationalOp ) ) ( (lv_rhs_2_0= ruleParameterOrMethodCall ) ) ) )
            // InternalMGLang.g:1118:2: ( ( (lv_lhs_0_0= ruleParameterOrMethodCall ) ) ( (lv_relation_1_0= ruleRelationalOp ) ) ( (lv_rhs_2_0= ruleParameterOrMethodCall ) ) )
            {
            // InternalMGLang.g:1118:2: ( ( (lv_lhs_0_0= ruleParameterOrMethodCall ) ) ( (lv_relation_1_0= ruleRelationalOp ) ) ( (lv_rhs_2_0= ruleParameterOrMethodCall ) ) )
            // InternalMGLang.g:1119:3: ( (lv_lhs_0_0= ruleParameterOrMethodCall ) ) ( (lv_relation_1_0= ruleRelationalOp ) ) ( (lv_rhs_2_0= ruleParameterOrMethodCall ) )
            {
            // InternalMGLang.g:1119:3: ( (lv_lhs_0_0= ruleParameterOrMethodCall ) )
            // InternalMGLang.g:1120:4: (lv_lhs_0_0= ruleParameterOrMethodCall )
            {
            // InternalMGLang.g:1120:4: (lv_lhs_0_0= ruleParameterOrMethodCall )
            // InternalMGLang.g:1121:5: lv_lhs_0_0= ruleParameterOrMethodCall
            {

            					newCompositeNode(grammarAccess.getRelationExpressionAccess().getLhsParameterOrMethodCallParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_lhs_0_0=ruleParameterOrMethodCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.mofgen.MGLang.ParameterOrMethodCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:1138:3: ( (lv_relation_1_0= ruleRelationalOp ) )
            // InternalMGLang.g:1139:4: (lv_relation_1_0= ruleRelationalOp )
            {
            // InternalMGLang.g:1139:4: (lv_relation_1_0= ruleRelationalOp )
            // InternalMGLang.g:1140:5: lv_relation_1_0= ruleRelationalOp
            {

            					newCompositeNode(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_relation_1_0=ruleRelationalOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            					}
            					set(
            						current,
            						"relation",
            						lv_relation_1_0,
            						"org.mofgen.MGLang.RelationalOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:1157:3: ( (lv_rhs_2_0= ruleParameterOrMethodCall ) )
            // InternalMGLang.g:1158:4: (lv_rhs_2_0= ruleParameterOrMethodCall )
            {
            // InternalMGLang.g:1158:4: (lv_rhs_2_0= ruleParameterOrMethodCall )
            // InternalMGLang.g:1159:5: lv_rhs_2_0= ruleParameterOrMethodCall
            {

            					newCompositeNode(grammarAccess.getRelationExpressionAccess().getRhsParameterOrMethodCallParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rhs_2_0=ruleParameterOrMethodCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_2_0,
            						"org.mofgen.MGLang.ParameterOrMethodCall");
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
    // $ANTLR end "ruleRelationExpression"


    // $ANTLR start "entryRuleBooleanOr"
    // InternalMGLang.g:1180:1: entryRuleBooleanOr returns [EObject current=null] : iv_ruleBooleanOr= ruleBooleanOr EOF ;
    public final EObject entryRuleBooleanOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOr = null;


        try {
            // InternalMGLang.g:1180:50: (iv_ruleBooleanOr= ruleBooleanOr EOF )
            // InternalMGLang.g:1181:2: iv_ruleBooleanOr= ruleBooleanOr EOF
            {
             newCompositeNode(grammarAccess.getBooleanOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOr=ruleBooleanOr();

            state._fsp--;

             current =iv_ruleBooleanOr; 
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
    // $ANTLR end "entryRuleBooleanOr"


    // $ANTLR start "ruleBooleanOr"
    // InternalMGLang.g:1187:1: ruleBooleanOr returns [EObject current=null] : (this_BooleanXor_0= ruleBooleanXor ( () otherlv_2= '||' ( (lv_right_3_0= ruleBooleanXor ) ) )* ) ;
    public final EObject ruleBooleanOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanXor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1193:2: ( (this_BooleanXor_0= ruleBooleanXor ( () otherlv_2= '||' ( (lv_right_3_0= ruleBooleanXor ) ) )* ) )
            // InternalMGLang.g:1194:2: (this_BooleanXor_0= ruleBooleanXor ( () otherlv_2= '||' ( (lv_right_3_0= ruleBooleanXor ) ) )* )
            {
            // InternalMGLang.g:1194:2: (this_BooleanXor_0= ruleBooleanXor ( () otherlv_2= '||' ( (lv_right_3_0= ruleBooleanXor ) ) )* )
            // InternalMGLang.g:1195:3: this_BooleanXor_0= ruleBooleanXor ( () otherlv_2= '||' ( (lv_right_3_0= ruleBooleanXor ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanOrAccess().getBooleanXorParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_BooleanXor_0=ruleBooleanXor();

            state._fsp--;


            			current = this_BooleanXor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:1203:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleBooleanXor ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMGLang.g:1204:4: () otherlv_2= '||' ( (lv_right_3_0= ruleBooleanXor ) )
            	    {
            	    // InternalMGLang.g:1204:4: ()
            	    // InternalMGLang.g:1205:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBooleanOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBooleanOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalMGLang.g:1215:4: ( (lv_right_3_0= ruleBooleanXor ) )
            	    // InternalMGLang.g:1216:5: (lv_right_3_0= ruleBooleanXor )
            	    {
            	    // InternalMGLang.g:1216:5: (lv_right_3_0= ruleBooleanXor )
            	    // InternalMGLang.g:1217:6: lv_right_3_0= ruleBooleanXor
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanOrAccess().getRightBooleanXorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleBooleanXor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.mofgen.MGLang.BooleanXor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleBooleanOr"


    // $ANTLR start "entryRuleBooleanXor"
    // InternalMGLang.g:1239:1: entryRuleBooleanXor returns [EObject current=null] : iv_ruleBooleanXor= ruleBooleanXor EOF ;
    public final EObject entryRuleBooleanXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanXor = null;


        try {
            // InternalMGLang.g:1239:51: (iv_ruleBooleanXor= ruleBooleanXor EOF )
            // InternalMGLang.g:1240:2: iv_ruleBooleanXor= ruleBooleanXor EOF
            {
             newCompositeNode(grammarAccess.getBooleanXorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanXor=ruleBooleanXor();

            state._fsp--;

             current =iv_ruleBooleanXor; 
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
    // $ANTLR end "entryRuleBooleanXor"


    // $ANTLR start "ruleBooleanXor"
    // InternalMGLang.g:1246:1: ruleBooleanXor returns [EObject current=null] : (this_BooleanAnd_0= ruleBooleanAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBooleanAnd ) ) )* ) ;
    public final EObject ruleBooleanXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanAnd_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1252:2: ( (this_BooleanAnd_0= ruleBooleanAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBooleanAnd ) ) )* ) )
            // InternalMGLang.g:1253:2: (this_BooleanAnd_0= ruleBooleanAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBooleanAnd ) ) )* )
            {
            // InternalMGLang.g:1253:2: (this_BooleanAnd_0= ruleBooleanAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBooleanAnd ) ) )* )
            // InternalMGLang.g:1254:3: this_BooleanAnd_0= ruleBooleanAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBooleanAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanXorAccess().getBooleanAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_BooleanAnd_0=ruleBooleanAnd();

            state._fsp--;


            			current = this_BooleanAnd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:1262:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBooleanAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMGLang.g:1263:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBooleanAnd ) )
            	    {
            	    // InternalMGLang.g:1263:4: ()
            	    // InternalMGLang.g:1264:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBooleanXorAccess().getXorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBooleanXorAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalMGLang.g:1274:4: ( (lv_right_3_0= ruleBooleanAnd ) )
            	    // InternalMGLang.g:1275:5: (lv_right_3_0= ruleBooleanAnd )
            	    {
            	    // InternalMGLang.g:1275:5: (lv_right_3_0= ruleBooleanAnd )
            	    // InternalMGLang.g:1276:6: lv_right_3_0= ruleBooleanAnd
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanXorAccess().getRightBooleanAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleBooleanAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanXorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.mofgen.MGLang.BooleanAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleBooleanXor"


    // $ANTLR start "entryRuleBooleanAnd"
    // InternalMGLang.g:1298:1: entryRuleBooleanAnd returns [EObject current=null] : iv_ruleBooleanAnd= ruleBooleanAnd EOF ;
    public final EObject entryRuleBooleanAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAnd = null;


        try {
            // InternalMGLang.g:1298:51: (iv_ruleBooleanAnd= ruleBooleanAnd EOF )
            // InternalMGLang.g:1299:2: iv_ruleBooleanAnd= ruleBooleanAnd EOF
            {
             newCompositeNode(grammarAccess.getBooleanAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanAnd=ruleBooleanAnd();

            state._fsp--;

             current =iv_ruleBooleanAnd; 
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
    // $ANTLR end "entryRuleBooleanAnd"


    // $ANTLR start "ruleBooleanAnd"
    // InternalMGLang.g:1305:1: ruleBooleanAnd returns [EObject current=null] : (this_BaseBoolean_0= ruleBaseBoolean ( () otherlv_2= '&&' ( (lv_right_3_0= ruleBaseBoolean ) ) )* ) ;
    public final EObject ruleBooleanAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BaseBoolean_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1311:2: ( (this_BaseBoolean_0= ruleBaseBoolean ( () otherlv_2= '&&' ( (lv_right_3_0= ruleBaseBoolean ) ) )* ) )
            // InternalMGLang.g:1312:2: (this_BaseBoolean_0= ruleBaseBoolean ( () otherlv_2= '&&' ( (lv_right_3_0= ruleBaseBoolean ) ) )* )
            {
            // InternalMGLang.g:1312:2: (this_BaseBoolean_0= ruleBaseBoolean ( () otherlv_2= '&&' ( (lv_right_3_0= ruleBaseBoolean ) ) )* )
            // InternalMGLang.g:1313:3: this_BaseBoolean_0= ruleBaseBoolean ( () otherlv_2= '&&' ( (lv_right_3_0= ruleBaseBoolean ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanAndAccess().getBaseBooleanParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_BaseBoolean_0=ruleBaseBoolean();

            state._fsp--;


            			current = this_BaseBoolean_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:1321:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleBaseBoolean ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMGLang.g:1322:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleBaseBoolean ) )
            	    {
            	    // InternalMGLang.g:1322:4: ()
            	    // InternalMGLang.g:1323:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBooleanAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBooleanAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalMGLang.g:1333:4: ( (lv_right_3_0= ruleBaseBoolean ) )
            	    // InternalMGLang.g:1334:5: (lv_right_3_0= ruleBaseBoolean )
            	    {
            	    // InternalMGLang.g:1334:5: (lv_right_3_0= ruleBaseBoolean )
            	    // InternalMGLang.g:1335:6: lv_right_3_0= ruleBaseBoolean
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanAndAccess().getRightBaseBooleanParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleBaseBoolean();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.mofgen.MGLang.BaseBoolean");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleBooleanAnd"


    // $ANTLR start "entryRuleBaseBoolean"
    // InternalMGLang.g:1357:1: entryRuleBaseBoolean returns [EObject current=null] : iv_ruleBaseBoolean= ruleBaseBoolean EOF ;
    public final EObject entryRuleBaseBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseBoolean = null;


        try {
            // InternalMGLang.g:1357:52: (iv_ruleBaseBoolean= ruleBaseBoolean EOF )
            // InternalMGLang.g:1358:2: iv_ruleBaseBoolean= ruleBaseBoolean EOF
            {
             newCompositeNode(grammarAccess.getBaseBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseBoolean=ruleBaseBoolean();

            state._fsp--;

             current =iv_ruleBaseBoolean; 
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
    // $ANTLR end "entryRuleBaseBoolean"


    // $ANTLR start "ruleBaseBoolean"
    // InternalMGLang.g:1364:1: ruleBaseBoolean returns [EObject current=null] : ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleBooleanExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' this_BooleanExpression_6= ruleBooleanExpression otherlv_7= ')' ) | ( () ( (lv_value_9_0= ruleBoolean ) ) ) | this_RelationExpression_10= ruleRelationExpression ) ;
    public final EObject ruleBaseBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expr_3_0 = null;

        EObject this_BooleanExpression_6 = null;

        Enumerator lv_value_9_0 = null;

        EObject this_RelationExpression_10 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1370:2: ( ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleBooleanExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' this_BooleanExpression_6= ruleBooleanExpression otherlv_7= ')' ) | ( () ( (lv_value_9_0= ruleBoolean ) ) ) | this_RelationExpression_10= ruleRelationExpression ) )
            // InternalMGLang.g:1371:2: ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleBooleanExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' this_BooleanExpression_6= ruleBooleanExpression otherlv_7= ')' ) | ( () ( (lv_value_9_0= ruleBoolean ) ) ) | this_RelationExpression_10= ruleRelationExpression )
            {
            // InternalMGLang.g:1371:2: ( ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleBooleanExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' this_BooleanExpression_6= ruleBooleanExpression otherlv_7= ')' ) | ( () ( (lv_value_9_0= ruleBoolean ) ) ) | this_RelationExpression_10= ruleRelationExpression )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt19=1;
                }
                break;
            case 16:
                {
                alt19=2;
                }
                break;
            case 36:
            case 37:
                {
                alt19=3;
                }
                break;
            case RULE_ID:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMGLang.g:1372:3: ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleBooleanExpression ) ) otherlv_4= ')' )
                    {
                    // InternalMGLang.g:1372:3: ( () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleBooleanExpression ) ) otherlv_4= ')' )
                    // InternalMGLang.g:1373:4: () otherlv_1= '!' otherlv_2= '(' ( (lv_expr_3_0= ruleBooleanExpression ) ) otherlv_4= ')'
                    {
                    // InternalMGLang.g:1373:4: ()
                    // InternalMGLang.g:1374:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBaseBooleanAccess().getNegatedBooleanAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getBaseBooleanAccess().getExclamationMarkKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getBaseBooleanAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMGLang.g:1388:4: ( (lv_expr_3_0= ruleBooleanExpression ) )
                    // InternalMGLang.g:1389:5: (lv_expr_3_0= ruleBooleanExpression )
                    {
                    // InternalMGLang.g:1389:5: (lv_expr_3_0= ruleBooleanExpression )
                    // InternalMGLang.g:1390:6: lv_expr_3_0= ruleBooleanExpression
                    {

                    						newCompositeNode(grammarAccess.getBaseBooleanAccess().getExprBooleanExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_expr_3_0=ruleBooleanExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseBooleanRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"org.mofgen.MGLang.BooleanExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseBooleanAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1413:3: (otherlv_5= '(' this_BooleanExpression_6= ruleBooleanExpression otherlv_7= ')' )
                    {
                    // InternalMGLang.g:1413:3: (otherlv_5= '(' this_BooleanExpression_6= ruleBooleanExpression otherlv_7= ')' )
                    // InternalMGLang.g:1414:4: otherlv_5= '(' this_BooleanExpression_6= ruleBooleanExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getBaseBooleanAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseBooleanAccess().getBooleanExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_BooleanExpression_6=ruleBooleanExpression();

                    state._fsp--;


                    				current = this_BooleanExpression_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getBaseBooleanAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1432:3: ( () ( (lv_value_9_0= ruleBoolean ) ) )
                    {
                    // InternalMGLang.g:1432:3: ( () ( (lv_value_9_0= ruleBoolean ) ) )
                    // InternalMGLang.g:1433:4: () ( (lv_value_9_0= ruleBoolean ) )
                    {
                    // InternalMGLang.g:1433:4: ()
                    // InternalMGLang.g:1434:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBaseBooleanAccess().getBooleanLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMGLang.g:1440:4: ( (lv_value_9_0= ruleBoolean ) )
                    // InternalMGLang.g:1441:5: (lv_value_9_0= ruleBoolean )
                    {
                    // InternalMGLang.g:1441:5: (lv_value_9_0= ruleBoolean )
                    // InternalMGLang.g:1442:6: lv_value_9_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getBaseBooleanAccess().getValueBooleanEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_9_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseBooleanRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"org.mofgen.MGLang.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1461:3: this_RelationExpression_10= ruleRelationExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseBooleanAccess().getRelationExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationExpression_10=ruleRelationExpression();

                    state._fsp--;


                    			current = this_RelationExpression_10;
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
    // $ANTLR end "ruleBaseBoolean"


    // $ANTLR start "entryRuleStringExpression"
    // InternalMGLang.g:1473:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalMGLang.g:1473:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalMGLang.g:1474:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalMGLang.g:1480:1: ruleStringExpression returns [EObject current=null] : this_StringConcatenation_0= ruleStringConcatenation ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringConcatenation_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1486:2: (this_StringConcatenation_0= ruleStringConcatenation )
            // InternalMGLang.g:1487:2: this_StringConcatenation_0= ruleStringConcatenation
            {

            		newCompositeNode(grammarAccess.getStringExpressionAccess().getStringConcatenationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_StringConcatenation_0=ruleStringConcatenation();

            state._fsp--;


            		current = this_StringConcatenation_0;
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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleStringConcatenation"
    // InternalMGLang.g:1498:1: entryRuleStringConcatenation returns [EObject current=null] : iv_ruleStringConcatenation= ruleStringConcatenation EOF ;
    public final EObject entryRuleStringConcatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConcatenation = null;


        try {
            // InternalMGLang.g:1498:60: (iv_ruleStringConcatenation= ruleStringConcatenation EOF )
            // InternalMGLang.g:1499:2: iv_ruleStringConcatenation= ruleStringConcatenation EOF
            {
             newCompositeNode(grammarAccess.getStringConcatenationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringConcatenation=ruleStringConcatenation();

            state._fsp--;

             current =iv_ruleStringConcatenation; 
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
    // $ANTLR end "entryRuleStringConcatenation"


    // $ANTLR start "ruleStringConcatenation"
    // InternalMGLang.g:1505:1: ruleStringConcatenation returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringConcatenation ) ) )? ) ;
    public final EObject ruleStringConcatenation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_StringLiteral_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1511:2: ( (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringConcatenation ) ) )? ) )
            // InternalMGLang.g:1512:2: (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringConcatenation ) ) )? )
            {
            // InternalMGLang.g:1512:2: (this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringConcatenation ) ) )? )
            // InternalMGLang.g:1513:3: this_StringLiteral_0= ruleStringLiteral ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringConcatenation ) ) )?
            {

            			newCompositeNode(grammarAccess.getStringConcatenationAccess().getStringLiteralParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_StringLiteral_0=ruleStringLiteral();

            state._fsp--;


            			current = this_StringLiteral_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:1521:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringConcatenation ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMGLang.g:1522:4: () otherlv_2= '+' ( (lv_right_3_0= ruleStringConcatenation ) )
                    {
                    // InternalMGLang.g:1522:4: ()
                    // InternalMGLang.g:1523:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getStringConcatenationAccess().getConcatLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringConcatenationAccess().getPlusSignKeyword_1_1());
                    			
                    // InternalMGLang.g:1533:4: ( (lv_right_3_0= ruleStringConcatenation ) )
                    // InternalMGLang.g:1534:5: (lv_right_3_0= ruleStringConcatenation )
                    {
                    // InternalMGLang.g:1534:5: (lv_right_3_0= ruleStringConcatenation )
                    // InternalMGLang.g:1535:6: lv_right_3_0= ruleStringConcatenation
                    {

                    						newCompositeNode(grammarAccess.getStringConcatenationAccess().getRightStringConcatenationParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleStringConcatenation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringConcatenationRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.mofgen.MGLang.StringConcatenation");
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
    // $ANTLR end "ruleStringConcatenation"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMGLang.g:1557:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMGLang.g:1557:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMGLang.g:1558:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMGLang.g:1564:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1570:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMGLang.g:1571:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMGLang.g:1571:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMGLang.g:1572:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMGLang.g:1572:3: (lv_value_0_0= RULE_STRING )
            // InternalMGLang.g:1573:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
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


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:1592:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalMGLang.g:1592:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalMGLang.g:1593:2: iv_ruleGenerator= ruleGenerator EOF
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
    // InternalMGLang.g:1599:1: ruleGenerator returns [EObject current=null] : ( () otherlv_1= 'gen' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1605:2: ( ( () otherlv_1= 'gen' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' ) )
            // InternalMGLang.g:1606:2: ( () otherlv_1= 'gen' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' )
            {
            // InternalMGLang.g:1606:2: ( () otherlv_1= 'gen' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' )
            // InternalMGLang.g:1607:3: () otherlv_1= 'gen' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}'
            {
            // InternalMGLang.g:1607:3: ()
            // InternalMGLang.g:1608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeneratorAccess().getGeneratorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getGenKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMGLang.g:1630:3: ( (lv_commands_5_0= ruleGeneratorElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:1631:4: (lv_commands_5_0= ruleGeneratorElement )
            	    {
            	    // InternalMGLang.g:1631:4: (lv_commands_5_0= ruleGeneratorElement )
            	    // InternalMGLang.g:1632:5: lv_commands_5_0= ruleGeneratorElement
            	    {

            	    					newCompositeNode(grammarAccess.getGeneratorAccess().getCommandsGeneratorElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_commands_5_0=ruleGeneratorElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_5_0,
            	    						"org.mofgen.MGLang.GeneratorElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleGeneratorElement"
    // InternalMGLang.g:1657:1: entryRuleGeneratorElement returns [EObject current=null] : iv_ruleGeneratorElement= ruleGeneratorElement EOF ;
    public final EObject entryRuleGeneratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorElement = null;


        try {
            // InternalMGLang.g:1657:57: (iv_ruleGeneratorElement= ruleGeneratorElement EOF )
            // InternalMGLang.g:1658:2: iv_ruleGeneratorElement= ruleGeneratorElement EOF
            {
             newCompositeNode(grammarAccess.getGeneratorElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneratorElement=ruleGeneratorElement();

            state._fsp--;

             current =iv_ruleGeneratorElement; 
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
    // $ANTLR end "entryRuleGeneratorElement"


    // $ANTLR start "ruleGeneratorElement"
    // InternalMGLang.g:1664:1: ruleGeneratorElement returns [EObject current=null] : (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop ) ;
    public final EObject ruleGeneratorElement() throws RecognitionException {
        EObject current = null;

        EObject this_GeneratorCommand_0 = null;

        EObject this_ForLoop_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1670:2: ( (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop ) )
            // InternalMGLang.g:1671:2: (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop )
            {
            // InternalMGLang.g:1671:2: (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMGLang.g:1672:3: this_GeneratorCommand_0= ruleGeneratorCommand
                    {

                    			newCompositeNode(grammarAccess.getGeneratorElementAccess().getGeneratorCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneratorCommand_0=ruleGeneratorCommand();

                    state._fsp--;


                    			current = this_GeneratorCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1681:3: this_ForLoop_1= ruleForLoop
                    {

                    			newCompositeNode(grammarAccess.getGeneratorElementAccess().getForLoopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForLoop_1=ruleForLoop();

                    state._fsp--;


                    			current = this_ForLoop_1;
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
    // $ANTLR end "ruleGeneratorElement"


    // $ANTLR start "entryRuleGeneratorCommand"
    // InternalMGLang.g:1693:1: entryRuleGeneratorCommand returns [EObject current=null] : iv_ruleGeneratorCommand= ruleGeneratorCommand EOF ;
    public final EObject entryRuleGeneratorCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorCommand = null;


        try {
            // InternalMGLang.g:1693:57: (iv_ruleGeneratorCommand= ruleGeneratorCommand EOF )
            // InternalMGLang.g:1694:2: iv_ruleGeneratorCommand= ruleGeneratorCommand EOF
            {
             newCompositeNode(grammarAccess.getGeneratorCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneratorCommand=ruleGeneratorCommand();

            state._fsp--;

             current =iv_ruleGeneratorCommand; 
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
    // $ANTLR end "entryRuleGeneratorCommand"


    // $ANTLR start "ruleGeneratorCommand"
    // InternalMGLang.g:1700:1: ruleGeneratorCommand returns [EObject current=null] : (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation ) ;
    public final EObject ruleGeneratorCommand() throws RecognitionException {
        EObject current = null;

        EObject this_PatternCall_0 = null;

        EObject this_PatternObjectCreation_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1706:2: ( (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation ) )
            // InternalMGLang.g:1707:2: (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation )
            {
            // InternalMGLang.g:1707:2: (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_ID) ) {
                    alt23=2;
                }
                else if ( (LA23_1==16) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:1708:3: this_PatternCall_0= rulePatternCall
                    {

                    			newCompositeNode(grammarAccess.getGeneratorCommandAccess().getPatternCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternCall_0=rulePatternCall();

                    state._fsp--;


                    			current = this_PatternCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1717:3: this_PatternObjectCreation_1= rulePatternObjectCreation
                    {

                    			newCompositeNode(grammarAccess.getGeneratorCommandAccess().getPatternObjectCreationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternObjectCreation_1=rulePatternObjectCreation();

                    state._fsp--;


                    			current = this_PatternObjectCreation_1;
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
    // $ANTLR end "ruleGeneratorCommand"


    // $ANTLR start "entryRulePatternObjectCreation"
    // InternalMGLang.g:1729:1: entryRulePatternObjectCreation returns [EObject current=null] : iv_rulePatternObjectCreation= rulePatternObjectCreation EOF ;
    public final EObject entryRulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObjectCreation = null;


        try {
            // InternalMGLang.g:1729:62: (iv_rulePatternObjectCreation= rulePatternObjectCreation EOF )
            // InternalMGLang.g:1730:2: iv_rulePatternObjectCreation= rulePatternObjectCreation EOF
            {
             newCompositeNode(grammarAccess.getPatternObjectCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternObjectCreation=rulePatternObjectCreation();

            state._fsp--;

             current =iv_rulePatternObjectCreation; 
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
    // $ANTLR end "entryRulePatternObjectCreation"


    // $ANTLR start "rulePatternObjectCreation"
    // InternalMGLang.g:1736:1: rulePatternObjectCreation returns [EObject current=null] : ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) ;
    public final EObject rulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_pObject_0_0 = null;

        EObject lv_patternCall_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1742:2: ( ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) )
            // InternalMGLang.g:1743:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            {
            // InternalMGLang.g:1743:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            // InternalMGLang.g:1744:3: ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) )
            {
            // InternalMGLang.g:1744:3: ( (lv_pObject_0_0= rulePatternObject ) )
            // InternalMGLang.g:1745:4: (lv_pObject_0_0= rulePatternObject )
            {
            // InternalMGLang.g:1745:4: (lv_pObject_0_0= rulePatternObject )
            // InternalMGLang.g:1746:5: lv_pObject_0_0= rulePatternObject
            {

            					newCompositeNode(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_pObject_0_0=rulePatternObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternObjectCreationRule());
            					}
            					set(
            						current,
            						"pObject",
            						lv_pObject_0_0,
            						"org.mofgen.MGLang.PatternObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_32); 

            			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1());
            		
            // InternalMGLang.g:1767:3: ( (lv_patternCall_2_0= rulePatternCall ) )
            // InternalMGLang.g:1768:4: (lv_patternCall_2_0= rulePatternCall )
            {
            // InternalMGLang.g:1768:4: (lv_patternCall_2_0= rulePatternCall )
            // InternalMGLang.g:1769:5: lv_patternCall_2_0= rulePatternCall
            {

            					newCompositeNode(grammarAccess.getPatternObjectCreationAccess().getPatternCallPatternCallParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_patternCall_2_0=rulePatternCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternObjectCreationRule());
            					}
            					set(
            						current,
            						"patternCall",
            						lv_patternCall_2_0,
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
    // $ANTLR end "rulePatternObjectCreation"


    // $ANTLR start "entryRulePatternObject"
    // InternalMGLang.g:1790:1: entryRulePatternObject returns [EObject current=null] : iv_rulePatternObject= rulePatternObject EOF ;
    public final EObject entryRulePatternObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObject = null;


        try {
            // InternalMGLang.g:1790:54: (iv_rulePatternObject= rulePatternObject EOF )
            // InternalMGLang.g:1791:2: iv_rulePatternObject= rulePatternObject EOF
            {
             newCompositeNode(grammarAccess.getPatternObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternObject=rulePatternObject();

            state._fsp--;

             current =iv_rulePatternObject; 
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
    // $ANTLR end "entryRulePatternObject"


    // $ANTLR start "rulePatternObject"
    // InternalMGLang.g:1797:1: rulePatternObject returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePatternObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1803:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1804:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1804:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:1805:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:1805:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1806:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1806:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1807:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternObjectRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1818:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1819:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1819:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1820:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatternObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternObjectRule());
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
    // $ANTLR end "rulePatternObject"


    // $ANTLR start "entryRuleForLoop"
    // InternalMGLang.g:1840:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalMGLang.g:1840:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalMGLang.g:1841:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalMGLang.g:1847:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iteratorVar_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_iteratingCondition_3_0 = null;

        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1853:2: ( (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' ) )
            // InternalMGLang.g:1854:2: (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' )
            {
            // InternalMGLang.g:1854:2: (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' )
            // InternalMGLang.g:1855:3: otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
            		
            // InternalMGLang.g:1859:3: ( (lv_iteratorVar_1_0= RULE_ID ) )
            // InternalMGLang.g:1860:4: (lv_iteratorVar_1_0= RULE_ID )
            {
            // InternalMGLang.g:1860:4: (lv_iteratorVar_1_0= RULE_ID )
            // InternalMGLang.g:1861:5: lv_iteratorVar_1_0= RULE_ID
            {
            lv_iteratorVar_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_iteratorVar_1_0, grammarAccess.getForLoopAccess().getIteratorVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iteratorVar",
            						lv_iteratorVar_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getInKeyword_2());
            		
            // InternalMGLang.g:1881:3: ( (lv_iteratingCondition_3_0= ruleForCondition ) )
            // InternalMGLang.g:1882:4: (lv_iteratingCondition_3_0= ruleForCondition )
            {
            // InternalMGLang.g:1882:4: (lv_iteratingCondition_3_0= ruleForCondition )
            // InternalMGLang.g:1883:5: lv_iteratingCondition_3_0= ruleForCondition
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getIteratingConditionForConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_iteratingCondition_3_0=ruleForCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForLoopRule());
            					}
            					set(
            						current,
            						"iteratingCondition",
            						lv_iteratingCondition_3_0,
            						"org.mofgen.MGLang.ForCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMGLang.g:1904:3: ( (lv_commands_5_0= ruleGeneratorCommand ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:1905:4: (lv_commands_5_0= ruleGeneratorCommand )
            	    {
            	    // InternalMGLang.g:1905:4: (lv_commands_5_0= ruleGeneratorCommand )
            	    // InternalMGLang.g:1906:5: lv_commands_5_0= ruleGeneratorCommand
            	    {

            	    					newCompositeNode(grammarAccess.getForLoopAccess().getCommandsGeneratorCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_commands_5_0=ruleGeneratorCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_5_0,
            	    						"org.mofgen.MGLang.GeneratorCommand");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleForCondition"
    // InternalMGLang.g:1931:1: entryRuleForCondition returns [EObject current=null] : iv_ruleForCondition= ruleForCondition EOF ;
    public final EObject entryRuleForCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCondition = null;


        try {
            // InternalMGLang.g:1931:53: (iv_ruleForCondition= ruleForCondition EOF )
            // InternalMGLang.g:1932:2: iv_ruleForCondition= ruleForCondition EOF
            {
             newCompositeNode(grammarAccess.getForConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForCondition=ruleForCondition();

            state._fsp--;

             current =iv_ruleForCondition; 
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
    // $ANTLR end "entryRuleForCondition"


    // $ANTLR start "ruleForCondition"
    // InternalMGLang.g:1938:1: ruleForCondition returns [EObject current=null] : (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange ) ;
    public final EObject ruleForCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ForEachCollection_0 = null;

        EObject this_ForRange_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1944:2: ( (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange ) )
            // InternalMGLang.g:1945:2: (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange )
            {
            // InternalMGLang.g:1945:2: (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_INT) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMGLang.g:1946:3: this_ForEachCollection_0= ruleForEachCollection
                    {

                    			newCompositeNode(grammarAccess.getForConditionAccess().getForEachCollectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForEachCollection_0=ruleForEachCollection();

                    state._fsp--;


                    			current = this_ForEachCollection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1955:3: this_ForRange_1= ruleForRange
                    {

                    			newCompositeNode(grammarAccess.getForConditionAccess().getForRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForRange_1=ruleForRange();

                    state._fsp--;


                    			current = this_ForRange_1;
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
    // $ANTLR end "ruleForCondition"


    // $ANTLR start "entryRuleForEachCollection"
    // InternalMGLang.g:1967:1: entryRuleForEachCollection returns [EObject current=null] : iv_ruleForEachCollection= ruleForEachCollection EOF ;
    public final EObject entryRuleForEachCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachCollection = null;


        try {
            // InternalMGLang.g:1967:58: (iv_ruleForEachCollection= ruleForEachCollection EOF )
            // InternalMGLang.g:1968:2: iv_ruleForEachCollection= ruleForEachCollection EOF
            {
             newCompositeNode(grammarAccess.getForEachCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachCollection=ruleForEachCollection();

            state._fsp--;

             current =iv_ruleForEachCollection; 
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
    // $ANTLR end "entryRuleForEachCollection"


    // $ANTLR start "ruleForEachCollection"
    // InternalMGLang.g:1974:1: ruleForEachCollection returns [EObject current=null] : ( (lv_coll_0_0= ruleNodeAttributeCall ) ) ;
    public final EObject ruleForEachCollection() throws RecognitionException {
        EObject current = null;

        EObject lv_coll_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1980:2: ( ( (lv_coll_0_0= ruleNodeAttributeCall ) ) )
            // InternalMGLang.g:1981:2: ( (lv_coll_0_0= ruleNodeAttributeCall ) )
            {
            // InternalMGLang.g:1981:2: ( (lv_coll_0_0= ruleNodeAttributeCall ) )
            // InternalMGLang.g:1982:3: (lv_coll_0_0= ruleNodeAttributeCall )
            {
            // InternalMGLang.g:1982:3: (lv_coll_0_0= ruleNodeAttributeCall )
            // InternalMGLang.g:1983:4: lv_coll_0_0= ruleNodeAttributeCall
            {

            				newCompositeNode(grammarAccess.getForEachCollectionAccess().getCollNodeAttributeCallParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_coll_0_0=ruleNodeAttributeCall();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getForEachCollectionRule());
            				}
            				set(
            					current,
            					"coll",
            					lv_coll_0_0,
            					"org.mofgen.MGLang.NodeAttributeCall");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleForEachCollection"


    // $ANTLR start "entryRuleForRange"
    // InternalMGLang.g:2003:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalMGLang.g:2003:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalMGLang.g:2004:2: iv_ruleForRange= ruleForRange EOF
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
    // InternalMGLang.g:2010:1: ruleForRange returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:2016:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalMGLang.g:2017:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalMGLang.g:2017:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalMGLang.g:2018:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalMGLang.g:2018:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalMGLang.g:2019:4: (lv_start_0_0= RULE_INT )
            {
            // InternalMGLang.g:2019:4: (lv_start_0_0= RULE_INT )
            // InternalMGLang.g:2020:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_start_0_0, grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.mofgen.MGLang.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
            		
            // InternalMGLang.g:2040:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalMGLang.g:2041:4: (lv_end_2_0= RULE_INT )
            {
            // InternalMGLang.g:2041:4: (lv_end_2_0= RULE_INT )
            // InternalMGLang.g:2042:5: lv_end_2_0= RULE_INT
            {
            lv_end_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_2_0, grammarAccess.getForRangeAccess().getEndINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_2_0,
            						"org.mofgen.MGLang.INT");
            				

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


    // $ANTLR start "ruleBoolean"
    // InternalMGLang.g:2062:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:2068:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalMGLang.g:2069:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalMGLang.g:2069:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            else if ( (LA26_0==37) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMGLang.g:2070:3: (enumLiteral_0= 'true' )
                    {
                    // InternalMGLang.g:2070:3: (enumLiteral_0= 'true' )
                    // InternalMGLang.g:2071:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2078:3: (enumLiteral_1= 'false' )
                    {
                    // InternalMGLang.g:2078:3: (enumLiteral_1= 'false' )
                    // InternalMGLang.g:2079:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rulePrimitiveType"
    // InternalMGLang.g:2089:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:2095:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) ) )
            // InternalMGLang.g:2096:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) )
            {
            // InternalMGLang.g:2096:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMGLang.g:2097:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMGLang.g:2097:3: (enumLiteral_0= 'int' )
                    // InternalMGLang.g:2098:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2105:3: (enumLiteral_1= 'char' )
                    {
                    // InternalMGLang.g:2105:3: (enumLiteral_1= 'char' )
                    // InternalMGLang.g:2106:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2113:3: (enumLiteral_2= 'double' )
                    {
                    // InternalMGLang.g:2113:3: (enumLiteral_2= 'double' )
                    // InternalMGLang.g:2114:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2());
                    			

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
    // InternalMGLang.g:2124:1: ruleRelationalOp returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
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
            // InternalMGLang.g:2130:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalMGLang.g:2131:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalMGLang.g:2131:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt28=1;
                }
                break;
            case 42:
                {
                alt28=2;
                }
                break;
            case 43:
                {
                alt28=3;
                }
                break;
            case 44:
                {
                alt28=4;
                }
                break;
            case 45:
                {
                alt28=5;
                }
                break;
            case 46:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMGLang.g:2132:3: (enumLiteral_0= '>' )
                    {
                    // InternalMGLang.g:2132:3: (enumLiteral_0= '>' )
                    // InternalMGLang.g:2133:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2140:3: (enumLiteral_1= '>=' )
                    {
                    // InternalMGLang.g:2140:3: (enumLiteral_1= '>=' )
                    // InternalMGLang.g:2141:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2148:3: (enumLiteral_2= '==' )
                    {
                    // InternalMGLang.g:2148:3: (enumLiteral_2= '==' )
                    // InternalMGLang.g:2149:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:2156:3: (enumLiteral_3= '!=' )
                    {
                    // InternalMGLang.g:2156:3: (enumLiteral_3= '!=' )
                    // InternalMGLang.g:2157:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:2164:3: (enumLiteral_4= '<=' )
                    {
                    // InternalMGLang.g:2164:3: (enumLiteral_4= '<=' )
                    // InternalMGLang.g:2165:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:2172:3: (enumLiteral_5= '<' )
                    {
                    // InternalMGLang.g:2172:3: (enumLiteral_5= '<' )
                    // InternalMGLang.g:2173:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000010000A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001C000040020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000001C000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003040010020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200180020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});

}