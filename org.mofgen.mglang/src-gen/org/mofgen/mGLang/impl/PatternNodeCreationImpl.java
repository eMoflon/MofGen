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

import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.Node;
import org.mofgen.mGLang.NodeConstructor;
import org.mofgen.mGLang.PatternNodeCreation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Node Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mofgen.mGLang.impl.PatternNodeCreationImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.mofgen.mGLang.impl.PatternNodeCreationImpl#getConstructor <em>Constructor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternNodeCreationImpl extends MinimalEObjectImpl.Container implements PatternNodeCreation
{
  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected Node node;

  /**
   * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected NodeConstructor constructor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternNodeCreationImpl()
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
    return MGLangPackage.Literals.PATTERN_NODE_CREATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(Node newNode, NotificationChain msgs)
  {
    Node oldNode = node;
    node = newNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_NODE_CREATION__NODE, oldNode, newNode);
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
  public void setNode(Node newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_NODE_CREATION__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_NODE_CREATION__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_NODE_CREATION__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeConstructor getConstructor()
  {
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstructor(NodeConstructor newConstructor, NotificationChain msgs)
  {
    NodeConstructor oldConstructor = constructor;
    constructor = newConstructor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR, oldConstructor, newConstructor);
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
  public void setConstructor(NodeConstructor newConstructor)
  {
    if (newConstructor != constructor)
    {
      NotificationChain msgs = null;
      if (constructor != null)
        msgs = ((InternalEObject)constructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR, null, msgs);
      if (newConstructor != null)
        msgs = ((InternalEObject)newConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR, null, msgs);
      msgs = basicSetConstructor(newConstructor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR, newConstructor, newConstructor));
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
      case MGLangPackage.PATTERN_NODE_CREATION__NODE:
        return basicSetNode(null, msgs);
      case MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR:
        return basicSetConstructor(null, msgs);
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
      case MGLangPackage.PATTERN_NODE_CREATION__NODE:
        return getNode();
      case MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR:
        return getConstructor();
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
      case MGLangPackage.PATTERN_NODE_CREATION__NODE:
        setNode((Node)newValue);
        return;
      case MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR:
        setConstructor((NodeConstructor)newValue);
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
      case MGLangPackage.PATTERN_NODE_CREATION__NODE:
        setNode((Node)null);
        return;
      case MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR:
        setConstructor((NodeConstructor)null);
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
      case MGLangPackage.PATTERN_NODE_CREATION__NODE:
        return node != null;
      case MGLangPackage.PATTERN_NODE_CREATION__CONSTRUCTOR:
        return constructor != null;
    }
    return super.eIsSet(featureID);
  }

} //PatternNodeCreationImpl
