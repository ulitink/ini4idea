package ini4idea.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import ini4idea.lang.IniTokenTypes;

%%

%class _IniLexer
%implements FlexLexer
%unicode
%public

%type IElementType

%function advance

%eof{ return;
%eof}

EOL= \n | \r | \r\n
COMMENT=;[^\r\n]*
WHITESPACE=[\ \t\f]+
SECTION=\[[^\]]+\]
EQUAL=\=
STRING=[^\n\r\f\ \t\[\]\=;]+

%%

{EOL}        { return IniTokenTypes.EOL; }
{COMMENT}    { return IniTokenTypes.COMMENT; }
{WHITESPACE} { return IniTokenTypes.WHITESPACE; }
{SECTION}    { return IniTokenTypes.SECTION; }
{EQUAL}      { return IniTokenTypes.EQUAL; }
{STRING}     { return IniTokenTypes.STRING; }
.            { return IniTokenTypes.BAD_CHARACTER; }
