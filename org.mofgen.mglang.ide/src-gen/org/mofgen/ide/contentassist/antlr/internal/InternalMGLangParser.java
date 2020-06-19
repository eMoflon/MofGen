package org.mofgen.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mofgen.services.MGLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ASSIGNMENT_OP", "RULE_ASSIGNMENT_OP", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'import'", "'as'", "'pattern'", "'{'", "'}'", "'('", "')'", "','", "'return'", "'['", "']'", "'-'", "'->'", "'.'", "':'", "'generator'", "'for'", "'in'", "'this'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_ASSIGNMENT_OP=5;
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
    public static final int RULE_ID=8;
    public static final int RULE_WS=11;
    public static final int RULE_PATTERN_ASSIGNMENT_OP=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

    	public void setGrammarAccess(MGLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMofgenFile"
    // InternalMGLang.g:53:1: entryRuleMofgenFile : ruleMofgenFile EOF ;
    public final void entryRuleMofgenFile() throws RecognitionException {
        try {
            // InternalMGLang.g:54:1: ( ruleMofgenFile EOF )
            // InternalMGLang.g:55:1: ruleMofgenFile EOF
            {
             before(grammarAccess.getMofgenFileRule()); 
            pushFollow(FOLLOW_1);
            ruleMofgenFile();

            state._fsp--;

             after(grammarAccess.getMofgenFileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMofgenFile"


    // $ANTLR start "ruleMofgenFile"
    // InternalMGLang.g:62:1: ruleMofgenFile : ( ( rule__MofgenFile__Group__0 ) ) ;
    public final void ruleMofgenFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:66:2: ( ( ( rule__MofgenFile__Group__0 ) ) )
            // InternalMGLang.g:67:2: ( ( rule__MofgenFile__Group__0 ) )
            {
            // InternalMGLang.g:67:2: ( ( rule__MofgenFile__Group__0 ) )
            // InternalMGLang.g:68:3: ( rule__MofgenFile__Group__0 )
            {
             before(grammarAccess.getMofgenFileAccess().getGroup()); 
            // InternalMGLang.g:69:3: ( rule__MofgenFile__Group__0 )
            // InternalMGLang.g:69:4: rule__MofgenFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMofgenFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMofgenFile"


    // $ANTLR start "entryRuleImport"
    // InternalMGLang.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMGLang.g:79:1: ( ruleImport EOF )
            // InternalMGLang.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMGLang.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMGLang.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMGLang.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalMGLang.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMGLang.g:94:3: ( rule__Import__Group__0 )
            // InternalMGLang.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePattern"
    // InternalMGLang.g:103:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMGLang.g:104:1: ( rulePattern EOF )
            // InternalMGLang.g:105:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMGLang.g:112:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:116:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalMGLang.g:117:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalMGLang.g:117:2: ( ( rule__Pattern__Group__0 ) )
            // InternalMGLang.g:118:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalMGLang.g:119:3: ( rule__Pattern__Group__0 )
            // InternalMGLang.g:119:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePatternReturn"
    // InternalMGLang.g:128:1: entryRulePatternReturn : rulePatternReturn EOF ;
    public final void entryRulePatternReturn() throws RecognitionException {
        try {
            // InternalMGLang.g:129:1: ( rulePatternReturn EOF )
            // InternalMGLang.g:130:1: rulePatternReturn EOF
            {
             before(grammarAccess.getPatternReturnRule()); 
            pushFollow(FOLLOW_1);
            rulePatternReturn();

            state._fsp--;

             after(grammarAccess.getPatternReturnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatternReturn"


    // $ANTLR start "rulePatternReturn"
    // InternalMGLang.g:137:1: rulePatternReturn : ( ( rule__PatternReturn__Group__0 ) ) ;
    public final void rulePatternReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:141:2: ( ( ( rule__PatternReturn__Group__0 ) ) )
            // InternalMGLang.g:142:2: ( ( rule__PatternReturn__Group__0 ) )
            {
            // InternalMGLang.g:142:2: ( ( rule__PatternReturn__Group__0 ) )
            // InternalMGLang.g:143:3: ( rule__PatternReturn__Group__0 )
            {
             before(grammarAccess.getPatternReturnAccess().getGroup()); 
            // InternalMGLang.g:144:3: ( rule__PatternReturn__Group__0 )
            // InternalMGLang.g:144:4: rule__PatternReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternReturn"


    // $ANTLR start "entryRulePatternNodeCreation"
    // InternalMGLang.g:153:1: entryRulePatternNodeCreation : rulePatternNodeCreation EOF ;
    public final void entryRulePatternNodeCreation() throws RecognitionException {
        try {
            // InternalMGLang.g:154:1: ( rulePatternNodeCreation EOF )
            // InternalMGLang.g:155:1: rulePatternNodeCreation EOF
            {
             before(grammarAccess.getPatternNodeCreationRule()); 
            pushFollow(FOLLOW_1);
            rulePatternNodeCreation();

            state._fsp--;

             after(grammarAccess.getPatternNodeCreationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatternNodeCreation"


    // $ANTLR start "rulePatternNodeCreation"
    // InternalMGLang.g:162:1: rulePatternNodeCreation : ( ( rule__PatternNodeCreation__Group__0 ) ) ;
    public final void rulePatternNodeCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:166:2: ( ( ( rule__PatternNodeCreation__Group__0 ) ) )
            // InternalMGLang.g:167:2: ( ( rule__PatternNodeCreation__Group__0 ) )
            {
            // InternalMGLang.g:167:2: ( ( rule__PatternNodeCreation__Group__0 ) )
            // InternalMGLang.g:168:3: ( rule__PatternNodeCreation__Group__0 )
            {
             before(grammarAccess.getPatternNodeCreationAccess().getGroup()); 
            // InternalMGLang.g:169:3: ( rule__PatternNodeCreation__Group__0 )
            // InternalMGLang.g:169:4: rule__PatternNodeCreation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeCreation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeCreationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternNodeCreation"


    // $ANTLR start "entryRuleNodeConstructor"
    // InternalMGLang.g:178:1: entryRuleNodeConstructor : ruleNodeConstructor EOF ;
    public final void entryRuleNodeConstructor() throws RecognitionException {
        try {
            // InternalMGLang.g:179:1: ( ruleNodeConstructor EOF )
            // InternalMGLang.g:180:1: ruleNodeConstructor EOF
            {
             before(grammarAccess.getNodeConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeConstructor();

            state._fsp--;

             after(grammarAccess.getNodeConstructorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodeConstructor"


    // $ANTLR start "ruleNodeConstructor"
    // InternalMGLang.g:187:1: ruleNodeConstructor : ( ( rule__NodeConstructor__Group__0 ) ) ;
    public final void ruleNodeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:191:2: ( ( ( rule__NodeConstructor__Group__0 ) ) )
            // InternalMGLang.g:192:2: ( ( rule__NodeConstructor__Group__0 ) )
            {
            // InternalMGLang.g:192:2: ( ( rule__NodeConstructor__Group__0 ) )
            // InternalMGLang.g:193:3: ( rule__NodeConstructor__Group__0 )
            {
             before(grammarAccess.getNodeConstructorAccess().getGroup()); 
            // InternalMGLang.g:194:3: ( rule__NodeConstructor__Group__0 )
            // InternalMGLang.g:194:4: rule__NodeConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeConstructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeConstructor"


    // $ANTLR start "entryRuleNode"
    // InternalMGLang.g:203:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalMGLang.g:204:1: ( ruleNode EOF )
            // InternalMGLang.g:205:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMGLang.g:212:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:216:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalMGLang.g:217:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalMGLang.g:217:2: ( ( rule__Node__Group__0 ) )
            // InternalMGLang.g:218:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalMGLang.g:219:3: ( rule__Node__Group__0 )
            // InternalMGLang.g:219:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeReferenceOrAssignment"
    // InternalMGLang.g:228:1: entryRuleNodeReferenceOrAssignment : ruleNodeReferenceOrAssignment EOF ;
    public final void entryRuleNodeReferenceOrAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:229:1: ( ruleNodeReferenceOrAssignment EOF )
            // InternalMGLang.g:230:1: ruleNodeReferenceOrAssignment EOF
            {
             before(grammarAccess.getNodeReferenceOrAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeReferenceOrAssignment();

            state._fsp--;

             after(grammarAccess.getNodeReferenceOrAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodeReferenceOrAssignment"


    // $ANTLR start "ruleNodeReferenceOrAssignment"
    // InternalMGLang.g:237:1: ruleNodeReferenceOrAssignment : ( ( rule__NodeReferenceOrAssignment__Group__0 ) ) ;
    public final void ruleNodeReferenceOrAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:241:2: ( ( ( rule__NodeReferenceOrAssignment__Group__0 ) ) )
            // InternalMGLang.g:242:2: ( ( rule__NodeReferenceOrAssignment__Group__0 ) )
            {
            // InternalMGLang.g:242:2: ( ( rule__NodeReferenceOrAssignment__Group__0 ) )
            // InternalMGLang.g:243:3: ( rule__NodeReferenceOrAssignment__Group__0 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup()); 
            // InternalMGLang.g:244:3: ( rule__NodeReferenceOrAssignment__Group__0 )
            // InternalMGLang.g:244:4: rule__NodeReferenceOrAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeReferenceOrAssignment"


    // $ANTLR start "entryRuleCondition"
    // InternalMGLang.g:253:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMGLang.g:254:1: ( ruleCondition EOF )
            // InternalMGLang.g:255:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMGLang.g:262:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:266:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalMGLang.g:267:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalMGLang.g:267:2: ( ( rule__Condition__Group__0 ) )
            // InternalMGLang.g:268:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalMGLang.g:269:3: ( rule__Condition__Group__0 )
            // InternalMGLang.g:269:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:278:1: entryRulePatternNodeReference : rulePatternNodeReference EOF ;
    public final void entryRulePatternNodeReference() throws RecognitionException {
        try {
            // InternalMGLang.g:279:1: ( rulePatternNodeReference EOF )
            // InternalMGLang.g:280:1: rulePatternNodeReference EOF
            {
             before(grammarAccess.getPatternNodeReferenceRule()); 
            pushFollow(FOLLOW_1);
            rulePatternNodeReference();

            state._fsp--;

             after(grammarAccess.getPatternNodeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatternNodeReference"


    // $ANTLR start "rulePatternNodeReference"
    // InternalMGLang.g:287:1: rulePatternNodeReference : ( ( rule__PatternNodeReference__Group__0 ) ) ;
    public final void rulePatternNodeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:291:2: ( ( ( rule__PatternNodeReference__Group__0 ) ) )
            // InternalMGLang.g:292:2: ( ( rule__PatternNodeReference__Group__0 ) )
            {
            // InternalMGLang.g:292:2: ( ( rule__PatternNodeReference__Group__0 ) )
            // InternalMGLang.g:293:3: ( rule__PatternNodeReference__Group__0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 
            // InternalMGLang.g:294:3: ( rule__PatternNodeReference__Group__0 )
            // InternalMGLang.g:294:4: rule__PatternNodeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternNodeReference"


    // $ANTLR start "entryRuleAssignment"
    // InternalMGLang.g:303:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:304:1: ( ruleAssignment EOF )
            // InternalMGLang.g:305:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMGLang.g:312:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:316:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMGLang.g:317:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMGLang.g:317:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMGLang.g:318:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMGLang.g:319:3: ( rule__Assignment__Group__0 )
            // InternalMGLang.g:319:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleNodeAttributeCall"
    // InternalMGLang.g:328:1: entryRuleNodeAttributeCall : ruleNodeAttributeCall EOF ;
    public final void entryRuleNodeAttributeCall() throws RecognitionException {
        try {
            // InternalMGLang.g:329:1: ( ruleNodeAttributeCall EOF )
            // InternalMGLang.g:330:1: ruleNodeAttributeCall EOF
            {
             before(grammarAccess.getNodeAttributeCallRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeAttributeCall();

            state._fsp--;

             after(grammarAccess.getNodeAttributeCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodeAttributeCall"


    // $ANTLR start "ruleNodeAttributeCall"
    // InternalMGLang.g:337:1: ruleNodeAttributeCall : ( ( rule__NodeAttributeCall__Group__0 ) ) ;
    public final void ruleNodeAttributeCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:341:2: ( ( ( rule__NodeAttributeCall__Group__0 ) ) )
            // InternalMGLang.g:342:2: ( ( rule__NodeAttributeCall__Group__0 ) )
            {
            // InternalMGLang.g:342:2: ( ( rule__NodeAttributeCall__Group__0 ) )
            // InternalMGLang.g:343:3: ( rule__NodeAttributeCall__Group__0 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getGroup()); 
            // InternalMGLang.g:344:3: ( rule__NodeAttributeCall__Group__0 )
            // InternalMGLang.g:344:4: rule__NodeAttributeCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeAttributeCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAttributeCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeAttributeCall"


    // $ANTLR start "entryRuleParameter"
    // InternalMGLang.g:353:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:354:1: ( ruleParameter EOF )
            // InternalMGLang.g:355:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMGLang.g:362:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:366:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMGLang.g:367:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMGLang.g:367:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMGLang.g:368:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMGLang.g:369:3: ( rule__Parameter__Group__0 )
            // InternalMGLang.g:369:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:378:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalMGLang.g:379:1: ( ruleGenerator EOF )
            // InternalMGLang.g:380:1: ruleGenerator EOF
            {
             before(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_1);
            ruleGenerator();

            state._fsp--;

             after(grammarAccess.getGeneratorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalMGLang.g:387:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:391:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalMGLang.g:392:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalMGLang.g:392:2: ( ( rule__Generator__Group__0 ) )
            // InternalMGLang.g:393:3: ( rule__Generator__Group__0 )
            {
             before(grammarAccess.getGeneratorAccess().getGroup()); 
            // InternalMGLang.g:394:3: ( rule__Generator__Group__0 )
            // InternalMGLang.g:394:4: rule__Generator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleGeneratorElement"
    // InternalMGLang.g:403:1: entryRuleGeneratorElement : ruleGeneratorElement EOF ;
    public final void entryRuleGeneratorElement() throws RecognitionException {
        try {
            // InternalMGLang.g:404:1: ( ruleGeneratorElement EOF )
            // InternalMGLang.g:405:1: ruleGeneratorElement EOF
            {
             before(grammarAccess.getGeneratorElementRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneratorElement();

            state._fsp--;

             after(grammarAccess.getGeneratorElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeneratorElement"


    // $ANTLR start "ruleGeneratorElement"
    // InternalMGLang.g:412:1: ruleGeneratorElement : ( ( rule__GeneratorElement__Alternatives ) ) ;
    public final void ruleGeneratorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:416:2: ( ( ( rule__GeneratorElement__Alternatives ) ) )
            // InternalMGLang.g:417:2: ( ( rule__GeneratorElement__Alternatives ) )
            {
            // InternalMGLang.g:417:2: ( ( rule__GeneratorElement__Alternatives ) )
            // InternalMGLang.g:418:3: ( rule__GeneratorElement__Alternatives )
            {
             before(grammarAccess.getGeneratorElementAccess().getAlternatives()); 
            // InternalMGLang.g:419:3: ( rule__GeneratorElement__Alternatives )
            // InternalMGLang.g:419:4: rule__GeneratorElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratorElement"


    // $ANTLR start "entryRuleGeneratorCommand"
    // InternalMGLang.g:428:1: entryRuleGeneratorCommand : ruleGeneratorCommand EOF ;
    public final void entryRuleGeneratorCommand() throws RecognitionException {
        try {
            // InternalMGLang.g:429:1: ( ruleGeneratorCommand EOF )
            // InternalMGLang.g:430:1: ruleGeneratorCommand EOF
            {
             before(grammarAccess.getGeneratorCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneratorCommand();

            state._fsp--;

             after(grammarAccess.getGeneratorCommandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeneratorCommand"


    // $ANTLR start "ruleGeneratorCommand"
    // InternalMGLang.g:437:1: ruleGeneratorCommand : ( ( rule__GeneratorCommand__Alternatives ) ) ;
    public final void ruleGeneratorCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:441:2: ( ( ( rule__GeneratorCommand__Alternatives ) ) )
            // InternalMGLang.g:442:2: ( ( rule__GeneratorCommand__Alternatives ) )
            {
            // InternalMGLang.g:442:2: ( ( rule__GeneratorCommand__Alternatives ) )
            // InternalMGLang.g:443:3: ( rule__GeneratorCommand__Alternatives )
            {
             before(grammarAccess.getGeneratorCommandAccess().getAlternatives()); 
            // InternalMGLang.g:444:3: ( rule__GeneratorCommand__Alternatives )
            // InternalMGLang.g:444:4: rule__GeneratorCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratorCommand"


    // $ANTLR start "entryRulePatternCall"
    // InternalMGLang.g:453:1: entryRulePatternCall : rulePatternCall EOF ;
    public final void entryRulePatternCall() throws RecognitionException {
        try {
            // InternalMGLang.g:454:1: ( rulePatternCall EOF )
            // InternalMGLang.g:455:1: rulePatternCall EOF
            {
             before(grammarAccess.getPatternCallRule()); 
            pushFollow(FOLLOW_1);
            rulePatternCall();

            state._fsp--;

             after(grammarAccess.getPatternCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatternCall"


    // $ANTLR start "rulePatternCall"
    // InternalMGLang.g:462:1: rulePatternCall : ( ( rule__PatternCall__Group__0 ) ) ;
    public final void rulePatternCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:466:2: ( ( ( rule__PatternCall__Group__0 ) ) )
            // InternalMGLang.g:467:2: ( ( rule__PatternCall__Group__0 ) )
            {
            // InternalMGLang.g:467:2: ( ( rule__PatternCall__Group__0 ) )
            // InternalMGLang.g:468:3: ( rule__PatternCall__Group__0 )
            {
             before(grammarAccess.getPatternCallAccess().getGroup()); 
            // InternalMGLang.g:469:3: ( rule__PatternCall__Group__0 )
            // InternalMGLang.g:469:4: rule__PatternCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternCall"


    // $ANTLR start "entryRulePatternObjectCreation"
    // InternalMGLang.g:478:1: entryRulePatternObjectCreation : rulePatternObjectCreation EOF ;
    public final void entryRulePatternObjectCreation() throws RecognitionException {
        try {
            // InternalMGLang.g:479:1: ( rulePatternObjectCreation EOF )
            // InternalMGLang.g:480:1: rulePatternObjectCreation EOF
            {
             before(grammarAccess.getPatternObjectCreationRule()); 
            pushFollow(FOLLOW_1);
            rulePatternObjectCreation();

            state._fsp--;

             after(grammarAccess.getPatternObjectCreationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatternObjectCreation"


    // $ANTLR start "rulePatternObjectCreation"
    // InternalMGLang.g:487:1: rulePatternObjectCreation : ( ( rule__PatternObjectCreation__Group__0 ) ) ;
    public final void rulePatternObjectCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:491:2: ( ( ( rule__PatternObjectCreation__Group__0 ) ) )
            // InternalMGLang.g:492:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            {
            // InternalMGLang.g:492:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            // InternalMGLang.g:493:3: ( rule__PatternObjectCreation__Group__0 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getGroup()); 
            // InternalMGLang.g:494:3: ( rule__PatternObjectCreation__Group__0 )
            // InternalMGLang.g:494:4: rule__PatternObjectCreation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternObjectCreationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternObjectCreation"


    // $ANTLR start "entryRulePatternObject"
    // InternalMGLang.g:503:1: entryRulePatternObject : rulePatternObject EOF ;
    public final void entryRulePatternObject() throws RecognitionException {
        try {
            // InternalMGLang.g:504:1: ( rulePatternObject EOF )
            // InternalMGLang.g:505:1: rulePatternObject EOF
            {
             before(grammarAccess.getPatternObjectRule()); 
            pushFollow(FOLLOW_1);
            rulePatternObject();

            state._fsp--;

             after(grammarAccess.getPatternObjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatternObject"


    // $ANTLR start "rulePatternObject"
    // InternalMGLang.g:512:1: rulePatternObject : ( ( rule__PatternObject__Group__0 ) ) ;
    public final void rulePatternObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:516:2: ( ( ( rule__PatternObject__Group__0 ) ) )
            // InternalMGLang.g:517:2: ( ( rule__PatternObject__Group__0 ) )
            {
            // InternalMGLang.g:517:2: ( ( rule__PatternObject__Group__0 ) )
            // InternalMGLang.g:518:3: ( rule__PatternObject__Group__0 )
            {
             before(grammarAccess.getPatternObjectAccess().getGroup()); 
            // InternalMGLang.g:519:3: ( rule__PatternObject__Group__0 )
            // InternalMGLang.g:519:4: rule__PatternObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternObject"


    // $ANTLR start "entryRuleForLoop"
    // InternalMGLang.g:528:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalMGLang.g:529:1: ( ruleForLoop EOF )
            // InternalMGLang.g:530:1: ruleForLoop EOF
            {
             before(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleForLoop();

            state._fsp--;

             after(grammarAccess.getForLoopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalMGLang.g:537:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:541:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalMGLang.g:542:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalMGLang.g:542:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalMGLang.g:543:3: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalMGLang.g:544:3: ( rule__ForLoop__Group__0 )
            // InternalMGLang.g:544:4: rule__ForLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleForCondition"
    // InternalMGLang.g:553:1: entryRuleForCondition : ruleForCondition EOF ;
    public final void entryRuleForCondition() throws RecognitionException {
        try {
            // InternalMGLang.g:554:1: ( ruleForCondition EOF )
            // InternalMGLang.g:555:1: ruleForCondition EOF
            {
             before(grammarAccess.getForConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleForCondition();

            state._fsp--;

             after(grammarAccess.getForConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForCondition"


    // $ANTLR start "ruleForCondition"
    // InternalMGLang.g:562:1: ruleForCondition : ( ( rule__ForCondition__Alternatives ) ) ;
    public final void ruleForCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:566:2: ( ( ( rule__ForCondition__Alternatives ) ) )
            // InternalMGLang.g:567:2: ( ( rule__ForCondition__Alternatives ) )
            {
            // InternalMGLang.g:567:2: ( ( rule__ForCondition__Alternatives ) )
            // InternalMGLang.g:568:3: ( rule__ForCondition__Alternatives )
            {
             before(grammarAccess.getForConditionAccess().getAlternatives()); 
            // InternalMGLang.g:569:3: ( rule__ForCondition__Alternatives )
            // InternalMGLang.g:569:4: rule__ForCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ForCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getForConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForCondition"


    // $ANTLR start "entryRuleForEachCollection"
    // InternalMGLang.g:578:1: entryRuleForEachCollection : ruleForEachCollection EOF ;
    public final void entryRuleForEachCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:579:1: ( ruleForEachCollection EOF )
            // InternalMGLang.g:580:1: ruleForEachCollection EOF
            {
             before(grammarAccess.getForEachCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleForEachCollection();

            state._fsp--;

             after(grammarAccess.getForEachCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForEachCollection"


    // $ANTLR start "ruleForEachCollection"
    // InternalMGLang.g:587:1: ruleForEachCollection : ( ( rule__ForEachCollection__CollAssignment ) ) ;
    public final void ruleForEachCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:591:2: ( ( ( rule__ForEachCollection__CollAssignment ) ) )
            // InternalMGLang.g:592:2: ( ( rule__ForEachCollection__CollAssignment ) )
            {
            // InternalMGLang.g:592:2: ( ( rule__ForEachCollection__CollAssignment ) )
            // InternalMGLang.g:593:3: ( rule__ForEachCollection__CollAssignment )
            {
             before(grammarAccess.getForEachCollectionAccess().getCollAssignment()); 
            // InternalMGLang.g:594:3: ( rule__ForEachCollection__CollAssignment )
            // InternalMGLang.g:594:4: rule__ForEachCollection__CollAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ForEachCollection__CollAssignment();

            state._fsp--;


            }

             after(grammarAccess.getForEachCollectionAccess().getCollAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForEachCollection"


    // $ANTLR start "entryRuleForRange"
    // InternalMGLang.g:603:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:604:1: ( ruleForRange EOF )
            // InternalMGLang.g:605:1: ruleForRange EOF
            {
             before(grammarAccess.getForRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleForRange();

            state._fsp--;

             after(grammarAccess.getForRangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForRange"


    // $ANTLR start "ruleForRange"
    // InternalMGLang.g:612:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:616:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:617:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:617:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:618:3: ( rule__ForRange__Group__0 )
            {
             before(grammarAccess.getForRangeAccess().getGroup()); 
            // InternalMGLang.g:619:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:619:4: rule__ForRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForRange"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMGLang.g:628:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:629:1: ( ruleLiteralExpression EOF )
            // InternalMGLang.g:630:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMGLang.g:637:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:641:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMGLang.g:642:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMGLang.g:642:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMGLang.g:643:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMGLang.g:644:3: ( rule__LiteralExpression__Alternatives )
            // InternalMGLang.g:644:4: rule__LiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMGLang.g:653:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:654:1: ( ruleNumberLiteral EOF )
            // InternalMGLang.g:655:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMGLang.g:662:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:666:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalMGLang.g:667:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalMGLang.g:667:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalMGLang.g:668:3: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // InternalMGLang.g:669:3: ( rule__NumberLiteral__Group__0 )
            // InternalMGLang.g:669:4: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "ruleEditorRelation"
    // InternalMGLang.g:678:1: ruleEditorRelation : ( ( rule__EditorRelation__Alternatives ) ) ;
    public final void ruleEditorRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:682:1: ( ( ( rule__EditorRelation__Alternatives ) ) )
            // InternalMGLang.g:683:2: ( ( rule__EditorRelation__Alternatives ) )
            {
            // InternalMGLang.g:683:2: ( ( rule__EditorRelation__Alternatives ) )
            // InternalMGLang.g:684:3: ( rule__EditorRelation__Alternatives )
            {
             before(grammarAccess.getEditorRelationAccess().getAlternatives()); 
            // InternalMGLang.g:685:3: ( rule__EditorRelation__Alternatives )
            // InternalMGLang.g:685:4: rule__EditorRelation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EditorRelation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEditorRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditorRelation"


    // $ANTLR start "rule__MofgenFile__Alternatives_1"
    // InternalMGLang.g:693:1: rule__MofgenFile__Alternatives_1 : ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) );
    public final void rule__MofgenFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:697:1: ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==36) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGLang.g:698:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    {
                    // InternalMGLang.g:698:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    // InternalMGLang.g:699:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 
                    // InternalMGLang.g:700:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    // InternalMGLang.g:700:4: rule__MofgenFile__PatternsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MofgenFile__PatternsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:704:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    {
                    // InternalMGLang.g:704:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    // InternalMGLang.g:705:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 
                    // InternalMGLang.g:706:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    // InternalMGLang.g:706:4: rule__MofgenFile__GeneratorsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MofgenFile__GeneratorsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Alternatives_1"


    // $ANTLR start "rule__Pattern__Alternatives_4"
    // InternalMGLang.g:714:1: rule__Pattern__Alternatives_4 : ( ( ( rule__Pattern__NodesAssignment_4_0 ) ) | ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) ) );
    public final void rule__Pattern__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:718:1: ( ( ( rule__Pattern__NodesAssignment_4_0 ) ) | ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==32||LA2_1==34) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
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
                    // InternalMGLang.g:719:2: ( ( rule__Pattern__NodesAssignment_4_0 ) )
                    {
                    // InternalMGLang.g:719:2: ( ( rule__Pattern__NodesAssignment_4_0 ) )
                    // InternalMGLang.g:720:3: ( rule__Pattern__NodesAssignment_4_0 )
                    {
                     before(grammarAccess.getPatternAccess().getNodesAssignment_4_0()); 
                    // InternalMGLang.g:721:3: ( rule__Pattern__NodesAssignment_4_0 )
                    // InternalMGLang.g:721:4: rule__Pattern__NodesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__NodesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getNodesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:725:2: ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) )
                    {
                    // InternalMGLang.g:725:2: ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) )
                    // InternalMGLang.g:726:3: ( rule__Pattern__RefsAssignsAssignment_4_1 )
                    {
                     before(grammarAccess.getPatternAccess().getRefsAssignsAssignment_4_1()); 
                    // InternalMGLang.g:727:3: ( rule__Pattern__RefsAssignsAssignment_4_1 )
                    // InternalMGLang.g:727:4: rule__Pattern__RefsAssignsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__RefsAssignsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getRefsAssignsAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Alternatives_4"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Alternatives_0"
    // InternalMGLang.g:735:1: rule__NodeReferenceOrAssignment__Alternatives_0 : ( ( rulePatternNodeReference ) | ( ruleAssignment ) );
    public final void rule__NodeReferenceOrAssignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:739:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==32) ) {
                    alt3=1;
                }
                else if ( (LA3_1==34) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMGLang.g:740:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:740:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:741:3: rulePatternNodeReference
                    {
                     before(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePatternNodeReference();

                    state._fsp--;

                     after(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:746:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:746:2: ( ruleAssignment )
                    // InternalMGLang.g:747:3: ruleAssignment
                    {
                     before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Alternatives_0"


    // $ANTLR start "rule__GeneratorElement__Alternatives"
    // InternalMGLang.g:756:1: rule__GeneratorElement__Alternatives : ( ( ruleGeneratorCommand ) | ( ruleForLoop ) );
    public final void rule__GeneratorElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:760:1: ( ( ruleGeneratorCommand ) | ( ruleForLoop ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:761:2: ( ruleGeneratorCommand )
                    {
                    // InternalMGLang.g:761:2: ( ruleGeneratorCommand )
                    // InternalMGLang.g:762:3: ruleGeneratorCommand
                    {
                     before(grammarAccess.getGeneratorElementAccess().getGeneratorCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneratorCommand();

                    state._fsp--;

                     after(grammarAccess.getGeneratorElementAccess().getGeneratorCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:767:2: ( ruleForLoop )
                    {
                    // InternalMGLang.g:767:2: ( ruleForLoop )
                    // InternalMGLang.g:768:3: ruleForLoop
                    {
                     before(grammarAccess.getGeneratorElementAccess().getForLoopParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;

                     after(grammarAccess.getGeneratorElementAccess().getForLoopParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorElement__Alternatives"


    // $ANTLR start "rule__GeneratorCommand__Alternatives"
    // InternalMGLang.g:777:1: rule__GeneratorCommand__Alternatives : ( ( rulePatternCall ) | ( rulePatternObjectCreation ) );
    public final void rule__GeneratorCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:781:1: ( ( rulePatternCall ) | ( rulePatternObjectCreation ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=25 && LA5_1<=26)||LA5_1==37) ) {
                    alt5=1;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==RULE_ASSIGNMENT_OP) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==RULE_ID||(LA5_3>=25 && LA5_3<=26)||LA5_3==37) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGLang.g:782:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:782:2: ( rulePatternCall )
                    // InternalMGLang.g:783:3: rulePatternCall
                    {
                     before(grammarAccess.getGeneratorCommandAccess().getPatternCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;

                     after(grammarAccess.getGeneratorCommandAccess().getPatternCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:788:2: ( rulePatternObjectCreation )
                    {
                    // InternalMGLang.g:788:2: ( rulePatternObjectCreation )
                    // InternalMGLang.g:789:3: rulePatternObjectCreation
                    {
                     before(grammarAccess.getGeneratorCommandAccess().getPatternObjectCreationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePatternObjectCreation();

                    state._fsp--;

                     after(grammarAccess.getGeneratorCommandAccess().getPatternObjectCreationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorCommand__Alternatives"


    // $ANTLR start "rule__ForCondition__Alternatives"
    // InternalMGLang.g:798:1: rule__ForCondition__Alternatives : ( ( ruleForEachCollection ) | ( ruleForRange ) );
    public final void rule__ForCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:802:1: ( ( ruleForEachCollection ) | ( ruleForRange ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:803:2: ( ruleForEachCollection )
                    {
                    // InternalMGLang.g:803:2: ( ruleForEachCollection )
                    // InternalMGLang.g:804:3: ruleForEachCollection
                    {
                     before(grammarAccess.getForConditionAccess().getForEachCollectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForEachCollection();

                    state._fsp--;

                     after(grammarAccess.getForConditionAccess().getForEachCollectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:809:2: ( ruleForRange )
                    {
                    // InternalMGLang.g:809:2: ( ruleForRange )
                    // InternalMGLang.g:810:3: ruleForRange
                    {
                     before(grammarAccess.getForConditionAccess().getForRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleForRange();

                    state._fsp--;

                     after(grammarAccess.getForConditionAccess().getForRangeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCondition__Alternatives"


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalMGLang.g:819:1: rule__LiteralExpression__Alternatives : ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) | ( ( rule__LiteralExpression__Group_2__0 ) ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:823:1: ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) | ( ( rule__LiteralExpression__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
            case 32:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:824:2: ( ( rule__LiteralExpression__Group_0__0 ) )
                    {
                    // InternalMGLang.g:824:2: ( ( rule__LiteralExpression__Group_0__0 ) )
                    // InternalMGLang.g:825:3: ( rule__LiteralExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_0()); 
                    // InternalMGLang.g:826:3: ( rule__LiteralExpression__Group_0__0 )
                    // InternalMGLang.g:826:4: rule__LiteralExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:830:2: ( ( rule__LiteralExpression__Group_1__0 ) )
                    {
                    // InternalMGLang.g:830:2: ( ( rule__LiteralExpression__Group_1__0 ) )
                    // InternalMGLang.g:831:3: ( rule__LiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_1()); 
                    // InternalMGLang.g:832:3: ( rule__LiteralExpression__Group_1__0 )
                    // InternalMGLang.g:832:4: rule__LiteralExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:836:2: ( ( rule__LiteralExpression__Group_2__0 ) )
                    {
                    // InternalMGLang.g:836:2: ( ( rule__LiteralExpression__Group_2__0 ) )
                    // InternalMGLang.g:837:3: ( rule__LiteralExpression__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_2()); 
                    // InternalMGLang.g:838:3: ( rule__LiteralExpression__Group_2__0 )
                    // InternalMGLang.g:838:4: rule__LiteralExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Alternatives"


    // $ANTLR start "rule__LiteralExpression__ValueAlternatives_0_1_0"
    // InternalMGLang.g:846:1: rule__LiteralExpression__ValueAlternatives_0_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__LiteralExpression__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:850:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMGLang.g:851:2: ( 'true' )
                    {
                    // InternalMGLang.g:851:2: ( 'true' )
                    // InternalMGLang.g:852:3: 'true'
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLiteralExpressionAccess().getValueTrueKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:857:2: ( 'false' )
                    {
                    // InternalMGLang.g:857:2: ( 'false' )
                    // InternalMGLang.g:858:3: 'false'
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getValueFalseKeyword_0_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLiteralExpressionAccess().getValueFalseKeyword_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__ValueAlternatives_0_1_0"


    // $ANTLR start "rule__EditorRelation__Alternatives"
    // InternalMGLang.g:867:1: rule__EditorRelation__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__EditorRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:871:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 20:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:872:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:872:2: ( ( '>' ) )
                    // InternalMGLang.g:873:3: ( '>' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:874:3: ( '>' )
                    // InternalMGLang.g:874:4: '>'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:878:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:878:2: ( ( '>=' ) )
                    // InternalMGLang.g:879:3: ( '>=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:880:3: ( '>=' )
                    // InternalMGLang.g:880:4: '>='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:884:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:884:2: ( ( '==' ) )
                    // InternalMGLang.g:885:3: ( '==' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:886:3: ( '==' )
                    // InternalMGLang.g:886:4: '=='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:890:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:890:2: ( ( '!=' ) )
                    // InternalMGLang.g:891:3: ( '!=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:892:3: ( '!=' )
                    // InternalMGLang.g:892:4: '!='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:896:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:896:2: ( ( '<=' ) )
                    // InternalMGLang.g:897:3: ( '<=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 
                    // InternalMGLang.g:898:3: ( '<=' )
                    // InternalMGLang.g:898:4: '<='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:902:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:902:2: ( ( '<' ) )
                    // InternalMGLang.g:903:3: ( '<' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getSMALLEREnumLiteralDeclaration_5()); 
                    // InternalMGLang.g:904:3: ( '<' )
                    // InternalMGLang.g:904:4: '<'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getSMALLEREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorRelation__Alternatives"


    // $ANTLR start "rule__MofgenFile__Group__0"
    // InternalMGLang.g:912:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:916:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:917:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MofgenFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__0"


    // $ANTLR start "rule__MofgenFile__Group__0__Impl"
    // InternalMGLang.g:924:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:928:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:929:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:929:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:930:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            // InternalMGLang.g:931:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMGLang.g:931:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__0__Impl"


    // $ANTLR start "rule__MofgenFile__Group__1"
    // InternalMGLang.g:939:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:943:1: ( rule__MofgenFile__Group__1__Impl )
            // InternalMGLang.g:944:2: rule__MofgenFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__1"


    // $ANTLR start "rule__MofgenFile__Group__1__Impl"
    // InternalMGLang.g:950:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__Alternatives_1 )* ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:954:1: ( ( ( rule__MofgenFile__Alternatives_1 )* ) )
            // InternalMGLang.g:955:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            {
            // InternalMGLang.g:955:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            // InternalMGLang.g:956:2: ( rule__MofgenFile__Alternatives_1 )*
            {
             before(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 
            // InternalMGLang.g:957:2: ( rule__MofgenFile__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23||LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMGLang.g:957:3: rule__MofgenFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MofgenFile__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMGLang.g:966:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:970:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:971:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMGLang.g:978:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:982:1: ( ( 'import' ) )
            // InternalMGLang.g:983:1: ( 'import' )
            {
            // InternalMGLang.g:983:1: ( 'import' )
            // InternalMGLang.g:984:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMGLang.g:993:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:997:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:998:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMGLang.g:1005:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1009:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalMGLang.g:1010:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1010:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalMGLang.g:1011:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1012:2: ( rule__Import__NameAssignment_1 )
            // InternalMGLang.g:1012:3: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMGLang.g:1020:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1024:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:1025:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMGLang.g:1032:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1036:1: ( ( 'as' ) )
            // InternalMGLang.g:1037:1: ( 'as' )
            {
            // InternalMGLang.g:1037:1: ( 'as' )
            // InternalMGLang.g:1038:2: 'as'
            {
             before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalMGLang.g:1047:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1051:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:1052:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalMGLang.g:1058:1: rule__Import__Group__3__Impl : ( ( rule__Import__AliasAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1062:1: ( ( ( rule__Import__AliasAssignment_3 ) ) )
            // InternalMGLang.g:1063:1: ( ( rule__Import__AliasAssignment_3 ) )
            {
            // InternalMGLang.g:1063:1: ( ( rule__Import__AliasAssignment_3 ) )
            // InternalMGLang.g:1064:2: ( rule__Import__AliasAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getAliasAssignment_3()); 
            // InternalMGLang.g:1065:2: ( rule__Import__AliasAssignment_3 )
            // InternalMGLang.g:1065:3: rule__Import__AliasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Import__AliasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAliasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalMGLang.g:1074:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1078:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:1079:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalMGLang.g:1086:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1090:1: ( ( 'pattern' ) )
            // InternalMGLang.g:1091:1: ( 'pattern' )
            {
            // InternalMGLang.g:1091:1: ( 'pattern' )
            // InternalMGLang.g:1092:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalMGLang.g:1101:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1105:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:1106:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalMGLang.g:1113:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1117:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:1118:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1118:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:1119:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1120:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:1120:3: rule__Pattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalMGLang.g:1128:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1132:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:1133:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalMGLang.g:1140:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1144:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:1145:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:1145:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:1146:2: ( rule__Pattern__Group_2__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalMGLang.g:1147:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:1147:3: rule__Pattern__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalMGLang.g:1155:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1159:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:1160:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalMGLang.g:1167:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1171:1: ( ( '{' ) )
            // InternalMGLang.g:1172:1: ( '{' )
            {
            // InternalMGLang.g:1172:1: ( '{' )
            // InternalMGLang.g:1173:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalMGLang.g:1182:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1186:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:1187:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalMGLang.g:1194:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Alternatives_4 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1198:1: ( ( ( rule__Pattern__Alternatives_4 )* ) )
            // InternalMGLang.g:1199:1: ( ( rule__Pattern__Alternatives_4 )* )
            {
            // InternalMGLang.g:1199:1: ( ( rule__Pattern__Alternatives_4 )* )
            // InternalMGLang.g:1200:2: ( rule__Pattern__Alternatives_4 )*
            {
             before(grammarAccess.getPatternAccess().getAlternatives_4()); 
            // InternalMGLang.g:1201:2: ( rule__Pattern__Alternatives_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMGLang.g:1201:3: rule__Pattern__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalMGLang.g:1209:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1213:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:1214:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Pattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalMGLang.g:1221:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1225:1: ( ( '}' ) )
            // InternalMGLang.g:1226:1: ( '}' )
            {
            // InternalMGLang.g:1226:1: ( '}' )
            // InternalMGLang.g:1227:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group__6"
    // InternalMGLang.g:1236:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1240:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:1241:2: rule__Pattern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6"


    // $ANTLR start "rule__Pattern__Group__6__Impl"
    // InternalMGLang.g:1247:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 ) ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1251:1: ( ( ( rule__Pattern__ReturnAssignment_6 ) ) )
            // InternalMGLang.g:1252:1: ( ( rule__Pattern__ReturnAssignment_6 ) )
            {
            // InternalMGLang.g:1252:1: ( ( rule__Pattern__ReturnAssignment_6 ) )
            // InternalMGLang.g:1253:2: ( rule__Pattern__ReturnAssignment_6 )
            {
             before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            // InternalMGLang.g:1254:2: ( rule__Pattern__ReturnAssignment_6 )
            // InternalMGLang.g:1254:3: rule__Pattern__ReturnAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__ReturnAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getReturnAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6__Impl"


    // $ANTLR start "rule__Pattern__Group_2__0"
    // InternalMGLang.g:1263:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1267:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:1268:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0"


    // $ANTLR start "rule__Pattern__Group_2__0__Impl"
    // InternalMGLang.g:1275:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1279:1: ( ( '(' ) )
            // InternalMGLang.g:1280:1: ( '(' )
            {
            // InternalMGLang.g:1280:1: ( '(' )
            // InternalMGLang.g:1281:2: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2__1"
    // InternalMGLang.g:1290:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1294:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:1295:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__Pattern__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1"


    // $ANTLR start "rule__Pattern__Group_2__1__Impl"
    // InternalMGLang.g:1302:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1306:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:1307:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:1307:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:1308:2: ( rule__Pattern__Group_2_1__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalMGLang.g:1309:2: ( rule__Pattern__Group_2_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:1309:3: rule__Pattern__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2__2"
    // InternalMGLang.g:1317:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1321:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:1322:2: rule__Pattern__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__2"


    // $ANTLR start "rule__Pattern__Group_2__2__Impl"
    // InternalMGLang.g:1328:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1332:1: ( ( ')' ) )
            // InternalMGLang.g:1333:1: ( ')' )
            {
            // InternalMGLang.g:1333:1: ( ')' )
            // InternalMGLang.g:1334:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__2__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1__0"
    // InternalMGLang.g:1344:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1348:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:1349:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Pattern__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__0"


    // $ANTLR start "rule__Pattern__Group_2_1__0__Impl"
    // InternalMGLang.g:1356:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1360:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:1361:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:1361:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:1362:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            // InternalMGLang.g:1363:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:1363:3: rule__Pattern__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__ParametersAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1__1"
    // InternalMGLang.g:1371:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1375:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:1376:2: rule__Pattern__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__1"


    // $ANTLR start "rule__Pattern__Group_2_1__1__Impl"
    // InternalMGLang.g:1382:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1386:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:1387:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:1387:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:1388:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            // InternalMGLang.g:1389:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGLang.g:1389:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1_1__0"
    // InternalMGLang.g:1398:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1402:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:1403:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Pattern__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__0"


    // $ANTLR start "rule__Pattern__Group_2_1_1__0__Impl"
    // InternalMGLang.g:1410:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1414:1: ( ( ',' ) )
            // InternalMGLang.g:1415:1: ( ',' )
            {
            // InternalMGLang.g:1415:1: ( ',' )
            // InternalMGLang.g:1416:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1_1__1"
    // InternalMGLang.g:1425:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1429:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:1430:2: rule__Pattern__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__1"


    // $ANTLR start "rule__Pattern__Group_2_1_1__1__Impl"
    // InternalMGLang.g:1436:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1440:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:1441:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:1441:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:1442:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            // InternalMGLang.g:1443:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:1443:3: rule__Pattern__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__ParametersAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__PatternReturn__Group__0"
    // InternalMGLang.g:1452:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1456:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:1457:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__PatternReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__0"


    // $ANTLR start "rule__PatternReturn__Group__0__Impl"
    // InternalMGLang.g:1464:1: rule__PatternReturn__Group__0__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1468:1: ( ( 'return' ) )
            // InternalMGLang.g:1469:1: ( 'return' )
            {
            // InternalMGLang.g:1469:1: ( 'return' )
            // InternalMGLang.g:1470:2: 'return'
            {
             before(grammarAccess.getPatternReturnAccess().getReturnKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__0__Impl"


    // $ANTLR start "rule__PatternReturn__Group__1"
    // InternalMGLang.g:1479:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1483:1: ( rule__PatternReturn__Group__1__Impl )
            // InternalMGLang.g:1484:2: rule__PatternReturn__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__1"


    // $ANTLR start "rule__PatternReturn__Group__1__Impl"
    // InternalMGLang.g:1490:1: rule__PatternReturn__Group__1__Impl : ( ( rule__PatternReturn__ThisUsedAssignment_1 ) ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1494:1: ( ( ( rule__PatternReturn__ThisUsedAssignment_1 ) ) )
            // InternalMGLang.g:1495:1: ( ( rule__PatternReturn__ThisUsedAssignment_1 ) )
            {
            // InternalMGLang.g:1495:1: ( ( rule__PatternReturn__ThisUsedAssignment_1 ) )
            // InternalMGLang.g:1496:2: ( rule__PatternReturn__ThisUsedAssignment_1 )
            {
             before(grammarAccess.getPatternReturnAccess().getThisUsedAssignment_1()); 
            // InternalMGLang.g:1497:2: ( rule__PatternReturn__ThisUsedAssignment_1 )
            // InternalMGLang.g:1497:3: rule__PatternReturn__ThisUsedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__ThisUsedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternReturnAccess().getThisUsedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__1__Impl"


    // $ANTLR start "rule__PatternNodeCreation__Group__0"
    // InternalMGLang.g:1506:1: rule__PatternNodeCreation__Group__0 : rule__PatternNodeCreation__Group__0__Impl rule__PatternNodeCreation__Group__1 ;
    public final void rule__PatternNodeCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1510:1: ( rule__PatternNodeCreation__Group__0__Impl rule__PatternNodeCreation__Group__1 )
            // InternalMGLang.g:1511:2: rule__PatternNodeCreation__Group__0__Impl rule__PatternNodeCreation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PatternNodeCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternNodeCreation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeCreation__Group__0"


    // $ANTLR start "rule__PatternNodeCreation__Group__0__Impl"
    // InternalMGLang.g:1518:1: rule__PatternNodeCreation__Group__0__Impl : ( ( rule__PatternNodeCreation__NodeAssignment_0 ) ) ;
    public final void rule__PatternNodeCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1522:1: ( ( ( rule__PatternNodeCreation__NodeAssignment_0 ) ) )
            // InternalMGLang.g:1523:1: ( ( rule__PatternNodeCreation__NodeAssignment_0 ) )
            {
            // InternalMGLang.g:1523:1: ( ( rule__PatternNodeCreation__NodeAssignment_0 ) )
            // InternalMGLang.g:1524:2: ( rule__PatternNodeCreation__NodeAssignment_0 )
            {
             before(grammarAccess.getPatternNodeCreationAccess().getNodeAssignment_0()); 
            // InternalMGLang.g:1525:2: ( rule__PatternNodeCreation__NodeAssignment_0 )
            // InternalMGLang.g:1525:3: rule__PatternNodeCreation__NodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeCreation__NodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeCreationAccess().getNodeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeCreation__Group__0__Impl"


    // $ANTLR start "rule__PatternNodeCreation__Group__1"
    // InternalMGLang.g:1533:1: rule__PatternNodeCreation__Group__1 : rule__PatternNodeCreation__Group__1__Impl ;
    public final void rule__PatternNodeCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1537:1: ( rule__PatternNodeCreation__Group__1__Impl )
            // InternalMGLang.g:1538:2: rule__PatternNodeCreation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeCreation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeCreation__Group__1"


    // $ANTLR start "rule__PatternNodeCreation__Group__1__Impl"
    // InternalMGLang.g:1544:1: rule__PatternNodeCreation__Group__1__Impl : ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? ) ;
    public final void rule__PatternNodeCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1548:1: ( ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? ) )
            // InternalMGLang.g:1549:1: ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? )
            {
            // InternalMGLang.g:1549:1: ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? )
            // InternalMGLang.g:1550:2: ( rule__PatternNodeCreation__ConstructorAssignment_1 )?
            {
             before(grammarAccess.getPatternNodeCreationAccess().getConstructorAssignment_1()); 
            // InternalMGLang.g:1551:2: ( rule__PatternNodeCreation__ConstructorAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1551:3: rule__PatternNodeCreation__ConstructorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternNodeCreation__ConstructorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternNodeCreationAccess().getConstructorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeCreation__Group__1__Impl"


    // $ANTLR start "rule__NodeConstructor__Group__0"
    // InternalMGLang.g:1560:1: rule__NodeConstructor__Group__0 : rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 ;
    public final void rule__NodeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1564:1: ( rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 )
            // InternalMGLang.g:1565:2: rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeConstructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeConstructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__0"


    // $ANTLR start "rule__NodeConstructor__Group__0__Impl"
    // InternalMGLang.g:1572:1: rule__NodeConstructor__Group__0__Impl : ( () ) ;
    public final void rule__NodeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1576:1: ( ( () ) )
            // InternalMGLang.g:1577:1: ( () )
            {
            // InternalMGLang.g:1577:1: ( () )
            // InternalMGLang.g:1578:2: ()
            {
             before(grammarAccess.getNodeConstructorAccess().getNodeConstructorAction_0()); 
            // InternalMGLang.g:1579:2: ()
            // InternalMGLang.g:1579:3: 
            {
            }

             after(grammarAccess.getNodeConstructorAccess().getNodeConstructorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__0__Impl"


    // $ANTLR start "rule__NodeConstructor__Group__1"
    // InternalMGLang.g:1587:1: rule__NodeConstructor__Group__1 : rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 ;
    public final void rule__NodeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1591:1: ( rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 )
            // InternalMGLang.g:1592:2: rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__NodeConstructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeConstructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__1"


    // $ANTLR start "rule__NodeConstructor__Group__1__Impl"
    // InternalMGLang.g:1599:1: rule__NodeConstructor__Group__1__Impl : ( '(' ) ;
    public final void rule__NodeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1603:1: ( ( '(' ) )
            // InternalMGLang.g:1604:1: ( '(' )
            {
            // InternalMGLang.g:1604:1: ( '(' )
            // InternalMGLang.g:1605:2: '('
            {
             before(grammarAccess.getNodeConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNodeConstructorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__1__Impl"


    // $ANTLR start "rule__NodeConstructor__Group__2"
    // InternalMGLang.g:1614:1: rule__NodeConstructor__Group__2 : rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 ;
    public final void rule__NodeConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1618:1: ( rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 )
            // InternalMGLang.g:1619:2: rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__NodeConstructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeConstructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__2"


    // $ANTLR start "rule__NodeConstructor__Group__2__Impl"
    // InternalMGLang.g:1626:1: rule__NodeConstructor__Group__2__Impl : ( ( rule__NodeConstructor__ParamsAssignment_2 )* ) ;
    public final void rule__NodeConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1630:1: ( ( ( rule__NodeConstructor__ParamsAssignment_2 )* ) )
            // InternalMGLang.g:1631:1: ( ( rule__NodeConstructor__ParamsAssignment_2 )* )
            {
            // InternalMGLang.g:1631:1: ( ( rule__NodeConstructor__ParamsAssignment_2 )* )
            // InternalMGLang.g:1632:2: ( rule__NodeConstructor__ParamsAssignment_2 )*
            {
             before(grammarAccess.getNodeConstructorAccess().getParamsAssignment_2()); 
            // InternalMGLang.g:1633:2: ( rule__NodeConstructor__ParamsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_STRING)||(LA16_0>=13 && LA16_0<=14)||LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMGLang.g:1633:3: rule__NodeConstructor__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__NodeConstructor__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getNodeConstructorAccess().getParamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__2__Impl"


    // $ANTLR start "rule__NodeConstructor__Group__3"
    // InternalMGLang.g:1641:1: rule__NodeConstructor__Group__3 : rule__NodeConstructor__Group__3__Impl ;
    public final void rule__NodeConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1645:1: ( rule__NodeConstructor__Group__3__Impl )
            // InternalMGLang.g:1646:2: rule__NodeConstructor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeConstructor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__3"


    // $ANTLR start "rule__NodeConstructor__Group__3__Impl"
    // InternalMGLang.g:1652:1: rule__NodeConstructor__Group__3__Impl : ( ')' ) ;
    public final void rule__NodeConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1656:1: ( ( ')' ) )
            // InternalMGLang.g:1657:1: ( ')' )
            {
            // InternalMGLang.g:1657:1: ( ')' )
            // InternalMGLang.g:1658:2: ')'
            {
             before(grammarAccess.getNodeConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNodeConstructorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalMGLang.g:1668:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1672:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:1673:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalMGLang.g:1680:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1684:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:1685:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:1685:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:1686:2: ( rule__Node__TypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:1687:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:1687:3: rule__Node__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalMGLang.g:1695:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1699:1: ( rule__Node__Group__1__Impl )
            // InternalMGLang.g:1700:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalMGLang.g:1706:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1710:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:1711:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1711:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:1712:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1713:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:1713:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__0"
    // InternalMGLang.g:1722:1: rule__NodeReferenceOrAssignment__Group__0 : rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 ;
    public final void rule__NodeReferenceOrAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1726:1: ( rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 )
            // InternalMGLang.g:1727:2: rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__NodeReferenceOrAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__0"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__0__Impl"
    // InternalMGLang.g:1734:1: rule__NodeReferenceOrAssignment__Group__0__Impl : ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1738:1: ( ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) )
            // InternalMGLang.g:1739:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            {
            // InternalMGLang.g:1739:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            // InternalMGLang.g:1740:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives_0()); 
            // InternalMGLang.g:1741:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            // InternalMGLang.g:1741:3: rule__NodeReferenceOrAssignment__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__0__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__1"
    // InternalMGLang.g:1749:1: rule__NodeReferenceOrAssignment__Group__1 : rule__NodeReferenceOrAssignment__Group__1__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1753:1: ( rule__NodeReferenceOrAssignment__Group__1__Impl )
            // InternalMGLang.g:1754:2: rule__NodeReferenceOrAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__1"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__1__Impl"
    // InternalMGLang.g:1760:1: rule__NodeReferenceOrAssignment__Group__1__Impl : ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) ;
    public final void rule__NodeReferenceOrAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1764:1: ( ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) )
            // InternalMGLang.g:1765:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            {
            // InternalMGLang.g:1765:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            // InternalMGLang.g:1766:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup_1()); 
            // InternalMGLang.g:1767:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:1767:3: rule__NodeReferenceOrAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeReferenceOrAssignment__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__1__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__0"
    // InternalMGLang.g:1776:1: rule__NodeReferenceOrAssignment__Group_1__0 : rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1780:1: ( rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 )
            // InternalMGLang.g:1781:2: rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__NodeReferenceOrAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__0"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__0__Impl"
    // InternalMGLang.g:1788:1: rule__NodeReferenceOrAssignment__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1792:1: ( ( '[' ) )
            // InternalMGLang.g:1793:1: ( '[' )
            {
            // InternalMGLang.g:1793:1: ( '[' )
            // InternalMGLang.g:1794:2: '['
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__1"
    // InternalMGLang.g:1803:1: rule__NodeReferenceOrAssignment__Group_1__1 : rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1807:1: ( rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 )
            // InternalMGLang.g:1808:2: rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__NodeReferenceOrAssignment__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__1"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__1__Impl"
    // InternalMGLang.g:1815:1: rule__NodeReferenceOrAssignment__Group_1__1__Impl : ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1819:1: ( ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) )
            // InternalMGLang.g:1820:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            {
            // InternalMGLang.g:1820:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            // InternalMGLang.g:1821:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionAssignment_1_1()); 
            // InternalMGLang.g:1822:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            // InternalMGLang.g:1822:3: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__2"
    // InternalMGLang.g:1830:1: rule__NodeReferenceOrAssignment__Group_1__2 : rule__NodeReferenceOrAssignment__Group_1__2__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1834:1: ( rule__NodeReferenceOrAssignment__Group_1__2__Impl )
            // InternalMGLang.g:1835:2: rule__NodeReferenceOrAssignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__2"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__2__Impl"
    // InternalMGLang.g:1841:1: rule__NodeReferenceOrAssignment__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1845:1: ( ( ']' ) )
            // InternalMGLang.g:1846:1: ( ']' )
            {
            // InternalMGLang.g:1846:1: ( ']' )
            // InternalMGLang.g:1847:2: ']'
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMGLang.g:1857:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1861:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMGLang.g:1862:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalMGLang.g:1869:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LhsAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1873:1: ( ( ( rule__Condition__LhsAssignment_0 ) ) )
            // InternalMGLang.g:1874:1: ( ( rule__Condition__LhsAssignment_0 ) )
            {
            // InternalMGLang.g:1874:1: ( ( rule__Condition__LhsAssignment_0 ) )
            // InternalMGLang.g:1875:2: ( rule__Condition__LhsAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLhsAssignment_0()); 
            // InternalMGLang.g:1876:2: ( rule__Condition__LhsAssignment_0 )
            // InternalMGLang.g:1876:3: rule__Condition__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalMGLang.g:1884:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1888:1: ( rule__Condition__Group__1__Impl )
            // InternalMGLang.g:1889:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalMGLang.g:1895:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1899:1: ( ( ( rule__Condition__Group_1__0 )? ) )
            // InternalMGLang.g:1900:1: ( ( rule__Condition__Group_1__0 )? )
            {
            // InternalMGLang.g:1900:1: ( ( rule__Condition__Group_1__0 )? )
            // InternalMGLang.g:1901:2: ( rule__Condition__Group_1__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // InternalMGLang.g:1902:2: ( rule__Condition__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=15 && LA18_0<=20)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMGLang.g:1902:3: rule__Condition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // InternalMGLang.g:1911:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1915:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalMGLang.g:1916:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // InternalMGLang.g:1923:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__RelationAssignment_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1927:1: ( ( ( rule__Condition__RelationAssignment_1_0 ) ) )
            // InternalMGLang.g:1928:1: ( ( rule__Condition__RelationAssignment_1_0 ) )
            {
            // InternalMGLang.g:1928:1: ( ( rule__Condition__RelationAssignment_1_0 ) )
            // InternalMGLang.g:1929:2: ( rule__Condition__RelationAssignment_1_0 )
            {
             before(grammarAccess.getConditionAccess().getRelationAssignment_1_0()); 
            // InternalMGLang.g:1930:2: ( rule__Condition__RelationAssignment_1_0 )
            // InternalMGLang.g:1930:3: rule__Condition__RelationAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__RelationAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getRelationAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // InternalMGLang.g:1938:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1942:1: ( rule__Condition__Group_1__1__Impl )
            // InternalMGLang.g:1943:2: rule__Condition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // InternalMGLang.g:1949:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__RhsAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1953:1: ( ( ( rule__Condition__RhsAssignment_1_1 ) ) )
            // InternalMGLang.g:1954:1: ( ( rule__Condition__RhsAssignment_1_1 ) )
            {
            // InternalMGLang.g:1954:1: ( ( rule__Condition__RhsAssignment_1_1 ) )
            // InternalMGLang.g:1955:2: ( rule__Condition__RhsAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getRhsAssignment_1_1()); 
            // InternalMGLang.g:1956:2: ( rule__Condition__RhsAssignment_1_1 )
            // InternalMGLang.g:1956:3: rule__Condition__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__0"
    // InternalMGLang.g:1965:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1969:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:1970:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__PatternNodeReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__0"


    // $ANTLR start "rule__PatternNodeReference__Group__0__Impl"
    // InternalMGLang.g:1977:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__SourceAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1981:1: ( ( ( rule__PatternNodeReference__SourceAssignment_0 ) ) )
            // InternalMGLang.g:1982:1: ( ( rule__PatternNodeReference__SourceAssignment_0 ) )
            {
            // InternalMGLang.g:1982:1: ( ( rule__PatternNodeReference__SourceAssignment_0 ) )
            // InternalMGLang.g:1983:2: ( rule__PatternNodeReference__SourceAssignment_0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getSourceAssignment_0()); 
            // InternalMGLang.g:1984:2: ( rule__PatternNodeReference__SourceAssignment_0 )
            // InternalMGLang.g:1984:3: rule__PatternNodeReference__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__0__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__1"
    // InternalMGLang.g:1992:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1996:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:1997:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PatternNodeReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__1"


    // $ANTLR start "rule__PatternNodeReference__Group__1__Impl"
    // InternalMGLang.g:2004:1: rule__PatternNodeReference__Group__1__Impl : ( '-' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2008:1: ( ( '-' ) )
            // InternalMGLang.g:2009:1: ( '-' )
            {
            // InternalMGLang.g:2009:1: ( '-' )
            // InternalMGLang.g:2010:2: '-'
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__1__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__2"
    // InternalMGLang.g:2019:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl rule__PatternNodeReference__Group__3 ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2023:1: ( rule__PatternNodeReference__Group__2__Impl rule__PatternNodeReference__Group__3 )
            // InternalMGLang.g:2024:2: rule__PatternNodeReference__Group__2__Impl rule__PatternNodeReference__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__PatternNodeReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__2"


    // $ANTLR start "rule__PatternNodeReference__Group__2__Impl"
    // InternalMGLang.g:2031:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TypeAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2035:1: ( ( ( rule__PatternNodeReference__TypeAssignment_2 ) ) )
            // InternalMGLang.g:2036:1: ( ( rule__PatternNodeReference__TypeAssignment_2 ) )
            {
            // InternalMGLang.g:2036:1: ( ( rule__PatternNodeReference__TypeAssignment_2 ) )
            // InternalMGLang.g:2037:2: ( rule__PatternNodeReference__TypeAssignment_2 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_2()); 
            // InternalMGLang.g:2038:2: ( rule__PatternNodeReference__TypeAssignment_2 )
            // InternalMGLang.g:2038:3: rule__PatternNodeReference__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__2__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__3"
    // InternalMGLang.g:2046:1: rule__PatternNodeReference__Group__3 : rule__PatternNodeReference__Group__3__Impl rule__PatternNodeReference__Group__4 ;
    public final void rule__PatternNodeReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2050:1: ( rule__PatternNodeReference__Group__3__Impl rule__PatternNodeReference__Group__4 )
            // InternalMGLang.g:2051:2: rule__PatternNodeReference__Group__3__Impl rule__PatternNodeReference__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__PatternNodeReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__3"


    // $ANTLR start "rule__PatternNodeReference__Group__3__Impl"
    // InternalMGLang.g:2058:1: rule__PatternNodeReference__Group__3__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2062:1: ( ( '->' ) )
            // InternalMGLang.g:2063:1: ( '->' )
            {
            // InternalMGLang.g:2063:1: ( '->' )
            // InternalMGLang.g:2064:2: '->'
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__3__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__4"
    // InternalMGLang.g:2073:1: rule__PatternNodeReference__Group__4 : rule__PatternNodeReference__Group__4__Impl ;
    public final void rule__PatternNodeReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2077:1: ( rule__PatternNodeReference__Group__4__Impl )
            // InternalMGLang.g:2078:2: rule__PatternNodeReference__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__4"


    // $ANTLR start "rule__PatternNodeReference__Group__4__Impl"
    // InternalMGLang.g:2084:1: rule__PatternNodeReference__Group__4__Impl : ( ( rule__PatternNodeReference__TargetAssignment_4 ) ) ;
    public final void rule__PatternNodeReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2088:1: ( ( ( rule__PatternNodeReference__TargetAssignment_4 ) ) )
            // InternalMGLang.g:2089:1: ( ( rule__PatternNodeReference__TargetAssignment_4 ) )
            {
            // InternalMGLang.g:2089:1: ( ( rule__PatternNodeReference__TargetAssignment_4 ) )
            // InternalMGLang.g:2090:2: ( rule__PatternNodeReference__TargetAssignment_4 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_4()); 
            // InternalMGLang.g:2091:2: ( rule__PatternNodeReference__TargetAssignment_4 )
            // InternalMGLang.g:2091:3: rule__PatternNodeReference__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__4__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMGLang.g:2100:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2104:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:2105:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMGLang.g:2112:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2116:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:2117:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:2117:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:2118:2: ( rule__Assignment__TargetAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            // InternalMGLang.g:2119:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:2119:3: rule__Assignment__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMGLang.g:2127:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2131:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:2132:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMGLang.g:2139:1: rule__Assignment__Group__1__Impl : ( RULE_PATTERN_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2143:1: ( ( RULE_PATTERN_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2144:1: ( RULE_PATTERN_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2144:1: ( RULE_PATTERN_ASSIGNMENT_OP )
            // InternalMGLang.g:2145:2: RULE_PATTERN_ASSIGNMENT_OP
            {
             before(grammarAccess.getAssignmentAccess().getPATTERN_ASSIGNMENT_OPTerminalRuleCall_1()); 
            match(input,RULE_PATTERN_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getPATTERN_ASSIGNMENT_OPTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalMGLang.g:2154:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2158:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:2159:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalMGLang.g:2165:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2169:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:2170:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:2170:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:2171:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMGLang.g:2172:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:2172:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__NodeAttributeCall__Group__0"
    // InternalMGLang.g:2181:1: rule__NodeAttributeCall__Group__0 : rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 ;
    public final void rule__NodeAttributeCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2185:1: ( rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 )
            // InternalMGLang.g:2186:2: rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__NodeAttributeCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeAttributeCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__Group__0"


    // $ANTLR start "rule__NodeAttributeCall__Group__0__Impl"
    // InternalMGLang.g:2193:1: rule__NodeAttributeCall__Group__0__Impl : ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) ) ;
    public final void rule__NodeAttributeCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2197:1: ( ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) ) )
            // InternalMGLang.g:2198:1: ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) )
            {
            // InternalMGLang.g:2198:1: ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) )
            // InternalMGLang.g:2199:2: ( rule__NodeAttributeCall__ObjectAssignment_0 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getObjectAssignment_0()); 
            // InternalMGLang.g:2200:2: ( rule__NodeAttributeCall__ObjectAssignment_0 )
            // InternalMGLang.g:2200:3: rule__NodeAttributeCall__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeAttributeCall__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAttributeCallAccess().getObjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__Group__0__Impl"


    // $ANTLR start "rule__NodeAttributeCall__Group__1"
    // InternalMGLang.g:2208:1: rule__NodeAttributeCall__Group__1 : rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 ;
    public final void rule__NodeAttributeCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2212:1: ( rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 )
            // InternalMGLang.g:2213:2: rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NodeAttributeCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeAttributeCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__Group__1"


    // $ANTLR start "rule__NodeAttributeCall__Group__1__Impl"
    // InternalMGLang.g:2220:1: rule__NodeAttributeCall__Group__1__Impl : ( '.' ) ;
    public final void rule__NodeAttributeCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2224:1: ( ( '.' ) )
            // InternalMGLang.g:2225:1: ( '.' )
            {
            // InternalMGLang.g:2225:1: ( '.' )
            // InternalMGLang.g:2226:2: '.'
            {
             before(grammarAccess.getNodeAttributeCallAccess().getFullStopKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNodeAttributeCallAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__Group__1__Impl"


    // $ANTLR start "rule__NodeAttributeCall__Group__2"
    // InternalMGLang.g:2235:1: rule__NodeAttributeCall__Group__2 : rule__NodeAttributeCall__Group__2__Impl ;
    public final void rule__NodeAttributeCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2239:1: ( rule__NodeAttributeCall__Group__2__Impl )
            // InternalMGLang.g:2240:2: rule__NodeAttributeCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeAttributeCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__Group__2"


    // $ANTLR start "rule__NodeAttributeCall__Group__2__Impl"
    // InternalMGLang.g:2246:1: rule__NodeAttributeCall__Group__2__Impl : ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) ;
    public final void rule__NodeAttributeCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2250:1: ( ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:2251:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:2251:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            // InternalMGLang.g:2252:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeAssignment_2()); 
            // InternalMGLang.g:2253:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            // InternalMGLang.g:2253:3: rule__NodeAttributeCall__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeAttributeCall__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAttributeCallAccess().getAttributeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMGLang.g:2262:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2266:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMGLang.g:2267:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMGLang.g:2274:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2278:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalMGLang.g:2279:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalMGLang.g:2279:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalMGLang.g:2280:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalMGLang.g:2281:2: ( rule__Parameter__NameAssignment_0 )
            // InternalMGLang.g:2281:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMGLang.g:2289:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2293:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMGLang.g:2294:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMGLang.g:2301:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2305:1: ( ( ':' ) )
            // InternalMGLang.g:2306:1: ( ':' )
            {
            // InternalMGLang.g:2306:1: ( ':' )
            // InternalMGLang.g:2307:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalMGLang.g:2316:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2320:1: ( rule__Parameter__Group__2__Impl )
            // InternalMGLang.g:2321:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalMGLang.g:2327:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2331:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalMGLang.g:2332:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalMGLang.g:2332:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalMGLang.g:2333:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalMGLang.g:2334:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalMGLang.g:2334:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Generator__Group__0"
    // InternalMGLang.g:2343:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2347:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:2348:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Generator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0"


    // $ANTLR start "rule__Generator__Group__0__Impl"
    // InternalMGLang.g:2355:1: rule__Generator__Group__0__Impl : ( 'generator' ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2359:1: ( ( 'generator' ) )
            // InternalMGLang.g:2360:1: ( 'generator' )
            {
            // InternalMGLang.g:2360:1: ( 'generator' )
            // InternalMGLang.g:2361:2: 'generator'
            {
             before(grammarAccess.getGeneratorAccess().getGeneratorKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getGeneratorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0__Impl"


    // $ANTLR start "rule__Generator__Group__1"
    // InternalMGLang.g:2370:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2374:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:2375:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Generator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1"


    // $ANTLR start "rule__Generator__Group__1__Impl"
    // InternalMGLang.g:2382:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__NameAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2386:1: ( ( ( rule__Generator__NameAssignment_1 ) ) )
            // InternalMGLang.g:2387:1: ( ( rule__Generator__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2387:1: ( ( rule__Generator__NameAssignment_1 ) )
            // InternalMGLang.g:2388:2: ( rule__Generator__NameAssignment_1 )
            {
             before(grammarAccess.getGeneratorAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2389:2: ( rule__Generator__NameAssignment_1 )
            // InternalMGLang.g:2389:3: rule__Generator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Generator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1__Impl"


    // $ANTLR start "rule__Generator__Group__2"
    // InternalMGLang.g:2397:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2401:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:2402:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Generator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__2"


    // $ANTLR start "rule__Generator__Group__2__Impl"
    // InternalMGLang.g:2409:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2413:1: ( ( '(' ) )
            // InternalMGLang.g:2414:1: ( '(' )
            {
            // InternalMGLang.g:2414:1: ( '(' )
            // InternalMGLang.g:2415:2: '('
            {
             before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__2__Impl"


    // $ANTLR start "rule__Generator__Group__3"
    // InternalMGLang.g:2424:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2428:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:2429:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Generator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__3"


    // $ANTLR start "rule__Generator__Group__3__Impl"
    // InternalMGLang.g:2436:1: rule__Generator__Group__3__Impl : ( ')' ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2440:1: ( ( ')' ) )
            // InternalMGLang.g:2441:1: ( ')' )
            {
            // InternalMGLang.g:2441:1: ( ')' )
            // InternalMGLang.g:2442:2: ')'
            {
             before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__3__Impl"


    // $ANTLR start "rule__Generator__Group__4"
    // InternalMGLang.g:2451:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2455:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:2456:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Generator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__4"


    // $ANTLR start "rule__Generator__Group__4__Impl"
    // InternalMGLang.g:2463:1: rule__Generator__Group__4__Impl : ( '{' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2467:1: ( ( '{' ) )
            // InternalMGLang.g:2468:1: ( '{' )
            {
            // InternalMGLang.g:2468:1: ( '{' )
            // InternalMGLang.g:2469:2: '{'
            {
             before(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__4__Impl"


    // $ANTLR start "rule__Generator__Group__5"
    // InternalMGLang.g:2478:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2482:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:2483:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Generator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__5"


    // $ANTLR start "rule__Generator__Group__5__Impl"
    // InternalMGLang.g:2490:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__CommandsAssignment_5 )* ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2494:1: ( ( ( rule__Generator__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:2495:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:2495:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            // InternalMGLang.g:2496:2: ( rule__Generator__CommandsAssignment_5 )*
            {
             before(grammarAccess.getGeneratorAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:2497:2: ( rule__Generator__CommandsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMGLang.g:2497:3: rule__Generator__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Generator__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getGeneratorAccess().getCommandsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__5__Impl"


    // $ANTLR start "rule__Generator__Group__6"
    // InternalMGLang.g:2505:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2509:1: ( rule__Generator__Group__6__Impl )
            // InternalMGLang.g:2510:2: rule__Generator__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__6"


    // $ANTLR start "rule__Generator__Group__6__Impl"
    // InternalMGLang.g:2516:1: rule__Generator__Group__6__Impl : ( '}' ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2520:1: ( ( '}' ) )
            // InternalMGLang.g:2521:1: ( '}' )
            {
            // InternalMGLang.g:2521:1: ( '}' )
            // InternalMGLang.g:2522:2: '}'
            {
             before(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__6__Impl"


    // $ANTLR start "rule__PatternCall__Group__0"
    // InternalMGLang.g:2532:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2536:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:2537:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PatternCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__0"


    // $ANTLR start "rule__PatternCall__Group__0__Impl"
    // InternalMGLang.g:2544:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledPatternAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2548:1: ( ( ( rule__PatternCall__CalledPatternAssignment_0 ) ) )
            // InternalMGLang.g:2549:1: ( ( rule__PatternCall__CalledPatternAssignment_0 ) )
            {
            // InternalMGLang.g:2549:1: ( ( rule__PatternCall__CalledPatternAssignment_0 ) )
            // InternalMGLang.g:2550:2: ( rule__PatternCall__CalledPatternAssignment_0 )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternAssignment_0()); 
            // InternalMGLang.g:2551:2: ( rule__PatternCall__CalledPatternAssignment_0 )
            // InternalMGLang.g:2551:3: rule__PatternCall__CalledPatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__CalledPatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternCallAccess().getCalledPatternAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__0__Impl"


    // $ANTLR start "rule__PatternCall__Group__1"
    // InternalMGLang.g:2559:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2563:1: ( rule__PatternCall__Group__1__Impl )
            // InternalMGLang.g:2564:2: rule__PatternCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__1"


    // $ANTLR start "rule__PatternCall__Group__1__Impl"
    // InternalMGLang.g:2570:1: rule__PatternCall__Group__1__Impl : ( ( rule__PatternCall__Group_1__0 )? ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2574:1: ( ( ( rule__PatternCall__Group_1__0 )? ) )
            // InternalMGLang.g:2575:1: ( ( rule__PatternCall__Group_1__0 )? )
            {
            // InternalMGLang.g:2575:1: ( ( rule__PatternCall__Group_1__0 )? )
            // InternalMGLang.g:2576:2: ( rule__PatternCall__Group_1__0 )?
            {
             before(grammarAccess.getPatternCallAccess().getGroup_1()); 
            // InternalMGLang.g:2577:2: ( rule__PatternCall__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMGLang.g:2577:3: rule__PatternCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__1__Impl"


    // $ANTLR start "rule__PatternCall__Group_1__0"
    // InternalMGLang.g:2586:1: rule__PatternCall__Group_1__0 : rule__PatternCall__Group_1__0__Impl rule__PatternCall__Group_1__1 ;
    public final void rule__PatternCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2590:1: ( rule__PatternCall__Group_1__0__Impl rule__PatternCall__Group_1__1 )
            // InternalMGLang.g:2591:2: rule__PatternCall__Group_1__0__Impl rule__PatternCall__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__PatternCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_1__0"


    // $ANTLR start "rule__PatternCall__Group_1__0__Impl"
    // InternalMGLang.g:2598:1: rule__PatternCall__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2602:1: ( ( '(' ) )
            // InternalMGLang.g:2603:1: ( '(' )
            {
            // InternalMGLang.g:2603:1: ( '(' )
            // InternalMGLang.g:2604:2: '('
            {
             before(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_1__0__Impl"


    // $ANTLR start "rule__PatternCall__Group_1__1"
    // InternalMGLang.g:2613:1: rule__PatternCall__Group_1__1 : rule__PatternCall__Group_1__1__Impl rule__PatternCall__Group_1__2 ;
    public final void rule__PatternCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2617:1: ( rule__PatternCall__Group_1__1__Impl rule__PatternCall__Group_1__2 )
            // InternalMGLang.g:2618:2: rule__PatternCall__Group_1__1__Impl rule__PatternCall__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__PatternCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_1__1"


    // $ANTLR start "rule__PatternCall__Group_1__1__Impl"
    // InternalMGLang.g:2625:1: rule__PatternCall__Group_1__1__Impl : ( ( rule__PatternCall__ParamsAssignment_1_1 )* ) ;
    public final void rule__PatternCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2629:1: ( ( ( rule__PatternCall__ParamsAssignment_1_1 )* ) )
            // InternalMGLang.g:2630:1: ( ( rule__PatternCall__ParamsAssignment_1_1 )* )
            {
            // InternalMGLang.g:2630:1: ( ( rule__PatternCall__ParamsAssignment_1_1 )* )
            // InternalMGLang.g:2631:2: ( rule__PatternCall__ParamsAssignment_1_1 )*
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_1_1()); 
            // InternalMGLang.g:2632:2: ( rule__PatternCall__ParamsAssignment_1_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:2632:3: rule__PatternCall__ParamsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PatternCall__ParamsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPatternCallAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_1__1__Impl"


    // $ANTLR start "rule__PatternCall__Group_1__2"
    // InternalMGLang.g:2640:1: rule__PatternCall__Group_1__2 : rule__PatternCall__Group_1__2__Impl ;
    public final void rule__PatternCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2644:1: ( rule__PatternCall__Group_1__2__Impl )
            // InternalMGLang.g:2645:2: rule__PatternCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_1__2"


    // $ANTLR start "rule__PatternCall__Group_1__2__Impl"
    // InternalMGLang.g:2651:1: rule__PatternCall__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2655:1: ( ( ')' ) )
            // InternalMGLang.g:2656:1: ( ')' )
            {
            // InternalMGLang.g:2656:1: ( ')' )
            // InternalMGLang.g:2657:2: ')'
            {
             before(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_1__2__Impl"


    // $ANTLR start "rule__PatternObjectCreation__Group__0"
    // InternalMGLang.g:2667:1: rule__PatternObjectCreation__Group__0 : rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 ;
    public final void rule__PatternObjectCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2671:1: ( rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 )
            // InternalMGLang.g:2672:2: rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__PatternObjectCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__0"


    // $ANTLR start "rule__PatternObjectCreation__Group__0__Impl"
    // InternalMGLang.g:2679:1: rule__PatternObjectCreation__Group__0__Impl : ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) ;
    public final void rule__PatternObjectCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2683:1: ( ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) )
            // InternalMGLang.g:2684:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            {
            // InternalMGLang.g:2684:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            // InternalMGLang.g:2685:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 
            // InternalMGLang.g:2686:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            // InternalMGLang.g:2686:3: rule__PatternObjectCreation__PObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__PObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__0__Impl"


    // $ANTLR start "rule__PatternObjectCreation__Group__1"
    // InternalMGLang.g:2694:1: rule__PatternObjectCreation__Group__1 : rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 ;
    public final void rule__PatternObjectCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2698:1: ( rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 )
            // InternalMGLang.g:2699:2: rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PatternObjectCreation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__1"


    // $ANTLR start "rule__PatternObjectCreation__Group__1__Impl"
    // InternalMGLang.g:2706:1: rule__PatternObjectCreation__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternObjectCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2710:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2711:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2711:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:2712:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__1__Impl"


    // $ANTLR start "rule__PatternObjectCreation__Group__2"
    // InternalMGLang.g:2721:1: rule__PatternObjectCreation__Group__2 : rule__PatternObjectCreation__Group__2__Impl ;
    public final void rule__PatternObjectCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2725:1: ( rule__PatternObjectCreation__Group__2__Impl )
            // InternalMGLang.g:2726:2: rule__PatternObjectCreation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__2"


    // $ANTLR start "rule__PatternObjectCreation__Group__2__Impl"
    // InternalMGLang.g:2732:1: rule__PatternObjectCreation__Group__2__Impl : ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) ;
    public final void rule__PatternObjectCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2736:1: ( ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) )
            // InternalMGLang.g:2737:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            {
            // InternalMGLang.g:2737:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            // InternalMGLang.g:2738:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 
            // InternalMGLang.g:2739:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            // InternalMGLang.g:2739:3: rule__PatternObjectCreation__PatternCallAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__PatternCallAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__2__Impl"


    // $ANTLR start "rule__PatternObject__Group__0"
    // InternalMGLang.g:2748:1: rule__PatternObject__Group__0 : rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 ;
    public final void rule__PatternObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2752:1: ( rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 )
            // InternalMGLang.g:2753:2: rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PatternObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__Group__0"


    // $ANTLR start "rule__PatternObject__Group__0__Impl"
    // InternalMGLang.g:2760:1: rule__PatternObject__Group__0__Impl : ( ( rule__PatternObject__TypeAssignment_0 ) ) ;
    public final void rule__PatternObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2764:1: ( ( ( rule__PatternObject__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2765:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2765:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            // InternalMGLang.g:2766:2: ( rule__PatternObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2767:2: ( rule__PatternObject__TypeAssignment_0 )
            // InternalMGLang.g:2767:3: rule__PatternObject__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__Group__0__Impl"


    // $ANTLR start "rule__PatternObject__Group__1"
    // InternalMGLang.g:2775:1: rule__PatternObject__Group__1 : rule__PatternObject__Group__1__Impl ;
    public final void rule__PatternObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2779:1: ( rule__PatternObject__Group__1__Impl )
            // InternalMGLang.g:2780:2: rule__PatternObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__Group__1"


    // $ANTLR start "rule__PatternObject__Group__1__Impl"
    // InternalMGLang.g:2786:1: rule__PatternObject__Group__1__Impl : ( ( rule__PatternObject__NameAssignment_1 ) ) ;
    public final void rule__PatternObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2790:1: ( ( ( rule__PatternObject__NameAssignment_1 ) ) )
            // InternalMGLang.g:2791:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2791:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            // InternalMGLang.g:2792:2: ( rule__PatternObject__NameAssignment_1 )
            {
             before(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2793:2: ( rule__PatternObject__NameAssignment_1 )
            // InternalMGLang.g:2793:3: rule__PatternObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalMGLang.g:2802:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2806:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalMGLang.g:2807:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalMGLang.g:2814:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2818:1: ( ( 'for' ) )
            // InternalMGLang.g:2819:1: ( 'for' )
            {
            // InternalMGLang.g:2819:1: ( 'for' )
            // InternalMGLang.g:2820:2: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalMGLang.g:2829:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2833:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalMGLang.g:2834:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalMGLang.g:2841:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2845:1: ( ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) )
            // InternalMGLang.g:2846:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            {
            // InternalMGLang.g:2846:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            // InternalMGLang.g:2847:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            {
             before(grammarAccess.getForLoopAccess().getIteratorVarAssignment_1()); 
            // InternalMGLang.g:2848:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            // InternalMGLang.g:2848:3: rule__ForLoop__IteratorVarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__IteratorVarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getIteratorVarAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalMGLang.g:2856:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2860:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalMGLang.g:2861:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalMGLang.g:2868:1: rule__ForLoop__Group__2__Impl : ( 'in' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2872:1: ( ( 'in' ) )
            // InternalMGLang.g:2873:1: ( 'in' )
            {
            // InternalMGLang.g:2873:1: ( 'in' )
            // InternalMGLang.g:2874:2: 'in'
            {
             before(grammarAccess.getForLoopAccess().getInKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalMGLang.g:2883:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2887:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalMGLang.g:2888:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalMGLang.g:2895:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2899:1: ( ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) )
            // InternalMGLang.g:2900:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            {
            // InternalMGLang.g:2900:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            // InternalMGLang.g:2901:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getIteratingConditionAssignment_3()); 
            // InternalMGLang.g:2902:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            // InternalMGLang.g:2902:3: rule__ForLoop__IteratingConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__IteratingConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getIteratingConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalMGLang.g:2910:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2914:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalMGLang.g:2915:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalMGLang.g:2922:1: rule__ForLoop__Group__4__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2926:1: ( ( '{' ) )
            // InternalMGLang.g:2927:1: ( '{' )
            {
            // InternalMGLang.g:2927:1: ( '{' )
            // InternalMGLang.g:2928:2: '{'
            {
             before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalMGLang.g:2937:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2941:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalMGLang.g:2942:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalMGLang.g:2949:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CommandsAssignment_5 )* ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2953:1: ( ( ( rule__ForLoop__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:2954:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:2954:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            // InternalMGLang.g:2955:2: ( rule__ForLoop__CommandsAssignment_5 )*
            {
             before(grammarAccess.getForLoopAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:2956:2: ( rule__ForLoop__CommandsAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGLang.g:2956:3: rule__ForLoop__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ForLoop__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getForLoopAccess().getCommandsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalMGLang.g:2964:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2968:1: ( rule__ForLoop__Group__6__Impl )
            // InternalMGLang.g:2969:2: rule__ForLoop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalMGLang.g:2975:1: rule__ForLoop__Group__6__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2979:1: ( ( '}' ) )
            // InternalMGLang.g:2980:1: ( '}' )
            {
            // InternalMGLang.g:2980:1: ( '}' )
            // InternalMGLang.g:2981:2: '}'
            {
             before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForRange__Group__0"
    // InternalMGLang.g:2991:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2995:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:2996:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ForRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__0"


    // $ANTLR start "rule__ForRange__Group__0__Impl"
    // InternalMGLang.g:3003:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3007:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:3008:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:3008:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:3009:2: ( rule__ForRange__StartAssignment_0 )
            {
             before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            // InternalMGLang.g:3010:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:3010:3: rule__ForRange__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getForRangeAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__0__Impl"


    // $ANTLR start "rule__ForRange__Group__1"
    // InternalMGLang.g:3018:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3022:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:3023:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__ForRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__1"


    // $ANTLR start "rule__ForRange__Group__1__Impl"
    // InternalMGLang.g:3030:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3034:1: ( ( ':' ) )
            // InternalMGLang.g:3035:1: ( ':' )
            {
            // InternalMGLang.g:3035:1: ( ':' )
            // InternalMGLang.g:3036:2: ':'
            {
             before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getForRangeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__1__Impl"


    // $ANTLR start "rule__ForRange__Group__2"
    // InternalMGLang.g:3045:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3049:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:3050:2: rule__ForRange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__2"


    // $ANTLR start "rule__ForRange__Group__2__Impl"
    // InternalMGLang.g:3056:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3060:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:3061:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:3061:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:3062:2: ( rule__ForRange__EndAssignment_2 )
            {
             before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            // InternalMGLang.g:3063:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:3063:3: rule__ForRange__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForRangeAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__2__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_0__0"
    // InternalMGLang.g:3072:1: rule__LiteralExpression__Group_0__0 : rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 ;
    public final void rule__LiteralExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3076:1: ( rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 )
            // InternalMGLang.g:3077:2: rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1
            {
            pushFollow(FOLLOW_36);
            rule__LiteralExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_0__0"


    // $ANTLR start "rule__LiteralExpression__Group_0__0__Impl"
    // InternalMGLang.g:3084:1: rule__LiteralExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3088:1: ( ( () ) )
            // InternalMGLang.g:3089:1: ( () )
            {
            // InternalMGLang.g:3089:1: ( () )
            // InternalMGLang.g:3090:2: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalMGLang.g:3091:2: ()
            // InternalMGLang.g:3091:3: 
            {
            }

             after(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_0__1"
    // InternalMGLang.g:3099:1: rule__LiteralExpression__Group_0__1 : rule__LiteralExpression__Group_0__1__Impl ;
    public final void rule__LiteralExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3103:1: ( rule__LiteralExpression__Group_0__1__Impl )
            // InternalMGLang.g:3104:2: rule__LiteralExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_0__1"


    // $ANTLR start "rule__LiteralExpression__Group_0__1__Impl"
    // InternalMGLang.g:3110:1: rule__LiteralExpression__Group_0__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__LiteralExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3114:1: ( ( ( rule__LiteralExpression__ValueAssignment_0_1 ) ) )
            // InternalMGLang.g:3115:1: ( ( rule__LiteralExpression__ValueAssignment_0_1 ) )
            {
            // InternalMGLang.g:3115:1: ( ( rule__LiteralExpression__ValueAssignment_0_1 ) )
            // InternalMGLang.g:3116:2: ( rule__LiteralExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_0_1()); 
            // InternalMGLang.g:3117:2: ( rule__LiteralExpression__ValueAssignment_0_1 )
            // InternalMGLang.g:3117:3: rule__LiteralExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_1__0"
    // InternalMGLang.g:3126:1: rule__LiteralExpression__Group_1__0 : rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 ;
    public final void rule__LiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3130:1: ( rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 )
            // InternalMGLang.g:3131:2: rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__LiteralExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_1__0"


    // $ANTLR start "rule__LiteralExpression__Group_1__0__Impl"
    // InternalMGLang.g:3138:1: rule__LiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3142:1: ( ( () ) )
            // InternalMGLang.g:3143:1: ( () )
            {
            // InternalMGLang.g:3143:1: ( () )
            // InternalMGLang.g:3144:2: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalMGLang.g:3145:2: ()
            // InternalMGLang.g:3145:3: 
            {
            }

             after(grammarAccess.getLiteralExpressionAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_1__1"
    // InternalMGLang.g:3153:1: rule__LiteralExpression__Group_1__1 : rule__LiteralExpression__Group_1__1__Impl ;
    public final void rule__LiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3157:1: ( rule__LiteralExpression__Group_1__1__Impl )
            // InternalMGLang.g:3158:2: rule__LiteralExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_1__1"


    // $ANTLR start "rule__LiteralExpression__Group_1__1__Impl"
    // InternalMGLang.g:3164:1: rule__LiteralExpression__Group_1__1__Impl : ( ruleNumberLiteral ) ;
    public final void rule__LiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3168:1: ( ( ruleNumberLiteral ) )
            // InternalMGLang.g:3169:1: ( ruleNumberLiteral )
            {
            // InternalMGLang.g:3169:1: ( ruleNumberLiteral )
            // InternalMGLang.g:3170:2: ruleNumberLiteral
            {
             before(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_2__0"
    // InternalMGLang.g:3180:1: rule__LiteralExpression__Group_2__0 : rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1 ;
    public final void rule__LiteralExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3184:1: ( rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1 )
            // InternalMGLang.g:3185:2: rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__LiteralExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_2__0"


    // $ANTLR start "rule__LiteralExpression__Group_2__0__Impl"
    // InternalMGLang.g:3192:1: rule__LiteralExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3196:1: ( ( () ) )
            // InternalMGLang.g:3197:1: ( () )
            {
            // InternalMGLang.g:3197:1: ( () )
            // InternalMGLang.g:3198:2: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getStringLiteralAction_2_0()); 
            // InternalMGLang.g:3199:2: ()
            // InternalMGLang.g:3199:3: 
            {
            }

             after(grammarAccess.getLiteralExpressionAccess().getStringLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_2__1"
    // InternalMGLang.g:3207:1: rule__LiteralExpression__Group_2__1 : rule__LiteralExpression__Group_2__1__Impl ;
    public final void rule__LiteralExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3211:1: ( rule__LiteralExpression__Group_2__1__Impl )
            // InternalMGLang.g:3212:2: rule__LiteralExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_2__1"


    // $ANTLR start "rule__LiteralExpression__Group_2__1__Impl"
    // InternalMGLang.g:3218:1: rule__LiteralExpression__Group_2__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__LiteralExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3222:1: ( ( ( rule__LiteralExpression__ValueAssignment_2_1 ) ) )
            // InternalMGLang.g:3223:1: ( ( rule__LiteralExpression__ValueAssignment_2_1 ) )
            {
            // InternalMGLang.g:3223:1: ( ( rule__LiteralExpression__ValueAssignment_2_1 ) )
            // InternalMGLang.g:3224:2: ( rule__LiteralExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_2_1()); 
            // InternalMGLang.g:3225:2: ( rule__LiteralExpression__ValueAssignment_2_1 )
            // InternalMGLang.g:3225:3: rule__LiteralExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_2__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // InternalMGLang.g:3234:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3238:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalMGLang.g:3239:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // InternalMGLang.g:3246:1: rule__NumberLiteral__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3250:1: ( ( ( '-' )? ) )
            // InternalMGLang.g:3251:1: ( ( '-' )? )
            {
            // InternalMGLang.g:3251:1: ( ( '-' )? )
            // InternalMGLang.g:3252:2: ( '-' )?
            {
             before(grammarAccess.getNumberLiteralAccess().getHyphenMinusKeyword_0()); 
            // InternalMGLang.g:3253:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:3253:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumberLiteralAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // InternalMGLang.g:3261:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl rule__NumberLiteral__Group__2 ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3265:1: ( rule__NumberLiteral__Group__1__Impl rule__NumberLiteral__Group__2 )
            // InternalMGLang.g:3266:2: rule__NumberLiteral__Group__1__Impl rule__NumberLiteral__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // InternalMGLang.g:3273:1: rule__NumberLiteral__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3277:1: ( ( RULE_INT ) )
            // InternalMGLang.g:3278:1: ( RULE_INT )
            {
            // InternalMGLang.g:3278:1: ( RULE_INT )
            // InternalMGLang.g:3279:2: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__2"
    // InternalMGLang.g:3288:1: rule__NumberLiteral__Group__2 : rule__NumberLiteral__Group__2__Impl ;
    public final void rule__NumberLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3292:1: ( rule__NumberLiteral__Group__2__Impl )
            // InternalMGLang.g:3293:2: rule__NumberLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__2"


    // $ANTLR start "rule__NumberLiteral__Group__2__Impl"
    // InternalMGLang.g:3299:1: rule__NumberLiteral__Group__2__Impl : ( ( rule__NumberLiteral__Group_2__0 )? ) ;
    public final void rule__NumberLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3303:1: ( ( ( rule__NumberLiteral__Group_2__0 )? ) )
            // InternalMGLang.g:3304:1: ( ( rule__NumberLiteral__Group_2__0 )? )
            {
            // InternalMGLang.g:3304:1: ( ( rule__NumberLiteral__Group_2__0 )? )
            // InternalMGLang.g:3305:2: ( rule__NumberLiteral__Group_2__0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup_2()); 
            // InternalMGLang.g:3306:2: ( rule__NumberLiteral__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMGLang.g:3306:3: rule__NumberLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__2__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_2__0"
    // InternalMGLang.g:3315:1: rule__NumberLiteral__Group_2__0 : rule__NumberLiteral__Group_2__0__Impl rule__NumberLiteral__Group_2__1 ;
    public final void rule__NumberLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3319:1: ( rule__NumberLiteral__Group_2__0__Impl rule__NumberLiteral__Group_2__1 )
            // InternalMGLang.g:3320:2: rule__NumberLiteral__Group_2__0__Impl rule__NumberLiteral__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__NumberLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_2__0"


    // $ANTLR start "rule__NumberLiteral__Group_2__0__Impl"
    // InternalMGLang.g:3327:1: rule__NumberLiteral__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NumberLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3331:1: ( ( '.' ) )
            // InternalMGLang.g:3332:1: ( '.' )
            {
            // InternalMGLang.g:3332:1: ( '.' )
            // InternalMGLang.g:3333:2: '.'
            {
             before(grammarAccess.getNumberLiteralAccess().getFullStopKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_2__1"
    // InternalMGLang.g:3342:1: rule__NumberLiteral__Group_2__1 : rule__NumberLiteral__Group_2__1__Impl ;
    public final void rule__NumberLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3346:1: ( rule__NumberLiteral__Group_2__1__Impl )
            // InternalMGLang.g:3347:2: rule__NumberLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_2__1"


    // $ANTLR start "rule__NumberLiteral__Group_2__1__Impl"
    // InternalMGLang.g:3353:1: rule__NumberLiteral__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NumberLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3357:1: ( ( RULE_INT ) )
            // InternalMGLang.g:3358:1: ( RULE_INT )
            {
            // InternalMGLang.g:3358:1: ( RULE_INT )
            // InternalMGLang.g:3359:2: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__MofgenFile__ImportsAssignment_0"
    // InternalMGLang.g:3369:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3373:1: ( ( ruleImport ) )
            // InternalMGLang.g:3374:2: ( ruleImport )
            {
            // InternalMGLang.g:3374:2: ( ruleImport )
            // InternalMGLang.g:3375:3: ruleImport
            {
             before(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__ImportsAssignment_0"


    // $ANTLR start "rule__MofgenFile__PatternsAssignment_1_0"
    // InternalMGLang.g:3384:1: rule__MofgenFile__PatternsAssignment_1_0 : ( rulePattern ) ;
    public final void rule__MofgenFile__PatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3388:1: ( ( rulePattern ) )
            // InternalMGLang.g:3389:2: ( rulePattern )
            {
            // InternalMGLang.g:3389:2: ( rulePattern )
            // InternalMGLang.g:3390:3: rulePattern
            {
             before(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__PatternsAssignment_1_0"


    // $ANTLR start "rule__MofgenFile__GeneratorsAssignment_1_1"
    // InternalMGLang.g:3399:1: rule__MofgenFile__GeneratorsAssignment_1_1 : ( ruleGenerator ) ;
    public final void rule__MofgenFile__GeneratorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3403:1: ( ( ruleGenerator ) )
            // InternalMGLang.g:3404:2: ( ruleGenerator )
            {
            // InternalMGLang.g:3404:2: ( ruleGenerator )
            // InternalMGLang.g:3405:3: ruleGenerator
            {
             before(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerator();

            state._fsp--;

             after(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__GeneratorsAssignment_1_1"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // InternalMGLang.g:3414:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3418:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:3419:2: ( RULE_STRING )
            {
            // InternalMGLang.g:3419:2: ( RULE_STRING )
            // InternalMGLang.g:3420:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_1"


    // $ANTLR start "rule__Import__AliasAssignment_3"
    // InternalMGLang.g:3429:1: rule__Import__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3433:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3434:2: ( RULE_ID )
            {
            // InternalMGLang.g:3434:2: ( RULE_ID )
            // InternalMGLang.g:3435:3: RULE_ID
            {
             before(grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__AliasAssignment_3"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalMGLang.g:3444:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3448:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3449:2: ( RULE_ID )
            {
            // InternalMGLang.g:3449:2: ( RULE_ID )
            // InternalMGLang.g:3450:3: RULE_ID
            {
             before(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_1"


    // $ANTLR start "rule__Pattern__ParametersAssignment_2_1_0"
    // InternalMGLang.g:3459:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3463:1: ( ( ruleParameter ) )
            // InternalMGLang.g:3464:2: ( ruleParameter )
            {
            // InternalMGLang.g:3464:2: ( ruleParameter )
            // InternalMGLang.g:3465:3: ruleParameter
            {
             before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ParametersAssignment_2_1_0"


    // $ANTLR start "rule__Pattern__ParametersAssignment_2_1_1_1"
    // InternalMGLang.g:3474:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3478:1: ( ( ruleParameter ) )
            // InternalMGLang.g:3479:2: ( ruleParameter )
            {
            // InternalMGLang.g:3479:2: ( ruleParameter )
            // InternalMGLang.g:3480:3: ruleParameter
            {
             before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ParametersAssignment_2_1_1_1"


    // $ANTLR start "rule__Pattern__NodesAssignment_4_0"
    // InternalMGLang.g:3489:1: rule__Pattern__NodesAssignment_4_0 : ( rulePatternNodeCreation ) ;
    public final void rule__Pattern__NodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3493:1: ( ( rulePatternNodeCreation ) )
            // InternalMGLang.g:3494:2: ( rulePatternNodeCreation )
            {
            // InternalMGLang.g:3494:2: ( rulePatternNodeCreation )
            // InternalMGLang.g:3495:3: rulePatternNodeCreation
            {
             before(grammarAccess.getPatternAccess().getNodesPatternNodeCreationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternNodeCreation();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNodesPatternNodeCreationParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NodesAssignment_4_0"


    // $ANTLR start "rule__Pattern__RefsAssignsAssignment_4_1"
    // InternalMGLang.g:3504:1: rule__Pattern__RefsAssignsAssignment_4_1 : ( ruleNodeReferenceOrAssignment ) ;
    public final void rule__Pattern__RefsAssignsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3508:1: ( ( ruleNodeReferenceOrAssignment ) )
            // InternalMGLang.g:3509:2: ( ruleNodeReferenceOrAssignment )
            {
            // InternalMGLang.g:3509:2: ( ruleNodeReferenceOrAssignment )
            // InternalMGLang.g:3510:3: ruleNodeReferenceOrAssignment
            {
             before(grammarAccess.getPatternAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeReferenceOrAssignment();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__RefsAssignsAssignment_4_1"


    // $ANTLR start "rule__Pattern__ReturnAssignment_6"
    // InternalMGLang.g:3519:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3523:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:3524:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:3524:2: ( rulePatternReturn )
            // InternalMGLang.g:3525:3: rulePatternReturn
            {
             before(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePatternReturn();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ReturnAssignment_6"


    // $ANTLR start "rule__PatternReturn__ThisUsedAssignment_1"
    // InternalMGLang.g:3534:1: rule__PatternReturn__ThisUsedAssignment_1 : ( ( 'this' ) ) ;
    public final void rule__PatternReturn__ThisUsedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3538:1: ( ( ( 'this' ) ) )
            // InternalMGLang.g:3539:2: ( ( 'this' ) )
            {
            // InternalMGLang.g:3539:2: ( ( 'this' ) )
            // InternalMGLang.g:3540:3: ( 'this' )
            {
             before(grammarAccess.getPatternReturnAccess().getThisUsedThisKeyword_1_0()); 
            // InternalMGLang.g:3541:3: ( 'this' )
            // InternalMGLang.g:3542:4: 'this'
            {
             before(grammarAccess.getPatternReturnAccess().getThisUsedThisKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getThisUsedThisKeyword_1_0()); 

            }

             after(grammarAccess.getPatternReturnAccess().getThisUsedThisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__ThisUsedAssignment_1"


    // $ANTLR start "rule__PatternNodeCreation__NodeAssignment_0"
    // InternalMGLang.g:3553:1: rule__PatternNodeCreation__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__PatternNodeCreation__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3557:1: ( ( ruleNode ) )
            // InternalMGLang.g:3558:2: ( ruleNode )
            {
            // InternalMGLang.g:3558:2: ( ruleNode )
            // InternalMGLang.g:3559:3: ruleNode
            {
             before(grammarAccess.getPatternNodeCreationAccess().getNodeNodeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getPatternNodeCreationAccess().getNodeNodeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeCreation__NodeAssignment_0"


    // $ANTLR start "rule__PatternNodeCreation__ConstructorAssignment_1"
    // InternalMGLang.g:3568:1: rule__PatternNodeCreation__ConstructorAssignment_1 : ( ruleNodeConstructor ) ;
    public final void rule__PatternNodeCreation__ConstructorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3572:1: ( ( ruleNodeConstructor ) )
            // InternalMGLang.g:3573:2: ( ruleNodeConstructor )
            {
            // InternalMGLang.g:3573:2: ( ruleNodeConstructor )
            // InternalMGLang.g:3574:3: ruleNodeConstructor
            {
             before(grammarAccess.getPatternNodeCreationAccess().getConstructorNodeConstructorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeConstructor();

            state._fsp--;

             after(grammarAccess.getPatternNodeCreationAccess().getConstructorNodeConstructorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeCreation__ConstructorAssignment_1"


    // $ANTLR start "rule__NodeConstructor__ParamsAssignment_2"
    // InternalMGLang.g:3583:1: rule__NodeConstructor__ParamsAssignment_2 : ( ruleLiteralExpression ) ;
    public final void rule__NodeConstructor__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3587:1: ( ( ruleLiteralExpression ) )
            // InternalMGLang.g:3588:2: ( ruleLiteralExpression )
            {
            // InternalMGLang.g:3588:2: ( ruleLiteralExpression )
            // InternalMGLang.g:3589:3: ruleLiteralExpression
            {
             before(grammarAccess.getNodeConstructorAccess().getParamsLiteralExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNodeConstructorAccess().getParamsLiteralExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeConstructor__ParamsAssignment_2"


    // $ANTLR start "rule__Node__TypeAssignment_0"
    // InternalMGLang.g:3598:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3602:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3603:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3603:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3604:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            // InternalMGLang.g:3605:3: ( RULE_ID )
            // InternalMGLang.g:3606:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__TypeAssignment_0"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalMGLang.g:3617:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3621:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3622:2: ( RULE_ID )
            {
            // InternalMGLang.g:3622:2: ( RULE_ID )
            // InternalMGLang.g:3623:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__NodeReferenceOrAssignment__ConditionAssignment_1_1"
    // InternalMGLang.g:3632:1: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__NodeReferenceOrAssignment__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3636:1: ( ( ruleCondition ) )
            // InternalMGLang.g:3637:2: ( ruleCondition )
            {
            // InternalMGLang.g:3637:2: ( ruleCondition )
            // InternalMGLang.g:3638:3: ruleCondition
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionConditionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__ConditionAssignment_1_1"


    // $ANTLR start "rule__Condition__LhsAssignment_0"
    // InternalMGLang.g:3647:1: rule__Condition__LhsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3651:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3652:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3652:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3653:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getLhsParameterCrossReference_0_0()); 
            // InternalMGLang.g:3654:3: ( RULE_ID )
            // InternalMGLang.g:3655:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getLhsParameterIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLhsParameterIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getLhsParameterCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__LhsAssignment_0"


    // $ANTLR start "rule__Condition__RelationAssignment_1_0"
    // InternalMGLang.g:3666:1: rule__Condition__RelationAssignment_1_0 : ( ruleEditorRelation ) ;
    public final void rule__Condition__RelationAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3670:1: ( ( ruleEditorRelation ) )
            // InternalMGLang.g:3671:2: ( ruleEditorRelation )
            {
            // InternalMGLang.g:3671:2: ( ruleEditorRelation )
            // InternalMGLang.g:3672:3: ruleEditorRelation
            {
             before(grammarAccess.getConditionAccess().getRelationEditorRelationEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEditorRelation();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getRelationEditorRelationEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__RelationAssignment_1_0"


    // $ANTLR start "rule__Condition__RhsAssignment_1_1"
    // InternalMGLang.g:3681:1: rule__Condition__RhsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3685:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3686:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3686:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3687:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getRhsParameterCrossReference_1_1_0()); 
            // InternalMGLang.g:3688:3: ( RULE_ID )
            // InternalMGLang.g:3689:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getRhsParameterIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRhsParameterIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getRhsParameterCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__RhsAssignment_1_1"


    // $ANTLR start "rule__PatternNodeReference__SourceAssignment_0"
    // InternalMGLang.g:3700:1: rule__PatternNodeReference__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3704:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3705:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3705:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3706:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getSourceNodeCrossReference_0_0()); 
            // InternalMGLang.g:3707:3: ( RULE_ID )
            // InternalMGLang.g:3708:4: RULE_ID
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getSourceNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getSourceNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternNodeReferenceAccess().getSourceNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__SourceAssignment_0"


    // $ANTLR start "rule__PatternNodeReference__TypeAssignment_2"
    // InternalMGLang.g:3719:1: rule__PatternNodeReference__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3723:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3724:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3724:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3725:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_2_0()); 
            // InternalMGLang.g:3726:3: ( RULE_ID )
            // InternalMGLang.g:3727:4: RULE_ID
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__TypeAssignment_2"


    // $ANTLR start "rule__PatternNodeReference__TargetAssignment_4"
    // InternalMGLang.g:3738:1: rule__PatternNodeReference__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3742:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3743:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3743:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3744:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_4_0()); 
            // InternalMGLang.g:3745:3: ( RULE_ID )
            // InternalMGLang.g:3746:4: RULE_ID
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__TargetAssignment_4"


    // $ANTLR start "rule__Assignment__TargetAssignment_0"
    // InternalMGLang.g:3757:1: rule__Assignment__TargetAssignment_0 : ( ruleNodeAttributeCall ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3761:1: ( ( ruleNodeAttributeCall ) )
            // InternalMGLang.g:3762:2: ( ruleNodeAttributeCall )
            {
            // InternalMGLang.g:3762:2: ( ruleNodeAttributeCall )
            // InternalMGLang.g:3763:3: ruleNodeAttributeCall
            {
             before(grammarAccess.getAssignmentAccess().getTargetNodeAttributeCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeAttributeCall();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getTargetNodeAttributeCallParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__TargetAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMGLang.g:3772:1: rule__Assignment__ValueAssignment_2 : ( ruleLiteralExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3776:1: ( ( ruleLiteralExpression ) )
            // InternalMGLang.g:3777:2: ( ruleLiteralExpression )
            {
            // InternalMGLang.g:3777:2: ( ruleLiteralExpression )
            // InternalMGLang.g:3778:3: ruleLiteralExpression
            {
             before(grammarAccess.getAssignmentAccess().getValueLiteralExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueLiteralExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__NodeAttributeCall__ObjectAssignment_0"
    // InternalMGLang.g:3787:1: rule__NodeAttributeCall__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3791:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3792:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3792:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3793:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getObjectNodeCrossReference_0_0()); 
            // InternalMGLang.g:3794:3: ( RULE_ID )
            // InternalMGLang.g:3795:4: RULE_ID
            {
             before(grammarAccess.getNodeAttributeCallAccess().getObjectNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAttributeCallAccess().getObjectNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeAttributeCallAccess().getObjectNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__ObjectAssignment_0"


    // $ANTLR start "rule__NodeAttributeCall__AttributeAssignment_2"
    // InternalMGLang.g:3806:1: rule__NodeAttributeCall__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3810:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3811:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3811:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3812:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeCrossReference_2_0()); 
            // InternalMGLang.g:3813:3: ( RULE_ID )
            // InternalMGLang.g:3814:4: RULE_ID
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttributeCall__AttributeAssignment_2"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalMGLang.g:3825:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3829:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3830:2: ( RULE_ID )
            {
            // InternalMGLang.g:3830:2: ( RULE_ID )
            // InternalMGLang.g:3831:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalMGLang.g:3840:1: rule__Parameter__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3844:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3845:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3845:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3846:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeEClassifierCrossReference_2_0()); 
            // InternalMGLang.g:3847:3: ( RULE_ID )
            // InternalMGLang.g:3848:4: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeEClassifierIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeEClassifierIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeEClassifierCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Generator__NameAssignment_1"
    // InternalMGLang.g:3859:1: rule__Generator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3863:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3864:2: ( RULE_ID )
            {
            // InternalMGLang.g:3864:2: ( RULE_ID )
            // InternalMGLang.g:3865:3: RULE_ID
            {
             before(grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__NameAssignment_1"


    // $ANTLR start "rule__Generator__CommandsAssignment_5"
    // InternalMGLang.g:3874:1: rule__Generator__CommandsAssignment_5 : ( ruleGeneratorElement ) ;
    public final void rule__Generator__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3878:1: ( ( ruleGeneratorElement ) )
            // InternalMGLang.g:3879:2: ( ruleGeneratorElement )
            {
            // InternalMGLang.g:3879:2: ( ruleGeneratorElement )
            // InternalMGLang.g:3880:3: ruleGeneratorElement
            {
             before(grammarAccess.getGeneratorAccess().getCommandsGeneratorElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneratorElement();

            state._fsp--;

             after(grammarAccess.getGeneratorAccess().getCommandsGeneratorElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__CommandsAssignment_5"


    // $ANTLR start "rule__PatternCall__CalledPatternAssignment_0"
    // InternalMGLang.g:3889:1: rule__PatternCall__CalledPatternAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledPatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3893:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3894:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3894:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3895:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternPatternCrossReference_0_0()); 
            // InternalMGLang.g:3896:3: ( RULE_ID )
            // InternalMGLang.g:3897:4: RULE_ID
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternPatternIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getCalledPatternPatternIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternCallAccess().getCalledPatternPatternCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__CalledPatternAssignment_0"


    // $ANTLR start "rule__PatternCall__ParamsAssignment_1_1"
    // InternalMGLang.g:3908:1: rule__PatternCall__ParamsAssignment_1_1 : ( rulePatternObject ) ;
    public final void rule__PatternCall__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3912:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:3913:2: ( rulePatternObject )
            {
            // InternalMGLang.g:3913:2: ( rulePatternObject )
            // InternalMGLang.g:3914:3: rulePatternObject
            {
             before(grammarAccess.getPatternCallAccess().getParamsPatternObjectParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternObject();

            state._fsp--;

             after(grammarAccess.getPatternCallAccess().getParamsPatternObjectParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__ParamsAssignment_1_1"


    // $ANTLR start "rule__PatternObjectCreation__PObjectAssignment_0"
    // InternalMGLang.g:3923:1: rule__PatternObjectCreation__PObjectAssignment_0 : ( rulePatternObject ) ;
    public final void rule__PatternObjectCreation__PObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3927:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:3928:2: ( rulePatternObject )
            {
            // InternalMGLang.g:3928:2: ( rulePatternObject )
            // InternalMGLang.g:3929:3: rulePatternObject
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternObject();

            state._fsp--;

             after(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__PObjectAssignment_0"


    // $ANTLR start "rule__PatternObjectCreation__PatternCallAssignment_2"
    // InternalMGLang.g:3938:1: rule__PatternObjectCreation__PatternCallAssignment_2 : ( rulePatternCall ) ;
    public final void rule__PatternObjectCreation__PatternCallAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3942:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:3943:2: ( rulePatternCall )
            {
            // InternalMGLang.g:3943:2: ( rulePatternCall )
            // InternalMGLang.g:3944:3: rulePatternCall
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPatternCallPatternCallParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePatternCall();

            state._fsp--;

             after(grammarAccess.getPatternObjectCreationAccess().getPatternCallPatternCallParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__PatternCallAssignment_2"


    // $ANTLR start "rule__PatternObject__TypeAssignment_0"
    // InternalMGLang.g:3953:1: rule__PatternObject__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3957:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3958:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3958:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3959:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 
            // InternalMGLang.g:3960:3: ( RULE_ID )
            // InternalMGLang.g:3961:4: RULE_ID
            {
             before(grammarAccess.getPatternObjectAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternObjectAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__TypeAssignment_0"


    // $ANTLR start "rule__PatternObject__NameAssignment_1"
    // InternalMGLang.g:3972:1: rule__PatternObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3976:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3977:2: ( RULE_ID )
            {
            // InternalMGLang.g:3977:2: ( RULE_ID )
            // InternalMGLang.g:3978:3: RULE_ID
            {
             before(grammarAccess.getPatternObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternObjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__NameAssignment_1"


    // $ANTLR start "rule__ForLoop__IteratorVarAssignment_1"
    // InternalMGLang.g:3987:1: rule__ForLoop__IteratorVarAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForLoop__IteratorVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3991:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3992:2: ( RULE_ID )
            {
            // InternalMGLang.g:3992:2: ( RULE_ID )
            // InternalMGLang.g:3993:3: RULE_ID
            {
             before(grammarAccess.getForLoopAccess().getIteratorVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getIteratorVarIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__IteratorVarAssignment_1"


    // $ANTLR start "rule__ForLoop__IteratingConditionAssignment_3"
    // InternalMGLang.g:4002:1: rule__ForLoop__IteratingConditionAssignment_3 : ( ruleForCondition ) ;
    public final void rule__ForLoop__IteratingConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4006:1: ( ( ruleForCondition ) )
            // InternalMGLang.g:4007:2: ( ruleForCondition )
            {
            // InternalMGLang.g:4007:2: ( ruleForCondition )
            // InternalMGLang.g:4008:3: ruleForCondition
            {
             before(grammarAccess.getForLoopAccess().getIteratingConditionForConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleForCondition();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getIteratingConditionForConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__IteratingConditionAssignment_3"


    // $ANTLR start "rule__ForLoop__CommandsAssignment_5"
    // InternalMGLang.g:4017:1: rule__ForLoop__CommandsAssignment_5 : ( ruleGeneratorCommand ) ;
    public final void rule__ForLoop__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4021:1: ( ( ruleGeneratorCommand ) )
            // InternalMGLang.g:4022:2: ( ruleGeneratorCommand )
            {
            // InternalMGLang.g:4022:2: ( ruleGeneratorCommand )
            // InternalMGLang.g:4023:3: ruleGeneratorCommand
            {
             before(grammarAccess.getForLoopAccess().getCommandsGeneratorCommandParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneratorCommand();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getCommandsGeneratorCommandParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__CommandsAssignment_5"


    // $ANTLR start "rule__ForEachCollection__CollAssignment"
    // InternalMGLang.g:4032:1: rule__ForEachCollection__CollAssignment : ( ruleNodeAttributeCall ) ;
    public final void rule__ForEachCollection__CollAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4036:1: ( ( ruleNodeAttributeCall ) )
            // InternalMGLang.g:4037:2: ( ruleNodeAttributeCall )
            {
            // InternalMGLang.g:4037:2: ( ruleNodeAttributeCall )
            // InternalMGLang.g:4038:3: ruleNodeAttributeCall
            {
             before(grammarAccess.getForEachCollectionAccess().getCollNodeAttributeCallParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeAttributeCall();

            state._fsp--;

             after(grammarAccess.getForEachCollectionAccess().getCollNodeAttributeCallParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachCollection__CollAssignment"


    // $ANTLR start "rule__ForRange__StartAssignment_0"
    // InternalMGLang.g:4047:1: rule__ForRange__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4051:1: ( ( RULE_INT ) )
            // InternalMGLang.g:4052:2: ( RULE_INT )
            {
            // InternalMGLang.g:4052:2: ( RULE_INT )
            // InternalMGLang.g:4053:3: RULE_INT
            {
             before(grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__StartAssignment_0"


    // $ANTLR start "rule__ForRange__EndAssignment_2"
    // InternalMGLang.g:4062:1: rule__ForRange__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4066:1: ( ( RULE_INT ) )
            // InternalMGLang.g:4067:2: ( RULE_INT )
            {
            // InternalMGLang.g:4067:2: ( RULE_INT )
            // InternalMGLang.g:4068:3: RULE_INT
            {
             before(grammarAccess.getForRangeAccess().getEndINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getForRangeAccess().getEndINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__EndAssignment_2"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_0_1"
    // InternalMGLang.g:4077:1: rule__LiteralExpression__ValueAssignment_0_1 : ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__LiteralExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4081:1: ( ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) ) )
            // InternalMGLang.g:4082:2: ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) )
            {
            // InternalMGLang.g:4082:2: ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) )
            // InternalMGLang.g:4083:3: ( rule__LiteralExpression__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAlternatives_0_1_0()); 
            // InternalMGLang.g:4084:3: ( rule__LiteralExpression__ValueAlternatives_0_1_0 )
            // InternalMGLang.g:4084:4: rule__LiteralExpression__ValueAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__ValueAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_2_1"
    // InternalMGLang.g:4092:1: rule__LiteralExpression__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__LiteralExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4096:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:4097:2: ( RULE_STRING )
            {
            // InternalMGLang.g:4097:2: ( RULE_STRING )
            // InternalMGLang.g:4098:3: RULE_STRING
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiteralExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000800002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001080060C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001000060C2L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001000060C0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002002000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000102L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000040L});

}