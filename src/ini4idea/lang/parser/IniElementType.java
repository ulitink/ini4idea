package ini4idea.lang.parser;

import com.intellij.psi.tree.IElementType;
import ini4idea.file.IniFileType;

/**
 * @author Konstantin Ulitin
 */
public class IniElementType extends IElementType {
  public IniElementType(String debugName) {
    super(debugName, IniFileType.INSTANCE.getLanguage());
  }
}
