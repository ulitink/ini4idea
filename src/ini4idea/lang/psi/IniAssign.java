package ini4idea.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;

/**
 * @author Konstantin Ulitin
 */
public class IniAssign extends ASTWrapperPsiElement {
  public IniAssign(@org.jetbrains.annotations.NotNull ASTNode node) {
    super(node);
  }
}
