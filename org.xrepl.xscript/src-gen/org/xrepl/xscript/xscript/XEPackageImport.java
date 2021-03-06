/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript.xscript;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XE Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xrepl.xscript.xscript.XEPackageImport#getNsUri <em>Ns Uri</em>}</li>
 *   <li>{@link org.xrepl.xscript.xscript.XEPackageImport#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xrepl.xscript.xscript.XscriptPackage#getXEPackageImport()
 * @model
 * @generated
 */
public interface XEPackageImport extends XExpression
{
  /**
   * Returns the value of the '<em><b>Ns Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns Uri</em>' attribute.
   * @see #setNsUri(String)
   * @see org.xrepl.xscript.xscript.XscriptPackage#getXEPackageImport_NsUri()
   * @model
   * @generated
   */
  String getNsUri();

  /**
   * Sets the value of the '{@link org.xrepl.xscript.xscript.XEPackageImport#getNsUri <em>Ns Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns Uri</em>' attribute.
   * @see #getNsUri()
   * @generated
   */
  void setNsUri(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xrepl.xscript.xscript.XscriptPackage#getXEPackageImport_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xrepl.xscript.xscript.XEPackageImport#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // XEPackageImport
