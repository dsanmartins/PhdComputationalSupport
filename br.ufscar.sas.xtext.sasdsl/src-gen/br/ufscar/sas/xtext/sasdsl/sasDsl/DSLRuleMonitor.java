/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Rule Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getSensor <em>Sensor</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getSensorinterface <em>Sensorinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getKnowledgeinterface <em>Knowledgeinterface</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getAnalyzerinterface <em>Analyzerinterface</em>}</li>
 * </ul>
 *
 * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor()
 * @model
 * @generated
 */
public interface DSLRuleMonitor extends DSLRules
{
  /**
   * Returns the value of the '<em><b>Monitor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monitor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monitor</em>' reference.
   * @see #setMonitor(DSLMonitor)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor_Monitor()
   * @model
   * @generated
   */
  DSLMonitor getMonitor();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getMonitor <em>Monitor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monitor</em>' reference.
   * @see #getMonitor()
   * @generated
   */
  void setMonitor(DSLMonitor value);

  /**
   * Returns the value of the '<em><b>Sensor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' reference.
   * @see #setSensor(DSLSensor)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor_Sensor()
   * @model
   * @generated
   */
  DSLSensor getSensor();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getSensor <em>Sensor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(DSLSensor value);

  /**
   * Returns the value of the '<em><b>Sensorinterface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensorinterface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensorinterface</em>' reference.
   * @see #setSensorinterface(SensorInterface)
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor_Sensorinterface()
   * @model
   * @generated
   */
  SensorInterface getSensorinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getSensorinterface <em>Sensorinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensorinterface</em>' reference.
   * @see #getSensorinterface()
   * @generated
   */
  void setSensorinterface(SensorInterface value);

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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor_Knowledge()
   * @model
   * @generated
   */
  DSLKnowledge getKnowledge();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getKnowledge <em>Knowledge</em>}' reference.
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor_Knowledgeinterface()
   * @model
   * @generated
   */
  KnowledgeInterface getKnowledgeinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getKnowledgeinterface <em>Knowledgeinterface</em>}' reference.
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor_Analyzer()
   * @model
   * @generated
   */
  DSLAnalyzer getAnalyzer();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getAnalyzer <em>Analyzer</em>}' reference.
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
   * @see br.ufscar.sas.xtext.sasdsl.sasDsl.SasDslPackage#getDSLRuleMonitor_Analyzerinterface()
   * @model
   * @generated
   */
  AnalyzerInterface getAnalyzerinterface();

  /**
   * Sets the value of the '{@link br.ufscar.sas.xtext.sasdsl.sasDsl.DSLRuleMonitor#getAnalyzerinterface <em>Analyzerinterface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analyzerinterface</em>' reference.
   * @see #getAnalyzerinterface()
   * @generated
   */
  void setAnalyzerinterface(AnalyzerInterface value);

} // DSLRuleMonitor