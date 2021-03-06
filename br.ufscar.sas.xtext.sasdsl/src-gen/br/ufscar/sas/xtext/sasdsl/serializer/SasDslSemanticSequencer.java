/*
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.serializer;

import br.ufscar.sas.xtext.sasdsl.sasDsl.AnalyzerInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition;
import br.ufscar.sas.xtext.sasdsl.sasDsl.ControllerInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffector;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManagerController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaging;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOutput;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInput;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMO;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleRI;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLSensor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.EffectorInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.ExecutorInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.KnowledgeInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.MonitorInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.PlannerInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SensorInterface;
import br.ufscar.sas.xtext.sasdsl.services.SasDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SasDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SasDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SasDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SasDslPackage.ANALYZER_INTERFACE:
				sequence_AnalyzerInterface(context, (AnalyzerInterface) semanticObject); 
				return; 
			case SasDslPackage.ARCHITECTURE_DEFINITION:
				sequence_ArchitectureDefinition(context, (ArchitectureDefinition) semanticObject); 
				return; 
			case SasDslPackage.CONTROLLER_INTERFACE:
				sequence_ControllerInterface(context, (ControllerInterface) semanticObject); 
				return; 
			case SasDslPackage.DSL_ANALYZER:
				sequence_DSLAnalyzer(context, (DSLAnalyzer) semanticObject); 
				return; 
			case SasDslPackage.DSL_CONTROLLER:
				sequence_DSLController(context, (DSLController) semanticObject); 
				return; 
			case SasDslPackage.DSL_EFFECTOR:
				sequence_DSLEffector(context, (DSLEffector) semanticObject); 
				return; 
			case SasDslPackage.DSL_EXECUTOR:
				sequence_DSLExecutor(context, (DSLExecutor) semanticObject); 
				return; 
			case SasDslPackage.DSL_KNOWLEDGE:
				sequence_DSLKnowledge(context, (DSLKnowledge) semanticObject); 
				return; 
			case SasDslPackage.DSL_MANAGED:
				sequence_DSLManaged(context, (DSLManaged) semanticObject); 
				return; 
			case SasDslPackage.DSL_MANAGER_CONTROLLER:
				sequence_DSLManagerController(context, (DSLManagerController) semanticObject); 
				return; 
			case SasDslPackage.DSL_MANAGING:
				sequence_DSLManaging(context, (DSLManaging) semanticObject); 
				return; 
			case SasDslPackage.DSL_MEASURED_OUTPUT:
				sequence_DSLMeasuredOutput(context, (DSLMeasuredOutput) semanticObject); 
				return; 
			case SasDslPackage.DSL_MONITOR:
				sequence_DSLMonitor(context, (DSLMonitor) semanticObject); 
				return; 
			case SasDslPackage.DSL_PLANNER:
				sequence_DSLPlanner(context, (DSLPlanner) semanticObject); 
				return; 
			case SasDslPackage.DSL_REFERENCE_INPUT:
				sequence_DSLReferenceInput(context, (DSLReferenceInput) semanticObject); 
				return; 
			case SasDslPackage.DSL_RULE_ANALYZER:
				sequence_DSLRuleAnalyzer(context, (DSLRuleAnalyzer) semanticObject); 
				return; 
			case SasDslPackage.DSL_RULE_CONTROLLER:
				sequence_DSLRuleController(context, (DSLRuleController) semanticObject); 
				return; 
			case SasDslPackage.DSL_RULE_EXECUTOR:
				sequence_DSLRuleExecutor(context, (DSLRuleExecutor) semanticObject); 
				return; 
			case SasDslPackage.DSL_RULE_MO:
				sequence_DSLRuleMO(context, (DSLRuleMO) semanticObject); 
				return; 
			case SasDslPackage.DSL_RULE_MONITOR:
				sequence_DSLRuleMonitor(context, (DSLRuleMonitor) semanticObject); 
				return; 
			case SasDslPackage.DSL_RULE_PLANNER:
				sequence_DSLRulePlanner(context, (DSLRulePlanner) semanticObject); 
				return; 
			case SasDslPackage.DSL_RULE_RI:
				sequence_DSLRuleRI(context, (DSLRuleRI) semanticObject); 
				return; 
			case SasDslPackage.DSL_SENSOR:
				sequence_DSLSensor(context, (DSLSensor) semanticObject); 
				return; 
			case SasDslPackage.EFFECTOR_INTERFACE:
				sequence_EffectorInterface(context, (EffectorInterface) semanticObject); 
				return; 
			case SasDslPackage.EXECUTOR_INTERFACE:
				sequence_ExecutorInterface(context, (ExecutorInterface) semanticObject); 
				return; 
			case SasDslPackage.KNOWLEDGE_INTERFACE:
				sequence_KnowledgeInterface(context, (KnowledgeInterface) semanticObject); 
				return; 
			case SasDslPackage.MONITOR_INTERFACE:
				sequence_MonitorInterface(context, (MonitorInterface) semanticObject); 
				return; 
			case SasDslPackage.PLANNER_INTERFACE:
				sequence_PlannerInterface(context, (PlannerInterface) semanticObject); 
				return; 
			case SasDslPackage.SENSOR_INTERFACE:
				sequence_SensorInterface(context, (SensorInterface) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AnalyzerInterface returns AnalyzerInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AnalyzerInterface(ISerializationContext context, AnalyzerInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.ANALYZER_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.ANALYZER_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnalyzerInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ArchitectureDefinition returns ArchitectureDefinition
	 *
	 * Constraint:
	 *     (name=ID managing+=DSLManaging+ managed+=DSLManaged+ rules+=DSLRules*)
	 */
	protected void sequence_ArchitectureDefinition(ISerializationContext context, ArchitectureDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ControllerInterface returns ControllerInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ControllerInterface(ISerializationContext context, ControllerInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.CONTROLLER_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.CONTROLLER_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getControllerInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DSLAnalyzer returns DSLAnalyzer
	 *
	 * Constraint:
	 *     (name=ID (anlyzerinterfaces+=AnalyzerInterface anlyzerinterfaces+=AnalyzerInterface*)?)
	 */
	protected void sequence_DSLAnalyzer(ISerializationContext context, DSLAnalyzer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLController returns DSLController
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (controllerinterfaces+=ControllerInterface controllerinterfaces+=ControllerInterface*)? 
	 *         monitor+=DSLMonitor+ 
	 *         analyzer+=DSLAnalyzer+ 
	 *         planner+=DSLPlanner+ 
	 *         executor+=DSLExecutor+ 
	 *         knowledge+=DSLKnowledge+
	 *     )
	 */
	protected void sequence_DSLController(ISerializationContext context, DSLController semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLEffector returns DSLEffector
	 *
	 * Constraint:
	 *     (name=ID (effectorinterfaces+=EffectorInterface effectorinterfaces+=EffectorInterface*)?)
	 */
	protected void sequence_DSLEffector(ISerializationContext context, DSLEffector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLExecutor returns DSLExecutor
	 *
	 * Constraint:
	 *     (name=ID (executorinterfaces+=ExecutorInterface executorinterfaces+=ExecutorInterface*)?)
	 */
	protected void sequence_DSLExecutor(ISerializationContext context, DSLExecutor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLKnowledge returns DSLKnowledge
	 *
	 * Constraint:
	 *     (name=ID (knowledgeinterfaces+=KnowledgeInterface knowledgeinterfaces+=KnowledgeInterface*)? referenceInput+=DSLReferenceInput+)
	 */
	protected void sequence_DSLKnowledge(ISerializationContext context, DSLKnowledge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLManaged returns DSLManaged
	 *
	 * Constraint:
	 *     (name=ID sensor+=DSLSensor+ effector+=DSLEffector+ measuredOutput+=DSLMeasuredOutput+)
	 */
	protected void sequence_DSLManaged(ISerializationContext context, DSLManaged semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLManagerController returns DSLManagerController
	 *
	 * Constraint:
	 *     (name=ID controller+=DSLController+)
	 */
	protected void sequence_DSLManagerController(ISerializationContext context, DSLManagerController semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLManaging returns DSLManaging
	 *
	 * Constraint:
	 *     (name=ID managerController+=DSLManagerController* controller+=DSLController+)
	 */
	protected void sequence_DSLManaging(ISerializationContext context, DSLManaging semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLMeasuredOutput returns DSLMeasuredOutput
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DSLMeasuredOutput(ISerializationContext context, DSLMeasuredOutput semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.DSL_MEASURED_OUTPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.DSL_MEASURED_OUTPUT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDSLMeasuredOutputAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DSLMonitor returns DSLMonitor
	 *
	 * Constraint:
	 *     (name=ID (monitorinterfaces+=MonitorInterface monitorinterfaces+=MonitorInterface*)?)
	 */
	protected void sequence_DSLMonitor(ISerializationContext context, DSLMonitor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLPlanner returns DSLPlanner
	 *
	 * Constraint:
	 *     (name=ID (plannerinterfaces+=PlannerInterface plannerinterfaces+=PlannerInterface*)?)
	 */
	protected void sequence_DSLPlanner(ISerializationContext context, DSLPlanner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLReferenceInput returns DSLReferenceInput
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DSLReferenceInput(ISerializationContext context, DSLReferenceInput semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.DSL_REFERENCE_INPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.DSL_REFERENCE_INPUT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDSLReferenceInputAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DSLRules returns DSLRuleAnalyzer
	 *     DSLRuleAnalyzer returns DSLRuleAnalyzer
	 *
	 * Constraint:
	 *     (
	 *         (analyzer=[DSLAnalyzer|ID] knowledge=[DSLKnowledge|ID]) | 
	 *         (analyzer=[DSLAnalyzer|ID] knowledge=[DSLKnowledge|ID] knowledgeinterface=[KnowledgeInterface|FQN]) | 
	 *         (analyzer=[DSLAnalyzer|ID] monitor=[DSLMonitor|ID]) | 
	 *         (analyzer=[DSLAnalyzer|ID] knowledge=[DSLMonitor|ID] monitorinterface=[MonitorInterface|FQN]) | 
	 *         (analyzer=[DSLAnalyzer|ID] planner=[DSLPlanner|ID]) | 
	 *         (analyzer=[DSLAnalyzer|ID] planner=[DSLPlanner|ID] plannerinterface=[PlannerInterface|FQN])
	 *     )
	 */
	protected void sequence_DSLRuleAnalyzer(ISerializationContext context, DSLRuleAnalyzer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLRules returns DSLRuleController
	 *     DSLRuleController returns DSLRuleController
	 *
	 * Constraint:
	 *     (
	 *         (controller=[DSLController|ID] monitor=[DSLMonitor|ID]) | 
	 *         (controller=[DSLController|ID] monitor=[DSLMonitor|ID] monitorinterface=[MonitorInterface|FQN]) | 
	 *         (controller=[DSLController|ID] analyzer=[DSLAnalyzer|ID]) | 
	 *         (controller=[DSLController|ID] analyzer=[DSLAnalyzer|ID] analyzerinterface=[AnalyzerInterface|FQN]) | 
	 *         (controller=[DSLController|ID] planner=[DSLPlanner|ID]) | 
	 *         (controller=[DSLController|ID] planner=[DSLPlanner|ID] plannerinterface=[PlannerInterface|FQN]) | 
	 *         (controller=[DSLController|ID] executor=[DSLExecutor|ID]) | 
	 *         (controller=[DSLController|ID] executor=[DSLExecutor|ID] executorinterface=[ExecutorInterface|FQN])
	 *     )
	 */
	protected void sequence_DSLRuleController(ISerializationContext context, DSLRuleController semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLRules returns DSLRuleExecutor
	 *     DSLRuleExecutor returns DSLRuleExecutor
	 *
	 * Constraint:
	 *     (
	 *         (executor=[DSLExecutor|ID] effector=[DSLEffector|ID]) | 
	 *         (executor=[DSLExecutor|ID] effector=[DSLEffector|ID] effectorinterface=[EffectorInterface|FQN]) | 
	 *         (executor=[DSLExecutor|ID] planner=[DSLPlanner|ID]) | 
	 *         (executor=[DSLExecutor|ID] planner=[DSLPlanner|ID] plannerinterface=[PlannerInterface|FQN]) | 
	 *         (executor=[DSLExecutor|ID] knowledge=[DSLKnowledge|ID]) | 
	 *         (executor=[DSLExecutor|ID] knowledge=[DSLKnowledge|ID] knowledgeinterface=[KnowledgeInterface|FQN])
	 *     )
	 */
	protected void sequence_DSLRuleExecutor(ISerializationContext context, DSLRuleExecutor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLRules returns DSLRuleMO
	 *     DSLRuleMO returns DSLRuleMO
	 *
	 * Constraint:
	 *     ((sensor=[DSLSensor|ID] measured=[DSLMeasuredOutput|ID]) | (sensor=[DSLSensor|ID] measured=[DSLMeasuredOutput|ID]))
	 */
	protected void sequence_DSLRuleMO(ISerializationContext context, DSLRuleMO semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLRules returns DSLRuleMonitor
	 *     DSLRuleMonitor returns DSLRuleMonitor
	 *
	 * Constraint:
	 *     (
	 *         (monitor=[DSLMonitor|ID] sensor=[DSLSensor|ID]) | 
	 *         (monitor=[DSLMonitor|ID] sensor=[DSLSensor|ID] sensorinterface=[SensorInterface|FQN]) | 
	 *         (monitor=[DSLMonitor|ID] knowledge=[DSLKnowledge|ID]) | 
	 *         (monitor=[DSLMonitor|ID] knowledge=[DSLKnowledge|ID] knowledgeinterface=[KnowledgeInterface|FQN]) | 
	 *         (monitor=[DSLMonitor|ID] analyzer=[DSLAnalyzer|ID]) | 
	 *         (monitor=[DSLMonitor|ID] analyzer=[DSLAnalyzer|ID] analyzerinterface=[AnalyzerInterface|FQN])
	 *     )
	 */
	protected void sequence_DSLRuleMonitor(ISerializationContext context, DSLRuleMonitor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLRules returns DSLRulePlanner
	 *     DSLRulePlanner returns DSLRulePlanner
	 *
	 * Constraint:
	 *     (
	 *         (planner=[DSLPlanner|ID] knowledge=[DSLKnowledge|ID]) | 
	 *         (planner=[DSLPlanner|ID] knowledge=[DSLKnowledge|ID] knowledgeinterface=[KnowledgeInterface|FQN]) | 
	 *         (planner=[DSLPlanner|ID] analyzer=[DSLAnalyzer|ID]) | 
	 *         (planner=[DSLPlanner|ID] analyzer=[DSLAnalyzer|ID] analyzerinterface=[AnalyzerInterface|FQN]) | 
	 *         (planner=[DSLPlanner|ID] executor=[DSLExecutor|ID]) | 
	 *         (planner=[DSLPlanner|ID] executor=[DSLExecutor|ID] executorinterface=[ExecutorInterface|FQN])
	 *     )
	 */
	protected void sequence_DSLRulePlanner(ISerializationContext context, DSLRulePlanner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLRules returns DSLRuleRI
	 *     DSLRuleRI returns DSLRuleRI
	 *
	 * Constraint:
	 *     ((analyzer=[DSLAnalyzer|ID] reference=[DSLReferenceInput|ID]) | (analyzer=[DSLAnalyzer|ID] reference=[DSLReferenceInput|ID]))
	 */
	protected void sequence_DSLRuleRI(ISerializationContext context, DSLRuleRI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DSLSensor returns DSLSensor
	 *
	 * Constraint:
	 *     (name=ID (sensorinterfaces+=SensorInterface sensorinterfaces+=SensorInterface*)?)
	 */
	protected void sequence_DSLSensor(ISerializationContext context, DSLSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EffectorInterface returns EffectorInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EffectorInterface(ISerializationContext context, EffectorInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.EFFECTOR_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.EFFECTOR_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEffectorInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExecutorInterface returns ExecutorInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ExecutorInterface(ISerializationContext context, ExecutorInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.EXECUTOR_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.EXECUTOR_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExecutorInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KnowledgeInterface returns KnowledgeInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_KnowledgeInterface(ISerializationContext context, KnowledgeInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.KNOWLEDGE_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.KNOWLEDGE_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKnowledgeInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MonitorInterface returns MonitorInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_MonitorInterface(ISerializationContext context, MonitorInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.MONITOR_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.MONITOR_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMonitorInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PlannerInterface returns PlannerInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PlannerInterface(ISerializationContext context, PlannerInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.PLANNER_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.PLANNER_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlannerInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SensorInterface returns SensorInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SensorInterface(ISerializationContext context, SensorInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SasDslPackage.Literals.SENSOR_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SasDslPackage.Literals.SENSOR_INTERFACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorInterfaceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
