package br.ufscar.sas.xtext.sasdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSasDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Abstractions'", "'{'", "'}'", "'Compositions'", "'Restrictions'", "'sensor'", "'must-not-access-probe'", "';'", "'must-access-probe'", "'through-interface'", "'analyzer'", "'must-not-access-monitor'", "'must-access-monitor'", "'must-not-access-planner'", "'must-access-planner'", "'must-not-access-executor'", "'must-access-executor'", "'planner'", "'must-not-access-knowledge'", "'must-access-knowledge'", "'effector'", "'must-not-access-gauge'", "'must-access-gauge'", "'managing'", "'must-not-access-managed'", "'must-access-managed'", "'must-be-in-monitor'", "'reference-input'", "'must-be-in-knowledge'", "'must-be-in-executor'", "'monitor'", "'must-be-in-control-loop'", "'must-be-in-managing'", "'executor'", "'control-loop'", "'must-be-in-control-loop-manager'", "'control-loop-manager'", "'measured-output'", "'must-be-in-managed'", "'gauge'", "'probe'", "'Managing'", "'Managed'", "'with-interface'", "','", "'ControlLoopManager'", "'typeOf'", "'Synchronized'", "'Coordinated'", "'Independent'", "'ControlLoop'", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'Probe'", "'Gauge'", "'ReferenceInput'", "'MeasuredOutput'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
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

        public InternalSasDslParser(TokenStream input, SasDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ArchitectureDefinition";
       	}

       	@Override
       	protected SasDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArchitectureDefinition"
    // InternalSasDsl.g:64:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // InternalSasDsl.g:64:63: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // InternalSasDsl.g:65:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
             newCompositeNode(grammarAccess.getArchitectureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();

            state._fsp--;

             current =iv_ruleArchitectureDefinition; 
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
    // $ANTLR end "entryRuleArchitectureDefinition"


    // $ANTLR start "ruleArchitectureDefinition"
    // InternalSasDsl.g:71:1: ruleArchitectureDefinition returns [EObject current=null] : (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_abstractions_2_0 = null;

        EObject lv_compositions_6_0 = null;

        EObject lv_restrictions_10_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:77:2: ( (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' ) )
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' )
            {
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}' )
            // InternalSasDsl.g:79:3: otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' ( (lv_compositions_6_0= ruleDSLComposition ) )* otherlv_7= '}' otherlv_8= 'Restrictions' otherlv_9= '{' ( (lv_restrictions_10_0= ruleDSLRestriction ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureDefinitionAccess().getAbstractionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSasDsl.g:87:3: ( (lv_abstractions_2_0= ruleDSLAbstraction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=52 && LA1_0<=53)||LA1_0==56||(LA1_0>=61 && LA1_0<=72)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDSLAbstraction )
            	    {
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDSLAbstraction )
            	    // InternalSasDsl.g:89:5: lv_abstractions_2_0= ruleDSLAbstraction
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsDSLAbstractionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_abstractions_2_0=ruleDSLAbstraction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractions",
            	    						lv_abstractions_2_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLAbstraction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureDefinitionAccess().getCompositionsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSasDsl.g:118:3: ( (lv_compositions_6_0= ruleDSLComposition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==21||LA2_0==28||LA2_0==31||LA2_0==38||LA2_0==41||(LA2_0>=44 && LA2_0<=45)||(LA2_0>=47 && LA2_0<=48)||(LA2_0>=50 && LA2_0<=51)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSasDsl.g:119:4: (lv_compositions_6_0= ruleDSLComposition )
            	    {
            	    // InternalSasDsl.g:119:4: (lv_compositions_6_0= ruleDSLComposition )
            	    // InternalSasDsl.g:120:5: lv_compositions_6_0= ruleDSLComposition
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositionsDSLCompositionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_compositions_6_0=ruleDSLComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"compositions",
            	    						lv_compositions_6_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getArchitectureDefinitionAccess().getRestrictionsKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalSasDsl.g:149:3: ( (lv_restrictions_10_0= ruleDSLRestriction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==21||LA3_0==28||LA3_0==31||LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSasDsl.g:150:4: (lv_restrictions_10_0= ruleDSLRestriction )
            	    {
            	    // InternalSasDsl.g:150:4: (lv_restrictions_10_0= ruleDSLRestriction )
            	    // InternalSasDsl.g:151:5: lv_restrictions_10_0= ruleDSLRestriction
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getRestrictionsDSLRestrictionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_restrictions_10_0=ruleDSLRestriction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"restrictions",
            	    						lv_restrictions_10_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLRestriction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleArchitectureDefinition"


    // $ANTLR start "entryRuleDSLAbstraction"
    // InternalSasDsl.g:176:1: entryRuleDSLAbstraction returns [EObject current=null] : iv_ruleDSLAbstraction= ruleDSLAbstraction EOF ;
    public final EObject entryRuleDSLAbstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAbstraction = null;


        try {
            // InternalSasDsl.g:176:55: (iv_ruleDSLAbstraction= ruleDSLAbstraction EOF )
            // InternalSasDsl.g:177:2: iv_ruleDSLAbstraction= ruleDSLAbstraction EOF
            {
             newCompositeNode(grammarAccess.getDSLAbstractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAbstraction=ruleDSLAbstraction();

            state._fsp--;

             current =iv_ruleDSLAbstraction; 
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
    // $ANTLR end "entryRuleDSLAbstraction"


    // $ANTLR start "ruleDSLAbstraction"
    // InternalSasDsl.g:183:1: ruleDSLAbstraction returns [EObject current=null] : (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput ) ;
    public final EObject ruleDSLAbstraction() throws RecognitionException {
        EObject current = null;

        EObject this_DSLManaging_0 = null;

        EObject this_DSLManaged_1 = null;

        EObject this_DSLControlLoopManager_2 = null;

        EObject this_DSLControlLoop_3 = null;

        EObject this_DSLMonitor_4 = null;

        EObject this_DSLAnalyzer_5 = null;

        EObject this_DSLPlanner_6 = null;

        EObject this_DSLExecutor_7 = null;

        EObject this_DSLKnowledge_8 = null;

        EObject this_DSLSensor_9 = null;

        EObject this_DSLEffector_10 = null;

        EObject this_DSLProbe_11 = null;

        EObject this_DSLGauge_12 = null;

        EObject this_DSLReferenceInput_13 = null;

        EObject this_DSLMeasuredOutput_14 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:189:2: ( (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput ) )
            // InternalSasDsl.g:190:2: (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput )
            {
            // InternalSasDsl.g:190:2: (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput )
            int alt4=15;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt4=1;
                }
                break;
            case 53:
                {
                alt4=2;
                }
                break;
            case 56:
                {
                alt4=3;
                }
                break;
            case 61:
                {
                alt4=4;
                }
                break;
            case 62:
                {
                alt4=5;
                }
                break;
            case 63:
                {
                alt4=6;
                }
                break;
            case 64:
                {
                alt4=7;
                }
                break;
            case 65:
                {
                alt4=8;
                }
                break;
            case 66:
                {
                alt4=9;
                }
                break;
            case 67:
                {
                alt4=10;
                }
                break;
            case 68:
                {
                alt4=11;
                }
                break;
            case 69:
                {
                alt4=12;
                }
                break;
            case 70:
                {
                alt4=13;
                }
                break;
            case 71:
                {
                alt4=14;
                }
                break;
            case 72:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSasDsl.g:191:3: this_DSLManaging_0= ruleDSLManaging
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLManagingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLManaging_0=ruleDSLManaging();

                    state._fsp--;


                    			current = this_DSLManaging_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:200:3: this_DSLManaged_1= ruleDSLManaged
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLManagedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLManaged_1=ruleDSLManaged();

                    state._fsp--;


                    			current = this_DSLManaged_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:209:3: this_DSLControlLoopManager_2= ruleDSLControlLoopManager
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLControlLoopManagerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLControlLoopManager_2=ruleDSLControlLoopManager();

                    state._fsp--;


                    			current = this_DSLControlLoopManager_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:218:3: this_DSLControlLoop_3= ruleDSLControlLoop
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLControlLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLControlLoop_3=ruleDSLControlLoop();

                    state._fsp--;


                    			current = this_DSLControlLoop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:227:3: this_DSLMonitor_4= ruleDSLMonitor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLMonitorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMonitor_4=ruleDSLMonitor();

                    state._fsp--;


                    			current = this_DSLMonitor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:236:3: this_DSLAnalyzer_5= ruleDSLAnalyzer
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLAnalyzerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLAnalyzer_5=ruleDSLAnalyzer();

                    state._fsp--;


                    			current = this_DSLAnalyzer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:245:3: this_DSLPlanner_6= ruleDSLPlanner
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLPlannerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLPlanner_6=ruleDSLPlanner();

                    state._fsp--;


                    			current = this_DSLPlanner_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:254:3: this_DSLExecutor_7= ruleDSLExecutor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLExecutorParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLExecutor_7=ruleDSLExecutor();

                    state._fsp--;


                    			current = this_DSLExecutor_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:263:3: this_DSLKnowledge_8= ruleDSLKnowledge
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLKnowledgeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLKnowledge_8=ruleDSLKnowledge();

                    state._fsp--;


                    			current = this_DSLKnowledge_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:272:3: this_DSLSensor_9= ruleDSLSensor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLSensorParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLSensor_9=ruleDSLSensor();

                    state._fsp--;


                    			current = this_DSLSensor_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:281:3: this_DSLEffector_10= ruleDSLEffector
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLEffectorParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLEffector_10=ruleDSLEffector();

                    state._fsp--;


                    			current = this_DSLEffector_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:290:3: this_DSLProbe_11= ruleDSLProbe
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLProbeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLProbe_11=ruleDSLProbe();

                    state._fsp--;


                    			current = this_DSLProbe_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:299:3: this_DSLGauge_12= ruleDSLGauge
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLGaugeParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLGauge_12=ruleDSLGauge();

                    state._fsp--;


                    			current = this_DSLGauge_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSasDsl.g:308:3: this_DSLReferenceInput_13= ruleDSLReferenceInput
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLReferenceInputParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLReferenceInput_13=ruleDSLReferenceInput();

                    state._fsp--;


                    			current = this_DSLReferenceInput_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalSasDsl.g:317:3: this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionAccess().getDSLMeasuredOutputParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMeasuredOutput_14=ruleDSLMeasuredOutput();

                    state._fsp--;


                    			current = this_DSLMeasuredOutput_14;
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
    // $ANTLR end "ruleDSLAbstraction"


    // $ANTLR start "entryRuleDSLComposition"
    // InternalSasDsl.g:329:1: entryRuleDSLComposition returns [EObject current=null] : iv_ruleDSLComposition= ruleDSLComposition EOF ;
    public final EObject entryRuleDSLComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLComposition = null;


        try {
            // InternalSasDsl.g:329:55: (iv_ruleDSLComposition= ruleDSLComposition EOF )
            // InternalSasDsl.g:330:2: iv_ruleDSLComposition= ruleDSLComposition EOF
            {
             newCompositeNode(grammarAccess.getDSLCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLComposition=ruleDSLComposition();

            state._fsp--;

             current =iv_ruleDSLComposition; 
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
    // $ANTLR end "entryRuleDSLComposition"


    // $ANTLR start "ruleDSLComposition"
    // InternalSasDsl.g:336:1: ruleDSLComposition returns [EObject current=null] : (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLGaugeBelongsTo_15= ruleDSLGaugeBelongsTo | this_DSLProbeBelongsTo_16= ruleDSLProbeBelongsTo ) ;
    public final EObject ruleDSLComposition() throws RecognitionException {
        EObject current = null;

        EObject this_DSLSensorBelongsTo_0 = null;

        EObject this_DSLReferenceInputBelongsTo_1 = null;

        EObject this_DSLEffectorBelongsTo_2 = null;

        EObject this_DSLMonitorBelongsTo1_3 = null;

        EObject this_DSLMonitorBelongsTo2_4 = null;

        EObject this_DSLAnalyzerBelongsTo1_5 = null;

        EObject this_DSLAnalyzerBelongsTo2_6 = null;

        EObject this_DSLPlannerBelongsTo1_7 = null;

        EObject this_DSLPlannerBelongsTo2_8 = null;

        EObject this_DSLExecutorBelongsTo1_9 = null;

        EObject this_DSLExecutorBelongsTo2_10 = null;

        EObject this_DSLClBelongsTo1_11 = null;

        EObject this_DSLClBelongsTo2_12 = null;

        EObject this_DSLClmBelongsTo_13 = null;

        EObject this_DSLMeasuredOuputBelongsTo_14 = null;

        EObject this_DSLGaugeBelongsTo_15 = null;

        EObject this_DSLProbeBelongsTo_16 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:342:2: ( (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLGaugeBelongsTo_15= ruleDSLGaugeBelongsTo | this_DSLProbeBelongsTo_16= ruleDSLProbeBelongsTo ) )
            // InternalSasDsl.g:343:2: (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLGaugeBelongsTo_15= ruleDSLGaugeBelongsTo | this_DSLProbeBelongsTo_16= ruleDSLProbeBelongsTo )
            {
            // InternalSasDsl.g:343:2: (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLGaugeBelongsTo_15= ruleDSLGaugeBelongsTo | this_DSLProbeBelongsTo_16= ruleDSLProbeBelongsTo )
            int alt5=17;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSasDsl.g:344:3: this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLSensorBelongsToParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLSensorBelongsTo_0=ruleDSLSensorBelongsTo();

                    state._fsp--;


                    			current = this_DSLSensorBelongsTo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:353:3: this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLReferenceInputBelongsToParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLReferenceInputBelongsTo_1=ruleDSLReferenceInputBelongsTo();

                    state._fsp--;


                    			current = this_DSLReferenceInputBelongsTo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:362:3: this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLEffectorBelongsToParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLEffectorBelongsTo_2=ruleDSLEffectorBelongsTo();

                    state._fsp--;


                    			current = this_DSLEffectorBelongsTo_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:371:3: this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLMonitorBelongsTo1ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMonitorBelongsTo1_3=ruleDSLMonitorBelongsTo1();

                    state._fsp--;


                    			current = this_DSLMonitorBelongsTo1_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:380:3: this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLMonitorBelongsTo2ParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMonitorBelongsTo2_4=ruleDSLMonitorBelongsTo2();

                    state._fsp--;


                    			current = this_DSLMonitorBelongsTo2_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:389:3: this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLAnalyzerBelongsTo1ParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLAnalyzerBelongsTo1_5=ruleDSLAnalyzerBelongsTo1();

                    state._fsp--;


                    			current = this_DSLAnalyzerBelongsTo1_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:398:3: this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLAnalyzerBelongsTo2ParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLAnalyzerBelongsTo2_6=ruleDSLAnalyzerBelongsTo2();

                    state._fsp--;


                    			current = this_DSLAnalyzerBelongsTo2_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:407:3: this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLPlannerBelongsTo1ParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLPlannerBelongsTo1_7=ruleDSLPlannerBelongsTo1();

                    state._fsp--;


                    			current = this_DSLPlannerBelongsTo1_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:416:3: this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLPlannerBelongsTo2ParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLPlannerBelongsTo2_8=ruleDSLPlannerBelongsTo2();

                    state._fsp--;


                    			current = this_DSLPlannerBelongsTo2_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:425:3: this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLExecutorBelongsTo1ParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLExecutorBelongsTo1_9=ruleDSLExecutorBelongsTo1();

                    state._fsp--;


                    			current = this_DSLExecutorBelongsTo1_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:434:3: this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLExecutorBelongsTo2ParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLExecutorBelongsTo2_10=ruleDSLExecutorBelongsTo2();

                    state._fsp--;


                    			current = this_DSLExecutorBelongsTo2_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:443:3: this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLClBelongsTo1ParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLClBelongsTo1_11=ruleDSLClBelongsTo1();

                    state._fsp--;


                    			current = this_DSLClBelongsTo1_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:452:3: this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLClBelongsTo2ParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLClBelongsTo2_12=ruleDSLClBelongsTo2();

                    state._fsp--;


                    			current = this_DSLClBelongsTo2_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSasDsl.g:461:3: this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLClmBelongsToParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLClmBelongsTo_13=ruleDSLClmBelongsTo();

                    state._fsp--;


                    			current = this_DSLClmBelongsTo_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalSasDsl.g:470:3: this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLMeasuredOuputBelongsToParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMeasuredOuputBelongsTo_14=ruleDSLMeasuredOuputBelongsTo();

                    state._fsp--;


                    			current = this_DSLMeasuredOuputBelongsTo_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalSasDsl.g:479:3: this_DSLGaugeBelongsTo_15= ruleDSLGaugeBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLGaugeBelongsToParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLGaugeBelongsTo_15=ruleDSLGaugeBelongsTo();

                    state._fsp--;


                    			current = this_DSLGaugeBelongsTo_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalSasDsl.g:488:3: this_DSLProbeBelongsTo_16= ruleDSLProbeBelongsTo
                    {

                    			newCompositeNode(grammarAccess.getDSLCompositionAccess().getDSLProbeBelongsToParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLProbeBelongsTo_16=ruleDSLProbeBelongsTo();

                    state._fsp--;


                    			current = this_DSLProbeBelongsTo_16;
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
    // $ANTLR end "ruleDSLComposition"


    // $ANTLR start "entryRuleDSLRestriction"
    // InternalSasDsl.g:500:1: entryRuleDSLRestriction returns [EObject current=null] : iv_ruleDSLRestriction= ruleDSLRestriction EOF ;
    public final EObject entryRuleDSLRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestriction = null;


        try {
            // InternalSasDsl.g:500:55: (iv_ruleDSLRestriction= ruleDSLRestriction EOF )
            // InternalSasDsl.g:501:2: iv_ruleDSLRestriction= ruleDSLRestriction EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestriction=ruleDSLRestriction();

            state._fsp--;

             current =iv_ruleDSLRestriction; 
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
    // $ANTLR end "entryRuleDSLRestriction"


    // $ANTLR start "ruleDSLRestriction"
    // InternalSasDsl.g:507:1: ruleDSLRestriction returns [EObject current=null] : ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | (otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';' ) | (otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';' ) | (otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';' ) | (otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';' ) | (otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';' ) | (otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';' ) | (otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';' ) | (otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';' ) | (otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';' ) | (otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';' ) | (otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';' ) | (otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';' ) | (otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';' ) | (otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';' ) ) ;
    public final EObject ruleDSLRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_72=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_78=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        Token otherlv_83=null;
        Token otherlv_84=null;
        Token otherlv_85=null;
        Token otherlv_86=null;
        Token otherlv_87=null;
        Token otherlv_88=null;
        Token otherlv_89=null;
        Token otherlv_90=null;
        Token otherlv_91=null;
        Token otherlv_92=null;
        Token otherlv_93=null;
        Token otherlv_94=null;
        Token otherlv_95=null;
        Token otherlv_96=null;
        Token otherlv_97=null;
        Token otherlv_98=null;
        Token otherlv_99=null;
        Token otherlv_100=null;
        Token otherlv_101=null;
        Token otherlv_102=null;
        Token otherlv_103=null;
        Token otherlv_104=null;
        Token otherlv_105=null;
        Token otherlv_106=null;
        Token otherlv_107=null;


        	enterRule();

        try {
            // InternalSasDsl.g:513:2: ( ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | (otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';' ) | (otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';' ) | (otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';' ) | (otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';' ) | (otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';' ) | (otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';' ) | (otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';' ) | (otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';' ) | (otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';' ) | (otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';' ) | (otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';' ) | (otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';' ) | (otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';' ) | (otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';' ) ) )
            // InternalSasDsl.g:514:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | (otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';' ) | (otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';' ) | (otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';' ) | (otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';' ) | (otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';' ) | (otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';' ) | (otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';' ) | (otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';' ) | (otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';' ) | (otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';' ) | (otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';' ) | (otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';' ) | (otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';' ) | (otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';' ) )
            {
            // InternalSasDsl.g:514:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | (otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';' ) | (otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';' ) | (otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';' ) | (otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';' ) | (otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';' ) | (otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';' ) | (otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';' ) | (otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';' ) | (otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';' ) | (otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';' ) | (otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';' ) | (otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';' ) | (otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';' ) | (otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';' ) )
            int alt6=18;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSasDsl.g:515:3: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:515:3: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:516:4: otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionAccess().getSensorKeyword_0_0());
                    			
                    // InternalSasDsl.g:520:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:521:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:521:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:522:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionAccess().getTDSLSensorCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionAccess().getMustNotAccessProbeKeyword_0_2());
                    			
                    // InternalSasDsl.g:537:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:538:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:538:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:539:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionAccess().getTypeDSLProbeCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:556:3: (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:556:3: (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:557:4: otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionAccess().getSensorKeyword_1_0());
                    			
                    // InternalSasDsl.g:561:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:562:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:562:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:563:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionAccess().getTDSLSensorCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionAccess().getMustAccessProbeKeyword_1_2());
                    			
                    // InternalSasDsl.g:578:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:579:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:579:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:580:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionAccess().getTypeDSLProbeCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:595:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:596:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:596:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:597:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionAccess().getProbeinterfaceProbeInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:614:3: (otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    {
                    // InternalSasDsl.g:614:3: (otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    // InternalSasDsl.g:615:4: otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';'
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_2_0());
                    			
                    // InternalSasDsl.g:619:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSasDsl.g:620:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSasDsl.g:620:5: (otherlv_13= RULE_ID )
                    // InternalSasDsl.g:621:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_13, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getDSLRestrictionAccess().getMustNotAccessMonitorKeyword_2_2());
                    			
                    // InternalSasDsl.g:636:4: ( (otherlv_15= RULE_ID ) )
                    // InternalSasDsl.g:637:5: (otherlv_15= RULE_ID )
                    {
                    // InternalSasDsl.g:637:5: (otherlv_15= RULE_ID )
                    // InternalSasDsl.g:638:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_15, grammarAccess.getDSLRestrictionAccess().getTypeDSLMonitorCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:655:3: (otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:655:3: (otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:656:4: otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    otherlv_17=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_3_0());
                    			
                    // InternalSasDsl.g:660:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSasDsl.g:661:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSasDsl.g:661:5: (otherlv_18= RULE_ID )
                    // InternalSasDsl.g:662:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_18, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRestrictionAccess().getMustAccessMonitorKeyword_3_2());
                    			
                    // InternalSasDsl.g:677:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:678:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:678:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:679:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRestrictionAccess().getTypeDSLMonitorCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_3_4());
                    			
                    // InternalSasDsl.g:694:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:695:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:695:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:696:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRestrictionAccess().getInterfaceMonitorInterfaceCrossReference_3_5_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:713:3: (otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';' )
                    {
                    // InternalSasDsl.g:713:3: (otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';' )
                    // InternalSasDsl.g:714:4: otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';'
                    {
                    otherlv_24=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_24, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_4_0());
                    			
                    // InternalSasDsl.g:718:4: ( (otherlv_25= RULE_ID ) )
                    // InternalSasDsl.g:719:5: (otherlv_25= RULE_ID )
                    {
                    // InternalSasDsl.g:719:5: (otherlv_25= RULE_ID )
                    // InternalSasDsl.g:720:6: otherlv_25= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_25, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_26, grammarAccess.getDSLRestrictionAccess().getMustNotAccessPlannerKeyword_4_2());
                    			
                    // InternalSasDsl.g:735:4: ( (otherlv_27= RULE_ID ) )
                    // InternalSasDsl.g:736:5: (otherlv_27= RULE_ID )
                    {
                    // InternalSasDsl.g:736:5: (otherlv_27= RULE_ID )
                    // InternalSasDsl.g:737:6: otherlv_27= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_27, grammarAccess.getDSLRestrictionAccess().getTypeDSLPlannerCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:754:3: (otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';' )
                    {
                    // InternalSasDsl.g:754:3: (otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';' )
                    // InternalSasDsl.g:755:4: otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';'
                    {
                    otherlv_29=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_29, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_5_0());
                    			
                    // InternalSasDsl.g:759:4: ( (otherlv_30= RULE_ID ) )
                    // InternalSasDsl.g:760:5: (otherlv_30= RULE_ID )
                    {
                    // InternalSasDsl.g:760:5: (otherlv_30= RULE_ID )
                    // InternalSasDsl.g:761:6: otherlv_30= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_30, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_5_1_0());
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_31, grammarAccess.getDSLRestrictionAccess().getMustAccessPlannerKeyword_5_2());
                    			
                    // InternalSasDsl.g:776:4: ( (otherlv_32= RULE_ID ) )
                    // InternalSasDsl.g:777:5: (otherlv_32= RULE_ID )
                    {
                    // InternalSasDsl.g:777:5: (otherlv_32= RULE_ID )
                    // InternalSasDsl.g:778:6: otherlv_32= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_32, grammarAccess.getDSLRestrictionAccess().getTypeDSLPlannerCrossReference_5_3_0());
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_33, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_5_4());
                    			
                    // InternalSasDsl.g:793:4: ( (otherlv_34= RULE_ID ) )
                    // InternalSasDsl.g:794:5: (otherlv_34= RULE_ID )
                    {
                    // InternalSasDsl.g:794:5: (otherlv_34= RULE_ID )
                    // InternalSasDsl.g:795:6: otherlv_34= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_34=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_34, grammarAccess.getDSLRestrictionAccess().getInterfacePlannerInterfaceCrossReference_5_5_0());
                    					

                    }


                    }

                    otherlv_35=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_35, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_5_6());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:812:3: (otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';' )
                    {
                    // InternalSasDsl.g:812:3: (otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';' )
                    // InternalSasDsl.g:813:4: otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';'
                    {
                    otherlv_36=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_36, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_6_0());
                    			
                    // InternalSasDsl.g:817:4: ( (otherlv_37= RULE_ID ) )
                    // InternalSasDsl.g:818:5: (otherlv_37= RULE_ID )
                    {
                    // InternalSasDsl.g:818:5: (otherlv_37= RULE_ID )
                    // InternalSasDsl.g:819:6: otherlv_37= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_37=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_37, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_6_1_0());
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_38, grammarAccess.getDSLRestrictionAccess().getMustNotAccessExecutorKeyword_6_2());
                    			
                    // InternalSasDsl.g:834:4: ( (otherlv_39= RULE_ID ) )
                    // InternalSasDsl.g:835:5: (otherlv_39= RULE_ID )
                    {
                    // InternalSasDsl.g:835:5: (otherlv_39= RULE_ID )
                    // InternalSasDsl.g:836:6: otherlv_39= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_39=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_39, grammarAccess.getDSLRestrictionAccess().getTypeDSLExecutorCrossReference_6_3_0());
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_40, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_6_4());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:853:3: (otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';' )
                    {
                    // InternalSasDsl.g:853:3: (otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';' )
                    // InternalSasDsl.g:854:4: otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';'
                    {
                    otherlv_41=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_41, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_7_0());
                    			
                    // InternalSasDsl.g:858:4: ( (otherlv_42= RULE_ID ) )
                    // InternalSasDsl.g:859:5: (otherlv_42= RULE_ID )
                    {
                    // InternalSasDsl.g:859:5: (otherlv_42= RULE_ID )
                    // InternalSasDsl.g:860:6: otherlv_42= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_42=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_42, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_7_1_0());
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_43, grammarAccess.getDSLRestrictionAccess().getMustAccessExecutorKeyword_7_2());
                    			
                    // InternalSasDsl.g:875:4: ( (otherlv_44= RULE_ID ) )
                    // InternalSasDsl.g:876:5: (otherlv_44= RULE_ID )
                    {
                    // InternalSasDsl.g:876:5: (otherlv_44= RULE_ID )
                    // InternalSasDsl.g:877:6: otherlv_44= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_44=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_44, grammarAccess.getDSLRestrictionAccess().getTypeDSLExecutorCrossReference_7_3_0());
                    					

                    }


                    }

                    otherlv_45=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_45, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_7_4());
                    			
                    // InternalSasDsl.g:892:4: ( (otherlv_46= RULE_ID ) )
                    // InternalSasDsl.g:893:5: (otherlv_46= RULE_ID )
                    {
                    // InternalSasDsl.g:893:5: (otherlv_46= RULE_ID )
                    // InternalSasDsl.g:894:6: otherlv_46= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_46=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_46, grammarAccess.getDSLRestrictionAccess().getInterfaceExecutorInterfaceCrossReference_7_5_0());
                    					

                    }


                    }

                    otherlv_47=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_47, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_7_6());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:911:3: (otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';' )
                    {
                    // InternalSasDsl.g:911:3: (otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';' )
                    // InternalSasDsl.g:912:4: otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';'
                    {
                    otherlv_48=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_48, grammarAccess.getDSLRestrictionAccess().getPlannerKeyword_8_0());
                    			
                    // InternalSasDsl.g:916:4: ( (otherlv_49= RULE_ID ) )
                    // InternalSasDsl.g:917:5: (otherlv_49= RULE_ID )
                    {
                    // InternalSasDsl.g:917:5: (otherlv_49= RULE_ID )
                    // InternalSasDsl.g:918:6: otherlv_49= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_49=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_49, grammarAccess.getDSLRestrictionAccess().getTDSLPlannerCrossReference_8_1_0());
                    					

                    }


                    }

                    otherlv_50=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_50, grammarAccess.getDSLRestrictionAccess().getMustNotAccessExecutorKeyword_8_2());
                    			
                    // InternalSasDsl.g:933:4: ( (otherlv_51= RULE_ID ) )
                    // InternalSasDsl.g:934:5: (otherlv_51= RULE_ID )
                    {
                    // InternalSasDsl.g:934:5: (otherlv_51= RULE_ID )
                    // InternalSasDsl.g:935:6: otherlv_51= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_51=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_51, grammarAccess.getDSLRestrictionAccess().getTypeDSLExecutorCrossReference_8_3_0());
                    					

                    }


                    }

                    otherlv_52=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_52, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_8_4());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:952:3: (otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';' )
                    {
                    // InternalSasDsl.g:952:3: (otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';' )
                    // InternalSasDsl.g:953:4: otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';'
                    {
                    otherlv_53=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_53, grammarAccess.getDSLRestrictionAccess().getPlannerKeyword_9_0());
                    			
                    // InternalSasDsl.g:957:4: ( (otherlv_54= RULE_ID ) )
                    // InternalSasDsl.g:958:5: (otherlv_54= RULE_ID )
                    {
                    // InternalSasDsl.g:958:5: (otherlv_54= RULE_ID )
                    // InternalSasDsl.g:959:6: otherlv_54= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_54=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_54, grammarAccess.getDSLRestrictionAccess().getTDSLPlannerCrossReference_9_1_0());
                    					

                    }


                    }

                    otherlv_55=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_55, grammarAccess.getDSLRestrictionAccess().getMustAccessExecutorKeyword_9_2());
                    			
                    // InternalSasDsl.g:974:4: ( (otherlv_56= RULE_ID ) )
                    // InternalSasDsl.g:975:5: (otherlv_56= RULE_ID )
                    {
                    // InternalSasDsl.g:975:5: (otherlv_56= RULE_ID )
                    // InternalSasDsl.g:976:6: otherlv_56= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_56=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_56, grammarAccess.getDSLRestrictionAccess().getTypeDSLExecutorCrossReference_9_3_0());
                    					

                    }


                    }

                    otherlv_57=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_57, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_9_4());
                    			
                    // InternalSasDsl.g:991:4: ( (otherlv_58= RULE_ID ) )
                    // InternalSasDsl.g:992:5: (otherlv_58= RULE_ID )
                    {
                    // InternalSasDsl.g:992:5: (otherlv_58= RULE_ID )
                    // InternalSasDsl.g:993:6: otherlv_58= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_58=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_58, grammarAccess.getDSLRestrictionAccess().getInterfaceExecutorInterfaceCrossReference_9_5_0());
                    					

                    }


                    }

                    otherlv_59=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_59, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_9_6());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:1010:3: (otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';' )
                    {
                    // InternalSasDsl.g:1010:3: (otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';' )
                    // InternalSasDsl.g:1011:4: otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';'
                    {
                    otherlv_60=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_60, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_10_0());
                    			
                    // InternalSasDsl.g:1015:4: ( (otherlv_61= RULE_ID ) )
                    // InternalSasDsl.g:1016:5: (otherlv_61= RULE_ID )
                    {
                    // InternalSasDsl.g:1016:5: (otherlv_61= RULE_ID )
                    // InternalSasDsl.g:1017:6: otherlv_61= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_61=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_61, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_10_1_0());
                    					

                    }


                    }

                    otherlv_62=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_62, grammarAccess.getDSLRestrictionAccess().getMustNotAccessKnowledgeKeyword_10_2());
                    			
                    // InternalSasDsl.g:1032:4: ( (otherlv_63= RULE_ID ) )
                    // InternalSasDsl.g:1033:5: (otherlv_63= RULE_ID )
                    {
                    // InternalSasDsl.g:1033:5: (otherlv_63= RULE_ID )
                    // InternalSasDsl.g:1034:6: otherlv_63= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_63=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_63, grammarAccess.getDSLRestrictionAccess().getTypeDSLKnowledgeCrossReference_10_3_0());
                    					

                    }


                    }

                    otherlv_64=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_64, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_10_4());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:1051:3: (otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';' )
                    {
                    // InternalSasDsl.g:1051:3: (otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';' )
                    // InternalSasDsl.g:1052:4: otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';'
                    {
                    otherlv_65=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_65, grammarAccess.getDSLRestrictionAccess().getAnalyzerKeyword_11_0());
                    			
                    // InternalSasDsl.g:1056:4: ( (otherlv_66= RULE_ID ) )
                    // InternalSasDsl.g:1057:5: (otherlv_66= RULE_ID )
                    {
                    // InternalSasDsl.g:1057:5: (otherlv_66= RULE_ID )
                    // InternalSasDsl.g:1058:6: otherlv_66= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_66=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_66, grammarAccess.getDSLRestrictionAccess().getTDSLAnalyzerCrossReference_11_1_0());
                    					

                    }


                    }

                    otherlv_67=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_67, grammarAccess.getDSLRestrictionAccess().getMustAccessKnowledgeKeyword_11_2());
                    			
                    // InternalSasDsl.g:1073:4: ( (otherlv_68= RULE_ID ) )
                    // InternalSasDsl.g:1074:5: (otherlv_68= RULE_ID )
                    {
                    // InternalSasDsl.g:1074:5: (otherlv_68= RULE_ID )
                    // InternalSasDsl.g:1075:6: otherlv_68= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_68=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_68, grammarAccess.getDSLRestrictionAccess().getTypeDSLKnowledgeCrossReference_11_3_0());
                    					

                    }


                    }

                    otherlv_69=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_69, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_11_4());
                    			
                    // InternalSasDsl.g:1090:4: ( (otherlv_70= RULE_ID ) )
                    // InternalSasDsl.g:1091:5: (otherlv_70= RULE_ID )
                    {
                    // InternalSasDsl.g:1091:5: (otherlv_70= RULE_ID )
                    // InternalSasDsl.g:1092:6: otherlv_70= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_70=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_70, grammarAccess.getDSLRestrictionAccess().getInterfaceKnowledgeInterfaceCrossReference_11_5_0());
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_71, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_11_6());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:1109:3: (otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';' )
                    {
                    // InternalSasDsl.g:1109:3: (otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';' )
                    // InternalSasDsl.g:1110:4: otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';'
                    {
                    otherlv_72=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_72, grammarAccess.getDSLRestrictionAccess().getPlannerKeyword_12_0());
                    			
                    // InternalSasDsl.g:1114:4: ( (otherlv_73= RULE_ID ) )
                    // InternalSasDsl.g:1115:5: (otherlv_73= RULE_ID )
                    {
                    // InternalSasDsl.g:1115:5: (otherlv_73= RULE_ID )
                    // InternalSasDsl.g:1116:6: otherlv_73= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_73=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_73, grammarAccess.getDSLRestrictionAccess().getTDSLPlannerCrossReference_12_1_0());
                    					

                    }


                    }

                    otherlv_74=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_74, grammarAccess.getDSLRestrictionAccess().getMustNotAccessKnowledgeKeyword_12_2());
                    			
                    // InternalSasDsl.g:1131:4: ( (otherlv_75= RULE_ID ) )
                    // InternalSasDsl.g:1132:5: (otherlv_75= RULE_ID )
                    {
                    // InternalSasDsl.g:1132:5: (otherlv_75= RULE_ID )
                    // InternalSasDsl.g:1133:6: otherlv_75= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_75=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_75, grammarAccess.getDSLRestrictionAccess().getTypeDSLKnowledgeCrossReference_12_3_0());
                    					

                    }


                    }

                    otherlv_76=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_76, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_12_4());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalSasDsl.g:1150:3: (otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';' )
                    {
                    // InternalSasDsl.g:1150:3: (otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';' )
                    // InternalSasDsl.g:1151:4: otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';'
                    {
                    otherlv_77=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_77, grammarAccess.getDSLRestrictionAccess().getPlannerKeyword_13_0());
                    			
                    // InternalSasDsl.g:1155:4: ( (otherlv_78= RULE_ID ) )
                    // InternalSasDsl.g:1156:5: (otherlv_78= RULE_ID )
                    {
                    // InternalSasDsl.g:1156:5: (otherlv_78= RULE_ID )
                    // InternalSasDsl.g:1157:6: otherlv_78= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_78=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_78, grammarAccess.getDSLRestrictionAccess().getTDSLPlannerCrossReference_13_1_0());
                    					

                    }


                    }

                    otherlv_79=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_79, grammarAccess.getDSLRestrictionAccess().getMustAccessKnowledgeKeyword_13_2());
                    			
                    // InternalSasDsl.g:1172:4: ( (otherlv_80= RULE_ID ) )
                    // InternalSasDsl.g:1173:5: (otherlv_80= RULE_ID )
                    {
                    // InternalSasDsl.g:1173:5: (otherlv_80= RULE_ID )
                    // InternalSasDsl.g:1174:6: otherlv_80= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_80=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_80, grammarAccess.getDSLRestrictionAccess().getTypeDSLKnowledgeCrossReference_13_3_0());
                    					

                    }


                    }

                    otherlv_81=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_81, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_13_4());
                    			
                    // InternalSasDsl.g:1189:4: ( (otherlv_82= RULE_ID ) )
                    // InternalSasDsl.g:1190:5: (otherlv_82= RULE_ID )
                    {
                    // InternalSasDsl.g:1190:5: (otherlv_82= RULE_ID )
                    // InternalSasDsl.g:1191:6: otherlv_82= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_82=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_82, grammarAccess.getDSLRestrictionAccess().getInterfaceKnowledgeInterfaceCrossReference_13_5_0());
                    					

                    }


                    }

                    otherlv_83=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_83, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_13_6());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalSasDsl.g:1208:3: (otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';' )
                    {
                    // InternalSasDsl.g:1208:3: (otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';' )
                    // InternalSasDsl.g:1209:4: otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';'
                    {
                    otherlv_84=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_84, grammarAccess.getDSLRestrictionAccess().getEffectorKeyword_14_0());
                    			
                    // InternalSasDsl.g:1213:4: ( (otherlv_85= RULE_ID ) )
                    // InternalSasDsl.g:1214:5: (otherlv_85= RULE_ID )
                    {
                    // InternalSasDsl.g:1214:5: (otherlv_85= RULE_ID )
                    // InternalSasDsl.g:1215:6: otherlv_85= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_85=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_85, grammarAccess.getDSLRestrictionAccess().getTDSLEffectorCrossReference_14_1_0());
                    					

                    }


                    }

                    otherlv_86=(Token)match(input,32,FOLLOW_10); 

                    				newLeafNode(otherlv_86, grammarAccess.getDSLRestrictionAccess().getMustNotAccessGaugeKeyword_14_2());
                    			
                    // InternalSasDsl.g:1230:4: ( (otherlv_87= RULE_ID ) )
                    // InternalSasDsl.g:1231:5: (otherlv_87= RULE_ID )
                    {
                    // InternalSasDsl.g:1231:5: (otherlv_87= RULE_ID )
                    // InternalSasDsl.g:1232:6: otherlv_87= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_87=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_87, grammarAccess.getDSLRestrictionAccess().getTypeDSLGaugeCrossReference_14_3_0());
                    					

                    }


                    }

                    otherlv_88=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_88, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_14_4());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalSasDsl.g:1249:3: (otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';' )
                    {
                    // InternalSasDsl.g:1249:3: (otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';' )
                    // InternalSasDsl.g:1250:4: otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';'
                    {
                    otherlv_89=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_89, grammarAccess.getDSLRestrictionAccess().getEffectorKeyword_15_0());
                    			
                    // InternalSasDsl.g:1254:4: ( (otherlv_90= RULE_ID ) )
                    // InternalSasDsl.g:1255:5: (otherlv_90= RULE_ID )
                    {
                    // InternalSasDsl.g:1255:5: (otherlv_90= RULE_ID )
                    // InternalSasDsl.g:1256:6: otherlv_90= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_90=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_90, grammarAccess.getDSLRestrictionAccess().getTDSLEffectorCrossReference_15_1_0());
                    					

                    }


                    }

                    otherlv_91=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_91, grammarAccess.getDSLRestrictionAccess().getMustAccessGaugeKeyword_15_2());
                    			
                    // InternalSasDsl.g:1271:4: ( (otherlv_92= RULE_ID ) )
                    // InternalSasDsl.g:1272:5: (otherlv_92= RULE_ID )
                    {
                    // InternalSasDsl.g:1272:5: (otherlv_92= RULE_ID )
                    // InternalSasDsl.g:1273:6: otherlv_92= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_92=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_92, grammarAccess.getDSLRestrictionAccess().getTypeDSLGaugeCrossReference_15_3_0());
                    					

                    }


                    }

                    otherlv_93=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_93, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_15_4());
                    			
                    // InternalSasDsl.g:1288:4: ( (otherlv_94= RULE_ID ) )
                    // InternalSasDsl.g:1289:5: (otherlv_94= RULE_ID )
                    {
                    // InternalSasDsl.g:1289:5: (otherlv_94= RULE_ID )
                    // InternalSasDsl.g:1290:6: otherlv_94= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_94=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_94, grammarAccess.getDSLRestrictionAccess().getInterfaceGaugeInterfaceCrossReference_15_5_0());
                    					

                    }


                    }

                    otherlv_95=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_95, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_15_6());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalSasDsl.g:1307:3: (otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';' )
                    {
                    // InternalSasDsl.g:1307:3: (otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';' )
                    // InternalSasDsl.g:1308:4: otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';'
                    {
                    otherlv_96=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_96, grammarAccess.getDSLRestrictionAccess().getManagingKeyword_16_0());
                    			
                    // InternalSasDsl.g:1312:4: ( (otherlv_97= RULE_ID ) )
                    // InternalSasDsl.g:1313:5: (otherlv_97= RULE_ID )
                    {
                    // InternalSasDsl.g:1313:5: (otherlv_97= RULE_ID )
                    // InternalSasDsl.g:1314:6: otherlv_97= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_97=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_97, grammarAccess.getDSLRestrictionAccess().getTDSLManagingCrossReference_16_1_0());
                    					

                    }


                    }

                    otherlv_98=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_98, grammarAccess.getDSLRestrictionAccess().getMustNotAccessManagedKeyword_16_2());
                    			
                    // InternalSasDsl.g:1329:4: ( (otherlv_99= RULE_ID ) )
                    // InternalSasDsl.g:1330:5: (otherlv_99= RULE_ID )
                    {
                    // InternalSasDsl.g:1330:5: (otherlv_99= RULE_ID )
                    // InternalSasDsl.g:1331:6: otherlv_99= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_99=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_99, grammarAccess.getDSLRestrictionAccess().getTypeDSLManagedCrossReference_16_3_0());
                    					

                    }


                    }

                    otherlv_100=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_100, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_16_4());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalSasDsl.g:1348:3: (otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';' )
                    {
                    // InternalSasDsl.g:1348:3: (otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';' )
                    // InternalSasDsl.g:1349:4: otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';'
                    {
                    otherlv_101=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_101, grammarAccess.getDSLRestrictionAccess().getManagingKeyword_17_0());
                    			
                    // InternalSasDsl.g:1353:4: ( (otherlv_102= RULE_ID ) )
                    // InternalSasDsl.g:1354:5: (otherlv_102= RULE_ID )
                    {
                    // InternalSasDsl.g:1354:5: (otherlv_102= RULE_ID )
                    // InternalSasDsl.g:1355:6: otherlv_102= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_102=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_102, grammarAccess.getDSLRestrictionAccess().getTDSLManagingCrossReference_17_1_0());
                    					

                    }


                    }

                    otherlv_103=(Token)match(input,36,FOLLOW_10); 

                    				newLeafNode(otherlv_103, grammarAccess.getDSLRestrictionAccess().getMustAccessManagedKeyword_17_2());
                    			
                    // InternalSasDsl.g:1370:4: ( (otherlv_104= RULE_ID ) )
                    // InternalSasDsl.g:1371:5: (otherlv_104= RULE_ID )
                    {
                    // InternalSasDsl.g:1371:5: (otherlv_104= RULE_ID )
                    // InternalSasDsl.g:1372:6: otherlv_104= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_104=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_104, grammarAccess.getDSLRestrictionAccess().getTypeDSLManagedCrossReference_17_3_0());
                    					

                    }


                    }

                    otherlv_105=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_105, grammarAccess.getDSLRestrictionAccess().getThroughInterfaceKeyword_17_4());
                    			
                    // InternalSasDsl.g:1387:4: ( (otherlv_106= RULE_ID ) )
                    // InternalSasDsl.g:1388:5: (otherlv_106= RULE_ID )
                    {
                    // InternalSasDsl.g:1388:5: (otherlv_106= RULE_ID )
                    // InternalSasDsl.g:1389:6: otherlv_106= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_106=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_106, grammarAccess.getDSLRestrictionAccess().getInterfaceManagedInterfaceCrossReference_17_5_0());
                    					

                    }


                    }

                    otherlv_107=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_107, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_17_6());
                    			

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
    // $ANTLR end "ruleDSLRestriction"


    // $ANTLR start "entryRuleDSLSensorBelongsTo"
    // InternalSasDsl.g:1409:1: entryRuleDSLSensorBelongsTo returns [EObject current=null] : iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF ;
    public final EObject entryRuleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensorBelongsTo = null;


        try {
            // InternalSasDsl.g:1409:59: (iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF )
            // InternalSasDsl.g:1410:2: iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLSensorBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLSensorBelongsTo=ruleDSLSensorBelongsTo();

            state._fsp--;

             current =iv_ruleDSLSensorBelongsTo; 
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
    // $ANTLR end "entryRuleDSLSensorBelongsTo"


    // $ANTLR start "ruleDSLSensorBelongsTo"
    // InternalSasDsl.g:1416:1: ruleDSLSensorBelongsTo returns [EObject current=null] : (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1422:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1423:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1423:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1424:3: otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorBelongsToAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:1428:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1429:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1429:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1430:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLSensorBelongsToAccess().getSensorDSLSensorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLSensorBelongsToAccess().getMustBeInMonitorKeyword_2());
            		
            // InternalSasDsl.g:1445:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1446:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1446:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1447:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLSensorBelongsToAccess().getMonitorDSLMonitorCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLSensorBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLSensorBelongsTo"


    // $ANTLR start "entryRuleDSLReferenceInputBelongsTo"
    // InternalSasDsl.g:1466:1: entryRuleDSLReferenceInputBelongsTo returns [EObject current=null] : iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF ;
    public final EObject entryRuleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInputBelongsTo = null;


        try {
            // InternalSasDsl.g:1466:67: (iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF )
            // InternalSasDsl.g:1467:2: iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLReferenceInputBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLReferenceInputBelongsTo=ruleDSLReferenceInputBelongsTo();

            state._fsp--;

             current =iv_ruleDSLReferenceInputBelongsTo; 
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
    // $ANTLR end "entryRuleDSLReferenceInputBelongsTo"


    // $ANTLR start "ruleDSLReferenceInputBelongsTo"
    // InternalSasDsl.g:1473:1: ruleDSLReferenceInputBelongsTo returns [EObject current=null] : (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1479:2: ( (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1480:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1480:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1481:3: otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputBelongsToAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:1485:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1486:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1486:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1487:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLReferenceInputBelongsToAccess().getReferenceDSLReferenceInputCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputBelongsToAccess().getMustBeInKnowledgeKeyword_2());
            		
            // InternalSasDsl.g:1502:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1503:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1503:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1504:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLReferenceInputBelongsToAccess().getKnowledgeDSLKnowledgeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLReferenceInputBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLReferenceInputBelongsTo"


    // $ANTLR start "entryRuleDSLEffectorBelongsTo"
    // InternalSasDsl.g:1523:1: entryRuleDSLEffectorBelongsTo returns [EObject current=null] : iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF ;
    public final EObject entryRuleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffectorBelongsTo = null;


        try {
            // InternalSasDsl.g:1523:61: (iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF )
            // InternalSasDsl.g:1524:2: iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLEffectorBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLEffectorBelongsTo=ruleDSLEffectorBelongsTo();

            state._fsp--;

             current =iv_ruleDSLEffectorBelongsTo; 
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
    // $ANTLR end "entryRuleDSLEffectorBelongsTo"


    // $ANTLR start "ruleDSLEffectorBelongsTo"
    // InternalSasDsl.g:1530:1: ruleDSLEffectorBelongsTo returns [EObject current=null] : (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1536:2: ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1537:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1537:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1538:3: otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorBelongsToAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:1542:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1543:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1543:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1544:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLEffectorBelongsToAccess().getEffectorDSLEffectorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLEffectorBelongsToAccess().getMustBeInExecutorKeyword_2());
            		
            // InternalSasDsl.g:1559:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1560:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1560:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1561:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLEffectorBelongsToAccess().getExecutorDSLExecutorCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLEffectorBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLEffectorBelongsTo"


    // $ANTLR start "entryRuleDSLMonitorBelongsTo1"
    // InternalSasDsl.g:1580:1: entryRuleDSLMonitorBelongsTo1 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1580:61: (iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF )
            // InternalSasDsl.g:1581:2: iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLMonitorBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMonitorBelongsTo1=ruleDSLMonitorBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLMonitorBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLMonitorBelongsTo1"


    // $ANTLR start "ruleDSLMonitorBelongsTo1"
    // InternalSasDsl.g:1587:1: ruleDSLMonitorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1593:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1594:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1594:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1595:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo1Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1599:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1600:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1600:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1601:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMonitorBelongsTo1Access().getMonitorDSLMonitorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMonitorBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1616:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1617:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1617:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1618:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMonitorBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMonitorBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLMonitorBelongsTo1"


    // $ANTLR start "entryRuleDSLMonitorBelongsTo2"
    // InternalSasDsl.g:1637:1: entryRuleDSLMonitorBelongsTo2 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1637:61: (iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF )
            // InternalSasDsl.g:1638:2: iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLMonitorBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMonitorBelongsTo2=ruleDSLMonitorBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLMonitorBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLMonitorBelongsTo2"


    // $ANTLR start "ruleDSLMonitorBelongsTo2"
    // InternalSasDsl.g:1644:1: ruleDSLMonitorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1650:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1651:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1651:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1652:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo2Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1656:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1657:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1657:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1658:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMonitorBelongsTo2Access().getMonitorDSLMonitorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMonitorBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1673:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1674:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1674:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1675:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMonitorBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMonitorBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLMonitorBelongsTo2"


    // $ANTLR start "entryRuleDSLAnalyzerBelongsTo1"
    // InternalSasDsl.g:1694:1: entryRuleDSLAnalyzerBelongsTo1 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1694:62: (iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF )
            // InternalSasDsl.g:1695:2: iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLAnalyzerBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAnalyzerBelongsTo1=ruleDSLAnalyzerBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLAnalyzerBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLAnalyzerBelongsTo1"


    // $ANTLR start "ruleDSLAnalyzerBelongsTo1"
    // InternalSasDsl.g:1701:1: ruleDSLAnalyzerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1707:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1708:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1708:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1709:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo1Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1713:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1714:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1714:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1715:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLAnalyzerBelongsTo1Access().getAnalyzerDSLAnalyzerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1730:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1731:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1731:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1732:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLAnalyzerBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLAnalyzerBelongsTo1"


    // $ANTLR start "entryRuleDSLAnalyzerBelongsTo2"
    // InternalSasDsl.g:1751:1: entryRuleDSLAnalyzerBelongsTo2 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1751:62: (iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF )
            // InternalSasDsl.g:1752:2: iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLAnalyzerBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAnalyzerBelongsTo2=ruleDSLAnalyzerBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLAnalyzerBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLAnalyzerBelongsTo2"


    // $ANTLR start "ruleDSLAnalyzerBelongsTo2"
    // InternalSasDsl.g:1758:1: ruleDSLAnalyzerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1764:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1765:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1765:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1766:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo2Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1770:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1771:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1771:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1772:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLAnalyzerBelongsTo2Access().getAnalyzerDSLAnalyzerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1787:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1788:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1788:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1789:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLAnalyzerBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLAnalyzerBelongsTo2"


    // $ANTLR start "entryRuleDSLPlannerBelongsTo1"
    // InternalSasDsl.g:1808:1: entryRuleDSLPlannerBelongsTo1 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1808:61: (iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF )
            // InternalSasDsl.g:1809:2: iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLPlannerBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLPlannerBelongsTo1=ruleDSLPlannerBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLPlannerBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLPlannerBelongsTo1"


    // $ANTLR start "ruleDSLPlannerBelongsTo1"
    // InternalSasDsl.g:1815:1: ruleDSLPlannerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1821:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1822:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1822:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1823:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo1Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1827:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1828:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1828:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1829:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLPlannerBelongsTo1Access().getPlannerDSLPlannerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLPlannerBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1844:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1845:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1845:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1846:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLPlannerBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLPlannerBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLPlannerBelongsTo1"


    // $ANTLR start "entryRuleDSLPlannerBelongsTo2"
    // InternalSasDsl.g:1865:1: entryRuleDSLPlannerBelongsTo2 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1865:61: (iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF )
            // InternalSasDsl.g:1866:2: iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLPlannerBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLPlannerBelongsTo2=ruleDSLPlannerBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLPlannerBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLPlannerBelongsTo2"


    // $ANTLR start "ruleDSLPlannerBelongsTo2"
    // InternalSasDsl.g:1872:1: ruleDSLPlannerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1878:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1879:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1879:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1880:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo2Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1884:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1885:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1885:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1886:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLPlannerBelongsTo2Access().getPlannerDSLPlannerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLPlannerBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1901:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1902:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1902:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1903:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLPlannerBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLPlannerBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLPlannerBelongsTo2"


    // $ANTLR start "entryRuleDSLExecutorBelongsTo1"
    // InternalSasDsl.g:1922:1: entryRuleDSLExecutorBelongsTo1 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1922:62: (iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF )
            // InternalSasDsl.g:1923:2: iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLExecutorBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLExecutorBelongsTo1=ruleDSLExecutorBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLExecutorBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLExecutorBelongsTo1"


    // $ANTLR start "ruleDSLExecutorBelongsTo1"
    // InternalSasDsl.g:1929:1: ruleDSLExecutorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1935:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1936:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1936:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1937:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo1Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:1941:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1942:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1942:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1943:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLExecutorBelongsTo1Access().getExecutorDSLExecutorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLExecutorBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1958:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1959:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1959:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1960:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLExecutorBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLExecutorBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLExecutorBelongsTo1"


    // $ANTLR start "entryRuleDSLExecutorBelongsTo2"
    // InternalSasDsl.g:1979:1: entryRuleDSLExecutorBelongsTo2 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1979:62: (iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF )
            // InternalSasDsl.g:1980:2: iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLExecutorBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLExecutorBelongsTo2=ruleDSLExecutorBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLExecutorBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLExecutorBelongsTo2"


    // $ANTLR start "ruleDSLExecutorBelongsTo2"
    // InternalSasDsl.g:1986:1: ruleDSLExecutorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1992:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1993:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1993:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1994:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo2Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:1998:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1999:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1999:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2000:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLExecutorBelongsTo2Access().getExecutorDSLExecutorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLExecutorBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:2015:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2016:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2016:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2017:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLExecutorBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLExecutorBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLExecutorBelongsTo2"


    // $ANTLR start "entryRuleDSLClBelongsTo1"
    // InternalSasDsl.g:2036:1: entryRuleDSLClBelongsTo1 returns [EObject current=null] : iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF ;
    public final EObject entryRuleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo1 = null;


        try {
            // InternalSasDsl.g:2036:56: (iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF )
            // InternalSasDsl.g:2037:2: iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF
            {
             newCompositeNode(grammarAccess.getDSLClBelongsTo1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLClBelongsTo1=ruleDSLClBelongsTo1();

            state._fsp--;

             current =iv_ruleDSLClBelongsTo1; 
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
    // $ANTLR end "entryRuleDSLClBelongsTo1"


    // $ANTLR start "ruleDSLClBelongsTo1"
    // InternalSasDsl.g:2043:1: ruleDSLClBelongsTo1 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2049:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2050:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2050:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2051:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo1Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2055:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2056:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2056:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2057:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClBelongsTo1Access().getClDSLControlLoopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClBelongsTo1Access().getMustBeInControlLoopManagerKeyword_2());
            		
            // InternalSasDsl.g:2072:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2073:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2073:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2074:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClBelongsTo1Access().getClmDSLControlLoopManagerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLClBelongsTo1Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLClBelongsTo1"


    // $ANTLR start "entryRuleDSLClBelongsTo2"
    // InternalSasDsl.g:2093:1: entryRuleDSLClBelongsTo2 returns [EObject current=null] : iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF ;
    public final EObject entryRuleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo2 = null;


        try {
            // InternalSasDsl.g:2093:56: (iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF )
            // InternalSasDsl.g:2094:2: iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF
            {
             newCompositeNode(grammarAccess.getDSLClBelongsTo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLClBelongsTo2=ruleDSLClBelongsTo2();

            state._fsp--;

             current =iv_ruleDSLClBelongsTo2; 
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
    // $ANTLR end "entryRuleDSLClBelongsTo2"


    // $ANTLR start "ruleDSLClBelongsTo2"
    // InternalSasDsl.g:2100:1: ruleDSLClBelongsTo2 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2106:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2107:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2107:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2108:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo2Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2112:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2113:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2113:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2114:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClBelongsTo2Access().getClDSLControlLoopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:2129:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2130:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2130:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2131:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLClBelongsTo2Access().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLClBelongsTo2"


    // $ANTLR start "entryRuleDSLClmBelongsTo"
    // InternalSasDsl.g:2150:1: entryRuleDSLClmBelongsTo returns [EObject current=null] : iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF ;
    public final EObject entryRuleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClmBelongsTo = null;


        try {
            // InternalSasDsl.g:2150:56: (iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF )
            // InternalSasDsl.g:2151:2: iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLClmBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLClmBelongsTo=ruleDSLClmBelongsTo();

            state._fsp--;

             current =iv_ruleDSLClmBelongsTo; 
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
    // $ANTLR end "entryRuleDSLClmBelongsTo"


    // $ANTLR start "ruleDSLClmBelongsTo"
    // InternalSasDsl.g:2157:1: ruleDSLClmBelongsTo returns [EObject current=null] : (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2163:2: ( (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2164:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2164:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2165:3: otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClmBelongsToAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:2169:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2170:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2170:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2171:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClmBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClmBelongsToAccess().getClDSLControlLoopManagerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClmBelongsToAccess().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:2186:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2187:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2187:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2188:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClmBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClmBelongsToAccess().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLClmBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLClmBelongsTo"


    // $ANTLR start "entryRuleDSLMeasuredOuputBelongsTo"
    // InternalSasDsl.g:2207:1: entryRuleDSLMeasuredOuputBelongsTo returns [EObject current=null] : iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF ;
    public final EObject entryRuleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOuputBelongsTo = null;


        try {
            // InternalSasDsl.g:2207:66: (iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF )
            // InternalSasDsl.g:2208:2: iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLMeasuredOuputBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMeasuredOuputBelongsTo=ruleDSLMeasuredOuputBelongsTo();

            state._fsp--;

             current =iv_ruleDSLMeasuredOuputBelongsTo; 
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
    // $ANTLR end "entryRuleDSLMeasuredOuputBelongsTo"


    // $ANTLR start "ruleDSLMeasuredOuputBelongsTo"
    // InternalSasDsl.g:2214:1: ruleDSLMeasuredOuputBelongsTo returns [EObject current=null] : (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2220:2: ( (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2221:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2221:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2222:3: otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:2226:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2227:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2227:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2228:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOuputBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMeasuredDSLMeasuredOutputCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:2243:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2244:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2244:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2245:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOuputBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLMeasuredOuputBelongsTo"


    // $ANTLR start "entryRuleDSLGaugeBelongsTo"
    // InternalSasDsl.g:2264:1: entryRuleDSLGaugeBelongsTo returns [EObject current=null] : iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF ;
    public final EObject entryRuleDSLGaugeBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGaugeBelongsTo = null;


        try {
            // InternalSasDsl.g:2264:58: (iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF )
            // InternalSasDsl.g:2265:2: iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLGaugeBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLGaugeBelongsTo=ruleDSLGaugeBelongsTo();

            state._fsp--;

             current =iv_ruleDSLGaugeBelongsTo; 
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
    // $ANTLR end "entryRuleDSLGaugeBelongsTo"


    // $ANTLR start "ruleDSLGaugeBelongsTo"
    // InternalSasDsl.g:2271:1: ruleDSLGaugeBelongsTo returns [EObject current=null] : (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLGaugeBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2277:2: ( (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2278:2: (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2278:2: (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2279:3: otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGaugeBelongsToAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:2283:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2284:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2284:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2285:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLGaugeBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLGaugeBelongsToAccess().getGaugeDSLGaugeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLGaugeBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:2300:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2301:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2301:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2302:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLGaugeBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLGaugeBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLGaugeBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLGaugeBelongsTo"


    // $ANTLR start "entryRuleDSLProbeBelongsTo"
    // InternalSasDsl.g:2321:1: entryRuleDSLProbeBelongsTo returns [EObject current=null] : iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF ;
    public final EObject entryRuleDSLProbeBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProbeBelongsTo = null;


        try {
            // InternalSasDsl.g:2321:58: (iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF )
            // InternalSasDsl.g:2322:2: iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getDSLProbeBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLProbeBelongsTo=ruleDSLProbeBelongsTo();

            state._fsp--;

             current =iv_ruleDSLProbeBelongsTo; 
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
    // $ANTLR end "entryRuleDSLProbeBelongsTo"


    // $ANTLR start "ruleDSLProbeBelongsTo"
    // InternalSasDsl.g:2328:1: ruleDSLProbeBelongsTo returns [EObject current=null] : (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLProbeBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2334:2: ( (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2335:2: (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2335:2: (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2336:3: otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLProbeBelongsToAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:2340:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2341:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2341:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2342:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLProbeBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLProbeBelongsToAccess().getProbeDSLProbeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLProbeBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:2357:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2358:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2358:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2359:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLProbeBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLProbeBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLProbeBelongsToAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDSLProbeBelongsTo"


    // $ANTLR start "entryRuleDSLManaging"
    // InternalSasDsl.g:2378:1: entryRuleDSLManaging returns [EObject current=null] : iv_ruleDSLManaging= ruleDSLManaging EOF ;
    public final EObject entryRuleDSLManaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaging = null;


        try {
            // InternalSasDsl.g:2378:52: (iv_ruleDSLManaging= ruleDSLManaging EOF )
            // InternalSasDsl.g:2379:2: iv_ruleDSLManaging= ruleDSLManaging EOF
            {
             newCompositeNode(grammarAccess.getDSLManagingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLManaging=ruleDSLManaging();

            state._fsp--;

             current =iv_ruleDSLManaging; 
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
    // $ANTLR end "entryRuleDSLManaging"


    // $ANTLR start "ruleDSLManaging"
    // InternalSasDsl.g:2385:1: ruleDSLManaging returns [EObject current=null] : (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLManaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2391:2: ( (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:2392:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:2392:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:2393:3: otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagingAccess().getManagingKeyword_0());
            		
            // InternalSasDsl.g:2397:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2398:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2398:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2399:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLManagingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLManagingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLManagingAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleDSLManaging"


    // $ANTLR start "entryRuleDSLManaged"
    // InternalSasDsl.g:2423:1: entryRuleDSLManaged returns [EObject current=null] : iv_ruleDSLManaged= ruleDSLManaged EOF ;
    public final EObject entryRuleDSLManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaged = null;


        try {
            // InternalSasDsl.g:2423:51: (iv_ruleDSLManaged= ruleDSLManaged EOF )
            // InternalSasDsl.g:2424:2: iv_ruleDSLManaged= ruleDSLManaged EOF
            {
             newCompositeNode(grammarAccess.getDSLManagedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLManaged=ruleDSLManaged();

            state._fsp--;

             current =iv_ruleDSLManaged; 
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
    // $ANTLR end "entryRuleDSLManaged"


    // $ANTLR start "ruleDSLManaged"
    // InternalSasDsl.g:2430:1: ruleDSLManaged returns [EObject current=null] : (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2436:2: ( (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2437:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2437:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2438:3: otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagedAccess().getManagedKeyword_0());
            		
            // InternalSasDsl.g:2442:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2443:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2443:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2444:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLManagedAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLManagedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2460:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSasDsl.g:2461:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLManagedAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2465:4: ( (lv_interface_3_0= ruleManagedInterface ) )
                    // InternalSasDsl.g:2466:5: (lv_interface_3_0= ruleManagedInterface )
                    {
                    // InternalSasDsl.g:2466:5: (lv_interface_3_0= ruleManagedInterface )
                    // InternalSasDsl.g:2467:6: lv_interface_3_0= ruleManagedInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLManagedAccess().getInterfaceManagedInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleManagedInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLManagedRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ManagedInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2484:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==55) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSasDsl.g:2485:5: otherlv_4= ',' ( (lv_interface_5_0= ruleManagedInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLManagedAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2489:5: ( (lv_interface_5_0= ruleManagedInterface ) )
                    	    // InternalSasDsl.g:2490:6: (lv_interface_5_0= ruleManagedInterface )
                    	    {
                    	    // InternalSasDsl.g:2490:6: (lv_interface_5_0= ruleManagedInterface )
                    	    // InternalSasDsl.g:2491:7: lv_interface_5_0= ruleManagedInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLManagedAccess().getInterfaceManagedInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleManagedInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLManagedRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ManagedInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLManagedAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLManaged"


    // $ANTLR start "entryRuleDSLControlLoopManager"
    // InternalSasDsl.g:2518:1: entryRuleDSLControlLoopManager returns [EObject current=null] : iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF ;
    public final EObject entryRuleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoopManager = null;


        try {
            // InternalSasDsl.g:2518:62: (iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF )
            // InternalSasDsl.g:2519:2: iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF
            {
             newCompositeNode(grammarAccess.getDSLControlLoopManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLControlLoopManager=ruleDSLControlLoopManager();

            state._fsp--;

             current =iv_ruleDSLControlLoopManager; 
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
    // $ANTLR end "entryRuleDSLControlLoopManager"


    // $ANTLR start "ruleDSLControlLoopManager"
    // InternalSasDsl.g:2525:1: ruleDSLControlLoopManager returns [EObject current=null] : (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_interface_5_0 = null;

        EObject lv_interface_7_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2531:2: ( (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' ) )
            // InternalSasDsl.g:2532:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' )
            {
            // InternalSasDsl.g:2532:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' )
            // InternalSasDsl.g:2533:3: otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopManagerAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:2537:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2538:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2538:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2539:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLControlLoopManagerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLControlLoopManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopManagerAccess().getTypeOfKeyword_2());
            		

            			newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getDSLTypeCLMParserRuleCall_3());
            		
            pushFollow(FOLLOW_34);
            ruleDSLTypeCLM();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSasDsl.g:2566:3: (otherlv_4= 'with-interface' ( (lv_interface_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==54) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSasDsl.g:2567:4: otherlv_4= 'with-interface' ( (lv_interface_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )*
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopManagerAccess().getWithInterfaceKeyword_4_0());
                    			
                    // InternalSasDsl.g:2571:4: ( (lv_interface_5_0= ruleControlLoopManagerInterface ) )
                    // InternalSasDsl.g:2572:5: (lv_interface_5_0= ruleControlLoopManagerInterface )
                    {
                    // InternalSasDsl.g:2572:5: (lv_interface_5_0= ruleControlLoopManagerInterface )
                    // InternalSasDsl.g:2573:6: lv_interface_5_0= ruleControlLoopManagerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getInterfaceControlLoopManagerInterfaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_5_0=ruleControlLoopManagerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLControlLoopManagerRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_5_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopManagerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2590:4: (otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==55) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSasDsl.g:2591:5: otherlv_6= ',' ( (lv_interface_7_0= ruleControlLoopManagerInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDSLControlLoopManagerAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSasDsl.g:2595:5: ( (lv_interface_7_0= ruleControlLoopManagerInterface ) )
                    	    // InternalSasDsl.g:2596:6: (lv_interface_7_0= ruleControlLoopManagerInterface )
                    	    {
                    	    // InternalSasDsl.g:2596:6: (lv_interface_7_0= ruleControlLoopManagerInterface )
                    	    // InternalSasDsl.g:2597:7: lv_interface_7_0= ruleControlLoopManagerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getInterfaceControlLoopManagerInterfaceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_7_0=ruleControlLoopManagerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLControlLoopManagerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_7_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopManagerInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDSLControlLoopManagerAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleDSLControlLoopManager"


    // $ANTLR start "entryRuleDSLTypeCLM"
    // InternalSasDsl.g:2624:1: entryRuleDSLTypeCLM returns [String current=null] : iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF ;
    public final String entryRuleDSLTypeCLM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDSLTypeCLM = null;


        try {
            // InternalSasDsl.g:2624:50: (iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF )
            // InternalSasDsl.g:2625:2: iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF
            {
             newCompositeNode(grammarAccess.getDSLTypeCLMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLTypeCLM=ruleDSLTypeCLM();

            state._fsp--;

             current =iv_ruleDSLTypeCLM.getText(); 
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
    // $ANTLR end "entryRuleDSLTypeCLM"


    // $ANTLR start "ruleDSLTypeCLM"
    // InternalSasDsl.g:2631:1: ruleDSLTypeCLM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) ;
    public final AntlrDatatypeRuleToken ruleDSLTypeCLM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2637:2: ( (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) )
            // InternalSasDsl.g:2638:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            {
            // InternalSasDsl.g:2638:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt11=1;
                }
                break;
            case 59:
                {
                alt11=2;
                }
                break;
            case 60:
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
                    // InternalSasDsl.g:2639:3: kw= 'Synchronized'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getSynchronizedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:2645:3: kw= 'Coordinated'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getCoordinatedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:2651:3: kw= 'Independent'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getIndependentKeyword_2());
                    		

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
    // $ANTLR end "ruleDSLTypeCLM"


    // $ANTLR start "entryRuleDSLControlLoop"
    // InternalSasDsl.g:2660:1: entryRuleDSLControlLoop returns [EObject current=null] : iv_ruleDSLControlLoop= ruleDSLControlLoop EOF ;
    public final EObject entryRuleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoop = null;


        try {
            // InternalSasDsl.g:2660:55: (iv_ruleDSLControlLoop= ruleDSLControlLoop EOF )
            // InternalSasDsl.g:2661:2: iv_ruleDSLControlLoop= ruleDSLControlLoop EOF
            {
             newCompositeNode(grammarAccess.getDSLControlLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLControlLoop=ruleDSLControlLoop();

            state._fsp--;

             current =iv_ruleDSLControlLoop; 
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
    // $ANTLR end "entryRuleDSLControlLoop"


    // $ANTLR start "ruleDSLControlLoop"
    // InternalSasDsl.g:2667:1: ruleDSLControlLoop returns [EObject current=null] : (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2673:2: ( (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2674:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2674:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2675:3: otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopAccess().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2679:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2680:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2680:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2681:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLControlLoopAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLControlLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2697:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==54) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSasDsl.g:2698:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2702:4: ( (lv_interface_3_0= ruleControlLoopInterface ) )
                    // InternalSasDsl.g:2703:5: (lv_interface_3_0= ruleControlLoopInterface )
                    {
                    // InternalSasDsl.g:2703:5: (lv_interface_3_0= ruleControlLoopInterface )
                    // InternalSasDsl.g:2704:6: lv_interface_3_0= ruleControlLoopInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLControlLoopAccess().getInterfaceControlLoopInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleControlLoopInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLControlLoopRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2721:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==55) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSasDsl.g:2722:5: otherlv_4= ',' ( (lv_interface_5_0= ruleControlLoopInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2726:5: ( (lv_interface_5_0= ruleControlLoopInterface ) )
                    	    // InternalSasDsl.g:2727:6: (lv_interface_5_0= ruleControlLoopInterface )
                    	    {
                    	    // InternalSasDsl.g:2727:6: (lv_interface_5_0= ruleControlLoopInterface )
                    	    // InternalSasDsl.g:2728:7: lv_interface_5_0= ruleControlLoopInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLControlLoopAccess().getInterfaceControlLoopInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleControlLoopInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLControlLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLControlLoopAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLControlLoop"


    // $ANTLR start "entryRuleDSLMonitor"
    // InternalSasDsl.g:2755:1: entryRuleDSLMonitor returns [EObject current=null] : iv_ruleDSLMonitor= ruleDSLMonitor EOF ;
    public final EObject entryRuleDSLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitor = null;


        try {
            // InternalSasDsl.g:2755:51: (iv_ruleDSLMonitor= ruleDSLMonitor EOF )
            // InternalSasDsl.g:2756:2: iv_ruleDSLMonitor= ruleDSLMonitor EOF
            {
             newCompositeNode(grammarAccess.getDSLMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMonitor=ruleDSLMonitor();

            state._fsp--;

             current =iv_ruleDSLMonitor; 
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
    // $ANTLR end "entryRuleDSLMonitor"


    // $ANTLR start "ruleDSLMonitor"
    // InternalSasDsl.g:2762:1: ruleDSLMonitor returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2768:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2769:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2769:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2770:3: otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:2774:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2775:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2775:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2776:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLMonitorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2792:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSasDsl.g:2793:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMonitorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2797:4: ( (lv_interface_3_0= ruleMonitorInterface ) )
                    // InternalSasDsl.g:2798:5: (lv_interface_3_0= ruleMonitorInterface )
                    {
                    // InternalSasDsl.g:2798:5: (lv_interface_3_0= ruleMonitorInterface )
                    // InternalSasDsl.g:2799:6: lv_interface_3_0= ruleMonitorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLMonitorAccess().getInterfaceMonitorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleMonitorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLMonitorRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.MonitorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2816:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==55) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSasDsl.g:2817:5: otherlv_4= ',' ( (lv_interface_5_0= ruleMonitorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLMonitorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2821:5: ( (lv_interface_5_0= ruleMonitorInterface ) )
                    	    // InternalSasDsl.g:2822:6: (lv_interface_5_0= ruleMonitorInterface )
                    	    {
                    	    // InternalSasDsl.g:2822:6: (lv_interface_5_0= ruleMonitorInterface )
                    	    // InternalSasDsl.g:2823:7: lv_interface_5_0= ruleMonitorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLMonitorAccess().getInterfaceMonitorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleMonitorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLMonitorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.MonitorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLMonitorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLMonitor"


    // $ANTLR start "entryRuleDSLAnalyzer"
    // InternalSasDsl.g:2850:1: entryRuleDSLAnalyzer returns [EObject current=null] : iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF ;
    public final EObject entryRuleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzer = null;


        try {
            // InternalSasDsl.g:2850:52: (iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF )
            // InternalSasDsl.g:2851:2: iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF
            {
             newCompositeNode(grammarAccess.getDSLAnalyzerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAnalyzer=ruleDSLAnalyzer();

            state._fsp--;

             current =iv_ruleDSLAnalyzer; 
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
    // $ANTLR end "entryRuleDSLAnalyzer"


    // $ANTLR start "ruleDSLAnalyzer"
    // InternalSasDsl.g:2857:1: ruleDSLAnalyzer returns [EObject current=null] : (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2863:2: ( (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2864:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2864:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2865:3: otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:2869:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2870:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2870:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2871:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLAnalyzerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2887:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSasDsl.g:2888:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleAnalyzerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2892:4: ( (lv_interface_3_0= ruleAnalyzerInterface ) )
                    // InternalSasDsl.g:2893:5: (lv_interface_3_0= ruleAnalyzerInterface )
                    {
                    // InternalSasDsl.g:2893:5: (lv_interface_3_0= ruleAnalyzerInterface )
                    // InternalSasDsl.g:2894:6: lv_interface_3_0= ruleAnalyzerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLAnalyzerAccess().getInterfaceAnalyzerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleAnalyzerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLAnalyzerRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.AnalyzerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2911:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==55) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSasDsl.g:2912:5: otherlv_4= ',' ( (lv_interface_5_0= ruleAnalyzerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2916:5: ( (lv_interface_5_0= ruleAnalyzerInterface ) )
                    	    // InternalSasDsl.g:2917:6: (lv_interface_5_0= ruleAnalyzerInterface )
                    	    {
                    	    // InternalSasDsl.g:2917:6: (lv_interface_5_0= ruleAnalyzerInterface )
                    	    // InternalSasDsl.g:2918:7: lv_interface_5_0= ruleAnalyzerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLAnalyzerAccess().getInterfaceAnalyzerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleAnalyzerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLAnalyzerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.AnalyzerInterface");
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
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLAnalyzerAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLAnalyzer"


    // $ANTLR start "entryRuleDSLPlanner"
    // InternalSasDsl.g:2945:1: entryRuleDSLPlanner returns [EObject current=null] : iv_ruleDSLPlanner= ruleDSLPlanner EOF ;
    public final EObject entryRuleDSLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlanner = null;


        try {
            // InternalSasDsl.g:2945:51: (iv_ruleDSLPlanner= ruleDSLPlanner EOF )
            // InternalSasDsl.g:2946:2: iv_ruleDSLPlanner= ruleDSLPlanner EOF
            {
             newCompositeNode(grammarAccess.getDSLPlannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLPlanner=ruleDSLPlanner();

            state._fsp--;

             current =iv_ruleDSLPlanner; 
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
    // $ANTLR end "entryRuleDSLPlanner"


    // $ANTLR start "ruleDSLPlanner"
    // InternalSasDsl.g:2952:1: ruleDSLPlanner returns [EObject current=null] : (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2958:2: ( (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2959:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2959:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2960:3: otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:2964:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2965:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2965:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2966:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLPlannerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:2982:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSasDsl.g:2983:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLPlannerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2987:4: ( (lv_interface_3_0= rulePlannerInterface ) )
                    // InternalSasDsl.g:2988:5: (lv_interface_3_0= rulePlannerInterface )
                    {
                    // InternalSasDsl.g:2988:5: (lv_interface_3_0= rulePlannerInterface )
                    // InternalSasDsl.g:2989:6: lv_interface_3_0= rulePlannerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLPlannerAccess().getInterfacePlannerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=rulePlannerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLPlannerRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.PlannerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3006:4: (otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==55) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSasDsl.g:3007:5: otherlv_4= ',' ( (lv_interface_5_0= rulePlannerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLPlannerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3011:5: ( (lv_interface_5_0= rulePlannerInterface ) )
                    	    // InternalSasDsl.g:3012:6: (lv_interface_5_0= rulePlannerInterface )
                    	    {
                    	    // InternalSasDsl.g:3012:6: (lv_interface_5_0= rulePlannerInterface )
                    	    // InternalSasDsl.g:3013:7: lv_interface_5_0= rulePlannerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLPlannerAccess().getInterfacePlannerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=rulePlannerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLPlannerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.PlannerInterface");
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
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLPlannerAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLPlanner"


    // $ANTLR start "entryRuleDSLExecutor"
    // InternalSasDsl.g:3040:1: entryRuleDSLExecutor returns [EObject current=null] : iv_ruleDSLExecutor= ruleDSLExecutor EOF ;
    public final EObject entryRuleDSLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutor = null;


        try {
            // InternalSasDsl.g:3040:52: (iv_ruleDSLExecutor= ruleDSLExecutor EOF )
            // InternalSasDsl.g:3041:2: iv_ruleDSLExecutor= ruleDSLExecutor EOF
            {
             newCompositeNode(grammarAccess.getDSLExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLExecutor=ruleDSLExecutor();

            state._fsp--;

             current =iv_ruleDSLExecutor; 
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
    // $ANTLR end "entryRuleDSLExecutor"


    // $ANTLR start "ruleDSLExecutor"
    // InternalSasDsl.g:3047:1: ruleDSLExecutor returns [EObject current=null] : (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3053:2: ( (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3054:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3054:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3055:3: otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:3059:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3060:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3060:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3061:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLExecutorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3077:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==54) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSasDsl.g:3078:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLExecutorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3082:4: ( (lv_interface_3_0= ruleExecutorInterface ) )
                    // InternalSasDsl.g:3083:5: (lv_interface_3_0= ruleExecutorInterface )
                    {
                    // InternalSasDsl.g:3083:5: (lv_interface_3_0= ruleExecutorInterface )
                    // InternalSasDsl.g:3084:6: lv_interface_3_0= ruleExecutorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLExecutorAccess().getInterfaceExecutorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleExecutorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLExecutorRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ExecutorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3101:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==55) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSasDsl.g:3102:5: otherlv_4= ',' ( (lv_interface_5_0= ruleExecutorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLExecutorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3106:5: ( (lv_interface_5_0= ruleExecutorInterface ) )
                    	    // InternalSasDsl.g:3107:6: (lv_interface_5_0= ruleExecutorInterface )
                    	    {
                    	    // InternalSasDsl.g:3107:6: (lv_interface_5_0= ruleExecutorInterface )
                    	    // InternalSasDsl.g:3108:7: lv_interface_5_0= ruleExecutorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLExecutorAccess().getInterfaceExecutorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleExecutorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLExecutorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ExecutorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLExecutorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLExecutor"


    // $ANTLR start "entryRuleDSLKnowledge"
    // InternalSasDsl.g:3135:1: entryRuleDSLKnowledge returns [EObject current=null] : iv_ruleDSLKnowledge= ruleDSLKnowledge EOF ;
    public final EObject entryRuleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLKnowledge = null;


        try {
            // InternalSasDsl.g:3135:53: (iv_ruleDSLKnowledge= ruleDSLKnowledge EOF )
            // InternalSasDsl.g:3136:2: iv_ruleDSLKnowledge= ruleDSLKnowledge EOF
            {
             newCompositeNode(grammarAccess.getDSLKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLKnowledge=ruleDSLKnowledge();

            state._fsp--;

             current =iv_ruleDSLKnowledge; 
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
    // $ANTLR end "entryRuleDSLKnowledge"


    // $ANTLR start "ruleDSLKnowledge"
    // InternalSasDsl.g:3142:1: ruleDSLKnowledge returns [EObject current=null] : (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3148:2: ( (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3149:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3149:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3150:3: otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:3154:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3155:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3155:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3156:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLKnowledgeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLKnowledgeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3172:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSasDsl.g:3173:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLKnowledgeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3177:4: ( (lv_interface_3_0= ruleKnowledgeInterface ) )
                    // InternalSasDsl.g:3178:5: (lv_interface_3_0= ruleKnowledgeInterface )
                    {
                    // InternalSasDsl.g:3178:5: (lv_interface_3_0= ruleKnowledgeInterface )
                    // InternalSasDsl.g:3179:6: lv_interface_3_0= ruleKnowledgeInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getInterfaceKnowledgeInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleKnowledgeInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLKnowledgeRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.KnowledgeInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3196:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==55) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSasDsl.g:3197:5: otherlv_4= ',' ( (lv_interface_5_0= ruleKnowledgeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLKnowledgeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3201:5: ( (lv_interface_5_0= ruleKnowledgeInterface ) )
                    	    // InternalSasDsl.g:3202:6: (lv_interface_5_0= ruleKnowledgeInterface )
                    	    {
                    	    // InternalSasDsl.g:3202:6: (lv_interface_5_0= ruleKnowledgeInterface )
                    	    // InternalSasDsl.g:3203:7: lv_interface_5_0= ruleKnowledgeInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getInterfaceKnowledgeInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleKnowledgeInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLKnowledgeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.KnowledgeInterface");
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
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLKnowledgeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLKnowledge"


    // $ANTLR start "entryRuleDSLSensor"
    // InternalSasDsl.g:3230:1: entryRuleDSLSensor returns [EObject current=null] : iv_ruleDSLSensor= ruleDSLSensor EOF ;
    public final EObject entryRuleDSLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensor = null;


        try {
            // InternalSasDsl.g:3230:50: (iv_ruleDSLSensor= ruleDSLSensor EOF )
            // InternalSasDsl.g:3231:2: iv_ruleDSLSensor= ruleDSLSensor EOF
            {
             newCompositeNode(grammarAccess.getDSLSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLSensor=ruleDSLSensor();

            state._fsp--;

             current =iv_ruleDSLSensor; 
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
    // $ANTLR end "entryRuleDSLSensor"


    // $ANTLR start "ruleDSLSensor"
    // InternalSasDsl.g:3237:1: ruleDSLSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3243:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3244:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3244:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3245:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:3249:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3250:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3250:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3251:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3267:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSasDsl.g:3268:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleSensorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLSensorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3272:4: ( (lv_interface_3_0= ruleSensorInterface ) )
                    // InternalSasDsl.g:3273:5: (lv_interface_3_0= ruleSensorInterface )
                    {
                    // InternalSasDsl.g:3273:5: (lv_interface_3_0= ruleSensorInterface )
                    // InternalSasDsl.g:3274:6: lv_interface_3_0= ruleSensorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLSensorAccess().getInterfaceSensorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleSensorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLSensorRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.SensorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3291:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==55) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSasDsl.g:3292:5: otherlv_4= ',' ( (lv_interface_5_0= ruleSensorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLSensorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3296:5: ( (lv_interface_5_0= ruleSensorInterface ) )
                    	    // InternalSasDsl.g:3297:6: (lv_interface_5_0= ruleSensorInterface )
                    	    {
                    	    // InternalSasDsl.g:3297:6: (lv_interface_5_0= ruleSensorInterface )
                    	    // InternalSasDsl.g:3298:7: lv_interface_5_0= ruleSensorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLSensorAccess().getInterfaceSensorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleSensorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLSensorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.SensorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLSensorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLSensor"


    // $ANTLR start "entryRuleDSLEffector"
    // InternalSasDsl.g:3325:1: entryRuleDSLEffector returns [EObject current=null] : iv_ruleDSLEffector= ruleDSLEffector EOF ;
    public final EObject entryRuleDSLEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffector = null;


        try {
            // InternalSasDsl.g:3325:52: (iv_ruleDSLEffector= ruleDSLEffector EOF )
            // InternalSasDsl.g:3326:2: iv_ruleDSLEffector= ruleDSLEffector EOF
            {
             newCompositeNode(grammarAccess.getDSLEffectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLEffector=ruleDSLEffector();

            state._fsp--;

             current =iv_ruleDSLEffector; 
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
    // $ANTLR end "entryRuleDSLEffector"


    // $ANTLR start "ruleDSLEffector"
    // InternalSasDsl.g:3332:1: ruleDSLEffector returns [EObject current=null] : (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLEffector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3338:2: ( (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3339:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3339:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3340:3: otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:3344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3345:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLEffectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3362:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSasDsl.g:3363:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLEffectorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3367:4: ( (lv_interface_3_0= ruleEffectorInterface ) )
                    // InternalSasDsl.g:3368:5: (lv_interface_3_0= ruleEffectorInterface )
                    {
                    // InternalSasDsl.g:3368:5: (lv_interface_3_0= ruleEffectorInterface )
                    // InternalSasDsl.g:3369:6: lv_interface_3_0= ruleEffectorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLEffectorAccess().getInterfaceEffectorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleEffectorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLEffectorRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.EffectorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3386:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==55) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSasDsl.g:3387:5: otherlv_4= ',' ( (lv_interface_5_0= ruleEffectorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLEffectorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3391:5: ( (lv_interface_5_0= ruleEffectorInterface ) )
                    	    // InternalSasDsl.g:3392:6: (lv_interface_5_0= ruleEffectorInterface )
                    	    {
                    	    // InternalSasDsl.g:3392:6: (lv_interface_5_0= ruleEffectorInterface )
                    	    // InternalSasDsl.g:3393:7: lv_interface_5_0= ruleEffectorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLEffectorAccess().getInterfaceEffectorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleEffectorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLEffectorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.EffectorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLEffectorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLEffector"


    // $ANTLR start "entryRuleDSLProbe"
    // InternalSasDsl.g:3420:1: entryRuleDSLProbe returns [EObject current=null] : iv_ruleDSLProbe= ruleDSLProbe EOF ;
    public final EObject entryRuleDSLProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProbe = null;


        try {
            // InternalSasDsl.g:3420:49: (iv_ruleDSLProbe= ruleDSLProbe EOF )
            // InternalSasDsl.g:3421:2: iv_ruleDSLProbe= ruleDSLProbe EOF
            {
             newCompositeNode(grammarAccess.getDSLProbeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLProbe=ruleDSLProbe();

            state._fsp--;

             current =iv_ruleDSLProbe; 
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
    // $ANTLR end "entryRuleDSLProbe"


    // $ANTLR start "ruleDSLProbe"
    // InternalSasDsl.g:3427:1: ruleDSLProbe returns [EObject current=null] : (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLProbe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_probeinterfaces_3_0 = null;

        EObject lv_probeinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3433:2: ( (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3434:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3434:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3435:3: otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLProbeAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:3439:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3440:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3440:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3441:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLProbeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLProbeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3457:3: (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSasDsl.g:3458:4: otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLProbeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3462:4: ( (lv_probeinterfaces_3_0= ruleProbeInterface ) )
                    // InternalSasDsl.g:3463:5: (lv_probeinterfaces_3_0= ruleProbeInterface )
                    {
                    // InternalSasDsl.g:3463:5: (lv_probeinterfaces_3_0= ruleProbeInterface )
                    // InternalSasDsl.g:3464:6: lv_probeinterfaces_3_0= ruleProbeInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLProbeAccess().getProbeinterfacesProbeInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_probeinterfaces_3_0=ruleProbeInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLProbeRule());
                    						}
                    						add(
                    							current,
                    							"probeinterfaces",
                    							lv_probeinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ProbeInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3481:4: (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==55) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSasDsl.g:3482:5: otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLProbeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3486:5: ( (lv_probeinterfaces_5_0= ruleProbeInterface ) )
                    	    // InternalSasDsl.g:3487:6: (lv_probeinterfaces_5_0= ruleProbeInterface )
                    	    {
                    	    // InternalSasDsl.g:3487:6: (lv_probeinterfaces_5_0= ruleProbeInterface )
                    	    // InternalSasDsl.g:3488:7: lv_probeinterfaces_5_0= ruleProbeInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLProbeAccess().getProbeinterfacesProbeInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_probeinterfaces_5_0=ruleProbeInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLProbeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"probeinterfaces",
                    	    								lv_probeinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ProbeInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLProbeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLProbe"


    // $ANTLR start "entryRuleDSLGauge"
    // InternalSasDsl.g:3515:1: entryRuleDSLGauge returns [EObject current=null] : iv_ruleDSLGauge= ruleDSLGauge EOF ;
    public final EObject entryRuleDSLGauge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGauge = null;


        try {
            // InternalSasDsl.g:3515:49: (iv_ruleDSLGauge= ruleDSLGauge EOF )
            // InternalSasDsl.g:3516:2: iv_ruleDSLGauge= ruleDSLGauge EOF
            {
             newCompositeNode(grammarAccess.getDSLGaugeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLGauge=ruleDSLGauge();

            state._fsp--;

             current =iv_ruleDSLGauge; 
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
    // $ANTLR end "entryRuleDSLGauge"


    // $ANTLR start "ruleDSLGauge"
    // InternalSasDsl.g:3522:1: ruleDSLGauge returns [EObject current=null] : (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLGauge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3528:2: ( (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3529:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3529:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3530:3: otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGaugeAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:3534:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3535:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3535:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3536:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLGaugeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLGaugeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3552:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSasDsl.g:3553:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLGaugeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3557:4: ( (lv_interface_3_0= ruleGaugeInterface ) )
                    // InternalSasDsl.g:3558:5: (lv_interface_3_0= ruleGaugeInterface )
                    {
                    // InternalSasDsl.g:3558:5: (lv_interface_3_0= ruleGaugeInterface )
                    // InternalSasDsl.g:3559:6: lv_interface_3_0= ruleGaugeInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLGaugeAccess().getInterfaceGaugeInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleGaugeInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLGaugeRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.GaugeInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3576:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==55) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSasDsl.g:3577:5: otherlv_4= ',' ( (lv_interface_5_0= ruleGaugeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLGaugeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3581:5: ( (lv_interface_5_0= ruleGaugeInterface ) )
                    	    // InternalSasDsl.g:3582:6: (lv_interface_5_0= ruleGaugeInterface )
                    	    {
                    	    // InternalSasDsl.g:3582:6: (lv_interface_5_0= ruleGaugeInterface )
                    	    // InternalSasDsl.g:3583:7: lv_interface_5_0= ruleGaugeInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLGaugeAccess().getInterfaceGaugeInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleGaugeInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLGaugeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.GaugeInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLGaugeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLGauge"


    // $ANTLR start "entryRuleDSLReferenceInput"
    // InternalSasDsl.g:3610:1: entryRuleDSLReferenceInput returns [EObject current=null] : iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF ;
    public final EObject entryRuleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInput = null;


        try {
            // InternalSasDsl.g:3610:58: (iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF )
            // InternalSasDsl.g:3611:2: iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF
            {
             newCompositeNode(grammarAccess.getDSLReferenceInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLReferenceInput=ruleDSLReferenceInput();

            state._fsp--;

             current =iv_ruleDSLReferenceInput; 
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
    // $ANTLR end "entryRuleDSLReferenceInput"


    // $ANTLR start "ruleDSLReferenceInput"
    // InternalSasDsl.g:3617:1: ruleDSLReferenceInput returns [EObject current=null] : (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleReferenceInputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3623:2: ( (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleReferenceInputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3624:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleReferenceInputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3624:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleReferenceInputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3625:3: otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleReferenceInputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:3629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3630:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLReferenceInputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3647:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleReferenceInputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSasDsl.g:3648:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleReferenceInputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3652:4: ( (lv_interface_3_0= ruleReferenceInputInterface ) )
                    // InternalSasDsl.g:3653:5: (lv_interface_3_0= ruleReferenceInputInterface )
                    {
                    // InternalSasDsl.g:3653:5: (lv_interface_3_0= ruleReferenceInputInterface )
                    // InternalSasDsl.g:3654:6: lv_interface_3_0= ruleReferenceInputInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLReferenceInputAccess().getInterfaceReferenceInputInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleReferenceInputInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLReferenceInputRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ReferenceInputInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3671:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==55) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSasDsl.g:3672:5: otherlv_4= ',' ( (lv_interface_5_0= ruleReferenceInputInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLReferenceInputAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3676:5: ( (lv_interface_5_0= ruleReferenceInputInterface ) )
                    	    // InternalSasDsl.g:3677:6: (lv_interface_5_0= ruleReferenceInputInterface )
                    	    {
                    	    // InternalSasDsl.g:3677:6: (lv_interface_5_0= ruleReferenceInputInterface )
                    	    // InternalSasDsl.g:3678:7: lv_interface_5_0= ruleReferenceInputInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLReferenceInputAccess().getInterfaceReferenceInputInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleReferenceInputInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLReferenceInputRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ReferenceInputInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLReferenceInputAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLReferenceInput"


    // $ANTLR start "entryRuleDSLMeasuredOutput"
    // InternalSasDsl.g:3705:1: entryRuleDSLMeasuredOutput returns [EObject current=null] : iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF ;
    public final EObject entryRuleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOutput = null;


        try {
            // InternalSasDsl.g:3705:58: (iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF )
            // InternalSasDsl.g:3706:2: iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF
            {
             newCompositeNode(grammarAccess.getDSLMeasuredOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMeasuredOutput=ruleDSLMeasuredOutput();

            state._fsp--;

             current =iv_ruleDSLMeasuredOutput; 
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
    // $ANTLR end "entryRuleDSLMeasuredOutput"


    // $ANTLR start "ruleDSLMeasuredOutput"
    // InternalSasDsl.g:3712:1: ruleDSLMeasuredOutput returns [EObject current=null] : (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMeasuredOutputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interface_3_0 = null;

        EObject lv_interface_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3718:2: ( (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMeasuredOutputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3719:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMeasuredOutputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3719:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMeasuredOutputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3720:3: otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMeasuredOutputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:3724:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3725:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3725:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3726:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSLMeasuredOutputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSasDsl.g:3742:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMeasuredOutputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSasDsl.g:3743:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= ruleMeasuredOutputInterface ) ) (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOutputAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3747:4: ( (lv_interface_3_0= ruleMeasuredOutputInterface ) )
                    // InternalSasDsl.g:3748:5: (lv_interface_3_0= ruleMeasuredOutputInterface )
                    {
                    // InternalSasDsl.g:3748:5: (lv_interface_3_0= ruleMeasuredOutputInterface )
                    // InternalSasDsl.g:3749:6: lv_interface_3_0= ruleMeasuredOutputInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLMeasuredOutputAccess().getInterfaceMeasuredOutputInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_interface_3_0=ruleMeasuredOutputInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLMeasuredOutputRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.MeasuredOutputInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3766:4: (otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==55) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSasDsl.g:3767:5: otherlv_4= ',' ( (lv_interface_5_0= ruleMeasuredOutputInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLMeasuredOutputAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3771:5: ( (lv_interface_5_0= ruleMeasuredOutputInterface ) )
                    	    // InternalSasDsl.g:3772:6: (lv_interface_5_0= ruleMeasuredOutputInterface )
                    	    {
                    	    // InternalSasDsl.g:3772:6: (lv_interface_5_0= ruleMeasuredOutputInterface )
                    	    // InternalSasDsl.g:3773:7: lv_interface_5_0= ruleMeasuredOutputInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLMeasuredOutputAccess().getInterfaceMeasuredOutputInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_interface_5_0=ruleMeasuredOutputInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLMeasuredOutputRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.MeasuredOutputInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLMeasuredOutputAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDSLMeasuredOutput"


    // $ANTLR start "entryRuleMeasuredOutputInterface"
    // InternalSasDsl.g:3800:1: entryRuleMeasuredOutputInterface returns [EObject current=null] : iv_ruleMeasuredOutputInterface= ruleMeasuredOutputInterface EOF ;
    public final EObject entryRuleMeasuredOutputInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasuredOutputInterface = null;


        try {
            // InternalSasDsl.g:3800:64: (iv_ruleMeasuredOutputInterface= ruleMeasuredOutputInterface EOF )
            // InternalSasDsl.g:3801:2: iv_ruleMeasuredOutputInterface= ruleMeasuredOutputInterface EOF
            {
             newCompositeNode(grammarAccess.getMeasuredOutputInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasuredOutputInterface=ruleMeasuredOutputInterface();

            state._fsp--;

             current =iv_ruleMeasuredOutputInterface; 
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
    // $ANTLR end "entryRuleMeasuredOutputInterface"


    // $ANTLR start "ruleMeasuredOutputInterface"
    // InternalSasDsl.g:3807:1: ruleMeasuredOutputInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMeasuredOutputInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3813:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3814:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3814:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3815:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3815:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3816:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMeasuredOutputInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMeasuredOutputInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleMeasuredOutputInterface"


    // $ANTLR start "entryRuleGaugeInterface"
    // InternalSasDsl.g:3835:1: entryRuleGaugeInterface returns [EObject current=null] : iv_ruleGaugeInterface= ruleGaugeInterface EOF ;
    public final EObject entryRuleGaugeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGaugeInterface = null;


        try {
            // InternalSasDsl.g:3835:55: (iv_ruleGaugeInterface= ruleGaugeInterface EOF )
            // InternalSasDsl.g:3836:2: iv_ruleGaugeInterface= ruleGaugeInterface EOF
            {
             newCompositeNode(grammarAccess.getGaugeInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGaugeInterface=ruleGaugeInterface();

            state._fsp--;

             current =iv_ruleGaugeInterface; 
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
    // $ANTLR end "entryRuleGaugeInterface"


    // $ANTLR start "ruleGaugeInterface"
    // InternalSasDsl.g:3842:1: ruleGaugeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleGaugeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3848:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3849:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3849:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3850:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3850:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3851:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getGaugeInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGaugeInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleGaugeInterface"


    // $ANTLR start "entryRuleEffectorInterface"
    // InternalSasDsl.g:3870:1: entryRuleEffectorInterface returns [EObject current=null] : iv_ruleEffectorInterface= ruleEffectorInterface EOF ;
    public final EObject entryRuleEffectorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectorInterface = null;


        try {
            // InternalSasDsl.g:3870:58: (iv_ruleEffectorInterface= ruleEffectorInterface EOF )
            // InternalSasDsl.g:3871:2: iv_ruleEffectorInterface= ruleEffectorInterface EOF
            {
             newCompositeNode(grammarAccess.getEffectorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectorInterface=ruleEffectorInterface();

            state._fsp--;

             current =iv_ruleEffectorInterface; 
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
    // $ANTLR end "entryRuleEffectorInterface"


    // $ANTLR start "ruleEffectorInterface"
    // InternalSasDsl.g:3877:1: ruleEffectorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEffectorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3883:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3884:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3884:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3885:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3885:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3886:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEffectorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEffectorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEffectorInterface"


    // $ANTLR start "entryRuleProbeInterface"
    // InternalSasDsl.g:3905:1: entryRuleProbeInterface returns [EObject current=null] : iv_ruleProbeInterface= ruleProbeInterface EOF ;
    public final EObject entryRuleProbeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbeInterface = null;


        try {
            // InternalSasDsl.g:3905:55: (iv_ruleProbeInterface= ruleProbeInterface EOF )
            // InternalSasDsl.g:3906:2: iv_ruleProbeInterface= ruleProbeInterface EOF
            {
             newCompositeNode(grammarAccess.getProbeInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProbeInterface=ruleProbeInterface();

            state._fsp--;

             current =iv_ruleProbeInterface; 
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
    // $ANTLR end "entryRuleProbeInterface"


    // $ANTLR start "ruleProbeInterface"
    // InternalSasDsl.g:3912:1: ruleProbeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProbeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3918:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3919:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3919:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3920:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3920:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3921:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProbeInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProbeInterfaceRule());
            				}
            				addWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleProbeInterface"


    // $ANTLR start "entryRuleSensorInterface"
    // InternalSasDsl.g:3940:1: entryRuleSensorInterface returns [EObject current=null] : iv_ruleSensorInterface= ruleSensorInterface EOF ;
    public final EObject entryRuleSensorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorInterface = null;


        try {
            // InternalSasDsl.g:3940:56: (iv_ruleSensorInterface= ruleSensorInterface EOF )
            // InternalSasDsl.g:3941:2: iv_ruleSensorInterface= ruleSensorInterface EOF
            {
             newCompositeNode(grammarAccess.getSensorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorInterface=ruleSensorInterface();

            state._fsp--;

             current =iv_ruleSensorInterface; 
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
    // $ANTLR end "entryRuleSensorInterface"


    // $ANTLR start "ruleSensorInterface"
    // InternalSasDsl.g:3947:1: ruleSensorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSensorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3953:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3954:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3954:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3955:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3955:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3956:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSensorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleSensorInterface"


    // $ANTLR start "entryRuleMonitorInterface"
    // InternalSasDsl.g:3975:1: entryRuleMonitorInterface returns [EObject current=null] : iv_ruleMonitorInterface= ruleMonitorInterface EOF ;
    public final EObject entryRuleMonitorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorInterface = null;


        try {
            // InternalSasDsl.g:3975:57: (iv_ruleMonitorInterface= ruleMonitorInterface EOF )
            // InternalSasDsl.g:3976:2: iv_ruleMonitorInterface= ruleMonitorInterface EOF
            {
             newCompositeNode(grammarAccess.getMonitorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorInterface=ruleMonitorInterface();

            state._fsp--;

             current =iv_ruleMonitorInterface; 
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
    // $ANTLR end "entryRuleMonitorInterface"


    // $ANTLR start "ruleMonitorInterface"
    // InternalSasDsl.g:3982:1: ruleMonitorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMonitorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3988:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3989:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3989:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3990:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3990:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3991:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMonitorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMonitorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleMonitorInterface"


    // $ANTLR start "entryRuleAnalyzerInterface"
    // InternalSasDsl.g:4010:1: entryRuleAnalyzerInterface returns [EObject current=null] : iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF ;
    public final EObject entryRuleAnalyzerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzerInterface = null;


        try {
            // InternalSasDsl.g:4010:58: (iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF )
            // InternalSasDsl.g:4011:2: iv_ruleAnalyzerInterface= ruleAnalyzerInterface EOF
            {
             newCompositeNode(grammarAccess.getAnalyzerInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyzerInterface=ruleAnalyzerInterface();

            state._fsp--;

             current =iv_ruleAnalyzerInterface; 
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
    // $ANTLR end "entryRuleAnalyzerInterface"


    // $ANTLR start "ruleAnalyzerInterface"
    // InternalSasDsl.g:4017:1: ruleAnalyzerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAnalyzerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4023:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4024:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4024:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4025:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4025:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4026:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAnalyzerInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAnalyzerInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAnalyzerInterface"


    // $ANTLR start "entryRulePlannerInterface"
    // InternalSasDsl.g:4045:1: entryRulePlannerInterface returns [EObject current=null] : iv_rulePlannerInterface= rulePlannerInterface EOF ;
    public final EObject entryRulePlannerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlannerInterface = null;


        try {
            // InternalSasDsl.g:4045:57: (iv_rulePlannerInterface= rulePlannerInterface EOF )
            // InternalSasDsl.g:4046:2: iv_rulePlannerInterface= rulePlannerInterface EOF
            {
             newCompositeNode(grammarAccess.getPlannerInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlannerInterface=rulePlannerInterface();

            state._fsp--;

             current =iv_rulePlannerInterface; 
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
    // $ANTLR end "entryRulePlannerInterface"


    // $ANTLR start "rulePlannerInterface"
    // InternalSasDsl.g:4052:1: rulePlannerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePlannerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4058:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4059:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4059:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4060:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4060:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4061:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPlannerInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPlannerInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "rulePlannerInterface"


    // $ANTLR start "entryRuleExecutorInterface"
    // InternalSasDsl.g:4080:1: entryRuleExecutorInterface returns [EObject current=null] : iv_ruleExecutorInterface= ruleExecutorInterface EOF ;
    public final EObject entryRuleExecutorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutorInterface = null;


        try {
            // InternalSasDsl.g:4080:58: (iv_ruleExecutorInterface= ruleExecutorInterface EOF )
            // InternalSasDsl.g:4081:2: iv_ruleExecutorInterface= ruleExecutorInterface EOF
            {
             newCompositeNode(grammarAccess.getExecutorInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutorInterface=ruleExecutorInterface();

            state._fsp--;

             current =iv_ruleExecutorInterface; 
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
    // $ANTLR end "entryRuleExecutorInterface"


    // $ANTLR start "ruleExecutorInterface"
    // InternalSasDsl.g:4087:1: ruleExecutorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExecutorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4093:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4094:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4094:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4095:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4095:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4096:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExecutorInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExecutorInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleExecutorInterface"


    // $ANTLR start "entryRuleKnowledgeInterface"
    // InternalSasDsl.g:4115:1: entryRuleKnowledgeInterface returns [EObject current=null] : iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF ;
    public final EObject entryRuleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeInterface = null;


        try {
            // InternalSasDsl.g:4115:59: (iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF )
            // InternalSasDsl.g:4116:2: iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledgeInterface=ruleKnowledgeInterface();

            state._fsp--;

             current =iv_ruleKnowledgeInterface; 
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
    // $ANTLR end "entryRuleKnowledgeInterface"


    // $ANTLR start "ruleKnowledgeInterface"
    // InternalSasDsl.g:4122:1: ruleKnowledgeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4128:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4129:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4129:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4130:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4130:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4131:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getKnowledgeInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKnowledgeInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleKnowledgeInterface"


    // $ANTLR start "entryRuleControlLoopInterface"
    // InternalSasDsl.g:4150:1: entryRuleControlLoopInterface returns [EObject current=null] : iv_ruleControlLoopInterface= ruleControlLoopInterface EOF ;
    public final EObject entryRuleControlLoopInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlLoopInterface = null;


        try {
            // InternalSasDsl.g:4150:61: (iv_ruleControlLoopInterface= ruleControlLoopInterface EOF )
            // InternalSasDsl.g:4151:2: iv_ruleControlLoopInterface= ruleControlLoopInterface EOF
            {
             newCompositeNode(grammarAccess.getControlLoopInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlLoopInterface=ruleControlLoopInterface();

            state._fsp--;

             current =iv_ruleControlLoopInterface; 
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
    // $ANTLR end "entryRuleControlLoopInterface"


    // $ANTLR start "ruleControlLoopInterface"
    // InternalSasDsl.g:4157:1: ruleControlLoopInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControlLoopInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4163:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4164:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4164:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4165:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4165:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4166:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getControlLoopInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getControlLoopInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleControlLoopInterface"


    // $ANTLR start "entryRuleControlLoopManagerInterface"
    // InternalSasDsl.g:4185:1: entryRuleControlLoopManagerInterface returns [EObject current=null] : iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF ;
    public final EObject entryRuleControlLoopManagerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlLoopManagerInterface = null;


        try {
            // InternalSasDsl.g:4185:68: (iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF )
            // InternalSasDsl.g:4186:2: iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF
            {
             newCompositeNode(grammarAccess.getControlLoopManagerInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlLoopManagerInterface=ruleControlLoopManagerInterface();

            state._fsp--;

             current =iv_ruleControlLoopManagerInterface; 
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
    // $ANTLR end "entryRuleControlLoopManagerInterface"


    // $ANTLR start "ruleControlLoopManagerInterface"
    // InternalSasDsl.g:4192:1: ruleControlLoopManagerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControlLoopManagerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4198:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4199:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4199:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4200:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4200:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4201:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getControlLoopManagerInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getControlLoopManagerInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleControlLoopManagerInterface"


    // $ANTLR start "entryRuleReferenceInputInterface"
    // InternalSasDsl.g:4220:1: entryRuleReferenceInputInterface returns [EObject current=null] : iv_ruleReferenceInputInterface= ruleReferenceInputInterface EOF ;
    public final EObject entryRuleReferenceInputInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceInputInterface = null;


        try {
            // InternalSasDsl.g:4220:64: (iv_ruleReferenceInputInterface= ruleReferenceInputInterface EOF )
            // InternalSasDsl.g:4221:2: iv_ruleReferenceInputInterface= ruleReferenceInputInterface EOF
            {
             newCompositeNode(grammarAccess.getReferenceInputInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceInputInterface=ruleReferenceInputInterface();

            state._fsp--;

             current =iv_ruleReferenceInputInterface; 
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
    // $ANTLR end "entryRuleReferenceInputInterface"


    // $ANTLR start "ruleReferenceInputInterface"
    // InternalSasDsl.g:4227:1: ruleReferenceInputInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReferenceInputInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4233:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4234:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4234:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4235:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4235:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4236:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getReferenceInputInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReferenceInputInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleReferenceInputInterface"


    // $ANTLR start "entryRuleManagedInterface"
    // InternalSasDsl.g:4255:1: entryRuleManagedInterface returns [EObject current=null] : iv_ruleManagedInterface= ruleManagedInterface EOF ;
    public final EObject entryRuleManagedInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedInterface = null;


        try {
            // InternalSasDsl.g:4255:57: (iv_ruleManagedInterface= ruleManagedInterface EOF )
            // InternalSasDsl.g:4256:2: iv_ruleManagedInterface= ruleManagedInterface EOF
            {
             newCompositeNode(grammarAccess.getManagedInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManagedInterface=ruleManagedInterface();

            state._fsp--;

             current =iv_ruleManagedInterface; 
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
    // $ANTLR end "entryRuleManagedInterface"


    // $ANTLR start "ruleManagedInterface"
    // InternalSasDsl.g:4262:1: ruleManagedInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleManagedInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4268:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4269:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4269:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4270:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4270:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4271:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getManagedInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getManagedInterfaceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleManagedInterface"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\20\3\uffff\5\4\4\uffff\4\52\1\53\12\uffff";
    static final String dfa_3s = "\1\63\3\uffff\5\4\4\uffff\4\53\1\56\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\5\uffff\1\16\1\17\1\20\1\21\5\uffff\1\5\1\4\1\7\1\6\1\11\1\10\1\13\1\12\1\15\1\14";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\5\6\uffff\1\6\2\uffff\1\3\6\uffff\1\2\2\uffff\1\4\2\uffff\1\7\1\10\1\uffff\1\11\1\12\1\uffff\1\13\1\14",
            "",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "\1\23\1\22",
            "\1\25\1\24",
            "\1\27\1\26",
            "\1\31\1\30",
            "\1\32\2\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "343:2: (this_DSLSensorBelongsTo_0= ruleDSLSensorBelongsTo | this_DSLReferenceInputBelongsTo_1= ruleDSLReferenceInputBelongsTo | this_DSLEffectorBelongsTo_2= ruleDSLEffectorBelongsTo | this_DSLMonitorBelongsTo1_3= ruleDSLMonitorBelongsTo1 | this_DSLMonitorBelongsTo2_4= ruleDSLMonitorBelongsTo2 | this_DSLAnalyzerBelongsTo1_5= ruleDSLAnalyzerBelongsTo1 | this_DSLAnalyzerBelongsTo2_6= ruleDSLAnalyzerBelongsTo2 | this_DSLPlannerBelongsTo1_7= ruleDSLPlannerBelongsTo1 | this_DSLPlannerBelongsTo2_8= ruleDSLPlannerBelongsTo2 | this_DSLExecutorBelongsTo1_9= ruleDSLExecutorBelongsTo1 | this_DSLExecutorBelongsTo2_10= ruleDSLExecutorBelongsTo2 | this_DSLClBelongsTo1_11= ruleDSLClBelongsTo1 | this_DSLClBelongsTo2_12= ruleDSLClBelongsTo2 | this_DSLClmBelongsTo_13= ruleDSLClmBelongsTo | this_DSLMeasuredOuputBelongsTo_14= ruleDSLMeasuredOuputBelongsTo | this_DSLGaugeBelongsTo_15= ruleDSLGaugeBelongsTo | this_DSLProbeBelongsTo_16= ruleDSLProbeBelongsTo )";
        }
    }
    static final String dfa_7s = "\35\uffff";
    static final String dfa_8s = "\1\20\5\4\1\21\1\26\1\32\1\40\1\43\22\uffff";
    static final String dfa_9s = "\1\42\5\4\1\23\2\36\1\41\1\44\22\uffff";
    static final String dfa_10s = "\13\uffff\1\2\1\1\1\6\1\5\1\4\1\10\1\14\1\3\1\7\1\13\1\12\1\16\1\11\1\15\1\20\1\17\1\22\1\21";
    static final String dfa_11s = "\35\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\4\uffff\1\2\6\uffff\1\3\2\uffff\1\4\2\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\1\uffff\1\13",
            "\1\22\1\17\1\16\1\15\1\23\1\20\1\uffff\1\24\1\21",
            "\1\27\1\25\1\uffff\1\30\1\26",
            "\1\32\1\31",
            "\1\34\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "514:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'analyzer' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-monitor' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'analyzer' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-monitor' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) | (otherlv_24= 'analyzer' ( (otherlv_25= RULE_ID ) ) otherlv_26= 'must-not-access-planner' ( (otherlv_27= RULE_ID ) ) otherlv_28= ';' ) | (otherlv_29= 'analyzer' ( (otherlv_30= RULE_ID ) ) otherlv_31= 'must-access-planner' ( (otherlv_32= RULE_ID ) ) otherlv_33= 'through-interface' ( (otherlv_34= RULE_ID ) ) otherlv_35= ';' ) | (otherlv_36= 'analyzer' ( (otherlv_37= RULE_ID ) ) otherlv_38= 'must-not-access-executor' ( (otherlv_39= RULE_ID ) ) otherlv_40= ';' ) | (otherlv_41= 'analyzer' ( (otherlv_42= RULE_ID ) ) otherlv_43= 'must-access-executor' ( (otherlv_44= RULE_ID ) ) otherlv_45= 'through-interface' ( (otherlv_46= RULE_ID ) ) otherlv_47= ';' ) | (otherlv_48= 'planner' ( (otherlv_49= RULE_ID ) ) otherlv_50= 'must-not-access-executor' ( (otherlv_51= RULE_ID ) ) otherlv_52= ';' ) | (otherlv_53= 'planner' ( (otherlv_54= RULE_ID ) ) otherlv_55= 'must-access-executor' ( (otherlv_56= RULE_ID ) ) otherlv_57= 'through-interface' ( (otherlv_58= RULE_ID ) ) otherlv_59= ';' ) | (otherlv_60= 'analyzer' ( (otherlv_61= RULE_ID ) ) otherlv_62= 'must-not-access-knowledge' ( (otherlv_63= RULE_ID ) ) otherlv_64= ';' ) | (otherlv_65= 'analyzer' ( (otherlv_66= RULE_ID ) ) otherlv_67= 'must-access-knowledge' ( (otherlv_68= RULE_ID ) ) otherlv_69= 'through-interface' ( (otherlv_70= RULE_ID ) ) otherlv_71= ';' ) | (otherlv_72= 'planner' ( (otherlv_73= RULE_ID ) ) otherlv_74= 'must-not-access-knowledge' ( (otherlv_75= RULE_ID ) ) otherlv_76= ';' ) | (otherlv_77= 'planner' ( (otherlv_78= RULE_ID ) ) otherlv_79= 'must-access-knowledge' ( (otherlv_80= RULE_ID ) ) otherlv_81= 'through-interface' ( (otherlv_82= RULE_ID ) ) otherlv_83= ';' ) | (otherlv_84= 'effector' ( (otherlv_85= RULE_ID ) ) otherlv_86= 'must-not-access-gauge' ( (otherlv_87= RULE_ID ) ) otherlv_88= ';' ) | (otherlv_89= 'effector' ( (otherlv_90= RULE_ID ) ) otherlv_91= 'must-access-gauge' ( (otherlv_92= RULE_ID ) ) otherlv_93= 'through-interface' ( (otherlv_94= RULE_ID ) ) otherlv_95= ';' ) | (otherlv_96= 'managing' ( (otherlv_97= RULE_ID ) ) otherlv_98= 'must-not-access-managed' ( (otherlv_99= RULE_ID ) ) otherlv_100= ';' ) | (otherlv_101= 'managing' ( (otherlv_102= RULE_ID ) ) otherlv_103= 'must-access-managed' ( (otherlv_104= RULE_ID ) ) otherlv_105= 'through-interface' ( (otherlv_106= RULE_ID ) ) otherlv_107= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xE130000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xE130000000002000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000DB24090212000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000490212000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1C00000000000000L});

}