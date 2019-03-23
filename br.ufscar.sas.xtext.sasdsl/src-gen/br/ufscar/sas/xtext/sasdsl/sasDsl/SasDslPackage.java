/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslFactory
 * @model kind="package"
 * @generated
 */
public interface SasDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sasDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufscar.br/sas/xtext/sasdsl/SasDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sasDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SasDslPackage eINSTANCE = br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl.init();

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.ArchitectureDefinitionImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getArchitectureDefinition()
   * @generated
   */
  int ARCHITECTURE_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Abstractions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_DEFINITION__ABSTRACTIONS = 0;

  /**
   * The number of structural features of the '<em>Architecture Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAbstractionsImpl <em>DCL Abstractions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAbstractionsImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLAbstractions()
   * @generated
   */
  int DCL_ABSTRACTIONS = 1;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ABSTRACTIONS__MANAGING = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ABSTRACTIONS__NAME = 1;

  /**
   * The number of structural features of the '<em>DCL Abstractions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ABSTRACTIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagingImpl <em>DCL Managing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagingImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLManaging()
   * @generated
   */
  int DCL_MANAGING = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGING__NAME = 0;

  /**
   * The number of structural features of the '<em>DCL Managing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagedImpl <em>DCL Managed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagedImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLManaged()
   * @generated
   */
  int DCL_MANAGED = 3;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGED__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGED__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Managed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGED_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopManagerImpl <em>DCL Control Loop Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopManagerImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLControlLoopManager()
   * @generated
   */
  int DCL_CONTROL_LOOP_MANAGER = 4;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_CONTROL_LOOP_MANAGER__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_CONTROL_LOOP_MANAGER__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Control Loop Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_CONTROL_LOOP_MANAGER_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopImpl <em>DCL Control Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLControlLoop()
   * @generated
   */
  int DCL_CONTROL_LOOP = 5;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_CONTROL_LOOP__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_CONTROL_LOOP__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Control Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_CONTROL_LOOP_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMonitorImpl <em>DCL Monitor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMonitorImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLMonitor()
   * @generated
   */
  int DCL_MONITOR = 6;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MONITOR__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MONITOR__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Monitor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MONITOR_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAnalyzerImpl <em>DCL Analyzer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAnalyzerImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLAnalyzer()
   * @generated
   */
  int DCL_ANALYZER = 7;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ANALYZER__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ANALYZER__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Analyzer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ANALYZER_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLPlannerImpl <em>DCL Planner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLPlannerImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLPlanner()
   * @generated
   */
  int DCL_PLANNER = 8;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PLANNER__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PLANNER__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Planner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PLANNER_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLExecutorImpl <em>DCL Executor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLExecutorImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLExecutor()
   * @generated
   */
  int DCL_EXECUTOR = 9;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EXECUTOR__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EXECUTOR__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Executor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EXECUTOR_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLKnowledgeImpl <em>DCL Knowledge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLKnowledgeImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLKnowledge()
   * @generated
   */
  int DCL_KNOWLEDGE = 10;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_KNOWLEDGE__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_KNOWLEDGE__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Knowledge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_KNOWLEDGE_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLSensorImpl <em>DCL Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLSensorImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLSensor()
   * @generated
   */
  int DCL_SENSOR = 11;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SENSOR__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SENSOR__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SENSOR_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLEffectorImpl <em>DCL Effector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLEffectorImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLEffector()
   * @generated
   */
  int DCL_EFFECTOR = 12;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EFFECTOR__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EFFECTOR__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Effector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EFFECTOR_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLProbeImpl <em>DCL Probe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLProbeImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLProbe()
   * @generated
   */
  int DCL_PROBE = 13;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PROBE__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PROBE__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Probe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PROBE_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLGaugeImpl <em>DCL Gauge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLGaugeImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLGauge()
   * @generated
   */
  int DCL_GAUGE = 14;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_GAUGE__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_GAUGE__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Gauge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_GAUGE_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLReferenceInputImpl <em>DCL Reference Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLReferenceInputImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLReferenceInput()
   * @generated
   */
  int DCL_REFERENCE_INPUT = 15;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_REFERENCE_INPUT__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_REFERENCE_INPUT__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Reference Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_REFERENCE_INPUT_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMeasuredOutputImpl <em>DCL Measured Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMeasuredOutputImpl
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLMeasuredOutput()
   * @generated
   */
  int DCL_MEASURED_OUTPUT = 16;

  /**
   * The feature id for the '<em><b>Managing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MEASURED_OUTPUT__MANAGING = DCL_ABSTRACTIONS__MANAGING;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MEASURED_OUTPUT__NAME = DCL_ABSTRACTIONS__NAME;

  /**
   * The number of structural features of the '<em>DCL Measured Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MEASURED_OUTPUT_FEATURE_COUNT = DCL_ABSTRACTIONS_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture Definition</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition
   * @generated
   */
  EClass getArchitectureDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getAbstractions <em>Abstractions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abstractions</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getAbstractions()
   * @see #getArchitectureDefinition()
   * @generated
   */
  EReference getArchitectureDefinition_Abstractions();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAbstractions <em>DCL Abstractions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Abstractions</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAbstractions
   * @generated
   */
  EClass getDCLAbstractions();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAbstractions#getManaging <em>Managing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Managing</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAbstractions#getManaging()
   * @see #getDCLAbstractions()
   * @generated
   */
  EReference getDCLAbstractions_Managing();

  /**
   * Returns the meta object for the attribute list '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAbstractions#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAbstractions#getName()
   * @see #getDCLAbstractions()
   * @generated
   */
  EAttribute getDCLAbstractions_Name();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLManaging <em>DCL Managing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Managing</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLManaging
   * @generated
   */
  EClass getDCLManaging();

  /**
   * Returns the meta object for the attribute list '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLManaging#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLManaging#getName()
   * @see #getDCLManaging()
   * @generated
   */
  EAttribute getDCLManaging_Name();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLManaged <em>DCL Managed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Managed</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLManaged
   * @generated
   */
  EClass getDCLManaged();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLControlLoopManager <em>DCL Control Loop Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Control Loop Manager</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLControlLoopManager
   * @generated
   */
  EClass getDCLControlLoopManager();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLControlLoop <em>DCL Control Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Control Loop</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLControlLoop
   * @generated
   */
  EClass getDCLControlLoop();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLMonitor <em>DCL Monitor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Monitor</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLMonitor
   * @generated
   */
  EClass getDCLMonitor();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAnalyzer <em>DCL Analyzer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Analyzer</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLAnalyzer
   * @generated
   */
  EClass getDCLAnalyzer();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLPlanner <em>DCL Planner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Planner</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLPlanner
   * @generated
   */
  EClass getDCLPlanner();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLExecutor <em>DCL Executor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Executor</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLExecutor
   * @generated
   */
  EClass getDCLExecutor();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLKnowledge <em>DCL Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Knowledge</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLKnowledge
   * @generated
   */
  EClass getDCLKnowledge();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLSensor <em>DCL Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Sensor</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLSensor
   * @generated
   */
  EClass getDCLSensor();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLEffector <em>DCL Effector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Effector</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLEffector
   * @generated
   */
  EClass getDCLEffector();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLProbe <em>DCL Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Probe</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLProbe
   * @generated
   */
  EClass getDCLProbe();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLGauge <em>DCL Gauge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Gauge</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLGauge
   * @generated
   */
  EClass getDCLGauge();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLReferenceInput <em>DCL Reference Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Reference Input</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLReferenceInput
   * @generated
   */
  EClass getDCLReferenceInput();

  /**
   * Returns the meta object for class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DCLMeasuredOutput <em>DCL Measured Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCL Measured Output</em>'.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DCLMeasuredOutput
   * @generated
   */
  EClass getDCLMeasuredOutput();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SasDslFactory getSasDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.ArchitectureDefinitionImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getArchitectureDefinition()
     * @generated
     */
    EClass ARCHITECTURE_DEFINITION = eINSTANCE.getArchitectureDefinition();

    /**
     * The meta object literal for the '<em><b>Abstractions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_DEFINITION__ABSTRACTIONS = eINSTANCE.getArchitectureDefinition_Abstractions();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAbstractionsImpl <em>DCL Abstractions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAbstractionsImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLAbstractions()
     * @generated
     */
    EClass DCL_ABSTRACTIONS = eINSTANCE.getDCLAbstractions();

    /**
     * The meta object literal for the '<em><b>Managing</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_ABSTRACTIONS__MANAGING = eINSTANCE.getDCLAbstractions_Managing();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DCL_ABSTRACTIONS__NAME = eINSTANCE.getDCLAbstractions_Name();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagingImpl <em>DCL Managing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagingImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLManaging()
     * @generated
     */
    EClass DCL_MANAGING = eINSTANCE.getDCLManaging();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DCL_MANAGING__NAME = eINSTANCE.getDCLManaging_Name();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagedImpl <em>DCL Managed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLManagedImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLManaged()
     * @generated
     */
    EClass DCL_MANAGED = eINSTANCE.getDCLManaged();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopManagerImpl <em>DCL Control Loop Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopManagerImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLControlLoopManager()
     * @generated
     */
    EClass DCL_CONTROL_LOOP_MANAGER = eINSTANCE.getDCLControlLoopManager();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopImpl <em>DCL Control Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLControlLoopImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLControlLoop()
     * @generated
     */
    EClass DCL_CONTROL_LOOP = eINSTANCE.getDCLControlLoop();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMonitorImpl <em>DCL Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMonitorImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLMonitor()
     * @generated
     */
    EClass DCL_MONITOR = eINSTANCE.getDCLMonitor();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAnalyzerImpl <em>DCL Analyzer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLAnalyzerImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLAnalyzer()
     * @generated
     */
    EClass DCL_ANALYZER = eINSTANCE.getDCLAnalyzer();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLPlannerImpl <em>DCL Planner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLPlannerImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLPlanner()
     * @generated
     */
    EClass DCL_PLANNER = eINSTANCE.getDCLPlanner();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLExecutorImpl <em>DCL Executor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLExecutorImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLExecutor()
     * @generated
     */
    EClass DCL_EXECUTOR = eINSTANCE.getDCLExecutor();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLKnowledgeImpl <em>DCL Knowledge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLKnowledgeImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLKnowledge()
     * @generated
     */
    EClass DCL_KNOWLEDGE = eINSTANCE.getDCLKnowledge();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLSensorImpl <em>DCL Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLSensorImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLSensor()
     * @generated
     */
    EClass DCL_SENSOR = eINSTANCE.getDCLSensor();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLEffectorImpl <em>DCL Effector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLEffectorImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLEffector()
     * @generated
     */
    EClass DCL_EFFECTOR = eINSTANCE.getDCLEffector();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLProbeImpl <em>DCL Probe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLProbeImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLProbe()
     * @generated
     */
    EClass DCL_PROBE = eINSTANCE.getDCLProbe();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLGaugeImpl <em>DCL Gauge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLGaugeImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLGauge()
     * @generated
     */
    EClass DCL_GAUGE = eINSTANCE.getDCLGauge();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLReferenceInputImpl <em>DCL Reference Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLReferenceInputImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLReferenceInput()
     * @generated
     */
    EClass DCL_REFERENCE_INPUT = eINSTANCE.getDCLReferenceInput();

    /**
     * The meta object literal for the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMeasuredOutputImpl <em>DCL Measured Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DCLMeasuredOutputImpl
     * @see br.ufscar.sas.xtext.sasdsl.sasDsl.impl.SasDslPackageImpl#getDCLMeasuredOutput()
     * @generated
     */
    EClass DCL_MEASURED_OUTPUT = eINSTANCE.getDCLMeasuredOutput();

  }

} //SasDslPackage
