/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLGauge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.GaugeInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Gauge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLGaugeImpl#getGaugeinterfaces <em>Gaugeinterfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLGaugeImpl extends DSLAbstractionImpl implements DSLGauge
{
  /**
   * The cached value of the '{@link #getGaugeinterfaces() <em>Gaugeinterfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGaugeinterfaces()
   * @generated
   * @ordered
   */
  protected EList<GaugeInterface> gaugeinterfaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLGaugeImpl()
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
    return SasDslPackage.Literals.DSL_GAUGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GaugeInterface> getGaugeinterfaces()
  {
    if (gaugeinterfaces == null)
    {
      gaugeinterfaces = new EObjectContainmentEList<GaugeInterface>(GaugeInterface.class, this, SasDslPackage.DSL_GAUGE__GAUGEINTERFACES);
    }
    return gaugeinterfaces;
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
      case SasDslPackage.DSL_GAUGE__GAUGEINTERFACES:
        return ((InternalEList<?>)getGaugeinterfaces()).basicRemove(otherEnd, msgs);
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
      case SasDslPackage.DSL_GAUGE__GAUGEINTERFACES:
        return getGaugeinterfaces();
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
      case SasDslPackage.DSL_GAUGE__GAUGEINTERFACES:
        getGaugeinterfaces().clear();
        getGaugeinterfaces().addAll((Collection<? extends GaugeInterface>)newValue);
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
      case SasDslPackage.DSL_GAUGE__GAUGEINTERFACES:
        getGaugeinterfaces().clear();
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
      case SasDslPackage.DSL_GAUGE__GAUGEINTERFACES:
        return gaugeinterfaces != null && !gaugeinterfaces.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DSLGaugeImpl
