/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

/*
 * Copyright 2019 Cybrosis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cybrosis.catdea.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.cybrosis.catdea.lang.CatdeaTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_CatdeaLexer.flex</tt>
 */
public class _CatdeaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_ENTRY = 2;
  public static final int IN_TAG = 4;
  public static final int IN_MESSAGE = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\2\1\1\3\22\0\1\6\2\0\1\10\11\0\1\12\1\13\1\7\12\11\1\5\4\0\1"+
    "\17\1\0\1\14\2\0\2\14\3\0\1\14\14\0\2\14\7\0\1\16\1\0\32\15\12\0\1\1\32\0"+
    "\1\4\337\0\1\4\177\0\13\4\35\0\2\1\5\0\1\4\57\0\1\4\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\2\1\3\1\4\2\2"+
    "\1\5\1\6\3\5\1\7\2\5\3\1\3\0\1\4"+
    "\6\0\2\10\4\0\1\11\1\4\1\0\1\4\5\0"+
    "\1\12\3\0\1\7\1\13\2\4\1\0\1\4\5\0"+
    "\1\12\2\4\1\0\2\14\3\0\1\12\2\0\1\12"+
    "\3\0\1\12\2\0\1\15\2\0\1\16\2\0\1\16"+
    "\1\15\1\0\2\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\20\0\40\0\60\0\100\0\120\0\140\0\160"+
    "\0\200\0\220\0\240\0\260\0\120\0\120\0\300\0\320"+
    "\0\340\0\120\0\360\0\u0100\0\u0110\0\120\0\u0120\0\160"+
    "\0\260\0\u0130\0\u0140\0\u0150\0\u0160\0\u0170\0\u0180\0\u0190"+
    "\0\u01a0\0\u01b0\0\120\0\340\0\u01c0\0\360\0\u01d0\0\120"+
    "\0\u01e0\0\u01f0\0\u0200\0\u0210\0\u0220\0\u0230\0\u0240\0\u0250"+
    "\0\u01a0\0\u0260\0\u0270\0\u0280\0\u0290\0\120\0\u02a0\0\u02b0"+
    "\0\u02c0\0\u02d0\0\u02e0\0\u02f0\0\u0300\0\u0310\0\u0320\0\u0330"+
    "\0\u0340\0\u0350\0\u0360\0\120\0\160\0\u0370\0\u0380\0\u0390"+
    "\0\u03a0\0\u03b0\0\u03c0\0\u03d0\0\u03e0\0\u03f0\0\u0400\0\u0410"+
    "\0\u0420\0\u0430\0\u0440\0\u0450\0\u0460\0\u0470\0\u0480\0\u0490"+
    "\0\u04a0\0\u0480\0\u04b0\0\u04c0\0\u04d0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\4\7\1\6\1\7\11\6\1\10\3\7\1\11"+
    "\1\10\1\11\1\10\1\12\1\10\1\13\1\10\1\14"+
    "\3\10\1\15\4\7\1\15\1\7\1\16\1\15\1\17"+
    "\2\15\1\20\1\21\1\15\1\22\5\23\1\24\12\23"+
    "\1\25\2\26\1\27\14\25\21\0\4\7\1\0\1\7"+
    "\11\0\1\30\3\0\10\30\1\31\4\30\3\7\1\11"+
    "\1\30\1\11\5\30\1\31\3\30\1\12\3\32\10\12"+
    "\1\33\3\12\1\30\3\0\6\30\1\34\1\30\1\31"+
    "\4\30\3\35\1\36\1\30\2\36\4\30\1\31\3\30"+
    "\1\0\4\37\1\0\1\37\2\0\1\40\1\41\6\0"+
    "\4\42\1\0\1\42\1\43\21\0\1\44\1\0\1\45"+
    "\1\0\2\44\1\0\5\46\1\47\13\46\4\0\1\46"+
    "\1\50\11\46\1\25\3\0\14\25\2\0\1\26\16\0"+
    "\4\51\1\0\1\51\11\0\1\12\3\52\1\53\1\12"+
    "\2\53\4\12\1\33\3\12\1\30\3\0\6\30\1\54"+
    "\1\30\1\31\3\30\5\55\1\56\12\55\1\57\3\55"+
    "\1\57\1\60\12\57\1\0\4\37\1\0\1\37\2\0"+
    "\1\61\7\0\4\37\1\62\1\37\2\0\1\63\1\64"+
    "\16\0\1\61\7\0\4\42\1\0\1\42\22\0\1\65"+
    "\3\0\2\65\1\0\1\46\4\0\1\46\1\66\11\46"+
    "\1\67\4\51\1\67\1\51\11\67\1\55\4\70\1\56"+
    "\1\70\11\55\1\53\3\71\1\53\1\72\12\53\1\30"+
    "\3\0\6\30\1\73\1\30\1\31\3\30\5\55\1\74"+
    "\13\55\4\0\1\55\1\0\11\55\1\57\3\55\1\57"+
    "\1\75\13\57\3\0\1\30\1\57\1\30\11\57\11\0"+
    "\1\76\7\0\4\37\1\0\1\37\2\0\1\77\1\41"+
    "\16\0\1\100\17\0\1\65\1\0\1\45\1\0\2\65"+
    "\1\0\1\67\3\32\14\67\1\101\4\70\1\102\1\70"+
    "\11\101\1\55\4\70\1\74\1\70\11\55\1\53\3\32"+
    "\1\12\1\53\1\12\11\53\1\30\3\0\6\30\1\103"+
    "\1\30\1\31\3\30\1\55\4\0\1\55\1\104\11\55"+
    "\1\57\3\0\1\30\1\57\1\105\11\57\11\0\1\106"+
    "\7\0\4\37\1\0\1\37\2\0\1\107\1\110\16\0"+
    "\1\111\6\0\1\101\3\71\1\101\1\102\13\101\3\32"+
    "\1\67\1\101\1\67\11\101\1\30\3\0\6\30\1\112"+
    "\1\30\1\31\3\30\5\0\1\113\13\0\4\37\1\0"+
    "\1\37\2\0\1\107\1\41\16\0\1\114\7\0\4\115"+
    "\1\0\1\115\2\0\1\61\6\0\1\30\3\0\6\30"+
    "\1\116\1\30\1\31\3\30\11\0\1\117\17\0\1\120"+
    "\7\0\4\115\1\0\1\115\2\0\1\121\6\0\1\30"+
    "\3\0\6\30\1\122\1\30\1\31\3\30\11\0\1\123"+
    "\17\0\1\61\1\124\16\0\1\125\6\0\1\30\3\0"+
    "\6\30\1\126\1\30\1\31\3\30\13\0\1\127\15\0"+
    "\1\130\13\0\1\62\12\0\1\126\3\0\10\126\1\131"+
    "\3\126\11\0\1\132\17\0\1\133\6\0\1\126\3\35"+
    "\1\134\1\126\2\134\4\126\1\131\3\126\1\0\4\115"+
    "\1\0\1\115\11\0\1\134\3\55\1\134\1\135\13\134"+
    "\3\0\1\126\1\134\1\126\11\134";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1248];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\1\1\11\6\1\2\11\3\1\1\11\3\1"+
    "\1\11\1\1\3\0\1\1\6\0\1\1\1\11\4\0"+
    "\1\11\1\1\1\0\1\1\5\0\1\1\3\0\1\1"+
    "\1\11\2\1\1\0\1\1\5\0\3\1\1\0\1\11"+
    "\1\1\3\0\1\1\2\0\1\1\3\0\1\1\2\0"+
    "\1\1\2\0\1\1\2\0\2\1\1\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public _CatdeaLexer() {
        this((java.io.Reader)null);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _CatdeaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':  // fall through
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return MESSAGE_TOKEN;
            } 
            // fall through
          case 15: break;
          case 2: 
            { yybegin(IN_MESSAGE);
            } 
            // fall through
          case 16: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 17: break;
          case 4: 
            { return COMMENT;
            } 
            // fall through
          case 18: break;
          case 5: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 19: break;
          case 6: 
            { return SLASH;
            } 
            // fall through
          case 20: break;
          case 7: 
            { return PACKAGE_TOKEN;
            } 
            // fall through
          case 21: break;
          case 8: 
            { yybegin(IN_TAG); return LEVEL_TOKEN;
            } 
            // fall through
          case 22: break;
          case 9: 
            { yybegin(IN_MESSAGE); return COLON;
            } 
            // fall through
          case 23: break;
          case 10: 
            { return PID_TOKEN;
            } 
            // fall through
          case 24: break;
          case 11: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return TAG_TOKEN;
            } 
            // fall through
          case 25: break;
          case 12: 
            { yypushback(yylength()); yybegin(IN_ENTRY);
            } 
            // fall through
          case 26: break;
          case 13: 
            { return TIMESTAMP_TOKEN;
            } 
            // fall through
          case 27: break;
          case 14: 
            { return BUFFER;
            } 
            // fall through
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
