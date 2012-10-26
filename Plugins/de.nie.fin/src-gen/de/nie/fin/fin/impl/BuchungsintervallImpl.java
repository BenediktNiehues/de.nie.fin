/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.Buchungsintervall;
import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Intervall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buchungsintervall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nie.fin.fin.impl.BuchungsintervallImpl#getIntervall <em>Intervall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuchungsintervallImpl extends ElementImpl implements Buchungsintervall
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuchungsintervallImpl()
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
    return FinPackage.Literals.BUCHUNGSINTERVALL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNGSINTERVALL__INTERVALL, oldIntervall, newIntervall);
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
        msgs = ((InternalEObject)intervall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinPackage.BUCHUNGSINTERVALL__INTERVALL, null, msgs);
      if (newIntervall != null)
        msgs = ((InternalEObject)newIntervall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinPackage.BUCHUNGSINTERVALL__INTERVALL, null, msgs);
      msgs = basicSetIntervall(newIntervall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BUCHUNGSINTERVALL__INTERVALL, newIntervall, newIntervall));
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
      case FinPackage.BUCHUNGSINTERVALL__INTERVALL:
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
      case FinPackage.BUCHUNGSINTERVALL__INTERVALL:
        return getIntervall();
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
      case FinPackage.BUCHUNGSINTERVALL__INTERVALL:
        setIntervall((Intervall)newValue);
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
      case FinPackage.BUCHUNGSINTERVALL__INTERVALL:
        setIntervall((Intervall)null);
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
      case FinPackage.BUCHUNGSINTERVALL__INTERVALL:
        return intervall != null;
    }
    return super.eIsSet(featureID);
  }

} //BuchungsintervallImpl
