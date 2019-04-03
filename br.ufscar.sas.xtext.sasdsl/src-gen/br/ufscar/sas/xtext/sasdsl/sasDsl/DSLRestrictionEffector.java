/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Restriction Effector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionEffector#getT <em>T</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionEffector#getEffector <em>Effector</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionEffector#getEffectorinterface <em>Effectorinterface</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionEffector()
 * @model
 * @generated
 */
public interface DSLRestrictionEffector extends DSLRestriction
{
  /**
   * Returns the value of the '<em><b>T</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' reference.
   * @see #setT(DSLExecutor)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionEffector_T()
   * @model
   * @generated
   */
  DSLExecutor getT();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionEffector#getT <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' reference.
   * @see #getT()
   * @generated
   */
  void setT(DSLExecutor value);

  /**
   * Returns the value of the '<em><b>Effector</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effector</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effector</em>' reference.
   * @see #setEffector(DSLEffector)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionEffector_Effector()
   * @model
   * @generated
   */
  DSLEffector getEffector();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionEffector#getEffector <em>Effector</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effector</em>' reference.
   * @see #getEffector()
   * @generated
   */
  void setEffector(DSLEffector value);

  /**
   * Returns the value of the '<em><b>Effectorinterface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effectorinterface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effectorinterface</em>' reference.
   * @see #setEffectorinterface(EffectorInterface)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionEffector_Effectorinterface()
   * @model
   * @generated
   */
  EffectorInterface getEffectorinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionEffector#getEffectorinterface <em>Effectorinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effectorinterface</em>' reference.
   * @see #getEffectorinterface()
   * @generated
   */
  void setEffectorinterface(EffectorInterface value);

} // DSLRestrictionEffector