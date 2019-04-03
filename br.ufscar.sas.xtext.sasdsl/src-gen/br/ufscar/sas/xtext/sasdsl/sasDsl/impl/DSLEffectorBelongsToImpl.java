/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffector;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLEffectorBelongsTo;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Effector Belongs To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLEffectorBelongsToImpl#getEffector <em>Effector</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLEffectorBelongsToImpl#getManaged <em>Managed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLEffectorBelongsToImpl extends DSLCompositionImpl implements DSLEffectorBelongsTo
{
  /**
   * The cached value of the '{@link #getEffector() <em>Effector</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffector()
   * @generated
   * @ordered
   */
  protected DSLEffector effector;

  /**
   * The cached value of the '{@link #getManaged() <em>Managed</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManaged()
   * @generated
   * @ordered
   */
  protected DSLManaged managed;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLEffectorBelongsToImpl()
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
    return SasDslPackage.Literals.DSL_EFFECTOR_BELONGS_TO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEffector getEffector()
  {
    if (effector != null && effector.eIsProxy())
    {
      InternalEObject oldEffector = (InternalEObject)effector;
      effector = (DSLEffector)eResolveProxy(oldEffector);
      if (effector != oldEffector)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_EFFECTOR_BELONGS_TO__EFFECTOR, oldEffector, effector));
      }
    }
    return effector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEffector basicGetEffector()
  {
    return effector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffector(DSLEffector newEffector)
  {
    DSLEffector oldEffector = effector;
    effector = newEffector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_EFFECTOR_BELONGS_TO__EFFECTOR, oldEffector, effector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManaged getManaged()
  {
    if (managed != null && managed.eIsProxy())
    {
      InternalEObject oldManaged = (InternalEObject)managed;
      managed = (DSLManaged)eResolveProxy(oldManaged);
      if (managed != oldManaged)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_EFFECTOR_BELONGS_TO__MANAGED, oldManaged, managed));
      }
    }
    return managed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManaged basicGetManaged()
  {
    return managed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManaged(DSLManaged newManaged)
  {
    DSLManaged oldManaged = managed;
    managed = newManaged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_EFFECTOR_BELONGS_TO__MANAGED, oldManaged, managed));
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
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__EFFECTOR:
        if (resolve) return getEffector();
        return basicGetEffector();
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__MANAGED:
        if (resolve) return getManaged();
        return basicGetManaged();
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
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__EFFECTOR:
        setEffector((DSLEffector)newValue);
        return;
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__MANAGED:
        setManaged((DSLManaged)newValue);
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
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__EFFECTOR:
        setEffector((DSLEffector)null);
        return;
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__MANAGED:
        setManaged((DSLManaged)null);
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
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__EFFECTOR:
        return effector != null;
      case SasDslPackage.DSL_EFFECTOR_BELONGS_TO__MANAGED:
        return managed != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLEffectorBelongsToImpl
