/**
 */
package de.nie.fin.fin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buchung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nie.fin.fin.Buchung#getKonto <em>Konto</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getEmpfaenger <em>Empfaenger</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getEmpfaengerKto <em>Empfaenger Kto</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getVon <em>Von</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getVonKto <em>Von Kto</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getIntervall <em>Intervall</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getBuchInterv <em>Buch Interv</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchung#getKategorie <em>Kategorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nie.fin.fin.FinPackage#getBuchung()
 * @model
 * @generated
 */
public interface Buchung extends Element
{
  /**
   * Returns the value of the '<em><b>Konto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Konto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Konto</em>' reference.
   * @see #setKonto(Konto)
   * @see de.nie.fin.fin.FinPackage#getBuchung_Konto()
   * @model
   * @generated
   */
  Konto getKonto();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getKonto <em>Konto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Konto</em>' reference.
   * @see #getKonto()
   * @generated
   */
  void setKonto(Konto value);

  /**
   * Returns the value of the '<em><b>Betrag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Betrag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Betrag</em>' attribute.
   * @see #setBetrag(int)
   * @see de.nie.fin.fin.FinPackage#getBuchung_Betrag()
   * @model
   * @generated
   */
  int getBetrag();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getBetrag <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Betrag</em>' attribute.
   * @see #getBetrag()
   * @generated
   */
  void setBetrag(int value);

  /**
   * Returns the value of the '<em><b>Empfaenger</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empfaenger</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empfaenger</em>' reference.
   * @see #setEmpfaenger(Kontakt)
   * @see de.nie.fin.fin.FinPackage#getBuchung_Empfaenger()
   * @model
   * @generated
   */
  Kontakt getEmpfaenger();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getEmpfaenger <em>Empfaenger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empfaenger</em>' reference.
   * @see #getEmpfaenger()
   * @generated
   */
  void setEmpfaenger(Kontakt value);

  /**
   * Returns the value of the '<em><b>Empfaenger Kto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empfaenger Kto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empfaenger Kto</em>' reference.
   * @see #setEmpfaengerKto(Konto)
   * @see de.nie.fin.fin.FinPackage#getBuchung_EmpfaengerKto()
   * @model
   * @generated
   */
  Konto getEmpfaengerKto();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getEmpfaengerKto <em>Empfaenger Kto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empfaenger Kto</em>' reference.
   * @see #getEmpfaengerKto()
   * @generated
   */
  void setEmpfaengerKto(Konto value);

  /**
   * Returns the value of the '<em><b>Von</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Von</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Von</em>' reference.
   * @see #setVon(Kontakt)
   * @see de.nie.fin.fin.FinPackage#getBuchung_Von()
   * @model
   * @generated
   */
  Kontakt getVon();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getVon <em>Von</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Von</em>' reference.
   * @see #getVon()
   * @generated
   */
  void setVon(Kontakt value);

  /**
   * Returns the value of the '<em><b>Von Kto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Von Kto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Von Kto</em>' reference.
   * @see #setVonKto(Konto)
   * @see de.nie.fin.fin.FinPackage#getBuchung_VonKto()
   * @model
   * @generated
   */
  Konto getVonKto();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getVonKto <em>Von Kto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Von Kto</em>' reference.
   * @see #getVonKto()
   * @generated
   */
  void setVonKto(Konto value);

  /**
   * Returns the value of the '<em><b>Intervall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intervall</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intervall</em>' containment reference.
   * @see #setIntervall(Intervall)
   * @see de.nie.fin.fin.FinPackage#getBuchung_Intervall()
   * @model containment="true"
   * @generated
   */
  Intervall getIntervall();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getIntervall <em>Intervall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intervall</em>' containment reference.
   * @see #getIntervall()
   * @generated
   */
  void setIntervall(Intervall value);

  /**
   * Returns the value of the '<em><b>Buch Interv</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buch Interv</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buch Interv</em>' reference.
   * @see #setBuchInterv(Buchungsintervall)
   * @see de.nie.fin.fin.FinPackage#getBuchung_BuchInterv()
   * @model
   * @generated
   */
  Buchungsintervall getBuchInterv();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchung#getBuchInterv <em>Buch Interv</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buch Interv</em>' reference.
   * @see #getBuchInterv()
   * @generated
   */
  void setBuchInterv(Buchungsintervall value);

  /**
   * Returns the value of the '<em><b>Kategorie</b></em>' reference list.
   * The list contents are of type {@link de.nie.fin.fin.Kategorie}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kategorie</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kategorie</em>' reference list.
   * @see de.nie.fin.fin.FinPackage#getBuchung_Kategorie()
   * @model
   * @generated
   */
  EList<Kategorie> getKategorie();

} // Buchung
