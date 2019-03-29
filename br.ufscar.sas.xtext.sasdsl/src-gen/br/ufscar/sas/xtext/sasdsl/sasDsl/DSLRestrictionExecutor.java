/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Restriction Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionExecutor#getT <em>T</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionExecutor#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionExecutor#getExecutorinterface <em>Executorinterface</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionExecutor()
 * @model
 * @generated
 */
public interface DSLRestrictionExecutor extends DSLRestriction
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
   * @see #setT(DSLAnalyzer)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionExecutor_T()
   * @model
   * @generated
   */
  DSLAnalyzer getT();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionExecutor#getT <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' reference.
   * @see #getT()
   * @generated
   */
  void setT(DSLAnalyzer value);

  /**
   * Returns the value of the '<em><b>Executor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Executor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executor</em>' reference.
   * @see #setExecutor(DSLExecutor)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionExecutor_Executor()
   * @model
   * @generated
   */
  DSLExecutor getExecutor();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionExecutor#getExecutor <em>Executor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Executor</em>' reference.
   * @see #getExecutor()
   * @generated
   */
  void setExecutor(DSLExecutor value);

  /**
   * Returns the value of the '<em><b>Executorinterface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Executorinterface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executorinterface</em>' reference.
   * @see #setExecutorinterface(ExecutorInterface)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRestrictionExecutor_Executorinterface()
   * @model
   * @generated
   */
  ExecutorInterface getExecutorinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRestrictionExecutor#getExecutorinterface <em>Executorinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Executorinterface</em>' reference.
   * @see #getExecutorinterface()
   * @generated
   */
  void setExecutorinterface(ExecutorInterface value);

} // DSLRestrictionExecutor
