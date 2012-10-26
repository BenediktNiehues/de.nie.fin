/**
 */
package de.nie.fin.fin;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kategorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nie.fin.fin.Kategorie#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nie.fin.fin.FinPackage#getKategorie()
 * @model
 * @generated
 */
public interface Kategorie extends Element
{
  /**
   * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beschreibung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beschreibung</em>' attribute.
   * @see #setBeschreibung(String)
   * @see de.nie.fin.fin.FinPackage#getKategorie_Beschreibung()
   * @model
   * @generated
   */
  String getBeschreibung();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Kategorie#getBeschreibung <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beschreibung</em>' attribute.
   * @see #getBeschreibung()
   * @generated
   */
  void setBeschreibung(String value);

} // Kategorie
