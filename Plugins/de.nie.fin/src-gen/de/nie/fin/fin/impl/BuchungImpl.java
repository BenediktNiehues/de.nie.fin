/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.Buchung;
import de.nie.fin.fin.Buchungsintervall;
import de.nie.fin.fin.Empfaenger;
import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Konto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buchung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getKonto <em>Konto</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getEmpfaenger <em>Empfaenger</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getVon <em>Von</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getIntervall <em>Intervall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuchungImpl extends ElementImpl implements Buchung
{
  /**
   * The cached value of the '{@link #getKonto() <em>Konto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKonto()
   * @generated
   * @ordered
   */
  protected Konto konto;

  /**
   * The default value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBetrag()
   * @generated
   * @ordered
   */
  protected static final int BETRAG_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBetrag()
   * @generated
   * @ordered
   */
  protected int betrag = BETRAG_EDEFAULT;

  /**
   * The cached value of the '{@link #getEmpfaenger() <em>Empfaenger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpfaenger()
   * @generated
   * @ordered
   */
  protected Empfaenger empfaenger;

  /**
   * The cached value of the '{@link #getVon() <em>Von</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVon()
   * @generated
   * @ordered
   */
  protected Empfaenger von;

  /**
   * The cached value of the '{@link #getIntervall() <em>Intervall</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntervall()
   * @generated
   * @ordered
   */
  protected Buchungsintervall intervall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuchungImpl()
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
    return FinPackage.Literals.BUCHUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Konto getKonto()
  {
    if (konto != null && konto.eIsProxy())
    {
      InternalEObject oldKonto = (InternalEObject)konto;
      konto = (Konto)eResolveProxy(oldKonto);
      if (konto != oldKonto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinPackage.BUCHUNG__KONTO, oldKonto, konto));
      }
    }
    return konto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Konto basicGetKonto()
  {
    return konto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKonto(Konto newKonto)
  {
    Konto oldKonto = konto;
    konto = newKonto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__KONTO, oldKonto, konto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBetrag()
  {
    return betrag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBetrag(int newBetrag)
  {
    int oldBetrag = betrag;
    betrag = newBetrag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__BETRAG, oldBetrag, betrag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empfaenger getEmpfaenger()
  {
    if (empfaenger != null && empfaenger.eIsProxy())
    {
      InternalEObject oldEmpfaenger = (InternalEObject)empfaenger;
      empfaenger = (Empfaenger)eResolveProxy(oldEmpfaenger);
      if (empfaenger != oldEmpfaenger)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinPackage.BUCHUNG__EMPFAENGER, oldEmpfaenger, empfaenger));
      }
    }
    return empfaenger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empfaenger basicGetEmpfaenger()
  {
    return empfaenger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpfaenger(Empfaenger newEmpfaenger)
  {
    Empfaenger oldEmpfaenger = empfaenger;
    empfaenger = newEmpfaenger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__EMPFAENGER, oldEmpfaenger, empfaenger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empfaenger getVon()
  {
    if (von != null && von.eIsProxy())
    {
      InternalEObject oldVon = (InternalEObject)von;
      von = (Empfaenger)eResolveProxy(oldVon);
      if (von != oldVon)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinPackage.BUCHUNG__VON, oldVon, von));
      }
    }
    return von;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empfaenger basicGetVon()
  {
    return von;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVon(Empfaenger newVon)
  {
    Empfaenger oldVon = von;
    von = newVon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__VON, oldVon, von));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buchungsintervall getIntervall()
  {
    if (intervall != null && intervall.eIsProxy())
    {
      InternalEObject oldIntervall = (InternalEObject)intervall;
      intervall = (Buchungsintervall)eResolveProxy(oldIntervall);
      if (intervall != oldIntervall)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinPackage.BUCHUNG__INTERVALL, oldIntervall, intervall));
      }
    }
    return intervall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buchungsintervall basicGetIntervall()
  {
    return intervall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntervall(Buchungsintervall newIntervall)
  {
    Buchungsintervall oldIntervall = intervall;
    intervall = newIntervall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__INTERVALL, oldIntervall, intervall));
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
      case FinPackage.BUCHUNG__KONTO:
        if (resolve) return getKonto();
        return basicGetKonto();
      case FinPackage.BUCHUNG__BETRAG:
        return getBetrag();
      case FinPackage.BUCHUNG__EMPFAENGER:
        if (resolve) return getEmpfaenger();
        return basicGetEmpfaenger();
      case FinPackage.BUCHUNG__VON:
        if (resolve) return getVon();
        return basicGetVon();
      case FinPackage.BUCHUNG__INTERVALL:
        if (resolve) return getIntervall();
        return basicGetIntervall();
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
      case FinPackage.BUCHUNG__KONTO:
        setKonto((Konto)newValue);
        return;
      case FinPackage.BUCHUNG__BETRAG:
        setBetrag((Integer)newValue);
        return;
      case FinPackage.BUCHUNG__EMPFAENGER:
        setEmpfaenger((Empfaenger)newValue);
        return;
      case FinPackage.BUCHUNG__VON:
        setVon((Empfaenger)newValue);
        return;
      case FinPackage.BUCHUNG__INTERVALL:
        setIntervall((Buchungsintervall)newValue);
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
      case FinPackage.BUCHUNG__KONTO:
        setKonto((Konto)null);
        return;
      case FinPackage.BUCHUNG__BETRAG:
        setBetrag(BETRAG_EDEFAULT);
        return;
      case FinPackage.BUCHUNG__EMPFAENGER:
        setEmpfaenger((Empfaenger)null);
        return;
      case FinPackage.BUCHUNG__VON:
        setVon((Empfaenger)null);
        return;
      case FinPackage.BUCHUNG__INTERVALL:
        setIntervall((Buchungsintervall)null);
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
      case FinPackage.BUCHUNG__KONTO:
        return konto != null;
      case FinPackage.BUCHUNG__BETRAG:
        return betrag != BETRAG_EDEFAULT;
      case FinPackage.BUCHUNG__EMPFAENGER:
        return empfaenger != null;
      case FinPackage.BUCHUNG__VON:
        return von != null;
      case FinPackage.BUCHUNG__INTERVALL:
        return intervall != null;
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
    result.append(" (betrag: ");
    result.append(betrag);
    result.append(')');
    return result.toString();
  }

} //BuchungImpl
