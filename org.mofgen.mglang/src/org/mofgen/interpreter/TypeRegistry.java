package org.mofgen.interpreter;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.EcoreUtil2;
import org.mofgen.mGLang.List;
import org.mofgen.mGLang.ListAdHoc;
import org.mofgen.mGLang.ListDefOrDecl;
import org.mofgen.mGLang.ListDefinition;
import org.mofgen.mGLang.Map;
import org.mofgen.mGLang.MofgenFile;
import org.mofgen.interpreter.*;

import com.google.inject.Inject;

import org.mofgen.interpreter.Calculator;
import org.mofgen.mGLang.Collection;

public class TypeRegistry {

	@Inject private Calculator calc;
	
	private static HashMap<List, EClass> listTypes;
	private static HashMap<Map, EClass> keyTypes;
	private static HashMap<Map, EClass> entryTypes;

	public static void init(MofgenFile file) {
		if (listTypes == null) {
			return;
		} else {
			listTypes = new HashMap<>();
			keyTypes = new HashMap<>();
			entryTypes = new HashMap<>();
		}

		fillRegistry(file);
	}

	private static void fillRegistry(MofgenFile file) {
		java.util.List<Collection> colls = EcoreUtil2.getAllContentsOfType(file, Collection.class);
		
		for(Collection coll : colls) {
			if(coll instanceof List) {
				putList((List)coll);
			}
			if(coll instanceof Map) {
				putMap((Map) coll);
			}
		}
	}
	
	private static void putList(List list) {
		ListDefOrDecl defOrDecl = list.getDefOrDecl();
		if(defOrDecl instanceof ListDefinition) {
			if(defOrDecl instanceof ListAdHoc) {
				
			}else {
				// List by RefOrCall
				// TODO: Can this even happen? Probably not!
				throw new UnsupportedOperationException("Lists created by references of other objects or calling their methods are not supported yet (And maybe never will be?)");
			}
		}else {
			//ListDeclaration
			
		}
	}
	
	private static void putMap(Map map) {
		
	}
	
	public static EClass getListType(List list) {
		return listTypes.get(list);
	}
	
	public static EClass getMapKeyType(Map map) {
		return keyTypes.get(map);
	}
	
	public static EClass getMapEntryType(Map map) {
		return entryTypes.get(map);
	}

}
