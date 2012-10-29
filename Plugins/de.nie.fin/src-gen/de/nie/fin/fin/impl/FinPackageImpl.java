/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.Buchung;
import de.nie.fin.fin.Buchungsintervall;
import de.nie.fin.fin.Element;
import de.nie.fin.fin.FinFactory;
import de.nie.fin.fin.FinModelFile;
import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Import;
import de.nie.fin.fin.Intervall;
import de.nie.fin.fin.Kategorie;
import de.nie.fin.fin.Kontakt;
import de.nie.fin.fin.Konto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
  private EClass elementEClass = null;

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
  private EClass intervallEClass = null;

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
  private EClass kontaktEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum monatEEnum = null;

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
  public EReference getKonto_Bank()
  {
    return (EReference)kontoEClass.getEStructuralFeatures().get(2);
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
  public EReference getKonto_Inhaber()
  {
    return (EReference)kontoEClass.getEStructuralFeatures().get(4);
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
  public EReference getBuchungsintervall_Intervall()
  {
    return (EReference)buchungsintervallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntervall()
  {
    return intervallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntervall_Tag()
  {
    return (EAttribute)intervallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntervall_Monate()
  {
    return (EAttribute)intervallEClass.getEStructuralFeatures().get(1);
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
  public EReference getBuchung_EmpfaengerKto()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Von()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_VonKto()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Intervall()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_BuchInterv()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuchung_Kategorie()
  {
    return (EReference)buchungEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKontakt()
  {
    return kontaktEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKontakt_Konten()
  {
    return (EReference)kontaktEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKontakt_Strasse()
  {
    return (EAttribute)kontaktEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKontakt_Plz()
  {
    return (EAttribute)kontaktEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKontakt_Ort()
  {
    return (EAttribute)kontaktEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKontakt_Bemerkung()
  {
    return (EAttribute)kontaktEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMONAT()
  {
    return monatEEnum;
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

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__NAME);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    kontoEClass = createEClass(KONTO);
    createEAttribute(kontoEClass, KONTO__KTO_NR);
    createEAttribute(kontoEClass, KONTO__BLZ);
    createEReference(kontoEClass, KONTO__BANK);
    createEAttribute(kontoEClass, KONTO__VERWENDUNG);
    createEReference(kontoEClass, KONTO__INHABER);

    buchungsintervallEClass = createEClass(BUCHUNGSINTERVALL);
    createEReference(buchungsintervallEClass, BUCHUNGSINTERVALL__INTERVALL);

    intervallEClass = createEClass(INTERVALL);
    createEAttribute(intervallEClass, INTERVALL__TAG);
    createEAttribute(intervallEClass, INTERVALL__MONATE);

    kategorieEClass = createEClass(KATEGORIE);

    buchungEClass = createEClass(BUCHUNG);
    createEReference(buchungEClass, BUCHUNG__KONTO);
    createEAttribute(buchungEClass, BUCHUNG__BETRAG);
    createEReference(buchungEClass, BUCHUNG__EMPFAENGER);
    createEReference(buchungEClass, BUCHUNG__EMPFAENGER_KTO);
    createEReference(buchungEClass, BUCHUNG__VON);
    createEReference(buchungEClass, BUCHUNG__VON_KTO);
    createEReference(buchungEClass, BUCHUNG__INTERVALL);
    createEReference(buchungEClass, BUCHUNG__BUCH_INTERV);
    createEReference(buchungEClass, BUCHUNG__KATEGORIE);

    kontaktEClass = createEClass(KONTAKT);
    createEReference(kontaktEClass, KONTAKT__KONTEN);
    createEAttribute(kontaktEClass, KONTAKT__STRASSE);
    createEAttribute(kontaktEClass, KONTAKT__PLZ);
    createEAttribute(kontaktEClass, KONTAKT__ORT);
    createEAttribute(kontaktEClass, KONTAKT__BEMERKUNG);

    // Create enums
    monatEEnum = createEEnum(MONAT);
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
    kontaktEClass.getESuperTypes().add(this.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(finModelFileEClass, FinModelFile.class, "FinModelFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFinModelFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, FinModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFinModelFile_Imports(), this.getImport(), null, "imports", null, 0, -1, FinModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFinModelFile_Elements(), this.getElement(), null, "elements", null, 0, -1, FinModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kontoEClass, Konto.class, "Konto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKonto_KtoNr(), ecorePackage.getEInt(), "ktoNr", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKonto_Blz(), ecorePackage.getEInt(), "blz", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKonto_Bank(), this.getKontakt(), null, "bank", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKonto_Verwendung(), ecorePackage.getEString(), "verwendung", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKonto_Inhaber(), this.getKontakt(), null, "inhaber", null, 0, 1, Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buchungsintervallEClass, Buchungsintervall.class, "Buchungsintervall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuchungsintervall_Intervall(), this.getIntervall(), null, "intervall", null, 0, 1, Buchungsintervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intervallEClass, Intervall.class, "Intervall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntervall_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Intervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntervall_Monate(), this.getMONAT(), "monate", null, 0, -1, Intervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kategorieEClass, Kategorie.class, "Kategorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(buchungEClass, Buchung.class, "Buchung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuchung_Konto(), this.getKonto(), null, "konto", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuchung_Betrag(), ecorePackage.getEInt(), "betrag", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Empfaenger(), this.getKontakt(), null, "empfaenger", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_EmpfaengerKto(), this.getKonto(), null, "empfaengerKto", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Von(), this.getKontakt(), null, "von", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_VonKto(), this.getKonto(), null, "vonKto", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Intervall(), this.getIntervall(), null, "intervall", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_BuchInterv(), this.getBuchungsintervall(), null, "buchInterv", null, 0, 1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuchung_Kategorie(), this.getKategorie(), null, "kategorie", null, 0, -1, Buchung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kontaktEClass, Kontakt.class, "Kontakt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKontakt_Konten(), this.getKonto(), null, "konten", null, 0, -1, Kontakt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKontakt_Strasse(), ecorePackage.getEString(), "strasse", null, 0, 1, Kontakt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKontakt_Plz(), ecorePackage.getEInt(), "plz", null, 0, 1, Kontakt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKontakt_Ort(), ecorePackage.getEString(), "ort", null, 0, 1, Kontakt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKontakt_Bemerkung(), ecorePackage.getEString(), "bemerkung", null, 0, 1, Kontakt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(monatEEnum, de.nie.fin.fin.MONAT.class, "MONAT");
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.ALLE);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.JANUAR);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.FEBRUAR);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.MAERZ);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.APRIL);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.MAI);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.JUNI);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.JULI);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.AUGUST);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.SEPTEMBER);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.OKTOBER);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.NOVEMBER);
    addEEnumLiteral(monatEEnum, de.nie.fin.fin.MONAT.DEZEMBER);

    // Create resource
    createResource(eNS_URI);
  }

} //FinPackageImpl
