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
import java.util.ArrayList;

public class TEST_PATIO {
    //clase prueba

    public static ArrayList<Patio> Caso1 = new ArrayList<Patio>();
    //creamos un arreglo de objetos con nombre de "Caso1"

    public static void main(String[] args) {

        Patio Caso_KFC = new Patio_KFC("Juan", "Ojeda", 1, 11111111, 2, 5);//Nombre, apellido, mesa, cedula, combo, numPedido
        //primer objeto para patio KFC
        Patio Caso_Tropi = new Patio_Tropi("Luis", "Martinez", 15, 22222222, 1, 3);
        //segundo objeto para patio Tropi Burguer
        Patio Caso_Fogon = new Patio_Fogon("Pepe", "Ruiz", 12, 3333333, 1, 4);
        //tercer objeto para patio Fogon Grill
        Patio Caso_Artesanale = new Patio_Artesanale("Maria", "Cañizares", 34, 4444444, 3, 2);
        //cuarto objeto para patio Artesanale
        //se crea los objetos que se desea de acuerdo con el nombre de la subclase a la cual vaya dirigida o haya referencia
       
        
        Caso1.add(Caso_KFC); //añadimos el objeto con referencia a la subclase Patio_KFC
        Caso1.add(Caso_Tropi); //añadimos el objeto con referencia a la subclase Patio_Tropi
        Caso1.add(Caso_Fogon); // añadimos el objeto con referencia a la subclase Patio_Fogon
        Caso1.add(Caso_Artesanale); //añadimos el objeto con referencia a la subclase Patio_Artesanale
        

        for (Patio patioComida : Caso1) {
            //for mejorado para mostar cada uno de los toString añadidos en todas las subclases
            System.out.println(patioComida);
            //imprimimos todos los toString
        }
    }
}
