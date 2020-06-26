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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ASSIGNMENT_OP", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'int'", "'char'", "'double'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'import'", "'as'", "'pattern'", "'{'", "'}'", "'('", "')'", "','", "'return'", "'this'", "'.'", "'['", "']'", "'->'", "'||'", "'^'", "'&&'", "'!'", "'+'", "'gen'", "'for'", "'in'", "':'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=5;
    public static final int RULE_ASSIGNMENT_OP=4;
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


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:253:1: entryRulePatternNodeReference : rulePatternNodeReference EOF ;
    public final void entryRulePatternNodeReference() throws RecognitionException {
        try {
            // InternalMGLang.g:254:1: ( rulePatternNodeReference EOF )
            // InternalMGLang.g:255:1: rulePatternNodeReference EOF
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
    // InternalMGLang.g:262:1: rulePatternNodeReference : ( ( rule__PatternNodeReference__Group__0 ) ) ;
    public final void rulePatternNodeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:266:2: ( ( ( rule__PatternNodeReference__Group__0 ) ) )
            // InternalMGLang.g:267:2: ( ( rule__PatternNodeReference__Group__0 ) )
            {
            // InternalMGLang.g:267:2: ( ( rule__PatternNodeReference__Group__0 ) )
            // InternalMGLang.g:268:3: ( rule__PatternNodeReference__Group__0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 
            // InternalMGLang.g:269:3: ( rule__PatternNodeReference__Group__0 )
            // InternalMGLang.g:269:4: rule__PatternNodeReference__Group__0
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
    // InternalMGLang.g:278:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:279:1: ( ruleAssignment EOF )
            // InternalMGLang.g:280:1: ruleAssignment EOF
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
    // InternalMGLang.g:287:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:291:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMGLang.g:292:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMGLang.g:292:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMGLang.g:293:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMGLang.g:294:3: ( rule__Assignment__Group__0 )
            // InternalMGLang.g:294:4: rule__Assignment__Group__0
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
    // InternalMGLang.g:303:1: entryRuleNodeAttributeCall : ruleNodeAttributeCall EOF ;
    public final void entryRuleNodeAttributeCall() throws RecognitionException {
        try {
            // InternalMGLang.g:304:1: ( ruleNodeAttributeCall EOF )
            // InternalMGLang.g:305:1: ruleNodeAttributeCall EOF
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
    // InternalMGLang.g:312:1: ruleNodeAttributeCall : ( ( rule__NodeAttributeCall__Group__0 ) ) ;
    public final void ruleNodeAttributeCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:316:2: ( ( ( rule__NodeAttributeCall__Group__0 ) ) )
            // InternalMGLang.g:317:2: ( ( rule__NodeAttributeCall__Group__0 ) )
            {
            // InternalMGLang.g:317:2: ( ( rule__NodeAttributeCall__Group__0 ) )
            // InternalMGLang.g:318:3: ( rule__NodeAttributeCall__Group__0 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getGroup()); 
            // InternalMGLang.g:319:3: ( rule__NodeAttributeCall__Group__0 )
            // InternalMGLang.g:319:4: rule__NodeAttributeCall__Group__0
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
    // InternalMGLang.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:329:1: ( ruleParameter EOF )
            // InternalMGLang.g:330:1: ruleParameter EOF
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
    // InternalMGLang.g:337:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:341:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalMGLang.g:342:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalMGLang.g:342:2: ( ( rule__Parameter__Alternatives ) )
            // InternalMGLang.g:343:3: ( rule__Parameter__Alternatives )
            {
             before(grammarAccess.getParameterAccess().getAlternatives()); 
            // InternalMGLang.g:344:3: ( rule__Parameter__Alternatives )
            // InternalMGLang.g:344:4: rule__Parameter__Alternatives
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
    // InternalMGLang.g:353:1: entryRulePrimitiveParameter : rulePrimitiveParameter EOF ;
    public final void entryRulePrimitiveParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:354:1: ( rulePrimitiveParameter EOF )
            // InternalMGLang.g:355:1: rulePrimitiveParameter EOF
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
    // InternalMGLang.g:362:1: rulePrimitiveParameter : ( ( rule__PrimitiveParameter__Group__0 ) ) ;
    public final void rulePrimitiveParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:366:2: ( ( ( rule__PrimitiveParameter__Group__0 ) ) )
            // InternalMGLang.g:367:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            {
            // InternalMGLang.g:367:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            // InternalMGLang.g:368:3: ( rule__PrimitiveParameter__Group__0 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getGroup()); 
            // InternalMGLang.g:369:3: ( rule__PrimitiveParameter__Group__0 )
            // InternalMGLang.g:369:4: rule__PrimitiveParameter__Group__0
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
    // InternalMGLang.g:378:1: entryRuleObjectParameter : ruleObjectParameter EOF ;
    public final void entryRuleObjectParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:379:1: ( ruleObjectParameter EOF )
            // InternalMGLang.g:380:1: ruleObjectParameter EOF
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
    // InternalMGLang.g:387:1: ruleObjectParameter : ( ( rule__ObjectParameter__Group__0 ) ) ;
    public final void ruleObjectParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:391:2: ( ( ( rule__ObjectParameter__Group__0 ) ) )
            // InternalMGLang.g:392:2: ( ( rule__ObjectParameter__Group__0 ) )
            {
            // InternalMGLang.g:392:2: ( ( rule__ObjectParameter__Group__0 ) )
            // InternalMGLang.g:393:3: ( rule__ObjectParameter__Group__0 )
            {
             before(grammarAccess.getObjectParameterAccess().getGroup()); 
            // InternalMGLang.g:394:3: ( rule__ObjectParameter__Group__0 )
            // InternalMGLang.g:394:4: rule__ObjectParameter__Group__0
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


    // $ANTLR start "entryRuleParameterOrMethodCall"
    // InternalMGLang.g:403:1: entryRuleParameterOrMethodCall : ruleParameterOrMethodCall EOF ;
    public final void entryRuleParameterOrMethodCall() throws RecognitionException {
        try {
            // InternalMGLang.g:404:1: ( ruleParameterOrMethodCall EOF )
            // InternalMGLang.g:405:1: ruleParameterOrMethodCall EOF
            {
             before(grammarAccess.getParameterOrMethodCallRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterOrMethodCall();

            state._fsp--;

             after(grammarAccess.getParameterOrMethodCallRule()); 
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
    // $ANTLR end "entryRuleParameterOrMethodCall"


    // $ANTLR start "ruleParameterOrMethodCall"
    // InternalMGLang.g:412:1: ruleParameterOrMethodCall : ( ( rule__ParameterOrMethodCall__Alternatives ) ) ;
    public final void ruleParameterOrMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:416:2: ( ( ( rule__ParameterOrMethodCall__Alternatives ) ) )
            // InternalMGLang.g:417:2: ( ( rule__ParameterOrMethodCall__Alternatives ) )
            {
            // InternalMGLang.g:417:2: ( ( rule__ParameterOrMethodCall__Alternatives ) )
            // InternalMGLang.g:418:3: ( rule__ParameterOrMethodCall__Alternatives )
            {
             before(grammarAccess.getParameterOrMethodCallAccess().getAlternatives()); 
            // InternalMGLang.g:419:3: ( rule__ParameterOrMethodCall__Alternatives )
            // InternalMGLang.g:419:4: rule__ParameterOrMethodCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterOrMethodCall__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterOrMethodCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterOrMethodCall"


    // $ANTLR start "entryRuleParameterRef"
    // InternalMGLang.g:428:1: entryRuleParameterRef : ruleParameterRef EOF ;
    public final void entryRuleParameterRef() throws RecognitionException {
        try {
            // InternalMGLang.g:429:1: ( ruleParameterRef EOF )
            // InternalMGLang.g:430:1: ruleParameterRef EOF
            {
             before(grammarAccess.getParameterRefRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterRef();

            state._fsp--;

             after(grammarAccess.getParameterRefRule()); 
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
    // $ANTLR end "entryRuleParameterRef"


    // $ANTLR start "ruleParameterRef"
    // InternalMGLang.g:437:1: ruleParameterRef : ( ( rule__ParameterRef__RefAssignment ) ) ;
    public final void ruleParameterRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:441:2: ( ( ( rule__ParameterRef__RefAssignment ) ) )
            // InternalMGLang.g:442:2: ( ( rule__ParameterRef__RefAssignment ) )
            {
            // InternalMGLang.g:442:2: ( ( rule__ParameterRef__RefAssignment ) )
            // InternalMGLang.g:443:3: ( rule__ParameterRef__RefAssignment )
            {
             before(grammarAccess.getParameterRefAccess().getRefAssignment()); 
            // InternalMGLang.g:444:3: ( rule__ParameterRef__RefAssignment )
            // InternalMGLang.g:444:4: rule__ParameterRef__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRef__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterRefAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterRef"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMGLang.g:453:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalMGLang.g:454:1: ( ruleMethodCall EOF )
            // InternalMGLang.g:455:1: ruleMethodCall EOF
            {
             before(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getMethodCallRule()); 
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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMGLang.g:462:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:466:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalMGLang.g:467:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalMGLang.g:467:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalMGLang.g:468:3: ( rule__MethodCall__Group__0 )
            {
             before(grammarAccess.getMethodCallAccess().getGroup()); 
            // InternalMGLang.g:469:3: ( rule__MethodCall__Group__0 )
            // InternalMGLang.g:469:4: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalMGLang.g:478:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:479:1: ( ruleBooleanExpression EOF )
            // InternalMGLang.g:480:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalMGLang.g:487:1: ruleBooleanExpression : ( ruleBooleanOr ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:491:2: ( ( ruleBooleanOr ) )
            // InternalMGLang.g:492:2: ( ruleBooleanOr )
            {
            // InternalMGLang.g:492:2: ( ruleBooleanOr )
            // InternalMGLang.g:493:3: ruleBooleanOr
            {
             before(grammarAccess.getBooleanExpressionAccess().getBooleanOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOr();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getBooleanOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleRelationExpression"
    // InternalMGLang.g:503:1: entryRuleRelationExpression : ruleRelationExpression EOF ;
    public final void entryRuleRelationExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:504:1: ( ruleRelationExpression EOF )
            // InternalMGLang.g:505:1: ruleRelationExpression EOF
            {
             before(grammarAccess.getRelationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationExpression();

            state._fsp--;

             after(grammarAccess.getRelationExpressionRule()); 
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
    // $ANTLR end "entryRuleRelationExpression"


    // $ANTLR start "ruleRelationExpression"
    // InternalMGLang.g:512:1: ruleRelationExpression : ( ( rule__RelationExpression__Group__0 ) ) ;
    public final void ruleRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:516:2: ( ( ( rule__RelationExpression__Group__0 ) ) )
            // InternalMGLang.g:517:2: ( ( rule__RelationExpression__Group__0 ) )
            {
            // InternalMGLang.g:517:2: ( ( rule__RelationExpression__Group__0 ) )
            // InternalMGLang.g:518:3: ( rule__RelationExpression__Group__0 )
            {
             before(grammarAccess.getRelationExpressionAccess().getGroup()); 
            // InternalMGLang.g:519:3: ( rule__RelationExpression__Group__0 )
            // InternalMGLang.g:519:4: rule__RelationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationExpression"


    // $ANTLR start "entryRuleBooleanOr"
    // InternalMGLang.g:528:1: entryRuleBooleanOr : ruleBooleanOr EOF ;
    public final void entryRuleBooleanOr() throws RecognitionException {
        try {
            // InternalMGLang.g:529:1: ( ruleBooleanOr EOF )
            // InternalMGLang.g:530:1: ruleBooleanOr EOF
            {
             before(grammarAccess.getBooleanOrRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanOr();

            state._fsp--;

             after(grammarAccess.getBooleanOrRule()); 
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
    // $ANTLR end "entryRuleBooleanOr"


    // $ANTLR start "ruleBooleanOr"
    // InternalMGLang.g:537:1: ruleBooleanOr : ( ( rule__BooleanOr__Group__0 ) ) ;
    public final void ruleBooleanOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:541:2: ( ( ( rule__BooleanOr__Group__0 ) ) )
            // InternalMGLang.g:542:2: ( ( rule__BooleanOr__Group__0 ) )
            {
            // InternalMGLang.g:542:2: ( ( rule__BooleanOr__Group__0 ) )
            // InternalMGLang.g:543:3: ( rule__BooleanOr__Group__0 )
            {
             before(grammarAccess.getBooleanOrAccess().getGroup()); 
            // InternalMGLang.g:544:3: ( rule__BooleanOr__Group__0 )
            // InternalMGLang.g:544:4: rule__BooleanOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOr"


    // $ANTLR start "entryRuleBooleanXor"
    // InternalMGLang.g:553:1: entryRuleBooleanXor : ruleBooleanXor EOF ;
    public final void entryRuleBooleanXor() throws RecognitionException {
        try {
            // InternalMGLang.g:554:1: ( ruleBooleanXor EOF )
            // InternalMGLang.g:555:1: ruleBooleanXor EOF
            {
             before(grammarAccess.getBooleanXorRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanXor();

            state._fsp--;

             after(grammarAccess.getBooleanXorRule()); 
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
    // $ANTLR end "entryRuleBooleanXor"


    // $ANTLR start "ruleBooleanXor"
    // InternalMGLang.g:562:1: ruleBooleanXor : ( ( rule__BooleanXor__Group__0 ) ) ;
    public final void ruleBooleanXor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:566:2: ( ( ( rule__BooleanXor__Group__0 ) ) )
            // InternalMGLang.g:567:2: ( ( rule__BooleanXor__Group__0 ) )
            {
            // InternalMGLang.g:567:2: ( ( rule__BooleanXor__Group__0 ) )
            // InternalMGLang.g:568:3: ( rule__BooleanXor__Group__0 )
            {
             before(grammarAccess.getBooleanXorAccess().getGroup()); 
            // InternalMGLang.g:569:3: ( rule__BooleanXor__Group__0 )
            // InternalMGLang.g:569:4: rule__BooleanXor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanXor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanXorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanXor"


    // $ANTLR start "entryRuleBooleanAnd"
    // InternalMGLang.g:578:1: entryRuleBooleanAnd : ruleBooleanAnd EOF ;
    public final void entryRuleBooleanAnd() throws RecognitionException {
        try {
            // InternalMGLang.g:579:1: ( ruleBooleanAnd EOF )
            // InternalMGLang.g:580:1: ruleBooleanAnd EOF
            {
             before(grammarAccess.getBooleanAndRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanAnd();

            state._fsp--;

             after(grammarAccess.getBooleanAndRule()); 
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
    // $ANTLR end "entryRuleBooleanAnd"


    // $ANTLR start "ruleBooleanAnd"
    // InternalMGLang.g:587:1: ruleBooleanAnd : ( ( rule__BooleanAnd__Group__0 ) ) ;
    public final void ruleBooleanAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:591:2: ( ( ( rule__BooleanAnd__Group__0 ) ) )
            // InternalMGLang.g:592:2: ( ( rule__BooleanAnd__Group__0 ) )
            {
            // InternalMGLang.g:592:2: ( ( rule__BooleanAnd__Group__0 ) )
            // InternalMGLang.g:593:3: ( rule__BooleanAnd__Group__0 )
            {
             before(grammarAccess.getBooleanAndAccess().getGroup()); 
            // InternalMGLang.g:594:3: ( rule__BooleanAnd__Group__0 )
            // InternalMGLang.g:594:4: rule__BooleanAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanAnd"


    // $ANTLR start "entryRuleBaseBoolean"
    // InternalMGLang.g:603:1: entryRuleBaseBoolean : ruleBaseBoolean EOF ;
    public final void entryRuleBaseBoolean() throws RecognitionException {
        try {
            // InternalMGLang.g:604:1: ( ruleBaseBoolean EOF )
            // InternalMGLang.g:605:1: ruleBaseBoolean EOF
            {
             before(grammarAccess.getBaseBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseBoolean();

            state._fsp--;

             after(grammarAccess.getBaseBooleanRule()); 
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
    // $ANTLR end "entryRuleBaseBoolean"


    // $ANTLR start "ruleBaseBoolean"
    // InternalMGLang.g:612:1: ruleBaseBoolean : ( ( rule__BaseBoolean__Alternatives ) ) ;
    public final void ruleBaseBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:616:2: ( ( ( rule__BaseBoolean__Alternatives ) ) )
            // InternalMGLang.g:617:2: ( ( rule__BaseBoolean__Alternatives ) )
            {
            // InternalMGLang.g:617:2: ( ( rule__BaseBoolean__Alternatives ) )
            // InternalMGLang.g:618:3: ( rule__BaseBoolean__Alternatives )
            {
             before(grammarAccess.getBaseBooleanAccess().getAlternatives()); 
            // InternalMGLang.g:619:3: ( rule__BaseBoolean__Alternatives )
            // InternalMGLang.g:619:4: rule__BaseBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseBoolean"


    // $ANTLR start "entryRuleStringExpression"
    // InternalMGLang.g:628:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:629:1: ( ruleStringExpression EOF )
            // InternalMGLang.g:630:1: ruleStringExpression EOF
            {
             before(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getStringExpressionRule()); 
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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalMGLang.g:637:1: ruleStringExpression : ( ruleStringConcatenation ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:641:2: ( ( ruleStringConcatenation ) )
            // InternalMGLang.g:642:2: ( ruleStringConcatenation )
            {
            // InternalMGLang.g:642:2: ( ruleStringConcatenation )
            // InternalMGLang.g:643:3: ruleStringConcatenation
            {
             before(grammarAccess.getStringExpressionAccess().getStringConcatenationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleStringConcatenation();

            state._fsp--;

             after(grammarAccess.getStringExpressionAccess().getStringConcatenationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleStringConcatenation"
    // InternalMGLang.g:653:1: entryRuleStringConcatenation : ruleStringConcatenation EOF ;
    public final void entryRuleStringConcatenation() throws RecognitionException {
        try {
            // InternalMGLang.g:654:1: ( ruleStringConcatenation EOF )
            // InternalMGLang.g:655:1: ruleStringConcatenation EOF
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
    // InternalMGLang.g:662:1: ruleStringConcatenation : ( ( rule__StringConcatenation__Group__0 ) ) ;
    public final void ruleStringConcatenation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:666:2: ( ( ( rule__StringConcatenation__Group__0 ) ) )
            // InternalMGLang.g:667:2: ( ( rule__StringConcatenation__Group__0 ) )
            {
            // InternalMGLang.g:667:2: ( ( rule__StringConcatenation__Group__0 ) )
            // InternalMGLang.g:668:3: ( rule__StringConcatenation__Group__0 )
            {
             before(grammarAccess.getStringConcatenationAccess().getGroup()); 
            // InternalMGLang.g:669:3: ( rule__StringConcatenation__Group__0 )
            // InternalMGLang.g:669:4: rule__StringConcatenation__Group__0
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
    // InternalMGLang.g:678:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:679:1: ( ruleStringLiteral EOF )
            // InternalMGLang.g:680:1: ruleStringLiteral EOF
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
    // InternalMGLang.g:687:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:691:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMGLang.g:692:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMGLang.g:692:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMGLang.g:693:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMGLang.g:694:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMGLang.g:694:4: rule__StringLiteral__ValueAssignment
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
    // InternalMGLang.g:703:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalMGLang.g:704:1: ( ruleGenerator EOF )
            // InternalMGLang.g:705:1: ruleGenerator EOF
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
    // InternalMGLang.g:712:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:716:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalMGLang.g:717:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalMGLang.g:717:2: ( ( rule__Generator__Group__0 ) )
            // InternalMGLang.g:718:3: ( rule__Generator__Group__0 )
            {
             before(grammarAccess.getGeneratorAccess().getGroup()); 
            // InternalMGLang.g:719:3: ( rule__Generator__Group__0 )
            // InternalMGLang.g:719:4: rule__Generator__Group__0
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
    // InternalMGLang.g:728:1: entryRuleGeneratorElement : ruleGeneratorElement EOF ;
    public final void entryRuleGeneratorElement() throws RecognitionException {
        try {
            // InternalMGLang.g:729:1: ( ruleGeneratorElement EOF )
            // InternalMGLang.g:730:1: ruleGeneratorElement EOF
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
    // InternalMGLang.g:737:1: ruleGeneratorElement : ( ( rule__GeneratorElement__Alternatives ) ) ;
    public final void ruleGeneratorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:741:2: ( ( ( rule__GeneratorElement__Alternatives ) ) )
            // InternalMGLang.g:742:2: ( ( rule__GeneratorElement__Alternatives ) )
            {
            // InternalMGLang.g:742:2: ( ( rule__GeneratorElement__Alternatives ) )
            // InternalMGLang.g:743:3: ( rule__GeneratorElement__Alternatives )
            {
             before(grammarAccess.getGeneratorElementAccess().getAlternatives()); 
            // InternalMGLang.g:744:3: ( rule__GeneratorElement__Alternatives )
            // InternalMGLang.g:744:4: rule__GeneratorElement__Alternatives
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
    // InternalMGLang.g:753:1: entryRuleGeneratorCommand : ruleGeneratorCommand EOF ;
    public final void entryRuleGeneratorCommand() throws RecognitionException {
        try {
            // InternalMGLang.g:754:1: ( ruleGeneratorCommand EOF )
            // InternalMGLang.g:755:1: ruleGeneratorCommand EOF
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
    // InternalMGLang.g:762:1: ruleGeneratorCommand : ( ( rule__GeneratorCommand__Alternatives ) ) ;
    public final void ruleGeneratorCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:766:2: ( ( ( rule__GeneratorCommand__Alternatives ) ) )
            // InternalMGLang.g:767:2: ( ( rule__GeneratorCommand__Alternatives ) )
            {
            // InternalMGLang.g:767:2: ( ( rule__GeneratorCommand__Alternatives ) )
            // InternalMGLang.g:768:3: ( rule__GeneratorCommand__Alternatives )
            {
             before(grammarAccess.getGeneratorCommandAccess().getAlternatives()); 
            // InternalMGLang.g:769:3: ( rule__GeneratorCommand__Alternatives )
            // InternalMGLang.g:769:4: rule__GeneratorCommand__Alternatives
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
    // InternalMGLang.g:778:1: entryRulePatternObjectCreation : rulePatternObjectCreation EOF ;
    public final void entryRulePatternObjectCreation() throws RecognitionException {
        try {
            // InternalMGLang.g:779:1: ( rulePatternObjectCreation EOF )
            // InternalMGLang.g:780:1: rulePatternObjectCreation EOF
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
    // InternalMGLang.g:787:1: rulePatternObjectCreation : ( ( rule__PatternObjectCreation__Group__0 ) ) ;
    public final void rulePatternObjectCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:791:2: ( ( ( rule__PatternObjectCreation__Group__0 ) ) )
            // InternalMGLang.g:792:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            {
            // InternalMGLang.g:792:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            // InternalMGLang.g:793:3: ( rule__PatternObjectCreation__Group__0 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getGroup()); 
            // InternalMGLang.g:794:3: ( rule__PatternObjectCreation__Group__0 )
            // InternalMGLang.g:794:4: rule__PatternObjectCreation__Group__0
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
    // InternalMGLang.g:803:1: entryRulePatternObject : rulePatternObject EOF ;
    public final void entryRulePatternObject() throws RecognitionException {
        try {
            // InternalMGLang.g:804:1: ( rulePatternObject EOF )
            // InternalMGLang.g:805:1: rulePatternObject EOF
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
    // InternalMGLang.g:812:1: rulePatternObject : ( ( rule__PatternObject__Group__0 ) ) ;
    public final void rulePatternObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:816:2: ( ( ( rule__PatternObject__Group__0 ) ) )
            // InternalMGLang.g:817:2: ( ( rule__PatternObject__Group__0 ) )
            {
            // InternalMGLang.g:817:2: ( ( rule__PatternObject__Group__0 ) )
            // InternalMGLang.g:818:3: ( rule__PatternObject__Group__0 )
            {
             before(grammarAccess.getPatternObjectAccess().getGroup()); 
            // InternalMGLang.g:819:3: ( rule__PatternObject__Group__0 )
            // InternalMGLang.g:819:4: rule__PatternObject__Group__0
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
    // InternalMGLang.g:828:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalMGLang.g:829:1: ( ruleForLoop EOF )
            // InternalMGLang.g:830:1: ruleForLoop EOF
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
    // InternalMGLang.g:837:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:841:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalMGLang.g:842:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalMGLang.g:842:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalMGLang.g:843:3: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalMGLang.g:844:3: ( rule__ForLoop__Group__0 )
            // InternalMGLang.g:844:4: rule__ForLoop__Group__0
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
    // InternalMGLang.g:853:1: entryRuleForCondition : ruleForCondition EOF ;
    public final void entryRuleForCondition() throws RecognitionException {
        try {
            // InternalMGLang.g:854:1: ( ruleForCondition EOF )
            // InternalMGLang.g:855:1: ruleForCondition EOF
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
    // InternalMGLang.g:862:1: ruleForCondition : ( ( rule__ForCondition__Alternatives ) ) ;
    public final void ruleForCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:866:2: ( ( ( rule__ForCondition__Alternatives ) ) )
            // InternalMGLang.g:867:2: ( ( rule__ForCondition__Alternatives ) )
            {
            // InternalMGLang.g:867:2: ( ( rule__ForCondition__Alternatives ) )
            // InternalMGLang.g:868:3: ( rule__ForCondition__Alternatives )
            {
             before(grammarAccess.getForConditionAccess().getAlternatives()); 
            // InternalMGLang.g:869:3: ( rule__ForCondition__Alternatives )
            // InternalMGLang.g:869:4: rule__ForCondition__Alternatives
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
    // InternalMGLang.g:878:1: entryRuleForEachCollection : ruleForEachCollection EOF ;
    public final void entryRuleForEachCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:879:1: ( ruleForEachCollection EOF )
            // InternalMGLang.g:880:1: ruleForEachCollection EOF
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
    // InternalMGLang.g:887:1: ruleForEachCollection : ( ( rule__ForEachCollection__CollAssignment ) ) ;
    public final void ruleForEachCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:891:2: ( ( ( rule__ForEachCollection__CollAssignment ) ) )
            // InternalMGLang.g:892:2: ( ( rule__ForEachCollection__CollAssignment ) )
            {
            // InternalMGLang.g:892:2: ( ( rule__ForEachCollection__CollAssignment ) )
            // InternalMGLang.g:893:3: ( rule__ForEachCollection__CollAssignment )
            {
             before(grammarAccess.getForEachCollectionAccess().getCollAssignment()); 
            // InternalMGLang.g:894:3: ( rule__ForEachCollection__CollAssignment )
            // InternalMGLang.g:894:4: rule__ForEachCollection__CollAssignment
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
    // InternalMGLang.g:903:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:904:1: ( ruleForRange EOF )
            // InternalMGLang.g:905:1: ruleForRange EOF
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
    // InternalMGLang.g:912:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:916:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:917:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:917:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:918:3: ( rule__ForRange__Group__0 )
            {
             before(grammarAccess.getForRangeAccess().getGroup()); 
            // InternalMGLang.g:919:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:919:4: rule__ForRange__Group__0
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


    // $ANTLR start "ruleBoolean"
    // InternalMGLang.g:928:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:932:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalMGLang.g:933:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalMGLang.g:933:2: ( ( rule__Boolean__Alternatives ) )
            // InternalMGLang.g:934:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalMGLang.g:935:3: ( rule__Boolean__Alternatives )
            // InternalMGLang.g:935:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rulePrimitiveType"
    // InternalMGLang.g:944:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:948:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMGLang.g:949:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMGLang.g:949:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMGLang.g:950:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalMGLang.g:951:3: ( rule__PrimitiveType__Alternatives )
            // InternalMGLang.g:951:4: rule__PrimitiveType__Alternatives
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


    // $ANTLR start "ruleRelationalOp"
    // InternalMGLang.g:960:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:964:1: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // InternalMGLang.g:965:2: ( ( rule__RelationalOp__Alternatives ) )
            {
            // InternalMGLang.g:965:2: ( ( rule__RelationalOp__Alternatives ) )
            // InternalMGLang.g:966:3: ( rule__RelationalOp__Alternatives )
            {
             before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            // InternalMGLang.g:967:3: ( rule__RelationalOp__Alternatives )
            // InternalMGLang.g:967:4: rule__RelationalOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "rule__MofgenFile__Alternatives_1"
    // InternalMGLang.g:975:1: rule__MofgenFile__Alternatives_1 : ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) );
    public final void rule__MofgenFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:979:1: ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==43) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGLang.g:980:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    {
                    // InternalMGLang.g:980:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    // InternalMGLang.g:981:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 
                    // InternalMGLang.g:982:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    // InternalMGLang.g:982:4: rule__MofgenFile__PatternsAssignment_1_0
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
                    // InternalMGLang.g:986:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    {
                    // InternalMGLang.g:986:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    // InternalMGLang.g:987:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    {
                     before(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 
                    // InternalMGLang.g:988:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    // InternalMGLang.g:988:4: rule__MofgenFile__GeneratorsAssignment_1_1
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
    // InternalMGLang.g:996:1: rule__Node__CreatedByAlternatives_2_0 : ( ( ruleNodeConstructor ) | ( rulePatternCall ) );
    public final void rule__Node__CreatedByAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1000:1: ( ( ruleNodeConstructor ) | ( rulePatternCall ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
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
                    // InternalMGLang.g:1001:2: ( ruleNodeConstructor )
                    {
                    // InternalMGLang.g:1001:2: ( ruleNodeConstructor )
                    // InternalMGLang.g:1002:3: ruleNodeConstructor
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
                    // InternalMGLang.g:1007:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1007:2: ( rulePatternCall )
                    // InternalMGLang.g:1008:3: rulePatternCall
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
    // InternalMGLang.g:1017:1: rule__NodeReferenceOrAssignment__Alternatives_0 : ( ( rulePatternNodeReference ) | ( ruleAssignment ) );
    public final void rule__NodeReferenceOrAssignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1021:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==37) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ASSIGNMENT_OP) ) {
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
                    // InternalMGLang.g:1022:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:1022:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:1023:3: rulePatternNodeReference
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
                    // InternalMGLang.g:1028:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:1028:2: ( ruleAssignment )
                    // InternalMGLang.g:1029:3: ruleAssignment
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
    // InternalMGLang.g:1038:1: rule__Parameter__Alternatives : ( ( rulePrimitiveParameter ) | ( ruleObjectParameter ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1042:1: ( ( rulePrimitiveParameter ) | ( ruleObjectParameter ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=17)) ) {
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
                    // InternalMGLang.g:1043:2: ( rulePrimitiveParameter )
                    {
                    // InternalMGLang.g:1043:2: ( rulePrimitiveParameter )
                    // InternalMGLang.g:1044:3: rulePrimitiveParameter
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
                    // InternalMGLang.g:1049:2: ( ruleObjectParameter )
                    {
                    // InternalMGLang.g:1049:2: ( ruleObjectParameter )
                    // InternalMGLang.g:1050:3: ruleObjectParameter
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


    // $ANTLR start "rule__ParameterOrMethodCall__Alternatives"
    // InternalMGLang.g:1059:1: rule__ParameterOrMethodCall__Alternatives : ( ( ruleParameterRef ) | ( ruleMethodCall ) );
    public final void rule__ParameterOrMethodCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1063:1: ( ( ruleParameterRef ) | ( ruleMethodCall ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==34) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||(LA5_1>=18 && LA5_1<=23)||LA5_1==30||LA5_1==36||(LA5_1>=38 && LA5_1<=40)) ) {
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
                    // InternalMGLang.g:1064:2: ( ruleParameterRef )
                    {
                    // InternalMGLang.g:1064:2: ( ruleParameterRef )
                    // InternalMGLang.g:1065:3: ruleParameterRef
                    {
                     before(grammarAccess.getParameterOrMethodCallAccess().getParameterRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterRef();

                    state._fsp--;

                     after(grammarAccess.getParameterOrMethodCallAccess().getParameterRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1070:2: ( ruleMethodCall )
                    {
                    // InternalMGLang.g:1070:2: ( ruleMethodCall )
                    // InternalMGLang.g:1071:3: ruleMethodCall
                    {
                     before(grammarAccess.getParameterOrMethodCallAccess().getMethodCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodCall();

                    state._fsp--;

                     after(grammarAccess.getParameterOrMethodCallAccess().getMethodCallParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParameterOrMethodCall__Alternatives"


    // $ANTLR start "rule__BaseBoolean__Alternatives"
    // InternalMGLang.g:1080:1: rule__BaseBoolean__Alternatives : ( ( ( rule__BaseBoolean__Group_0__0 ) ) | ( ( rule__BaseBoolean__Group_1__0 ) ) | ( ( rule__BaseBoolean__Group_2__0 ) ) | ( ruleRelationExpression ) );
    public final void rule__BaseBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1084:1: ( ( ( rule__BaseBoolean__Group_0__0 ) ) | ( ( rule__BaseBoolean__Group_1__0 ) ) | ( ( rule__BaseBoolean__Group_2__0 ) ) | ( ruleRelationExpression ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 13:
            case 14:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:1085:2: ( ( rule__BaseBoolean__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1085:2: ( ( rule__BaseBoolean__Group_0__0 ) )
                    // InternalMGLang.g:1086:3: ( rule__BaseBoolean__Group_0__0 )
                    {
                     before(grammarAccess.getBaseBooleanAccess().getGroup_0()); 
                    // InternalMGLang.g:1087:3: ( rule__BaseBoolean__Group_0__0 )
                    // InternalMGLang.g:1087:4: rule__BaseBoolean__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseBoolean__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseBooleanAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1091:2: ( ( rule__BaseBoolean__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1091:2: ( ( rule__BaseBoolean__Group_1__0 ) )
                    // InternalMGLang.g:1092:3: ( rule__BaseBoolean__Group_1__0 )
                    {
                     before(grammarAccess.getBaseBooleanAccess().getGroup_1()); 
                    // InternalMGLang.g:1093:3: ( rule__BaseBoolean__Group_1__0 )
                    // InternalMGLang.g:1093:4: rule__BaseBoolean__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseBoolean__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseBooleanAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1097:2: ( ( rule__BaseBoolean__Group_2__0 ) )
                    {
                    // InternalMGLang.g:1097:2: ( ( rule__BaseBoolean__Group_2__0 ) )
                    // InternalMGLang.g:1098:3: ( rule__BaseBoolean__Group_2__0 )
                    {
                     before(grammarAccess.getBaseBooleanAccess().getGroup_2()); 
                    // InternalMGLang.g:1099:3: ( rule__BaseBoolean__Group_2__0 )
                    // InternalMGLang.g:1099:4: rule__BaseBoolean__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseBoolean__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseBooleanAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1103:2: ( ruleRelationExpression )
                    {
                    // InternalMGLang.g:1103:2: ( ruleRelationExpression )
                    // InternalMGLang.g:1104:3: ruleRelationExpression
                    {
                     before(grammarAccess.getBaseBooleanAccess().getRelationExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationExpression();

                    state._fsp--;

                     after(grammarAccess.getBaseBooleanAccess().getRelationExpressionParserRuleCall_3()); 

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
    // $ANTLR end "rule__BaseBoolean__Alternatives"


    // $ANTLR start "rule__GeneratorElement__Alternatives"
    // InternalMGLang.g:1113:1: rule__GeneratorElement__Alternatives : ( ( ruleGeneratorCommand ) | ( ruleForLoop ) );
    public final void rule__GeneratorElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1117:1: ( ( ruleGeneratorCommand ) | ( ruleForLoop ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:1118:2: ( ruleGeneratorCommand )
                    {
                    // InternalMGLang.g:1118:2: ( ruleGeneratorCommand )
                    // InternalMGLang.g:1119:3: ruleGeneratorCommand
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
                    // InternalMGLang.g:1124:2: ( ruleForLoop )
                    {
                    // InternalMGLang.g:1124:2: ( ruleForLoop )
                    // InternalMGLang.g:1125:3: ruleForLoop
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
    // InternalMGLang.g:1134:1: rule__GeneratorCommand__Alternatives : ( ( rulePatternCall ) | ( rulePatternObjectCreation ) );
    public final void rule__GeneratorCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1138:1: ( ( rulePatternCall ) | ( rulePatternObjectCreation ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==29) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
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
                    // InternalMGLang.g:1139:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1139:2: ( rulePatternCall )
                    // InternalMGLang.g:1140:3: rulePatternCall
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
                    // InternalMGLang.g:1145:2: ( rulePatternObjectCreation )
                    {
                    // InternalMGLang.g:1145:2: ( rulePatternObjectCreation )
                    // InternalMGLang.g:1146:3: rulePatternObjectCreation
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
    // InternalMGLang.g:1155:1: rule__ForCondition__Alternatives : ( ( ruleForEachCollection ) | ( ruleForRange ) );
    public final void rule__ForCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1159:1: ( ( ruleForEachCollection ) | ( ruleForRange ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:1160:2: ( ruleForEachCollection )
                    {
                    // InternalMGLang.g:1160:2: ( ruleForEachCollection )
                    // InternalMGLang.g:1161:3: ruleForEachCollection
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
                    // InternalMGLang.g:1166:2: ( ruleForRange )
                    {
                    // InternalMGLang.g:1166:2: ( ruleForRange )
                    // InternalMGLang.g:1167:3: ruleForRange
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


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalMGLang.g:1176:1: rule__Boolean__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1180:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:1181:2: ( ( 'true' ) )
                    {
                    // InternalMGLang.g:1181:2: ( ( 'true' ) )
                    // InternalMGLang.g:1182:3: ( 'true' )
                    {
                     before(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:1183:3: ( 'true' )
                    // InternalMGLang.g:1183:4: 'true'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1187:2: ( ( 'false' ) )
                    {
                    // InternalMGLang.g:1187:2: ( ( 'false' ) )
                    // InternalMGLang.g:1188:3: ( 'false' )
                    {
                     before(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:1189:3: ( 'false' )
                    // InternalMGLang.g:1189:4: 'false'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalMGLang.g:1197:1: rule__PrimitiveType__Alternatives : ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1201:1: ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:1202:2: ( ( 'int' ) )
                    {
                    // InternalMGLang.g:1202:2: ( ( 'int' ) )
                    // InternalMGLang.g:1203:3: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:1204:3: ( 'int' )
                    // InternalMGLang.g:1204:4: 'int'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1208:2: ( ( 'char' ) )
                    {
                    // InternalMGLang.g:1208:2: ( ( 'char' ) )
                    // InternalMGLang.g:1209:3: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:1210:3: ( 'char' )
                    // InternalMGLang.g:1210:4: 'char'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1214:2: ( ( 'double' ) )
                    {
                    // InternalMGLang.g:1214:2: ( ( 'double' ) )
                    // InternalMGLang.g:1215:3: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:1216:3: ( 'double' )
                    // InternalMGLang.g:1216:4: 'double'
                    {
                    match(input,17,FOLLOW_2); 

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


    // $ANTLR start "rule__RelationalOp__Alternatives"
    // InternalMGLang.g:1224:1: rule__RelationalOp__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1228:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 20:
                {
                alt12=3;
                }
                break;
            case 21:
                {
                alt12=4;
                }
                break;
            case 22:
                {
                alt12=5;
                }
                break;
            case 23:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:1229:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:1229:2: ( ( '>' ) )
                    // InternalMGLang.g:1230:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:1231:3: ( '>' )
                    // InternalMGLang.g:1231:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1235:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:1235:2: ( ( '>=' ) )
                    // InternalMGLang.g:1236:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:1237:3: ( '>=' )
                    // InternalMGLang.g:1237:4: '>='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1241:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:1241:2: ( ( '==' ) )
                    // InternalMGLang.g:1242:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:1243:3: ( '==' )
                    // InternalMGLang.g:1243:4: '=='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1247:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:1247:2: ( ( '!=' ) )
                    // InternalMGLang.g:1248:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:1249:3: ( '!=' )
                    // InternalMGLang.g:1249:4: '!='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1253:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:1253:2: ( ( '<=' ) )
                    // InternalMGLang.g:1254:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 
                    // InternalMGLang.g:1255:3: ( '<=' )
                    // InternalMGLang.g:1255:4: '<='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1259:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:1259:2: ( ( '<' ) )
                    // InternalMGLang.g:1260:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5()); 
                    // InternalMGLang.g:1261:3: ( '<' )
                    // InternalMGLang.g:1261:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__RelationalOp__Alternatives"


    // $ANTLR start "rule__MofgenFile__Group__0"
    // InternalMGLang.g:1269:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1273:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:1274:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
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
    // InternalMGLang.g:1281:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1285:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:1286:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:1286:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:1287:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            // InternalMGLang.g:1288:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMGLang.g:1288:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMGLang.g:1296:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1300:1: ( rule__MofgenFile__Group__1__Impl )
            // InternalMGLang.g:1301:2: rule__MofgenFile__Group__1__Impl
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
    // InternalMGLang.g:1307:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__Alternatives_1 )* ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1311:1: ( ( ( rule__MofgenFile__Alternatives_1 )* ) )
            // InternalMGLang.g:1312:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            {
            // InternalMGLang.g:1312:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            // InternalMGLang.g:1313:2: ( rule__MofgenFile__Alternatives_1 )*
            {
             before(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 
            // InternalMGLang.g:1314:2: ( rule__MofgenFile__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26||LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGLang.g:1314:3: rule__MofgenFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MofgenFile__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMGLang.g:1323:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1327:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:1328:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMGLang.g:1335:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1339:1: ( ( 'import' ) )
            // InternalMGLang.g:1340:1: ( 'import' )
            {
            // InternalMGLang.g:1340:1: ( 'import' )
            // InternalMGLang.g:1341:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMGLang.g:1350:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1354:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:1355:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMGLang.g:1362:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1366:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalMGLang.g:1367:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1367:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalMGLang.g:1368:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1369:2: ( rule__Import__NameAssignment_1 )
            // InternalMGLang.g:1369:3: rule__Import__NameAssignment_1
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
    // InternalMGLang.g:1377:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1381:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:1382:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalMGLang.g:1389:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1393:1: ( ( 'as' ) )
            // InternalMGLang.g:1394:1: ( 'as' )
            {
            // InternalMGLang.g:1394:1: ( 'as' )
            // InternalMGLang.g:1395:2: 'as'
            {
             before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMGLang.g:1404:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1408:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:1409:2: rule__Import__Group__3__Impl
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
    // InternalMGLang.g:1415:1: rule__Import__Group__3__Impl : ( ( rule__Import__AliasAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1419:1: ( ( ( rule__Import__AliasAssignment_3 ) ) )
            // InternalMGLang.g:1420:1: ( ( rule__Import__AliasAssignment_3 ) )
            {
            // InternalMGLang.g:1420:1: ( ( rule__Import__AliasAssignment_3 ) )
            // InternalMGLang.g:1421:2: ( rule__Import__AliasAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getAliasAssignment_3()); 
            // InternalMGLang.g:1422:2: ( rule__Import__AliasAssignment_3 )
            // InternalMGLang.g:1422:3: rule__Import__AliasAssignment_3
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
    // InternalMGLang.g:1431:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1435:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:1436:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalMGLang.g:1443:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1447:1: ( ( 'pattern' ) )
            // InternalMGLang.g:1448:1: ( 'pattern' )
            {
            // InternalMGLang.g:1448:1: ( 'pattern' )
            // InternalMGLang.g:1449:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMGLang.g:1458:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1462:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:1463:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalMGLang.g:1470:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1474:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:1475:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1475:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:1476:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalMGLang.g:1477:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:1477:3: rule__Pattern__NameAssignment_1
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
    // InternalMGLang.g:1485:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1489:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:1490:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalMGLang.g:1497:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1501:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:1502:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:1502:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:1503:2: ( rule__Pattern__Group_2__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalMGLang.g:1504:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:1504:3: rule__Pattern__Group_2__0
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
    // InternalMGLang.g:1512:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1516:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:1517:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalMGLang.g:1524:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1528:1: ( ( '{' ) )
            // InternalMGLang.g:1529:1: ( '{' )
            {
            // InternalMGLang.g:1529:1: ( '{' )
            // InternalMGLang.g:1530:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMGLang.g:1539:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1543:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:1544:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalMGLang.g:1551:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__NodesAssignment_4 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1555:1: ( ( ( rule__Pattern__NodesAssignment_4 )* ) )
            // InternalMGLang.g:1556:1: ( ( rule__Pattern__NodesAssignment_4 )* )
            {
            // InternalMGLang.g:1556:1: ( ( rule__Pattern__NodesAssignment_4 )* )
            // InternalMGLang.g:1557:2: ( rule__Pattern__NodesAssignment_4 )*
            {
             before(grammarAccess.getPatternAccess().getNodesAssignment_4()); 
            // InternalMGLang.g:1558:2: ( rule__Pattern__NodesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMGLang.g:1558:3: rule__Pattern__NodesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Pattern__NodesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMGLang.g:1566:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1570:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:1571:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalMGLang.g:1578:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1582:1: ( ( '}' ) )
            // InternalMGLang.g:1583:1: ( '}' )
            {
            // InternalMGLang.g:1583:1: ( '}' )
            // InternalMGLang.g:1584:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMGLang.g:1593:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1597:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:1598:2: rule__Pattern__Group__6__Impl
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
    // InternalMGLang.g:1604:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 )? ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1608:1: ( ( ( rule__Pattern__ReturnAssignment_6 )? ) )
            // InternalMGLang.g:1609:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            {
            // InternalMGLang.g:1609:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            // InternalMGLang.g:1610:2: ( rule__Pattern__ReturnAssignment_6 )?
            {
             before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            // InternalMGLang.g:1611:2: ( rule__Pattern__ReturnAssignment_6 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:1611:3: rule__Pattern__ReturnAssignment_6
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
    // InternalMGLang.g:1620:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1624:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:1625:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalMGLang.g:1632:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1636:1: ( ( '(' ) )
            // InternalMGLang.g:1637:1: ( '(' )
            {
            // InternalMGLang.g:1637:1: ( '(' )
            // InternalMGLang.g:1638:2: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMGLang.g:1647:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1651:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:1652:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
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
    // InternalMGLang.g:1659:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1663:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:1664:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:1664:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:1665:2: ( rule__Pattern__Group_2_1__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalMGLang.g:1666:2: ( rule__Pattern__Group_2_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=15 && LA17_0<=17)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:1666:3: rule__Pattern__Group_2_1__0
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
    // InternalMGLang.g:1674:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1678:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:1679:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMGLang.g:1685:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1689:1: ( ( ')' ) )
            // InternalMGLang.g:1690:1: ( ')' )
            {
            // InternalMGLang.g:1690:1: ( ')' )
            // InternalMGLang.g:1691:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMGLang.g:1701:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1705:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:1706:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
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
    // InternalMGLang.g:1713:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1717:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:1718:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:1718:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:1719:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            // InternalMGLang.g:1720:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:1720:3: rule__Pattern__ParametersAssignment_2_1_0
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
    // InternalMGLang.g:1728:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1732:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:1733:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalMGLang.g:1739:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1743:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:1744:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:1744:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:1745:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            // InternalMGLang.g:1746:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMGLang.g:1746:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMGLang.g:1755:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1759:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:1760:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
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
    // InternalMGLang.g:1767:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1771:1: ( ( ',' ) )
            // InternalMGLang.g:1772:1: ( ',' )
            {
            // InternalMGLang.g:1772:1: ( ',' )
            // InternalMGLang.g:1773:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMGLang.g:1782:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1786:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:1787:2: rule__Pattern__Group_2_1_1__1__Impl
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
    // InternalMGLang.g:1793:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1797:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:1798:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:1798:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:1799:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            // InternalMGLang.g:1800:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:1800:3: rule__Pattern__ParametersAssignment_2_1_1_1
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
    // InternalMGLang.g:1809:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1813:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:1814:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
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
    // InternalMGLang.g:1821:1: rule__PatternReturn__Group__0__Impl : ( () ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1825:1: ( ( () ) )
            // InternalMGLang.g:1826:1: ( () )
            {
            // InternalMGLang.g:1826:1: ( () )
            // InternalMGLang.g:1827:2: ()
            {
             before(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            // InternalMGLang.g:1828:2: ()
            // InternalMGLang.g:1828:3: 
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
    // InternalMGLang.g:1836:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1840:1: ( rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 )
            // InternalMGLang.g:1841:2: rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2
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
    // InternalMGLang.g:1848:1: rule__PatternReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1852:1: ( ( 'return' ) )
            // InternalMGLang.g:1853:1: ( 'return' )
            {
            // InternalMGLang.g:1853:1: ( 'return' )
            // InternalMGLang.g:1854:2: 'return'
            {
             before(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMGLang.g:1863:1: rule__PatternReturn__Group__2 : rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 ;
    public final void rule__PatternReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1867:1: ( rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 )
            // InternalMGLang.g:1868:2: rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3
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
    // InternalMGLang.g:1875:1: rule__PatternReturn__Group__2__Impl : ( 'this' ) ;
    public final void rule__PatternReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1879:1: ( ( 'this' ) )
            // InternalMGLang.g:1880:1: ( 'this' )
            {
            // InternalMGLang.g:1880:1: ( 'this' )
            // InternalMGLang.g:1881:2: 'this'
            {
             before(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMGLang.g:1890:1: rule__PatternReturn__Group__3 : rule__PatternReturn__Group__3__Impl ;
    public final void rule__PatternReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1894:1: ( rule__PatternReturn__Group__3__Impl )
            // InternalMGLang.g:1895:2: rule__PatternReturn__Group__3__Impl
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
    // InternalMGLang.g:1901:1: rule__PatternReturn__Group__3__Impl : ( ( rule__PatternReturn__Group_3__0 )? ) ;
    public final void rule__PatternReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1905:1: ( ( ( rule__PatternReturn__Group_3__0 )? ) )
            // InternalMGLang.g:1906:1: ( ( rule__PatternReturn__Group_3__0 )? )
            {
            // InternalMGLang.g:1906:1: ( ( rule__PatternReturn__Group_3__0 )? )
            // InternalMGLang.g:1907:2: ( rule__PatternReturn__Group_3__0 )?
            {
             before(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            // InternalMGLang.g:1908:2: ( rule__PatternReturn__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMGLang.g:1908:3: rule__PatternReturn__Group_3__0
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
    // InternalMGLang.g:1917:1: rule__PatternReturn__Group_3__0 : rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 ;
    public final void rule__PatternReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1921:1: ( rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 )
            // InternalMGLang.g:1922:2: rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1
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
    // InternalMGLang.g:1929:1: rule__PatternReturn__Group_3__0__Impl : ( '.' ) ;
    public final void rule__PatternReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1933:1: ( ( '.' ) )
            // InternalMGLang.g:1934:1: ( '.' )
            {
            // InternalMGLang.g:1934:1: ( '.' )
            // InternalMGLang.g:1935:2: '.'
            {
             before(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMGLang.g:1944:1: rule__PatternReturn__Group_3__1 : rule__PatternReturn__Group_3__1__Impl ;
    public final void rule__PatternReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1948:1: ( rule__PatternReturn__Group_3__1__Impl )
            // InternalMGLang.g:1949:2: rule__PatternReturn__Group_3__1__Impl
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
    // InternalMGLang.g:1955:1: rule__PatternReturn__Group_3__1__Impl : ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) ;
    public final void rule__PatternReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1959:1: ( ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) )
            // InternalMGLang.g:1960:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            {
            // InternalMGLang.g:1960:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            // InternalMGLang.g:1961:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            // InternalMGLang.g:1962:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            // InternalMGLang.g:1962:3: rule__PatternReturn__ReturnValueAssignment_3_1
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
    // InternalMGLang.g:1971:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1975:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:1976:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalMGLang.g:1983:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1987:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:1988:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:1988:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:1989:2: ( rule__Node__TypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:1990:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:1990:3: rule__Node__TypeAssignment_0
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
    // InternalMGLang.g:1998:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2002:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalMGLang.g:2003:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalMGLang.g:2010:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2014:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:2015:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2015:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:2016:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2017:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:2017:3: rule__Node__NameAssignment_1
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
    // InternalMGLang.g:2025:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2029:1: ( rule__Node__Group__2__Impl )
            // InternalMGLang.g:2030:2: rule__Node__Group__2__Impl
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
    // InternalMGLang.g:2036:1: rule__Node__Group__2__Impl : ( ( rule__Node__CreatedByAssignment_2 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2040:1: ( ( ( rule__Node__CreatedByAssignment_2 )? ) )
            // InternalMGLang.g:2041:1: ( ( rule__Node__CreatedByAssignment_2 )? )
            {
            // InternalMGLang.g:2041:1: ( ( rule__Node__CreatedByAssignment_2 )? )
            // InternalMGLang.g:2042:2: ( rule__Node__CreatedByAssignment_2 )?
            {
             before(grammarAccess.getNodeAccess().getCreatedByAssignment_2()); 
            // InternalMGLang.g:2043:2: ( rule__Node__CreatedByAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==29) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMGLang.g:2043:3: rule__Node__CreatedByAssignment_2
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
    // InternalMGLang.g:2052:1: rule__NodeConstructor__Group__0 : rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 ;
    public final void rule__NodeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2056:1: ( rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1 )
            // InternalMGLang.g:2057:2: rule__NodeConstructor__Group__0__Impl rule__NodeConstructor__Group__1
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
    // InternalMGLang.g:2064:1: rule__NodeConstructor__Group__0__Impl : ( () ) ;
    public final void rule__NodeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2068:1: ( ( () ) )
            // InternalMGLang.g:2069:1: ( () )
            {
            // InternalMGLang.g:2069:1: ( () )
            // InternalMGLang.g:2070:2: ()
            {
             before(grammarAccess.getNodeConstructorAccess().getNodeConstructorAction_0()); 
            // InternalMGLang.g:2071:2: ()
            // InternalMGLang.g:2071:3: 
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
    // InternalMGLang.g:2079:1: rule__NodeConstructor__Group__1 : rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 ;
    public final void rule__NodeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2083:1: ( rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2 )
            // InternalMGLang.g:2084:2: rule__NodeConstructor__Group__1__Impl rule__NodeConstructor__Group__2
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
    // InternalMGLang.g:2091:1: rule__NodeConstructor__Group__1__Impl : ( '{' ) ;
    public final void rule__NodeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2095:1: ( ( '{' ) )
            // InternalMGLang.g:2096:1: ( '{' )
            {
            // InternalMGLang.g:2096:1: ( '{' )
            // InternalMGLang.g:2097:2: '{'
            {
             before(grammarAccess.getNodeConstructorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMGLang.g:2106:1: rule__NodeConstructor__Group__2 : rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 ;
    public final void rule__NodeConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2110:1: ( rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3 )
            // InternalMGLang.g:2111:2: rule__NodeConstructor__Group__2__Impl rule__NodeConstructor__Group__3
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
    // InternalMGLang.g:2118:1: rule__NodeConstructor__Group__2__Impl : ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* ) ;
    public final void rule__NodeConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2122:1: ( ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* ) )
            // InternalMGLang.g:2123:1: ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* )
            {
            // InternalMGLang.g:2123:1: ( ( rule__NodeConstructor__RefsAssignsAssignment_2 )* )
            // InternalMGLang.g:2124:2: ( rule__NodeConstructor__RefsAssignsAssignment_2 )*
            {
             before(grammarAccess.getNodeConstructorAccess().getRefsAssignsAssignment_2()); 
            // InternalMGLang.g:2125:2: ( rule__NodeConstructor__RefsAssignsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:2125:3: rule__NodeConstructor__RefsAssignsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NodeConstructor__RefsAssignsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMGLang.g:2133:1: rule__NodeConstructor__Group__3 : rule__NodeConstructor__Group__3__Impl ;
    public final void rule__NodeConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2137:1: ( rule__NodeConstructor__Group__3__Impl )
            // InternalMGLang.g:2138:2: rule__NodeConstructor__Group__3__Impl
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
    // InternalMGLang.g:2144:1: rule__NodeConstructor__Group__3__Impl : ( '}' ) ;
    public final void rule__NodeConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2148:1: ( ( '}' ) )
            // InternalMGLang.g:2149:1: ( '}' )
            {
            // InternalMGLang.g:2149:1: ( '}' )
            // InternalMGLang.g:2150:2: '}'
            {
             before(grammarAccess.getNodeConstructorAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMGLang.g:2160:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2164:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:2165:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
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
    // InternalMGLang.g:2172:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2176:1: ( ( ( rule__PatternCall__CalledAssignment_0 ) ) )
            // InternalMGLang.g:2177:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            {
            // InternalMGLang.g:2177:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            // InternalMGLang.g:2178:2: ( rule__PatternCall__CalledAssignment_0 )
            {
             before(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            // InternalMGLang.g:2179:2: ( rule__PatternCall__CalledAssignment_0 )
            // InternalMGLang.g:2179:3: rule__PatternCall__CalledAssignment_0
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
    // InternalMGLang.g:2187:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2191:1: ( rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 )
            // InternalMGLang.g:2192:2: rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2
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
    // InternalMGLang.g:2199:1: rule__PatternCall__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2203:1: ( ( '(' ) )
            // InternalMGLang.g:2204:1: ( '(' )
            {
            // InternalMGLang.g:2204:1: ( '(' )
            // InternalMGLang.g:2205:2: '('
            {
             before(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMGLang.g:2214:1: rule__PatternCall__Group__2 : rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 ;
    public final void rule__PatternCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2218:1: ( rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 )
            // InternalMGLang.g:2219:2: rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3
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
    // InternalMGLang.g:2226:1: rule__PatternCall__Group__2__Impl : ( ( rule__PatternCall__ParamsAssignment_2 )* ) ;
    public final void rule__PatternCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2230:1: ( ( ( rule__PatternCall__ParamsAssignment_2 )* ) )
            // InternalMGLang.g:2231:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            {
            // InternalMGLang.g:2231:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            // InternalMGLang.g:2232:2: ( rule__PatternCall__ParamsAssignment_2 )*
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_2()); 
            // InternalMGLang.g:2233:2: ( rule__PatternCall__ParamsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGLang.g:2233:3: rule__PatternCall__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PatternCall__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMGLang.g:2241:1: rule__PatternCall__Group__3 : rule__PatternCall__Group__3__Impl ;
    public final void rule__PatternCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2245:1: ( rule__PatternCall__Group__3__Impl )
            // InternalMGLang.g:2246:2: rule__PatternCall__Group__3__Impl
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
    // InternalMGLang.g:2252:1: rule__PatternCall__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2256:1: ( ( ')' ) )
            // InternalMGLang.g:2257:1: ( ')' )
            {
            // InternalMGLang.g:2257:1: ( ')' )
            // InternalMGLang.g:2258:2: ')'
            {
             before(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMGLang.g:2268:1: rule__NodeReferenceOrAssignment__Group__0 : rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 ;
    public final void rule__NodeReferenceOrAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2272:1: ( rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 )
            // InternalMGLang.g:2273:2: rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1
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
    // InternalMGLang.g:2280:1: rule__NodeReferenceOrAssignment__Group__0__Impl : ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2284:1: ( ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) )
            // InternalMGLang.g:2285:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            {
            // InternalMGLang.g:2285:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            // InternalMGLang.g:2286:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives_0()); 
            // InternalMGLang.g:2287:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            // InternalMGLang.g:2287:3: rule__NodeReferenceOrAssignment__Alternatives_0
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
    // InternalMGLang.g:2295:1: rule__NodeReferenceOrAssignment__Group__1 : rule__NodeReferenceOrAssignment__Group__1__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2299:1: ( rule__NodeReferenceOrAssignment__Group__1__Impl )
            // InternalMGLang.g:2300:2: rule__NodeReferenceOrAssignment__Group__1__Impl
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
    // InternalMGLang.g:2306:1: rule__NodeReferenceOrAssignment__Group__1__Impl : ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) ;
    public final void rule__NodeReferenceOrAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2310:1: ( ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) )
            // InternalMGLang.g:2311:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            {
            // InternalMGLang.g:2311:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            // InternalMGLang.g:2312:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup_1()); 
            // InternalMGLang.g:2313:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:2313:3: rule__NodeReferenceOrAssignment__Group_1__0
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
    // InternalMGLang.g:2322:1: rule__NodeReferenceOrAssignment__Group_1__0 : rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2326:1: ( rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 )
            // InternalMGLang.g:2327:2: rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMGLang.g:2334:1: rule__NodeReferenceOrAssignment__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2338:1: ( ( '[' ) )
            // InternalMGLang.g:2339:1: ( '[' )
            {
            // InternalMGLang.g:2339:1: ( '[' )
            // InternalMGLang.g:2340:2: '['
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMGLang.g:2349:1: rule__NodeReferenceOrAssignment__Group_1__1 : rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2353:1: ( rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 )
            // InternalMGLang.g:2354:2: rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:2361:1: rule__NodeReferenceOrAssignment__Group_1__1__Impl : ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2365:1: ( ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) )
            // InternalMGLang.g:2366:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            {
            // InternalMGLang.g:2366:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            // InternalMGLang.g:2367:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionAssignment_1_1()); 
            // InternalMGLang.g:2368:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            // InternalMGLang.g:2368:3: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1
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
    // InternalMGLang.g:2376:1: rule__NodeReferenceOrAssignment__Group_1__2 : rule__NodeReferenceOrAssignment__Group_1__2__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2380:1: ( rule__NodeReferenceOrAssignment__Group_1__2__Impl )
            // InternalMGLang.g:2381:2: rule__NodeReferenceOrAssignment__Group_1__2__Impl
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
    // InternalMGLang.g:2387:1: rule__NodeReferenceOrAssignment__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2391:1: ( ( ']' ) )
            // InternalMGLang.g:2392:1: ( ']' )
            {
            // InternalMGLang.g:2392:1: ( ']' )
            // InternalMGLang.g:2393:2: ']'
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__PatternNodeReference__Group__0"
    // InternalMGLang.g:2403:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2407:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:2408:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
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
    // InternalMGLang.g:2415:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2419:1: ( ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2420:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2420:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            // InternalMGLang.g:2421:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2422:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            // InternalMGLang.g:2422:3: rule__PatternNodeReference__TypeAssignment_0
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
    // InternalMGLang.g:2430:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2434:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:2435:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
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
    // InternalMGLang.g:2442:1: rule__PatternNodeReference__Group__1__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2446:1: ( ( '->' ) )
            // InternalMGLang.g:2447:1: ( '->' )
            {
            // InternalMGLang.g:2447:1: ( '->' )
            // InternalMGLang.g:2448:2: '->'
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMGLang.g:2457:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2461:1: ( rule__PatternNodeReference__Group__2__Impl )
            // InternalMGLang.g:2462:2: rule__PatternNodeReference__Group__2__Impl
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
    // InternalMGLang.g:2468:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2472:1: ( ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) )
            // InternalMGLang.g:2473:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            {
            // InternalMGLang.g:2473:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            // InternalMGLang.g:2474:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            // InternalMGLang.g:2475:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            // InternalMGLang.g:2475:3: rule__PatternNodeReference__TargetAssignment_2
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
    // InternalMGLang.g:2484:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2488:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:2489:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalMGLang.g:2496:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2500:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:2501:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:2501:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:2502:2: ( rule__Assignment__TargetAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            // InternalMGLang.g:2503:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:2503:3: rule__Assignment__TargetAssignment_0
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
    // InternalMGLang.g:2511:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2515:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:2516:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMGLang.g:2523:1: rule__Assignment__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2527:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2528:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2528:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:2529:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:2538:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2542:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:2543:2: rule__Assignment__Group__2__Impl
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
    // InternalMGLang.g:2549:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2553:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:2554:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:2554:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:2555:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMGLang.g:2556:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:2556:3: rule__Assignment__ValueAssignment_2
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
    // InternalMGLang.g:2565:1: rule__NodeAttributeCall__Group__0 : rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 ;
    public final void rule__NodeAttributeCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2569:1: ( rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1 )
            // InternalMGLang.g:2570:2: rule__NodeAttributeCall__Group__0__Impl rule__NodeAttributeCall__Group__1
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
    // InternalMGLang.g:2577:1: rule__NodeAttributeCall__Group__0__Impl : ( ( rule__NodeAttributeCall__NodeAssignment_0 ) ) ;
    public final void rule__NodeAttributeCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2581:1: ( ( ( rule__NodeAttributeCall__NodeAssignment_0 ) ) )
            // InternalMGLang.g:2582:1: ( ( rule__NodeAttributeCall__NodeAssignment_0 ) )
            {
            // InternalMGLang.g:2582:1: ( ( rule__NodeAttributeCall__NodeAssignment_0 ) )
            // InternalMGLang.g:2583:2: ( rule__NodeAttributeCall__NodeAssignment_0 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getNodeAssignment_0()); 
            // InternalMGLang.g:2584:2: ( rule__NodeAttributeCall__NodeAssignment_0 )
            // InternalMGLang.g:2584:3: rule__NodeAttributeCall__NodeAssignment_0
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
    // InternalMGLang.g:2592:1: rule__NodeAttributeCall__Group__1 : rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 ;
    public final void rule__NodeAttributeCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2596:1: ( rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2 )
            // InternalMGLang.g:2597:2: rule__NodeAttributeCall__Group__1__Impl rule__NodeAttributeCall__Group__2
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
    // InternalMGLang.g:2604:1: rule__NodeAttributeCall__Group__1__Impl : ( '.' ) ;
    public final void rule__NodeAttributeCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2608:1: ( ( '.' ) )
            // InternalMGLang.g:2609:1: ( '.' )
            {
            // InternalMGLang.g:2609:1: ( '.' )
            // InternalMGLang.g:2610:2: '.'
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
    // InternalMGLang.g:2619:1: rule__NodeAttributeCall__Group__2 : rule__NodeAttributeCall__Group__2__Impl ;
    public final void rule__NodeAttributeCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2623:1: ( rule__NodeAttributeCall__Group__2__Impl )
            // InternalMGLang.g:2624:2: rule__NodeAttributeCall__Group__2__Impl
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
    // InternalMGLang.g:2630:1: rule__NodeAttributeCall__Group__2__Impl : ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) ;
    public final void rule__NodeAttributeCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2634:1: ( ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:2635:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:2635:1: ( ( rule__NodeAttributeCall__AttributeAssignment_2 ) )
            // InternalMGLang.g:2636:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeAssignment_2()); 
            // InternalMGLang.g:2637:2: ( rule__NodeAttributeCall__AttributeAssignment_2 )
            // InternalMGLang.g:2637:3: rule__NodeAttributeCall__AttributeAssignment_2
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
    // InternalMGLang.g:2646:1: rule__PrimitiveParameter__Group__0 : rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 ;
    public final void rule__PrimitiveParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2650:1: ( rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 )
            // InternalMGLang.g:2651:2: rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1
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
    // InternalMGLang.g:2658:1: rule__PrimitiveParameter__Group__0__Impl : ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2662:1: ( ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2663:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2663:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:2664:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2665:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            // InternalMGLang.g:2665:3: rule__PrimitiveParameter__TypeAssignment_0
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
    // InternalMGLang.g:2673:1: rule__PrimitiveParameter__Group__1 : rule__PrimitiveParameter__Group__1__Impl ;
    public final void rule__PrimitiveParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2677:1: ( rule__PrimitiveParameter__Group__1__Impl )
            // InternalMGLang.g:2678:2: rule__PrimitiveParameter__Group__1__Impl
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
    // InternalMGLang.g:2684:1: rule__PrimitiveParameter__Group__1__Impl : ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2688:1: ( ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:2689:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2689:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            // InternalMGLang.g:2690:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2691:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            // InternalMGLang.g:2691:3: rule__PrimitiveParameter__NameAssignment_1
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
    // InternalMGLang.g:2700:1: rule__ObjectParameter__Group__0 : rule__ObjectParameter__Group__0__Impl rule__ObjectParameter__Group__1 ;
    public final void rule__ObjectParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2704:1: ( rule__ObjectParameter__Group__0__Impl rule__ObjectParameter__Group__1 )
            // InternalMGLang.g:2705:2: rule__ObjectParameter__Group__0__Impl rule__ObjectParameter__Group__1
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
    // InternalMGLang.g:2712:1: rule__ObjectParameter__Group__0__Impl : ( ( rule__ObjectParameter__TypeAssignment_0 ) ) ;
    public final void rule__ObjectParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2716:1: ( ( ( rule__ObjectParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2717:1: ( ( rule__ObjectParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2717:1: ( ( rule__ObjectParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:2718:2: ( rule__ObjectParameter__TypeAssignment_0 )
            {
             before(grammarAccess.getObjectParameterAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:2719:2: ( rule__ObjectParameter__TypeAssignment_0 )
            // InternalMGLang.g:2719:3: rule__ObjectParameter__TypeAssignment_0
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
    // InternalMGLang.g:2727:1: rule__ObjectParameter__Group__1 : rule__ObjectParameter__Group__1__Impl ;
    public final void rule__ObjectParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2731:1: ( rule__ObjectParameter__Group__1__Impl )
            // InternalMGLang.g:2732:2: rule__ObjectParameter__Group__1__Impl
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
    // InternalMGLang.g:2738:1: rule__ObjectParameter__Group__1__Impl : ( ( rule__ObjectParameter__NameAssignment_1 ) ) ;
    public final void rule__ObjectParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2742:1: ( ( ( rule__ObjectParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:2743:1: ( ( rule__ObjectParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2743:1: ( ( rule__ObjectParameter__NameAssignment_1 ) )
            // InternalMGLang.g:2744:2: ( rule__ObjectParameter__NameAssignment_1 )
            {
             before(grammarAccess.getObjectParameterAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2745:2: ( rule__ObjectParameter__NameAssignment_1 )
            // InternalMGLang.g:2745:3: rule__ObjectParameter__NameAssignment_1
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


    // $ANTLR start "rule__MethodCall__Group__0"
    // InternalMGLang.g:2754:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2758:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalMGLang.g:2759:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // InternalMGLang.g:2766:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__CalledNodeAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2770:1: ( ( ( rule__MethodCall__CalledNodeAssignment_0 ) ) )
            // InternalMGLang.g:2771:1: ( ( rule__MethodCall__CalledNodeAssignment_0 ) )
            {
            // InternalMGLang.g:2771:1: ( ( rule__MethodCall__CalledNodeAssignment_0 ) )
            // InternalMGLang.g:2772:2: ( rule__MethodCall__CalledNodeAssignment_0 )
            {
             before(grammarAccess.getMethodCallAccess().getCalledNodeAssignment_0()); 
            // InternalMGLang.g:2773:2: ( rule__MethodCall__CalledNodeAssignment_0 )
            // InternalMGLang.g:2773:3: rule__MethodCall__CalledNodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__CalledNodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getCalledNodeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // InternalMGLang.g:2781:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2785:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // InternalMGLang.g:2786:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // InternalMGLang.g:2793:1: rule__MethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2797:1: ( ( '.' ) )
            // InternalMGLang.g:2798:1: ( '.' )
            {
            // InternalMGLang.g:2798:1: ( '.' )
            // InternalMGLang.g:2799:2: '.'
            {
             before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__2"
    // InternalMGLang.g:2808:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2812:1: ( rule__MethodCall__Group__2__Impl )
            // InternalMGLang.g:2813:2: rule__MethodCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2"


    // $ANTLR start "rule__MethodCall__Group__2__Impl"
    // InternalMGLang.g:2819:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__MethodAssignment_2 ) ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2823:1: ( ( ( rule__MethodCall__MethodAssignment_2 ) ) )
            // InternalMGLang.g:2824:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            {
            // InternalMGLang.g:2824:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            // InternalMGLang.g:2825:2: ( rule__MethodCall__MethodAssignment_2 )
            {
             before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            // InternalMGLang.g:2826:2: ( rule__MethodCall__MethodAssignment_2 )
            // InternalMGLang.g:2826:3: rule__MethodCall__MethodAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__MethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2__Impl"


    // $ANTLR start "rule__RelationExpression__Group__0"
    // InternalMGLang.g:2835:1: rule__RelationExpression__Group__0 : rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 ;
    public final void rule__RelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2839:1: ( rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 )
            // InternalMGLang.g:2840:2: rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__RelationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__0"


    // $ANTLR start "rule__RelationExpression__Group__0__Impl"
    // InternalMGLang.g:2847:1: rule__RelationExpression__Group__0__Impl : ( ( rule__RelationExpression__LhsAssignment_0 ) ) ;
    public final void rule__RelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2851:1: ( ( ( rule__RelationExpression__LhsAssignment_0 ) ) )
            // InternalMGLang.g:2852:1: ( ( rule__RelationExpression__LhsAssignment_0 ) )
            {
            // InternalMGLang.g:2852:1: ( ( rule__RelationExpression__LhsAssignment_0 ) )
            // InternalMGLang.g:2853:2: ( rule__RelationExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getRelationExpressionAccess().getLhsAssignment_0()); 
            // InternalMGLang.g:2854:2: ( rule__RelationExpression__LhsAssignment_0 )
            // InternalMGLang.g:2854:3: rule__RelationExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationExpressionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationExpression__Group__1"
    // InternalMGLang.g:2862:1: rule__RelationExpression__Group__1 : rule__RelationExpression__Group__1__Impl rule__RelationExpression__Group__2 ;
    public final void rule__RelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2866:1: ( rule__RelationExpression__Group__1__Impl rule__RelationExpression__Group__2 )
            // InternalMGLang.g:2867:2: rule__RelationExpression__Group__1__Impl rule__RelationExpression__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__RelationExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__1"


    // $ANTLR start "rule__RelationExpression__Group__1__Impl"
    // InternalMGLang.g:2874:1: rule__RelationExpression__Group__1__Impl : ( ( rule__RelationExpression__RelationAssignment_1 ) ) ;
    public final void rule__RelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2878:1: ( ( ( rule__RelationExpression__RelationAssignment_1 ) ) )
            // InternalMGLang.g:2879:1: ( ( rule__RelationExpression__RelationAssignment_1 ) )
            {
            // InternalMGLang.g:2879:1: ( ( rule__RelationExpression__RelationAssignment_1 ) )
            // InternalMGLang.g:2880:2: ( rule__RelationExpression__RelationAssignment_1 )
            {
             before(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1()); 
            // InternalMGLang.g:2881:2: ( rule__RelationExpression__RelationAssignment_1 )
            // InternalMGLang.g:2881:3: rule__RelationExpression__RelationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__RelationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationExpression__Group__2"
    // InternalMGLang.g:2889:1: rule__RelationExpression__Group__2 : rule__RelationExpression__Group__2__Impl ;
    public final void rule__RelationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2893:1: ( rule__RelationExpression__Group__2__Impl )
            // InternalMGLang.g:2894:2: rule__RelationExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__2"


    // $ANTLR start "rule__RelationExpression__Group__2__Impl"
    // InternalMGLang.g:2900:1: rule__RelationExpression__Group__2__Impl : ( ( rule__RelationExpression__RhsAssignment_2 ) ) ;
    public final void rule__RelationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2904:1: ( ( ( rule__RelationExpression__RhsAssignment_2 ) ) )
            // InternalMGLang.g:2905:1: ( ( rule__RelationExpression__RhsAssignment_2 ) )
            {
            // InternalMGLang.g:2905:1: ( ( rule__RelationExpression__RhsAssignment_2 ) )
            // InternalMGLang.g:2906:2: ( rule__RelationExpression__RhsAssignment_2 )
            {
             before(grammarAccess.getRelationExpressionAccess().getRhsAssignment_2()); 
            // InternalMGLang.g:2907:2: ( rule__RelationExpression__RhsAssignment_2 )
            // InternalMGLang.g:2907:3: rule__RelationExpression__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationExpressionAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__2__Impl"


    // $ANTLR start "rule__BooleanOr__Group__0"
    // InternalMGLang.g:2916:1: rule__BooleanOr__Group__0 : rule__BooleanOr__Group__0__Impl rule__BooleanOr__Group__1 ;
    public final void rule__BooleanOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2920:1: ( rule__BooleanOr__Group__0__Impl rule__BooleanOr__Group__1 )
            // InternalMGLang.g:2921:2: rule__BooleanOr__Group__0__Impl rule__BooleanOr__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__BooleanOr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanOr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group__0"


    // $ANTLR start "rule__BooleanOr__Group__0__Impl"
    // InternalMGLang.g:2928:1: rule__BooleanOr__Group__0__Impl : ( ruleBooleanXor ) ;
    public final void rule__BooleanOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2932:1: ( ( ruleBooleanXor ) )
            // InternalMGLang.g:2933:1: ( ruleBooleanXor )
            {
            // InternalMGLang.g:2933:1: ( ruleBooleanXor )
            // InternalMGLang.g:2934:2: ruleBooleanXor
            {
             before(grammarAccess.getBooleanOrAccess().getBooleanXorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanXor();

            state._fsp--;

             after(grammarAccess.getBooleanOrAccess().getBooleanXorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group__0__Impl"


    // $ANTLR start "rule__BooleanOr__Group__1"
    // InternalMGLang.g:2943:1: rule__BooleanOr__Group__1 : rule__BooleanOr__Group__1__Impl ;
    public final void rule__BooleanOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2947:1: ( rule__BooleanOr__Group__1__Impl )
            // InternalMGLang.g:2948:2: rule__BooleanOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group__1"


    // $ANTLR start "rule__BooleanOr__Group__1__Impl"
    // InternalMGLang.g:2954:1: rule__BooleanOr__Group__1__Impl : ( ( rule__BooleanOr__Group_1__0 )* ) ;
    public final void rule__BooleanOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2958:1: ( ( ( rule__BooleanOr__Group_1__0 )* ) )
            // InternalMGLang.g:2959:1: ( ( rule__BooleanOr__Group_1__0 )* )
            {
            // InternalMGLang.g:2959:1: ( ( rule__BooleanOr__Group_1__0 )* )
            // InternalMGLang.g:2960:2: ( rule__BooleanOr__Group_1__0 )*
            {
             before(grammarAccess.getBooleanOrAccess().getGroup_1()); 
            // InternalMGLang.g:2961:2: ( rule__BooleanOr__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:2961:3: rule__BooleanOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__BooleanOr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBooleanOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group__1__Impl"


    // $ANTLR start "rule__BooleanOr__Group_1__0"
    // InternalMGLang.g:2970:1: rule__BooleanOr__Group_1__0 : rule__BooleanOr__Group_1__0__Impl rule__BooleanOr__Group_1__1 ;
    public final void rule__BooleanOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2974:1: ( rule__BooleanOr__Group_1__0__Impl rule__BooleanOr__Group_1__1 )
            // InternalMGLang.g:2975:2: rule__BooleanOr__Group_1__0__Impl rule__BooleanOr__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__BooleanOr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanOr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group_1__0"


    // $ANTLR start "rule__BooleanOr__Group_1__0__Impl"
    // InternalMGLang.g:2982:1: rule__BooleanOr__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2986:1: ( ( () ) )
            // InternalMGLang.g:2987:1: ( () )
            {
            // InternalMGLang.g:2987:1: ( () )
            // InternalMGLang.g:2988:2: ()
            {
             before(grammarAccess.getBooleanOrAccess().getOrLeftAction_1_0()); 
            // InternalMGLang.g:2989:2: ()
            // InternalMGLang.g:2989:3: 
            {
            }

             after(grammarAccess.getBooleanOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanOr__Group_1__1"
    // InternalMGLang.g:2997:1: rule__BooleanOr__Group_1__1 : rule__BooleanOr__Group_1__1__Impl rule__BooleanOr__Group_1__2 ;
    public final void rule__BooleanOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3001:1: ( rule__BooleanOr__Group_1__1__Impl rule__BooleanOr__Group_1__2 )
            // InternalMGLang.g:3002:2: rule__BooleanOr__Group_1__1__Impl rule__BooleanOr__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__BooleanOr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanOr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group_1__1"


    // $ANTLR start "rule__BooleanOr__Group_1__1__Impl"
    // InternalMGLang.g:3009:1: rule__BooleanOr__Group_1__1__Impl : ( '||' ) ;
    public final void rule__BooleanOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3013:1: ( ( '||' ) )
            // InternalMGLang.g:3014:1: ( '||' )
            {
            // InternalMGLang.g:3014:1: ( '||' )
            // InternalMGLang.g:3015:2: '||'
            {
             before(grammarAccess.getBooleanOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBooleanOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanOr__Group_1__2"
    // InternalMGLang.g:3024:1: rule__BooleanOr__Group_1__2 : rule__BooleanOr__Group_1__2__Impl ;
    public final void rule__BooleanOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3028:1: ( rule__BooleanOr__Group_1__2__Impl )
            // InternalMGLang.g:3029:2: rule__BooleanOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group_1__2"


    // $ANTLR start "rule__BooleanOr__Group_1__2__Impl"
    // InternalMGLang.g:3035:1: rule__BooleanOr__Group_1__2__Impl : ( ( rule__BooleanOr__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3039:1: ( ( ( rule__BooleanOr__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:3040:1: ( ( rule__BooleanOr__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:3040:1: ( ( rule__BooleanOr__RightAssignment_1_2 ) )
            // InternalMGLang.g:3041:2: ( rule__BooleanOr__RightAssignment_1_2 )
            {
             before(grammarAccess.getBooleanOrAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:3042:2: ( rule__BooleanOr__RightAssignment_1_2 )
            // InternalMGLang.g:3042:3: rule__BooleanOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__Group_1__2__Impl"


    // $ANTLR start "rule__BooleanXor__Group__0"
    // InternalMGLang.g:3051:1: rule__BooleanXor__Group__0 : rule__BooleanXor__Group__0__Impl rule__BooleanXor__Group__1 ;
    public final void rule__BooleanXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3055:1: ( rule__BooleanXor__Group__0__Impl rule__BooleanXor__Group__1 )
            // InternalMGLang.g:3056:2: rule__BooleanXor__Group__0__Impl rule__BooleanXor__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__BooleanXor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanXor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group__0"


    // $ANTLR start "rule__BooleanXor__Group__0__Impl"
    // InternalMGLang.g:3063:1: rule__BooleanXor__Group__0__Impl : ( ruleBooleanAnd ) ;
    public final void rule__BooleanXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3067:1: ( ( ruleBooleanAnd ) )
            // InternalMGLang.g:3068:1: ( ruleBooleanAnd )
            {
            // InternalMGLang.g:3068:1: ( ruleBooleanAnd )
            // InternalMGLang.g:3069:2: ruleBooleanAnd
            {
             before(grammarAccess.getBooleanXorAccess().getBooleanAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanAnd();

            state._fsp--;

             after(grammarAccess.getBooleanXorAccess().getBooleanAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group__0__Impl"


    // $ANTLR start "rule__BooleanXor__Group__1"
    // InternalMGLang.g:3078:1: rule__BooleanXor__Group__1 : rule__BooleanXor__Group__1__Impl ;
    public final void rule__BooleanXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3082:1: ( rule__BooleanXor__Group__1__Impl )
            // InternalMGLang.g:3083:2: rule__BooleanXor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanXor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group__1"


    // $ANTLR start "rule__BooleanXor__Group__1__Impl"
    // InternalMGLang.g:3089:1: rule__BooleanXor__Group__1__Impl : ( ( rule__BooleanXor__Group_1__0 )* ) ;
    public final void rule__BooleanXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3093:1: ( ( ( rule__BooleanXor__Group_1__0 )* ) )
            // InternalMGLang.g:3094:1: ( ( rule__BooleanXor__Group_1__0 )* )
            {
            // InternalMGLang.g:3094:1: ( ( rule__BooleanXor__Group_1__0 )* )
            // InternalMGLang.g:3095:2: ( rule__BooleanXor__Group_1__0 )*
            {
             before(grammarAccess.getBooleanXorAccess().getGroup_1()); 
            // InternalMGLang.g:3096:2: ( rule__BooleanXor__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMGLang.g:3096:3: rule__BooleanXor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__BooleanXor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBooleanXorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group__1__Impl"


    // $ANTLR start "rule__BooleanXor__Group_1__0"
    // InternalMGLang.g:3105:1: rule__BooleanXor__Group_1__0 : rule__BooleanXor__Group_1__0__Impl rule__BooleanXor__Group_1__1 ;
    public final void rule__BooleanXor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3109:1: ( rule__BooleanXor__Group_1__0__Impl rule__BooleanXor__Group_1__1 )
            // InternalMGLang.g:3110:2: rule__BooleanXor__Group_1__0__Impl rule__BooleanXor__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__BooleanXor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanXor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group_1__0"


    // $ANTLR start "rule__BooleanXor__Group_1__0__Impl"
    // InternalMGLang.g:3117:1: rule__BooleanXor__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanXor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3121:1: ( ( () ) )
            // InternalMGLang.g:3122:1: ( () )
            {
            // InternalMGLang.g:3122:1: ( () )
            // InternalMGLang.g:3123:2: ()
            {
             before(grammarAccess.getBooleanXorAccess().getXorLeftAction_1_0()); 
            // InternalMGLang.g:3124:2: ()
            // InternalMGLang.g:3124:3: 
            {
            }

             after(grammarAccess.getBooleanXorAccess().getXorLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanXor__Group_1__1"
    // InternalMGLang.g:3132:1: rule__BooleanXor__Group_1__1 : rule__BooleanXor__Group_1__1__Impl rule__BooleanXor__Group_1__2 ;
    public final void rule__BooleanXor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3136:1: ( rule__BooleanXor__Group_1__1__Impl rule__BooleanXor__Group_1__2 )
            // InternalMGLang.g:3137:2: rule__BooleanXor__Group_1__1__Impl rule__BooleanXor__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__BooleanXor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanXor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group_1__1"


    // $ANTLR start "rule__BooleanXor__Group_1__1__Impl"
    // InternalMGLang.g:3144:1: rule__BooleanXor__Group_1__1__Impl : ( '^' ) ;
    public final void rule__BooleanXor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3148:1: ( ( '^' ) )
            // InternalMGLang.g:3149:1: ( '^' )
            {
            // InternalMGLang.g:3149:1: ( '^' )
            // InternalMGLang.g:3150:2: '^'
            {
             before(grammarAccess.getBooleanXorAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBooleanXorAccess().getCircumflexAccentKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanXor__Group_1__2"
    // InternalMGLang.g:3159:1: rule__BooleanXor__Group_1__2 : rule__BooleanXor__Group_1__2__Impl ;
    public final void rule__BooleanXor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3163:1: ( rule__BooleanXor__Group_1__2__Impl )
            // InternalMGLang.g:3164:2: rule__BooleanXor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanXor__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group_1__2"


    // $ANTLR start "rule__BooleanXor__Group_1__2__Impl"
    // InternalMGLang.g:3170:1: rule__BooleanXor__Group_1__2__Impl : ( ( rule__BooleanXor__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanXor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3174:1: ( ( ( rule__BooleanXor__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:3175:1: ( ( rule__BooleanXor__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:3175:1: ( ( rule__BooleanXor__RightAssignment_1_2 ) )
            // InternalMGLang.g:3176:2: ( rule__BooleanXor__RightAssignment_1_2 )
            {
             before(grammarAccess.getBooleanXorAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:3177:2: ( rule__BooleanXor__RightAssignment_1_2 )
            // InternalMGLang.g:3177:3: rule__BooleanXor__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanXor__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanXorAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__Group_1__2__Impl"


    // $ANTLR start "rule__BooleanAnd__Group__0"
    // InternalMGLang.g:3186:1: rule__BooleanAnd__Group__0 : rule__BooleanAnd__Group__0__Impl rule__BooleanAnd__Group__1 ;
    public final void rule__BooleanAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3190:1: ( rule__BooleanAnd__Group__0__Impl rule__BooleanAnd__Group__1 )
            // InternalMGLang.g:3191:2: rule__BooleanAnd__Group__0__Impl rule__BooleanAnd__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__BooleanAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group__0"


    // $ANTLR start "rule__BooleanAnd__Group__0__Impl"
    // InternalMGLang.g:3198:1: rule__BooleanAnd__Group__0__Impl : ( ruleBaseBoolean ) ;
    public final void rule__BooleanAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3202:1: ( ( ruleBaseBoolean ) )
            // InternalMGLang.g:3203:1: ( ruleBaseBoolean )
            {
            // InternalMGLang.g:3203:1: ( ruleBaseBoolean )
            // InternalMGLang.g:3204:2: ruleBaseBoolean
            {
             before(grammarAccess.getBooleanAndAccess().getBaseBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanAndAccess().getBaseBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group__0__Impl"


    // $ANTLR start "rule__BooleanAnd__Group__1"
    // InternalMGLang.g:3213:1: rule__BooleanAnd__Group__1 : rule__BooleanAnd__Group__1__Impl ;
    public final void rule__BooleanAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3217:1: ( rule__BooleanAnd__Group__1__Impl )
            // InternalMGLang.g:3218:2: rule__BooleanAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group__1"


    // $ANTLR start "rule__BooleanAnd__Group__1__Impl"
    // InternalMGLang.g:3224:1: rule__BooleanAnd__Group__1__Impl : ( ( rule__BooleanAnd__Group_1__0 )* ) ;
    public final void rule__BooleanAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3228:1: ( ( ( rule__BooleanAnd__Group_1__0 )* ) )
            // InternalMGLang.g:3229:1: ( ( rule__BooleanAnd__Group_1__0 )* )
            {
            // InternalMGLang.g:3229:1: ( ( rule__BooleanAnd__Group_1__0 )* )
            // InternalMGLang.g:3230:2: ( rule__BooleanAnd__Group_1__0 )*
            {
             before(grammarAccess.getBooleanAndAccess().getGroup_1()); 
            // InternalMGLang.g:3231:2: ( rule__BooleanAnd__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGLang.g:3231:3: rule__BooleanAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__BooleanAnd__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBooleanAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group__1__Impl"


    // $ANTLR start "rule__BooleanAnd__Group_1__0"
    // InternalMGLang.g:3240:1: rule__BooleanAnd__Group_1__0 : rule__BooleanAnd__Group_1__0__Impl rule__BooleanAnd__Group_1__1 ;
    public final void rule__BooleanAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3244:1: ( rule__BooleanAnd__Group_1__0__Impl rule__BooleanAnd__Group_1__1 )
            // InternalMGLang.g:3245:2: rule__BooleanAnd__Group_1__0__Impl rule__BooleanAnd__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__BooleanAnd__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAnd__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group_1__0"


    // $ANTLR start "rule__BooleanAnd__Group_1__0__Impl"
    // InternalMGLang.g:3252:1: rule__BooleanAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3256:1: ( ( () ) )
            // InternalMGLang.g:3257:1: ( () )
            {
            // InternalMGLang.g:3257:1: ( () )
            // InternalMGLang.g:3258:2: ()
            {
             before(grammarAccess.getBooleanAndAccess().getAndLeftAction_1_0()); 
            // InternalMGLang.g:3259:2: ()
            // InternalMGLang.g:3259:3: 
            {
            }

             after(grammarAccess.getBooleanAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanAnd__Group_1__1"
    // InternalMGLang.g:3267:1: rule__BooleanAnd__Group_1__1 : rule__BooleanAnd__Group_1__1__Impl rule__BooleanAnd__Group_1__2 ;
    public final void rule__BooleanAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3271:1: ( rule__BooleanAnd__Group_1__1__Impl rule__BooleanAnd__Group_1__2 )
            // InternalMGLang.g:3272:2: rule__BooleanAnd__Group_1__1__Impl rule__BooleanAnd__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__BooleanAnd__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAnd__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group_1__1"


    // $ANTLR start "rule__BooleanAnd__Group_1__1__Impl"
    // InternalMGLang.g:3279:1: rule__BooleanAnd__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__BooleanAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3283:1: ( ( '&&' ) )
            // InternalMGLang.g:3284:1: ( '&&' )
            {
            // InternalMGLang.g:3284:1: ( '&&' )
            // InternalMGLang.g:3285:2: '&&'
            {
             before(grammarAccess.getBooleanAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBooleanAndAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanAnd__Group_1__2"
    // InternalMGLang.g:3294:1: rule__BooleanAnd__Group_1__2 : rule__BooleanAnd__Group_1__2__Impl ;
    public final void rule__BooleanAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3298:1: ( rule__BooleanAnd__Group_1__2__Impl )
            // InternalMGLang.g:3299:2: rule__BooleanAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnd__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group_1__2"


    // $ANTLR start "rule__BooleanAnd__Group_1__2__Impl"
    // InternalMGLang.g:3305:1: rule__BooleanAnd__Group_1__2__Impl : ( ( rule__BooleanAnd__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3309:1: ( ( ( rule__BooleanAnd__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:3310:1: ( ( rule__BooleanAnd__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:3310:1: ( ( rule__BooleanAnd__RightAssignment_1_2 ) )
            // InternalMGLang.g:3311:2: ( rule__BooleanAnd__RightAssignment_1_2 )
            {
             before(grammarAccess.getBooleanAndAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:3312:2: ( rule__BooleanAnd__RightAssignment_1_2 )
            // InternalMGLang.g:3312:3: rule__BooleanAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnd__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__Group_1__2__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_0__0"
    // InternalMGLang.g:3321:1: rule__BaseBoolean__Group_0__0 : rule__BaseBoolean__Group_0__0__Impl rule__BaseBoolean__Group_0__1 ;
    public final void rule__BaseBoolean__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3325:1: ( rule__BaseBoolean__Group_0__0__Impl rule__BaseBoolean__Group_0__1 )
            // InternalMGLang.g:3326:2: rule__BaseBoolean__Group_0__0__Impl rule__BaseBoolean__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__BaseBoolean__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__0"


    // $ANTLR start "rule__BaseBoolean__Group_0__0__Impl"
    // InternalMGLang.g:3333:1: rule__BaseBoolean__Group_0__0__Impl : ( () ) ;
    public final void rule__BaseBoolean__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3337:1: ( ( () ) )
            // InternalMGLang.g:3338:1: ( () )
            {
            // InternalMGLang.g:3338:1: ( () )
            // InternalMGLang.g:3339:2: ()
            {
             before(grammarAccess.getBaseBooleanAccess().getNegatedBooleanAction_0_0()); 
            // InternalMGLang.g:3340:2: ()
            // InternalMGLang.g:3340:3: 
            {
            }

             after(grammarAccess.getBaseBooleanAccess().getNegatedBooleanAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__0__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_0__1"
    // InternalMGLang.g:3348:1: rule__BaseBoolean__Group_0__1 : rule__BaseBoolean__Group_0__1__Impl rule__BaseBoolean__Group_0__2 ;
    public final void rule__BaseBoolean__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3352:1: ( rule__BaseBoolean__Group_0__1__Impl rule__BaseBoolean__Group_0__2 )
            // InternalMGLang.g:3353:2: rule__BaseBoolean__Group_0__1__Impl rule__BaseBoolean__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__BaseBoolean__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__1"


    // $ANTLR start "rule__BaseBoolean__Group_0__1__Impl"
    // InternalMGLang.g:3360:1: rule__BaseBoolean__Group_0__1__Impl : ( '!' ) ;
    public final void rule__BaseBoolean__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3364:1: ( ( '!' ) )
            // InternalMGLang.g:3365:1: ( '!' )
            {
            // InternalMGLang.g:3365:1: ( '!' )
            // InternalMGLang.g:3366:2: '!'
            {
             before(grammarAccess.getBaseBooleanAccess().getExclamationMarkKeyword_0_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBaseBooleanAccess().getExclamationMarkKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__1__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_0__2"
    // InternalMGLang.g:3375:1: rule__BaseBoolean__Group_0__2 : rule__BaseBoolean__Group_0__2__Impl rule__BaseBoolean__Group_0__3 ;
    public final void rule__BaseBoolean__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3379:1: ( rule__BaseBoolean__Group_0__2__Impl rule__BaseBoolean__Group_0__3 )
            // InternalMGLang.g:3380:2: rule__BaseBoolean__Group_0__2__Impl rule__BaseBoolean__Group_0__3
            {
            pushFollow(FOLLOW_24);
            rule__BaseBoolean__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__2"


    // $ANTLR start "rule__BaseBoolean__Group_0__2__Impl"
    // InternalMGLang.g:3387:1: rule__BaseBoolean__Group_0__2__Impl : ( '(' ) ;
    public final void rule__BaseBoolean__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3391:1: ( ( '(' ) )
            // InternalMGLang.g:3392:1: ( '(' )
            {
            // InternalMGLang.g:3392:1: ( '(' )
            // InternalMGLang.g:3393:2: '('
            {
             before(grammarAccess.getBaseBooleanAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBaseBooleanAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__2__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_0__3"
    // InternalMGLang.g:3402:1: rule__BaseBoolean__Group_0__3 : rule__BaseBoolean__Group_0__3__Impl rule__BaseBoolean__Group_0__4 ;
    public final void rule__BaseBoolean__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3406:1: ( rule__BaseBoolean__Group_0__3__Impl rule__BaseBoolean__Group_0__4 )
            // InternalMGLang.g:3407:2: rule__BaseBoolean__Group_0__3__Impl rule__BaseBoolean__Group_0__4
            {
            pushFollow(FOLLOW_36);
            rule__BaseBoolean__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__3"


    // $ANTLR start "rule__BaseBoolean__Group_0__3__Impl"
    // InternalMGLang.g:3414:1: rule__BaseBoolean__Group_0__3__Impl : ( ( rule__BaseBoolean__ExprAssignment_0_3 ) ) ;
    public final void rule__BaseBoolean__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3418:1: ( ( ( rule__BaseBoolean__ExprAssignment_0_3 ) ) )
            // InternalMGLang.g:3419:1: ( ( rule__BaseBoolean__ExprAssignment_0_3 ) )
            {
            // InternalMGLang.g:3419:1: ( ( rule__BaseBoolean__ExprAssignment_0_3 ) )
            // InternalMGLang.g:3420:2: ( rule__BaseBoolean__ExprAssignment_0_3 )
            {
             before(grammarAccess.getBaseBooleanAccess().getExprAssignment_0_3()); 
            // InternalMGLang.g:3421:2: ( rule__BaseBoolean__ExprAssignment_0_3 )
            // InternalMGLang.g:3421:3: rule__BaseBoolean__ExprAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__BaseBoolean__ExprAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getBaseBooleanAccess().getExprAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__3__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_0__4"
    // InternalMGLang.g:3429:1: rule__BaseBoolean__Group_0__4 : rule__BaseBoolean__Group_0__4__Impl ;
    public final void rule__BaseBoolean__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3433:1: ( rule__BaseBoolean__Group_0__4__Impl )
            // InternalMGLang.g:3434:2: rule__BaseBoolean__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__4"


    // $ANTLR start "rule__BaseBoolean__Group_0__4__Impl"
    // InternalMGLang.g:3440:1: rule__BaseBoolean__Group_0__4__Impl : ( ')' ) ;
    public final void rule__BaseBoolean__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3444:1: ( ( ')' ) )
            // InternalMGLang.g:3445:1: ( ')' )
            {
            // InternalMGLang.g:3445:1: ( ')' )
            // InternalMGLang.g:3446:2: ')'
            {
             before(grammarAccess.getBaseBooleanAccess().getRightParenthesisKeyword_0_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBaseBooleanAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_0__4__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_1__0"
    // InternalMGLang.g:3456:1: rule__BaseBoolean__Group_1__0 : rule__BaseBoolean__Group_1__0__Impl rule__BaseBoolean__Group_1__1 ;
    public final void rule__BaseBoolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3460:1: ( rule__BaseBoolean__Group_1__0__Impl rule__BaseBoolean__Group_1__1 )
            // InternalMGLang.g:3461:2: rule__BaseBoolean__Group_1__0__Impl rule__BaseBoolean__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__BaseBoolean__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_1__0"


    // $ANTLR start "rule__BaseBoolean__Group_1__0__Impl"
    // InternalMGLang.g:3468:1: rule__BaseBoolean__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BaseBoolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3472:1: ( ( '(' ) )
            // InternalMGLang.g:3473:1: ( '(' )
            {
            // InternalMGLang.g:3473:1: ( '(' )
            // InternalMGLang.g:3474:2: '('
            {
             before(grammarAccess.getBaseBooleanAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBaseBooleanAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_1__0__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_1__1"
    // InternalMGLang.g:3483:1: rule__BaseBoolean__Group_1__1 : rule__BaseBoolean__Group_1__1__Impl rule__BaseBoolean__Group_1__2 ;
    public final void rule__BaseBoolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3487:1: ( rule__BaseBoolean__Group_1__1__Impl rule__BaseBoolean__Group_1__2 )
            // InternalMGLang.g:3488:2: rule__BaseBoolean__Group_1__1__Impl rule__BaseBoolean__Group_1__2
            {
            pushFollow(FOLLOW_36);
            rule__BaseBoolean__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_1__1"


    // $ANTLR start "rule__BaseBoolean__Group_1__1__Impl"
    // InternalMGLang.g:3495:1: rule__BaseBoolean__Group_1__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__BaseBoolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3499:1: ( ( ruleBooleanExpression ) )
            // InternalMGLang.g:3500:1: ( ruleBooleanExpression )
            {
            // InternalMGLang.g:3500:1: ( ruleBooleanExpression )
            // InternalMGLang.g:3501:2: ruleBooleanExpression
            {
             before(grammarAccess.getBaseBooleanAccess().getBooleanExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBaseBooleanAccess().getBooleanExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_1__1__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_1__2"
    // InternalMGLang.g:3510:1: rule__BaseBoolean__Group_1__2 : rule__BaseBoolean__Group_1__2__Impl ;
    public final void rule__BaseBoolean__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3514:1: ( rule__BaseBoolean__Group_1__2__Impl )
            // InternalMGLang.g:3515:2: rule__BaseBoolean__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_1__2"


    // $ANTLR start "rule__BaseBoolean__Group_1__2__Impl"
    // InternalMGLang.g:3521:1: rule__BaseBoolean__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BaseBoolean__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3525:1: ( ( ')' ) )
            // InternalMGLang.g:3526:1: ( ')' )
            {
            // InternalMGLang.g:3526:1: ( ')' )
            // InternalMGLang.g:3527:2: ')'
            {
             before(grammarAccess.getBaseBooleanAccess().getRightParenthesisKeyword_1_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBaseBooleanAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_1__2__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_2__0"
    // InternalMGLang.g:3537:1: rule__BaseBoolean__Group_2__0 : rule__BaseBoolean__Group_2__0__Impl rule__BaseBoolean__Group_2__1 ;
    public final void rule__BaseBoolean__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3541:1: ( rule__BaseBoolean__Group_2__0__Impl rule__BaseBoolean__Group_2__1 )
            // InternalMGLang.g:3542:2: rule__BaseBoolean__Group_2__0__Impl rule__BaseBoolean__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__BaseBoolean__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_2__0"


    // $ANTLR start "rule__BaseBoolean__Group_2__0__Impl"
    // InternalMGLang.g:3549:1: rule__BaseBoolean__Group_2__0__Impl : ( () ) ;
    public final void rule__BaseBoolean__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3553:1: ( ( () ) )
            // InternalMGLang.g:3554:1: ( () )
            {
            // InternalMGLang.g:3554:1: ( () )
            // InternalMGLang.g:3555:2: ()
            {
             before(grammarAccess.getBaseBooleanAccess().getBooleanLiteralAction_2_0()); 
            // InternalMGLang.g:3556:2: ()
            // InternalMGLang.g:3556:3: 
            {
            }

             after(grammarAccess.getBaseBooleanAccess().getBooleanLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_2__0__Impl"


    // $ANTLR start "rule__BaseBoolean__Group_2__1"
    // InternalMGLang.g:3564:1: rule__BaseBoolean__Group_2__1 : rule__BaseBoolean__Group_2__1__Impl ;
    public final void rule__BaseBoolean__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3568:1: ( rule__BaseBoolean__Group_2__1__Impl )
            // InternalMGLang.g:3569:2: rule__BaseBoolean__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseBoolean__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_2__1"


    // $ANTLR start "rule__BaseBoolean__Group_2__1__Impl"
    // InternalMGLang.g:3575:1: rule__BaseBoolean__Group_2__1__Impl : ( ( rule__BaseBoolean__ValueAssignment_2_1 ) ) ;
    public final void rule__BaseBoolean__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3579:1: ( ( ( rule__BaseBoolean__ValueAssignment_2_1 ) ) )
            // InternalMGLang.g:3580:1: ( ( rule__BaseBoolean__ValueAssignment_2_1 ) )
            {
            // InternalMGLang.g:3580:1: ( ( rule__BaseBoolean__ValueAssignment_2_1 ) )
            // InternalMGLang.g:3581:2: ( rule__BaseBoolean__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBaseBooleanAccess().getValueAssignment_2_1()); 
            // InternalMGLang.g:3582:2: ( rule__BaseBoolean__ValueAssignment_2_1 )
            // InternalMGLang.g:3582:3: rule__BaseBoolean__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseBoolean__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseBooleanAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__Group_2__1__Impl"


    // $ANTLR start "rule__StringConcatenation__Group__0"
    // InternalMGLang.g:3591:1: rule__StringConcatenation__Group__0 : rule__StringConcatenation__Group__0__Impl rule__StringConcatenation__Group__1 ;
    public final void rule__StringConcatenation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3595:1: ( rule__StringConcatenation__Group__0__Impl rule__StringConcatenation__Group__1 )
            // InternalMGLang.g:3596:2: rule__StringConcatenation__Group__0__Impl rule__StringConcatenation__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMGLang.g:3603:1: rule__StringConcatenation__Group__0__Impl : ( ruleStringLiteral ) ;
    public final void rule__StringConcatenation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3607:1: ( ( ruleStringLiteral ) )
            // InternalMGLang.g:3608:1: ( ruleStringLiteral )
            {
            // InternalMGLang.g:3608:1: ( ruleStringLiteral )
            // InternalMGLang.g:3609:2: ruleStringLiteral
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
    // InternalMGLang.g:3618:1: rule__StringConcatenation__Group__1 : rule__StringConcatenation__Group__1__Impl ;
    public final void rule__StringConcatenation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3622:1: ( rule__StringConcatenation__Group__1__Impl )
            // InternalMGLang.g:3623:2: rule__StringConcatenation__Group__1__Impl
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
    // InternalMGLang.g:3629:1: rule__StringConcatenation__Group__1__Impl : ( ( rule__StringConcatenation__Group_1__0 )? ) ;
    public final void rule__StringConcatenation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3633:1: ( ( ( rule__StringConcatenation__Group_1__0 )? ) )
            // InternalMGLang.g:3634:1: ( ( rule__StringConcatenation__Group_1__0 )? )
            {
            // InternalMGLang.g:3634:1: ( ( rule__StringConcatenation__Group_1__0 )? )
            // InternalMGLang.g:3635:2: ( rule__StringConcatenation__Group_1__0 )?
            {
             before(grammarAccess.getStringConcatenationAccess().getGroup_1()); 
            // InternalMGLang.g:3636:2: ( rule__StringConcatenation__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMGLang.g:3636:3: rule__StringConcatenation__Group_1__0
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
    // InternalMGLang.g:3645:1: rule__StringConcatenation__Group_1__0 : rule__StringConcatenation__Group_1__0__Impl rule__StringConcatenation__Group_1__1 ;
    public final void rule__StringConcatenation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3649:1: ( rule__StringConcatenation__Group_1__0__Impl rule__StringConcatenation__Group_1__1 )
            // InternalMGLang.g:3650:2: rule__StringConcatenation__Group_1__0__Impl rule__StringConcatenation__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMGLang.g:3657:1: rule__StringConcatenation__Group_1__0__Impl : ( () ) ;
    public final void rule__StringConcatenation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3661:1: ( ( () ) )
            // InternalMGLang.g:3662:1: ( () )
            {
            // InternalMGLang.g:3662:1: ( () )
            // InternalMGLang.g:3663:2: ()
            {
             before(grammarAccess.getStringConcatenationAccess().getConcatLeftAction_1_0()); 
            // InternalMGLang.g:3664:2: ()
            // InternalMGLang.g:3664:3: 
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
    // InternalMGLang.g:3672:1: rule__StringConcatenation__Group_1__1 : rule__StringConcatenation__Group_1__1__Impl rule__StringConcatenation__Group_1__2 ;
    public final void rule__StringConcatenation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3676:1: ( rule__StringConcatenation__Group_1__1__Impl rule__StringConcatenation__Group_1__2 )
            // InternalMGLang.g:3677:2: rule__StringConcatenation__Group_1__1__Impl rule__StringConcatenation__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMGLang.g:3684:1: rule__StringConcatenation__Group_1__1__Impl : ( '+' ) ;
    public final void rule__StringConcatenation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3688:1: ( ( '+' ) )
            // InternalMGLang.g:3689:1: ( '+' )
            {
            // InternalMGLang.g:3689:1: ( '+' )
            // InternalMGLang.g:3690:2: '+'
            {
             before(grammarAccess.getStringConcatenationAccess().getPlusSignKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMGLang.g:3699:1: rule__StringConcatenation__Group_1__2 : rule__StringConcatenation__Group_1__2__Impl ;
    public final void rule__StringConcatenation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3703:1: ( rule__StringConcatenation__Group_1__2__Impl )
            // InternalMGLang.g:3704:2: rule__StringConcatenation__Group_1__2__Impl
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
    // InternalMGLang.g:3710:1: rule__StringConcatenation__Group_1__2__Impl : ( ( rule__StringConcatenation__RightAssignment_1_2 ) ) ;
    public final void rule__StringConcatenation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3714:1: ( ( ( rule__StringConcatenation__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:3715:1: ( ( rule__StringConcatenation__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:3715:1: ( ( rule__StringConcatenation__RightAssignment_1_2 ) )
            // InternalMGLang.g:3716:2: ( rule__StringConcatenation__RightAssignment_1_2 )
            {
             before(grammarAccess.getStringConcatenationAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:3717:2: ( rule__StringConcatenation__RightAssignment_1_2 )
            // InternalMGLang.g:3717:3: rule__StringConcatenation__RightAssignment_1_2
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
    // InternalMGLang.g:3726:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3730:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:3731:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
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
    // InternalMGLang.g:3738:1: rule__Generator__Group__0__Impl : ( () ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3742:1: ( ( () ) )
            // InternalMGLang.g:3743:1: ( () )
            {
            // InternalMGLang.g:3743:1: ( () )
            // InternalMGLang.g:3744:2: ()
            {
             before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            // InternalMGLang.g:3745:2: ()
            // InternalMGLang.g:3745:3: 
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
    // InternalMGLang.g:3753:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3757:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:3758:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
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
    // InternalMGLang.g:3765:1: rule__Generator__Group__1__Impl : ( 'gen' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3769:1: ( ( 'gen' ) )
            // InternalMGLang.g:3770:1: ( 'gen' )
            {
            // InternalMGLang.g:3770:1: ( 'gen' )
            // InternalMGLang.g:3771:2: 'gen'
            {
             before(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMGLang.g:3780:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3784:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:3785:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalMGLang.g:3792:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3796:1: ( ( '(' ) )
            // InternalMGLang.g:3797:1: ( '(' )
            {
            // InternalMGLang.g:3797:1: ( '(' )
            // InternalMGLang.g:3798:2: '('
            {
             before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMGLang.g:3807:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3811:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:3812:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
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
    // InternalMGLang.g:3819:1: rule__Generator__Group__3__Impl : ( ')' ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3823:1: ( ( ')' ) )
            // InternalMGLang.g:3824:1: ( ')' )
            {
            // InternalMGLang.g:3824:1: ( ')' )
            // InternalMGLang.g:3825:2: ')'
            {
             before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMGLang.g:3834:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3838:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:3839:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalMGLang.g:3846:1: rule__Generator__Group__4__Impl : ( '{' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3850:1: ( ( '{' ) )
            // InternalMGLang.g:3851:1: ( '{' )
            {
            // InternalMGLang.g:3851:1: ( '{' )
            // InternalMGLang.g:3852:2: '{'
            {
             before(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMGLang.g:3861:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3865:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:3866:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalMGLang.g:3873:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__CommandsAssignment_5 )* ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3877:1: ( ( ( rule__Generator__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:3878:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:3878:1: ( ( rule__Generator__CommandsAssignment_5 )* )
            // InternalMGLang.g:3879:2: ( rule__Generator__CommandsAssignment_5 )*
            {
             before(grammarAccess.getGeneratorAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:3880:2: ( rule__Generator__CommandsAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMGLang.g:3880:3: rule__Generator__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Generator__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMGLang.g:3888:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3892:1: ( rule__Generator__Group__6__Impl )
            // InternalMGLang.g:3893:2: rule__Generator__Group__6__Impl
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
    // InternalMGLang.g:3899:1: rule__Generator__Group__6__Impl : ( '}' ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3903:1: ( ( '}' ) )
            // InternalMGLang.g:3904:1: ( '}' )
            {
            // InternalMGLang.g:3904:1: ( '}' )
            // InternalMGLang.g:3905:2: '}'
            {
             before(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMGLang.g:3915:1: rule__PatternObjectCreation__Group__0 : rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 ;
    public final void rule__PatternObjectCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3919:1: ( rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 )
            // InternalMGLang.g:3920:2: rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1
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
    // InternalMGLang.g:3927:1: rule__PatternObjectCreation__Group__0__Impl : ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) ;
    public final void rule__PatternObjectCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3931:1: ( ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) )
            // InternalMGLang.g:3932:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            {
            // InternalMGLang.g:3932:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            // InternalMGLang.g:3933:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 
            // InternalMGLang.g:3934:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            // InternalMGLang.g:3934:3: rule__PatternObjectCreation__PObjectAssignment_0
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
    // InternalMGLang.g:3942:1: rule__PatternObjectCreation__Group__1 : rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 ;
    public final void rule__PatternObjectCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3946:1: ( rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 )
            // InternalMGLang.g:3947:2: rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2
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
    // InternalMGLang.g:3954:1: rule__PatternObjectCreation__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternObjectCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3958:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3959:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3959:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3960:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:3969:1: rule__PatternObjectCreation__Group__2 : rule__PatternObjectCreation__Group__2__Impl ;
    public final void rule__PatternObjectCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3973:1: ( rule__PatternObjectCreation__Group__2__Impl )
            // InternalMGLang.g:3974:2: rule__PatternObjectCreation__Group__2__Impl
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
    // InternalMGLang.g:3980:1: rule__PatternObjectCreation__Group__2__Impl : ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) ;
    public final void rule__PatternObjectCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3984:1: ( ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) )
            // InternalMGLang.g:3985:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            {
            // InternalMGLang.g:3985:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            // InternalMGLang.g:3986:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            {
             before(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 
            // InternalMGLang.g:3987:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            // InternalMGLang.g:3987:3: rule__PatternObjectCreation__PatternCallAssignment_2
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
    // InternalMGLang.g:3996:1: rule__PatternObject__Group__0 : rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 ;
    public final void rule__PatternObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4000:1: ( rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 )
            // InternalMGLang.g:4001:2: rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1
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
    // InternalMGLang.g:4008:1: rule__PatternObject__Group__0__Impl : ( ( rule__PatternObject__TypeAssignment_0 ) ) ;
    public final void rule__PatternObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4012:1: ( ( ( rule__PatternObject__TypeAssignment_0 ) ) )
            // InternalMGLang.g:4013:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:4013:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            // InternalMGLang.g:4014:2: ( rule__PatternObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:4015:2: ( rule__PatternObject__TypeAssignment_0 )
            // InternalMGLang.g:4015:3: rule__PatternObject__TypeAssignment_0
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
    // InternalMGLang.g:4023:1: rule__PatternObject__Group__1 : rule__PatternObject__Group__1__Impl ;
    public final void rule__PatternObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4027:1: ( rule__PatternObject__Group__1__Impl )
            // InternalMGLang.g:4028:2: rule__PatternObject__Group__1__Impl
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
    // InternalMGLang.g:4034:1: rule__PatternObject__Group__1__Impl : ( ( rule__PatternObject__NameAssignment_1 ) ) ;
    public final void rule__PatternObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4038:1: ( ( ( rule__PatternObject__NameAssignment_1 ) ) )
            // InternalMGLang.g:4039:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            {
            // InternalMGLang.g:4039:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            // InternalMGLang.g:4040:2: ( rule__PatternObject__NameAssignment_1 )
            {
             before(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 
            // InternalMGLang.g:4041:2: ( rule__PatternObject__NameAssignment_1 )
            // InternalMGLang.g:4041:3: rule__PatternObject__NameAssignment_1
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
    // InternalMGLang.g:4050:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4054:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalMGLang.g:4055:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
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
    // InternalMGLang.g:4062:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4066:1: ( ( 'for' ) )
            // InternalMGLang.g:4067:1: ( 'for' )
            {
            // InternalMGLang.g:4067:1: ( 'for' )
            // InternalMGLang.g:4068:2: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMGLang.g:4077:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4081:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalMGLang.g:4082:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:4089:1: rule__ForLoop__Group__1__Impl : ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4093:1: ( ( ( rule__ForLoop__IteratorVarAssignment_1 ) ) )
            // InternalMGLang.g:4094:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            {
            // InternalMGLang.g:4094:1: ( ( rule__ForLoop__IteratorVarAssignment_1 ) )
            // InternalMGLang.g:4095:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            {
             before(grammarAccess.getForLoopAccess().getIteratorVarAssignment_1()); 
            // InternalMGLang.g:4096:2: ( rule__ForLoop__IteratorVarAssignment_1 )
            // InternalMGLang.g:4096:3: rule__ForLoop__IteratorVarAssignment_1
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
    // InternalMGLang.g:4104:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4108:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalMGLang.g:4109:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalMGLang.g:4116:1: rule__ForLoop__Group__2__Impl : ( 'in' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4120:1: ( ( 'in' ) )
            // InternalMGLang.g:4121:1: ( 'in' )
            {
            // InternalMGLang.g:4121:1: ( 'in' )
            // InternalMGLang.g:4122:2: 'in'
            {
             before(grammarAccess.getForLoopAccess().getInKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMGLang.g:4131:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4135:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalMGLang.g:4136:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
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
    // InternalMGLang.g:4143:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4147:1: ( ( ( rule__ForLoop__IteratingConditionAssignment_3 ) ) )
            // InternalMGLang.g:4148:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            {
            // InternalMGLang.g:4148:1: ( ( rule__ForLoop__IteratingConditionAssignment_3 ) )
            // InternalMGLang.g:4149:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getIteratingConditionAssignment_3()); 
            // InternalMGLang.g:4150:2: ( rule__ForLoop__IteratingConditionAssignment_3 )
            // InternalMGLang.g:4150:3: rule__ForLoop__IteratingConditionAssignment_3
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
    // InternalMGLang.g:4158:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4162:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalMGLang.g:4163:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalMGLang.g:4170:1: rule__ForLoop__Group__4__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4174:1: ( ( '{' ) )
            // InternalMGLang.g:4175:1: ( '{' )
            {
            // InternalMGLang.g:4175:1: ( '{' )
            // InternalMGLang.g:4176:2: '{'
            {
             before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMGLang.g:4185:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4189:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalMGLang.g:4190:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalMGLang.g:4197:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CommandsAssignment_5 )* ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4201:1: ( ( ( rule__ForLoop__CommandsAssignment_5 )* ) )
            // InternalMGLang.g:4202:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            {
            // InternalMGLang.g:4202:1: ( ( rule__ForLoop__CommandsAssignment_5 )* )
            // InternalMGLang.g:4203:2: ( rule__ForLoop__CommandsAssignment_5 )*
            {
             before(grammarAccess.getForLoopAccess().getCommandsAssignment_5()); 
            // InternalMGLang.g:4204:2: ( rule__ForLoop__CommandsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMGLang.g:4204:3: rule__ForLoop__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ForLoop__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMGLang.g:4212:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4216:1: ( rule__ForLoop__Group__6__Impl )
            // InternalMGLang.g:4217:2: rule__ForLoop__Group__6__Impl
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
    // InternalMGLang.g:4223:1: rule__ForLoop__Group__6__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4227:1: ( ( '}' ) )
            // InternalMGLang.g:4228:1: ( '}' )
            {
            // InternalMGLang.g:4228:1: ( '}' )
            // InternalMGLang.g:4229:2: '}'
            {
             before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMGLang.g:4239:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4243:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:4244:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMGLang.g:4251:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4255:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:4256:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:4256:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:4257:2: ( rule__ForRange__StartAssignment_0 )
            {
             before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            // InternalMGLang.g:4258:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:4258:3: rule__ForRange__StartAssignment_0
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
    // InternalMGLang.g:4266:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4270:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:4271:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:4278:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4282:1: ( ( ':' ) )
            // InternalMGLang.g:4283:1: ( ':' )
            {
            // InternalMGLang.g:4283:1: ( ':' )
            // InternalMGLang.g:4284:2: ':'
            {
             before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMGLang.g:4293:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4297:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:4298:2: rule__ForRange__Group__2__Impl
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
    // InternalMGLang.g:4304:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4308:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:4309:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:4309:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:4310:2: ( rule__ForRange__EndAssignment_2 )
            {
             before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            // InternalMGLang.g:4311:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:4311:3: rule__ForRange__EndAssignment_2
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
    // InternalMGLang.g:4320:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4324:1: ( ( ruleImport ) )
            // InternalMGLang.g:4325:2: ( ruleImport )
            {
            // InternalMGLang.g:4325:2: ( ruleImport )
            // InternalMGLang.g:4326:3: ruleImport
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
    // InternalMGLang.g:4335:1: rule__MofgenFile__PatternsAssignment_1_0 : ( rulePattern ) ;
    public final void rule__MofgenFile__PatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4339:1: ( ( rulePattern ) )
            // InternalMGLang.g:4340:2: ( rulePattern )
            {
            // InternalMGLang.g:4340:2: ( rulePattern )
            // InternalMGLang.g:4341:3: rulePattern
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
    // InternalMGLang.g:4350:1: rule__MofgenFile__GeneratorsAssignment_1_1 : ( ruleGenerator ) ;
    public final void rule__MofgenFile__GeneratorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4354:1: ( ( ruleGenerator ) )
            // InternalMGLang.g:4355:2: ( ruleGenerator )
            {
            // InternalMGLang.g:4355:2: ( ruleGenerator )
            // InternalMGLang.g:4356:3: ruleGenerator
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
    // InternalMGLang.g:4365:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4369:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:4370:2: ( RULE_STRING )
            {
            // InternalMGLang.g:4370:2: ( RULE_STRING )
            // InternalMGLang.g:4371:3: RULE_STRING
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
    // InternalMGLang.g:4380:1: rule__Import__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4384:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4385:2: ( RULE_ID )
            {
            // InternalMGLang.g:4385:2: ( RULE_ID )
            // InternalMGLang.g:4386:3: RULE_ID
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
    // InternalMGLang.g:4395:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4399:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4400:2: ( RULE_ID )
            {
            // InternalMGLang.g:4400:2: ( RULE_ID )
            // InternalMGLang.g:4401:3: RULE_ID
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
    // InternalMGLang.g:4410:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4414:1: ( ( ruleParameter ) )
            // InternalMGLang.g:4415:2: ( ruleParameter )
            {
            // InternalMGLang.g:4415:2: ( ruleParameter )
            // InternalMGLang.g:4416:3: ruleParameter
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
    // InternalMGLang.g:4425:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4429:1: ( ( ruleParameter ) )
            // InternalMGLang.g:4430:2: ( ruleParameter )
            {
            // InternalMGLang.g:4430:2: ( ruleParameter )
            // InternalMGLang.g:4431:3: ruleParameter
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
    // InternalMGLang.g:4440:1: rule__Pattern__NodesAssignment_4 : ( ruleNode ) ;
    public final void rule__Pattern__NodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4444:1: ( ( ruleNode ) )
            // InternalMGLang.g:4445:2: ( ruleNode )
            {
            // InternalMGLang.g:4445:2: ( ruleNode )
            // InternalMGLang.g:4446:3: ruleNode
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
    // InternalMGLang.g:4455:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4459:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:4460:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:4460:2: ( rulePatternReturn )
            // InternalMGLang.g:4461:3: rulePatternReturn
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
    // InternalMGLang.g:4470:1: rule__PatternReturn__ReturnValueAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternReturn__ReturnValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4474:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4475:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4475:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4476:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            // InternalMGLang.g:4477:3: ( RULE_ID )
            // InternalMGLang.g:4478:4: RULE_ID
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
    // InternalMGLang.g:4489:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4493:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4494:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4494:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4495:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            // InternalMGLang.g:4496:3: ( RULE_ID )
            // InternalMGLang.g:4497:4: RULE_ID
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
    // InternalMGLang.g:4508:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4512:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4513:2: ( RULE_ID )
            {
            // InternalMGLang.g:4513:2: ( RULE_ID )
            // InternalMGLang.g:4514:3: RULE_ID
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
    // InternalMGLang.g:4523:1: rule__Node__CreatedByAssignment_2 : ( ( rule__Node__CreatedByAlternatives_2_0 ) ) ;
    public final void rule__Node__CreatedByAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4527:1: ( ( ( rule__Node__CreatedByAlternatives_2_0 ) ) )
            // InternalMGLang.g:4528:2: ( ( rule__Node__CreatedByAlternatives_2_0 ) )
            {
            // InternalMGLang.g:4528:2: ( ( rule__Node__CreatedByAlternatives_2_0 ) )
            // InternalMGLang.g:4529:3: ( rule__Node__CreatedByAlternatives_2_0 )
            {
             before(grammarAccess.getNodeAccess().getCreatedByAlternatives_2_0()); 
            // InternalMGLang.g:4530:3: ( rule__Node__CreatedByAlternatives_2_0 )
            // InternalMGLang.g:4530:4: rule__Node__CreatedByAlternatives_2_0
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
    // InternalMGLang.g:4538:1: rule__NodeConstructor__RefsAssignsAssignment_2 : ( ruleNodeReferenceOrAssignment ) ;
    public final void rule__NodeConstructor__RefsAssignsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4542:1: ( ( ruleNodeReferenceOrAssignment ) )
            // InternalMGLang.g:4543:2: ( ruleNodeReferenceOrAssignment )
            {
            // InternalMGLang.g:4543:2: ( ruleNodeReferenceOrAssignment )
            // InternalMGLang.g:4544:3: ruleNodeReferenceOrAssignment
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
    // InternalMGLang.g:4553:1: rule__PatternCall__CalledAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4557:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4558:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4558:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4559:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            // InternalMGLang.g:4560:3: ( RULE_ID )
            // InternalMGLang.g:4561:4: RULE_ID
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
    // InternalMGLang.g:4572:1: rule__PatternCall__ParamsAssignment_2 : ( ruleStringExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4576:1: ( ( ruleStringExpression ) )
            // InternalMGLang.g:4577:2: ( ruleStringExpression )
            {
            // InternalMGLang.g:4577:2: ( ruleStringExpression )
            // InternalMGLang.g:4578:3: ruleStringExpression
            {
             before(grammarAccess.getPatternCallAccess().getParamsStringExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getPatternCallAccess().getParamsStringExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4587:1: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 : ( ruleBooleanExpression ) ;
    public final void rule__NodeReferenceOrAssignment__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4591:1: ( ( ruleBooleanExpression ) )
            // InternalMGLang.g:4592:2: ( ruleBooleanExpression )
            {
            // InternalMGLang.g:4592:2: ( ruleBooleanExpression )
            // InternalMGLang.g:4593:3: ruleBooleanExpression
            {
             before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionBooleanExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionBooleanExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PatternNodeReference__TypeAssignment_0"
    // InternalMGLang.g:4602:1: rule__PatternNodeReference__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4606:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4607:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4607:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4608:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            // InternalMGLang.g:4609:3: ( RULE_ID )
            // InternalMGLang.g:4610:4: RULE_ID
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
    // InternalMGLang.g:4621:1: rule__PatternNodeReference__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4625:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4626:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4626:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4627:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            // InternalMGLang.g:4628:3: ( RULE_ID )
            // InternalMGLang.g:4629:4: RULE_ID
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
    // InternalMGLang.g:4640:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4644:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4645:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4645:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4646:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 
            // InternalMGLang.g:4647:3: ( RULE_ID )
            // InternalMGLang.g:4648:4: RULE_ID
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
    // InternalMGLang.g:4659:1: rule__Assignment__ValueAssignment_2 : ( ruleStringExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4663:1: ( ( ruleStringExpression ) )
            // InternalMGLang.g:4664:2: ( ruleStringExpression )
            {
            // InternalMGLang.g:4664:2: ( ruleStringExpression )
            // InternalMGLang.g:4665:3: ruleStringExpression
            {
             before(grammarAccess.getAssignmentAccess().getValueStringExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueStringExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4674:1: rule__NodeAttributeCall__NodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4678:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4679:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4679:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4680:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getNodeNodeCrossReference_0_0()); 
            // InternalMGLang.g:4681:3: ( RULE_ID )
            // InternalMGLang.g:4682:4: RULE_ID
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
    // InternalMGLang.g:4693:1: rule__NodeAttributeCall__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NodeAttributeCall__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4697:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4698:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4698:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4699:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAttributeCallAccess().getAttributeEAttributeCrossReference_2_0()); 
            // InternalMGLang.g:4700:3: ( RULE_ID )
            // InternalMGLang.g:4701:4: RULE_ID
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
    // InternalMGLang.g:4712:1: rule__PrimitiveParameter__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4716:1: ( ( rulePrimitiveType ) )
            // InternalMGLang.g:4717:2: ( rulePrimitiveType )
            {
            // InternalMGLang.g:4717:2: ( rulePrimitiveType )
            // InternalMGLang.g:4718:3: rulePrimitiveType
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
    // InternalMGLang.g:4727:1: rule__PrimitiveParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4731:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4732:2: ( RULE_ID )
            {
            // InternalMGLang.g:4732:2: ( RULE_ID )
            // InternalMGLang.g:4733:3: RULE_ID
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
    // InternalMGLang.g:4742:1: rule__ObjectParameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4746:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4747:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4747:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4748:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectParameterAccess().getTypeEClassifierCrossReference_0_0()); 
            // InternalMGLang.g:4749:3: ( RULE_ID )
            // InternalMGLang.g:4750:4: RULE_ID
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
    // InternalMGLang.g:4761:1: rule__ObjectParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4765:1: ( ( RULE_ID ) )
            // InternalMGLang.g:4766:2: ( RULE_ID )
            {
            // InternalMGLang.g:4766:2: ( RULE_ID )
            // InternalMGLang.g:4767:3: RULE_ID
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


    // $ANTLR start "rule__ParameterRef__RefAssignment"
    // InternalMGLang.g:4776:1: rule__ParameterRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4780:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4781:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4781:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4782:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 
            // InternalMGLang.g:4783:3: ( RULE_ID )
            // InternalMGLang.g:4784:4: RULE_ID
            {
             before(grammarAccess.getParameterRefAccess().getRefParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterRefAccess().getRefParameterIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRef__RefAssignment"


    // $ANTLR start "rule__MethodCall__CalledNodeAssignment_0"
    // InternalMGLang.g:4795:1: rule__MethodCall__CalledNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__CalledNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4799:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4800:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4800:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4801:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodCallAccess().getCalledNodeNodeCrossReference_0_0()); 
            // InternalMGLang.g:4802:3: ( RULE_ID )
            // InternalMGLang.g:4803:4: RULE_ID
            {
             before(grammarAccess.getMethodCallAccess().getCalledNodeNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getCalledNodeNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodCallAccess().getCalledNodeNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__CalledNodeAssignment_0"


    // $ANTLR start "rule__MethodCall__MethodAssignment_2"
    // InternalMGLang.g:4814:1: rule__MethodCall__MethodAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4818:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:4819:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:4819:2: ( ( RULE_ID ) )
            // InternalMGLang.g:4820:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodCallAccess().getMethodEOperationCrossReference_2_0()); 
            // InternalMGLang.g:4821:3: ( RULE_ID )
            // InternalMGLang.g:4822:4: RULE_ID
            {
             before(grammarAccess.getMethodCallAccess().getMethodEOperationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getMethodEOperationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMethodCallAccess().getMethodEOperationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__MethodAssignment_2"


    // $ANTLR start "rule__RelationExpression__LhsAssignment_0"
    // InternalMGLang.g:4833:1: rule__RelationExpression__LhsAssignment_0 : ( ruleParameterOrMethodCall ) ;
    public final void rule__RelationExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4837:1: ( ( ruleParameterOrMethodCall ) )
            // InternalMGLang.g:4838:2: ( ruleParameterOrMethodCall )
            {
            // InternalMGLang.g:4838:2: ( ruleParameterOrMethodCall )
            // InternalMGLang.g:4839:3: ruleParameterOrMethodCall
            {
             before(grammarAccess.getRelationExpressionAccess().getLhsParameterOrMethodCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterOrMethodCall();

            state._fsp--;

             after(grammarAccess.getRelationExpressionAccess().getLhsParameterOrMethodCallParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__LhsAssignment_0"


    // $ANTLR start "rule__RelationExpression__RelationAssignment_1"
    // InternalMGLang.g:4848:1: rule__RelationExpression__RelationAssignment_1 : ( ruleRelationalOp ) ;
    public final void rule__RelationExpression__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4852:1: ( ( ruleRelationalOp ) )
            // InternalMGLang.g:4853:2: ( ruleRelationalOp )
            {
            // InternalMGLang.g:4853:2: ( ruleRelationalOp )
            // InternalMGLang.g:4854:3: ruleRelationalOp
            {
             before(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOp();

            state._fsp--;

             after(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__RelationAssignment_1"


    // $ANTLR start "rule__RelationExpression__RhsAssignment_2"
    // InternalMGLang.g:4863:1: rule__RelationExpression__RhsAssignment_2 : ( ruleParameterOrMethodCall ) ;
    public final void rule__RelationExpression__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4867:1: ( ( ruleParameterOrMethodCall ) )
            // InternalMGLang.g:4868:2: ( ruleParameterOrMethodCall )
            {
            // InternalMGLang.g:4868:2: ( ruleParameterOrMethodCall )
            // InternalMGLang.g:4869:3: ruleParameterOrMethodCall
            {
             before(grammarAccess.getRelationExpressionAccess().getRhsParameterOrMethodCallParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterOrMethodCall();

            state._fsp--;

             after(grammarAccess.getRelationExpressionAccess().getRhsParameterOrMethodCallParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__RhsAssignment_2"


    // $ANTLR start "rule__BooleanOr__RightAssignment_1_2"
    // InternalMGLang.g:4878:1: rule__BooleanOr__RightAssignment_1_2 : ( ruleBooleanXor ) ;
    public final void rule__BooleanOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4882:1: ( ( ruleBooleanXor ) )
            // InternalMGLang.g:4883:2: ( ruleBooleanXor )
            {
            // InternalMGLang.g:4883:2: ( ruleBooleanXor )
            // InternalMGLang.g:4884:3: ruleBooleanXor
            {
             before(grammarAccess.getBooleanOrAccess().getRightBooleanXorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanXor();

            state._fsp--;

             after(grammarAccess.getBooleanOrAccess().getRightBooleanXorParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOr__RightAssignment_1_2"


    // $ANTLR start "rule__BooleanXor__RightAssignment_1_2"
    // InternalMGLang.g:4893:1: rule__BooleanXor__RightAssignment_1_2 : ( ruleBooleanAnd ) ;
    public final void rule__BooleanXor__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4897:1: ( ( ruleBooleanAnd ) )
            // InternalMGLang.g:4898:2: ( ruleBooleanAnd )
            {
            // InternalMGLang.g:4898:2: ( ruleBooleanAnd )
            // InternalMGLang.g:4899:3: ruleBooleanAnd
            {
             before(grammarAccess.getBooleanXorAccess().getRightBooleanAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanAnd();

            state._fsp--;

             after(grammarAccess.getBooleanXorAccess().getRightBooleanAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanXor__RightAssignment_1_2"


    // $ANTLR start "rule__BooleanAnd__RightAssignment_1_2"
    // InternalMGLang.g:4908:1: rule__BooleanAnd__RightAssignment_1_2 : ( ruleBaseBoolean ) ;
    public final void rule__BooleanAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4912:1: ( ( ruleBaseBoolean ) )
            // InternalMGLang.g:4913:2: ( ruleBaseBoolean )
            {
            // InternalMGLang.g:4913:2: ( ruleBaseBoolean )
            // InternalMGLang.g:4914:3: ruleBaseBoolean
            {
             before(grammarAccess.getBooleanAndAccess().getRightBaseBooleanParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanAndAccess().getRightBaseBooleanParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnd__RightAssignment_1_2"


    // $ANTLR start "rule__BaseBoolean__ExprAssignment_0_3"
    // InternalMGLang.g:4923:1: rule__BaseBoolean__ExprAssignment_0_3 : ( ruleBooleanExpression ) ;
    public final void rule__BaseBoolean__ExprAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4927:1: ( ( ruleBooleanExpression ) )
            // InternalMGLang.g:4928:2: ( ruleBooleanExpression )
            {
            // InternalMGLang.g:4928:2: ( ruleBooleanExpression )
            // InternalMGLang.g:4929:3: ruleBooleanExpression
            {
             before(grammarAccess.getBaseBooleanAccess().getExprBooleanExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBaseBooleanAccess().getExprBooleanExpressionParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__ExprAssignment_0_3"


    // $ANTLR start "rule__BaseBoolean__ValueAssignment_2_1"
    // InternalMGLang.g:4938:1: rule__BaseBoolean__ValueAssignment_2_1 : ( ruleBoolean ) ;
    public final void rule__BaseBoolean__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4942:1: ( ( ruleBoolean ) )
            // InternalMGLang.g:4943:2: ( ruleBoolean )
            {
            // InternalMGLang.g:4943:2: ( ruleBoolean )
            // InternalMGLang.g:4944:3: ruleBoolean
            {
             before(grammarAccess.getBaseBooleanAccess().getValueBooleanEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBaseBooleanAccess().getValueBooleanEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBoolean__ValueAssignment_2_1"


    // $ANTLR start "rule__StringConcatenation__RightAssignment_1_2"
    // InternalMGLang.g:4953:1: rule__StringConcatenation__RightAssignment_1_2 : ( ruleStringConcatenation ) ;
    public final void rule__StringConcatenation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4957:1: ( ( ruleStringConcatenation ) )
            // InternalMGLang.g:4958:2: ( ruleStringConcatenation )
            {
            // InternalMGLang.g:4958:2: ( ruleStringConcatenation )
            // InternalMGLang.g:4959:3: ruleStringConcatenation
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
    // InternalMGLang.g:4968:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4972:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:4973:2: ( RULE_STRING )
            {
            // InternalMGLang.g:4973:2: ( RULE_STRING )
            // InternalMGLang.g:4974:3: RULE_STRING
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
    // InternalMGLang.g:4983:1: rule__Generator__CommandsAssignment_5 : ( ruleGeneratorElement ) ;
    public final void rule__Generator__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4987:1: ( ( ruleGeneratorElement ) )
            // InternalMGLang.g:4988:2: ( ruleGeneratorElement )
            {
            // InternalMGLang.g:4988:2: ( ruleGeneratorElement )
            // InternalMGLang.g:4989:3: ruleGeneratorElement
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
    // InternalMGLang.g:4998:1: rule__PatternObjectCreation__PObjectAssignment_0 : ( rulePatternObject ) ;
    public final void rule__PatternObjectCreation__PObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5002:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:5003:2: ( rulePatternObject )
            {
            // InternalMGLang.g:5003:2: ( rulePatternObject )
            // InternalMGLang.g:5004:3: rulePatternObject
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
    // InternalMGLang.g:5013:1: rule__PatternObjectCreation__PatternCallAssignment_2 : ( rulePatternCall ) ;
    public final void rule__PatternObjectCreation__PatternCallAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5017:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:5018:2: ( rulePatternCall )
            {
            // InternalMGLang.g:5018:2: ( rulePatternCall )
            // InternalMGLang.g:5019:3: rulePatternCall
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
    // InternalMGLang.g:5028:1: rule__PatternObject__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5032:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:5033:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:5033:2: ( ( RULE_ID ) )
            // InternalMGLang.g:5034:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 
            // InternalMGLang.g:5035:3: ( RULE_ID )
            // InternalMGLang.g:5036:4: RULE_ID
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
    // InternalMGLang.g:5047:1: rule__PatternObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5051:1: ( ( RULE_ID ) )
            // InternalMGLang.g:5052:2: ( RULE_ID )
            {
            // InternalMGLang.g:5052:2: ( RULE_ID )
            // InternalMGLang.g:5053:3: RULE_ID
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
    // InternalMGLang.g:5062:1: rule__ForLoop__IteratorVarAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForLoop__IteratorVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5066:1: ( ( RULE_ID ) )
            // InternalMGLang.g:5067:2: ( RULE_ID )
            {
            // InternalMGLang.g:5067:2: ( RULE_ID )
            // InternalMGLang.g:5068:3: RULE_ID
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
    // InternalMGLang.g:5077:1: rule__ForLoop__IteratingConditionAssignment_3 : ( ruleForCondition ) ;
    public final void rule__ForLoop__IteratingConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5081:1: ( ( ruleForCondition ) )
            // InternalMGLang.g:5082:2: ( ruleForCondition )
            {
            // InternalMGLang.g:5082:2: ( ruleForCondition )
            // InternalMGLang.g:5083:3: ruleForCondition
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
    // InternalMGLang.g:5092:1: rule__ForLoop__CommandsAssignment_5 : ( ruleGeneratorCommand ) ;
    public final void rule__ForLoop__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5096:1: ( ( ruleGeneratorCommand ) )
            // InternalMGLang.g:5097:2: ( ruleGeneratorCommand )
            {
            // InternalMGLang.g:5097:2: ( ruleGeneratorCommand )
            // InternalMGLang.g:5098:3: ruleGeneratorCommand
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
    // InternalMGLang.g:5107:1: rule__ForEachCollection__CollAssignment : ( ruleNodeAttributeCall ) ;
    public final void rule__ForEachCollection__CollAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5111:1: ( ( ruleNodeAttributeCall ) )
            // InternalMGLang.g:5112:2: ( ruleNodeAttributeCall )
            {
            // InternalMGLang.g:5112:2: ( ruleNodeAttributeCall )
            // InternalMGLang.g:5113:3: ruleNodeAttributeCall
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
    // InternalMGLang.g:5122:1: rule__ForRange__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5126:1: ( ( RULE_INT ) )
            // InternalMGLang.g:5127:2: ( RULE_INT )
            {
            // InternalMGLang.g:5127:2: ( RULE_INT )
            // InternalMGLang.g:5128:3: RULE_INT
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
    // InternalMGLang.g:5137:1: rule__ForRange__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5141:1: ( ( RULE_INT ) )
            // InternalMGLang.g:5142:2: ( RULE_INT )
            {
            // InternalMGLang.g:5142:2: ( RULE_INT )
            // InternalMGLang.g:5143:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080004000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040038040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000038040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020020006040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100018000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100008000042L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000018000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008000042L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000080L});

}