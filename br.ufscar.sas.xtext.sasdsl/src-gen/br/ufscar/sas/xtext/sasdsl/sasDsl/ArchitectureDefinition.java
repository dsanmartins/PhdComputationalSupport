/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getAbstractions <em>Abstractions</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.ArchitectureDefinition#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition()
 * @model
 * @generated
 */
public interface ArchitectureDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstractions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLAbstraction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstractions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstractions</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_Abstractions()
   * @model containment="true"
   * @generated
   */
  EList<DSLAbstraction> getAbstractions();

  /**
   * Returns the value of the '<em><b>Compositions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLComposition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compositions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compositions</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_Compositions()
   * @model containment="true"
   * @generated
   */
  EList<DSLComposition> getCompositions();

  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestriction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' containment reference list.
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getArchitectureDefinition_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<DSLRestriction> getRestrictions();

} // ArchitectureDefinition
