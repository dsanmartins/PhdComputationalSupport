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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Abstractions'", "':'", "'Restrictions'", "'Managing'", "'in'", "';'", "'Managed'", "'ControlLoopManager'", "'typeOf'", "'Synchronized'", "'Coordinated'", "'Independent'", "'ControlLoop'", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'Probe'", "'Gauge'", "'ReferenceInput'", "'MeasuredOutput'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'"
    };
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
    // InternalSasDsl.g:71:1: ruleArchitectureDefinition returns [EObject current=null] : (otherlv_0= 'Abstractions' otherlv_1= ':' ( (lv_abstractions_2_0= ruleDSLAbstractions ) )+ otherlv_3= 'Restrictions' otherlv_4= ':' ( (lv_dslRestrictions_5_0= ruleDSLRestrictions ) )* ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_abstractions_2_0 = null;

        EObject lv_dslRestrictions_5_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:77:2: ( (otherlv_0= 'Abstractions' otherlv_1= ':' ( (lv_abstractions_2_0= ruleDSLAbstractions ) )+ otherlv_3= 'Restrictions' otherlv_4= ':' ( (lv_dslRestrictions_5_0= ruleDSLRestrictions ) )* ) )
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= ':' ( (lv_abstractions_2_0= ruleDSLAbstractions ) )+ otherlv_3= 'Restrictions' otherlv_4= ':' ( (lv_dslRestrictions_5_0= ruleDSLRestrictions ) )* )
            {
            // InternalSasDsl.g:78:2: (otherlv_0= 'Abstractions' otherlv_1= ':' ( (lv_abstractions_2_0= ruleDSLAbstractions ) )+ otherlv_3= 'Restrictions' otherlv_4= ':' ( (lv_dslRestrictions_5_0= ruleDSLRestrictions ) )* )
            // InternalSasDsl.g:79:3: otherlv_0= 'Abstractions' otherlv_1= ':' ( (lv_abstractions_2_0= ruleDSLAbstractions ) )+ otherlv_3= 'Restrictions' otherlv_4= ':' ( (lv_dslRestrictions_5_0= ruleDSLRestrictions ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureDefinitionAccess().getAbstractionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_1());
            		
            // InternalSasDsl.g:87:3: ( (lv_abstractions_2_0= ruleDSLAbstractions ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=17 && LA1_0<=18)||(LA1_0>=23 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDSLAbstractions )
            	    {
            	    // InternalSasDsl.g:88:4: (lv_abstractions_2_0= ruleDSLAbstractions )
            	    // InternalSasDsl.g:89:5: lv_abstractions_2_0= ruleDSLAbstractions
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getAbstractionsDSLAbstractionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_abstractions_2_0=ruleDSLAbstractions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractions",
            	    						lv_abstractions_2_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLAbstractions");
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

            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getArchitectureDefinitionAccess().getRestrictionsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureDefinitionAccess().getColonKeyword_4());
            		
            // InternalSasDsl.g:114:3: ( (lv_dslRestrictions_5_0= ruleDSLRestrictions ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSasDsl.g:115:4: (lv_dslRestrictions_5_0= ruleDSLRestrictions )
            	    {
            	    // InternalSasDsl.g:115:4: (lv_dslRestrictions_5_0= ruleDSLRestrictions )
            	    // InternalSasDsl.g:116:5: lv_dslRestrictions_5_0= ruleDSLRestrictions
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getDslRestrictionsDSLRestrictionsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_dslRestrictions_5_0=ruleDSLRestrictions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dslRestrictions",
            	    						lv_dslRestrictions_5_0,
            	    						"br.ufscar.sas.xtext.sasdsl.SasDsl.DSLRestrictions");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleArchitectureDefinition"


    // $ANTLR start "entryRuleDSLAbstractions"
    // InternalSasDsl.g:137:1: entryRuleDSLAbstractions returns [EObject current=null] : iv_ruleDSLAbstractions= ruleDSLAbstractions EOF ;
    public final EObject entryRuleDSLAbstractions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAbstractions = null;


        try {
            // InternalSasDsl.g:137:56: (iv_ruleDSLAbstractions= ruleDSLAbstractions EOF )
            // InternalSasDsl.g:138:2: iv_ruleDSLAbstractions= ruleDSLAbstractions EOF
            {
             newCompositeNode(grammarAccess.getDSLAbstractionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLAbstractions=ruleDSLAbstractions();

            state._fsp--;

             current =iv_ruleDSLAbstractions; 
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
    // $ANTLR end "entryRuleDSLAbstractions"


    // $ANTLR start "ruleDSLAbstractions"
    // InternalSasDsl.g:144:1: ruleDSLAbstractions returns [EObject current=null] : (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput ) ;
    public final EObject ruleDSLAbstractions() throws RecognitionException {
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
            // InternalSasDsl.g:150:2: ( (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput ) )
            // InternalSasDsl.g:151:2: (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput )
            {
            // InternalSasDsl.g:151:2: (this_DSLManaging_0= ruleDSLManaging | this_DSLManaged_1= ruleDSLManaged | this_DSLControlLoopManager_2= ruleDSLControlLoopManager | this_DSLControlLoop_3= ruleDSLControlLoop | this_DSLMonitor_4= ruleDSLMonitor | this_DSLAnalyzer_5= ruleDSLAnalyzer | this_DSLPlanner_6= ruleDSLPlanner | this_DSLExecutor_7= ruleDSLExecutor | this_DSLKnowledge_8= ruleDSLKnowledge | this_DSLSensor_9= ruleDSLSensor | this_DSLEffector_10= ruleDSLEffector | this_DSLProbe_11= ruleDSLProbe | this_DSLGauge_12= ruleDSLGauge | this_DSLReferenceInput_13= ruleDSLReferenceInput | this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput )
            int alt3=15;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case 26:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            case 28:
                {
                alt3=9;
                }
                break;
            case 29:
                {
                alt3=10;
                }
                break;
            case 30:
                {
                alt3=11;
                }
                break;
            case 31:
                {
                alt3=12;
                }
                break;
            case 32:
                {
                alt3=13;
                }
                break;
            case 33:
                {
                alt3=14;
                }
                break;
            case 34:
                {
                alt3=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSasDsl.g:152:3: this_DSLManaging_0= ruleDSLManaging
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLManagingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLManaging_0=ruleDSLManaging();

                    state._fsp--;


                    			current = this_DSLManaging_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:161:3: this_DSLManaged_1= ruleDSLManaged
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLManagedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLManaged_1=ruleDSLManaged();

                    state._fsp--;


                    			current = this_DSLManaged_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:170:3: this_DSLControlLoopManager_2= ruleDSLControlLoopManager
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLControlLoopManagerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLControlLoopManager_2=ruleDSLControlLoopManager();

                    state._fsp--;


                    			current = this_DSLControlLoopManager_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:179:3: this_DSLControlLoop_3= ruleDSLControlLoop
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLControlLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLControlLoop_3=ruleDSLControlLoop();

                    state._fsp--;


                    			current = this_DSLControlLoop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:188:3: this_DSLMonitor_4= ruleDSLMonitor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLMonitorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLMonitor_4=ruleDSLMonitor();

                    state._fsp--;


                    			current = this_DSLMonitor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSasDsl.g:197:3: this_DSLAnalyzer_5= ruleDSLAnalyzer
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLAnalyzerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLAnalyzer_5=ruleDSLAnalyzer();

                    state._fsp--;


                    			current = this_DSLAnalyzer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSasDsl.g:206:3: this_DSLPlanner_6= ruleDSLPlanner
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLPlannerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLPlanner_6=ruleDSLPlanner();

                    state._fsp--;


                    			current = this_DSLPlanner_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSasDsl.g:215:3: this_DSLExecutor_7= ruleDSLExecutor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLExecutorParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLExecutor_7=ruleDSLExecutor();

                    state._fsp--;


                    			current = this_DSLExecutor_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSasDsl.g:224:3: this_DSLKnowledge_8= ruleDSLKnowledge
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLKnowledgeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLKnowledge_8=ruleDSLKnowledge();

                    state._fsp--;


                    			current = this_DSLKnowledge_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSasDsl.g:233:3: this_DSLSensor_9= ruleDSLSensor
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLSensorParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLSensor_9=ruleDSLSensor();

                    state._fsp--;


                    			current = this_DSLSensor_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSasDsl.g:242:3: this_DSLEffector_10= ruleDSLEffector
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLEffectorParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLEffector_10=ruleDSLEffector();

                    state._fsp--;


                    			current = this_DSLEffector_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSasDsl.g:251:3: this_DSLProbe_11= ruleDSLProbe
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLProbeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLProbe_11=ruleDSLProbe();

                    state._fsp--;


                    			current = this_DSLProbe_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSasDsl.g:260:3: this_DSLGauge_12= ruleDSLGauge
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLGaugeParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLGauge_12=ruleDSLGauge();

                    state._fsp--;


                    			current = this_DSLGauge_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSasDsl.g:269:3: this_DSLReferenceInput_13= ruleDSLReferenceInput
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLReferenceInputParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_DSLReferenceInput_13=ruleDSLReferenceInput();

                    state._fsp--;


                    			current = this_DSLReferenceInput_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalSasDsl.g:278:3: this_DSLMeasuredOutput_14= ruleDSLMeasuredOutput
                    {

                    			newCompositeNode(grammarAccess.getDSLAbstractionsAccess().getDSLMeasuredOutputParserRuleCall_14());
                    		
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
    // $ANTLR end "ruleDSLAbstractions"


    // $ANTLR start "entryRuleDSLManaging"
    // InternalSasDsl.g:290:1: entryRuleDSLManaging returns [EObject current=null] : iv_ruleDSLManaging= ruleDSLManaging EOF ;
    public final EObject entryRuleDSLManaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaging = null;


        try {
            // InternalSasDsl.g:290:52: (iv_ruleDSLManaging= ruleDSLManaging EOF )
            // InternalSasDsl.g:291:2: iv_ruleDSLManaging= ruleDSLManaging EOF
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
    // InternalSasDsl.g:297:1: ruleDSLManaging returns [EObject current=null] : (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLManaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:303:2: ( (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:304:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:304:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:305:3: otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagingAccess().getManagingKeyword_0());
            		
            // InternalSasDsl.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:311:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:327:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSasDsl.g:328:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLManagingAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:332:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:333:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:333:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:334:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLManagingRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLManagingAccess().getSubSystemDSLManagingCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLManagingAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:354:1: entryRuleDSLManaged returns [EObject current=null] : iv_ruleDSLManaged= ruleDSLManaged EOF ;
    public final EObject entryRuleDSLManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaged = null;


        try {
            // InternalSasDsl.g:354:51: (iv_ruleDSLManaged= ruleDSLManaged EOF )
            // InternalSasDsl.g:355:2: iv_ruleDSLManaged= ruleDSLManaged EOF
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
    // InternalSasDsl.g:361:1: ruleDSLManaged returns [EObject current=null] : (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:367:2: ( (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:368:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:368:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:369:3: otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagedAccess().getManagedKeyword_0());
            		
            // InternalSasDsl.g:373:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:374:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:374:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:375:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:391:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSasDsl.g:392:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLManagedAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:396:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:397:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:397:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:398:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLManagedRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLManagedAccess().getSubSystemDSLManagedCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLManagedAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:418:1: entryRuleDSLControlLoopManager returns [EObject current=null] : iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF ;
    public final EObject entryRuleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoopManager = null;


        try {
            // InternalSasDsl.g:418:62: (iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF )
            // InternalSasDsl.g:419:2: iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF
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
    // InternalSasDsl.g:425:1: ruleDSLControlLoopManager returns [EObject current=null] : (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:431:2: ( (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) )
            // InternalSasDsl.g:432:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:432:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            // InternalSasDsl.g:433:3: otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopManagerAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:438:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopManagerAccess().getTypeOfKeyword_2());
            		

            			newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getDSLTypeCLMParserRuleCall_3());
            		
            pushFollow(FOLLOW_8);
            ruleDSLTypeCLM();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSasDsl.g:466:3: (otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSasDsl.g:467:4: otherlv_4= 'in' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopManagerAccess().getInKeyword_4_0());
                    			
                    // InternalSasDsl.g:471:4: ( (otherlv_5= RULE_ID ) )
                    // InternalSasDsl.g:472:5: (otherlv_5= RULE_ID )
                    {
                    // InternalSasDsl.g:472:5: (otherlv_5= RULE_ID )
                    // InternalSasDsl.g:473:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLControlLoopManagerRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_5, grammarAccess.getDSLControlLoopManagerAccess().getManagingDSLManagingCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLControlLoopManagerAccess().getSemicolonKeyword_5());
            		

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
    // InternalSasDsl.g:493:1: entryRuleDSLTypeCLM returns [String current=null] : iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF ;
    public final String entryRuleDSLTypeCLM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDSLTypeCLM = null;


        try {
            // InternalSasDsl.g:493:50: (iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF )
            // InternalSasDsl.g:494:2: iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF
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
    // InternalSasDsl.g:500:1: ruleDSLTypeCLM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) ;
    public final AntlrDatatypeRuleToken ruleDSLTypeCLM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:506:2: ( (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) )
            // InternalSasDsl.g:507:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            {
            // InternalSasDsl.g:507:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
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
                    // InternalSasDsl.g:508:3: kw= 'Synchronized'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getSynchronizedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:514:3: kw= 'Coordinated'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getCoordinatedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:520:3: kw= 'Independent'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

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
    // InternalSasDsl.g:529:1: entryRuleDSLControlLoop returns [EObject current=null] : iv_ruleDSLControlLoop= ruleDSLControlLoop EOF ;
    public final EObject entryRuleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoop = null;


        try {
            // InternalSasDsl.g:529:55: (iv_ruleDSLControlLoop= ruleDSLControlLoop EOF )
            // InternalSasDsl.g:530:2: iv_ruleDSLControlLoop= ruleDSLControlLoop EOF
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
    // InternalSasDsl.g:536:1: ruleDSLControlLoop returns [EObject current=null] : (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:542:2: ( (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:543:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:543:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:544:3: otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopAccess().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:548:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:549:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:549:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:550:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:566:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSasDsl.g:567:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:571:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:572:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:572:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:573:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLControlLoopRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLControlLoopAccess().getSubSystemDSLContainrerForCLCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:593:1: entryRuleDSLMonitor returns [EObject current=null] : iv_ruleDSLMonitor= ruleDSLMonitor EOF ;
    public final EObject entryRuleDSLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitor = null;


        try {
            // InternalSasDsl.g:593:51: (iv_ruleDSLMonitor= ruleDSLMonitor EOF )
            // InternalSasDsl.g:594:2: iv_ruleDSLMonitor= ruleDSLMonitor EOF
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
    // InternalSasDsl.g:600:1: ruleDSLMonitor returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:606:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:607:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:607:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:608:3: otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:612:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:613:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:613:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:614:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:630:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSasDsl.g:631:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMonitorAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:635:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:636:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:636:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:637:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLMonitorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLMonitorAccess().getSubSystemDSLContainerForMAPECrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMonitorAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:657:1: entryRuleDSLAnalyzer returns [EObject current=null] : iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF ;
    public final EObject entryRuleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzer = null;


        try {
            // InternalSasDsl.g:657:52: (iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF )
            // InternalSasDsl.g:658:2: iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF
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
    // InternalSasDsl.g:664:1: ruleDSLAnalyzer returns [EObject current=null] : (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:670:2: ( (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:671:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:671:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:672:3: otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:676:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:677:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:677:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:678:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:694:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSasDsl.g:695:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:699:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:700:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:700:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:701:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLAnalyzerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLAnalyzerAccess().getSubSystemDSLContainerForMAPECrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:721:1: entryRuleDSLPlanner returns [EObject current=null] : iv_ruleDSLPlanner= ruleDSLPlanner EOF ;
    public final EObject entryRuleDSLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlanner = null;


        try {
            // InternalSasDsl.g:721:51: (iv_ruleDSLPlanner= ruleDSLPlanner EOF )
            // InternalSasDsl.g:722:2: iv_ruleDSLPlanner= ruleDSLPlanner EOF
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
    // InternalSasDsl.g:728:1: ruleDSLPlanner returns [EObject current=null] : (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:734:2: ( (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:735:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:735:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:736:3: otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:740:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:741:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:741:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:742:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:758:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSasDsl.g:759:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLPlannerAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:763:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:764:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:764:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:765:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLPlannerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLPlannerAccess().getSubSystemDSLContainerForMAPECrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLPlannerAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:785:1: entryRuleDSLExecutor returns [EObject current=null] : iv_ruleDSLExecutor= ruleDSLExecutor EOF ;
    public final EObject entryRuleDSLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutor = null;


        try {
            // InternalSasDsl.g:785:52: (iv_ruleDSLExecutor= ruleDSLExecutor EOF )
            // InternalSasDsl.g:786:2: iv_ruleDSLExecutor= ruleDSLExecutor EOF
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
    // InternalSasDsl.g:792:1: ruleDSLExecutor returns [EObject current=null] : (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:798:2: ( (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:799:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:799:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:800:3: otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:804:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:805:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:805:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:806:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:822:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSasDsl.g:823:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLExecutorAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:827:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:828:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:828:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:829:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLExecutorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLExecutorAccess().getSubSystemDSLContainerForMAPECrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLExecutorAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:849:1: entryRuleDSLKnowledge returns [EObject current=null] : iv_ruleDSLKnowledge= ruleDSLKnowledge EOF ;
    public final EObject entryRuleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLKnowledge = null;


        try {
            // InternalSasDsl.g:849:53: (iv_ruleDSLKnowledge= ruleDSLKnowledge EOF )
            // InternalSasDsl.g:850:2: iv_ruleDSLKnowledge= ruleDSLKnowledge EOF
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
    // InternalSasDsl.g:856:1: ruleDSLKnowledge returns [EObject current=null] : (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:862:2: ( (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:863:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:863:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:864:3: otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:868:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:869:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:869:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:870:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:886:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSasDsl.g:887:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLKnowledgeAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:891:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:892:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:892:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:893:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLKnowledgeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLKnowledgeAccess().getSubSystemDSLContainerForMAPECrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLKnowledgeAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:913:1: entryRuleDSLSensor returns [EObject current=null] : iv_ruleDSLSensor= ruleDSLSensor EOF ;
    public final EObject entryRuleDSLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensor = null;


        try {
            // InternalSasDsl.g:913:50: (iv_ruleDSLSensor= ruleDSLSensor EOF )
            // InternalSasDsl.g:914:2: iv_ruleDSLSensor= ruleDSLSensor EOF
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
    // InternalSasDsl.g:920:1: ruleDSLSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:926:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:927:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:927:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:928:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:932:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:933:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:933:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:934:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:950:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSasDsl.g:951:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLSensorAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:955:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:956:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:956:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:957:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLSensorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLSensorAccess().getMonitorDSLMonitorCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLSensorAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:977:1: entryRuleDSLEffector returns [EObject current=null] : iv_ruleDSLEffector= ruleDSLEffector EOF ;
    public final EObject entryRuleDSLEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffector = null;


        try {
            // InternalSasDsl.g:977:52: (iv_ruleDSLEffector= ruleDSLEffector EOF )
            // InternalSasDsl.g:978:2: iv_ruleDSLEffector= ruleDSLEffector EOF
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
    // InternalSasDsl.g:984:1: ruleDSLEffector returns [EObject current=null] : (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLEffector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:990:2: ( (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:991:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:991:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:992:3: otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:996:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:997:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:997:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:998:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:1014:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSasDsl.g:1015:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLEffectorAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:1019:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1020:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1020:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1021:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLEffectorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLEffectorAccess().getExecutorDSLExecutorCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLEffectorAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:1041:1: entryRuleDSLProbe returns [EObject current=null] : iv_ruleDSLProbe= ruleDSLProbe EOF ;
    public final EObject entryRuleDSLProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProbe = null;


        try {
            // InternalSasDsl.g:1041:49: (iv_ruleDSLProbe= ruleDSLProbe EOF )
            // InternalSasDsl.g:1042:2: iv_ruleDSLProbe= ruleDSLProbe EOF
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
    // InternalSasDsl.g:1048:1: ruleDSLProbe returns [EObject current=null] : (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLProbe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1054:2: ( (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:1055:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:1055:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:1056:3: otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLProbeAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:1060:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:1061:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:1061:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:1062:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:1078:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSasDsl.g:1079:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLProbeAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:1083:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1084:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1084:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1085:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLProbeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLProbeAccess().getManagedDSLManagedCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLProbeAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:1105:1: entryRuleDSLGauge returns [EObject current=null] : iv_ruleDSLGauge= ruleDSLGauge EOF ;
    public final EObject entryRuleDSLGauge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGauge = null;


        try {
            // InternalSasDsl.g:1105:49: (iv_ruleDSLGauge= ruleDSLGauge EOF )
            // InternalSasDsl.g:1106:2: iv_ruleDSLGauge= ruleDSLGauge EOF
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
    // InternalSasDsl.g:1112:1: ruleDSLGauge returns [EObject current=null] : (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLGauge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1118:2: ( (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:1119:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:1119:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:1120:3: otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGaugeAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:1124:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:1125:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:1125:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:1126:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:1142:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSasDsl.g:1143:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLGaugeAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:1147:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1148:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1148:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1149:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLGaugeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLGaugeAccess().getManagedDSLManagedCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLGaugeAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:1169:1: entryRuleDSLReferenceInput returns [EObject current=null] : iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF ;
    public final EObject entryRuleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInput = null;


        try {
            // InternalSasDsl.g:1169:58: (iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF )
            // InternalSasDsl.g:1170:2: iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF
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
    // InternalSasDsl.g:1176:1: ruleDSLReferenceInput returns [EObject current=null] : (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1182:2: ( (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:1183:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:1183:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:1184:3: otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:1188:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:1189:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:1189:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:1190:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:1206:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSasDsl.g:1207:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:1211:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1212:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1212:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1213:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLReferenceInputRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLReferenceInputAccess().getKwnoledgeDSLKnowledgeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLReferenceInputAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:1233:1: entryRuleDSLMeasuredOutput returns [EObject current=null] : iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF ;
    public final EObject entryRuleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOutput = null;


        try {
            // InternalSasDsl.g:1233:58: (iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF )
            // InternalSasDsl.g:1234:2: iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF
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
    // InternalSasDsl.g:1240:1: ruleDSLMeasuredOutput returns [EObject current=null] : (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1246:2: ( (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalSasDsl.g:1247:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalSasDsl.g:1247:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalSasDsl.g:1248:3: otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:1252:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:1253:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:1253:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:1254:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalSasDsl.g:1270:3: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSasDsl.g:1271:4: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOutputAccess().getInKeyword_2_0());
                    			
                    // InternalSasDsl.g:1275:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSasDsl.g:1276:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSasDsl.g:1276:5: (otherlv_3= RULE_ID )
                    // InternalSasDsl.g:1277:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLMeasuredOutputRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getDSLMeasuredOutputAccess().getManagedDSLManagedCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDSLMeasuredOutputAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleDSLRestrictions"
    // InternalSasDsl.g:1297:1: entryRuleDSLRestrictions returns [EObject current=null] : iv_ruleDSLRestrictions= ruleDSLRestrictions EOF ;
    public final EObject entryRuleDSLRestrictions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLRestrictions = null;


        try {
            // InternalSasDsl.g:1297:56: (iv_ruleDSLRestrictions= ruleDSLRestrictions EOF )
            // InternalSasDsl.g:1298:2: iv_ruleDSLRestrictions= ruleDSLRestrictions EOF
            {
             newCompositeNode(grammarAccess.getDSLRestrictionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLRestrictions=ruleDSLRestrictions();

            state._fsp--;

             current =iv_ruleDSLRestrictions; 
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
    // $ANTLR end "entryRuleDSLRestrictions"


    // $ANTLR start "ruleDSLRestrictions"
    // InternalSasDsl.g:1304:1: ruleDSLRestrictions returns [EObject current=null] : ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) ;
    public final EObject ruleDSLRestrictions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_only_0_0 = null;

        EObject lv_can_2_0 = null;

        EObject lv_elementType_3_0 = null;

        EObject lv_cannot_7_0 = null;

        EObject lv_elementType_8_0 = null;

        EObject lv_can_12_0 = null;

        EObject lv_elementType_13_0 = null;

        EObject lv_can_17_0 = null;

        EObject lv_elementType_18_0 = null;

        EObject lv_only2_19_0 = null;

        EObject lv_must_23_0 = null;

        EObject lv_entityType_24_0 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:1310:2: ( ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) )
            // InternalSasDsl.g:1311:2: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            {
            // InternalSasDsl.g:1311:2: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalSasDsl.g:1312:3: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // InternalSasDsl.g:1312:3: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // InternalSasDsl.g:1313:4: ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    // InternalSasDsl.g:1313:4: ( (lv_only_0_0= ruleOnly ) )
                    // InternalSasDsl.g:1314:5: (lv_only_0_0= ruleOnly )
                    {
                    // InternalSasDsl.g:1314:5: (lv_only_0_0= ruleOnly )
                    // InternalSasDsl.g:1315:6: lv_only_0_0= ruleOnly
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getOnlyOnlyParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_only_0_0=ruleOnly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"only",
                    							lv_only_0_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Only");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1332:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:1333:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:1333:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:1334:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_0_1_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:1345:4: ( (lv_can_2_0= ruleCan ) )
                    // InternalSasDsl.g:1346:5: (lv_can_2_0= ruleCan )
                    {
                    // InternalSasDsl.g:1346:5: (lv_can_2_0= ruleCan )
                    // InternalSasDsl.g:1347:6: lv_can_2_0= ruleCan
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_can_2_0=ruleCan();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"can",
                    							lv_can_2_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Can");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1364:4: ( (lv_elementType_3_0= ruleElementType ) )
                    // InternalSasDsl.g:1365:5: (lv_elementType_3_0= ruleElementType )
                    {
                    // InternalSasDsl.g:1365:5: (lv_elementType_3_0= ruleElementType )
                    // InternalSasDsl.g:1366:6: lv_elementType_3_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elementType_3_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1383:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:1384:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:1384:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:1385:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_0_4_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1402:3: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // InternalSasDsl.g:1402:3: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // InternalSasDsl.g:1403:4: ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // InternalSasDsl.g:1403:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:1404:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:1404:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:1405:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:1416:4: ( (lv_cannot_7_0= ruleCannot ) )
                    // InternalSasDsl.g:1417:5: (lv_cannot_7_0= ruleCannot )
                    {
                    // InternalSasDsl.g:1417:5: (lv_cannot_7_0= ruleCannot )
                    // InternalSasDsl.g:1418:6: lv_cannot_7_0= ruleCannot
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getCannotCannotParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_cannot_7_0=ruleCannot();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"cannot",
                    							lv_cannot_7_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Cannot");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1435:4: ( (lv_elementType_8_0= ruleElementType ) )
                    // InternalSasDsl.g:1436:5: (lv_elementType_8_0= ruleElementType )
                    {
                    // InternalSasDsl.g:1436:5: (lv_elementType_8_0= ruleElementType )
                    // InternalSasDsl.g:1437:6: lv_elementType_8_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elementType_8_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_8_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1454:4: ( (otherlv_9= RULE_ID ) )
                    // InternalSasDsl.g:1455:5: (otherlv_9= RULE_ID )
                    {
                    // InternalSasDsl.g:1455:5: (otherlv_9= RULE_ID )
                    // InternalSasDsl.g:1456:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1473:3: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    {
                    // InternalSasDsl.g:1473:3: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    // InternalSasDsl.g:1474:4: ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';'
                    {
                    // InternalSasDsl.g:1474:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSasDsl.g:1475:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSasDsl.g:1475:5: (otherlv_11= RULE_ID )
                    // InternalSasDsl.g:1476:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:1487:4: ( (lv_can_12_0= ruleCan ) )
                    // InternalSasDsl.g:1488:5: (lv_can_12_0= ruleCan )
                    {
                    // InternalSasDsl.g:1488:5: (lv_can_12_0= ruleCan )
                    // InternalSasDsl.g:1489:6: lv_can_12_0= ruleCan
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_can_12_0=ruleCan();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"can",
                    							lv_can_12_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Can");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1506:4: ( (lv_elementType_13_0= ruleElementType ) )
                    // InternalSasDsl.g:1507:5: (lv_elementType_13_0= ruleElementType )
                    {
                    // InternalSasDsl.g:1507:5: (lv_elementType_13_0= ruleElementType )
                    // InternalSasDsl.g:1508:6: lv_elementType_13_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elementType_13_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_13_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1525:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSasDsl.g:1526:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSasDsl.g:1526:5: (otherlv_14= RULE_ID )
                    // InternalSasDsl.g:1527:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_14, grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1544:3: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // InternalSasDsl.g:1544:3: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // InternalSasDsl.g:1545:4: ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // InternalSasDsl.g:1545:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSasDsl.g:1546:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSasDsl.g:1546:5: (otherlv_16= RULE_ID )
                    // InternalSasDsl.g:1547:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_16, grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_3_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:1558:4: ( (lv_can_17_0= ruleCan ) )
                    // InternalSasDsl.g:1559:5: (lv_can_17_0= ruleCan )
                    {
                    // InternalSasDsl.g:1559:5: (lv_can_17_0= ruleCan )
                    // InternalSasDsl.g:1560:6: lv_can_17_0= ruleCan
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getCanCanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_can_17_0=ruleCan();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"can",
                    							lv_can_17_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Can");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1577:4: ( (lv_elementType_18_0= ruleElementType ) )
                    // InternalSasDsl.g:1578:5: (lv_elementType_18_0= ruleElementType )
                    {
                    // InternalSasDsl.g:1578:5: (lv_elementType_18_0= ruleElementType )
                    // InternalSasDsl.g:1579:6: lv_elementType_18_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getElementTypeElementTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_elementType_18_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_18_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1596:4: ( (lv_only2_19_0= ruleOnly2 ) )
                    // InternalSasDsl.g:1597:5: (lv_only2_19_0= ruleOnly2 )
                    {
                    // InternalSasDsl.g:1597:5: (lv_only2_19_0= ruleOnly2 )
                    // InternalSasDsl.g:1598:6: lv_only2_19_0= ruleOnly2
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getOnly2Only2ParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_only2_19_0=ruleOnly2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"only2",
                    							lv_only2_19_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Only2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1615:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:1616:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:1616:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:1617:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_3_4_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:1634:3: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    {
                    // InternalSasDsl.g:1634:3: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    // InternalSasDsl.g:1635:4: ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';'
                    {
                    // InternalSasDsl.g:1635:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:1636:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:1636:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:1637:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRestrictionsAccess().getTDSLAbstractionsCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:1648:4: ( (lv_must_23_0= ruleMust ) )
                    // InternalSasDsl.g:1649:5: (lv_must_23_0= ruleMust )
                    {
                    // InternalSasDsl.g:1649:5: (lv_must_23_0= ruleMust )
                    // InternalSasDsl.g:1650:6: lv_must_23_0= ruleMust
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getMustMustParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_must_23_0=ruleMust();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"must",
                    							lv_must_23_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Must");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1667:4: ( (lv_entityType_24_0= ruleEntityType ) )
                    // InternalSasDsl.g:1668:5: (lv_entityType_24_0= ruleEntityType )
                    {
                    // InternalSasDsl.g:1668:5: (lv_entityType_24_0= ruleEntityType )
                    // InternalSasDsl.g:1669:6: lv_entityType_24_0= ruleEntityType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionsAccess().getEntityTypeEntityTypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_entityType_24_0=ruleEntityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionsRule());
                    						}
                    						set(
                    							current,
                    							"entityType",
                    							lv_entityType_24_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.EntityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:1686:4: ( (otherlv_25= RULE_ID ) )
                    // InternalSasDsl.g:1687:5: (otherlv_25= RULE_ID )
                    {
                    // InternalSasDsl.g:1687:5: (otherlv_25= RULE_ID )
                    // InternalSasDsl.g:1688:6: otherlv_25= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionsRule());
                    						}
                    					
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_25, grammarAccess.getDSLRestrictionsAccess().getTypeDSLAbstractionsCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getDSLRestrictionsAccess().getSemicolonKeyword_4_4());
                    			

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
    // $ANTLR end "ruleDSLRestrictions"


    // $ANTLR start "entryRuleOnly"
    // InternalSasDsl.g:1708:1: entryRuleOnly returns [EObject current=null] : iv_ruleOnly= ruleOnly EOF ;
    public final EObject entryRuleOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly = null;


        try {
            // InternalSasDsl.g:1708:45: (iv_ruleOnly= ruleOnly EOF )
            // InternalSasDsl.g:1709:2: iv_ruleOnly= ruleOnly EOF
            {
             newCompositeNode(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnly=ruleOnly();

            state._fsp--;

             current =iv_ruleOnly; 
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
    // $ANTLR end "entryRuleOnly"


    // $ANTLR start "ruleOnly"
    // InternalSasDsl.g:1715:1: ruleOnly returns [EObject current=null] : ( (lv_only_0_0= 'only' ) ) ;
    public final EObject ruleOnly() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1721:2: ( ( (lv_only_0_0= 'only' ) ) )
            // InternalSasDsl.g:1722:2: ( (lv_only_0_0= 'only' ) )
            {
            // InternalSasDsl.g:1722:2: ( (lv_only_0_0= 'only' ) )
            // InternalSasDsl.g:1723:3: (lv_only_0_0= 'only' )
            {
            // InternalSasDsl.g:1723:3: (lv_only_0_0= 'only' )
            // InternalSasDsl.g:1724:4: lv_only_0_0= 'only'
            {
            lv_only_0_0=(Token)match(input,35,FOLLOW_2); 

            				newLeafNode(lv_only_0_0, grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOnlyRule());
            				}
            				setWithLastConsumed(current, "only", lv_only_0_0, "only");
            			

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
    // $ANTLR end "ruleOnly"


    // $ANTLR start "entryRuleCan"
    // InternalSasDsl.g:1739:1: entryRuleCan returns [EObject current=null] : iv_ruleCan= ruleCan EOF ;
    public final EObject entryRuleCan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCan = null;


        try {
            // InternalSasDsl.g:1739:44: (iv_ruleCan= ruleCan EOF )
            // InternalSasDsl.g:1740:2: iv_ruleCan= ruleCan EOF
            {
             newCompositeNode(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCan=ruleCan();

            state._fsp--;

             current =iv_ruleCan; 
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
    // $ANTLR end "entryRuleCan"


    // $ANTLR start "ruleCan"
    // InternalSasDsl.g:1746:1: ruleCan returns [EObject current=null] : ( (lv_can_0_0= 'can-' ) ) ;
    public final EObject ruleCan() throws RecognitionException {
        EObject current = null;

        Token lv_can_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1752:2: ( ( (lv_can_0_0= 'can-' ) ) )
            // InternalSasDsl.g:1753:2: ( (lv_can_0_0= 'can-' ) )
            {
            // InternalSasDsl.g:1753:2: ( (lv_can_0_0= 'can-' ) )
            // InternalSasDsl.g:1754:3: (lv_can_0_0= 'can-' )
            {
            // InternalSasDsl.g:1754:3: (lv_can_0_0= 'can-' )
            // InternalSasDsl.g:1755:4: lv_can_0_0= 'can-'
            {
            lv_can_0_0=(Token)match(input,36,FOLLOW_2); 

            				newLeafNode(lv_can_0_0, grammarAccess.getCanAccess().getCanCanKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCanRule());
            				}
            				setWithLastConsumed(current, "can", lv_can_0_0, "can-");
            			

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
    // $ANTLR end "ruleCan"


    // $ANTLR start "entryRuleCannot"
    // InternalSasDsl.g:1770:1: entryRuleCannot returns [EObject current=null] : iv_ruleCannot= ruleCannot EOF ;
    public final EObject entryRuleCannot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCannot = null;


        try {
            // InternalSasDsl.g:1770:47: (iv_ruleCannot= ruleCannot EOF )
            // InternalSasDsl.g:1771:2: iv_ruleCannot= ruleCannot EOF
            {
             newCompositeNode(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCannot=ruleCannot();

            state._fsp--;

             current =iv_ruleCannot; 
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
    // $ANTLR end "entryRuleCannot"


    // $ANTLR start "ruleCannot"
    // InternalSasDsl.g:1777:1: ruleCannot returns [EObject current=null] : ( (lv_cannot_0_0= 'cannot-' ) ) ;
    public final EObject ruleCannot() throws RecognitionException {
        EObject current = null;

        Token lv_cannot_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1783:2: ( ( (lv_cannot_0_0= 'cannot-' ) ) )
            // InternalSasDsl.g:1784:2: ( (lv_cannot_0_0= 'cannot-' ) )
            {
            // InternalSasDsl.g:1784:2: ( (lv_cannot_0_0= 'cannot-' ) )
            // InternalSasDsl.g:1785:3: (lv_cannot_0_0= 'cannot-' )
            {
            // InternalSasDsl.g:1785:3: (lv_cannot_0_0= 'cannot-' )
            // InternalSasDsl.g:1786:4: lv_cannot_0_0= 'cannot-'
            {
            lv_cannot_0_0=(Token)match(input,37,FOLLOW_2); 

            				newLeafNode(lv_cannot_0_0, grammarAccess.getCannotAccess().getCannotCannotKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCannotRule());
            				}
            				setWithLastConsumed(current, "cannot", lv_cannot_0_0, "cannot-");
            			

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
    // $ANTLR end "ruleCannot"


    // $ANTLR start "entryRuleOnly2"
    // InternalSasDsl.g:1801:1: entryRuleOnly2 returns [EObject current=null] : iv_ruleOnly2= ruleOnly2 EOF ;
    public final EObject entryRuleOnly2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly2 = null;


        try {
            // InternalSasDsl.g:1801:46: (iv_ruleOnly2= ruleOnly2 EOF )
            // InternalSasDsl.g:1802:2: iv_ruleOnly2= ruleOnly2 EOF
            {
             newCompositeNode(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnly2=ruleOnly2();

            state._fsp--;

             current =iv_ruleOnly2; 
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
    // $ANTLR end "entryRuleOnly2"


    // $ANTLR start "ruleOnly2"
    // InternalSasDsl.g:1808:1: ruleOnly2 returns [EObject current=null] : ( (lv_only2_0_0= '-only' ) ) ;
    public final EObject ruleOnly2() throws RecognitionException {
        EObject current = null;

        Token lv_only2_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1814:2: ( ( (lv_only2_0_0= '-only' ) ) )
            // InternalSasDsl.g:1815:2: ( (lv_only2_0_0= '-only' ) )
            {
            // InternalSasDsl.g:1815:2: ( (lv_only2_0_0= '-only' ) )
            // InternalSasDsl.g:1816:3: (lv_only2_0_0= '-only' )
            {
            // InternalSasDsl.g:1816:3: (lv_only2_0_0= '-only' )
            // InternalSasDsl.g:1817:4: lv_only2_0_0= '-only'
            {
            lv_only2_0_0=(Token)match(input,38,FOLLOW_2); 

            				newLeafNode(lv_only2_0_0, grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOnly2Rule());
            				}
            				setWithLastConsumed(current, "only2", lv_only2_0_0, "-only");
            			

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
    // $ANTLR end "ruleOnly2"


    // $ANTLR start "entryRuleMust"
    // InternalSasDsl.g:1832:1: entryRuleMust returns [EObject current=null] : iv_ruleMust= ruleMust EOF ;
    public final EObject entryRuleMust() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMust = null;


        try {
            // InternalSasDsl.g:1832:45: (iv_ruleMust= ruleMust EOF )
            // InternalSasDsl.g:1833:2: iv_ruleMust= ruleMust EOF
            {
             newCompositeNode(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMust=ruleMust();

            state._fsp--;

             current =iv_ruleMust; 
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
    // $ANTLR end "entryRuleMust"


    // $ANTLR start "ruleMust"
    // InternalSasDsl.g:1839:1: ruleMust returns [EObject current=null] : ( (lv_must_0_0= 'must-' ) ) ;
    public final EObject ruleMust() throws RecognitionException {
        EObject current = null;

        Token lv_must_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1845:2: ( ( (lv_must_0_0= 'must-' ) ) )
            // InternalSasDsl.g:1846:2: ( (lv_must_0_0= 'must-' ) )
            {
            // InternalSasDsl.g:1846:2: ( (lv_must_0_0= 'must-' ) )
            // InternalSasDsl.g:1847:3: (lv_must_0_0= 'must-' )
            {
            // InternalSasDsl.g:1847:3: (lv_must_0_0= 'must-' )
            // InternalSasDsl.g:1848:4: lv_must_0_0= 'must-'
            {
            lv_must_0_0=(Token)match(input,39,FOLLOW_2); 

            				newLeafNode(lv_must_0_0, grammarAccess.getMustAccess().getMustMustKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMustRule());
            				}
            				setWithLastConsumed(current, "must", lv_must_0_0, "must-");
            			

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
    // $ANTLR end "ruleMust"


    // $ANTLR start "entryRuleElementType"
    // InternalSasDsl.g:1863:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalSasDsl.g:1863:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalSasDsl.g:1864:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalSasDsl.g:1870:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:1876:2: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // InternalSasDsl.g:1877:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // InternalSasDsl.g:1877:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=40 && LA21_0<=44)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=45 && LA21_0<=49)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSasDsl.g:1878:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current = this_BasicType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1887:3: this_EntityType_1= ruleEntityType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;


                    			current = this_EntityType_1;
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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // InternalSasDsl.g:1899:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalSasDsl.g:1899:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalSasDsl.g:1900:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalSasDsl.g:1906:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1912:2: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // InternalSasDsl.g:1913:2: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // InternalSasDsl.g:1913:2: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // InternalSasDsl.g:1914:3: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // InternalSasDsl.g:1914:3: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // InternalSasDsl.g:1915:4: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // InternalSasDsl.g:1915:4: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 42:
                {
                alt22=3;
                }
                break;
            case 43:
                {
                alt22=4;
                }
                break;
            case 44:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSasDsl.g:1916:5: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:1927:5: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:1938:5: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:1949:5: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:1960:5: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,44,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_5, grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // InternalSasDsl.g:1976:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalSasDsl.g:1976:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalSasDsl.g:1977:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalSasDsl.g:1983:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1989:2: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) )
            // InternalSasDsl.g:1990:2: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            {
            // InternalSasDsl.g:1990:2: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            // InternalSasDsl.g:1991:3: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            {
            // InternalSasDsl.g:1991:3: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            // InternalSasDsl.g:1992:4: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            {
            // InternalSasDsl.g:1992:4: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            case 49:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSasDsl.g:1993:5: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:2004:5: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,46,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:2015:5: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:2026:5: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:2037:5: lv_entity_0_5= 'useannotation'
                    {
                    lv_entity_0_5=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_5, grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_5, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleEntityType"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\44\1\50\2\uffff\12\4\2\uffff";
    static final String dfa_3s = "\1\43\1\uffff\1\47\1\61\2\uffff\12\46\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\5\1\2\12\uffff\1\3\1\4";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\36\uffff\1\1",
            "",
            "\1\3\1\5\1\uffff\1\4",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1311:2: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000007FF864000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000007FF866000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0003FF0000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});

}