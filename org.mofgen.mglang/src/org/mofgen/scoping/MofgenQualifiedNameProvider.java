package org.mofgen.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.mofgen.mGLang.ForStatement;
import org.mofgen.mGLang.IteratorVariable;
import org.mofgen.utils.MofgenModelUtils;

public class MofgenQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	protected QualifiedName computeFullyQualifiedNameFromNameAttribute(EObject obj) {
		if (obj instanceof IteratorVariable) {
			EObject highestFor = MofgenModelUtils.getHightestContainerOfType(obj, ForStatement.class);
			int lineNumber = NodeModelUtils.getNode(highestFor).getStartLine();
			String forName = "for" + String.valueOf(lineNumber);

			String name = getResolver().apply(obj);
			if (Strings.isEmpty(name))
				return null;
			QualifiedName qualifiedNameFromConverter = getConverter()
					.toQualifiedName(forName + "." + getConverter().toQualifiedName(name));
			
			while (obj.eContainer() != null) {
				obj = obj.eContainer();
				if (!(obj instanceof ForStatement)) {
					QualifiedName parentsQualifiedName = getFullyQualifiedName(obj);
					if (parentsQualifiedName != null)
						return parentsQualifiedName.append(qualifiedNameFromConverter);
				}
			}
			return qualifiedNameFromConverter;
		} else {
			return super.computeFullyQualifiedNameFromNameAttribute(obj);
		}
	}
}
