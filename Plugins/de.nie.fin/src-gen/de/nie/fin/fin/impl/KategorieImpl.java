/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Kategorie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kategorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nie.fin.fin.impl.KategorieImpl#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KategorieImpl extends ElementImpl implements Kategorie
{
  /**
   * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeschreibung()
   * @generated
   * @ordered
   */
  protected static final String BESCHREIBUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeschreibung()
   * @generated
   * @ordered
   */
  protected String beschreibung = BESCHREIBUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KategorieImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FinPackage.Literals.KATEGORIE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBeschreibung()
  {
    return beschreibung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeschreibung(String newBeschreibung)
  {
    String oldBeschreibung = beschreibung;
    beschreibung = newBeschreibung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KATEGORIE__BESCHREIBUNG, oldBeschreibung, beschreibung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FinPackage.KATEGORIE__BESCHREIBUNG:
        return getBeschreibung();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FinPackage.KATEGORIE__BESCHREIBUNG:
        setBeschreibung((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FinPackage.KATEGORIE__BESCHREIBUNG:
        setBeschreibung(BESCHREIBUNG_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FinPackage.KATEGORIE__BESCHREIBUNG:
        return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (beschreibung: ");
    result.append(beschreibung);
    result.append(')');
    return result.toString();
  }

} //KategorieImpl
