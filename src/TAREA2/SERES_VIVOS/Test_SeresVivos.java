/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA2.SERES_VIVOS;

/**
 *
 * @author Jorge
 */
import TAREA2.Seres_vivos;
import java.util.ArrayList;

public class Test_SeresVivos {//clase Test para imprimir 

    public static ArrayList<Seres_vivos> Caso1 = new ArrayList<Seres_vivos>();//utilizamos ArrayList para recorrer cada una de las clases

    public static void main(String[] args) {
        Seres_vivos Caso_Loro = new Loro("Pipo", "Adulto");//datos para la clase Loro
        Seres_vivos Caso_Niño = new niño("Pedro", "niño", 8);//daros para la clase niño
        Seres_vivos Caso_Adulto = new adulto("Juan", "adulto", 1990, 1, "Marzo");//datos para la clase adulto

        Caso1.add(Caso_Loro);//utilizamos .add para especificar los nuevos objetos, en este caso Caso_loro que hace referencia a la clase Loro
        Caso1.add(Caso_Niño);//utilizamos .add para especificar los nuevos objetos, en este caso Caso_Niño que hace referencia a la clase niño
        Caso1.add(Caso_Adulto);//utilizamos .add para especificar los nuevos objetos, en este caso Caso_Adulto que hace referencia a la clase adulto
        System.out.println("DATOS: ");
        for (Seres_vivos seres : Caso1) {//utilizamos un for avanzado en donde especificamos la clase principal, un nuevo objeto y el nombre ya especificado
                                         //en el ArrayList
            System.out.println(seres.hablar());//imprimimos al metodo tipo String llamado hablar el cual esta presente en cada clase 
        }
    }

}
