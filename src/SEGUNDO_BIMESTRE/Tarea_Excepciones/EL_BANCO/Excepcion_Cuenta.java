/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_BIMESTRE.Tarea_Excepciones.EL_BANCO;

/**
 *
 * @author Jorge
 */
public class Excepcion_Cuenta extends Exception{
    //clase para implementar los mensajes de error
    public Excepcion_Cuenta(){
        //constructor de la clase Excepcion_Cuenta
        super ("NO CUENTA CON SALDO SUFICIENTE PARA LA TRANSACCION");
        //envio mensaje
    }
    public Excepcion_Cuenta(String msg){
        super (msg);
        //recibo mensaje
    }
    
}
