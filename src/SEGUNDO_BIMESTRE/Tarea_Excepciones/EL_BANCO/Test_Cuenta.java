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
import java.util.ArrayList;

public class Test_Cuenta {

    public static ArrayList<Cuenta> Caso1 = new ArrayList<Cuenta>();
    //creamos un arreglo de objetos

    public static void main(String[] args) {
        Cuenta Caso_Ahorros = new Ahorros(12, "Juan Martin", 400);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase Ahorros
        Cuenta Caso_Cheques = new Cheques(34, "Luis Espindola", 400);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase Cheques
        Cuenta Caso_Platino = new Platino(156, "Luisa Cañizares", 30);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase Platino

        Caso1.add(Caso_Ahorros);
        Caso1.add(Caso_Cheques);
        Caso1.add(Caso_Platino);

        for (Cuenta cuentas : Caso1) {
            System.out.println(cuentas);
        }
    }
}
