/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaging;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionManaged;
import br.ufscar.sas.xtext.sasdsl.sasDsl.ManagedInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Restriction Managed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRestrictionManagedImpl#getT <em>T</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRestrictionManagedImpl#getManaged <em>Managed</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRestrictionManagedImpl#getManagedinterface <em>Managedinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRestrictionManagedImpl extends DSLRestrictionImpl implements DSLRestrictionManaged
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected DSLManaging t;

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
   * The cached value of the '{@link #getManagedinterface() <em>Managedinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManagedinterface()
   * @generated
   * @ordered
   */
  protected ManagedInterface managedinterface;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRestrictionManagedImpl()
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
    return SasDslPackage.Literals.DSL_RESTRICTION_MANAGED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManaging getT()
  {
    if (t != null && t.eIsProxy())
    {
      InternalEObject oldT = (InternalEObject)t;
      t = (DSLManaging)eResolveProxy(oldT);
      if (t != oldT)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RESTRICTION_MANAGED__T, oldT, t));
      }
    }
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLManaging basicGetT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(DSLManaging newT)
  {
    DSLManaging oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RESTRICTION_MANAGED__T, oldT, t));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGED, oldManaged, managed));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGED, oldManaged, managed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManagedInterface getManagedinterface()
  {
    if (managedinterface != null && managedinterface.eIsProxy())
    {
      InternalEObject oldManagedinterface = (InternalEObject)managedinterface;
      managedinterface = (ManagedInterface)eResolveProxy(oldManagedinterface);
      if (managedinterface != oldManagedinterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGEDINTERFACE, oldManagedinterface, managedinterface));
      }
    }
    return managedinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManagedInterface basicGetManagedinterface()
  {
    return managedinterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManagedinterface(ManagedInterface newManagedinterface)
  {
    ManagedInterface oldManagedinterface = managedinterface;
    managedinterface = newManagedinterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGEDINTERFACE, oldManagedinterface, managedinterface));
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
      case SasDslPackage.DSL_RESTRICTION_MANAGED__T:
        if (resolve) return getT();
        return basicGetT();
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGED:
        if (resolve) return getManaged();
        return basicGetManaged();
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGEDINTERFACE:
        if (resolve) return getManagedinterface();
        return basicGetManagedinterface();
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
      case SasDslPackage.DSL_RESTRICTION_MANAGED__T:
        setT((DSLManaging)newValue);
        return;
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGED:
        setManaged((DSLManaged)newValue);
        return;
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGEDINTERFACE:
        setManagedinterface((ManagedInterface)newValue);
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
      case SasDslPackage.DSL_RESTRICTION_MANAGED__T:
        setT((DSLManaging)null);
        return;
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGED:
        setManaged((DSLManaged)null);
        return;
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGEDINTERFACE:
        setManagedinterface((ManagedInterface)null);
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
      case SasDslPackage.DSL_RESTRICTION_MANAGED__T:
        return t != null;
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGED:
        return managed != null;
      case SasDslPackage.DSL_RESTRICTION_MANAGED__MANAGEDINTERFACE:
        return managedinterface != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRestrictionManagedImpl