/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Control Loop Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLControlLoopManager#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLControlLoopManager()
 * @model
 * @generated
 */
public interface DSLControlLoopManager extends DSLAbstraction
{
  /**
   * Returns the value of the '<em><b>Interface</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' attribute list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLControlLoopManager_Interface()
   * @model unique="false"
   * @generated
   */
  EList<String> getInterface();

} // DSLControlLoopManager
