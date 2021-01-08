/*
 * generated by Xtext 2.20.0
 */
package org.mofgen.scoping

import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.mofgen.interpreter.TypeCalculator
import org.mofgen.mGLang.Collection
import org.mofgen.mGLang.CollectionManipulation
import org.mofgen.mGLang.ForStatement
import org.mofgen.mGLang.GenCaseWithCast
import org.mofgen.mGLang.GeneralForEachHead
import org.mofgen.mGLang.Generator
import org.mofgen.mGLang.Import
import org.mofgen.mGLang.IteratorVariable
import org.mofgen.mGLang.List
import org.mofgen.mGLang.ListDeclaration
import org.mofgen.mGLang.ListForEachHead
import org.mofgen.mGLang.MGLangPackage
import org.mofgen.mGLang.Map
import org.mofgen.mGLang.MapDeclaration
import org.mofgen.mGLang.Node
import org.mofgen.mGLang.NodeAttributeAssignment
import org.mofgen.mGLang.ParamManipulation
import org.mofgen.mGLang.ParameterNodeOrPattern
import org.mofgen.mGLang.Pattern
import org.mofgen.mGLang.PatternCall
import org.mofgen.mGLang.PatternCaseWithCast
import org.mofgen.mGLang.PatternNodeReference
import org.mofgen.mGLang.RangeForHead
import org.mofgen.mGLang.RefOrCall
import org.mofgen.mGLang.Variable
import org.mofgen.mGLang.VariableManipulation
import org.mofgen.typeModel.TypeModelPackage
import org.mofgen.utils.MofgenModelUtils
import org.mofgen.mGLang.VariableDeclaration
import org.mofgen.mGLang.VariableDefinition

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MGLangScopeProvider extends AbstractMGLangScopeProvider {

	@Inject TypeCalculator typeChecker

	override getScope(EObject context, EReference reference) {
		if (isNode_Type(context, reference)) {
			return getScopeForNodeCreationType(context as Node)
		}
		if (isPatternNodeReference_Type(context, reference)) {
			return getScopeForPatternNodeReference_Type(context as PatternNodeReference)
		}
		if (isNodeAttributeAssignment_Target(context, reference)) {
			return getScopeForNodeAttributeAssignment_Target(context as NodeAttributeAssignment)
		}
		if (isRefOrCall(context)) {
			return getScopeForRefOrCall(context as RefOrCall)
		}
		if (isParameterNodeOrPattern_SrcModel(context, reference)) {
			return getScopeForParameterNodeOrPattern_SrcModel(context as ParameterNodeOrPattern)
		}
		if (isParameterNodeOrPattern_Type(context, reference)) {
			return getScopeForParameterNodeOrPattern_Type(context as ParameterNodeOrPattern)
		}
		if (isNode_Type(context, reference)) {
			return getScopeForNode_Type(context as Node)
		}
		if (isNode_SrcModel(context, reference)) {
			return getScopeForNode_SrcModel(context as Node)
		}
		if (isListForEachHead_List(context, reference)) {
			return getScopeForListForEachHead_List(context as ListForEachHead)
		}
		if (isGeneralForEachHead_ERef(context, reference)) {
			return getScopeForGeneralForEachHead_ERef(context as GeneralForEachHead)
		}
		if (isCollectionManipulation_Trg(context, reference)) {
			return getScopeForCollectionManipulation_Trg(context as CollectionManipulation)
		}
		if (isCollectionManipulation_Op(context, reference)) {
			return getScopeForCollectionManipulation_Op(context as CollectionManipulation)
		}
		if (isVariableManipulation_Var(context, reference)) {
			return getScopeForVariableManipulation_Var(context as VariableManipulation)
		}
		if (isListDeclaration_Type(context, reference)) {
			return getScopeForListDeclaration_Type(context as ListDeclaration)
		}
		if (isMapDeclaration_KeyType(context, reference)) {
			return getScopeForMapDeclaration_KeyType(context as MapDeclaration)
		}
		if (isMapDeclaration_EntryType(context, reference)) {
			return getScopeForMapDeclaration_EntryType(context as MapDeclaration)
		}
		if (isParamManipulation_Param(context, reference)) {
			return getScopeForParamManipulation_Param(context as ParamManipulation)
		}
		if (isPatternCall_called(context, reference)) {
			return getScopeForPatternCall_called(context as PatternCall)
		}
		if (isVariableDeclaration_Type(context, reference)) {
			return getScopeForVariableDeclaration_Type(context as VariableDeclaration)
		}

		return super.getScope(context, reference)
	}

	def getScopeForListDeclaration_Type(ListDeclaration decl) {
		return getTypesWithinFile(decl)
	}
	
	def getScopeForVariableDeclaration_Type(VariableDeclaration decl){
		return getTypesWithinFile(decl)
	}

	/**
	 * provides all possible types in the file
	 */
	def private getTypesWithinFile(EObject obj) {
		val file = getRootFile(obj)
		val types = newLinkedList()
		for (clazz : MofgenModelUtils.getClasses(file)) {
			types.add(EObjectDescription.create(QualifiedName.create(clazz.name), clazz))
		}
		types.addAll(getInternalTypeDescriptions())
		return new SimpleScope(IScope.NULLSCOPE, types)
	}

	/**
	 * provides all relevant collection datatypes within the ecore package as a list of EObjectDescriptions
	 */
	def private getInternalTypeDescriptions() {
		return #[EObjectDescription.create(QualifiedName.create("Integer"), EcorePackage.Literals.EINT),
			EObjectDescription.create(QualifiedName.create("Double"), EcorePackage.Literals.EDOUBLE),
			EObjectDescription.create(QualifiedName.create("String"), EcorePackage.Literals.ESTRING),
			EObjectDescription.create(QualifiedName.create("Boolean"), EcorePackage.Literals.EBOOLEAN),
			EObjectDescription.create(QualifiedName.create("Char"), EcorePackage.Literals.ECHAR)]
	}

	def getScopeForMapDeclaration_KeyType(MapDeclaration decl) {
		return getTypesWithinFile(decl)
	}

	def getScopeForMapDeclaration_EntryType(MapDeclaration decl) {
		return getTypesWithinFile(decl)
	}

	def getScopeForCollectionManipulation_Trg(CollectionManipulation cm) {
		val container = EcoreUtil2.getContainerOfType(cm, Generator)
		val colls = EcoreUtil2.getAllContentsOfType(container, Collection)
		return Scopes.scopeFor(colls)
	}

	def getScopeForCollectionManipulation_Op(CollectionManipulation cm) {
		val trg = cm.trg
		if (trg instanceof Map) {
			val ops = TypeModelPackage.Literals.MAP.EAllOperations
			return Scopes.scopeFor(ops)
		}
		if (trg instanceof List) {
			val ops = TypeModelPackage.Literals.LIST.EAllOperations
			return Scopes.scopeFor(ops)
		}
		return IScope.NULLSCOPE
	}

	def getScopeForVariableManipulation_Var(VariableManipulation vm) {
		val container = EcoreUtil2.getContainerOfType(vm, Generator)
		val vars = EcoreUtil2.getAllContentsOfType(container, Variable)
		return Scopes.scopeFor(vars)
	}

	def getScopeForGeneralForEachHead_ERef(GeneralForEachHead head) {
		val src = head.src
		if (src !== null) {
			val ref = src.ref
			if (ref !== null) {
				if (ref instanceof Map) {
					return Scopes.scopeFor(TypeModelPackage.Literals.MAP.EReferences)
				}
				val clazz = src.ref.eClass
				val ops = clazz.EAllOperations
				val refs = clazz.EReferences
				return Scopes.scopeFor(ops + refs)
			}
		}
	}

	def getScopeForListForEachHead_List(ListForEachHead head) {
		val gen = EcoreUtil2.getContainerOfType(head, Generator)
		if (gen === null) {
			throw new IllegalStateException("Every for-loop should be contained in a generator")
		}
		val lists = EcoreUtil2.getAllContentsOfType(gen, List)
		return Scopes.scopeFor(lists)
	}

	def getScopeForNode_SrcModel(Node node) {
		val imports = EcoreUtil2.getAllContentsOfType(getRootFile(node), Import)
		return Scopes.scopeFor(imports)
	}

	def getScopeForNode_Type(Node node) {
		val imp = node.srcModel
		if (imp !== null) {
			val classes = MofgenModelUtils.getClassesFromImport(imp)
			return Scopes.scopeFor(classes)
		} else {
			return getScopeForAllImportedClasses(node)
		}
	}

	def getScopeForParameterNodeOrPattern_Type(ParameterNodeOrPattern paramNode) {
		val imp = paramNode.srcModel
		if (imp !== null) {
			val classes = MofgenModelUtils.getClassesFromImport(imp)
			return Scopes.scopeFor(classes)
		} else {
			val root = MofgenModelUtils.getRootFile(paramNode)
			val classes = MofgenModelUtils.getUniqueClasses(root)
			val patterns = EcoreUtil2.getAllContentsOfType(root, Pattern)
			val parentScope = Scopes.scopeFor(classes + patterns)
			val dataTypes = #[EObjectDescription.create(QualifiedName.create("String"), EcorePackage.Literals.ESTRING)]
			return new SimpleScope(parentScope, dataTypes)

		}
	}

	private def getScopeForAllImportedClasses(EObject obj) {
		// in case of naming conflicts only the first class with that name in the first mentioned import is loaded
		val classes = MofgenModelUtils.getUniqueClasses(MofgenModelUtils.getRootFile(obj))
		return Scopes.scopeFor(classes)
	}

	def getScopeForParameterNodeOrPattern_SrcModel(ParameterNodeOrPattern paramNode) {
		val imports = EcoreUtil2.getAllContentsOfType(getRootFile(paramNode), Import)
		return Scopes.scopeFor(imports)
	}

	def getScopeForNodeCreationType(Node n) {
		val file = getRootFile(n)
		val classes = MofgenModelUtils.getClasses(file)
		return Scopes.scopeFor(classes)
	}

	def getScopeForPatternNodeReference_Type(PatternNodeReference ref) {
		val file = getRootFile(ref)
		val srcNode = EcoreUtil2.getContainerOfType(ref, Node)
		if (srcNode !== null) {
			val classes = MofgenModelUtils.getClasses(file)
			val filteredClasses = classes.filter[c|c == srcNode.type]
			if (filteredClasses.empty) {
				return IScope.NULLSCOPE
			} else {
				return Scopes.scopeFor(filteredClasses.get(0).EAllReferences)
			}
		} else {
			val srcParam = EcoreUtil2.getContainerOfType(ref, ParamManipulation)
			val classes = MofgenModelUtils.getClasses(file)
			val filteredClasses = classes.filter[c|c == srcParam.param.type]
			if (filteredClasses.empty) {
				return IScope.NULLSCOPE
			} else {
				return Scopes.scopeFor(filteredClasses.get(0).EAllReferences)
			}
		}

	}

	def getScopeForNodeAttributeAssignment_Target(NodeAttributeAssignment ass) {
		val srcNode = EcoreUtil2.getContainerOfType(ass, Node)
		val srcParamManipulation = EcoreUtil2.getContainerOfType(ass, ParamManipulation)
		val file = getRootFile(ass)
		val classes = MofgenModelUtils.getClasses(file)
		try {
			val filteredClasses = newLinkedList()
			if (srcNode !== null) {
				filteredClasses.addAll(classes.filter[c|c == srcNode.type])
			} else {
				val parameterType = srcParamManipulation.param.type
				if (parameterType instanceof Node) {
					filteredClasses.addAll(classes.filter[c|c == (parameterType as Node).type])
				}
			}
			val attrs = newLinkedList()
			if (filteredClasses.isEmpty) {
				return IScope.NULLSCOPE
			} else {
				attrs.addAll(filteredClasses.get(0).EAllAttributes)
				return Scopes.scopeFor(attrs)
			}
		} catch (NullPointerException e) {
			return IScope.NULLSCOPE
		}
	}

	def private getEventuallyShadowingNodes(EObject obj) {
		val patternNodes = EcoreUtil2.getAllContainers(obj).filter(PatternCaseWithCast).map[c|c.node]
		val genNodes = EcoreUtil2.getAllContainers(obj).filter(GenCaseWithCast).map[c|c.node]
		return patternNodes + genNodes
	}

	def getScopeForPatternCall_called(PatternCall pc) {
		val root = EcoreUtil2.getRootContainer(pc)
		return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(root, Pattern))
	}

	def getScopeForRefOrCall(RefOrCall r) {
		if (r.target === null) {
			// get parameters of above Pattern
			val pattern = EcoreUtil2.getContainerOfType(r, Pattern)
			val gen = EcoreUtil2.getContainerOfType(r, Generator)
			// pattern and gen are xor non-null. Either we are in a pattern or a generator
			var params = new ArrayList<EObject>()
			var patternNodes = new ArrayList<Node>()

			val vars = new ArrayList<Variable>()
			var collections = new ArrayList<Collection>()

			if (pattern !== null) {
				val highestRoc = MofgenModelUtils.getHightestContainerOfType(r, RefOrCall)
				if (highestRoc.eContainingFeature === MGLangPackage.Literals.NODE__CREATED_BY) {
					params.addAll(pattern.parameters.filter(ParameterNodeOrPattern).filter [ p |
						p.type instanceof EClassifier && !MofgenModelUtils.isPrimitiveType(p.type as EClassifier)
					])
				} else {
					params.addAll(pattern.parameters)
				}

				// get nodes of pattern (which names do not match any parameter names!)
				val parameterNames = pattern.parameters.map[p|p.name]
				patternNodes.addAll(EcoreUtil2.getAllContentsOfType(pattern, Node).filter [ n |
					!parameterNames.contains(n.name)
				])
			} else {
				collections.addAll(EcoreUtil2.getAllContentsOfType(gen, Collection))
				vars.addAll(EcoreUtil2.getAllContentsOfType(gen, Variable)) // TODO Collect variables correctly (i.e. consider inner/outer scopes)
			}

			// get nodes of casts in above case-heads (remove names from pattern-nodes eventually)
			val shadowingNodes = getEventuallyShadowingNodes(r)
			val indicesToRemove = newLinkedList()

			// find shadowed Pattern nodes
			for (pNode : patternNodes) {
				for (node : shadowingNodes) {
					if (node.name.equals(pNode.name)) {
						indicesToRemove.add(patternNodes.indexOf(pNode))
					}
				}
			}
			for (index : indicesToRemove.reverse) {
				patternNodes.remove(index)
			}

			// collect enums
			val root = MofgenModelUtils.getRootFile(r)
			val enums = MofgenModelUtils.getEnums(root)

			// collect imports
			val imports = EcoreUtil2.getAllContentsOfType(root, Import)

			// collect iterator variables
			val containers = EcoreUtil2.getAllContainers(r);
			var forStatements = newLinkedList()
			var iteratorVars = newLinkedList()
			for (cont : containers) {
				if (cont instanceof ForStatement) {
					forStatements.add(cont as ForStatement)
				}
			}
			for (statement : forStatements) {
				val head = statement.head
				if (head instanceof GeneralForEachHead) {
					iteratorVars.add(head.iteratorVar)
				}
				if (head instanceof ListForEachHead) {
					iteratorVars.add(head.iteratorVar)
				}
				if (head instanceof RangeForHead) {
					iteratorVars.add(head.iteratorVar)
				}
			}

			// add (eventually cast) nodes of switch if in switch
			val switchNodes = newLinkedList()
			var patternCastContainer = EcoreUtil2.getContainerOfType(r, PatternCaseWithCast) as PatternCaseWithCast
			if (patternCastContainer !== null) {
				switchNodes.add(patternCastContainer.node)
			}
			var genCastContainer = EcoreUtil2.getContainerOfType(r, GenCaseWithCast) as GenCaseWithCast
			if (genCastContainer !== null) {
				switchNodes.add(genCastContainer.node)
			}

			return Scopes.scopeFor(
				params + patternNodes + collections + vars + imports + enums + iteratorVars + switchNodes)

		} else {
			val trg = r.target
			if (trg.thisUsed) {
				// get nodes of pattern
				val pattern = EcoreUtil2.getContainerOfType(r, Pattern)
				if (pattern === null) {
					return IScope.NULLSCOPE
				} else {
					val patternNodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
					return Scopes.scopeFor(patternNodes)
				}
			}

			val ref = trg.ref
			val refClass = ref.eClass

			switch ref {
				Map: {
					val ops = TypeModelPackage.Literals.MAP.EAllOperations
					val attrs = TypeModelPackage.Literals.MAP.EAllReferences
					return Scopes.scopeFor(ops + attrs)
				}
				List: {
					val ops = TypeModelPackage.Literals.LIST.EAllOperations
					return Scopes.scopeFor(ops)
				}
				Import: {
					val enums = MofgenModelUtils.getEnumsFromImport(ref as Import)
					return Scopes.scopeFor(enums)
				}
				EEnum: {
					val enumLiterals = (ref as EEnum).ELiterals
					return Scopes.scopeFor(enumLiterals)
				}
				VariableDefinition: {
					val type = typeChecker.evaluate(ref.value)
					if (type === null) {
						return IScope.NULLSCOPE
					} else if (type.eIsProxy) {
						throw new IllegalStateException("Encountered Proxy in Variable "+ref.name);
					} else if (type instanceof EClass) {
						val attributes = type.EAllAttributes
						val references = type.EAllReferences
						return Scopes.scopeFor(attributes + references)
					} else if (type instanceof Pattern) {
						return getScopeForAllNodesAndParams(type)
					}
					return IScope.NULLSCOPE
				}
				VariableDeclaration: {
					val type = ref.type
					if (type instanceof EClass) {
						val attributes = type.EAllAttributes
						val references = type.EAllReferences
						return Scopes.scopeFor(attributes + references)
					} else if (type instanceof Pattern) {
						return getScopeForAllNodesAndParams(type)
					}
					return IScope.NULLSCOPE
				}
				IteratorVariable: {
					return IScope.NULLSCOPE
				}
				Node: {
					val attrs = refClass.EAllAttributes
					val refs = refClass.EAllReferences
					return Scopes.scopeFor(attrs + refs)
				}
				ParameterNodeOrPattern: {
					val type = ref.type
					if (type instanceof EClass) {
						val attrs = type.EAllAttributes
						val refs = type.EAllReferences
						return Scopes.scopeFor(attrs + refs)
					} else if (type instanceof Pattern) {
						return Scopes.scopeFor(type.commands.filter(Node))
					} else {
						return IScope.NULLSCOPE
					}
				}
				default:
					return IScope.NULLSCOPE
			}
		}
	}

	def getScopeForParamManipulation_Param(ParamManipulation pm) {
		val pattern = EcoreUtil2.getContainerOfType(pm, Pattern)
		val paramNodeOrPattern = pattern.parameters.filter(ParameterNodeOrPattern)
		val parameterNodes = newLinkedList()
		for (nodeOrPattern : paramNodeOrPattern) {
			if (!(nodeOrPattern.type instanceof Pattern)) {
				parameterNodes.add(nodeOrPattern)
			}
		}
		return Scopes.scopeFor(parameterNodes)
	}

	def getScopeForAllNodesAndParams(Pattern pattern) {
		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node)
		val parameterNodes = pattern.parameters.filter(ParameterNodeOrPattern).filter [ p |
			p.type instanceof EClassifier
		]
		return Scopes.scopeFor(nodes + parameterNodes)
	}

	/**
	 *  Returns all parameters of the pattern and all nodes that do not have the same names as any parameter
	 */
	def getScopeForAllNotShadowedNodesAndParams(Pattern pattern) {
		val parameterNames = pattern.parameters.map[p|p.name]
		val parameterNodes = pattern.parameters.filter(ParameterNodeOrPattern).filter [ p |
			p.type instanceof EClassifier
		]
		val nodes = EcoreUtil2.getAllContentsOfType(pattern, Node).filter[n|!parameterNames.contains(n.name)]
		return Scopes.scopeFor(nodes + parameterNodes)
	}

	def isPatternNodeReference_Type(
		EObject context,
		EReference reference
	) {
		return context instanceof PatternNodeReference &&
			reference == MGLangPackage.Literals.PATTERN_NODE_REFERENCE__TYPE
	}

	def isNode_Type(EObject context, EReference reference) {
		return context instanceof Node && reference == MGLangPackage.Literals.NODE__TYPE
	}

	def isNodeAttributeAssignment_Target(EObject context, EReference reference) {
		return context instanceof NodeAttributeAssignment &&
			reference == MGLangPackage.Literals.NODE_ATTRIBUTE_ASSIGNMENT__TARGET
	}

	def isRefOrCall(EObject context) {
		return context instanceof RefOrCall
	}

	def isRefOrCall_Ref(EObject context, EReference reference) {
		return context instanceof RefOrCall && reference == MGLangPackage.Literals.REF_OR_CALL__REF
	}

	def isParameterNodeOrPattern_SrcModel(EObject context, EReference reference) {
		return context instanceof ParameterNodeOrPattern &&
			reference == MGLangPackage.Literals.PARAMETER_NODE_OR_PATTERN__SRC_MODEL
	}

	def isParameterNodeOrPattern_Type(EObject context, EReference reference) {
		return context instanceof ParameterNodeOrPattern &&
			reference == MGLangPackage.Literals.PARAMETER_NODE_OR_PATTERN__TYPE
	}
	
	def isVariableDeclaration_Type(EObject context, EReference reference){
		return context instanceof VariableDeclaration && reference == MGLangPackage.Literals.VARIABLE_DECLARATION__TYPE
	}

	def isNode_SrcModel(EObject context, EReference reference) {
		return context instanceof Node && reference == MGLangPackage.Literals.NODE__SRC_MODEL
	}

	def isListForEachHead_List(EObject context, EReference reference) {
		return context instanceof ListForEachHead && reference == MGLangPackage.Literals.LIST_FOR_EACH_HEAD__LIST
	}

	def isGeneralForEachHead_ERef(EObject context, EReference reference) {
		return context instanceof GeneralForEachHead && reference == MGLangPackage.Literals.GENERAL_FOR_EACH_HEAD__EREF
	}

	def isCollectionManipulation_Trg(EObject context, EReference reference) {
		return context instanceof CollectionManipulation &&
			reference == MGLangPackage.Literals.COLLECTION_MANIPULATION__TRG
	}

	def isCollectionManipulation_Op(EObject context, EReference reference) {
		return context instanceof CollectionManipulation &&
			reference == MGLangPackage.Literals.COLLECTION_MANIPULATION__OP
	}

	def isVariableManipulation_Var(EObject context, EReference reference) {
		return context instanceof VariableManipulation && reference == MGLangPackage.Literals.VARIABLE_MANIPULATION__VAR
	}

	def isListDeclaration_Type(EObject context, EReference reference) {
		return context instanceof ListDeclaration && reference == MGLangPackage.Literals.LIST_DECLARATION__TYPE
	}

	def isMapDeclaration_KeyType(EObject context, EReference reference) {
		return context instanceof MapDeclaration && reference == MGLangPackage.Literals.MAP_DECLARATION__KEY_TYPE
	}

	def isMapDeclaration_EntryType(EObject context, EReference reference) {
		return context instanceof MapDeclaration && reference == MGLangPackage.Literals.MAP_DECLARATION__ENTRY_TYPE
	}

	def isParamManipulation_Param(EObject context, EReference reference) {
		return context instanceof ParamManipulation && reference == MGLangPackage.Literals.PARAM_MANIPULATION__PARAM
	}

	def isPatternCall_called(EObject context, EReference reference) {
		return context instanceof PatternCall && reference == MGLangPackage.Literals.PATTERN_CALL__CALLED
	}

	def getRootFile(EObject context) {
		return MofgenModelUtils.getRootFile(context)
	}
}
