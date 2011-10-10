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

%{
/*
  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  public final int getTokenStart(){
    return zzStartRead;
  }
  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }
*/
%}

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
