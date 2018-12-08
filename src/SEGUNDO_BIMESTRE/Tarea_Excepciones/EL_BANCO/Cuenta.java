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
public abstract class Cuenta {
    //clase abstracta principal
    
    
    int numCuenta;
    //atributos para indicar el numero de cuenta
    double balanceAct, monto;
    //atributos tipo double para indicar el balance actual y el monto que el usuario desea retirar
    String nombre;
    //atributo para el ingreso de nombre
    /**
     * 
     * @param numCuenta para el numero de cuenta
     * @param nombre para el nombre del usuario
     * @param monto para el monto que desea depositar o retirar el usuario
     */

    public Cuenta(int numCuenta, String nombre, double monto) {
        //constructor principal
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.monto = monto;
    }

    public abstract double Depositar();
    //metodo abstracto para el deposito de dinero

    public abstract double Retirar();
    //metodo abstracto para el retiro de dinero
}
