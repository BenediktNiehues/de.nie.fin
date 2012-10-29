/**
 */
package de.nie.fin.fin.util;

import de.nie.fin.fin.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.nie.fin.fin.FinPackage
 * @generated
 */
public class FinAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FinPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FinPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FinSwitch<Adapter> modelSwitch =
    new FinSwitch<Adapter>()
    {
      @Override
      public Adapter caseFinModelFile(FinModelFile object)
      {
        return createFinModelFileAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseKonto(Konto object)
      {
        return createKontoAdapter();
      }
      @Override
      public Adapter caseBuchungsintervall(Buchungsintervall object)
      {
        return createBuchungsintervallAdapter();
      }
      @Override
      public Adapter caseIntervall(Intervall object)
      {
        return createIntervallAdapter();
      }
      @Override
      public Adapter caseKategorie(Kategorie object)
      {
        return createKategorieAdapter();
      }
      @Override
      public Adapter caseBuchung(Buchung object)
      {
        return createBuchungAdapter();
      }
      @Override
      public Adapter caseKontakt(Kontakt object)
      {
        return createKontaktAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.FinModelFile <em>Model File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.FinModelFile
   * @generated
   */
  public Adapter createFinModelFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Konto <em>Konto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Konto
   * @generated
   */
  public Adapter createKontoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Buchungsintervall <em>Buchungsintervall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Buchungsintervall
   * @generated
   */
  public Adapter createBuchungsintervallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Intervall <em>Intervall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Intervall
   * @generated
   */
  public Adapter createIntervallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Kategorie <em>Kategorie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Kategorie
   * @generated
   */
  public Adapter createKategorieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Buchung <em>Buchung</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Buchung
   * @generated
   */
  public Adapter createBuchungAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nie.fin.fin.Kontakt <em>Kontakt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nie.fin.fin.Kontakt
   * @generated
   */
  public Adapter createKontaktAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FinAdapterFactory
