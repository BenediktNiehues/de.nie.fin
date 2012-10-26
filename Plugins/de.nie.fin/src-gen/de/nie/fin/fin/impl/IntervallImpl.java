/**
 */
package de.nie.fin.fin.impl;

import de.nie.fin.fin.FinPackage;
import de.nie.fin.fin.Intervall;
import de.nie.fin.fin.Kategorie;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nie.fin.fin.impl.IntervallImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.IntervallImpl#getMonate <em>Monate</em>}</li>
 *   <li>{@link de.nie.fin.fin.impl.IntervallImpl#getKategorie <em>Kategorie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervallImpl extends BuchungImpl implements Intervall
{
  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

  /**
   * The cached value of the '{@link #getMonate() <em>Monate</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonate()
   * @generated
   * @ordered
   */
  protected EList<String> monate;

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
  protected IntervallImpl()
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
    return FinPackage.Literals.INTERVALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(String newTag)
  {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.INTERVALL__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMonate()
  {
    if (monate == null)
    {
      monate = new EDataTypeEList<String>(String.class, this, FinPackage.INTERVALL__MONATE);
    }
    return monate;
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
      kategorie = new EObjectResolvingEList<Kategorie>(Kategorie.class, this, FinPackage.INTERVALL__KATEGORIE);
    }
    return kategorie;
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
      case FinPackage.INTERVALL__TAG:
        return getTag();
      case FinPackage.INTERVALL__MONATE:
        return getMonate();
      case FinPackage.INTERVALL__KATEGORIE:
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
      case FinPackage.INTERVALL__TAG:
        setTag((String)newValue);
        return;
      case FinPackage.INTERVALL__MONATE:
        getMonate().clear();
        getMonate().addAll((Collection<? extends String>)newValue);
        return;
      case FinPackage.INTERVALL__KATEGORIE:
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
      case FinPackage.INTERVALL__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case FinPackage.INTERVALL__MONATE:
        getMonate().clear();
        return;
      case FinPackage.INTERVALL__KATEGORIE:
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
      case FinPackage.INTERVALL__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case FinPackage.INTERVALL__MONATE:
        return monate != null && !monate.isEmpty();
      case FinPackage.INTERVALL__KATEGORIE:
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
    result.append(" (tag: ");
    result.append(tag);
    result.append(", monate: ");
    result.append(monate);
    result.append(')');
    return result.toString();
  }

} //IntervallImpl
