package org.moflon.mofgen.validation;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.moflon.mofgen.mGLang.MGLangPackage;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

public class MofgenNamesAreUniqueValidationHelper extends NamesAreUniqueValidationHelper {

	private Map<QualifiedName, IEObjectDescription> localNamespaces = Maps.newHashMap();
	private Map<QualifiedName, IEObjectDescription> globalNamespaces = Maps.newHashMap();

	private ImmutableSet<EClass> globalNamespaceClassesCheckOnly = ImmutableSet
			.of(MGLangPackage.Literals.ITERATOR_VARIABLE, MGLangPackage.Literals.NODE);
	private ImmutableSet<EClass> globalNamespaceClasses = ImmutableSet.of(MGLangPackage.Literals.VARIABLE,
			MGLangPackage.Literals.COLLECTION);

	@Override
	/**
	 * Implements super-method except that IteratorVariables are not respected when
	 * checking for duplicate names
	 */
	protected void checkDescriptionForDuplicatedName(IEObjectDescription description,
			Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterTypeToName,
			ValidationMessageAcceptor acceptor) {

		List<QualifiedName> qualifiedNames = new LinkedList<>();
		QualifiedName qn = description.getName();
		qualifiedNames.add(qn);

		QualifiedName reducedQN = getReducedQualifiedName(qn);
		qualifiedNames.add(reducedQN);

		checkNamespace(description, qn, localNamespaces, acceptor, true);
		
		if (partOfGivenNamespace(description, globalNamespaceClasses)) {
			checkNamespace(description, reducedQN, globalNamespaces, acceptor, true);
		}
		if (partOfGivenNamespace(description, globalNamespaceClassesCheckOnly)) {
			checkNamespace(description, getAllQualifiedSubNames(qn), localNamespaces, acceptor, false);
			checkNamespace(description, reducedQN, globalNamespaces, acceptor, false);
		}
	}

	private QualifiedName getReducedQualifiedName(QualifiedName originalQN) {
		QualifiedName reducedQN = QualifiedName.create(originalQN.getFirstSegment(), originalQN.getLastSegment());
		if (originalQN.getSegmentCount() == 1) {
			reducedQN = QualifiedName.create(originalQN.getFirstSegment());
		}
		return reducedQN;
	}

	private List<QualifiedName> getAllQualifiedSubNames(QualifiedName originalQN) {
		List<QualifiedName> qualifiedNames = new LinkedList<>();
		List<String> segments = originalQN.getSegments();

		for (int i = 1; i < segments.size() - 1; i++) {
			List<String> currentQNSegments = new LinkedList<>();
			for (int j = 0; j < i; j++) {
				currentQNSegments.add(segments.get(j));
			}
			currentQNSegments.add(originalQN.getLastSegment());
			qualifiedNames.add(QualifiedName.create(currentQNSegments));
		}
		return qualifiedNames;
	}

	private boolean partOfGivenNamespace(IEObjectDescription description,
			ImmutableSet<EClass> reducedNameSpaceClasses) {
		EObject object = description.getEObjectOrProxy();
		return partOfGivenNamespace(object, reducedNameSpaceClasses);
	}

	private boolean partOfGivenNamespace(EObject object, ImmutableSet<EClass> reducedNameSpaceClasses) {
		EClass eClass = object.eClass();
		return partOfGivenNamespace(eClass, reducedNameSpaceClasses);
	}

	private boolean partOfGivenNamespace(EClass eClass, ImmutableSet<EClass> reducedNameSpaceClasses) {
		if (reducedNameSpaceClasses.contains(eClass)) {
			return true;
		} else {
			List<EClass> superClasses = eClass.getEAllSuperTypes();
			if (superClasses == null || superClasses.isEmpty()) {
				return false;
			}
			for (EClass superClass : superClasses) {
				if (partOfGivenNamespace(superClass, reducedNameSpaceClasses)) {
					return true;
				}
			}
			return false;
		}
	}

	protected void checkNamespace(IEObjectDescription description, List<QualifiedName> qualifiedNames,
			Map<QualifiedName, IEObjectDescription> namespace, ValidationMessageAcceptor acceptor,
			boolean putIfAbsent) {
		for (QualifiedName qualifiedName : qualifiedNames) {
			checkNamespace(description, qualifiedName, namespace, acceptor, putIfAbsent);
		}
	}

	protected void checkNamespace(IEObjectDescription description, QualifiedName qualifiedName,
			Map<QualifiedName, IEObjectDescription> namespace, ValidationMessageAcceptor acceptor,
			boolean putIfAbsent) {
		EObject object = description.getEObjectOrProxy();
		IEObjectDescription prevDescription = namespace.get(qualifiedName);
		if (namespace.containsKey(qualifiedName)) {
			EClass eClass = object.eClass();
			EClass prevEClass = null;
			if (prevDescription != null) {
				EObject prevObject = prevDescription.getEObjectOrProxy();
				prevEClass = prevObject.eClass();
				createDuplicateNameError(prevDescription, prevEClass, eClass, acceptor);
				if (putIfAbsent) {
					namespace.put(qualifiedName, null);
				}
			}
			if (prevEClass != null) {
				createDuplicateNameError(description, eClass, prevEClass, acceptor);
			}
		} else {
			if (putIfAbsent) {
				namespace.put(qualifiedName, description);
			}
		}
	}

	protected void createDuplicateNameError(IEObjectDescription description, EClass clusterType, EClass clusterType2,
			ValidationMessageAcceptor acceptor) {
		EObject object = description.getEObjectOrProxy();
		EStructuralFeature feature = getNameFeature(object);
		acceptor.acceptError(getDuplicateNameErrorMessage(description, clusterType, clusterType2, feature), object,
				feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, getErrorCode());
	}

	public String getDuplicateNameErrorMessage(IEObjectDescription description, EClass clusterType, EClass clusterType2,
			EStructuralFeature feature) {
		if (clusterType2 == null) {
			return super.getDuplicateNameErrorMessage(description, clusterType, feature);
		}

		EObject object = description.getEObjectOrProxy();
		String shortName = String.valueOf(feature != null ? object.eGet(feature) : "<unnamed>");
		StringBuilder result = new StringBuilder(64);
		result.append("Duplicate name");
		result.append(" '");
		result.append(shortName);
		result.append("'");
		result.append(" of types ");
		result.append(getTypeLabel(clusterType));
		result.append(" and ");
		result.append(getTypeLabel(clusterType2));

		if (isContainerInformationHelpful(description, shortName)) {
			EObject container = getContainerForErrorMessage(object);
			if (container != null) {
				String containerTypeLabel = getTypeLabel(container.eClass());
				EStructuralFeature containerNameFeature = getNameFeature(container);
				if (isContainerInformationHelpful(description, container, containerTypeLabel, containerNameFeature)) {
					result.append(" in ");
					result.append(containerTypeLabel);
					if (containerNameFeature != null) {
						String containerName = String.valueOf(container.eGet(containerNameFeature));
						if (containerName != null) {
							result.append(" '");
							result.append(containerName);
							result.append("'");
						}
					}
				}
			}
		}
		return result.toString();
	}
}
