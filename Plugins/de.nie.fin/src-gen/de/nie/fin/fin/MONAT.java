/**
 */
package de.nie.fin.fin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MONAT</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.nie.fin.fin.FinPackage#getMONAT()
 * @model
 * @generated
 */
public enum MONAT implements Enumerator
{
  /**
   * The '<em><b>ALLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALLE_VALUE
   * @generated
   * @ordered
   */
  ALLE(0, "ALLE", "monatlich"),

  /**
   * The '<em><b>JANUAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JANUAR_VALUE
   * @generated
   * @ordered
   */
  JANUAR(2, "JANUAR", "Januar"),

  /**
   * The '<em><b>FEBRUAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FEBRUAR_VALUE
   * @generated
   * @ordered
   */
  FEBRUAR(4, "FEBRUAR", "Februar"),

  /**
   * The '<em><b>MAERZ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAERZ_VALUE
   * @generated
   * @ordered
   */
  MAERZ(6, "MAERZ", "M\u00e4rz"),

  /**
   * The '<em><b>APRIL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APRIL_VALUE
   * @generated
   * @ordered
   */
  APRIL(8, "APRIL", "April"),

  /**
   * The '<em><b>MAI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAI_VALUE
   * @generated
   * @ordered
   */
  MAI(10, "MAI", "Mai"),

  /**
   * The '<em><b>JUNI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JUNI_VALUE
   * @generated
   * @ordered
   */
  JUNI(12, "JUNI", "Juni"),

  /**
   * The '<em><b>JULI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JULI_VALUE
   * @generated
   * @ordered
   */
  JULI(14, "JULI", "Juli"),

  /**
   * The '<em><b>AUGUST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUGUST_VALUE
   * @generated
   * @ordered
   */
  AUGUST(16, "AUGUST", "August"),

  /**
   * The '<em><b>SEPTEMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEPTEMBER_VALUE
   * @generated
   * @ordered
   */
  SEPTEMBER(18, "SEPTEMBER", "September"),

  /**
   * The '<em><b>OKTOBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OKTOBER_VALUE
   * @generated
   * @ordered
   */
  OKTOBER(20, "OKTOBER", "Oktober"),

  /**
   * The '<em><b>NOVEMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOVEMBER_VALUE
   * @generated
   * @ordered
   */
  NOVEMBER(22, "NOVEMBER", "November"),

  /**
   * The '<em><b>DEZEMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEZEMBER_VALUE
   * @generated
   * @ordered
   */
  DEZEMBER(24, "DEZEMBER", "Dezember"),

  /**
   * The '<em><b>VIERTELJAEHRLICH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VIERTELJAEHRLICH_VALUE
   * @generated
   * @ordered
   */
  VIERTELJAEHRLICH(26, "VIERTELJAEHRLICH", "viertelj\u00e4hrlich"),

  /**
   * The '<em><b>HALBJAEHRLICH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HALBJAEHRLICH_VALUE
   * @generated
   * @ordered
   */
  HALBJAEHRLICH(27, "HALBJAEHRLICH", "halbj\u00e4hrlich");

  /**
   * The '<em><b>ALLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALLE
   * @model literal="monatlich"
   * @generated
   * @ordered
   */
  public static final int ALLE_VALUE = 0;

  /**
   * The '<em><b>JANUAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JANUAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JANUAR
   * @model literal="Januar"
   * @generated
   * @ordered
   */
  public static final int JANUAR_VALUE = 2;

  /**
   * The '<em><b>FEBRUAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FEBRUAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FEBRUAR
   * @model literal="Februar"
   * @generated
   * @ordered
   */
  public static final int FEBRUAR_VALUE = 4;

  /**
   * The '<em><b>MAERZ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAERZ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAERZ
   * @model literal="M\344rz"
   * @generated
   * @ordered
   */
  public static final int MAERZ_VALUE = 6;

