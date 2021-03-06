/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Rule Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getEffector <em>Effector</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getEffectorinterface <em>Effectorinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getPlannerinterface <em>Plannerinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getKnowledgeinterface <em>Knowledgeinterface</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor()
 * @model
 * @generated
 */
public interface DSLRuleExecutor extends DSLRules
{
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor_Executor()
   * @model
   * @generated
   */
  DSLExecutor getExecutor();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getExecutor <em>Executor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Executor</em>' reference.
   * @see #getExecutor()
   * @generated
   */
  void setExecutor(DSLExecutor value);

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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor_Effector()
   * @model
   * @generated
   */
  DSLEffector getEffector();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getEffector <em>Effector</em>}' reference.
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor_Effectorinterface()
   * @model
   * @generated
   */
  EffectorInterface getEffectorinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getEffectorinterface <em>Effectorinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effectorinterface</em>' reference.
   * @see #getEffectorinterface()
   * @generated
   */
  void setEffectorinterface(EffectorInterface value);

  /**
   * Returns the value of the '<em><b>Planner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Planner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Planner</em>' reference.
   * @see #setPlanner(DSLPlanner)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor_Planner()
   * @model
   * @generated
   */
  DSLPlanner getPlanner();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getPlanner <em>Planner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Planner</em>' reference.
   * @see #getPlanner()
   * @generated
   */
  void setPlanner(DSLPlanner value);

  /**
   * Returns the value of the '<em><b>Plannerinterface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plannerinterface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plannerinterface</em>' reference.
   * @see #setPlannerinterface(PlannerInterface)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor_Plannerinterface()
   * @model
   * @generated
   */
  PlannerInterface getPlannerinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getPlannerinterface <em>Plannerinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plannerinterface</em>' reference.
   * @see #getPlannerinterface()
   * @generated
   */
  void setPlannerinterface(PlannerInterface value);

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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor_Knowledge()
   * @model
   * @generated
   */
  DSLKnowledge getKnowledge();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getKnowledge <em>Knowledge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge</em>' reference.
   * @see #getKnowledge()
   * @generated
   */
  void setKnowledge(DSLKnowledge value);

  /**
   * Returns the value of the '<em><b>Knowledgeinterface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledgeinterface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledgeinterface</em>' reference.
   * @see #setKnowledgeinterface(KnowledgeInterface)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleExecutor_Knowledgeinterface()
   * @model
   * @generated
   */
  KnowledgeInterface getKnowledgeinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleExecutor#getKnowledgeinterface <em>Knowledgeinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledgeinterface</em>' reference.
   * @see #getKnowledgeinterface()
   * @generated
   */
  void setKnowledgeinterface(KnowledgeInterface value);

} // DSLRuleExecutor
