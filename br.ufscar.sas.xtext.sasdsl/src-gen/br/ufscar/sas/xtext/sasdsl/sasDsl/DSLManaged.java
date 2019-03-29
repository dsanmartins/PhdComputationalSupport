/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Managed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManaged#getManagedinterfaces <em>Managedinterfaces</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLManaged()
 * @model
 * @generated
 */
public interface DSLManaged extends DSLAbstraction
{
  /**
   * Returns the value of the '<em><b>Managedinterfaces</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.ManagedInterface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Managedinterfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managedinterfaces</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLManaged_Managedinterfaces()
   * @model containment="true"
   * @generated
   */
  EList<ManagedInterface> getManagedinterfaces();

} // DSLManaged
