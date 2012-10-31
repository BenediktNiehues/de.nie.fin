/**
 */
package de.nie.fin.fin;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.nie.fin.fin.FinPackage
 * @generated
 */
public interface FinFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FinFactory eINSTANCE = de.nie.fin.fin.impl.FinFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model File</em>'.
   * @generated
   */
  FinModelFile createFinModelFile();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Konto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Konto</em>'.
   * @generated
   */
  Konto createKonto();

  /**
   * Returns a new object of class '<em>Intervall</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intervall</em>'.
   * @generated
   */
  Intervall createIntervall();

  /**
   * Returns a new object of class '<em>Kategorie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kategorie</em>'.
   * @generated
   */
  Kategorie createKategorie();

  /**
   * Returns a new object of class '<em>Buchungsintervall</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Buchungsintervall</em>'.
   * @generated
   */
  Buchungsintervall createBuchungsintervall();

  /**
   * Returns a new object of class '<em>Buchung</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Buchung</em>'.
   * @generated
   */
  Buchung createBuchung();

  /**
   * Returns a new object of class '<em>Kontakt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kontakt</em>'.
   * @generated
   */
  Kontakt createKontakt();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FinPackage getFinPackage();

} //FinFactory
