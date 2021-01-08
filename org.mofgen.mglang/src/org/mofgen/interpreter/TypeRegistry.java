package org.mofgen.interpreter;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.EcoreUtil2;
import org.mofgen.mGLang.ArithmeticExpression;
import org.mofgen.mGLang.List;
import org.mofgen.mGLang.ListAdHoc;
import org.mofgen.mGLang.ListDeclaration;
import org.mofgen.mGLang.ListDefOrDecl;
import org.mofgen.mGLang.ListDefinition;
import org.mofgen.mGLang.Map;
import org.mofgen.mGLang.MapAdHoc;
import org.mofgen.mGLang.MapDeclaration;
import org.mofgen.mGLang.MapDefOrDecl;
import org.mofgen.mGLang.MapDefinition;
import org.mofgen.mGLang.MapTupel;
import org.mofgen.mGLang.MofgenFile;
import org.mofgen.mGLang.Pattern;
import org.mofgen.mGLang.Variable;
import org.mofgen.mGLang.VariableDeclaration;
import org.mofgen.mGLang.VariableDefinition;
import org.mofgen.utils.MofgenModelUtils;

/**
 * Keeps track of the types of different Maps and Lists. Updated on every
 * requesting method call.
 * 
 * @author Tobias Niehues
 *
 */
public class TypeRegistry {

	public static TypeCalculator typeCalc = new TypeCalculator();
	public static HashMap<List, EClassifier> listTypes;
	public static HashMap<Map, EClassifier> keyTypes;
	public static HashMap<Map, EClassifier> entryTypes;
	/**
	 * Of type object since it can hold patterns or EClasses
	 */
	public static HashMap<Variable, EObject> varTypes;
	
	private static MofgenFile file;
	/**
	 * Determines whether all entries should be updated before retrieving values.
	 * MUST be true if used during scoping. Can be false if used for API generation.
	 */
	private static boolean update = true;

	public static void update() {
		updateVarRegistry();
		updateListRegistry();
		updateMapRegistry();
	}
	
	public static void init(MofgenFile givenFile) {
		update = true;
		file = givenFile;
		listTypes = null;
		keyTypes = null;
		entryTypes = null;
		varTypes = null;
		update();
	}

	private static void updateVarRegistry() {
		if (varTypes == null) {
			varTypes = new HashMap<>();
		}
		java.util.List<Variable> vars = EcoreUtil2.getAllContentsOfType(file, Variable.class);
		for (Variable var : vars) {
			putVar(var);
		}
	}

	private static void updateListRegistry() {
		if (listTypes == null) {
			listTypes = new HashMap<>();
		}
		java.util.List<List> lists = EcoreUtil2.getAllContentsOfType(file, List.class);
		for (List list : lists) {
			putList(list);
		}
	}

	private static void updateMapRegistry() {
		if (keyTypes == null) {
			keyTypes = new HashMap<>();
			entryTypes = new HashMap<>();
		}
		java.util.List<Map> maps = EcoreUtil2.getAllContentsOfType(file, Map.class);
		for (Map map : maps) {
			putMap(map);
		}
	}

	private static void putVar(Variable var) {
		if (var instanceof VariableDefinition) {
			ArithmeticExpression value = ((VariableDefinition) var).getValue();
			if (value != null) {
				Object valueEval = typeCalc.evaluate(value);
				if (valueEval != null) {
					if (valueEval instanceof Pattern) {
						varTypes.put(var, (Pattern) valueEval);
					} else if (valueEval instanceof EClass) {
						varTypes.put(var, (EClass) valueEval);
					} else {
						throw new IllegalStateException("Type evaluation of variable expression resulted in "
								+ valueEval + " but should not result in a type different than Pattern or an EClass");
					}
				}
			}
		} else {
			EClassifier type = ((VariableDeclaration) var).getType();
			varTypes.put(var, MofgenModelUtils.getEClassForInternalModel(type));
		}
	}

