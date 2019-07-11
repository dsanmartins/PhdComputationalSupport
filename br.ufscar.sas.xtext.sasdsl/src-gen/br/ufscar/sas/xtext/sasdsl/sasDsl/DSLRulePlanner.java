/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Rule Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getPlanner <em>Planner</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getKnowledgeinterface <em>Knowledgeinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getAnalyzerinterface <em>Analyzerinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getExecutor <em>Executor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getExecutorinterface <em>Executorinterface</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner()
 * @model
 * @generated
 */
public interface DSLRulePlanner extends DSLRules
{
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner_Planner()
   * @model
   * @generated
   */
  DSLPlanner getPlanner();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getPlanner <em>Planner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Planner</em>' reference.
   * @see #getPlanner()
   * @generated
   */
  void setPlanner(DSLPlanner value);

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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner_Knowledge()
   * @model
   * @generated
   */
  DSLKnowledge getKnowledge();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getKnowledge <em>Knowledge</em>}' reference.
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner_Knowledgeinterface()
   * @model
   * @generated
   */
  KnowledgeInterface getKnowledgeinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getKnowledgeinterface <em>Knowledgeinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledgeinterface</em>' reference.
   * @see #getKnowledgeinterface()
   * @generated
   */
  void setKnowledgeinterface(KnowledgeInterface value);

  /**
   * Returns the value of the '<em><b>Analyzer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Analyzer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Analyzer</em>' reference.
   * @see #setAnalyzer(DSLAnalyzer)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner_Analyzer()
   * @model
   * @generated
   */
  DSLAnalyzer getAnalyzer();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getAnalyzer <em>Analyzer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analyzer</em>' reference.
   * @see #getAnalyzer()
   * @generated
   */
  void setAnalyzer(DSLAnalyzer value);

  /**
   * Returns the value of the '<em><b>Analyzerinterface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Analyzerinterface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Analyzerinterface</em>' reference.
   * @see #setAnalyzerinterface(AnalyzerInterface)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner_Analyzerinterface()
   * @model
   * @generated
   */
  AnalyzerInterface getAnalyzerinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getAnalyzerinterface <em>Analyzerinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analyzerinterface</em>' reference.
   * @see #getAnalyzerinterface()
   * @generated
   */
  void setAnalyzerinterface(AnalyzerInterface value);

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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner_Executor()
   * @model
   * @generated
   */
  DSLExecutor getExecutor();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getExecutor <em>Executor</em>}' reference.
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRulePlanner_Executorinterface()
   * @model
   * @generated
   */
  ExecutorInterface getExecutorinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRulePlanner#getExecutorinterface <em>Executorinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Executorinterface</em>' reference.
   * @see #getExecutorinterface()
   * @generated
   */
  void setExecutorinterface(ExecutorInterface value);

} // DSLRulePlanner