  /**
   * The '<em><b>APRIL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>APRIL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APRIL
   * @model literal="April"
   * @generated
   * @ordered
   */
  public static final int APRIL_VALUE = 8;

  /**
   * The '<em><b>MAI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAI
   * @model literal="Mai"
   * @generated
   * @ordered
   */
  public static final int MAI_VALUE = 10;

  /**
   * The '<em><b>JUNI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JUNI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JUNI
   * @model literal="Juni"
   * @generated
   * @ordered
   */
  public static final int JUNI_VALUE = 12;

  /**
   * The '<em><b>JULI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JULI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JULI
   * @model literal="Juli"
   * @generated
   * @ordered
   */
  public static final int JULI_VALUE = 14;

  /**
   * The '<em><b>AUGUST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AUGUST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUGUST
   * @model literal="August"
   * @generated
   * @ordered
   */
  public static final int AUGUST_VALUE = 16;

  /**
   * The '<em><b>SEPTEMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SEPTEMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEPTEMBER
   * @model literal="September"
   * @generated
   * @ordered
   */
  public static final int SEPTEMBER_VALUE = 18;

  /**
   * The '<em><b>OKTOBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OKTOBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OKTOBER
   * @model literal="Oktober"
   * @generated
   * @ordered
   */
  public static final int OKTOBER_VALUE = 20;

  /**
   * The '<em><b>NOVEMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOVEMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOVEMBER
   * @model literal="November"
   * @generated
   * @ordered
   */
  public static final int NOVEMBER_VALUE = 22;

  /**
   * The '<em><b>DEZEMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEZEMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEZEMBER
   * @model literal="Dezember"
   * @generated
   * @ordered
   */
  public static final int DEZEMBER_VALUE = 24;

  /**
   * The '<em><b>VIERTELJAEHRLICH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VIERTELJAEHRLICH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VIERTELJAEHRLICH
   * @model literal="viertelj\344hrlich"
   * @generated
   * @ordered
   */
  public static final int VIERTELJAEHRLICH_VALUE = 26;

  /**
   * The '<em><b>HALBJAEHRLICH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HALBJAEHRLICH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HALBJAEHRLICH
   * @model literal="halbj\344hrlich"
   * @generated
   * @ordered
   */
  public static final int HALBJAEHRLICH_VALUE = 27;

  /**
   * An array of all the '<em><b>MONAT</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MONAT[] VALUES_ARRAY =
    new MONAT[]
    {
      ALLE,
      JANUAR,
      FEBRUAR,
      MAERZ,
      APRIL,
      MAI,
      JUNI,
      JULI,
      AUGUST,
      SEPTEMBER,
      OKTOBER,
      NOVEMBER,
      DEZEMBER,
      VIERTELJAEHRLICH,
      HALBJAEHRLICH,
    };

  /**
   * A public read-only list of all the '<em><b>MONAT</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MONAT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>MONAT</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MONAT get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MONAT result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MONAT</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MONAT getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MONAT result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MONAT</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MONAT get(int value)
  {
    switch (value)
    {
      case ALLE_VALUE: return ALLE;
      case JANUAR_VALUE: return JANUAR;
      case FEBRUAR_VALUE: return FEBRUAR;
      case MAERZ_VALUE: return MAERZ;
      case APRIL_VALUE: return APRIL;
      case MAI_VALUE: return MAI;
      case JUNI_VALUE: return JUNI;
      case JULI_VALUE: return JULI;
      case AUGUST_VALUE: return AUGUST;
      case SEPTEMBER_VALUE: return SEPTEMBER;
      case OKTOBER_VALUE: return OKTOBER;
      case NOVEMBER_VALUE: return NOVEMBER;
      case DEZEMBER_VALUE: return DEZEMBER;
      case VIERTELJAEHRLICH_VALUE: return VIERTELJAEHRLICH;
      case HALBJAEHRLICH_VALUE: return HALBJAEHRLICH;
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
  private MONAT(int value, String name, String literal)
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
  
} //MONAT
