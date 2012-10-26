/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.Buchung;
import de.nie.fin.fin.Buchungsintervall;
import de.nie.fin.fin.Element;
import de.nie.fin.fin.Empfaenger;
import de.nie.fin.fin.FinFactory;
import de.nie.fin.fin.FinModelFile;
import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Import;
import de.nie.fin.fin.Kategorie;
import de.nie.fin.fin.Konto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinPackageImpl extends EPackageImpl implements FinPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass finModelFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kontoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buchungsintervallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kategorieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buchungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass empfaengerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.nie.fin.fin.FinPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FinPackageImpl()
  {
    super(eNS_URI, FinFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FinPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FinPackage init()
  {
    if (isInited) return (FinPackage)EPackage.Registry.INSTANCE.getEPackage(FinPackage.eNS_URI);

    // Obtain or create and register package
    FinPackageImpl theFinPackage = (FinPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FinPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FinPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFinPackage.createPackageContents();

    // Initialize created meta-data
    theFinPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFinPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FinPackage.eNS_URI, theFinPackage);
    return theFinPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFinModelFile()
  {
    return finModelFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFinModelFile_Name()
  {
    return (EAttribute)finModelFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFinModelFile_Imports()
  {
    return (EReference)finModelFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFinModelFile_Elements()
  {
    return (EReference)finModelFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_Name()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKonto()
  {
    return kontoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKonto_KtoNr()
  {
    return (EAttribute)kontoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKonto_Blz()
  {
    return (EAttribute)kontoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKonto_Bank()
  {
    return (EAttribute)kontoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKonto_Verwendung()
  {
    return (EAttribute)kontoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKonto_Inhaber()
  {
    return (EAttribute)kontoEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuchungsintervall()
  {
    return buchungsintervallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuchungsintervall_Monate()
  {
    return (EAttribute)buchungsintervallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuchungsintervall_Tag()
  {
    return (EAttribute)buchungsintervallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKategorie()
  {
    return kategorieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKategorie_Beschreibung()
  {
    return (EAttribute)kategorieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuchung()
  {
    return buchungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Konto()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuchung_Betrag()
  {
    return (EAttribute)buchungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Empfaenger()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Von()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Intervall()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Kategorie()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmpfaenger()
  {
    return empfaengerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmpfaenger_Strasse()
  {
    return (EAttribute)empfaengerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmpfaenger_Plz()
  {
    return (EAttribute)empfaengerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmpfaenger_Ort()
  {
    return (EAttribute)empfaengerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmpfaenger_Bemerkung()
  {
    return (EAttribute)empfaengerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinFactory getFinFactory()
  {
    return (FinFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    finModelFileEClass = createEClass(FIN_MODEL_FILE);
    createEAttribute(finModelFileEClass, FIN_MODEL_FILE__NAME);
    createEReference(finModelFileEClass, FIN_MODEL_FILE__IMPORTS);
    createEReference(finModelFileEClass, FIN_MODEL_FILE__ELEMENTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__NAME);

    kontoEClass = createEClass(KONTO);
    createEAttribute(kontoEClass, KONTO__KTO_NR);
    createEAttribute(kontoEClass, KONTO__BLZ);
    createEAttribute(kontoEClass, KONTO__BANK);
    createEAttribute(kontoEClass, KONTO__VERWENDUNG);
    createEAttribute(kontoEClass, KONTO__INHABER);

    buchungsintervallEClass = createEClass(BUCHUNGSINTERVALL);
    createEAttribute(buchungsintervallEClass, BUCHUNGSINTERVALL__MONATE);
    createEAttribute(buchungsintervallEClass, BUCHUNGSINTERVALL__TAG);

    kategorieEClass = createEClass(KATEGORIE);
    createEAttribute(kategorieEClass, KATEGORIE__BESCHREIBUNG);

    buchungEClass = createEClass(BUCHUNG);
    createEReference(buchungEClass, BUCHUNG__KONTO);
    createEAttribute(buchungEClass, BUCHUNG__BETRAG);
    createEReference(buchungEClass, BUCHUNG__EMPFAENGER);
    createEReference(buchungEClass, BUCHUNG__VON);
    createEReference(buchungEClass, BUCHUNG__INTERVALL);
    createEReference(buchungEClass, BUCHUNG__KATEGORIE);

    empfaengerEClass = createEClass(EMPFAENGER);
    createEAttribute(empfaengerEClass, EMPFAENGER__STRASSE);
    createEAttribute(empfaengerEClass, EMPFAENGER__PLZ);
    createEAttribute(empfaengerEClass, EMPFAENGER__ORT);
    createEAttribute(empfaengerEClass, EMPFAENGER__BEMERKUNG);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    kontoEClass.getESuperTypes().add(this.getElement());
    buchungsintervallEClass.getESuperTypes().add(this.getElement());
    kategorieEClass.getESuperTypes().add(this.getElement());
    buchungEClass.getESuperTypes().add(this.getElement());
    empfaengerEClass.getESuperTypes().add(this.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(finModelFileEClass, FinModelFile.class, "FinModelFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFinModelFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, FinModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFinModelFile_Imports(), this.getImport(), null, "imports", null, 0, -1, FinModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFinModelFile_Elements(), this.getElement(), null, "elements", null, 0, -1, FinModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kontoEClass, Konto.class, "Konto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKonto_KtoNr(), ecorePackage.getEInt(), "ktoNr", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKonto_Blz(), ecorePackage.getEInt(), "blz", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKonto_Bank(), ecorePackage.getEString(), "bank", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKonto_Verwendung(), ecorePackage.getEString(), "verwendung", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKonto_Inhaber(), ecorePackage.getEString(), "inhaber", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buchungsintervallEClass, Buchungsintervall.class, "Buchungsintervall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuchungsintervall_Monate(), ecorePackage.getEString(), "monate", null, 0, -1, Buchungsintervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuchungsintervall_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Buchungsintervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kategorieEClass, Kategorie.class, "Kategorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKategorie_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, Kategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buchungEClass, Buchung.class, "Buchung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuchung_Konto(), this.getKonto(), null, "konto", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuchung_Betrag(), ecorePackage.getEInt(), "betrag", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Empfaenger(), this.getEmpfaenger(), null, "empfaenger", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Von(), this.getEmpfaenger(), null, "von", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Intervall(), this.getBuchungsintervall(), null, "intervall", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Kategorie(), this.getKategorie(), null, "kategorie", null, 0, -1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(empfaengerEClass, Empfaenger.class, "Empfaenger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmpfaenger_Strasse(), ecorePackage.getEString(), "strasse", null, 0, 1, Empfaenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmpfaenger_Plz(), ecorePackage.getEString(), "plz", null, 0, 1, Empfaenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmpfaenger_Ort(), ecorePackage.getEString(), "ort", null, 0, 1, Empfaenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmpfaenger_Bemerkung(), ecorePackage.getEString(), "bemerkung", null, 0, 1, Empfaenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FinPackageImpl
