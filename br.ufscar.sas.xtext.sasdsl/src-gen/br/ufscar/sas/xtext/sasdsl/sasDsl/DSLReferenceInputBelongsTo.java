/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Reference Input Belongs To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInputBelongsTo#getReference <em>Reference</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInputBelongsTo#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLReferenceInputBelongsTo()
 * @model
 * @generated
 */
public interface DSLReferenceInputBelongsTo extends DSLComposition
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(DSLReferenceInput)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLReferenceInputBelongsTo_Reference()
   * @model
   * @generated
   */
  DSLReferenceInput getReference();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInputBelongsTo#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(DSLReferenceInput value);

  /**
   * Returns the value of the '<em><b>Knowledge</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledge</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge</em>' reference.
   * @see #setKnowledge(DSLKnowledge)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLReferenceInputBelongsTo_Knowledge()
   * @model
   * @generated
   */
  DSLKnowledge getKnowledge();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLReferenceInputBelongsTo#getKnowledge <em>Knowledge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge</em>' reference.
   * @see #getKnowledge()
   * @generated
   */
  void setKnowledge(DSLKnowledge value);

} // DSLReferenceInputBelongsTo
