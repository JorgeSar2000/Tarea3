/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA1_GRUPO4;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TresEnRaya {
/**
 * 
 */
    private int tablero[][] = new int[3][3]; //declaramos un arreglo bidimensional de 3x3

    public static void main(String[] args) {
        /**
         * 
         */
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        TresEnRaya mi_juego = new TresEnRaya(); // creamos un objeto llamado
        String texto; //atributo tipo String
        char opcion = '1'; //atributo tipo char que indica la opcion de iniciar a jugar

        while ((opcion == '1') ) { //condicional
            try {
                System.out.print("1- EMPEZAR A JUGAR");
                opcion = teclado.readLine().charAt(0);//opcion que vamos a pedir

                switch (opcion) { //switch para indicar la opcion para empezar a jugar

                    case '1':
                        mi_juego.inicializa();//llamamos a parametros del objeto mi_juego
                        mi_juego.dibuja_tres_en_raya();
                        mi_juego.comenzar_a_jugar();
                        break;

                    default:
                        System.out.println("Opcion incorrecta");
                        opcion = '1';

                }

            } catch (IOException ex) {
                Logger.getLogger(TresEnRaya.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void dibuja_tres_en_raya() {//metodo utilizado para crear variable locales para indicar las filas y columnas
        /**
         * 
         */
        int filas_tablero = 0; //atributo local para la impresion de las filas
        int columnas_tablero;// atributo local para la impresion de las columnas
/**
 * 
 */
        System.out.println("-------------");
        for (int i = 0; i < tablero.length; i++) {//iniciamos con la impresion de las filas
            for (int j = 0; j < tablero.length; j++) {//seguido imprimimos las columnas

                if (tablero[i][j] == 0) {
                    System.out.print("| " + tablero[i][j] + " ");
                }
                if (tablero[i][j] == 1) {
                    System.out.print("| " + "X" + " ");

                }
                if (tablero[i][j] == 3) {
                    System.out.print("|" + "  ");

                }
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("-------------");

    }

    public void inicializa() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 3;
            }
        }
    }

    public void comenzar_a_jugar() {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String introduce0;
            String introduceX;
            boolean fin = false;

            System.out.println("¿Cómo quieres jugar X/0?");//preguntamos quien desea iniciar
            String juego = teclado.readLine().toUpperCase();//atributo tipo String 
            int valor_juego = 0;//atributo tipo int que indica quien va a iniciar
            if (juego.equals("0")) {//hacemos comparacion para confirmar si empieza 0
                valor_juego = 0;
            }
            if (juego.equals("X")) {//hacemos comparacion para confirmar si empieza X

                valor_juego = 1;

            }
            if (juego.equals("X") || (juego.equals("0"))) { //comparacion para saber quien es el que empieza

                System.out.println("Comienza el 0");

                System.out.println("");

                while (fin == false) {//condicional
                    dibuja_tres_en_raya();
                    if (valor_juego == 1) {
                        System.out.println("Te toca X");
                    }
                    if (valor_juego == 0) {
                        System.out.println("Te toca 0");
                    }
                    System.out.println("TOMA EN CUENTA QUE LAS FILAS Y COLUMNAS EMPIEZAN DE 0 HASTA 2 ");
                    System.out.println("Introduce la fila");
                    int fila = Integer.parseInt(teclado.readLine());//atributo local que almacena la fila en la cual se quiere poner la X o 0
                    System.out.println("Introduce la columna");
                    int columna = Integer.parseInt(teclado.readLine());//atributo local que almacena la columna en la cual se quiere poner la X o 0
                    if (tablero[fila][columna] == 3) {//condicional 
                        boolean ganador;
                        tablero[fila][columna] = valor_juego;//en este intervalo se colocará X o 0
                        dibuja_tres_en_raya();
                        ganador = comprobar_ganador(valor_juego);//el ganador se confirma segun el valor del TresEnRaya, es decir cuando se confirme que
                                                                 //se cumplan los tres digitos ya sea en vertical, horizontal o diagonal
                        if (ganador) {
                            System.out.println("Ha ganado " + valor_juego);//mensaje para mostrar el ganador
                            fin = true;//aqui se muestra que si ya se dió un ganador, el TresEnRaya acaba
                            inicializa();
                        } else {
                            int estado_empate = 0;//atributo local para conocer si existe empate
                            for (int i = 0; i <= 2; i++) {//leemos las filas
                                for (int j = 0; j <= 2; j++) {//leemos columnas
                                    if ((tablero[i][j] == 0) || (tablero[i][j] == 1)) {//hacemos comparacion entre las X y 0 
                                        estado_empate = estado_empate + 1;
                                    }
                                }
                            }
                            if (estado_empate == 9) {
                                System.out.println("Se ha empatado");//mensaje para mostrar que se ha empatado
                                fin = true;
                            }
                            if (valor_juego == 1) {
                                valor_juego = 0;
                            } else {
                                if (valor_juego == 0) {
                                    valor_juego = 1;
                                }
                            }
                        }
                    } else {
                        System.out.println("No puede jugar, ya está usado");
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TresEnRaya.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean comprobar_ganador(int valor_juego) {

        if ((tablero[0][0] == valor_juego) && (tablero[0][1] == valor_juego) && (tablero[0][2] == valor_juego)) {//comprobamos el ganador primero 
            //por la fila 0 hasta la ultima columna
            return true;
        }
        if ((tablero[1][0] == valor_juego) && (tablero[1][1] == valor_juego) && (tablero[1][2] == valor_juego)) {//comprobamos el ganador primero 
            //por la fila 1 hasta la ultima columna
            return true;
        }
        if ((tablero[2][0] == valor_juego) && (tablero[2][1] == valor_juego) && (tablero[2][2] == valor_juego)) {//comprobamos el ganador primero //
            //por la fila 2 hasta la ultima columna
            return true;
        }
        if ((tablero[0][0] == valor_juego) && (tablero[2][0] == valor_juego) && (tablero[3][0] == valor_juego)) {//comprobamos el ganador primero 
            //por la columna 0 hasta la ultima fila
            return true;
        }
        if ((tablero[0][1] == valor_juego) && (tablero[1][1] == valor_juego) && (tablero[2][1] == valor_juego)) {//comprobamos el ganador primero 
            //por la columna 1 hasta la ultima fila
            return true;
        }
        if ((tablero[0][2] == valor_juego) && (tablero[1][2] == valor_juego) && (tablero[2][2] == valor_juego)) {//comprobamos el ganador primero 
            //por la columna 2 hasta la ultima columna
            return true;
        }
        if ((tablero[0][0] == valor_juego) && (tablero[1][1] == valor_juego) && (tablero[2][2] == valor_juego)) {//comprobamos el ganador por una 
            //de las diagonales
            return true;
        }
        if ((tablero[0][2] == valor_juego) && (tablero[1][1] == valor_juego) && (tablero[2][0] == valor_juego)) {//comprobamos el ganador 
            //por la otra diagonal
            return true;
        }
        return false;
    }

}
