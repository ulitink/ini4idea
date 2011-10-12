package ini4idea.lang;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import ini4idea.lang.parser.IniElementType;

/**
 * @author Konstantin Ulitin
 */
public final class IniTokenTypes {

  public static final IElementType EOL = TokenType.NEW_LINE_INDENT;
  public static final IElementType COMMENT = new IniElementType("COMMENT");
  public static final IElementType WHITESPACE = TokenType.WHITE_SPACE;
  public static final IElementType SECTION = new IniElementType("SECTION");
  public static final IElementType EQUAL = new IniElementType("EQUAL");
  public static final IElementType STRING = new IniElementType("STRING");
  public static final IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

  public static final TokenSet WHITESPACES = TokenSet.create(WHITESPACE);
  public static final TokenSet COMMENTS = TokenSet.create(COMMENT);
  public static final TokenSet STRING_LITERALS = TokenSet.EMPTY;

  public static final IniElementType ASSIGN = new IniElementType("ASSIGN"); //TODO TokenType ElementType term difference ??
  public static final IniElementType LVAL = new IniElementType("LVAL");
  public static final IniElementType RVAL = new IniElementType("RVAL");

  private IniTokenTypes(){};
}
