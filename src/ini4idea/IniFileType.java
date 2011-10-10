package ini4idea;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import com.intellij.util.Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author Konstantin Ulitin
 */
public class IniFileType extends LanguageFileType {
  public static final IniFileType INI_FILE_TYPE = new IniFileType();
  
  private IniFileType() {
    super(IniLanguage.INI_LANGUAGE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Ini";
  }

  @NotNull
  @Override
  public String getDescription() {
    return ".ini file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "ini";
  }

  @Override
  public Icon getIcon() {
    return IconLoader.getIcon("/debugger/threads.png");
  }

}
