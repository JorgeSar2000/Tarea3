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

public class Cheques extends Cuenta {
    //heredaos de la clase principal

    public Cheques(int numCuenta, String nombre, double monto) {
        //parametros del constructor de la clase principal
        super(numCuenta, nombre, monto);
    }

    

    @Override
    public double Depositar() {
        //metodo abstracto para el deposito de dinero
        double balance;
        //calculamos el balance
        balance = 300 + monto;
        return (balance);
    }

    @Override
    public double Retirar() {
        //metodo abstracto para el retiro de dinero
        double balance;
        //calculamos el balance
        balance = 300 - monto;
        return (balance);
    }

    @Override
    public String toString(){
        Depositar();
        Retirar();
        return ("\nUSTED HA ELEGIDO EL TIPO DE CUENTA: CHEQUES\n"
                + "N° CUENTA == "+numCuenta+"\n"
                + "NOMBRE DEL CLIENTE: "+nombre+"\n"
                
                + "INGRESE EL MONTO DE DINERO QUE DESEA DEPOSITAR: $"+monto+"\n"
                + "SU MONTO ORIGINAL ES DE $300\n"
                + "SU SUELDO ACTUAL ES DE: $"+Depositar()+"\n"
                + "////////////////////////////////////////////////\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA RETIRAR: $"+monto+"\n"
                + "SU MONTO ORIGINAL ES DE $300\n"
                + "SU SUELDO ACTUAL ES DE: $"+Retirar());
    }
}
