/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SasDslFactoryImpl extends EFactoryImpl implements SasDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SasDslFactory init()
  {
    try
    {
      SasDslFactory theSasDslFactory = (SasDslFactory)EPackage.Registry.INSTANCE.getEFactory(SasDslPackage.eNS_URI);
      if (theSasDslFactory != null)
      {
        return theSasDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SasDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SasDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SasDslPackage.ARCHITECTURE_DEFINITION: return createArchitectureDefinition();
      case SasDslPackage.DSL_ABSTRACTION: return createDSLAbstraction();
      case SasDslPackage.DSL_COMPOSITION: return createDSLComposition();
      case SasDslPackage.DSL_RESTRICTION: return createDSLRestriction();
      case SasDslPackage.DSL_SENSOR_BELONGS_TO: return createDSLSensorBelongsTo();
      case SasDslPackage.DSL_REFERENCE_INPUT_BELONGS_TO: return createDSLReferenceInputBelongsTo();
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO: return createDSLEffectorBelongsTo();
      case SasDslPackage.DSL_MONITOR_BELONGS_TO1: return createDSLMonitorBelongsTo1();
      case SasDslPackage.DSL_MONITOR_BELONGS_TO2: return createDSLMonitorBelongsTo2();
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1: return createDSLAnalyzerBelongsTo1();
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO2: return createDSLAnalyzerBelongsTo2();
      case SasDslPackage.DSL_PLANNER_BELONGS_TO1: return createDSLPlannerBelongsTo1();
      case SasDslPackage.DSL_PLANNER_BELONGS_TO2: return createDSLPlannerBelongsTo2();
      case SasDslPackage.DSL_EXECUTOR_BELONGS_TO1: return createDSLExecutorBelongsTo1();
      case SasDslPackage.DSL_EXECUTOR_BELONGS_TO2: return createDSLExecutorBelongsTo2();
      case SasDslPackage.DSL_CL_BELONGS_TO1: return createDSLClBelongsTo1();
      case SasDslPackage.DSL_CL_BELONGS_TO2: return createDSLClBelongsTo2();
      case SasDslPackage.DSL_CLM_BELONGS_TO: return createDSLClmBelongsTo();
      case SasDslPackage.DSL_MEASURED_OUPUT_BELONGS_TO: return createDSLMeasuredOuputBelongsTo();
      case SasDslPackage.DSL_GAUGE_BELONGS_TO: return createDSLGaugeBelongsTo();
      case SasDslPackage.DSL_PROBE_BELONGS_TO: return createDSLProbeBelongsTo();
      case SasDslPackage.DSL_MANAGING: return createDSLManaging();
      case SasDslPackage.DSL_MANAGED: return createDSLManaged();
      case SasDslPackage.DSL_CONTROL_LOOP_MANAGER: return createDSLControlLoopManager();
      case SasDslPackage.DSL_CONTROL_LOOP: return createDSLControlLoop();
      case SasDslPackage.DSL_MONITOR: return createDSLMonitor();
      case SasDslPackage.DSL_ANALYZER: return createDSLAnalyzer();
      case SasDslPackage.DSL_PLANNER: return createDSLPlanner();
      case SasDslPackage.DSL_EXECUTOR: return createDSLExecutor();
      case SasDslPackage.DSL_KNOWLEDGE: return createDSLKnowledge();
      case SasDslPackage.DSL_SENSOR: return createDSLSensor();
      case SasDslPackage.DSL_EFFECTOR: return createDSLEffector();
      case SasDslPackage.DSL_PROBE: return createDSLProbe();
      case SasDslPackage.DSL_GAUGE: return createDSLGauge();
      case SasDslPackage.DSL_REFERENCE_INPUT: return createDSLReferenceInput();
      case SasDslPackage.DSL_MEASURED_OUTPUT: return createDSLMeasuredOutput();
      case SasDslPackage.MEASURED_OUTPUT_INTERFACE: return createMeasuredOutputInterface();
      case SasDslPackage.GAUGE_INTERFACE: return createGaugeInterface();
      case SasDslPackage.EFFECTOR_INTERFACE: return createEffectorInterface();
      case SasDslPackage.PROBE_INTERFACE: return createProbeInterface();
      case SasDslPackage.SENSOR_INTERFACE: return createSensorInterface();
      case SasDslPackage.MONITOR_INTERFACE: return createMonitorInterface();
      case SasDslPackage.ANALYZER_INTERFACE: return createAnalyzerInterface();
      case SasDslPackage.PLANNER_INTERFACE: return createPlannerInterface();
      case SasDslPackage.EXECUTOR_INTERFACE: return createExecutorInterface();
      case SasDslPackage.KNOWLEDGE_INTERFACE: return createKnowledgeInterface();
      case SasDslPackage.CONTROL_LOOP_INTERFACE: return createControlLoopInterface();
      case SasDslPackage.CONTROL_LOOP_MANAGER_INTERFACE: return createControlLoopManagerInterface();
      case SasDslPackage.REFERENCE_INPUT_INTERFACE: return createReferenceInputInterface();
      case SasDslPackage.MANAGED_INTERFACE: return createManagedInterface();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDefinition createArchitectureDefinition()
  {
    ArchitectureDefinitionImpl architectureDefinition = new ArchitectureDefinitionImpl();
    return architectureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAbstraction createDSLAbstraction()
  {
    DSLAbstractionImpl dslAbstraction = new DSLAbstractionImpl();
    return dslAbstraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLComposition createDSLComposition()
  {
    DSLCompositionImpl dslComposition = new DSLCompositionImpl();
    return dslComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLRestriction createDSLRestriction()
  {
    DSLRestrictionImpl dslRestriction = new DSLRestrictionImpl();
    return dslRestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLSensorBelongsTo createDSLSensorBelongsTo()
  {
    DSLSensorBelongsToImpl dslSensorBelongsTo = new DSLSensorBelongsToImpl();
    return dslSensorBelongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLReferenceInputBelongsTo createDSLReferenceInputBelongsTo()
  {
    DSLReferenceInputBelongsToImpl dslReferenceInputBelongsTo = new DSLReferenceInputBelongsToImpl();
    return dslReferenceInputBelongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEffectorBelongsTo createDSLEffectorBelongsTo()
  {
    DSLEffectorBelongsToImpl dslEffectorBelongsTo = new DSLEffectorBelongsToImpl();
    return dslEffectorBelongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMonitorBelongsTo1 createDSLMonitorBelongsTo1()
  {
    DSLMonitorBelongsTo1Impl dslMonitorBelongsTo1 = new DSLMonitorBelongsTo1Impl();
    return dslMonitorBelongsTo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMonitorBelongsTo2 createDSLMonitorBelongsTo2()
  {
    DSLMonitorBelongsTo2Impl dslMonitorBelongsTo2 = new DSLMonitorBelongsTo2Impl();
    return dslMonitorBelongsTo2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAnalyzerBelongsTo1 createDSLAnalyzerBelongsTo1()
  {
    DSLAnalyzerBelongsTo1Impl dslAnalyzerBelongsTo1 = new DSLAnalyzerBelongsTo1Impl();
    return dslAnalyzerBelongsTo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAnalyzerBelongsTo2 createDSLAnalyzerBelongsTo2()
  {
    DSLAnalyzerBelongsTo2Impl dslAnalyzerBelongsTo2 = new DSLAnalyzerBelongsTo2Impl();
    return dslAnalyzerBelongsTo2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPlannerBelongsTo1 createDSLPlannerBelongsTo1()
  {
    DSLPlannerBelongsTo1Impl dslPlannerBelongsTo1 = new DSLPlannerBelongsTo1Impl();
    return dslPlannerBelongsTo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPlannerBelongsTo2 createDSLPlannerBelongsTo2()
  {
    DSLPlannerBelongsTo2Impl dslPlannerBelongsTo2 = new DSLPlannerBelongsTo2Impl();
    return dslPlannerBelongsTo2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLExecutorBelongsTo1 createDSLExecutorBelongsTo1()
  {
    DSLExecutorBelongsTo1Impl dslExecutorBelongsTo1 = new DSLExecutorBelongsTo1Impl();
    return dslExecutorBelongsTo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLExecutorBelongsTo2 createDSLExecutorBelongsTo2()
  {
    DSLExecutorBelongsTo2Impl dslExecutorBelongsTo2 = new DSLExecutorBelongsTo2Impl();
    return dslExecutorBelongsTo2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLClBelongsTo1 createDSLClBelongsTo1()
  {
    DSLClBelongsTo1Impl dslClBelongsTo1 = new DSLClBelongsTo1Impl();
    return dslClBelongsTo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLClBelongsTo2 createDSLClBelongsTo2()
  {
    DSLClBelongsTo2Impl dslClBelongsTo2 = new DSLClBelongsTo2Impl();
    return dslClBelongsTo2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLClmBelongsTo createDSLClmBelongsTo()
  {
    DSLClmBelongsToImpl dslClmBelongsTo = new DSLClmBelongsToImpl();
    return dslClmBelongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMeasuredOuputBelongsTo createDSLMeasuredOuputBelongsTo()
  {
    DSLMeasuredOuputBelongsToImpl dslMeasuredOuputBelongsTo = new DSLMeasuredOuputBelongsToImpl();
    return dslMeasuredOuputBelongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLGaugeBelongsTo createDSLGaugeBelongsTo()
  {
    DSLGaugeBelongsToImpl dslGaugeBelongsTo = new DSLGaugeBelongsToImpl();
    return dslGaugeBelongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLProbeBelongsTo createDSLProbeBelongsTo()
  {
    DSLProbeBelongsToImpl dslProbeBelongsTo = new DSLProbeBelongsToImpl();
    return dslProbeBelongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManaging createDSLManaging()
  {
    DSLManagingImpl dslManaging = new DSLManagingImpl();
    return dslManaging;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManaged createDSLManaged()
  {
    DSLManagedImpl dslManaged = new DSLManagedImpl();
    return dslManaged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLControlLoopManager createDSLControlLoopManager()
  {
    DSLControlLoopManagerImpl dslControlLoopManager = new DSLControlLoopManagerImpl();
    return dslControlLoopManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLControlLoop createDSLControlLoop()
  {
    DSLControlLoopImpl dslControlLoop = new DSLControlLoopImpl();
    return dslControlLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMonitor createDSLMonitor()
  {
    DSLMonitorImpl dslMonitor = new DSLMonitorImpl();
    return dslMonitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAnalyzer createDSLAnalyzer()
  {
    DSLAnalyzerImpl dslAnalyzer = new DSLAnalyzerImpl();
    return dslAnalyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPlanner createDSLPlanner()
  {
    DSLPlannerImpl dslPlanner = new DSLPlannerImpl();
    return dslPlanner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLExecutor createDSLExecutor()
  {
    DSLExecutorImpl dslExecutor = new DSLExecutorImpl();
    return dslExecutor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLKnowledge createDSLKnowledge()
  {
    DSLKnowledgeImpl dslKnowledge = new DSLKnowledgeImpl();
    return dslKnowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLSensor createDSLSensor()
  {
    DSLSensorImpl dslSensor = new DSLSensorImpl();
    return dslSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEffector createDSLEffector()
  {
    DSLEffectorImpl dslEffector = new DSLEffectorImpl();
    return dslEffector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLProbe createDSLProbe()
  {
    DSLProbeImpl dslProbe = new DSLProbeImpl();
    return dslProbe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLGauge createDSLGauge()
  {
    DSLGaugeImpl dslGauge = new DSLGaugeImpl();
    return dslGauge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLReferenceInput createDSLReferenceInput()
  {
    DSLReferenceInputImpl dslReferenceInput = new DSLReferenceInputImpl();
    return dslReferenceInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMeasuredOutput createDSLMeasuredOutput()
  {
    DSLMeasuredOutputImpl dslMeasuredOutput = new DSLMeasuredOutputImpl();
    return dslMeasuredOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasuredOutputInterface createMeasuredOutputInterface()
  {
    MeasuredOutputInterfaceImpl measuredOutputInterface = new MeasuredOutputInterfaceImpl();
    return measuredOutputInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GaugeInterface createGaugeInterface()
  {
    GaugeInterfaceImpl gaugeInterface = new GaugeInterfaceImpl();
    return gaugeInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectorInterface createEffectorInterface()
  {
    EffectorInterfaceImpl effectorInterface = new EffectorInterfaceImpl();
    return effectorInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProbeInterface createProbeInterface()
  {
    ProbeInterfaceImpl probeInterface = new ProbeInterfaceImpl();
    return probeInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorInterface createSensorInterface()
  {
    SensorInterfaceImpl sensorInterface = new SensorInterfaceImpl();
    return sensorInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitorInterface createMonitorInterface()
  {
    MonitorInterfaceImpl monitorInterface = new MonitorInterfaceImpl();
    return monitorInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalyzerInterface createAnalyzerInterface()
  {
    AnalyzerInterfaceImpl analyzerInterface = new AnalyzerInterfaceImpl();
    return analyzerInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannerInterface createPlannerInterface()
  {
    PlannerInterfaceImpl plannerInterface = new PlannerInterfaceImpl();
    return plannerInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutorInterface createExecutorInterface()
  {
    ExecutorInterfaceImpl executorInterface = new ExecutorInterfaceImpl();
    return executorInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnowledgeInterface createKnowledgeInterface()
  {
    KnowledgeInterfaceImpl knowledgeInterface = new KnowledgeInterfaceImpl();
    return knowledgeInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlLoopInterface createControlLoopInterface()
  {
    ControlLoopInterfaceImpl controlLoopInterface = new ControlLoopInterfaceImpl();
    return controlLoopInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlLoopManagerInterface createControlLoopManagerInterface()
  {
    ControlLoopManagerInterfaceImpl controlLoopManagerInterface = new ControlLoopManagerInterfaceImpl();
    return controlLoopManagerInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceInputInterface createReferenceInputInterface()
  {
    ReferenceInputInterfaceImpl referenceInputInterface = new ReferenceInputInterfaceImpl();
    return referenceInputInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManagedInterface createManagedInterface()
  {
    ManagedInterfaceImpl managedInterface = new ManagedInterfaceImpl();
    return managedInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SasDslPackage getSasDslPackage()
  {
    return (SasDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SasDslPackage getPackage()
  {
    return SasDslPackage.eINSTANCE;
  }

} //SasDslFactoryImpl
