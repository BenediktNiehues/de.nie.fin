/**
 */
package de.nie.fin.fin;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Konto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nie.fin.fin.Konto#getName <em>Name</em>}</li>
 *   <li>{@link de.nie.fin.fin.Konto#getInhaber <em>Inhaber</em>}</li>
 *   <li>{@link de.nie.fin.fin.Konto#getKtoNr <em>Kto Nr</em>}</li>
 *   <li>{@link de.nie.fin.fin.Konto#getBlz <em>Blz</em>}</li>
 *   <li>{@link de.nie.fin.fin.Konto#getBank <em>Bank</em>}</li>
 *   <li>{@link de.nie.fin.fin.Konto#getVerwendung <em>Verwendung</em>}</li>
 *   <li>{@link de.nie.fin.fin.Konto#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nie.fin.fin.FinPackage#getKonto()
 * @model
 * @generated
 */
public interface Konto extends Element
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.nie.fin.fin.FinPackage#getKonto_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Konto#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inhaber</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inhaber</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inhaber</em>' reference.
   * @see #setInhaber(Kontakt)
   * @see de.nie.fin.fin.FinPackage#getKonto_Inhaber()
   * @model
   * @generated
   */
  Kontakt getInhaber();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Konto#getInhaber <em>Inhaber</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inhaber</em>' reference.
   * @see #getInhaber()
   * @generated
   */
  void setInhaber(Kontakt value);

  /**
   * Returns the value of the '<em><b>Kto Nr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kto Nr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kto Nr</em>' attribute.
   * @see #setKtoNr(int)
   * @see de.nie.fin.fin.FinPackage#getKonto_KtoNr()
   * @model
   * @generated
   */
  int getKtoNr();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Konto#getKtoNr <em>Kto Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kto Nr</em>' attribute.
   * @see #getKtoNr()
   * @generated
   */
  void setKtoNr(int value);

  /**
   * Returns the value of the '<em><b>Blz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blz</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blz</em>' attribute.
   * @see #setBlz(int)
   * @see de.nie.fin.fin.FinPackage#getKonto_Blz()
   * @model
   * @generated
   */
  int getBlz();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Konto#getBlz <em>Blz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blz</em>' attribute.
   * @see #getBlz()
   * @generated
   */
  void setBlz(int value);

  /**
   * Returns the value of the '<em><b>Bank</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bank</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bank</em>' reference.
   * @see #setBank(Kontakt)
   * @see de.nie.fin.fin.FinPackage#getKonto_Bank()
   * @model
   * @generated
   */
  Kontakt getBank();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Konto#getBank <em>Bank</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bank</em>' reference.
   * @see #getBank()
   * @generated
   */
  void setBank(Kontakt value);

  /**
   * Returns the value of the '<em><b>Verwendung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verwendung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verwendung</em>' attribute.
   * @see #setVerwendung(String)
   * @see de.nie.fin.fin.FinPackage#getKonto_Verwendung()
   * @model
   * @generated
   */
  String getVerwendung();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Konto#getVerwendung <em>Verwendung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verwendung</em>' attribute.
   * @see #getVerwendung()
   * @generated
   */
  void setVerwendung(String value);

  /**
   * Returns the value of the '<em><b>Bemerkung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bemerkung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bemerkung</em>' attribute.
   * @see #setBemerkung(String)
   * @see de.nie.fin.fin.FinPackage#getKonto_Bemerkung()
   * @model
   * @generated
   */
  String getBemerkung();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Konto#getBemerkung <em>Bemerkung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bemerkung</em>' attribute.
   * @see #getBemerkung()
   * @generated
   */
  void setBemerkung(String value);

} // Konto
