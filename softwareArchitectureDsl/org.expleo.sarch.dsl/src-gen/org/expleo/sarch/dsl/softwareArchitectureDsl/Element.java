/**
 * generated by Xtext 2.38.0
 */
package org.expleo.sarch.dsl.softwareArchitectureDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.expleo.sarch.dsl.softwareArchitectureDsl.Element#getType <em>Type</em>}</li>
 *   <li>{@link org.expleo.sarch.dsl.softwareArchitectureDsl.Element#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.expleo.sarch.dsl.softwareArchitectureDsl.DataType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.expleo.sarch.dsl.softwareArchitectureDsl.DataType
   * @see #setType(DataType)
   * @see org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage#getElement_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link org.expleo.sarch.dsl.softwareArchitectureDsl.Element#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.expleo.sarch.dsl.softwareArchitectureDsl.DataType
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage#getElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.expleo.sarch.dsl.softwareArchitectureDsl.Element#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Element
