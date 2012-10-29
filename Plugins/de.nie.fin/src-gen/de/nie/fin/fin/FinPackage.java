/**
 */
package de.nie.fin.fin;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.nie.fin.fin.FinFactory
 * @model kind="package"
 * @generated
 */
public interface FinPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fin";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nie.de/fin/Fin";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fin";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FinPackage eINSTANCE = de.nie.fin.fin.impl.FinPackageImpl.init();

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.FinModelFileImpl <em>Model File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.FinModelFileImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getFinModelFile()
   * @generated
   */
  int FIN_MODEL_FILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIN_MODEL_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIN_MODEL_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIN_MODEL_FILE__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Model File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIN_MODEL_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.ElementImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.ImportImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.KontoImpl <em>Konto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.KontoImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getKonto()
   * @generated
   */
  int KONTO = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTO__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Kto Nr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTO__KTO_NR = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Blz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTO__BLZ = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bank</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTO__BANK = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Verwendung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTO__VERWENDUNG = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Inhaber</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTO__INHABER = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Konto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTO_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.BuchungsintervallImpl <em>Buchungsintervall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.BuchungsintervallImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getBuchungsintervall()
   * @generated
   */
  int BUCHUNGSINTERVALL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNGSINTERVALL__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Intervall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNGSINTERVALL__INTERVALL = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Buchungsintervall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNGSINTERVALL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.IntervallImpl <em>Intervall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.IntervallImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getIntervall()
   * @generated
   */
  int INTERVALL = 5;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVALL__TAG = 0;

  /**
   * The feature id for the '<em><b>Monate</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVALL__MONATE = 1;

  /**
   * The number of structural features of the '<em>Intervall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.KategorieImpl <em>Kategorie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.KategorieImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getKategorie()
   * @generated
   */
  int KATEGORIE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KATEGORIE__NAME = ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Kategorie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KATEGORIE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.BuchungImpl <em>Buchung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.BuchungImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getBuchung()
   * @generated
   */
  int BUCHUNG = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Konto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__KONTO = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Betrag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__BETRAG = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Empfaenger</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__EMPFAENGER = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Empfaenger Kto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__EMPFAENGER_KTO = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Von</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__VON = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Von Kto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__VON_KTO = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Intervall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__INTERVALL = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Buch Interv</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__BUCH_INTERV = ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Kategorie</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG__KATEGORIE = ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Buchung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCHUNG_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.impl.KontaktImpl <em>Kontakt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.impl.KontaktImpl
   * @see de.nie.fin.fin.impl.FinPackageImpl#getKontakt()
   * @generated
   */
  int KONTAKT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTAKT__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Konten</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTAKT__KONTEN = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Strasse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTAKT__STRASSE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Plz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTAKT__PLZ = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTAKT__ORT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Bemerkung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTAKT__BEMERKUNG = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Kontakt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KONTAKT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.nie.fin.fin.MONAT <em>MONAT</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nie.fin.fin.MONAT
   * @see de.nie.fin.fin.impl.FinPackageImpl#getMONAT()
   * @generated
   */
  int MONAT = 9;


  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.FinModelFile <em>Model File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model File</em>'.
   * @see de.nie.fin.fin.FinModelFile
   * @generated
   */
  EClass getFinModelFile();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.FinModelFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nie.fin.fin.FinModelFile#getName()
   * @see #getFinModelFile()
   * @generated
   */
  EAttribute getFinModelFile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.nie.fin.fin.FinModelFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.nie.fin.fin.FinModelFile#getImports()
   * @see #getFinModelFile()
   * @generated
   */
  EReference getFinModelFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.nie.fin.fin.FinModelFile#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.nie.fin.fin.FinModelFile#getElements()
   * @see #getFinModelFile()
   * @generated
   */
  EReference getFinModelFile_Elements();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see de.nie.fin.fin.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nie.fin.fin.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.nie.fin.fin.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.nie.fin.fin.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Konto <em>Konto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Konto</em>'.
   * @see de.nie.fin.fin.Konto
   * @generated
   */
  EClass getKonto();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Konto#getKtoNr <em>Kto Nr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kto Nr</em>'.
   * @see de.nie.fin.fin.Konto#getKtoNr()
   * @see #getKonto()
   * @generated
   */
  EAttribute getKonto_KtoNr();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Konto#getBlz <em>Blz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blz</em>'.
   * @see de.nie.fin.fin.Konto#getBlz()
   * @see #getKonto()
   * @generated
   */
  EAttribute getKonto_Blz();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Konto#getBank <em>Bank</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bank</em>'.
   * @see de.nie.fin.fin.Konto#getBank()
   * @see #getKonto()
   * @generated
   */
  EReference getKonto_Bank();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Konto#getVerwendung <em>Verwendung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verwendung</em>'.
   * @see de.nie.fin.fin.Konto#getVerwendung()
   * @see #getKonto()
   * @generated
   */
  EAttribute getKonto_Verwendung();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Konto#getInhaber <em>Inhaber</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Inhaber</em>'.
   * @see de.nie.fin.fin.Konto#getInhaber()
   * @see #getKonto()
   * @generated
   */
  EReference getKonto_Inhaber();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Buchungsintervall <em>Buchungsintervall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Buchungsintervall</em>'.
   * @see de.nie.fin.fin.Buchungsintervall
   * @generated
   */
  EClass getBuchungsintervall();

  /**
   * Returns the meta object for the containment reference '{@link de.nie.fin.fin.Buchungsintervall#getIntervall <em>Intervall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intervall</em>'.
   * @see de.nie.fin.fin.Buchungsintervall#getIntervall()
   * @see #getBuchungsintervall()
   * @generated
   */
  EReference getBuchungsintervall_Intervall();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Intervall <em>Intervall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intervall</em>'.
   * @see de.nie.fin.fin.Intervall
   * @generated
   */
  EClass getIntervall();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Intervall#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tag</em>'.
   * @see de.nie.fin.fin.Intervall#getTag()
   * @see #getIntervall()
   * @generated
   */
  EAttribute getIntervall_Tag();

  /**
   * Returns the meta object for the attribute list '{@link de.nie.fin.fin.Intervall#getMonate <em>Monate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Monate</em>'.
   * @see de.nie.fin.fin.Intervall#getMonate()
   * @see #getIntervall()
   * @generated
   */
  EAttribute getIntervall_Monate();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Kategorie <em>Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kategorie</em>'.
   * @see de.nie.fin.fin.Kategorie
   * @generated
   */
  EClass getKategorie();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Buchung <em>Buchung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Buchung</em>'.
   * @see de.nie.fin.fin.Buchung
   * @generated
   */
  EClass getBuchung();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Buchung#getKonto <em>Konto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Konto</em>'.
   * @see de.nie.fin.fin.Buchung#getKonto()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_Konto();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Buchung#getBetrag <em>Betrag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Betrag</em>'.
   * @see de.nie.fin.fin.Buchung#getBetrag()
   * @see #getBuchung()
   * @generated
   */
  EAttribute getBuchung_Betrag();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Buchung#getEmpfaenger <em>Empfaenger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Empfaenger</em>'.
   * @see de.nie.fin.fin.Buchung#getEmpfaenger()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_Empfaenger();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Buchung#getEmpfaengerKto <em>Empfaenger Kto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Empfaenger Kto</em>'.
   * @see de.nie.fin.fin.Buchung#getEmpfaengerKto()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_EmpfaengerKto();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Buchung#getVon <em>Von</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Von</em>'.
   * @see de.nie.fin.fin.Buchung#getVon()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_Von();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Buchung#getVonKto <em>Von Kto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Von Kto</em>'.
   * @see de.nie.fin.fin.Buchung#getVonKto()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_VonKto();

  /**
   * Returns the meta object for the containment reference '{@link de.nie.fin.fin.Buchung#getIntervall <em>Intervall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intervall</em>'.
   * @see de.nie.fin.fin.Buchung#getIntervall()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_Intervall();

  /**
   * Returns the meta object for the reference '{@link de.nie.fin.fin.Buchung#getBuchInterv <em>Buch Interv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Buch Interv</em>'.
   * @see de.nie.fin.fin.Buchung#getBuchInterv()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_BuchInterv();

  /**
   * Returns the meta object for the reference list '{@link de.nie.fin.fin.Buchung#getKategorie <em>Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Kategorie</em>'.
   * @see de.nie.fin.fin.Buchung#getKategorie()
   * @see #getBuchung()
   * @generated
   */
  EReference getBuchung_Kategorie();

  /**
   * Returns the meta object for class '{@link de.nie.fin.fin.Kontakt <em>Kontakt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kontakt</em>'.
   * @see de.nie.fin.fin.Kontakt
   * @generated
   */
  EClass getKontakt();

  /**
   * Returns the meta object for the reference list '{@link de.nie.fin.fin.Kontakt#getKonten <em>Konten</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Konten</em>'.
   * @see de.nie.fin.fin.Kontakt#getKonten()
   * @see #getKontakt()
   * @generated
   */
  EReference getKontakt_Konten();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Kontakt#getStrasse <em>Strasse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strasse</em>'.
   * @see de.nie.fin.fin.Kontakt#getStrasse()
   * @see #getKontakt()
   * @generated
   */
  EAttribute getKontakt_Strasse();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Kontakt#getPlz <em>Plz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Plz</em>'.
   * @see de.nie.fin.fin.Kontakt#getPlz()
   * @see #getKontakt()
   * @generated
   */
  EAttribute getKontakt_Plz();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Kontakt#getOrt <em>Ort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ort</em>'.
   * @see de.nie.fin.fin.Kontakt#getOrt()
   * @see #getKontakt()
   * @generated
   */
  EAttribute getKontakt_Ort();

  /**
   * Returns the meta object for the attribute '{@link de.nie.fin.fin.Kontakt#getBemerkung <em>Bemerkung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bemerkung</em>'.
   * @see de.nie.fin.fin.Kontakt#getBemerkung()
   * @see #getKontakt()
   * @generated
   */
  EAttribute getKontakt_Bemerkung();

  /**
   * Returns the meta object for enum '{@link de.nie.fin.fin.MONAT <em>MONAT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MONAT</em>'.
   * @see de.nie.fin.fin.MONAT
   * @generated
   */
  EEnum getMONAT();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FinFactory getFinFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.FinModelFileImpl <em>Model File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.FinModelFileImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getFinModelFile()
     * @generated
     */
    EClass FIN_MODEL_FILE = eINSTANCE.getFinModelFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIN_MODEL_FILE__NAME = eINSTANCE.getFinModelFile_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIN_MODEL_FILE__IMPORTS = eINSTANCE.getFinModelFile_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIN_MODEL_FILE__ELEMENTS = eINSTANCE.getFinModelFile_Elements();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.ElementImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.ImportImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.KontoImpl <em>Konto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.KontoImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getKonto()
     * @generated
     */
    EClass KONTO = eINSTANCE.getKonto();

    /**
     * The meta object literal for the '<em><b>Kto Nr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KONTO__KTO_NR = eINSTANCE.getKonto_KtoNr();

    /**
     * The meta object literal for the '<em><b>Blz</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KONTO__BLZ = eINSTANCE.getKonto_Blz();

    /**
     * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KONTO__BANK = eINSTANCE.getKonto_Bank();

    /**
     * The meta object literal for the '<em><b>Verwendung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KONTO__VERWENDUNG = eINSTANCE.getKonto_Verwendung();

    /**
     * The meta object literal for the '<em><b>Inhaber</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KONTO__INHABER = eINSTANCE.getKonto_Inhaber();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.BuchungsintervallImpl <em>Buchungsintervall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.BuchungsintervallImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getBuchungsintervall()
     * @generated
     */
    EClass BUCHUNGSINTERVALL = eINSTANCE.getBuchungsintervall();

    /**
     * The meta object literal for the '<em><b>Intervall</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNGSINTERVALL__INTERVALL = eINSTANCE.getBuchungsintervall_Intervall();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.IntervallImpl <em>Intervall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.IntervallImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getIntervall()
     * @generated
     */
    EClass INTERVALL = eINSTANCE.getIntervall();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVALL__TAG = eINSTANCE.getIntervall_Tag();

    /**
     * The meta object literal for the '<em><b>Monate</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVALL__MONATE = eINSTANCE.getIntervall_Monate();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.KategorieImpl <em>Kategorie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.KategorieImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getKategorie()
     * @generated
     */
    EClass KATEGORIE = eINSTANCE.getKategorie();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.BuchungImpl <em>Buchung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.BuchungImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getBuchung()
     * @generated
     */
    EClass BUCHUNG = eINSTANCE.getBuchung();

    /**
     * The meta object literal for the '<em><b>Konto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__KONTO = eINSTANCE.getBuchung_Konto();

    /**
     * The meta object literal for the '<em><b>Betrag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUCHUNG__BETRAG = eINSTANCE.getBuchung_Betrag();

    /**
     * The meta object literal for the '<em><b>Empfaenger</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__EMPFAENGER = eINSTANCE.getBuchung_Empfaenger();

    /**
     * The meta object literal for the '<em><b>Empfaenger Kto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__EMPFAENGER_KTO = eINSTANCE.getBuchung_EmpfaengerKto();

    /**
     * The meta object literal for the '<em><b>Von</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__VON = eINSTANCE.getBuchung_Von();

    /**
     * The meta object literal for the '<em><b>Von Kto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__VON_KTO = eINSTANCE.getBuchung_VonKto();

    /**
     * The meta object literal for the '<em><b>Intervall</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__INTERVALL = eINSTANCE.getBuchung_Intervall();

    /**
     * The meta object literal for the '<em><b>Buch Interv</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__BUCH_INTERV = eINSTANCE.getBuchung_BuchInterv();

    /**
     * The meta object literal for the '<em><b>Kategorie</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUCHUNG__KATEGORIE = eINSTANCE.getBuchung_Kategorie();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.impl.KontaktImpl <em>Kontakt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.impl.KontaktImpl
     * @see de.nie.fin.fin.impl.FinPackageImpl#getKontakt()
     * @generated
     */
    EClass KONTAKT = eINSTANCE.getKontakt();

    /**
     * The meta object literal for the '<em><b>Konten</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KONTAKT__KONTEN = eINSTANCE.getKontakt_Konten();

    /**
     * The meta object literal for the '<em><b>Strasse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KONTAKT__STRASSE = eINSTANCE.getKontakt_Strasse();

    /**
     * The meta object literal for the '<em><b>Plz</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KONTAKT__PLZ = eINSTANCE.getKontakt_Plz();

    /**
     * The meta object literal for the '<em><b>Ort</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KONTAKT__ORT = eINSTANCE.getKontakt_Ort();

    /**
     * The meta object literal for the '<em><b>Bemerkung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KONTAKT__BEMERKUNG = eINSTANCE.getKontakt_Bemerkung();

    /**
     * The meta object literal for the '{@link de.nie.fin.fin.MONAT <em>MONAT</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nie.fin.fin.MONAT
     * @see de.nie.fin.fin.impl.FinPackageImpl#getMONAT()
     * @generated
     */
    EEnum MONAT = eINSTANCE.getMONAT();

  }

} //FinPackage
