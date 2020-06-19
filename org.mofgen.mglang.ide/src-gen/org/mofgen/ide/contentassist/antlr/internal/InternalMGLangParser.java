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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATTERN_ASSIGNMENT_OP", "RULE_ASSIGNMENT_OP", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'import'", "'as'", "'pattern'", "'{'", "'}'", "'('", "')'", "','", "'return'", "'['", "']'", "'-'", "'->'", "'.'", "':'", "'generator'", "'for'", "'in'", "'this'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_ASSIGNMENT_OP=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_PATTERN_ASSIGNMENT_OP=4;
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


    // $ANTLR start "ruleEditorRelation"
    // InternalMGLang.g:628:1: ruleEditorRelation : ( ( rule__EditorRelation__Alternatives ) ) ;
    public final void ruleEditorRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:632:1: ( ( ( rule__EditorRelation__Alternatives ) ) )
            // InternalMGLang.g:633:2: ( ( rule__EditorRelation__Alternatives ) )
            {
            // InternalMGLang.g:633:2: ( ( rule__EditorRelation__Alternatives ) )
            // InternalMGLang.g:634:3: ( rule__EditorRelation__Alternatives )
            {
             before(grammarAccess.getEditorRelationAccess().getAlternatives()); 
            // InternalMGLang.g:635:3: ( rule__EditorRelation__Alternatives )
            // InternalMGLang.g:635:4: rule__EditorRelation__Alternatives
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
    // InternalMGLang.g:643:1: rule__MofgenFile__Alternatives_1 : ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) );
    public final void rule__MofgenFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:647:1: ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==34) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGLang.g:648:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    {
                    // InternalMGLang.g:648:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    // InternalMGLang.g:649:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 
                    // InternalMGLang.g:650:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    // InternalMGLang.g:650:4: rule__MofgenFile__PatternsAssignment_1_0
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
                    // InternalMGLang.g:654:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    {
                    // InternalMGLang.g:654:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    // InternalMGLang.g:655:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 
                    // InternalMGLang.g:656:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    // InternalMGLang.g:656:4: rule__MofgenFile__GeneratorsAssignment_1_1
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
    // InternalMGLang.g:664:1: rule__Pattern__Alternatives_4 : ( ( ( rule__Pattern__NodesAssignment_4_0 ) ) | ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) ) );
    public final void rule__Pattern__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:668:1: ( ( ( rule__Pattern__NodesAssignment_4_0 ) ) | ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==30||LA2_1==32) ) {
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
                    // InternalMGLang.g:669:2: ( ( rule__Pattern__NodesAssignment_4_0 ) )
                    {
                    // InternalMGLang.g:669:2: ( ( rule__Pattern__NodesAssignment_4_0 ) )
                    // InternalMGLang.g:670:3: ( rule__Pattern__NodesAssignment_4_0 )
                    {
                     before(grammarAccess.getPatternAccess().getNodesAssignment_4_0()); 
                    // InternalMGLang.g:671:3: ( rule__Pattern__NodesAssignment_4_0 )
                    // InternalMGLang.g:671:4: rule__Pattern__NodesAssignment_4_0
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
                    // InternalMGLang.g:675:2: ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) )
                    {
                    // InternalMGLang.g:675:2: ( ( rule__Pattern__RefsAssignsAssignment_4_1 ) )
                    // InternalMGLang.g:676:3: ( rule__Pattern__RefsAssignsAssignment_4_1 )
                    {
                     before(grammarAccess.getPatternAccess().getRefsAssignsAssignment_4_1()); 
                    // InternalMGLang.g:677:3: ( rule__Pattern__RefsAssignsAssignment_4_1 )
                    // InternalMGLang.g:677:4: rule__Pattern__RefsAssignsAssignment_4_1
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
    // InternalMGLang.g:685:1: rule__NodeReferenceOrAssignment__Alternatives_0 : ( ( rulePatternNodeReference ) | ( ruleAssignment ) );
    public final void rule__NodeReferenceOrAssignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:689:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==32) ) {
                    alt3=2;
                }
                else if ( (LA3_1==30) ) {
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
                    // InternalMGLang.g:690:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:690:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:691:3: rulePatternNodeReference
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
                    // InternalMGLang.g:696:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:696:2: ( ruleAssignment )
                    // InternalMGLang.g:697:3: ruleAssignment
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
    // InternalMGLang.g:706:1: rule__GeneratorElement__Alternatives : ( ( ruleGeneratorCommand ) | ( ruleForLoop ) );
    public final void rule__GeneratorElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:710:1: ( ( ruleGeneratorCommand ) | ( ruleForLoop ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:711:2: ( ruleGeneratorCommand )
                    {
                    // InternalMGLang.g:711:2: ( ruleGeneratorCommand )
                    // InternalMGLang.g:712:3: ruleGeneratorCommand
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
                    // InternalMGLang.g:717:2: ( ruleForLoop )
                    {
                    // InternalMGLang.g:717:2: ( ruleForLoop )
                    // InternalMGLang.g:718:3: ruleForLoop
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
    // InternalMGLang.g:727:1: rule__GeneratorCommand__Alternatives : ( ( rulePatternCall ) | ( rulePatternObjectCreation ) );
    public final void rule__GeneratorCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:731:1: ( ( rulePatternCall ) | ( rulePatternObjectCreation ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_ID||(LA5_2>=23 && LA5_2<=24)||LA5_2==35) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==RULE_ASSIGNMENT_OP) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==EOF||(LA5_1>=23 && LA5_1<=24)||LA5_1==35) ) {
                    alt5=1;
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
                    // InternalMGLang.g:732:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:732:2: ( rulePatternCall )
                    // InternalMGLang.g:733:3: rulePatternCall
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
                    // InternalMGLang.g:738:2: ( rulePatternObjectCreation )
                    {
                    // InternalMGLang.g:738:2: ( rulePatternObjectCreation )
                    // InternalMGLang.g:739:3: rulePatternObjectCreation
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
    // InternalMGLang.g:748:1: rule__ForCondition__Alternatives : ( ( ruleForEachCollection ) | ( ruleForRange ) );
    public final void rule__ForCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:752:1: ( ( ruleForEachCollection ) | ( ruleForRange ) )
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
                    // InternalMGLang.g:753:2: ( ruleForEachCollection )
                    {
                    // InternalMGLang.g:753:2: ( ruleForEachCollection )
                    // InternalMGLang.g:754:3: ruleForEachCollection
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
                    // InternalMGLang.g:759:2: ( ruleForRange )
                    {
                    // InternalMGLang.g:759:2: ( ruleForRange )
                    // InternalMGLang.g:760:3: ruleForRange
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


    // $ANTLR start "rule__EditorRelation__Alternatives"
    // InternalMGLang.g:769:1: rule__EditorRelation__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__EditorRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:773:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:774:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:774:2: ( ( '>' ) )
                    // InternalMGLang.g:775:3: ( '>' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:776:3: ( '>' )
                    // InternalMGLang.g:776:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:780:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:780:2: ( ( '>=' ) )
                    // InternalMGLang.g:781:3: ( '>=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:782:3: ( '>=' )
                    // InternalMGLang.g:782:4: '>='
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:786:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:786:2: ( ( '==' ) )
                    // InternalMGLang.g:787:3: ( '==' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:788:3: ( '==' )
                    // InternalMGLang.g:788:4: '=='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:792:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:792:2: ( ( '!=' ) )
                    // InternalMGLang.g:793:3: ( '!=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:794:3: ( '!=' )
                    // InternalMGLang.g:794:4: '!='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getUNEQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:798:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:798:2: ( ( '<=' ) )
                    // InternalMGLang.g:799:3: ( '<=' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 
                    // InternalMGLang.g:800:3: ( '<=' )
                    // InternalMGLang.g:800:4: '<='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEditorRelationAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:804:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:804:2: ( ( '<' ) )
                    // InternalMGLang.g:805:3: ( '<' )
                    {
                     before(grammarAccess.getEditorRelationAccess().getSMALLEREnumLiteralDeclaration_5()); 
                    // InternalMGLang.g:806:3: ( '<' )
                    // InternalMGLang.g:806:4: '<'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalMGLang.g:814:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:818:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:819:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
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
    // InternalMGLang.g:826:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:830:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:831:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:831:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:832:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            // InternalMGLang.g:833:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMGLang.g:833:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMGLang.g:841:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:845:1: ( rule__MofgenFile__Group__1__Impl )
            // InternalMGLang.g:846:2: rule__MofgenFile__Group__1__Impl
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
    // InternalMGLang.g:852:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__Alternatives_1 )* ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:856:1: ( ( ( rule__MofgenFile__Alternatives_1 )* ) )
            // InternalMGLang.g:857:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            {
            // InternalMGLang.g:857:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            // InternalMGLang.g:858:2: ( rule__MofgenFile__Alternatives_1 )*
            {
             before(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 
            // InternalMGLang.g:859:2: ( rule__MofgenFile__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMGLang.g:859:3: rule__MofgenFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MofgenFile__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMGLang.g:868:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:872:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:873:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMGLang.g:880:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:884:1: ( ( 'import' ) )
            // InternalMGLang.g:885:1: ( 'import' )
            {
            // InternalMGLang.g:885:1: ( 'import' )
            // InternalMGLang.g:886:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMGLang.g:895:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:899:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:900:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMGLang.g:907:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:911:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalMGLang.g:912:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalMGLang.g:912:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalMGLang.g:913:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalMGLang.g:914:2: ( rule__Import__NameAssignment_1 )
            // InternalMGLang.g:914:3: rule__Import__NameAssignment_1
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
    // InternalMGLang.g:922:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:926:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:927:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalMGLang.g:934:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:938:1: ( ( 'as' ) )
            // InternalMGLang.g:939:1: ( 'as' )
            {
            // InternalMGLang.g:939:1: ( 'as' )
            // InternalMGLang.g:940:2: 'as'
            {
             before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMGLang.g:949:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:953:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:954:2: rule__Import__Group__3__Impl
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
    // InternalMGLang.g:960:1: rule__Import__Group__3__Impl : ( ( rule__Import__AliasAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:964:1: ( ( ( rule__Import__AliasAssignment_3 ) ) )
            // InternalMGLang.g:965:1: ( ( rule__Import__AliasAssignment_3 ) )
            {
            // InternalMGLang.g:965:1: ( ( rule__Import__AliasAssignment_3 ) )
            // InternalMGLang.g:966:2: ( rule__Import__AliasAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getAliasAssignment_3()); 
            // InternalMGLang.g:967:2: ( rule__Import__AliasAssignment_3 )
            // InternalMGLang.g:967:3: rule__Import__AliasAssignment_3
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
    // InternalMGLang.g:976:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:980:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:981:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalMGLang.g:988:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:992:1: ( ( 'pattern' ) )
            // InternalMGLang.g:993:1: ( 'pattern' )
            {
            // InternalMGLang.g:993:1: ( 'pattern' )
            // InternalMGLang.g:994:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMGLang.g:1003:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1007:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:1008:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalMGLang.g:1015:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1019:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:1020:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1020:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:1021:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1022:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:1022:3: rule__Pattern__NameAssignment_1
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
    // InternalMGLang.g:1030:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1034:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:1035:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalMGLang.g:1042:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1046:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:1047:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:1047:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:1048:2: ( rule__Pattern__Group_2__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalMGLang.g:1049:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:1049:3: rule__Pattern__Group_2__0
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
    // InternalMGLang.g:1057:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1061:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:1062:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalMGLang.g:1069:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1073:1: ( ( '{' ) )
            // InternalMGLang.g:1074:1: ( '{' )
            {
            // InternalMGLang.g:1074:1: ( '{' )
            // InternalMGLang.g:1075:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMGLang.g:1084:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1088:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:1089:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalMGLang.g:1096:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Alternatives_4 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1100:1: ( ( ( rule__Pattern__Alternatives_4 )* ) )
            // InternalMGLang.g:1101:1: ( ( rule__Pattern__Alternatives_4 )* )
            {
            // InternalMGLang.g:1101:1: ( ( rule__Pattern__Alternatives_4 )* )
            // InternalMGLang.g:1102:2: ( rule__Pattern__Alternatives_4 )*
            {
             before(grammarAccess.getPatternAccess().getAlternatives_4()); 
            // InternalMGLang.g:1103:2: ( rule__Pattern__Alternatives_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMGLang.g:1103:3: rule__Pattern__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMGLang.g:1111:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1115:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:1116:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalMGLang.g:1123:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1127:1: ( ( '}' ) )
            // InternalMGLang.g:1128:1: ( '}' )
            {
            // InternalMGLang.g:1128:1: ( '}' )
            // InternalMGLang.g:1129:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMGLang.g:1138:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1142:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:1143:2: rule__Pattern__Group__6__Impl
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
    // InternalMGLang.g:1149:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 ) ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1153:1: ( ( ( rule__Pattern__ReturnAssignment_6 ) ) )
            // InternalMGLang.g:1154:1: ( ( rule__Pattern__ReturnAssignment_6 ) )
            {
            // InternalMGLang.g:1154:1: ( ( rule__Pattern__ReturnAssignment_6 ) )
            // InternalMGLang.g:1155:2: ( rule__Pattern__ReturnAssignment_6 )
            {
             before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            // InternalMGLang.g:1156:2: ( rule__Pattern__ReturnAssignment_6 )
            // InternalMGLang.g:1156:3: rule__Pattern__ReturnAssignment_6
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
    // InternalMGLang.g:1165:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1169:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:1170:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalMGLang.g:1177:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1181:1: ( ( '(' ) )
            // InternalMGLang.g:1182:1: ( '(' )
            {
            // InternalMGLang.g:1182:1: ( '(' )
            // InternalMGLang.g:1183:2: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMGLang.g:1192:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1196:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:1197:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
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
    // InternalMGLang.g:1204:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1208:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:1209:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:1209:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:1210:2: ( rule__Pattern__Group_2_1__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalMGLang.g:1211:2: ( rule__Pattern__Group_2_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:1211:3: rule__Pattern__Group_2_1__0
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
    // InternalMGLang.g:1219:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1223:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:1224:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMGLang.g:1230:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1234:1: ( ( ')' ) )
            // InternalMGLang.g:1235:1: ( ')' )
            {
            // InternalMGLang.g:1235:1: ( ')' )
            // InternalMGLang.g:1236:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMGLang.g:1246:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1250:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:1251:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
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
    // InternalMGLang.g:1258:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1262:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:1263:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:1263:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:1264:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            // InternalMGLang.g:1265:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:1265:3: rule__Pattern__ParametersAssignment_2_1_0
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
    // InternalMGLang.g:1273:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1277:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:1278:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalMGLang.g:1284:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1288:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:1289:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:1289:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:1290:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            // InternalMGLang.g:1291:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMGLang.g:1291:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMGLang.g:1300:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1304:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:1305:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
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
    // InternalMGLang.g:1312:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1316:1: ( ( ',' ) )
            // InternalMGLang.g:1317:1: ( ',' )
            {
            // InternalMGLang.g:1317:1: ( ',' )
            // InternalMGLang.g:1318:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMGLang.g:1327:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1331:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:1332:2: rule__Pattern__Group_2_1_1__1__Impl
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
    // InternalMGLang.g:1338:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1342:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:1343:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:1343:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:1344:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            // InternalMGLang.g:1345:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:1345:3: rule__Pattern__ParametersAssignment_2_1_1_1
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
    // InternalMGLang.g:1354:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1358:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:1359:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
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
    // InternalMGLang.g:1366:1: rule__PatternReturn__Group__0__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1370:1: ( ( 'return' ) )
            // InternalMGLang.g:1371:1: ( 'return' )
            {
            // InternalMGLang.g:1371:1: ( 'return' )
            // InternalMGLang.g:1372:2: 'return'
            {
             before(grammarAccess.getPatternReturnAccess().getReturnKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMGLang.g:1381:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1385:1: ( rule__PatternReturn__Group__1__Impl )
            // InternalMGLang.g:1386:2: rule__PatternReturn__Group__1__Impl
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
    // InternalMGLang.g:1392:1: rule__PatternReturn__Group__1__Impl : ( ( rule__PatternReturn__ThisUsedAssignment_1 ) ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1396:1: ( ( ( rule__PatternReturn__ThisUsedAssignment_1 ) ) )
            // InternalMGLang.g:1397:1: ( ( rule__PatternReturn__ThisUsedAssignment_1 ) )
            {
            // InternalMGLang.g:1397:1: ( ( rule__PatternReturn__ThisUsedAssignment_1 ) )
            // InternalMGLang.g:1398:2: ( rule__PatternReturn__ThisUsedAssignment_1 )
            {
             before(grammarAccess.getPatternReturnAccess().getThisUsedAssignment_1()); 
            // InternalMGLang.g:1399:2: ( rule__PatternReturn__ThisUsedAssignment_1 )
            // InternalMGLang.g:1399:3: rule__PatternReturn__ThisUsedAssignment_1
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
    // InternalMGLang.g:1408:1: rule__PatternNodeCreation__Group__0 : rule__PatternNodeCreation__Group__0__Impl rule__PatternNodeCreation__Group__1 ;
    public final void rule__PatternNodeCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1412:1: ( rule__PatternNodeCreation__Group__0__Impl rule__PatternNodeCreation__Group__1 )
            // InternalMGLang.g:1413:2: rule__PatternNodeCreation__Group__0__Impl rule__PatternNodeCreation__Group__1
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
    // InternalMGLang.g:1420:1: rule__PatternNodeCreation__Group__0__Impl : ( ( rule__PatternNodeCreation__NodeAssignment_0 ) ) ;
    public final void rule__PatternNodeCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1424:1: ( ( ( rule__PatternNodeCreation__NodeAssignment_0 ) ) )
            // InternalMGLang.g:1425:1: ( ( rule__PatternNodeCreation__NodeAssignment_0 ) )
            {
            // InternalMGLang.g:1425:1: ( ( rule__PatternNodeCreation__NodeAssignment_0 ) )
            // InternalMGLang.g:1426:2: ( rule__PatternNodeCreation__NodeAssignment_0 )
            {
             before(grammarAccess.getPatternNodeCreationAccess().getNodeAssignment_0()); 
            // InternalMGLang.g:1427:2: ( rule__PatternNodeCreation__NodeAssignment_0 )
            // InternalMGLang.g:1427:3: rule__PatternNodeCreation__NodeAssignment_0
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
    // InternalMGLang.g:1435:1: rule__PatternNodeCreation__Group__1 : rule__PatternNodeCreation__Group__1__Impl ;
    public final void rule__PatternNodeCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1439:1: ( rule__PatternNodeCreation__Group__1__Impl )
            // InternalMGLang.g:1440:2: rule__PatternNodeCreation__Group__1__Impl
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
    // InternalMGLang.g:1446:1: rule__PatternNodeCreation__Group__1__Impl : ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? ) ;
    public final void rule__PatternNodeCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1450:1: ( ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? ) )
            // InternalMGLang.g:1451:1: ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? )
            {
            // InternalMGLang.g:1451:1: ( ( rule__PatternNodeCreation__ConstructorAssignment_1 )? )
            // InternalMGLang.g:1452:2: ( rule__PatternNodeCreation__ConstructorAssignment_1 )?
            {
             before(grammarAccess.getPatternNodeCreationAccess().getConstructorAssignment_1()); 
            // InternalMGLang.g:1453:2: ( rule__PatternNodeCreation__ConstructorAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:1453:3: rule__PatternNodeCreation__ConstructorAssignment_1
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
    // InternalMGLang.g:1462:1: rule__NodeConstructor__Group__0 : rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 ;
    public final void rule__NodeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1466:1: ( rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 )
            // InternalMGLang.g:1467:2: rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1
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
    // InternalMGLang.g:1474:1: rule__NodeConstructor__Group__0__Impl : ( () ) ;
    public final void rule__NodeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1478:1: ( ( () ) )
            // InternalMGLang.g:1479:1: ( () )
            {
            // InternalMGLang.g:1479:1: ( () )
            // InternalMGLang.g:1480:2: ()
            {
             before(grammarAccess.getNodeConstructorAccess().getNodeConstructorAction_0()); 
            // InternalMGLang.g:1481:2: ()
            // InternalMGLang.g:1481:3: 
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
    // InternalMGLang.g:1489:1: rule__NodeConstructor__Group__1 : rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 ;
    public final void rule__NodeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1493:1: ( rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 )
            // InternalMGLang.g:1494:2: rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMGLang.g:1501:1: rule__NodeConstructor__Group__1__Impl : ( '(' ) ;
    public final void rule__NodeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1505:1: ( ( '(' ) )
            // InternalMGLang.g:1506:1: ( '(' )
            {
            // InternalMGLang.g:1506:1: ( '(' )
            // InternalMGLang.g:1507:2: '('
            {
             before(grammarAccess.getNodeConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMGLang.g:1516:1: rule__NodeConstructor__Group__2 : rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 ;
    public final void rule__NodeConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1520:1: ( rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 )
            // InternalMGLang.g:1521:2: rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMGLang.g:1528:1: rule__NodeConstructor__Group__2__Impl : ( ( rule__NodeConstructor__ParamsAssignment_2 )* ) ;
    public final void rule__NodeConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1532:1: ( ( ( rule__NodeConstructor__ParamsAssignment_2 )* ) )
            // InternalMGLang.g:1533:1: ( ( rule__NodeConstructor__ParamsAssignment_2 )* )
            {
            // InternalMGLang.g:1533:1: ( ( rule__NodeConstructor__ParamsAssignment_2 )* )
            // InternalMGLang.g:1534:2: ( rule__NodeConstructor__ParamsAssignment_2 )*
            {
             before(grammarAccess.getNodeConstructorAccess().getParamsAssignment_2()); 
            // InternalMGLang.g:1535:2: ( rule__NodeConstructor__ParamsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGLang.g:1535:3: rule__NodeConstructor__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NodeConstructor__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMGLang.g:1543:1: rule__NodeConstructor__Group__3 : rule__NodeConstructor__Group__3__Impl ;
    public final void rule__NodeConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1547:1: ( rule__NodeConstructor__Group__3__Impl )
            // InternalMGLang.g:1548:2: rule__NodeConstructor__Group__3__Impl
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
    // InternalMGLang.g:1554:1: rule__NodeConstructor__Group__3__Impl : ( ')' ) ;
    public final void rule__NodeConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1558:1: ( ( ')' ) )
            // InternalMGLang.g:1559:1: ( ')' )
            {
            // InternalMGLang.g:1559:1: ( ')' )
            // InternalMGLang.g:1560:2: ')'
            {
             before(grammarAccess.getNodeConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMGLang.g:1570:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1574:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:1575:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalMGLang.g:1582:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1586:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:1587:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:1587:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:1588:2: ( rule__Node__TypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:1589:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:1589:3: rule__Node__TypeAssignment_0
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
    // InternalMGLang.g:1597:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1601:1: ( rule__Node__Group__1__Impl )
            // InternalMGLang.g:1602:2: rule__Node__Group__1__Impl
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
    // InternalMGLang.g:1608:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1612:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:1613:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1613:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:1614:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1615:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:1615:3: rule__Node__NameAssignment_1
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
    // InternalMGLang.g:1624:1: rule__NodeReferenceOrAssignment__Group__0 : rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 ;
    public final void rule__NodeReferenceOrAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1628:1: ( rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 )
            // InternalMGLang.g:1629:2: rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMGLang.g:1636:1: rule__NodeReferenceOrAssignment__Group__0__Impl : ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1640:1: ( ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) )
            // InternalMGLang.g:1641:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            {
            // InternalMGLang.g:1641:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            // InternalMGLang.g:1642:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives_0()); 
            // InternalMGLang.g:1643:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            // InternalMGLang.g:1643:3: rule__NodeReferenceOrAssignment__Alternatives_0
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
    // InternalMGLang.g:1651:1: rule__NodeReferenceOrAssignment__Group__1 : rule__NodeReferenceOrAssignment__Group__1__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1655:1: ( rule__NodeReferenceOrAssignment__Group__1__Impl )
            // InternalMGLang.g:1656:2: rule__NodeReferenceOrAssignment__Group__1__Impl
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
    // InternalMGLang.g:1662:1: rule__NodeReferenceOrAssignment__Group__1__Impl : ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) ;
    public final void rule__NodeReferenceOrAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1666:1: ( ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) )
            // InternalMGLang.g:1667:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            {
            // InternalMGLang.g:1667:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            // InternalMGLang.g:1668:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup_1()); 
            // InternalMGLang.g:1669:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1669:3: rule__NodeReferenceOrAssignment__Group_1__0
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
    // InternalMGLang.g:1678:1: rule__NodeReferenceOrAssignment__Group_1__0 : rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1682:1: ( rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 )
            // InternalMGLang.g:1683:2: rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1
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
    // InternalMGLang.g:1690:1: rule__NodeReferenceOrAssignment__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1694:1: ( ( '[' ) )
            // InternalMGLang.g:1695:1: ( '[' )
            {
            // InternalMGLang.g:1695:1: ( '[' )
            // InternalMGLang.g:1696:2: '['
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMGLang.g:1705:1: rule__NodeReferenceOrAssignment__Group_1__1 : rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1709:1: ( rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 )
            // InternalMGLang.g:1710:2: rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMGLang.g:1717:1: rule__NodeReferenceOrAssignment__Group_1__1__Impl : ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1721:1: ( ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) )
            // InternalMGLang.g:1722:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            {
            // InternalMGLang.g:1722:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            // InternalMGLang.g:1723:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionAssignment_1_1()); 
            // InternalMGLang.g:1724:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            // InternalMGLang.g:1724:3: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1
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
    // InternalMGLang.g:1732:1: rule__NodeReferenceOrAssignment__Group_1__2 : rule__NodeReferenceOrAssignment__Group_1__2__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1736:1: ( rule__NodeReferenceOrAssignment__Group_1__2__Impl )
            // InternalMGLang.g:1737:2: rule__NodeReferenceOrAssignment__Group_1__2__Impl
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
    // InternalMGLang.g:1743:1: rule__NodeReferenceOrAssignment__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1747:1: ( ( ']' ) )
            // InternalMGLang.g:1748:1: ( ']' )
            {
            // InternalMGLang.g:1748:1: ( ']' )
            // InternalMGLang.g:1749:2: ']'
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMGLang.g:1759:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1763:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMGLang.g:1764:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMGLang.g:1771:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LhsAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1775:1: ( ( ( rule__Condition__LhsAssignment_0 ) ) )
            // InternalMGLang.g:1776:1: ( ( rule__Condition__LhsAssignment_0 ) )
            {
            // InternalMGLang.g:1776:1: ( ( rule__Condition__LhsAssignment_0 ) )
            // InternalMGLang.g:1777:2: ( rule__Condition__LhsAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLhsAssignment_0()); 
            // InternalMGLang.g:1778:2: ( rule__Condition__LhsAssignment_0 )
            // InternalMGLang.g:1778:3: rule__Condition__LhsAssignment_0
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
    // InternalMGLang.g:1786:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1790:1: ( rule__Condition__Group__1__Impl )
            // InternalMGLang.g:1791:2: rule__Condition__Group__1__Impl
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
    // InternalMGLang.g:1797:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )? ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1801:1: ( ( ( rule__Condition__Group_1__0 )? ) )
            // InternalMGLang.g:1802:1: ( ( rule__Condition__Group_1__0 )? )
            {
            // InternalMGLang.g:1802:1: ( ( rule__Condition__Group_1__0 )? )
            // InternalMGLang.g:1803:2: ( rule__Condition__Group_1__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // InternalMGLang.g:1804:2: ( rule__Condition__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=13 && LA16_0<=18)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:1804:3: rule__Condition__Group_1__0
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
    // InternalMGLang.g:1813:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1817:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalMGLang.g:1818:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
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
    // InternalMGLang.g:1825:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__RelationAssignment_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1829:1: ( ( ( rule__Condition__RelationAssignment_1_0 ) ) )
            // InternalMGLang.g:1830:1: ( ( rule__Condition__RelationAssignment_1_0 ) )
            {
            // InternalMGLang.g:1830:1: ( ( rule__Condition__RelationAssignment_1_0 ) )
            // InternalMGLang.g:1831:2: ( rule__Condition__RelationAssignment_1_0 )
            {
             before(grammarAccess.getConditionAccess().getRelationAssignment_1_0()); 
            // InternalMGLang.g:1832:2: ( rule__Condition__RelationAssignment_1_0 )
            // InternalMGLang.g:1832:3: rule__Condition__RelationAssignment_1_0
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
    // InternalMGLang.g:1840:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1844:1: ( rule__Condition__Group_1__1__Impl )
            // InternalMGLang.g:1845:2: rule__Condition__Group_1__1__Impl
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
    // InternalMGLang.g:1851:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__RhsAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1855:1: ( ( ( rule__Condition__RhsAssignment_1_1 ) ) )
            // InternalMGLang.g:1856:1: ( ( rule__Condition__RhsAssignment_1_1 ) )
            {
            // InternalMGLang.g:1856:1: ( ( rule__Condition__RhsAssignment_1_1 ) )
            // InternalMGLang.g:1857:2: ( rule__Condition__RhsAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getRhsAssignment_1_1()); 
            // InternalMGLang.g:1858:2: ( rule__Condition__RhsAssignment_1_1 )
            // InternalMGLang.g:1858:3: rule__Condition__RhsAssignment_1_1
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
    // InternalMGLang.g:1867:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1871:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:1872:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMGLang.g:1879:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__SourceAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1883:1: ( ( ( rule__PatternNodeReference__SourceAssignment_0 ) ) )
            // InternalMGLang.g:1884:1: ( ( rule__PatternNodeReference__SourceAssignment_0 ) )
            {
            // InternalMGLang.g:1884:1: ( ( rule__PatternNodeReference__SourceAssignment_0 ) )
            // InternalMGLang.g:1885:2: ( rule__PatternNodeReference__SourceAssignment_0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getSourceAssignment_0()); 
            // InternalMGLang.g:1886:2: ( rule__PatternNodeReference__SourceAssignment_0 )
            // InternalMGLang.g:1886:3: rule__PatternNodeReference__SourceAssignment_0
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
    // InternalMGLang.g:1894:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1898:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:1899:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
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
    // InternalMGLang.g:1906:1: rule__PatternNodeReference__Group__1__Impl : ( '-' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1910:1: ( ( '-' ) )
            // InternalMGLang.g:1911:1: ( '-' )
            {
            // InternalMGLang.g:1911:1: ( '-' )
            // InternalMGLang.g:1912:2: '-'
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMGLang.g:1921:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl rule__PatternNodeReference__Group__3 ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1925:1: ( rule__PatternNodeReference__Group__2__Impl rule__PatternNodeReference__Group__3 )
            // InternalMGLang.g:1926:2: rule__PatternNodeReference__Group__2__Impl rule__PatternNodeReference__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMGLang.g:1933:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TypeAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1937:1: ( ( ( rule__PatternNodeReference__TypeAssignment_2 ) ) )
            // InternalMGLang.g:1938:1: ( ( rule__PatternNodeReference__TypeAssignment_2 ) )
            {
            // InternalMGLang.g:1938:1: ( ( rule__PatternNodeReference__TypeAssignment_2 ) )
            // InternalMGLang.g:1939:2: ( rule__PatternNodeReference__TypeAssignment_2 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_2()); 
            // InternalMGLang.g:1940:2: ( rule__PatternNodeReference__TypeAssignment_2 )
            // InternalMGLang.g:1940:3: rule__PatternNodeReference__TypeAssignment_2
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
    // InternalMGLang.g:1948:1: rule__PatternNodeReference__Group__3 : rule__PatternNodeReference__Group__3__Impl rule__PatternNodeReference__Group__4 ;
    public final void rule__PatternNodeReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1952:1: ( rule__PatternNodeReference__Group__3__Impl rule__PatternNodeReference__Group__4 )
            // InternalMGLang.g:1953:2: rule__PatternNodeReference__Group__3__Impl rule__PatternNodeReference__Group__4
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
    // InternalMGLang.g:1960:1: rule__PatternNodeReference__Group__3__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1964:1: ( ( '->' ) )
            // InternalMGLang.g:1965:1: ( '->' )
            {
            // InternalMGLang.g:1965:1: ( '->' )
            // InternalMGLang.g:1966:2: '->'
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMGLang.g:1975:1: rule__PatternNodeReference__Group__4 : rule__PatternNodeReference__Group__4__Impl ;
    public final void rule__PatternNodeReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1979:1: ( rule__PatternNodeReference__Group__4__Impl )
            // InternalMGLang.g:1980:2: rule__PatternNodeReference__Group__4__Impl
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
    // InternalMGLang.g:1986:1: rule__PatternNodeReference__Group__4__Impl : ( ( rule__PatternNodeReference__TargetAssignment_4 ) ) ;
    public final void rule__PatternNodeReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1990:1: ( ( ( rule__PatternNodeReference__TargetAssignment_4 ) ) )
            // InternalMGLang.g:1991:1: ( ( rule__PatternNodeReference__TargetAssignment_4 ) )
            {
            // InternalMGLang.g:1991:1: ( ( rule__PatternNodeReference__TargetAssignment_4 ) )
            // InternalMGLang.g:1992:2: ( rule__PatternNodeReference__TargetAssignment_4 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_4()); 
            // InternalMGLang.g:1993:2: ( rule__PatternNodeReference__TargetAssignment_4 )
            // InternalMGLang.g:1993:3: rule__PatternNodeReference__TargetAssignment_4
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
    // InternalMGLang.g:2002:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2006:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:2007:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMGLang.g:2014:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__ObjectAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2018:1: ( ( ( rule__Assignment__ObjectAssignment_0 ) ) )
            // InternalMGLang.g:2019:1: ( ( rule__Assignment__ObjectAssignment_0 ) )
            {
            // InternalMGLang.g:2019:1: ( ( rule__Assignment__ObjectAssignment_0 ) )
            // InternalMGLang.g:2020:2: ( rule__Assignment__ObjectAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getObjectAssignment_0()); 
            // InternalMGLang.g:2021:2: ( rule__Assignment__ObjectAssignment_0 )
            // InternalMGLang.g:2021:3: rule__Assignment__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getObjectAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:2029:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2033:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:2034:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:2041:1: rule__Assignment__Group__1__Impl : ( RULE_PATTERN_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2045:1: ( ( RULE_PATTERN_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2046:1: ( RULE_PATTERN_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2046:1: ( RULE_PATTERN_ASSIGNMENT_OP )
            // InternalMGLang.g:2047:2: RULE_PATTERN_ASSIGNMENT_OP
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
    // InternalMGLang.g:2056:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2060:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:2061:2: rule__Assignment__Group__2__Impl
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
    // InternalMGLang.g:2067:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2071:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:2072:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:2072:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:2073:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMGLang.g:2074:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:2074:3: rule__Assignment__ValueAssignment_2
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
    // InternalMGLang.g:2083:1: rule__NodeAttributeCall__Group__0 : rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 ;
    public final void rule__NodeAttributeCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2087:1: ( rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 )
            // InternalMGLang.g:2088:2: rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMGLang.g:2095:1: rule__NodeAttributeCall__Group__0__Impl : ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) ) ;
    public final void rule__NodeAttributeCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2099:1: ( ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) ) )
            // InternalMGLang.g:2100:1: ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) )
            {
            // InternalMGLang.g:2100:1: ( ( rule__NodeAttributeCall__ObjectAssignment_0 ) )
            // InternalMGLang.g:2101:2: ( rule__NodeAttributeCall__ObjectAssignment_0 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getObjectAssignment_0()); 
            // InternalMGLang.g:2102:2: ( rule__NodeAttributeCall__ObjectAssignment_0 )
            // InternalMGLang.g:2102:3: rule__NodeAttributeCall__ObjectAssignment_0
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
    // InternalMGLang.g:2110:1: rule__NodeAttributeCall__Group__1 : rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 ;
    public final void rule__NodeAttributeCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2114:1: ( rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 )
            // InternalMGLang.g:2115:2: rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2
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
    // InternalMGLang.g:2122:1: rule__NodeAttributeCall__Group__1__Impl : ( '.' ) ;
    public final void rule__NodeAttributeCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2126:1: ( ( '.' ) )
            // InternalMGLang.g:2127:1: ( '.' )
            {
            // InternalMGLang.g:2127:1: ( '.' )
            // InternalMGLang.g:2128:2: '.'
            {
             before(grammarAccess.getNodeAttributeCallAccess().getFullStopKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMGLang.g:2137:1: rule__NodeAttributeCall__Group__2 : rule__NodeAttributeCall__Group__2__Impl ;
    public final void rule__NodeAttributeCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2141:1: ( rule__NodeAttributeCall__Group__2__Impl )
            // InternalMGLang.g:2142:2: rule__NodeAttributeCall__Group__2__Impl
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
    // InternalMGLang.g:2148:1: rule__NodeAttributeCall__Group__2__Impl : ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) ;
    public final void rule__NodeAttributeCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2152:1: ( ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:2153:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:2153:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            // InternalMGLang.g:2154:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeAssignment_2()); 
            // InternalMGLang.g:2155:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            // InternalMGLang.g:2155:3: rule__NodeAttributeCall__AttributeAssignment_2
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
    // InternalMGLang.g:2164:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2168:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMGLang.g:2169:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:2176:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2180:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalMGLang.g:2181:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalMGLang.g:2181:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalMGLang.g:2182:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalMGLang.g:2183:2: ( rule__Parameter__NameAssignment_0 )
            // InternalMGLang.g:2183:3: rule__Parameter__NameAssignment_0
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
    // InternalMGLang.g:2191:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2195:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMGLang.g:2196:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalMGLang.g:2203:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2207:1: ( ( ':' ) )
            // InternalMGLang.g:2208:1: ( ':' )
            {
            // InternalMGLang.g:2208:1: ( ':' )
            // InternalMGLang.g:2209:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMGLang.g:2218:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2222:1: ( rule__Parameter__Group__2__Impl )
            // InternalMGLang.g:2223:2: rule__Parameter__Group__2__Impl
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
    // InternalMGLang.g:2229:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2233:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalMGLang.g:2234:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalMGLang.g:2234:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalMGLang.g:2235:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalMGLang.g:2236:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalMGLang.g:2236:3: rule__Parameter__TypeAssignment_2
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
    // InternalMGLang.g:2245:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2249:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:2250:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
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
    // InternalMGLang.g:2257:1: rule__Generator__Group__0__Impl : ( 'generator' ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2261:1: ( ( 'generator' ) )
            // InternalMGLang.g:2262:1: ( 'generator' )
            {
            // InternalMGLang.g:2262:1: ( 'generator' )
            // InternalMGLang.g:2263:2: 'generator'
            {
             before(grammarAccess.getGeneratorAccess().getGeneratorKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMGLang.g:2272:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2276:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:2277:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
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
    // InternalMGLang.g:2284:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__NameAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2288:1: ( ( ( rule__Generator__NameAssignment_1 ) ) )
            // InternalMGLang.g:2289:1: ( ( rule__Generator__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2289:1: ( ( rule__Generator__NameAssignment_1 ) )
            // InternalMGLang.g:2290:2: ( rule__Generator__NameAssignment_1 )
            {
             before(grammarAccess.getGeneratorAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2291:2: ( rule__Generator__NameAssignment_1 )
            // InternalMGLang.g:2291:3: rule__Generator__NameAssignment_1
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
    // InternalMGLang.g:2299:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2303:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:2304:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:2311:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2315:1: ( ( '(' ) )
            // InternalMGLang.g:2316:1: ( '(' )
            {
            // InternalMGLang.g:2316:1: ( '(' )
            // InternalMGLang.g:2317:2: '('
            {
             before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMGLang.g:2326:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2330:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:2331:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
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
    // InternalMGLang.g:2338:1: rule__Generator__Group__3__Impl : ( ')' ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2342:1: ( ( ')' ) )
            // InternalMGLang.g:2343:1: ( ')' )
            {
            // InternalMGLang.g:2343:1: ( ')' )
            // InternalMGLang.g:2344:2: ')'
            {
             before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMGLang.g:2353:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2357:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:2358:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:2365:1: rule__Generator__Group__4__Impl : ( '{' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2369:1: ( ( '{' ) )
            // InternalMGLang.g:2370:1: ( '{' )
            {
            // InternalMGLang.g:2370:1: ( '{' )
            // InternalMGLang.g:2371:2: '{'
            {
             before(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMGLang.g:2380:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2384:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:2385:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:2392:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__CommandsAssignment_5 )* ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2396:1: ( ( ( rule__Generator__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:2397:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:2397:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            // InternalMGLang.g:2398:2: ( rule__Generator__CommandsAssignment_5 )*
            {
             before(grammarAccess.getGeneratorAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:2399:2: ( rule__Generator__CommandsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMGLang.g:2399:3: rule__Generator__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Generator__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMGLang.g:2407:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2411:1: ( rule__Generator__Group__6__Impl )
            // InternalMGLang.g:2412:2: rule__Generator__Group__6__Impl
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
    // InternalMGLang.g:2418:1: rule__Generator__Group__6__Impl : ( '}' ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2422:1: ( ( '}' ) )
            // InternalMGLang.g:2423:1: ( '}' )
            {
            // InternalMGLang.g:2423:1: ( '}' )
            // InternalMGLang.g:2424:2: '}'
            {
             before(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMGLang.g:2434:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2438:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:2439:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
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
    // InternalMGLang.g:2446:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledPatternAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2450:1: ( ( ( rule__PatternCall__CalledPatternAssignment_0 ) ) )
            // InternalMGLang.g:2451:1: ( ( rule__PatternCall__CalledPatternAssignment_0 ) )
            {
            // InternalMGLang.g:2451:1: ( ( rule__PatternCall__CalledPatternAssignment_0 ) )
            // InternalMGLang.g:2452:2: ( rule__PatternCall__CalledPatternAssignment_0 )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternAssignment_0()); 
            // InternalMGLang.g:2453:2: ( rule__PatternCall__CalledPatternAssignment_0 )
            // InternalMGLang.g:2453:3: rule__PatternCall__CalledPatternAssignment_0
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
    // InternalMGLang.g:2461:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2465:1: ( rule__PatternCall__Group__1__Impl )
            // InternalMGLang.g:2466:2: rule__PatternCall__Group__1__Impl
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
    // InternalMGLang.g:2472:1: rule__PatternCall__Group__1__Impl : ( ( rule__PatternCall__Group_1__0 )? ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2476:1: ( ( ( rule__PatternCall__Group_1__0 )? ) )
            // InternalMGLang.g:2477:1: ( ( rule__PatternCall__Group_1__0 )? )
            {
            // InternalMGLang.g:2477:1: ( ( rule__PatternCall__Group_1__0 )? )
            // InternalMGLang.g:2478:2: ( rule__PatternCall__Group_1__0 )?
            {
             before(grammarAccess.getPatternCallAccess().getGroup_1()); 
            // InternalMGLang.g:2479:2: ( rule__PatternCall__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMGLang.g:2479:3: rule__PatternCall__Group_1__0
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
    // InternalMGLang.g:2488:1: rule__PatternCall__Group_1__0 : rule__PatternCall__Group_1__0__Impl rule__PatternCall__Group_1__1 ;
    public final void rule__PatternCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2492:1: ( rule__PatternCall__Group_1__0__Impl rule__PatternCall__Group_1__1 )
            // InternalMGLang.g:2493:2: rule__PatternCall__Group_1__0__Impl rule__PatternCall__Group_1__1
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
    // InternalMGLang.g:2500:1: rule__PatternCall__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2504:1: ( ( '(' ) )
            // InternalMGLang.g:2505:1: ( '(' )
            {
            // InternalMGLang.g:2505:1: ( '(' )
            // InternalMGLang.g:2506:2: '('
            {
             before(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMGLang.g:2515:1: rule__PatternCall__Group_1__1 : rule__PatternCall__Group_1__1__Impl rule__PatternCall__Group_1__2 ;
    public final void rule__PatternCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2519:1: ( rule__PatternCall__Group_1__1__Impl rule__PatternCall__Group_1__2 )
            // InternalMGLang.g:2520:2: rule__PatternCall__Group_1__1__Impl rule__PatternCall__Group_1__2
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
    // InternalMGLang.g:2527:1: rule__PatternCall__Group_1__1__Impl : ( ( rule__PatternCall__ParamsAssignment_1_1 )* ) ;
    public final void rule__PatternCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2531:1: ( ( ( rule__PatternCall__ParamsAssignment_1_1 )* ) )
            // InternalMGLang.g:2532:1: ( ( rule__PatternCall__ParamsAssignment_1_1 )* )
            {
            // InternalMGLang.g:2532:1: ( ( rule__PatternCall__ParamsAssignment_1_1 )* )
            // InternalMGLang.g:2533:2: ( rule__PatternCall__ParamsAssignment_1_1 )*
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_1_1()); 
            // InternalMGLang.g:2534:2: ( rule__PatternCall__ParamsAssignment_1_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMGLang.g:2534:3: rule__PatternCall__ParamsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PatternCall__ParamsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMGLang.g:2542:1: rule__PatternCall__Group_1__2 : rule__PatternCall__Group_1__2__Impl ;
    public final void rule__PatternCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2546:1: ( rule__PatternCall__Group_1__2__Impl )
            // InternalMGLang.g:2547:2: rule__PatternCall__Group_1__2__Impl
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
    // InternalMGLang.g:2553:1: rule__PatternCall__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2557:1: ( ( ')' ) )
            // InternalMGLang.g:2558:1: ( ')' )
            {
            // InternalMGLang.g:2558:1: ( ')' )
            // InternalMGLang.g:2559:2: ')'
            {
             before(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMGLang.g:2569:1: rule__PatternObjectCreation__Group__0 : rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 ;
    public final void rule__PatternObjectCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2573:1: ( rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 )
            // InternalMGLang.g:2574:2: rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMGLang.g:2581:1: rule__PatternObjectCreation__Group__0__Impl : ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) ;
    public final void rule__PatternObjectCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2585:1: ( ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) )
            // InternalMGLang.g:2586:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            {
            // InternalMGLang.g:2586:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            // InternalMGLang.g:2587:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 
            // InternalMGLang.g:2588:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            // InternalMGLang.g:2588:3: rule__PatternObjectCreation__PObjectAssignment_0
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
    // InternalMGLang.g:2596:1: rule__PatternObjectCreation__Group__1 : rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 ;
    public final void rule__PatternObjectCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2600:1: ( rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 )
            // InternalMGLang.g:2601:2: rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2
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
    // InternalMGLang.g:2608:1: rule__PatternObjectCreation__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternObjectCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2612:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2613:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2613:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:2614:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:2623:1: rule__PatternObjectCreation__Group__2 : rule__PatternObjectCreation__Group__2__Impl ;
    public final void rule__PatternObjectCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2627:1: ( rule__PatternObjectCreation__Group__2__Impl )
            // InternalMGLang.g:2628:2: rule__PatternObjectCreation__Group__2__Impl
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
    // InternalMGLang.g:2634:1: rule__PatternObjectCreation__Group__2__Impl : ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) ;
    public final void rule__PatternObjectCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2638:1: ( ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) )
            // InternalMGLang.g:2639:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            {
            // InternalMGLang.g:2639:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            // InternalMGLang.g:2640:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 
            // InternalMGLang.g:2641:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            // InternalMGLang.g:2641:3: rule__PatternObjectCreation__PatternCallAssignment_2
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
    // InternalMGLang.g:2650:1: rule__PatternObject__Group__0 : rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 ;
    public final void rule__PatternObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2654:1: ( rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 )
            // InternalMGLang.g:2655:2: rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1
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
    // InternalMGLang.g:2662:1: rule__PatternObject__Group__0__Impl : ( ( rule__PatternObject__TypeAssignment_0 ) ) ;
    public final void rule__PatternObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2666:1: ( ( ( rule__PatternObject__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2667:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2667:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            // InternalMGLang.g:2668:2: ( rule__PatternObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2669:2: ( rule__PatternObject__TypeAssignment_0 )
            // InternalMGLang.g:2669:3: rule__PatternObject__TypeAssignment_0
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
    // InternalMGLang.g:2677:1: rule__PatternObject__Group__1 : rule__PatternObject__Group__1__Impl ;
    public final void rule__PatternObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2681:1: ( rule__PatternObject__Group__1__Impl )
            // InternalMGLang.g:2682:2: rule__PatternObject__Group__1__Impl
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
    // InternalMGLang.g:2688:1: rule__PatternObject__Group__1__Impl : ( ( rule__PatternObject__NameAssignment_1 ) ) ;
    public final void rule__PatternObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2692:1: ( ( ( rule__PatternObject__NameAssignment_1 ) ) )
            // InternalMGLang.g:2693:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2693:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            // InternalMGLang.g:2694:2: ( rule__PatternObject__NameAssignment_1 )
            {
             before(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2695:2: ( rule__PatternObject__NameAssignment_1 )
            // InternalMGLang.g:2695:3: rule__PatternObject__NameAssignment_1
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
    // InternalMGLang.g:2704:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2708:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalMGLang.g:2709:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
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
    // InternalMGLang.g:2716:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2720:1: ( ( 'for' ) )
            // InternalMGLang.g:2721:1: ( 'for' )
            {
            // InternalMGLang.g:2721:1: ( 'for' )
            // InternalMGLang.g:2722:2: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMGLang.g:2731:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2735:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalMGLang.g:2736:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:2743:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2747:1: ( ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) )
            // InternalMGLang.g:2748:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            {
            // InternalMGLang.g:2748:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            // InternalMGLang.g:2749:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            {
             before(grammarAccess.getForLoopAccess().getIteratorVarAssignment_1()); 
            // InternalMGLang.g:2750:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            // InternalMGLang.g:2750:3: rule__ForLoop__IteratorVarAssignment_1
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
    // InternalMGLang.g:2758:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2762:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalMGLang.g:2763:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalMGLang.g:2770:1: rule__ForLoop__Group__2__Impl : ( 'in' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2774:1: ( ( 'in' ) )
            // InternalMGLang.g:2775:1: ( 'in' )
            {
            // InternalMGLang.g:2775:1: ( 'in' )
            // InternalMGLang.g:2776:2: 'in'
            {
             before(grammarAccess.getForLoopAccess().getInKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMGLang.g:2785:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2789:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalMGLang.g:2790:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
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
    // InternalMGLang.g:2797:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2801:1: ( ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) )
            // InternalMGLang.g:2802:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            {
            // InternalMGLang.g:2802:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            // InternalMGLang.g:2803:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getIteratingConditionAssignment_3()); 
            // InternalMGLang.g:2804:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            // InternalMGLang.g:2804:3: rule__ForLoop__IteratingConditionAssignment_3
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
    // InternalMGLang.g:2812:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2816:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalMGLang.g:2817:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
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
    // InternalMGLang.g:2824:1: rule__ForLoop__Group__4__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2828:1: ( ( '{' ) )
            // InternalMGLang.g:2829:1: ( '{' )
            {
            // InternalMGLang.g:2829:1: ( '{' )
            // InternalMGLang.g:2830:2: '{'
            {
             before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMGLang.g:2839:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2843:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalMGLang.g:2844:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
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
    // InternalMGLang.g:2851:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CommandsAssignment_5 )* ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2855:1: ( ( ( rule__ForLoop__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:2856:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:2856:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            // InternalMGLang.g:2857:2: ( rule__ForLoop__CommandsAssignment_5 )*
            {
             before(grammarAccess.getForLoopAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:2858:2: ( rule__ForLoop__CommandsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMGLang.g:2858:3: rule__ForLoop__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ForLoop__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMGLang.g:2866:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2870:1: ( rule__ForLoop__Group__6__Impl )
            // InternalMGLang.g:2871:2: rule__ForLoop__Group__6__Impl
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
    // InternalMGLang.g:2877:1: rule__ForLoop__Group__6__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2881:1: ( ( '}' ) )
            // InternalMGLang.g:2882:1: ( '}' )
            {
            // InternalMGLang.g:2882:1: ( '}' )
            // InternalMGLang.g:2883:2: '}'
            {
             before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMGLang.g:2893:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2897:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:2898:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:2905:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2909:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:2910:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:2910:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:2911:2: ( rule__ForRange__StartAssignment_0 )
            {
             before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            // InternalMGLang.g:2912:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:2912:3: rule__ForRange__StartAssignment_0
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
    // InternalMGLang.g:2920:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2924:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:2925:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMGLang.g:2932:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2936:1: ( ( ':' ) )
            // InternalMGLang.g:2937:1: ( ':' )
            {
            // InternalMGLang.g:2937:1: ( ':' )
            // InternalMGLang.g:2938:2: ':'
            {
             before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMGLang.g:2947:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2951:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:2952:2: rule__ForRange__Group__2__Impl
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
    // InternalMGLang.g:2958:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2962:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:2963:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:2963:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:2964:2: ( rule__ForRange__EndAssignment_2 )
            {
             before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            // InternalMGLang.g:2965:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:2965:3: rule__ForRange__EndAssignment_2
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


    // $ANTLR start "rule__MofgenFile__ImportsAssignment_0"
    // InternalMGLang.g:2974:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2978:1: ( ( ruleImport ) )
            // InternalMGLang.g:2979:2: ( ruleImport )
            {
            // InternalMGLang.g:2979:2: ( ruleImport )
            // InternalMGLang.g:2980:3: ruleImport
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
    // InternalMGLang.g:2989:1: rule__MofgenFile__PatternsAssignment_1_0 : ( rulePattern ) ;
    public final void rule__MofgenFile__PatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2993:1: ( ( rulePattern ) )
            // InternalMGLang.g:2994:2: ( rulePattern )
            {
            // InternalMGLang.g:2994:2: ( rulePattern )
            // InternalMGLang.g:2995:3: rulePattern
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
    // InternalMGLang.g:3004:1: rule__MofgenFile__GeneratorsAssignment_1_1 : ( ruleGenerator ) ;
    public final void rule__MofgenFile__GeneratorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3008:1: ( ( ruleGenerator ) )
            // InternalMGLang.g:3009:2: ( ruleGenerator )
            {
            // InternalMGLang.g:3009:2: ( ruleGenerator )
            // InternalMGLang.g:3010:3: ruleGenerator
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
    // InternalMGLang.g:3019:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3023:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:3024:2: ( RULE_STRING )
            {
            // InternalMGLang.g:3024:2: ( RULE_STRING )
            // InternalMGLang.g:3025:3: RULE_STRING
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
    // InternalMGLang.g:3034:1: rule__Import__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3038:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3039:2: ( RULE_ID )
            {
            // InternalMGLang.g:3039:2: ( RULE_ID )
            // InternalMGLang.g:3040:3: RULE_ID
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
    // InternalMGLang.g:3049:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3053:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3054:2: ( RULE_ID )
            {
            // InternalMGLang.g:3054:2: ( RULE_ID )
            // InternalMGLang.g:3055:3: RULE_ID
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
    // InternalMGLang.g:3064:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3068:1: ( ( ruleParameter ) )
            // InternalMGLang.g:3069:2: ( ruleParameter )
            {
            // InternalMGLang.g:3069:2: ( ruleParameter )
            // InternalMGLang.g:3070:3: ruleParameter
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
    // InternalMGLang.g:3079:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3083:1: ( ( ruleParameter ) )
            // InternalMGLang.g:3084:2: ( ruleParameter )
            {
            // InternalMGLang.g:3084:2: ( ruleParameter )
            // InternalMGLang.g:3085:3: ruleParameter
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
    // InternalMGLang.g:3094:1: rule__Pattern__NodesAssignment_4_0 : ( rulePatternNodeCreation ) ;
    public final void rule__Pattern__NodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3098:1: ( ( rulePatternNodeCreation ) )
            // InternalMGLang.g:3099:2: ( rulePatternNodeCreation )
            {
            // InternalMGLang.g:3099:2: ( rulePatternNodeCreation )
            // InternalMGLang.g:3100:3: rulePatternNodeCreation
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
    // InternalMGLang.g:3109:1: rule__Pattern__RefsAssignsAssignment_4_1 : ( ruleNodeReferenceOrAssignment ) ;
    public final void rule__Pattern__RefsAssignsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3113:1: ( ( ruleNodeReferenceOrAssignment ) )
            // InternalMGLang.g:3114:2: ( ruleNodeReferenceOrAssignment )
            {
            // InternalMGLang.g:3114:2: ( ruleNodeReferenceOrAssignment )
            // InternalMGLang.g:3115:3: ruleNodeReferenceOrAssignment
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
    // InternalMGLang.g:3124:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3128:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:3129:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:3129:2: ( rulePatternReturn )
            // InternalMGLang.g:3130:3: rulePatternReturn
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
    // InternalMGLang.g:3139:1: rule__PatternReturn__ThisUsedAssignment_1 : ( ( 'this' ) ) ;
    public final void rule__PatternReturn__ThisUsedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3143:1: ( ( ( 'this' ) ) )
            // InternalMGLang.g:3144:2: ( ( 'this' ) )
            {
            // InternalMGLang.g:3144:2: ( ( 'this' ) )
            // InternalMGLang.g:3145:3: ( 'this' )
            {
             before(grammarAccess.getPatternReturnAccess().getThisUsedThisKeyword_1_0()); 
            // InternalMGLang.g:3146:3: ( 'this' )
            // InternalMGLang.g:3147:4: 'this'
            {
             before(grammarAccess.getPatternReturnAccess().getThisUsedThisKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMGLang.g:3158:1: rule__PatternNodeCreation__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__PatternNodeCreation__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3162:1: ( ( ruleNode ) )
            // InternalMGLang.g:3163:2: ( ruleNode )
            {
            // InternalMGLang.g:3163:2: ( ruleNode )
            // InternalMGLang.g:3164:3: ruleNode
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
    // InternalMGLang.g:3173:1: rule__PatternNodeCreation__ConstructorAssignment_1 : ( ruleNodeConstructor ) ;
    public final void rule__PatternNodeCreation__ConstructorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3177:1: ( ( ruleNodeConstructor ) )
            // InternalMGLang.g:3178:2: ( ruleNodeConstructor )
            {
            // InternalMGLang.g:3178:2: ( ruleNodeConstructor )
            // InternalMGLang.g:3179:3: ruleNodeConstructor
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
    // InternalMGLang.g:3188:1: rule__NodeConstructor__ParamsAssignment_2 : ( RULE_ID ) ;
    public final void rule__NodeConstructor__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3192:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3193:2: ( RULE_ID )
            {
            // InternalMGLang.g:3193:2: ( RULE_ID )
            // InternalMGLang.g:3194:3: RULE_ID
            {
             before(grammarAccess.getNodeConstructorAccess().getParamsIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeConstructorAccess().getParamsIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3203:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3207:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3208:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3208:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3209:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            // InternalMGLang.g:3210:3: ( RULE_ID )
            // InternalMGLang.g:3211:4: RULE_ID
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
    // InternalMGLang.g:3222:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3226:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3227:2: ( RULE_ID )
            {
            // InternalMGLang.g:3227:2: ( RULE_ID )
            // InternalMGLang.g:3228:3: RULE_ID
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
    // InternalMGLang.g:3237:1: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__NodeReferenceOrAssignment__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3241:1: ( ( ruleCondition ) )
            // InternalMGLang.g:3242:2: ( ruleCondition )
            {
            // InternalMGLang.g:3242:2: ( ruleCondition )
            // InternalMGLang.g:3243:3: ruleCondition
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
    // InternalMGLang.g:3252:1: rule__Condition__LhsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3256:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3257:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3257:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3258:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getLhsParameterCrossReference_0_0()); 
            // InternalMGLang.g:3259:3: ( RULE_ID )
            // InternalMGLang.g:3260:4: RULE_ID
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
    // InternalMGLang.g:3271:1: rule__Condition__RelationAssignment_1_0 : ( ruleEditorRelation ) ;
    public final void rule__Condition__RelationAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3275:1: ( ( ruleEditorRelation ) )
            // InternalMGLang.g:3276:2: ( ruleEditorRelation )
            {
            // InternalMGLang.g:3276:2: ( ruleEditorRelation )
            // InternalMGLang.g:3277:3: ruleEditorRelation
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
    // InternalMGLang.g:3286:1: rule__Condition__RhsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3290:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3291:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3291:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3292:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getRhsParameterCrossReference_1_1_0()); 
            // InternalMGLang.g:3293:3: ( RULE_ID )
            // InternalMGLang.g:3294:4: RULE_ID
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
    // InternalMGLang.g:3305:1: rule__PatternNodeReference__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3309:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3310:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3310:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3311:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getSourceNodeCrossReference_0_0()); 
            // InternalMGLang.g:3312:3: ( RULE_ID )
            // InternalMGLang.g:3313:4: RULE_ID
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
    // InternalMGLang.g:3324:1: rule__PatternNodeReference__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3328:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3329:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3329:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3330:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_2_0()); 
            // InternalMGLang.g:3331:3: ( RULE_ID )
            // InternalMGLang.g:3332:4: RULE_ID
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
    // InternalMGLang.g:3343:1: rule__PatternNodeReference__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3347:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3348:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3348:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3349:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_4_0()); 
            // InternalMGLang.g:3350:3: ( RULE_ID )
            // InternalMGLang.g:3351:4: RULE_ID
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


    // $ANTLR start "rule__Assignment__ObjectAssignment_0"
    // InternalMGLang.g:3362:1: rule__Assignment__ObjectAssignment_0 : ( ruleNodeAttributeCall ) ;
    public final void rule__Assignment__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3366:1: ( ( ruleNodeAttributeCall ) )
            // InternalMGLang.g:3367:2: ( ruleNodeAttributeCall )
            {
            // InternalMGLang.g:3367:2: ( ruleNodeAttributeCall )
            // InternalMGLang.g:3368:3: ruleNodeAttributeCall
            {
             before(grammarAccess.getAssignmentAccess().getObjectNodeAttributeCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeAttributeCall();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getObjectNodeAttributeCallParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ObjectAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMGLang.g:3377:1: rule__Assignment__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3381:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3382:2: ( RULE_ID )
            {
            // InternalMGLang.g:3382:2: ( RULE_ID )
            // InternalMGLang.g:3383:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3392:1: rule__NodeAttributeCall__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3396:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3397:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3397:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3398:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getObjectNodeCrossReference_0_0()); 
            // InternalMGLang.g:3399:3: ( RULE_ID )
            // InternalMGLang.g:3400:4: RULE_ID
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
    // InternalMGLang.g:3411:1: rule__NodeAttributeCall__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3415:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3416:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3416:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3417:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeCrossReference_2_0()); 
            // InternalMGLang.g:3418:3: ( RULE_ID )
            // InternalMGLang.g:3419:4: RULE_ID
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
    // InternalMGLang.g:3430:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3434:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3435:2: ( RULE_ID )
            {
            // InternalMGLang.g:3435:2: ( RULE_ID )
            // InternalMGLang.g:3436:3: RULE_ID
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
    // InternalMGLang.g:3445:1: rule__Parameter__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3449:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3450:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3450:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3451:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeEClassifierCrossReference_2_0()); 
            // InternalMGLang.g:3452:3: ( RULE_ID )
            // InternalMGLang.g:3453:4: RULE_ID
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
    // InternalMGLang.g:3464:1: rule__Generator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3468:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3469:2: ( RULE_ID )
            {
            // InternalMGLang.g:3469:2: ( RULE_ID )
            // InternalMGLang.g:3470:3: RULE_ID
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
    // InternalMGLang.g:3479:1: rule__Generator__CommandsAssignment_5 : ( ruleGeneratorElement ) ;
    public final void rule__Generator__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3483:1: ( ( ruleGeneratorElement ) )
            // InternalMGLang.g:3484:2: ( ruleGeneratorElement )
            {
            // InternalMGLang.g:3484:2: ( ruleGeneratorElement )
            // InternalMGLang.g:3485:3: ruleGeneratorElement
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
    // InternalMGLang.g:3494:1: rule__PatternCall__CalledPatternAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledPatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3498:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3499:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3499:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3500:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternPatternCrossReference_0_0()); 
            // InternalMGLang.g:3501:3: ( RULE_ID )
            // InternalMGLang.g:3502:4: RULE_ID
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
    // InternalMGLang.g:3513:1: rule__PatternCall__ParamsAssignment_1_1 : ( rulePatternObject ) ;
    public final void rule__PatternCall__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3517:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:3518:2: ( rulePatternObject )
            {
            // InternalMGLang.g:3518:2: ( rulePatternObject )
            // InternalMGLang.g:3519:3: rulePatternObject
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
    // InternalMGLang.g:3528:1: rule__PatternObjectCreation__PObjectAssignment_0 : ( rulePatternObject ) ;
    public final void rule__PatternObjectCreation__PObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3532:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:3533:2: ( rulePatternObject )
            {
            // InternalMGLang.g:3533:2: ( rulePatternObject )
            // InternalMGLang.g:3534:3: rulePatternObject
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
    // InternalMGLang.g:3543:1: rule__PatternObjectCreation__PatternCallAssignment_2 : ( rulePatternCall ) ;
    public final void rule__PatternObjectCreation__PatternCallAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3547:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:3548:2: ( rulePatternCall )
            {
            // InternalMGLang.g:3548:2: ( rulePatternCall )
            // InternalMGLang.g:3549:3: rulePatternCall
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
    // InternalMGLang.g:3558:1: rule__PatternObject__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3562:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:3563:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:3563:2: ( ( RULE_ID ) )
            // InternalMGLang.g:3564:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 
            // InternalMGLang.g:3565:3: ( RULE_ID )
            // InternalMGLang.g:3566:4: RULE_ID
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
    // InternalMGLang.g:3577:1: rule__PatternObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3581:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3582:2: ( RULE_ID )
            {
            // InternalMGLang.g:3582:2: ( RULE_ID )
            // InternalMGLang.g:3583:3: RULE_ID
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
    // InternalMGLang.g:3592:1: rule__ForLoop__IteratorVarAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForLoop__IteratorVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3596:1: ( ( RULE_ID ) )
            // InternalMGLang.g:3597:2: ( RULE_ID )
            {
            // InternalMGLang.g:3597:2: ( RULE_ID )
            // InternalMGLang.g:3598:3: RULE_ID
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
    // InternalMGLang.g:3607:1: rule__ForLoop__IteratingConditionAssignment_3 : ( ruleForCondition ) ;
    public final void rule__ForLoop__IteratingConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3611:1: ( ( ruleForCondition ) )
            // InternalMGLang.g:3612:2: ( ruleForCondition )
            {
            // InternalMGLang.g:3612:2: ( ruleForCondition )
            // InternalMGLang.g:3613:3: ruleForCondition
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
    // InternalMGLang.g:3622:1: rule__ForLoop__CommandsAssignment_5 : ( ruleGeneratorCommand ) ;
    public final void rule__ForLoop__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3626:1: ( ( ruleGeneratorCommand ) )
            // InternalMGLang.g:3627:2: ( ruleGeneratorCommand )
            {
            // InternalMGLang.g:3627:2: ( ruleGeneratorCommand )
            // InternalMGLang.g:3628:3: ruleGeneratorCommand
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
    // InternalMGLang.g:3637:1: rule__ForEachCollection__CollAssignment : ( ruleNodeAttributeCall ) ;
    public final void rule__ForEachCollection__CollAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3641:1: ( ( ruleNodeAttributeCall ) )
            // InternalMGLang.g:3642:2: ( ruleNodeAttributeCall )
            {
            // InternalMGLang.g:3642:2: ( ruleNodeAttributeCall )
            // InternalMGLang.g:3643:3: ruleNodeAttributeCall
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
    // InternalMGLang.g:3652:1: rule__ForRange__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3656:1: ( ( RULE_INT ) )
            // InternalMGLang.g:3657:2: ( RULE_INT )
            {
            // InternalMGLang.g:3657:2: ( RULE_INT )
            // InternalMGLang.g:3658:3: RULE_INT
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
    // InternalMGLang.g:3667:1: rule__ForRange__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3671:1: ( ( RULE_INT ) )
            // InternalMGLang.g:3672:2: ( RULE_INT )
            {
            // InternalMGLang.g:3672:2: ( RULE_INT )
            // InternalMGLang.g:3673:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800800080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000082L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000100L});

}