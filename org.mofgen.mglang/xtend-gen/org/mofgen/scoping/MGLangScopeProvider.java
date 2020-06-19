/**
 * generated by Xtext 2.20.0
 */
package org.mofgen.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.mofgen.mGLang.MGLangPackage;
import org.mofgen.mGLang.MofgenFile;
import org.mofgen.mGLang.Node;
import org.mofgen.mGLang.PatternNodeReference;
import org.mofgen.scoping.AbstractMGLangScopeProvider;
import org.mofgen.utils.MofgenModelUtils;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class MGLangScopeProvider extends AbstractMGLangScopeProvider {
  public IScope getScopeForReferenceType(final PatternNodeReference ref) {
    final Node src = ref.getSource();
    final MofgenFile file = this.getRootFile(ref);
    final ArrayList<EClass> classes = MofgenModelUtils.getClasses(file);
    final Function1<EClass, Boolean> _function = (EClass c) -> {
      return Boolean.valueOf(c.getName().equals(src.getName()));
    };
    final EClass srcClass = IterableExtensions.<EClass>toList(IterableExtensions.<EClass>filter(classes, _function)).get(0);
    return Scopes.scopeFor(srcClass.getEAllReferences());
  }
  
  public IScope getScopeForClasses(final PatternNodeReference ref) {
    final MofgenFile file = this.getRootFile(ref);
    return Scopes.scopeFor(MofgenModelUtils.getClasses(file));
  }
  
  public MofgenFile getRootFile(final EObject context) {
    EObject traverser = context;
    while ((!(context instanceof MofgenFile))) {
      traverser = traverser.eContainer();
    }
    return ((MofgenFile) traverser);
  }
  
  public boolean isReferenceSource(final EObject context, final EReference reference) {
    return ((context instanceof PatternNodeReference) && Objects.equal(reference, MGLangPackage.Literals.PATTERN_NODE_REFERENCE__SOURCE));
  }
  
  public boolean isReferenceType(final EObject context, final EReference reference) {
    return ((context instanceof PatternNodeReference) && Objects.equal(reference, MGLangPackage.Literals.PATTERN_NODE_REFERENCE__TYPE));
  }
  
  public boolean isReferenceTarget(final EObject context, final EReference reference) {
    return ((context instanceof PatternNodeReference) && Objects.equal(reference, MGLangPackage.Literals.PATTERN_NODE_REFERENCE__TARGET));
  }
}
