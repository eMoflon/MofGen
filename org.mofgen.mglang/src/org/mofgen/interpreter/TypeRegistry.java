package org.mofgen.interpreter;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.EcoreUtil2;
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
import org.mofgen.mGLang.ArithmeticExpression;

/**
 * Keeps track of the types of different Maps and Lists. Updated on every
 * requesting method call.
 * 
 * @author tobnie
 *
 */
public class TypeRegistry {

	public static TypeCalculator typeCalc = new TypeCalculator();
	public static HashMap<List, EClass> listTypes;
	public static HashMap<Map, EClass> keyTypes;
	public static HashMap<Map, EClass> entryTypes;

	/**
	 * Determines whether all entries should be updated before retrieving values.
	 * MUST be true if used during scoping. Can be false if used for API generation.
	 */
	private static boolean update = true;

	public static void update(MofgenFile file) {
		if (listTypes == null) {
			listTypes = new HashMap<>();
			keyTypes = new HashMap<>();
			entryTypes = new HashMap<>();
		}
		updateListRegistry(file);
		updateMapRegistry(file);
	}

	private static void updateListRegistry(MofgenFile file) {
		java.util.List<List> lists = EcoreUtil2.getAllContentsOfType(file, List.class);
		for (List list : lists) {
			putList(list);
		}
	}

	private static void updateMapRegistry(MofgenFile file) {
		java.util.List<Map> maps = EcoreUtil2.getAllContentsOfType(file, Map.class);
		for (Map map : maps) {
			putMap(map);
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

				EClass listType = typeCalc.evaluate(elements.get(0));
				for (int i = 1; i < elements.size(); i++) {
					EClass clazz = typeCalc.evaluate(elements.get(i));
					if (clazz != listType) {
						listType = EcorePackage.Literals.EOBJECT;
						break;
					}
				}
				listTypes.put(list, listType);
			}
		} else {
			// ListDeclaration
			ListDeclaration decl = (ListDeclaration) defOrDecl;
			listTypes.put(list, decl.getType());
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
				EClass keyType = typeCalc.evaluate(elements.get(0).getKey());
				for (int i = 1; i < elements.size(); i++) {
					EClass clazz = typeCalc.evaluate(elements.get(i).getKey());
					if (clazz != keyType) {
						keyType = EcorePackage.Literals.EOBJECT;
						break;
					}
				}
				keyTypes.put(map, keyType);

				// find entryType
				EClass entryType = typeCalc.evaluate(elements.get(0).getValue());
				for (int i = 1; i < elements.size(); i++) {
					EClass clazz = typeCalc.evaluate(elements.get(i).getValue());
					if (clazz != entryType) {
						entryType = EcorePackage.Literals.EOBJECT;
						break;
					}
				}
				entryTypes.put(map, entryType);
			}
		} else {
			// MapDeclaration
			MapDeclaration decl = (MapDeclaration) defOrDecl;
			EClass keyType = decl.getKeyType();
			EClass entryType = decl.getEntryType();
			keyTypes.put(map, keyType);
			entryTypes.put(map, entryType);
		}
	}

	public static EClass getListType(List list) {
		if (update) {
			update((MofgenFile) EcoreUtil2.getRootContainer(list));
		}
		return listTypes.get(list);
	}

	public static EClass getMapKeyType(Map map) {
		if (update) {
			update((MofgenFile) EcoreUtil2.getRootContainer(map));
		}
		return keyTypes.get(map);
	}

	public static EClass getMapEntryType(Map map) {
		if (update) {
			update((MofgenFile) EcoreUtil2.getRootContainer(map));
		}
		return entryTypes.get(map);
	}

	public static void setUpdate(boolean val) {
		update = val;
	}

}
