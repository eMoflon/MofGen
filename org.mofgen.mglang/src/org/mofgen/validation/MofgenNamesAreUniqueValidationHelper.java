package org.mofgen.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.mofgen.mGLang.ForStatement;
import org.mofgen.mGLang.GenCaseWithCast;
import org.mofgen.mGLang.IteratorVariable;
import org.mofgen.mGLang.Node;
import org.mofgen.mGLang.Pattern;
import org.mofgen.mGLang.PatternCaseWithCast;
import org.mofgen.scoping.MofgenQualifiedNameProvider;

import com.google.common.collect.Maps;

public class MofgenNamesAreUniqueValidationHelper extends NamesAreUniqueValidationHelper {

	private Map<QualifiedName, IEObjectDescription> nameToDescription;

	@Override
	/**
	 * Implements super-method except that IteratorVariables are not respected when
	 * checking for duplicate names
	 */
	protected void checkDescriptionForDuplicatedName(IEObjectDescription description,
			Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterTypeToName,
			ValidationMessageAcceptor acceptor) {
		EObject object = description.getEObjectOrProxy();
		QualifiedName qualifiedName = description.getName();

		if (nameToDescription == null) {
			nameToDescription = Maps.newHashMap();
		} else {
			IEObjectDescription prevDescription = nameToDescription.get(qualifiedName);
			if (nameToDescription.containsKey(qualifiedName)) {
				EClass eClass = object.eClass();
				if (prevDescription != null) {
					EObject prevObject = prevDescription.getEObjectOrProxy();
					EClass prevEClass = prevObject.eClass();

					createDuplicateNameError(prevDescription, prevEClass, acceptor);
					nameToDescription.put(qualifiedName, null);
				}
				createDuplicateNameError(description, eClass, acceptor);
			} else {
				nameToDescription.put(qualifiedName, description);
			}

			QualifiedName qualifiedSpecialCaseName = null;
			List<String> qualifiedSpecialCaseNameSegments = new ArrayList<>();

			// remove switch and case namespace since it should also not collide with normal
			// variables or nodes
			if (object instanceof Node && (object.eContainer() instanceof GenCaseWithCast
					|| object.eContainer() instanceof PatternCaseWithCast)) {
				for (String segment : qualifiedName.getSegments()) {
					if (!segment.startsWith(MofgenQualifiedNameProvider.SWITCH_PREFIX)
							&& !segment.startsWith(MofgenQualifiedNameProvider.CASE__PREFIX)) {
						qualifiedSpecialCaseNameSegments.add(segment);
					}
				}
			}

			if (!qualifiedSpecialCaseNameSegments.isEmpty()) {
				qualifiedSpecialCaseName = QualifiedName.create(qualifiedSpecialCaseNameSegments);
				prevDescription = nameToDescription.get(qualifiedSpecialCaseName);

				if (nameToDescription.containsKey(qualifiedSpecialCaseName)) {
					EClass eClass = object.eClass();
					EClass prevEClass = null;
					if (prevDescription != null) {
						EObject prevObject = prevDescription.getEObjectOrProxy();
						prevEClass = prevObject.eClass();
						if (!(prevObject instanceof Node && object instanceof Node
								&& !(object.eContainer() instanceof Pattern)
								&& !(prevObject.eContainer() instanceof Pattern))) {
							createDuplicateNameError(prevDescription, eClass, prevEClass, acceptor);
							nameToDescription.put(qualifiedSpecialCaseName, null);
							if (prevEClass != null) {
								createDuplicateNameError(description, eClass, prevEClass, acceptor);
							}
						}
					}
				}

			} else {
				nameToDescription.put(qualifiedSpecialCaseName, description);
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
