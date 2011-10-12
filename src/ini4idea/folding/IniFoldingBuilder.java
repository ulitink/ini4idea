package ini4idea.folding;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import org.jetbrains.annotations.NotNull;

/**
 * @author Konstantin Ulitin
 */
public class IniFoldingBuilder implements FoldingBuilder {

  @NotNull
  @Override
  public FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
    return new FoldingDescriptor[0];  //TODO
  }

  @Override
  public String getPlaceholderText(@NotNull ASTNode node) {
    return null;  //TODO
  }

  @Override
  public boolean isCollapsedByDefault(@NotNull ASTNode node) {
    return false;  //TODO
  }
}
