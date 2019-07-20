/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.ControllerInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLController;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMonitor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLPlanner;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLControllerImpl#getControllerinterfaces <em>Controllerinterfaces</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLControllerImpl#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLControllerImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLControllerImpl#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLControllerImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLControllerImpl#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLControllerImpl extends MinimalEObjectImpl.Container implements DSLController
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getControllerinterfaces() <em>Controllerinterfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControllerinterfaces()
   * @generated
   * @ordered
   */
  protected EList<ControllerInterface> controllerinterfaces;

  /**
   * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitor()
   * @generated
   * @ordered
   */
  protected EList<DSLMonitor> monitor;

  /**
   * The cached value of the '{@link #getAnalyzer() <em>Analyzer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalyzer()
   * @generated
   * @ordered
   */
  protected EList<DSLAnalyzer> analyzer;

  /**
   * The cached value of the '{@link #getPlanner() <em>Planner</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanner()
   * @generated
   * @ordered
   */
  protected EList<DSLPlanner> planner;

  /**
   * The cached value of the '{@link #getExecutor() <em>Executor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutor()
   * @generated
   * @ordered
   */
  protected EList<DSLExecutor> executor;

  /**
   * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledge()
   * @generated
   * @ordered
   */
  protected EList<DSLKnowledge> knowledge;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLControllerImpl()
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
    return SasDslPackage.Literals.DSL_CONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_CONTROLLER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ControllerInterface> getControllerinterfaces()
  {
    if (controllerinterfaces == null)
    {
      controllerinterfaces = new EObjectContainmentEList<ControllerInterface>(ControllerInterface.class, this, SasDslPackage.DSL_CONTROLLER__CONTROLLERINTERFACES);
    }
    return controllerinterfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLMonitor> getMonitor()
  {
    if (monitor == null)
    {
      monitor = new EObjectContainmentEList<DSLMonitor>(DSLMonitor.class, this, SasDslPackage.DSL_CONTROLLER__MONITOR);
    }
    return monitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLAnalyzer> getAnalyzer()
  {
    if (analyzer == null)
    {
      analyzer = new EObjectContainmentEList<DSLAnalyzer>(DSLAnalyzer.class, this, SasDslPackage.DSL_CONTROLLER__ANALYZER);
    }
    return analyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLPlanner> getPlanner()
  {
    if (planner == null)
    {
      planner = new EObjectContainmentEList<DSLPlanner>(DSLPlanner.class, this, SasDslPackage.DSL_CONTROLLER__PLANNER);
    }
    return planner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLExecutor> getExecutor()
  {
    if (executor == null)
    {
      executor = new EObjectContainmentEList<DSLExecutor>(DSLExecutor.class, this, SasDslPackage.DSL_CONTROLLER__EXECUTOR);
    }
    return executor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLKnowledge> getKnowledge()
  {
    if (knowledge == null)
    {
      knowledge = new EObjectContainmentEList<DSLKnowledge>(DSLKnowledge.class, this, SasDslPackage.DSL_CONTROLLER__KNOWLEDGE);
    }
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_CONTROLLER__CONTROLLERINTERFACES:
        return ((InternalEList<?>)getControllerinterfaces()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_CONTROLLER__MONITOR:
        return ((InternalEList<?>)getMonitor()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_CONTROLLER__ANALYZER:
        return ((InternalEList<?>)getAnalyzer()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_CONTROLLER__PLANNER:
        return ((InternalEList<?>)getPlanner()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_CONTROLLER__EXECUTOR:
        return ((InternalEList<?>)getExecutor()).basicRemove(otherEnd, msgs);
      case SasDslPackage.DSL_CONTROLLER__KNOWLEDGE:
        return ((InternalEList<?>)getKnowledge()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SasDslPackage.DSL_CONTROLLER__NAME:
        return getName();
      case SasDslPackage.DSL_CONTROLLER__CONTROLLERINTERFACES:
        return getControllerinterfaces();
      case SasDslPackage.DSL_CONTROLLER__MONITOR:
        return getMonitor();
      case SasDslPackage.DSL_CONTROLLER__ANALYZER:
        return getAnalyzer();
      case SasDslPackage.DSL_CONTROLLER__PLANNER:
        return getPlanner();
      case SasDslPackage.DSL_CONTROLLER__EXECUTOR:
        return getExecutor();
      case SasDslPackage.DSL_CONTROLLER__KNOWLEDGE:
        return getKnowledge();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SasDslPackage.DSL_CONTROLLER__NAME:
        setName((String)newValue);
        return;
      case SasDslPackage.DSL_CONTROLLER__CONTROLLERINTERFACES:
        getControllerinterfaces().clear();
        getControllerinterfaces().addAll((Collection<? extends ControllerInterface>)newValue);
        return;
      case SasDslPackage.DSL_CONTROLLER__MONITOR:
        getMonitor().clear();
        getMonitor().addAll((Collection<? extends DSLMonitor>)newValue);
        return;
      case SasDslPackage.DSL_CONTROLLER__ANALYZER:
        getAnalyzer().clear();
        getAnalyzer().addAll((Collection<? extends DSLAnalyzer>)newValue);
        return;
      case SasDslPackage.DSL_CONTROLLER__PLANNER:
        getPlanner().clear();
        getPlanner().addAll((Collection<? extends DSLPlanner>)newValue);
        return;
      case SasDslPackage.DSL_CONTROLLER__EXECUTOR:
        getExecutor().clear();
        getExecutor().addAll((Collection<? extends DSLExecutor>)newValue);
        return;
      case SasDslPackage.DSL_CONTROLLER__KNOWLEDGE:
        getKnowledge().clear();
        getKnowledge().addAll((Collection<? extends DSLKnowledge>)newValue);
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
      case SasDslPackage.DSL_CONTROLLER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SasDslPackage.DSL_CONTROLLER__CONTROLLERINTERFACES:
        getControllerinterfaces().clear();
        return;
      case SasDslPackage.DSL_CONTROLLER__MONITOR:
        getMonitor().clear();
        return;
      case SasDslPackage.DSL_CONTROLLER__ANALYZER:
        getAnalyzer().clear();
        return;
      case SasDslPackage.DSL_CONTROLLER__PLANNER:
        getPlanner().clear();
        return;
      case SasDslPackage.DSL_CONTROLLER__EXECUTOR:
        getExecutor().clear();
        return;
      case SasDslPackage.DSL_CONTROLLER__KNOWLEDGE:
        getKnowledge().clear();
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
      case SasDslPackage.DSL_CONTROLLER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SasDslPackage.DSL_CONTROLLER__CONTROLLERINTERFACES:
        return controllerinterfaces != null && !controllerinterfaces.isEmpty();
      case SasDslPackage.DSL_CONTROLLER__MONITOR:
        return monitor != null && !monitor.isEmpty();
      case SasDslPackage.DSL_CONTROLLER__ANALYZER:
        return analyzer != null && !analyzer.isEmpty();
      case SasDslPackage.DSL_CONTROLLER__PLANNER:
        return planner != null && !planner.isEmpty();
      case SasDslPackage.DSL_CONTROLLER__EXECUTOR:
        return executor != null && !executor.isEmpty();
      case SasDslPackage.DSL_CONTROLLER__KNOWLEDGE:
        return knowledge != null && !knowledge.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DSLControllerImpl
