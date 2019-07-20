/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLExecutor;
import br.ufscar.sas.xtext.sasdsl.sasDsl.ExecutorInterface;
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
 * An implementation of the model object '<em><b>DSL Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLExecutorImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLExecutorImpl#getExecutorinterfaces <em>Executorinterfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLExecutorImpl extends MinimalEObjectImpl.Container implements DSLExecutor
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
   * The cached value of the '{@link #getExecutorinterfaces() <em>Executorinterfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutorinterfaces()
   * @generated
   * @ordered
   */
  protected EList<ExecutorInterface> executorinterfaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLExecutorImpl()
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
    return SasDslPackage.Literals.DSL_EXECUTOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_EXECUTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExecutorInterface> getExecutorinterfaces()
  {
    if (executorinterfaces == null)
    {
      executorinterfaces = new EObjectContainmentEList<ExecutorInterface>(ExecutorInterface.class, this, SasDslPackage.DSL_EXECUTOR__EXECUTORINTERFACES);
    }
    return executorinterfaces;
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
      case SasDslPackage.DSL_EXECUTOR__EXECUTORINTERFACES:
        return ((InternalEList<?>)getExecutorinterfaces()).basicRemove(otherEnd, msgs);
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
      case SasDslPackage.DSL_EXECUTOR__NAME:
        return getName();
      case SasDslPackage.DSL_EXECUTOR__EXECUTORINTERFACES:
        return getExecutorinterfaces();
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
      case SasDslPackage.DSL_EXECUTOR__NAME:
        setName((String)newValue);
        return;
      case SasDslPackage.DSL_EXECUTOR__EXECUTORINTERFACES:
        getExecutorinterfaces().clear();
        getExecutorinterfaces().addAll((Collection<? extends ExecutorInterface>)newValue);
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
      case SasDslPackage.DSL_EXECUTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SasDslPackage.DSL_EXECUTOR__EXECUTORINTERFACES:
        getExecutorinterfaces().clear();
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
      case SasDslPackage.DSL_EXECUTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SasDslPackage.DSL_EXECUTOR__EXECUTORINTERFACES:
        return executorinterfaces != null && !executorinterfaces.isEmpty();
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

} //DSLExecutorImpl
