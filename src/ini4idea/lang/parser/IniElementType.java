package ini4idea.lang.parser;

import com.intellij.psi.tree.IElementType;
import ini4idea.IniFileType;

/**
 * @author Konstantin Ulitin
 */
public class IniElementType extends IElementType {
  public IniElementType(String debugName) {
    super(debugName, IniFileType.INI_FILE_TYPE.getLanguage());
  }
}
