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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ASSIGNMENT_OP", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'int'", "'char'", "'double'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'import'", "'as'", "'pattern'", "'{'", "'}'", "'('", "')'", "','", "'return'", "'this'", "'.'", "'['", "']'", "'->'", "'+'", "'gen'", "'for'", "'in'", "':'", "'-'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_ASSIGNMENT_OP=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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


    // $ANTLR start "entryRuleNode"
    // InternalMGLang.g:153:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalMGLang.g:154:1: ( ruleNode EOF )
            // InternalMGLang.g:155:1: ruleNode EOF
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
    // InternalMGLang.g:162:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:166:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalMGLang.g:167:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalMGLang.g:167:2: ( ( rule__Node__Group__0 ) )
            // InternalMGLang.g:168:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalMGLang.g:169:3: ( rule__Node__Group__0 )
            // InternalMGLang.g:169:4: rule__Node__Group__0
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


    // $ANTLR start "entryRulePatternCall"
    // InternalMGLang.g:203:1: entryRulePatternCall : rulePatternCall EOF ;
    public final void entryRulePatternCall() throws RecognitionException {
        try {
            // InternalMGLang.g:204:1: ( rulePatternCall EOF )
            // InternalMGLang.g:205:1: rulePatternCall EOF
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
    // InternalMGLang.g:212:1: rulePatternCall : ( ( rule__PatternCall__Group__0 ) ) ;
    public final void rulePatternCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:216:2: ( ( ( rule__PatternCall__Group__0 ) ) )
            // InternalMGLang.g:217:2: ( ( rule__PatternCall__Group__0 ) )
            {
            // InternalMGLang.g:217:2: ( ( rule__PatternCall__Group__0 ) )
            // InternalMGLang.g:218:3: ( rule__PatternCall__Group__0 )
            {
             before(grammarAccess.getPatternCallAccess().getGroup()); 
            // InternalMGLang.g:219:3: ( rule__PatternCall__Group__0 )
            // InternalMGLang.g:219:4: rule__PatternCall__Group__0
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
    // InternalMGLang.g:362:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:366:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalMGLang.g:367:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalMGLang.g:367:2: ( ( rule__Parameter__Alternatives ) )
            // InternalMGLang.g:368:3: ( rule__Parameter__Alternatives )
            {
             before(grammarAccess.getParameterAccess().getAlternatives()); 
            // InternalMGLang.g:369:3: ( rule__Parameter__Alternatives )
            // InternalMGLang.g:369:4: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives()); 

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


    // $ANTLR start "entryRulePrimitiveParameter"
    // InternalMGLang.g:378:1: entryRulePrimitiveParameter : rulePrimitiveParameter EOF ;
    public final void entryRulePrimitiveParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:379:1: ( rulePrimitiveParameter EOF )
            // InternalMGLang.g:380:1: rulePrimitiveParameter EOF
            {
             before(grammarAccess.getPrimitiveParameterRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveParameter();

            state._fsp--;

             after(grammarAccess.getPrimitiveParameterRule()); 
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
    // $ANTLR end "entryRulePrimitiveParameter"


    // $ANTLR start "rulePrimitiveParameter"
    // InternalMGLang.g:387:1: rulePrimitiveParameter : ( ( rule__PrimitiveParameter__Group__0 ) ) ;
    public final void rulePrimitiveParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:391:2: ( ( ( rule__PrimitiveParameter__Group__0 ) ) )
            // InternalMGLang.g:392:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            {
            // InternalMGLang.g:392:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            // InternalMGLang.g:393:3: ( rule__PrimitiveParameter__Group__0 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getGroup()); 
            // InternalMGLang.g:394:3: ( rule__PrimitiveParameter__Group__0 )
            // InternalMGLang.g:394:4: rule__PrimitiveParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveParameterAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitiveParameter"


    // $ANTLR start "entryRuleObjectParameter"
    // InternalMGLang.g:403:1: entryRuleObjectParameter : ruleObjectParameter EOF ;
    public final void entryRuleObjectParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:404:1: ( ruleObjectParameter EOF )
            // InternalMGLang.g:405:1: ruleObjectParameter EOF
            {
             before(grammarAccess.getObjectParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectParameter();

            state._fsp--;

             after(grammarAccess.getObjectParameterRule()); 
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
    // $ANTLR end "entryRuleObjectParameter"


    // $ANTLR start "ruleObjectParameter"
    // InternalMGLang.g:412:1: ruleObjectParameter : ( ( rule__ObjectParameter__Group__0 ) ) ;
    public final void ruleObjectParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:416:2: ( ( ( rule__ObjectParameter__Group__0 ) ) )
            // InternalMGLang.g:417:2: ( ( rule__ObjectParameter__Group__0 ) )
            {
            // InternalMGLang.g:417:2: ( ( rule__ObjectParameter__Group__0 ) )
            // InternalMGLang.g:418:3: ( rule__ObjectParameter__Group__0 )
            {
             before(grammarAccess.getObjectParameterAccess().getGroup()); 
            // InternalMGLang.g:419:3: ( rule__ObjectParameter__Group__0 )
            // InternalMGLang.g:419:4: rule__ObjectParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectParameter"


    // $ANTLR start "entryRuleStringConcatenation"
    // InternalMGLang.g:428:1: entryRuleStringConcatenation : ruleStringConcatenation EOF ;
    public final void entryRuleStringConcatenation() throws RecognitionException {
        try {
            // InternalMGLang.g:429:1: ( ruleStringConcatenation EOF )
            // InternalMGLang.g:430:1: ruleStringConcatenation EOF
            {
             before(grammarAccess.getStringConcatenationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringConcatenation();

            state._fsp--;

             after(grammarAccess.getStringConcatenationRule()); 
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
    // $ANTLR end "entryRuleStringConcatenation"


    // $ANTLR start "ruleStringConcatenation"
    // InternalMGLang.g:437:1: ruleStringConcatenation : ( ( rule__StringConcatenation__Group__0 ) ) ;
    public final void ruleStringConcatenation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:441:2: ( ( ( rule__StringConcatenation__Group__0 ) ) )
            // InternalMGLang.g:442:2: ( ( rule__StringConcatenation__Group__0 ) )
            {
            // InternalMGLang.g:442:2: ( ( rule__StringConcatenation__Group__0 ) )
            // InternalMGLang.g:443:3: ( rule__StringConcatenation__Group__0 )
            {
             before(grammarAccess.getStringConcatenationAccess().getGroup()); 
            // InternalMGLang.g:444:3: ( rule__StringConcatenation__Group__0 )
            // InternalMGLang.g:444:4: rule__StringConcatenation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringConcatenation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringConcatenationAccess().getGroup()); 

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
    // $ANTLR end "ruleStringConcatenation"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMGLang.g:453:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:454:1: ( ruleStringLiteral EOF )
            // InternalMGLang.g:455:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMGLang.g:462:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:466:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMGLang.g:467:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMGLang.g:467:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMGLang.g:468:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMGLang.g:469:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMGLang.g:469:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:478:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalMGLang.g:479:1: ( ruleGenerator EOF )
            // InternalMGLang.g:480:1: ruleGenerator EOF
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
    // InternalMGLang.g:487:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:491:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalMGLang.g:492:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalMGLang.g:492:2: ( ( rule__Generator__Group__0 ) )
            // InternalMGLang.g:493:3: ( rule__Generator__Group__0 )
            {
             before(grammarAccess.getGeneratorAccess().getGroup()); 
            // InternalMGLang.g:494:3: ( rule__Generator__Group__0 )
            // InternalMGLang.g:494:4: rule__Generator__Group__0
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
    // InternalMGLang.g:503:1: entryRuleGeneratorElement : ruleGeneratorElement EOF ;
    public final void entryRuleGeneratorElement() throws RecognitionException {
        try {
            // InternalMGLang.g:504:1: ( ruleGeneratorElement EOF )
            // InternalMGLang.g:505:1: ruleGeneratorElement EOF
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
    // InternalMGLang.g:512:1: ruleGeneratorElement : ( ( rule__GeneratorElement__Alternatives ) ) ;
    public final void ruleGeneratorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:516:2: ( ( ( rule__GeneratorElement__Alternatives ) ) )
            // InternalMGLang.g:517:2: ( ( rule__GeneratorElement__Alternatives ) )
            {
            // InternalMGLang.g:517:2: ( ( rule__GeneratorElement__Alternatives ) )
            // InternalMGLang.g:518:3: ( rule__GeneratorElement__Alternatives )
            {
             before(grammarAccess.getGeneratorElementAccess().getAlternatives()); 
            // InternalMGLang.g:519:3: ( rule__GeneratorElement__Alternatives )
            // InternalMGLang.g:519:4: rule__GeneratorElement__Alternatives
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
    // InternalMGLang.g:528:1: entryRuleGeneratorCommand : ruleGeneratorCommand EOF ;
    public final void entryRuleGeneratorCommand() throws RecognitionException {
        try {
            // InternalMGLang.g:529:1: ( ruleGeneratorCommand EOF )
            // InternalMGLang.g:530:1: ruleGeneratorCommand EOF
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
    // InternalMGLang.g:537:1: ruleGeneratorCommand : ( ( rule__GeneratorCommand__Alternatives ) ) ;
    public final void ruleGeneratorCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:541:2: ( ( ( rule__GeneratorCommand__Alternatives ) ) )
            // InternalMGLang.g:542:2: ( ( rule__GeneratorCommand__Alternatives ) )
            {
            // InternalMGLang.g:542:2: ( ( rule__GeneratorCommand__Alternatives ) )
            // InternalMGLang.g:543:3: ( rule__GeneratorCommand__Alternatives )
            {
             before(grammarAccess.getGeneratorCommandAccess().getAlternatives()); 
            // InternalMGLang.g:544:3: ( rule__GeneratorCommand__Alternatives )
            // InternalMGLang.g:544:4: rule__GeneratorCommand__Alternatives
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


    // $ANTLR start "entryRulePatternObjectCreation"
    // InternalMGLang.g:553:1: entryRulePatternObjectCreation : rulePatternObjectCreation EOF ;
    public final void entryRulePatternObjectCreation() throws RecognitionException {
        try {
            // InternalMGLang.g:554:1: ( rulePatternObjectCreation EOF )
            // InternalMGLang.g:555:1: rulePatternObjectCreation EOF
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
    // InternalMGLang.g:562:1: rulePatternObjectCreation : ( ( rule__PatternObjectCreation__Group__0 ) ) ;
    public final void rulePatternObjectCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:566:2: ( ( ( rule__PatternObjectCreation__Group__0 ) ) )
            // InternalMGLang.g:567:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            {
            // InternalMGLang.g:567:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            // InternalMGLang.g:568:3: ( rule__PatternObjectCreation__Group__0 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getGroup()); 
            // InternalMGLang.g:569:3: ( rule__PatternObjectCreation__Group__0 )
            // InternalMGLang.g:569:4: rule__PatternObjectCreation__Group__0
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
    // InternalMGLang.g:578:1: entryRulePatternObject : rulePatternObject EOF ;
    public final void entryRulePatternObject() throws RecognitionException {
        try {
            // InternalMGLang.g:579:1: ( rulePatternObject EOF )
            // InternalMGLang.g:580:1: rulePatternObject EOF
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
    // InternalMGLang.g:587:1: rulePatternObject : ( ( rule__PatternObject__Group__0 ) ) ;
    public final void rulePatternObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:591:2: ( ( ( rule__PatternObject__Group__0 ) ) )
            // InternalMGLang.g:592:2: ( ( rule__PatternObject__Group__0 ) )
            {
            // InternalMGLang.g:592:2: ( ( rule__PatternObject__Group__0 ) )
            // InternalMGLang.g:593:3: ( rule__PatternObject__Group__0 )
            {
             before(grammarAccess.getPatternObjectAccess().getGroup()); 
            // InternalMGLang.g:594:3: ( rule__PatternObject__Group__0 )
            // InternalMGLang.g:594:4: rule__PatternObject__Group__0
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
    // InternalMGLang.g:603:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalMGLang.g:604:1: ( ruleForLoop EOF )
            // InternalMGLang.g:605:1: ruleForLoop EOF
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
    // InternalMGLang.g:612:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:616:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalMGLang.g:617:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalMGLang.g:617:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalMGLang.g:618:3: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalMGLang.g:619:3: ( rule__ForLoop__Group__0 )
            // InternalMGLang.g:619:4: rule__ForLoop__Group__0
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
    // InternalMGLang.g:628:1: entryRuleForCondition : ruleForCondition EOF ;
    public final void entryRuleForCondition() throws RecognitionException {
        try {
            // InternalMGLang.g:629:1: ( ruleForCondition EOF )
            // InternalMGLang.g:630:1: ruleForCondition EOF
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
    // InternalMGLang.g:637:1: ruleForCondition : ( ( rule__ForCondition__Alternatives ) ) ;
    public final void ruleForCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:641:2: ( ( ( rule__ForCondition__Alternatives ) ) )
            // InternalMGLang.g:642:2: ( ( rule__ForCondition__Alternatives ) )
            {
            // InternalMGLang.g:642:2: ( ( rule__ForCondition__Alternatives ) )
            // InternalMGLang.g:643:3: ( rule__ForCondition__Alternatives )
            {
             before(grammarAccess.getForConditionAccess().getAlternatives()); 
            // InternalMGLang.g:644:3: ( rule__ForCondition__Alternatives )
            // InternalMGLang.g:644:4: rule__ForCondition__Alternatives
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
    // InternalMGLang.g:653:1: entryRuleForEachCollection : ruleForEachCollection EOF ;
    public final void entryRuleForEachCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:654:1: ( ruleForEachCollection EOF )
            // InternalMGLang.g:655:1: ruleForEachCollection EOF
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
    // InternalMGLang.g:662:1: ruleForEachCollection : ( ( rule__ForEachCollection__CollAssignment ) ) ;
    public final void ruleForEachCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:666:2: ( ( ( rule__ForEachCollection__CollAssignment ) ) )
            // InternalMGLang.g:667:2: ( ( rule__ForEachCollection__CollAssignment ) )
            {
            // InternalMGLang.g:667:2: ( ( rule__ForEachCollection__CollAssignment ) )
            // InternalMGLang.g:668:3: ( rule__ForEachCollection__CollAssignment )
            {
             before(grammarAccess.getForEachCollectionAccess().getCollAssignment()); 
            // InternalMGLang.g:669:3: ( rule__ForEachCollection__CollAssignment )
            // InternalMGLang.g:669:4: rule__ForEachCollection__CollAssignment
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
    // InternalMGLang.g:678:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:679:1: ( ruleForRange EOF )
            // InternalMGLang.g:680:1: ruleForRange EOF
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
    // InternalMGLang.g:687:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:691:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:692:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:692:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:693:3: ( rule__ForRange__Group__0 )
            {
             before(grammarAccess.getForRangeAccess().getGroup()); 
            // InternalMGLang.g:694:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:694:4: rule__ForRange__Group__0
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
    // InternalMGLang.g:703:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:704:1: ( ruleLiteralExpression EOF )
            // InternalMGLang.g:705:1: ruleLiteralExpression EOF
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
    // InternalMGLang.g:712:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:716:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMGLang.g:717:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMGLang.g:717:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMGLang.g:718:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMGLang.g:719:3: ( rule__LiteralExpression__Alternatives )
            // InternalMGLang.g:719:4: rule__LiteralExpression__Alternatives
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


    // $ANTLR start "rulePrimitiveType"
    // InternalMGLang.g:728:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:732:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMGLang.g:733:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMGLang.g:733:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMGLang.g:734:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalMGLang.g:735:3: ( rule__PrimitiveType__Alternatives )
            // InternalMGLang.g:735:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleEditorRelation"
    // InternalMGLang.g:744:1: ruleEditorRelation : ( ( rule__EditorRelation__Alternatives ) ) ;
    public final void ruleEditorRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:748:1: ( ( ( rule__EditorRelation__Alternatives ) ) )
            // InternalMGLang.g:749:2: ( ( rule__EditorRelation__Alternatives ) )
            {
            // InternalMGLang.g:749:2: ( ( rule__EditorRelation__Alternatives ) )
            // InternalMGLang.g:750:3: ( rule__EditorRelation__Alternatives )
            {
             before(grammarAccess.getEditorRelationAccess().getAlternatives()); 
            // InternalMGLang.g:751:3: ( rule__EditorRelation__Alternatives )
            // InternalMGLang.g:751:4: rule__EditorRelation__Alternatives
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
    // InternalMGLang.g:759:1: rule__MofgenFile__Alternatives_1 : ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) );
    public final void rule__MofgenFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:763:1: ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGLang.g:764:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    {
                    // InternalMGLang.g:764:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    // InternalMGLang.g:765:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 
                    // InternalMGLang.g:766:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    // InternalMGLang.g:766:4: rule__MofgenFile__PatternsAssignment_1_0
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
                    // InternalMGLang.g:770:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    {
                    // InternalMGLang.g:770:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    // InternalMGLang.g:771:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 
                    // InternalMGLang.g:772:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    // InternalMGLang.g:772:4: rule__MofgenFile__GeneratorsAssignment_1_1
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


    // $ANTLR start "rule__Node__CreatedByAlternatives_2_0"
    // InternalMGLang.g:780:1: rule__Node__CreatedByAlternatives_2_0 : ( ( ruleNodeConstructor ) | ( rulePatternCall ) );
    public final void rule__Node__CreatedByAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:784:1: ( ( ruleNodeConstructor ) | ( rulePatternCall ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMGLang.g:785:2: ( ruleNodeConstructor )
                    {
                    // InternalMGLang.g:785:2: ( ruleNodeConstructor )
                    // InternalMGLang.g:786:3: ruleNodeConstructor
                    {
                     before(grammarAccess.getNodeAccess().getCreatedByNodeConstructorParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeConstructor();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getCreatedByNodeConstructorParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:791:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:791:2: ( rulePatternCall )
                    // InternalMGLang.g:792:3: rulePatternCall
                    {
                     before(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Node__CreatedByAlternatives_2_0"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Alternatives_0"
    // InternalMGLang.g:801:1: rule__NodeReferenceOrAssignment__Alternatives_0 : ( ( rulePatternNodeReference ) | ( ruleAssignment ) );
    public final void rule__NodeReferenceOrAssignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:805:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ASSIGNMENT_OP) ) {
                    alt3=2;
                }
                else if ( (LA3_1==36) ) {
                    alt3=1;
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
                    // InternalMGLang.g:806:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:806:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:807:3: rulePatternNodeReference
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
                    // InternalMGLang.g:812:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:812:2: ( ruleAssignment )
                    // InternalMGLang.g:813:3: ruleAssignment
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


    // $ANTLR start "rule__Parameter__Alternatives"
    // InternalMGLang.g:822:1: rule__Parameter__Alternatives : ( ( rulePrimitiveParameter ) | ( ruleObjectParameter ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:826:1: ( ( rulePrimitiveParameter ) | ( ruleObjectParameter ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=16)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:827:2: ( rulePrimitiveParameter )
                    {
                    // InternalMGLang.g:827:2: ( rulePrimitiveParameter )
                    // InternalMGLang.g:828:3: rulePrimitiveParameter
                    {
                     before(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveParameter();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:833:2: ( ruleObjectParameter )
                    {
                    // InternalMGLang.g:833:2: ( ruleObjectParameter )
                    // InternalMGLang.g:834:3: ruleObjectParameter
                    {
                     before(grammarAccess.getParameterAccess().getObjectParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectParameter();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getObjectParameterParserRuleCall_1()); 

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
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__GeneratorElement__Alternatives"
    // InternalMGLang.g:843:1: rule__GeneratorElement__Alternatives : ( ( ruleGeneratorCommand ) | ( ruleForLoop ) );
    public final void rule__GeneratorElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:847:1: ( ( ruleGeneratorCommand ) | ( ruleForLoop ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==39) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGLang.g:848:2: ( ruleGeneratorCommand )
                    {
                    // InternalMGLang.g:848:2: ( ruleGeneratorCommand )
                    // InternalMGLang.g:849:3: ruleGeneratorCommand
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
                    // InternalMGLang.g:854:2: ( ruleForLoop )
                    {
                    // InternalMGLang.g:854:2: ( ruleForLoop )
                    // InternalMGLang.g:855:3: ruleForLoop
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
    // InternalMGLang.g:864:1: rule__GeneratorCommand__Alternatives : ( ( rulePatternCall ) | ( rulePatternObjectCreation ) );
    public final void rule__GeneratorCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:868:1: ( ( rulePatternCall ) | ( rulePatternObjectCreation ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==28) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_ID) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:869:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:869:2: ( rulePatternCall )
                    // InternalMGLang.g:870:3: rulePatternCall
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
                    // InternalMGLang.g:875:2: ( rulePatternObjectCreation )
                    {
                    // InternalMGLang.g:875:2: ( rulePatternObjectCreation )
                    // InternalMGLang.g:876:3: rulePatternObjectCreation
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
    // InternalMGLang.g:885:1: rule__ForCondition__Alternatives : ( ( ruleForEachCollection ) | ( ruleForRange ) );
    public final void rule__ForCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:889:1: ( ( ruleForEachCollection ) | ( ruleForRange ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:890:2: ( ruleForEachCollection )
                    {
                    // InternalMGLang.g:890:2: ( ruleForEachCollection )
                    // InternalMGLang.g:891:3: ruleForEachCollection
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
                    // InternalMGLang.g:896:2: ( ruleForRange )
                    {
                    // InternalMGLang.g:896:2: ( ruleForRange )
                    // InternalMGLang.g:897:3: ruleForRange
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
    // InternalMGLang.g:906:1: rule__LiteralExpression__Alternatives : ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) | ( ( rule__LiteralExpression__Group_2__0 ) ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:910:1: ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) | ( ( rule__LiteralExpression__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
            case 42:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMGLang.g:911:2: ( ( rule__LiteralExpression__Group_0__0 ) )
                    {
                    // InternalMGLang.g:911:2: ( ( rule__LiteralExpression__Group_0__0 ) )
                    // InternalMGLang.g:912:3: ( rule__LiteralExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_0()); 
                    // InternalMGLang.g:913:3: ( rule__LiteralExpression__Group_0__0 )
                    // InternalMGLang.g:913:4: rule__LiteralExpression__Group_0__0
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
                    // InternalMGLang.g:917:2: ( ( rule__LiteralExpression__Group_1__0 ) )
                    {
                    // InternalMGLang.g:917:2: ( ( rule__LiteralExpression__Group_1__0 ) )
                    // InternalMGLang.g:918:3: ( rule__LiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_1()); 
                    // InternalMGLang.g:919:3: ( rule__LiteralExpression__Group_1__0 )
                    // InternalMGLang.g:919:4: rule__LiteralExpression__Group_1__0
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
                    // InternalMGLang.g:923:2: ( ( rule__LiteralExpression__Group_2__0 ) )
                    {
                    // InternalMGLang.g:923:2: ( ( rule__LiteralExpression__Group_2__0 ) )
                    // InternalMGLang.g:924:3: ( rule__LiteralExpression__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_2()); 
                    // InternalMGLang.g:925:3: ( rule__LiteralExpression__Group_2__0 )
                    // InternalMGLang.g:925:4: rule__LiteralExpression__Group_2__0
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
    // InternalMGLang.g:933:1: rule__LiteralExpression__ValueAlternatives_0_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__LiteralExpression__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:937:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:938:2: ( 'true' )
                    {
                    // InternalMGLang.g:938:2: ( 'true' )
                    // InternalMGLang.g:939:3: 'true'
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLiteralExpressionAccess().getValueTrueKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:944:2: ( 'false' )
                    {
                    // InternalMGLang.g:944:2: ( 'false' )
                    // InternalMGLang.g:945:3: 'false'
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getValueFalseKeyword_0_1_0_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalMGLang.g:954:1: rule__PrimitiveType__Alternatives : ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:958:1: ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:959:2: ( ( 'int' ) )
                    {
                    // InternalMGLang.g:959:2: ( ( 'int' ) )
                    // InternalMGLang.g:960:3: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:961:3: ( 'int' )
                    // InternalMGLang.g:961:4: 'int'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:965:2: ( ( 'char' ) )
                    {
                    // InternalMGLang.g:965:2: ( ( 'char' ) )
                    // InternalMGLang.g:966:3: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:967:3: ( 'char' )
                    // InternalMGLang.g:967:4: 'char'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:971:2: ( ( 'double' ) )
                    {
                    // InternalMGLang.g:971:2: ( ( 'double' ) )
                    // InternalMGLang.g:972:3: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:973:3: ( 'double' )
                    // InternalMGLang.g:973:4: 'double'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__EditorRelation__Alternatives"
    // InternalMGLang.g:981:1: rule__EditorRelation__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__EditorRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:985:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            case 20:
                {
                alt11=4;
                }
                break;
            case 21:
                {
                alt11=5;
                }
                break;
            case 22:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:986:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:986:2: ( ( '>' ) )
                    // InternalMGLang.g:987:3: ( '>' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:988:3: ( '>' )
                    // InternalMGLang.g:988:4: '>'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:992:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:992:2: ( ( '>=' ) )
                    // InternalMGLang.g:993:3: ( '>=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:994:3: ( '>=' )
                    // InternalMGLang.g:994:4: '>='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:998:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:998:2: ( ( '==' ) )
                    // InternalMGLang.g:999:3: ( '==' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:1000:3: ( '==' )
                    // InternalMGLang.g:1000:4: '=='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1004:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:1004:2: ( ( '!=' ) )
                    // InternalMGLang.g:1005:3: ( '!=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:1006:3: ( '!=' )
                    // InternalMGLang.g:1006:4: '!='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1010:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:1010:2: ( ( '<=' ) )
                    // InternalMGLang.g:1011:3: ( '<=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 
                    // InternalMGLang.g:1012:3: ( '<=' )
                    // InternalMGLang.g:1012:4: '<='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1016:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:1016:2: ( ( '<' ) )
                    // InternalMGLang.g:1017:3: ( '<' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getSMALLEREnumLiteralDeclaration_5()); 
                    // InternalMGLang.g:1018:3: ( '<' )
                    // InternalMGLang.g:1018:4: '<'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalMGLang.g:1026:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1030:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:1031:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
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
    // InternalMGLang.g:1038:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1042:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:1043:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:1043:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:1044:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            // InternalMGLang.g:1045:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMGLang.g:1045:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMGLang.g:1053:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1057:1: ( rule__MofgenFile__Group__1__Impl )
            // InternalMGLang.g:1058:2: rule__MofgenFile__Group__1__Impl
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
    // InternalMGLang.g:1064:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__Alternatives_1 )* ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1068:1: ( ( ( rule__MofgenFile__Alternatives_1 )* ) )
            // InternalMGLang.g:1069:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            {
            // InternalMGLang.g:1069:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            // InternalMGLang.g:1070:2: ( rule__MofgenFile__Alternatives_1 )*
            {
             before(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 
            // InternalMGLang.g:1071:2: ( rule__MofgenFile__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMGLang.g:1071:3: rule__MofgenFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MofgenFile__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMGLang.g:1080:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1084:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:1085:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMGLang.g:1092:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1096:1: ( ( 'import' ) )
            // InternalMGLang.g:1097:1: ( 'import' )
            {
            // InternalMGLang.g:1097:1: ( 'import' )
            // InternalMGLang.g:1098:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMGLang.g:1107:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1111:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:1112:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMGLang.g:1119:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1123:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalMGLang.g:1124:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1124:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalMGLang.g:1125:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1126:2: ( rule__Import__NameAssignment_1 )
            // InternalMGLang.g:1126:3: rule__Import__NameAssignment_1
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
    // InternalMGLang.g:1134:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1138:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:1139:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalMGLang.g:1146:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1150:1: ( ( 'as' ) )
            // InternalMGLang.g:1151:1: ( 'as' )
            {
            // InternalMGLang.g:1151:1: ( 'as' )
            // InternalMGLang.g:1152:2: 'as'
            {
             before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMGLang.g:1161:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1165:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:1166:2: rule__Import__Group__3__Impl
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
    // InternalMGLang.g:1172:1: rule__Import__Group__3__Impl : ( ( rule__Import__AliasAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1176:1: ( ( ( rule__Import__AliasAssignment_3 ) ) )
            // InternalMGLang.g:1177:1: ( ( rule__Import__AliasAssignment_3 ) )
            {
            // InternalMGLang.g:1177:1: ( ( rule__Import__AliasAssignment_3 ) )
            // InternalMGLang.g:1178:2: ( rule__Import__AliasAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getAliasAssignment_3()); 
            // InternalMGLang.g:1179:2: ( rule__Import__AliasAssignment_3 )
            // InternalMGLang.g:1179:3: rule__Import__AliasAssignment_3
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
    // InternalMGLang.g:1188:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1192:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:1193:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalMGLang.g:1200:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1204:1: ( ( 'pattern' ) )
            // InternalMGLang.g:1205:1: ( 'pattern' )
            {
            // InternalMGLang.g:1205:1: ( 'pattern' )
            // InternalMGLang.g:1206:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMGLang.g:1215:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1219:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:1220:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalMGLang.g:1227:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1231:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:1232:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1232:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:1233:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1234:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:1234:3: rule__Pattern__NameAssignment_1
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
    // InternalMGLang.g:1242:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1246:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:1247:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalMGLang.g:1254:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1258:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:1259:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:1259:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:1260:2: ( rule__Pattern__Group_2__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalMGLang.g:1261:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:1261:3: rule__Pattern__Group_2__0
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
    // InternalMGLang.g:1269:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1273:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:1274:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalMGLang.g:1281:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1285:1: ( ( '{' ) )
            // InternalMGLang.g:1286:1: ( '{' )
            {
            // InternalMGLang.g:1286:1: ( '{' )
            // InternalMGLang.g:1287:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMGLang.g:1296:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1300:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:1301:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalMGLang.g:1308:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__NodesAssignment_4 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1312:1: ( ( ( rule__Pattern__NodesAssignment_4 )* ) )
            // InternalMGLang.g:1313:1: ( ( rule__Pattern__NodesAssignment_4 )* )
            {
            // InternalMGLang.g:1313:1: ( ( rule__Pattern__NodesAssignment_4 )* )
            // InternalMGLang.g:1314:2: ( rule__Pattern__NodesAssignment_4 )*
            {
             before(grammarAccess.getPatternAccess().getNodesAssignment_4()); 
            // InternalMGLang.g:1315:2: ( rule__Pattern__NodesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGLang.g:1315:3: rule__Pattern__NodesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__NodesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getNodesAssignment_4()); 

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
    // InternalMGLang.g:1323:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1327:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:1328:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalMGLang.g:1335:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1339:1: ( ( '}' ) )
            // InternalMGLang.g:1340:1: ( '}' )
            {
            // InternalMGLang.g:1340:1: ( '}' )
            // InternalMGLang.g:1341:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMGLang.g:1350:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1354:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:1355:2: rule__Pattern__Group__6__Impl
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
    // InternalMGLang.g:1361:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 )? ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1365:1: ( ( ( rule__Pattern__ReturnAssignment_6 )? ) )
            // InternalMGLang.g:1366:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            {
            // InternalMGLang.g:1366:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            // InternalMGLang.g:1367:2: ( rule__Pattern__ReturnAssignment_6 )?
            {
             before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            // InternalMGLang.g:1368:2: ( rule__Pattern__ReturnAssignment_6 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1368:3: rule__Pattern__ReturnAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__ReturnAssignment_6();

                    state._fsp--;


                    }
                    break;

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
    // InternalMGLang.g:1377:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1381:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:1382:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalMGLang.g:1389:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1393:1: ( ( '(' ) )
            // InternalMGLang.g:1394:1: ( '(' )
            {
            // InternalMGLang.g:1394:1: ( '(' )
            // InternalMGLang.g:1395:2: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMGLang.g:1404:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1408:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:1409:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
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
    // InternalMGLang.g:1416:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1420:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:1421:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:1421:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:1422:2: ( rule__Pattern__Group_2_1__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalMGLang.g:1423:2: ( rule__Pattern__Group_2_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=14 && LA16_0<=16)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:1423:3: rule__Pattern__Group_2_1__0
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
    // InternalMGLang.g:1431:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1435:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:1436:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMGLang.g:1442:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1446:1: ( ( ')' ) )
            // InternalMGLang.g:1447:1: ( ')' )
            {
            // InternalMGLang.g:1447:1: ( ')' )
            // InternalMGLang.g:1448:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMGLang.g:1458:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1462:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:1463:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
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
    // InternalMGLang.g:1470:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1474:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:1475:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:1475:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:1476:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            // InternalMGLang.g:1477:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:1477:3: rule__Pattern__ParametersAssignment_2_1_0
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
    // InternalMGLang.g:1485:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1489:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:1490:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalMGLang.g:1496:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1500:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:1501:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:1501:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:1502:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            // InternalMGLang.g:1503:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMGLang.g:1503:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMGLang.g:1512:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1516:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:1517:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMGLang.g:1524:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1528:1: ( ( ',' ) )
            // InternalMGLang.g:1529:1: ( ',' )
            {
            // InternalMGLang.g:1529:1: ( ',' )
            // InternalMGLang.g:1530:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMGLang.g:1539:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1543:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:1544:2: rule__Pattern__Group_2_1_1__1__Impl
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
    // InternalMGLang.g:1550:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1554:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:1555:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:1555:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:1556:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            // InternalMGLang.g:1557:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:1557:3: rule__Pattern__ParametersAssignment_2_1_1_1
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
    // InternalMGLang.g:1566:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1570:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:1571:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMGLang.g:1578:1: rule__PatternReturn__Group__0__Impl : ( () ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1582:1: ( ( () ) )
            // InternalMGLang.g:1583:1: ( () )
            {
            // InternalMGLang.g:1583:1: ( () )
            // InternalMGLang.g:1584:2: ()
            {
             before(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            // InternalMGLang.g:1585:2: ()
            // InternalMGLang.g:1585:3: 
            {
            }

             after(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__0__Impl"


    // $ANTLR start "rule__PatternReturn__Group__1"
    // InternalMGLang.g:1593:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1597:1: ( rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 )
            // InternalMGLang.g:1598:2: rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__PatternReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__2();

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
    // InternalMGLang.g:1605:1: rule__PatternReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1609:1: ( ( 'return' ) )
            // InternalMGLang.g:1610:1: ( 'return' )
            {
            // InternalMGLang.g:1610:1: ( 'return' )
            // InternalMGLang.g:1611:2: 'return'
            {
             before(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 

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


    // $ANTLR start "rule__PatternReturn__Group__2"
    // InternalMGLang.g:1620:1: rule__PatternReturn__Group__2 : rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 ;
    public final void rule__PatternReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1624:1: ( rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 )
            // InternalMGLang.g:1625:2: rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__PatternReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__3();

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
    // $ANTLR end "rule__PatternReturn__Group__2"


    // $ANTLR start "rule__PatternReturn__Group__2__Impl"
    // InternalMGLang.g:1632:1: rule__PatternReturn__Group__2__Impl : ( 'this' ) ;
    public final void rule__PatternReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1636:1: ( ( 'this' ) )
            // InternalMGLang.g:1637:1: ( 'this' )
            {
            // InternalMGLang.g:1637:1: ( 'this' )
            // InternalMGLang.g:1638:2: 'this'
            {
             before(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 

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
    // $ANTLR end "rule__PatternReturn__Group__2__Impl"


    // $ANTLR start "rule__PatternReturn__Group__3"
    // InternalMGLang.g:1647:1: rule__PatternReturn__Group__3 : rule__PatternReturn__Group__3__Impl ;
    public final void rule__PatternReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1651:1: ( rule__PatternReturn__Group__3__Impl )
            // InternalMGLang.g:1652:2: rule__PatternReturn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__3__Impl();

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
    // $ANTLR end "rule__PatternReturn__Group__3"


    // $ANTLR start "rule__PatternReturn__Group__3__Impl"
    // InternalMGLang.g:1658:1: rule__PatternReturn__Group__3__Impl : ( ( rule__PatternReturn__Group_3__0 )? ) ;
    public final void rule__PatternReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1662:1: ( ( ( rule__PatternReturn__Group_3__0 )? ) )
            // InternalMGLang.g:1663:1: ( ( rule__PatternReturn__Group_3__0 )? )
            {
            // InternalMGLang.g:1663:1: ( ( rule__PatternReturn__Group_3__0 )? )
            // InternalMGLang.g:1664:2: ( rule__PatternReturn__Group_3__0 )?
            {
             before(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            // InternalMGLang.g:1665:2: ( rule__PatternReturn__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMGLang.g:1665:3: rule__PatternReturn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternReturn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternReturnAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PatternReturn__Group__3__Impl"


    // $ANTLR start "rule__PatternReturn__Group_3__0"
    // InternalMGLang.g:1674:1: rule__PatternReturn__Group_3__0 : rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 ;
    public final void rule__PatternReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1678:1: ( rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 )
            // InternalMGLang.g:1679:2: rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__PatternReturn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group_3__1();

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
    // $ANTLR end "rule__PatternReturn__Group_3__0"


    // $ANTLR start "rule__PatternReturn__Group_3__0__Impl"
    // InternalMGLang.g:1686:1: rule__PatternReturn__Group_3__0__Impl : ( '.' ) ;
    public final void rule__PatternReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1690:1: ( ( '.' ) )
            // InternalMGLang.g:1691:1: ( '.' )
            {
            // InternalMGLang.g:1691:1: ( '.' )
            // InternalMGLang.g:1692:2: '.'
            {
             before(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 

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
    // $ANTLR end "rule__PatternReturn__Group_3__0__Impl"


    // $ANTLR start "rule__PatternReturn__Group_3__1"
    // InternalMGLang.g:1701:1: rule__PatternReturn__Group_3__1 : rule__PatternReturn__Group_3__1__Impl ;
    public final void rule__PatternReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1705:1: ( rule__PatternReturn__Group_3__1__Impl )
            // InternalMGLang.g:1706:2: rule__PatternReturn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group_3__1__Impl();

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
    // $ANTLR end "rule__PatternReturn__Group_3__1"


    // $ANTLR start "rule__PatternReturn__Group_3__1__Impl"
    // InternalMGLang.g:1712:1: rule__PatternReturn__Group_3__1__Impl : ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) ;
    public final void rule__PatternReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1716:1: ( ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) )
            // InternalMGLang.g:1717:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            {
            // InternalMGLang.g:1717:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            // InternalMGLang.g:1718:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            // InternalMGLang.g:1719:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            // InternalMGLang.g:1719:3: rule__PatternReturn__ReturnValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__ReturnValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 

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
    // $ANTLR end "rule__PatternReturn__Group_3__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalMGLang.g:1728:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1732:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:1733:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalMGLang.g:1740:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1744:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:1745:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:1745:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:1746:2: ( rule__Node__TypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:1747:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:1747:3: rule__Node__TypeAssignment_0
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
    // InternalMGLang.g:1755:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1759:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalMGLang.g:1760:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

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
    // InternalMGLang.g:1767:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1771:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:1772:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1772:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:1773:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1774:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:1774:3: rule__Node__NameAssignment_1
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


    // $ANTLR start "rule__Node__Group__2"
    // InternalMGLang.g:1782:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1786:1: ( rule__Node__Group__2__Impl )
            // InternalMGLang.g:1787:2: rule__Node__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__2__Impl();

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
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalMGLang.g:1793:1: rule__Node__Group__2__Impl : ( ( rule__Node__CreatedByAssignment_2 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1797:1: ( ( ( rule__Node__CreatedByAssignment_2 )? ) )
            // InternalMGLang.g:1798:1: ( ( rule__Node__CreatedByAssignment_2 )? )
            {
            // InternalMGLang.g:1798:1: ( ( rule__Node__CreatedByAssignment_2 )? )
            // InternalMGLang.g:1799:2: ( rule__Node__CreatedByAssignment_2 )?
            {
             before(grammarAccess.getNodeAccess().getCreatedByAssignment_2()); 
            // InternalMGLang.g:1800:2: ( rule__Node__CreatedByAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==28) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalMGLang.g:1800:3: rule__Node__CreatedByAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__CreatedByAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getCreatedByAssignment_2()); 

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
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__NodeConstructor__Group__0"
    // InternalMGLang.g:1809:1: rule__NodeConstructor__Group__0 : rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 ;
    public final void rule__NodeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1813:1: ( rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 )
            // InternalMGLang.g:1814:2: rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:1821:1: rule__NodeConstructor__Group__0__Impl : ( () ) ;
    public final void rule__NodeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1825:1: ( ( () ) )
            // InternalMGLang.g:1826:1: ( () )
            {
            // InternalMGLang.g:1826:1: ( () )
            // InternalMGLang.g:1827:2: ()
            {
             before(grammarAccess.getNodeConstructorAccess().getNodeConstructorAction_0()); 
            // InternalMGLang.g:1828:2: ()
            // InternalMGLang.g:1828:3: 
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
    // InternalMGLang.g:1836:1: rule__NodeConstructor__Group__1 : rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 ;
    public final void rule__NodeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1840:1: ( rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 )
            // InternalMGLang.g:1841:2: rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMGLang.g:1848:1: rule__NodeConstructor__Group__1__Impl : ( '{' ) ;
    public final void rule__NodeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1852:1: ( ( '{' ) )
            // InternalMGLang.g:1853:1: ( '{' )
            {
            // InternalMGLang.g:1853:1: ( '{' )
            // InternalMGLang.g:1854:2: '{'
            {
             before(grammarAccess.getNodeConstructorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNodeConstructorAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalMGLang.g:1863:1: rule__NodeConstructor__Group__2 : rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 ;
    public final void rule__NodeConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1867:1: ( rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 )
            // InternalMGLang.g:1868:2: rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMGLang.g:1875:1: rule__NodeConstructor__Group__2__Impl : ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* ) ;
    public final void rule__NodeConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1879:1: ( ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* ) )
            // InternalMGLang.g:1880:1: ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* )
            {
            // InternalMGLang.g:1880:1: ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* )
            // InternalMGLang.g:1881:2: ( rule__NodeConstructor__RefsAssignsAssignment_2 )*
            {
             before(grammarAccess.getNodeConstructorAccess().getRefsAssignsAssignment_2()); 
            // InternalMGLang.g:1882:2: ( rule__NodeConstructor__RefsAssignsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMGLang.g:1882:3: rule__NodeConstructor__RefsAssignsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NodeConstructor__RefsAssignsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getNodeConstructorAccess().getRefsAssignsAssignment_2()); 

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
    // InternalMGLang.g:1890:1: rule__NodeConstructor__Group__3 : rule__NodeConstructor__Group__3__Impl ;
    public final void rule__NodeConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1894:1: ( rule__NodeConstructor__Group__3__Impl )
            // InternalMGLang.g:1895:2: rule__NodeConstructor__Group__3__Impl
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
    // InternalMGLang.g:1901:1: rule__NodeConstructor__Group__3__Impl : ( '}' ) ;
    public final void rule__NodeConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1905:1: ( ( '}' ) )
            // InternalMGLang.g:1906:1: ( '}' )
            {
            // InternalMGLang.g:1906:1: ( '}' )
            // InternalMGLang.g:1907:2: '}'
            {
             before(grammarAccess.getNodeConstructorAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNodeConstructorAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__PatternCall__Group__0"
    // InternalMGLang.g:1917:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1921:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:1922:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
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
    // InternalMGLang.g:1929:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1933:1: ( ( ( rule__PatternCall__CalledAssignment_0 ) ) )
            // InternalMGLang.g:1934:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            {
            // InternalMGLang.g:1934:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            // InternalMGLang.g:1935:2: ( rule__PatternCall__CalledAssignment_0 )
            {
             before(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            // InternalMGLang.g:1936:2: ( rule__PatternCall__CalledAssignment_0 )
            // InternalMGLang.g:1936:3: rule__PatternCall__CalledAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__CalledAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 

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
    // InternalMGLang.g:1944:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1948:1: ( rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 )
            // InternalMGLang.g:1949:2: rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__PatternCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__2();

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
    // InternalMGLang.g:1956:1: rule__PatternCall__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1960:1: ( ( '(' ) )
            // InternalMGLang.g:1961:1: ( '(' )
            {
            // InternalMGLang.g:1961:1: ( '(' )
            // InternalMGLang.g:1962:2: '('
            {
             before(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1()); 

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


    // $ANTLR start "rule__PatternCall__Group__2"
    // InternalMGLang.g:1971:1: rule__PatternCall__Group__2 : rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 ;
    public final void rule__PatternCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1975:1: ( rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 )
            // InternalMGLang.g:1976:2: rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__PatternCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__3();

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
    // $ANTLR end "rule__PatternCall__Group__2"


    // $ANTLR start "rule__PatternCall__Group__2__Impl"
    // InternalMGLang.g:1983:1: rule__PatternCall__Group__2__Impl : ( ( rule__PatternCall__ParamsAssignment_2 )* ) ;
    public final void rule__PatternCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1987:1: ( ( ( rule__PatternCall__ParamsAssignment_2 )* ) )
            // InternalMGLang.g:1988:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            {
            // InternalMGLang.g:1988:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            // InternalMGLang.g:1989:2: ( rule__PatternCall__ParamsAssignment_2 )*
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_2()); 
            // InternalMGLang.g:1990:2: ( rule__PatternCall__ParamsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)||(LA21_0>=12 && LA21_0<=13)||LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:1990:3: rule__PatternCall__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PatternCall__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPatternCallAccess().getParamsAssignment_2()); 

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
    // $ANTLR end "rule__PatternCall__Group__2__Impl"


    // $ANTLR start "rule__PatternCall__Group__3"
    // InternalMGLang.g:1998:1: rule__PatternCall__Group__3 : rule__PatternCall__Group__3__Impl ;
    public final void rule__PatternCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2002:1: ( rule__PatternCall__Group__3__Impl )
            // InternalMGLang.g:2003:2: rule__PatternCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__3__Impl();

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
    // $ANTLR end "rule__PatternCall__Group__3"


    // $ANTLR start "rule__PatternCall__Group__3__Impl"
    // InternalMGLang.g:2009:1: rule__PatternCall__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2013:1: ( ( ')' ) )
            // InternalMGLang.g:2014:1: ( ')' )
            {
            // InternalMGLang.g:2014:1: ( ')' )
            // InternalMGLang.g:2015:2: ')'
            {
             before(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__PatternCall__Group__3__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__0"
    // InternalMGLang.g:2025:1: rule__NodeReferenceOrAssignment__Group__0 : rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 ;
    public final void rule__NodeReferenceOrAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2029:1: ( rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 )
            // InternalMGLang.g:2030:2: rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMGLang.g:2037:1: rule__NodeReferenceOrAssignment__Group__0__Impl : ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2041:1: ( ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) )
            // InternalMGLang.g:2042:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            {
            // InternalMGLang.g:2042:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            // InternalMGLang.g:2043:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives_0()); 
            // InternalMGLang.g:2044:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            // InternalMGLang.g:2044:3: rule__NodeReferenceOrAssignment__Alternatives_0
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
    // InternalMGLang.g:2052:1: rule__NodeReferenceOrAssignment__Group__1 : rule__NodeReferenceOrAssignment__Group__1__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2056:1: ( rule__NodeReferenceOrAssignment__Group__1__Impl )
            // InternalMGLang.g:2057:2: rule__NodeReferenceOrAssignment__Group__1__Impl
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
    // InternalMGLang.g:2063:1: rule__NodeReferenceOrAssignment__Group__1__Impl : ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) ;
    public final void rule__NodeReferenceOrAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2067:1: ( ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) )
            // InternalMGLang.g:2068:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            {
            // InternalMGLang.g:2068:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            // InternalMGLang.g:2069:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup_1()); 
            // InternalMGLang.g:2070:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMGLang.g:2070:3: rule__NodeReferenceOrAssignment__Group_1__0
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
    // InternalMGLang.g:2079:1: rule__NodeReferenceOrAssignment__Group_1__0 : rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2083:1: ( rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 )
            // InternalMGLang.g:2084:2: rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1
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
    // InternalMGLang.g:2091:1: rule__NodeReferenceOrAssignment__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2095:1: ( ( '[' ) )
            // InternalMGLang.g:2096:1: ( '[' )
            {
            // InternalMGLang.g:2096:1: ( '[' )
            // InternalMGLang.g:2097:2: '['
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMGLang.g:2106:1: rule__NodeReferenceOrAssignment__Group_1__1 : rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2110:1: ( rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 )
            // InternalMGLang.g:2111:2: rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMGLang.g:2118:1: rule__NodeReferenceOrAssignment__Group_1__1__Impl : ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2122:1: ( ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) )
            // InternalMGLang.g:2123:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            {
            // InternalMGLang.g:2123:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            // InternalMGLang.g:2124:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionAssignment_1_1()); 
            // InternalMGLang.g:2125:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            // InternalMGLang.g:2125:3: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1
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
    // InternalMGLang.g:2133:1: rule__NodeReferenceOrAssignment__Group_1__2 : rule__NodeReferenceOrAssignment__Group_1__2__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2137:1: ( rule__NodeReferenceOrAssignment__Group_1__2__Impl )
            // InternalMGLang.g:2138:2: rule__NodeReferenceOrAssignment__Group_1__2__Impl
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
    // InternalMGLang.g:2144:1: rule__NodeReferenceOrAssignment__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2148:1: ( ( ']' ) )
            // InternalMGLang.g:2149:1: ( ']' )
            {
            // InternalMGLang.g:2149:1: ( ']' )
            // InternalMGLang.g:2150:2: ']'
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMGLang.g:2160:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2164:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMGLang.g:2165:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:2172:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LhsAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2176:1: ( ( ( rule__Condition__LhsAssignment_0 ) ) )
            // InternalMGLang.g:2177:1: ( ( rule__Condition__LhsAssignment_0 ) )
            {
            // InternalMGLang.g:2177:1: ( ( rule__Condition__LhsAssignment_0 ) )
            // InternalMGLang.g:2178:2: ( rule__Condition__LhsAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLhsAssignment_0()); 
            // InternalMGLang.g:2179:2: ( rule__Condition__LhsAssignment_0 )
            // InternalMGLang.g:2179:3: rule__Condition__LhsAssignment_0
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
    // InternalMGLang.g:2187:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2191:1: ( rule__Condition__Group__1__Impl )
            // InternalMGLang.g:2192:2: rule__Condition__Group__1__Impl
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
    // InternalMGLang.g:2198:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2202:1: ( ( ( rule__Condition__Group_1__0 )? ) )
            // InternalMGLang.g:2203:1: ( ( rule__Condition__Group_1__0 )? )
            {
            // InternalMGLang.g:2203:1: ( ( rule__Condition__Group_1__0 )? )
            // InternalMGLang.g:2204:2: ( rule__Condition__Group_1__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // InternalMGLang.g:2205:2: ( rule__Condition__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=17 && LA23_0<=22)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:2205:3: rule__Condition__Group_1__0
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
    // InternalMGLang.g:2214:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2218:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalMGLang.g:2219:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
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
    // InternalMGLang.g:2226:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__RelationAssignment_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2230:1: ( ( ( rule__Condition__RelationAssignment_1_0 ) ) )
            // InternalMGLang.g:2231:1: ( ( rule__Condition__RelationAssignment_1_0 ) )
            {
            // InternalMGLang.g:2231:1: ( ( rule__Condition__RelationAssignment_1_0 ) )
            // InternalMGLang.g:2232:2: ( rule__Condition__RelationAssignment_1_0 )
            {
             before(grammarAccess.getConditionAccess().getRelationAssignment_1_0()); 
            // InternalMGLang.g:2233:2: ( rule__Condition__RelationAssignment_1_0 )
            // InternalMGLang.g:2233:3: rule__Condition__RelationAssignment_1_0
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
    // InternalMGLang.g:2241:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2245:1: ( rule__Condition__Group_1__1__Impl )
            // InternalMGLang.g:2246:2: rule__Condition__Group_1__1__Impl
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
    // InternalMGLang.g:2252:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__RhsAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2256:1: ( ( ( rule__Condition__RhsAssignment_1_1 ) ) )
            // InternalMGLang.g:2257:1: ( ( rule__Condition__RhsAssignment_1_1 ) )
            {
            // InternalMGLang.g:2257:1: ( ( rule__Condition__RhsAssignment_1_1 ) )
            // InternalMGLang.g:2258:2: ( rule__Condition__RhsAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getRhsAssignment_1_1()); 
            // InternalMGLang.g:2259:2: ( rule__Condition__RhsAssignment_1_1 )
            // InternalMGLang.g:2259:3: rule__Condition__RhsAssignment_1_1
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
    // InternalMGLang.g:2268:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2272:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:2273:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:2280:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2284:1: ( ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2285:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2285:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            // InternalMGLang.g:2286:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2287:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            // InternalMGLang.g:2287:3: rule__PatternNodeReference__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 

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
    // InternalMGLang.g:2295:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2299:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:2300:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
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
    // InternalMGLang.g:2307:1: rule__PatternNodeReference__Group__1__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2311:1: ( ( '->' ) )
            // InternalMGLang.g:2312:1: ( '->' )
            {
            // InternalMGLang.g:2312:1: ( '->' )
            // InternalMGLang.g:2313:2: '->'
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // InternalMGLang.g:2322:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2326:1: ( rule__PatternNodeReference__Group__2__Impl )
            // InternalMGLang.g:2327:2: rule__PatternNodeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__2__Impl();

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
    // InternalMGLang.g:2333:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2337:1: ( ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) )
            // InternalMGLang.g:2338:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            {
            // InternalMGLang.g:2338:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            // InternalMGLang.g:2339:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            // InternalMGLang.g:2340:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            // InternalMGLang.g:2340:3: rule__PatternNodeReference__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 

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


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMGLang.g:2349:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2353:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:2354:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:2361:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2365:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:2366:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:2366:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:2367:2: ( rule__Assignment__TargetAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            // InternalMGLang.g:2368:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:2368:3: rule__Assignment__TargetAssignment_0
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
    // InternalMGLang.g:2376:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2380:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:2381:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMGLang.g:2388:1: rule__Assignment__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2392:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2393:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2393:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:2394:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 

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
    // InternalMGLang.g:2403:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2407:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:2408:2: rule__Assignment__Group__2__Impl
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
    // InternalMGLang.g:2414:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2418:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:2419:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:2419:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:2420:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMGLang.g:2421:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:2421:3: rule__Assignment__ValueAssignment_2
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
    // InternalMGLang.g:2430:1: rule__NodeAttributeCall__Group__0 : rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 ;
    public final void rule__NodeAttributeCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2434:1: ( rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 )
            // InternalMGLang.g:2435:2: rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMGLang.g:2442:1: rule__NodeAttributeCall__Group__0__Impl : ( ( rule__NodeAttributeCall__NodeAssignment_0 ) ) ;
    public final void rule__NodeAttributeCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2446:1: ( ( ( rule__NodeAttributeCall__NodeAssignment_0 ) ) )
            // InternalMGLang.g:2447:1: ( ( rule__NodeAttributeCall__NodeAssignment_0 ) )
            {
            // InternalMGLang.g:2447:1: ( ( rule__NodeAttributeCall__NodeAssignment_0 ) )
            // InternalMGLang.g:2448:2: ( rule__NodeAttributeCall__NodeAssignment_0 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getNodeAssignment_0()); 
            // InternalMGLang.g:2449:2: ( rule__NodeAttributeCall__NodeAssignment_0 )
            // InternalMGLang.g:2449:3: rule__NodeAttributeCall__NodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeAttributeCall__NodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAttributeCallAccess().getNodeAssignment_0()); 

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
    // InternalMGLang.g:2457:1: rule__NodeAttributeCall__Group__1 : rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 ;
    public final void rule__NodeAttributeCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2461:1: ( rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 )
            // InternalMGLang.g:2462:2: rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2
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
    // InternalMGLang.g:2469:1: rule__NodeAttributeCall__Group__1__Impl : ( '.' ) ;
    public final void rule__NodeAttributeCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2473:1: ( ( '.' ) )
            // InternalMGLang.g:2474:1: ( '.' )
            {
            // InternalMGLang.g:2474:1: ( '.' )
            // InternalMGLang.g:2475:2: '.'
            {
             before(grammarAccess.getNodeAttributeCallAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMGLang.g:2484:1: rule__NodeAttributeCall__Group__2 : rule__NodeAttributeCall__Group__2__Impl ;
    public final void rule__NodeAttributeCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2488:1: ( rule__NodeAttributeCall__Group__2__Impl )
            // InternalMGLang.g:2489:2: rule__NodeAttributeCall__Group__2__Impl
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
    // InternalMGLang.g:2495:1: rule__NodeAttributeCall__Group__2__Impl : ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) ;
    public final void rule__NodeAttributeCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2499:1: ( ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:2500:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:2500:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            // InternalMGLang.g:2501:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeAssignment_2()); 
            // InternalMGLang.g:2502:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            // InternalMGLang.g:2502:3: rule__NodeAttributeCall__AttributeAssignment_2
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


    // $ANTLR start "rule__PrimitiveParameter__Group__0"
    // InternalMGLang.g:2511:1: rule__PrimitiveParameter__Group__0 : rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 ;
    public final void rule__PrimitiveParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2515:1: ( rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 )
            // InternalMGLang.g:2516:2: rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__1();

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
    // $ANTLR end "rule__PrimitiveParameter__Group__0"


    // $ANTLR start "rule__PrimitiveParameter__Group__0__Impl"
    // InternalMGLang.g:2523:1: rule__PrimitiveParameter__Group__0__Impl : ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2527:1: ( ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2528:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2528:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:2529:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2530:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            // InternalMGLang.g:2530:3: rule__PrimitiveParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__PrimitiveParameter__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveParameter__Group__1"
    // InternalMGLang.g:2538:1: rule__PrimitiveParameter__Group__1 : rule__PrimitiveParameter__Group__1__Impl ;
    public final void rule__PrimitiveParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2542:1: ( rule__PrimitiveParameter__Group__1__Impl )
            // InternalMGLang.g:2543:2: rule__PrimitiveParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__1__Impl();

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
    // $ANTLR end "rule__PrimitiveParameter__Group__1"


    // $ANTLR start "rule__PrimitiveParameter__Group__1__Impl"
    // InternalMGLang.g:2549:1: rule__PrimitiveParameter__Group__1__Impl : ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2553:1: ( ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:2554:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2554:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            // InternalMGLang.g:2555:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2556:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            // InternalMGLang.g:2556:3: rule__PrimitiveParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PrimitiveParameter__Group__1__Impl"


    // $ANTLR start "rule__ObjectParameter__Group__0"
    // InternalMGLang.g:2565:1: rule__ObjectParameter__Group__0 : rule__ObjectParameter__Group__0__Impl rule__ObjectParameter__Group__1 ;
    public final void rule__ObjectParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2569:1: ( rule__ObjectParameter__Group__0__Impl rule__ObjectParameter__Group__1 )
            // InternalMGLang.g:2570:2: rule__ObjectParameter__Group__0__Impl rule__ObjectParameter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ObjectParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectParameter__Group__1();

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
    // $ANTLR end "rule__ObjectParameter__Group__0"


    // $ANTLR start "rule__ObjectParameter__Group__0__Impl"
    // InternalMGLang.g:2577:1: rule__ObjectParameter__Group__0__Impl : ( ( rule__ObjectParameter__TypeAssignment_0 ) ) ;
    public final void rule__ObjectParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2581:1: ( ( ( rule__ObjectParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2582:1: ( ( rule__ObjectParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2582:1: ( ( rule__ObjectParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:2583:2: ( rule__ObjectParameter__TypeAssignment_0 )
            {
             before(grammarAccess.getObjectParameterAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2584:2: ( rule__ObjectParameter__TypeAssignment_0 )
            // InternalMGLang.g:2584:3: rule__ObjectParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectParameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectParameterAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__ObjectParameter__Group__0__Impl"


    // $ANTLR start "rule__ObjectParameter__Group__1"
    // InternalMGLang.g:2592:1: rule__ObjectParameter__Group__1 : rule__ObjectParameter__Group__1__Impl ;
    public final void rule__ObjectParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2596:1: ( rule__ObjectParameter__Group__1__Impl )
            // InternalMGLang.g:2597:2: rule__ObjectParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectParameter__Group__1__Impl();

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
    // $ANTLR end "rule__ObjectParameter__Group__1"


    // $ANTLR start "rule__ObjectParameter__Group__1__Impl"
    // InternalMGLang.g:2603:1: rule__ObjectParameter__Group__1__Impl : ( ( rule__ObjectParameter__NameAssignment_1 ) ) ;
    public final void rule__ObjectParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2607:1: ( ( ( rule__ObjectParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:2608:1: ( ( rule__ObjectParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2608:1: ( ( rule__ObjectParameter__NameAssignment_1 ) )
            // InternalMGLang.g:2609:2: ( rule__ObjectParameter__NameAssignment_1 )
            {
             before(grammarAccess.getObjectParameterAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2610:2: ( rule__ObjectParameter__NameAssignment_1 )
            // InternalMGLang.g:2610:3: rule__ObjectParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ObjectParameter__Group__1__Impl"


    // $ANTLR start "rule__StringConcatenation__Group__0"
    // InternalMGLang.g:2619:1: rule__StringConcatenation__Group__0 : rule__StringConcatenation__Group__0__Impl rule__StringConcatenation__Group__1 ;
    public final void rule__StringConcatenation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2623:1: ( rule__StringConcatenation__Group__0__Impl rule__StringConcatenation__Group__1 )
            // InternalMGLang.g:2624:2: rule__StringConcatenation__Group__0__Impl rule__StringConcatenation__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__StringConcatenation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcatenation__Group__1();

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
    // $ANTLR end "rule__StringConcatenation__Group__0"


    // $ANTLR start "rule__StringConcatenation__Group__0__Impl"
    // InternalMGLang.g:2631:1: rule__StringConcatenation__Group__0__Impl : ( ruleStringLiteral ) ;
    public final void rule__StringConcatenation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2635:1: ( ( ruleStringLiteral ) )
            // InternalMGLang.g:2636:1: ( ruleStringLiteral )
            {
            // InternalMGLang.g:2636:1: ( ruleStringLiteral )
            // InternalMGLang.g:2637:2: ruleStringLiteral
            {
             before(grammarAccess.getStringConcatenationAccess().getStringLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringConcatenationAccess().getStringLiteralParserRuleCall_0()); 

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
    // $ANTLR end "rule__StringConcatenation__Group__0__Impl"


    // $ANTLR start "rule__StringConcatenation__Group__1"
    // InternalMGLang.g:2646:1: rule__StringConcatenation__Group__1 : rule__StringConcatenation__Group__1__Impl ;
    public final void rule__StringConcatenation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2650:1: ( rule__StringConcatenation__Group__1__Impl )
            // InternalMGLang.g:2651:2: rule__StringConcatenation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringConcatenation__Group__1__Impl();

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
    // $ANTLR end "rule__StringConcatenation__Group__1"


    // $ANTLR start "rule__StringConcatenation__Group__1__Impl"
    // InternalMGLang.g:2657:1: rule__StringConcatenation__Group__1__Impl : ( ( rule__StringConcatenation__Group_1__0 )? ) ;
    public final void rule__StringConcatenation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2661:1: ( ( ( rule__StringConcatenation__Group_1__0 )? ) )
            // InternalMGLang.g:2662:1: ( ( rule__StringConcatenation__Group_1__0 )? )
            {
            // InternalMGLang.g:2662:1: ( ( rule__StringConcatenation__Group_1__0 )? )
            // InternalMGLang.g:2663:2: ( rule__StringConcatenation__Group_1__0 )?
            {
             before(grammarAccess.getStringConcatenationAccess().getGroup_1()); 
            // InternalMGLang.g:2664:2: ( rule__StringConcatenation__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMGLang.g:2664:3: rule__StringConcatenation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringConcatenation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConcatenationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StringConcatenation__Group__1__Impl"


    // $ANTLR start "rule__StringConcatenation__Group_1__0"
    // InternalMGLang.g:2673:1: rule__StringConcatenation__Group_1__0 : rule__StringConcatenation__Group_1__0__Impl rule__StringConcatenation__Group_1__1 ;
    public final void rule__StringConcatenation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2677:1: ( rule__StringConcatenation__Group_1__0__Impl rule__StringConcatenation__Group_1__1 )
            // InternalMGLang.g:2678:2: rule__StringConcatenation__Group_1__0__Impl rule__StringConcatenation__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__StringConcatenation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcatenation__Group_1__1();

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
    // $ANTLR end "rule__StringConcatenation__Group_1__0"


    // $ANTLR start "rule__StringConcatenation__Group_1__0__Impl"
    // InternalMGLang.g:2685:1: rule__StringConcatenation__Group_1__0__Impl : ( () ) ;
    public final void rule__StringConcatenation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2689:1: ( ( () ) )
            // InternalMGLang.g:2690:1: ( () )
            {
            // InternalMGLang.g:2690:1: ( () )
            // InternalMGLang.g:2691:2: ()
            {
             before(grammarAccess.getStringConcatenationAccess().getConcatLeftAction_1_0()); 
            // InternalMGLang.g:2692:2: ()
            // InternalMGLang.g:2692:3: 
            {
            }

             after(grammarAccess.getStringConcatenationAccess().getConcatLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcatenation__Group_1__0__Impl"


    // $ANTLR start "rule__StringConcatenation__Group_1__1"
    // InternalMGLang.g:2700:1: rule__StringConcatenation__Group_1__1 : rule__StringConcatenation__Group_1__1__Impl rule__StringConcatenation__Group_1__2 ;
    public final void rule__StringConcatenation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2704:1: ( rule__StringConcatenation__Group_1__1__Impl rule__StringConcatenation__Group_1__2 )
            // InternalMGLang.g:2705:2: rule__StringConcatenation__Group_1__1__Impl rule__StringConcatenation__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__StringConcatenation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcatenation__Group_1__2();

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
    // $ANTLR end "rule__StringConcatenation__Group_1__1"


    // $ANTLR start "rule__StringConcatenation__Group_1__1__Impl"
    // InternalMGLang.g:2712:1: rule__StringConcatenation__Group_1__1__Impl : ( '+' ) ;
    public final void rule__StringConcatenation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2716:1: ( ( '+' ) )
            // InternalMGLang.g:2717:1: ( '+' )
            {
            // InternalMGLang.g:2717:1: ( '+' )
            // InternalMGLang.g:2718:2: '+'
            {
             before(grammarAccess.getStringConcatenationAccess().getPlusSignKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStringConcatenationAccess().getPlusSignKeyword_1_1()); 

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
    // $ANTLR end "rule__StringConcatenation__Group_1__1__Impl"


    // $ANTLR start "rule__StringConcatenation__Group_1__2"
    // InternalMGLang.g:2727:1: rule__StringConcatenation__Group_1__2 : rule__StringConcatenation__Group_1__2__Impl ;
    public final void rule__StringConcatenation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2731:1: ( rule__StringConcatenation__Group_1__2__Impl )
            // InternalMGLang.g:2732:2: rule__StringConcatenation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringConcatenation__Group_1__2__Impl();

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
    // $ANTLR end "rule__StringConcatenation__Group_1__2"


    // $ANTLR start "rule__StringConcatenation__Group_1__2__Impl"
    // InternalMGLang.g:2738:1: rule__StringConcatenation__Group_1__2__Impl : ( ( rule__StringConcatenation__RightAssignment_1_2 ) ) ;
    public final void rule__StringConcatenation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2742:1: ( ( ( rule__StringConcatenation__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:2743:1: ( ( rule__StringConcatenation__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:2743:1: ( ( rule__StringConcatenation__RightAssignment_1_2 ) )
            // InternalMGLang.g:2744:2: ( rule__StringConcatenation__RightAssignment_1_2 )
            {
             before(grammarAccess.getStringConcatenationAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:2745:2: ( rule__StringConcatenation__RightAssignment_1_2 )
            // InternalMGLang.g:2745:3: rule__StringConcatenation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__StringConcatenation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getStringConcatenationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__StringConcatenation__Group_1__2__Impl"


    // $ANTLR start "rule__Generator__Group__0"
    // InternalMGLang.g:2754:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2758:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:2759:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMGLang.g:2766:1: rule__Generator__Group__0__Impl : ( () ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2770:1: ( ( () ) )
            // InternalMGLang.g:2771:1: ( () )
            {
            // InternalMGLang.g:2771:1: ( () )
            // InternalMGLang.g:2772:2: ()
            {
             before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            // InternalMGLang.g:2773:2: ()
            // InternalMGLang.g:2773:3: 
            {
            }

             after(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0__Impl"


    // $ANTLR start "rule__Generator__Group__1"
    // InternalMGLang.g:2781:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2785:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:2786:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
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
    // InternalMGLang.g:2793:1: rule__Generator__Group__1__Impl : ( 'gen' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2797:1: ( ( 'gen' ) )
            // InternalMGLang.g:2798:1: ( 'gen' )
            {
            // InternalMGLang.g:2798:1: ( 'gen' )
            // InternalMGLang.g:2799:2: 'gen'
            {
             before(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 

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
    // InternalMGLang.g:2808:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2812:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:2813:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:2820:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2824:1: ( ( '(' ) )
            // InternalMGLang.g:2825:1: ( '(' )
            {
            // InternalMGLang.g:2825:1: ( '(' )
            // InternalMGLang.g:2826:2: '('
            {
             before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMGLang.g:2835:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2839:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:2840:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
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
    // InternalMGLang.g:2847:1: rule__Generator__Group__3__Impl : ( ')' ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2851:1: ( ( ')' ) )
            // InternalMGLang.g:2852:1: ( ')' )
            {
            // InternalMGLang.g:2852:1: ( ')' )
            // InternalMGLang.g:2853:2: ')'
            {
             before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMGLang.g:2862:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2866:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:2867:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMGLang.g:2874:1: rule__Generator__Group__4__Impl : ( '{' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2878:1: ( ( '{' ) )
            // InternalMGLang.g:2879:1: ( '{' )
            {
            // InternalMGLang.g:2879:1: ( '{' )
            // InternalMGLang.g:2880:2: '{'
            {
             before(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMGLang.g:2889:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2893:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:2894:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalMGLang.g:2901:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__CommandsAssignment_5 )* ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2905:1: ( ( ( rule__Generator__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:2906:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:2906:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            // InternalMGLang.g:2907:2: ( rule__Generator__CommandsAssignment_5 )*
            {
             before(grammarAccess.getGeneratorAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:2908:2: ( rule__Generator__CommandsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMGLang.g:2908:3: rule__Generator__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Generator__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMGLang.g:2916:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2920:1: ( rule__Generator__Group__6__Impl )
            // InternalMGLang.g:2921:2: rule__Generator__Group__6__Impl
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
    // InternalMGLang.g:2927:1: rule__Generator__Group__6__Impl : ( '}' ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2931:1: ( ( '}' ) )
            // InternalMGLang.g:2932:1: ( '}' )
            {
            // InternalMGLang.g:2932:1: ( '}' )
            // InternalMGLang.g:2933:2: '}'
            {
             before(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__PatternObjectCreation__Group__0"
    // InternalMGLang.g:2943:1: rule__PatternObjectCreation__Group__0 : rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 ;
    public final void rule__PatternObjectCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2947:1: ( rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 )
            // InternalMGLang.g:2948:2: rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:2955:1: rule__PatternObjectCreation__Group__0__Impl : ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) ;
    public final void rule__PatternObjectCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2959:1: ( ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) )
            // InternalMGLang.g:2960:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            {
            // InternalMGLang.g:2960:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            // InternalMGLang.g:2961:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 
            // InternalMGLang.g:2962:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            // InternalMGLang.g:2962:3: rule__PatternObjectCreation__PObjectAssignment_0
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
    // InternalMGLang.g:2970:1: rule__PatternObjectCreation__Group__1 : rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 ;
    public final void rule__PatternObjectCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2974:1: ( rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 )
            // InternalMGLang.g:2975:2: rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMGLang.g:2982:1: rule__PatternObjectCreation__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternObjectCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2986:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2987:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2987:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:2988:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:2997:1: rule__PatternObjectCreation__Group__2 : rule__PatternObjectCreation__Group__2__Impl ;
    public final void rule__PatternObjectCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3001:1: ( rule__PatternObjectCreation__Group__2__Impl )
            // InternalMGLang.g:3002:2: rule__PatternObjectCreation__Group__2__Impl
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
    // InternalMGLang.g:3008:1: rule__PatternObjectCreation__Group__2__Impl : ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) ;
    public final void rule__PatternObjectCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3012:1: ( ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) )
            // InternalMGLang.g:3013:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            {
            // InternalMGLang.g:3013:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            // InternalMGLang.g:3014:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 
            // InternalMGLang.g:3015:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            // InternalMGLang.g:3015:3: rule__PatternObjectCreation__PatternCallAssignment_2
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
    // InternalMGLang.g:3024:1: rule__PatternObject__Group__0 : rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 ;
    public final void rule__PatternObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3028:1: ( rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 )
            // InternalMGLang.g:3029:2: rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1
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
    // InternalMGLang.g:3036:1: rule__PatternObject__Group__0__Impl : ( ( rule__PatternObject__TypeAssignment_0 ) ) ;
    public final void rule__PatternObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3040:1: ( ( ( rule__PatternObject__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3041:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3041:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            // InternalMGLang.g:3042:2: ( rule__PatternObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:3043:2: ( rule__PatternObject__TypeAssignment_0 )
            // InternalMGLang.g:3043:3: rule__PatternObject__TypeAssignment_0
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
    // InternalMGLang.g:3051:1: rule__PatternObject__Group__1 : rule__PatternObject__Group__1__Impl ;
    public final void rule__PatternObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3055:1: ( rule__PatternObject__Group__1__Impl )
            // InternalMGLang.g:3056:2: rule__PatternObject__Group__1__Impl
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
    // InternalMGLang.g:3062:1: rule__PatternObject__Group__1__Impl : ( ( rule__PatternObject__NameAssignment_1 ) ) ;
    public final void rule__PatternObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3066:1: ( ( ( rule__PatternObject__NameAssignment_1 ) ) )
            // InternalMGLang.g:3067:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3067:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            // InternalMGLang.g:3068:2: ( rule__PatternObject__NameAssignment_1 )
            {
             before(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 
            // InternalMGLang.g:3069:2: ( rule__PatternObject__NameAssignment_1 )
            // InternalMGLang.g:3069:3: rule__PatternObject__NameAssignment_1
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
    // InternalMGLang.g:3078:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3082:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalMGLang.g:3083:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
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
    // InternalMGLang.g:3090:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3094:1: ( ( 'for' ) )
            // InternalMGLang.g:3095:1: ( 'for' )
            {
            // InternalMGLang.g:3095:1: ( 'for' )
            // InternalMGLang.g:3096:2: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMGLang.g:3105:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3109:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalMGLang.g:3110:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
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
    // InternalMGLang.g:3117:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3121:1: ( ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) )
            // InternalMGLang.g:3122:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            {
            // InternalMGLang.g:3122:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            // InternalMGLang.g:3123:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            {
             before(grammarAccess.getForLoopAccess().getIteratorVarAssignment_1()); 
            // InternalMGLang.g:3124:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            // InternalMGLang.g:3124:3: rule__ForLoop__IteratorVarAssignment_1
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
    // InternalMGLang.g:3132:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3136:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalMGLang.g:3137:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
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
    // InternalMGLang.g:3144:1: rule__ForLoop__Group__2__Impl : ( 'in' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3148:1: ( ( 'in' ) )
            // InternalMGLang.g:3149:1: ( 'in' )
            {
            // InternalMGLang.g:3149:1: ( 'in' )
            // InternalMGLang.g:3150:2: 'in'
            {
             before(grammarAccess.getForLoopAccess().getInKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMGLang.g:3159:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3163:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalMGLang.g:3164:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
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
    // InternalMGLang.g:3171:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3175:1: ( ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) )
            // InternalMGLang.g:3176:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            {
            // InternalMGLang.g:3176:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            // InternalMGLang.g:3177:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getIteratingConditionAssignment_3()); 
            // InternalMGLang.g:3178:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            // InternalMGLang.g:3178:3: rule__ForLoop__IteratingConditionAssignment_3
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
    // InternalMGLang.g:3186:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3190:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalMGLang.g:3191:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalMGLang.g:3198:1: rule__ForLoop__Group__4__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3202:1: ( ( '{' ) )
            // InternalMGLang.g:3203:1: ( '{' )
            {
            // InternalMGLang.g:3203:1: ( '{' )
            // InternalMGLang.g:3204:2: '{'
            {
             before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMGLang.g:3213:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3217:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalMGLang.g:3218:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalMGLang.g:3225:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CommandsAssignment_5 )* ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3229:1: ( ( ( rule__ForLoop__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:3230:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:3230:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            // InternalMGLang.g:3231:2: ( rule__ForLoop__CommandsAssignment_5 )*
            {
             before(grammarAccess.getForLoopAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:3232:2: ( rule__ForLoop__CommandsAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGLang.g:3232:3: rule__ForLoop__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__ForLoop__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMGLang.g:3240:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3244:1: ( rule__ForLoop__Group__6__Impl )
            // InternalMGLang.g:3245:2: rule__ForLoop__Group__6__Impl
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
    // InternalMGLang.g:3251:1: rule__ForLoop__Group__6__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3255:1: ( ( '}' ) )
            // InternalMGLang.g:3256:1: ( '}' )
            {
            // InternalMGLang.g:3256:1: ( '}' )
            // InternalMGLang.g:3257:2: '}'
            {
             before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMGLang.g:3267:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3271:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:3272:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMGLang.g:3279:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3283:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:3284:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:3284:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:3285:2: ( rule__ForRange__StartAssignment_0 )
            {
             before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            // InternalMGLang.g:3286:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:3286:3: rule__ForRange__StartAssignment_0
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
    // InternalMGLang.g:3294:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3298:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:3299:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMGLang.g:3306:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3310:1: ( ( ':' ) )
            // InternalMGLang.g:3311:1: ( ':' )
            {
            // InternalMGLang.g:3311:1: ( ':' )
            // InternalMGLang.g:3312:2: ':'
            {
             before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMGLang.g:3321:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3325:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:3326:2: rule__ForRange__Group__2__Impl
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
    // InternalMGLang.g:3332:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3336:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:3337:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:3337:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:3338:2: ( rule__ForRange__EndAssignment_2 )
            {
             before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            // InternalMGLang.g:3339:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:3339:3: rule__ForRange__EndAssignment_2
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
    // InternalMGLang.g:3348:1: rule__LiteralExpression__Group_0__0 : rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 ;
    public final void rule__LiteralExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3352:1: ( rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 )
            // InternalMGLang.g:3353:2: rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMGLang.g:3360:1: rule__LiteralExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3364:1: ( ( () ) )
            // InternalMGLang.g:3365:1: ( () )
            {
            // InternalMGLang.g:3365:1: ( () )
            // InternalMGLang.g:3366:2: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalMGLang.g:3367:2: ()
            // InternalMGLang.g:3367:3: 
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
    // InternalMGLang.g:3375:1: rule__LiteralExpression__Group_0__1 : rule__LiteralExpression__Group_0__1__Impl ;
    public final void rule__LiteralExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3379:1: ( rule__LiteralExpression__Group_0__1__Impl )
            // InternalMGLang.g:3380:2: rule__LiteralExpression__Group_0__1__Impl
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
    // InternalMGLang.g:3386:1: rule__LiteralExpression__Group_0__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__LiteralExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3390:1: ( ( ( rule__LiteralExpression__ValueAssignment_0_1 ) ) )
            // InternalMGLang.g:3391:1: ( ( rule__LiteralExpression__ValueAssignment_0_1 ) )
            {
            // InternalMGLang.g:3391:1: ( ( rule__LiteralExpression__ValueAssignment_0_1 ) )
            // InternalMGLang.g:3392:2: ( rule__LiteralExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_0_1()); 
            // InternalMGLang.g:3393:2: ( rule__LiteralExpression__ValueAssignment_0_1 )
            // InternalMGLang.g:3393:3: rule__LiteralExpression__ValueAssignment_0_1
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
    // InternalMGLang.g:3402:1: rule__LiteralExpression__Group_1__0 : rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 ;
    public final void rule__LiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3406:1: ( rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 )
            // InternalMGLang.g:3407:2: rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMGLang.g:3414:1: rule__LiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3418:1: ( ( () ) )
            // InternalMGLang.g:3419:1: ( () )
            {
            // InternalMGLang.g:3419:1: ( () )
            // InternalMGLang.g:3420:2: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalMGLang.g:3421:2: ()
            // InternalMGLang.g:3421:3: 
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
    // InternalMGLang.g:3429:1: rule__LiteralExpression__Group_1__1 : rule__LiteralExpression__Group_1__1__Impl rule__LiteralExpression__Group_1__2 ;
    public final void rule__LiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3433:1: ( rule__LiteralExpression__Group_1__1__Impl rule__LiteralExpression__Group_1__2 )
            // InternalMGLang.g:3434:2: rule__LiteralExpression__Group_1__1__Impl rule__LiteralExpression__Group_1__2
            {
            pushFollow(FOLLOW_40);
            rule__LiteralExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_1__2();

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
    // InternalMGLang.g:3441:1: rule__LiteralExpression__Group_1__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1_1 )? ) ;
    public final void rule__LiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3445:1: ( ( ( rule__LiteralExpression__ValueAssignment_1_1 )? ) )
            // InternalMGLang.g:3446:1: ( ( rule__LiteralExpression__ValueAssignment_1_1 )? )
            {
            // InternalMGLang.g:3446:1: ( ( rule__LiteralExpression__ValueAssignment_1_1 )? )
            // InternalMGLang.g:3447:2: ( rule__LiteralExpression__ValueAssignment_1_1 )?
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1()); 
            // InternalMGLang.g:3448:2: ( rule__LiteralExpression__ValueAssignment_1_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMGLang.g:3448:3: rule__LiteralExpression__ValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralExpression__ValueAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1()); 

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


    // $ANTLR start "rule__LiteralExpression__Group_1__2"
    // InternalMGLang.g:3456:1: rule__LiteralExpression__Group_1__2 : rule__LiteralExpression__Group_1__2__Impl rule__LiteralExpression__Group_1__3 ;
    public final void rule__LiteralExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3460:1: ( rule__LiteralExpression__Group_1__2__Impl rule__LiteralExpression__Group_1__3 )
            // InternalMGLang.g:3461:2: rule__LiteralExpression__Group_1__2__Impl rule__LiteralExpression__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__LiteralExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_1__3();

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
    // $ANTLR end "rule__LiteralExpression__Group_1__2"


    // $ANTLR start "rule__LiteralExpression__Group_1__2__Impl"
    // InternalMGLang.g:3468:1: rule__LiteralExpression__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__LiteralExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3472:1: ( ( RULE_INT ) )
            // InternalMGLang.g:3473:1: ( RULE_INT )
            {
            // InternalMGLang.g:3473:1: ( RULE_INT )
            // InternalMGLang.g:3474:2: RULE_INT
            {
             before(grammarAccess.getLiteralExpressionAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLiteralExpressionAccess().getINTTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__LiteralExpression__Group_1__2__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_1__3"
    // InternalMGLang.g:3483:1: rule__LiteralExpression__Group_1__3 : rule__LiteralExpression__Group_1__3__Impl ;
    public final void rule__LiteralExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3487:1: ( rule__LiteralExpression__Group_1__3__Impl )
            // InternalMGLang.g:3488:2: rule__LiteralExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_1__3__Impl();

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
    // $ANTLR end "rule__LiteralExpression__Group_1__3"


    // $ANTLR start "rule__LiteralExpression__Group_1__3__Impl"
    // InternalMGLang.g:3494:1: rule__LiteralExpression__Group_1__3__Impl : ( ( rule__LiteralExpression__Group_1_3__0 )? ) ;
    public final void rule__LiteralExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3498:1: ( ( ( rule__LiteralExpression__Group_1_3__0 )? ) )
            // InternalMGLang.g:3499:1: ( ( rule__LiteralExpression__Group_1_3__0 )? )
            {
            // InternalMGLang.g:3499:1: ( ( rule__LiteralExpression__Group_1_3__0 )? )
            // InternalMGLang.g:3500:2: ( rule__LiteralExpression__Group_1_3__0 )?
            {
             before(grammarAccess.getLiteralExpressionAccess().getGroup_1_3()); 
            // InternalMGLang.g:3501:2: ( rule__LiteralExpression__Group_1_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMGLang.g:3501:3: rule__LiteralExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralExpression__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralExpressionAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__LiteralExpression__Group_1__3__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_1_3__0"
    // InternalMGLang.g:3510:1: rule__LiteralExpression__Group_1_3__0 : rule__LiteralExpression__Group_1_3__0__Impl rule__LiteralExpression__Group_1_3__1 ;
    public final void rule__LiteralExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3514:1: ( rule__LiteralExpression__Group_1_3__0__Impl rule__LiteralExpression__Group_1_3__1 )
            // InternalMGLang.g:3515:2: rule__LiteralExpression__Group_1_3__0__Impl rule__LiteralExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_38);
            rule__LiteralExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_1_3__1();

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
    // $ANTLR end "rule__LiteralExpression__Group_1_3__0"


    // $ANTLR start "rule__LiteralExpression__Group_1_3__0__Impl"
    // InternalMGLang.g:3522:1: rule__LiteralExpression__Group_1_3__0__Impl : ( '.' ) ;
    public final void rule__LiteralExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3526:1: ( ( '.' ) )
            // InternalMGLang.g:3527:1: ( '.' )
            {
            // InternalMGLang.g:3527:1: ( '.' )
            // InternalMGLang.g:3528:2: '.'
            {
             before(grammarAccess.getLiteralExpressionAccess().getFullStopKeyword_1_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLiteralExpressionAccess().getFullStopKeyword_1_3_0()); 

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
    // $ANTLR end "rule__LiteralExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_1_3__1"
    // InternalMGLang.g:3537:1: rule__LiteralExpression__Group_1_3__1 : rule__LiteralExpression__Group_1_3__1__Impl ;
    public final void rule__LiteralExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3541:1: ( rule__LiteralExpression__Group_1_3__1__Impl )
            // InternalMGLang.g:3542:2: rule__LiteralExpression__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__LiteralExpression__Group_1_3__1"


    // $ANTLR start "rule__LiteralExpression__Group_1_3__1__Impl"
    // InternalMGLang.g:3548:1: rule__LiteralExpression__Group_1_3__1__Impl : ( RULE_INT ) ;
    public final void rule__LiteralExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3552:1: ( ( RULE_INT ) )
            // InternalMGLang.g:3553:1: ( RULE_INT )
            {
            // InternalMGLang.g:3553:1: ( RULE_INT )
            // InternalMGLang.g:3554:2: RULE_INT
            {
             before(grammarAccess.getLiteralExpressionAccess().getINTTerminalRuleCall_1_3_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLiteralExpressionAccess().getINTTerminalRuleCall_1_3_1()); 

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
    // $ANTLR end "rule__LiteralExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_2__0"
    // InternalMGLang.g:3564:1: rule__LiteralExpression__Group_2__0 : rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1 ;
    public final void rule__LiteralExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3568:1: ( rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1 )
            // InternalMGLang.g:3569:2: rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMGLang.g:3576:1: rule__LiteralExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3580:1: ( ( () ) )
            // InternalMGLang.g:3581:1: ( () )
            {
            // InternalMGLang.g:3581:1: ( () )
            // InternalMGLang.g:3582:2: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getStringLiteralAction_2_0()); 
            // InternalMGLang.g:3583:2: ()
            // InternalMGLang.g:3583:3: 
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
    // InternalMGLang.g:3591:1: rule__LiteralExpression__Group_2__1 : rule__LiteralExpression__Group_2__1__Impl ;
    public final void rule__LiteralExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3595:1: ( rule__LiteralExpression__Group_2__1__Impl )
            // InternalMGLang.g:3596:2: rule__LiteralExpression__Group_2__1__Impl
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
    // InternalMGLang.g:3602:1: rule__LiteralExpression__Group_2__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__LiteralExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3606:1: ( ( ( rule__LiteralExpression__ValueAssignment_2_1 ) ) )
            // InternalMGLang.g:3607:1: ( ( rule__LiteralExpression__ValueAssignment_2_1 ) )
            {
            // InternalMGLang.g:3607:1: ( ( rule__LiteralExpression__ValueAssignment_2_1 ) )
            // InternalMGLang.g:3608:2: ( rule__LiteralExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_2_1()); 
            // InternalMGLang.g:3609:2: ( rule__LiteralExpression__ValueAssignment_2_1 )
            // InternalMGLang.g:3609:3: rule__LiteralExpression__ValueAssignment_2_1
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


    // $ANTLR start "rule__MofgenFile__ImportsAssignment_0"
    // InternalMGLang.g:3618:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3622:1: ( ( ruleImport ) )
            // InternalMGLang.g:3623:2: ( ruleImport )
            {
            // InternalMGLang.g:3623:2: ( ruleImport )
            // InternalMGLang.g:3624:3: ruleImport
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
    // InternalMGLang.g:3633:1: rule__MofgenFile__PatternsAssignment_1_0 : ( rulePattern ) ;
    public final void rule__MofgenFile__PatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3637:1: ( ( rulePattern ) )
            // InternalMGLang.g:3638:2: ( rulePattern )
            {
            // InternalMGLang.g:3638:2: ( rulePattern )
            // InternalMGLang.g:3639:3: rulePattern
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
    // InternalMGLang.g:3648:1: rule__MofgenFile__GeneratorsAssignment_1_1 : ( ruleGenerator ) ;
    public final void rule__MofgenFile__GeneratorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3652:1: ( ( ruleGenerator ) )
            // InternalMGLang.g:3653:2: ( ruleGenerator )
            {
            // InternalMGLang.g:3653:2: ( ruleGenerator )
            // InternalMGLang.g:3654:3: ruleGenerator
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
    // InternalMGLang.g:3663:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3667:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:3668:2: ( RULE_STRING )
            {
            // InternalMGLang.g:3668:2: ( RULE_STRING )
            // InternalMGLang.g:3669:3: RULE_STRING
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
    // InternalMGLang.g:3678:1: rule__Import__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3682:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3683:2: ( RULE_ID )
            {
            // InternalMGLang.g:3683:2: ( RULE_ID )
            // InternalMGLang.g:3684:3: RULE_ID
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
    // InternalMGLang.g:3693:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3697:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3698:2: ( RULE_ID )
            {
            // InternalMGLang.g:3698:2: ( RULE_ID )
            // InternalMGLang.g:3699:3: RULE_ID
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
    // InternalMGLang.g:3708:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3712:1: ( ( ruleParameter ) )
            // InternalMGLang.g:3713:2: ( ruleParameter )
            {
            // InternalMGLang.g:3713:2: ( ruleParameter )
            // InternalMGLang.g:3714:3: ruleParameter
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
    // InternalMGLang.g:3723:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3727:1: ( ( ruleParameter ) )
            // InternalMGLang.g:3728:2: ( ruleParameter )
            {
            // InternalMGLang.g:3728:2: ( ruleParameter )
            // InternalMGLang.g:3729:3: ruleParameter
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


    // $ANTLR start "rule__Pattern__NodesAssignment_4"
    // InternalMGLang.g:3738:1: rule__Pattern__NodesAssignment_4 : ( ruleNode ) ;
    public final void rule__Pattern__NodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3742:1: ( ( ruleNode ) )
            // InternalMGLang.g:3743:2: ( ruleNode )
            {
            // InternalMGLang.g:3743:2: ( ruleNode )
            // InternalMGLang.g:3744:3: ruleNode
            {
             before(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Pattern__NodesAssignment_4"


    // $ANTLR start "rule__Pattern__ReturnAssignment_6"
    // InternalMGLang.g:3753:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3757:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:3758:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:3758:2: ( rulePatternReturn )
            // InternalMGLang.g:3759:3: rulePatternReturn
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


    // $ANTLR start "rule__PatternReturn__ReturnValueAssignment_3_1"
    // InternalMGLang.g:3768:1: rule__PatternReturn__ReturnValueAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternReturn__ReturnValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3772:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3773:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3773:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3774:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            // InternalMGLang.g:3775:3: ( RULE_ID )
            // InternalMGLang.g:3776:4: RULE_ID
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueNodeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getReturnValueNodeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__PatternReturn__ReturnValueAssignment_3_1"


    // $ANTLR start "rule__Node__TypeAssignment_0"
    // InternalMGLang.g:3787:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3791:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3792:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3792:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3793:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            // InternalMGLang.g:3794:3: ( RULE_ID )
            // InternalMGLang.g:3795:4: RULE_ID
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
    // InternalMGLang.g:3806:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3810:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3811:2: ( RULE_ID )
            {
            // InternalMGLang.g:3811:2: ( RULE_ID )
            // InternalMGLang.g:3812:3: RULE_ID
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


    // $ANTLR start "rule__Node__CreatedByAssignment_2"
    // InternalMGLang.g:3821:1: rule__Node__CreatedByAssignment_2 : ( ( rule__Node__CreatedByAlternatives_2_0 ) ) ;
    public final void rule__Node__CreatedByAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3825:1: ( ( ( rule__Node__CreatedByAlternatives_2_0 ) ) )
            // InternalMGLang.g:3826:2: ( ( rule__Node__CreatedByAlternatives_2_0 ) )
            {
            // InternalMGLang.g:3826:2: ( ( rule__Node__CreatedByAlternatives_2_0 ) )
            // InternalMGLang.g:3827:3: ( rule__Node__CreatedByAlternatives_2_0 )
            {
             before(grammarAccess.getNodeAccess().getCreatedByAlternatives_2_0()); 
            // InternalMGLang.g:3828:3: ( rule__Node__CreatedByAlternatives_2_0 )
            // InternalMGLang.g:3828:4: rule__Node__CreatedByAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__CreatedByAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getCreatedByAlternatives_2_0()); 

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
    // $ANTLR end "rule__Node__CreatedByAssignment_2"


    // $ANTLR start "rule__NodeConstructor__RefsAssignsAssignment_2"
    // InternalMGLang.g:3836:1: rule__NodeConstructor__RefsAssignsAssignment_2 : ( ruleNodeReferenceOrAssignment ) ;
    public final void rule__NodeConstructor__RefsAssignsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3840:1: ( ( ruleNodeReferenceOrAssignment ) )
            // InternalMGLang.g:3841:2: ( ruleNodeReferenceOrAssignment )
            {
            // InternalMGLang.g:3841:2: ( ruleNodeReferenceOrAssignment )
            // InternalMGLang.g:3842:3: ruleNodeReferenceOrAssignment
            {
             before(grammarAccess.getNodeConstructorAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeReferenceOrAssignment();

            state._fsp--;

             after(grammarAccess.getNodeConstructorAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NodeConstructor__RefsAssignsAssignment_2"


    // $ANTLR start "rule__PatternCall__CalledAssignment_0"
    // InternalMGLang.g:3851:1: rule__PatternCall__CalledAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3855:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3856:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3856:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3857:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            // InternalMGLang.g:3858:3: ( RULE_ID )
            // InternalMGLang.g:3859:4: RULE_ID
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getCalledPatternIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 

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
    // $ANTLR end "rule__PatternCall__CalledAssignment_0"


    // $ANTLR start "rule__PatternCall__ParamsAssignment_2"
    // InternalMGLang.g:3870:1: rule__PatternCall__ParamsAssignment_2 : ( ruleLiteralExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3874:1: ( ( ruleLiteralExpression ) )
            // InternalMGLang.g:3875:2: ( ruleLiteralExpression )
            {
            // InternalMGLang.g:3875:2: ( ruleLiteralExpression )
            // InternalMGLang.g:3876:3: ruleLiteralExpression
            {
             before(grammarAccess.getPatternCallAccess().getParamsLiteralExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getPatternCallAccess().getParamsLiteralExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PatternCall__ParamsAssignment_2"


    // $ANTLR start "rule__NodeReferenceOrAssignment__ConditionAssignment_1_1"
    // InternalMGLang.g:3885:1: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__NodeReferenceOrAssignment__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3889:1: ( ( ruleCondition ) )
            // InternalMGLang.g:3890:2: ( ruleCondition )
            {
            // InternalMGLang.g:3890:2: ( ruleCondition )
            // InternalMGLang.g:3891:3: ruleCondition
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
    // InternalMGLang.g:3900:1: rule__Condition__LhsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3904:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3905:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3905:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3906:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getLhsParameterCrossReference_0_0()); 
            // InternalMGLang.g:3907:3: ( RULE_ID )
            // InternalMGLang.g:3908:4: RULE_ID
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
    // InternalMGLang.g:3919:1: rule__Condition__RelationAssignment_1_0 : ( ruleEditorRelation ) ;
    public final void rule__Condition__RelationAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3923:1: ( ( ruleEditorRelation ) )
            // InternalMGLang.g:3924:2: ( ruleEditorRelation )
            {
            // InternalMGLang.g:3924:2: ( ruleEditorRelation )
            // InternalMGLang.g:3925:3: ruleEditorRelation
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
    // InternalMGLang.g:3934:1: rule__Condition__RhsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3938:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3939:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3939:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3940:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getRhsParameterCrossReference_1_1_0()); 
            // InternalMGLang.g:3941:3: ( RULE_ID )
            // InternalMGLang.g:3942:4: RULE_ID
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


    // $ANTLR start "rule__PatternNodeReference__TypeAssignment_0"
    // InternalMGLang.g:3953:1: rule__PatternNodeReference__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3957:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3958:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3958:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3959:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            // InternalMGLang.g:3960:3: ( RULE_ID )
            // InternalMGLang.g:3961:4: RULE_ID
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 

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
    // $ANTLR end "rule__PatternNodeReference__TypeAssignment_0"


    // $ANTLR start "rule__PatternNodeReference__TargetAssignment_2"
    // InternalMGLang.g:3972:1: rule__PatternNodeReference__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3976:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3977:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3977:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3978:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            // InternalMGLang.g:3979:3: ( RULE_ID )
            // InternalMGLang.g:3980:4: RULE_ID
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 

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
    // $ANTLR end "rule__PatternNodeReference__TargetAssignment_2"


    // $ANTLR start "rule__Assignment__TargetAssignment_0"
    // InternalMGLang.g:3991:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3995:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3996:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3996:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3997:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 
            // InternalMGLang.g:3998:3: ( RULE_ID )
            // InternalMGLang.g:3999:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getTargetEAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getTargetEAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 

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
    // InternalMGLang.g:4010:1: rule__Assignment__ValueAssignment_2 : ( ruleLiteralExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4014:1: ( ( ruleLiteralExpression ) )
            // InternalMGLang.g:4015:2: ( ruleLiteralExpression )
            {
            // InternalMGLang.g:4015:2: ( ruleLiteralExpression )
            // InternalMGLang.g:4016:3: ruleLiteralExpression
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


    // $ANTLR start "rule__NodeAttributeCall__NodeAssignment_0"
    // InternalMGLang.g:4025:1: rule__NodeAttributeCall__NodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4029:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4030:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4030:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4031:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getNodeNodeCrossReference_0_0()); 
            // InternalMGLang.g:4032:3: ( RULE_ID )
            // InternalMGLang.g:4033:4: RULE_ID
            {
             before(grammarAccess.getNodeAttributeCallAccess().getNodeNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAttributeCallAccess().getNodeNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeAttributeCallAccess().getNodeNodeCrossReference_0_0()); 

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
    // $ANTLR end "rule__NodeAttributeCall__NodeAssignment_0"


    // $ANTLR start "rule__NodeAttributeCall__AttributeAssignment_2"
    // InternalMGLang.g:4044:1: rule__NodeAttributeCall__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4048:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4049:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4049:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4050:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeCrossReference_2_0()); 
            // InternalMGLang.g:4051:3: ( RULE_ID )
            // InternalMGLang.g:4052:4: RULE_ID
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


    // $ANTLR start "rule__PrimitiveParameter__TypeAssignment_0"
    // InternalMGLang.g:4063:1: rule__PrimitiveParameter__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4067:1: ( ( rulePrimitiveType ) )
            // InternalMGLang.g:4068:2: ( rulePrimitiveType )
            {
            // InternalMGLang.g:4068:2: ( rulePrimitiveType )
            // InternalMGLang.g:4069:3: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__PrimitiveParameter__TypeAssignment_0"


    // $ANTLR start "rule__PrimitiveParameter__NameAssignment_1"
    // InternalMGLang.g:4078:1: rule__PrimitiveParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4082:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4083:2: ( RULE_ID )
            {
            // InternalMGLang.g:4083:2: ( RULE_ID )
            // InternalMGLang.g:4084:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrimitiveParameter__NameAssignment_1"


    // $ANTLR start "rule__ObjectParameter__TypeAssignment_0"
    // InternalMGLang.g:4093:1: rule__ObjectParameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4097:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4098:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4098:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4099:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectParameterAccess().getTypeEClassifierCrossReference_0_0()); 
            // InternalMGLang.g:4100:3: ( RULE_ID )
            // InternalMGLang.g:4101:4: RULE_ID
            {
             before(grammarAccess.getObjectParameterAccess().getTypeEClassifierIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectParameterAccess().getTypeEClassifierIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectParameterAccess().getTypeEClassifierCrossReference_0_0()); 

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
    // $ANTLR end "rule__ObjectParameter__TypeAssignment_0"


    // $ANTLR start "rule__ObjectParameter__NameAssignment_1"
    // InternalMGLang.g:4112:1: rule__ObjectParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4116:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4117:2: ( RULE_ID )
            {
            // InternalMGLang.g:4117:2: ( RULE_ID )
            // InternalMGLang.g:4118:3: RULE_ID
            {
             before(grammarAccess.getObjectParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectParameter__NameAssignment_1"


    // $ANTLR start "rule__StringConcatenation__RightAssignment_1_2"
    // InternalMGLang.g:4127:1: rule__StringConcatenation__RightAssignment_1_2 : ( ruleStringConcatenation ) ;
    public final void rule__StringConcatenation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4131:1: ( ( ruleStringConcatenation ) )
            // InternalMGLang.g:4132:2: ( ruleStringConcatenation )
            {
            // InternalMGLang.g:4132:2: ( ruleStringConcatenation )
            // InternalMGLang.g:4133:3: ruleStringConcatenation
            {
             before(grammarAccess.getStringConcatenationAccess().getRightStringConcatenationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringConcatenation();

            state._fsp--;

             after(grammarAccess.getStringConcatenationAccess().getRightStringConcatenationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__StringConcatenation__RightAssignment_1_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalMGLang.g:4142:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4146:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:4147:2: ( RULE_STRING )
            {
            // InternalMGLang.g:4147:2: ( RULE_STRING )
            // InternalMGLang.g:4148:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__Generator__CommandsAssignment_5"
    // InternalMGLang.g:4157:1: rule__Generator__CommandsAssignment_5 : ( ruleGeneratorElement ) ;
    public final void rule__Generator__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4161:1: ( ( ruleGeneratorElement ) )
            // InternalMGLang.g:4162:2: ( ruleGeneratorElement )
            {
            // InternalMGLang.g:4162:2: ( ruleGeneratorElement )
            // InternalMGLang.g:4163:3: ruleGeneratorElement
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


    // $ANTLR start "rule__PatternObjectCreation__PObjectAssignment_0"
    // InternalMGLang.g:4172:1: rule__PatternObjectCreation__PObjectAssignment_0 : ( rulePatternObject ) ;
    public final void rule__PatternObjectCreation__PObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4176:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:4177:2: ( rulePatternObject )
            {
            // InternalMGLang.g:4177:2: ( rulePatternObject )
            // InternalMGLang.g:4178:3: rulePatternObject
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
    // InternalMGLang.g:4187:1: rule__PatternObjectCreation__PatternCallAssignment_2 : ( rulePatternCall ) ;
    public final void rule__PatternObjectCreation__PatternCallAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4191:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:4192:2: ( rulePatternCall )
            {
            // InternalMGLang.g:4192:2: ( rulePatternCall )
            // InternalMGLang.g:4193:3: rulePatternCall
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
    // InternalMGLang.g:4202:1: rule__PatternObject__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4206:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4207:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4207:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4208:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 
            // InternalMGLang.g:4209:3: ( RULE_ID )
            // InternalMGLang.g:4210:4: RULE_ID
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
    // InternalMGLang.g:4221:1: rule__PatternObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4225:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4226:2: ( RULE_ID )
            {
            // InternalMGLang.g:4226:2: ( RULE_ID )
            // InternalMGLang.g:4227:3: RULE_ID
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
    // InternalMGLang.g:4236:1: rule__ForLoop__IteratorVarAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForLoop__IteratorVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4240:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4241:2: ( RULE_ID )
            {
            // InternalMGLang.g:4241:2: ( RULE_ID )
            // InternalMGLang.g:4242:3: RULE_ID
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
    // InternalMGLang.g:4251:1: rule__ForLoop__IteratingConditionAssignment_3 : ( ruleForCondition ) ;
    public final void rule__ForLoop__IteratingConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4255:1: ( ( ruleForCondition ) )
            // InternalMGLang.g:4256:2: ( ruleForCondition )
            {
            // InternalMGLang.g:4256:2: ( ruleForCondition )
            // InternalMGLang.g:4257:3: ruleForCondition
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
    // InternalMGLang.g:4266:1: rule__ForLoop__CommandsAssignment_5 : ( ruleGeneratorCommand ) ;
    public final void rule__ForLoop__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4270:1: ( ( ruleGeneratorCommand ) )
            // InternalMGLang.g:4271:2: ( ruleGeneratorCommand )
            {
            // InternalMGLang.g:4271:2: ( ruleGeneratorCommand )
            // InternalMGLang.g:4272:3: ruleGeneratorCommand
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
    // InternalMGLang.g:4281:1: rule__ForEachCollection__CollAssignment : ( ruleNodeAttributeCall ) ;
    public final void rule__ForEachCollection__CollAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4285:1: ( ( ruleNodeAttributeCall ) )
            // InternalMGLang.g:4286:2: ( ruleNodeAttributeCall )
            {
            // InternalMGLang.g:4286:2: ( ruleNodeAttributeCall )
            // InternalMGLang.g:4287:3: ruleNodeAttributeCall
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
    // InternalMGLang.g:4296:1: rule__ForRange__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4300:1: ( ( RULE_INT ) )
            // InternalMGLang.g:4301:2: ( RULE_INT )
            {
            // InternalMGLang.g:4301:2: ( RULE_INT )
            // InternalMGLang.g:4302:3: RULE_INT
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
    // InternalMGLang.g:4311:1: rule__ForRange__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4315:1: ( ( RULE_INT ) )
            // InternalMGLang.g:4316:2: ( RULE_INT )
            {
            // InternalMGLang.g:4316:2: ( RULE_INT )
            // InternalMGLang.g:4317:3: RULE_INT
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
    // InternalMGLang.g:4326:1: rule__LiteralExpression__ValueAssignment_0_1 : ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__LiteralExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4330:1: ( ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) ) )
            // InternalMGLang.g:4331:2: ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) )
            {
            // InternalMGLang.g:4331:2: ( ( rule__LiteralExpression__ValueAlternatives_0_1_0 ) )
            // InternalMGLang.g:4332:3: ( rule__LiteralExpression__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAlternatives_0_1_0()); 
            // InternalMGLang.g:4333:3: ( rule__LiteralExpression__ValueAlternatives_0_1_0 )
            // InternalMGLang.g:4333:4: rule__LiteralExpression__ValueAlternatives_0_1_0
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


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_1_1"
    // InternalMGLang.g:4341:1: rule__LiteralExpression__ValueAssignment_1_1 : ( ( '-' ) ) ;
    public final void rule__LiteralExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4345:1: ( ( ( '-' ) ) )
            // InternalMGLang.g:4346:2: ( ( '-' ) )
            {
            // InternalMGLang.g:4346:2: ( ( '-' ) )
            // InternalMGLang.g:4347:3: ( '-' )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueHyphenMinusKeyword_1_1_0()); 
            // InternalMGLang.g:4348:3: ( '-' )
            // InternalMGLang.g:4349:4: '-'
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueHyphenMinusKeyword_1_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLiteralExpressionAccess().getValueHyphenMinusKeyword_1_1_0()); 

            }

             after(grammarAccess.getLiteralExpressionAccess().getValueHyphenMinusKeyword_1_1_0()); 

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
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_2_1"
    // InternalMGLang.g:4360:1: rule__LiteralExpression__ValueAssignment_2_1 : ( ruleStringConcatenation ) ;
    public final void rule__LiteralExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4364:1: ( ( ruleStringConcatenation ) )
            // InternalMGLang.g:4365:2: ( ruleStringConcatenation )
            {
            // InternalMGLang.g:4365:2: ( ruleStringConcatenation )
            // InternalMGLang.g:4366:3: ruleStringConcatenation
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueStringConcatenationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringConcatenation();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getValueStringConcatenationParserRuleCall_2_1_0()); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000002001C080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000001C080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040020003060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000003062L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000003060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000800C000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008004000082L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000C000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000082L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000020L});

}