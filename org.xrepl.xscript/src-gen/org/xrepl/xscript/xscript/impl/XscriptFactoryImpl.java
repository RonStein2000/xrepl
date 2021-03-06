/**
 * <copyright>
 * </copyright>
 *
 */
package org.xrepl.xscript.xscript.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xrepl.xscript.xscript.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XscriptFactoryImpl extends EFactoryImpl implements XscriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XscriptFactory init()
  {
    try
    {
      XscriptFactory theXscriptFactory = (XscriptFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xrepl.org/xscript"); 
      if (theXscriptFactory != null)
      {
        return theXscriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XscriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XscriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XscriptPackage.XNEW_EOBJECT: return createXNewEObject();
      case XscriptPackage.XIMPORT: return createXImport();
      case XscriptPackage.XE_PACKAGE_IMPORT: return createXEPackageImport();
      case XscriptPackage.XSCRIPT: return createXScript();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNewEObject createXNewEObject()
  {
    XNewEObjectImpl xNewEObject = new XNewEObjectImpl();
    return xNewEObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XImport createXImport()
  {
    XImportImpl xImport = new XImportImpl();
    return xImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XEPackageImport createXEPackageImport()
  {
    XEPackageImportImpl xePackageImport = new XEPackageImportImpl();
    return xePackageImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XScript createXScript()
  {
    XScriptImpl xScript = new XScriptImpl();
    return xScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XscriptPackage getXscriptPackage()
  {
    return (XscriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XscriptPackage getPackage()
  {
    return XscriptPackage.eINSTANCE;
  }

} //XscriptFactoryImpl
