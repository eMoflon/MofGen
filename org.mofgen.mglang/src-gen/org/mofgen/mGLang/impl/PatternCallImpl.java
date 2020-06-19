/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.Pattern;
import org.mofgen.mGLang.PatternCall;
import org.mofgen.mGLang.PatternObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.impl.PatternCallImpl#getCalledPattern <em>Called Pattern</em>}</li>
 *   <li>{@link org.mofgen.mGLang.impl.PatternCallImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternCallImpl extends GeneratorCommandImpl implements PatternCall
{
  /**
   * The cached value of the '{@link #getCalledPattern() <em>Called Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledPattern()
   * @generated
   * @ordered
   */
  protected Pattern calledPattern;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<PatternObject> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternCallImpl()
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
    return MGLangPackage.Literals.PATTERN_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern getCalledPattern()
  {
    if (calledPattern != null && calledPattern.eIsProxy())
    {
      InternalEObject oldCalledPattern = (InternalEObject)calledPattern;
      calledPattern = (Pattern)eResolveProxy(oldCalledPattern);
      if (calledPattern != oldCalledPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MGLangPackage.PATTERN_CALL__CALLED_PATTERN, oldCalledPattern, calledPattern));
      }
    }
    return calledPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern basicGetCalledPattern()
  {
    return calledPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCalledPattern(Pattern newCalledPattern)
  {
    Pattern oldCalledPattern = calledPattern;
    calledPattern = newCalledPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_CALL__CALLED_PATTERN, oldCalledPattern, calledPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PatternObject> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<PatternObject>(PatternObject.class, this, MGLangPackage.PATTERN_CALL__PARAMS);
    }
    return params;
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
      case MGLangPackage.PATTERN_CALL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case MGLangPackage.PATTERN_CALL__CALLED_PATTERN:
        if (resolve) return getCalledPattern();
        return basicGetCalledPattern();
      case MGLangPackage.PATTERN_CALL__PARAMS:
        return getParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MGLangPackage.PATTERN_CALL__CALLED_PATTERN:
        setCalledPattern((Pattern)newValue);
        return;
      case MGLangPackage.PATTERN_CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends PatternObject>)newValue);
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
      case MGLangPackage.PATTERN_CALL__CALLED_PATTERN:
        setCalledPattern((Pattern)null);
        return;
      case MGLangPackage.PATTERN_CALL__PARAMS:
        getParams().clear();
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
      case MGLangPackage.PATTERN_CALL__CALLED_PATTERN:
        return calledPattern != null;
      case MGLangPackage.PATTERN_CALL__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PatternCallImpl
