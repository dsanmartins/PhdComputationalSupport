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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Abstractions'", "'{'", "'}'", "'Compositions'", "'Restrictions'", "';'", "'sensor'", "'must-be-in-monitor'", "'reference-input'", "'must-be-in-knowledge'", "'effector'", "'must-be-in-executor'", "'monitor'", "'must-be-in-control-loop'", "'must-be-in-managing'", "'analyzer'", "'planner'", "'executor'", "'control-loop'", "'must-be-in-control-loop-manager'", "'control-loop-manager'", "'measured-output'", "'must-be-in-managed'", "'gauge'", "'probe'", "'Managing'", "'with-interface'", "','", "'Managed'", "'ControlLoopManager'", "'typeOf'", "'Synchronized'", "'Coordinated'", "'Independent'", "'ControlLoop'", "'Monitor'", "'Analyzer'", "'Planner'", "'Executor'", "'Knowledge'", "'Sensor'", "'Effector'", "'Probe'", "'Gauge'", "'ReferenceInput'", "'MeasuredOutput'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'"
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

                if ( (LA1_0==36||(LA1_0>=39 && LA1_0<=40)||(LA1_0>=45 && LA1_0<=56)) ) {
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

                if ( (LA2_0==17||LA2_0==19||LA2_0==21||LA2_0==23||(LA2_0>=26 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=32)||(LA2_0>=34 && LA2_0<=35)) ) {
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

                if ( (LA3_0==RULE_ID||LA3_0==57) ) {
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
            case 36:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 45:
                {
                alt4=4;
                }
                break;
            case 46:
                {
                alt4=5;
                }
                break;
            case 47:
                {
                alt4=6;
                }
                break;
            case 48:
                {
                alt4=7;
                }
                break;
            case 49:
                {
                alt4=8;
                }
                break;
            case 50:
                {
                alt4=9;
                }
                break;
            case 51:
                {
                alt4=10;
                }
                break;
            case 52:
                {
                alt4=11;
                }
                break;
            case 53:
                {
                alt4=12;
                }
                break;
            case 54:
                {
                alt4=13;
                }
                break;
            case 55:
                {
                alt4=14;
                }
                break;
            case 56:
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
    // InternalSasDsl.g:507:1: ruleDSLRestriction returns [EObject current=null] : ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) ;
    public final EObject ruleDSLRestriction() throws RecognitionException {
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
            // InternalSasDsl.g:513:2: ( ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) )
            // InternalSasDsl.g:514:2: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            {
            // InternalSasDsl.g:514:2: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSasDsl.g:515:3: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // InternalSasDsl.g:515:3: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // InternalSasDsl.g:516:4: ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    // InternalSasDsl.g:516:4: ( (lv_only_0_0= ruleOnly ) )
                    // InternalSasDsl.g:517:5: (lv_only_0_0= ruleOnly )
                    {
                    // InternalSasDsl.g:517:5: (lv_only_0_0= ruleOnly )
                    // InternalSasDsl.g:518:6: lv_only_0_0= ruleOnly
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getOnlyOnlyParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_only_0_0=ruleOnly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"only",
                    							lv_only_0_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Only");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:535:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSasDsl.g:536:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSasDsl.g:536:5: (otherlv_1= RULE_ID )
                    // InternalSasDsl.g:537:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_1, grammarAccess.getDSLRestrictionAccess().getTDSLAbstractionCrossReference_0_1_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:548:4: ( (lv_can_2_0= ruleCan ) )
                    // InternalSasDsl.g:549:5: (lv_can_2_0= ruleCan )
                    {
                    // InternalSasDsl.g:549:5: (lv_can_2_0= ruleCan )
                    // InternalSasDsl.g:550:6: lv_can_2_0= ruleCan
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getCanCanParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_can_2_0=ruleCan();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"can",
                    							lv_can_2_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Can");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:567:4: ( (lv_elementType_3_0= ruleElementType ) )
                    // InternalSasDsl.g:568:5: (lv_elementType_3_0= ruleElementType )
                    {
                    // InternalSasDsl.g:568:5: (lv_elementType_3_0= ruleElementType )
                    // InternalSasDsl.g:569:6: lv_elementType_3_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getElementTypeElementTypeParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_elementType_3_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_3_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:586:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSasDsl.g:587:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSasDsl.g:587:5: (otherlv_4= RULE_ID )
                    // InternalSasDsl.g:588:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_4, grammarAccess.getDSLRestrictionAccess().getTypeDSLAbstractionCrossReference_0_4_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:605:3: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // InternalSasDsl.g:605:3: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // InternalSasDsl.g:606:4: ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // InternalSasDsl.g:606:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSasDsl.g:607:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSasDsl.g:607:5: (otherlv_6= RULE_ID )
                    // InternalSasDsl.g:608:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_6, grammarAccess.getDSLRestrictionAccess().getTDSLAbstractionCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:619:4: ( (lv_cannot_7_0= ruleCannot ) )
                    // InternalSasDsl.g:620:5: (lv_cannot_7_0= ruleCannot )
                    {
                    // InternalSasDsl.g:620:5: (lv_cannot_7_0= ruleCannot )
                    // InternalSasDsl.g:621:6: lv_cannot_7_0= ruleCannot
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getCannotCannotParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_cannot_7_0=ruleCannot();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"cannot",
                    							lv_cannot_7_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Cannot");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:638:4: ( (lv_elementType_8_0= ruleElementType ) )
                    // InternalSasDsl.g:639:5: (lv_elementType_8_0= ruleElementType )
                    {
                    // InternalSasDsl.g:639:5: (lv_elementType_8_0= ruleElementType )
                    // InternalSasDsl.g:640:6: lv_elementType_8_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getElementTypeElementTypeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_elementType_8_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_8_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:657:4: ( (otherlv_9= RULE_ID ) )
                    // InternalSasDsl.g:658:5: (otherlv_9= RULE_ID )
                    {
                    // InternalSasDsl.g:658:5: (otherlv_9= RULE_ID )
                    // InternalSasDsl.g:659:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_9, grammarAccess.getDSLRestrictionAccess().getTypeDSLAbstractionCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:676:3: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    {
                    // InternalSasDsl.g:676:3: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    // InternalSasDsl.g:677:4: ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';'
                    {
                    // InternalSasDsl.g:677:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSasDsl.g:678:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSasDsl.g:678:5: (otherlv_11= RULE_ID )
                    // InternalSasDsl.g:679:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_11, grammarAccess.getDSLRestrictionAccess().getTDSLAbstractionCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:690:4: ( (lv_can_12_0= ruleCan ) )
                    // InternalSasDsl.g:691:5: (lv_can_12_0= ruleCan )
                    {
                    // InternalSasDsl.g:691:5: (lv_can_12_0= ruleCan )
                    // InternalSasDsl.g:692:6: lv_can_12_0= ruleCan
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getCanCanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_can_12_0=ruleCan();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"can",
                    							lv_can_12_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Can");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:709:4: ( (lv_elementType_13_0= ruleElementType ) )
                    // InternalSasDsl.g:710:5: (lv_elementType_13_0= ruleElementType )
                    {
                    // InternalSasDsl.g:710:5: (lv_elementType_13_0= ruleElementType )
                    // InternalSasDsl.g:711:6: lv_elementType_13_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getElementTypeElementTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_elementType_13_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_13_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:728:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSasDsl.g:729:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSasDsl.g:729:5: (otherlv_14= RULE_ID )
                    // InternalSasDsl.g:730:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_14, grammarAccess.getDSLRestrictionAccess().getTypeDSLAbstractionCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:747:3: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // InternalSasDsl.g:747:3: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // InternalSasDsl.g:748:4: ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // InternalSasDsl.g:748:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSasDsl.g:749:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSasDsl.g:749:5: (otherlv_16= RULE_ID )
                    // InternalSasDsl.g:750:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_16, grammarAccess.getDSLRestrictionAccess().getTDSLAbstractionCrossReference_3_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:761:4: ( (lv_can_17_0= ruleCan ) )
                    // InternalSasDsl.g:762:5: (lv_can_17_0= ruleCan )
                    {
                    // InternalSasDsl.g:762:5: (lv_can_17_0= ruleCan )
                    // InternalSasDsl.g:763:6: lv_can_17_0= ruleCan
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getCanCanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_can_17_0=ruleCan();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"can",
                    							lv_can_17_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Can");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:780:4: ( (lv_elementType_18_0= ruleElementType ) )
                    // InternalSasDsl.g:781:5: (lv_elementType_18_0= ruleElementType )
                    {
                    // InternalSasDsl.g:781:5: (lv_elementType_18_0= ruleElementType )
                    // InternalSasDsl.g:782:6: lv_elementType_18_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getElementTypeElementTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_elementType_18_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_18_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:799:4: ( (lv_only2_19_0= ruleOnly2 ) )
                    // InternalSasDsl.g:800:5: (lv_only2_19_0= ruleOnly2 )
                    {
                    // InternalSasDsl.g:800:5: (lv_only2_19_0= ruleOnly2 )
                    // InternalSasDsl.g:801:6: lv_only2_19_0= ruleOnly2
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getOnly2Only2ParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_only2_19_0=ruleOnly2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"only2",
                    							lv_only2_19_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Only2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:818:4: ( (otherlv_20= RULE_ID ) )
                    // InternalSasDsl.g:819:5: (otherlv_20= RULE_ID )
                    {
                    // InternalSasDsl.g:819:5: (otherlv_20= RULE_ID )
                    // InternalSasDsl.g:820:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_20, grammarAccess.getDSLRestrictionAccess().getTypeDSLAbstractionCrossReference_3_4_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:837:3: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    {
                    // InternalSasDsl.g:837:3: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    // InternalSasDsl.g:838:4: ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';'
                    {
                    // InternalSasDsl.g:838:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSasDsl.g:839:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSasDsl.g:839:5: (otherlv_22= RULE_ID )
                    // InternalSasDsl.g:840:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_22, grammarAccess.getDSLRestrictionAccess().getTDSLAbstractionCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalSasDsl.g:851:4: ( (lv_must_23_0= ruleMust ) )
                    // InternalSasDsl.g:852:5: (lv_must_23_0= ruleMust )
                    {
                    // InternalSasDsl.g:852:5: (lv_must_23_0= ruleMust )
                    // InternalSasDsl.g:853:6: lv_must_23_0= ruleMust
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getMustMustParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_must_23_0=ruleMust();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"must",
                    							lv_must_23_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.Must");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:870:4: ( (lv_entityType_24_0= ruleEntityType ) )
                    // InternalSasDsl.g:871:5: (lv_entityType_24_0= ruleEntityType )
                    {
                    // InternalSasDsl.g:871:5: (lv_entityType_24_0= ruleEntityType )
                    // InternalSasDsl.g:872:6: lv_entityType_24_0= ruleEntityType
                    {

                    						newCompositeNode(grammarAccess.getDSLRestrictionAccess().getEntityTypeEntityTypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_entityType_24_0=ruleEntityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDSLRestrictionRule());
                    						}
                    						set(
                    							current,
                    							"entityType",
                    							lv_entityType_24_0,
                    							"br.ufscar.sas.xtext.sasdsl.SasDsl.EntityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSasDsl.g:889:4: ( (otherlv_25= RULE_ID ) )
                    // InternalSasDsl.g:890:5: (otherlv_25= RULE_ID )
                    {
                    // InternalSasDsl.g:890:5: (otherlv_25= RULE_ID )
                    // InternalSasDsl.g:891:6: otherlv_25= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLRestrictionRule());
                    						}
                    					
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_25, grammarAccess.getDSLRestrictionAccess().getTypeDSLAbstractionCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getDSLRestrictionAccess().getSemicolonKeyword_4_4());
                    			

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
    // InternalSasDsl.g:911:1: entryRuleDSLSensorBelongsTo returns [EObject current=null] : iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF ;
    public final EObject entryRuleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensorBelongsTo = null;


        try {
            // InternalSasDsl.g:911:59: (iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF )
            // InternalSasDsl.g:912:2: iv_ruleDSLSensorBelongsTo= ruleDSLSensorBelongsTo EOF
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
    // InternalSasDsl.g:918:1: ruleDSLSensorBelongsTo returns [EObject current=null] : (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLSensorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:924:2: ( (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:925:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:925:2: (otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:926:3: otherlv_0= 'sensor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-monitor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorBelongsToAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:930:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:931:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:931:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:932:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLSensorBelongsToAccess().getSensorDSLSensorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLSensorBelongsToAccess().getMustBeInMonitorKeyword_2());
            		
            // InternalSasDsl.g:947:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:948:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:948:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:949:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLSensorBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLSensorBelongsToAccess().getMonitorDSLMonitorCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:968:1: entryRuleDSLReferenceInputBelongsTo returns [EObject current=null] : iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF ;
    public final EObject entryRuleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInputBelongsTo = null;


        try {
            // InternalSasDsl.g:968:67: (iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF )
            // InternalSasDsl.g:969:2: iv_ruleDSLReferenceInputBelongsTo= ruleDSLReferenceInputBelongsTo EOF
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
    // InternalSasDsl.g:975:1: ruleDSLReferenceInputBelongsTo returns [EObject current=null] : (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLReferenceInputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:981:2: ( (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:982:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:982:2: (otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:983:3: otherlv_0= 'reference-input' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-knowledge' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputBelongsToAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:987:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:988:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:988:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:989:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLReferenceInputBelongsToAccess().getReferenceDSLReferenceInputCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputBelongsToAccess().getMustBeInKnowledgeKeyword_2());
            		
            // InternalSasDsl.g:1004:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1005:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1005:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1006:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLReferenceInputBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLReferenceInputBelongsToAccess().getKnowledgeDSLKnowledgeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1025:1: entryRuleDSLEffectorBelongsTo returns [EObject current=null] : iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF ;
    public final EObject entryRuleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffectorBelongsTo = null;


        try {
            // InternalSasDsl.g:1025:61: (iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF )
            // InternalSasDsl.g:1026:2: iv_ruleDSLEffectorBelongsTo= ruleDSLEffectorBelongsTo EOF
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
    // InternalSasDsl.g:1032:1: ruleDSLEffectorBelongsTo returns [EObject current=null] : (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLEffectorBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1038:2: ( (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1039:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1039:2: (otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1040:3: otherlv_0= 'effector' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-executor' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorBelongsToAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:1044:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1045:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1045:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1046:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLEffectorBelongsToAccess().getEffectorDSLEffectorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLEffectorBelongsToAccess().getMustBeInExecutorKeyword_2());
            		
            // InternalSasDsl.g:1061:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1062:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1062:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1063:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLEffectorBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLEffectorBelongsToAccess().getExecutorDSLExecutorCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1082:1: entryRuleDSLMonitorBelongsTo1 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1082:61: (iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF )
            // InternalSasDsl.g:1083:2: iv_ruleDSLMonitorBelongsTo1= ruleDSLMonitorBelongsTo1 EOF
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
    // InternalSasDsl.g:1089:1: ruleDSLMonitorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1095:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1096:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1096:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1097:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo1Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1101:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1102:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1102:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1103:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMonitorBelongsTo1Access().getMonitorDSLMonitorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMonitorBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1118:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1119:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1119:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1120:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMonitorBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1139:1: entryRuleDSLMonitorBelongsTo2 returns [EObject current=null] : iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF ;
    public final EObject entryRuleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1139:61: (iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF )
            // InternalSasDsl.g:1140:2: iv_ruleDSLMonitorBelongsTo2= ruleDSLMonitorBelongsTo2 EOF
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
    // InternalSasDsl.g:1146:1: ruleDSLMonitorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMonitorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1152:2: ( (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1153:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1153:2: (otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1154:3: otherlv_0= 'monitor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorBelongsTo2Access().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:1158:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1159:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1159:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1160:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMonitorBelongsTo2Access().getMonitorDSLMonitorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMonitorBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1175:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1176:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1176:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1177:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMonitorBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMonitorBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1196:1: entryRuleDSLAnalyzerBelongsTo1 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1196:62: (iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF )
            // InternalSasDsl.g:1197:2: iv_ruleDSLAnalyzerBelongsTo1= ruleDSLAnalyzerBelongsTo1 EOF
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
    // InternalSasDsl.g:1203:1: ruleDSLAnalyzerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1209:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1210:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1210:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1211:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo1Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1215:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1216:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1216:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1217:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLAnalyzerBelongsTo1Access().getAnalyzerDSLAnalyzerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1232:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1233:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1233:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1234:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLAnalyzerBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1253:1: entryRuleDSLAnalyzerBelongsTo2 returns [EObject current=null] : iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF ;
    public final EObject entryRuleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1253:62: (iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF )
            // InternalSasDsl.g:1254:2: iv_ruleDSLAnalyzerBelongsTo2= ruleDSLAnalyzerBelongsTo2 EOF
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
    // InternalSasDsl.g:1260:1: ruleDSLAnalyzerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLAnalyzerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1266:2: ( (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1267:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1267:2: (otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1268:3: otherlv_0= 'analyzer' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerBelongsTo2Access().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:1272:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1273:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1273:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1274:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLAnalyzerBelongsTo2Access().getAnalyzerDSLAnalyzerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1289:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1290:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1290:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1291:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLAnalyzerBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLAnalyzerBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1310:1: entryRuleDSLPlannerBelongsTo1 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1310:61: (iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF )
            // InternalSasDsl.g:1311:2: iv_ruleDSLPlannerBelongsTo1= ruleDSLPlannerBelongsTo1 EOF
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
    // InternalSasDsl.g:1317:1: ruleDSLPlannerBelongsTo1 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1323:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1324:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1324:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1325:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo1Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1329:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1330:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1330:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1331:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLPlannerBelongsTo1Access().getPlannerDSLPlannerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLPlannerBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1346:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1347:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1347:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1348:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLPlannerBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1367:1: entryRuleDSLPlannerBelongsTo2 returns [EObject current=null] : iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF ;
    public final EObject entryRuleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlannerBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1367:61: (iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF )
            // InternalSasDsl.g:1368:2: iv_ruleDSLPlannerBelongsTo2= ruleDSLPlannerBelongsTo2 EOF
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
    // InternalSasDsl.g:1374:1: ruleDSLPlannerBelongsTo2 returns [EObject current=null] : (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLPlannerBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1380:2: ( (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1381:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1381:2: (otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1382:3: otherlv_0= 'planner' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerBelongsTo2Access().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:1386:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1387:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1387:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1388:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLPlannerBelongsTo2Access().getPlannerDSLPlannerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLPlannerBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1403:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1404:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1404:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1405:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLPlannerBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLPlannerBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1424:1: entryRuleDSLExecutorBelongsTo1 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1424:62: (iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF )
            // InternalSasDsl.g:1425:2: iv_ruleDSLExecutorBelongsTo1= ruleDSLExecutorBelongsTo1 EOF
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
    // InternalSasDsl.g:1431:1: ruleDSLExecutorBelongsTo1 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1437:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1438:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1438:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1439:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo1Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:1443:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1444:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1444:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1445:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLExecutorBelongsTo1Access().getExecutorDSLExecutorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLExecutorBelongsTo1Access().getMustBeInControlLoopKeyword_2());
            		
            // InternalSasDsl.g:1460:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1461:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1461:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1462:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLExecutorBelongsTo1Access().getClDSLControlLoopCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1481:1: entryRuleDSLExecutorBelongsTo2 returns [EObject current=null] : iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF ;
    public final EObject entryRuleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutorBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1481:62: (iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF )
            // InternalSasDsl.g:1482:2: iv_ruleDSLExecutorBelongsTo2= ruleDSLExecutorBelongsTo2 EOF
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
    // InternalSasDsl.g:1488:1: ruleDSLExecutorBelongsTo2 returns [EObject current=null] : (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLExecutorBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1494:2: ( (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1495:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1495:2: (otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1496:3: otherlv_0= 'executor' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorBelongsTo2Access().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:1500:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1501:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1501:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1502:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLExecutorBelongsTo2Access().getExecutorDSLExecutorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLExecutorBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1517:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1518:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1518:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1519:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLExecutorBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLExecutorBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1538:1: entryRuleDSLClBelongsTo1 returns [EObject current=null] : iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF ;
    public final EObject entryRuleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo1 = null;


        try {
            // InternalSasDsl.g:1538:56: (iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF )
            // InternalSasDsl.g:1539:2: iv_ruleDSLClBelongsTo1= ruleDSLClBelongsTo1 EOF
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
    // InternalSasDsl.g:1545:1: ruleDSLClBelongsTo1 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1551:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1552:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1552:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1553:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-control-loop-manager' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo1Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:1557:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1558:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1558:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1559:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo1Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClBelongsTo1Access().getClDSLControlLoopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClBelongsTo1Access().getMustBeInControlLoopManagerKeyword_2());
            		
            // InternalSasDsl.g:1574:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1575:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1575:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1576:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo1Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClBelongsTo1Access().getClmDSLControlLoopManagerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1595:1: entryRuleDSLClBelongsTo2 returns [EObject current=null] : iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF ;
    public final EObject entryRuleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClBelongsTo2 = null;


        try {
            // InternalSasDsl.g:1595:56: (iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF )
            // InternalSasDsl.g:1596:2: iv_ruleDSLClBelongsTo2= ruleDSLClBelongsTo2 EOF
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
    // InternalSasDsl.g:1602:1: ruleDSLClBelongsTo2 returns [EObject current=null] : (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClBelongsTo2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1608:2: ( (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1609:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1609:2: (otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1610:3: otherlv_0= 'control-loop' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClBelongsTo2Access().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:1614:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1615:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1615:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1616:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo2Rule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClBelongsTo2Access().getClDSLControlLoopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClBelongsTo2Access().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1631:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1632:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1632:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1633:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClBelongsTo2Rule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClBelongsTo2Access().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1652:1: entryRuleDSLClmBelongsTo returns [EObject current=null] : iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF ;
    public final EObject entryRuleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLClmBelongsTo = null;


        try {
            // InternalSasDsl.g:1652:56: (iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF )
            // InternalSasDsl.g:1653:2: iv_ruleDSLClmBelongsTo= ruleDSLClmBelongsTo EOF
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
    // InternalSasDsl.g:1659:1: ruleDSLClmBelongsTo returns [EObject current=null] : (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLClmBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1665:2: ( (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1666:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1666:2: (otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1667:3: otherlv_0= 'control-loop-manager' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managing' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLClmBelongsToAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:1671:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1672:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1672:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1673:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClmBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLClmBelongsToAccess().getClDSLControlLoopManagerCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLClmBelongsToAccess().getMustBeInManagingKeyword_2());
            		
            // InternalSasDsl.g:1688:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1689:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1689:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1690:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLClmBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLClmBelongsToAccess().getManagingDSLManagingCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1709:1: entryRuleDSLMeasuredOuputBelongsTo returns [EObject current=null] : iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF ;
    public final EObject entryRuleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOuputBelongsTo = null;


        try {
            // InternalSasDsl.g:1709:66: (iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF )
            // InternalSasDsl.g:1710:2: iv_ruleDSLMeasuredOuputBelongsTo= ruleDSLMeasuredOuputBelongsTo EOF
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
    // InternalSasDsl.g:1716:1: ruleDSLMeasuredOuputBelongsTo returns [EObject current=null] : (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLMeasuredOuputBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1722:2: ( (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1723:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1723:2: (otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1724:3: otherlv_0= 'measured-output' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:1728:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1729:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1729:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1730:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOuputBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMeasuredDSLMeasuredOutputCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:1745:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1746:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1746:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1747:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLMeasuredOuputBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLMeasuredOuputBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1766:1: entryRuleDSLGaugeBelongsTo returns [EObject current=null] : iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF ;
    public final EObject entryRuleDSLGaugeBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGaugeBelongsTo = null;


        try {
            // InternalSasDsl.g:1766:58: (iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF )
            // InternalSasDsl.g:1767:2: iv_ruleDSLGaugeBelongsTo= ruleDSLGaugeBelongsTo EOF
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
    // InternalSasDsl.g:1773:1: ruleDSLGaugeBelongsTo returns [EObject current=null] : (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLGaugeBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1779:2: ( (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1780:2: (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1780:2: (otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1781:3: otherlv_0= 'gauge' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGaugeBelongsToAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:1785:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1786:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1786:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1787:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLGaugeBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLGaugeBelongsToAccess().getGaugeDSLGaugeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLGaugeBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:1802:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1803:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1803:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1804:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLGaugeBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLGaugeBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1823:1: entryRuleDSLProbeBelongsTo returns [EObject current=null] : iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF ;
    public final EObject entryRuleDSLProbeBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProbeBelongsTo = null;


        try {
            // InternalSasDsl.g:1823:58: (iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF )
            // InternalSasDsl.g:1824:2: iv_ruleDSLProbeBelongsTo= ruleDSLProbeBelongsTo EOF
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
    // InternalSasDsl.g:1830:1: ruleDSLProbeBelongsTo returns [EObject current=null] : (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleDSLProbeBelongsTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1836:2: ( (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSasDsl.g:1837:2: (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSasDsl.g:1837:2: (otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSasDsl.g:1838:3: otherlv_0= 'probe' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must-be-in-managed' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLProbeBelongsToAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:1842:3: ( (otherlv_1= RULE_ID ) )
            // InternalSasDsl.g:1843:4: (otherlv_1= RULE_ID )
            {
            // InternalSasDsl.g:1843:4: (otherlv_1= RULE_ID )
            // InternalSasDsl.g:1844:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLProbeBelongsToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getDSLProbeBelongsToAccess().getProbeDSLProbeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLProbeBelongsToAccess().getMustBeInManagedKeyword_2());
            		
            // InternalSasDsl.g:1859:3: ( (otherlv_3= RULE_ID ) )
            // InternalSasDsl.g:1860:4: (otherlv_3= RULE_ID )
            {
            // InternalSasDsl.g:1860:4: (otherlv_3= RULE_ID )
            // InternalSasDsl.g:1861:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSLProbeBelongsToRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getDSLProbeBelongsToAccess().getManagedDSLManagedCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:1880:1: entryRuleDSLManaging returns [EObject current=null] : iv_ruleDSLManaging= ruleDSLManaging EOF ;
    public final EObject entryRuleDSLManaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaging = null;


        try {
            // InternalSasDsl.g:1880:52: (iv_ruleDSLManaging= ruleDSLManaging EOF )
            // InternalSasDsl.g:1881:2: iv_ruleDSLManaging= ruleDSLManaging EOF
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
    // InternalSasDsl.g:1887:1: ruleDSLManaging returns [EObject current=null] : (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLManaging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1893:2: ( (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:1894:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:1894:2: (otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:1895:3: otherlv_0= 'Managing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagingAccess().getManagingKeyword_0());
            		
            // InternalSasDsl.g:1899:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:1900:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:1900:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:1901:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:1917:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSasDsl.g:1918:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLManagingAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:1922:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:1923:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:1923:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:1924:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLManagingAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLManagingRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:1940:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==38) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSasDsl.g:1941:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLManagingAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:1945:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:1946:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:1946:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:1947:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLManagingAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLManagingRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDSLManagingAccess().getSemicolonKeyword_3());
            		

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
    // InternalSasDsl.g:1973:1: entryRuleDSLManaged returns [EObject current=null] : iv_ruleDSLManaged= ruleDSLManaged EOF ;
    public final EObject entryRuleDSLManaged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLManaged = null;


        try {
            // InternalSasDsl.g:1973:51: (iv_ruleDSLManaged= ruleDSLManaged EOF )
            // InternalSasDsl.g:1974:2: iv_ruleDSLManaged= ruleDSLManaged EOF
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
    // InternalSasDsl.g:1980:1: ruleDSLManaged returns [EObject current=null] : (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLManaged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:1986:2: ( (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:1987:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:1987:2: (otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:1988:3: otherlv_0= 'Managed' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLManagedAccess().getManagedKeyword_0());
            		
            // InternalSasDsl.g:1992:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:1993:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:1993:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:1994:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2010:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSasDsl.g:2011:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLManagedAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2015:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2016:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2016:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2017:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLManagedAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLManagedRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2033:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==38) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSasDsl.g:2034:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLManagedAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2038:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2039:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2039:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2040:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLManagedAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLManagedRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2066:1: entryRuleDSLControlLoopManager returns [EObject current=null] : iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF ;
    public final EObject entryRuleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoopManager = null;


        try {
            // InternalSasDsl.g:2066:62: (iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF )
            // InternalSasDsl.g:2067:2: iv_ruleDSLControlLoopManager= ruleDSLControlLoopManager EOF
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
    // InternalSasDsl.g:2073:1: ruleDSLControlLoopManager returns [EObject current=null] : (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= RULE_ID ) ) (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleDSLControlLoopManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;
        Token lv_interface_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2079:2: ( (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= RULE_ID ) ) (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )* )? otherlv_8= ';' ) )
            // InternalSasDsl.g:2080:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= RULE_ID ) ) (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )* )? otherlv_8= ';' )
            {
            // InternalSasDsl.g:2080:2: (otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= RULE_ID ) ) (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )* )? otherlv_8= ';' )
            // InternalSasDsl.g:2081:3: otherlv_0= 'ControlLoopManager' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'typeOf' ruleDSLTypeCLM (otherlv_4= 'with-interface' ( (lv_interface_5_0= RULE_ID ) ) (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )* )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopManagerAccess().getControlLoopManagerKeyword_0());
            		
            // InternalSasDsl.g:2085:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2086:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2086:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2087:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopManagerAccess().getTypeOfKeyword_2());
            		

            			newCompositeNode(grammarAccess.getDSLControlLoopManagerAccess().getDSLTypeCLMParserRuleCall_3());
            		
            pushFollow(FOLLOW_24);
            ruleDSLTypeCLM();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSasDsl.g:2114:3: (otherlv_4= 'with-interface' ( (lv_interface_5_0= RULE_ID ) ) (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSasDsl.g:2115:4: otherlv_4= 'with-interface' ( (lv_interface_5_0= RULE_ID ) ) (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopManagerAccess().getWithInterfaceKeyword_4_0());
                    			
                    // InternalSasDsl.g:2119:4: ( (lv_interface_5_0= RULE_ID ) )
                    // InternalSasDsl.g:2120:5: (lv_interface_5_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2120:5: (lv_interface_5_0= RULE_ID )
                    // InternalSasDsl.g:2121:6: lv_interface_5_0= RULE_ID
                    {
                    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_5_0, grammarAccess.getDSLControlLoopManagerAccess().getInterfaceIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLControlLoopManagerRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2137:4: (otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==38) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSasDsl.g:2138:5: otherlv_6= ',' ( (lv_interface_7_0= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDSLControlLoopManagerAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSasDsl.g:2142:5: ( (lv_interface_7_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2143:6: (lv_interface_7_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2143:6: (lv_interface_7_0= RULE_ID )
                    	    // InternalSasDsl.g:2144:7: lv_interface_7_0= RULE_ID
                    	    {
                    	    lv_interface_7_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_7_0, grammarAccess.getDSLControlLoopManagerAccess().getInterfaceIDTerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLControlLoopManagerRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_7_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2170:1: entryRuleDSLTypeCLM returns [String current=null] : iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF ;
    public final String entryRuleDSLTypeCLM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDSLTypeCLM = null;


        try {
            // InternalSasDsl.g:2170:50: (iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF )
            // InternalSasDsl.g:2171:2: iv_ruleDSLTypeCLM= ruleDSLTypeCLM EOF
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
    // InternalSasDsl.g:2177:1: ruleDSLTypeCLM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) ;
    public final AntlrDatatypeRuleToken ruleDSLTypeCLM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2183:2: ( (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' ) )
            // InternalSasDsl.g:2184:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            {
            // InternalSasDsl.g:2184:2: (kw= 'Synchronized' | kw= 'Coordinated' | kw= 'Independent' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSasDsl.g:2185:3: kw= 'Synchronized'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getSynchronizedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:2191:3: kw= 'Coordinated'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDSLTypeCLMAccess().getCoordinatedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:2197:3: kw= 'Independent'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalSasDsl.g:2206:1: entryRuleDSLControlLoop returns [EObject current=null] : iv_ruleDSLControlLoop= ruleDSLControlLoop EOF ;
    public final EObject entryRuleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLControlLoop = null;


        try {
            // InternalSasDsl.g:2206:55: (iv_ruleDSLControlLoop= ruleDSLControlLoop EOF )
            // InternalSasDsl.g:2207:2: iv_ruleDSLControlLoop= ruleDSLControlLoop EOF
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
    // InternalSasDsl.g:2213:1: ruleDSLControlLoop returns [EObject current=null] : (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLControlLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2219:2: ( (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2220:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2220:2: (otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2221:3: otherlv_0= 'ControlLoop' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLControlLoopAccess().getControlLoopKeyword_0());
            		
            // InternalSasDsl.g:2225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2226:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2243:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSasDsl.g:2244:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLControlLoopAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2248:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2249:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2249:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2250:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLControlLoopAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLControlLoopRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2266:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==38) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSasDsl.g:2267:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLControlLoopAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2271:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2272:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2272:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2273:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLControlLoopAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLControlLoopRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2299:1: entryRuleDSLMonitor returns [EObject current=null] : iv_ruleDSLMonitor= ruleDSLMonitor EOF ;
    public final EObject entryRuleDSLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMonitor = null;


        try {
            // InternalSasDsl.g:2299:51: (iv_ruleDSLMonitor= ruleDSLMonitor EOF )
            // InternalSasDsl.g:2300:2: iv_ruleDSLMonitor= ruleDSLMonitor EOF
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
    // InternalSasDsl.g:2306:1: ruleDSLMonitor returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2312:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2313:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2313:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2314:3: otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSasDsl.g:2318:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2319:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2319:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2320:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2336:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSasDsl.g:2337:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMonitorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2341:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2342:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2342:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2343:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLMonitorAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLMonitorRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2359:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==38) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSasDsl.g:2360:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLMonitorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2364:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2365:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2365:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2366:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLMonitorAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLMonitorRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2392:1: entryRuleDSLAnalyzer returns [EObject current=null] : iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF ;
    public final EObject entryRuleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLAnalyzer = null;


        try {
            // InternalSasDsl.g:2392:52: (iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF )
            // InternalSasDsl.g:2393:2: iv_ruleDSLAnalyzer= ruleDSLAnalyzer EOF
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
    // InternalSasDsl.g:2399:1: ruleDSLAnalyzer returns [EObject current=null] : (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2405:2: ( (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2406:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2406:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2407:3: otherlv_0= 'Analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLAnalyzerAccess().getAnalyzerKeyword_0());
            		
            // InternalSasDsl.g:2411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2412:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2413:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2429:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSasDsl.g:2430:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLAnalyzerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2434:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2435:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2435:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2436:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLAnalyzerAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLAnalyzerRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2452:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==38) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSasDsl.g:2453:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLAnalyzerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2457:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2458:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2458:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2459:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLAnalyzerAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLAnalyzerRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2485:1: entryRuleDSLPlanner returns [EObject current=null] : iv_ruleDSLPlanner= ruleDSLPlanner EOF ;
    public final EObject entryRuleDSLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLPlanner = null;


        try {
            // InternalSasDsl.g:2485:51: (iv_ruleDSLPlanner= ruleDSLPlanner EOF )
            // InternalSasDsl.g:2486:2: iv_ruleDSLPlanner= ruleDSLPlanner EOF
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
    // InternalSasDsl.g:2492:1: ruleDSLPlanner returns [EObject current=null] : (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2498:2: ( (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2499:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2499:2: (otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2500:3: otherlv_0= 'Planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLPlannerAccess().getPlannerKeyword_0());
            		
            // InternalSasDsl.g:2504:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2505:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2505:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2506:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2522:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSasDsl.g:2523:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLPlannerAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2527:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2528:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2528:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2529:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLPlannerAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLPlannerRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2545:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==38) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSasDsl.g:2546:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLPlannerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2550:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2551:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2551:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2552:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLPlannerAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLPlannerRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2578:1: entryRuleDSLExecutor returns [EObject current=null] : iv_ruleDSLExecutor= ruleDSLExecutor EOF ;
    public final EObject entryRuleDSLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLExecutor = null;


        try {
            // InternalSasDsl.g:2578:52: (iv_ruleDSLExecutor= ruleDSLExecutor EOF )
            // InternalSasDsl.g:2579:2: iv_ruleDSLExecutor= ruleDSLExecutor EOF
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
    // InternalSasDsl.g:2585:1: ruleDSLExecutor returns [EObject current=null] : (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2591:2: ( (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2592:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2592:2: (otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2593:3: otherlv_0= 'Executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLExecutorAccess().getExecutorKeyword_0());
            		
            // InternalSasDsl.g:2597:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2598:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2598:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2599:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2615:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSasDsl.g:2616:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLExecutorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2620:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2621:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2621:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2622:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLExecutorAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLExecutorRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2638:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==38) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSasDsl.g:2639:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLExecutorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2643:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2644:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2644:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2645:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLExecutorAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLExecutorRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2671:1: entryRuleDSLKnowledge returns [EObject current=null] : iv_ruleDSLKnowledge= ruleDSLKnowledge EOF ;
    public final EObject entryRuleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLKnowledge = null;


        try {
            // InternalSasDsl.g:2671:53: (iv_ruleDSLKnowledge= ruleDSLKnowledge EOF )
            // InternalSasDsl.g:2672:2: iv_ruleDSLKnowledge= ruleDSLKnowledge EOF
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
    // InternalSasDsl.g:2678:1: ruleDSLKnowledge returns [EObject current=null] : (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2684:2: ( (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2685:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2685:2: (otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2686:3: otherlv_0= 'Knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLKnowledgeAccess().getKnowledgeKeyword_0());
            		
            // InternalSasDsl.g:2690:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2691:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2691:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2692:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2708:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSasDsl.g:2709:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLKnowledgeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2713:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2714:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2714:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2715:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLKnowledgeAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLKnowledgeRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2731:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==38) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSasDsl.g:2732:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLKnowledgeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2736:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2737:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2737:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2738:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLKnowledgeAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLKnowledgeRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2764:1: entryRuleDSLSensor returns [EObject current=null] : iv_ruleDSLSensor= ruleDSLSensor EOF ;
    public final EObject entryRuleDSLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLSensor = null;


        try {
            // InternalSasDsl.g:2764:50: (iv_ruleDSLSensor= ruleDSLSensor EOF )
            // InternalSasDsl.g:2765:2: iv_ruleDSLSensor= ruleDSLSensor EOF
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
    // InternalSasDsl.g:2771:1: ruleDSLSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2777:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2778:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2778:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2779:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLSensorAccess().getSensorKeyword_0());
            		
            // InternalSasDsl.g:2783:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2784:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2784:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2785:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2801:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSasDsl.g:2802:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLSensorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2806:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2807:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2807:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2808:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLSensorAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLSensorRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2824:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==38) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSasDsl.g:2825:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLSensorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2829:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2830:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2830:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2831:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLSensorAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLSensorRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2857:1: entryRuleDSLEffector returns [EObject current=null] : iv_ruleDSLEffector= ruleDSLEffector EOF ;
    public final EObject entryRuleDSLEffector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLEffector = null;


        try {
            // InternalSasDsl.g:2857:52: (iv_ruleDSLEffector= ruleDSLEffector EOF )
            // InternalSasDsl.g:2858:2: iv_ruleDSLEffector= ruleDSLEffector EOF
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
    // InternalSasDsl.g:2864:1: ruleDSLEffector returns [EObject current=null] : (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLEffector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2870:2: ( (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2871:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2871:2: (otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2872:3: otherlv_0= 'Effector' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLEffectorAccess().getEffectorKeyword_0());
            		
            // InternalSasDsl.g:2876:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2877:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2877:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2878:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2894:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSasDsl.g:2895:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLEffectorAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2899:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2900:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2900:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2901:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLEffectorAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLEffectorRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:2917:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==38) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSasDsl.g:2918:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLEffectorAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:2922:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:2923:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:2923:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:2924:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLEffectorAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLEffectorRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:2950:1: entryRuleDSLProbe returns [EObject current=null] : iv_ruleDSLProbe= ruleDSLProbe EOF ;
    public final EObject entryRuleDSLProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLProbe = null;


        try {
            // InternalSasDsl.g:2950:49: (iv_ruleDSLProbe= ruleDSLProbe EOF )
            // InternalSasDsl.g:2951:2: iv_ruleDSLProbe= ruleDSLProbe EOF
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
    // InternalSasDsl.g:2957:1: ruleDSLProbe returns [EObject current=null] : (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLProbe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:2963:2: ( (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:2964:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:2964:2: (otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:2965:3: otherlv_0= 'Probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLProbeAccess().getProbeKeyword_0());
            		
            // InternalSasDsl.g:2969:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:2970:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:2970:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:2971:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:2987:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSasDsl.g:2988:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLProbeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:2992:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:2993:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:2993:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:2994:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLProbeAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLProbeRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:3010:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==38) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSasDsl.g:3011:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLProbeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3015:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:3016:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:3016:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:3017:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLProbeAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLProbeRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:3043:1: entryRuleDSLGauge returns [EObject current=null] : iv_ruleDSLGauge= ruleDSLGauge EOF ;
    public final EObject entryRuleDSLGauge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLGauge = null;


        try {
            // InternalSasDsl.g:3043:49: (iv_ruleDSLGauge= ruleDSLGauge EOF )
            // InternalSasDsl.g:3044:2: iv_ruleDSLGauge= ruleDSLGauge EOF
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
    // InternalSasDsl.g:3050:1: ruleDSLGauge returns [EObject current=null] : (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLGauge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3056:2: ( (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3057:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3057:2: (otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3058:3: otherlv_0= 'Gauge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLGaugeAccess().getGaugeKeyword_0());
            		
            // InternalSasDsl.g:3062:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3063:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3063:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3064:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:3080:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSasDsl.g:3081:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLGaugeAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3085:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:3086:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:3086:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:3087:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLGaugeAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLGaugeRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:3103:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==38) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSasDsl.g:3104:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLGaugeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3108:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:3109:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:3109:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:3110:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLGaugeAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLGaugeRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:3136:1: entryRuleDSLReferenceInput returns [EObject current=null] : iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF ;
    public final EObject entryRuleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLReferenceInput = null;


        try {
            // InternalSasDsl.g:3136:58: (iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF )
            // InternalSasDsl.g:3137:2: iv_ruleDSLReferenceInput= ruleDSLReferenceInput EOF
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
    // InternalSasDsl.g:3143:1: ruleDSLReferenceInput returns [EObject current=null] : (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLReferenceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3149:2: ( (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3150:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3150:2: (otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3151:3: otherlv_0= 'ReferenceInput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLReferenceInputAccess().getReferenceInputKeyword_0());
            		
            // InternalSasDsl.g:3155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3156:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:3173:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSasDsl.g:3174:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLReferenceInputAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3178:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:3179:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:3179:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:3180:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLReferenceInputAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLReferenceInputRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:3196:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==38) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSasDsl.g:3197:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLReferenceInputAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3201:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:3202:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:3202:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:3203:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLReferenceInputAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLReferenceInputRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSasDsl.g:3229:1: entryRuleDSLMeasuredOutput returns [EObject current=null] : iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF ;
    public final EObject entryRuleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMeasuredOutput = null;


        try {
            // InternalSasDsl.g:3229:58: (iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF )
            // InternalSasDsl.g:3230:2: iv_ruleDSLMeasuredOutput= ruleDSLMeasuredOutput EOF
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
    // InternalSasDsl.g:3236:1: ruleDSLMeasuredOutput returns [EObject current=null] : (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleDSLMeasuredOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_interface_3_0=null;
        Token otherlv_4=null;
        Token lv_interface_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3242:2: ( (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' ) )
            // InternalSasDsl.g:3243:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            {
            // InternalSasDsl.g:3243:2: (otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';' )
            // InternalSasDsl.g:3244:3: otherlv_0= 'MeasuredOutput' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDSLMeasuredOutputAccess().getMeasuredOutputKeyword_0());
            		
            // InternalSasDsl.g:3248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSasDsl.g:3249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSasDsl.g:3249:4: (lv_name_1_0= RULE_ID )
            // InternalSasDsl.g:3250:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSasDsl.g:3266:3: (otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSasDsl.g:3267:4: otherlv_2= 'with-interface' ( (lv_interface_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDSLMeasuredOutputAccess().getWithInterfaceKeyword_2_0());
                    			
                    // InternalSasDsl.g:3271:4: ( (lv_interface_3_0= RULE_ID ) )
                    // InternalSasDsl.g:3272:5: (lv_interface_3_0= RULE_ID )
                    {
                    // InternalSasDsl.g:3272:5: (lv_interface_3_0= RULE_ID )
                    // InternalSasDsl.g:3273:6: lv_interface_3_0= RULE_ID
                    {
                    lv_interface_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_interface_3_0, grammarAccess.getDSLMeasuredOutputAccess().getInterfaceIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDSLMeasuredOutputRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"interface",
                    							lv_interface_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSasDsl.g:3289:4: (otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==38) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalSasDsl.g:3290:5: otherlv_4= ',' ( (lv_interface_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDSLMeasuredOutputAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSasDsl.g:3294:5: ( (lv_interface_5_0= RULE_ID ) )
                    	    // InternalSasDsl.g:3295:6: (lv_interface_5_0= RULE_ID )
                    	    {
                    	    // InternalSasDsl.g:3295:6: (lv_interface_5_0= RULE_ID )
                    	    // InternalSasDsl.g:3296:7: lv_interface_5_0= RULE_ID
                    	    {
                    	    lv_interface_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_interface_5_0, grammarAccess.getDSLMeasuredOutputAccess().getInterfaceIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDSLMeasuredOutputRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOnly"
    // InternalSasDsl.g:3322:1: entryRuleOnly returns [EObject current=null] : iv_ruleOnly= ruleOnly EOF ;
    public final EObject entryRuleOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly = null;


        try {
            // InternalSasDsl.g:3322:45: (iv_ruleOnly= ruleOnly EOF )
            // InternalSasDsl.g:3323:2: iv_ruleOnly= ruleOnly EOF
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
    // InternalSasDsl.g:3329:1: ruleOnly returns [EObject current=null] : ( (lv_only_0_0= 'only' ) ) ;
    public final EObject ruleOnly() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3335:2: ( ( (lv_only_0_0= 'only' ) ) )
            // InternalSasDsl.g:3336:2: ( (lv_only_0_0= 'only' ) )
            {
            // InternalSasDsl.g:3336:2: ( (lv_only_0_0= 'only' ) )
            // InternalSasDsl.g:3337:3: (lv_only_0_0= 'only' )
            {
            // InternalSasDsl.g:3337:3: (lv_only_0_0= 'only' )
            // InternalSasDsl.g:3338:4: lv_only_0_0= 'only'
            {
            lv_only_0_0=(Token)match(input,57,FOLLOW_2); 

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
    // InternalSasDsl.g:3353:1: entryRuleCan returns [EObject current=null] : iv_ruleCan= ruleCan EOF ;
    public final EObject entryRuleCan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCan = null;


        try {
            // InternalSasDsl.g:3353:44: (iv_ruleCan= ruleCan EOF )
            // InternalSasDsl.g:3354:2: iv_ruleCan= ruleCan EOF
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
    // InternalSasDsl.g:3360:1: ruleCan returns [EObject current=null] : ( (lv_can_0_0= 'can-' ) ) ;
    public final EObject ruleCan() throws RecognitionException {
        EObject current = null;

        Token lv_can_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3366:2: ( ( (lv_can_0_0= 'can-' ) ) )
            // InternalSasDsl.g:3367:2: ( (lv_can_0_0= 'can-' ) )
            {
            // InternalSasDsl.g:3367:2: ( (lv_can_0_0= 'can-' ) )
            // InternalSasDsl.g:3368:3: (lv_can_0_0= 'can-' )
            {
            // InternalSasDsl.g:3368:3: (lv_can_0_0= 'can-' )
            // InternalSasDsl.g:3369:4: lv_can_0_0= 'can-'
            {
            lv_can_0_0=(Token)match(input,58,FOLLOW_2); 

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
    // InternalSasDsl.g:3384:1: entryRuleCannot returns [EObject current=null] : iv_ruleCannot= ruleCannot EOF ;
    public final EObject entryRuleCannot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCannot = null;


        try {
            // InternalSasDsl.g:3384:47: (iv_ruleCannot= ruleCannot EOF )
            // InternalSasDsl.g:3385:2: iv_ruleCannot= ruleCannot EOF
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
    // InternalSasDsl.g:3391:1: ruleCannot returns [EObject current=null] : ( (lv_cannot_0_0= 'cannot-' ) ) ;
    public final EObject ruleCannot() throws RecognitionException {
        EObject current = null;

        Token lv_cannot_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3397:2: ( ( (lv_cannot_0_0= 'cannot-' ) ) )
            // InternalSasDsl.g:3398:2: ( (lv_cannot_0_0= 'cannot-' ) )
            {
            // InternalSasDsl.g:3398:2: ( (lv_cannot_0_0= 'cannot-' ) )
            // InternalSasDsl.g:3399:3: (lv_cannot_0_0= 'cannot-' )
            {
            // InternalSasDsl.g:3399:3: (lv_cannot_0_0= 'cannot-' )
            // InternalSasDsl.g:3400:4: lv_cannot_0_0= 'cannot-'
            {
            lv_cannot_0_0=(Token)match(input,59,FOLLOW_2); 

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
    // InternalSasDsl.g:3415:1: entryRuleOnly2 returns [EObject current=null] : iv_ruleOnly2= ruleOnly2 EOF ;
    public final EObject entryRuleOnly2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly2 = null;


        try {
            // InternalSasDsl.g:3415:46: (iv_ruleOnly2= ruleOnly2 EOF )
            // InternalSasDsl.g:3416:2: iv_ruleOnly2= ruleOnly2 EOF
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
    // InternalSasDsl.g:3422:1: ruleOnly2 returns [EObject current=null] : ( (lv_only2_0_0= '-only' ) ) ;
    public final EObject ruleOnly2() throws RecognitionException {
        EObject current = null;

        Token lv_only2_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3428:2: ( ( (lv_only2_0_0= '-only' ) ) )
            // InternalSasDsl.g:3429:2: ( (lv_only2_0_0= '-only' ) )
            {
            // InternalSasDsl.g:3429:2: ( (lv_only2_0_0= '-only' ) )
            // InternalSasDsl.g:3430:3: (lv_only2_0_0= '-only' )
            {
            // InternalSasDsl.g:3430:3: (lv_only2_0_0= '-only' )
            // InternalSasDsl.g:3431:4: lv_only2_0_0= '-only'
            {
            lv_only2_0_0=(Token)match(input,60,FOLLOW_2); 

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
    // InternalSasDsl.g:3446:1: entryRuleMust returns [EObject current=null] : iv_ruleMust= ruleMust EOF ;
    public final EObject entryRuleMust() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMust = null;


        try {
            // InternalSasDsl.g:3446:45: (iv_ruleMust= ruleMust EOF )
            // InternalSasDsl.g:3447:2: iv_ruleMust= ruleMust EOF
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
    // InternalSasDsl.g:3453:1: ruleMust returns [EObject current=null] : ( (lv_must_0_0= 'must-' ) ) ;
    public final EObject ruleMust() throws RecognitionException {
        EObject current = null;

        Token lv_must_0_0=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3459:2: ( ( (lv_must_0_0= 'must-' ) ) )
            // InternalSasDsl.g:3460:2: ( (lv_must_0_0= 'must-' ) )
            {
            // InternalSasDsl.g:3460:2: ( (lv_must_0_0= 'must-' ) )
            // InternalSasDsl.g:3461:3: (lv_must_0_0= 'must-' )
            {
            // InternalSasDsl.g:3461:3: (lv_must_0_0= 'must-' )
            // InternalSasDsl.g:3462:4: lv_must_0_0= 'must-'
            {
            lv_must_0_0=(Token)match(input,61,FOLLOW_2); 

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
    // InternalSasDsl.g:3477:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalSasDsl.g:3477:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalSasDsl.g:3478:2: iv_ruleElementType= ruleElementType EOF
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
    // InternalSasDsl.g:3484:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;



        	enterRule();

        try {
            // InternalSasDsl.g:3490:2: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // InternalSasDsl.g:3491:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // InternalSasDsl.g:3491:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=62 && LA38_0<=66)) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=67 && LA38_0<=71)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSasDsl.g:3492:3: this_BasicType_0= ruleBasicType
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
                    // InternalSasDsl.g:3501:3: this_EntityType_1= ruleEntityType
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
    // InternalSasDsl.g:3513:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalSasDsl.g:3513:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalSasDsl.g:3514:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalSasDsl.g:3520:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3526:2: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // InternalSasDsl.g:3527:2: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // InternalSasDsl.g:3527:2: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // InternalSasDsl.g:3528:3: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // InternalSasDsl.g:3528:3: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // InternalSasDsl.g:3529:4: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // InternalSasDsl.g:3529:4: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt39=1;
                }
                break;
            case 63:
                {
                alt39=2;
                }
                break;
            case 64:
                {
                alt39=3;
                }
                break;
            case 65:
                {
                alt39=4;
                }
                break;
            case 66:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalSasDsl.g:3530:5: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:3541:5: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,63,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:3552:5: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,64,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:3563:5: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,65,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:3574:5: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,66,FOLLOW_2); 

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
    // InternalSasDsl.g:3590:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalSasDsl.g:3590:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalSasDsl.g:3591:2: iv_ruleEntityType= ruleEntityType EOF
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
    // InternalSasDsl.g:3597:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;


        	enterRule();

        try {
            // InternalSasDsl.g:3603:2: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) )
            // InternalSasDsl.g:3604:2: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            {
            // InternalSasDsl.g:3604:2: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            // InternalSasDsl.g:3605:3: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            {
            // InternalSasDsl.g:3605:3: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            // InternalSasDsl.g:3606:4: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            {
            // InternalSasDsl.g:3606:4: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt40=1;
                }
                break;
            case 68:
                {
                alt40=2;
                }
                break;
            case 69:
                {
                alt40=3;
                }
                break;
            case 70:
                {
                alt40=4;
                }
                break;
            case 71:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSasDsl.g:3607:5: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSasDsl.g:3618:5: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSasDsl.g:3629:5: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalSasDsl.g:3640:5: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,70,FOLLOW_2); 

                    					newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    					setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalSasDsl.g:3651:5: lv_entity_0_5= 'useannotation'
                    {
                    lv_entity_0_5=(Token)match(input,71,FOLLOW_2); 

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\21\3\uffff\5\4\4\uffff\4\30\1\31\12\uffff";
    static final String dfa_3s = "\1\43\3\uffff\5\4\4\uffff\4\31\1\36\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\5\uffff\1\16\1\17\1\20\1\21\5\uffff\1\5\1\4\1\7\1\6\1\11\1\10\1\13\1\12\1\15\1\14";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\uffff\1\4\2\uffff\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\uffff\1\13\1\14",
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
            "\1\32\4\uffff\1\33",
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
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\72\1\76\2\uffff\12\4\2\uffff";
    static final String dfa_9s = "\1\71\1\uffff\1\75\1\107\2\uffff\12\74\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\2\uffff\1\5\1\2\12\uffff\1\3\1\4";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\64\uffff\1\1",
            "",
            "\1\3\1\5\1\uffff\1\4",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
            "\1\20\67\uffff\1\21",
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
            return "514:2: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x01FFE19000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x01FFE19000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000DBCAA2000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200000000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xC000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00001C0000000000L});

}