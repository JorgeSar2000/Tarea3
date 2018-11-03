/*

 */
package TAREA1_GRUPO4;

import java.util.Scanner;

public class Zona {
    Scanner teclado = new Scanner(System.in);

    public double estudiante, pensionista, abonado, nombre;

    public Zona() {
    }

    public Zona(double estudiante, double pensionista, double abonado, double nombre) {
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.pensionista = pensionista;
        this.abonado = abonado;
    }
}

class Principal extends Zona {

    public int entrada;//estudiante = 1//////pensionista = 2//////abonado = 3
    public String zona;

    public Principal() {
    }

    public Principal(int entrada, String zona) {
        this.entrada = entrada;
        this.zona = zona;
    }

    public Principal(int entrada, String zona, double estudiante, double pensionista, double abonado) {
        super(estudiante, pensionista, abonado, nombre);
        this.entrada = entrada;
        this.zona = zona;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        System.out.println("SELECCIONE LA ZONA EN LA QUE DESEE ADQUIRIR SU BOLETO");
        System.out.println("1.- ZONA PRINCIPAL\n 2.- ZONA DE PALCO\n 3.- ZONA CENTRAL\n 4.- ZONA LATERAL ");
        if (entrada == 1){
            System.out.println("ZONA PRINCIPAL");
        }
        if (entrada == 2){
            System.out.println("ZONA DE PALCO");
        }
        if (entrada == 3){
            System.out.println("ZONA CENTRAL");
        }
        if (entrada == 4){
            System.out.println("ZONA LATERAL");
        }
        entrada = teclado.nextInt();    
        this.entrada = entrada;
    }
    
   
}

class Palco extends Zona {

    public int entrada;//estudiante = 1//////pensionista = 2//////abonado = 3
    public String zona;

    public Palco() {
    }

    public Palco(int entrada, String zona) {
        this.entrada = entrada;
        this.zona = zona;
    }

    public Palco(int entrada, String zona, double estudiante, double pensionista, double abonado) {
        super(estudiante, pensionista, abonado, nombre);
        this.entrada = entrada;
        this.zona = zona;
    }
}

class Central extends Zona{
    public int entrada;//estudiante = 1//////pensionista = 2//////abonado = 3
    public String zona;
    public Central(){}

    public Central(int entrada, String zona) {
        this.entrada = entrada;
        this.zona = zona;
    }
    public Central(int entrada, String zona, double estudiante, double pensionista, double abonado) {
        super (estudiante, pensionista, abonado, nombre);
        this.entrada = entrada;
        this.zona = zona;
    }
}

class Lateral extends Zona{
    public int entrada;//estudiante = 1//////pensionista = 2//////abonado = 3
    public String zona;
    public Lateral(){}

    public Lateral(int entrada, String zona) {
        this.entrada = entrada;
        this.zona = zona;
    }
    public Lateral(int entrada, String zona, double estudiante, double pensionista, double abonado) {
        super (estudiante, pensionista, abonado, nombre);
        this.entrada = entrada;
        this.zona = zona;
    }
}