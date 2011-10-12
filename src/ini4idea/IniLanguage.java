package ini4idea;

import com.intellij.lang.Language;

/**
 * @author Konstantin Ulitin
 */
public class IniLanguage extends Language {
  public static final IniLanguage INSTANCE = new IniLanguage();
  private IniLanguage() {
    super("Ini");
  }
}
