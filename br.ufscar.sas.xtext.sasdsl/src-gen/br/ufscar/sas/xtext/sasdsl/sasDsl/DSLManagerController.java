/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Manager Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManagerController#getName <em>Name</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManagerController#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLManagerController()
 * @model
 * @generated
 */
public interface DSLManagerController extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLManagerController_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLManagerController#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLController}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLManagerController_Controller()
   * @model containment="true"
   * @generated
   */
  EList<DSLController> getController();

} // DSLManagerController