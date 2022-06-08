/* The following code was generated by JFlex 1.4.3 on 1/6/22 06:35 */

package Analizador;
import static Analizador.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/6/22 06:35 from the specification file
 * <tt>../LexicoClase/src/Analizador/Lexico.flex</tt>
 */
class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

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
    "\11\0\1\3\1\10\2\0\1\3\22\0\1\3\1\37\1\11\2\0"+
    "\1\42\1\35\1\0\1\43\1\44\1\42\1\33\1\3\1\34\1\51"+
    "\1\7\12\2\1\0\1\50\1\41\1\32\1\40\2\0\22\1\1\27"+
    "\7\1\4\0\1\1\1\0\1\17\1\12\1\15\1\25\1\14\1\24"+
    "\1\23\1\16\1\4\2\1\1\21\1\47\1\5\1\22\2\1\1\20"+
    "\1\30\1\6\1\26\1\1\1\31\1\1\1\13\1\1\1\45\1\36"+
    "\1\46\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\2\1\1\1\5"+
    "\1\6\10\2\1\7\1\10\1\11\3\12\2\13\1\1"+
    "\1\14\1\15\1\16\1\17\1\2\1\20\1\21\1\2"+
    "\1\22\1\4\1\23\10\2\1\13\1\12\1\0\1\2"+
    "\1\24\10\2\1\0\1\2\1\25\1\26\4\2\1\3"+
    "\1\27\1\2\1\30\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[71];
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
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\52"+
    "\0\52\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222"+
    "\0\u024c\0\u0276\0\u02a0\0\u02a0\0\u02ca\0\u02f4\0\u0276\0\u031e"+
    "\0\u0348\0\u02a0\0\u0372\0\52\0\52\0\52\0\u039c\0\52"+
    "\0\52\0\u03c6\0\124\0\u03f0\0\52\0\u041a\0\u0444\0\u046e"+
    "\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540\0\52\0\52\0\u056a"+
    "\0\u0594\0\124\0\u05be\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0690"+
    "\0\u06ba\0\u06e4\0\u070e\0\u0738\0\124\0\124\0\u0762\0\u078c"+
    "\0\u07b6\0\u07e0\0\52\0\124\0\u080a\0\124\0\124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[71];
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
    "\1\2\1\3\1\4\1\5\1\6\2\3\1\7\1\10"+
    "\1\11\1\12\1\3\1\13\1\14\3\3\1\15\2\3"+
    "\1\16\1\17\1\3\1\20\1\3\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\53\0\2\3"+
    "\1\0\3\3\3\0\20\3\15\0\1\3\4\0\1\4"+
    "\52\0\1\5\47\0\2\3\1\0\1\3\1\42\1\3"+
    "\3\0\12\3\1\43\5\3\15\0\1\3\11\0\1\44"+
    "\22\0\1\45\20\0\2\3\1\0\3\3\3\0\1\3"+
    "\1\46\16\3\15\0\1\3\3\0\2\3\1\0\3\3"+
    "\3\0\7\3\1\47\10\3\15\0\1\3\3\0\2\3"+
    "\1\0\3\3\3\0\4\3\1\50\13\3\15\0\1\3"+
    "\3\0\2\3\1\0\3\3\3\0\10\3\1\51\7\3"+
    "\15\0\1\3\3\0\2\3\1\0\3\3\3\0\7\3"+
    "\1\52\10\3\15\0\1\3\3\0\2\3\1\0\3\3"+
    "\3\0\10\3\1\53\7\3\15\0\1\3\3\0\2\3"+
    "\1\0\2\3\1\54\3\0\20\3\15\0\1\3\3\0"+
    "\2\3\1\0\3\3\3\0\4\3\1\55\13\3\15\0"+
    "\1\3\34\0\1\56\51\0\1\45\54\0\1\57\52\0"+
    "\1\57\45\0\1\56\5\0\1\56\43\0\1\56\6\0"+
    "\1\56\44\0\1\60\16\0\2\3\1\0\3\3\3\0"+
    "\5\3\1\61\12\3\15\0\1\3\3\0\2\3\1\0"+
    "\2\3\1\62\3\0\20\3\15\0\1\3\2\0\10\44"+
    "\1\0\41\44\1\0\2\3\1\0\2\3\1\63\3\0"+
    "\20\3\15\0\1\3\3\0\2\3\1\0\3\3\3\0"+
    "\16\3\1\64\1\3\15\0\1\3\3\0\2\3\1\0"+
    "\3\3\3\0\5\3\1\65\12\3\15\0\1\3\3\0"+
    "\2\3\1\0\1\3\1\66\1\3\3\0\20\3\15\0"+
    "\1\3\3\0\2\3\1\0\3\3\3\0\10\3\1\67"+
    "\7\3\15\0\1\3\3\0\2\3\1\0\3\3\3\0"+
    "\14\3\1\70\3\3\15\0\1\3\3\0\2\3\1\0"+
    "\3\3\3\0\6\3\1\71\11\3\15\0\1\3\3\0"+
    "\2\3\1\0\1\72\2\3\3\0\20\3\15\0\1\3"+
    "\4\0\1\73\50\0\2\3\1\0\1\74\2\3\3\0"+
    "\20\3\15\0\1\3\3\0\2\3\1\0\3\3\3\0"+
    "\2\3\1\75\15\3\15\0\1\3\3\0\2\3\1\0"+
    "\3\3\3\0\2\3\1\76\15\3\15\0\1\3\3\0"+
    "\2\3\1\0\3\3\3\0\6\3\1\75\11\3\15\0"+
    "\1\3\3\0\2\3\1\0\3\3\3\0\11\3\1\75"+
    "\6\3\15\0\1\3\3\0\2\3\1\0\3\3\3\0"+
    "\5\3\1\77\12\3\15\0\1\3\3\0\2\3\1\0"+
    "\3\3\3\0\1\100\17\3\15\0\1\3\3\0\2\3"+
    "\1\0\1\101\2\3\3\0\20\3\15\0\1\3\3\0"+
    "\2\3\1\0\3\3\3\0\7\3\1\102\10\3\15\0"+
    "\1\3\4\0\1\73\41\0\1\103\6\0\2\3\1\0"+
    "\1\3\1\104\1\3\3\0\20\3\15\0\1\3\3\0"+
    "\2\3\1\0\2\3\1\75\3\0\20\3\15\0\1\3"+
    "\3\0\2\3\1\0\3\3\3\0\7\3\1\63\10\3"+
    "\15\0\1\3\3\0\2\3\1\0\1\3\1\105\1\3"+
    "\3\0\20\3\15\0\1\3\3\0\2\3\1\0\3\3"+
    "\3\0\2\3\1\106\15\3\15\0\1\3\3\0\2\3"+
    "\1\0\3\3\3\0\11\3\1\107\6\3\15\0\1\3"+
    "\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2100];
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
    "\1\0\1\11\5\1\2\11\22\1\3\11\1\1\2\11"+
    "\3\1\1\11\10\1\2\11\1\0\12\1\1\0\7\1"+
    "\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[71];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
    while (i < 124) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
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
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 13: 
          { lexemas=yytext(); return Parent_c;
          }
        case 26: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 27: break;
        case 11: 
          { lexemas = yytext(); return Op_relacional;
          }
        case 28: break;
        case 24: 
          { lexemas=yytext(); return While;
          }
        case 29: break;
        case 9: 
          { lexemas=yytext(); return Resta;
          }
        case 30: break;
        case 8: 
          { lexemas=yytext(); return Suma;
          }
        case 31: break;
        case 6: 
          { lexemas=yytext(); return Comillas;
          }
        case 32: break;
        case 21: 
          { lexemas=yytext(); return T_dato;
          }
        case 33: break;
        case 19: 
          { lexemas = yytext(); return Op_atribucion;
          }
        case 34: break;
        case 15: 
          { lexemas=yytext(); return Llave_c;
          }
        case 35: break;
        case 5: 
          { return Linea;
          }
        case 36: break;
        case 12: 
          { lexemas=yytext(); return Parent_a;
          }
        case 37: break;
        case 20: 
          { lexemas=yytext(); return Int;
          }
        case 38: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 39: break;
        case 14: 
          { lexemas=yytext(); return Llave_a;
          }
        case 40: break;
        case 25: 
          { lexemas=yytext(); return Cadena;
          }
        case 41: break;
        case 23: 
          { lexemas=yytext(); return Main;
          }
        case 42: break;
        case 18: 
          { lexemas=yytext(); return If;
          }
        case 43: break;
        case 7: 
          { lexemas=yytext(); return Igual;
          }
        case 44: break;
        case 17: 
          { lexemas=yytext(); return Punto;
          }
        case 45: break;
        case 1: 
          { return ERROR;
          }
        case 46: break;
        case 22: 
          { lexemas=yytext(); return Else;
          }
        case 47: break;
        case 16: 
          { lexemas=yytext(); return P_coma;
          }
        case 48: break;
        case 4: 
          { /*Ignore*/
          }
        case 49: break;
        case 10: 
          { lexemas=yytext(); return Op_logico;
          }
        case 50: break;
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