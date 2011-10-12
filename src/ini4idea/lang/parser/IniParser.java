package ini4idea.lang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.packageDependencies.ui.Marker;
import com.intellij.psi.tree.IElementType;
import ini4idea.lang.IniTokenTypes;
import org.jetbrains.annotations.NotNull;

/**
 * @author Konstantin Ulitin
 */
public class IniParser implements PsiParser {

  @NotNull
  @Override
  public ASTNode parse(IElementType root, PsiBuilder builder) {
    builder.setDebugMode(true); // TODO remove
    PsiBuilder.Marker rootMarker = builder.mark();
    while (parseSection(builder)) {}
    rootMarker.done(root);
    return builder.getTreeBuilt();
  }

  /**
   * @param  builder Psi builder
   * @return false if EOF was reached
   */
  private boolean parseSection(PsiBuilder builder) {
    if (builder.eof()) { return false; }
    while (builder.getTokenType() != IniTokenTypes.SECTION && !builder.eof()) {
      // TODO Assert tpkentype == EOL
      builder.advanceLexer();
    }

    PsiBuilder.Marker section = builder.mark();
    // TODO assert builder.getTokenType() == IniTokenTypes.SECTION
    builder.advanceLexer();
    while (parseAssign(builder)) {}
    section.done(IniTokenTypes.SECTION);

    return true;
  }

  private boolean parseAssign(PsiBuilder builder) {
    if (builder.getTokenType() == IniTokenTypes.EOL) {
      builder.advanceLexer();
      return true;
    }
    if (builder.getTokenType() != IniTokenTypes.STRING) { return false; }

    PsiBuilder.Marker assign = builder.mark();

    PsiBuilder.Marker lval = builder.mark();
    while (parseString(builder)) {}
    lval.done(IniTokenTypes.LVAL);

    // TODO assert builder.getTokenType() == IniTokenTypes.EQUAL
    builder.advanceLexer();

    PsiBuilder.Marker rval = builder.mark();
    while (parseString(builder)) {}
    rval.done(IniTokenTypes.RVAL);

    assign.done(IniTokenTypes.ASSIGN);

    // TODO assert builder.getTokenType() == IniTokenTypes.EOL
    builder.advanceLexer();

    return true;
  }

  private boolean parseString(PsiBuilder builder) {
    if (builder.getTokenType() != IniTokenTypes.STRING) { return false; }

    PsiBuilder.Marker str = builder.mark();
    builder.advanceLexer();
    str.done(IniTokenTypes.STRING);

    return true;

  }
}
