/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Kontakt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kontakt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nie.fin.fin.impl.KontaktImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontaktImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontaktImpl#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontaktImpl#getPlz <em>Plz</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontaktImpl#getOrt <em>Ort</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontaktImpl#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KontaktImpl extends ElementImpl implements Kontakt
{
  /**
   * The default value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorname()
   * @generated
   * @ordered
   */
  protected static final String VORNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorname()
   * @generated
   * @ordered
   */
  protected String vorname = VORNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNachname()
   * @generated
   * @ordered
   */
  protected static final String NACHNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNachname()
   * @generated
   * @ordered
   */
  protected String nachname = NACHNAME_EDEFAULT;

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
  protected static final int PLZ_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPlz() <em>Plz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlz()
   * @generated
   * @ordered
   */
  protected int plz = PLZ_EDEFAULT;

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
  protected KontaktImpl()
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
    return FinPackage.Literals.KONTAKT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVorname()
  {
    return vorname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVorname(String newVorname)
  {
    String oldVorname = vorname;
    vorname = newVorname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTAKT__VORNAME, oldVorname, vorname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNachname()
  {
    return nachname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNachname(String newNachname)
  {
    String oldNachname = nachname;
    nachname = newNachname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTAKT__NACHNAME, oldNachname, nachname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTAKT__STRASSE, oldStrasse, strasse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPlz()
  {
    return plz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlz(int newPlz)
  {
    int oldPlz = plz;
    plz = newPlz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTAKT__PLZ, oldPlz, plz));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTAKT__ORT, oldOrt, ort));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTAKT__BEMERKUNG, oldBemerkung, bemerkung));
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
      case FinPackage.KONTAKT__VORNAME:
        return getVorname();
      case FinPackage.KONTAKT__NACHNAME:
        return getNachname();
      case FinPackage.KONTAKT__STRASSE:
        return getStrasse();
      case FinPackage.KONTAKT__PLZ:
        return getPlz();
      case FinPackage.KONTAKT__ORT:
        return getOrt();
      case FinPackage.KONTAKT__BEMERKUNG:
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
      case FinPackage.KONTAKT__VORNAME:
        setVorname((String)newValue);
        return;
      case FinPackage.KONTAKT__NACHNAME:
        setNachname((String)newValue);
        return;
      case FinPackage.KONTAKT__STRASSE:
        setStrasse((String)newValue);
        return;
      case FinPackage.KONTAKT__PLZ:
        setPlz((Integer)newValue);
        return;
      case FinPackage.KONTAKT__ORT:
        setOrt((String)newValue);
        return;
      case FinPackage.KONTAKT__BEMERKUNG:
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
      case FinPackage.KONTAKT__VORNAME:
        setVorname(VORNAME_EDEFAULT);
        return;
      case FinPackage.KONTAKT__NACHNAME:
        setNachname(NACHNAME_EDEFAULT);
        return;
      case FinPackage.KONTAKT__STRASSE:
        setStrasse(STRASSE_EDEFAULT);
        return;
      case FinPackage.KONTAKT__PLZ:
        setPlz(PLZ_EDEFAULT);
        return;
      case FinPackage.KONTAKT__ORT:
        setOrt(ORT_EDEFAULT);
        return;
      case FinPackage.KONTAKT__BEMERKUNG:
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
      case FinPackage.KONTAKT__VORNAME:
        return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
      case FinPackage.KONTAKT__NACHNAME:
        return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
      case FinPackage.KONTAKT__STRASSE:
        return STRASSE_EDEFAULT == null ? strasse != null : !STRASSE_EDEFAULT.equals(strasse);
      case FinPackage.KONTAKT__PLZ:
        return plz != PLZ_EDEFAULT;
      case FinPackage.KONTAKT__ORT:
        return ORT_EDEFAULT == null ? ort != null : !ORT_EDEFAULT.equals(ort);
      case FinPackage.KONTAKT__BEMERKUNG:
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
    result.append(" (vorname: ");
    result.append(vorname);
    result.append(", nachname: ");
    result.append(nachname);
    result.append(", strasse: ");
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

} //KontaktImpl
