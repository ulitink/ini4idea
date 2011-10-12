package ini4idea.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;

/**
 * @author Konstantin Ulitin
 */
public class IniSection extends ASTWrapperPsiElement {

  public IniSection(@org.jetbrains.annotations.NotNull ASTNode node) {
    super(node);
  }
}