	private static void putList(List list) {
		ListDefOrDecl defOrDecl = list.getDefOrDecl();
		if (defOrDecl instanceof ListDefinition) {
			if (defOrDecl instanceof ListAdHoc) {
				EList<ArithmeticExpression> elements = ((ListAdHoc) defOrDecl).getElements();
				if (elements.isEmpty()) {
					listTypes.put(list, EcorePackage.Literals.EOBJECT);
					return;
				}

				Object listTypeEval = typeCalc.evaluate(elements.get(0));
				EClass listType = null;
				if (listTypeEval instanceof EClass) {
					listType = (EClass) listTypeEval;
				} else {
					throw new UnsupportedOperationException("list of type Pattern should not occur");
				}
				for (int i = 1; i < elements.size(); i++) {
					Object elementEval = typeCalc.evaluate(elements.get(i));
					if (elementEval instanceof EClass) {
						EClass clazz = (EClass) elementEval;
						if (clazz != listType) {
							if (clazz.isSuperTypeOf(listType)) {
								listType = clazz;
							} else {
								listType = EcorePackage.Literals.EOBJECT;
								break;
							}
						}
					} else {
						throw new UnsupportedOperationException("list of type Pattern should not occur");
					}
				}
				listTypes.put(list, listType);
			}
		} else {
			// ListDeclaration
			ListDeclaration decl = (ListDeclaration) defOrDecl;
			EClassifier declType = EcorePackage.Literals.EOBJECT;
			if (decl != null) {
				declType = decl.getType();
			}
			listTypes.put(list, declType);
		}
	}

	private static void putMap(Map map) {
		MapDefOrDecl defOrDecl = map.getDefOrDecl();
		if (defOrDecl instanceof MapDefinition) {
			if (defOrDecl instanceof MapAdHoc) {

				EList<MapTupel> elements = ((MapAdHoc) defOrDecl).getEntries();
				if (elements.isEmpty()) {
					keyTypes.put(map, EcorePackage.Literals.EOBJECT);
					entryTypes.put(map, EcorePackage.Literals.EOBJECT);
					return;
				}

				// find keyType
				Object keyTypeEval = typeCalc.evaluate(elements.get(0).getKey());
				EClass keyType = null;
				if (keyTypeEval instanceof EClass) {
					keyType = (EClass) keyTypeEval;
				} else {
					throw new UnsupportedOperationException("keys of type Pattern should not occur");
				}
				for (int i = 1; i < elements.size(); i++) {
					Object elementEval = typeCalc.evaluate(elements.get(i).getKey());
					if (elementEval instanceof EClass) {
						EClass clazz = (EClass) elementEval;
						if (clazz != keyType) {
							if (clazz.isSuperTypeOf(keyType)) {
								keyType = clazz;
							} else {
								keyType = EcorePackage.Literals.EOBJECT;
								break;
							}
						}
					} else {
						throw new UnsupportedOperationException("keys of type Pattern should not occur");
					}

				}
				keyTypes.put(map, keyType);

				// find entryType
				Object entryTypeEval = typeCalc.evaluate(elements.get(0).getValue());
				EClass entryType = null;
				if (entryTypeEval instanceof EClass) {
					entryType = (EClass) entryTypeEval;
				} else {
					throw new UnsupportedOperationException("entries of type Pattern should not occur");
				}
				for (int i = 1; i < elements.size(); i++) {
					Object elementEval = typeCalc.evaluate(elements.get(i).getValue());
					if (elementEval instanceof EClass) {
						EClass clazz = (EClass) elementEval;
						if (clazz != entryType) {
							if (clazz.isSuperTypeOf(entryType)) {
								entryType = clazz;
							} else {
								entryType = EcorePackage.Literals.EOBJECT;
								break;
							}
						}
					} else {
						throw new UnsupportedOperationException("entries of type Pattern should not occur");
					}

				}
				entryTypes.put(map, entryType);

			}
		} else {
			// MapDeclaration
			MapDeclaration decl = (MapDeclaration) defOrDecl;
			EClassifier keyType = decl.getKeyType();
			EClassifier entryType = decl.getEntryType();
			keyTypes.put(map, keyType);
			entryTypes.put(map, entryType);
		}
	}

	public static EClassifier getListType(List list) {
		if (update) {
			updateListRegistry();
		}
		return listTypes.get(list);
	}

	public static EClassifier getMapKeyType(Map map) {
		if (update) {
			updateMapRegistry();
		}
		return keyTypes.get(map);
	}

	public static EClassifier getMapEntryType(Map map) {
		if (update) {
			updateMapRegistry();
		}
		return entryTypes.get(map);
	}

	public static EObject getVarType(Variable var) {
		if (update) {
			updateVarRegistry();
		}
		return varTypes.get(var);
	}

	public static void setUpdate(boolean val) {
		update = val;
	}

}
