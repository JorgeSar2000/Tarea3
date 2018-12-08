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
public abstract class Personas {
    String nombre, sexo;
    int edad, falta;

    public Personas(String nombre, String sexo, int edad, int falta) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.falta = falta;
    }
    
    
    public abstract int novillos();
}
