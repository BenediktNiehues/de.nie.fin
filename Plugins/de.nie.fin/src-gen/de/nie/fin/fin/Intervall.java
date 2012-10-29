/**
 */
package de.nie.fin.fin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intervall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nie.fin.fin.Intervall#getTag <em>Tag</em>}</li>
 *   <li>{@link de.nie.fin.fin.Intervall#getMonate <em>Monate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nie.fin.fin.FinPackage#getIntervall()
 * @model
 * @generated
 */
public interface Intervall extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see de.nie.fin.fin.FinPackage#getIntervall_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link de.nie.fin.fin.Intervall#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

  /**
   * Returns the value of the '<em><b>Monate</b></em>' attribute list.
   * The list contents are of type {@link de.nie.fin.fin.MONAT}.
   * The literals are from the enumeration {@link de.nie.fin.fin.MONAT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monate</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monate</em>' attribute list.
   * @see de.nie.fin.fin.MONAT
   * @see de.nie.fin.fin.FinPackage#getIntervall_Monate()
   * @model unique="false"
   * @generated
   */
  EList<MONAT> getMonate();

} // Intervall
