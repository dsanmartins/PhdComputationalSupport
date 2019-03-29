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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Abstractions'", "'{'", "'}'", "'Compositions'", "'Restrictions'", "'sensor'", "'must-not-access-probe'", "';'", "'must-access-probe'", "'through-interface'", "'analyzer'", "'must-not-access-monitor'", "'must-access-monitor'", "'must-not-access-planner'", "'must-access-planner'", "'must-not-access-executor'", "'must-access-executor'", "'must-not-access-knowledge'", "'must-access-knowledge'", "'planner'", "'effector'", "'must-not-access-gauge'", "'must-access-gauge'", "'managing'", "'must-not-access-managed'", "'must-access-managed'", "'must-be-in-monitor'", "'reference-input'", "'must-be-in-knowledge'", "'must-be-in-executor'", "'monitor'", "'must-be-in-control-loop'", "'must-be-in-managing'", "'executor'", "'control-loop'", "'must-be-in-control-loop-manager'", "'control-loop-manager'", "'measured-output'", "'must-be-in-managed'", "'gauge'", "'probe'", "'Managing'", "'Managed'", "'with-interface'", "','", "'ControlLoopManager'", "'typeOf'", "'Synchronized'", "'Coordinated'", "'Independent'", "'ControlLoop'", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'Probe'", "'Gauge'", "'ReferenceInput'", "'MeasuredOutput'"
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

                if ( (LA2_0==16||LA2_0==21||(LA2_0>=30 && LA2_0<=31)||LA2_0==38||LA2_0==41||(LA2_0>=44 && LA2_0<=45)||(LA2_0>=47 && LA2_0<=48)||(LA2_0>=50 && LA2_0<=51)) ) {
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

                if ( (LA3_0==16||LA3_0==21||(LA3_0>=30 && LA3_0<=31)||LA3_0==34) ) {
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
    // InternalSasDsl.g:507:1: ruleDSLRestriction returns [EObject current=null] : (this_DSLRestrictionProbe_0= ruleDSLRestrictionProbe | this_DSLRestrictionMonitor_1= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_2= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_3= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_4= ruleDSLRestrictionKnowledge | this_DSLRestrictionGauge_5= ruleDSLRestrictionGauge | this_DSLRestrictionManaged_6= ruleDSLRestrictionManaged ) ;
    public final EObject ruleDSLRestriction() throws RecognitionException {
        EObject current = null;

        EObject this_DSLRestrictionProbe_0 = null;

        EObject this_DSLRestrictionMonitor_1 = null;

        EObject this_DSLRestrictionPlanner_2 = null;

        EObject this_DSLRestrictionExecutor_3 = null;

        EObject this_DSLRestrictionKnowledge_4 = null;

        EObject this_DSLRestrictionGauge_5 = null;

        EObject this_DSLRestrictionManaged_6 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:513:2: ( (this_DSLRestrictionProbe_0= ruleDSLRestrictionProbe | this_DSLRestrictionMonitor_1= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_2= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_3= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_4= ruleDSLRestrictionKnowledge | this_DSLRestrictionGauge_5= ruleDSLRestrictionGauge | this_DSLRestrictionManaged_6= ruleDSLRestrictionManaged ) )
            // InternalSasDsl.g:514:2: (this_DSLRestrictionProbe_0= ruleDSLRestrictionProbe | this_DSLRestrictionMonitor_1= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_2= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_3= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_4= ruleDSLRestrictionKnowledge | this_DSLRestrictionGauge_5= ruleDSLRestrictionGauge | this_DSLRestrictionManaged_6= ruleDSLRestrictionManaged )
            {
            // InternalSasDsl.g:514:2: (this_DSLRestrictionProbe_0= ruleDSLRestrictionProbe | this_DSLRestrictionMonitor_1= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_2= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_3= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_4= ruleDSLRestrictionKnowledge | this_DSLRestrictionGauge_5= ruleDSLRestrictionGauge | this_DSLRestrictionManaged_6= ruleDSLRestrictionManaged )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSasDsl.g:515:3: this_DSLRestrictionProbe_0= ruleDSLRestrictionProbe
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionProbeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionProbe_0=ruleDSLRestrictionProbe();

                    state._fsp--;


                    			current = this_DSLRestrictionProbe_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:524:3: this_DSLRestrictionMonitor_1= ruleDSLRestrictionMonitor
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionMonitorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionMonitor_1=ruleDSLRestrictionMonitor();

                    state._fsp--;


                    			current = this_DSLRestrictionMonitor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:533:3: this_DSLRestrictionPlanner_2= ruleDSLRestrictionPlanner
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionPlannerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionPlanner_2=ruleDSLRestrictionPlanner();

                    state._fsp--;


                    			current = this_DSLRestrictionPlanner_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:542:3: this_DSLRestrictionExecutor_3= ruleDSLRestrictionExecutor
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionExecutorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionExecutor_3=ruleDSLRestrictionExecutor();

                    state._fsp--;


                    			current = this_DSLRestrictionExecutor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:551:3: this_DSLRestrictionKnowledge_4= ruleDSLRestrictionKnowledge
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionKnowledgeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionKnowledge_4=ruleDSLRestrictionKnowledge();

                    state._fsp--;


                    			current = this_DSLRestrictionKnowledge_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:560:3: this_DSLRestrictionGauge_5= ruleDSLRestrictionGauge
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionGaugeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionGauge_5=ruleDSLRestrictionGauge();

                    state._fsp--;


                    			current = this_DSLRestrictionGauge_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:569:3: this_DSLRestrictionManaged_6= ruleDSLRestrictionManaged
                    {

                    			newCompositeNode(grammarAccess.getDSLRestrictionAccess().getDSLRestrictionManagedParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLRestrictionManaged_6=ruleDSLRestrictionManaged();

                    state._fsp--;


                    			current = this_DSLRestrictionManaged_6;
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
    // $ANTLR end "ruleDSLRestriction"


    // $ANTLR start "entryRuleDSLRestrictionProbe"
    // InternalSasDsl.g:581:1: entryRuleDSLRestrictionProbe returns [EObject current=null] : iv_ruleDSLRestrictionProbe= ruleDSLRestrictionProbe EOF ;
    public final EObject entryRuleDSLRestrictionProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionProbe = null;


        try {
            // InternalSasDsl.g:581:60: (iv_ruleDSLRestrictionProbe= ruleDSLRestrictionProbe EOF )
            // InternalSasDsl.g:582:2: iv_ruleDSLRestrictionProbe= ruleDSLRestrictionProbe EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionProbeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionProbe=ruleDSLRestrictionProbe();

            state._fsp--;

             current =iv_ruleDSLRestrictionProbe; 
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
    // $ANTLR end "entryRuleDSLRestrictionProbe"


    // $ANTLR start "ruleDSLRestrictionProbe"
    // InternalSasDsl.g:588:1: ruleDSLRestrictionProbe returns [EObject current=null] : ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionProbe() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSasDsl.g:594:2: ( ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:595:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:595:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==19) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==17) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSasDsl.g:596:3: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:596:3: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:597:4: otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-probe' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionProbeAccess().getSensorKeyword_0_0());
                    			
                    // InternalSasDsl.g:601:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:602:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:602:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:603:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionProbeRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionProbeAccess().getTDSLSensorCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionProbeAccess().getMustNotAccessProbeKeyword_0_2());
                    			
                    // InternalSasDsl.g:618:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:619:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:619:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:620:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionProbeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionProbeAccess().getProbeDSLProbeCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionProbeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:637:3: (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:637:3: (otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:638:4: otherlv_5= 'sensor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-probe' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionProbeAccess().getSensorKeyword_1_0());
                    			
                    // InternalSasDsl.g:642:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:643:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:643:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:644:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionProbeRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionProbeAccess().getTDSLSensorCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionProbeAccess().getMustAccessProbeKeyword_1_2());
                    			
                    // InternalSasDsl.g:659:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:660:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:660:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:661:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionProbeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionProbeAccess().getProbeDSLProbeCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionProbeAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:676:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:677:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:677:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:678:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionProbeRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionProbeAccess().getProbeinterfaceProbeInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionProbeAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionProbe"


    // $ANTLR start "entryRuleDSLRestrictionMonitor"
    // InternalSasDsl.g:698:1: entryRuleDSLRestrictionMonitor returns [EObject current=null] : iv_ruleDSLRestrictionMonitor= ruleDSLRestrictionMonitor EOF ;
    public final EObject entryRuleDSLRestrictionMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionMonitor = null;


        try {
            // InternalSasDsl.g:698:62: (iv_ruleDSLRestrictionMonitor= ruleDSLRestrictionMonitor EOF )
            // InternalSasDsl.g:699:2: iv_ruleDSLRestrictionMonitor= ruleDSLRestrictionMonitor EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionMonitor=ruleDSLRestrictionMonitor();

            state._fsp--;

             current =iv_ruleDSLRestrictionMonitor; 
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
    // $ANTLR end "entryRuleDSLRestrictionMonitor"


    // $ANTLR start "ruleDSLRestrictionMonitor"
    // InternalSasDsl.g:705:1: ruleDSLRestrictionMonitor returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionMonitor() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSasDsl.g:711:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:712:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:712:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==23) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==22) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
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
                    // InternalSasDsl.g:713:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:713:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:714:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionMonitorAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:718:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:719:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:719:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:720:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionMonitorAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionMonitorAccess().getMustNotAccessMonitorKeyword_0_2());
                    			
                    // InternalSasDsl.g:735:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:736:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:736:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:737:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionMonitorAccess().getMonitorDSLMonitorCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionMonitorAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:754:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:754:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:755:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-monitor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionMonitorAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:759:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:760:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:760:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:761:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionMonitorAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionMonitorAccess().getMustAccessMonitorKeyword_1_2());
                    			
                    // InternalSasDsl.g:776:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:777:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:777:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:778:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionMonitorAccess().getMonitorDSLMonitorCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionMonitorAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:793:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:794:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:794:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:795:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionMonitorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionMonitorAccess().getMonitorinterfaceMonitorInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionMonitorAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionMonitor"


    // $ANTLR start "entryRuleDSLRestrictionPlanner"
    // InternalSasDsl.g:815:1: entryRuleDSLRestrictionPlanner returns [EObject current=null] : iv_ruleDSLRestrictionPlanner= ruleDSLRestrictionPlanner EOF ;
    public final EObject entryRuleDSLRestrictionPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionPlanner = null;


        try {
            // InternalSasDsl.g:815:62: (iv_ruleDSLRestrictionPlanner= ruleDSLRestrictionPlanner EOF )
            // InternalSasDsl.g:816:2: iv_ruleDSLRestrictionPlanner= ruleDSLRestrictionPlanner EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionPlannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionPlanner=ruleDSLRestrictionPlanner();

            state._fsp--;

             current =iv_ruleDSLRestrictionPlanner; 
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
    // $ANTLR end "entryRuleDSLRestrictionPlanner"


    // $ANTLR start "ruleDSLRestrictionPlanner"
    // InternalSasDsl.g:822:1: ruleDSLRestrictionPlanner returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionPlanner() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSasDsl.g:828:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:829:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:829:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==25) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==24) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSasDsl.g:830:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:830:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:831:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-planner' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionPlannerAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:835:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:836:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:836:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:837:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionPlannerAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionPlannerAccess().getMustNotAccessPlannerKeyword_0_2());
                    			
                    // InternalSasDsl.g:852:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:853:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:853:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:854:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionPlannerAccess().getPlannerDSLPlannerCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionPlannerAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:871:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:871:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:872:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-planner' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionPlannerAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:876:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:877:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:877:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:878:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionPlannerAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionPlannerAccess().getMustAccessPlannerKeyword_1_2());
                    			
                    // InternalSasDsl.g:893:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:894:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:894:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:895:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionPlannerAccess().getPlannerDSLPlannerCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionPlannerAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:910:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:911:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:911:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:912:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionPlannerRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionPlannerAccess().getPlannerinterfacePlannerInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionPlannerAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionPlanner"


    // $ANTLR start "entryRuleDSLRestrictionExecutor"
    // InternalSasDsl.g:932:1: entryRuleDSLRestrictionExecutor returns [EObject current=null] : iv_ruleDSLRestrictionExecutor= ruleDSLRestrictionExecutor EOF ;
    public final EObject entryRuleDSLRestrictionExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionExecutor = null;


        try {
            // InternalSasDsl.g:932:63: (iv_ruleDSLRestrictionExecutor= ruleDSLRestrictionExecutor EOF )
            // InternalSasDsl.g:933:2: iv_ruleDSLRestrictionExecutor= ruleDSLRestrictionExecutor EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionExecutor=ruleDSLRestrictionExecutor();

            state._fsp--;

             current =iv_ruleDSLRestrictionExecutor; 
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
    // $ANTLR end "entryRuleDSLRestrictionExecutor"


    // $ANTLR start "ruleDSLRestrictionExecutor"
    // InternalSasDsl.g:939:1: ruleDSLRestrictionExecutor returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionExecutor() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSasDsl.g:945:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:946:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:946:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==27) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==26) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSasDsl.g:947:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:947:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:948:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionExecutorAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:952:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:953:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:953:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:954:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionExecutorAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionExecutorAccess().getMustNotAccessExecutorKeyword_0_2());
                    			
                    // InternalSasDsl.g:969:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:970:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:970:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:971:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionExecutorAccess().getExecutorDSLExecutorCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionExecutorAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:988:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:988:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:989:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-executor' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionExecutorAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:993:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:994:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:994:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:995:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionExecutorAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionExecutorAccess().getMustAccessExecutorKeyword_1_2());
                    			
                    // InternalSasDsl.g:1010:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:1011:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:1011:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:1012:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionExecutorAccess().getExecutorDSLExecutorCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionExecutorAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1027:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1028:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1028:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1029:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionExecutorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionExecutorAccess().getExecutorinterfaceExecutorInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionExecutorAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionExecutor"


    // $ANTLR start "entryRuleDSLRestrictionKnowledge"
    // InternalSasDsl.g:1049:1: entryRuleDSLRestrictionKnowledge returns [EObject current=null] : iv_ruleDSLRestrictionKnowledge= ruleDSLRestrictionKnowledge EOF ;
    public final EObject entryRuleDSLRestrictionKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionKnowledge = null;


        try {
            // InternalSasDsl.g:1049:64: (iv_ruleDSLRestrictionKnowledge= ruleDSLRestrictionKnowledge EOF )
            // InternalSasDsl.g:1050:2: iv_ruleDSLRestrictionKnowledge= ruleDSLRestrictionKnowledge EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionKnowledge=ruleDSLRestrictionKnowledge();

            state._fsp--;

             current =iv_ruleDSLRestrictionKnowledge; 
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
    // $ANTLR end "entryRuleDSLRestrictionKnowledge"


    // $ANTLR start "ruleDSLRestrictionKnowledge"
    // InternalSasDsl.g:1056:1: ruleDSLRestrictionKnowledge returns [EObject current=null] : ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) ) ;
    public final EObject ruleDSLRestrictionKnowledge() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSasDsl.g:1062:2: ( ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) ) )
            // InternalSasDsl.g:1063:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) )
            {
            // InternalSasDsl.g:1063:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' ) )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==29) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==28) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==30) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_ID) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==29) ) {
                        alt11=4;
                    }
                    else if ( (LA11_4==28) ) {
                        alt11=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSasDsl.g:1064:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:1064:3: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:1065:4: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionKnowledgeAccess().getAnalyzerKeyword_0_0());
                    			
                    // InternalSasDsl.g:1069:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:1070:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:1070:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:1071:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLAnalyzerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustNotAccessKnowledgeKeyword_0_2());
                    			
                    // InternalSasDsl.g:1086:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1087:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1087:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1088:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1105:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:1105:3: (otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:1106:4: otherlv_5= 'analyzer' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-knowledge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionKnowledgeAccess().getAnalyzerKeyword_1_0());
                    			
                    // InternalSasDsl.g:1110:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1111:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1111:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1112:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLAnalyzerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustAccessKnowledgeKeyword_1_2());
                    			
                    // InternalSasDsl.g:1127:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:1128:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:1128:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:1129:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionKnowledgeAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1144:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1145:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1145:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1146:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1163:3: (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    {
                    // InternalSasDsl.g:1163:3: (otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    // InternalSasDsl.g:1164:4: otherlv_12= 'planner' ( (otherlv_13= RULE_ID ) ) otherlv_14= 'must-not-access-knowledge' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';'
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getDSLRestrictionKnowledgeAccess().getPlannerKeyword_2_0());
                    			
                    // InternalSasDsl.g:1168:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSasDsl.g:1169:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSasDsl.g:1169:5: (otherlv_13= RULE_ID )
                    // InternalSasDsl.g:1170:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_13, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLPlannerCrossReference_2_1_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustNotAccessKnowledgeKeyword_2_2());
                    			
                    // InternalSasDsl.g:1185:4: ( (otherlv_15= RULE_ID ) )
                    // InternalSasDsl.g:1186:5: (otherlv_15= RULE_ID )
                    {
                    // InternalSasDsl.g:1186:5: (otherlv_15= RULE_ID )
                    // InternalSasDsl.g:1187:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_15, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1204:3: (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    {
                    // InternalSasDsl.g:1204:3: (otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';' )
                    // InternalSasDsl.g:1205:4: otherlv_17= 'planner' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'must-access-knowledge' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'through-interface' ( (otherlv_22= RULE_ID ) ) otherlv_23= ';'
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getDSLRestrictionKnowledgeAccess().getPlannerKeyword_3_0());
                    			
                    // InternalSasDsl.g:1209:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSasDsl.g:1210:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSasDsl.g:1210:5: (otherlv_18= RULE_ID )
                    // InternalSasDsl.g:1211:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_18, grammarAccess.getDSLRestrictionKnowledgeAccess().getTDSLPlannerCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getDSLRestrictionKnowledgeAccess().getMustAccessKnowledgeKeyword_3_2());
                    			
                    // InternalSasDsl.g:1226:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:1227:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:1227:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:1228:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeDSLKnowledgeCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRestrictionKnowledgeAccess().getThroughInterfaceKeyword_3_4());
                    			
                    // InternalSasDsl.g:1243:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:1244:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:1244:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:1245:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionKnowledgeRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRestrictionKnowledgeAccess().getKnowledgeinterfaceKnowledgeInterfaceCrossReference_3_5_0());
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getDSLRestrictionKnowledgeAccess().getSemicolonKeyword_3_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionKnowledge"


    // $ANTLR start "entryRuleDSLRestrictionGauge"
    // InternalSasDsl.g:1265:1: entryRuleDSLRestrictionGauge returns [EObject current=null] : iv_ruleDSLRestrictionGauge= ruleDSLRestrictionGauge EOF ;
    public final EObject entryRuleDSLRestrictionGauge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionGauge = null;


        try {
            // InternalSasDsl.g:1265:60: (iv_ruleDSLRestrictionGauge= ruleDSLRestrictionGauge EOF )
            // InternalSasDsl.g:1266:2: iv_ruleDSLRestrictionGauge= ruleDSLRestrictionGauge EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionGaugeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionGauge=ruleDSLRestrictionGauge();

            state._fsp--;

             current =iv_ruleDSLRestrictionGauge; 
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
    // $ANTLR end "entryRuleDSLRestrictionGauge"


    // $ANTLR start "ruleDSLRestrictionGauge"
    // InternalSasDsl.g:1272:1: ruleDSLRestrictionGauge returns [EObject current=null] : ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-gauge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-gauge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionGauge() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSasDsl.g:1278:2: ( ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-gauge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-gauge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:1279:2: ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-gauge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-gauge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:1279:2: ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-gauge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-gauge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==33) ) {
                        alt12=2;
                    }
                    else if ( (LA12_2==32) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
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
                    // InternalSasDsl.g:1280:3: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-gauge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:1280:3: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-gauge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:1281:4: otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-gauge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionGaugeAccess().getEffectorKeyword_0_0());
                    			
                    // InternalSasDsl.g:1285:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:1286:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:1286:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:1287:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionGaugeRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionGaugeAccess().getTDSLEffectorCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,32,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionGaugeAccess().getMustNotAccessGaugeKeyword_0_2());
                    			
                    // InternalSasDsl.g:1302:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1303:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1303:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1304:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionGaugeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionGaugeAccess().getGaugeDSLGaugeCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionGaugeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1321:3: (otherlv_5= 'effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-gauge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:1321:3: (otherlv_5= 'effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-gauge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:1322:4: otherlv_5= 'effector' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-gauge' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionGaugeAccess().getEffectorKeyword_1_0());
                    			
                    // InternalSasDsl.g:1326:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1327:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1327:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1328:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionGaugeRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionGaugeAccess().getTDSLEffectorCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionGaugeAccess().getMustAccessGaugeKeyword_1_2());
                    			
                    // InternalSasDsl.g:1343:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:1344:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:1344:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:1345:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionGaugeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionGaugeAccess().getGaugeDSLGaugeCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionGaugeAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1360:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1361:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1361:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1362:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionGaugeRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionGaugeAccess().getGaugeinterfaceGaugeInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionGaugeAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionGauge"


    // $ANTLR start "entryRuleDSLRestrictionManaged"
    // InternalSasDsl.g:1382:1: entryRuleDSLRestrictionManaged returns [EObject current=null] : iv_ruleDSLRestrictionManaged= ruleDSLRestrictionManaged EOF ;
    public final EObject entryRuleDSLRestrictionManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictionManaged = null;


        try {
            // InternalSasDsl.g:1382:62: (iv_ruleDSLRestrictionManaged= ruleDSLRestrictionManaged EOF )
            // InternalSasDsl.g:1383:2: iv_ruleDSLRestrictionManaged= ruleDSLRestrictionManaged EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionManagedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictionManaged=ruleDSLRestrictionManaged();

            state._fsp--;

             current =iv_ruleDSLRestrictionManaged; 
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
    // $ANTLR end "entryRuleDSLRestrictionManaged"


    // $ANTLR start "ruleDSLRestrictionManaged"
    // InternalSasDsl.g:1389:1: ruleDSLRestrictionManaged returns [EObject current=null] : ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleDSLRestrictionManaged() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSasDsl.g:1395:2: ( ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) ) )
            // InternalSasDsl.g:1396:2: ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            {
            // InternalSasDsl.g:1396:2: ( (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) | (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==36) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==35) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
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
                    // InternalSasDsl.g:1397:3: (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // InternalSasDsl.g:1397:3: (otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // InternalSasDsl.g:1398:4: otherlv_0= 'managing' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-not-access-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDSLRestrictionManagedAccess().getManagingKeyword_0_0());
                    			
                    // InternalSasDsl.g:1402:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:1403:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:1403:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:1404:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionManagedAccess().getTDSLManagingCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLRestrictionManagedAccess().getMustNotAccessManagedKeyword_0_2());
                    			
                    // InternalSasDsl.g:1419:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1420:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1420:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1421:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLRestrictionManagedAccess().getManagedDSLManagedCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionManagedAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1438:3: (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalSasDsl.g:1438:3: (otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' )
                    // InternalSasDsl.g:1439:4: otherlv_5= 'managing' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'must-access-managed' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'through-interface' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionManagedAccess().getManagingKeyword_1_0());
                    			
                    // InternalSasDsl.g:1443:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1444:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1444:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1445:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionManagedAccess().getTDSLManagingCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getDSLRestrictionManagedAccess().getMustAccessManagedKeyword_1_2());
                    			
                    // InternalSasDsl.g:1460:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSasDsl.g:1461:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSasDsl.g:1461:5: (otherlv_8= RULE_ID )
                    // InternalSasDsl.g:1462:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_8, grammarAccess.getDSLRestrictionManagedAccess().getManagedDSLManagedCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionManagedAccess().getThroughInterfaceKeyword_1_4());
                    			
                    // InternalSasDsl.g:1477:4: ( (otherlv_10= RULE_ID ) )
                    // InternalSasDsl.g:1478:5: (otherlv_10= RULE_ID )
                    {
                    // InternalSasDsl.g:1478:5: (otherlv_10= RULE_ID )
                    // InternalSasDsl.g:1479:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionManagedRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionManagedAccess().getManagedinterfaceManagedInterfaceCrossReference_1_5_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionManagedAccess().getSemicolonKeyword_1_6());
                    			

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
    // $ANTLR end "ruleDSLRestrictionManaged"


    // $ANTLR start "entryRuleDSLSensorBelongsTo"
    // InternalSasDsl.g:1499:1: entryRuleDSLSensorBelongsTo returns [EObject current=null] : iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF ;
    public final EObject entryRuleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensorBelongsTo = null;


        try {
            // InternalSasDsl.g:1499:59: (iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF )
            // InternalSasDsl.g:1500:2: iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF
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
    // InternalSasDsl.g:1506:1: ruleDSLSensorBelongsTo returns [EObject current=null] : (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1512:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1513:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1513:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1514:3: otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorBelongsToAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:1518:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1519:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1519:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1520:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1535:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1536:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1536:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1537:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1556:1: entryRuleDSLReferenceInputBelongsTo returns [EObject current=null] : iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF ;
    public final EObject entryRuleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInputBelongsTo = null;


        try {
            // InternalSasDsl.g:1556:67: (iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF )
            // InternalSasDsl.g:1557:2: iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF
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
    // InternalSasDsl.g:1563:1: ruleDSLReferenceInputBelongsTo returns [EObject current=null] : (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1569:2: ( (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1570:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1570:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1571:3: otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputBelongsToAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:1575:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1576:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1576:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1577:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1592:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1593:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1593:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1594:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1613:1: entryRuleDSLEffectorBelongsTo returns [EObject current=null] : iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF ;
    public final EObject entryRuleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffectorBelongsTo = null;


        try {
            // InternalSasDsl.g:1613:61: (iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF )
            // InternalSasDsl.g:1614:2: iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF
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
    // InternalSasDsl.g:1620:1: ruleDSLEffectorBelongsTo returns [EObject current=null] : (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1626:2: ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1627:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1627:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1628:3: otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorBelongsToAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:1632:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1633:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1633:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1634:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1649:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1650:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1650:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1651:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1670:1: entryRuleDSLMonitorBelongsTo1 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1670:61: (iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF )
            // InternalSasDsl.g:1671:2: iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF
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
    // InternalSasDsl.g:1677:1: ruleDSLMonitorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1683:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1684:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1684:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1685:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo1Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1689:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1690:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1690:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1691:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1706:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1707:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1707:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1708:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1727:1: entryRuleDSLMonitorBelongsTo2 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1727:61: (iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF )
            // InternalSasDsl.g:1728:2: iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF
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
    // InternalSasDsl.g:1734:1: ruleDSLMonitorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1740:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1741:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1741:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1742:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo2Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1746:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1747:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1747:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1748:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1763:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1764:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1764:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1765:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1784:1: entryRuleDSLAnalyzerBelongsTo1 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1784:62: (iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF )
            // InternalSasDsl.g:1785:2: iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF
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
    // InternalSasDsl.g:1791:1: ruleDSLAnalyzerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1797:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1798:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1798:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1799:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo1Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1803:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1804:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1804:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1805:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1820:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1821:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1821:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1822:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1841:1: entryRuleDSLAnalyzerBelongsTo2 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1841:62: (iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF )
            // InternalSasDsl.g:1842:2: iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF
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
    // InternalSasDsl.g:1848:1: ruleDSLAnalyzerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1854:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1855:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1855:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1856:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo2Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1860:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1861:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1861:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1862:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1877:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1878:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1878:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1879:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1898:1: entryRuleDSLPlannerBelongsTo1 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1898:61: (iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF )
            // InternalSasDsl.g:1899:2: iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF
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
    // InternalSasDsl.g:1905:1: ruleDSLPlannerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1911:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1912:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1912:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1913:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo1Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1917:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1918:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1918:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1919:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1934:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1935:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1935:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1936:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:1955:1: entryRuleDSLPlannerBelongsTo2 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1955:61: (iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF )
            // InternalSasDsl.g:1956:2: iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF
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
    // InternalSasDsl.g:1962:1: ruleDSLPlannerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1968:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1969:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1969:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1970:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo2Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1974:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1975:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1975:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1976:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:1991:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1992:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1992:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1993:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2012:1: entryRuleDSLExecutorBelongsTo1 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:2012:62: (iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF )
            // InternalSasDsl.g:2013:2: iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF
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
    // InternalSasDsl.g:2019:1: ruleDSLExecutorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2025:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2026:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2026:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2027:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo1Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:2031:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2032:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2032:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2033:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2048:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2049:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2049:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2050:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2069:1: entryRuleDSLExecutorBelongsTo2 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:2069:62: (iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF )
            // InternalSasDsl.g:2070:2: iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF
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
    // InternalSasDsl.g:2076:1: ruleDSLExecutorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2082:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2083:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2083:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2084:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo2Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:2088:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2089:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2089:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2090:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2105:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2106:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2106:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2107:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2126:1: entryRuleDSLClBelongsTo1 returns [EObject current=null] : iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF ;
    public final EObject entryRuleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo1 = null;


        try {
            // InternalSasDsl.g:2126:56: (iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF )
            // InternalSasDsl.g:2127:2: iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF
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
    // InternalSasDsl.g:2133:1: ruleDSLClBelongsTo1 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2139:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2140:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2140:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2141:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo1Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2145:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2146:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2146:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2147:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2162:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2163:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2163:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2164:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2183:1: entryRuleDSLClBelongsTo2 returns [EObject current=null] : iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF ;
    public final EObject entryRuleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo2 = null;


        try {
            // InternalSasDsl.g:2183:56: (iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF )
            // InternalSasDsl.g:2184:2: iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF
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
    // InternalSasDsl.g:2190:1: ruleDSLClBelongsTo2 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2196:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2197:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2197:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2198:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo2Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2202:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2203:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2203:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2204:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2219:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2220:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2220:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2221:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2240:1: entryRuleDSLClmBelongsTo returns [EObject current=null] : iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF ;
    public final EObject entryRuleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClmBelongsTo = null;


        try {
            // InternalSasDsl.g:2240:56: (iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF )
            // InternalSasDsl.g:2241:2: iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF
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
    // InternalSasDsl.g:2247:1: ruleDSLClmBelongsTo returns [EObject current=null] : (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2253:2: ( (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2254:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2254:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2255:3: otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClmBelongsToAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:2259:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2260:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2260:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2261:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2276:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2277:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2277:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2278:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2297:1: entryRuleDSLMeasuredOuputBelongsTo returns [EObject current=null] : iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF ;
    public final EObject entryRuleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOuputBelongsTo = null;


        try {
            // InternalSasDsl.g:2297:66: (iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF )
            // InternalSasDsl.g:2298:2: iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF
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
    // InternalSasDsl.g:2304:1: ruleDSLMeasuredOuputBelongsTo returns [EObject current=null] : (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2310:2: ( (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2311:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2311:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2312:3: otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:2316:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2317:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2317:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2318:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2333:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2334:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2334:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2335:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2354:1: entryRuleDSLGaugeBelongsTo returns [EObject current=null] : iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF ;
    public final EObject entryRuleDSLGaugeBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGaugeBelongsTo = null;


        try {
            // InternalSasDsl.g:2354:58: (iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF )
            // InternalSasDsl.g:2355:2: iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF
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
    // InternalSasDsl.g:2361:1: ruleDSLGaugeBelongsTo returns [EObject current=null] : (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLGaugeBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2367:2: ( (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2368:2: (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2368:2: (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2369:3: otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGaugeBelongsToAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:2373:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2374:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2374:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2375:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2390:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2391:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2391:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2392:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2411:1: entryRuleDSLProbeBelongsTo returns [EObject current=null] : iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF ;
    public final EObject entryRuleDSLProbeBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProbeBelongsTo = null;


        try {
            // InternalSasDsl.g:2411:58: (iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF )
            // InternalSasDsl.g:2412:2: iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF
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
    // InternalSasDsl.g:2418:1: ruleDSLProbeBelongsTo returns [EObject current=null] : (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLProbeBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2424:2: ( (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:2425:2: (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:2425:2: (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:2426:3: otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLProbeBelongsToAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:2430:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:2431:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:2431:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:2432:5: otherlv_1= RULE_ID
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
            		
            // InternalSasDsl.g:2447:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:2448:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:2448:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:2449:5: otherlv_3= RULE_ID
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
    // InternalSasDsl.g:2468:1: entryRuleDSLManaging returns [EObject current=null] : iv_ruleDSLManaging= ruleDSLManaging EOF ;
    public final EObject entryRuleDSLManaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaging = null;


        try {
            // InternalSasDsl.g:2468:52: (iv_ruleDSLManaging= ruleDSLManaging EOF )
            // InternalSasDsl.g:2469:2: iv_ruleDSLManaging= ruleDSLManaging EOF
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
    // InternalSasDsl.g:2475:1: ruleDSLManaging returns [EObject current=null] : (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLManaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2481:2: ( (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:2482:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:2482:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:2483:3: otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagingAccess().getManagingKeyword_0());
            		
            // InternalSasDsl.g:2487:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2488:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2488:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2489:5: lv_name_1_0= RULE_ID
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
    // InternalSasDsl.g:2513:1: entryRuleDSLManaged returns [EObject current=null] : iv_ruleDSLManaged= ruleDSLManaged EOF ;
    public final EObject entryRuleDSLManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaged = null;


        try {
            // InternalSasDsl.g:2513:51: (iv_ruleDSLManaged= ruleDSLManaged EOF )
            // InternalSasDsl.g:2514:2: iv_ruleDSLManaged= ruleDSLManaged EOF
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
    // InternalSasDsl.g:2520:1: ruleDSLManaged returns [EObject current=null] : (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_managedinterfaces_3_0 = null;

        EObject lv_managedinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2526:2: ( (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2527:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2527:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2528:3: otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagedAccess().getManagedKeyword_0());
            		
            // InternalSasDsl.g:2532:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2533:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2533:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2534:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:2550:3: (otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSasDsl.g:2551:4: otherlv_2= 'with-interface' ( (lv_managedinterfaces_3_0= ruleManagedInterface ) ) (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLManagedAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2555:4: ( (lv_managedinterfaces_3_0= ruleManagedInterface ) )
                    // InternalSasDsl.g:2556:5: (lv_managedinterfaces_3_0= ruleManagedInterface )
                    {
                    // InternalSasDsl.g:2556:5: (lv_managedinterfaces_3_0= ruleManagedInterface )
                    // InternalSasDsl.g:2557:6: lv_managedinterfaces_3_0= ruleManagedInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLManagedAccess().getManagedinterfacesManagedInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_managedinterfaces_3_0=ruleManagedInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLManagedRule());
                    						}
                    						add(
                    							current,
                    							"managedinterfaces",
                    							lv_managedinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ManagedInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2574:4: (otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==55) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSasDsl.g:2575:5: otherlv_4= ',' ( (lv_managedinterfaces_5_0= ruleManagedInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLManagedAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2579:5: ( (lv_managedinterfaces_5_0= ruleManagedInterface ) )
                    	    // InternalSasDsl.g:2580:6: (lv_managedinterfaces_5_0= ruleManagedInterface )
                    	    {
                    	    // InternalSasDsl.g:2580:6: (lv_managedinterfaces_5_0= ruleManagedInterface )
                    	    // InternalSasDsl.g:2581:7: lv_managedinterfaces_5_0= ruleManagedInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLManagedAccess().getManagedinterfacesManagedInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_managedinterfaces_5_0=ruleManagedInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLManagedRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"managedinterfaces",
                    	    								lv_managedinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ManagedInterface");
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
    // InternalSasDsl.g:2608:1: entryRuleDSLControlLoopManager returns [EObject current=null] : iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF ;
    public final EObject entryRuleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoopManager = null;


        try {
            // InternalSasDsl.g:2608:62: (iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF )
            // InternalSasDsl.g:2609:2: iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF
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
    // InternalSasDsl.g:2615:1: ruleDSLControlLoopManager returns [EObject current=null] : (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_clminterfaces_5_0 = null;

        EObject lv_clminterfaces_7_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2621:2: ( (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' ) )
            // InternalSasDsl.g:2622:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' )
            {
            // InternalSasDsl.g:2622:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';' )
            // InternalSasDsl.g:2623:3: otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopManagerAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:2627:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2628:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2628:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2629:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSasDsl.g:2656:3: (otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSasDsl.g:2657:4: otherlv_4= 'with-interface' ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) ) (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )*
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopManagerAccess().getWithInterfaceKeyword_4_0());
                    			
                    // InternalSasDsl.g:2661:4: ( (lv_clminterfaces_5_0= ruleControlLoopManagerInterface ) )
                    // InternalSasDsl.g:2662:5: (lv_clminterfaces_5_0= ruleControlLoopManagerInterface )
                    {
                    // InternalSasDsl.g:2662:5: (lv_clminterfaces_5_0= ruleControlLoopManagerInterface )
                    // InternalSasDsl.g:2663:6: lv_clminterfaces_5_0= ruleControlLoopManagerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getClminterfacesControlLoopManagerInterfaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_clminterfaces_5_0=ruleControlLoopManagerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLControlLoopManagerRule());
                    						}
                    						add(
                    							current,
                    							"clminterfaces",
                    							lv_clminterfaces_5_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopManagerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2680:4: (otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==55) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSasDsl.g:2681:5: otherlv_6= ',' ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDSLControlLoopManagerAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSasDsl.g:2685:5: ( (lv_clminterfaces_7_0= ruleControlLoopManagerInterface ) )
                    	    // InternalSasDsl.g:2686:6: (lv_clminterfaces_7_0= ruleControlLoopManagerInterface )
                    	    {
                    	    // InternalSasDsl.g:2686:6: (lv_clminterfaces_7_0= ruleControlLoopManagerInterface )
                    	    // InternalSasDsl.g:2687:7: lv_clminterfaces_7_0= ruleControlLoopManagerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getClminterfacesControlLoopManagerInterfaceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_clminterfaces_7_0=ruleControlLoopManagerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLControlLoopManagerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clminterfaces",
                    	    								lv_clminterfaces_7_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopManagerInterface");
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
    // InternalSasDsl.g:2714:1: entryRuleDSLTypeCLM returns [String current=null] : iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF ;
    public final String entryRuleDSLTypeCLM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDSLTypeCLM = null;


        try {
            // InternalSasDsl.g:2714:50: (iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF )
            // InternalSasDsl.g:2715:2: iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF
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
    // InternalSasDsl.g:2721:1: ruleDSLTypeCLM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) ;
    public final AntlrDatatypeRuleToken ruleDSLTypeCLM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2727:2: ( (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) )
            // InternalSasDsl.g:2728:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            {
            // InternalSasDsl.g:2728:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt18=1;
                }
                break;
            case 59:
                {
                alt18=2;
                }
                break;
            case 60:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSasDsl.g:2729:3: kw= 'Synchronized'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getSynchronizedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:2735:3: kw= 'Coordinated'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getCoordinatedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:2741:3: kw= 'Independent'
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
    // InternalSasDsl.g:2750:1: entryRuleDSLControlLoop returns [EObject current=null] : iv_ruleDSLControlLoop= ruleDSLControlLoop EOF ;
    public final EObject entryRuleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoop = null;


        try {
            // InternalSasDsl.g:2750:55: (iv_ruleDSLControlLoop= ruleDSLControlLoop EOF )
            // InternalSasDsl.g:2751:2: iv_ruleDSLControlLoop= ruleDSLControlLoop EOF
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
    // InternalSasDsl.g:2757:1: ruleDSLControlLoop returns [EObject current=null] : (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_clinterfaces_3_0 = null;

        EObject lv_clinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2763:2: ( (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2764:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2764:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2765:3: otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopAccess().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2769:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2770:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2770:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2771:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:2787:3: (otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSasDsl.g:2788:4: otherlv_2= 'with-interface' ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) ) (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2792:4: ( (lv_clinterfaces_3_0= ruleControlLoopInterface ) )
                    // InternalSasDsl.g:2793:5: (lv_clinterfaces_3_0= ruleControlLoopInterface )
                    {
                    // InternalSasDsl.g:2793:5: (lv_clinterfaces_3_0= ruleControlLoopInterface )
                    // InternalSasDsl.g:2794:6: lv_clinterfaces_3_0= ruleControlLoopInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLControlLoopAccess().getClinterfacesControlLoopInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_clinterfaces_3_0=ruleControlLoopInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLControlLoopRule());
                    						}
                    						add(
                    							current,
                    							"clinterfaces",
                    							lv_clinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2811:4: (otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==55) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSasDsl.g:2812:5: otherlv_4= ',' ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2816:5: ( (lv_clinterfaces_5_0= ruleControlLoopInterface ) )
                    	    // InternalSasDsl.g:2817:6: (lv_clinterfaces_5_0= ruleControlLoopInterface )
                    	    {
                    	    // InternalSasDsl.g:2817:6: (lv_clinterfaces_5_0= ruleControlLoopInterface )
                    	    // InternalSasDsl.g:2818:7: lv_clinterfaces_5_0= ruleControlLoopInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLControlLoopAccess().getClinterfacesControlLoopInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_clinterfaces_5_0=ruleControlLoopInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLControlLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clinterfaces",
                    	    								lv_clinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ControlLoopInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // InternalSasDsl.g:2845:1: entryRuleDSLMonitor returns [EObject current=null] : iv_ruleDSLMonitor= ruleDSLMonitor EOF ;
    public final EObject entryRuleDSLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitor = null;


        try {
            // InternalSasDsl.g:2845:51: (iv_ruleDSLMonitor= ruleDSLMonitor EOF )
            // InternalSasDsl.g:2846:2: iv_ruleDSLMonitor= ruleDSLMonitor EOF
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
    // InternalSasDsl.g:2852:1: ruleDSLMonitor returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_monitorinterfaces_3_0 = null;

        EObject lv_monitorinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2858:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2859:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2859:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2860:3: otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:2864:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2865:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2865:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2866:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:2882:3: (otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==54) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSasDsl.g:2883:4: otherlv_2= 'with-interface' ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) ) (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMonitorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2887:4: ( (lv_monitorinterfaces_3_0= ruleMonitorInterface ) )
                    // InternalSasDsl.g:2888:5: (lv_monitorinterfaces_3_0= ruleMonitorInterface )
                    {
                    // InternalSasDsl.g:2888:5: (lv_monitorinterfaces_3_0= ruleMonitorInterface )
                    // InternalSasDsl.g:2889:6: lv_monitorinterfaces_3_0= ruleMonitorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLMonitorAccess().getMonitorinterfacesMonitorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_monitorinterfaces_3_0=ruleMonitorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLMonitorRule());
                    						}
                    						add(
                    							current,
                    							"monitorinterfaces",
                    							lv_monitorinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.MonitorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:2906:4: (otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==55) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSasDsl.g:2907:5: otherlv_4= ',' ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLMonitorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2911:5: ( (lv_monitorinterfaces_5_0= ruleMonitorInterface ) )
                    	    // InternalSasDsl.g:2912:6: (lv_monitorinterfaces_5_0= ruleMonitorInterface )
                    	    {
                    	    // InternalSasDsl.g:2912:6: (lv_monitorinterfaces_5_0= ruleMonitorInterface )
                    	    // InternalSasDsl.g:2913:7: lv_monitorinterfaces_5_0= ruleMonitorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLMonitorAccess().getMonitorinterfacesMonitorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_monitorinterfaces_5_0=ruleMonitorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLMonitorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"monitorinterfaces",
                    	    								lv_monitorinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.MonitorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
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
    // InternalSasDsl.g:2940:1: entryRuleDSLAnalyzer returns [EObject current=null] : iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF ;
    public final EObject entryRuleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzer = null;


        try {
            // InternalSasDsl.g:2940:52: (iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF )
            // InternalSasDsl.g:2941:2: iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF
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
    // InternalSasDsl.g:2947:1: ruleDSLAnalyzer returns [EObject current=null] : (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2953:2: ( (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:2954:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:2954:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:2955:3: otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:2959:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2960:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2960:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2961:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerAccess().getSemicolonKeyword_2());
            		

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
    // InternalSasDsl.g:2985:1: entryRuleDSLPlanner returns [EObject current=null] : iv_ruleDSLPlanner= ruleDSLPlanner EOF ;
    public final EObject entryRuleDSLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlanner = null;


        try {
            // InternalSasDsl.g:2985:51: (iv_ruleDSLPlanner= ruleDSLPlanner EOF )
            // InternalSasDsl.g:2986:2: iv_ruleDSLPlanner= ruleDSLPlanner EOF
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
    // InternalSasDsl.g:2992:1: ruleDSLPlanner returns [EObject current=null] : (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_plannerinterfaces_3_0 = null;

        EObject lv_plannerinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:2998:2: ( (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2999:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2999:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3000:3: otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:3004:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3005:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3005:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3006:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:3022:3: (otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSasDsl.g:3023:4: otherlv_2= 'with-interface' ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) ) (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLPlannerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3027:4: ( (lv_plannerinterfaces_3_0= rulePlannerInterface ) )
                    // InternalSasDsl.g:3028:5: (lv_plannerinterfaces_3_0= rulePlannerInterface )
                    {
                    // InternalSasDsl.g:3028:5: (lv_plannerinterfaces_3_0= rulePlannerInterface )
                    // InternalSasDsl.g:3029:6: lv_plannerinterfaces_3_0= rulePlannerInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLPlannerAccess().getPlannerinterfacesPlannerInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_plannerinterfaces_3_0=rulePlannerInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLPlannerRule());
                    						}
                    						add(
                    							current,
                    							"plannerinterfaces",
                    							lv_plannerinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.PlannerInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3046:4: (otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==55) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSasDsl.g:3047:5: otherlv_4= ',' ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLPlannerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3051:5: ( (lv_plannerinterfaces_5_0= rulePlannerInterface ) )
                    	    // InternalSasDsl.g:3052:6: (lv_plannerinterfaces_5_0= rulePlannerInterface )
                    	    {
                    	    // InternalSasDsl.g:3052:6: (lv_plannerinterfaces_5_0= rulePlannerInterface )
                    	    // InternalSasDsl.g:3053:7: lv_plannerinterfaces_5_0= rulePlannerInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLPlannerAccess().getPlannerinterfacesPlannerInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_plannerinterfaces_5_0=rulePlannerInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLPlannerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"plannerinterfaces",
                    	    								lv_plannerinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.PlannerInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
    // InternalSasDsl.g:3080:1: entryRuleDSLExecutor returns [EObject current=null] : iv_ruleDSLExecutor= ruleDSLExecutor EOF ;
    public final EObject entryRuleDSLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutor = null;


        try {
            // InternalSasDsl.g:3080:52: (iv_ruleDSLExecutor= ruleDSLExecutor EOF )
            // InternalSasDsl.g:3081:2: iv_ruleDSLExecutor= ruleDSLExecutor EOF
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
    // InternalSasDsl.g:3087:1: ruleDSLExecutor returns [EObject current=null] : (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_executorinterfaces_3_0 = null;

        EObject lv_executorinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3093:2: ( (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3094:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3094:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3095:3: otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:3099:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3100:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3101:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:3117:3: (otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSasDsl.g:3118:4: otherlv_2= 'with-interface' ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) ) (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLExecutorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3122:4: ( (lv_executorinterfaces_3_0= ruleExecutorInterface ) )
                    // InternalSasDsl.g:3123:5: (lv_executorinterfaces_3_0= ruleExecutorInterface )
                    {
                    // InternalSasDsl.g:3123:5: (lv_executorinterfaces_3_0= ruleExecutorInterface )
                    // InternalSasDsl.g:3124:6: lv_executorinterfaces_3_0= ruleExecutorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLExecutorAccess().getExecutorinterfacesExecutorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_executorinterfaces_3_0=ruleExecutorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLExecutorRule());
                    						}
                    						add(
                    							current,
                    							"executorinterfaces",
                    							lv_executorinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ExecutorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3141:4: (otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==55) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSasDsl.g:3142:5: otherlv_4= ',' ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLExecutorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3146:5: ( (lv_executorinterfaces_5_0= ruleExecutorInterface ) )
                    	    // InternalSasDsl.g:3147:6: (lv_executorinterfaces_5_0= ruleExecutorInterface )
                    	    {
                    	    // InternalSasDsl.g:3147:6: (lv_executorinterfaces_5_0= ruleExecutorInterface )
                    	    // InternalSasDsl.g:3148:7: lv_executorinterfaces_5_0= ruleExecutorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLExecutorAccess().getExecutorinterfacesExecutorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_executorinterfaces_5_0=ruleExecutorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLExecutorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"executorinterfaces",
                    	    								lv_executorinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.ExecutorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
    // InternalSasDsl.g:3175:1: entryRuleDSLKnowledge returns [EObject current=null] : iv_ruleDSLKnowledge= ruleDSLKnowledge EOF ;
    public final EObject entryRuleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLKnowledge = null;


        try {
            // InternalSasDsl.g:3175:53: (iv_ruleDSLKnowledge= ruleDSLKnowledge EOF )
            // InternalSasDsl.g:3176:2: iv_ruleDSLKnowledge= ruleDSLKnowledge EOF
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
    // InternalSasDsl.g:3182:1: ruleDSLKnowledge returns [EObject current=null] : (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_knowledgeinterfaces_3_0 = null;

        EObject lv_knowledgeinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3188:2: ( (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3189:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3189:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3190:3: otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:3194:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3195:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3195:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3196:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:3212:3: (otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSasDsl.g:3213:4: otherlv_2= 'with-interface' ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) ) (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLKnowledgeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3217:4: ( (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface ) )
                    // InternalSasDsl.g:3218:5: (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface )
                    {
                    // InternalSasDsl.g:3218:5: (lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface )
                    // InternalSasDsl.g:3219:6: lv_knowledgeinterfaces_3_0= ruleKnowledgeInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getKnowledgeinterfacesKnowledgeInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_knowledgeinterfaces_3_0=ruleKnowledgeInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLKnowledgeRule());
                    						}
                    						add(
                    							current,
                    							"knowledgeinterfaces",
                    							lv_knowledgeinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.KnowledgeInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3236:4: (otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==55) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSasDsl.g:3237:5: otherlv_4= ',' ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLKnowledgeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3241:5: ( (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface ) )
                    	    // InternalSasDsl.g:3242:6: (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface )
                    	    {
                    	    // InternalSasDsl.g:3242:6: (lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface )
                    	    // InternalSasDsl.g:3243:7: lv_knowledgeinterfaces_5_0= ruleKnowledgeInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLKnowledgeAccess().getKnowledgeinterfacesKnowledgeInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_knowledgeinterfaces_5_0=ruleKnowledgeInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLKnowledgeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"knowledgeinterfaces",
                    	    								lv_knowledgeinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.KnowledgeInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
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
    // InternalSasDsl.g:3270:1: entryRuleDSLSensor returns [EObject current=null] : iv_ruleDSLSensor= ruleDSLSensor EOF ;
    public final EObject entryRuleDSLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensor = null;


        try {
            // InternalSasDsl.g:3270:50: (iv_ruleDSLSensor= ruleDSLSensor EOF )
            // InternalSasDsl.g:3271:2: iv_ruleDSLSensor= ruleDSLSensor EOF
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
    // InternalSasDsl.g:3277:1: ruleDSLSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3283:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:3284:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:3284:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:3285:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:3289:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3290:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3290:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3291:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLSensorAccess().getSemicolonKeyword_2());
            		

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
    // InternalSasDsl.g:3315:1: entryRuleDSLEffector returns [EObject current=null] : iv_ruleDSLEffector= ruleDSLEffector EOF ;
    public final EObject entryRuleDSLEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffector = null;


        try {
            // InternalSasDsl.g:3315:52: (iv_ruleDSLEffector= ruleDSLEffector EOF )
            // InternalSasDsl.g:3316:2: iv_ruleDSLEffector= ruleDSLEffector EOF
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
    // InternalSasDsl.g:3322:1: ruleDSLEffector returns [EObject current=null] : (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLEffector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_effectorinterfaces_3_0 = null;

        EObject lv_effectorinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3328:2: ( (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3329:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3329:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3330:3: otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:3334:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3335:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3335:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3336:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:3352:3: (otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSasDsl.g:3353:4: otherlv_2= 'with-interface' ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) ) (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLEffectorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3357:4: ( (lv_effectorinterfaces_3_0= ruleEffectorInterface ) )
                    // InternalSasDsl.g:3358:5: (lv_effectorinterfaces_3_0= ruleEffectorInterface )
                    {
                    // InternalSasDsl.g:3358:5: (lv_effectorinterfaces_3_0= ruleEffectorInterface )
                    // InternalSasDsl.g:3359:6: lv_effectorinterfaces_3_0= ruleEffectorInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLEffectorAccess().getEffectorinterfacesEffectorInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_effectorinterfaces_3_0=ruleEffectorInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLEffectorRule());
                    						}
                    						add(
                    							current,
                    							"effectorinterfaces",
                    							lv_effectorinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.EffectorInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3376:4: (otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==55) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalSasDsl.g:3377:5: otherlv_4= ',' ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLEffectorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3381:5: ( (lv_effectorinterfaces_5_0= ruleEffectorInterface ) )
                    	    // InternalSasDsl.g:3382:6: (lv_effectorinterfaces_5_0= ruleEffectorInterface )
                    	    {
                    	    // InternalSasDsl.g:3382:6: (lv_effectorinterfaces_5_0= ruleEffectorInterface )
                    	    // InternalSasDsl.g:3383:7: lv_effectorinterfaces_5_0= ruleEffectorInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLEffectorAccess().getEffectorinterfacesEffectorInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_effectorinterfaces_5_0=ruleEffectorInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLEffectorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"effectorinterfaces",
                    	    								lv_effectorinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.EffectorInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
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
    // InternalSasDsl.g:3410:1: entryRuleDSLProbe returns [EObject current=null] : iv_ruleDSLProbe= ruleDSLProbe EOF ;
    public final EObject entryRuleDSLProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProbe = null;


        try {
            // InternalSasDsl.g:3410:49: (iv_ruleDSLProbe= ruleDSLProbe EOF )
            // InternalSasDsl.g:3411:2: iv_ruleDSLProbe= ruleDSLProbe EOF
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
    // InternalSasDsl.g:3417:1: ruleDSLProbe returns [EObject current=null] : (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' ) ;
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
            // InternalSasDsl.g:3423:2: ( (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3424:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3424:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3425:3: otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLProbeAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:3429:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3430:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3430:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3431:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:3447:3: (otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSasDsl.g:3448:4: otherlv_2= 'with-interface' ( (lv_probeinterfaces_3_0= ruleProbeInterface ) ) (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLProbeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3452:4: ( (lv_probeinterfaces_3_0= ruleProbeInterface ) )
                    // InternalSasDsl.g:3453:5: (lv_probeinterfaces_3_0= ruleProbeInterface )
                    {
                    // InternalSasDsl.g:3453:5: (lv_probeinterfaces_3_0= ruleProbeInterface )
                    // InternalSasDsl.g:3454:6: lv_probeinterfaces_3_0= ruleProbeInterface
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

                    // InternalSasDsl.g:3471:4: (otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==55) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSasDsl.g:3472:5: otherlv_4= ',' ( (lv_probeinterfaces_5_0= ruleProbeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLProbeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3476:5: ( (lv_probeinterfaces_5_0= ruleProbeInterface ) )
                    	    // InternalSasDsl.g:3477:6: (lv_probeinterfaces_5_0= ruleProbeInterface )
                    	    {
                    	    // InternalSasDsl.g:3477:6: (lv_probeinterfaces_5_0= ruleProbeInterface )
                    	    // InternalSasDsl.g:3478:7: lv_probeinterfaces_5_0= ruleProbeInterface
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
                    	    break loop31;
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
    // InternalSasDsl.g:3505:1: entryRuleDSLGauge returns [EObject current=null] : iv_ruleDSLGauge= ruleDSLGauge EOF ;
    public final EObject entryRuleDSLGauge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGauge = null;


        try {
            // InternalSasDsl.g:3505:49: (iv_ruleDSLGauge= ruleDSLGauge EOF )
            // InternalSasDsl.g:3506:2: iv_ruleDSLGauge= ruleDSLGauge EOF
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
    // InternalSasDsl.g:3512:1: ruleDSLGauge returns [EObject current=null] : (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLGauge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_gaugeinterfaces_3_0 = null;

        EObject lv_gaugeinterfaces_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3518:2: ( (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3519:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3519:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3520:3: otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGaugeAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:3524:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3525:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3525:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3526:5: lv_name_1_0= RULE_ID
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

            // InternalSasDsl.g:3542:3: (otherlv_2= 'with-interface' ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSasDsl.g:3543:4: otherlv_2= 'with-interface' ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) ) (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )*
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLGaugeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3547:4: ( (lv_gaugeinterfaces_3_0= ruleGaugeInterface ) )
                    // InternalSasDsl.g:3548:5: (lv_gaugeinterfaces_3_0= ruleGaugeInterface )
                    {
                    // InternalSasDsl.g:3548:5: (lv_gaugeinterfaces_3_0= ruleGaugeInterface )
                    // InternalSasDsl.g:3549:6: lv_gaugeinterfaces_3_0= ruleGaugeInterface
                    {

                    						newCompositeNode(grammarAccess.getDSLGaugeAccess().getGaugeinterfacesGaugeInterfaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_gaugeinterfaces_3_0=ruleGaugeInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLGaugeRule());
                    						}
                    						add(
                    							current,
                    							"gaugeinterfaces",
                    							lv_gaugeinterfaces_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.GaugeInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:3566:4: (otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==55) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSasDsl.g:3567:5: otherlv_4= ',' ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLGaugeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3571:5: ( (lv_gaugeinterfaces_5_0= ruleGaugeInterface ) )
                    	    // InternalSasDsl.g:3572:6: (lv_gaugeinterfaces_5_0= ruleGaugeInterface )
                    	    {
                    	    // InternalSasDsl.g:3572:6: (lv_gaugeinterfaces_5_0= ruleGaugeInterface )
                    	    // InternalSasDsl.g:3573:7: lv_gaugeinterfaces_5_0= ruleGaugeInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getDSLGaugeAccess().getGaugeinterfacesGaugeInterfaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_gaugeinterfaces_5_0=ruleGaugeInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDSLGaugeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"gaugeinterfaces",
                    	    								lv_gaugeinterfaces_5_0,
                    	    								"br.ufscar.sas.xtext.sasdsl.SasDsl.GaugeInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
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
    // InternalSasDsl.g:3600:1: entryRuleDSLReferenceInput returns [EObject current=null] : iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF ;
    public final EObject entryRuleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInput = null;


        try {
            // InternalSasDsl.g:3600:58: (iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF )
            // InternalSasDsl.g:3601:2: iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF
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
    // InternalSasDsl.g:3607:1: ruleDSLReferenceInput returns [EObject current=null] : (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3613:2: ( (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:3614:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:3614:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:3615:3: otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:3619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3620:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputAccess().getSemicolonKeyword_2());
            		

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
    // InternalSasDsl.g:3645:1: entryRuleDSLMeasuredOutput returns [EObject current=null] : iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF ;
    public final EObject entryRuleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOutput = null;


        try {
            // InternalSasDsl.g:3645:58: (iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF )
            // InternalSasDsl.g:3646:2: iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF
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
    // InternalSasDsl.g:3652:1: ruleDSLMeasuredOutput returns [EObject current=null] : (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3658:2: ( (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSasDsl.g:3659:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSasDsl.g:3659:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSasDsl.g:3660:3: otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:3664:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3665:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3665:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3666:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOutputAccess().getSemicolonKeyword_2());
            		

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


    // $ANTLR start "entryRuleGaugeInterface"
    // InternalSasDsl.g:3690:1: entryRuleGaugeInterface returns [EObject current=null] : iv_ruleGaugeInterface= ruleGaugeInterface EOF ;
    public final EObject entryRuleGaugeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGaugeInterface = null;


        try {
            // InternalSasDsl.g:3690:55: (iv_ruleGaugeInterface= ruleGaugeInterface EOF )
            // InternalSasDsl.g:3691:2: iv_ruleGaugeInterface= ruleGaugeInterface EOF
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
    // InternalSasDsl.g:3697:1: ruleGaugeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleGaugeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3703:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3704:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3704:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3705:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3705:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3706:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3725:1: entryRuleEffectorInterface returns [EObject current=null] : iv_ruleEffectorInterface= ruleEffectorInterface EOF ;
    public final EObject entryRuleEffectorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectorInterface = null;


        try {
            // InternalSasDsl.g:3725:58: (iv_ruleEffectorInterface= ruleEffectorInterface EOF )
            // InternalSasDsl.g:3726:2: iv_ruleEffectorInterface= ruleEffectorInterface EOF
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
    // InternalSasDsl.g:3732:1: ruleEffectorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEffectorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3738:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3739:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3739:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3740:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3740:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3741:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3760:1: entryRuleProbeInterface returns [EObject current=null] : iv_ruleProbeInterface= ruleProbeInterface EOF ;
    public final EObject entryRuleProbeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbeInterface = null;


        try {
            // InternalSasDsl.g:3760:55: (iv_ruleProbeInterface= ruleProbeInterface EOF )
            // InternalSasDsl.g:3761:2: iv_ruleProbeInterface= ruleProbeInterface EOF
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
    // InternalSasDsl.g:3767:1: ruleProbeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProbeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3773:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3774:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3774:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3775:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3775:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3776:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProbeInterfaceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProbeInterfaceRule());
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
    // $ANTLR end "ruleProbeInterface"


    // $ANTLR start "entryRuleMonitorInterface"
    // InternalSasDsl.g:3795:1: entryRuleMonitorInterface returns [EObject current=null] : iv_ruleMonitorInterface= ruleMonitorInterface EOF ;
    public final EObject entryRuleMonitorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorInterface = null;


        try {
            // InternalSasDsl.g:3795:57: (iv_ruleMonitorInterface= ruleMonitorInterface EOF )
            // InternalSasDsl.g:3796:2: iv_ruleMonitorInterface= ruleMonitorInterface EOF
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
    // InternalSasDsl.g:3802:1: ruleMonitorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMonitorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3808:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3809:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3809:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3810:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3810:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3811:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRulePlannerInterface"
    // InternalSasDsl.g:3830:1: entryRulePlannerInterface returns [EObject current=null] : iv_rulePlannerInterface= rulePlannerInterface EOF ;
    public final EObject entryRulePlannerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlannerInterface = null;


        try {
            // InternalSasDsl.g:3830:57: (iv_rulePlannerInterface= rulePlannerInterface EOF )
            // InternalSasDsl.g:3831:2: iv_rulePlannerInterface= rulePlannerInterface EOF
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
    // InternalSasDsl.g:3837:1: rulePlannerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePlannerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3843:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3844:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3844:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3845:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3845:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3846:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3865:1: entryRuleExecutorInterface returns [EObject current=null] : iv_ruleExecutorInterface= ruleExecutorInterface EOF ;
    public final EObject entryRuleExecutorInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutorInterface = null;


        try {
            // InternalSasDsl.g:3865:58: (iv_ruleExecutorInterface= ruleExecutorInterface EOF )
            // InternalSasDsl.g:3866:2: iv_ruleExecutorInterface= ruleExecutorInterface EOF
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
    // InternalSasDsl.g:3872:1: ruleExecutorInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExecutorInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3878:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3879:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3879:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3880:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3880:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3881:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3900:1: entryRuleKnowledgeInterface returns [EObject current=null] : iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF ;
    public final EObject entryRuleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledgeInterface = null;


        try {
            // InternalSasDsl.g:3900:59: (iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF )
            // InternalSasDsl.g:3901:2: iv_ruleKnowledgeInterface= ruleKnowledgeInterface EOF
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
    // InternalSasDsl.g:3907:1: ruleKnowledgeInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKnowledgeInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3913:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3914:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3914:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3915:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3915:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3916:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3935:1: entryRuleControlLoopInterface returns [EObject current=null] : iv_ruleControlLoopInterface= ruleControlLoopInterface EOF ;
    public final EObject entryRuleControlLoopInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlLoopInterface = null;


        try {
            // InternalSasDsl.g:3935:61: (iv_ruleControlLoopInterface= ruleControlLoopInterface EOF )
            // InternalSasDsl.g:3936:2: iv_ruleControlLoopInterface= ruleControlLoopInterface EOF
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
    // InternalSasDsl.g:3942:1: ruleControlLoopInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControlLoopInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3948:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3949:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3949:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3950:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3950:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3951:4: lv_name_0_0= RULE_ID
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
    // InternalSasDsl.g:3970:1: entryRuleControlLoopManagerInterface returns [EObject current=null] : iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF ;
    public final EObject entryRuleControlLoopManagerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlLoopManagerInterface = null;


        try {
            // InternalSasDsl.g:3970:68: (iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF )
            // InternalSasDsl.g:3971:2: iv_ruleControlLoopManagerInterface= ruleControlLoopManagerInterface EOF
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
    // InternalSasDsl.g:3977:1: ruleControlLoopManagerInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControlLoopManagerInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3983:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:3984:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:3984:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:3985:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:3985:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:3986:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleManagedInterface"
    // InternalSasDsl.g:4005:1: entryRuleManagedInterface returns [EObject current=null] : iv_ruleManagedInterface= ruleManagedInterface EOF ;
    public final EObject entryRuleManagedInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedInterface = null;


        try {
            // InternalSasDsl.g:4005:57: (iv_ruleManagedInterface= ruleManagedInterface EOF )
            // InternalSasDsl.g:4006:2: iv_ruleManagedInterface= ruleManagedInterface EOF
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
    // InternalSasDsl.g:4012:1: ruleManagedInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleManagedInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:4018:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSasDsl.g:4019:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSasDsl.g:4019:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSasDsl.g:4020:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSasDsl.g:4020:3: (lv_name_0_0= RULE_ID )
            // InternalSasDsl.g:4021:4: lv_name_0_0= RULE_ID
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
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\5\uffff\1\16\1\17\1\20\1\21\5\uffff\1\5\1\4\1\7\1\6\1\11\1\10\1\12\1\13\1\15\1\14";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\5\10\uffff\1\6\1\3\6\uffff\1\2\2\uffff\1\4\2\uffff\1\7\1\10\1\uffff\1\11\1\12\1\uffff\1\13\1\14",
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
            "\1\30\1\31",
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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\20\1\uffff\1\4\3\uffff\1\26\3\uffff";
    static final String dfa_9s = "\1\42\1\uffff\1\4\3\uffff\1\35\3\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\uffff\1\5\1\6\1\7\1\uffff\1\2\1\4\1\3";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\4\uffff\1\2\10\uffff\1\3\1\4\2\uffff\1\5",
            "",
            "\1\6",
            "",
            "",
            "",
            "\2\7\2\11\2\10\2\3",
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
            return "514:2: (this_DSLRestrictionProbe_0= ruleDSLRestrictionProbe | this_DSLRestrictionMonitor_1= ruleDSLRestrictionMonitor | this_DSLRestrictionPlanner_2= ruleDSLRestrictionPlanner | this_DSLRestrictionExecutor_3= ruleDSLRestrictionExecutor | this_DSLRestrictionKnowledge_4= ruleDSLRestrictionKnowledge | this_DSLRestrictionGauge_5= ruleDSLRestrictionGauge | this_DSLRestrictionManaged_6= ruleDSLRestrictionManaged )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xE130000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xE130000000002000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000DB240C0212000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000004C0212000L});
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
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