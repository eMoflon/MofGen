/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mofgen.mGLang.Import;
import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.ParameterNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.impl.ParameterNodeImpl#getSrcModel <em>Src Model</em>}</li>
 *   <li>{@link org.mofgen.mGLang.impl.ParameterNodeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterNodeImpl extends ParameterImpl implements ParameterNode
{
  /**
   * The cached value of the '{@link #getSrcModel() <em>Src Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcModel()
   * @generated
   * @ordered
   */
  protected Import srcModel;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EClassifier type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterNodeImpl()
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
    return MGLangPackage.Literals.PARAMETER_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import getSrcModel()
  {
    if (srcModel != null && srcModel.eIsProxy())
    {
      InternalEObject oldSrcModel = (InternalEObject)srcModel;
      srcModel = (Import)eResolveProxy(oldSrcModel);
      if (srcModel != oldSrcModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MGLangPackage.PARAMETER_NODE__SRC_MODEL, oldSrcModel, srcModel));
      }
    }
    return srcModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetSrcModel()
  {
    return srcModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSrcModel(Import newSrcModel)
  {
    Import oldSrcModel = srcModel;
    srcModel = newSrcModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.PARAMETER_NODE__SRC_MODEL, oldSrcModel, srcModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClassifier getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (EClassifier)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MGLangPackage.PARAMETER_NODE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(EClassifier newType)
  {
    EClassifier oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.PARAMETER_NODE__TYPE, oldType, type));
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
      case MGLangPackage.PARAMETER_NODE__SRC_MODEL:
        if (resolve) return getSrcModel();
        return basicGetSrcModel();
      case MGLangPackage.PARAMETER_NODE__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case MGLangPackage.PARAMETER_NODE__SRC_MODEL:
        setSrcModel((Import)newValue);
        return;
      case MGLangPackage.PARAMETER_NODE__TYPE:
        setType((EClassifier)newValue);
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
      case MGLangPackage.PARAMETER_NODE__SRC_MODEL:
        setSrcModel((Import)null);
        return;
      case MGLangPackage.PARAMETER_NODE__TYPE:
        setType((EClassifier)null);
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
      case MGLangPackage.PARAMETER_NODE__SRC_MODEL:
        return srcModel != null;
      case MGLangPackage.PARAMETER_NODE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterNodeImpl
