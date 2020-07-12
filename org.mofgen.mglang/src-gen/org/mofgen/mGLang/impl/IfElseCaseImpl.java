/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mofgen.mGLang.ArithmeticExpression;
import org.mofgen.mGLang.CaseBody;
import org.mofgen.mGLang.IfElseCase;
import org.mofgen.mGLang.MGLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.impl.IfElseCaseImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.mofgen.mGLang.impl.IfElseCaseImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfElseCaseImpl extends MinimalEObjectImpl.Container implements IfElseCase
{
  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected ArithmeticExpression val;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected CaseBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfElseCaseImpl()
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
    return MGLangPackage.Literals.IF_ELSE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticExpression getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(ArithmeticExpression newVal, NotificationChain msgs)
  {
    ArithmeticExpression oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGLangPackage.IF_ELSE_CASE__VAL, oldVal, newVal);
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
  public void setVal(ArithmeticExpression newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.IF_ELSE_CASE__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.IF_ELSE_CASE__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.IF_ELSE_CASE__VAL, newVal, newVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(CaseBody newBody, NotificationChain msgs)
  {
    CaseBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGLangPackage.IF_ELSE_CASE__BODY, oldBody, newBody);
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
  public void setBody(CaseBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.IF_ELSE_CASE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.IF_ELSE_CASE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.IF_ELSE_CASE__BODY, newBody, newBody));
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
      case MGLangPackage.IF_ELSE_CASE__VAL:
        return basicSetVal(null, msgs);
      case MGLangPackage.IF_ELSE_CASE__BODY:
        return basicSetBody(null, msgs);
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
      case MGLangPackage.IF_ELSE_CASE__VAL:
        return getVal();
      case MGLangPackage.IF_ELSE_CASE__BODY:
        return getBody();
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
      case MGLangPackage.IF_ELSE_CASE__VAL:
        setVal((ArithmeticExpression)newValue);
        return;
      case MGLangPackage.IF_ELSE_CASE__BODY:
        setBody((CaseBody)newValue);
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
      case MGLangPackage.IF_ELSE_CASE__VAL:
        setVal((ArithmeticExpression)null);
        return;
      case MGLangPackage.IF_ELSE_CASE__BODY:
        setBody((CaseBody)null);
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
      case MGLangPackage.IF_ELSE_CASE__VAL:
        return val != null;
      case MGLangPackage.IF_ELSE_CASE__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //IfElseCaseImpl