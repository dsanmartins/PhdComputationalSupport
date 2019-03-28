/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.util;

import br.ufscar.sas.xtext.sasdsl.sasDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage
 * @generated
 */
public class SasDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SasDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SasDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SasDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SasDslSwitch<Adapter> modelSwitch =
    new SasDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseArchitectureDefinition(ArchitectureDefinition object)
      {
        return createArchitectureDefinitionAdapter();
      }
      @Override
      public Adapter caseDSLAbstraction(DSLAbstraction object)
      {
        return createDSLAbstractionAdapter();
      }
      @Override
      public Adapter caseDSLComposition(DSLComposition object)
      {
        return createDSLCompositionAdapter();
      }
      @Override
      public Adapter caseDSLRestriction(DSLRestriction object)
      {
        return createDSLRestrictionAdapter();
      }
      @Override
      public Adapter caseDSLSensorBelongsTo(DSLSensorBelongsTo object)
      {
        return createDSLSensorBelongsToAdapter();
      }
      @Override
      public Adapter caseDSLReferenceInputBelongsTo(DSLReferenceInputBelongsTo object)
      {
        return createDSLReferenceInputBelongsToAdapter();
      }
      @Override
      public Adapter caseDSLEffectorBelongsTo(DSLEffectorBelongsTo object)
      {
        return createDSLEffectorBelongsToAdapter();
      }
      @Override
      public Adapter caseDSLMonitorBelongsTo1(DSLMonitorBelongsTo1 object)
      {
        return createDSLMonitorBelongsTo1Adapter();
      }
      @Override
      public Adapter caseDSLMonitorBelongsTo2(DSLMonitorBelongsTo2 object)
      {
        return createDSLMonitorBelongsTo2Adapter();
      }
      @Override
      public Adapter caseDSLAnalyzerBelongsTo1(DSLAnalyzerBelongsTo1 object)
      {
        return createDSLAnalyzerBelongsTo1Adapter();
      }
      @Override
      public Adapter caseDSLAnalyzerBelongsTo2(DSLAnalyzerBelongsTo2 object)
      {
        return createDSLAnalyzerBelongsTo2Adapter();
      }
      @Override
      public Adapter caseDSLPlannerBelongsTo1(DSLPlannerBelongsTo1 object)
      {
        return createDSLPlannerBelongsTo1Adapter();
      }
      @Override
      public Adapter caseDSLPlannerBelongsTo2(DSLPlannerBelongsTo2 object)
      {
        return createDSLPlannerBelongsTo2Adapter();
      }
      @Override
      public Adapter caseDSLExecutorBelongsTo1(DSLExecutorBelongsTo1 object)
      {
        return createDSLExecutorBelongsTo1Adapter();
      }
      @Override
      public Adapter caseDSLExecutorBelongsTo2(DSLExecutorBelongsTo2 object)
      {
        return createDSLExecutorBelongsTo2Adapter();
      }
      @Override
      public Adapter caseDSLClBelongsTo1(DSLClBelongsTo1 object)
      {
        return createDSLClBelongsTo1Adapter();
      }
      @Override
      public Adapter caseDSLClBelongsTo2(DSLClBelongsTo2 object)
      {
        return createDSLClBelongsTo2Adapter();
      }
      @Override
      public Adapter caseDSLClmBelongsTo(DSLClmBelongsTo object)
      {
        return createDSLClmBelongsToAdapter();
      }
      @Override
      public Adapter caseDSLMeasuredOuputBelongsTo(DSLMeasuredOuputBelongsTo object)
      {
        return createDSLMeasuredOuputBelongsToAdapter();
      }
      @Override
      public Adapter caseDSLGaugeBelongsTo(DSLGaugeBelongsTo object)
      {
        return createDSLGaugeBelongsToAdapter();
      }
      @Override
      public Adapter caseDSLProbeBelongsTo(DSLProbeBelongsTo object)
      {
        return createDSLProbeBelongsToAdapter();
      }
      @Override
      public Adapter caseDSLManaging(DSLManaging object)
      {
        return createDSLManagingAdapter();
      }
      @Override
      public Adapter caseDSLManaged(DSLManaged object)
      {
        return createDSLManagedAdapter();
      }
      @Override
      public Adapter caseDSLControlLoopManager(DSLControlLoopManager object)
      {
        return createDSLControlLoopManagerAdapter();
      }
      @Override
      public Adapter caseDSLControlLoop(DSLControlLoop object)
      {
        return createDSLControlLoopAdapter();
      }
      @Override
      public Adapter caseDSLMonitor(DSLMonitor object)
      {
        return createDSLMonitorAdapter();
      }
      @Override
      public Adapter caseDSLAnalyzer(DSLAnalyzer object)
      {
        return createDSLAnalyzerAdapter();
      }
      @Override
      public Adapter caseDSLPlanner(DSLPlanner object)
      {
        return createDSLPlannerAdapter();
      }
      @Override
      public Adapter caseDSLExecutor(DSLExecutor object)
      {
        return createDSLExecutorAdapter();
      }
      @Override
      public Adapter caseDSLKnowledge(DSLKnowledge object)
      {
        return createDSLKnowledgeAdapter();
      }
      @Override
      public Adapter caseDSLSensor(DSLSensor object)
      {
        return createDSLSensorAdapter();
      }
      @Override
      public Adapter caseDSLEffector(DSLEffector object)
      {
        return createDSLEffectorAdapter();
      }
      @Override
      public Adapter caseDSLProbe(DSLProbe object)
      {
        return createDSLProbeAdapter();
      }
      @Override
      public Adapter caseDSLGauge(DSLGauge object)
      {
        return createDSLGaugeAdapter();
      }
      @Override
      public Adapter caseDSLReferenceInput(DSLReferenceInput object)
      {
        return createDSLReferenceInputAdapter();
      }
      @Override
      public Adapter caseDSLMeasuredOutput(DSLMeasuredOutput object)
      {
        return createDSLMeasuredOutputAdapter();
      }
      @Override
      public Adapter caseOnly(Only object)
      {
        return createOnlyAdapter();
      }
      @Override
      public Adapter caseCan(Can object)
      {
        return createCanAdapter();
      }
      @Override
      public Adapter caseCannot(Cannot object)
      {
        return createCannotAdapter();
      }
      @Override
      public Adapter caseOnly2(Only2 object)
      {
        return createOnly2Adapter();
      }
      @Override
      public Adapter caseMust(Must object)
      {
        return createMustAdapter();
      }
      @Override
      public Adapter caseElementType(ElementType object)
      {
        return createElementTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseEntityType(EntityType object)
      {
        return createEntityTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition
   * @generated
   */
  public Adapter createArchitectureDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAbstraction <em>DSL Abstraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAbstraction
   * @generated
   */
  public Adapter createDSLAbstractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLComposition <em>DSL Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLComposition
   * @generated
   */
  public Adapter createDSLCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestriction <em>DSL Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestriction
   * @generated
   */
  public Adapter createDSLRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLSensorBelongsTo <em>DSL Sensor Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLSensorBelongsTo
   * @generated
   */
  public Adapter createDSLSensorBelongsToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInputBelongsTo <em>DSL Reference Input Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInputBelongsTo
   * @generated
   */
  public Adapter createDSLReferenceInputBelongsToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffectorBelongsTo <em>DSL Effector Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffectorBelongsTo
   * @generated
   */
  public Adapter createDSLEffectorBelongsToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitorBelongsTo1 <em>DSL Monitor Belongs To1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitorBelongsTo1
   * @generated
   */
  public Adapter createDSLMonitorBelongsTo1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitorBelongsTo2 <em>DSL Monitor Belongs To2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitorBelongsTo2
   * @generated
   */
  public Adapter createDSLMonitorBelongsTo2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzerBelongsTo1 <em>DSL Analyzer Belongs To1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzerBelongsTo1
   * @generated
   */
  public Adapter createDSLAnalyzerBelongsTo1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzerBelongsTo2 <em>DSL Analyzer Belongs To2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzerBelongsTo2
   * @generated
   */
  public Adapter createDSLAnalyzerBelongsTo2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlannerBelongsTo1 <em>DSL Planner Belongs To1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlannerBelongsTo1
   * @generated
   */
  public Adapter createDSLPlannerBelongsTo1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlannerBelongsTo2 <em>DSL Planner Belongs To2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlannerBelongsTo2
   * @generated
   */
  public Adapter createDSLPlannerBelongsTo2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutorBelongsTo1 <em>DSL Executor Belongs To1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutorBelongsTo1
   * @generated
   */
  public Adapter createDSLExecutorBelongsTo1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutorBelongsTo2 <em>DSL Executor Belongs To2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutorBelongsTo2
   * @generated
   */
  public Adapter createDSLExecutorBelongsTo2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLClBelongsTo1 <em>DSL Cl Belongs To1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLClBelongsTo1
   * @generated
   */
  public Adapter createDSLClBelongsTo1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLClBelongsTo2 <em>DSL Cl Belongs To2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLClBelongsTo2
   * @generated
   */
  public Adapter createDSLClBelongsTo2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLClmBelongsTo <em>DSL Clm Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLClmBelongsTo
   * @generated
   */
  public Adapter createDSLClmBelongsToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOuputBelongsTo <em>DSL Measured Ouput Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOuputBelongsTo
   * @generated
   */
  public Adapter createDSLMeasuredOuputBelongsToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLGaugeBelongsTo <em>DSL Gauge Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLGaugeBelongsTo
   * @generated
   */
  public Adapter createDSLGaugeBelongsToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLProbeBelongsTo <em>DSL Probe Belongs To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLProbeBelongsTo
   * @generated
   */
  public Adapter createDSLProbeBelongsToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaging <em>DSL Managing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaging
   * @generated
   */
  public Adapter createDSLManagingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged <em>DSL Managed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged
   * @generated
   */
  public Adapter createDSLManagedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoopManager <em>DSL Control Loop Manager</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoopManager
   * @generated
   */
  public Adapter createDSLControlLoopManagerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoop <em>DSL Control Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoop
   * @generated
   */
  public Adapter createDSLControlLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitor <em>DSL Monitor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitor
   * @generated
   */
  public Adapter createDSLMonitorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer <em>DSL Analyzer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer
   * @generated
   */
  public Adapter createDSLAnalyzerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner <em>DSL Planner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner
   * @generated
   */
  public Adapter createDSLPlannerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor <em>DSL Executor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor
   * @generated
   */
  public Adapter createDSLExecutorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge <em>DSL Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge
   * @generated
   */
  public Adapter createDSLKnowledgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLSensor <em>DSL Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLSensor
   * @generated
   */
  public Adapter createDSLSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffector <em>DSL Effector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffector
   * @generated
   */
  public Adapter createDSLEffectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLProbe <em>DSL Probe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLProbe
   * @generated
   */
  public Adapter createDSLProbeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLGauge <em>DSL Gauge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLGauge
   * @generated
   */
  public Adapter createDSLGaugeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInput <em>DSL Reference Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInput
   * @generated
   */
  public Adapter createDSLReferenceInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOutput <em>DSL Measured Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOutput
   * @generated
   */
  public Adapter createDSLMeasuredOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.Only <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.Only
   * @generated
   */
  public Adapter createOnlyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.Can <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.Can
   * @generated
   */
  public Adapter createCanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.Cannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.Cannot
   * @generated
   */
  public Adapter createCannotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.Only2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.Only2
   * @generated
   */
  public Adapter createOnly2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.Must <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.Must
   * @generated
   */
  public Adapter createMustAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.ElementType
   * @generated
   */
  public Adapter createElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.EntityType
   * @generated
   */
  public Adapter createEntityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SasDslAdapterFactory
