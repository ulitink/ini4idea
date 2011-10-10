package ini4idea.lang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * @author Konstantin Ulitin
 */
public class IniLexer extends FlexAdapter {

  public IniLexer() {
    super(new _IniLexer((Reader) null));
  }
}
