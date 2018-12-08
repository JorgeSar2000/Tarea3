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
public class Profesor extends Personas{
    String materia;
    int disp;
    
    public Profesor(String nombre, String sexo, int edad, int falta, String materia,int disp){
        super(nombre, sexo, edad, falta);
        this.materia = materia;
        this.disp = disp;
    }
    public int disponible(){
        
        if (disp == 2){
            System.err.println("EL DOCENTE NO SE ENCUENTRA DISPONIBLE");
        } else if (disp == 1){
            System.out.println("DOCENTE DISPONIBLE");
        }
        return (disp);
    }

    @Override
    public int novillos() {       
        return (falta);
    }
    
    @Override
    public String toString(){
        novillos();
        return ("\nNOMBRE DEL DOCENTE: "+nombre+"\n"
                + "EDAD: "+edad+"\n"
                + "SEXO: "+sexo+"\n"
                + "MATERIA QUE IMPARTE: "+materia+"\n"
                + "N° DE FALTAS: "+falta+"\n"
                + "¿SE ENCUENTRA EL DOCENTE EN CLASES?\n"
                + "1.- SI\n"
                + "2.- NO\n"+disponible());
    }
    
}
