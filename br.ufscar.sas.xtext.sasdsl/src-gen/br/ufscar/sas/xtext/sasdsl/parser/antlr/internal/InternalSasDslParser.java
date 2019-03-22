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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Abstractions'", "'{'", "'}'", "'Compositions'", "'Restrictions'", "'Managing'", "','", "';'", "'Managed'", "'ControlLoopManager'", "'ControlLoop'", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'Probe'", "'Gauge'", "'ReferenceInput'", "'MeauserdOutput'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalSasDsl.g:71:1: ruleArchitectureDefinition returns [EObject current=null] : (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDCLAbstractions ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' otherlv_6= '}' otherlv_7= 'Restrictions' otherlv_8= '{' otherlv_9= '}' ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_abstractions_2_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:77:2: ( (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDCLAbstractions ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' otherlv_6= '}' otherlv_7= 'Restrictions' otherlv_8= '{' otherlv_9= '}' ) )
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDCLAbstractions ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' otherlv_6= '}' otherlv_7= 'Restrictions' otherlv_8= '{' otherlv_9= '}' )
            {
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDCLAbstractions ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' otherlv_6= '}' otherlv_7= 'Restrictions' otherlv_8= '{' otherlv_9= '}' )
            // InternalSasDsl.g:79:3: otherlv_0= 'Abstractions' otherlv_1= '{' ( (lv_abstractions_2_0= ruleDCLAbstractions ) )+ otherlv_3= '}' otherlv_4= 'Compositions' otherlv_5= '{' otherlv_6= '}' otherlv_7= 'Restrictions' otherlv_8= '{' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureDefinitionAccess().getAbstractionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSasDsl.g:87:3: ( (lv_abstractions_2_0= ruleDCLAbstractions ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||(LA1_0>=19 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDCLAbstractions )
            	    {
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDCLAbstractions )
            	    // InternalSasDsl.g:89:5: lv_abstractions_2_0= ruleDCLAbstractions
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsDCLAbstractionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_abstractions_2_0=ruleDCLAbstractions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractions",
            	    						lv_abstractions_2_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DCLAbstractions");
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
            		
            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureDefinitionAccess().getRestrictionsKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getArchitectureDefinitionAccess().getLeftCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getArchitectureDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleDCLAbstractions"
    // InternalSasDsl.g:138:1: entryRuleDCLAbstractions returns [EObject current=null] : iv_ruleDCLAbstractions= ruleDCLAbstractions EOF ;
    public final EObject entryRuleDCLAbstractions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLAbstractions = null;


        try {
            // InternalSasDsl.g:138:56: (iv_ruleDCLAbstractions= ruleDCLAbstractions EOF )
            // InternalSasDsl.g:139:2: iv_ruleDCLAbstractions= ruleDCLAbstractions EOF
            {
             newCompositeNode(grammarAccess.getDCLAbstractionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLAbstractions=ruleDCLAbstractions();

            state._fsp--;

             current =iv_ruleDCLAbstractions; 
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
    // $ANTLR end "entryRuleDCLAbstractions"


    // $ANTLR start "ruleDCLAbstractions"
    // InternalSasDsl.g:145:1: ruleDCLAbstractions returns [EObject current=null] : ( ( (lv_managing_0_0= ruleDCLManaging ) ) | this_DCLManaged_1= ruleDCLManaged | this_DCLControlLoopManager_2= ruleDCLControlLoopManager | this_DCLControlLoop_3= ruleDCLControlLoop | this_DCLMonitor_4= ruleDCLMonitor | this_DCLAnalyzer_5= ruleDCLAnalyzer | this_DCLPlanner_6= ruleDCLPlanner | this_DCLExecutor_7= ruleDCLExecutor | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLSensor_9= ruleDCLSensor | this_DCLEffector_10= ruleDCLEffector | this_DCLProbe_11= ruleDCLProbe | this_DCLGauge_12= ruleDCLGauge | this_DCLReferenceInput_13= ruleDCLReferenceInput | this_DCLMeasuredOutput_14= ruleDCLMeasuredOutput ) ;
    public final EObject ruleDCLAbstractions() throws RecognitionException {
        EObject current = null;

        EObject lv_managing_0_0 = null;

        EObject this_DCLManaged_1 = null;

        EObject this_DCLControlLoopManager_2 = null;

        EObject this_DCLControlLoop_3 = null;

        EObject this_DCLMonitor_4 = null;

        EObject this_DCLAnalyzer_5 = null;

        EObject this_DCLPlanner_6 = null;

        EObject this_DCLExecutor_7 = null;

        EObject this_DCLKnowledge_8 = null;

        EObject this_DCLSensor_9 = null;

        EObject this_DCLEffector_10 = null;

        EObject this_DCLProbe_11 = null;

        EObject this_DCLGauge_12 = null;

        EObject this_DCLReferenceInput_13 = null;

        EObject this_DCLMeasuredOutput_14 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:151:2: ( ( ( (lv_managing_0_0= ruleDCLManaging ) ) | this_DCLManaged_1= ruleDCLManaged | this_DCLControlLoopManager_2= ruleDCLControlLoopManager | this_DCLControlLoop_3= ruleDCLControlLoop | this_DCLMonitor_4= ruleDCLMonitor | this_DCLAnalyzer_5= ruleDCLAnalyzer | this_DCLPlanner_6= ruleDCLPlanner | this_DCLExecutor_7= ruleDCLExecutor | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLSensor_9= ruleDCLSensor | this_DCLEffector_10= ruleDCLEffector | this_DCLProbe_11= ruleDCLProbe | this_DCLGauge_12= ruleDCLGauge | this_DCLReferenceInput_13= ruleDCLReferenceInput | this_DCLMeasuredOutput_14= ruleDCLMeasuredOutput ) )
            // InternalSasDsl.g:152:2: ( ( (lv_managing_0_0= ruleDCLManaging ) ) | this_DCLManaged_1= ruleDCLManaged | this_DCLControlLoopManager_2= ruleDCLControlLoopManager | this_DCLControlLoop_3= ruleDCLControlLoop | this_DCLMonitor_4= ruleDCLMonitor | this_DCLAnalyzer_5= ruleDCLAnalyzer | this_DCLPlanner_6= ruleDCLPlanner | this_DCLExecutor_7= ruleDCLExecutor | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLSensor_9= ruleDCLSensor | this_DCLEffector_10= ruleDCLEffector | this_DCLProbe_11= ruleDCLProbe | this_DCLGauge_12= ruleDCLGauge | this_DCLReferenceInput_13= ruleDCLReferenceInput | this_DCLMeasuredOutput_14= ruleDCLMeasuredOutput )
            {
            // InternalSasDsl.g:152:2: ( ( (lv_managing_0_0= ruleDCLManaging ) ) | this_DCLManaged_1= ruleDCLManaged | this_DCLControlLoopManager_2= ruleDCLControlLoopManager | this_DCLControlLoop_3= ruleDCLControlLoop | this_DCLMonitor_4= ruleDCLMonitor | this_DCLAnalyzer_5= ruleDCLAnalyzer | this_DCLPlanner_6= ruleDCLPlanner | this_DCLExecutor_7= ruleDCLExecutor | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLSensor_9= ruleDCLSensor | this_DCLEffector_10= ruleDCLEffector | this_DCLProbe_11= ruleDCLProbe | this_DCLGauge_12= ruleDCLGauge | this_DCLReferenceInput_13= ruleDCLReferenceInput | this_DCLMeasuredOutput_14= ruleDCLMeasuredOutput )
            int alt2=15;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 24:
                {
                alt2=7;
                }
                break;
            case 25:
                {
                alt2=8;
                }
                break;
            case 26:
                {
                alt2=9;
                }
                break;
            case 27:
                {
                alt2=10;
                }
                break;
            case 28:
                {
                alt2=11;
                }
                break;
            case 29:
                {
                alt2=12;
                }
                break;
            case 30:
                {
                alt2=13;
                }
                break;
            case 31:
                {
                alt2=14;
                }
                break;
            case 32:
                {
                alt2=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSasDsl.g:153:3: ( (lv_managing_0_0= ruleDCLManaging ) )
                    {
                    // InternalSasDsl.g:153:3: ( (lv_managing_0_0= ruleDCLManaging ) )
                    // InternalSasDsl.g:154:4: (lv_managing_0_0= ruleDCLManaging )
                    {
                    // InternalSasDsl.g:154:4: (lv_managing_0_0= ruleDCLManaging )
                    // InternalSasDsl.g:155:5: lv_managing_0_0= ruleDCLManaging
                    {

                    					newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getManagingDCLManagingParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_managing_0_0=ruleDCLManaging();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDCLAbstractionsRule());
                    					}
                    					add(
                    						current,
                    						"managing",
                    						lv_managing_0_0,
                    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DCLManaging");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:173:3: this_DCLManaged_1= ruleDCLManaged
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLManagedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLManaged_1=ruleDCLManaged();

                    state._fsp--;


                    			current = this_DCLManaged_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:182:3: this_DCLControlLoopManager_2= ruleDCLControlLoopManager
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLControlLoopManagerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLControlLoopManager_2=ruleDCLControlLoopManager();

                    state._fsp--;


                    			current = this_DCLControlLoopManager_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:191:3: this_DCLControlLoop_3= ruleDCLControlLoop
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLControlLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLControlLoop_3=ruleDCLControlLoop();

                    state._fsp--;


                    			current = this_DCLControlLoop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:200:3: this_DCLMonitor_4= ruleDCLMonitor
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLMonitorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLMonitor_4=ruleDCLMonitor();

                    state._fsp--;


                    			current = this_DCLMonitor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:209:3: this_DCLAnalyzer_5= ruleDCLAnalyzer
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLAnalyzerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLAnalyzer_5=ruleDCLAnalyzer();

                    state._fsp--;


                    			current = this_DCLAnalyzer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:218:3: this_DCLPlanner_6= ruleDCLPlanner
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLPlannerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLPlanner_6=ruleDCLPlanner();

                    state._fsp--;


                    			current = this_DCLPlanner_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:227:3: this_DCLExecutor_7= ruleDCLExecutor
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLExecutorParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLExecutor_7=ruleDCLExecutor();

                    state._fsp--;


                    			current = this_DCLExecutor_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:236:3: this_DCLKnowledge_8= ruleDCLKnowledge
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLKnowledgeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLKnowledge_8=ruleDCLKnowledge();

                    state._fsp--;


                    			current = this_DCLKnowledge_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:245:3: this_DCLSensor_9= ruleDCLSensor
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLSensorParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLSensor_9=ruleDCLSensor();

                    state._fsp--;


                    			current = this_DCLSensor_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:254:3: this_DCLEffector_10= ruleDCLEffector
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLEffectorParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLEffector_10=ruleDCLEffector();

                    state._fsp--;


                    			current = this_DCLEffector_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:263:3: this_DCLProbe_11= ruleDCLProbe
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLProbeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLProbe_11=ruleDCLProbe();

                    state._fsp--;


                    			current = this_DCLProbe_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:272:3: this_DCLGauge_12= ruleDCLGauge
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLGaugeParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLGauge_12=ruleDCLGauge();

                    state._fsp--;


                    			current = this_DCLGauge_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSasDsl.g:281:3: this_DCLReferenceInput_13= ruleDCLReferenceInput
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLReferenceInputParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLReferenceInput_13=ruleDCLReferenceInput();

                    state._fsp--;


                    			current = this_DCLReferenceInput_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalSasDsl.g:290:3: this_DCLMeasuredOutput_14= ruleDCLMeasuredOutput
                    {

                    			newCompositeNode(grammarAccess.getDCLAbstractionsAccess().getDCLMeasuredOutputParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_DCLMeasuredOutput_14=ruleDCLMeasuredOutput();

                    state._fsp--;


                    			current = this_DCLMeasuredOutput_14;
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
    // $ANTLR end "ruleDCLAbstractions"


    // $ANTLR start "entryRuleDCLManaging"
    // InternalSasDsl.g:302:1: entryRuleDCLManaging returns [EObject current=null] : iv_ruleDCLManaging= ruleDCLManaging EOF ;
    public final EObject entryRuleDCLManaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLManaging = null;


        try {
            // InternalSasDsl.g:302:52: (iv_ruleDCLManaging= ruleDCLManaging EOF )
            // InternalSasDsl.g:303:2: iv_ruleDCLManaging= ruleDCLManaging EOF
            {
             newCompositeNode(grammarAccess.getDCLManagingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLManaging=ruleDCLManaging();

            state._fsp--;

             current =iv_ruleDCLManaging; 
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
    // $ANTLR end "entryRuleDCLManaging"


    // $ANTLR start "ruleDCLManaging"
    // InternalSasDsl.g:309:1: ruleDCLManaging returns [EObject current=null] : (otherlv_0= 'Managing' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLManaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:315:2: ( (otherlv_0= 'Managing' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:316:2: (otherlv_0= 'Managing' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:316:2: (otherlv_0= 'Managing' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:317:3: otherlv_0= 'Managing' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLManagingAccess().getManagingKeyword_0());
            		
            // InternalSasDsl.g:321:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSasDsl.g:322:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:322:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:323:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:323:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:324:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLManagingAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLManagingRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:340:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==17) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:341:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLManagingAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:345:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:346:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:346:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:347:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLManagingAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLManagingRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLManagingAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleDCLManaging"


    // $ANTLR start "entryRuleDCLManaged"
    // InternalSasDsl.g:373:1: entryRuleDCLManaged returns [EObject current=null] : iv_ruleDCLManaged= ruleDCLManaged EOF ;
    public final EObject entryRuleDCLManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLManaged = null;


        try {
            // InternalSasDsl.g:373:51: (iv_ruleDCLManaged= ruleDCLManaged EOF )
            // InternalSasDsl.g:374:2: iv_ruleDCLManaged= ruleDCLManaged EOF
            {
             newCompositeNode(grammarAccess.getDCLManagedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLManaged=ruleDCLManaged();

            state._fsp--;

             current =iv_ruleDCLManaged; 
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
    // $ANTLR end "entryRuleDCLManaged"


    // $ANTLR start "ruleDCLManaged"
    // InternalSasDsl.g:380:1: ruleDCLManaged returns [EObject current=null] : (otherlv_0= 'Managed' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:386:2: ( (otherlv_0= 'Managed' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:387:2: (otherlv_0= 'Managed' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:387:2: (otherlv_0= 'Managed' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:388:3: otherlv_0= 'Managed' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLManagedAccess().getManagedKeyword_0());
            		
            // InternalSasDsl.g:392:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSasDsl.g:393:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:393:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:394:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:394:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:395:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLManagedAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLManagedRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:411:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==17) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:412:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLManagedAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:416:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:417:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:417:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:418:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLManagedAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLManagedRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLManagedAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleDCLManaged"


    // $ANTLR start "entryRuleDCLControlLoopManager"
    // InternalSasDsl.g:444:1: entryRuleDCLControlLoopManager returns [EObject current=null] : iv_ruleDCLControlLoopManager= ruleDCLControlLoopManager EOF ;
    public final EObject entryRuleDCLControlLoopManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLControlLoopManager = null;


        try {
            // InternalSasDsl.g:444:62: (iv_ruleDCLControlLoopManager= ruleDCLControlLoopManager EOF )
            // InternalSasDsl.g:445:2: iv_ruleDCLControlLoopManager= ruleDCLControlLoopManager EOF
            {
             newCompositeNode(grammarAccess.getDCLControlLoopManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLControlLoopManager=ruleDCLControlLoopManager();

            state._fsp--;

             current =iv_ruleDCLControlLoopManager; 
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
    // $ANTLR end "entryRuleDCLControlLoopManager"


    // $ANTLR start "ruleDCLControlLoopManager"
    // InternalSasDsl.g:451:1: ruleDCLControlLoopManager returns [EObject current=null] : (otherlv_0= 'ControlLoopManager' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLControlLoopManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:457:2: ( (otherlv_0= 'ControlLoopManager' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:458:2: (otherlv_0= 'ControlLoopManager' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:458:2: (otherlv_0= 'ControlLoopManager' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:459:3: otherlv_0= 'ControlLoopManager' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLControlLoopManagerAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:463:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSasDsl.g:464:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:464:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:465:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:465:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:466:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLControlLoopManagerAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLControlLoopManagerRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:482:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==17) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:483:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLControlLoopManagerAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:487:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:488:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:488:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:489:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLControlLoopManagerAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLControlLoopManagerRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLControlLoopManagerAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleDCLControlLoopManager"


    // $ANTLR start "entryRuleDCLControlLoop"
    // InternalSasDsl.g:515:1: entryRuleDCLControlLoop returns [EObject current=null] : iv_ruleDCLControlLoop= ruleDCLControlLoop EOF ;
    public final EObject entryRuleDCLControlLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLControlLoop = null;


        try {
            // InternalSasDsl.g:515:55: (iv_ruleDCLControlLoop= ruleDCLControlLoop EOF )
            // InternalSasDsl.g:516:2: iv_ruleDCLControlLoop= ruleDCLControlLoop EOF
            {
             newCompositeNode(grammarAccess.getDCLControlLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLControlLoop=ruleDCLControlLoop();

            state._fsp--;

             current =iv_ruleDCLControlLoop; 
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
    // $ANTLR end "entryRuleDCLControlLoop"


    // $ANTLR start "ruleDCLControlLoop"
    // InternalSasDsl.g:522:1: ruleDCLControlLoop returns [EObject current=null] : (otherlv_0= 'ControlLoop' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLControlLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:528:2: ( (otherlv_0= 'ControlLoop' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:529:2: (otherlv_0= 'ControlLoop' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:529:2: (otherlv_0= 'ControlLoop' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:530:3: otherlv_0= 'ControlLoop' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLControlLoopAccess().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:534:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSasDsl.g:535:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:535:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:536:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:536:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:537:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLControlLoopAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLControlLoopRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:553:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==17) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:554:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLControlLoopAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:558:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:559:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:559:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:560:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLControlLoopAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLControlLoopRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLControlLoopAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // $ANTLR end "ruleDCLControlLoop"


    // $ANTLR start "entryRuleDCLMonitor"
    // InternalSasDsl.g:586:1: entryRuleDCLMonitor returns [EObject current=null] : iv_ruleDCLMonitor= ruleDCLMonitor EOF ;
    public final EObject entryRuleDCLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLMonitor = null;


        try {
            // InternalSasDsl.g:586:51: (iv_ruleDCLMonitor= ruleDCLMonitor EOF )
            // InternalSasDsl.g:587:2: iv_ruleDCLMonitor= ruleDCLMonitor EOF
            {
             newCompositeNode(grammarAccess.getDCLMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLMonitor=ruleDCLMonitor();

            state._fsp--;

             current =iv_ruleDCLMonitor; 
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
    // $ANTLR end "entryRuleDCLMonitor"


    // $ANTLR start "ruleDCLMonitor"
    // InternalSasDsl.g:593:1: ruleDCLMonitor returns [EObject current=null] : (otherlv_0= 'Monitor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:599:2: ( (otherlv_0= 'Monitor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:600:2: (otherlv_0= 'Monitor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:600:2: (otherlv_0= 'Monitor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:601:3: otherlv_0= 'Monitor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:605:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSasDsl.g:606:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:606:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:607:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:607:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:608:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLMonitorAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLMonitorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:624:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==17) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:625:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLMonitorAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:629:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:630:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:630:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:631:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLMonitorAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLMonitorRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLMonitorAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleDCLMonitor"


    // $ANTLR start "entryRuleDCLAnalyzer"
    // InternalSasDsl.g:657:1: entryRuleDCLAnalyzer returns [EObject current=null] : iv_ruleDCLAnalyzer= ruleDCLAnalyzer EOF ;
    public final EObject entryRuleDCLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLAnalyzer = null;


        try {
            // InternalSasDsl.g:657:52: (iv_ruleDCLAnalyzer= ruleDCLAnalyzer EOF )
            // InternalSasDsl.g:658:2: iv_ruleDCLAnalyzer= ruleDCLAnalyzer EOF
            {
             newCompositeNode(grammarAccess.getDCLAnalyzerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLAnalyzer=ruleDCLAnalyzer();

            state._fsp--;

             current =iv_ruleDCLAnalyzer; 
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
    // $ANTLR end "entryRuleDCLAnalyzer"


    // $ANTLR start "ruleDCLAnalyzer"
    // InternalSasDsl.g:664:1: ruleDCLAnalyzer returns [EObject current=null] : (otherlv_0= 'Analyzer' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:670:2: ( (otherlv_0= 'Analyzer' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:671:2: (otherlv_0= 'Analyzer' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:671:2: (otherlv_0= 'Analyzer' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:672:3: otherlv_0= 'Analyzer' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLAnalyzerAccess().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:676:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSasDsl.g:677:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:677:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:678:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:678:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:679:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLAnalyzerAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLAnalyzerRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:695:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==17) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:696:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLAnalyzerAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:700:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:701:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:701:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:702:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLAnalyzerAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLAnalyzerRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLAnalyzerAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // $ANTLR end "ruleDCLAnalyzer"


    // $ANTLR start "entryRuleDCLPlanner"
    // InternalSasDsl.g:728:1: entryRuleDCLPlanner returns [EObject current=null] : iv_ruleDCLPlanner= ruleDCLPlanner EOF ;
    public final EObject entryRuleDCLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLPlanner = null;


        try {
            // InternalSasDsl.g:728:51: (iv_ruleDCLPlanner= ruleDCLPlanner EOF )
            // InternalSasDsl.g:729:2: iv_ruleDCLPlanner= ruleDCLPlanner EOF
            {
             newCompositeNode(grammarAccess.getDCLPlannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLPlanner=ruleDCLPlanner();

            state._fsp--;

             current =iv_ruleDCLPlanner; 
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
    // $ANTLR end "entryRuleDCLPlanner"


    // $ANTLR start "ruleDCLPlanner"
    // InternalSasDsl.g:735:1: ruleDCLPlanner returns [EObject current=null] : (otherlv_0= 'Planner' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:741:2: ( (otherlv_0= 'Planner' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:742:2: (otherlv_0= 'Planner' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:742:2: (otherlv_0= 'Planner' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:743:3: otherlv_0= 'Planner' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLPlannerAccess().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:747:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSasDsl.g:748:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:748:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:749:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:749:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:750:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLPlannerAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLPlannerRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:766:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==17) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:767:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLPlannerAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:771:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:772:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:772:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:773:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLPlannerAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLPlannerRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLPlannerAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // $ANTLR end "ruleDCLPlanner"


    // $ANTLR start "entryRuleDCLExecutor"
    // InternalSasDsl.g:799:1: entryRuleDCLExecutor returns [EObject current=null] : iv_ruleDCLExecutor= ruleDCLExecutor EOF ;
    public final EObject entryRuleDCLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLExecutor = null;


        try {
            // InternalSasDsl.g:799:52: (iv_ruleDCLExecutor= ruleDCLExecutor EOF )
            // InternalSasDsl.g:800:2: iv_ruleDCLExecutor= ruleDCLExecutor EOF
            {
             newCompositeNode(grammarAccess.getDCLExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLExecutor=ruleDCLExecutor();

            state._fsp--;

             current =iv_ruleDCLExecutor; 
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
    // $ANTLR end "entryRuleDCLExecutor"


    // $ANTLR start "ruleDCLExecutor"
    // InternalSasDsl.g:806:1: ruleDCLExecutor returns [EObject current=null] : (otherlv_0= 'Executor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:812:2: ( (otherlv_0= 'Executor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:813:2: (otherlv_0= 'Executor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:813:2: (otherlv_0= 'Executor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:814:3: otherlv_0= 'Executor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLExecutorAccess().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:818:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSasDsl.g:819:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:819:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:820:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:820:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:821:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLExecutorAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLExecutorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:837:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==17) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:838:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLExecutorAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:842:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:843:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:843:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:844:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLExecutorAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLExecutorRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLExecutorAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // $ANTLR end "ruleDCLExecutor"


    // $ANTLR start "entryRuleDCLKnowledge"
    // InternalSasDsl.g:870:1: entryRuleDCLKnowledge returns [EObject current=null] : iv_ruleDCLKnowledge= ruleDCLKnowledge EOF ;
    public final EObject entryRuleDCLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLKnowledge = null;


        try {
            // InternalSasDsl.g:870:53: (iv_ruleDCLKnowledge= ruleDCLKnowledge EOF )
            // InternalSasDsl.g:871:2: iv_ruleDCLKnowledge= ruleDCLKnowledge EOF
            {
             newCompositeNode(grammarAccess.getDCLKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLKnowledge=ruleDCLKnowledge();

            state._fsp--;

             current =iv_ruleDCLKnowledge; 
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
    // $ANTLR end "entryRuleDCLKnowledge"


    // $ANTLR start "ruleDCLKnowledge"
    // InternalSasDsl.g:877:1: ruleDCLKnowledge returns [EObject current=null] : (otherlv_0= 'Knowledge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:883:2: ( (otherlv_0= 'Knowledge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:884:2: (otherlv_0= 'Knowledge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:884:2: (otherlv_0= 'Knowledge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:885:3: otherlv_0= 'Knowledge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLKnowledgeAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:889:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSasDsl.g:890:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:890:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:891:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:891:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:892:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLKnowledgeAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLKnowledgeRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:908:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==17) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:909:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLKnowledgeAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:913:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:914:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:914:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:915:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLKnowledgeAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLKnowledgeRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLKnowledgeAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // $ANTLR end "ruleDCLKnowledge"


    // $ANTLR start "entryRuleDCLSensor"
    // InternalSasDsl.g:941:1: entryRuleDCLSensor returns [EObject current=null] : iv_ruleDCLSensor= ruleDCLSensor EOF ;
    public final EObject entryRuleDCLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLSensor = null;


        try {
            // InternalSasDsl.g:941:50: (iv_ruleDCLSensor= ruleDCLSensor EOF )
            // InternalSasDsl.g:942:2: iv_ruleDCLSensor= ruleDCLSensor EOF
            {
             newCompositeNode(grammarAccess.getDCLSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLSensor=ruleDCLSensor();

            state._fsp--;

             current =iv_ruleDCLSensor; 
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
    // $ANTLR end "entryRuleDCLSensor"


    // $ANTLR start "ruleDCLSensor"
    // InternalSasDsl.g:948:1: ruleDCLSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:954:2: ( (otherlv_0= 'Sensor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:955:2: (otherlv_0= 'Sensor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:955:2: (otherlv_0= 'Sensor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:956:3: otherlv_0= 'Sensor' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLSensorAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:960:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSasDsl.g:961:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:961:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:962:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:962:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:963:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLSensorAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLSensorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:979:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==17) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:980:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLSensorAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:984:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:985:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:985:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:986:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLSensorAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLSensorRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLSensorAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // $ANTLR end "ruleDCLSensor"


    // $ANTLR start "entryRuleDCLEffector"
    // InternalSasDsl.g:1012:1: entryRuleDCLEffector returns [EObject current=null] : iv_ruleDCLEffector= ruleDCLEffector EOF ;
    public final EObject entryRuleDCLEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLEffector = null;


        try {
            // InternalSasDsl.g:1012:52: (iv_ruleDCLEffector= ruleDCLEffector EOF )
            // InternalSasDsl.g:1013:2: iv_ruleDCLEffector= ruleDCLEffector EOF
            {
             newCompositeNode(grammarAccess.getDCLEffectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLEffector=ruleDCLEffector();

            state._fsp--;

             current =iv_ruleDCLEffector; 
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
    // $ANTLR end "entryRuleDCLEffector"


    // $ANTLR start "ruleDCLEffector"
    // InternalSasDsl.g:1019:1: ruleDCLEffector returns [EObject current=null] : (otherlv_0= 'Effector' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLEffector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1025:2: ( (otherlv_0= 'Effector' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:1026:2: (otherlv_0= 'Effector' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:1026:2: (otherlv_0= 'Effector' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:1027:3: otherlv_0= 'Effector' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLEffectorAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:1031:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSasDsl.g:1032:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:1032:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:1033:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:1033:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:1034:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLEffectorAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLEffectorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:1050:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==17) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:1051:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLEffectorAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:1055:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:1056:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:1056:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:1057:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLEffectorAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLEffectorRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLEffectorAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "ruleDCLEffector"


    // $ANTLR start "entryRuleDCLProbe"
    // InternalSasDsl.g:1083:1: entryRuleDCLProbe returns [EObject current=null] : iv_ruleDCLProbe= ruleDCLProbe EOF ;
    public final EObject entryRuleDCLProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLProbe = null;


        try {
            // InternalSasDsl.g:1083:49: (iv_ruleDCLProbe= ruleDCLProbe EOF )
            // InternalSasDsl.g:1084:2: iv_ruleDCLProbe= ruleDCLProbe EOF
            {
             newCompositeNode(grammarAccess.getDCLProbeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLProbe=ruleDCLProbe();

            state._fsp--;

             current =iv_ruleDCLProbe; 
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
    // $ANTLR end "entryRuleDCLProbe"


    // $ANTLR start "ruleDCLProbe"
    // InternalSasDsl.g:1090:1: ruleDCLProbe returns [EObject current=null] : (otherlv_0= 'Probe' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLProbe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1096:2: ( (otherlv_0= 'Probe' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:1097:2: (otherlv_0= 'Probe' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:1097:2: (otherlv_0= 'Probe' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:1098:3: otherlv_0= 'Probe' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLProbeAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:1102:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSasDsl.g:1103:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:1103:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:1104:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:1104:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:1105:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLProbeAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLProbeRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:1121:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==17) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:1122:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLProbeAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:1126:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:1127:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:1127:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:1128:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLProbeAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLProbeRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLProbeAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // $ANTLR end "ruleDCLProbe"


    // $ANTLR start "entryRuleDCLGauge"
    // InternalSasDsl.g:1154:1: entryRuleDCLGauge returns [EObject current=null] : iv_ruleDCLGauge= ruleDCLGauge EOF ;
    public final EObject entryRuleDCLGauge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLGauge = null;


        try {
            // InternalSasDsl.g:1154:49: (iv_ruleDCLGauge= ruleDCLGauge EOF )
            // InternalSasDsl.g:1155:2: iv_ruleDCLGauge= ruleDCLGauge EOF
            {
             newCompositeNode(grammarAccess.getDCLGaugeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLGauge=ruleDCLGauge();

            state._fsp--;

             current =iv_ruleDCLGauge; 
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
    // $ANTLR end "entryRuleDCLGauge"


    // $ANTLR start "ruleDCLGauge"
    // InternalSasDsl.g:1161:1: ruleDCLGauge returns [EObject current=null] : (otherlv_0= 'Gauge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLGauge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1167:2: ( (otherlv_0= 'Gauge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:1168:2: (otherlv_0= 'Gauge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:1168:2: (otherlv_0= 'Gauge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:1169:3: otherlv_0= 'Gauge' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLGaugeAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:1173:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSasDsl.g:1174:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:1174:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:1175:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:1175:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:1176:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLGaugeAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLGaugeRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:1192:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==17) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:1193:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLGaugeAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:1197:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:1198:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:1198:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:1199:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLGaugeAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLGaugeRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLGaugeAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // $ANTLR end "ruleDCLGauge"


    // $ANTLR start "entryRuleDCLReferenceInput"
    // InternalSasDsl.g:1225:1: entryRuleDCLReferenceInput returns [EObject current=null] : iv_ruleDCLReferenceInput= ruleDCLReferenceInput EOF ;
    public final EObject entryRuleDCLReferenceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLReferenceInput = null;


        try {
            // InternalSasDsl.g:1225:58: (iv_ruleDCLReferenceInput= ruleDCLReferenceInput EOF )
            // InternalSasDsl.g:1226:2: iv_ruleDCLReferenceInput= ruleDCLReferenceInput EOF
            {
             newCompositeNode(grammarAccess.getDCLReferenceInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLReferenceInput=ruleDCLReferenceInput();

            state._fsp--;

             current =iv_ruleDCLReferenceInput; 
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
    // $ANTLR end "entryRuleDCLReferenceInput"


    // $ANTLR start "ruleDCLReferenceInput"
    // InternalSasDsl.g:1232:1: ruleDCLReferenceInput returns [EObject current=null] : (otherlv_0= 'ReferenceInput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLReferenceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1238:2: ( (otherlv_0= 'ReferenceInput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:1239:2: (otherlv_0= 'ReferenceInput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:1239:2: (otherlv_0= 'ReferenceInput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:1240:3: otherlv_0= 'ReferenceInput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLReferenceInputAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:1244:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSasDsl.g:1245:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:1245:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:1246:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:1246:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:1247:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLReferenceInputAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLReferenceInputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:1263:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==17) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:1264:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLReferenceInputAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:1268:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:1269:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:1269:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:1270:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLReferenceInputAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLReferenceInputRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLReferenceInputAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
    // $ANTLR end "ruleDCLReferenceInput"


    // $ANTLR start "entryRuleDCLMeasuredOutput"
    // InternalSasDsl.g:1296:1: entryRuleDCLMeasuredOutput returns [EObject current=null] : iv_ruleDCLMeasuredOutput= ruleDCLMeasuredOutput EOF ;
    public final EObject entryRuleDCLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLMeasuredOutput = null;


        try {
            // InternalSasDsl.g:1296:58: (iv_ruleDCLMeasuredOutput= ruleDCLMeasuredOutput EOF )
            // InternalSasDsl.g:1297:2: iv_ruleDCLMeasuredOutput= ruleDCLMeasuredOutput EOF
            {
             newCompositeNode(grammarAccess.getDCLMeasuredOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLMeasuredOutput=ruleDCLMeasuredOutput();

            state._fsp--;

             current =iv_ruleDCLMeasuredOutput; 
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
    // $ANTLR end "entryRuleDCLMeasuredOutput"


    // $ANTLR start "ruleDCLMeasuredOutput"
    // InternalSasDsl.g:1303:1: ruleDCLMeasuredOutput returns [EObject current=null] : (otherlv_0= 'MeauserdOutput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) ;
    public final EObject ruleDCLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1309:2: ( (otherlv_0= 'MeauserdOutput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ ) )
            // InternalSasDsl.g:1310:2: (otherlv_0= 'MeauserdOutput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            {
            // InternalSasDsl.g:1310:2: (otherlv_0= 'MeauserdOutput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+ )
            // InternalSasDsl.g:1311:3: otherlv_0= 'MeauserdOutput' ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDCLMeasuredOutputAccess().getMeauserdOutputKeyword_0());
            		
            // InternalSasDsl.g:1315:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSasDsl.g:1316:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            	    {
            	    // InternalSasDsl.g:1316:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSasDsl.g:1317:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSasDsl.g:1317:5: (lv_name_1_0= RULE_ID )
            	    // InternalSasDsl.g:1318:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getDCLMeasuredOutputAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDCLMeasuredOutputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSasDsl.g:1334:4: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==17) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalSasDsl.g:1335:5: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getDCLMeasuredOutputAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalSasDsl.g:1339:5: ( (lv_name_3_0= RULE_ID ) )
            	    	    // InternalSasDsl.g:1340:6: (lv_name_3_0= RULE_ID )
            	    	    {
            	    	    // InternalSasDsl.g:1340:6: (lv_name_3_0= RULE_ID )
            	    	    // InternalSasDsl.g:1341:7: lv_name_3_0= RULE_ID
            	    	    {
            	    	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    							newLeafNode(lv_name_3_0, grammarAccess.getDCLMeasuredOutputAccess().getNameIDTerminalRuleCall_1_1_1_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getDCLMeasuredOutputRule());
            	    	    							}
            	    	    							addWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_3_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDCLMeasuredOutputAccess().getSemicolonKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // $ANTLR end "ruleDCLMeasuredOutput"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001FFF90000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001FFF92000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});

}