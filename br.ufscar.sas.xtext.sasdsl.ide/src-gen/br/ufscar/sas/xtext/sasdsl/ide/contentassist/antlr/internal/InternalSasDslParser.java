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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Monitor'", "'Managing'", "'Managed'", "'Abstractions'", "'{'", "'}'", "';'", "','", "'Compositions'", "'Restrictions'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalSasDsl.g:62:1: ruleArchitectureDefinition : ( ( rule__ArchitectureDefinition__SectionAssignment )* ) ;
    public final void ruleArchitectureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:66:2: ( ( ( rule__ArchitectureDefinition__SectionAssignment )* ) )
            // InternalSasDsl.g:67:2: ( ( rule__ArchitectureDefinition__SectionAssignment )* )
            {
            // InternalSasDsl.g:67:2: ( ( rule__ArchitectureDefinition__SectionAssignment )* )
            // InternalSasDsl.g:68:3: ( rule__ArchitectureDefinition__SectionAssignment )*
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getSectionAssignment()); 
            // InternalSasDsl.g:69:3: ( rule__ArchitectureDefinition__SectionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSasDsl.g:69:4: rule__ArchitectureDefinition__SectionAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ArchitectureDefinition__SectionAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getArchitectureDefinitionAccess().getSectionAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSections"
    // InternalSasDsl.g:78:1: entryRuleSections : ruleSections EOF ;
    public final void entryRuleSections() throws RecognitionException {
        try {
            // InternalSasDsl.g:79:1: ( ruleSections EOF )
            // InternalSasDsl.g:80:1: ruleSections EOF
            {
             before(grammarAccess.getSectionsRule()); 
            pushFollow(FOLLOW_1);
            ruleSections();

            state._fsp--;

             after(grammarAccess.getSectionsRule()); 
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
    // $ANTLR end "entryRuleSections"


    // $ANTLR start "ruleSections"
    // InternalSasDsl.g:87:1: ruleSections : ( ( rule__Sections__Group__0 ) ) ;
    public final void ruleSections() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:91:2: ( ( ( rule__Sections__Group__0 ) ) )
            // InternalSasDsl.g:92:2: ( ( rule__Sections__Group__0 ) )
            {
            // InternalSasDsl.g:92:2: ( ( rule__Sections__Group__0 ) )
            // InternalSasDsl.g:93:3: ( rule__Sections__Group__0 )
            {
             before(grammarAccess.getSectionsAccess().getGroup()); 
            // InternalSasDsl.g:94:3: ( rule__Sections__Group__0 )
            // InternalSasDsl.g:94:4: rule__Sections__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sections__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSections"


    // $ANTLR start "entryRuleAbstractions"
    // InternalSasDsl.g:103:1: entryRuleAbstractions : ruleAbstractions EOF ;
    public final void entryRuleAbstractions() throws RecognitionException {
        try {
            // InternalSasDsl.g:104:1: ( ruleAbstractions EOF )
            // InternalSasDsl.g:105:1: ruleAbstractions EOF
            {
             before(grammarAccess.getAbstractionsRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractions();

            state._fsp--;

             after(grammarAccess.getAbstractionsRule()); 
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
    // $ANTLR end "entryRuleAbstractions"


    // $ANTLR start "ruleAbstractions"
    // InternalSasDsl.g:112:1: ruleAbstractions : ( ( rule__Abstractions__Group__0 ) ) ;
    public final void ruleAbstractions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:116:2: ( ( ( rule__Abstractions__Group__0 ) ) )
            // InternalSasDsl.g:117:2: ( ( rule__Abstractions__Group__0 ) )
            {
            // InternalSasDsl.g:117:2: ( ( rule__Abstractions__Group__0 ) )
            // InternalSasDsl.g:118:3: ( rule__Abstractions__Group__0 )
            {
             before(grammarAccess.getAbstractionsAccess().getGroup()); 
            // InternalSasDsl.g:119:3: ( rule__Abstractions__Group__0 )
            // InternalSasDsl.g:119:4: rule__Abstractions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Abstractions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractions"


    // $ANTLR start "entryRuleCompositions"
    // InternalSasDsl.g:128:1: entryRuleCompositions : ruleCompositions EOF ;
    public final void entryRuleCompositions() throws RecognitionException {
        try {
            // InternalSasDsl.g:129:1: ( ruleCompositions EOF )
            // InternalSasDsl.g:130:1: ruleCompositions EOF
            {
             before(grammarAccess.getCompositionsRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositions();

            state._fsp--;

             after(grammarAccess.getCompositionsRule()); 
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
    // $ANTLR end "entryRuleCompositions"


    // $ANTLR start "ruleCompositions"
    // InternalSasDsl.g:137:1: ruleCompositions : ( ( rule__Compositions__Group__0 ) ) ;
    public final void ruleCompositions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:141:2: ( ( ( rule__Compositions__Group__0 ) ) )
            // InternalSasDsl.g:142:2: ( ( rule__Compositions__Group__0 ) )
            {
            // InternalSasDsl.g:142:2: ( ( rule__Compositions__Group__0 ) )
            // InternalSasDsl.g:143:3: ( rule__Compositions__Group__0 )
            {
             before(grammarAccess.getCompositionsAccess().getGroup()); 
            // InternalSasDsl.g:144:3: ( rule__Compositions__Group__0 )
            // InternalSasDsl.g:144:4: rule__Compositions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compositions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositions"


    // $ANTLR start "entryRuleRestrictions"
    // InternalSasDsl.g:153:1: entryRuleRestrictions : ruleRestrictions EOF ;
    public final void entryRuleRestrictions() throws RecognitionException {
        try {
            // InternalSasDsl.g:154:1: ( ruleRestrictions EOF )
            // InternalSasDsl.g:155:1: ruleRestrictions EOF
            {
             before(grammarAccess.getRestrictionsRule()); 
            pushFollow(FOLLOW_1);
            ruleRestrictions();

            state._fsp--;

             after(grammarAccess.getRestrictionsRule()); 
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
    // $ANTLR end "entryRuleRestrictions"


    // $ANTLR start "ruleRestrictions"
    // InternalSasDsl.g:162:1: ruleRestrictions : ( ( rule__Restrictions__Group__0 ) ) ;
    public final void ruleRestrictions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:166:2: ( ( ( rule__Restrictions__Group__0 ) ) )
            // InternalSasDsl.g:167:2: ( ( rule__Restrictions__Group__0 ) )
            {
            // InternalSasDsl.g:167:2: ( ( rule__Restrictions__Group__0 ) )
            // InternalSasDsl.g:168:3: ( rule__Restrictions__Group__0 )
            {
             before(grammarAccess.getRestrictionsAccess().getGroup()); 
            // InternalSasDsl.g:169:3: ( rule__Restrictions__Group__0 )
            // InternalSasDsl.g:169:4: rule__Restrictions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Restrictions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictions"


    // $ANTLR start "entryRuleAbstraction"
    // InternalSasDsl.g:178:1: entryRuleAbstraction : ruleAbstraction EOF ;
    public final void entryRuleAbstraction() throws RecognitionException {
        try {
            // InternalSasDsl.g:179:1: ( ruleAbstraction EOF )
            // InternalSasDsl.g:180:1: ruleAbstraction EOF
            {
             before(grammarAccess.getAbstractionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstraction();

            state._fsp--;

             after(grammarAccess.getAbstractionRule()); 
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
    // $ANTLR end "entryRuleAbstraction"


    // $ANTLR start "ruleAbstraction"
    // InternalSasDsl.g:187:1: ruleAbstraction : ( ( rule__Abstraction__Alternatives ) ) ;
    public final void ruleAbstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:191:2: ( ( ( rule__Abstraction__Alternatives ) ) )
            // InternalSasDsl.g:192:2: ( ( rule__Abstraction__Alternatives ) )
            {
            // InternalSasDsl.g:192:2: ( ( rule__Abstraction__Alternatives ) )
            // InternalSasDsl.g:193:3: ( rule__Abstraction__Alternatives )
            {
             before(grammarAccess.getAbstractionAccess().getAlternatives()); 
            // InternalSasDsl.g:194:3: ( rule__Abstraction__Alternatives )
            // InternalSasDsl.g:194:4: rule__Abstraction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Abstraction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstraction"


    // $ANTLR start "rule__Abstraction__Alternatives"
    // InternalSasDsl.g:202:1: rule__Abstraction__Alternatives : ( ( 'Monitor' ) | ( 'Managing' ) | ( 'Managed' ) );
    public final void rule__Abstraction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:206:1: ( ( 'Monitor' ) | ( 'Managing' ) | ( 'Managed' ) )
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
                    // InternalSasDsl.g:207:2: ( 'Monitor' )
                    {
                    // InternalSasDsl.g:207:2: ( 'Monitor' )
                    // InternalSasDsl.g:208:3: 'Monitor'
                    {
                     before(grammarAccess.getAbstractionAccess().getMonitorKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAbstractionAccess().getMonitorKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:213:2: ( 'Managing' )
                    {
                    // InternalSasDsl.g:213:2: ( 'Managing' )
                    // InternalSasDsl.g:214:3: 'Managing'
                    {
                     before(grammarAccess.getAbstractionAccess().getManagingKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAbstractionAccess().getManagingKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:219:2: ( 'Managed' )
                    {
                    // InternalSasDsl.g:219:2: ( 'Managed' )
                    // InternalSasDsl.g:220:3: 'Managed'
                    {
                     before(grammarAccess.getAbstractionAccess().getManagedKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAbstractionAccess().getManagedKeyword_2()); 

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
    // $ANTLR end "rule__Abstraction__Alternatives"


    // $ANTLR start "rule__Sections__Group__0"
    // InternalSasDsl.g:229:1: rule__Sections__Group__0 : rule__Sections__Group__0__Impl rule__Sections__Group__1 ;
    public final void rule__Sections__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:233:1: ( rule__Sections__Group__0__Impl rule__Sections__Group__1 )
            // InternalSasDsl.g:234:2: rule__Sections__Group__0__Impl rule__Sections__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sections__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sections__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__0"


    // $ANTLR start "rule__Sections__Group__0__Impl"
    // InternalSasDsl.g:241:1: rule__Sections__Group__0__Impl : ( ( rule__Sections__AbstractionsAssignment_0 ) ) ;
    public final void rule__Sections__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:245:1: ( ( ( rule__Sections__AbstractionsAssignment_0 ) ) )
            // InternalSasDsl.g:246:1: ( ( rule__Sections__AbstractionsAssignment_0 ) )
            {
            // InternalSasDsl.g:246:1: ( ( rule__Sections__AbstractionsAssignment_0 ) )
            // InternalSasDsl.g:247:2: ( rule__Sections__AbstractionsAssignment_0 )
            {
             before(grammarAccess.getSectionsAccess().getAbstractionsAssignment_0()); 
            // InternalSasDsl.g:248:2: ( rule__Sections__AbstractionsAssignment_0 )
            // InternalSasDsl.g:248:3: rule__Sections__AbstractionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sections__AbstractionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSectionsAccess().getAbstractionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__0__Impl"


    // $ANTLR start "rule__Sections__Group__1"
    // InternalSasDsl.g:256:1: rule__Sections__Group__1 : rule__Sections__Group__1__Impl rule__Sections__Group__2 ;
    public final void rule__Sections__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:260:1: ( rule__Sections__Group__1__Impl rule__Sections__Group__2 )
            // InternalSasDsl.g:261:2: rule__Sections__Group__1__Impl rule__Sections__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Sections__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sections__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__1"


    // $ANTLR start "rule__Sections__Group__1__Impl"
    // InternalSasDsl.g:268:1: rule__Sections__Group__1__Impl : ( ( rule__Sections__CompositionsAssignment_1 ) ) ;
    public final void rule__Sections__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:272:1: ( ( ( rule__Sections__CompositionsAssignment_1 ) ) )
            // InternalSasDsl.g:273:1: ( ( rule__Sections__CompositionsAssignment_1 ) )
            {
            // InternalSasDsl.g:273:1: ( ( rule__Sections__CompositionsAssignment_1 ) )
            // InternalSasDsl.g:274:2: ( rule__Sections__CompositionsAssignment_1 )
            {
             before(grammarAccess.getSectionsAccess().getCompositionsAssignment_1()); 
            // InternalSasDsl.g:275:2: ( rule__Sections__CompositionsAssignment_1 )
            // InternalSasDsl.g:275:3: rule__Sections__CompositionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sections__CompositionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionsAccess().getCompositionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__1__Impl"


    // $ANTLR start "rule__Sections__Group__2"
    // InternalSasDsl.g:283:1: rule__Sections__Group__2 : rule__Sections__Group__2__Impl ;
    public final void rule__Sections__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:287:1: ( rule__Sections__Group__2__Impl )
            // InternalSasDsl.g:288:2: rule__Sections__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sections__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__2"


    // $ANTLR start "rule__Sections__Group__2__Impl"
    // InternalSasDsl.g:294:1: rule__Sections__Group__2__Impl : ( ( rule__Sections__RestrictionsAssignment_2 ) ) ;
    public final void rule__Sections__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:298:1: ( ( ( rule__Sections__RestrictionsAssignment_2 ) ) )
            // InternalSasDsl.g:299:1: ( ( rule__Sections__RestrictionsAssignment_2 ) )
            {
            // InternalSasDsl.g:299:1: ( ( rule__Sections__RestrictionsAssignment_2 ) )
            // InternalSasDsl.g:300:2: ( rule__Sections__RestrictionsAssignment_2 )
            {
             before(grammarAccess.getSectionsAccess().getRestrictionsAssignment_2()); 
            // InternalSasDsl.g:301:2: ( rule__Sections__RestrictionsAssignment_2 )
            // InternalSasDsl.g:301:3: rule__Sections__RestrictionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sections__RestrictionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionsAccess().getRestrictionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__Group__2__Impl"


    // $ANTLR start "rule__Abstractions__Group__0"
    // InternalSasDsl.g:310:1: rule__Abstractions__Group__0 : rule__Abstractions__Group__0__Impl rule__Abstractions__Group__1 ;
    public final void rule__Abstractions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:314:1: ( rule__Abstractions__Group__0__Impl rule__Abstractions__Group__1 )
            // InternalSasDsl.g:315:2: rule__Abstractions__Group__0__Impl rule__Abstractions__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Abstractions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abstractions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__0"


    // $ANTLR start "rule__Abstractions__Group__0__Impl"
    // InternalSasDsl.g:322:1: rule__Abstractions__Group__0__Impl : ( 'Abstractions' ) ;
    public final void rule__Abstractions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:326:1: ( ( 'Abstractions' ) )
            // InternalSasDsl.g:327:1: ( 'Abstractions' )
            {
            // InternalSasDsl.g:327:1: ( 'Abstractions' )
            // InternalSasDsl.g:328:2: 'Abstractions'
            {
             before(grammarAccess.getAbstractionsAccess().getAbstractionsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAbstractionsAccess().getAbstractionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__0__Impl"


    // $ANTLR start "rule__Abstractions__Group__1"
    // InternalSasDsl.g:337:1: rule__Abstractions__Group__1 : rule__Abstractions__Group__1__Impl rule__Abstractions__Group__2 ;
    public final void rule__Abstractions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:341:1: ( rule__Abstractions__Group__1__Impl rule__Abstractions__Group__2 )
            // InternalSasDsl.g:342:2: rule__Abstractions__Group__1__Impl rule__Abstractions__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Abstractions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abstractions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__1"


    // $ANTLR start "rule__Abstractions__Group__1__Impl"
    // InternalSasDsl.g:349:1: rule__Abstractions__Group__1__Impl : ( '{' ) ;
    public final void rule__Abstractions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:353:1: ( ( '{' ) )
            // InternalSasDsl.g:354:1: ( '{' )
            {
            // InternalSasDsl.g:354:1: ( '{' )
            // InternalSasDsl.g:355:2: '{'
            {
             before(grammarAccess.getAbstractionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAbstractionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__1__Impl"


    // $ANTLR start "rule__Abstractions__Group__2"
    // InternalSasDsl.g:364:1: rule__Abstractions__Group__2 : rule__Abstractions__Group__2__Impl rule__Abstractions__Group__3 ;
    public final void rule__Abstractions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:368:1: ( rule__Abstractions__Group__2__Impl rule__Abstractions__Group__3 )
            // InternalSasDsl.g:369:2: rule__Abstractions__Group__2__Impl rule__Abstractions__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Abstractions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abstractions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__2"


    // $ANTLR start "rule__Abstractions__Group__2__Impl"
    // InternalSasDsl.g:376:1: rule__Abstractions__Group__2__Impl : ( ruleAbstraction ) ;
    public final void rule__Abstractions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:380:1: ( ( ruleAbstraction ) )
            // InternalSasDsl.g:381:1: ( ruleAbstraction )
            {
            // InternalSasDsl.g:381:1: ( ruleAbstraction )
            // InternalSasDsl.g:382:2: ruleAbstraction
            {
             before(grammarAccess.getAbstractionsAccess().getAbstractionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAbstraction();

            state._fsp--;

             after(grammarAccess.getAbstractionsAccess().getAbstractionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__2__Impl"


    // $ANTLR start "rule__Abstractions__Group__3"
    // InternalSasDsl.g:391:1: rule__Abstractions__Group__3 : rule__Abstractions__Group__3__Impl rule__Abstractions__Group__4 ;
    public final void rule__Abstractions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:395:1: ( rule__Abstractions__Group__3__Impl rule__Abstractions__Group__4 )
            // InternalSasDsl.g:396:2: rule__Abstractions__Group__3__Impl rule__Abstractions__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Abstractions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abstractions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__3"


    // $ANTLR start "rule__Abstractions__Group__3__Impl"
    // InternalSasDsl.g:403:1: rule__Abstractions__Group__3__Impl : ( ( ( rule__Abstractions__Group_3__0 ) ) ( ( rule__Abstractions__Group_3__0 )* ) ) ;
    public final void rule__Abstractions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:407:1: ( ( ( ( rule__Abstractions__Group_3__0 ) ) ( ( rule__Abstractions__Group_3__0 )* ) ) )
            // InternalSasDsl.g:408:1: ( ( ( rule__Abstractions__Group_3__0 ) ) ( ( rule__Abstractions__Group_3__0 )* ) )
            {
            // InternalSasDsl.g:408:1: ( ( ( rule__Abstractions__Group_3__0 ) ) ( ( rule__Abstractions__Group_3__0 )* ) )
            // InternalSasDsl.g:409:2: ( ( rule__Abstractions__Group_3__0 ) ) ( ( rule__Abstractions__Group_3__0 )* )
            {
            // InternalSasDsl.g:409:2: ( ( rule__Abstractions__Group_3__0 ) )
            // InternalSasDsl.g:410:3: ( rule__Abstractions__Group_3__0 )
            {
             before(grammarAccess.getAbstractionsAccess().getGroup_3()); 
            // InternalSasDsl.g:411:3: ( rule__Abstractions__Group_3__0 )
            // InternalSasDsl.g:411:4: rule__Abstractions__Group_3__0
            {
            pushFollow(FOLLOW_10);
            rule__Abstractions__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractionsAccess().getGroup_3()); 

            }

            // InternalSasDsl.g:414:2: ( ( rule__Abstractions__Group_3__0 )* )
            // InternalSasDsl.g:415:3: ( rule__Abstractions__Group_3__0 )*
            {
             before(grammarAccess.getAbstractionsAccess().getGroup_3()); 
            // InternalSasDsl.g:416:3: ( rule__Abstractions__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSasDsl.g:416:4: rule__Abstractions__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Abstractions__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAbstractionsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Abstractions__Group__3__Impl"


    // $ANTLR start "rule__Abstractions__Group__4"
    // InternalSasDsl.g:425:1: rule__Abstractions__Group__4 : rule__Abstractions__Group__4__Impl ;
    public final void rule__Abstractions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:429:1: ( rule__Abstractions__Group__4__Impl )
            // InternalSasDsl.g:430:2: rule__Abstractions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abstractions__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__4"


    // $ANTLR start "rule__Abstractions__Group__4__Impl"
    // InternalSasDsl.g:436:1: rule__Abstractions__Group__4__Impl : ( '}' ) ;
    public final void rule__Abstractions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:440:1: ( ( '}' ) )
            // InternalSasDsl.g:441:1: ( '}' )
            {
            // InternalSasDsl.g:441:1: ( '}' )
            // InternalSasDsl.g:442:2: '}'
            {
             before(grammarAccess.getAbstractionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAbstractionsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group__4__Impl"


    // $ANTLR start "rule__Abstractions__Group_3__0"
    // InternalSasDsl.g:452:1: rule__Abstractions__Group_3__0 : rule__Abstractions__Group_3__0__Impl rule__Abstractions__Group_3__1 ;
    public final void rule__Abstractions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:456:1: ( rule__Abstractions__Group_3__0__Impl rule__Abstractions__Group_3__1 )
            // InternalSasDsl.g:457:2: rule__Abstractions__Group_3__0__Impl rule__Abstractions__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Abstractions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abstractions__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3__0"


    // $ANTLR start "rule__Abstractions__Group_3__0__Impl"
    // InternalSasDsl.g:464:1: rule__Abstractions__Group_3__0__Impl : ( ( rule__Abstractions__NameAssignment_3_0 ) ) ;
    public final void rule__Abstractions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:468:1: ( ( ( rule__Abstractions__NameAssignment_3_0 ) ) )
            // InternalSasDsl.g:469:1: ( ( rule__Abstractions__NameAssignment_3_0 ) )
            {
            // InternalSasDsl.g:469:1: ( ( rule__Abstractions__NameAssignment_3_0 ) )
            // InternalSasDsl.g:470:2: ( rule__Abstractions__NameAssignment_3_0 )
            {
             before(grammarAccess.getAbstractionsAccess().getNameAssignment_3_0()); 
            // InternalSasDsl.g:471:2: ( rule__Abstractions__NameAssignment_3_0 )
            // InternalSasDsl.g:471:3: rule__Abstractions__NameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Abstractions__NameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractionsAccess().getNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3__0__Impl"


    // $ANTLR start "rule__Abstractions__Group_3__1"
    // InternalSasDsl.g:479:1: rule__Abstractions__Group_3__1 : rule__Abstractions__Group_3__1__Impl rule__Abstractions__Group_3__2 ;
    public final void rule__Abstractions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:483:1: ( rule__Abstractions__Group_3__1__Impl rule__Abstractions__Group_3__2 )
            // InternalSasDsl.g:484:2: rule__Abstractions__Group_3__1__Impl rule__Abstractions__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Abstractions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abstractions__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3__1"


    // $ANTLR start "rule__Abstractions__Group_3__1__Impl"
    // InternalSasDsl.g:491:1: rule__Abstractions__Group_3__1__Impl : ( ( rule__Abstractions__Group_3_1__0 )* ) ;
    public final void rule__Abstractions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:495:1: ( ( ( rule__Abstractions__Group_3_1__0 )* ) )
            // InternalSasDsl.g:496:1: ( ( rule__Abstractions__Group_3_1__0 )* )
            {
            // InternalSasDsl.g:496:1: ( ( rule__Abstractions__Group_3_1__0 )* )
            // InternalSasDsl.g:497:2: ( rule__Abstractions__Group_3_1__0 )*
            {
             before(grammarAccess.getAbstractionsAccess().getGroup_3_1()); 
            // InternalSasDsl.g:498:2: ( rule__Abstractions__Group_3_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSasDsl.g:498:3: rule__Abstractions__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Abstractions__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAbstractionsAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3__1__Impl"


    // $ANTLR start "rule__Abstractions__Group_3__2"
    // InternalSasDsl.g:506:1: rule__Abstractions__Group_3__2 : rule__Abstractions__Group_3__2__Impl ;
    public final void rule__Abstractions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:510:1: ( rule__Abstractions__Group_3__2__Impl )
            // InternalSasDsl.g:511:2: rule__Abstractions__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abstractions__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3__2"


    // $ANTLR start "rule__Abstractions__Group_3__2__Impl"
    // InternalSasDsl.g:517:1: rule__Abstractions__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Abstractions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:521:1: ( ( ';' ) )
            // InternalSasDsl.g:522:1: ( ';' )
            {
            // InternalSasDsl.g:522:1: ( ';' )
            // InternalSasDsl.g:523:2: ';'
            {
             before(grammarAccess.getAbstractionsAccess().getSemicolonKeyword_3_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAbstractionsAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3__2__Impl"


    // $ANTLR start "rule__Abstractions__Group_3_1__0"
    // InternalSasDsl.g:533:1: rule__Abstractions__Group_3_1__0 : rule__Abstractions__Group_3_1__0__Impl rule__Abstractions__Group_3_1__1 ;
    public final void rule__Abstractions__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:537:1: ( rule__Abstractions__Group_3_1__0__Impl rule__Abstractions__Group_3_1__1 )
            // InternalSasDsl.g:538:2: rule__Abstractions__Group_3_1__0__Impl rule__Abstractions__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Abstractions__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abstractions__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3_1__0"


    // $ANTLR start "rule__Abstractions__Group_3_1__0__Impl"
    // InternalSasDsl.g:545:1: rule__Abstractions__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Abstractions__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:549:1: ( ( ',' ) )
            // InternalSasDsl.g:550:1: ( ',' )
            {
            // InternalSasDsl.g:550:1: ( ',' )
            // InternalSasDsl.g:551:2: ','
            {
             before(grammarAccess.getAbstractionsAccess().getCommaKeyword_3_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAbstractionsAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3_1__0__Impl"


    // $ANTLR start "rule__Abstractions__Group_3_1__1"
    // InternalSasDsl.g:560:1: rule__Abstractions__Group_3_1__1 : rule__Abstractions__Group_3_1__1__Impl ;
    public final void rule__Abstractions__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:564:1: ( rule__Abstractions__Group_3_1__1__Impl )
            // InternalSasDsl.g:565:2: rule__Abstractions__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abstractions__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3_1__1"


    // $ANTLR start "rule__Abstractions__Group_3_1__1__Impl"
    // InternalSasDsl.g:571:1: rule__Abstractions__Group_3_1__1__Impl : ( ( rule__Abstractions__NameAssignment_3_1_1 ) ) ;
    public final void rule__Abstractions__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:575:1: ( ( ( rule__Abstractions__NameAssignment_3_1_1 ) ) )
            // InternalSasDsl.g:576:1: ( ( rule__Abstractions__NameAssignment_3_1_1 ) )
            {
            // InternalSasDsl.g:576:1: ( ( rule__Abstractions__NameAssignment_3_1_1 ) )
            // InternalSasDsl.g:577:2: ( rule__Abstractions__NameAssignment_3_1_1 )
            {
             before(grammarAccess.getAbstractionsAccess().getNameAssignment_3_1_1()); 
            // InternalSasDsl.g:578:2: ( rule__Abstractions__NameAssignment_3_1_1 )
            // InternalSasDsl.g:578:3: rule__Abstractions__NameAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Abstractions__NameAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractionsAccess().getNameAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__Group_3_1__1__Impl"


    // $ANTLR start "rule__Compositions__Group__0"
    // InternalSasDsl.g:587:1: rule__Compositions__Group__0 : rule__Compositions__Group__0__Impl rule__Compositions__Group__1 ;
    public final void rule__Compositions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:591:1: ( rule__Compositions__Group__0__Impl rule__Compositions__Group__1 )
            // InternalSasDsl.g:592:2: rule__Compositions__Group__0__Impl rule__Compositions__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Compositions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compositions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compositions__Group__0"


    // $ANTLR start "rule__Compositions__Group__0__Impl"
    // InternalSasDsl.g:599:1: rule__Compositions__Group__0__Impl : ( 'Compositions' ) ;
    public final void rule__Compositions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:603:1: ( ( 'Compositions' ) )
            // InternalSasDsl.g:604:1: ( 'Compositions' )
            {
            // InternalSasDsl.g:604:1: ( 'Compositions' )
            // InternalSasDsl.g:605:2: 'Compositions'
            {
             before(grammarAccess.getCompositionsAccess().getCompositionsKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCompositionsAccess().getCompositionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compositions__Group__0__Impl"


    // $ANTLR start "rule__Compositions__Group__1"
    // InternalSasDsl.g:614:1: rule__Compositions__Group__1 : rule__Compositions__Group__1__Impl rule__Compositions__Group__2 ;
    public final void rule__Compositions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:618:1: ( rule__Compositions__Group__1__Impl rule__Compositions__Group__2 )
            // InternalSasDsl.g:619:2: rule__Compositions__Group__1__Impl rule__Compositions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Compositions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compositions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compositions__Group__1"


    // $ANTLR start "rule__Compositions__Group__1__Impl"
    // InternalSasDsl.g:626:1: rule__Compositions__Group__1__Impl : ( '{' ) ;
    public final void rule__Compositions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:630:1: ( ( '{' ) )
            // InternalSasDsl.g:631:1: ( '{' )
            {
            // InternalSasDsl.g:631:1: ( '{' )
            // InternalSasDsl.g:632:2: '{'
            {
             before(grammarAccess.getCompositionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCompositionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compositions__Group__1__Impl"


    // $ANTLR start "rule__Compositions__Group__2"
    // InternalSasDsl.g:641:1: rule__Compositions__Group__2 : rule__Compositions__Group__2__Impl ;
    public final void rule__Compositions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:645:1: ( rule__Compositions__Group__2__Impl )
            // InternalSasDsl.g:646:2: rule__Compositions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compositions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compositions__Group__2"


    // $ANTLR start "rule__Compositions__Group__2__Impl"
    // InternalSasDsl.g:652:1: rule__Compositions__Group__2__Impl : ( '}' ) ;
    public final void rule__Compositions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:656:1: ( ( '}' ) )
            // InternalSasDsl.g:657:1: ( '}' )
            {
            // InternalSasDsl.g:657:1: ( '}' )
            // InternalSasDsl.g:658:2: '}'
            {
             before(grammarAccess.getCompositionsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositionsAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compositions__Group__2__Impl"


    // $ANTLR start "rule__Restrictions__Group__0"
    // InternalSasDsl.g:668:1: rule__Restrictions__Group__0 : rule__Restrictions__Group__0__Impl rule__Restrictions__Group__1 ;
    public final void rule__Restrictions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:672:1: ( rule__Restrictions__Group__0__Impl rule__Restrictions__Group__1 )
            // InternalSasDsl.g:673:2: rule__Restrictions__Group__0__Impl rule__Restrictions__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Restrictions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restrictions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restrictions__Group__0"


    // $ANTLR start "rule__Restrictions__Group__0__Impl"
    // InternalSasDsl.g:680:1: rule__Restrictions__Group__0__Impl : ( 'Restrictions' ) ;
    public final void rule__Restrictions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:684:1: ( ( 'Restrictions' ) )
            // InternalSasDsl.g:685:1: ( 'Restrictions' )
            {
            // InternalSasDsl.g:685:1: ( 'Restrictions' )
            // InternalSasDsl.g:686:2: 'Restrictions'
            {
             before(grammarAccess.getRestrictionsAccess().getRestrictionsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRestrictionsAccess().getRestrictionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restrictions__Group__0__Impl"


    // $ANTLR start "rule__Restrictions__Group__1"
    // InternalSasDsl.g:695:1: rule__Restrictions__Group__1 : rule__Restrictions__Group__1__Impl rule__Restrictions__Group__2 ;
    public final void rule__Restrictions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:699:1: ( rule__Restrictions__Group__1__Impl rule__Restrictions__Group__2 )
            // InternalSasDsl.g:700:2: rule__Restrictions__Group__1__Impl rule__Restrictions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Restrictions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restrictions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restrictions__Group__1"


    // $ANTLR start "rule__Restrictions__Group__1__Impl"
    // InternalSasDsl.g:707:1: rule__Restrictions__Group__1__Impl : ( '{' ) ;
    public final void rule__Restrictions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:711:1: ( ( '{' ) )
            // InternalSasDsl.g:712:1: ( '{' )
            {
            // InternalSasDsl.g:712:1: ( '{' )
            // InternalSasDsl.g:713:2: '{'
            {
             before(grammarAccess.getRestrictionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRestrictionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restrictions__Group__1__Impl"


    // $ANTLR start "rule__Restrictions__Group__2"
    // InternalSasDsl.g:722:1: rule__Restrictions__Group__2 : rule__Restrictions__Group__2__Impl ;
    public final void rule__Restrictions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:726:1: ( rule__Restrictions__Group__2__Impl )
            // InternalSasDsl.g:727:2: rule__Restrictions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Restrictions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restrictions__Group__2"


    // $ANTLR start "rule__Restrictions__Group__2__Impl"
    // InternalSasDsl.g:733:1: rule__Restrictions__Group__2__Impl : ( '}' ) ;
    public final void rule__Restrictions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:737:1: ( ( '}' ) )
            // InternalSasDsl.g:738:1: ( '}' )
            {
            // InternalSasDsl.g:738:1: ( '}' )
            // InternalSasDsl.g:739:2: '}'
            {
             before(grammarAccess.getRestrictionsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRestrictionsAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restrictions__Group__2__Impl"


    // $ANTLR start "rule__ArchitectureDefinition__SectionAssignment"
    // InternalSasDsl.g:749:1: rule__ArchitectureDefinition__SectionAssignment : ( ruleSections ) ;
    public final void rule__ArchitectureDefinition__SectionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:753:1: ( ( ruleSections ) )
            // InternalSasDsl.g:754:2: ( ruleSections )
            {
            // InternalSasDsl.g:754:2: ( ruleSections )
            // InternalSasDsl.g:755:3: ruleSections
            {
             before(grammarAccess.getArchitectureDefinitionAccess().getSectionSectionsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSections();

            state._fsp--;

             after(grammarAccess.getArchitectureDefinitionAccess().getSectionSectionsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchitectureDefinition__SectionAssignment"


    // $ANTLR start "rule__Sections__AbstractionsAssignment_0"
    // InternalSasDsl.g:764:1: rule__Sections__AbstractionsAssignment_0 : ( ruleAbstractions ) ;
    public final void rule__Sections__AbstractionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:768:1: ( ( ruleAbstractions ) )
            // InternalSasDsl.g:769:2: ( ruleAbstractions )
            {
            // InternalSasDsl.g:769:2: ( ruleAbstractions )
            // InternalSasDsl.g:770:3: ruleAbstractions
            {
             before(grammarAccess.getSectionsAccess().getAbstractionsAbstractionsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractions();

            state._fsp--;

             after(grammarAccess.getSectionsAccess().getAbstractionsAbstractionsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__AbstractionsAssignment_0"


    // $ANTLR start "rule__Sections__CompositionsAssignment_1"
    // InternalSasDsl.g:779:1: rule__Sections__CompositionsAssignment_1 : ( ruleCompositions ) ;
    public final void rule__Sections__CompositionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:783:1: ( ( ruleCompositions ) )
            // InternalSasDsl.g:784:2: ( ruleCompositions )
            {
            // InternalSasDsl.g:784:2: ( ruleCompositions )
            // InternalSasDsl.g:785:3: ruleCompositions
            {
             before(grammarAccess.getSectionsAccess().getCompositionsCompositionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositions();

            state._fsp--;

             after(grammarAccess.getSectionsAccess().getCompositionsCompositionsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__CompositionsAssignment_1"


    // $ANTLR start "rule__Sections__RestrictionsAssignment_2"
    // InternalSasDsl.g:794:1: rule__Sections__RestrictionsAssignment_2 : ( ruleRestrictions ) ;
    public final void rule__Sections__RestrictionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:798:1: ( ( ruleRestrictions ) )
            // InternalSasDsl.g:799:2: ( ruleRestrictions )
            {
            // InternalSasDsl.g:799:2: ( ruleRestrictions )
            // InternalSasDsl.g:800:3: ruleRestrictions
            {
             before(grammarAccess.getSectionsAccess().getRestrictionsRestrictionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRestrictions();

            state._fsp--;

             after(grammarAccess.getSectionsAccess().getRestrictionsRestrictionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sections__RestrictionsAssignment_2"


    // $ANTLR start "rule__Abstractions__NameAssignment_3_0"
    // InternalSasDsl.g:809:1: rule__Abstractions__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Abstractions__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:813:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:814:2: ( RULE_ID )
            {
            // InternalSasDsl.g:814:2: ( RULE_ID )
            // InternalSasDsl.g:815:3: RULE_ID
            {
             before(grammarAccess.getAbstractionsAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractionsAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__NameAssignment_3_0"


    // $ANTLR start "rule__Abstractions__NameAssignment_3_1_1"
    // InternalSasDsl.g:824:1: rule__Abstractions__NameAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__Abstractions__NameAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSasDsl.g:828:1: ( ( RULE_ID ) )
            // InternalSasDsl.g:829:2: ( RULE_ID )
            {
            // InternalSasDsl.g:829:2: ( RULE_ID )
            // InternalSasDsl.g:830:3: RULE_ID
            {
             before(grammarAccess.getAbstractionsAccess().getNameIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractionsAccess().getNameIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstractions__NameAssignment_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});

}