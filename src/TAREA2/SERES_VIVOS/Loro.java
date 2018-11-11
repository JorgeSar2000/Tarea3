/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA2.SERES_VIVOS;

import TAREA2.Seres_vivos;

/**
 *
 * @author Jorge
 */
public class Loro extends Seres_vivos {//clase Loro que llama al metodo abstracto de la clase principal
    private String nombre, tipo;
    /**
     * 
     * @param nombre //variable privada que almacena el nombre del loro
     * @param tipo  //variable privada que almacena el tipo de edad (joven, adulto, etc)
     */
    public Loro (String nombre, String tipo){ //constructor de la clase Loro
        this.nombre = nombre;//almacena los datos tipo String para nombre
        this.tipo = tipo;//almacena los datos tipo String para tipo
    }
    @Override
    public String hablar(){//metodo de la clase principal que muestra el mensaje deacuerdo a la clase
        return ("Hola. me llamo "+nombre+" y se hablar.\n"
                + "Soy "+tipo);
    }

    @Override
    public int edad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
