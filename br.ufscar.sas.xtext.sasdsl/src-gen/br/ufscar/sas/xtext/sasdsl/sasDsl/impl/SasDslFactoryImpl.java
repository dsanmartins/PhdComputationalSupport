/**
 * generated by Xtext 2.10.0
 */
package br.ufscar.sas.xtext.sasdsl.sasDsl.impl;

import br.ufscar.sas.xtext.sasdsl.sasDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SasDslFactoryImpl extends EFactoryImpl implements SasDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SasDslFactory init()
  {
    try
    {
      SasDslFactory theSasDslFactory = (SasDslFactory)EPackage.Registry.INSTANCE.getEFactory(SasDslPackage.eNS_URI);
      if (theSasDslFactory != null)
      {
        return theSasDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SasDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SasDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SasDslPackage.ARCHITECTURE_DEFINITION: return createArchitectureDefinition();
      case SasDslPackage.SECTIONS: return createSections();
      case SasDslPackage.ABSTRACTIONS: return createAbstractions();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDefinition createArchitectureDefinition()
  {
    ArchitectureDefinitionImpl architectureDefinition = new ArchitectureDefinitionImpl();
    return architectureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sections createSections()
  {
    SectionsImpl sections = new SectionsImpl();
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstractions createAbstractions()
  {
    AbstractionsImpl abstractions = new AbstractionsImpl();
    return abstractions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SasDslPackage getSasDslPackage()
  {
    return (SasDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SasDslPackage getPackage()
  {
    return SasDslPackage.eINSTANCE;
  }

} //SasDslFactoryImpl
