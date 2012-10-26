/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.*;

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
public class FinFactoryImpl extends EFactoryImpl implements FinFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FinFactory init()
  {
    try
    {
      FinFactory theFinFactory = (FinFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.nie.de/fin/Fin"); 
      if (theFinFactory != null)
      {
        return theFinFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FinFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinFactoryImpl()
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
      case FinPackage.FIN_MODEL_FILE: return createFinModelFile();
      case FinPackage.IMPORT: return createImport();
      case FinPackage.ELEMENT: return createElement();
      case FinPackage.KONTO: return createKonto();
      case FinPackage.BUCHUNGSINTERVALL: return createBuchungsintervall();
      case FinPackage.INTERVALL: return createIntervall();
      case FinPackage.KATEGORIE: return createKategorie();
      case FinPackage.BUCHUNG: return createBuchung();
      case FinPackage.EMPFAENGER: return createEmpfaenger();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinModelFile createFinModelFile()
  {
    FinModelFileImpl finModelFile = new FinModelFileImpl();
    return finModelFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Konto createKonto()
  {
    KontoImpl konto = new KontoImpl();
    return konto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buchungsintervall createBuchungsintervall()
  {
    BuchungsintervallImpl buchungsintervall = new BuchungsintervallImpl();
    return buchungsintervall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intervall createIntervall()
  {
    IntervallImpl intervall = new IntervallImpl();
    return intervall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kategorie createKategorie()
  {
    KategorieImpl kategorie = new KategorieImpl();
    return kategorie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buchung createBuchung()
  {
    BuchungImpl buchung = new BuchungImpl();
    return buchung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empfaenger createEmpfaenger()
  {
    EmpfaengerImpl empfaenger = new EmpfaengerImpl();
    return empfaenger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinPackage getFinPackage()
  {
    return (FinPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FinPackage getPackage()
  {
    return FinPackage.eINSTANCE;
  }

} //FinFactoryImpl
