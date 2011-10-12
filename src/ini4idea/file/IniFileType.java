package ini4idea.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import ini4idea.IniLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author Konstantin Ulitin
 */
public class IniFileType extends LanguageFileType {
  public static final IniFileType INSTANCE = new IniFileType();
  public static final String DEFAULT_EXTENSION = "ini";
  
  private IniFileType() {
    super(IniLanguage.INSTANCE);
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
    return DEFAULT_EXTENSION;
  }

  @Override
  public Icon getIcon() {
    return IconLoader.getIcon("/debugger/threads.png");
  }

}
