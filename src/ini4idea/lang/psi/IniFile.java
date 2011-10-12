package ini4idea.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import ini4idea.IniLanguage;
import ini4idea.file.IniFileType;
import org.jetbrains.annotations.NotNull;

/**
 * @author Konstantin Ulitin
 */
public class IniFile extends PsiFileBase {

  public IniFile(FileViewProvider viewProvider) {
    super(viewProvider, IniLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return IniFileType.INSTANCE;  //TODO
  }
}
