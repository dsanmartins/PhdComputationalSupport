/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Measured Ouput Belongs To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOuputBelongsTo#getMeasured <em>Measured</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOuputBelongsTo#getManaged <em>Managed</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLMeasuredOuputBelongsTo()
 * @model
 * @generated
 */
public interface DSLMeasuredOuputBelongsTo extends DSLComposition
{
  /**
   * Returns the value of the '<em><b>Measured</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measured</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measured</em>' reference.
   * @see #setMeasured(DSLMeasuredOutput)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLMeasuredOuputBelongsTo_Measured()
   * @model
   * @generated
   */
  DSLMeasuredOutput getMeasured();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOuputBelongsTo#getMeasured <em>Measured</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measured</em>' reference.
   * @see #getMeasured()
   * @generated
   */
  void setMeasured(DSLMeasuredOutput value);

  /**
   * Returns the value of the '<em><b>Managed</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Managed</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managed</em>' reference.
   * @see #setManaged(DSLManaged)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLMeasuredOuputBelongsTo_Managed()
   * @model
   * @generated
   */
  DSLManaged getManaged();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLMeasuredOuputBelongsTo#getManaged <em>Managed</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Managed</em>' reference.
   * @see #getManaged()
   * @generated
   */
  void setManaged(DSLManaged value);

} // DSLMeasuredOuputBelongsTo
