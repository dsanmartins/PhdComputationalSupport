/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.AnalyzerInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.ExecutorInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.KnowledgeInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Rule Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getKnowledgeinterface <em>Knowledgeinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getAnalyzerinterface <em>Analyzerinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRulePlannerImpl#getExecutorinterface <em>Executorinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRulePlannerImpl extends DSLRulesImpl implements DSLRulePlanner
{
  /**
   * The cached value of the '{@link #getPlanner() <em>Planner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanner()
   * @generated
   * @ordered
   */
  protected DSLPlanner planner;

  /**
   * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledge()
   * @generated
   * @ordered
   */
  protected DSLKnowledge knowledge;

  /**
   * The cached value of the '{@link #getKnowledgeinterface() <em>Knowledgeinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledgeinterface()
   * @generated
   * @ordered
   */
  protected KnowledgeInterface knowledgeinterface;

  /**
   * The cached value of the '{@link #getAnalyzer() <em>Analyzer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalyzer()
   * @generated
   * @ordered
   */
  protected DSLAnalyzer analyzer;

  /**
   * The cached value of the '{@link #getAnalyzerinterface() <em>Analyzerinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalyzerinterface()
   * @generated
   * @ordered
   */
  protected AnalyzerInterface analyzerinterface;

  /**
   * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutor()
   * @generated
   * @ordered
   */
  protected DSLExecutor executor;

  /**
   * The cached value of the '{@link #getExecutorinterface() <em>Executorinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutorinterface()
   * @generated
   * @ordered
   */
  protected ExecutorInterface executorinterface;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRulePlannerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SasDslPackage.Literals.DSL_RULE_PLANNER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPlanner getPlanner()
  {
    if (planner != null && planner.eIsProxy())
    {
      InternalEObject oldPlanner = (InternalEObject)planner;
      planner = (DSLPlanner)eResolveProxy(oldPlanner);
      if (planner != oldPlanner)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__PLANNER, oldPlanner, planner));
      }
    }
    return planner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPlanner basicGetPlanner()
  {
    return planner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlanner(DSLPlanner newPlanner)
  {
    DSLPlanner oldPlanner = planner;
    planner = newPlanner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__PLANNER, oldPlanner, planner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLKnowledge getKnowledge()
  {
    if (knowledge != null && knowledge.eIsProxy())
    {
      InternalEObject oldKnowledge = (InternalEObject)knowledge;
      knowledge = (DSLKnowledge)eResolveProxy(oldKnowledge);
      if (knowledge != oldKnowledge)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE, oldKnowledge, knowledge));
      }
    }
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLKnowledge basicGetKnowledge()
  {
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnowledge(DSLKnowledge newKnowledge)
  {
    DSLKnowledge oldKnowledge = knowledge;
    knowledge = newKnowledge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE, oldKnowledge, knowledge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnowledgeInterface getKnowledgeinterface()
  {
    if (knowledgeinterface != null && knowledgeinterface.eIsProxy())
    {
      InternalEObject oldKnowledgeinterface = (InternalEObject)knowledgeinterface;
      knowledgeinterface = (KnowledgeInterface)eResolveProxy(oldKnowledgeinterface);
      if (knowledgeinterface != oldKnowledgeinterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGEINTERFACE, oldKnowledgeinterface, knowledgeinterface));
      }
    }
    return knowledgeinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnowledgeInterface basicGetKnowledgeinterface()
  {
    return knowledgeinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnowledgeinterface(KnowledgeInterface newKnowledgeinterface)
  {
    KnowledgeInterface oldKnowledgeinterface = knowledgeinterface;
    knowledgeinterface = newKnowledgeinterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGEINTERFACE, oldKnowledgeinterface, knowledgeinterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAnalyzer getAnalyzer()
  {
    if (analyzer != null && analyzer.eIsProxy())
    {
      InternalEObject oldAnalyzer = (InternalEObject)analyzer;
      analyzer = (DSLAnalyzer)eResolveProxy(oldAnalyzer);
      if (analyzer != oldAnalyzer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__ANALYZER, oldAnalyzer, analyzer));
      }
    }
    return analyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAnalyzer basicGetAnalyzer()
  {
    return analyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnalyzer(DSLAnalyzer newAnalyzer)
  {
    DSLAnalyzer oldAnalyzer = analyzer;
    analyzer = newAnalyzer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__ANALYZER, oldAnalyzer, analyzer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalyzerInterface getAnalyzerinterface()
  {
    if (analyzerinterface != null && analyzerinterface.eIsProxy())
    {
      InternalEObject oldAnalyzerinterface = (InternalEObject)analyzerinterface;
      analyzerinterface = (AnalyzerInterface)eResolveProxy(oldAnalyzerinterface);
      if (analyzerinterface != oldAnalyzerinterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__ANALYZERINTERFACE, oldAnalyzerinterface, analyzerinterface));
      }
    }
    return analyzerinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalyzerInterface basicGetAnalyzerinterface()
  {
    return analyzerinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnalyzerinterface(AnalyzerInterface newAnalyzerinterface)
  {
    AnalyzerInterface oldAnalyzerinterface = analyzerinterface;
    analyzerinterface = newAnalyzerinterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__ANALYZERINTERFACE, oldAnalyzerinterface, analyzerinterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLExecutor getExecutor()
  {
    if (executor != null && executor.eIsProxy())
    {
      InternalEObject oldExecutor = (InternalEObject)executor;
      executor = (DSLExecutor)eResolveProxy(oldExecutor);
      if (executor != oldExecutor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__EXECUTOR, oldExecutor, executor));
      }
    }
    return executor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLExecutor basicGetExecutor()
  {
    return executor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecutor(DSLExecutor newExecutor)
  {
    DSLExecutor oldExecutor = executor;
    executor = newExecutor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__EXECUTOR, oldExecutor, executor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutorInterface getExecutorinterface()
  {
    if (executorinterface != null && executorinterface.eIsProxy())
    {
      InternalEObject oldExecutorinterface = (InternalEObject)executorinterface;
      executorinterface = (ExecutorInterface)eResolveProxy(oldExecutorinterface);
      if (executorinterface != oldExecutorinterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_PLANNER__EXECUTORINTERFACE, oldExecutorinterface, executorinterface));
      }
    }
    return executorinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutorInterface basicGetExecutorinterface()
  {
    return executorinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecutorinterface(ExecutorInterface newExecutorinterface)
  {
    ExecutorInterface oldExecutorinterface = executorinterface;
    executorinterface = newExecutorinterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_PLANNER__EXECUTORINTERFACE, oldExecutorinterface, executorinterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        if (resolve) return getPlanner();
        return basicGetPlanner();
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        if (resolve) return getKnowledge();
        return basicGetKnowledge();
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGEINTERFACE:
        if (resolve) return getKnowledgeinterface();
        return basicGetKnowledgeinterface();
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        if (resolve) return getAnalyzer();
        return basicGetAnalyzer();
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZERINTERFACE:
        if (resolve) return getAnalyzerinterface();
        return basicGetAnalyzerinterface();
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        if (resolve) return getExecutor();
        return basicGetExecutor();
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTORINTERFACE:
        if (resolve) return getExecutorinterface();
        return basicGetExecutorinterface();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        setPlanner((DSLPlanner)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        setKnowledge((DSLKnowledge)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGEINTERFACE:
        setKnowledgeinterface((KnowledgeInterface)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        setAnalyzer((DSLAnalyzer)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZERINTERFACE:
        setAnalyzerinterface((AnalyzerInterface)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        setExecutor((DSLExecutor)newValue);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTORINTERFACE:
        setExecutorinterface((ExecutorInterface)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        setPlanner((DSLPlanner)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        setKnowledge((DSLKnowledge)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGEINTERFACE:
        setKnowledgeinterface((KnowledgeInterface)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        setAnalyzer((DSLAnalyzer)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZERINTERFACE:
        setAnalyzerinterface((AnalyzerInterface)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        setExecutor((DSLExecutor)null);
        return;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTORINTERFACE:
        setExecutorinterface((ExecutorInterface)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_RULE_PLANNER__PLANNER:
        return planner != null;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGE:
        return knowledge != null;
      case SasDslPackage.DSL_RULE_PLANNER__KNOWLEDGEINTERFACE:
        return knowledgeinterface != null;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZER:
        return analyzer != null;
      case SasDslPackage.DSL_RULE_PLANNER__ANALYZERINTERFACE:
        return analyzerinterface != null;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTOR:
        return executor != null;
      case SasDslPackage.DSL_RULE_PLANNER__EXECUTORINTERFACE:
        return executorinterface != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRulePlannerImpl
