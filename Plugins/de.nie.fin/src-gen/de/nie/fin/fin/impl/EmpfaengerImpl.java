/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.Empfaenger;
import de.nie.fin.fin.FinPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empfaenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nie.fin.fin.impl.EmpfaengerImpl#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.EmpfaengerImpl#getPlz <em>Plz</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.EmpfaengerImpl#getOrt <em>Ort</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.EmpfaengerImpl#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmpfaengerImpl extends ElementImpl implements Empfaenger
{
  /**
   * The default value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrasse()
   * @generated
   * @ordered
   */
  protected static final String STRASSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrasse()
   * @generated
   * @ordered
   */
  protected String strasse = STRASSE_EDEFAULT;

  /**
   * The default value of the '{@link #getPlz() <em>Plz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlz()
   * @generated
   * @ordered
   */
  protected static final String PLZ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlz() <em>Plz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlz()
   * @generated
   * @ordered
   */
  protected String plz = PLZ_EDEFAULT;

  /**
   * The default value of the '{@link #getOrt() <em>Ort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrt()
   * @generated
   * @ordered
   */
  protected static final String ORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrt() <em>Ort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrt()
   * @generated
   * @ordered
   */
  protected String ort = ORT_EDEFAULT;

  /**
   * The default value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBemerkung()
   * @generated
   * @ordered
   */
  protected static final String BEMERKUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBemerkung()
   * @generated
   * @ordered
   */
  protected String bemerkung = BEMERKUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmpfaengerImpl()
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
    return FinPackage.Literals.EMPFAENGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStrasse()
  {
    return strasse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrasse(String newStrasse)
  {
    String oldStrasse = strasse;
    strasse = newStrasse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.EMPFAENGER__STRASSE, oldStrasse, strasse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlz()
  {
    return plz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlz(String newPlz)
  {
    String oldPlz = plz;
    plz = newPlz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.EMPFAENGER__PLZ, oldPlz, plz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrt()
  {
    return ort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrt(String newOrt)
  {
    String oldOrt = ort;
    ort = newOrt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.EMPFAENGER__ORT, oldOrt, ort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBemerkung()
  {
    return bemerkung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBemerkung(String newBemerkung)
  {
    String oldBemerkung = bemerkung;
    bemerkung = newBemerkung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.EMPFAENGER__BEMERKUNG, oldBemerkung, bemerkung));
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
      case FinPackage.EMPFAENGER__STRASSE:
        return getStrasse();
      case FinPackage.EMPFAENGER__PLZ:
        return getPlz();
      case FinPackage.EMPFAENGER__ORT:
        return getOrt();
      case FinPackage.EMPFAENGER__BEMERKUNG:
        return getBemerkung();
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
      case FinPackage.EMPFAENGER__STRASSE:
        setStrasse((String)newValue);
        return;
      case FinPackage.EMPFAENGER__PLZ:
        setPlz((String)newValue);
        return;
      case FinPackage.EMPFAENGER__ORT:
        setOrt((String)newValue);
        return;
      case FinPackage.EMPFAENGER__BEMERKUNG:
        setBemerkung((String)newValue);
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
      case FinPackage.EMPFAENGER__STRASSE:
        setStrasse(STRASSE_EDEFAULT);
        return;
      case FinPackage.EMPFAENGER__PLZ:
        setPlz(PLZ_EDEFAULT);
        return;
      case FinPackage.EMPFAENGER__ORT:
        setOrt(ORT_EDEFAULT);
        return;
      case FinPackage.EMPFAENGER__BEMERKUNG:
        setBemerkung(BEMERKUNG_EDEFAULT);
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
      case FinPackage.EMPFAENGER__STRASSE:
        return STRASSE_EDEFAULT == null ? strasse != null : !STRASSE_EDEFAULT.equals(strasse);
      case FinPackage.EMPFAENGER__PLZ:
        return PLZ_EDEFAULT == null ? plz != null : !PLZ_EDEFAULT.equals(plz);
      case FinPackage.EMPFAENGER__ORT:
        return ORT_EDEFAULT == null ? ort != null : !ORT_EDEFAULT.equals(ort);
      case FinPackage.EMPFAENGER__BEMERKUNG:
        return BEMERKUNG_EDEFAULT == null ? bemerkung != null : !BEMERKUNG_EDEFAULT.equals(bemerkung);
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
    result.append(" (strasse: ");
    result.append(strasse);
    result.append(", plz: ");
    result.append(plz);
    result.append(", ort: ");
    result.append(ort);
    result.append(", bemerkung: ");
    result.append(bemerkung);
    result.append(')');
    return result.toString();
  }

} //EmpfaengerImpl
