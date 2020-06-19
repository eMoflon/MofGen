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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_PATTERN_ASSIGNMENT_OP", "RULE_ASSIGNMENT_OP", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'pattern'", "'('", "','", "')'", "'{'", "'}'", "'return'", "'this'", "'['", "']'", "'-'", "'->'", "'.'", "':'", "'generator'", "'for'", "'in'", "'true'", "'false'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_ASSIGNMENT_OP=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_PATTERN_ASSIGNMENT_OP=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
                else if ( (LA2_0==29) ) {
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
    // InternalMGLang.g:214:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_nodes_8_0= rulePatternNodeCreation ) ) | ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) ) )* otherlv_10= '}' ( (lv_return_11_0= rulePatternReturn ) ) ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_nodes_8_0 = null;

        EObject lv_refsAssigns_9_0 = null;

        EObject lv_return_11_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:220:2: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_nodes_8_0= rulePatternNodeCreation ) ) | ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) ) )* otherlv_10= '}' ( (lv_return_11_0= rulePatternReturn ) ) ) )
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_nodes_8_0= rulePatternNodeCreation ) ) | ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) ) )* otherlv_10= '}' ( (lv_return_11_0= rulePatternReturn ) ) )
            {
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_nodes_8_0= rulePatternNodeCreation ) ) | ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) ) )* otherlv_10= '}' ( (lv_return_11_0= rulePatternReturn ) ) )
            // InternalMGLang.g:222:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( (lv_nodes_8_0= rulePatternNodeCreation ) ) | ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) ) )* otherlv_10= '}' ( (lv_return_11_0= rulePatternReturn ) )
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

            if ( (LA4_0==RULE_ID) ) {
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
                    	    otherlv_4=(Token)match(input,17,FOLLOW_7); 

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

            otherlv_6=(Token)match(input,18,FOLLOW_11); 

            				newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2());
            			

            }

            otherlv_7=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMGLang.g:304:3: ( ( (lv_nodes_8_0= rulePatternNodeCreation ) ) | ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==25||LA5_2==27) ) {
                        alt5=2;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalMGLang.g:305:4: ( (lv_nodes_8_0= rulePatternNodeCreation ) )
            	    {
            	    // InternalMGLang.g:305:4: ( (lv_nodes_8_0= rulePatternNodeCreation ) )
            	    // InternalMGLang.g:306:5: (lv_nodes_8_0= rulePatternNodeCreation )
            	    {
            	    // InternalMGLang.g:306:5: (lv_nodes_8_0= rulePatternNodeCreation )
            	    // InternalMGLang.g:307:6: lv_nodes_8_0= rulePatternNodeCreation
            	    {

            	    						newCompositeNode(grammarAccess.getPatternAccess().getNodesPatternNodeCreationParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_nodes_8_0=rulePatternNodeCreation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodes",
            	    							lv_nodes_8_0,
            	    							"org.mofgen.MGLang.PatternNodeCreation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMGLang.g:325:4: ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) )
            	    {
            	    // InternalMGLang.g:325:4: ( (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment ) )
            	    // InternalMGLang.g:326:5: (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment )
            	    {
            	    // InternalMGLang.g:326:5: (lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment )
            	    // InternalMGLang.g:327:6: lv_refsAssigns_9_0= ruleNodeReferenceOrAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getPatternAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_refsAssigns_9_0=ruleNodeReferenceOrAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"refsAssigns",
            	    							lv_refsAssigns_9_0,
            	    							"org.mofgen.MGLang.NodeReferenceOrAssignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMGLang.g:349:3: ( (lv_return_11_0= rulePatternReturn ) )
            // InternalMGLang.g:350:4: (lv_return_11_0= rulePatternReturn )
            {
            // InternalMGLang.g:350:4: (lv_return_11_0= rulePatternReturn )
            // InternalMGLang.g:351:5: lv_return_11_0= rulePatternReturn
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_return_11_0=rulePatternReturn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"return",
            						lv_return_11_0,
            						"org.mofgen.MGLang.PatternReturn");
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePatternReturn"
    // InternalMGLang.g:372:1: entryRulePatternReturn returns [EObject current=null] : iv_rulePatternReturn= rulePatternReturn EOF ;
    public final EObject entryRulePatternReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternReturn = null;


        try {
            // InternalMGLang.g:372:54: (iv_rulePatternReturn= rulePatternReturn EOF )
            // InternalMGLang.g:373:2: iv_rulePatternReturn= rulePatternReturn EOF
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
    // InternalMGLang.g:379:1: rulePatternReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_thisUsed_1_0= 'this' ) ) ) ;
    public final EObject rulePatternReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_thisUsed_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:385:2: ( (otherlv_0= 'return' ( (lv_thisUsed_1_0= 'this' ) ) ) )
            // InternalMGLang.g:386:2: (otherlv_0= 'return' ( (lv_thisUsed_1_0= 'this' ) ) )
            {
            // InternalMGLang.g:386:2: (otherlv_0= 'return' ( (lv_thisUsed_1_0= 'this' ) ) )
            // InternalMGLang.g:387:3: otherlv_0= 'return' ( (lv_thisUsed_1_0= 'this' ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternReturnAccess().getReturnKeyword_0());
            		
            // InternalMGLang.g:391:3: ( (lv_thisUsed_1_0= 'this' ) )
            // InternalMGLang.g:392:4: (lv_thisUsed_1_0= 'this' )
            {
            // InternalMGLang.g:392:4: (lv_thisUsed_1_0= 'this' )
            // InternalMGLang.g:393:5: lv_thisUsed_1_0= 'this'
            {
            lv_thisUsed_1_0=(Token)match(input,22,FOLLOW_2); 

            					newLeafNode(lv_thisUsed_1_0, grammarAccess.getPatternReturnAccess().getThisUsedThisKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternReturnRule());
            					}
            					setWithLastConsumed(current, "thisUsed", true, "this");
            				

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
    // $ANTLR end "rulePatternReturn"


    // $ANTLR start "entryRulePatternNodeCreation"
    // InternalMGLang.g:409:1: entryRulePatternNodeCreation returns [EObject current=null] : iv_rulePatternNodeCreation= rulePatternNodeCreation EOF ;
    public final EObject entryRulePatternNodeCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternNodeCreation = null;


        try {
            // InternalMGLang.g:409:60: (iv_rulePatternNodeCreation= rulePatternNodeCreation EOF )
            // InternalMGLang.g:410:2: iv_rulePatternNodeCreation= rulePatternNodeCreation EOF
            {
             newCompositeNode(grammarAccess.getPatternNodeCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternNodeCreation=rulePatternNodeCreation();

            state._fsp--;

             current =iv_rulePatternNodeCreation; 
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
    // $ANTLR end "entryRulePatternNodeCreation"


    // $ANTLR start "rulePatternNodeCreation"
    // InternalMGLang.g:416:1: rulePatternNodeCreation returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) ( (lv_constructor_1_0= ruleNodeConstructor ) )? ) ;
    public final EObject rulePatternNodeCreation() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;

        EObject lv_constructor_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:422:2: ( ( ( (lv_node_0_0= ruleNode ) ) ( (lv_constructor_1_0= ruleNodeConstructor ) )? ) )
            // InternalMGLang.g:423:2: ( ( (lv_node_0_0= ruleNode ) ) ( (lv_constructor_1_0= ruleNodeConstructor ) )? )
            {
            // InternalMGLang.g:423:2: ( ( (lv_node_0_0= ruleNode ) ) ( (lv_constructor_1_0= ruleNodeConstructor ) )? )
            // InternalMGLang.g:424:3: ( (lv_node_0_0= ruleNode ) ) ( (lv_constructor_1_0= ruleNodeConstructor ) )?
            {
            // InternalMGLang.g:424:3: ( (lv_node_0_0= ruleNode ) )
            // InternalMGLang.g:425:4: (lv_node_0_0= ruleNode )
            {
            // InternalMGLang.g:425:4: (lv_node_0_0= ruleNode )
            // InternalMGLang.g:426:5: lv_node_0_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getPatternNodeCreationAccess().getNodeNodeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_node_0_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternNodeCreationRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_0_0,
            						"org.mofgen.MGLang.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:443:3: ( (lv_constructor_1_0= ruleNodeConstructor ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:444:4: (lv_constructor_1_0= ruleNodeConstructor )
                    {
                    // InternalMGLang.g:444:4: (lv_constructor_1_0= ruleNodeConstructor )
                    // InternalMGLang.g:445:5: lv_constructor_1_0= ruleNodeConstructor
                    {

                    					newCompositeNode(grammarAccess.getPatternNodeCreationAccess().getConstructorNodeConstructorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constructor_1_0=ruleNodeConstructor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternNodeCreationRule());
                    					}
                    					set(
                    						current,
                    						"constructor",
                    						lv_constructor_1_0,
                    						"org.mofgen.MGLang.NodeConstructor");
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
    // $ANTLR end "rulePatternNodeCreation"


    // $ANTLR start "entryRuleNodeConstructor"
    // InternalMGLang.g:466:1: entryRuleNodeConstructor returns [EObject current=null] : iv_ruleNodeConstructor= ruleNodeConstructor EOF ;
    public final EObject entryRuleNodeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeConstructor = null;


        try {
            // InternalMGLang.g:466:56: (iv_ruleNodeConstructor= ruleNodeConstructor EOF )
            // InternalMGLang.g:467:2: iv_ruleNodeConstructor= ruleNodeConstructor EOF
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
    // InternalMGLang.g:473:1: ruleNodeConstructor returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_params_2_0= ruleLiteralExpression ) )* otherlv_3= ')' ) ;
    public final EObject ruleNodeConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:479:2: ( ( () otherlv_1= '(' ( (lv_params_2_0= ruleLiteralExpression ) )* otherlv_3= ')' ) )
            // InternalMGLang.g:480:2: ( () otherlv_1= '(' ( (lv_params_2_0= ruleLiteralExpression ) )* otherlv_3= ')' )
            {
            // InternalMGLang.g:480:2: ( () otherlv_1= '(' ( (lv_params_2_0= ruleLiteralExpression ) )* otherlv_3= ')' )
            // InternalMGLang.g:481:3: () otherlv_1= '(' ( (lv_params_2_0= ruleLiteralExpression ) )* otherlv_3= ')'
            {
            // InternalMGLang.g:481:3: ()
            // InternalMGLang.g:482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeConstructorAccess().getNodeConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeConstructorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGLang.g:492:3: ( (lv_params_2_0= ruleLiteralExpression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==RULE_INT||LA7_0==25||(LA7_0>=32 && LA7_0<=33)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMGLang.g:493:4: (lv_params_2_0= ruleLiteralExpression )
            	    {
            	    // InternalMGLang.g:493:4: (lv_params_2_0= ruleLiteralExpression )
            	    // InternalMGLang.g:494:5: lv_params_2_0= ruleLiteralExpression
            	    {

            	    					newCompositeNode(grammarAccess.getNodeConstructorAccess().getParamsLiteralExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_params_2_0=ruleLiteralExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeConstructorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_2_0,
            	    						"org.mofgen.MGLang.LiteralExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeConstructorAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleNode"
    // InternalMGLang.g:519:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMGLang.g:519:45: (iv_ruleNode= ruleNode EOF )
            // InternalMGLang.g:520:2: iv_ruleNode= ruleNode EOF
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
    // InternalMGLang.g:526:1: ruleNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:532:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:533:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:533:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:534:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:534:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:535:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:535:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:536:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:547:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:548:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:548:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:549:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNodeReferenceOrAssignment"
    // InternalMGLang.g:569:1: entryRuleNodeReferenceOrAssignment returns [EObject current=null] : iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF ;
    public final EObject entryRuleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReferenceOrAssignment = null;


        try {
            // InternalMGLang.g:569:66: (iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF )
            // InternalMGLang.g:570:2: iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF
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
    // InternalMGLang.g:576:1: ruleNodeReferenceOrAssignment returns [EObject current=null] : ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PatternNodeReference_0 = null;

        EObject this_Assignment_1 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:582:2: ( ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ']' )? ) )
            // InternalMGLang.g:583:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ']' )? )
            {
            // InternalMGLang.g:583:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ']' )? )
            // InternalMGLang.g:584:3: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ']' )?
            {
            // InternalMGLang.g:584:3: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==27) ) {
                    alt8=2;
                }
                else if ( (LA8_1==25) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMGLang.g:585:4: this_PatternNodeReference_0= rulePatternNodeReference
                    {

                    				newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_PatternNodeReference_0=rulePatternNodeReference();

                    state._fsp--;


                    				current = this_PatternNodeReference_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:594:4: this_Assignment_1= ruleAssignment
                    {

                    				newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;


                    				current = this_Assignment_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMGLang.g:603:3: (otherlv_2= '[' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:604:4: otherlv_2= '[' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMGLang.g:608:4: ( (lv_condition_3_0= ruleCondition ) )
                    // InternalMGLang.g:609:5: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalMGLang.g:609:5: (lv_condition_3_0= ruleCondition )
                    // InternalMGLang.g:610:6: lv_condition_3_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeReferenceOrAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"org.mofgen.MGLang.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCondition"
    // InternalMGLang.g:636:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMGLang.g:636:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMGLang.g:637:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMGLang.g:643:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_relation_1_0= ruleEditorRelation ) ) ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_relation_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:649:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_relation_1_0= ruleEditorRelation ) ) ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalMGLang.g:650:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_relation_1_0= ruleEditorRelation ) ) ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalMGLang.g:650:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_relation_1_0= ruleEditorRelation ) ) ( (otherlv_2= RULE_ID ) ) )? )
            // InternalMGLang.g:651:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_relation_1_0= ruleEditorRelation ) ) ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalMGLang.g:651:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:652:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:652:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:653:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLhsParameterCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:664:3: ( ( (lv_relation_1_0= ruleEditorRelation ) ) ( (otherlv_2= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=34 && LA10_0<=39)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:665:4: ( (lv_relation_1_0= ruleEditorRelation ) ) ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalMGLang.g:665:4: ( (lv_relation_1_0= ruleEditorRelation ) )
                    // InternalMGLang.g:666:5: (lv_relation_1_0= ruleEditorRelation )
                    {
                    // InternalMGLang.g:666:5: (lv_relation_1_0= ruleEditorRelation )
                    // InternalMGLang.g:667:6: lv_relation_1_0= ruleEditorRelation
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRelationEditorRelationEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_relation_1_0=ruleEditorRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"relation",
                    							lv_relation_1_0,
                    							"org.mofgen.MGLang.EditorRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMGLang.g:684:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMGLang.g:685:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMGLang.g:685:5: (otherlv_2= RULE_ID )
                    // InternalMGLang.g:686:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRhsParameterCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:702:1: entryRulePatternNodeReference returns [EObject current=null] : iv_rulePatternNodeReference= rulePatternNodeReference EOF ;
    public final EObject entryRulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternNodeReference = null;


        try {
            // InternalMGLang.g:702:61: (iv_rulePatternNodeReference= rulePatternNodeReference EOF )
            // InternalMGLang.g:703:2: iv_rulePatternNodeReference= rulePatternNodeReference EOF
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
    // InternalMGLang.g:709:1: rulePatternNodeReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMGLang.g:715:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMGLang.g:716:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMGLang.g:716:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalMGLang.g:717:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            // InternalMGLang.g:717:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:718:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:718:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:719:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternNodeReferenceAccess().getSourceNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusKeyword_1());
            		
            // InternalMGLang.g:734:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:735:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:735:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:736:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMGLang.g:751:3: ( (otherlv_4= RULE_ID ) )
            // InternalMGLang.g:752:4: (otherlv_4= RULE_ID )
            {
            // InternalMGLang.g:752:4: (otherlv_4= RULE_ID )
            // InternalMGLang.g:753:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_4_0());
            				

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
    // InternalMGLang.g:768:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMGLang.g:768:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMGLang.g:769:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalMGLang.g:775:1: ruleAssignment returns [EObject current=null] : ( ( (lv_target_0_0= ruleNodeAttributeCall ) ) this_PATTERN_ASSIGNMENT_OP_1= RULE_PATTERN_ASSIGNMENT_OP ( (lv_value_2_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token this_PATTERN_ASSIGNMENT_OP_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:781:2: ( ( ( (lv_target_0_0= ruleNodeAttributeCall ) ) this_PATTERN_ASSIGNMENT_OP_1= RULE_PATTERN_ASSIGNMENT_OP ( (lv_value_2_0= ruleLiteralExpression ) ) ) )
            // InternalMGLang.g:782:2: ( ( (lv_target_0_0= ruleNodeAttributeCall ) ) this_PATTERN_ASSIGNMENT_OP_1= RULE_PATTERN_ASSIGNMENT_OP ( (lv_value_2_0= ruleLiteralExpression ) ) )
            {
            // InternalMGLang.g:782:2: ( ( (lv_target_0_0= ruleNodeAttributeCall ) ) this_PATTERN_ASSIGNMENT_OP_1= RULE_PATTERN_ASSIGNMENT_OP ( (lv_value_2_0= ruleLiteralExpression ) ) )
            // InternalMGLang.g:783:3: ( (lv_target_0_0= ruleNodeAttributeCall ) ) this_PATTERN_ASSIGNMENT_OP_1= RULE_PATTERN_ASSIGNMENT_OP ( (lv_value_2_0= ruleLiteralExpression ) )
            {
            // InternalMGLang.g:783:3: ( (lv_target_0_0= ruleNodeAttributeCall ) )
            // InternalMGLang.g:784:4: (lv_target_0_0= ruleNodeAttributeCall )
            {
            // InternalMGLang.g:784:4: (lv_target_0_0= ruleNodeAttributeCall )
            // InternalMGLang.g:785:5: lv_target_0_0= ruleNodeAttributeCall
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getTargetNodeAttributeCallParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_target_0_0=ruleNodeAttributeCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_0_0,
            						"org.mofgen.MGLang.NodeAttributeCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PATTERN_ASSIGNMENT_OP_1=(Token)match(input,RULE_PATTERN_ASSIGNMENT_OP,FOLLOW_23); 

            			newLeafNode(this_PATTERN_ASSIGNMENT_OP_1, grammarAccess.getAssignmentAccess().getPATTERN_ASSIGNMENT_OPTerminalRuleCall_1());
            		
            // InternalMGLang.g:806:3: ( (lv_value_2_0= ruleLiteralExpression ) )
            // InternalMGLang.g:807:4: (lv_value_2_0= ruleLiteralExpression )
            {
            // InternalMGLang.g:807:4: (lv_value_2_0= ruleLiteralExpression )
            // InternalMGLang.g:808:5: lv_value_2_0= ruleLiteralExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleLiteralExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.mofgen.MGLang.LiteralExpression");
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
    // InternalMGLang.g:829:1: entryRuleNodeAttributeCall returns [EObject current=null] : iv_ruleNodeAttributeCall= ruleNodeAttributeCall EOF ;
    public final EObject entryRuleNodeAttributeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttributeCall = null;


        try {
            // InternalMGLang.g:829:58: (iv_ruleNodeAttributeCall= ruleNodeAttributeCall EOF )
            // InternalMGLang.g:830:2: iv_ruleNodeAttributeCall= ruleNodeAttributeCall EOF
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
    // InternalMGLang.g:836:1: ruleNodeAttributeCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleNodeAttributeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:842:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:843:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:843:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:844:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:844:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:845:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:845:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:846:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeAttributeCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeAttributeCallAccess().getObjectNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAttributeCallAccess().getFullStopKeyword_1());
            		
            // InternalMGLang.g:861:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:862:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:862:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:863:5: otherlv_2= RULE_ID
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
    // InternalMGLang.g:878:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMGLang.g:878:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMGLang.g:879:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMGLang.g:885:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:891:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:892:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:892:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:893:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:893:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMGLang.g:894:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMGLang.g:894:4: (lv_name_0_0= RULE_ID )
            // InternalMGLang.g:895:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalMGLang.g:915:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:916:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:916:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:917:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getTypeEClassifierCrossReference_2_0());
            				

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:932:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalMGLang.g:932:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalMGLang.g:933:2: iv_ruleGenerator= ruleGenerator EOF
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
    // InternalMGLang.g:939:1: ruleGenerator returns [EObject current=null] : (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:945:2: ( (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' ) )
            // InternalMGLang.g:946:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' )
            {
            // InternalMGLang.g:946:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}' )
            // InternalMGLang.g:947:3: otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneratorAccess().getGeneratorKeyword_0());
            		
            // InternalMGLang.g:951:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:952:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:952:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:953:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMGLang.g:981:3: ( (lv_commands_5_0= ruleGeneratorElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMGLang.g:982:4: (lv_commands_5_0= ruleGeneratorElement )
            	    {
            	    // InternalMGLang.g:982:4: (lv_commands_5_0= ruleGeneratorElement )
            	    // InternalMGLang.g:983:5: lv_commands_5_0= ruleGeneratorElement
            	    {

            	    					newCompositeNode(grammarAccess.getGeneratorAccess().getCommandsGeneratorElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop11;
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
    // InternalMGLang.g:1008:1: entryRuleGeneratorElement returns [EObject current=null] : iv_ruleGeneratorElement= ruleGeneratorElement EOF ;
    public final EObject entryRuleGeneratorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorElement = null;


        try {
            // InternalMGLang.g:1008:57: (iv_ruleGeneratorElement= ruleGeneratorElement EOF )
            // InternalMGLang.g:1009:2: iv_ruleGeneratorElement= ruleGeneratorElement EOF
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
    // InternalMGLang.g:1015:1: ruleGeneratorElement returns [EObject current=null] : (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop ) ;
    public final EObject ruleGeneratorElement() throws RecognitionException {
        EObject current = null;

        EObject this_GeneratorCommand_0 = null;

        EObject this_ForLoop_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1021:2: ( (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop ) )
            // InternalMGLang.g:1022:2: (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop )
            {
            // InternalMGLang.g:1022:2: (this_GeneratorCommand_0= ruleGeneratorCommand | this_ForLoop_1= ruleForLoop )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:1023:3: this_GeneratorCommand_0= ruleGeneratorCommand
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
                    // InternalMGLang.g:1032:3: this_ForLoop_1= ruleForLoop
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
    // InternalMGLang.g:1044:1: entryRuleGeneratorCommand returns [EObject current=null] : iv_ruleGeneratorCommand= ruleGeneratorCommand EOF ;
    public final EObject entryRuleGeneratorCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorCommand = null;


        try {
            // InternalMGLang.g:1044:57: (iv_ruleGeneratorCommand= ruleGeneratorCommand EOF )
            // InternalMGLang.g:1045:2: iv_ruleGeneratorCommand= ruleGeneratorCommand EOF
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
    // InternalMGLang.g:1051:1: ruleGeneratorCommand returns [EObject current=null] : (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation ) ;
    public final EObject ruleGeneratorCommand() throws RecognitionException {
        EObject current = null;

        EObject this_PatternCall_0 = null;

        EObject this_PatternObjectCreation_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1057:2: ( (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation ) )
            // InternalMGLang.g:1058:2: (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation )
            {
            // InternalMGLang.g:1058:2: (this_PatternCall_0= rulePatternCall | this_PatternObjectCreation_1= rulePatternObjectCreation )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_ID||LA13_2==16||LA13_2==20||LA13_2==30) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==RULE_ASSIGNMENT_OP) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==EOF||LA13_1==16||LA13_1==20||LA13_1==30) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:1059:3: this_PatternCall_0= rulePatternCall
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
                    // InternalMGLang.g:1068:3: this_PatternObjectCreation_1= rulePatternObjectCreation
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


    // $ANTLR start "entryRulePatternCall"
    // InternalMGLang.g:1080:1: entryRulePatternCall returns [EObject current=null] : iv_rulePatternCall= rulePatternCall EOF ;
    public final EObject entryRulePatternCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternCall = null;


        try {
            // InternalMGLang.g:1080:52: (iv_rulePatternCall= rulePatternCall EOF )
            // InternalMGLang.g:1081:2: iv_rulePatternCall= rulePatternCall EOF
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
    // InternalMGLang.g:1087:1: rulePatternCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= rulePatternObject ) )* otherlv_3= ')' )? ) ;
    public final EObject rulePatternCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1093:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= rulePatternObject ) )* otherlv_3= ')' )? ) )
            // InternalMGLang.g:1094:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= rulePatternObject ) )* otherlv_3= ')' )? )
            {
            // InternalMGLang.g:1094:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= rulePatternObject ) )* otherlv_3= ')' )? )
            // InternalMGLang.g:1095:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= rulePatternObject ) )* otherlv_3= ')' )?
            {
            // InternalMGLang.g:1095:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1096:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1096:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1097:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternCallAccess().getCalledPatternPatternCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1108:3: (otherlv_1= '(' ( (lv_params_2_0= rulePatternObject ) )* otherlv_3= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1109:4: otherlv_1= '(' ( (lv_params_2_0= rulePatternObject ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMGLang.g:1113:4: ( (lv_params_2_0= rulePatternObject ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMGLang.g:1114:5: (lv_params_2_0= rulePatternObject )
                    	    {
                    	    // InternalMGLang.g:1114:5: (lv_params_2_0= rulePatternObject )
                    	    // InternalMGLang.g:1115:6: lv_params_2_0= rulePatternObject
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternCallAccess().getParamsPatternObjectParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_params_2_0=rulePatternObject();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPatternCallRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"params",
                    	    							lv_params_2_0,
                    	    							"org.mofgen.MGLang.PatternObject");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "rulePatternCall"


    // $ANTLR start "entryRulePatternObjectCreation"
    // InternalMGLang.g:1141:1: entryRulePatternObjectCreation returns [EObject current=null] : iv_rulePatternObjectCreation= rulePatternObjectCreation EOF ;
    public final EObject entryRulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObjectCreation = null;


        try {
            // InternalMGLang.g:1141:62: (iv_rulePatternObjectCreation= rulePatternObjectCreation EOF )
            // InternalMGLang.g:1142:2: iv_rulePatternObjectCreation= rulePatternObjectCreation EOF
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
    // InternalMGLang.g:1148:1: rulePatternObjectCreation returns [EObject current=null] : ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) ;
    public final EObject rulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_pObject_0_0 = null;

        EObject lv_patternCall_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1154:2: ( ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) )
            // InternalMGLang.g:1155:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            {
            // InternalMGLang.g:1155:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            // InternalMGLang.g:1156:3: ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) )
            {
            // InternalMGLang.g:1156:3: ( (lv_pObject_0_0= rulePatternObject ) )
            // InternalMGLang.g:1157:4: (lv_pObject_0_0= rulePatternObject )
            {
            // InternalMGLang.g:1157:4: (lv_pObject_0_0= rulePatternObject )
            // InternalMGLang.g:1158:5: lv_pObject_0_0= rulePatternObject
            {

            					newCompositeNode(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_7); 

            			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1());
            		
            // InternalMGLang.g:1179:3: ( (lv_patternCall_2_0= rulePatternCall ) )
            // InternalMGLang.g:1180:4: (lv_patternCall_2_0= rulePatternCall )
            {
            // InternalMGLang.g:1180:4: (lv_patternCall_2_0= rulePatternCall )
            // InternalMGLang.g:1181:5: lv_patternCall_2_0= rulePatternCall
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
    // InternalMGLang.g:1202:1: entryRulePatternObject returns [EObject current=null] : iv_rulePatternObject= rulePatternObject EOF ;
    public final EObject entryRulePatternObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObject = null;


        try {
            // InternalMGLang.g:1202:54: (iv_rulePatternObject= rulePatternObject EOF )
            // InternalMGLang.g:1203:2: iv_rulePatternObject= rulePatternObject EOF
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
    // InternalMGLang.g:1209:1: rulePatternObject returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePatternObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1215:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1216:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1216:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:1217:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:1217:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1218:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1218:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1219:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternObjectRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1230:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1231:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1231:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1232:5: lv_name_1_0= RULE_ID
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
    // InternalMGLang.g:1252:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalMGLang.g:1252:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalMGLang.g:1253:2: iv_ruleForLoop= ruleForLoop EOF
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
    // InternalMGLang.g:1259:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' ) ;
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
            // InternalMGLang.g:1265:2: ( (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' ) )
            // InternalMGLang.g:1266:2: (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' )
            {
            // InternalMGLang.g:1266:2: (otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}' )
            // InternalMGLang.g:1267:3: otherlv_0= 'for' ( (lv_iteratorVar_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_iteratingCondition_3_0= ruleForCondition ) ) otherlv_4= '{' ( (lv_commands_5_0= ruleGeneratorCommand ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
            		
            // InternalMGLang.g:1271:3: ( (lv_iteratorVar_1_0= RULE_ID ) )
            // InternalMGLang.g:1272:4: (lv_iteratorVar_1_0= RULE_ID )
            {
            // InternalMGLang.g:1272:4: (lv_iteratorVar_1_0= RULE_ID )
            // InternalMGLang.g:1273:5: lv_iteratorVar_1_0= RULE_ID
            {
            lv_iteratorVar_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getInKeyword_2());
            		
            // InternalMGLang.g:1293:3: ( (lv_iteratingCondition_3_0= ruleForCondition ) )
            // InternalMGLang.g:1294:4: (lv_iteratingCondition_3_0= ruleForCondition )
            {
            // InternalMGLang.g:1294:4: (lv_iteratingCondition_3_0= ruleForCondition )
            // InternalMGLang.g:1295:5: lv_iteratingCondition_3_0= ruleForCondition
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getIteratingConditionForConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMGLang.g:1316:3: ( (lv_commands_5_0= ruleGeneratorCommand ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMGLang.g:1317:4: (lv_commands_5_0= ruleGeneratorCommand )
            	    {
            	    // InternalMGLang.g:1317:4: (lv_commands_5_0= ruleGeneratorCommand )
            	    // InternalMGLang.g:1318:5: lv_commands_5_0= ruleGeneratorCommand
            	    {

            	    					newCompositeNode(grammarAccess.getForLoopAccess().getCommandsGeneratorCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop16;
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
    // InternalMGLang.g:1343:1: entryRuleForCondition returns [EObject current=null] : iv_ruleForCondition= ruleForCondition EOF ;
    public final EObject entryRuleForCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCondition = null;


        try {
            // InternalMGLang.g:1343:53: (iv_ruleForCondition= ruleForCondition EOF )
            // InternalMGLang.g:1344:2: iv_ruleForCondition= ruleForCondition EOF
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
    // InternalMGLang.g:1350:1: ruleForCondition returns [EObject current=null] : (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange ) ;
    public final EObject ruleForCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ForEachCollection_0 = null;

        EObject this_ForRange_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1356:2: ( (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange ) )
            // InternalMGLang.g:1357:2: (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange )
            {
            // InternalMGLang.g:1357:2: (this_ForEachCollection_0= ruleForEachCollection | this_ForRange_1= ruleForRange )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:1358:3: this_ForEachCollection_0= ruleForEachCollection
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
                    // InternalMGLang.g:1367:3: this_ForRange_1= ruleForRange
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
    // InternalMGLang.g:1379:1: entryRuleForEachCollection returns [EObject current=null] : iv_ruleForEachCollection= ruleForEachCollection EOF ;
    public final EObject entryRuleForEachCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachCollection = null;


        try {
            // InternalMGLang.g:1379:58: (iv_ruleForEachCollection= ruleForEachCollection EOF )
            // InternalMGLang.g:1380:2: iv_ruleForEachCollection= ruleForEachCollection EOF
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
    // InternalMGLang.g:1386:1: ruleForEachCollection returns [EObject current=null] : ( (lv_coll_0_0= ruleNodeAttributeCall ) ) ;
    public final EObject ruleForEachCollection() throws RecognitionException {
        EObject current = null;

        EObject lv_coll_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1392:2: ( ( (lv_coll_0_0= ruleNodeAttributeCall ) ) )
            // InternalMGLang.g:1393:2: ( (lv_coll_0_0= ruleNodeAttributeCall ) )
            {
            // InternalMGLang.g:1393:2: ( (lv_coll_0_0= ruleNodeAttributeCall ) )
            // InternalMGLang.g:1394:3: (lv_coll_0_0= ruleNodeAttributeCall )
            {
            // InternalMGLang.g:1394:3: (lv_coll_0_0= ruleNodeAttributeCall )
            // InternalMGLang.g:1395:4: lv_coll_0_0= ruleNodeAttributeCall
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
    // InternalMGLang.g:1415:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalMGLang.g:1415:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalMGLang.g:1416:2: iv_ruleForRange= ruleForRange EOF
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
    // InternalMGLang.g:1422:1: ruleForRange returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1428:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalMGLang.g:1429:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalMGLang.g:1429:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalMGLang.g:1430:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalMGLang.g:1430:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalMGLang.g:1431:4: (lv_start_0_0= RULE_INT )
            {
            // InternalMGLang.g:1431:4: (lv_start_0_0= RULE_INT )
            // InternalMGLang.g:1432:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_start_0_0, grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
            		
            // InternalMGLang.g:1452:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalMGLang.g:1453:4: (lv_end_2_0= RULE_INT )
            {
            // InternalMGLang.g:1453:4: (lv_end_2_0= RULE_INT )
            // InternalMGLang.g:1454:5: lv_end_2_0= RULE_INT
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
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMGLang.g:1474:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMGLang.g:1474:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMGLang.g:1475:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMGLang.g:1481:1: ruleLiteralExpression returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ruleNumberLiteral ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1487:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ruleNumberLiteral ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) ) )
            // InternalMGLang.g:1488:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ruleNumberLiteral ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )
            {
            // InternalMGLang.g:1488:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ruleNumberLiteral ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
            case 25:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMGLang.g:1489:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalMGLang.g:1489:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalMGLang.g:1490:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalMGLang.g:1490:4: ()
                    // InternalMGLang.g:1491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralExpressionAccess().getBooleanLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMGLang.g:1497:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalMGLang.g:1498:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalMGLang.g:1498:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalMGLang.g:1499:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalMGLang.g:1499:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==33) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMGLang.g:1500:7: lv_value_1_1= 'true'
                            {
                            lv_value_1_1=(Token)match(input,32,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getLiteralExpressionAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLiteralExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMGLang.g:1511:7: lv_value_1_2= 'false'
                            {
                            lv_value_1_2=(Token)match(input,33,FOLLOW_2); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getLiteralExpressionAccess().getValueFalseKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLiteralExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1526:3: ( () ruleNumberLiteral )
                    {
                    // InternalMGLang.g:1526:3: ( () ruleNumberLiteral )
                    // InternalMGLang.g:1527:4: () ruleNumberLiteral
                    {
                    // InternalMGLang.g:1527:4: ()
                    // InternalMGLang.g:1528:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1543:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalMGLang.g:1543:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalMGLang.g:1544:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalMGLang.g:1544:4: ()
                    // InternalMGLang.g:1545:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralExpressionAccess().getStringLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMGLang.g:1551:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalMGLang.g:1552:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalMGLang.g:1552:5: (lv_value_5_0= RULE_STRING )
                    // InternalMGLang.g:1553:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getLiteralExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMGLang.g:1574:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // InternalMGLang.g:1574:53: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMGLang.g:1575:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral.getText(); 
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
    // InternalMGLang.g:1581:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalMGLang.g:1587:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalMGLang.g:1588:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalMGLang.g:1588:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalMGLang.g:1589:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalMGLang.g:1589:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMGLang.g:1590:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberLiteralAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_32); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1());
            		
            // InternalMGLang.g:1603:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMGLang.g:1604:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,27,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberLiteralAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_2_1());
                    			

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "ruleEditorRelation"
    // InternalMGLang.g:1621:1: ruleEditorRelation returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleEditorRelation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMGLang.g:1627:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalMGLang.g:1628:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalMGLang.g:1628:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            case 37:
                {
                alt22=4;
                }
                break;
            case 38:
                {
                alt22=5;
                }
                break;
            case 39:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMGLang.g:1629:3: (enumLiteral_0= '>' )
                    {
                    // InternalMGLang.g:1629:3: (enumLiteral_0= '>' )
                    // InternalMGLang.g:1630:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1637:3: (enumLiteral_1= '>=' )
                    {
                    // InternalMGLang.g:1637:3: (enumLiteral_1= '>=' )
                    // InternalMGLang.g:1638:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1645:3: (enumLiteral_2= '==' )
                    {
                    // InternalMGLang.g:1645:3: (enumLiteral_2= '==' )
                    // InternalMGLang.g:1646:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1653:3: (enumLiteral_3= '!=' )
                    {
                    // InternalMGLang.g:1653:3: (enumLiteral_3= '!=' )
                    // InternalMGLang.g:1654:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1661:3: (enumLiteral_4= '<=' )
                    {
                    // InternalMGLang.g:1661:3: (enumLiteral_4= '<=' )
                    // InternalMGLang.g:1662:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1669:3: (enumLiteral_5= '<' )
                    {
                    // InternalMGLang.g:1669:3: (enumLiteral_5= '<' )
                    // InternalMGLang.g:1670:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getEditorRelationAccess().getSMALLEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEditorRelationAccess().getSMALLEREnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleEditorRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000002000A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000302040110L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000FC00000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000302000110L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040100020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000002L});

}