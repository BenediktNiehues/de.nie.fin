/**
 */
package de.nie.fin.fin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Buchungsart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.nie.fin.fin.FinPackage#getBuchungsart()
 * @model
 * @generated
 */
public enum Buchungsart implements Enumerator
{
  /**
   * The '<em><b>DAUERAUFTRAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAUERAUFTRAG_VALUE
   * @generated
   * @ordered
   */
  DAUERAUFTRAG(0, "DAUERAUFTRAG", "Dauerauftrag"),

  /**
   * The '<em><b>UEBERWEISUNG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UEBERWEISUNG_VALUE
   * @generated
   * @ordered
   */
  UEBERWEISUNG(1, "UEBERWEISUNG", "\u00dcberweisung"),

  /**
   * The '<em><b>ABBUCHUNG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABBUCHUNG_VALUE
   * @generated
   * @ordered
   */
  ABBUCHUNG(2, "ABBUCHUNG", "Abbuchung");

  /**
   * The '<em><b>DAUERAUFTRAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAUERAUFTRAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAUERAUFTRAG
   * @model literal="Dauerauftrag"
   * @generated
   * @ordered
   */
  public static final int DAUERAUFTRAG_VALUE = 0;

  /**
   * The '<em><b>UEBERWEISUNG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UEBERWEISUNG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UEBERWEISUNG
   * @model literal="\334berweisung"
   * @generated
   * @ordered
   */
  public static final int UEBERWEISUNG_VALUE = 1;

  /**
   * The '<em><b>ABBUCHUNG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ABBUCHUNG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABBUCHUNG
   * @model literal="Abbuchung"
   * @generated
   * @ordered
   */
  public static final int ABBUCHUNG_VALUE = 2;

  /**
   * An array of all the '<em><b>Buchungsart</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Buchungsart[] VALUES_ARRAY =
    new Buchungsart[]
    {
      DAUERAUFTRAG,
      UEBERWEISUNG,
      ABBUCHUNG,
    };

  /**
   * A public read-only list of all the '<em><b>Buchungsart</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Buchungsart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Buchungsart</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Buchungsart get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Buchungsart result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Buchungsart</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Buchungsart getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Buchungsart result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Buchungsart</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Buchungsart get(int value)
  {
    switch (value)
    {
      case DAUERAUFTRAG_VALUE: return DAUERAUFTRAG;
      case UEBERWEISUNG_VALUE: return UEBERWEISUNG;
      case ABBUCHUNG_VALUE: return ABBUCHUNG;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Buchungsart(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Buchungsart
