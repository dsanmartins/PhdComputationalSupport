/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Rule Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleControllerImpl#getController <em>Controller</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleControllerImpl#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleControllerImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleControllerImpl#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRuleControllerImpl#getExecutor <em>Executor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRuleControllerImpl extends DSLRulesImpl implements DSLRuleController
{
  /**
   * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected DSLController controller;

  /**
   * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitor()
   * @generated
   * @ordered
   */
  protected DSLMonitor monitor;

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
   * The cached value of the '{@link #getPlanner() <em>Planner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanner()
   * @generated
   * @ordered
   */
  protected DSLPlanner planner;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRuleControllerImpl()
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
    return SasDslPackage.Literals.DSL_RULE_CONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLController getController()
  {
    if (controller != null && controller.eIsProxy())
    {
      InternalEObject oldController = (InternalEObject)controller;
      controller = (DSLController)eResolveProxy(oldController);
      if (controller != oldController)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_CONTROLLER__CONTROLLER, oldController, controller));
      }
    }
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLController basicGetController()
  {
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setController(DSLController newController)
  {
    DSLController oldController = controller;
    controller = newController;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_CONTROLLER__CONTROLLER, oldController, controller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMonitor getMonitor()
  {
    if (monitor != null && monitor.eIsProxy())
    {
      InternalEObject oldMonitor = (InternalEObject)monitor;
      monitor = (DSLMonitor)eResolveProxy(oldMonitor);
      if (monitor != oldMonitor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_CONTROLLER__MONITOR, oldMonitor, monitor));
      }
    }
    return monitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLMonitor basicGetMonitor()
  {
    return monitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonitor(DSLMonitor newMonitor)
  {
    DSLMonitor oldMonitor = monitor;
    monitor = newMonitor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_CONTROLLER__MONITOR, oldMonitor, monitor));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_CONTROLLER__ANALYZER, oldAnalyzer, analyzer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_CONTROLLER__ANALYZER, oldAnalyzer, analyzer));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_CONTROLLER__PLANNER, oldPlanner, planner));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_CONTROLLER__PLANNER, oldPlanner, planner));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RULE_CONTROLLER__EXECUTOR, oldExecutor, executor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RULE_CONTROLLER__EXECUTOR, oldExecutor, executor));
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
      case SasDslPackage.DSL_RULE_CONTROLLER__CONTROLLER:
        if (resolve) return getController();
        return basicGetController();
      case SasDslPackage.DSL_RULE_CONTROLLER__MONITOR:
        if (resolve) return getMonitor();
        return basicGetMonitor();
      case SasDslPackage.DSL_RULE_CONTROLLER__ANALYZER:
        if (resolve) return getAnalyzer();
        return basicGetAnalyzer();
      case SasDslPackage.DSL_RULE_CONTROLLER__PLANNER:
        if (resolve) return getPlanner();
        return basicGetPlanner();
      case SasDslPackage.DSL_RULE_CONTROLLER__EXECUTOR:
        if (resolve) return getExecutor();
        return basicGetExecutor();
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
      case SasDslPackage.DSL_RULE_CONTROLLER__CONTROLLER:
        setController((DSLController)newValue);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__MONITOR:
        setMonitor((DSLMonitor)newValue);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__ANALYZER:
        setAnalyzer((DSLAnalyzer)newValue);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__PLANNER:
        setPlanner((DSLPlanner)newValue);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__EXECUTOR:
        setExecutor((DSLExecutor)newValue);
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
      case SasDslPackage.DSL_RULE_CONTROLLER__CONTROLLER:
        setController((DSLController)null);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__MONITOR:
        setMonitor((DSLMonitor)null);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__ANALYZER:
        setAnalyzer((DSLAnalyzer)null);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__PLANNER:
        setPlanner((DSLPlanner)null);
        return;
      case SasDslPackage.DSL_RULE_CONTROLLER__EXECUTOR:
        setExecutor((DSLExecutor)null);
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
      case SasDslPackage.DSL_RULE_CONTROLLER__CONTROLLER:
        return controller != null;
      case SasDslPackage.DSL_RULE_CONTROLLER__MONITOR:
        return monitor != null;
      case SasDslPackage.DSL_RULE_CONTROLLER__ANALYZER:
        return analyzer != null;
      case SasDslPackage.DSL_RULE_CONTROLLER__PLANNER:
        return planner != null;
      case SasDslPackage.DSL_RULE_CONTROLLER__EXECUTOR:
        return executor != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRuleControllerImpl
