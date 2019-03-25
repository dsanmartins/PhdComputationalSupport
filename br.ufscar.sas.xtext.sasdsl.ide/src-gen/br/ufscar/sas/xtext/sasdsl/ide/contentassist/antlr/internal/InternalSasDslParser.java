package br.ufscar.sas.xtext.sasdsl.ide.contentassist.antlr.internal;

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
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSasDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Synchronized'", "'Coordinated'", "'Independent'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'", "'Abstractions'", "':'", "'Compositions'", "'Restrictions'", "'Managing'", "';'", "'Managed'", "'ControlLoopManager'", "'typeOf'", "'ControlLoop'", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'Probe'", "'Gauge'", "'ReferenceInput'", "'MeasuredOutput'", "'must-be-in'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalSasDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSasDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSasDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSasDsl.g"; }


    	private SasDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SasDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleArchitectureDefinition"
    // InternalSasDsl.g:53:1: entryRuleArchitectureDefinition : ruleArchitectureDefinition EOF ;
    public final void entryRuleArchitectureDefinition() throws RecognitionException {
        try {
            // InternalSasDsl.g:54:1: ( ruleArchitectureDefinition EOF )
            // InternalSasDsl.g:55:1: ruleArchitectureDefinition EOF
            {
             before(grammarAccess.getArchitectureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitectureDefinition();

            state._fsp--;

             after(grammarAccess.getArchitectureDefinitionRule()); 
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
    // $ANTLR end "entryRuleArchitectureDefinition"


    // $ANTLR start "ruleArchitectureDefinition"
    // InternalSasDsl.g:62:1: ruleArchitectureDefinition : ( ( rule__ArchitectureDefinition__Group__0 ) ) ;
    public final void ruleArchitectureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:66:2: ( ( ( rule__ArchitectureDefinition__Group__0 ) ) )
            // InternalSasDsl.g:67:2: ( ( rule__ArchitectureDefinition__Group__0 ) )
            {
            // InternalSasDsl.g:67:2: ( ( rule__ArchitectureDefinition__Group__0 ) )
            // InternalSasDsl.g:68:3: ( rule__ArchitectureDefinition__Group__0 )
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getGroup()); 
            // InternalSasDsl.g:69:3: ( rule__ArchitectureDefinition__Group__0 )
            // InternalSasDsl.g:69:4: rule__ArchitectureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitectureDefinition"


    // $ANTLR start "entryRuleDSLAbstractions"
    // InternalSasDsl.g:78:1: entryRuleDSLAbstractions : ruleDSLAbstractions EOF ;
    public final void entryRuleDSLAbstractions() throws RecognitionException {
        try {
            // InternalSasDsl.g:79:1: ( ruleDSLAbstractions EOF )
            // InternalSasDsl.g:80:1: ruleDSLAbstractions EOF
            {
             before(grammarAccess.getDSLAbstractionsRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLAbstractions();

            state._fsp--;

             after(grammarAccess.getDSLAbstractionsRule()); 
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
    // $ANTLR end "entryRuleDSLAbstractions"


    // $ANTLR start "ruleDSLAbstractions"
    // InternalSasDsl.g:87:1: ruleDSLAbstractions : ( ( rule__DSLAbstractions__Alternatives ) ) ;
    public final void ruleDSLAbstractions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:91:2: ( ( ( rule__DSLAbstractions__Alternatives ) ) )
            // InternalSasDsl.g:92:2: ( ( rule__DSLAbstractions__Alternatives ) )
            {
            // InternalSasDsl.g:92:2: ( ( rule__DSLAbstractions__Alternatives ) )
            // InternalSasDsl.g:93:3: ( rule__DSLAbstractions__Alternatives )
            {
             before(grammarAccess.getDSLAbstractionsAccess().getAlternatives()); 
            // InternalSasDsl.g:94:3: ( rule__DSLAbstractions__Alternatives )
            // InternalSasDsl.g:94:4: rule__DSLAbstractions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DSLAbstractions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDSLAbstractionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLAbstractions"


    // $ANTLR start "entryRuleDSLManaging"
    // InternalSasDsl.g:103:1: entryRuleDSLManaging : ruleDSLManaging EOF ;
    public final void entryRuleDSLManaging() throws RecognitionException {
        try {
            // InternalSasDsl.g:104:1: ( ruleDSLManaging EOF )
            // InternalSasDsl.g:105:1: ruleDSLManaging EOF
            {
             before(grammarAccess.getDSLManagingRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLManaging();

            state._fsp--;

             after(grammarAccess.getDSLManagingRule()); 
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
    // $ANTLR end "entryRuleDSLManaging"


    // $ANTLR start "ruleDSLManaging"
    // InternalSasDsl.g:112:1: ruleDSLManaging : ( ( rule__DSLManaging__Group__0 ) ) ;
    public final void ruleDSLManaging() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:116:2: ( ( ( rule__DSLManaging__Group__0 ) ) )
            // InternalSasDsl.g:117:2: ( ( rule__DSLManaging__Group__0 ) )
            {
            // InternalSasDsl.g:117:2: ( ( rule__DSLManaging__Group__0 ) )
            // InternalSasDsl.g:118:3: ( rule__DSLManaging__Group__0 )
            {
             before(grammarAccess.getDSLManagingAccess().getGroup()); 
            // InternalSasDsl.g:119:3: ( rule__DSLManaging__Group__0 )
            // InternalSasDsl.g:119:4: rule__DSLManaging__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLManaging__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLManagingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLManaging"


    // $ANTLR start "entryRuleDSLManaged"
    // InternalSasDsl.g:128:1: entryRuleDSLManaged : ruleDSLManaged EOF ;
    public final void entryRuleDSLManaged() throws RecognitionException {
        try {
            // InternalSasDsl.g:129:1: ( ruleDSLManaged EOF )
            // InternalSasDsl.g:130:1: ruleDSLManaged EOF
            {
             before(grammarAccess.getDSLManagedRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLManaged();

            state._fsp--;

             after(grammarAccess.getDSLManagedRule()); 
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
    // $ANTLR end "entryRuleDSLManaged"


    // $ANTLR start "ruleDSLManaged"
    // InternalSasDsl.g:137:1: ruleDSLManaged : ( ( rule__DSLManaged__Group__0 ) ) ;
    public final void ruleDSLManaged() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:141:2: ( ( ( rule__DSLManaged__Group__0 ) ) )
            // InternalSasDsl.g:142:2: ( ( rule__DSLManaged__Group__0 ) )
            {
            // InternalSasDsl.g:142:2: ( ( rule__DSLManaged__Group__0 ) )
            // InternalSasDsl.g:143:3: ( rule__DSLManaged__Group__0 )
            {
             before(grammarAccess.getDSLManagedAccess().getGroup()); 
            // InternalSasDsl.g:144:3: ( rule__DSLManaged__Group__0 )
            // InternalSasDsl.g:144:4: rule__DSLManaged__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLManaged__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLManagedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLManaged"


    // $ANTLR start "entryRuleDSLControlLoopManager"
    // InternalSasDsl.g:153:1: entryRuleDSLControlLoopManager : ruleDSLControlLoopManager EOF ;
    public final void entryRuleDSLControlLoopManager() throws RecognitionException {
        try {
            // InternalSasDsl.g:154:1: ( ruleDSLControlLoopManager EOF )
            // InternalSasDsl.g:155:1: ruleDSLControlLoopManager EOF
            {
             before(grammarAccess.getDSLControlLoopManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLControlLoopManager();

            state._fsp--;

             after(grammarAccess.getDSLControlLoopManagerRule()); 
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
    // $ANTLR end "entryRuleDSLControlLoopManager"


    // $ANTLR start "ruleDSLControlLoopManager"
    // InternalSasDsl.g:162:1: ruleDSLControlLoopManager : ( ( rule__DSLControlLoopManager__Group__0 ) ) ;
    public final void ruleDSLControlLoopManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:166:2: ( ( ( rule__DSLControlLoopManager__Group__0 ) ) )
            // InternalSasDsl.g:167:2: ( ( rule__DSLControlLoopManager__Group__0 ) )
            {
            // InternalSasDsl.g:167:2: ( ( rule__DSLControlLoopManager__Group__0 ) )
            // InternalSasDsl.g:168:3: ( rule__DSLControlLoopManager__Group__0 )
            {
             before(grammarAccess.getDSLControlLoopManagerAccess().getGroup()); 
            // InternalSasDsl.g:169:3: ( rule__DSLControlLoopManager__Group__0 )
            // InternalSasDsl.g:169:4: rule__DSLControlLoopManager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLControlLoopManager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLControlLoopManagerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLControlLoopManager"


    // $ANTLR start "entryRuleDSLTypeCLM"
    // InternalSasDsl.g:178:1: entryRuleDSLTypeCLM : ruleDSLTypeCLM EOF ;
    public final void entryRuleDSLTypeCLM() throws RecognitionException {
        try {
            // InternalSasDsl.g:179:1: ( ruleDSLTypeCLM EOF )
            // InternalSasDsl.g:180:1: ruleDSLTypeCLM EOF
            {
             before(grammarAccess.getDSLTypeCLMRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLTypeCLM();

            state._fsp--;

             after(grammarAccess.getDSLTypeCLMRule()); 
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
    // $ANTLR end "entryRuleDSLTypeCLM"


    // $ANTLR start "ruleDSLTypeCLM"
    // InternalSasDsl.g:187:1: ruleDSLTypeCLM : ( ( rule__DSLTypeCLM__Alternatives ) ) ;
    public final void ruleDSLTypeCLM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:191:2: ( ( ( rule__DSLTypeCLM__Alternatives ) ) )
            // InternalSasDsl.g:192:2: ( ( rule__DSLTypeCLM__Alternatives ) )
            {
            // InternalSasDsl.g:192:2: ( ( rule__DSLTypeCLM__Alternatives ) )
            // InternalSasDsl.g:193:3: ( rule__DSLTypeCLM__Alternatives )
            {
             before(grammarAccess.getDSLTypeCLMAccess().getAlternatives()); 
            // InternalSasDsl.g:194:3: ( rule__DSLTypeCLM__Alternatives )
            // InternalSasDsl.g:194:4: rule__DSLTypeCLM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DSLTypeCLM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDSLTypeCLMAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLTypeCLM"


    // $ANTLR start "entryRuleDSLControlLoop"
    // InternalSasDsl.g:203:1: entryRuleDSLControlLoop : ruleDSLControlLoop EOF ;
    public final void entryRuleDSLControlLoop() throws RecognitionException {
        try {
            // InternalSasDsl.g:204:1: ( ruleDSLControlLoop EOF )
            // InternalSasDsl.g:205:1: ruleDSLControlLoop EOF
            {
             before(grammarAccess.getDSLControlLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLControlLoop();

            state._fsp--;

             after(grammarAccess.getDSLControlLoopRule()); 
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
    // $ANTLR end "entryRuleDSLControlLoop"


    // $ANTLR start "ruleDSLControlLoop"
    // InternalSasDsl.g:212:1: ruleDSLControlLoop : ( ( rule__DSLControlLoop__Group__0 ) ) ;
    public final void ruleDSLControlLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:216:2: ( ( ( rule__DSLControlLoop__Group__0 ) ) )
            // InternalSasDsl.g:217:2: ( ( rule__DSLControlLoop__Group__0 ) )
            {
            // InternalSasDsl.g:217:2: ( ( rule__DSLControlLoop__Group__0 ) )
            // InternalSasDsl.g:218:3: ( rule__DSLControlLoop__Group__0 )
            {
             before(grammarAccess.getDSLControlLoopAccess().getGroup()); 
            // InternalSasDsl.g:219:3: ( rule__DSLControlLoop__Group__0 )
            // InternalSasDsl.g:219:4: rule__DSLControlLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLControlLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLControlLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLControlLoop"


    // $ANTLR start "entryRuleDSLMonitor"
    // InternalSasDsl.g:228:1: entryRuleDSLMonitor : ruleDSLMonitor EOF ;
    public final void entryRuleDSLMonitor() throws RecognitionException {
        try {
            // InternalSasDsl.g:229:1: ( ruleDSLMonitor EOF )
            // InternalSasDsl.g:230:1: ruleDSLMonitor EOF
            {
             before(grammarAccess.getDSLMonitorRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLMonitor();

            state._fsp--;

             after(grammarAccess.getDSLMonitorRule()); 
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
    // $ANTLR end "entryRuleDSLMonitor"


    // $ANTLR start "ruleDSLMonitor"
    // InternalSasDsl.g:237:1: ruleDSLMonitor : ( ( rule__DSLMonitor__Group__0 ) ) ;
    public final void ruleDSLMonitor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:241:2: ( ( ( rule__DSLMonitor__Group__0 ) ) )
            // InternalSasDsl.g:242:2: ( ( rule__DSLMonitor__Group__0 ) )
            {
            // InternalSasDsl.g:242:2: ( ( rule__DSLMonitor__Group__0 ) )
            // InternalSasDsl.g:243:3: ( rule__DSLMonitor__Group__0 )
            {
             before(grammarAccess.getDSLMonitorAccess().getGroup()); 
            // InternalSasDsl.g:244:3: ( rule__DSLMonitor__Group__0 )
            // InternalSasDsl.g:244:4: rule__DSLMonitor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLMonitor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLMonitorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLMonitor"


    // $ANTLR start "entryRuleDSLAnalyzer"
    // InternalSasDsl.g:253:1: entryRuleDSLAnalyzer : ruleDSLAnalyzer EOF ;
    public final void entryRuleDSLAnalyzer() throws RecognitionException {
        try {
            // InternalSasDsl.g:254:1: ( ruleDSLAnalyzer EOF )
            // InternalSasDsl.g:255:1: ruleDSLAnalyzer EOF
            {
             before(grammarAccess.getDSLAnalyzerRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLAnalyzer();

            state._fsp--;

             after(grammarAccess.getDSLAnalyzerRule()); 
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
    // $ANTLR end "entryRuleDSLAnalyzer"


    // $ANTLR start "ruleDSLAnalyzer"
    // InternalSasDsl.g:262:1: ruleDSLAnalyzer : ( ( rule__DSLAnalyzer__Group__0 ) ) ;
    public final void ruleDSLAnalyzer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:266:2: ( ( ( rule__DSLAnalyzer__Group__0 ) ) )
            // InternalSasDsl.g:267:2: ( ( rule__DSLAnalyzer__Group__0 ) )
            {
            // InternalSasDsl.g:267:2: ( ( rule__DSLAnalyzer__Group__0 ) )
            // InternalSasDsl.g:268:3: ( rule__DSLAnalyzer__Group__0 )
            {
             before(grammarAccess.getDSLAnalyzerAccess().getGroup()); 
            // InternalSasDsl.g:269:3: ( rule__DSLAnalyzer__Group__0 )
            // InternalSasDsl.g:269:4: rule__DSLAnalyzer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLAnalyzer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLAnalyzerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLAnalyzer"


    // $ANTLR start "entryRuleDSLPlanner"
    // InternalSasDsl.g:278:1: entryRuleDSLPlanner : ruleDSLPlanner EOF ;
    public final void entryRuleDSLPlanner() throws RecognitionException {
        try {
            // InternalSasDsl.g:279:1: ( ruleDSLPlanner EOF )
            // InternalSasDsl.g:280:1: ruleDSLPlanner EOF
            {
             before(grammarAccess.getDSLPlannerRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLPlanner();

            state._fsp--;

             after(grammarAccess.getDSLPlannerRule()); 
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
    // $ANTLR end "entryRuleDSLPlanner"


    // $ANTLR start "ruleDSLPlanner"
    // InternalSasDsl.g:287:1: ruleDSLPlanner : ( ( rule__DSLPlanner__Group__0 ) ) ;
    public final void ruleDSLPlanner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:291:2: ( ( ( rule__DSLPlanner__Group__0 ) ) )
            // InternalSasDsl.g:292:2: ( ( rule__DSLPlanner__Group__0 ) )
            {
            // InternalSasDsl.g:292:2: ( ( rule__DSLPlanner__Group__0 ) )
            // InternalSasDsl.g:293:3: ( rule__DSLPlanner__Group__0 )
            {
             before(grammarAccess.getDSLPlannerAccess().getGroup()); 
            // InternalSasDsl.g:294:3: ( rule__DSLPlanner__Group__0 )
            // InternalSasDsl.g:294:4: rule__DSLPlanner__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLPlanner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLPlannerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLPlanner"


    // $ANTLR start "entryRuleDSLExecutor"
    // InternalSasDsl.g:303:1: entryRuleDSLExecutor : ruleDSLExecutor EOF ;
    public final void entryRuleDSLExecutor() throws RecognitionException {
        try {
            // InternalSasDsl.g:304:1: ( ruleDSLExecutor EOF )
            // InternalSasDsl.g:305:1: ruleDSLExecutor EOF
            {
             before(grammarAccess.getDSLExecutorRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLExecutor();

            state._fsp--;

             after(grammarAccess.getDSLExecutorRule()); 
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
    // $ANTLR end "entryRuleDSLExecutor"


    // $ANTLR start "ruleDSLExecutor"
    // InternalSasDsl.g:312:1: ruleDSLExecutor : ( ( rule__DSLExecutor__Group__0 ) ) ;
    public final void ruleDSLExecutor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:316:2: ( ( ( rule__DSLExecutor__Group__0 ) ) )
            // InternalSasDsl.g:317:2: ( ( rule__DSLExecutor__Group__0 ) )
            {
            // InternalSasDsl.g:317:2: ( ( rule__DSLExecutor__Group__0 ) )
            // InternalSasDsl.g:318:3: ( rule__DSLExecutor__Group__0 )
            {
             before(grammarAccess.getDSLExecutorAccess().getGroup()); 
            // InternalSasDsl.g:319:3: ( rule__DSLExecutor__Group__0 )
            // InternalSasDsl.g:319:4: rule__DSLExecutor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLExecutor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLExecutorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLExecutor"


    // $ANTLR start "entryRuleDSLKnowledge"
    // InternalSasDsl.g:328:1: entryRuleDSLKnowledge : ruleDSLKnowledge EOF ;
    public final void entryRuleDSLKnowledge() throws RecognitionException {
        try {
            // InternalSasDsl.g:329:1: ( ruleDSLKnowledge EOF )
            // InternalSasDsl.g:330:1: ruleDSLKnowledge EOF
            {
             before(grammarAccess.getDSLKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLKnowledge();

            state._fsp--;

             after(grammarAccess.getDSLKnowledgeRule()); 
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
    // $ANTLR end "entryRuleDSLKnowledge"


    // $ANTLR start "ruleDSLKnowledge"
    // InternalSasDsl.g:337:1: ruleDSLKnowledge : ( ( rule__DSLKnowledge__Group__0 ) ) ;
    public final void ruleDSLKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:341:2: ( ( ( rule__DSLKnowledge__Group__0 ) ) )
            // InternalSasDsl.g:342:2: ( ( rule__DSLKnowledge__Group__0 ) )
            {
            // InternalSasDsl.g:342:2: ( ( rule__DSLKnowledge__Group__0 ) )
            // InternalSasDsl.g:343:3: ( rule__DSLKnowledge__Group__0 )
            {
             before(grammarAccess.getDSLKnowledgeAccess().getGroup()); 
            // InternalSasDsl.g:344:3: ( rule__DSLKnowledge__Group__0 )
            // InternalSasDsl.g:344:4: rule__DSLKnowledge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLKnowledge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLKnowledgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLKnowledge"


    // $ANTLR start "entryRuleDSLSensor"
    // InternalSasDsl.g:353:1: entryRuleDSLSensor : ruleDSLSensor EOF ;
    public final void entryRuleDSLSensor() throws RecognitionException {
        try {
            // InternalSasDsl.g:354:1: ( ruleDSLSensor EOF )
            // InternalSasDsl.g:355:1: ruleDSLSensor EOF
            {
             before(grammarAccess.getDSLSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLSensor();

            state._fsp--;

             after(grammarAccess.getDSLSensorRule()); 
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
    // $ANTLR end "entryRuleDSLSensor"


    // $ANTLR start "ruleDSLSensor"
    // InternalSasDsl.g:362:1: ruleDSLSensor : ( ( rule__DSLSensor__Group__0 ) ) ;
    public final void ruleDSLSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:366:2: ( ( ( rule__DSLSensor__Group__0 ) ) )
            // InternalSasDsl.g:367:2: ( ( rule__DSLSensor__Group__0 ) )
            {
            // InternalSasDsl.g:367:2: ( ( rule__DSLSensor__Group__0 ) )
            // InternalSasDsl.g:368:3: ( rule__DSLSensor__Group__0 )
            {
             before(grammarAccess.getDSLSensorAccess().getGroup()); 
            // InternalSasDsl.g:369:3: ( rule__DSLSensor__Group__0 )
            // InternalSasDsl.g:369:4: rule__DSLSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLSensor"


    // $ANTLR start "entryRuleDSLEffector"
    // InternalSasDsl.g:378:1: entryRuleDSLEffector : ruleDSLEffector EOF ;
    public final void entryRuleDSLEffector() throws RecognitionException {
        try {
            // InternalSasDsl.g:379:1: ( ruleDSLEffector EOF )
            // InternalSasDsl.g:380:1: ruleDSLEffector EOF
            {
             before(grammarAccess.getDSLEffectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLEffector();

            state._fsp--;

             after(grammarAccess.getDSLEffectorRule()); 
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
    // $ANTLR end "entryRuleDSLEffector"


    // $ANTLR start "ruleDSLEffector"
    // InternalSasDsl.g:387:1: ruleDSLEffector : ( ( rule__DSLEffector__Group__0 ) ) ;
    public final void ruleDSLEffector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:391:2: ( ( ( rule__DSLEffector__Group__0 ) ) )
            // InternalSasDsl.g:392:2: ( ( rule__DSLEffector__Group__0 ) )
            {
            // InternalSasDsl.g:392:2: ( ( rule__DSLEffector__Group__0 ) )
            // InternalSasDsl.g:393:3: ( rule__DSLEffector__Group__0 )
            {
             before(grammarAccess.getDSLEffectorAccess().getGroup()); 
            // InternalSasDsl.g:394:3: ( rule__DSLEffector__Group__0 )
            // InternalSasDsl.g:394:4: rule__DSLEffector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLEffector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLEffectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLEffector"


    // $ANTLR start "entryRuleDSLProbe"
    // InternalSasDsl.g:403:1: entryRuleDSLProbe : ruleDSLProbe EOF ;
    public final void entryRuleDSLProbe() throws RecognitionException {
        try {
            // InternalSasDsl.g:404:1: ( ruleDSLProbe EOF )
            // InternalSasDsl.g:405:1: ruleDSLProbe EOF
            {
             before(grammarAccess.getDSLProbeRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLProbe();

            state._fsp--;

             after(grammarAccess.getDSLProbeRule()); 
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
    // $ANTLR end "entryRuleDSLProbe"


    // $ANTLR start "ruleDSLProbe"
    // InternalSasDsl.g:412:1: ruleDSLProbe : ( ( rule__DSLProbe__Group__0 ) ) ;
    public final void ruleDSLProbe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:416:2: ( ( ( rule__DSLProbe__Group__0 ) ) )
            // InternalSasDsl.g:417:2: ( ( rule__DSLProbe__Group__0 ) )
            {
            // InternalSasDsl.g:417:2: ( ( rule__DSLProbe__Group__0 ) )
            // InternalSasDsl.g:418:3: ( rule__DSLProbe__Group__0 )
            {
             before(grammarAccess.getDSLProbeAccess().getGroup()); 
            // InternalSasDsl.g:419:3: ( rule__DSLProbe__Group__0 )
            // InternalSasDsl.g:419:4: rule__DSLProbe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLProbe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLProbeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLProbe"


    // $ANTLR start "entryRuleDSLGauge"
    // InternalSasDsl.g:428:1: entryRuleDSLGauge : ruleDSLGauge EOF ;
    public final void entryRuleDSLGauge() throws RecognitionException {
        try {
            // InternalSasDsl.g:429:1: ( ruleDSLGauge EOF )
            // InternalSasDsl.g:430:1: ruleDSLGauge EOF
            {
             before(grammarAccess.getDSLGaugeRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLGauge();

            state._fsp--;

             after(grammarAccess.getDSLGaugeRule()); 
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
    // $ANTLR end "entryRuleDSLGauge"


    // $ANTLR start "ruleDSLGauge"
    // InternalSasDsl.g:437:1: ruleDSLGauge : ( ( rule__DSLGauge__Group__0 ) ) ;
    public final void ruleDSLGauge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:441:2: ( ( ( rule__DSLGauge__Group__0 ) ) )
            // InternalSasDsl.g:442:2: ( ( rule__DSLGauge__Group__0 ) )
            {
            // InternalSasDsl.g:442:2: ( ( rule__DSLGauge__Group__0 ) )
            // InternalSasDsl.g:443:3: ( rule__DSLGauge__Group__0 )
            {
             before(grammarAccess.getDSLGaugeAccess().getGroup()); 
            // InternalSasDsl.g:444:3: ( rule__DSLGauge__Group__0 )
            // InternalSasDsl.g:444:4: rule__DSLGauge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLGauge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLGaugeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLGauge"


    // $ANTLR start "entryRuleDSLReferenceInput"
    // InternalSasDsl.g:453:1: entryRuleDSLReferenceInput : ruleDSLReferenceInput EOF ;
    public final void entryRuleDSLReferenceInput() throws RecognitionException {
        try {
            // InternalSasDsl.g:454:1: ( ruleDSLReferenceInput EOF )
            // InternalSasDsl.g:455:1: ruleDSLReferenceInput EOF
            {
             before(grammarAccess.getDSLReferenceInputRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLReferenceInput();

            state._fsp--;

             after(grammarAccess.getDSLReferenceInputRule()); 
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
    // $ANTLR end "entryRuleDSLReferenceInput"


    // $ANTLR start "ruleDSLReferenceInput"
    // InternalSasDsl.g:462:1: ruleDSLReferenceInput : ( ( rule__DSLReferenceInput__Group__0 ) ) ;
    public final void ruleDSLReferenceInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:466:2: ( ( ( rule__DSLReferenceInput__Group__0 ) ) )
            // InternalSasDsl.g:467:2: ( ( rule__DSLReferenceInput__Group__0 ) )
            {
            // InternalSasDsl.g:467:2: ( ( rule__DSLReferenceInput__Group__0 ) )
            // InternalSasDsl.g:468:3: ( rule__DSLReferenceInput__Group__0 )
            {
             before(grammarAccess.getDSLReferenceInputAccess().getGroup()); 
            // InternalSasDsl.g:469:3: ( rule__DSLReferenceInput__Group__0 )
            // InternalSasDsl.g:469:4: rule__DSLReferenceInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLReferenceInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLReferenceInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLReferenceInput"


    // $ANTLR start "entryRuleDSLMeasuredOutput"
    // InternalSasDsl.g:478:1: entryRuleDSLMeasuredOutput : ruleDSLMeasuredOutput EOF ;
    public final void entryRuleDSLMeasuredOutput() throws RecognitionException {
        try {
            // InternalSasDsl.g:479:1: ( ruleDSLMeasuredOutput EOF )
            // InternalSasDsl.g:480:1: ruleDSLMeasuredOutput EOF
            {
             before(grammarAccess.getDSLMeasuredOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLMeasuredOutput();

            state._fsp--;

             after(grammarAccess.getDSLMeasuredOutputRule()); 
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
    // $ANTLR end "entryRuleDSLMeasuredOutput"


    // $ANTLR start "ruleDSLMeasuredOutput"
    // InternalSasDsl.g:487:1: ruleDSLMeasuredOutput : ( ( rule__DSLMeasuredOutput__Group__0 ) ) ;
    public final void ruleDSLMeasuredOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:491:2: ( ( ( rule__DSLMeasuredOutput__Group__0 ) ) )
            // InternalSasDsl.g:492:2: ( ( rule__DSLMeasuredOutput__Group__0 ) )
            {
            // InternalSasDsl.g:492:2: ( ( rule__DSLMeasuredOutput__Group__0 ) )
            // InternalSasDsl.g:493:3: ( rule__DSLMeasuredOutput__Group__0 )
            {
             before(grammarAccess.getDSLMeasuredOutputAccess().getGroup()); 
            // InternalSasDsl.g:494:3: ( rule__DSLMeasuredOutput__Group__0 )
            // InternalSasDsl.g:494:4: rule__DSLMeasuredOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLMeasuredOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLMeasuredOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLMeasuredOutput"


    // $ANTLR start "entryRuleDSLCompositions"
    // InternalSasDsl.g:503:1: entryRuleDSLCompositions : ruleDSLCompositions EOF ;
    public final void entryRuleDSLCompositions() throws RecognitionException {
        try {
            // InternalSasDsl.g:504:1: ( ruleDSLCompositions EOF )
            // InternalSasDsl.g:505:1: ruleDSLCompositions EOF
            {
             before(grammarAccess.getDSLCompositionsRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLCompositions();

            state._fsp--;

             after(grammarAccess.getDSLCompositionsRule()); 
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
    // $ANTLR end "entryRuleDSLCompositions"


    // $ANTLR start "ruleDSLCompositions"
    // InternalSasDsl.g:512:1: ruleDSLCompositions : ( ( rule__DSLCompositions__Group__0 ) ) ;
    public final void ruleDSLCompositions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:516:2: ( ( ( rule__DSLCompositions__Group__0 ) ) )
            // InternalSasDsl.g:517:2: ( ( rule__DSLCompositions__Group__0 ) )
            {
            // InternalSasDsl.g:517:2: ( ( rule__DSLCompositions__Group__0 ) )
            // InternalSasDsl.g:518:3: ( rule__DSLCompositions__Group__0 )
            {
             before(grammarAccess.getDSLCompositionsAccess().getGroup()); 
            // InternalSasDsl.g:519:3: ( rule__DSLCompositions__Group__0 )
            // InternalSasDsl.g:519:4: rule__DSLCompositions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSLCompositions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLCompositionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLCompositions"


    // $ANTLR start "entryRuleDSLRestrictions"
    // InternalSasDsl.g:528:1: entryRuleDSLRestrictions : ruleDSLRestrictions EOF ;
    public final void entryRuleDSLRestrictions() throws RecognitionException {
        try {
            // InternalSasDsl.g:529:1: ( ruleDSLRestrictions EOF )
            // InternalSasDsl.g:530:1: ruleDSLRestrictions EOF
            {
             before(grammarAccess.getDSLRestrictionsRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLRestrictions();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsRule()); 
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
    // $ANTLR end "entryRuleDSLRestrictions"


    // $ANTLR start "ruleDSLRestrictions"
    // InternalSasDsl.g:537:1: ruleDSLRestrictions : ( ( rule__DSLRestrictions__Alternatives ) ) ;
    public final void ruleDSLRestrictions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:541:2: ( ( ( rule__DSLRestrictions__Alternatives ) ) )
            // InternalSasDsl.g:542:2: ( ( rule__DSLRestrictions__Alternatives ) )
            {
            // InternalSasDsl.g:542:2: ( ( rule__DSLRestrictions__Alternatives ) )
            // InternalSasDsl.g:543:3: ( rule__DSLRestrictions__Alternatives )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getAlternatives()); 
            // InternalSasDsl.g:544:3: ( rule__DSLRestrictions__Alternatives )
            // InternalSasDsl.g:544:4: rule__DSLRestrictions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLRestrictions"


    // $ANTLR start "entryRuleMustBeIn"
    // InternalSasDsl.g:553:1: entryRuleMustBeIn : ruleMustBeIn EOF ;
    public final void entryRuleMustBeIn() throws RecognitionException {
        try {
            // InternalSasDsl.g:554:1: ( ruleMustBeIn EOF )
            // InternalSasDsl.g:555:1: ruleMustBeIn EOF
            {
             before(grammarAccess.getMustBeInRule()); 
            pushFollow(FOLLOW_1);
            ruleMustBeIn();

            state._fsp--;

             after(grammarAccess.getMustBeInRule()); 
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
    // $ANTLR end "entryRuleMustBeIn"


    // $ANTLR start "ruleMustBeIn"
    // InternalSasDsl.g:562:1: ruleMustBeIn : ( ( rule__MustBeIn__MustBeInAssignment ) ) ;
    public final void ruleMustBeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:566:2: ( ( ( rule__MustBeIn__MustBeInAssignment ) ) )
            // InternalSasDsl.g:567:2: ( ( rule__MustBeIn__MustBeInAssignment ) )
            {
            // InternalSasDsl.g:567:2: ( ( rule__MustBeIn__MustBeInAssignment ) )
            // InternalSasDsl.g:568:3: ( rule__MustBeIn__MustBeInAssignment )
            {
             before(grammarAccess.getMustBeInAccess().getMustBeInAssignment()); 
            // InternalSasDsl.g:569:3: ( rule__MustBeIn__MustBeInAssignment )
            // InternalSasDsl.g:569:4: rule__MustBeIn__MustBeInAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MustBeIn__MustBeInAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMustBeInAccess().getMustBeInAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMustBeIn"


    // $ANTLR start "entryRuleOnly"
    // InternalSasDsl.g:578:1: entryRuleOnly : ruleOnly EOF ;
    public final void entryRuleOnly() throws RecognitionException {
        try {
            // InternalSasDsl.g:579:1: ( ruleOnly EOF )
            // InternalSasDsl.g:580:1: ruleOnly EOF
            {
             before(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_1);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getOnlyRule()); 
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
    // $ANTLR end "entryRuleOnly"


    // $ANTLR start "ruleOnly"
    // InternalSasDsl.g:587:1: ruleOnly : ( ( rule__Only__OnlyAssignment ) ) ;
    public final void ruleOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:591:2: ( ( ( rule__Only__OnlyAssignment ) ) )
            // InternalSasDsl.g:592:2: ( ( rule__Only__OnlyAssignment ) )
            {
            // InternalSasDsl.g:592:2: ( ( rule__Only__OnlyAssignment ) )
            // InternalSasDsl.g:593:3: ( rule__Only__OnlyAssignment )
            {
             before(grammarAccess.getOnlyAccess().getOnlyAssignment()); 
            // InternalSasDsl.g:594:3: ( rule__Only__OnlyAssignment )
            // InternalSasDsl.g:594:4: rule__Only__OnlyAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Only__OnlyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOnlyAccess().getOnlyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnly"


    // $ANTLR start "entryRuleCan"
    // InternalSasDsl.g:603:1: entryRuleCan : ruleCan EOF ;
    public final void entryRuleCan() throws RecognitionException {
        try {
            // InternalSasDsl.g:604:1: ( ruleCan EOF )
            // InternalSasDsl.g:605:1: ruleCan EOF
            {
             before(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_1);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getCanRule()); 
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
    // $ANTLR end "entryRuleCan"


    // $ANTLR start "ruleCan"
    // InternalSasDsl.g:612:1: ruleCan : ( ( rule__Can__CanAssignment ) ) ;
    public final void ruleCan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:616:2: ( ( ( rule__Can__CanAssignment ) ) )
            // InternalSasDsl.g:617:2: ( ( rule__Can__CanAssignment ) )
            {
            // InternalSasDsl.g:617:2: ( ( rule__Can__CanAssignment ) )
            // InternalSasDsl.g:618:3: ( rule__Can__CanAssignment )
            {
             before(grammarAccess.getCanAccess().getCanAssignment()); 
            // InternalSasDsl.g:619:3: ( rule__Can__CanAssignment )
            // InternalSasDsl.g:619:4: rule__Can__CanAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Can__CanAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCanAccess().getCanAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCan"


    // $ANTLR start "entryRuleCannot"
    // InternalSasDsl.g:628:1: entryRuleCannot : ruleCannot EOF ;
    public final void entryRuleCannot() throws RecognitionException {
        try {
            // InternalSasDsl.g:629:1: ( ruleCannot EOF )
            // InternalSasDsl.g:630:1: ruleCannot EOF
            {
             before(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_1);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getCannotRule()); 
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
    // $ANTLR end "entryRuleCannot"


    // $ANTLR start "ruleCannot"
    // InternalSasDsl.g:637:1: ruleCannot : ( ( rule__Cannot__CannotAssignment ) ) ;
    public final void ruleCannot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:641:2: ( ( ( rule__Cannot__CannotAssignment ) ) )
            // InternalSasDsl.g:642:2: ( ( rule__Cannot__CannotAssignment ) )
            {
            // InternalSasDsl.g:642:2: ( ( rule__Cannot__CannotAssignment ) )
            // InternalSasDsl.g:643:3: ( rule__Cannot__CannotAssignment )
            {
             before(grammarAccess.getCannotAccess().getCannotAssignment()); 
            // InternalSasDsl.g:644:3: ( rule__Cannot__CannotAssignment )
            // InternalSasDsl.g:644:4: rule__Cannot__CannotAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Cannot__CannotAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCannotAccess().getCannotAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCannot"


    // $ANTLR start "entryRuleOnly2"
    // InternalSasDsl.g:653:1: entryRuleOnly2 : ruleOnly2 EOF ;
    public final void entryRuleOnly2() throws RecognitionException {
        try {
            // InternalSasDsl.g:654:1: ( ruleOnly2 EOF )
            // InternalSasDsl.g:655:1: ruleOnly2 EOF
            {
             before(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_1);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getOnly2Rule()); 
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
    // $ANTLR end "entryRuleOnly2"


    // $ANTLR start "ruleOnly2"
    // InternalSasDsl.g:662:1: ruleOnly2 : ( ( rule__Only2__Only2Assignment ) ) ;
    public final void ruleOnly2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:666:2: ( ( ( rule__Only2__Only2Assignment ) ) )
            // InternalSasDsl.g:667:2: ( ( rule__Only2__Only2Assignment ) )
            {
            // InternalSasDsl.g:667:2: ( ( rule__Only2__Only2Assignment ) )
            // InternalSasDsl.g:668:3: ( rule__Only2__Only2Assignment )
            {
             before(grammarAccess.getOnly2Access().getOnly2Assignment()); 
            // InternalSasDsl.g:669:3: ( rule__Only2__Only2Assignment )
            // InternalSasDsl.g:669:4: rule__Only2__Only2Assignment
            {
            pushFollow(FOLLOW_2);
            rule__Only2__Only2Assignment();

            state._fsp--;


            }

             after(grammarAccess.getOnly2Access().getOnly2Assignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnly2"


    // $ANTLR start "entryRuleMust"
    // InternalSasDsl.g:678:1: entryRuleMust : ruleMust EOF ;
    public final void entryRuleMust() throws RecognitionException {
        try {
            // InternalSasDsl.g:679:1: ( ruleMust EOF )
            // InternalSasDsl.g:680:1: ruleMust EOF
            {
             before(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_1);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getMustRule()); 
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
    // $ANTLR end "entryRuleMust"


    // $ANTLR start "ruleMust"
    // InternalSasDsl.g:687:1: ruleMust : ( ( rule__Must__MustAssignment ) ) ;
    public final void ruleMust() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:691:2: ( ( ( rule__Must__MustAssignment ) ) )
            // InternalSasDsl.g:692:2: ( ( rule__Must__MustAssignment ) )
            {
            // InternalSasDsl.g:692:2: ( ( rule__Must__MustAssignment ) )
            // InternalSasDsl.g:693:3: ( rule__Must__MustAssignment )
            {
             before(grammarAccess.getMustAccess().getMustAssignment()); 
            // InternalSasDsl.g:694:3: ( rule__Must__MustAssignment )
            // InternalSasDsl.g:694:4: rule__Must__MustAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Must__MustAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMustAccess().getMustAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMust"


    // $ANTLR start "entryRuleElementType"
    // InternalSasDsl.g:703:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalSasDsl.g:704:1: ( ruleElementType EOF )
            // InternalSasDsl.g:705:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalSasDsl.g:712:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:716:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSasDsl.g:717:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSasDsl.g:717:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSasDsl.g:718:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSasDsl.g:719:3: ( rule__ElementType__Alternatives )
            // InternalSasDsl.g:719:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // InternalSasDsl.g:728:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalSasDsl.g:729:1: ( ruleBasicType EOF )
            // InternalSasDsl.g:730:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalSasDsl.g:737:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:741:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // InternalSasDsl.g:742:2: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // InternalSasDsl.g:742:2: ( ( rule__BasicType__TypeNameAssignment ) )
            // InternalSasDsl.g:743:3: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // InternalSasDsl.g:744:3: ( rule__BasicType__TypeNameAssignment )
            // InternalSasDsl.g:744:4: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // InternalSasDsl.g:753:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalSasDsl.g:754:1: ( ruleEntityType EOF )
            // InternalSasDsl.g:755:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalSasDsl.g:762:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:766:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // InternalSasDsl.g:767:2: ( ( rule__EntityType__EntityAssignment ) )
            {
            // InternalSasDsl.g:767:2: ( ( rule__EntityType__EntityAssignment ) )
            // InternalSasDsl.g:768:3: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // InternalSasDsl.g:769:3: ( rule__EntityType__EntityAssignment )
            // InternalSasDsl.g:769:4: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "rule__DSLAbstractions__Alternatives"
    // InternalSasDsl.g:777:1: rule__DSLAbstractions__Alternatives : ( ( ruleDSLManaging ) | ( ruleDSLManaged ) | ( ruleDSLControlLoopManager ) | ( ruleDSLControlLoop ) | ( ruleDSLMonitor ) | ( ruleDSLAnalyzer ) | ( ruleDSLPlanner ) | ( ruleDSLExecutor ) | ( ruleDSLKnowledge ) | ( ruleDSLSensor ) | ( ruleDSLEffector ) | ( ruleDSLProbe ) | ( ruleDSLGauge ) | ( ruleDSLReferenceInput ) | ( ruleDSLMeasuredOutput ) );
    public final void rule__DSLAbstractions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:781:1: ( ( ruleDSLManaging ) | ( ruleDSLManaged ) | ( ruleDSLControlLoopManager ) | ( ruleDSLControlLoop ) | ( ruleDSLMonitor ) | ( ruleDSLAnalyzer ) | ( ruleDSLPlanner ) | ( ruleDSLExecutor ) | ( ruleDSLKnowledge ) | ( ruleDSLSensor ) | ( ruleDSLEffector ) | ( ruleDSLProbe ) | ( ruleDSLGauge ) | ( ruleDSLReferenceInput ) | ( ruleDSLMeasuredOutput ) )
            int alt1=15;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            case 34:
                {
                alt1=5;
                }
                break;
            case 35:
                {
                alt1=6;
                }
                break;
            case 36:
                {
                alt1=7;
                }
                break;
            case 37:
                {
                alt1=8;
                }
                break;
            case 38:
                {
                alt1=9;
                }
                break;
            case 39:
                {
                alt1=10;
                }
                break;
            case 40:
                {
                alt1=11;
                }
                break;
            case 41:
                {
                alt1=12;
                }
                break;
            case 42:
                {
                alt1=13;
                }
                break;
            case 43:
                {
                alt1=14;
                }
                break;
            case 44:
                {
                alt1=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSasDsl.g:782:2: ( ruleDSLManaging )
                    {
                    // InternalSasDsl.g:782:2: ( ruleDSLManaging )
                    // InternalSasDsl.g:783:3: ruleDSLManaging
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLManagingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLManaging();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLManagingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:788:2: ( ruleDSLManaged )
                    {
                    // InternalSasDsl.g:788:2: ( ruleDSLManaged )
                    // InternalSasDsl.g:789:3: ruleDSLManaged
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLManagedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLManaged();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLManagedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:794:2: ( ruleDSLControlLoopManager )
                    {
                    // InternalSasDsl.g:794:2: ( ruleDSLControlLoopManager )
                    // InternalSasDsl.g:795:3: ruleDSLControlLoopManager
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLControlLoopManagerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLControlLoopManager();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLControlLoopManagerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:800:2: ( ruleDSLControlLoop )
                    {
                    // InternalSasDsl.g:800:2: ( ruleDSLControlLoop )
                    // InternalSasDsl.g:801:3: ruleDSLControlLoop
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLControlLoopParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLControlLoop();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLControlLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:806:2: ( ruleDSLMonitor )
                    {
                    // InternalSasDsl.g:806:2: ( ruleDSLMonitor )
                    // InternalSasDsl.g:807:3: ruleDSLMonitor
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLMonitorParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLMonitor();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLMonitorParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:812:2: ( ruleDSLAnalyzer )
                    {
                    // InternalSasDsl.g:812:2: ( ruleDSLAnalyzer )
                    // InternalSasDsl.g:813:3: ruleDSLAnalyzer
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLAnalyzerParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLAnalyzer();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLAnalyzerParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:818:2: ( ruleDSLPlanner )
                    {
                    // InternalSasDsl.g:818:2: ( ruleDSLPlanner )
                    // InternalSasDsl.g:819:3: ruleDSLPlanner
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLPlannerParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLPlanner();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLPlannerParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:824:2: ( ruleDSLExecutor )
                    {
                    // InternalSasDsl.g:824:2: ( ruleDSLExecutor )
                    // InternalSasDsl.g:825:3: ruleDSLExecutor
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLExecutorParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLExecutor();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLExecutorParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:830:2: ( ruleDSLKnowledge )
                    {
                    // InternalSasDsl.g:830:2: ( ruleDSLKnowledge )
                    // InternalSasDsl.g:831:3: ruleDSLKnowledge
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLKnowledgeParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLKnowledge();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLKnowledgeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:836:2: ( ruleDSLSensor )
                    {
                    // InternalSasDsl.g:836:2: ( ruleDSLSensor )
                    // InternalSasDsl.g:837:3: ruleDSLSensor
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLSensorParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLSensor();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLSensorParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:842:2: ( ruleDSLEffector )
                    {
                    // InternalSasDsl.g:842:2: ( ruleDSLEffector )
                    // InternalSasDsl.g:843:3: ruleDSLEffector
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLEffectorParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLEffector();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLEffectorParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:848:2: ( ruleDSLProbe )
                    {
                    // InternalSasDsl.g:848:2: ( ruleDSLProbe )
                    // InternalSasDsl.g:849:3: ruleDSLProbe
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLProbeParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLProbe();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLProbeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:854:2: ( ruleDSLGauge )
                    {
                    // InternalSasDsl.g:854:2: ( ruleDSLGauge )
                    // InternalSasDsl.g:855:3: ruleDSLGauge
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLGaugeParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLGauge();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLGaugeParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSasDsl.g:860:2: ( ruleDSLReferenceInput )
                    {
                    // InternalSasDsl.g:860:2: ( ruleDSLReferenceInput )
                    // InternalSasDsl.g:861:3: ruleDSLReferenceInput
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLReferenceInputParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLReferenceInput();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLReferenceInputParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSasDsl.g:866:2: ( ruleDSLMeasuredOutput )
                    {
                    // InternalSasDsl.g:866:2: ( ruleDSLMeasuredOutput )
                    // InternalSasDsl.g:867:3: ruleDSLMeasuredOutput
                    {
                     before(grammarAccess.getDSLAbstractionsAccess().getDSLMeasuredOutputParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleDSLMeasuredOutput();

                    state._fsp--;

                     after(grammarAccess.getDSLAbstractionsAccess().getDSLMeasuredOutputParserRuleCall_14()); 

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
    // $ANTLR end "rule__DSLAbstractions__Alternatives"


    // $ANTLR start "rule__DSLTypeCLM__Alternatives"
    // InternalSasDsl.g:876:1: rule__DSLTypeCLM__Alternatives : ( ( 'Synchronized' ) | ( 'Coordinated' ) | ( 'Independent' ) );
    public final void rule__DSLTypeCLM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:880:1: ( ( 'Synchronized' ) | ( 'Coordinated' ) | ( 'Independent' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSasDsl.g:881:2: ( 'Synchronized' )
                    {
                    // InternalSasDsl.g:881:2: ( 'Synchronized' )
                    // InternalSasDsl.g:882:3: 'Synchronized'
                    {
                     before(grammarAccess.getDSLTypeCLMAccess().getSynchronizedKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDSLTypeCLMAccess().getSynchronizedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:887:2: ( 'Coordinated' )
                    {
                    // InternalSasDsl.g:887:2: ( 'Coordinated' )
                    // InternalSasDsl.g:888:3: 'Coordinated'
                    {
                     before(grammarAccess.getDSLTypeCLMAccess().getCoordinatedKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDSLTypeCLMAccess().getCoordinatedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:893:2: ( 'Independent' )
                    {
                    // InternalSasDsl.g:893:2: ( 'Independent' )
                    // InternalSasDsl.g:894:3: 'Independent'
                    {
                     before(grammarAccess.getDSLTypeCLMAccess().getIndependentKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDSLTypeCLMAccess().getIndependentKeyword_2()); 

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
    // $ANTLR end "rule__DSLTypeCLM__Alternatives"


    // $ANTLR start "rule__DSLRestrictions__Alternatives"
    // InternalSasDsl.g:903:1: rule__DSLRestrictions__Alternatives : ( ( ( rule__DSLRestrictions__Group_0__0 ) ) | ( ( rule__DSLRestrictions__Group_1__0 ) ) | ( ( rule__DSLRestrictions__Group_2__0 ) ) | ( ( rule__DSLRestrictions__Group_3__0 ) ) | ( ( rule__DSLRestrictions__Group_4__0 ) ) );
    public final void rule__DSLRestrictions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:907:1: ( ( ( rule__DSLRestrictions__Group_0__0 ) ) | ( ( rule__DSLRestrictions__Group_1__0 ) ) | ( ( rule__DSLRestrictions__Group_2__0 ) ) | ( ( rule__DSLRestrictions__Group_3__0 ) ) | ( ( rule__DSLRestrictions__Group_4__0 ) ) )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSasDsl.g:908:2: ( ( rule__DSLRestrictions__Group_0__0 ) )
                    {
                    // InternalSasDsl.g:908:2: ( ( rule__DSLRestrictions__Group_0__0 ) )
                    // InternalSasDsl.g:909:3: ( rule__DSLRestrictions__Group_0__0 )
                    {
                     before(grammarAccess.getDSLRestrictionsAccess().getGroup_0()); 
                    // InternalSasDsl.g:910:3: ( rule__DSLRestrictions__Group_0__0 )
                    // InternalSasDsl.g:910:4: rule__DSLRestrictions__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DSLRestrictions__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDSLRestrictionsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:914:2: ( ( rule__DSLRestrictions__Group_1__0 ) )
                    {
                    // InternalSasDsl.g:914:2: ( ( rule__DSLRestrictions__Group_1__0 ) )
                    // InternalSasDsl.g:915:3: ( rule__DSLRestrictions__Group_1__0 )
                    {
                     before(grammarAccess.getDSLRestrictionsAccess().getGroup_1()); 
                    // InternalSasDsl.g:916:3: ( rule__DSLRestrictions__Group_1__0 )
                    // InternalSasDsl.g:916:4: rule__DSLRestrictions__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DSLRestrictions__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDSLRestrictionsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:920:2: ( ( rule__DSLRestrictions__Group_2__0 ) )
                    {
                    // InternalSasDsl.g:920:2: ( ( rule__DSLRestrictions__Group_2__0 ) )
                    // InternalSasDsl.g:921:3: ( rule__DSLRestrictions__Group_2__0 )
                    {
                     before(grammarAccess.getDSLRestrictionsAccess().getGroup_2()); 
                    // InternalSasDsl.g:922:3: ( rule__DSLRestrictions__Group_2__0 )
                    // InternalSasDsl.g:922:4: rule__DSLRestrictions__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DSLRestrictions__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDSLRestrictionsAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:926:2: ( ( rule__DSLRestrictions__Group_3__0 ) )
                    {
                    // InternalSasDsl.g:926:2: ( ( rule__DSLRestrictions__Group_3__0 ) )
                    // InternalSasDsl.g:927:3: ( rule__DSLRestrictions__Group_3__0 )
                    {
                     before(grammarAccess.getDSLRestrictionsAccess().getGroup_3()); 
                    // InternalSasDsl.g:928:3: ( rule__DSLRestrictions__Group_3__0 )
                    // InternalSasDsl.g:928:4: rule__DSLRestrictions__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DSLRestrictions__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDSLRestrictionsAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:932:2: ( ( rule__DSLRestrictions__Group_4__0 ) )
                    {
                    // InternalSasDsl.g:932:2: ( ( rule__DSLRestrictions__Group_4__0 ) )
                    // InternalSasDsl.g:933:3: ( rule__DSLRestrictions__Group_4__0 )
                    {
                     before(grammarAccess.getDSLRestrictionsAccess().getGroup_4()); 
                    // InternalSasDsl.g:934:3: ( rule__DSLRestrictions__Group_4__0 )
                    // InternalSasDsl.g:934:4: rule__DSLRestrictions__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DSLRestrictions__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDSLRestrictionsAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DSLRestrictions__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalSasDsl.g:942:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:946:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=18)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=19 && LA4_0<=23)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSasDsl.g:947:2: ( ruleBasicType )
                    {
                    // InternalSasDsl.g:947:2: ( ruleBasicType )
                    // InternalSasDsl.g:948:3: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:953:2: ( ruleEntityType )
                    {
                    // InternalSasDsl.g:953:2: ( ruleEntityType )
                    // InternalSasDsl.g:954:3: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // InternalSasDsl.g:963:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:967:1: ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSasDsl.g:968:2: ( 'access' )
                    {
                    // InternalSasDsl.g:968:2: ( 'access' )
                    // InternalSasDsl.g:969:3: 'access'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:974:2: ( 'declare' )
                    {
                    // InternalSasDsl.g:974:2: ( 'declare' )
                    // InternalSasDsl.g:975:3: 'declare'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:980:2: ( 'handle' )
                    {
                    // InternalSasDsl.g:980:2: ( 'handle' )
                    // InternalSasDsl.g:981:3: 'handle'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:986:2: ( 'create' )
                    {
                    // InternalSasDsl.g:986:2: ( 'create' )
                    // InternalSasDsl.g:987:3: 'create'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:992:2: ( 'depend' )
                    {
                    // InternalSasDsl.g:992:2: ( 'depend' )
                    // InternalSasDsl.g:993:3: 'depend'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__EntityType__EntityAlternatives_0"
    // InternalSasDsl.g:1002:1: rule__EntityType__EntityAlternatives_0 : ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) );
    public final void rule__EntityType__EntityAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1006:1: ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSasDsl.g:1007:2: ( 'extend' )
                    {
                    // InternalSasDsl.g:1007:2: ( 'extend' )
                    // InternalSasDsl.g:1008:3: 'extend'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1013:2: ( 'implement' )
                    {
                    // InternalSasDsl.g:1013:2: ( 'implement' )
                    // InternalSasDsl.g:1014:3: 'implement'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1019:2: ( 'derive' )
                    {
                    // InternalSasDsl.g:1019:2: ( 'derive' )
                    // InternalSasDsl.g:1020:3: 'derive'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1025:2: ( 'throw' )
                    {
                    // InternalSasDsl.g:1025:2: ( 'throw' )
                    // InternalSasDsl.g:1026:3: 'throw'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:1031:2: ( 'useannotation' )
                    {
                    // InternalSasDsl.g:1031:2: ( 'useannotation' )
                    // InternalSasDsl.g:1032:3: 'useannotation'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4()); 

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
    // $ANTLR end "rule__EntityType__EntityAlternatives_0"


    // $ANTLR start "rule__ArchitectureDefinition__Group__0"
    // InternalSasDsl.g:1041:1: rule__ArchitectureDefinition__Group__0 : rule__ArchitectureDefinition__Group__0__Impl rule__ArchitectureDefinition__Group__1 ;
    public final void rule__ArchitectureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1045:1: ( rule__ArchitectureDefinition__Group__0__Impl rule__ArchitectureDefinition__Group__1 )
            // InternalSasDsl.g:1046:2: rule__ArchitectureDefinition__Group__0__Impl rule__ArchitectureDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__0"


    // $ANTLR start "rule__ArchitectureDefinition__Group__0__Impl"
    // InternalSasDsl.g:1053:1: rule__ArchitectureDefinition__Group__0__Impl : ( 'Abstractions' ) ;
    public final void rule__ArchitectureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1057:1: ( ( 'Abstractions' ) )
            // InternalSasDsl.g:1058:1: ( 'Abstractions' )
            {
            // InternalSasDsl.g:1058:1: ( 'Abstractions' )
            // InternalSasDsl.g:1059:2: 'Abstractions'
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__0__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__1"
    // InternalSasDsl.g:1068:1: rule__ArchitectureDefinition__Group__1 : rule__ArchitectureDefinition__Group__1__Impl rule__ArchitectureDefinition__Group__2 ;
    public final void rule__ArchitectureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1072:1: ( rule__ArchitectureDefinition__Group__1__Impl rule__ArchitectureDefinition__Group__2 )
            // InternalSasDsl.g:1073:2: rule__ArchitectureDefinition__Group__1__Impl rule__ArchitectureDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ArchitectureDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__1"


    // $ANTLR start "rule__ArchitectureDefinition__Group__1__Impl"
    // InternalSasDsl.g:1080:1: rule__ArchitectureDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ArchitectureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1084:1: ( ( ':' ) )
            // InternalSasDsl.g:1085:1: ( ':' )
            {
            // InternalSasDsl.g:1085:1: ( ':' )
            // InternalSasDsl.g:1086:2: ':'
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__1__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__2"
    // InternalSasDsl.g:1095:1: rule__ArchitectureDefinition__Group__2 : rule__ArchitectureDefinition__Group__2__Impl rule__ArchitectureDefinition__Group__3 ;
    public final void rule__ArchitectureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1099:1: ( rule__ArchitectureDefinition__Group__2__Impl rule__ArchitectureDefinition__Group__3 )
            // InternalSasDsl.g:1100:2: rule__ArchitectureDefinition__Group__2__Impl rule__ArchitectureDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ArchitectureDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__2"


    // $ANTLR start "rule__ArchitectureDefinition__Group__2__Impl"
    // InternalSasDsl.g:1107:1: rule__ArchitectureDefinition__Group__2__Impl : ( ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 ) ) ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )* ) ) ;
    public final void rule__ArchitectureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1111:1: ( ( ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 ) ) ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )* ) ) )
            // InternalSasDsl.g:1112:1: ( ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 ) ) ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )* ) )
            {
            // InternalSasDsl.g:1112:1: ( ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 ) ) ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )* ) )
            // InternalSasDsl.g:1113:2: ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 ) ) ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )* )
            {
            // InternalSasDsl.g:1113:2: ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 ) )
            // InternalSasDsl.g:1114:3: ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsAssignment_2()); 
            // InternalSasDsl.g:1115:3: ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )
            // InternalSasDsl.g:1115:4: rule__ArchitectureDefinition__AbstractionsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__ArchitectureDefinition__AbstractionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsAssignment_2()); 

            }

            // InternalSasDsl.g:1118:2: ( ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )* )
            // InternalSasDsl.g:1119:3: ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )*
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsAssignment_2()); 
            // InternalSasDsl.g:1120:3: ( rule__ArchitectureDefinition__AbstractionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28||(LA7_0>=30 && LA7_0<=31)||(LA7_0>=33 && LA7_0<=44)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSasDsl.g:1120:4: rule__ArchitectureDefinition__AbstractionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ArchitectureDefinition__AbstractionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__2__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__3"
    // InternalSasDsl.g:1129:1: rule__ArchitectureDefinition__Group__3 : rule__ArchitectureDefinition__Group__3__Impl rule__ArchitectureDefinition__Group__4 ;
    public final void rule__ArchitectureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1133:1: ( rule__ArchitectureDefinition__Group__3__Impl rule__ArchitectureDefinition__Group__4 )
            // InternalSasDsl.g:1134:2: rule__ArchitectureDefinition__Group__3__Impl rule__ArchitectureDefinition__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__3"


    // $ANTLR start "rule__ArchitectureDefinition__Group__3__Impl"
    // InternalSasDsl.g:1141:1: rule__ArchitectureDefinition__Group__3__Impl : ( 'Compositions' ) ;
    public final void rule__ArchitectureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1145:1: ( ( 'Compositions' ) )
            // InternalSasDsl.g:1146:1: ( 'Compositions' )
            {
            // InternalSasDsl.g:1146:1: ( 'Compositions' )
            // InternalSasDsl.g:1147:2: 'Compositions'
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getCompositionsKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArchitectureDefinitionAccess().getCompositionsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__3__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__4"
    // InternalSasDsl.g:1156:1: rule__ArchitectureDefinition__Group__4 : rule__ArchitectureDefinition__Group__4__Impl rule__ArchitectureDefinition__Group__5 ;
    public final void rule__ArchitectureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1160:1: ( rule__ArchitectureDefinition__Group__4__Impl rule__ArchitectureDefinition__Group__5 )
            // InternalSasDsl.g:1161:2: rule__ArchitectureDefinition__Group__4__Impl rule__ArchitectureDefinition__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ArchitectureDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__4"


    // $ANTLR start "rule__ArchitectureDefinition__Group__4__Impl"
    // InternalSasDsl.g:1168:1: rule__ArchitectureDefinition__Group__4__Impl : ( ':' ) ;
    public final void rule__ArchitectureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1172:1: ( ( ':' ) )
            // InternalSasDsl.g:1173:1: ( ':' )
            {
            // InternalSasDsl.g:1173:1: ( ':' )
            // InternalSasDsl.g:1174:2: ':'
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__4__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__5"
    // InternalSasDsl.g:1183:1: rule__ArchitectureDefinition__Group__5 : rule__ArchitectureDefinition__Group__5__Impl rule__ArchitectureDefinition__Group__6 ;
    public final void rule__ArchitectureDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1187:1: ( rule__ArchitectureDefinition__Group__5__Impl rule__ArchitectureDefinition__Group__6 )
            // InternalSasDsl.g:1188:2: rule__ArchitectureDefinition__Group__5__Impl rule__ArchitectureDefinition__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ArchitectureDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__5"


    // $ANTLR start "rule__ArchitectureDefinition__Group__5__Impl"
    // InternalSasDsl.g:1195:1: rule__ArchitectureDefinition__Group__5__Impl : ( ( rule__ArchitectureDefinition__CompositionsAssignment_5 )* ) ;
    public final void rule__ArchitectureDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1199:1: ( ( ( rule__ArchitectureDefinition__CompositionsAssignment_5 )* ) )
            // InternalSasDsl.g:1200:1: ( ( rule__ArchitectureDefinition__CompositionsAssignment_5 )* )
            {
            // InternalSasDsl.g:1200:1: ( ( rule__ArchitectureDefinition__CompositionsAssignment_5 )* )
            // InternalSasDsl.g:1201:2: ( rule__ArchitectureDefinition__CompositionsAssignment_5 )*
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getCompositionsAssignment_5()); 
            // InternalSasDsl.g:1202:2: ( rule__ArchitectureDefinition__CompositionsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSasDsl.g:1202:3: rule__ArchitectureDefinition__CompositionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ArchitectureDefinition__CompositionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getArchitectureDefinitionAccess().getCompositionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__5__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__6"
    // InternalSasDsl.g:1210:1: rule__ArchitectureDefinition__Group__6 : rule__ArchitectureDefinition__Group__6__Impl rule__ArchitectureDefinition__Group__7 ;
    public final void rule__ArchitectureDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1214:1: ( rule__ArchitectureDefinition__Group__6__Impl rule__ArchitectureDefinition__Group__7 )
            // InternalSasDsl.g:1215:2: rule__ArchitectureDefinition__Group__6__Impl rule__ArchitectureDefinition__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__ArchitectureDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__6"


    // $ANTLR start "rule__ArchitectureDefinition__Group__6__Impl"
    // InternalSasDsl.g:1222:1: rule__ArchitectureDefinition__Group__6__Impl : ( 'Restrictions' ) ;
    public final void rule__ArchitectureDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1226:1: ( ( 'Restrictions' ) )
            // InternalSasDsl.g:1227:1: ( 'Restrictions' )
            {
            // InternalSasDsl.g:1227:1: ( 'Restrictions' )
            // InternalSasDsl.g:1228:2: 'Restrictions'
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getRestrictionsKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArchitectureDefinitionAccess().getRestrictionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__6__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__7"
    // InternalSasDsl.g:1237:1: rule__ArchitectureDefinition__Group__7 : rule__ArchitectureDefinition__Group__7__Impl rule__ArchitectureDefinition__Group__8 ;
    public final void rule__ArchitectureDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1241:1: ( rule__ArchitectureDefinition__Group__7__Impl rule__ArchitectureDefinition__Group__8 )
            // InternalSasDsl.g:1242:2: rule__ArchitectureDefinition__Group__7__Impl rule__ArchitectureDefinition__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ArchitectureDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__7"


    // $ANTLR start "rule__ArchitectureDefinition__Group__7__Impl"
    // InternalSasDsl.g:1249:1: rule__ArchitectureDefinition__Group__7__Impl : ( ':' ) ;
    public final void rule__ArchitectureDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1253:1: ( ( ':' ) )
            // InternalSasDsl.g:1254:1: ( ':' )
            {
            // InternalSasDsl.g:1254:1: ( ':' )
            // InternalSasDsl.g:1255:2: ':'
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__7__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__Group__8"
    // InternalSasDsl.g:1264:1: rule__ArchitectureDefinition__Group__8 : rule__ArchitectureDefinition__Group__8__Impl ;
    public final void rule__ArchitectureDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1268:1: ( rule__ArchitectureDefinition__Group__8__Impl )
            // InternalSasDsl.g:1269:2: rule__ArchitectureDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchitectureDefinition__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__8"


    // $ANTLR start "rule__ArchitectureDefinition__Group__8__Impl"
    // InternalSasDsl.g:1275:1: rule__ArchitectureDefinition__Group__8__Impl : ( ( rule__ArchitectureDefinition__DslRestrictionsAssignment_8 )* ) ;
    public final void rule__ArchitectureDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1279:1: ( ( ( rule__ArchitectureDefinition__DslRestrictionsAssignment_8 )* ) )
            // InternalSasDsl.g:1280:1: ( ( rule__ArchitectureDefinition__DslRestrictionsAssignment_8 )* )
            {
            // InternalSasDsl.g:1280:1: ( ( rule__ArchitectureDefinition__DslRestrictionsAssignment_8 )* )
            // InternalSasDsl.g:1281:2: ( rule__ArchitectureDefinition__DslRestrictionsAssignment_8 )*
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getDslRestrictionsAssignment_8()); 
            // InternalSasDsl.g:1282:2: ( rule__ArchitectureDefinition__DslRestrictionsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==46) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSasDsl.g:1282:3: rule__ArchitectureDefinition__DslRestrictionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ArchitectureDefinition__DslRestrictionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getArchitectureDefinitionAccess().getDslRestrictionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__Group__8__Impl"


    // $ANTLR start "rule__DSLManaging__Group__0"
    // InternalSasDsl.g:1291:1: rule__DSLManaging__Group__0 : rule__DSLManaging__Group__0__Impl rule__DSLManaging__Group__1 ;
    public final void rule__DSLManaging__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1295:1: ( rule__DSLManaging__Group__0__Impl rule__DSLManaging__Group__1 )
            // InternalSasDsl.g:1296:2: rule__DSLManaging__Group__0__Impl rule__DSLManaging__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLManaging__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLManaging__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaging__Group__0"


    // $ANTLR start "rule__DSLManaging__Group__0__Impl"
    // InternalSasDsl.g:1303:1: rule__DSLManaging__Group__0__Impl : ( 'Managing' ) ;
    public final void rule__DSLManaging__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1307:1: ( ( 'Managing' ) )
            // InternalSasDsl.g:1308:1: ( 'Managing' )
            {
            // InternalSasDsl.g:1308:1: ( 'Managing' )
            // InternalSasDsl.g:1309:2: 'Managing'
            {
             before(grammarAccess.getDSLManagingAccess().getManagingKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDSLManagingAccess().getManagingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaging__Group__0__Impl"


    // $ANTLR start "rule__DSLManaging__Group__1"
    // InternalSasDsl.g:1318:1: rule__DSLManaging__Group__1 : rule__DSLManaging__Group__1__Impl rule__DSLManaging__Group__2 ;
    public final void rule__DSLManaging__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1322:1: ( rule__DSLManaging__Group__1__Impl rule__DSLManaging__Group__2 )
            // InternalSasDsl.g:1323:2: rule__DSLManaging__Group__1__Impl rule__DSLManaging__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLManaging__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLManaging__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaging__Group__1"


    // $ANTLR start "rule__DSLManaging__Group__1__Impl"
    // InternalSasDsl.g:1330:1: rule__DSLManaging__Group__1__Impl : ( ( rule__DSLManaging__NameAssignment_1 ) ) ;
    public final void rule__DSLManaging__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1334:1: ( ( ( rule__DSLManaging__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1335:1: ( ( rule__DSLManaging__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1335:1: ( ( rule__DSLManaging__NameAssignment_1 ) )
            // InternalSasDsl.g:1336:2: ( rule__DSLManaging__NameAssignment_1 )
            {
             before(grammarAccess.getDSLManagingAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1337:2: ( rule__DSLManaging__NameAssignment_1 )
            // InternalSasDsl.g:1337:3: rule__DSLManaging__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLManaging__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLManagingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaging__Group__1__Impl"


    // $ANTLR start "rule__DSLManaging__Group__2"
    // InternalSasDsl.g:1345:1: rule__DSLManaging__Group__2 : rule__DSLManaging__Group__2__Impl ;
    public final void rule__DSLManaging__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1349:1: ( rule__DSLManaging__Group__2__Impl )
            // InternalSasDsl.g:1350:2: rule__DSLManaging__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLManaging__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaging__Group__2"


    // $ANTLR start "rule__DSLManaging__Group__2__Impl"
    // InternalSasDsl.g:1356:1: rule__DSLManaging__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLManaging__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1360:1: ( ( ';' ) )
            // InternalSasDsl.g:1361:1: ( ';' )
            {
            // InternalSasDsl.g:1361:1: ( ';' )
            // InternalSasDsl.g:1362:2: ';'
            {
             before(grammarAccess.getDSLManagingAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLManagingAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaging__Group__2__Impl"


    // $ANTLR start "rule__DSLManaged__Group__0"
    // InternalSasDsl.g:1372:1: rule__DSLManaged__Group__0 : rule__DSLManaged__Group__0__Impl rule__DSLManaged__Group__1 ;
    public final void rule__DSLManaged__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1376:1: ( rule__DSLManaged__Group__0__Impl rule__DSLManaged__Group__1 )
            // InternalSasDsl.g:1377:2: rule__DSLManaged__Group__0__Impl rule__DSLManaged__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLManaged__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLManaged__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaged__Group__0"


    // $ANTLR start "rule__DSLManaged__Group__0__Impl"
    // InternalSasDsl.g:1384:1: rule__DSLManaged__Group__0__Impl : ( 'Managed' ) ;
    public final void rule__DSLManaged__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1388:1: ( ( 'Managed' ) )
            // InternalSasDsl.g:1389:1: ( 'Managed' )
            {
            // InternalSasDsl.g:1389:1: ( 'Managed' )
            // InternalSasDsl.g:1390:2: 'Managed'
            {
             before(grammarAccess.getDSLManagedAccess().getManagedKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDSLManagedAccess().getManagedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaged__Group__0__Impl"


    // $ANTLR start "rule__DSLManaged__Group__1"
    // InternalSasDsl.g:1399:1: rule__DSLManaged__Group__1 : rule__DSLManaged__Group__1__Impl rule__DSLManaged__Group__2 ;
    public final void rule__DSLManaged__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1403:1: ( rule__DSLManaged__Group__1__Impl rule__DSLManaged__Group__2 )
            // InternalSasDsl.g:1404:2: rule__DSLManaged__Group__1__Impl rule__DSLManaged__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLManaged__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLManaged__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaged__Group__1"


    // $ANTLR start "rule__DSLManaged__Group__1__Impl"
    // InternalSasDsl.g:1411:1: rule__DSLManaged__Group__1__Impl : ( ( rule__DSLManaged__NameAssignment_1 ) ) ;
    public final void rule__DSLManaged__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1415:1: ( ( ( rule__DSLManaged__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1416:1: ( ( rule__DSLManaged__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1416:1: ( ( rule__DSLManaged__NameAssignment_1 ) )
            // InternalSasDsl.g:1417:2: ( rule__DSLManaged__NameAssignment_1 )
            {
             before(grammarAccess.getDSLManagedAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1418:2: ( rule__DSLManaged__NameAssignment_1 )
            // InternalSasDsl.g:1418:3: rule__DSLManaged__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLManaged__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLManagedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaged__Group__1__Impl"


    // $ANTLR start "rule__DSLManaged__Group__2"
    // InternalSasDsl.g:1426:1: rule__DSLManaged__Group__2 : rule__DSLManaged__Group__2__Impl ;
    public final void rule__DSLManaged__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1430:1: ( rule__DSLManaged__Group__2__Impl )
            // InternalSasDsl.g:1431:2: rule__DSLManaged__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLManaged__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaged__Group__2"


    // $ANTLR start "rule__DSLManaged__Group__2__Impl"
    // InternalSasDsl.g:1437:1: rule__DSLManaged__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLManaged__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1441:1: ( ( ';' ) )
            // InternalSasDsl.g:1442:1: ( ';' )
            {
            // InternalSasDsl.g:1442:1: ( ';' )
            // InternalSasDsl.g:1443:2: ';'
            {
             before(grammarAccess.getDSLManagedAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLManagedAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaged__Group__2__Impl"


    // $ANTLR start "rule__DSLControlLoopManager__Group__0"
    // InternalSasDsl.g:1453:1: rule__DSLControlLoopManager__Group__0 : rule__DSLControlLoopManager__Group__0__Impl rule__DSLControlLoopManager__Group__1 ;
    public final void rule__DSLControlLoopManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1457:1: ( rule__DSLControlLoopManager__Group__0__Impl rule__DSLControlLoopManager__Group__1 )
            // InternalSasDsl.g:1458:2: rule__DSLControlLoopManager__Group__0__Impl rule__DSLControlLoopManager__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLControlLoopManager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLControlLoopManager__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__0"


    // $ANTLR start "rule__DSLControlLoopManager__Group__0__Impl"
    // InternalSasDsl.g:1465:1: rule__DSLControlLoopManager__Group__0__Impl : ( 'ControlLoopManager' ) ;
    public final void rule__DSLControlLoopManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1469:1: ( ( 'ControlLoopManager' ) )
            // InternalSasDsl.g:1470:1: ( 'ControlLoopManager' )
            {
            // InternalSasDsl.g:1470:1: ( 'ControlLoopManager' )
            // InternalSasDsl.g:1471:2: 'ControlLoopManager'
            {
             before(grammarAccess.getDSLControlLoopManagerAccess().getControlLoopManagerKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDSLControlLoopManagerAccess().getControlLoopManagerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__0__Impl"


    // $ANTLR start "rule__DSLControlLoopManager__Group__1"
    // InternalSasDsl.g:1480:1: rule__DSLControlLoopManager__Group__1 : rule__DSLControlLoopManager__Group__1__Impl rule__DSLControlLoopManager__Group__2 ;
    public final void rule__DSLControlLoopManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1484:1: ( rule__DSLControlLoopManager__Group__1__Impl rule__DSLControlLoopManager__Group__2 )
            // InternalSasDsl.g:1485:2: rule__DSLControlLoopManager__Group__1__Impl rule__DSLControlLoopManager__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DSLControlLoopManager__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLControlLoopManager__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__1"


    // $ANTLR start "rule__DSLControlLoopManager__Group__1__Impl"
    // InternalSasDsl.g:1492:1: rule__DSLControlLoopManager__Group__1__Impl : ( ( rule__DSLControlLoopManager__NameAssignment_1 ) ) ;
    public final void rule__DSLControlLoopManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1496:1: ( ( ( rule__DSLControlLoopManager__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1497:1: ( ( rule__DSLControlLoopManager__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1497:1: ( ( rule__DSLControlLoopManager__NameAssignment_1 ) )
            // InternalSasDsl.g:1498:2: ( rule__DSLControlLoopManager__NameAssignment_1 )
            {
             before(grammarAccess.getDSLControlLoopManagerAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1499:2: ( rule__DSLControlLoopManager__NameAssignment_1 )
            // InternalSasDsl.g:1499:3: rule__DSLControlLoopManager__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLControlLoopManager__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLControlLoopManagerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__1__Impl"


    // $ANTLR start "rule__DSLControlLoopManager__Group__2"
    // InternalSasDsl.g:1507:1: rule__DSLControlLoopManager__Group__2 : rule__DSLControlLoopManager__Group__2__Impl rule__DSLControlLoopManager__Group__3 ;
    public final void rule__DSLControlLoopManager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1511:1: ( rule__DSLControlLoopManager__Group__2__Impl rule__DSLControlLoopManager__Group__3 )
            // InternalSasDsl.g:1512:2: rule__DSLControlLoopManager__Group__2__Impl rule__DSLControlLoopManager__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__DSLControlLoopManager__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLControlLoopManager__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__2"


    // $ANTLR start "rule__DSLControlLoopManager__Group__2__Impl"
    // InternalSasDsl.g:1519:1: rule__DSLControlLoopManager__Group__2__Impl : ( 'typeOf' ) ;
    public final void rule__DSLControlLoopManager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1523:1: ( ( 'typeOf' ) )
            // InternalSasDsl.g:1524:1: ( 'typeOf' )
            {
            // InternalSasDsl.g:1524:1: ( 'typeOf' )
            // InternalSasDsl.g:1525:2: 'typeOf'
            {
             before(grammarAccess.getDSLControlLoopManagerAccess().getTypeOfKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDSLControlLoopManagerAccess().getTypeOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__2__Impl"


    // $ANTLR start "rule__DSLControlLoopManager__Group__3"
    // InternalSasDsl.g:1534:1: rule__DSLControlLoopManager__Group__3 : rule__DSLControlLoopManager__Group__3__Impl rule__DSLControlLoopManager__Group__4 ;
    public final void rule__DSLControlLoopManager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1538:1: ( rule__DSLControlLoopManager__Group__3__Impl rule__DSLControlLoopManager__Group__4 )
            // InternalSasDsl.g:1539:2: rule__DSLControlLoopManager__Group__3__Impl rule__DSLControlLoopManager__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__DSLControlLoopManager__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLControlLoopManager__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__3"


    // $ANTLR start "rule__DSLControlLoopManager__Group__3__Impl"
    // InternalSasDsl.g:1546:1: rule__DSLControlLoopManager__Group__3__Impl : ( ruleDSLTypeCLM ) ;
    public final void rule__DSLControlLoopManager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1550:1: ( ( ruleDSLTypeCLM ) )
            // InternalSasDsl.g:1551:1: ( ruleDSLTypeCLM )
            {
            // InternalSasDsl.g:1551:1: ( ruleDSLTypeCLM )
            // InternalSasDsl.g:1552:2: ruleDSLTypeCLM
            {
             before(grammarAccess.getDSLControlLoopManagerAccess().getDSLTypeCLMParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleDSLTypeCLM();

            state._fsp--;

             after(grammarAccess.getDSLControlLoopManagerAccess().getDSLTypeCLMParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__3__Impl"


    // $ANTLR start "rule__DSLControlLoopManager__Group__4"
    // InternalSasDsl.g:1561:1: rule__DSLControlLoopManager__Group__4 : rule__DSLControlLoopManager__Group__4__Impl ;
    public final void rule__DSLControlLoopManager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1565:1: ( rule__DSLControlLoopManager__Group__4__Impl )
            // InternalSasDsl.g:1566:2: rule__DSLControlLoopManager__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLControlLoopManager__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__4"


    // $ANTLR start "rule__DSLControlLoopManager__Group__4__Impl"
    // InternalSasDsl.g:1572:1: rule__DSLControlLoopManager__Group__4__Impl : ( ';' ) ;
    public final void rule__DSLControlLoopManager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1576:1: ( ( ';' ) )
            // InternalSasDsl.g:1577:1: ( ';' )
            {
            // InternalSasDsl.g:1577:1: ( ';' )
            // InternalSasDsl.g:1578:2: ';'
            {
             before(grammarAccess.getDSLControlLoopManagerAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLControlLoopManagerAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__Group__4__Impl"


    // $ANTLR start "rule__DSLControlLoop__Group__0"
    // InternalSasDsl.g:1588:1: rule__DSLControlLoop__Group__0 : rule__DSLControlLoop__Group__0__Impl rule__DSLControlLoop__Group__1 ;
    public final void rule__DSLControlLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1592:1: ( rule__DSLControlLoop__Group__0__Impl rule__DSLControlLoop__Group__1 )
            // InternalSasDsl.g:1593:2: rule__DSLControlLoop__Group__0__Impl rule__DSLControlLoop__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLControlLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLControlLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoop__Group__0"


    // $ANTLR start "rule__DSLControlLoop__Group__0__Impl"
    // InternalSasDsl.g:1600:1: rule__DSLControlLoop__Group__0__Impl : ( 'ControlLoop' ) ;
    public final void rule__DSLControlLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1604:1: ( ( 'ControlLoop' ) )
            // InternalSasDsl.g:1605:1: ( 'ControlLoop' )
            {
            // InternalSasDsl.g:1605:1: ( 'ControlLoop' )
            // InternalSasDsl.g:1606:2: 'ControlLoop'
            {
             before(grammarAccess.getDSLControlLoopAccess().getControlLoopKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDSLControlLoopAccess().getControlLoopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoop__Group__0__Impl"


    // $ANTLR start "rule__DSLControlLoop__Group__1"
    // InternalSasDsl.g:1615:1: rule__DSLControlLoop__Group__1 : rule__DSLControlLoop__Group__1__Impl rule__DSLControlLoop__Group__2 ;
    public final void rule__DSLControlLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1619:1: ( rule__DSLControlLoop__Group__1__Impl rule__DSLControlLoop__Group__2 )
            // InternalSasDsl.g:1620:2: rule__DSLControlLoop__Group__1__Impl rule__DSLControlLoop__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLControlLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLControlLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoop__Group__1"


    // $ANTLR start "rule__DSLControlLoop__Group__1__Impl"
    // InternalSasDsl.g:1627:1: rule__DSLControlLoop__Group__1__Impl : ( ( rule__DSLControlLoop__NameAssignment_1 ) ) ;
    public final void rule__DSLControlLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1631:1: ( ( ( rule__DSLControlLoop__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1632:1: ( ( rule__DSLControlLoop__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1632:1: ( ( rule__DSLControlLoop__NameAssignment_1 ) )
            // InternalSasDsl.g:1633:2: ( rule__DSLControlLoop__NameAssignment_1 )
            {
             before(grammarAccess.getDSLControlLoopAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1634:2: ( rule__DSLControlLoop__NameAssignment_1 )
            // InternalSasDsl.g:1634:3: rule__DSLControlLoop__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLControlLoop__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLControlLoopAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoop__Group__1__Impl"


    // $ANTLR start "rule__DSLControlLoop__Group__2"
    // InternalSasDsl.g:1642:1: rule__DSLControlLoop__Group__2 : rule__DSLControlLoop__Group__2__Impl ;
    public final void rule__DSLControlLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1646:1: ( rule__DSLControlLoop__Group__2__Impl )
            // InternalSasDsl.g:1647:2: rule__DSLControlLoop__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLControlLoop__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoop__Group__2"


    // $ANTLR start "rule__DSLControlLoop__Group__2__Impl"
    // InternalSasDsl.g:1653:1: rule__DSLControlLoop__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLControlLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1657:1: ( ( ';' ) )
            // InternalSasDsl.g:1658:1: ( ';' )
            {
            // InternalSasDsl.g:1658:1: ( ';' )
            // InternalSasDsl.g:1659:2: ';'
            {
             before(grammarAccess.getDSLControlLoopAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLControlLoopAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoop__Group__2__Impl"


    // $ANTLR start "rule__DSLMonitor__Group__0"
    // InternalSasDsl.g:1669:1: rule__DSLMonitor__Group__0 : rule__DSLMonitor__Group__0__Impl rule__DSLMonitor__Group__1 ;
    public final void rule__DSLMonitor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1673:1: ( rule__DSLMonitor__Group__0__Impl rule__DSLMonitor__Group__1 )
            // InternalSasDsl.g:1674:2: rule__DSLMonitor__Group__0__Impl rule__DSLMonitor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLMonitor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLMonitor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMonitor__Group__0"


    // $ANTLR start "rule__DSLMonitor__Group__0__Impl"
    // InternalSasDsl.g:1681:1: rule__DSLMonitor__Group__0__Impl : ( 'Monitor' ) ;
    public final void rule__DSLMonitor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1685:1: ( ( 'Monitor' ) )
            // InternalSasDsl.g:1686:1: ( 'Monitor' )
            {
            // InternalSasDsl.g:1686:1: ( 'Monitor' )
            // InternalSasDsl.g:1687:2: 'Monitor'
            {
             before(grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMonitor__Group__0__Impl"


    // $ANTLR start "rule__DSLMonitor__Group__1"
    // InternalSasDsl.g:1696:1: rule__DSLMonitor__Group__1 : rule__DSLMonitor__Group__1__Impl rule__DSLMonitor__Group__2 ;
    public final void rule__DSLMonitor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1700:1: ( rule__DSLMonitor__Group__1__Impl rule__DSLMonitor__Group__2 )
            // InternalSasDsl.g:1701:2: rule__DSLMonitor__Group__1__Impl rule__DSLMonitor__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLMonitor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLMonitor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMonitor__Group__1"


    // $ANTLR start "rule__DSLMonitor__Group__1__Impl"
    // InternalSasDsl.g:1708:1: rule__DSLMonitor__Group__1__Impl : ( ( rule__DSLMonitor__NameAssignment_1 ) ) ;
    public final void rule__DSLMonitor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1712:1: ( ( ( rule__DSLMonitor__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1713:1: ( ( rule__DSLMonitor__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1713:1: ( ( rule__DSLMonitor__NameAssignment_1 ) )
            // InternalSasDsl.g:1714:2: ( rule__DSLMonitor__NameAssignment_1 )
            {
             before(grammarAccess.getDSLMonitorAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1715:2: ( rule__DSLMonitor__NameAssignment_1 )
            // InternalSasDsl.g:1715:3: rule__DSLMonitor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLMonitor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLMonitorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMonitor__Group__1__Impl"


    // $ANTLR start "rule__DSLMonitor__Group__2"
    // InternalSasDsl.g:1723:1: rule__DSLMonitor__Group__2 : rule__DSLMonitor__Group__2__Impl ;
    public final void rule__DSLMonitor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1727:1: ( rule__DSLMonitor__Group__2__Impl )
            // InternalSasDsl.g:1728:2: rule__DSLMonitor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLMonitor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMonitor__Group__2"


    // $ANTLR start "rule__DSLMonitor__Group__2__Impl"
    // InternalSasDsl.g:1734:1: rule__DSLMonitor__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLMonitor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1738:1: ( ( ';' ) )
            // InternalSasDsl.g:1739:1: ( ';' )
            {
            // InternalSasDsl.g:1739:1: ( ';' )
            // InternalSasDsl.g:1740:2: ';'
            {
             before(grammarAccess.getDSLMonitorAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLMonitorAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMonitor__Group__2__Impl"


    // $ANTLR start "rule__DSLAnalyzer__Group__0"
    // InternalSasDsl.g:1750:1: rule__DSLAnalyzer__Group__0 : rule__DSLAnalyzer__Group__0__Impl rule__DSLAnalyzer__Group__1 ;
    public final void rule__DSLAnalyzer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1754:1: ( rule__DSLAnalyzer__Group__0__Impl rule__DSLAnalyzer__Group__1 )
            // InternalSasDsl.g:1755:2: rule__DSLAnalyzer__Group__0__Impl rule__DSLAnalyzer__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLAnalyzer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLAnalyzer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLAnalyzer__Group__0"


    // $ANTLR start "rule__DSLAnalyzer__Group__0__Impl"
    // InternalSasDsl.g:1762:1: rule__DSLAnalyzer__Group__0__Impl : ( 'Analyzer' ) ;
    public final void rule__DSLAnalyzer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1766:1: ( ( 'Analyzer' ) )
            // InternalSasDsl.g:1767:1: ( 'Analyzer' )
            {
            // InternalSasDsl.g:1767:1: ( 'Analyzer' )
            // InternalSasDsl.g:1768:2: 'Analyzer'
            {
             before(grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLAnalyzer__Group__0__Impl"


    // $ANTLR start "rule__DSLAnalyzer__Group__1"
    // InternalSasDsl.g:1777:1: rule__DSLAnalyzer__Group__1 : rule__DSLAnalyzer__Group__1__Impl rule__DSLAnalyzer__Group__2 ;
    public final void rule__DSLAnalyzer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1781:1: ( rule__DSLAnalyzer__Group__1__Impl rule__DSLAnalyzer__Group__2 )
            // InternalSasDsl.g:1782:2: rule__DSLAnalyzer__Group__1__Impl rule__DSLAnalyzer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLAnalyzer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLAnalyzer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLAnalyzer__Group__1"


    // $ANTLR start "rule__DSLAnalyzer__Group__1__Impl"
    // InternalSasDsl.g:1789:1: rule__DSLAnalyzer__Group__1__Impl : ( ( rule__DSLAnalyzer__NameAssignment_1 ) ) ;
    public final void rule__DSLAnalyzer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1793:1: ( ( ( rule__DSLAnalyzer__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1794:1: ( ( rule__DSLAnalyzer__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1794:1: ( ( rule__DSLAnalyzer__NameAssignment_1 ) )
            // InternalSasDsl.g:1795:2: ( rule__DSLAnalyzer__NameAssignment_1 )
            {
             before(grammarAccess.getDSLAnalyzerAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1796:2: ( rule__DSLAnalyzer__NameAssignment_1 )
            // InternalSasDsl.g:1796:3: rule__DSLAnalyzer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLAnalyzer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLAnalyzerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLAnalyzer__Group__1__Impl"


    // $ANTLR start "rule__DSLAnalyzer__Group__2"
    // InternalSasDsl.g:1804:1: rule__DSLAnalyzer__Group__2 : rule__DSLAnalyzer__Group__2__Impl ;
    public final void rule__DSLAnalyzer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1808:1: ( rule__DSLAnalyzer__Group__2__Impl )
            // InternalSasDsl.g:1809:2: rule__DSLAnalyzer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLAnalyzer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLAnalyzer__Group__2"


    // $ANTLR start "rule__DSLAnalyzer__Group__2__Impl"
    // InternalSasDsl.g:1815:1: rule__DSLAnalyzer__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLAnalyzer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1819:1: ( ( ';' ) )
            // InternalSasDsl.g:1820:1: ( ';' )
            {
            // InternalSasDsl.g:1820:1: ( ';' )
            // InternalSasDsl.g:1821:2: ';'
            {
             before(grammarAccess.getDSLAnalyzerAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLAnalyzerAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLAnalyzer__Group__2__Impl"


    // $ANTLR start "rule__DSLPlanner__Group__0"
    // InternalSasDsl.g:1831:1: rule__DSLPlanner__Group__0 : rule__DSLPlanner__Group__0__Impl rule__DSLPlanner__Group__1 ;
    public final void rule__DSLPlanner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1835:1: ( rule__DSLPlanner__Group__0__Impl rule__DSLPlanner__Group__1 )
            // InternalSasDsl.g:1836:2: rule__DSLPlanner__Group__0__Impl rule__DSLPlanner__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLPlanner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLPlanner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLPlanner__Group__0"


    // $ANTLR start "rule__DSLPlanner__Group__0__Impl"
    // InternalSasDsl.g:1843:1: rule__DSLPlanner__Group__0__Impl : ( 'Planner' ) ;
    public final void rule__DSLPlanner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1847:1: ( ( 'Planner' ) )
            // InternalSasDsl.g:1848:1: ( 'Planner' )
            {
            // InternalSasDsl.g:1848:1: ( 'Planner' )
            // InternalSasDsl.g:1849:2: 'Planner'
            {
             before(grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLPlanner__Group__0__Impl"


    // $ANTLR start "rule__DSLPlanner__Group__1"
    // InternalSasDsl.g:1858:1: rule__DSLPlanner__Group__1 : rule__DSLPlanner__Group__1__Impl rule__DSLPlanner__Group__2 ;
    public final void rule__DSLPlanner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1862:1: ( rule__DSLPlanner__Group__1__Impl rule__DSLPlanner__Group__2 )
            // InternalSasDsl.g:1863:2: rule__DSLPlanner__Group__1__Impl rule__DSLPlanner__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLPlanner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLPlanner__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLPlanner__Group__1"


    // $ANTLR start "rule__DSLPlanner__Group__1__Impl"
    // InternalSasDsl.g:1870:1: rule__DSLPlanner__Group__1__Impl : ( ( rule__DSLPlanner__NameAssignment_1 ) ) ;
    public final void rule__DSLPlanner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1874:1: ( ( ( rule__DSLPlanner__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1875:1: ( ( rule__DSLPlanner__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1875:1: ( ( rule__DSLPlanner__NameAssignment_1 ) )
            // InternalSasDsl.g:1876:2: ( rule__DSLPlanner__NameAssignment_1 )
            {
             before(grammarAccess.getDSLPlannerAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1877:2: ( rule__DSLPlanner__NameAssignment_1 )
            // InternalSasDsl.g:1877:3: rule__DSLPlanner__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLPlanner__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLPlannerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLPlanner__Group__1__Impl"


    // $ANTLR start "rule__DSLPlanner__Group__2"
    // InternalSasDsl.g:1885:1: rule__DSLPlanner__Group__2 : rule__DSLPlanner__Group__2__Impl ;
    public final void rule__DSLPlanner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1889:1: ( rule__DSLPlanner__Group__2__Impl )
            // InternalSasDsl.g:1890:2: rule__DSLPlanner__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLPlanner__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLPlanner__Group__2"


    // $ANTLR start "rule__DSLPlanner__Group__2__Impl"
    // InternalSasDsl.g:1896:1: rule__DSLPlanner__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLPlanner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1900:1: ( ( ';' ) )
            // InternalSasDsl.g:1901:1: ( ';' )
            {
            // InternalSasDsl.g:1901:1: ( ';' )
            // InternalSasDsl.g:1902:2: ';'
            {
             before(grammarAccess.getDSLPlannerAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLPlannerAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLPlanner__Group__2__Impl"


    // $ANTLR start "rule__DSLExecutor__Group__0"
    // InternalSasDsl.g:1912:1: rule__DSLExecutor__Group__0 : rule__DSLExecutor__Group__0__Impl rule__DSLExecutor__Group__1 ;
    public final void rule__DSLExecutor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1916:1: ( rule__DSLExecutor__Group__0__Impl rule__DSLExecutor__Group__1 )
            // InternalSasDsl.g:1917:2: rule__DSLExecutor__Group__0__Impl rule__DSLExecutor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLExecutor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLExecutor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLExecutor__Group__0"


    // $ANTLR start "rule__DSLExecutor__Group__0__Impl"
    // InternalSasDsl.g:1924:1: rule__DSLExecutor__Group__0__Impl : ( 'Executor' ) ;
    public final void rule__DSLExecutor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1928:1: ( ( 'Executor' ) )
            // InternalSasDsl.g:1929:1: ( 'Executor' )
            {
            // InternalSasDsl.g:1929:1: ( 'Executor' )
            // InternalSasDsl.g:1930:2: 'Executor'
            {
             before(grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLExecutor__Group__0__Impl"


    // $ANTLR start "rule__DSLExecutor__Group__1"
    // InternalSasDsl.g:1939:1: rule__DSLExecutor__Group__1 : rule__DSLExecutor__Group__1__Impl rule__DSLExecutor__Group__2 ;
    public final void rule__DSLExecutor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1943:1: ( rule__DSLExecutor__Group__1__Impl rule__DSLExecutor__Group__2 )
            // InternalSasDsl.g:1944:2: rule__DSLExecutor__Group__1__Impl rule__DSLExecutor__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLExecutor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLExecutor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLExecutor__Group__1"


    // $ANTLR start "rule__DSLExecutor__Group__1__Impl"
    // InternalSasDsl.g:1951:1: rule__DSLExecutor__Group__1__Impl : ( ( rule__DSLExecutor__NameAssignment_1 ) ) ;
    public final void rule__DSLExecutor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1955:1: ( ( ( rule__DSLExecutor__NameAssignment_1 ) ) )
            // InternalSasDsl.g:1956:1: ( ( rule__DSLExecutor__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:1956:1: ( ( rule__DSLExecutor__NameAssignment_1 ) )
            // InternalSasDsl.g:1957:2: ( rule__DSLExecutor__NameAssignment_1 )
            {
             before(grammarAccess.getDSLExecutorAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:1958:2: ( rule__DSLExecutor__NameAssignment_1 )
            // InternalSasDsl.g:1958:3: rule__DSLExecutor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLExecutor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLExecutorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLExecutor__Group__1__Impl"


    // $ANTLR start "rule__DSLExecutor__Group__2"
    // InternalSasDsl.g:1966:1: rule__DSLExecutor__Group__2 : rule__DSLExecutor__Group__2__Impl ;
    public final void rule__DSLExecutor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1970:1: ( rule__DSLExecutor__Group__2__Impl )
            // InternalSasDsl.g:1971:2: rule__DSLExecutor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLExecutor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLExecutor__Group__2"


    // $ANTLR start "rule__DSLExecutor__Group__2__Impl"
    // InternalSasDsl.g:1977:1: rule__DSLExecutor__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLExecutor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1981:1: ( ( ';' ) )
            // InternalSasDsl.g:1982:1: ( ';' )
            {
            // InternalSasDsl.g:1982:1: ( ';' )
            // InternalSasDsl.g:1983:2: ';'
            {
             before(grammarAccess.getDSLExecutorAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLExecutorAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLExecutor__Group__2__Impl"


    // $ANTLR start "rule__DSLKnowledge__Group__0"
    // InternalSasDsl.g:1993:1: rule__DSLKnowledge__Group__0 : rule__DSLKnowledge__Group__0__Impl rule__DSLKnowledge__Group__1 ;
    public final void rule__DSLKnowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:1997:1: ( rule__DSLKnowledge__Group__0__Impl rule__DSLKnowledge__Group__1 )
            // InternalSasDsl.g:1998:2: rule__DSLKnowledge__Group__0__Impl rule__DSLKnowledge__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLKnowledge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLKnowledge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLKnowledge__Group__0"


    // $ANTLR start "rule__DSLKnowledge__Group__0__Impl"
    // InternalSasDsl.g:2005:1: rule__DSLKnowledge__Group__0__Impl : ( 'Knowledge' ) ;
    public final void rule__DSLKnowledge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2009:1: ( ( 'Knowledge' ) )
            // InternalSasDsl.g:2010:1: ( 'Knowledge' )
            {
            // InternalSasDsl.g:2010:1: ( 'Knowledge' )
            // InternalSasDsl.g:2011:2: 'Knowledge'
            {
             before(grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLKnowledge__Group__0__Impl"


    // $ANTLR start "rule__DSLKnowledge__Group__1"
    // InternalSasDsl.g:2020:1: rule__DSLKnowledge__Group__1 : rule__DSLKnowledge__Group__1__Impl rule__DSLKnowledge__Group__2 ;
    public final void rule__DSLKnowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2024:1: ( rule__DSLKnowledge__Group__1__Impl rule__DSLKnowledge__Group__2 )
            // InternalSasDsl.g:2025:2: rule__DSLKnowledge__Group__1__Impl rule__DSLKnowledge__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLKnowledge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLKnowledge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLKnowledge__Group__1"


    // $ANTLR start "rule__DSLKnowledge__Group__1__Impl"
    // InternalSasDsl.g:2032:1: rule__DSLKnowledge__Group__1__Impl : ( ( rule__DSLKnowledge__NameAssignment_1 ) ) ;
    public final void rule__DSLKnowledge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2036:1: ( ( ( rule__DSLKnowledge__NameAssignment_1 ) ) )
            // InternalSasDsl.g:2037:1: ( ( rule__DSLKnowledge__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:2037:1: ( ( rule__DSLKnowledge__NameAssignment_1 ) )
            // InternalSasDsl.g:2038:2: ( rule__DSLKnowledge__NameAssignment_1 )
            {
             before(grammarAccess.getDSLKnowledgeAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:2039:2: ( rule__DSLKnowledge__NameAssignment_1 )
            // InternalSasDsl.g:2039:3: rule__DSLKnowledge__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLKnowledge__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLKnowledgeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLKnowledge__Group__1__Impl"


    // $ANTLR start "rule__DSLKnowledge__Group__2"
    // InternalSasDsl.g:2047:1: rule__DSLKnowledge__Group__2 : rule__DSLKnowledge__Group__2__Impl ;
    public final void rule__DSLKnowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2051:1: ( rule__DSLKnowledge__Group__2__Impl )
            // InternalSasDsl.g:2052:2: rule__DSLKnowledge__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLKnowledge__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLKnowledge__Group__2"


    // $ANTLR start "rule__DSLKnowledge__Group__2__Impl"
    // InternalSasDsl.g:2058:1: rule__DSLKnowledge__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLKnowledge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2062:1: ( ( ';' ) )
            // InternalSasDsl.g:2063:1: ( ';' )
            {
            // InternalSasDsl.g:2063:1: ( ';' )
            // InternalSasDsl.g:2064:2: ';'
            {
             before(grammarAccess.getDSLKnowledgeAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLKnowledgeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLKnowledge__Group__2__Impl"


    // $ANTLR start "rule__DSLSensor__Group__0"
    // InternalSasDsl.g:2074:1: rule__DSLSensor__Group__0 : rule__DSLSensor__Group__0__Impl rule__DSLSensor__Group__1 ;
    public final void rule__DSLSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2078:1: ( rule__DSLSensor__Group__0__Impl rule__DSLSensor__Group__1 )
            // InternalSasDsl.g:2079:2: rule__DSLSensor__Group__0__Impl rule__DSLSensor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLSensor__Group__0"


    // $ANTLR start "rule__DSLSensor__Group__0__Impl"
    // InternalSasDsl.g:2086:1: rule__DSLSensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__DSLSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2090:1: ( ( 'Sensor' ) )
            // InternalSasDsl.g:2091:1: ( 'Sensor' )
            {
            // InternalSasDsl.g:2091:1: ( 'Sensor' )
            // InternalSasDsl.g:2092:2: 'Sensor'
            {
             before(grammarAccess.getDSLSensorAccess().getSensorKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDSLSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLSensor__Group__0__Impl"


    // $ANTLR start "rule__DSLSensor__Group__1"
    // InternalSasDsl.g:2101:1: rule__DSLSensor__Group__1 : rule__DSLSensor__Group__1__Impl rule__DSLSensor__Group__2 ;
    public final void rule__DSLSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2105:1: ( rule__DSLSensor__Group__1__Impl rule__DSLSensor__Group__2 )
            // InternalSasDsl.g:2106:2: rule__DSLSensor__Group__1__Impl rule__DSLSensor__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLSensor__Group__1"


    // $ANTLR start "rule__DSLSensor__Group__1__Impl"
    // InternalSasDsl.g:2113:1: rule__DSLSensor__Group__1__Impl : ( ( rule__DSLSensor__NameAssignment_1 ) ) ;
    public final void rule__DSLSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2117:1: ( ( ( rule__DSLSensor__NameAssignment_1 ) ) )
            // InternalSasDsl.g:2118:1: ( ( rule__DSLSensor__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:2118:1: ( ( rule__DSLSensor__NameAssignment_1 ) )
            // InternalSasDsl.g:2119:2: ( rule__DSLSensor__NameAssignment_1 )
            {
             before(grammarAccess.getDSLSensorAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:2120:2: ( rule__DSLSensor__NameAssignment_1 )
            // InternalSasDsl.g:2120:3: rule__DSLSensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLSensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLSensor__Group__1__Impl"


    // $ANTLR start "rule__DSLSensor__Group__2"
    // InternalSasDsl.g:2128:1: rule__DSLSensor__Group__2 : rule__DSLSensor__Group__2__Impl ;
    public final void rule__DSLSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2132:1: ( rule__DSLSensor__Group__2__Impl )
            // InternalSasDsl.g:2133:2: rule__DSLSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLSensor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLSensor__Group__2"


    // $ANTLR start "rule__DSLSensor__Group__2__Impl"
    // InternalSasDsl.g:2139:1: rule__DSLSensor__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2143:1: ( ( ';' ) )
            // InternalSasDsl.g:2144:1: ( ';' )
            {
            // InternalSasDsl.g:2144:1: ( ';' )
            // InternalSasDsl.g:2145:2: ';'
            {
             before(grammarAccess.getDSLSensorAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLSensorAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLSensor__Group__2__Impl"


    // $ANTLR start "rule__DSLEffector__Group__0"
    // InternalSasDsl.g:2155:1: rule__DSLEffector__Group__0 : rule__DSLEffector__Group__0__Impl rule__DSLEffector__Group__1 ;
    public final void rule__DSLEffector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2159:1: ( rule__DSLEffector__Group__0__Impl rule__DSLEffector__Group__1 )
            // InternalSasDsl.g:2160:2: rule__DSLEffector__Group__0__Impl rule__DSLEffector__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLEffector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLEffector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLEffector__Group__0"


    // $ANTLR start "rule__DSLEffector__Group__0__Impl"
    // InternalSasDsl.g:2167:1: rule__DSLEffector__Group__0__Impl : ( 'Effector' ) ;
    public final void rule__DSLEffector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2171:1: ( ( 'Effector' ) )
            // InternalSasDsl.g:2172:1: ( 'Effector' )
            {
            // InternalSasDsl.g:2172:1: ( 'Effector' )
            // InternalSasDsl.g:2173:2: 'Effector'
            {
             before(grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLEffector__Group__0__Impl"


    // $ANTLR start "rule__DSLEffector__Group__1"
    // InternalSasDsl.g:2182:1: rule__DSLEffector__Group__1 : rule__DSLEffector__Group__1__Impl rule__DSLEffector__Group__2 ;
    public final void rule__DSLEffector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2186:1: ( rule__DSLEffector__Group__1__Impl rule__DSLEffector__Group__2 )
            // InternalSasDsl.g:2187:2: rule__DSLEffector__Group__1__Impl rule__DSLEffector__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLEffector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLEffector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLEffector__Group__1"


    // $ANTLR start "rule__DSLEffector__Group__1__Impl"
    // InternalSasDsl.g:2194:1: rule__DSLEffector__Group__1__Impl : ( ( rule__DSLEffector__NameAssignment_1 ) ) ;
    public final void rule__DSLEffector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2198:1: ( ( ( rule__DSLEffector__NameAssignment_1 ) ) )
            // InternalSasDsl.g:2199:1: ( ( rule__DSLEffector__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:2199:1: ( ( rule__DSLEffector__NameAssignment_1 ) )
            // InternalSasDsl.g:2200:2: ( rule__DSLEffector__NameAssignment_1 )
            {
             before(grammarAccess.getDSLEffectorAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:2201:2: ( rule__DSLEffector__NameAssignment_1 )
            // InternalSasDsl.g:2201:3: rule__DSLEffector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLEffector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLEffectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLEffector__Group__1__Impl"


    // $ANTLR start "rule__DSLEffector__Group__2"
    // InternalSasDsl.g:2209:1: rule__DSLEffector__Group__2 : rule__DSLEffector__Group__2__Impl ;
    public final void rule__DSLEffector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2213:1: ( rule__DSLEffector__Group__2__Impl )
            // InternalSasDsl.g:2214:2: rule__DSLEffector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLEffector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLEffector__Group__2"


    // $ANTLR start "rule__DSLEffector__Group__2__Impl"
    // InternalSasDsl.g:2220:1: rule__DSLEffector__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLEffector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2224:1: ( ( ';' ) )
            // InternalSasDsl.g:2225:1: ( ';' )
            {
            // InternalSasDsl.g:2225:1: ( ';' )
            // InternalSasDsl.g:2226:2: ';'
            {
             before(grammarAccess.getDSLEffectorAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLEffectorAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLEffector__Group__2__Impl"


    // $ANTLR start "rule__DSLProbe__Group__0"
    // InternalSasDsl.g:2236:1: rule__DSLProbe__Group__0 : rule__DSLProbe__Group__0__Impl rule__DSLProbe__Group__1 ;
    public final void rule__DSLProbe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2240:1: ( rule__DSLProbe__Group__0__Impl rule__DSLProbe__Group__1 )
            // InternalSasDsl.g:2241:2: rule__DSLProbe__Group__0__Impl rule__DSLProbe__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLProbe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLProbe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLProbe__Group__0"


    // $ANTLR start "rule__DSLProbe__Group__0__Impl"
    // InternalSasDsl.g:2248:1: rule__DSLProbe__Group__0__Impl : ( 'Probe' ) ;
    public final void rule__DSLProbe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2252:1: ( ( 'Probe' ) )
            // InternalSasDsl.g:2253:1: ( 'Probe' )
            {
            // InternalSasDsl.g:2253:1: ( 'Probe' )
            // InternalSasDsl.g:2254:2: 'Probe'
            {
             before(grammarAccess.getDSLProbeAccess().getProbeKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDSLProbeAccess().getProbeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLProbe__Group__0__Impl"


    // $ANTLR start "rule__DSLProbe__Group__1"
    // InternalSasDsl.g:2263:1: rule__DSLProbe__Group__1 : rule__DSLProbe__Group__1__Impl rule__DSLProbe__Group__2 ;
    public final void rule__DSLProbe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2267:1: ( rule__DSLProbe__Group__1__Impl rule__DSLProbe__Group__2 )
            // InternalSasDsl.g:2268:2: rule__DSLProbe__Group__1__Impl rule__DSLProbe__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLProbe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLProbe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLProbe__Group__1"


    // $ANTLR start "rule__DSLProbe__Group__1__Impl"
    // InternalSasDsl.g:2275:1: rule__DSLProbe__Group__1__Impl : ( ( rule__DSLProbe__NameAssignment_1 ) ) ;
    public final void rule__DSLProbe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2279:1: ( ( ( rule__DSLProbe__NameAssignment_1 ) ) )
            // InternalSasDsl.g:2280:1: ( ( rule__DSLProbe__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:2280:1: ( ( rule__DSLProbe__NameAssignment_1 ) )
            // InternalSasDsl.g:2281:2: ( rule__DSLProbe__NameAssignment_1 )
            {
             before(grammarAccess.getDSLProbeAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:2282:2: ( rule__DSLProbe__NameAssignment_1 )
            // InternalSasDsl.g:2282:3: rule__DSLProbe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLProbe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLProbeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLProbe__Group__1__Impl"


    // $ANTLR start "rule__DSLProbe__Group__2"
    // InternalSasDsl.g:2290:1: rule__DSLProbe__Group__2 : rule__DSLProbe__Group__2__Impl ;
    public final void rule__DSLProbe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2294:1: ( rule__DSLProbe__Group__2__Impl )
            // InternalSasDsl.g:2295:2: rule__DSLProbe__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLProbe__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLProbe__Group__2"


    // $ANTLR start "rule__DSLProbe__Group__2__Impl"
    // InternalSasDsl.g:2301:1: rule__DSLProbe__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLProbe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2305:1: ( ( ';' ) )
            // InternalSasDsl.g:2306:1: ( ';' )
            {
            // InternalSasDsl.g:2306:1: ( ';' )
            // InternalSasDsl.g:2307:2: ';'
            {
             before(grammarAccess.getDSLProbeAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLProbeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLProbe__Group__2__Impl"


    // $ANTLR start "rule__DSLGauge__Group__0"
    // InternalSasDsl.g:2317:1: rule__DSLGauge__Group__0 : rule__DSLGauge__Group__0__Impl rule__DSLGauge__Group__1 ;
    public final void rule__DSLGauge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2321:1: ( rule__DSLGauge__Group__0__Impl rule__DSLGauge__Group__1 )
            // InternalSasDsl.g:2322:2: rule__DSLGauge__Group__0__Impl rule__DSLGauge__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLGauge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLGauge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLGauge__Group__0"


    // $ANTLR start "rule__DSLGauge__Group__0__Impl"
    // InternalSasDsl.g:2329:1: rule__DSLGauge__Group__0__Impl : ( 'Gauge' ) ;
    public final void rule__DSLGauge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2333:1: ( ( 'Gauge' ) )
            // InternalSasDsl.g:2334:1: ( 'Gauge' )
            {
            // InternalSasDsl.g:2334:1: ( 'Gauge' )
            // InternalSasDsl.g:2335:2: 'Gauge'
            {
             before(grammarAccess.getDSLGaugeAccess().getGaugeKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDSLGaugeAccess().getGaugeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLGauge__Group__0__Impl"


    // $ANTLR start "rule__DSLGauge__Group__1"
    // InternalSasDsl.g:2344:1: rule__DSLGauge__Group__1 : rule__DSLGauge__Group__1__Impl rule__DSLGauge__Group__2 ;
    public final void rule__DSLGauge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2348:1: ( rule__DSLGauge__Group__1__Impl rule__DSLGauge__Group__2 )
            // InternalSasDsl.g:2349:2: rule__DSLGauge__Group__1__Impl rule__DSLGauge__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLGauge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLGauge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLGauge__Group__1"


    // $ANTLR start "rule__DSLGauge__Group__1__Impl"
    // InternalSasDsl.g:2356:1: rule__DSLGauge__Group__1__Impl : ( ( rule__DSLGauge__NameAssignment_1 ) ) ;
    public final void rule__DSLGauge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2360:1: ( ( ( rule__DSLGauge__NameAssignment_1 ) ) )
            // InternalSasDsl.g:2361:1: ( ( rule__DSLGauge__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:2361:1: ( ( rule__DSLGauge__NameAssignment_1 ) )
            // InternalSasDsl.g:2362:2: ( rule__DSLGauge__NameAssignment_1 )
            {
             before(grammarAccess.getDSLGaugeAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:2363:2: ( rule__DSLGauge__NameAssignment_1 )
            // InternalSasDsl.g:2363:3: rule__DSLGauge__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLGauge__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLGaugeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLGauge__Group__1__Impl"


    // $ANTLR start "rule__DSLGauge__Group__2"
    // InternalSasDsl.g:2371:1: rule__DSLGauge__Group__2 : rule__DSLGauge__Group__2__Impl ;
    public final void rule__DSLGauge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2375:1: ( rule__DSLGauge__Group__2__Impl )
            // InternalSasDsl.g:2376:2: rule__DSLGauge__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLGauge__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLGauge__Group__2"


    // $ANTLR start "rule__DSLGauge__Group__2__Impl"
    // InternalSasDsl.g:2382:1: rule__DSLGauge__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLGauge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2386:1: ( ( ';' ) )
            // InternalSasDsl.g:2387:1: ( ';' )
            {
            // InternalSasDsl.g:2387:1: ( ';' )
            // InternalSasDsl.g:2388:2: ';'
            {
             before(grammarAccess.getDSLGaugeAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLGaugeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLGauge__Group__2__Impl"


    // $ANTLR start "rule__DSLReferenceInput__Group__0"
    // InternalSasDsl.g:2398:1: rule__DSLReferenceInput__Group__0 : rule__DSLReferenceInput__Group__0__Impl rule__DSLReferenceInput__Group__1 ;
    public final void rule__DSLReferenceInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2402:1: ( rule__DSLReferenceInput__Group__0__Impl rule__DSLReferenceInput__Group__1 )
            // InternalSasDsl.g:2403:2: rule__DSLReferenceInput__Group__0__Impl rule__DSLReferenceInput__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLReferenceInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLReferenceInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLReferenceInput__Group__0"


    // $ANTLR start "rule__DSLReferenceInput__Group__0__Impl"
    // InternalSasDsl.g:2410:1: rule__DSLReferenceInput__Group__0__Impl : ( 'ReferenceInput' ) ;
    public final void rule__DSLReferenceInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2414:1: ( ( 'ReferenceInput' ) )
            // InternalSasDsl.g:2415:1: ( 'ReferenceInput' )
            {
            // InternalSasDsl.g:2415:1: ( 'ReferenceInput' )
            // InternalSasDsl.g:2416:2: 'ReferenceInput'
            {
             before(grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLReferenceInput__Group__0__Impl"


    // $ANTLR start "rule__DSLReferenceInput__Group__1"
    // InternalSasDsl.g:2425:1: rule__DSLReferenceInput__Group__1 : rule__DSLReferenceInput__Group__1__Impl rule__DSLReferenceInput__Group__2 ;
    public final void rule__DSLReferenceInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2429:1: ( rule__DSLReferenceInput__Group__1__Impl rule__DSLReferenceInput__Group__2 )
            // InternalSasDsl.g:2430:2: rule__DSLReferenceInput__Group__1__Impl rule__DSLReferenceInput__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLReferenceInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLReferenceInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLReferenceInput__Group__1"


    // $ANTLR start "rule__DSLReferenceInput__Group__1__Impl"
    // InternalSasDsl.g:2437:1: rule__DSLReferenceInput__Group__1__Impl : ( ( rule__DSLReferenceInput__NameAssignment_1 ) ) ;
    public final void rule__DSLReferenceInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2441:1: ( ( ( rule__DSLReferenceInput__NameAssignment_1 ) ) )
            // InternalSasDsl.g:2442:1: ( ( rule__DSLReferenceInput__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:2442:1: ( ( rule__DSLReferenceInput__NameAssignment_1 ) )
            // InternalSasDsl.g:2443:2: ( rule__DSLReferenceInput__NameAssignment_1 )
            {
             before(grammarAccess.getDSLReferenceInputAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:2444:2: ( rule__DSLReferenceInput__NameAssignment_1 )
            // InternalSasDsl.g:2444:3: rule__DSLReferenceInput__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLReferenceInput__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLReferenceInputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLReferenceInput__Group__1__Impl"


    // $ANTLR start "rule__DSLReferenceInput__Group__2"
    // InternalSasDsl.g:2452:1: rule__DSLReferenceInput__Group__2 : rule__DSLReferenceInput__Group__2__Impl ;
    public final void rule__DSLReferenceInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2456:1: ( rule__DSLReferenceInput__Group__2__Impl )
            // InternalSasDsl.g:2457:2: rule__DSLReferenceInput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLReferenceInput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLReferenceInput__Group__2"


    // $ANTLR start "rule__DSLReferenceInput__Group__2__Impl"
    // InternalSasDsl.g:2463:1: rule__DSLReferenceInput__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLReferenceInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2467:1: ( ( ';' ) )
            // InternalSasDsl.g:2468:1: ( ';' )
            {
            // InternalSasDsl.g:2468:1: ( ';' )
            // InternalSasDsl.g:2469:2: ';'
            {
             before(grammarAccess.getDSLReferenceInputAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLReferenceInputAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLReferenceInput__Group__2__Impl"


    // $ANTLR start "rule__DSLMeasuredOutput__Group__0"
    // InternalSasDsl.g:2479:1: rule__DSLMeasuredOutput__Group__0 : rule__DSLMeasuredOutput__Group__0__Impl rule__DSLMeasuredOutput__Group__1 ;
    public final void rule__DSLMeasuredOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2483:1: ( rule__DSLMeasuredOutput__Group__0__Impl rule__DSLMeasuredOutput__Group__1 )
            // InternalSasDsl.g:2484:2: rule__DSLMeasuredOutput__Group__0__Impl rule__DSLMeasuredOutput__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLMeasuredOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLMeasuredOutput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMeasuredOutput__Group__0"


    // $ANTLR start "rule__DSLMeasuredOutput__Group__0__Impl"
    // InternalSasDsl.g:2491:1: rule__DSLMeasuredOutput__Group__0__Impl : ( 'MeasuredOutput' ) ;
    public final void rule__DSLMeasuredOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2495:1: ( ( 'MeasuredOutput' ) )
            // InternalSasDsl.g:2496:1: ( 'MeasuredOutput' )
            {
            // InternalSasDsl.g:2496:1: ( 'MeasuredOutput' )
            // InternalSasDsl.g:2497:2: 'MeasuredOutput'
            {
             before(grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMeasuredOutput__Group__0__Impl"


    // $ANTLR start "rule__DSLMeasuredOutput__Group__1"
    // InternalSasDsl.g:2506:1: rule__DSLMeasuredOutput__Group__1 : rule__DSLMeasuredOutput__Group__1__Impl rule__DSLMeasuredOutput__Group__2 ;
    public final void rule__DSLMeasuredOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2510:1: ( rule__DSLMeasuredOutput__Group__1__Impl rule__DSLMeasuredOutput__Group__2 )
            // InternalSasDsl.g:2511:2: rule__DSLMeasuredOutput__Group__1__Impl rule__DSLMeasuredOutput__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DSLMeasuredOutput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLMeasuredOutput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMeasuredOutput__Group__1"


    // $ANTLR start "rule__DSLMeasuredOutput__Group__1__Impl"
    // InternalSasDsl.g:2518:1: rule__DSLMeasuredOutput__Group__1__Impl : ( ( rule__DSLMeasuredOutput__NameAssignment_1 ) ) ;
    public final void rule__DSLMeasuredOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2522:1: ( ( ( rule__DSLMeasuredOutput__NameAssignment_1 ) ) )
            // InternalSasDsl.g:2523:1: ( ( rule__DSLMeasuredOutput__NameAssignment_1 ) )
            {
            // InternalSasDsl.g:2523:1: ( ( rule__DSLMeasuredOutput__NameAssignment_1 ) )
            // InternalSasDsl.g:2524:2: ( rule__DSLMeasuredOutput__NameAssignment_1 )
            {
             before(grammarAccess.getDSLMeasuredOutputAccess().getNameAssignment_1()); 
            // InternalSasDsl.g:2525:2: ( rule__DSLMeasuredOutput__NameAssignment_1 )
            // InternalSasDsl.g:2525:3: rule__DSLMeasuredOutput__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLMeasuredOutput__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLMeasuredOutputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMeasuredOutput__Group__1__Impl"


    // $ANTLR start "rule__DSLMeasuredOutput__Group__2"
    // InternalSasDsl.g:2533:1: rule__DSLMeasuredOutput__Group__2 : rule__DSLMeasuredOutput__Group__2__Impl ;
    public final void rule__DSLMeasuredOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2537:1: ( rule__DSLMeasuredOutput__Group__2__Impl )
            // InternalSasDsl.g:2538:2: rule__DSLMeasuredOutput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLMeasuredOutput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMeasuredOutput__Group__2"


    // $ANTLR start "rule__DSLMeasuredOutput__Group__2__Impl"
    // InternalSasDsl.g:2544:1: rule__DSLMeasuredOutput__Group__2__Impl : ( ';' ) ;
    public final void rule__DSLMeasuredOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2548:1: ( ( ';' ) )
            // InternalSasDsl.g:2549:1: ( ';' )
            {
            // InternalSasDsl.g:2549:1: ( ';' )
            // InternalSasDsl.g:2550:2: ';'
            {
             before(grammarAccess.getDSLMeasuredOutputAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLMeasuredOutputAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMeasuredOutput__Group__2__Impl"


    // $ANTLR start "rule__DSLCompositions__Group__0"
    // InternalSasDsl.g:2560:1: rule__DSLCompositions__Group__0 : rule__DSLCompositions__Group__0__Impl rule__DSLCompositions__Group__1 ;
    public final void rule__DSLCompositions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2564:1: ( rule__DSLCompositions__Group__0__Impl rule__DSLCompositions__Group__1 )
            // InternalSasDsl.g:2565:2: rule__DSLCompositions__Group__0__Impl rule__DSLCompositions__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DSLCompositions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLCompositions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__0"


    // $ANTLR start "rule__DSLCompositions__Group__0__Impl"
    // InternalSasDsl.g:2572:1: rule__DSLCompositions__Group__0__Impl : ( ( rule__DSLCompositions__SensorAssignment_0 ) ) ;
    public final void rule__DSLCompositions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2576:1: ( ( ( rule__DSLCompositions__SensorAssignment_0 ) ) )
            // InternalSasDsl.g:2577:1: ( ( rule__DSLCompositions__SensorAssignment_0 ) )
            {
            // InternalSasDsl.g:2577:1: ( ( rule__DSLCompositions__SensorAssignment_0 ) )
            // InternalSasDsl.g:2578:2: ( rule__DSLCompositions__SensorAssignment_0 )
            {
             before(grammarAccess.getDSLCompositionsAccess().getSensorAssignment_0()); 
            // InternalSasDsl.g:2579:2: ( rule__DSLCompositions__SensorAssignment_0 )
            // InternalSasDsl.g:2579:3: rule__DSLCompositions__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DSLCompositions__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDSLCompositionsAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__0__Impl"


    // $ANTLR start "rule__DSLCompositions__Group__1"
    // InternalSasDsl.g:2587:1: rule__DSLCompositions__Group__1 : rule__DSLCompositions__Group__1__Impl rule__DSLCompositions__Group__2 ;
    public final void rule__DSLCompositions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2591:1: ( rule__DSLCompositions__Group__1__Impl rule__DSLCompositions__Group__2 )
            // InternalSasDsl.g:2592:2: rule__DSLCompositions__Group__1__Impl rule__DSLCompositions__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DSLCompositions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLCompositions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__1"


    // $ANTLR start "rule__DSLCompositions__Group__1__Impl"
    // InternalSasDsl.g:2599:1: rule__DSLCompositions__Group__1__Impl : ( ( rule__DSLCompositions__MustBeInAssignment_1 ) ) ;
    public final void rule__DSLCompositions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2603:1: ( ( ( rule__DSLCompositions__MustBeInAssignment_1 ) ) )
            // InternalSasDsl.g:2604:1: ( ( rule__DSLCompositions__MustBeInAssignment_1 ) )
            {
            // InternalSasDsl.g:2604:1: ( ( rule__DSLCompositions__MustBeInAssignment_1 ) )
            // InternalSasDsl.g:2605:2: ( rule__DSLCompositions__MustBeInAssignment_1 )
            {
             before(grammarAccess.getDSLCompositionsAccess().getMustBeInAssignment_1()); 
            // InternalSasDsl.g:2606:2: ( rule__DSLCompositions__MustBeInAssignment_1 )
            // InternalSasDsl.g:2606:3: rule__DSLCompositions__MustBeInAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLCompositions__MustBeInAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLCompositionsAccess().getMustBeInAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__1__Impl"


    // $ANTLR start "rule__DSLCompositions__Group__2"
    // InternalSasDsl.g:2614:1: rule__DSLCompositions__Group__2 : rule__DSLCompositions__Group__2__Impl rule__DSLCompositions__Group__3 ;
    public final void rule__DSLCompositions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2618:1: ( rule__DSLCompositions__Group__2__Impl rule__DSLCompositions__Group__3 )
            // InternalSasDsl.g:2619:2: rule__DSLCompositions__Group__2__Impl rule__DSLCompositions__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DSLCompositions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLCompositions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__2"


    // $ANTLR start "rule__DSLCompositions__Group__2__Impl"
    // InternalSasDsl.g:2626:1: rule__DSLCompositions__Group__2__Impl : ( ( rule__DSLCompositions__MonitorAssignment_2 ) ) ;
    public final void rule__DSLCompositions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2630:1: ( ( ( rule__DSLCompositions__MonitorAssignment_2 ) ) )
            // InternalSasDsl.g:2631:1: ( ( rule__DSLCompositions__MonitorAssignment_2 ) )
            {
            // InternalSasDsl.g:2631:1: ( ( rule__DSLCompositions__MonitorAssignment_2 ) )
            // InternalSasDsl.g:2632:2: ( rule__DSLCompositions__MonitorAssignment_2 )
            {
             before(grammarAccess.getDSLCompositionsAccess().getMonitorAssignment_2()); 
            // InternalSasDsl.g:2633:2: ( rule__DSLCompositions__MonitorAssignment_2 )
            // InternalSasDsl.g:2633:3: rule__DSLCompositions__MonitorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DSLCompositions__MonitorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDSLCompositionsAccess().getMonitorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__2__Impl"


    // $ANTLR start "rule__DSLCompositions__Group__3"
    // InternalSasDsl.g:2641:1: rule__DSLCompositions__Group__3 : rule__DSLCompositions__Group__3__Impl ;
    public final void rule__DSLCompositions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2645:1: ( rule__DSLCompositions__Group__3__Impl )
            // InternalSasDsl.g:2646:2: rule__DSLCompositions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLCompositions__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__3"


    // $ANTLR start "rule__DSLCompositions__Group__3__Impl"
    // InternalSasDsl.g:2652:1: rule__DSLCompositions__Group__3__Impl : ( ';' ) ;
    public final void rule__DSLCompositions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2656:1: ( ( ';' ) )
            // InternalSasDsl.g:2657:1: ( ';' )
            {
            // InternalSasDsl.g:2657:1: ( ';' )
            // InternalSasDsl.g:2658:2: ';'
            {
             before(grammarAccess.getDSLCompositionsAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLCompositionsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__Group__3__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_0__0"
    // InternalSasDsl.g:2668:1: rule__DSLRestrictions__Group_0__0 : rule__DSLRestrictions__Group_0__0__Impl rule__DSLRestrictions__Group_0__1 ;
    public final void rule__DSLRestrictions__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2672:1: ( rule__DSLRestrictions__Group_0__0__Impl rule__DSLRestrictions__Group_0__1 )
            // InternalSasDsl.g:2673:2: rule__DSLRestrictions__Group_0__0__Impl rule__DSLRestrictions__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__DSLRestrictions__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__0"


    // $ANTLR start "rule__DSLRestrictions__Group_0__0__Impl"
    // InternalSasDsl.g:2680:1: rule__DSLRestrictions__Group_0__0__Impl : ( ( rule__DSLRestrictions__OnlyAssignment_0_0 ) ) ;
    public final void rule__DSLRestrictions__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2684:1: ( ( ( rule__DSLRestrictions__OnlyAssignment_0_0 ) ) )
            // InternalSasDsl.g:2685:1: ( ( rule__DSLRestrictions__OnlyAssignment_0_0 ) )
            {
            // InternalSasDsl.g:2685:1: ( ( rule__DSLRestrictions__OnlyAssignment_0_0 ) )
            // InternalSasDsl.g:2686:2: ( rule__DSLRestrictions__OnlyAssignment_0_0 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getOnlyAssignment_0_0()); 
            // InternalSasDsl.g:2687:2: ( rule__DSLRestrictions__OnlyAssignment_0_0 )
            // InternalSasDsl.g:2687:3: rule__DSLRestrictions__OnlyAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__OnlyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getOnlyAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__0__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_0__1"
    // InternalSasDsl.g:2695:1: rule__DSLRestrictions__Group_0__1 : rule__DSLRestrictions__Group_0__1__Impl rule__DSLRestrictions__Group_0__2 ;
    public final void rule__DSLRestrictions__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2699:1: ( rule__DSLRestrictions__Group_0__1__Impl rule__DSLRestrictions__Group_0__2 )
            // InternalSasDsl.g:2700:2: rule__DSLRestrictions__Group_0__1__Impl rule__DSLRestrictions__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__DSLRestrictions__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__1"


    // $ANTLR start "rule__DSLRestrictions__Group_0__1__Impl"
    // InternalSasDsl.g:2707:1: rule__DSLRestrictions__Group_0__1__Impl : ( ( rule__DSLRestrictions__TAssignment_0_1 ) ) ;
    public final void rule__DSLRestrictions__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2711:1: ( ( ( rule__DSLRestrictions__TAssignment_0_1 ) ) )
            // InternalSasDsl.g:2712:1: ( ( rule__DSLRestrictions__TAssignment_0_1 ) )
            {
            // InternalSasDsl.g:2712:1: ( ( rule__DSLRestrictions__TAssignment_0_1 ) )
            // InternalSasDsl.g:2713:2: ( rule__DSLRestrictions__TAssignment_0_1 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTAssignment_0_1()); 
            // InternalSasDsl.g:2714:2: ( rule__DSLRestrictions__TAssignment_0_1 )
            // InternalSasDsl.g:2714:3: rule__DSLRestrictions__TAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__1__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_0__2"
    // InternalSasDsl.g:2722:1: rule__DSLRestrictions__Group_0__2 : rule__DSLRestrictions__Group_0__2__Impl rule__DSLRestrictions__Group_0__3 ;
    public final void rule__DSLRestrictions__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2726:1: ( rule__DSLRestrictions__Group_0__2__Impl rule__DSLRestrictions__Group_0__3 )
            // InternalSasDsl.g:2727:2: rule__DSLRestrictions__Group_0__2__Impl rule__DSLRestrictions__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__DSLRestrictions__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__2"


    // $ANTLR start "rule__DSLRestrictions__Group_0__2__Impl"
    // InternalSasDsl.g:2734:1: rule__DSLRestrictions__Group_0__2__Impl : ( ( rule__DSLRestrictions__CanAssignment_0_2 ) ) ;
    public final void rule__DSLRestrictions__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2738:1: ( ( ( rule__DSLRestrictions__CanAssignment_0_2 ) ) )
            // InternalSasDsl.g:2739:1: ( ( rule__DSLRestrictions__CanAssignment_0_2 ) )
            {
            // InternalSasDsl.g:2739:1: ( ( rule__DSLRestrictions__CanAssignment_0_2 ) )
            // InternalSasDsl.g:2740:2: ( rule__DSLRestrictions__CanAssignment_0_2 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCanAssignment_0_2()); 
            // InternalSasDsl.g:2741:2: ( rule__DSLRestrictions__CanAssignment_0_2 )
            // InternalSasDsl.g:2741:3: rule__DSLRestrictions__CanAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__CanAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getCanAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__2__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_0__3"
    // InternalSasDsl.g:2749:1: rule__DSLRestrictions__Group_0__3 : rule__DSLRestrictions__Group_0__3__Impl rule__DSLRestrictions__Group_0__4 ;
    public final void rule__DSLRestrictions__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2753:1: ( rule__DSLRestrictions__Group_0__3__Impl rule__DSLRestrictions__Group_0__4 )
            // InternalSasDsl.g:2754:2: rule__DSLRestrictions__Group_0__3__Impl rule__DSLRestrictions__Group_0__4
            {
            pushFollow(FOLLOW_11);
            rule__DSLRestrictions__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__3"


    // $ANTLR start "rule__DSLRestrictions__Group_0__3__Impl"
    // InternalSasDsl.g:2761:1: rule__DSLRestrictions__Group_0__3__Impl : ( ( rule__DSLRestrictions__ElementTypeAssignment_0_3 ) ) ;
    public final void rule__DSLRestrictions__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2765:1: ( ( ( rule__DSLRestrictions__ElementTypeAssignment_0_3 ) ) )
            // InternalSasDsl.g:2766:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_0_3 ) )
            {
            // InternalSasDsl.g:2766:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_0_3 ) )
            // InternalSasDsl.g:2767:2: ( rule__DSLRestrictions__ElementTypeAssignment_0_3 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_0_3()); 
            // InternalSasDsl.g:2768:2: ( rule__DSLRestrictions__ElementTypeAssignment_0_3 )
            // InternalSasDsl.g:2768:3: rule__DSLRestrictions__ElementTypeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__ElementTypeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__3__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_0__4"
    // InternalSasDsl.g:2776:1: rule__DSLRestrictions__Group_0__4 : rule__DSLRestrictions__Group_0__4__Impl rule__DSLRestrictions__Group_0__5 ;
    public final void rule__DSLRestrictions__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2780:1: ( rule__DSLRestrictions__Group_0__4__Impl rule__DSLRestrictions__Group_0__5 )
            // InternalSasDsl.g:2781:2: rule__DSLRestrictions__Group_0__4__Impl rule__DSLRestrictions__Group_0__5
            {
            pushFollow(FOLLOW_12);
            rule__DSLRestrictions__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__4"


    // $ANTLR start "rule__DSLRestrictions__Group_0__4__Impl"
    // InternalSasDsl.g:2788:1: rule__DSLRestrictions__Group_0__4__Impl : ( ( rule__DSLRestrictions__TypeAssignment_0_4 ) ) ;
    public final void rule__DSLRestrictions__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2792:1: ( ( ( rule__DSLRestrictions__TypeAssignment_0_4 ) ) )
            // InternalSasDsl.g:2793:1: ( ( rule__DSLRestrictions__TypeAssignment_0_4 ) )
            {
            // InternalSasDsl.g:2793:1: ( ( rule__DSLRestrictions__TypeAssignment_0_4 ) )
            // InternalSasDsl.g:2794:2: ( rule__DSLRestrictions__TypeAssignment_0_4 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_0_4()); 
            // InternalSasDsl.g:2795:2: ( rule__DSLRestrictions__TypeAssignment_0_4 )
            // InternalSasDsl.g:2795:3: rule__DSLRestrictions__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TypeAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__4__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_0__5"
    // InternalSasDsl.g:2803:1: rule__DSLRestrictions__Group_0__5 : rule__DSLRestrictions__Group_0__5__Impl ;
    public final void rule__DSLRestrictions__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2807:1: ( rule__DSLRestrictions__Group_0__5__Impl )
            // InternalSasDsl.g:2808:2: rule__DSLRestrictions__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__5"


    // $ANTLR start "rule__DSLRestrictions__Group_0__5__Impl"
    // InternalSasDsl.g:2814:1: rule__DSLRestrictions__Group_0__5__Impl : ( ';' ) ;
    public final void rule__DSLRestrictions__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2818:1: ( ( ';' ) )
            // InternalSasDsl.g:2819:1: ( ';' )
            {
            // InternalSasDsl.g:2819:1: ( ';' )
            // InternalSasDsl.g:2820:2: ';'
            {
             before(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_0_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_0__5__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_1__0"
    // InternalSasDsl.g:2830:1: rule__DSLRestrictions__Group_1__0 : rule__DSLRestrictions__Group_1__0__Impl rule__DSLRestrictions__Group_1__1 ;
    public final void rule__DSLRestrictions__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2834:1: ( rule__DSLRestrictions__Group_1__0__Impl rule__DSLRestrictions__Group_1__1 )
            // InternalSasDsl.g:2835:2: rule__DSLRestrictions__Group_1__0__Impl rule__DSLRestrictions__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__DSLRestrictions__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__0"


    // $ANTLR start "rule__DSLRestrictions__Group_1__0__Impl"
    // InternalSasDsl.g:2842:1: rule__DSLRestrictions__Group_1__0__Impl : ( ( rule__DSLRestrictions__TAssignment_1_0 ) ) ;
    public final void rule__DSLRestrictions__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2846:1: ( ( ( rule__DSLRestrictions__TAssignment_1_0 ) ) )
            // InternalSasDsl.g:2847:1: ( ( rule__DSLRestrictions__TAssignment_1_0 ) )
            {
            // InternalSasDsl.g:2847:1: ( ( rule__DSLRestrictions__TAssignment_1_0 ) )
            // InternalSasDsl.g:2848:2: ( rule__DSLRestrictions__TAssignment_1_0 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTAssignment_1_0()); 
            // InternalSasDsl.g:2849:2: ( rule__DSLRestrictions__TAssignment_1_0 )
            // InternalSasDsl.g:2849:3: rule__DSLRestrictions__TAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__0__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_1__1"
    // InternalSasDsl.g:2857:1: rule__DSLRestrictions__Group_1__1 : rule__DSLRestrictions__Group_1__1__Impl rule__DSLRestrictions__Group_1__2 ;
    public final void rule__DSLRestrictions__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2861:1: ( rule__DSLRestrictions__Group_1__1__Impl rule__DSLRestrictions__Group_1__2 )
            // InternalSasDsl.g:2862:2: rule__DSLRestrictions__Group_1__1__Impl rule__DSLRestrictions__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__DSLRestrictions__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__1"


    // $ANTLR start "rule__DSLRestrictions__Group_1__1__Impl"
    // InternalSasDsl.g:2869:1: rule__DSLRestrictions__Group_1__1__Impl : ( ( rule__DSLRestrictions__CannotAssignment_1_1 ) ) ;
    public final void rule__DSLRestrictions__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2873:1: ( ( ( rule__DSLRestrictions__CannotAssignment_1_1 ) ) )
            // InternalSasDsl.g:2874:1: ( ( rule__DSLRestrictions__CannotAssignment_1_1 ) )
            {
            // InternalSasDsl.g:2874:1: ( ( rule__DSLRestrictions__CannotAssignment_1_1 ) )
            // InternalSasDsl.g:2875:2: ( rule__DSLRestrictions__CannotAssignment_1_1 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCannotAssignment_1_1()); 
            // InternalSasDsl.g:2876:2: ( rule__DSLRestrictions__CannotAssignment_1_1 )
            // InternalSasDsl.g:2876:3: rule__DSLRestrictions__CannotAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__CannotAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getCannotAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__1__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_1__2"
    // InternalSasDsl.g:2884:1: rule__DSLRestrictions__Group_1__2 : rule__DSLRestrictions__Group_1__2__Impl rule__DSLRestrictions__Group_1__3 ;
    public final void rule__DSLRestrictions__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2888:1: ( rule__DSLRestrictions__Group_1__2__Impl rule__DSLRestrictions__Group_1__3 )
            // InternalSasDsl.g:2889:2: rule__DSLRestrictions__Group_1__2__Impl rule__DSLRestrictions__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__DSLRestrictions__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__2"


    // $ANTLR start "rule__DSLRestrictions__Group_1__2__Impl"
    // InternalSasDsl.g:2896:1: rule__DSLRestrictions__Group_1__2__Impl : ( ( rule__DSLRestrictions__ElementTypeAssignment_1_2 ) ) ;
    public final void rule__DSLRestrictions__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2900:1: ( ( ( rule__DSLRestrictions__ElementTypeAssignment_1_2 ) ) )
            // InternalSasDsl.g:2901:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_1_2 ) )
            {
            // InternalSasDsl.g:2901:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_1_2 ) )
            // InternalSasDsl.g:2902:2: ( rule__DSLRestrictions__ElementTypeAssignment_1_2 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_1_2()); 
            // InternalSasDsl.g:2903:2: ( rule__DSLRestrictions__ElementTypeAssignment_1_2 )
            // InternalSasDsl.g:2903:3: rule__DSLRestrictions__ElementTypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__ElementTypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__2__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_1__3"
    // InternalSasDsl.g:2911:1: rule__DSLRestrictions__Group_1__3 : rule__DSLRestrictions__Group_1__3__Impl rule__DSLRestrictions__Group_1__4 ;
    public final void rule__DSLRestrictions__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2915:1: ( rule__DSLRestrictions__Group_1__3__Impl rule__DSLRestrictions__Group_1__4 )
            // InternalSasDsl.g:2916:2: rule__DSLRestrictions__Group_1__3__Impl rule__DSLRestrictions__Group_1__4
            {
            pushFollow(FOLLOW_12);
            rule__DSLRestrictions__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__3"


    // $ANTLR start "rule__DSLRestrictions__Group_1__3__Impl"
    // InternalSasDsl.g:2923:1: rule__DSLRestrictions__Group_1__3__Impl : ( ( rule__DSLRestrictions__TypeAssignment_1_3 ) ) ;
    public final void rule__DSLRestrictions__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2927:1: ( ( ( rule__DSLRestrictions__TypeAssignment_1_3 ) ) )
            // InternalSasDsl.g:2928:1: ( ( rule__DSLRestrictions__TypeAssignment_1_3 ) )
            {
            // InternalSasDsl.g:2928:1: ( ( rule__DSLRestrictions__TypeAssignment_1_3 ) )
            // InternalSasDsl.g:2929:2: ( rule__DSLRestrictions__TypeAssignment_1_3 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_1_3()); 
            // InternalSasDsl.g:2930:2: ( rule__DSLRestrictions__TypeAssignment_1_3 )
            // InternalSasDsl.g:2930:3: rule__DSLRestrictions__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__3__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_1__4"
    // InternalSasDsl.g:2938:1: rule__DSLRestrictions__Group_1__4 : rule__DSLRestrictions__Group_1__4__Impl ;
    public final void rule__DSLRestrictions__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2942:1: ( rule__DSLRestrictions__Group_1__4__Impl )
            // InternalSasDsl.g:2943:2: rule__DSLRestrictions__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__4"


    // $ANTLR start "rule__DSLRestrictions__Group_1__4__Impl"
    // InternalSasDsl.g:2949:1: rule__DSLRestrictions__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DSLRestrictions__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2953:1: ( ( ';' ) )
            // InternalSasDsl.g:2954:1: ( ';' )
            {
            // InternalSasDsl.g:2954:1: ( ';' )
            // InternalSasDsl.g:2955:2: ';'
            {
             before(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_1_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_1__4__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_2__0"
    // InternalSasDsl.g:2965:1: rule__DSLRestrictions__Group_2__0 : rule__DSLRestrictions__Group_2__0__Impl rule__DSLRestrictions__Group_2__1 ;
    public final void rule__DSLRestrictions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2969:1: ( rule__DSLRestrictions__Group_2__0__Impl rule__DSLRestrictions__Group_2__1 )
            // InternalSasDsl.g:2970:2: rule__DSLRestrictions__Group_2__0__Impl rule__DSLRestrictions__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__DSLRestrictions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__0"


    // $ANTLR start "rule__DSLRestrictions__Group_2__0__Impl"
    // InternalSasDsl.g:2977:1: rule__DSLRestrictions__Group_2__0__Impl : ( ( rule__DSLRestrictions__TAssignment_2_0 ) ) ;
    public final void rule__DSLRestrictions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2981:1: ( ( ( rule__DSLRestrictions__TAssignment_2_0 ) ) )
            // InternalSasDsl.g:2982:1: ( ( rule__DSLRestrictions__TAssignment_2_0 ) )
            {
            // InternalSasDsl.g:2982:1: ( ( rule__DSLRestrictions__TAssignment_2_0 ) )
            // InternalSasDsl.g:2983:2: ( rule__DSLRestrictions__TAssignment_2_0 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTAssignment_2_0()); 
            // InternalSasDsl.g:2984:2: ( rule__DSLRestrictions__TAssignment_2_0 )
            // InternalSasDsl.g:2984:3: rule__DSLRestrictions__TAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__0__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_2__1"
    // InternalSasDsl.g:2992:1: rule__DSLRestrictions__Group_2__1 : rule__DSLRestrictions__Group_2__1__Impl rule__DSLRestrictions__Group_2__2 ;
    public final void rule__DSLRestrictions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:2996:1: ( rule__DSLRestrictions__Group_2__1__Impl rule__DSLRestrictions__Group_2__2 )
            // InternalSasDsl.g:2997:2: rule__DSLRestrictions__Group_2__1__Impl rule__DSLRestrictions__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__DSLRestrictions__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__1"


    // $ANTLR start "rule__DSLRestrictions__Group_2__1__Impl"
    // InternalSasDsl.g:3004:1: rule__DSLRestrictions__Group_2__1__Impl : ( ( rule__DSLRestrictions__CanAssignment_2_1 ) ) ;
    public final void rule__DSLRestrictions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3008:1: ( ( ( rule__DSLRestrictions__CanAssignment_2_1 ) ) )
            // InternalSasDsl.g:3009:1: ( ( rule__DSLRestrictions__CanAssignment_2_1 ) )
            {
            // InternalSasDsl.g:3009:1: ( ( rule__DSLRestrictions__CanAssignment_2_1 ) )
            // InternalSasDsl.g:3010:2: ( rule__DSLRestrictions__CanAssignment_2_1 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCanAssignment_2_1()); 
            // InternalSasDsl.g:3011:2: ( rule__DSLRestrictions__CanAssignment_2_1 )
            // InternalSasDsl.g:3011:3: rule__DSLRestrictions__CanAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__CanAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getCanAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__1__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_2__2"
    // InternalSasDsl.g:3019:1: rule__DSLRestrictions__Group_2__2 : rule__DSLRestrictions__Group_2__2__Impl rule__DSLRestrictions__Group_2__3 ;
    public final void rule__DSLRestrictions__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3023:1: ( rule__DSLRestrictions__Group_2__2__Impl rule__DSLRestrictions__Group_2__3 )
            // InternalSasDsl.g:3024:2: rule__DSLRestrictions__Group_2__2__Impl rule__DSLRestrictions__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__DSLRestrictions__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__2"


    // $ANTLR start "rule__DSLRestrictions__Group_2__2__Impl"
    // InternalSasDsl.g:3031:1: rule__DSLRestrictions__Group_2__2__Impl : ( ( rule__DSLRestrictions__ElementTypeAssignment_2_2 ) ) ;
    public final void rule__DSLRestrictions__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3035:1: ( ( ( rule__DSLRestrictions__ElementTypeAssignment_2_2 ) ) )
            // InternalSasDsl.g:3036:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_2_2 ) )
            {
            // InternalSasDsl.g:3036:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_2_2 ) )
            // InternalSasDsl.g:3037:2: ( rule__DSLRestrictions__ElementTypeAssignment_2_2 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_2_2()); 
            // InternalSasDsl.g:3038:2: ( rule__DSLRestrictions__ElementTypeAssignment_2_2 )
            // InternalSasDsl.g:3038:3: rule__DSLRestrictions__ElementTypeAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__ElementTypeAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__2__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_2__3"
    // InternalSasDsl.g:3046:1: rule__DSLRestrictions__Group_2__3 : rule__DSLRestrictions__Group_2__3__Impl rule__DSLRestrictions__Group_2__4 ;
    public final void rule__DSLRestrictions__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3050:1: ( rule__DSLRestrictions__Group_2__3__Impl rule__DSLRestrictions__Group_2__4 )
            // InternalSasDsl.g:3051:2: rule__DSLRestrictions__Group_2__3__Impl rule__DSLRestrictions__Group_2__4
            {
            pushFollow(FOLLOW_12);
            rule__DSLRestrictions__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__3"


    // $ANTLR start "rule__DSLRestrictions__Group_2__3__Impl"
    // InternalSasDsl.g:3058:1: rule__DSLRestrictions__Group_2__3__Impl : ( ( rule__DSLRestrictions__TypeAssignment_2_3 ) ) ;
    public final void rule__DSLRestrictions__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3062:1: ( ( ( rule__DSLRestrictions__TypeAssignment_2_3 ) ) )
            // InternalSasDsl.g:3063:1: ( ( rule__DSLRestrictions__TypeAssignment_2_3 ) )
            {
            // InternalSasDsl.g:3063:1: ( ( rule__DSLRestrictions__TypeAssignment_2_3 ) )
            // InternalSasDsl.g:3064:2: ( rule__DSLRestrictions__TypeAssignment_2_3 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_2_3()); 
            // InternalSasDsl.g:3065:2: ( rule__DSLRestrictions__TypeAssignment_2_3 )
            // InternalSasDsl.g:3065:3: rule__DSLRestrictions__TypeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TypeAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__3__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_2__4"
    // InternalSasDsl.g:3073:1: rule__DSLRestrictions__Group_2__4 : rule__DSLRestrictions__Group_2__4__Impl ;
    public final void rule__DSLRestrictions__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3077:1: ( rule__DSLRestrictions__Group_2__4__Impl )
            // InternalSasDsl.g:3078:2: rule__DSLRestrictions__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__4"


    // $ANTLR start "rule__DSLRestrictions__Group_2__4__Impl"
    // InternalSasDsl.g:3084:1: rule__DSLRestrictions__Group_2__4__Impl : ( ';' ) ;
    public final void rule__DSLRestrictions__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3088:1: ( ( ';' ) )
            // InternalSasDsl.g:3089:1: ( ';' )
            {
            // InternalSasDsl.g:3089:1: ( ';' )
            // InternalSasDsl.g:3090:2: ';'
            {
             before(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_2_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_2__4__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_3__0"
    // InternalSasDsl.g:3100:1: rule__DSLRestrictions__Group_3__0 : rule__DSLRestrictions__Group_3__0__Impl rule__DSLRestrictions__Group_3__1 ;
    public final void rule__DSLRestrictions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3104:1: ( rule__DSLRestrictions__Group_3__0__Impl rule__DSLRestrictions__Group_3__1 )
            // InternalSasDsl.g:3105:2: rule__DSLRestrictions__Group_3__0__Impl rule__DSLRestrictions__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__DSLRestrictions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__0"


    // $ANTLR start "rule__DSLRestrictions__Group_3__0__Impl"
    // InternalSasDsl.g:3112:1: rule__DSLRestrictions__Group_3__0__Impl : ( ( rule__DSLRestrictions__TAssignment_3_0 ) ) ;
    public final void rule__DSLRestrictions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3116:1: ( ( ( rule__DSLRestrictions__TAssignment_3_0 ) ) )
            // InternalSasDsl.g:3117:1: ( ( rule__DSLRestrictions__TAssignment_3_0 ) )
            {
            // InternalSasDsl.g:3117:1: ( ( rule__DSLRestrictions__TAssignment_3_0 ) )
            // InternalSasDsl.g:3118:2: ( rule__DSLRestrictions__TAssignment_3_0 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTAssignment_3_0()); 
            // InternalSasDsl.g:3119:2: ( rule__DSLRestrictions__TAssignment_3_0 )
            // InternalSasDsl.g:3119:3: rule__DSLRestrictions__TAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__0__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_3__1"
    // InternalSasDsl.g:3127:1: rule__DSLRestrictions__Group_3__1 : rule__DSLRestrictions__Group_3__1__Impl rule__DSLRestrictions__Group_3__2 ;
    public final void rule__DSLRestrictions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3131:1: ( rule__DSLRestrictions__Group_3__1__Impl rule__DSLRestrictions__Group_3__2 )
            // InternalSasDsl.g:3132:2: rule__DSLRestrictions__Group_3__1__Impl rule__DSLRestrictions__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__DSLRestrictions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__1"


    // $ANTLR start "rule__DSLRestrictions__Group_3__1__Impl"
    // InternalSasDsl.g:3139:1: rule__DSLRestrictions__Group_3__1__Impl : ( ( rule__DSLRestrictions__CanAssignment_3_1 ) ) ;
    public final void rule__DSLRestrictions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3143:1: ( ( ( rule__DSLRestrictions__CanAssignment_3_1 ) ) )
            // InternalSasDsl.g:3144:1: ( ( rule__DSLRestrictions__CanAssignment_3_1 ) )
            {
            // InternalSasDsl.g:3144:1: ( ( rule__DSLRestrictions__CanAssignment_3_1 ) )
            // InternalSasDsl.g:3145:2: ( rule__DSLRestrictions__CanAssignment_3_1 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCanAssignment_3_1()); 
            // InternalSasDsl.g:3146:2: ( rule__DSLRestrictions__CanAssignment_3_1 )
            // InternalSasDsl.g:3146:3: rule__DSLRestrictions__CanAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__CanAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getCanAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__1__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_3__2"
    // InternalSasDsl.g:3154:1: rule__DSLRestrictions__Group_3__2 : rule__DSLRestrictions__Group_3__2__Impl rule__DSLRestrictions__Group_3__3 ;
    public final void rule__DSLRestrictions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3158:1: ( rule__DSLRestrictions__Group_3__2__Impl rule__DSLRestrictions__Group_3__3 )
            // InternalSasDsl.g:3159:2: rule__DSLRestrictions__Group_3__2__Impl rule__DSLRestrictions__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__DSLRestrictions__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__2"


    // $ANTLR start "rule__DSLRestrictions__Group_3__2__Impl"
    // InternalSasDsl.g:3166:1: rule__DSLRestrictions__Group_3__2__Impl : ( ( rule__DSLRestrictions__ElementTypeAssignment_3_2 ) ) ;
    public final void rule__DSLRestrictions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3170:1: ( ( ( rule__DSLRestrictions__ElementTypeAssignment_3_2 ) ) )
            // InternalSasDsl.g:3171:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_3_2 ) )
            {
            // InternalSasDsl.g:3171:1: ( ( rule__DSLRestrictions__ElementTypeAssignment_3_2 ) )
            // InternalSasDsl.g:3172:2: ( rule__DSLRestrictions__ElementTypeAssignment_3_2 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_3_2()); 
            // InternalSasDsl.g:3173:2: ( rule__DSLRestrictions__ElementTypeAssignment_3_2 )
            // InternalSasDsl.g:3173:3: rule__DSLRestrictions__ElementTypeAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__ElementTypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__2__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_3__3"
    // InternalSasDsl.g:3181:1: rule__DSLRestrictions__Group_3__3 : rule__DSLRestrictions__Group_3__3__Impl rule__DSLRestrictions__Group_3__4 ;
    public final void rule__DSLRestrictions__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3185:1: ( rule__DSLRestrictions__Group_3__3__Impl rule__DSLRestrictions__Group_3__4 )
            // InternalSasDsl.g:3186:2: rule__DSLRestrictions__Group_3__3__Impl rule__DSLRestrictions__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__DSLRestrictions__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__3"


    // $ANTLR start "rule__DSLRestrictions__Group_3__3__Impl"
    // InternalSasDsl.g:3193:1: rule__DSLRestrictions__Group_3__3__Impl : ( ( rule__DSLRestrictions__Only2Assignment_3_3 ) ) ;
    public final void rule__DSLRestrictions__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3197:1: ( ( ( rule__DSLRestrictions__Only2Assignment_3_3 ) ) )
            // InternalSasDsl.g:3198:1: ( ( rule__DSLRestrictions__Only2Assignment_3_3 ) )
            {
            // InternalSasDsl.g:3198:1: ( ( rule__DSLRestrictions__Only2Assignment_3_3 ) )
            // InternalSasDsl.g:3199:2: ( rule__DSLRestrictions__Only2Assignment_3_3 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getOnly2Assignment_3_3()); 
            // InternalSasDsl.g:3200:2: ( rule__DSLRestrictions__Only2Assignment_3_3 )
            // InternalSasDsl.g:3200:3: rule__DSLRestrictions__Only2Assignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Only2Assignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getOnly2Assignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__3__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_3__4"
    // InternalSasDsl.g:3208:1: rule__DSLRestrictions__Group_3__4 : rule__DSLRestrictions__Group_3__4__Impl rule__DSLRestrictions__Group_3__5 ;
    public final void rule__DSLRestrictions__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3212:1: ( rule__DSLRestrictions__Group_3__4__Impl rule__DSLRestrictions__Group_3__5 )
            // InternalSasDsl.g:3213:2: rule__DSLRestrictions__Group_3__4__Impl rule__DSLRestrictions__Group_3__5
            {
            pushFollow(FOLLOW_12);
            rule__DSLRestrictions__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__4"


    // $ANTLR start "rule__DSLRestrictions__Group_3__4__Impl"
    // InternalSasDsl.g:3220:1: rule__DSLRestrictions__Group_3__4__Impl : ( ( rule__DSLRestrictions__TypeAssignment_3_4 ) ) ;
    public final void rule__DSLRestrictions__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3224:1: ( ( ( rule__DSLRestrictions__TypeAssignment_3_4 ) ) )
            // InternalSasDsl.g:3225:1: ( ( rule__DSLRestrictions__TypeAssignment_3_4 ) )
            {
            // InternalSasDsl.g:3225:1: ( ( rule__DSLRestrictions__TypeAssignment_3_4 ) )
            // InternalSasDsl.g:3226:2: ( rule__DSLRestrictions__TypeAssignment_3_4 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_3_4()); 
            // InternalSasDsl.g:3227:2: ( rule__DSLRestrictions__TypeAssignment_3_4 )
            // InternalSasDsl.g:3227:3: rule__DSLRestrictions__TypeAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TypeAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__4__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_3__5"
    // InternalSasDsl.g:3235:1: rule__DSLRestrictions__Group_3__5 : rule__DSLRestrictions__Group_3__5__Impl ;
    public final void rule__DSLRestrictions__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3239:1: ( rule__DSLRestrictions__Group_3__5__Impl )
            // InternalSasDsl.g:3240:2: rule__DSLRestrictions__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__5"


    // $ANTLR start "rule__DSLRestrictions__Group_3__5__Impl"
    // InternalSasDsl.g:3246:1: rule__DSLRestrictions__Group_3__5__Impl : ( ';' ) ;
    public final void rule__DSLRestrictions__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3250:1: ( ( ';' ) )
            // InternalSasDsl.g:3251:1: ( ';' )
            {
            // InternalSasDsl.g:3251:1: ( ';' )
            // InternalSasDsl.g:3252:2: ';'
            {
             before(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_3_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_3__5__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_4__0"
    // InternalSasDsl.g:3262:1: rule__DSLRestrictions__Group_4__0 : rule__DSLRestrictions__Group_4__0__Impl rule__DSLRestrictions__Group_4__1 ;
    public final void rule__DSLRestrictions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3266:1: ( rule__DSLRestrictions__Group_4__0__Impl rule__DSLRestrictions__Group_4__1 )
            // InternalSasDsl.g:3267:2: rule__DSLRestrictions__Group_4__0__Impl rule__DSLRestrictions__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__DSLRestrictions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__0"


    // $ANTLR start "rule__DSLRestrictions__Group_4__0__Impl"
    // InternalSasDsl.g:3274:1: rule__DSLRestrictions__Group_4__0__Impl : ( ( rule__DSLRestrictions__TAssignment_4_0 ) ) ;
    public final void rule__DSLRestrictions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3278:1: ( ( ( rule__DSLRestrictions__TAssignment_4_0 ) ) )
            // InternalSasDsl.g:3279:1: ( ( rule__DSLRestrictions__TAssignment_4_0 ) )
            {
            // InternalSasDsl.g:3279:1: ( ( rule__DSLRestrictions__TAssignment_4_0 ) )
            // InternalSasDsl.g:3280:2: ( rule__DSLRestrictions__TAssignment_4_0 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTAssignment_4_0()); 
            // InternalSasDsl.g:3281:2: ( rule__DSLRestrictions__TAssignment_4_0 )
            // InternalSasDsl.g:3281:3: rule__DSLRestrictions__TAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__0__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_4__1"
    // InternalSasDsl.g:3289:1: rule__DSLRestrictions__Group_4__1 : rule__DSLRestrictions__Group_4__1__Impl rule__DSLRestrictions__Group_4__2 ;
    public final void rule__DSLRestrictions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3293:1: ( rule__DSLRestrictions__Group_4__1__Impl rule__DSLRestrictions__Group_4__2 )
            // InternalSasDsl.g:3294:2: rule__DSLRestrictions__Group_4__1__Impl rule__DSLRestrictions__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__DSLRestrictions__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__1"


    // $ANTLR start "rule__DSLRestrictions__Group_4__1__Impl"
    // InternalSasDsl.g:3301:1: rule__DSLRestrictions__Group_4__1__Impl : ( ( rule__DSLRestrictions__MustAssignment_4_1 ) ) ;
    public final void rule__DSLRestrictions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3305:1: ( ( ( rule__DSLRestrictions__MustAssignment_4_1 ) ) )
            // InternalSasDsl.g:3306:1: ( ( rule__DSLRestrictions__MustAssignment_4_1 ) )
            {
            // InternalSasDsl.g:3306:1: ( ( rule__DSLRestrictions__MustAssignment_4_1 ) )
            // InternalSasDsl.g:3307:2: ( rule__DSLRestrictions__MustAssignment_4_1 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getMustAssignment_4_1()); 
            // InternalSasDsl.g:3308:2: ( rule__DSLRestrictions__MustAssignment_4_1 )
            // InternalSasDsl.g:3308:3: rule__DSLRestrictions__MustAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__MustAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getMustAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__1__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_4__2"
    // InternalSasDsl.g:3316:1: rule__DSLRestrictions__Group_4__2 : rule__DSLRestrictions__Group_4__2__Impl rule__DSLRestrictions__Group_4__3 ;
    public final void rule__DSLRestrictions__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3320:1: ( rule__DSLRestrictions__Group_4__2__Impl rule__DSLRestrictions__Group_4__3 )
            // InternalSasDsl.g:3321:2: rule__DSLRestrictions__Group_4__2__Impl rule__DSLRestrictions__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__DSLRestrictions__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__2"


    // $ANTLR start "rule__DSLRestrictions__Group_4__2__Impl"
    // InternalSasDsl.g:3328:1: rule__DSLRestrictions__Group_4__2__Impl : ( ( rule__DSLRestrictions__EntityTypeAssignment_4_2 ) ) ;
    public final void rule__DSLRestrictions__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3332:1: ( ( ( rule__DSLRestrictions__EntityTypeAssignment_4_2 ) ) )
            // InternalSasDsl.g:3333:1: ( ( rule__DSLRestrictions__EntityTypeAssignment_4_2 ) )
            {
            // InternalSasDsl.g:3333:1: ( ( rule__DSLRestrictions__EntityTypeAssignment_4_2 ) )
            // InternalSasDsl.g:3334:2: ( rule__DSLRestrictions__EntityTypeAssignment_4_2 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getEntityTypeAssignment_4_2()); 
            // InternalSasDsl.g:3335:2: ( rule__DSLRestrictions__EntityTypeAssignment_4_2 )
            // InternalSasDsl.g:3335:3: rule__DSLRestrictions__EntityTypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__EntityTypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getEntityTypeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__2__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_4__3"
    // InternalSasDsl.g:3343:1: rule__DSLRestrictions__Group_4__3 : rule__DSLRestrictions__Group_4__3__Impl rule__DSLRestrictions__Group_4__4 ;
    public final void rule__DSLRestrictions__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3347:1: ( rule__DSLRestrictions__Group_4__3__Impl rule__DSLRestrictions__Group_4__4 )
            // InternalSasDsl.g:3348:2: rule__DSLRestrictions__Group_4__3__Impl rule__DSLRestrictions__Group_4__4
            {
            pushFollow(FOLLOW_12);
            rule__DSLRestrictions__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__3"


    // $ANTLR start "rule__DSLRestrictions__Group_4__3__Impl"
    // InternalSasDsl.g:3355:1: rule__DSLRestrictions__Group_4__3__Impl : ( ( rule__DSLRestrictions__TypeAssignment_4_3 ) ) ;
    public final void rule__DSLRestrictions__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3359:1: ( ( ( rule__DSLRestrictions__TypeAssignment_4_3 ) ) )
            // InternalSasDsl.g:3360:1: ( ( rule__DSLRestrictions__TypeAssignment_4_3 ) )
            {
            // InternalSasDsl.g:3360:1: ( ( rule__DSLRestrictions__TypeAssignment_4_3 ) )
            // InternalSasDsl.g:3361:2: ( rule__DSLRestrictions__TypeAssignment_4_3 )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_4_3()); 
            // InternalSasDsl.g:3362:2: ( rule__DSLRestrictions__TypeAssignment_4_3 )
            // InternalSasDsl.g:3362:3: rule__DSLRestrictions__TypeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__TypeAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__3__Impl"


    // $ANTLR start "rule__DSLRestrictions__Group_4__4"
    // InternalSasDsl.g:3370:1: rule__DSLRestrictions__Group_4__4 : rule__DSLRestrictions__Group_4__4__Impl ;
    public final void rule__DSLRestrictions__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3374:1: ( rule__DSLRestrictions__Group_4__4__Impl )
            // InternalSasDsl.g:3375:2: rule__DSLRestrictions__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSLRestrictions__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__4"


    // $ANTLR start "rule__DSLRestrictions__Group_4__4__Impl"
    // InternalSasDsl.g:3381:1: rule__DSLRestrictions__Group_4__4__Impl : ( ';' ) ;
    public final void rule__DSLRestrictions__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3385:1: ( ( ';' ) )
            // InternalSasDsl.g:3386:1: ( ';' )
            {
            // InternalSasDsl.g:3386:1: ( ';' )
            // InternalSasDsl.g:3387:2: ';'
            {
             before(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_4_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Group_4__4__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__AbstractionsAssignment_2"
    // InternalSasDsl.g:3397:1: rule__ArchitectureDefinition__AbstractionsAssignment_2 : ( ruleDSLAbstractions ) ;
    public final void rule__ArchitectureDefinition__AbstractionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3401:1: ( ( ruleDSLAbstractions ) )
            // InternalSasDsl.g:3402:2: ( ruleDSLAbstractions )
            {
            // InternalSasDsl.g:3402:2: ( ruleDSLAbstractions )
            // InternalSasDsl.g:3403:3: ruleDSLAbstractions
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsDSLAbstractionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLAbstractions();

            state._fsp--;

             after(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsDSLAbstractionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__AbstractionsAssignment_2"


    // $ANTLR start "rule__ArchitectureDefinition__CompositionsAssignment_5"
    // InternalSasDsl.g:3412:1: rule__ArchitectureDefinition__CompositionsAssignment_5 : ( ruleDSLCompositions ) ;
    public final void rule__ArchitectureDefinition__CompositionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3416:1: ( ( ruleDSLCompositions ) )
            // InternalSasDsl.g:3417:2: ( ruleDSLCompositions )
            {
            // InternalSasDsl.g:3417:2: ( ruleDSLCompositions )
            // InternalSasDsl.g:3418:3: ruleDSLCompositions
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getCompositionsDSLCompositionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLCompositions();

            state._fsp--;

             after(grammarAccess.getArchitectureDefinitionAccess().getCompositionsDSLCompositionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__CompositionsAssignment_5"


    // $ANTLR start "rule__ArchitectureDefinition__DslRestrictionsAssignment_8"
    // InternalSasDsl.g:3427:1: rule__ArchitectureDefinition__DslRestrictionsAssignment_8 : ( ruleDSLRestrictions ) ;
    public final void rule__ArchitectureDefinition__DslRestrictionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3431:1: ( ( ruleDSLRestrictions ) )
            // InternalSasDsl.g:3432:2: ( ruleDSLRestrictions )
            {
            // InternalSasDsl.g:3432:2: ( ruleDSLRestrictions )
            // InternalSasDsl.g:3433:3: ruleDSLRestrictions
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getDslRestrictionsDSLRestrictionsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLRestrictions();

            state._fsp--;

             after(grammarAccess.getArchitectureDefinitionAccess().getDslRestrictionsDSLRestrictionsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__DslRestrictionsAssignment_8"


    // $ANTLR start "rule__DSLManaging__NameAssignment_1"
    // InternalSasDsl.g:3442:1: rule__DSLManaging__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLManaging__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3446:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3447:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3447:2: ( RULE_ID )
            // InternalSasDsl.g:3448:3: RULE_ID
            {
             before(grammarAccess.getDSLManagingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLManagingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaging__NameAssignment_1"


    // $ANTLR start "rule__DSLManaged__NameAssignment_1"
    // InternalSasDsl.g:3457:1: rule__DSLManaged__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLManaged__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3461:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3462:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3462:2: ( RULE_ID )
            // InternalSasDsl.g:3463:3: RULE_ID
            {
             before(grammarAccess.getDSLManagedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLManagedAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLManaged__NameAssignment_1"


    // $ANTLR start "rule__DSLControlLoopManager__NameAssignment_1"
    // InternalSasDsl.g:3472:1: rule__DSLControlLoopManager__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLControlLoopManager__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3476:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3477:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3477:2: ( RULE_ID )
            // InternalSasDsl.g:3478:3: RULE_ID
            {
             before(grammarAccess.getDSLControlLoopManagerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLControlLoopManagerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoopManager__NameAssignment_1"


    // $ANTLR start "rule__DSLControlLoop__NameAssignment_1"
    // InternalSasDsl.g:3487:1: rule__DSLControlLoop__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLControlLoop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3491:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3492:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3492:2: ( RULE_ID )
            // InternalSasDsl.g:3493:3: RULE_ID
            {
             before(grammarAccess.getDSLControlLoopAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLControlLoopAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLControlLoop__NameAssignment_1"


    // $ANTLR start "rule__DSLMonitor__NameAssignment_1"
    // InternalSasDsl.g:3502:1: rule__DSLMonitor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLMonitor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3506:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3507:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3507:2: ( RULE_ID )
            // InternalSasDsl.g:3508:3: RULE_ID
            {
             before(grammarAccess.getDSLMonitorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLMonitorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMonitor__NameAssignment_1"


    // $ANTLR start "rule__DSLAnalyzer__NameAssignment_1"
    // InternalSasDsl.g:3517:1: rule__DSLAnalyzer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLAnalyzer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3521:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3522:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3522:2: ( RULE_ID )
            // InternalSasDsl.g:3523:3: RULE_ID
            {
             before(grammarAccess.getDSLAnalyzerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLAnalyzerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLAnalyzer__NameAssignment_1"


    // $ANTLR start "rule__DSLPlanner__NameAssignment_1"
    // InternalSasDsl.g:3532:1: rule__DSLPlanner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLPlanner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3536:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3537:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3537:2: ( RULE_ID )
            // InternalSasDsl.g:3538:3: RULE_ID
            {
             before(grammarAccess.getDSLPlannerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLPlannerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLPlanner__NameAssignment_1"


    // $ANTLR start "rule__DSLExecutor__NameAssignment_1"
    // InternalSasDsl.g:3547:1: rule__DSLExecutor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLExecutor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3551:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3552:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3552:2: ( RULE_ID )
            // InternalSasDsl.g:3553:3: RULE_ID
            {
             before(grammarAccess.getDSLExecutorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLExecutorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLExecutor__NameAssignment_1"


    // $ANTLR start "rule__DSLKnowledge__NameAssignment_1"
    // InternalSasDsl.g:3562:1: rule__DSLKnowledge__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLKnowledge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3566:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3567:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3567:2: ( RULE_ID )
            // InternalSasDsl.g:3568:3: RULE_ID
            {
             before(grammarAccess.getDSLKnowledgeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLKnowledgeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLKnowledge__NameAssignment_1"


    // $ANTLR start "rule__DSLSensor__NameAssignment_1"
    // InternalSasDsl.g:3577:1: rule__DSLSensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLSensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3581:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3582:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3582:2: ( RULE_ID )
            // InternalSasDsl.g:3583:3: RULE_ID
            {
             before(grammarAccess.getDSLSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLSensorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLSensor__NameAssignment_1"


    // $ANTLR start "rule__DSLEffector__NameAssignment_1"
    // InternalSasDsl.g:3592:1: rule__DSLEffector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLEffector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3596:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3597:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3597:2: ( RULE_ID )
            // InternalSasDsl.g:3598:3: RULE_ID
            {
             before(grammarAccess.getDSLEffectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLEffectorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLEffector__NameAssignment_1"


    // $ANTLR start "rule__DSLProbe__NameAssignment_1"
    // InternalSasDsl.g:3607:1: rule__DSLProbe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLProbe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3611:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3612:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3612:2: ( RULE_ID )
            // InternalSasDsl.g:3613:3: RULE_ID
            {
             before(grammarAccess.getDSLProbeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLProbeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLProbe__NameAssignment_1"


    // $ANTLR start "rule__DSLGauge__NameAssignment_1"
    // InternalSasDsl.g:3622:1: rule__DSLGauge__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLGauge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3626:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3627:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3627:2: ( RULE_ID )
            // InternalSasDsl.g:3628:3: RULE_ID
            {
             before(grammarAccess.getDSLGaugeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLGaugeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLGauge__NameAssignment_1"


    // $ANTLR start "rule__DSLReferenceInput__NameAssignment_1"
    // InternalSasDsl.g:3637:1: rule__DSLReferenceInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLReferenceInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3641:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3642:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3642:2: ( RULE_ID )
            // InternalSasDsl.g:3643:3: RULE_ID
            {
             before(grammarAccess.getDSLReferenceInputAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLReferenceInputAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLReferenceInput__NameAssignment_1"


    // $ANTLR start "rule__DSLMeasuredOutput__NameAssignment_1"
    // InternalSasDsl.g:3652:1: rule__DSLMeasuredOutput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSLMeasuredOutput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3656:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:3657:2: ( RULE_ID )
            {
            // InternalSasDsl.g:3657:2: ( RULE_ID )
            // InternalSasDsl.g:3658:3: RULE_ID
            {
             before(grammarAccess.getDSLMeasuredOutputAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLMeasuredOutputAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMeasuredOutput__NameAssignment_1"


    // $ANTLR start "rule__DSLCompositions__SensorAssignment_0"
    // InternalSasDsl.g:3667:1: rule__DSLCompositions__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DSLCompositions__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3671:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3672:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3672:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3673:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLCompositionsAccess().getSensorDSLAbstractionsCrossReference_0_0()); 
            // InternalSasDsl.g:3674:3: ( RULE_ID )
            // InternalSasDsl.g:3675:4: RULE_ID
            {
             before(grammarAccess.getDSLCompositionsAccess().getSensorDSLAbstractionsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLCompositionsAccess().getSensorDSLAbstractionsIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDSLCompositionsAccess().getSensorDSLAbstractionsCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__SensorAssignment_0"


    // $ANTLR start "rule__DSLCompositions__MustBeInAssignment_1"
    // InternalSasDsl.g:3686:1: rule__DSLCompositions__MustBeInAssignment_1 : ( ruleMustBeIn ) ;
    public final void rule__DSLCompositions__MustBeInAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3690:1: ( ( ruleMustBeIn ) )
            // InternalSasDsl.g:3691:2: ( ruleMustBeIn )
            {
            // InternalSasDsl.g:3691:2: ( ruleMustBeIn )
            // InternalSasDsl.g:3692:3: ruleMustBeIn
            {
             before(grammarAccess.getDSLCompositionsAccess().getMustBeInMustBeInParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMustBeIn();

            state._fsp--;

             after(grammarAccess.getDSLCompositionsAccess().getMustBeInMustBeInParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__MustBeInAssignment_1"


    // $ANTLR start "rule__DSLCompositions__MonitorAssignment_2"
    // InternalSasDsl.g:3701:1: rule__DSLCompositions__MonitorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DSLCompositions__MonitorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3705:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3706:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3706:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3707:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLCompositionsAccess().getMonitorDSLAbstractionsCrossReference_2_0()); 
            // InternalSasDsl.g:3708:3: ( RULE_ID )
            // InternalSasDsl.g:3709:4: RULE_ID
            {
             before(grammarAccess.getDSLCompositionsAccess().getMonitorDSLAbstractionsIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLCompositionsAccess().getMonitorDSLAbstractionsIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDSLCompositionsAccess().getMonitorDSLAbstractionsCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLCompositions__MonitorAssignment_2"


    // $ANTLR start "rule__DSLRestrictions__OnlyAssignment_0_0"
    // InternalSasDsl.g:3720:1: rule__DSLRestrictions__OnlyAssignment_0_0 : ( ruleOnly ) ;
    public final void rule__DSLRestrictions__OnlyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3724:1: ( ( ruleOnly ) )
            // InternalSasDsl.g:3725:2: ( ruleOnly )
            {
            // InternalSasDsl.g:3725:2: ( ruleOnly )
            // InternalSasDsl.g:3726:3: ruleOnly
            {
             before(grammarAccess.getDSLRestrictionsAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getOnlyOnlyParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__OnlyAssignment_0_0"


    // $ANTLR start "rule__DSLRestrictions__TAssignment_0_1"
    // InternalSasDsl.g:3735:1: rule__DSLRestrictions__TAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3739:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3740:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3740:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3741:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_0_1_0()); 
            // InternalSasDsl.g:3742:3: ( RULE_ID )
            // InternalSasDsl.g:3743:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TAssignment_0_1"


    // $ANTLR start "rule__DSLRestrictions__CanAssignment_0_2"
    // InternalSasDsl.g:3754:1: rule__DSLRestrictions__CanAssignment_0_2 : ( ruleCan ) ;
    public final void rule__DSLRestrictions__CanAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3758:1: ( ( ruleCan ) )
            // InternalSasDsl.g:3759:2: ( ruleCan )
            {
            // InternalSasDsl.g:3759:2: ( ruleCan )
            // InternalSasDsl.g:3760:3: ruleCan
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__CanAssignment_0_2"


    // $ANTLR start "rule__DSLRestrictions__ElementTypeAssignment_0_3"
    // InternalSasDsl.g:3769:1: rule__DSLRestrictions__ElementTypeAssignment_0_3 : ( ruleElementType ) ;
    public final void rule__DSLRestrictions__ElementTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3773:1: ( ( ruleElementType ) )
            // InternalSasDsl.g:3774:2: ( ruleElementType )
            {
            // InternalSasDsl.g:3774:2: ( ruleElementType )
            // InternalSasDsl.g:3775:3: ruleElementType
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__ElementTypeAssignment_0_3"


    // $ANTLR start "rule__DSLRestrictions__TypeAssignment_0_4"
    // InternalSasDsl.g:3784:1: rule__DSLRestrictions__TypeAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3788:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3789:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3789:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3790:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_0_4_0()); 
            // InternalSasDsl.g:3791:3: ( RULE_ID )
            // InternalSasDsl.g:3792:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TypeAssignment_0_4"


    // $ANTLR start "rule__DSLRestrictions__TAssignment_1_0"
    // InternalSasDsl.g:3803:1: rule__DSLRestrictions__TAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3807:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3808:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3808:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3809:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_1_0_0()); 
            // InternalSasDsl.g:3810:3: ( RULE_ID )
            // InternalSasDsl.g:3811:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TAssignment_1_0"


    // $ANTLR start "rule__DSLRestrictions__CannotAssignment_1_1"
    // InternalSasDsl.g:3822:1: rule__DSLRestrictions__CannotAssignment_1_1 : ( ruleCannot ) ;
    public final void rule__DSLRestrictions__CannotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3826:1: ( ( ruleCannot ) )
            // InternalSasDsl.g:3827:2: ( ruleCannot )
            {
            // InternalSasDsl.g:3827:2: ( ruleCannot )
            // InternalSasDsl.g:3828:3: ruleCannot
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCannotCannotParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getCannotCannotParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__CannotAssignment_1_1"


    // $ANTLR start "rule__DSLRestrictions__ElementTypeAssignment_1_2"
    // InternalSasDsl.g:3837:1: rule__DSLRestrictions__ElementTypeAssignment_1_2 : ( ruleElementType ) ;
    public final void rule__DSLRestrictions__ElementTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3841:1: ( ( ruleElementType ) )
            // InternalSasDsl.g:3842:2: ( ruleElementType )
            {
            // InternalSasDsl.g:3842:2: ( ruleElementType )
            // InternalSasDsl.g:3843:3: ruleElementType
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__ElementTypeAssignment_1_2"


    // $ANTLR start "rule__DSLRestrictions__TypeAssignment_1_3"
    // InternalSasDsl.g:3852:1: rule__DSLRestrictions__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3856:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3857:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3857:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3858:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_1_3_0()); 
            // InternalSasDsl.g:3859:3: ( RULE_ID )
            // InternalSasDsl.g:3860:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TypeAssignment_1_3"


    // $ANTLR start "rule__DSLRestrictions__TAssignment_2_0"
    // InternalSasDsl.g:3871:1: rule__DSLRestrictions__TAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3875:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3876:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3876:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3877:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_2_0_0()); 
            // InternalSasDsl.g:3878:3: ( RULE_ID )
            // InternalSasDsl.g:3879:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TAssignment_2_0"


    // $ANTLR start "rule__DSLRestrictions__CanAssignment_2_1"
    // InternalSasDsl.g:3890:1: rule__DSLRestrictions__CanAssignment_2_1 : ( ruleCan ) ;
    public final void rule__DSLRestrictions__CanAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3894:1: ( ( ruleCan ) )
            // InternalSasDsl.g:3895:2: ( ruleCan )
            {
            // InternalSasDsl.g:3895:2: ( ruleCan )
            // InternalSasDsl.g:3896:3: ruleCan
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__CanAssignment_2_1"


    // $ANTLR start "rule__DSLRestrictions__ElementTypeAssignment_2_2"
    // InternalSasDsl.g:3905:1: rule__DSLRestrictions__ElementTypeAssignment_2_2 : ( ruleElementType ) ;
    public final void rule__DSLRestrictions__ElementTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3909:1: ( ( ruleElementType ) )
            // InternalSasDsl.g:3910:2: ( ruleElementType )
            {
            // InternalSasDsl.g:3910:2: ( ruleElementType )
            // InternalSasDsl.g:3911:3: ruleElementType
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__ElementTypeAssignment_2_2"


    // $ANTLR start "rule__DSLRestrictions__TypeAssignment_2_3"
    // InternalSasDsl.g:3920:1: rule__DSLRestrictions__TypeAssignment_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3924:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3925:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3925:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3926:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_2_3_0()); 
            // InternalSasDsl.g:3927:3: ( RULE_ID )
            // InternalSasDsl.g:3928:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_2_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_2_3_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TypeAssignment_2_3"


    // $ANTLR start "rule__DSLRestrictions__TAssignment_3_0"
    // InternalSasDsl.g:3939:1: rule__DSLRestrictions__TAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3943:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:3944:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:3944:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:3945:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_3_0_0()); 
            // InternalSasDsl.g:3946:3: ( RULE_ID )
            // InternalSasDsl.g:3947:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TAssignment_3_0"


    // $ANTLR start "rule__DSLRestrictions__CanAssignment_3_1"
    // InternalSasDsl.g:3958:1: rule__DSLRestrictions__CanAssignment_3_1 : ( ruleCan ) ;
    public final void rule__DSLRestrictions__CanAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3962:1: ( ( ruleCan ) )
            // InternalSasDsl.g:3963:2: ( ruleCan )
            {
            // InternalSasDsl.g:3963:2: ( ruleCan )
            // InternalSasDsl.g:3964:3: ruleCan
            {
             before(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__CanAssignment_3_1"


    // $ANTLR start "rule__DSLRestrictions__ElementTypeAssignment_3_2"
    // InternalSasDsl.g:3973:1: rule__DSLRestrictions__ElementTypeAssignment_3_2 : ( ruleElementType ) ;
    public final void rule__DSLRestrictions__ElementTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3977:1: ( ( ruleElementType ) )
            // InternalSasDsl.g:3978:2: ( ruleElementType )
            {
            // InternalSasDsl.g:3978:2: ( ruleElementType )
            // InternalSasDsl.g:3979:3: ruleElementType
            {
             before(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__ElementTypeAssignment_3_2"


    // $ANTLR start "rule__DSLRestrictions__Only2Assignment_3_3"
    // InternalSasDsl.g:3988:1: rule__DSLRestrictions__Only2Assignment_3_3 : ( ruleOnly2 ) ;
    public final void rule__DSLRestrictions__Only2Assignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:3992:1: ( ( ruleOnly2 ) )
            // InternalSasDsl.g:3993:2: ( ruleOnly2 )
            {
            // InternalSasDsl.g:3993:2: ( ruleOnly2 )
            // InternalSasDsl.g:3994:3: ruleOnly2
            {
             before(grammarAccess.getDSLRestrictionsAccess().getOnly2Only2ParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getOnly2Only2ParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__Only2Assignment_3_3"


    // $ANTLR start "rule__DSLRestrictions__TypeAssignment_3_4"
    // InternalSasDsl.g:4003:1: rule__DSLRestrictions__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4007:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:4008:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:4008:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:4009:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_3_4_0()); 
            // InternalSasDsl.g:4010:3: ( RULE_ID )
            // InternalSasDsl.g:4011:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_3_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_3_4_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TypeAssignment_3_4"


    // $ANTLR start "rule__DSLRestrictions__TAssignment_4_0"
    // InternalSasDsl.g:4022:1: rule__DSLRestrictions__TAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4026:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:4027:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:4027:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:4028:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_4_0_0()); 
            // InternalSasDsl.g:4029:3: ( RULE_ID )
            // InternalSasDsl.g:4030:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TAssignment_4_0"


    // $ANTLR start "rule__DSLRestrictions__MustAssignment_4_1"
    // InternalSasDsl.g:4041:1: rule__DSLRestrictions__MustAssignment_4_1 : ( ruleMust ) ;
    public final void rule__DSLRestrictions__MustAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4045:1: ( ( ruleMust ) )
            // InternalSasDsl.g:4046:2: ( ruleMust )
            {
            // InternalSasDsl.g:4046:2: ( ruleMust )
            // InternalSasDsl.g:4047:3: ruleMust
            {
             before(grammarAccess.getDSLRestrictionsAccess().getMustMustParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getMustMustParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__MustAssignment_4_1"


    // $ANTLR start "rule__DSLRestrictions__EntityTypeAssignment_4_2"
    // InternalSasDsl.g:4056:1: rule__DSLRestrictions__EntityTypeAssignment_4_2 : ( ruleEntityType ) ;
    public final void rule__DSLRestrictions__EntityTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4060:1: ( ( ruleEntityType ) )
            // InternalSasDsl.g:4061:2: ( ruleEntityType )
            {
            // InternalSasDsl.g:4061:2: ( ruleEntityType )
            // InternalSasDsl.g:4062:3: ruleEntityType
            {
             before(grammarAccess.getDSLRestrictionsAccess().getEntityTypeEntityTypeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getDSLRestrictionsAccess().getEntityTypeEntityTypeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__EntityTypeAssignment_4_2"


    // $ANTLR start "rule__DSLRestrictions__TypeAssignment_4_3"
    // InternalSasDsl.g:4071:1: rule__DSLRestrictions__TypeAssignment_4_3 : ( ( RULE_ID ) ) ;
    public final void rule__DSLRestrictions__TypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4075:1: ( ( ( RULE_ID ) ) )
            // InternalSasDsl.g:4076:2: ( ( RULE_ID ) )
            {
            // InternalSasDsl.g:4076:2: ( ( RULE_ID ) )
            // InternalSasDsl.g:4077:3: ( RULE_ID )
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_4_3_0()); 
            // InternalSasDsl.g:4078:3: ( RULE_ID )
            // InternalSasDsl.g:4079:4: RULE_ID
            {
             before(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_4_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsIDTerminalRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLRestrictions__TypeAssignment_4_3"


    // $ANTLR start "rule__MustBeIn__MustBeInAssignment"
    // InternalSasDsl.g:4090:1: rule__MustBeIn__MustBeInAssignment : ( ( 'must-be-in' ) ) ;
    public final void rule__MustBeIn__MustBeInAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4094:1: ( ( ( 'must-be-in' ) ) )
            // InternalSasDsl.g:4095:2: ( ( 'must-be-in' ) )
            {
            // InternalSasDsl.g:4095:2: ( ( 'must-be-in' ) )
            // InternalSasDsl.g:4096:3: ( 'must-be-in' )
            {
             before(grammarAccess.getMustBeInAccess().getMustBeInMustBeInKeyword_0()); 
            // InternalSasDsl.g:4097:3: ( 'must-be-in' )
            // InternalSasDsl.g:4098:4: 'must-be-in'
            {
             before(grammarAccess.getMustBeInAccess().getMustBeInMustBeInKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMustBeInAccess().getMustBeInMustBeInKeyword_0()); 

            }

             after(grammarAccess.getMustBeInAccess().getMustBeInMustBeInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MustBeIn__MustBeInAssignment"


    // $ANTLR start "rule__Only__OnlyAssignment"
    // InternalSasDsl.g:4109:1: rule__Only__OnlyAssignment : ( ( 'only' ) ) ;
    public final void rule__Only__OnlyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4113:1: ( ( ( 'only' ) ) )
            // InternalSasDsl.g:4114:2: ( ( 'only' ) )
            {
            // InternalSasDsl.g:4114:2: ( ( 'only' ) )
            // InternalSasDsl.g:4115:3: ( 'only' )
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            // InternalSasDsl.g:4116:3: ( 'only' )
            // InternalSasDsl.g:4117:4: 'only'
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 

            }

             after(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Only__OnlyAssignment"


    // $ANTLR start "rule__Can__CanAssignment"
    // InternalSasDsl.g:4128:1: rule__Can__CanAssignment : ( ( 'can-' ) ) ;
    public final void rule__Can__CanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4132:1: ( ( ( 'can-' ) ) )
            // InternalSasDsl.g:4133:2: ( ( 'can-' ) )
            {
            // InternalSasDsl.g:4133:2: ( ( 'can-' ) )
            // InternalSasDsl.g:4134:3: ( 'can-' )
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            // InternalSasDsl.g:4135:3: ( 'can-' )
            // InternalSasDsl.g:4136:4: 'can-'
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCanAccess().getCanCanKeyword_0()); 

            }

             after(grammarAccess.getCanAccess().getCanCanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Can__CanAssignment"


    // $ANTLR start "rule__Cannot__CannotAssignment"
    // InternalSasDsl.g:4147:1: rule__Cannot__CannotAssignment : ( ( 'cannot-' ) ) ;
    public final void rule__Cannot__CannotAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4151:1: ( ( ( 'cannot-' ) ) )
            // InternalSasDsl.g:4152:2: ( ( 'cannot-' ) )
            {
            // InternalSasDsl.g:4152:2: ( ( 'cannot-' ) )
            // InternalSasDsl.g:4153:3: ( 'cannot-' )
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            // InternalSasDsl.g:4154:3: ( 'cannot-' )
            // InternalSasDsl.g:4155:4: 'cannot-'
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 

            }

             after(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cannot__CannotAssignment"


    // $ANTLR start "rule__Only2__Only2Assignment"
    // InternalSasDsl.g:4166:1: rule__Only2__Only2Assignment : ( ( '-only' ) ) ;
    public final void rule__Only2__Only2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4170:1: ( ( ( '-only' ) ) )
            // InternalSasDsl.g:4171:2: ( ( '-only' ) )
            {
            // InternalSasDsl.g:4171:2: ( ( '-only' ) )
            // InternalSasDsl.g:4172:3: ( '-only' )
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            // InternalSasDsl.g:4173:3: ( '-only' )
            // InternalSasDsl.g:4174:4: '-only'
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 

            }

             after(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Only2__Only2Assignment"


    // $ANTLR start "rule__Must__MustAssignment"
    // InternalSasDsl.g:4185:1: rule__Must__MustAssignment : ( ( 'must-' ) ) ;
    public final void rule__Must__MustAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4189:1: ( ( ( 'must-' ) ) )
            // InternalSasDsl.g:4190:2: ( ( 'must-' ) )
            {
            // InternalSasDsl.g:4190:2: ( ( 'must-' ) )
            // InternalSasDsl.g:4191:3: ( 'must-' )
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            // InternalSasDsl.g:4192:3: ( 'must-' )
            // InternalSasDsl.g:4193:4: 'must-'
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMustAccess().getMustMustKeyword_0()); 

            }

             after(grammarAccess.getMustAccess().getMustMustKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Must__MustAssignment"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // InternalSasDsl.g:4204:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4208:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // InternalSasDsl.g:4209:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // InternalSasDsl.g:4209:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // InternalSasDsl.g:4210:3: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // InternalSasDsl.g:4211:3: ( rule__BasicType__TypeNameAlternatives_0 )
            // InternalSasDsl.g:4211:4: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__EntityType__EntityAssignment"
    // InternalSasDsl.g:4219:1: rule__EntityType__EntityAssignment : ( ( rule__EntityType__EntityAlternatives_0 ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:4223:1: ( ( ( rule__EntityType__EntityAlternatives_0 ) ) )
            // InternalSasDsl.g:4224:2: ( ( rule__EntityType__EntityAlternatives_0 ) )
            {
            // InternalSasDsl.g:4224:2: ( ( rule__EntityType__EntityAlternatives_0 ) )
            // InternalSasDsl.g:4225:3: ( rule__EntityType__EntityAlternatives_0 )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 
            // InternalSasDsl.g:4226:3: ( rule__EntityType__EntityAlternatives_0 )
            // InternalSasDsl.g:4226:4: rule__EntityType__EntityAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__EntityAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__EntityAssignment"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\57\1\uffff\1\16\1\uffff\12\4\2\uffff";
    static final String dfa_3s = "\1\56\1\uffff\1\62\1\uffff\1\27\1\uffff\12\61\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\5\12\uffff\1\3\1\4";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\51\uffff\1\1",
            "",
            "\1\4\1\3\1\uffff\1\5",
            "",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "\1\20\54\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "903:1: rule__DSLRestrictions__Alternatives : ( ( ( rule__DSLRestrictions__Group_0__0 ) ) | ( ( rule__DSLRestrictions__Group_1__0 ) ) | ( ( rule__DSLRestrictions__Group_2__0 ) ) | ( ( rule__DSLRestrictions__Group_3__0 ) ) | ( ( rule__DSLRestrictions__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00001FFED0000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001FFED0000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000FFC000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});

}