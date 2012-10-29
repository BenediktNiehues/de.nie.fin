/**
 */
package de.nie.fin.fin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kontakt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nie.fin.fin.Kontakt#getKonten <em>Konten</em>}</li>
 *   <li>{@link de.nie.fin.fin.Kontakt#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.nie.fin.fin.Kontakt#getPlz <em>Plz</em>}</li>
 *   <li>{@link de.nie.fin.fin.Kontakt#getOrt <em>Ort</em>}</li>
 *   <li>{@link de.nie.fin.fin.Kontakt#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nie.fin.fin.FinPackage#getKontakt()
 * @model
 * @generated
 */
public interface Kontakt extends Element
{
  /**
   * Returns the value of the '<em><b>Konten</b></em>' reference list.
   * The list contents are of type {@link de.nie.fin.fin.Konto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Konten</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Konten</em>' reference list.
   * @see de.nie.fin.fin.FinPackage#getKontakt_Konten()
   * @model
   * @generated
   */
  EList<Konto> getKonten();

  /**
   * Returns the value of the '<em><b>Strasse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strasse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strasse</em>' attribute.
   * @see #setStrasse(String)
   * @see de.nie.fin.fin.FinPackage#getKontakt_Strasse()
   * @model
   * @generated
   */
  String getStrasse();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Kontakt#getStrasse <em>Strasse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strasse</em>' attribute.
   * @see #getStrasse()
   * @generated
   */
  void setStrasse(String value);

  /**
   * Returns the value of the '<em><b>Plz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plz</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plz</em>' attribute.
   * @see #setPlz(int)
   * @see de.nie.fin.fin.FinPackage#getKontakt_Plz()
   * @model
   * @generated
   */
  int getPlz();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Kontakt#getPlz <em>Plz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plz</em>' attribute.
   * @see #getPlz()
   * @generated
   */
  void setPlz(int value);

  /**
   * Returns the value of the '<em><b>Ort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ort</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ort</em>' attribute.
   * @see #setOrt(String)
   * @see de.nie.fin.fin.FinPackage#getKontakt_Ort()
   * @model
   * @generated
   */
  String getOrt();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Kontakt#getOrt <em>Ort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ort</em>' attribute.
   * @see #getOrt()
   * @generated
   */
  void setOrt(String value);

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
   * @see de.nie.fin.fin.FinPackage#getKontakt_Bemerkung()
   * @model
   * @generated
   */
  String getBemerkung();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Kontakt#getBemerkung <em>Bemerkung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bemerkung</em>' attribute.
   * @see #getBemerkung()
   * @generated
   */
  void setBemerkung(String value);

} // Kontakt
