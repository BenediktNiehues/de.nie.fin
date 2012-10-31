/**
 */
package de.nie.fin.fin;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buchungsintervall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nie.fin.fin.Buchungsintervall#getIntervall <em>Intervall</em>}</li>
 *   <li>{@link de.nie.fin.fin.Buchungsintervall#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nie.fin.fin.FinPackage#getBuchungsintervall()
 * @model
 * @generated
 */
public interface Buchungsintervall extends Element
{
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
   * @see de.nie.fin.fin.FinPackage#getBuchungsintervall_Intervall()
   * @model containment="true"
   * @generated
   */
  Intervall getIntervall();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchungsintervall#getIntervall <em>Intervall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intervall</em>' containment reference.
   * @see #getIntervall()
   * @generated
   */
  void setIntervall(Intervall value);

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
   * @see de.nie.fin.fin.FinPackage#getBuchungsintervall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Buchungsintervall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Buchungsintervall
