/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Control Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoop#getSubSystem <em>Sub System</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLControlLoop()
 * @model
 * @generated
 */
public interface DSLControlLoop extends DSLAbstractions, DSLContainerForMAPE
{
  /**
   * Returns the value of the '<em><b>Sub System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub System</em>' reference.
   * @see #setSubSystem(DSLContainrerForCL)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLControlLoop_SubSystem()
   * @model
   * @generated
   */
  DSLContainrerForCL getSubSystem();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoop#getSubSystem <em>Sub System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub System</em>' reference.
   * @see #getSubSystem()
   * @generated
   */
  void setSubSystem(DSLContainrerForCL value);

} // DSLControlLoop