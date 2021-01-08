package org.mofgen.interpreter;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.mofgen.mGLang.List;
import org.mofgen.mGLang.Map;
import org.mofgen.mGLang.MofgenFile;
import org.mofgen.mGLang.Variable;

public class TypeRegistryDispatcher {

	private static HashMap<MofgenFile, TypeRegistry> file2Registry = new HashMap<>();
	
	public static EObject getVarType(Variable v) {
		MofgenFile file = (MofgenFile)EcoreUtil2.getRootContainer(v);
		TypeRegistry reg = fetchRegistry(file);
		return reg.getVarType(v);
	}
	
	public static EClassifier getListType(List list) {
		MofgenFile file = (MofgenFile)EcoreUtil2.getRootContainer(list);
		TypeRegistry reg = fetchRegistry(file);
		
		return reg.getListType(list);
	}

	public static EClassifier getMapKeyType(Map map) {
		MofgenFile file = (MofgenFile)EcoreUtil2.getRootContainer(map);
		TypeRegistry reg = fetchRegistry(file);
		return reg.getMapKeyType(map);
	}

	public static EClassifier getMapEntryType(Map map) {
		MofgenFile file = (MofgenFile)EcoreUtil2.getRootContainer(map);
		TypeRegistry reg = fetchRegistry(file);
		return reg.getMapEntryType(map);
	}
	
	private static TypeRegistry fetchRegistry(MofgenFile file) {
		TypeRegistry reg = null;
		
		if(!file2Registry.containsKey(file)) {
			reg = new TypeRegistry(file);
			file2Registry.put(file, reg);
		}else {
			reg = file2Registry.get(file);
		}
		return reg;
	}
	
	public static void setUpdate(boolean update) {
		file2Registry.values().forEach(v->v.setUpdate(update));
	}
	
}
