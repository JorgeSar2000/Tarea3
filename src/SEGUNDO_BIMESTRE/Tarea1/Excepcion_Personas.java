/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_BIMESTRE.Tarea1;

/**
 *
 * @author Jorge
 */
public class Excepcion_Personas extends Exception{
    public Excepcion_Personas(){
        super("EDAD INVALIDA");
        
    }
    public Excepcion_Personas(String msg){
        super (msg);
    }
}
class Excepcion_Personas2 extends Exception{
    public Excepcion_Personas2(){
        super ("NOTA INGRESADA INVALIDA");
    }
    public Excepcion_Personas2(String msg2){
        super (msg2);
    }
}
