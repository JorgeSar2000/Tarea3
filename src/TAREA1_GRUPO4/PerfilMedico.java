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
public class PerfilMedico {
/**
 * 
 */
    public String nombre, apellido, sexo, mes; //declaro mis atributos con los cuales voy a trabajar.
    public int dia, año;
    double altura, peso;
/**
 * 
 * @param nombre //primer nombre del usuario.
 * @param apellido //apellido del usuario.
 * @param sexo //sexo del usuario.
 * @param mes //mes de nacimiento del usuario.
 * @param dia //dia de nacimiento del usuario.
 * @param año //año de nacimimiento del usuario.
 * @param altura //altura en metros del usuario.
 * @param peso  //peso en kilogramos del usuario.
 */
    public PerfilMedico(String nombre, String apellido, String sexo, String mes, int dia, int año, double altura, double peso) { //constructor con sus respectivo atributos.
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {//retornamos en nombre del usuario.
        return nombre;
    }

    public String getApellido() {//retornamos el apellido del usuario.
        return apellido;
    }

    public void setNombre(String nombre) {//pedimos el nombre del usuario.
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {//pedimos el apellido del usuario.
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {//pedimos el sexo del usuario.
        this.sexo = sexo;
    }

    public void setMes(String mes) {//pedimos el mes de nacimiento del usuario.
        this.mes = mes;
    }

    public void setDia(int dia) {//pedimos el dia de nacimiento del usuario.
        this.dia = dia;
    }

    public void setAño(int año) {//pedimos el año de nacimiento del usuario.
        this.año = año;
    }

    public void setAltura(double altura) {//pedimos la altura del usuario e metros.
        this.altura = altura;
    }

    public void setPeso(double peso) {//pedimos el peso del usuario en kilogramos.
        this.peso = peso;
    }

    public String getSexo() {//retornamos el sexo del usuario.
        return sexo;
    }

    public String getMes() {//retornamos el mes de nacimiento del usuario.
        return mes;
    }

    public int getDia() {//retornamos el dia de nacimiento del usuario.
        return dia;
    }

    public int getAño() {//retornamos el año de nacimiento del usuario.
        return año;
    }

    public double getAltura() {//retornamos la altura del usuario.
        return altura;
    }

    public double getPeso() {//retoramos el peso del usuario.
        return peso;
    }

    public double getCalculoAño() { //metodo para calcular la edad en años del usuario, donde utilizamos los años ingresados.
        int añoActual = 2018 - this.año; //declaramos una variable local llamada "añoActual" el cual va a almacenar la edad del usuario.
        return añoActual;
    }

    public double getFrecuenciaCardiaca() { //metodo utilizado para calcular la frecuencia cardiaca utilizando la formula.
        int edad = 2018 - año;//declaramos una variable local llamada "edad" la cual va a almacenar la edad del usuario en años.
        double frecuenciaCardiaca = 220 - edad;//variable local para calcular la frecuencia cardiaca del usuario.
        return frecuenciaCardiaca;
    }

    public double getMasaCorporal() {//metodo utilizado para calcular la masa corporal del usuario, teniendo en cuenta su peso y altura.
        double BMI = (this.peso) / this.altura * this.altura;//variable local que nos ayuda a calcular la masa corporal.
        return BMI;
    }
}

class Test { //calse TEST creada para llamar al constructor de la clase principal con los respectivos datos e imprimirlos.

    public static void main(String[] args) {
        PerfilMedico Caso1 = new PerfilMedico("JUAN", "PEREZ", "MASCULINO", "MARZO", 12, 2000, 1.70, 60);//nuevo objeto llamado "Caso1"
        System.out.print("PRIMER NOMBRE [" + Caso1.getNombre() + "]\n APELLIDO [" + Caso1.getApellido() + "]\n SEXO [" + Caso1.getSexo() + "]\n "
                + "FECHA DE NACIMIENTO [" + Caso1.getDia() + " - " + Caso1.getMes() + " - " + Caso1.getAño() + "]\n "
                + "EDAD (años)[" + Caso1.getCalculoAño() + "]\n ALTURA (metros) [" + Caso1.getAltura() + "]\n PESO (kg)[" + Caso1.getPeso() + "]"
                + "\n FRECUENCIA CARDIACA MAXIMA [" + Caso1.getFrecuenciaCardiaca() + "]\n"
                + "\n\tVALORES DE BMI [" + Caso1.getMasaCorporal() + "]\n Bajo peso: \tmenos de 18.5\n Normal: \tentre 18.5 y 24.9\n Sobrepeso: \tentre 25 y 29.9\n"
                + "Obeso: \t30 o mas\n INIDICE DE MASA CORPORAL ["+Caso1.getMasaCorporal()+"]");
    }
}
