package ini4idea.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import ini4idea.lang.IniTokenTypes;
import ini4idea.lang.parser.IniElementType;

/**
 * @author Konstantin Ulitin
 */
public class IniPsiCreator {

  public static PsiElement createElement(ASTNode node) {
    final IElementType astNodeType = node.getElementType();
    // TODO try to make some enum for here
    if (astNodeType == IniTokenTypes.SECTION) {
      return new IniSection(node);
    }
    else if (astNodeType == IniTokenTypes.ASSIGN) {
      return new IniAssign(node);
    }
    else if (astNodeType == IniTokenTypes.LVAL) {
      return new IniValue(node);
    }
    else if (astNodeType == IniTokenTypes.RVAL) {
      return new IniValue(node);
    }
    return new ASTWrapperPsiElement(node);
  }
}
