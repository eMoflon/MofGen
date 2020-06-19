/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.PatternCall;
import org.mofgen.mGLang.PatternObject;
import org.mofgen.mGLang.PatternObjectCreation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Object Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.impl.PatternObjectCreationImpl#getPObject <em>PObject</em>}</li>
 *   <li>{@link org.mofgen.mGLang.impl.PatternObjectCreationImpl#getPatternCall <em>Pattern Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternObjectCreationImpl extends GeneratorCommandImpl implements PatternObjectCreation
{
  /**
   * The cached value of the '{@link #getPObject() <em>PObject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPObject()
   * @generated
   * @ordered
   */
  protected PatternObject pObject;

  /**
   * The cached value of the '{@link #getPatternCall() <em>Pattern Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternCall()
   * @generated
   * @ordered
   */
  protected PatternCall patternCall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternObjectCreationImpl()
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
    return MGLangPackage.Literals.PATTERN_OBJECT_CREATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternObject getPObject()
  {
    return pObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPObject(PatternObject newPObject, NotificationChain msgs)
  {
    PatternObject oldPObject = pObject;
    pObject = newPObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT, oldPObject, newPObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPObject(PatternObject newPObject)
  {
    if (newPObject != pObject)
    {
      NotificationChain msgs = null;
      if (pObject != null)
        msgs = ((InternalEObject)pObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT, null, msgs);
      if (newPObject != null)
        msgs = ((InternalEObject)newPObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT, null, msgs);
      msgs = basicSetPObject(newPObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT, newPObject, newPObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternCall getPatternCall()
  {
    return patternCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatternCall(PatternCall newPatternCall, NotificationChain msgs)
  {
    PatternCall oldPatternCall = patternCall;
    patternCall = newPatternCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL, oldPatternCall, newPatternCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPatternCall(PatternCall newPatternCall)
  {
    if (newPatternCall != patternCall)
    {
      NotificationChain msgs = null;
      if (patternCall != null)
        msgs = ((InternalEObject)patternCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL, null, msgs);
      if (newPatternCall != null)
        msgs = ((InternalEObject)newPatternCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL, null, msgs);
      msgs = basicSetPatternCall(newPatternCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL, newPatternCall, newPatternCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT:
        return basicSetPObject(null, msgs);
      case MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL:
        return basicSetPatternCall(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT:
        return getPObject();
      case MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL:
        return getPatternCall();
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
      case MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT:
        setPObject((PatternObject)newValue);
        return;
      case MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL:
        setPatternCall((PatternCall)newValue);
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
      case MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT:
        setPObject((PatternObject)null);
        return;
      case MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL:
        setPatternCall((PatternCall)null);
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
      case MGLangPackage.PATTERN_OBJECT_CREATION__POBJECT:
        return pObject != null;
      case MGLangPackage.PATTERN_OBJECT_CREATION__PATTERN_CALL:
        return patternCall != null;
    }
    return super.eIsSet(featureID);
  }

} //PatternObjectCreationImpl
