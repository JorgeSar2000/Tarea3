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
public class PRUEBA {

    public static void main(String[] args) {
        Ficha fichaX = new Ficha("X");
        Ficha fichaO = new Ficha();
        fichaO.setFicha("O");

        Jugador jugadorX = new Jugador(fichaX);
        Jugador jugadorO = new Jugador();
        jugadorO.setFicha(fichaO);

        Tablero tablero = new Tablero();
        tablero.imprimir();
        boolean ganador = false;
        for (int veces = 1; veces <= 9; veces++) {
            if (veces % 2 == 0) {
                jugadorO.ponerFicha(tablero);
                ganador = tablero.verificarGanador(jugadorO);
            } else {
                jugadorX.ponerFicha(tablero);
                ganador = tablero.verificarGanador(jugadorX);
            }
            tablero.imprimir();
            if (ganador) {
                break;
            }
        }
        if (ganador) {
            System.out.println("HAZ GANADO!!!");
        } else {
            System.out.println("VUELVE A INTENTARLO!!!");
        }

    }

    public class Tablero1 {

        private String[][] tablero;

        public void Tablero() {
            tablero = new String[3][3];
            limpiar();
        }

        public void Tablero(String[][] tablero) {
            this.tablero = tablero;
        }

        public String[][] getTablero() {
            return tablero;
        }

        public void setTablero(String[][] tablero) {
            this.tablero = tablero;
        }

        public void limpiar() {
            for (int f = 0; f < tablero.length; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    tablero[f][c] = " ___ ";
                }
            }
        }

        public void imprimir() {
            for (int f = 0; f < tablero.length; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    System.out.print(tablero[f][c]);
                }
                System.out.println("");
            }
        }

        public boolean verificarGanador(Jugador jugador) {
            boolean valor = false;
            String ficha1 = " _" + jugador.getFicha().getFicha() + "_ ";
            String ficha3 = ficha1 + ficha1 + ficha1;
            String fila = tablero[0][0] + tablero[0][1] + tablero[0][2];
            //System.out.println("-->"+ficha3);
            //System.out.println("-->"+ficha1);
            if (ficha3.equals(fila)) {
                valor = true;
            }
            fila = tablero[1][0] + tablero[1][1] + tablero[1][2];
            if (ficha3.equals(fila)) {
                valor = true;
            }
            fila = tablero[2][0] + tablero[2][1] + tablero[2][2];
            if (ficha3.equals(fila)) {
                valor = true;
            }
            String columna = tablero[0][0] + tablero[1][0] + tablero[2][0];
            if (ficha3.equals(columna)) {
                valor = true;
            }
            columna = tablero[0][1] + tablero[1][1] + tablero[2][1];
            if (ficha3.equals(columna)) {
                valor = true;
            }
            columna = tablero[0][2] + tablero[1][2] + tablero[2][2];
            if (ficha3.equals(columna)) {
                valor = true;
            }
            String diagonal = tablero[0][0] + tablero[1][1] + tablero[2][2];
            if (ficha3.equals(diagonal)) {
                valor = true;
            }
            diagonal = tablero[2][0] + tablero[1][1] + tablero[0][2];
            if (ficha3.equals(diagonal)) {
                valor = true;
            }
            return valor;
        }

    }

    public class Tablero {

        private String[][] tablero;

        public Tablero() {
            tablero = new String[3][3];
            limpiar();
        }

        public Tablero(String[][] tablero) {
            this.tablero = tablero;
        }

        public String[][] getTablero() {
            return tablero;
        }

        public void setTablero(String[][] tablero) {
            this.tablero = tablero;
        }

        public void limpiar() {
            for (int f = 0; f < tablero.length; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    tablero[f][c] = " ___ ";
                }
            }
        }

        public void imprimir() {
            for (int f = 0; f < tablero.length; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    System.out.print(tablero[f][c]);
                }
                System.out.println("");
            }
        }

        public boolean verificarGanador(Jugador jugador) {
            boolean valor = false;
            String ficha1 = " _" + jugador.getFicha().getFicha() + "_ ";
            String ficha3 = ficha1 + ficha1 + ficha1;
            String fila = tablero[0][0] + tablero[0][1] + tablero[0][2];
            //System.out.println("-->"+ficha3);
            //System.out.println("-->"+ficha1);
            if (ficha3.equals(fila)) {
                valor = true;
            }
            fila = tablero[1][0] + tablero[1][1] + tablero[1][2];
            if (ficha3.equals(fila)) {
                valor = true;
            }
            fila = tablero[2][0] + tablero[2][1] + tablero[2][2];
            if (ficha3.equals(fila)) {
                valor = true;
            }
            String columna = tablero[0][0] + tablero[1][0] + tablero[2][0];
            if (ficha3.equals(columna)) {
                valor = true;
            }
            columna = tablero[0][1] + tablero[1][1] + tablero[2][1];
            if (ficha3.equals(columna)) {
                valor = true;
            }
            columna = tablero[0][2] + tablero[1][2] + tablero[2][2];
            if (ficha3.equals(columna)) {
                valor = true;
            }
            String diagonal = tablero[0][0] + tablero[1][1] + tablero[2][2];
            if (ficha3.equals(diagonal)) {
                valor = true;
            }
            diagonal = tablero[2][0] + tablero[1][1] + tablero[0][2];
            if (ficha3.equals(diagonal)) {
                valor = true;
            }
            return valor;
        }
    }

    public class Ficha {

        private String ficha;

        public Ficha() {
        }

        public Ficha(String ficha) {
            this.ficha = ficha;
        }

        public String getFicha() {
            return ficha;
        }

        public void setFicha(String ficha) {
            this.ficha = ficha;
        }
    }
}
