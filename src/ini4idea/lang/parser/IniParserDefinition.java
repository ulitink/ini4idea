package ini4idea.lang.parser;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.psi.tree.TokenSet;
import ini4idea.file.IniFileType;
import ini4idea.lang.IniTokenTypes;
import ini4idea.lang.lexer.IniLexer;
import ini4idea.lang.psi.IniFile;
import ini4idea.lang.psi.IniPsiCreator;
import org.jetbrains.annotations.NotNull;

/**
 * @author Konstantin Ulitin
 */
public class IniParserDefinition implements ParserDefinition {
  private static final IFileElementType INI_FILE_ELEMENT_TYPE = new IStubFileElementType(IniFileType.INSTANCE.getLanguage());

  @NotNull
  @Override
  public Lexer createLexer(Project project) {
    return new IniLexer();
  }

  @Override
  public PsiParser createParser(Project project) {
    return new IniParser();
  }

  @Override
  public IFileElementType getFileNodeType() {
    return INI_FILE_ELEMENT_TYPE;
  }

  @NotNull
  @Override
  public TokenSet getWhitespaceTokens() {
    return IniTokenTypes.WHITESPACES;
  }

  @NotNull
  @Override
  public TokenSet getCommentTokens() {
    return IniTokenTypes.COMMENTS;
  }

  @NotNull
  @Override
  public TokenSet getStringLiteralElements() {
    return IniTokenTypes.STRING_LITERALS;
  }

  @NotNull
  @Override
  public PsiElement createElement(ASTNode node) {


    //TODO LOG.error("Alien element type [" + type + "]. Can't create Ini PsiElement for that.");

    return IniPsiCreator.createElement(node);
  }

  @Override
  public PsiFile createFile(FileViewProvider viewProvider) {
    return new IniFile(viewProvider);
  }

  @Override
  public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
    return null;  //TODO
  }
}
