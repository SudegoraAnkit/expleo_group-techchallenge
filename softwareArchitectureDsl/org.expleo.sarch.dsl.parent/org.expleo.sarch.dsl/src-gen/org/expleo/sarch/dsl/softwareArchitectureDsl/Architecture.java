/**
 * generated by Xtext 2.38.0
 */
package org.expleo.sarch.dsl.softwareArchitectureDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture#getName <em>Name</em>}</li>
 *   <li>{@link org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage#getArchitecture_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.expleo.sarch.dsl.softwareArchitectureDsl.ArchitectureElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage#getArchitecture_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ArchitectureElement> getElements();

} // Architecture
