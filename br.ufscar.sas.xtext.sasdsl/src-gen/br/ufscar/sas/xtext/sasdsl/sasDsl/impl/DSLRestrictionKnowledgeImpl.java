/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAbstraction;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionKnowledge;
import br.ufscar.sas.xtext.sasdsl.sasDsl.KnowledgeInterface;
import br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Restriction Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRestrictionKnowledgeImpl#getT <em>T</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRestrictionKnowledgeImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.impl.DSLRestrictionKnowledgeImpl#getKnowledgeinterface <em>Knowledgeinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSLRestrictionKnowledgeImpl extends DSLRestrictionImpl implements DSLRestrictionKnowledge
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected DSLAbstraction t;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLRestrictionKnowledgeImpl()
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
    return SasDslPackage.Literals.DSL_RESTRICTION_KNOWLEDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAbstraction getT()
  {
    if (t != null && t.eIsProxy())
    {
      InternalEObject oldT = (InternalEObject)t;
      t = (DSLAbstraction)eResolveProxy(oldT);
      if (t != oldT)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__T, oldT, t));
      }
    }
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAbstraction basicGetT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(DSLAbstraction newT)
  {
    DSLAbstraction oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__T, oldT, t));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGE, oldKnowledge, knowledge));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGE, oldKnowledge, knowledge));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGEINTERFACE, oldKnowledgeinterface, knowledgeinterface));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGEINTERFACE, oldKnowledgeinterface, knowledgeinterface));
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
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__T:
        if (resolve) return getT();
        return basicGetT();
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGE:
        if (resolve) return getKnowledge();
        return basicGetKnowledge();
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGEINTERFACE:
        if (resolve) return getKnowledgeinterface();
        return basicGetKnowledgeinterface();
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
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__T:
        setT((DSLAbstraction)newValue);
        return;
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGE:
        setKnowledge((DSLKnowledge)newValue);
        return;
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGEINTERFACE:
        setKnowledgeinterface((KnowledgeInterface)newValue);
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
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__T:
        setT((DSLAbstraction)null);
        return;
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGE:
        setKnowledge((DSLKnowledge)null);
        return;
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGEINTERFACE:
        setKnowledgeinterface((KnowledgeInterface)null);
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
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__T:
        return t != null;
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGE:
        return knowledge != null;
      case SasDslPackage.DSL_RESTRICTION_KNOWLEDGE__KNOWLEDGEINTERFACE:
        return knowledgeinterface != null;
    }
    return super.eIsSet(featureID);
  }

} //DSLRestrictionKnowledgeImpl