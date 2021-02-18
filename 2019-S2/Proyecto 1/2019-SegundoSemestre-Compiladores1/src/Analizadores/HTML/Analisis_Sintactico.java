
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores.HTML;

import java_cup.runtime.Symbol;
import Estructuras.Cola;
import java.util.ArrayList;
import Modelos.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analisis_Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public Analisis_Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analisis_Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analisis_Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\003" +
    "\012\000\002\004\011\000\002\005\011\000\002\006\011" +
    "\000\002\007\004\000\002\007\003\000\002\010\003\000" +
    "\002\010\003\000\002\011\011\000\002\013\013\000\002" +
    "\013\014\000\002\012\004\000\002\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\004\023\005\001\002\000\004\002\074\001" +
    "\002\000\004\004\007\001\002\000\004\002\000\001\002" +
    "\000\004\022\010\001\002\000\004\023\011\001\002\000" +
    "\004\012\057\001\002\000\004\023\013\001\002\000\004" +
    "\006\020\001\002\000\004\023\015\001\002\000\004\005" +
    "\016\001\002\000\004\022\017\001\002\000\004\002\uffff" +
    "\001\002\000\004\022\021\001\002\000\004\023\024\001" +
    "\002\000\004\023\ufff8\001\002\000\004\023\ufff9\001\002" +
    "\000\006\014\031\016\032\001\002\000\004\023\027\001" +
    "\002\000\004\023\ufffa\001\002\000\010\007\033\014\031" +
    "\016\032\001\002\000\004\023\ufffb\001\002\000\004\022" +
    "\052\001\002\000\004\020\035\001\002\000\004\022\034" +
    "\001\002\000\004\023\ufffc\001\002\000\004\024\036\001" +
    "\002\000\004\021\037\001\002\000\004\022\040\001\002" +
    "\000\004\023\042\001\002\000\004\023\ufff3\001\002\000" +
    "\006\016\032\017\050\001\002\000\004\023\045\001\002" +
    "\000\004\023\ufff4\001\002\000\006\016\032\017\046\001" +
    "\002\000\004\022\047\001\002\000\004\023\ufff5\001\002" +
    "\000\004\022\051\001\002\000\004\023\ufff6\001\002\000" +
    "\004\025\053\001\002\000\004\023\054\001\002\000\004" +
    "\015\055\001\002\000\004\022\056\001\002\000\004\023" +
    "\ufff7\001\002\000\004\022\060\001\002\000\004\023\062" +
    "\001\002\000\004\023\071\001\002\000\004\010\063\001" +
    "\002\000\004\022\064\001\002\000\004\025\065\001\002" +
    "\000\004\023\066\001\002\000\004\011\067\001\002\000" +
    "\004\022\070\001\002\000\004\023\ufffd\001\002\000\004" +
    "\013\072\001\002\000\004\022\073\001\002\000\004\023" +
    "\ufffe\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\006\002\003\003\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\011\001\001\000\002\001\001\000\004\006" +
    "\013\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\007\024\010\025\011\022\013\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\010\027\011\022\013\021\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\042\013\040\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\060\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analisis_Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analisis_Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Analisis_Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Cola TodosLosErrores = new Cola();
    public ArrayList<Div> divs = new ArrayList<>();
    public String noufe = "";
    public String titulo = "";

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s){
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        System.out.println("ERROR SINTACTICO: " + lexema + " LINEA: " + fila + " COLUMNA: " + columna);
        Errores error = new Errores(lexema,fila,columna,"Token " + lexema + " No esperado", "Sintactico");
        TodosLosErrores.insertar(error);
    }

    //Metodo al que se llama en el momento en el que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s){

    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analisis_Sintactico$actions {


    

  private final Analisis_Sintactico parser;

  /** Constructor */
  CUP$Analisis_Sintactico$actions(Analisis_Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analisis_Sintactico$do_action_part00000000(
    int                        CUP$Analisis_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analisis_Sintactico$parser,
    java.util.Stack            CUP$Analisis_Sintactico$stack,
    int                        CUP$Analisis_Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analisis_Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Analisis_Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analisis_Sintactico$parser.done_parsing();
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= INICIO 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= abrir inicioHtml cerrar CABEZA CUERPO abrir finHtml cerrar 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CABEZA ::= abrir inicioHead cerrar TITULO abrir finHead cerrar 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("CABEZA",2, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // TITULO ::= abrir inicioTitle cerrar texto abrir finTitle cerrar 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)).value;
		
    titulo = (String) a;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("TITULO",3, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CUERPO ::= abrir inicioBody cerrar L_OPCIONES abrir finBody cerrar 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // L_OPCIONES ::= L_OPCIONES OPCIONES 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("L_OPCIONES",5, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // L_OPCIONES ::= OPCIONES 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("L_OPCIONES",5, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // OPCIONES ::= ERROR 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",6, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // OPCIONES ::= SECCION 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",6, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ERROR ::= abrir inicioNoufe cerrar texto abrir finNoufe cerrar 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)).value;
		
    noufe = (String) a;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("ERROR",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SECCION ::= abrir inicioDiv id igual cadena cerrar abrir finDiv cerrar 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-4)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-4)).value;
		
    String nombre = (String) a;
    nombre = nombre.replace("\"","");
    divs.add(new Div(nombre));

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("SECCION",9, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-8)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SECCION ::= abrir inicioDiv id igual cadena cerrar L_SECCIONES abrir finDiv cerrar 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-5)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-5)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-5)).value;
		
    String nombre = (String) a;
    nombre = nombre.replace("\"","");
    divs.add(new Div(nombre));

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("SECCION",9, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-9)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // L_SECCIONES ::= L_SECCIONES SECCION 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("L_SECCIONES",8, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // L_SECCIONES ::= SECCION 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("L_SECCIONES",8, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analisis_Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analisis_Sintactico$do_action(
    int                        CUP$Analisis_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analisis_Sintactico$parser,
    java.util.Stack            CUP$Analisis_Sintactico$stack,
    int                        CUP$Analisis_Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Analisis_Sintactico$do_action_part00000000(
                               CUP$Analisis_Sintactico$act_num,
                               CUP$Analisis_Sintactico$parser,
                               CUP$Analisis_Sintactico$stack,
                               CUP$Analisis_Sintactico$top);
    }
}

}