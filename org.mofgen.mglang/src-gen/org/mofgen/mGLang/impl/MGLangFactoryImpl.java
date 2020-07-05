/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.mGLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mofgen.mGLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MGLangFactoryImpl extends EFactoryImpl implements MGLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MGLangFactory init()
  {
    try
    {
      MGLangFactory theMGLangFactory = (MGLangFactory)EPackage.Registry.INSTANCE.getEFactory(MGLangPackage.eNS_URI);
      if (theMGLangFactory != null)
      {
        return theMGLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MGLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MGLangFactoryImpl()
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
      case MGLangPackage.MOFGEN_FILE: return createMofgenFile();
      case MGLangPackage.IMPORT: return createImport();
      case MGLangPackage.PATTERN: return createPattern();
      case MGLangPackage.PATTERN_RETURN: return createPatternReturn();
      case MGLangPackage.PARAM_MANIPULATION: return createParamManipulation();
      case MGLangPackage.NODE: return createNode();
      case MGLangPackage.NODE_CONTENT: return createNodeContent();
      case MGLangPackage.PATTERN_CALL: return createPatternCall();
      case MGLangPackage.NODE_REFERENCE_OR_ASSIGNMENT: return createNodeReferenceOrAssignment();
      case MGLangPackage.PATTERN_NODE_REFERENCE: return createPatternNodeReference();
      case MGLangPackage.ASSIGNMENT: return createAssignment();
      case MGLangPackage.NODE_ATTRIBUTE_CALL: return createNodeAttributeCall();
      case MGLangPackage.PARAMETER: return createParameter();
      case MGLangPackage.PRIMITIVE_PARAMETER: return createPrimitiveParameter();
      case MGLangPackage.PARAMETER_NODE: return createParameterNode();
      case MGLangPackage.PARAMETER_REF_OR_METHOD_CALL: return createParameterRefOrMethodCall();
      case MGLangPackage.PARAMETER_REF: return createParameterRef();
      case MGLangPackage.METHOD_CALL: return createMethodCall();
      case MGLangPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
      case MGLangPackage.GENERATOR: return createGenerator();
      case MGLangPackage.GENERATOR_EXPRESSION: return createGeneratorExpression();
      case MGLangPackage.PATTERN_OBJECT_CREATION: return createPatternObjectCreation();
      case MGLangPackage.PATTERN_OBJECT: return createPatternObject();
      case MGLangPackage.FOR_STATEMENT: return createForStatement();
      case MGLangPackage.FOR_HEAD: return createForHead();
      case MGLangPackage.GENERAL_FOR_HEAD: return createGeneralForHead();
      case MGLangPackage.FOR_EACH_HEAD: return createForEachHead();
      case MGLangPackage.NODE_OR_PARAMETER_OR_COLLECTION: return createNodeOrParameterOrCollection();
      case MGLangPackage.FOR_BODY: return createForBody();
      case MGLangPackage.IF_STATEMENT: return createIfStatement();
      case MGLangPackage.ELSE_IF_OR_ELSE: return createElseIfOrElse();
      case MGLangPackage.ELSE_STATEMENT: return createElseStatement();
      case MGLangPackage.SWITCH_CASE: return createSwitchCase();
      case MGLangPackage.DEFAULT: return createDefault();
      case MGLangPackage.CASE: return createCase();
      case MGLangPackage.CASE_BODY: return createCaseBody();
      case MGLangPackage.COLLECTION: return createCollection();
      case MGLangPackage.LIST: return createList();
      case MGLangPackage.LIST_AD_HOC: return createListAdHoc();
      case MGLangPackage.MAP: return createMap();
      case MGLangPackage.MAP_AD_HOC: return createMapAdHoc();
      case MGLangPackage.MAP_TUPEL: return createMapTupel();
      case MGLangPackage.FOR_RANGE: return createForRange();
      case MGLangPackage.TERTIARY: return createTertiary();
      case MGLangPackage.SECONDARY: return createSecondary();
      case MGLangPackage.PRIMARY: return createPrimary();
      case MGLangPackage.REL: return createRel();
      case MGLangPackage.NEGATION_EXPRESSION: return createNegationExpression();
      case MGLangPackage.FUNCTION_CALL: return createFunctionCall();
      case MGLangPackage.LITERAL: return createLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MGLangPackage.MATH_FUNC:
        return createMathFuncFromString(eDataType, initialValue);
      case MGLangPackage.PRIMITIVE_TYPE:
        return createPrimitiveTypeFromString(eDataType, initialValue);
      case MGLangPackage.RELATIONAL_OP:
        return createRelationalOpFromString(eDataType, initialValue);
      case MGLangPackage.TERTIARY_OP:
        return createTertiaryOpFromString(eDataType, initialValue);
      case MGLangPackage.SECONDARY_OP:
        return createSecondaryOpFromString(eDataType, initialValue);
      case MGLangPackage.PRIMARY_OP:
        return createPrimaryOpFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MGLangPackage.MATH_FUNC:
        return convertMathFuncToString(eDataType, instanceValue);
      case MGLangPackage.PRIMITIVE_TYPE:
        return convertPrimitiveTypeToString(eDataType, instanceValue);
      case MGLangPackage.RELATIONAL_OP:
        return convertRelationalOpToString(eDataType, instanceValue);
      case MGLangPackage.TERTIARY_OP:
        return convertTertiaryOpToString(eDataType, instanceValue);
      case MGLangPackage.SECONDARY_OP:
        return convertSecondaryOpToString(eDataType, instanceValue);
      case MGLangPackage.PRIMARY_OP:
        return convertPrimaryOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MofgenFile createMofgenFile()
  {
    MofgenFileImpl mofgenFile = new MofgenFileImpl();
    return mofgenFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternReturn createPatternReturn()
  {
    PatternReturnImpl patternReturn = new PatternReturnImpl();
    return patternReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParamManipulation createParamManipulation()
  {
    ParamManipulationImpl paramManipulation = new ParamManipulationImpl();
    return paramManipulation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeContent createNodeContent()
  {
    NodeContentImpl nodeContent = new NodeContentImpl();
    return nodeContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternCall createPatternCall()
  {
    PatternCallImpl patternCall = new PatternCallImpl();
    return patternCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeReferenceOrAssignment createNodeReferenceOrAssignment()
  {
    NodeReferenceOrAssignmentImpl nodeReferenceOrAssignment = new NodeReferenceOrAssignmentImpl();
    return nodeReferenceOrAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternNodeReference createPatternNodeReference()
  {
    PatternNodeReferenceImpl patternNodeReference = new PatternNodeReferenceImpl();
    return patternNodeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeAttributeCall createNodeAttributeCall()
  {
    NodeAttributeCallImpl nodeAttributeCall = new NodeAttributeCallImpl();
    return nodeAttributeCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveParameter createPrimitiveParameter()
  {
    PrimitiveParameterImpl primitiveParameter = new PrimitiveParameterImpl();
    return primitiveParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterNode createParameterNode()
  {
    ParameterNodeImpl parameterNode = new ParameterNodeImpl();
    return parameterNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterRefOrMethodCall createParameterRefOrMethodCall()
  {
    ParameterRefOrMethodCallImpl parameterRefOrMethodCall = new ParameterRefOrMethodCallImpl();
    return parameterRefOrMethodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterRef createParameterRef()
  {
    ParameterRefImpl parameterRef = new ParameterRefImpl();
    return parameterRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MethodCall createMethodCall()
  {
    MethodCallImpl methodCall = new MethodCallImpl();
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticExpression createArithmeticExpression()
  {
    ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
    return arithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Generator createGenerator()
  {
    GeneratorImpl generator = new GeneratorImpl();
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneratorExpression createGeneratorExpression()
  {
    GeneratorExpressionImpl generatorExpression = new GeneratorExpressionImpl();
    return generatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternObjectCreation createPatternObjectCreation()
  {
    PatternObjectCreationImpl patternObjectCreation = new PatternObjectCreationImpl();
    return patternObjectCreation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternObject createPatternObject()
  {
    PatternObjectImpl patternObject = new PatternObjectImpl();
    return patternObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForHead createForHead()
  {
    ForHeadImpl forHead = new ForHeadImpl();
    return forHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralForHead createGeneralForHead()
  {
    GeneralForHeadImpl generalForHead = new GeneralForHeadImpl();
    return generalForHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForEachHead createForEachHead()
  {
    ForEachHeadImpl forEachHead = new ForEachHeadImpl();
    return forEachHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeOrParameterOrCollection createNodeOrParameterOrCollection()
  {
    NodeOrParameterOrCollectionImpl nodeOrParameterOrCollection = new NodeOrParameterOrCollectionImpl();
    return nodeOrParameterOrCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForBody createForBody()
  {
    ForBodyImpl forBody = new ForBodyImpl();
    return forBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElseIfOrElse createElseIfOrElse()
  {
    ElseIfOrElseImpl elseIfOrElse = new ElseIfOrElseImpl();
    return elseIfOrElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElseStatement createElseStatement()
  {
    ElseStatementImpl elseStatement = new ElseStatementImpl();
    return elseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SwitchCase createSwitchCase()
  {
    SwitchCaseImpl switchCase = new SwitchCaseImpl();
    return switchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Default createDefault()
  {
    DefaultImpl default_ = new DefaultImpl();
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseBody createCaseBody()
  {
    CaseBodyImpl caseBody = new CaseBodyImpl();
    return caseBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListAdHoc createListAdHoc()
  {
    ListAdHocImpl listAdHoc = new ListAdHocImpl();
    return listAdHoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapAdHoc createMapAdHoc()
  {
    MapAdHocImpl mapAdHoc = new MapAdHocImpl();
    return mapAdHoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapTupel createMapTupel()
  {
    MapTupelImpl mapTupel = new MapTupelImpl();
    return mapTupel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForRange createForRange()
  {
    ForRangeImpl forRange = new ForRangeImpl();
    return forRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tertiary createTertiary()
  {
    TertiaryImpl tertiary = new TertiaryImpl();
    return tertiary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Secondary createSecondary()
  {
    SecondaryImpl secondary = new SecondaryImpl();
    return secondary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rel createRel()
  {
    RelImpl rel = new RelImpl();
    return rel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NegationExpression createNegationExpression()
  {
    NegationExpressionImpl negationExpression = new NegationExpressionImpl();
    return negationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathFunc createMathFuncFromString(EDataType eDataType, String initialValue)
  {
    MathFunc result = MathFunc.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMathFuncToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveType result = PrimitiveType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalOp createRelationalOpFromString(EDataType eDataType, String initialValue)
  {
    RelationalOp result = RelationalOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRelationalOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TertiaryOp createTertiaryOpFromString(EDataType eDataType, String initialValue)
  {
    TertiaryOp result = TertiaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTertiaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondaryOp createSecondaryOpFromString(EDataType eDataType, String initialValue)
  {
    SecondaryOp result = SecondaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSecondaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryOp createPrimaryOpFromString(EDataType eDataType, String initialValue)
  {
    PrimaryOp result = PrimaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MGLangPackage getMGLangPackage()
  {
    return (MGLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MGLangPackage getPackage()
  {
    return MGLangPackage.eINSTANCE;
  }

} //MGLangFactoryImpl
