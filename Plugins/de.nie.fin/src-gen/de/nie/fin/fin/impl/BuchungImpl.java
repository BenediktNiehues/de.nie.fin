/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.Buchung;
import de.nie.fin.fin.Buchungsintervall;
import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Intervall;
import de.nie.fin.fin.Kategorie;
import de.nie.fin.fin.Kontakt;
import de.nie.fin.fin.Konto;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getEmpfaengerKto <em>Empfaenger Kto</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getVon <em>Von</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getVonKto <em>Von Kto</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getIntervall <em>Intervall</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getBuchInterv <em>Buch Interv</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.BuchungImpl#getKategorie <em>Kategorie</em>}</li>
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
  protected Kontakt empfaenger;

  /**
   * The cached value of the '{@link #getEmpfaengerKto() <em>Empfaenger Kto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpfaengerKto()
   * @generated
   * @ordered
   */
  protected Konto empfaengerKto;

  /**
   * The cached value of the '{@link #getVon() <em>Von</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVon()
   * @generated
   * @ordered
   */
  protected Kontakt von;

  /**
   * The cached value of the '{@link #getVonKto() <em>Von Kto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVonKto()
   * @generated
   * @ordered
   */
  protected Konto vonKto;

  /**
   * The cached value of the '{@link #getIntervall() <em>Intervall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntervall()
   * @generated
   * @ordered
   */
  protected Intervall intervall;

  /**
   * The cached value of the '{@link #getBuchInterv() <em>Buch Interv</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuchInterv()
   * @generated
   * @ordered
   */
  protected Buchungsintervall buchInterv;

  /**
   * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKategorie()
   * @generated
   * @ordered
   */
  protected EList<Kategorie> kategorie;

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
  public Kontakt getEmpfaenger()
  {
    if (empfaenger != null && empfaenger.eIsProxy())
    {
      InternalEObject oldEmpfaenger = (InternalEObject)empfaenger;
      empfaenger = (Kontakt)eResolveProxy(oldEmpfaenger);
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
  public Kontakt basicGetEmpfaenger()
  {
    return empfaenger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpfaenger(Kontakt newEmpfaenger)
  {
    Kontakt oldEmpfaenger = empfaenger;
    empfaenger = newEmpfaenger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__EMPFAENGER, oldEmpfaenger, empfaenger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Konto getEmpfaengerKto()
  {
    if (empfaengerKto != null && empfaengerKto.eIsProxy())
    {
      InternalEObject oldEmpfaengerKto = (InternalEObject)empfaengerKto;
      empfaengerKto = (Konto)eResolveProxy(oldEmpfaengerKto);
      if (empfaengerKto != oldEmpfaengerKto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinPackage.BUCHUNG__EMPFAENGER_KTO, oldEmpfaengerKto, empfaengerKto));
      }
    }
    return empfaengerKto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Konto basicGetEmpfaengerKto()
  {
    return empfaengerKto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpfaengerKto(Konto newEmpfaengerKto)
  {
    Konto oldEmpfaengerKto = empfaengerKto;
    empfaengerKto = newEmpfaengerKto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__EMPFAENGER_KTO, oldEmpfaengerKto, empfaengerKto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kontakt getVon()
  {
    if (von != null && von.eIsProxy())
    {
      InternalEObject oldVon = (InternalEObject)von;
      von = (Kontakt)eResolveProxy(oldVon);
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
  public Kontakt basicGetVon()
  {
    return von;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVon(Kontakt newVon)
  {
    Kontakt oldVon = von;
    von = newVon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__VON, oldVon, von));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Konto getVonKto()
  {
    if (vonKto != null && vonKto.eIsProxy())
    {
      InternalEObject oldVonKto = (InternalEObject)vonKto;
      vonKto = (Konto)eResolveProxy(oldVonKto);
      if (vonKto != oldVonKto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinPackage.BUCHUNG__VON_KTO, oldVonKto, vonKto));
      }
    }
    return vonKto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Konto basicGetVonKto()
  {
    return vonKto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVonKto(Konto newVonKto)
  {
    Konto oldVonKto = vonKto;
    vonKto = newVonKto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__VON_KTO, oldVonKto, vonKto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intervall getIntervall()
  {
    return intervall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntervall(Intervall newIntervall, NotificationChain msgs)
  {
    Intervall oldIntervall = intervall;
    intervall = newIntervall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__INTERVALL, oldIntervall, newIntervall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntervall(Intervall newIntervall)
  {
    if (newIntervall != intervall)
    {
      NotificationChain msgs = null;
      if (intervall != null)
        msgs = ((InternalEObject)intervall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinPackage.BUCHUNG__INTERVALL, null, msgs);
      if (newIntervall != null)
        msgs = ((InternalEObject)newIntervall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinPackage.BUCHUNG__INTERVALL, null, msgs);
      msgs = basicSetIntervall(newIntervall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__INTERVALL, newIntervall, newIntervall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buchungsintervall getBuchInterv()
  {
    if (buchInterv != null && buchInterv.eIsProxy())
    {
      InternalEObject oldBuchInterv = (InternalEObject)buchInterv;
      buchInterv = (Buchungsintervall)eResolveProxy(oldBuchInterv);
      if (buchInterv != oldBuchInterv)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinPackage.BUCHUNG__BUCH_INTERV, oldBuchInterv, buchInterv));
      }
    }
    return buchInterv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buchungsintervall basicGetBuchInterv()
  {
    return buchInterv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuchInterv(Buchungsintervall newBuchInterv)
  {
    Buchungsintervall oldBuchInterv = buchInterv;
    buchInterv = newBuchInterv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNG__BUCH_INTERV, oldBuchInterv, buchInterv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Kategorie> getKategorie()
  {
    if (kategorie == null)
    {
      kategorie = new EObjectResolvingEList<Kategorie>(Kategorie.class, this, FinPackage.BUCHUNG__KATEGORIE);
    }
    return kategorie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FinPackage.BUCHUNG__INTERVALL:
        return basicSetIntervall(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FinPackage.BUCHUNG__EMPFAENGER_KTO:
        if (resolve) return getEmpfaengerKto();
        return basicGetEmpfaengerKto();
      case FinPackage.BUCHUNG__VON:
        if (resolve) return getVon();
        return basicGetVon();
      case FinPackage.BUCHUNG__VON_KTO:
        if (resolve) return getVonKto();
        return basicGetVonKto();
      case FinPackage.BUCHUNG__INTERVALL:
        return getIntervall();
      case FinPackage.BUCHUNG__BUCH_INTERV:
        if (resolve) return getBuchInterv();
        return basicGetBuchInterv();
      case FinPackage.BUCHUNG__KATEGORIE:
        return getKategorie();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
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
        setEmpfaenger((Kontakt)newValue);
        return;
      case FinPackage.BUCHUNG__EMPFAENGER_KTO:
        setEmpfaengerKto((Konto)newValue);
        return;
      case FinPackage.BUCHUNG__VON:
        setVon((Kontakt)newValue);
        return;
      case FinPackage.BUCHUNG__VON_KTO:
        setVonKto((Konto)newValue);
        return;
      case FinPackage.BUCHUNG__INTERVALL:
        setIntervall((Intervall)newValue);
        return;
      case FinPackage.BUCHUNG__BUCH_INTERV:
        setBuchInterv((Buchungsintervall)newValue);
        return;
      case FinPackage.BUCHUNG__KATEGORIE:
        getKategorie().clear();
        getKategorie().addAll((Collection<? extends Kategorie>)newValue);
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
        setEmpfaenger((Kontakt)null);
        return;
      case FinPackage.BUCHUNG__EMPFAENGER_KTO:
        setEmpfaengerKto((Konto)null);
        return;
      case FinPackage.BUCHUNG__VON:
        setVon((Kontakt)null);
        return;
      case FinPackage.BUCHUNG__VON_KTO:
        setVonKto((Konto)null);
        return;
      case FinPackage.BUCHUNG__INTERVALL:
        setIntervall((Intervall)null);
        return;
      case FinPackage.BUCHUNG__BUCH_INTERV:
        setBuchInterv((Buchungsintervall)null);
        return;
      case FinPackage.BUCHUNG__KATEGORIE:
        getKategorie().clear();
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
      case FinPackage.BUCHUNG__EMPFAENGER_KTO:
        return empfaengerKto != null;
      case FinPackage.BUCHUNG__VON:
        return von != null;
      case FinPackage.BUCHUNG__VON_KTO:
        return vonKto != null;
      case FinPackage.BUCHUNG__INTERVALL:
        return intervall != null;
      case FinPackage.BUCHUNG__BUCH_INTERV:
        return buchInterv != null;
      case FinPackage.BUCHUNG__KATEGORIE:
        return kategorie != null && !kategorie.isEmpty();
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
