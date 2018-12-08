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
public class Estudiantes extends Personas{
    double calFinal;
    int maxEst, id;
    String materia;

    public Estudiantes(String nombre, String sexo, int edad, int falta, double calFinal, int maxEst,int id, String materia) {
        super(nombre, sexo, edad, falta);
        this.calFinal = calFinal;
        this.maxEst = maxEst;
        this.id = id;
        this.materia = materia;
    }
   
    
    @Override
    public int novillos(){
        return (falta);
    }
    public int edad(){
        if (edad > 25){
            try {
                throw new Excepcion_Personas();
            } catch (Excepcion_Personas excepcion_Personas) {
                System.err.println(excepcion_Personas.getMessage());
            }
        }
        return (edad);
    }
     
    public double nota(){
        if (calFinal > 10){
            try {
                throw new Excepcion_Personas2();
            } catch (Excepcion_Personas2 excepcion_Personas2) {
                System.err.println(excepcion_Personas2.getMessage());
            }
        }
        return (calFinal);
    } 
    
    public double aprobacion(){
        if (calFinal < 6){
            System.err.println("ESTUDIANTE NO APROBADO");
        }
        if (falta > 5){
            System.err.println("FALTAS MAYORES AL NUMERO ESTABLECIDO");
        }
        return (calFinal);
    }
    
    @Override
    public String toString(){
        novillos();
        return ("\tAULA N° "+id+"\n"
                + "N° MAXIMO DE ESTUDIANTES PERMITIDOS == "+maxEst+"\n"
                + "MATERIA == "+materia+"\n"
                + "NOMBRE DEL ESTUDIANTE: "+nombre+"\n"
                + "SEXO: "+sexo+"\n"
                + "EDAD: "+edad()+"\n"
                + "NOTA: "+nota()+"\n"
                + "APROBACION: "+aprobacion());
    }
    
     
    
}
