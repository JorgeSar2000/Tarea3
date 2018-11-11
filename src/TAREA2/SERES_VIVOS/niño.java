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
public class niño extends Seres_vivos {//clase niño que llama al metodo de la clase principal
    private String nombre, tipo;//atributos privados de tipo String
    private int años;//atributo privado de tipo entero
    /**
     * 
     * @param nombre//atributo tipo String para el nombre del niño
     * @param tipo//atributo tipo String para el tipo de persona de acuerdo a la edad
     * @param años //atributo de tipo entero para los años 
     */
    public niño (String nombre, String tipo, int años){//constructor de la clase niño
        this.nombre = nombre;
        this.tipo = tipo;
        this.años = años;
    }
    @Override
    public String hablar(){//metodo tipo String de la clase principal
        return ("Hola, me llamo "+nombre+" y se hablar.\n"
                + "Soy racional.\n"
                + "Tengo "+años+" años.\n"
                + "Soy "+tipo);
    }

    @Override
    public int edad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
