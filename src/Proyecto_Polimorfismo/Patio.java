/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Polimorfismo;

/**
 *
 * @author Jorge
 */
public abstract class Patio {  //clase abstracta

    /**
     *
     */
    public String Nombre, Apellido;
    //atributos tipo String para el nombre y apellido del usuario
    public int pedido, mesa, local, num = 0, cedula;
    //atributos tipo int 
    public double total = 0, iva = 0.12, precioComida = 0;
    //atributos tipo double para indicar el precio unitario de cada combo, ademas del precio total

    /**
     *
     * @param Nombre atributo tipo String para el nombre del usuario
     * @param Apellido atributo tipo String para el apellido del usuario
     * @param mesa atributo de tipo entero para especificar la mesa en la cual
     * se encuentra el usuario
     * @param cedula atributo tipo entero para la cedula del usuario
     * @param pedido atributo de tipo entero que sirve para seleccionar los
     * combos
     * @param num atributo tipo entero que sirve para señalar el numero de
     * combos que se va a pedir
     */
    public Patio(String Nombre, String Apellido, int mesa, int cedula, int pedido, int num) {
        //constructor con parametros de tipo String e int
        this.Nombre = Nombre; //guarda el nombre del usuario
        this.Apellido = Apellido; //guarda el apellido del usuario
        this.mesa = mesa; //guarda la mesa en la cual se encuentra el usuario
        this.cedula = cedula; //guarda la cedula del usuario
        this.pedido = pedido; //guarda el numero del combo que desea pedir el usuario
        this.num = num; //guarda el numero de combos que desea pedir el usuario
    }

    public abstract double total();
    //metodo abstracto tipo double para mostrar el valor total a pagar por parte del usuario

    public abstract double precioComida();
    //metodo abstracto tipo double para mostrar el valor unitario de cada combo pedido por el usuario

}
