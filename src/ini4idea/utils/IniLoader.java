package ini4idea.utils;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.fileTypes.FileNameMatcher;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeManager;
import ini4idea.IniFileType;
import org.jetbrains.annotations.NotNull;

/**
 * @author Konstantin Ulitin
 */
public class IniLoader implements ApplicationComponent {
  public IniLoader() {
  }

  public void initComponent() {
    IniFileType iniFileType = IniFileType.INI_FILE_TYPE;
    FileTypeManager.getInstance().associateExtension(iniFileType, "ini");
  }

  public void disposeComponent() {
  //  IniFileType iniFileType = IniFileType.INI_FILE_TYPE;
  //  FileTypeManager.getInstance().removeAssociatedExtension(iniFileType, "ini");
  }

  @NotNull
  public String getComponentName() {
    return "ini4idea.loader";
  }
}
