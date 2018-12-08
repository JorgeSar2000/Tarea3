/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_BIMESTRE.Tarea1;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Test_Personas {
    public static ArrayList<Personas> Caso1 = new ArrayList<Personas>();
    public static void main(String[] args) {
        Personas Caso_Est = new Estudiantes("JUAN", "masculino", 50, 3, 11, 50, 50, "fisica");
        Personas Caso_Docen = new Profesor("LUIS", "masculino", 23, 2, "fisica", 2);
        
        Caso1.add(Caso_Est);
        Caso1.add(Caso_Docen);
        
        for (Personas Aula : Caso1){
            System.out.println(Aula);
        }
        
    }
}
