/*
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.ide.contentassist.antlr;

import br.ufscar.sas.xtext.sasdsl.ide.contentassist.antlr.internal.InternalSasDslParser;
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SasDslParser extends AbstractContentAssistParser {

	@Inject
	private SasDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSasDslParser createParser() {
		InternalSasDslParser result = new InternalSasDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDSLRulesAccess().getAlternatives(), "rule__DSLRules__Alternatives");
					put(grammarAccess.getDSLRuleControllerAccess().getAlternatives(), "rule__DSLRuleController__Alternatives");
					put(grammarAccess.getDSLRuleMonitorAccess().getAlternatives(), "rule__DSLRuleMonitor__Alternatives");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAlternatives(), "rule__DSLRuleAnalyzer__Alternatives");
					put(grammarAccess.getDSLRulePlannerAccess().getAlternatives(), "rule__DSLRulePlanner__Alternatives");
					put(grammarAccess.getDSLRuleExecutorAccess().getAlternatives(), "rule__DSLRuleExecutor__Alternatives");
					put(grammarAccess.getDSLAccessAccess().getAlternatives(), "rule__DSLAccess__Alternatives");
					put(grammarAccess.getDSLTypeMCAccess().getAlternatives(), "rule__DSLTypeMC__Alternatives");
					put(grammarAccess.getArchitectureDefinitionAccess().getGroup(), "rule__ArchitectureDefinition__Group__0");
					put(grammarAccess.getDSLRuleControllerAccess().getGroup_0(), "rule__DSLRuleController__Group_0__0");
					put(grammarAccess.getDSLRuleControllerAccess().getGroup_1(), "rule__DSLRuleController__Group_1__0");
					put(grammarAccess.getDSLRuleControllerAccess().getGroup_2(), "rule__DSLRuleController__Group_2__0");
					put(grammarAccess.getDSLRuleControllerAccess().getGroup_3(), "rule__DSLRuleController__Group_3__0");
					put(grammarAccess.getDSLRuleMonitorAccess().getGroup_0(), "rule__DSLRuleMonitor__Group_0__0");
					put(grammarAccess.getDSLRuleMonitorAccess().getGroup_1(), "rule__DSLRuleMonitor__Group_1__0");
					put(grammarAccess.getDSLRuleMonitorAccess().getGroup_2(), "rule__DSLRuleMonitor__Group_2__0");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_0(), "rule__DSLRuleAnalyzer__Group_0__0");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_1(), "rule__DSLRuleAnalyzer__Group_1__0");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_2(), "rule__DSLRuleAnalyzer__Group_2__0");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getGroup_3(), "rule__DSLRuleAnalyzer__Group_3__0");
					put(grammarAccess.getDSLRulePlannerAccess().getGroup_0(), "rule__DSLRulePlanner__Group_0__0");
					put(grammarAccess.getDSLRulePlannerAccess().getGroup_1(), "rule__DSLRulePlanner__Group_1__0");
					put(grammarAccess.getDSLRulePlannerAccess().getGroup_2(), "rule__DSLRulePlanner__Group_2__0");
					put(grammarAccess.getDSLRuleExecutorAccess().getGroup_0(), "rule__DSLRuleExecutor__Group_0__0");
					put(grammarAccess.getDSLRuleExecutorAccess().getGroup_1(), "rule__DSLRuleExecutor__Group_1__0");
					put(grammarAccess.getDSLRuleExecutorAccess().getGroup_2(), "rule__DSLRuleExecutor__Group_2__0");
					put(grammarAccess.getDSLRuleMOAccess().getGroup(), "rule__DSLRuleMO__Group__0");
					put(grammarAccess.getDSLManagingAccess().getGroup(), "rule__DSLManaging__Group__0");
					put(grammarAccess.getDSLManagedAccess().getGroup(), "rule__DSLManaged__Group__0");
					put(grammarAccess.getDSLManagerControllerAccess().getGroup(), "rule__DSLManagerController__Group__0");
					put(grammarAccess.getDSLControllerAccess().getGroup(), "rule__DSLController__Group__0");
					put(grammarAccess.getDSLMonitorAccess().getGroup(), "rule__DSLMonitor__Group__0");
					put(grammarAccess.getDSLAnalyzerAccess().getGroup(), "rule__DSLAnalyzer__Group__0");
					put(grammarAccess.getDSLPlannerAccess().getGroup(), "rule__DSLPlanner__Group__0");
					put(grammarAccess.getDSLExecutorAccess().getGroup(), "rule__DSLExecutor__Group__0");
					put(grammarAccess.getDSLKnowledgeAccess().getGroup(), "rule__DSLKnowledge__Group__0");
					put(grammarAccess.getDSLSensorAccess().getGroup(), "rule__DSLSensor__Group__0");
					put(grammarAccess.getDSLEffectorAccess().getGroup(), "rule__DSLEffector__Group__0");
					put(grammarAccess.getDSLReferenceInputAccess().getGroup(), "rule__DSLReferenceInput__Group__0");
					put(grammarAccess.getDSLMeasuredOutputAccess().getGroup(), "rule__DSLMeasuredOutput__Group__0");
					put(grammarAccess.getArchitectureDefinitionAccess().getNameAssignment_1(), "rule__ArchitectureDefinition__NameAssignment_1");
					put(grammarAccess.getArchitectureDefinitionAccess().getManagingAssignment_3(), "rule__ArchitectureDefinition__ManagingAssignment_3");
					put(grammarAccess.getArchitectureDefinitionAccess().getManagedAssignment_4(), "rule__ArchitectureDefinition__ManagedAssignment_4");
					put(grammarAccess.getArchitectureDefinitionAccess().getRulesAssignment_8(), "rule__ArchitectureDefinition__RulesAssignment_8");
					put(grammarAccess.getDSLRuleControllerAccess().getControllerAssignment_0_1(), "rule__DSLRuleController__ControllerAssignment_0_1");
					put(grammarAccess.getDSLRuleControllerAccess().getAccessAssignment_0_2(), "rule__DSLRuleController__AccessAssignment_0_2");
					put(grammarAccess.getDSLRuleControllerAccess().getMonitorAssignment_0_4(), "rule__DSLRuleController__MonitorAssignment_0_4");
					put(grammarAccess.getDSLRuleControllerAccess().getControllerAssignment_1_1(), "rule__DSLRuleController__ControllerAssignment_1_1");
					put(grammarAccess.getDSLRuleControllerAccess().getAccessAssignment_1_2(), "rule__DSLRuleController__AccessAssignment_1_2");
					put(grammarAccess.getDSLRuleControllerAccess().getAnalyzerAssignment_1_4(), "rule__DSLRuleController__AnalyzerAssignment_1_4");
					put(grammarAccess.getDSLRuleControllerAccess().getControllerAssignment_2_1(), "rule__DSLRuleController__ControllerAssignment_2_1");
					put(grammarAccess.getDSLRuleControllerAccess().getAccessAssignment_2_2(), "rule__DSLRuleController__AccessAssignment_2_2");
					put(grammarAccess.getDSLRuleControllerAccess().getPlannerAssignment_2_4(), "rule__DSLRuleController__PlannerAssignment_2_4");
					put(grammarAccess.getDSLRuleControllerAccess().getControllerAssignment_3_1(), "rule__DSLRuleController__ControllerAssignment_3_1");
					put(grammarAccess.getDSLRuleControllerAccess().getAccessAssignment_3_2(), "rule__DSLRuleController__AccessAssignment_3_2");
					put(grammarAccess.getDSLRuleControllerAccess().getExecutorAssignment_3_4(), "rule__DSLRuleController__ExecutorAssignment_3_4");
					put(grammarAccess.getDSLRuleMonitorAccess().getMonitorAssignment_0_1(), "rule__DSLRuleMonitor__MonitorAssignment_0_1");
					put(grammarAccess.getDSLRuleMonitorAccess().getAccessAssignment_0_2(), "rule__DSLRuleMonitor__AccessAssignment_0_2");
					put(grammarAccess.getDSLRuleMonitorAccess().getSensorAssignment_0_4(), "rule__DSLRuleMonitor__SensorAssignment_0_4");
					put(grammarAccess.getDSLRuleMonitorAccess().getMonitorAssignment_1_1(), "rule__DSLRuleMonitor__MonitorAssignment_1_1");
					put(grammarAccess.getDSLRuleMonitorAccess().getAccessAssignment_1_2(), "rule__DSLRuleMonitor__AccessAssignment_1_2");
					put(grammarAccess.getDSLRuleMonitorAccess().getKnowledgeAssignment_1_4(), "rule__DSLRuleMonitor__KnowledgeAssignment_1_4");
					put(grammarAccess.getDSLRuleMonitorAccess().getMonitorAssignment_2_1(), "rule__DSLRuleMonitor__MonitorAssignment_2_1");
					put(grammarAccess.getDSLRuleMonitorAccess().getAccessAssignment_2_2(), "rule__DSLRuleMonitor__AccessAssignment_2_2");
					put(grammarAccess.getDSLRuleMonitorAccess().getAnalyzerAssignment_2_4(), "rule__DSLRuleMonitor__AnalyzerAssignment_2_4");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_0_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_0_1");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_0_2(), "rule__DSLRuleAnalyzer__AccessAssignment_0_2");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getKnowledgeAssignment_0_4(), "rule__DSLRuleAnalyzer__KnowledgeAssignment_0_4");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_1_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_1_1");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_1_2(), "rule__DSLRuleAnalyzer__AccessAssignment_1_2");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getMonitorAssignment_1_4(), "rule__DSLRuleAnalyzer__MonitorAssignment_1_4");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_2_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_2_1");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_2_2(), "rule__DSLRuleAnalyzer__AccessAssignment_2_2");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getPlannerAssignment_2_4(), "rule__DSLRuleAnalyzer__PlannerAssignment_2_4");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAnalyzerAssignment_3_1(), "rule__DSLRuleAnalyzer__AnalyzerAssignment_3_1");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getAccessAssignment_3_2(), "rule__DSLRuleAnalyzer__AccessAssignment_3_2");
					put(grammarAccess.getDSLRuleAnalyzerAccess().getRreferenceAssignment_3_4(), "rule__DSLRuleAnalyzer__RreferenceAssignment_3_4");
					put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_0_1(), "rule__DSLRulePlanner__PlannerAssignment_0_1");
					put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_0_2(), "rule__DSLRulePlanner__AccessAssignment_0_2");
					put(grammarAccess.getDSLRulePlannerAccess().getKnowledgeAssignment_0_4(), "rule__DSLRulePlanner__KnowledgeAssignment_0_4");
					put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_1_1(), "rule__DSLRulePlanner__PlannerAssignment_1_1");
					put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_1_2(), "rule__DSLRulePlanner__AccessAssignment_1_2");
					put(grammarAccess.getDSLRulePlannerAccess().getAnalyzerAssignment_1_4(), "rule__DSLRulePlanner__AnalyzerAssignment_1_4");
					put(grammarAccess.getDSLRulePlannerAccess().getPlannerAssignment_2_1(), "rule__DSLRulePlanner__PlannerAssignment_2_1");
					put(grammarAccess.getDSLRulePlannerAccess().getAccessAssignment_2_2(), "rule__DSLRulePlanner__AccessAssignment_2_2");
					put(grammarAccess.getDSLRulePlannerAccess().getExecutorAssignment_2_4(), "rule__DSLRulePlanner__ExecutorAssignment_2_4");
					put(grammarAccess.getDSLRuleExecutorAccess().getExecutorAssignment_0_1(), "rule__DSLRuleExecutor__ExecutorAssignment_0_1");
					put(grammarAccess.getDSLRuleExecutorAccess().getAccessAssignment_0_2(), "rule__DSLRuleExecutor__AccessAssignment_0_2");
					put(grammarAccess.getDSLRuleExecutorAccess().getEffectorAssignment_0_4(), "rule__DSLRuleExecutor__EffectorAssignment_0_4");
					put(grammarAccess.getDSLRuleExecutorAccess().getExecutorAssignment_1_1(), "rule__DSLRuleExecutor__ExecutorAssignment_1_1");
					put(grammarAccess.getDSLRuleExecutorAccess().getAccessAssignment_1_2(), "rule__DSLRuleExecutor__AccessAssignment_1_2");
					put(grammarAccess.getDSLRuleExecutorAccess().getPlannerAssignment_1_4(), "rule__DSLRuleExecutor__PlannerAssignment_1_4");
					put(grammarAccess.getDSLRuleExecutorAccess().getExecutorAssignment_2_1(), "rule__DSLRuleExecutor__ExecutorAssignment_2_1");
					put(grammarAccess.getDSLRuleExecutorAccess().getAccessAssignment_2_2(), "rule__DSLRuleExecutor__AccessAssignment_2_2");
					put(grammarAccess.getDSLRuleExecutorAccess().getKnowledgeAssignment_2_4(), "rule__DSLRuleExecutor__KnowledgeAssignment_2_4");
					put(grammarAccess.getDSLRuleMOAccess().getSensorAssignment_1(), "rule__DSLRuleMO__SensorAssignment_1");
					put(grammarAccess.getDSLRuleMOAccess().getAccessAssignment_2(), "rule__DSLRuleMO__AccessAssignment_2");
					put(grammarAccess.getDSLRuleMOAccess().getMeasuredAssignment_4(), "rule__DSLRuleMO__MeasuredAssignment_4");
					put(grammarAccess.getDSLManagingAccess().getNameAssignment_1(), "rule__DSLManaging__NameAssignment_1");
					put(grammarAccess.getDSLManagingAccess().getManagerControllerAssignment_3(), "rule__DSLManaging__ManagerControllerAssignment_3");
					put(grammarAccess.getDSLManagingAccess().getControllerAssignment_4(), "rule__DSLManaging__ControllerAssignment_4");
					put(grammarAccess.getDSLManagedAccess().getNameAssignment_1(), "rule__DSLManaged__NameAssignment_1");
					put(grammarAccess.getDSLManagedAccess().getSensorAssignment_3(), "rule__DSLManaged__SensorAssignment_3");
					put(grammarAccess.getDSLManagedAccess().getEffectorAssignment_4(), "rule__DSLManaged__EffectorAssignment_4");
					put(grammarAccess.getDSLManagedAccess().getMeasuredOutputAssignment_5(), "rule__DSLManaged__MeasuredOutputAssignment_5");
					put(grammarAccess.getDSLManagerControllerAccess().getNameAssignment_1(), "rule__DSLManagerController__NameAssignment_1");
					put(grammarAccess.getDSLManagerControllerAccess().getControllerAssignment_5(), "rule__DSLManagerController__ControllerAssignment_5");
					put(grammarAccess.getDSLControllerAccess().getNameAssignment_1(), "rule__DSLController__NameAssignment_1");
					put(grammarAccess.getDSLControllerAccess().getMonitorAssignment_3(), "rule__DSLController__MonitorAssignment_3");
					put(grammarAccess.getDSLControllerAccess().getAnalyzerAssignment_4(), "rule__DSLController__AnalyzerAssignment_4");
					put(grammarAccess.getDSLControllerAccess().getPlannerAssignment_5(), "rule__DSLController__PlannerAssignment_5");
					put(grammarAccess.getDSLControllerAccess().getExecutorAssignment_6(), "rule__DSLController__ExecutorAssignment_6");
					put(grammarAccess.getDSLControllerAccess().getKnowledgeAssignment_7(), "rule__DSLController__KnowledgeAssignment_7");
					put(grammarAccess.getDSLMonitorAccess().getNameAssignment_1(), "rule__DSLMonitor__NameAssignment_1");
					put(grammarAccess.getDSLAnalyzerAccess().getNameAssignment_1(), "rule__DSLAnalyzer__NameAssignment_1");
					put(grammarAccess.getDSLPlannerAccess().getNameAssignment_1(), "rule__DSLPlanner__NameAssignment_1");
					put(grammarAccess.getDSLExecutorAccess().getNameAssignment_1(), "rule__DSLExecutor__NameAssignment_1");
					put(grammarAccess.getDSLKnowledgeAccess().getNameAssignment_1(), "rule__DSLKnowledge__NameAssignment_1");
					put(grammarAccess.getDSLKnowledgeAccess().getReferenceInputAssignment_3(), "rule__DSLKnowledge__ReferenceInputAssignment_3");
					put(grammarAccess.getDSLSensorAccess().getNameAssignment_1(), "rule__DSLSensor__NameAssignment_1");
					put(grammarAccess.getDSLEffectorAccess().getNameAssignment_1(), "rule__DSLEffector__NameAssignment_1");
					put(grammarAccess.getDSLReferenceInputAccess().getNameAssignment_1(), "rule__DSLReferenceInput__NameAssignment_1");
					put(grammarAccess.getDSLMeasuredOutputAccess().getNameAssignment_1(), "rule__DSLMeasuredOutput__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSasDslParser typedParser = (InternalSasDslParser) parser;
			typedParser.entryRuleArchitectureDefinition();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SasDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SasDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
