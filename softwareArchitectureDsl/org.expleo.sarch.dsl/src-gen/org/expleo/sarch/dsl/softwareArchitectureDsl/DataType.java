/**
 * generated by Xtext 2.38.0
 */
package org.expleo.sarch.dsl.softwareArchitectureDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator
{
  /**
   * The '<em><b>String Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_TYPE_VALUE
   * @generated
   * @ordered
   */
  STRING_TYPE(0, "StringType", "String"),

  /**
   * The '<em><b>Int Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_TYPE_VALUE
   * @generated
   * @ordered
   */
  INT_TYPE(1, "IntType", "int"),

  /**
   * The '<em><b>Boolean Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_TYPE_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN_TYPE(2, "BooleanType", "boolean"),

  /**
   * The '<em><b>Float Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_TYPE_VALUE
   * @generated
   * @ordered
   */
  FLOAT_TYPE(3, "FloatType", "float"),

  /**
   * The '<em><b>Double Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_TYPE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE_TYPE(4, "DoubleType", "double"),

  /**
   * The '<em><b>Void Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOID_TYPE_VALUE
   * @generated
   * @ordered
   */
  VOID_TYPE(5, "VoidType", "void");

  /**
   * The '<em><b>String Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_TYPE
   * @model name="StringType" literal="String"
   * @generated
   * @ordered
   */
  public static final int STRING_TYPE_VALUE = 0;

  /**
   * The '<em><b>Int Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_TYPE
   * @model name="IntType" literal="int"
   * @generated
   * @ordered
   */
  public static final int INT_TYPE_VALUE = 1;

  /**
   * The '<em><b>Boolean Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_TYPE
   * @model name="BooleanType" literal="boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_TYPE_VALUE = 2;

  /**
   * The '<em><b>Float Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_TYPE
   * @model name="FloatType" literal="float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_TYPE_VALUE = 3;

  /**
   * The '<em><b>Double Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_TYPE
   * @model name="DoubleType" literal="double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_TYPE_VALUE = 4;

  /**
   * The '<em><b>Void Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOID_TYPE
   * @model name="VoidType" literal="void"
   * @generated
   * @ordered
   */
  public static final int VOID_TYPE_VALUE = 5;

  /**
   * An array of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DataType[] VALUES_ARRAY =
    new DataType[]
    {
      STRING_TYPE,
      INT_TYPE,
      BOOLEAN_TYPE,
      FLOAT_TYPE,
      DOUBLE_TYPE,
      VOID_TYPE,
    };

  /**
   * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataType get(int value)
  {
    switch (value)
    {
      case STRING_TYPE_VALUE: return STRING_TYPE;
      case INT_TYPE_VALUE: return INT_TYPE;
      case BOOLEAN_TYPE_VALUE: return BOOLEAN_TYPE;
      case FLOAT_TYPE_VALUE: return FLOAT_TYPE;
      case DOUBLE_TYPE_VALUE: return DOUBLE_TYPE;
      case VOID_TYPE_VALUE: return VOID_TYPE;
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
  private DataType(int value, String name, String literal)
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
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  
} //DataType
