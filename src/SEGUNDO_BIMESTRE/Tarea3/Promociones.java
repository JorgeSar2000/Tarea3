/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_BIMESTRE.Tarea3;

import java.util.Formatter;

/**
 *
 * @author Jorge
 */
public class Promociones {

    public static void main(String[] args) {
        double chat1, suple1, foro1, eva1, tarea1, pre1, chat2, suple2,
                foro2, eva2, tarea2, pre2, Total, acumulado1 = 0, exaFin1 = 0, totFin1 = 0, acumulado2 = 0, recu = 0, Fin = 0, sum1, sum2,
                numExa = 0, numTare = 0, numApr = 0, numRep = 0, numProm = 0, numMax = 0, numMin = 0, prom = 0;
        //DECLARACION DE VARIABLES TIPO DOUBLE 
        String alerta = "", estado = "", estudiante = "", alerta2 = "";
        //DECLARACION DE VARIABLES TIPO STRING
        try {
            Formatter File_Prom = new Formatter("Promociones.csv");//CREAMOS EL ARCHIVO .CSV
            File_Prom.format("%s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s; %s;"
                    + "%s; %s; %s; %s; %s;", "ESTUDIANTE", "CHAT 1", "ACT. SUPLE 1", "FORO 1", "EVALUACION 1", "TAREA 1", "PRESENCIAL 1",
                    "CHAT 2", "ACT. SUPLE 2", "FORO 2", "EVALUACION 2", "TAREA 2", "PRESENCIAL 2", "BIMESTRE 1", "BIMESTRE 2", "TOTAL",
                    "ALERTA", "ACUMULADO 60%", "EXAMEN FINAL",
                    "TOTAL 60%", "ALERTA 2", "ACUMULADO 40%", "RECUPERACION", "FINAL", "ESTADO");

            //LE DOY UN FORMATO AL ARCHIVO DE EXCEL PARA QUE SE PRESENTE DE MANERA ORDENADA
            File_Prom.format("\r\n");
            for (int i = 0; i < 10; i++) {//UTILIZO FOR PARA 10 ESTUDIANTES
                estudiante = "Estudiante [" + (i + 1) + "]";//MENCIONO EL NUMERO DE ESTUDIANTE
                chat1 = (double) Math.floor(Math.random() * (1 - 0 + 1) + (0));//NUMERO ALEATORIO PARA CHAT1
                foro1 = (double) Math.floor(Math.random() * (1 - 0 + 1) + (0));//NUMERO ALEATORIO PARA FORO1
                eva1 = (double) Math.floor(Math.random() * (2 - 0 + 1) + (0));//NUMERO ALEATORIO PARA EVALUACION1
                tarea1 = (double) Math.floor(Math.random() * (6 - 0 + 1) + (0));//NUMERO ALEATORIO PARA TAREA1
                pre1 = (double) Math.floor(Math.random() * (10 - 0 + 1) + (0));//NUMERO ALEATORIO PARA PRESENCIAL1

                chat2 = (double) Math.floor(Math.random() * (1 - 0 + 1) + (0));//NUMERO ALEATORIO PARA CHAT2
                foro2 = (double) Math.floor(Math.random() * (1 - 0 + 1) + (0));//NUMERO ALEATORIO PARA FORO2
                eva2 = (double) Math.floor(Math.random() * (2 - 0 + 1) + (0));//NUMERO ALEATORIO PARA EVALUACION2
                tarea2 = (double) Math.floor(Math.random() * (6 - 0 + 1) + (0));//NUMERO ALEATORIO PARA TAREA2
                pre2 = (double) Math.floor(Math.random() * (10 - 0 + 1) + (0));//NUMERO ALEATORIO PARA PRESENCIAL2

                if (chat1 == 0) {//CONDICIONAL PARA SABER SI NO CUMPLIO CON EL CHAT1
                    suple1 = (double) Math.floor(Math.random() * (1 - 0 + 1) + (0));
                    //SI NO LO CUMPLIO GENERAMOS UN NUMERO ALEATORIO ENTRE 0 Y 1
                } else {//SI EL ESTUDIANTE CUMPLIO CON EL CHAT1 ENTONCES NO TIENE QUE CUMPLIR CON DICHA ACTIVIDAD DE RECUPERACION
                    suple1 = 0;
                }
                sum1 = chat1 + eva1 + tarea1 + pre1;//SUMAMOS LAS ACTIVIDADES PARA DETERMINAR CON LA NOTA DE PRIMER BIMESTRE
                if (chat2 == 0) {//CONDICIONAL PARA SABER SI NO CUMPLIO CON EL CHAT2
                    suple2 = (double) Math.floor(Math.random() * (1 - 0 + 1) + (0));
                    //SI NO LO CUMPLIO GENERAMOS UN NUMERO ALEATORIO ENTRE 0 Y 1
                } else {//SI EL ESTUDIANTE CUMPLIO CON EL CHAT2 ENTONCES NO TIENE QUE CUMPLIR CON DICHA ACTIVIDAD DE RECUPERACION
                    suple2 = 0;
                }
                sum2 = chat2 + eva2 + tarea2 + pre2;//SUMAMOS LAS ACTIVIDADES PARA DETERMINAR CON LA NOTA DEL SEGUNDO BIMESTRE
                Total = sum1 + sum2;//SUMAMOS LOS DOS BIMETRES
                if (Total < 28) {//SI EL ESTUDIANTE NO ALCANZO MINIMO 28 PUNTOS SE DA UN MENSAJE DE ALERTA
                    alerta = "Debe rendir un examen final";
                    acumulado1 = Total * 0.6;//SE ACUMULA EL 60% DE LA NOTA TOTAL DE LA SUMA DE LOS DOS BIMESTRES
                    exaFin1 = (double) Math.floor(Math.random() * (16 - 0 + 1) + (0));
                    //GENERAMOS UN NUMERO ALEATORIO ENTRE 0 Y 16 QUE ES EL VALOR DE LA
                    //EVALUACION FINAL1
                    totFin1 = acumulado1 + exaFin1;//SUMAMOS EL 60% DEL TOTAL CON EL VALOR DEL EXAMEN FINAL1
                    if (totFin1 < 28) {//SI EL ESTUDIANTE NO ALCANZO NUEVAMENTE MINIMO 28 PUNTOS SE PRESENTA OTRO MENSAJE DE ALERTA
                        alerta2 = "Debe rendir un examen de recuperacion";
                        acumulado2 = totFin1 * 0.4;//SE ACUMULA EL 40% DE LA ULTIMA NOTA OBTENIDA
                        recu = (double) Math.floor(Math.random() * (24 - 0 + 1) + (0));
                        //GENERAMOS UN NUMERO ALEATORIO ENTRE 0 Y 24 QUE ES EL VALOR DE LA
                        //EVALUACION DE RECUPERACION
                        Fin = acumulado2 + recu;//SUMAMOS EL ACUMULADO DEL 40% CON LA NOTA DE LA PRUEBA DE RECUPERACION
                        if (Fin < 28) {//SI EL ESTUDIANE NUEVAMENTE NO OBTUVO MINIMO 28 PUNTOS SE LE PRESENTA UN MENSAJE DE REPROBADO
                            estado = "REPROBADO";
                        } else {//SI EL ESTUDIANTE ALCANZO MINIMO 28 PUNTOS SE PRESENTA UN MENSAJE DE APROBADO
                            estado = "APROBADO";
                        }
                    } else {
                        estado = "APROBADO";
                        alerta2 = "";
                        recu = 0;
                        Fin = 0;
                        acumulado2 = 0;
                    }

                } else {//SI EL ESTUDIANTE ALCANZO MINIMO 28 PUNTOS EN LA SUMA DEL PRIMER BIMESTRE CON EL SEGUNDO BIMESTRE, ENTONCES SOLO SE
                    //PRESENTA UN MENSAJE DE APROBADO Y OTROS VALORES EN 0
                    estado = "APROBADO";
                    alerta = "";
                    alerta2 = "";
                    acumulado1 = 0;
                    acumulado2 = 0;
                    exaFin1 = 0;
                    totFin1 = 0;
                    recu = 0;
                    Fin = 0;
                }

                if (pre1 == 0 || pre2 == 0 || exaFin1 == 0 || recu == 0) {//SI NO DA ALGUNA DE LAS 4 PRUEBAS SE LE SUMA UNO AL CONTADOR
                    numExa += 1;//SIRVE PARA CONTABILIZAR CUANTAS PRUEBAS NO REALIZO
                }

                if (tarea1 == 0 || tarea2 == 0) {//SI NO CUMPLE ALGUNA DE LAS DOS TAREAS SE SUMA UNO AL CONTADOR 
                    numTare += 1;//SIRVE PARA CONTABILIZAR CUANTAS TAREAS NO REALIZO ALGUNA DE SUS TAREAS
                }

                if (estado == "APROBADO") {//SI SU ESTADO ES APROBADO ENTONCES SE SUMA UNO AL CONTADOR 
                    numApr += 1;//SIRVE PARA CONTABILIZAR CUANTOS ALUMNOS APROBARON
                }
                if (estado == "REPROBADO") {//SI SU ESTADO ES REPROBADO ENTONCES SE SUMA UNO AL CONTADOR 
                    numRep += 1;//SIRVE PARA CONRABILIZAR CUANTOS ALUMNOS REPORBARON
                }
                if (Total >= 35) {//SIRVE PARA ENCONTRAR A LOS ALUMNOS QUE SE ACERCARON A 40 PUNTOS 
                    numMax += 1;//SIRVE PARA CONTABILIZAR CUANTOS ALUMNOS SE ACERCARON A 40 PUNTOS
                }
                if (Total >= 0 && Total <= 27) {//SIRVE PARA ENCONTRAR A LOS ALUMNOS CON BAJAS CALIFICACIONES
                    numMin += 1;//SIRVE PARA CONTABILIZAR LOS ESTUDIANTES CON BAJAS CALIFICACIONES
                }
                prom += Total / 10;//SACAMOS EL PROMEDIO DE TODOS LOS ESTUDIANTES
                if (Total > prom) {//SIRVE PARA ENCONTRAR LOS ALUMNOS QUE ESTAN SOBRE EL PROMEDIO DE NOTAS
                    numProm += 1;//SIRVE PARA CONTABILIZAR CUANTOS ALUMNOS SE ENCUENTRAN POR ENCIMA DE LA MEDIA
                }
                File_Prom.format("%s;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;"
                        + "%.2f;%.2f;%.2f;%.2f;%.2f;%s;%.2f;%.2f;%.2f;%s;%.2f;%.2f;%.2f;%s;", estudiante, chat1,
                        suple1, foro1, eva1, tarea1, pre1, chat2, suple2, foro2, eva2, tarea2, pre2, sum1, sum2, Total, alerta,
                        acumulado1, exaFin1, totFin1, alerta2, acumulado2, recu, Fin, estado);

                //ENVIAMOS LAS VARIABLES 
                File_Prom.format("\r\n");
            }
            File_Prom.format("\r\n%.2f;%s;", numExa, "ESTUDIANTE(S) NO SE PRESENTARON A SUS EXAMENES");
            File_Prom.format("\r\n%.2f;%s;", numTare, "ESTUDIANTE(S) NO PRESENTARON SUS TAREAS");
            File_Prom.format("\r\n%.2f;%s;", numApr, "ESTUDIANTE(S) APROBADO(S)");
            File_Prom.format("\r\n%.2f;%s;", numRep, "ESTUDIANTE(S) REPROBADO(S)");
            File_Prom.format("\r\n%.2f;%s;", numMax, "ESTUDIANTE(S) SE ACERCAN A 40 PUNTOS");
            File_Prom.format("\r\n%.2f;%s;", numMin, "ESTUDIANTE(S) ESTAN BAJOS EN NOTAS");
            File_Prom.format("\r\n%s;%.2f;%s;%.2f;%s;", "PROMEDIO: ", prom, "----------", numProm, "ESTUDIANTE(S) ESTAN POR ENCIMA DEL PROMEDIO");
            //FORMATO PARA CADA UNA DE LAS ESPECIFICACIONES DEL PROBLEMA
            File_Prom.close();
        } catch (Exception e) {
        }
    }
}
