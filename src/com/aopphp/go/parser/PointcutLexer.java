/* The following code was generated by JFlex 1.4.3 on 08.05.15 9:48 */

package com.aopphp.go.parser;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.aopphp.go.psi.PointcutTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 08.05.15 9:48 from the specification file
 * <tt>/src/com/aopphp/go/parser/PointcutLexer.flex</tt>
 */
public class PointcutLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\0\1\10"+
    "\4\0\1\6\7\0\1\3\12\5\6\0\1\11\32\4\1\0\1\7"+
    "\2\0\1\4\1\0\1\12\1\31\1\13\1\32\1\14\1\30\1\4"+
    "\1\25\1\21\2\4\1\26\1\34\1\23\1\22\1\35\1\4\1\36"+
    "\1\15\1\20\1\17\1\37\1\24\1\16\1\33\1\27\4\0\201\4"+
    "\uff00\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\1\4\1\1"+
    "\1\5\11\3\1\6\1\0\1\7\3\0\46\3\1\10"+
    "\4\3\1\11\4\3\1\12\1\3\1\13\6\3\1\14"+
    "\1\15\7\3\1\16\2\3\1\17\1\20\11\3\1\21"+
    "\5\3\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[111];
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
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\40\0\300"+
    "\0\40\0\340\0\u0100\0\u0120\0\u0140\0\u0160\0\u0180\0\u01a0"+
    "\0\u01c0\0\u01e0\0\u0200\0\240\0\40\0\u0220\0\300\0\u0240"+
    "\0\u0260\0\u0280\0\u02a0\0\u02c0\0\u02e0\0\u0300\0\u0320\0\u0340"+
    "\0\u0360\0\u0380\0\u03a0\0\u03c0\0\u03e0\0\u0400\0\u0420\0\u0440"+
    "\0\u0460\0\u0480\0\u04a0\0\u04c0\0\u04e0\0\u0500\0\u0520\0\u0540"+
    "\0\u0560\0\u0580\0\u05a0\0\u05c0\0\u05e0\0\u0600\0\u0620\0\u0640"+
    "\0\u0660\0\u0680\0\u06a0\0\u06c0\0\u06e0\0\u0700\0\200\0\u0720"+
    "\0\u0740\0\u0760\0\u0780\0\200\0\u07a0\0\u07c0\0\u07e0\0\u0800"+
    "\0\200\0\u0820\0\200\0\u0840\0\u0860\0\u0880\0\u08a0\0\u08c0"+
    "\0\u08e0\0\200\0\200\0\u0900\0\u0920\0\u0940\0\u0960\0\u0980"+
    "\0\u09a0\0\u09c0\0\200\0\u09e0\0\u0a00\0\200\0\200\0\u0a20"+
    "\0\u0a40\0\u0a60\0\u0a80\0\u0aa0\0\u0ac0\0\u0ae0\0\u0b00\0\u0b20"+
    "\0\200\0\u0b40\0\u0b60\0\u0b80\0\u0ba0\0\u0bc0\0\200";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[111];
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
    "\1\2\2\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\3\5\1\16\2\5"+
    "\1\17\3\5\1\20\1\5\1\21\2\5\1\22\2\5"+
    "\41\0\2\3\40\0\1\23\40\0\2\5\4\0\26\5"+
    "\6\24\1\25\1\26\30\24\7\27\1\30\1\25\27\27"+
    "\4\0\2\5\4\0\1\5\1\31\24\5\4\0\2\5"+
    "\4\0\16\5\1\32\7\5\4\0\2\5\4\0\4\5"+
    "\1\33\21\5\4\0\2\5\4\0\6\5\1\34\17\5"+
    "\4\0\2\5\4\0\11\5\1\35\14\5\4\0\2\5"+
    "\4\0\7\5\1\36\16\5\4\0\2\5\4\0\7\5"+
    "\1\37\16\5\4\0\2\5\4\0\21\5\1\40\4\5"+
    "\4\0\2\5\4\0\5\5\1\41\16\5\1\42\1\5"+
    "\2\23\1\0\35\23\2\24\1\0\35\24\2\27\1\0"+
    "\35\27\4\0\2\5\4\0\1\5\1\43\24\5\4\0"+
    "\2\5\4\0\14\5\1\44\11\5\4\0\2\5\4\0"+
    "\2\5\1\45\23\5\4\0\2\5\4\0\1\46\25\5"+
    "\4\0\2\5\4\0\7\5\1\47\16\5\4\0\2\5"+
    "\4\0\6\5\1\50\17\5\4\0\2\5\4\0\11\5"+
    "\1\51\14\5\4\0\2\5\4\0\11\5\1\52\14\5"+
    "\4\0\2\5\4\0\17\5\1\53\6\5\4\0\2\5"+
    "\4\0\7\5\1\54\1\55\15\5\4\0\2\5\4\0"+
    "\2\5\1\56\23\5\4\0\2\5\4\0\10\5\1\57"+
    "\15\5\4\0\2\5\4\0\1\5\1\60\24\5\4\0"+
    "\2\5\4\0\6\5\1\61\17\5\4\0\2\5\4\0"+
    "\6\5\1\62\17\5\4\0\2\5\4\0\13\5\1\63"+
    "\12\5\4\0\2\5\4\0\1\64\25\5\4\0\2\5"+
    "\4\0\1\65\25\5\4\0\2\5\4\0\14\5\1\66"+
    "\11\5\4\0\2\5\4\0\25\5\1\67\4\0\2\5"+
    "\4\0\6\5\1\70\17\5\4\0\2\5\4\0\3\5"+
    "\1\71\22\5\4\0\2\5\4\0\12\5\1\72\13\5"+
    "\4\0\2\5\4\0\5\5\1\73\20\5\4\0\2\5"+
    "\4\0\7\5\1\74\16\5\4\0\2\5\4\0\7\5"+
    "\1\75\16\5\4\0\2\5\4\0\7\5\1\76\16\5"+
    "\4\0\2\5\4\0\14\5\1\77\11\5\4\0\2\5"+
    "\4\0\22\5\1\100\3\5\4\0\2\5\4\0\7\5"+
    "\1\101\16\5\4\0\2\5\4\0\1\102\25\5\4\0"+
    "\2\5\4\0\2\5\1\103\23\5\4\0\2\5\4\0"+
    "\3\5\1\104\22\5\4\0\2\5\4\0\17\5\1\105"+
    "\6\5\4\0\2\5\4\0\6\5\1\106\17\5\4\0"+
    "\2\5\4\0\1\5\1\107\24\5\4\0\2\5\4\0"+
    "\1\110\25\5\4\0\2\5\4\0\11\5\1\111\14\5"+
    "\4\0\2\5\4\0\7\5\1\112\16\5\4\0\2\5"+
    "\4\0\1\5\1\113\24\5\4\0\2\5\4\0\6\5"+
    "\1\114\17\5\4\0\2\5\4\0\1\5\1\115\24\5"+
    "\4\0\2\5\4\0\2\5\1\116\23\5\4\0\2\5"+
    "\4\0\7\5\1\117\16\5\4\0\2\5\4\0\7\5"+
    "\1\120\16\5\4\0\2\5\4\0\14\5\1\121\11\5"+
    "\4\0\2\5\4\0\1\5\1\122\24\5\4\0\2\5"+
    "\4\0\2\5\1\123\23\5\4\0\2\5\4\0\6\5"+
    "\1\124\17\5\4\0\2\5\4\0\14\5\1\125\11\5"+
    "\4\0\2\5\4\0\10\5\1\126\15\5\4\0\2\5"+
    "\4\0\11\5\1\127\14\5\4\0\2\5\4\0\7\5"+
    "\1\130\16\5\4\0\2\5\4\0\2\5\1\131\23\5"+
    "\4\0\2\5\4\0\10\5\1\132\15\5\4\0\2\5"+
    "\4\0\11\5\1\133\14\5\4\0\2\5\4\0\7\5"+
    "\1\134\16\5\4\0\2\5\4\0\15\5\1\135\10\5"+
    "\4\0\2\5\4\0\20\5\1\136\5\5\4\0\2\5"+
    "\4\0\12\5\1\137\13\5\4\0\2\5\4\0\6\5"+
    "\1\140\17\5\4\0\2\5\4\0\1\141\25\5\4\0"+
    "\2\5\4\0\7\5\1\142\16\5\4\0\2\5\4\0"+
    "\6\5\1\143\17\5\4\0\2\5\4\0\1\144\25\5"+
    "\4\0\2\5\4\0\7\5\1\145\16\5\4\0\2\5"+
    "\4\0\14\5\1\146\11\5\4\0\2\5\4\0\10\5"+
    "\1\147\15\5\4\0\2\5\4\0\7\5\1\150\16\5"+
    "\4\0\2\5\4\0\11\5\1\151\14\5\4\0\2\5"+
    "\4\0\15\5\1\152\10\5\4\0\2\5\4\0\1\153"+
    "\25\5\4\0\2\5\4\0\6\5\1\154\17\5\4\0"+
    "\2\5\4\0\7\5\1\155\16\5\4\0\2\5\4\0"+
    "\10\5\1\156\15\5\4\0\2\5\4\0\11\5\1\157"+
    "\14\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3040];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\1\1\1\11\12\1\1\0"+
    "\1\11\3\0\127\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[111];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  public PointcutLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PointcutLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 102) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { return com.aopphp.go.psi.PointcutTypes.WITHIN;
          }
        case 19: break;
        case 18: 
          { return com.aopphp.go.psi.PointcutTypes.STATICINITIALIZATION;
          }
        case 20: break;
        case 5: 
          { return com.aopphp.go.psi.PointcutTypes.ANNOTATION;
          }
        case 21: break;
        case 11: 
          { return com.aopphp.go.psi.PointcutTypes.PUBLIC;
          }
        case 22: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 23: break;
        case 4: 
          { return com.aopphp.go.psi.PointcutTypes.NSSEPARATOR;
          }
        case 24: break;
        case 15: 
          { return com.aopphp.go.psi.PointcutTypes.PROTECTED;
          }
        case 25: break;
        case 6: 
          { return com.aopphp.go.psi.PointcutTypes.COMMENT;
          }
        case 26: break;
        case 16: 
          { return com.aopphp.go.psi.PointcutTypes.CFLOWBELOW;
          }
        case 27: break;
        case 9: 
          { return com.aopphp.go.psi.PointcutTypes.ACCESS;
          }
        case 28: break;
        case 17: 
          { return com.aopphp.go.psi.PointcutTypes.INITIALIZATION;
          }
        case 29: break;
        case 12: 
          { return com.aopphp.go.psi.PointcutTypes.DYNAMIC;
          }
        case 30: break;
        case 14: 
          { return com.aopphp.go.psi.PointcutTypes.EXECUTION;
          }
        case 31: break;
        case 8: 
          { return com.aopphp.go.psi.PointcutTypes.FINAL;
          }
        case 32: break;
        case 13: 
          { return com.aopphp.go.psi.PointcutTypes.PRIVATE;
          }
        case 33: break;
        case 3: 
          { return com.aopphp.go.psi.PointcutTypes.NAMEPART;
          }
        case 34: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 35: break;
        case 7: 
          { return com.aopphp.go.psi.PointcutTypes.STRING;
          }
        case 36: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}