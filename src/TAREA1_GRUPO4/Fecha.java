/*
Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día (tipo int) y un año (tipo int). 
Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe asumir que los valores que se proporcionan son correaos. 
Proporcione un método establecer y un método obtener para cada variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año, 
separados por barras diagonales (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
 */
package TAREA1_GRUPO4;

public class Fecha {
    public int mes, dia, año;
/**
 * 
 * @param dia //atributo creado para almacenar el dia de nacimiento del usuario
 * @param mes //atributo creado para almacenar el mes de nacimiento del usuario
 * @param año  //atributo creado para almacenar el año de nacimiento del usuario
 */
    public Fecha(int dia, int mes, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public int getMes() {
        this.mes = (mes < 12)? mes : 0 ;//restriccion para el mes = no debe ser mayor a 12
        return mes;
    }

    public void setMes(int mes) {
        this.mes = (mes < 12)? mes : 0 ;//restriccion para el mes = no debe ser mayor a 12
        this.mes = mes;
    }

    public int getDia() {
        this.dia = (dia < 31)? dia : 0 ;//restriccion para el dia = no debe ser mayor a 31
        return dia;
    }

    public void setDia(int dia) {
        this.dia = (dia < 31)? dia : 0 ;//restriccion para el dia = no debe ser mayor a 31
        this.dia = dia;
    }

    public int getAño() {
        this.año = (año > 2018)? 0 : año ;//restriccion para el mes = no debe ser mayor a 2018
        return año;
    }

    public void setAño(int año) {
        this.año = (año > 2018)? 0 : año ;//restriccion para el mes = no debe ser mayor a 2018
        this.año = año;
    }
    public void setMostarFecha(){ //metodo creado para mostrar la fecha
        System.out.println("AÑO: "+this.dia+" / "+this.mes+" / "+this.año);
    }
    public String toString(){
        return (getDia()+" "+getMes()+" "+getAño());
    }
}

class PruebFecha{
    public static void main(String[] args) {
        Fecha Caso1 = new Fecha(2, 3, 2000);//parametros dados
        Caso1.setMostarFecha();
    }
}