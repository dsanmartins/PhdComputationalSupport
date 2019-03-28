/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzer;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAnalyzerBelongsTo1;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoop;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Analyzer Belongs To1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLAnalyzerBelongsTo1Impl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLAnalyzerBelongsTo1Impl#getCl <em>Cl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLAnalyzerBelongsTo1Impl extends DSLCompositionImpl implements DSLAnalyzerBelongsTo1
{
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
   * The cached value of the '{@link #getCl() <em>Cl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCl()
   * @generated
   * @ordered
   */
  protected DSLControlLoop cl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLAnalyzerBelongsTo1Impl()
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
    return SasDslPackage.Literals.DSL_ANALYZER_BELONGS_TO1;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_ANALYZER_BELONGS_TO1__ANALYZER, oldAnalyzer, analyzer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_ANALYZER_BELONGS_TO1__ANALYZER, oldAnalyzer, analyzer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLControlLoop getCl()
  {
    if (cl != null && cl.eIsProxy())
    {
      InternalEObject oldCl = (InternalEObject)cl;
      cl = (DSLControlLoop)eResolveProxy(oldCl);
      if (cl != oldCl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_ANALYZER_BELONGS_TO1__CL, oldCl, cl));
      }
    }
    return cl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLControlLoop basicGetCl()
  {
    return cl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCl(DSLControlLoop newCl)
  {
    DSLControlLoop oldCl = cl;
    cl = newCl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_ANALYZER_BELONGS_TO1__CL, oldCl, cl));
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
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__ANALYZER:
        if (resolve) return getAnalyzer();
        return basicGetAnalyzer();
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__CL:
        if (resolve) return getCl();
        return basicGetCl();
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
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__ANALYZER:
        setAnalyzer((DSLAnalyzer)newValue);
        return;
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__CL:
        setCl((DSLControlLoop)newValue);
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
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__ANALYZER:
        setAnalyzer((DSLAnalyzer)null);
        return;
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__CL:
        setCl((DSLControlLoop)null);
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
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__ANALYZER:
        return analyzer != null;
      case SasDslPackage.DSL_ANALYZER_BELONGS_TO1__CL:
        return cl != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLAnalyzerBelongsTo1Impl
