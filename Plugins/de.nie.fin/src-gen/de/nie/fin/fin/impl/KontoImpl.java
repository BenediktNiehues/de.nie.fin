/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Konto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Konto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nie.fin.fin.impl.KontoImpl#getKtoNr <em>Kto Nr</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontoImpl#getBlz <em>Blz</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontoImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontoImpl#getVerwendung <em>Verwendung</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.KontoImpl#getInhaber <em>Inhaber</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KontoImpl extends ElementImpl implements Konto
{
  /**
   * The default value of the '{@link #getKtoNr() <em>Kto Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKtoNr()
   * @generated
   * @ordered
   */
  protected static final int KTO_NR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getKtoNr() <em>Kto Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKtoNr()
   * @generated
   * @ordered
   */
  protected int ktoNr = KTO_NR_EDEFAULT;

  /**
   * The default value of the '{@link #getBlz() <em>Blz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlz()
   * @generated
   * @ordered
   */
  protected static final int BLZ_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBlz() <em>Blz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlz()
   * @generated
   * @ordered
   */
  protected int blz = BLZ_EDEFAULT;

  /**
   * The default value of the '{@link #getBank() <em>Bank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBank()
   * @generated
   * @ordered
   */
  protected static final String BANK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBank() <em>Bank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBank()
   * @generated
   * @ordered
   */
  protected String bank = BANK_EDEFAULT;

  /**
   * The default value of the '{@link #getVerwendung() <em>Verwendung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerwendung()
   * @generated
   * @ordered
   */
  protected static final String VERWENDUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVerwendung() <em>Verwendung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerwendung()
   * @generated
   * @ordered
   */
  protected String verwendung = VERWENDUNG_EDEFAULT;

  /**
   * The default value of the '{@link #getInhaber() <em>Inhaber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInhaber()
   * @generated
   * @ordered
   */
  protected static final String INHABER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInhaber() <em>Inhaber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInhaber()
   * @generated
   * @ordered
   */
  protected String inhaber = INHABER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KontoImpl()
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
    return FinPackage.Literals.KONTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getKtoNr()
  {
    return ktoNr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKtoNr(int newKtoNr)
  {
    int oldKtoNr = ktoNr;
    ktoNr = newKtoNr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTO__KTO_NR, oldKtoNr, ktoNr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBlz()
  {
    return blz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlz(int newBlz)
  {
    int oldBlz = blz;
    blz = newBlz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTO__BLZ, oldBlz, blz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBank()
  {
    return bank;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBank(String newBank)
  {
    String oldBank = bank;
    bank = newBank;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTO__BANK, oldBank, bank));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVerwendung()
  {
    return verwendung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerwendung(String newVerwendung)
  {
    String oldVerwendung = verwendung;
    verwendung = newVerwendung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTO__VERWENDUNG, oldVerwendung, verwendung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInhaber()
  {
    return inhaber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInhaber(String newInhaber)
  {
    String oldInhaber = inhaber;
    inhaber = newInhaber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.KONTO__INHABER, oldInhaber, inhaber));
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
      case FinPackage.KONTO__KTO_NR:
        return getKtoNr();
      case FinPackage.KONTO__BLZ:
        return getBlz();
      case FinPackage.KONTO__BANK:
        return getBank();
      case FinPackage.KONTO__VERWENDUNG:
        return getVerwendung();
      case FinPackage.KONTO__INHABER:
        return getInhaber();
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
      case FinPackage.KONTO__KTO_NR:
        setKtoNr((Integer)newValue);
        return;
      case FinPackage.KONTO__BLZ:
        setBlz((Integer)newValue);
        return;
      case FinPackage.KONTO__BANK:
        setBank((String)newValue);
        return;
      case FinPackage.KONTO__VERWENDUNG:
        setVerwendung((String)newValue);
        return;
      case FinPackage.KONTO__INHABER:
        setInhaber((String)newValue);
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
      case FinPackage.KONTO__KTO_NR:
        setKtoNr(KTO_NR_EDEFAULT);
        return;
      case FinPackage.KONTO__BLZ:
        setBlz(BLZ_EDEFAULT);
        return;
      case FinPackage.KONTO__BANK:
        setBank(BANK_EDEFAULT);
        return;
      case FinPackage.KONTO__VERWENDUNG:
        setVerwendung(VERWENDUNG_EDEFAULT);
        return;
      case FinPackage.KONTO__INHABER:
        setInhaber(INHABER_EDEFAULT);
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
      case FinPackage.KONTO__KTO_NR:
        return ktoNr != KTO_NR_EDEFAULT;
      case FinPackage.KONTO__BLZ:
        return blz != BLZ_EDEFAULT;
      case FinPackage.KONTO__BANK:
        return BANK_EDEFAULT == null ? bank != null : !BANK_EDEFAULT.equals(bank);
      case FinPackage.KONTO__VERWENDUNG:
        return VERWENDUNG_EDEFAULT == null ? verwendung != null : !VERWENDUNG_EDEFAULT.equals(verwendung);
      case FinPackage.KONTO__INHABER:
        return INHABER_EDEFAULT == null ? inhaber != null : !INHABER_EDEFAULT.equals(inhaber);
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
    result.append(" (ktoNr: ");
    result.append(ktoNr);
    result.append(", blz: ");
    result.append(blz);
    result.append(", bank: ");
    result.append(bank);
    result.append(", verwendung: ");
    result.append(verwendung);
    result.append(", inhaber: ");
    result.append(inhaber);
    result.append(')');
    return result.toString();
  }

} //KontoImpl
