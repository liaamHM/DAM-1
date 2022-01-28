package com.mycompany.keke;

import java.util.Scanner;

public class Temperatura {
    //declaracion de constantes

    private static final int SEMANAS = 52;
//declaacion de variables globales
    private int numTemperaturas = 0;
    private float[] temperaturas = new float[SEMANAS * 7];

    Scanner entrada = new Scanner(System.in);
    private int dias = 1;
    private int mes = 1;

    public static void main(String[] args) {
        Temperatura programa = new Temperatura();
        programa.inicio();

    }

    //nuevo metodo principal, resolucion del problema general
    private void inicio() {

    }

    //primer nivel de descomposición
    public void mostrarMenu() {

    }

    //segundo nivel de descomsposicón
    public void registroSemanal() {

    }

    //tercer nivel de descomposición 
    public void leerTemperaturas() {
        System.out.println("Escribe las temperaturas de esta semana");
        //contador de temperaturas leida > 7
        int numLeidas = 0;
        while (numLeidas < 7) {
            if (entrada.hasNextFloat()) {
                temperaturas[numTemperaturas] = entrada.nextFloat();
                numLeidas++;
                numTemperaturas++;

            } else {
                entrada.next();
            }
        }
        entrada.nextLine();
    }

    public void actualizarFecha() {
        //cuantos dias tiene este mes?
        int diasMesActual = 0;
        if (mes == 2) {
            diasMesActual = 28;
        } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            diasMesActual = 30;
        } else {
            diasMesActual = 31;
        }
        dias += 7;
        //cambio de mes
        if (dias > diasMesActual) {
            dias = dias - diasMesActual;
            mes++;
            //cambio de año
            if (mes > 12) {
                mes = 1;
            }
        }
    }

    public void mostrarFecha() {
        System.out.println(dias + " de ");
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("setiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");

        }
    }

    public void calcularMedia() {
        float acumulador = 0;
        for (int i = 0; i < numTemperaturas; i++) {
            acumulador = acumulador + temperaturas[i];
        }
        System.out.println(acumulador / numTemperaturas);
    }

    public void calcularDiferencia() {
        float max = temperaturas[0];
        float min = temperaturas[0];
        for (int i = 0; i < numTemperaturas; i++) {
            min = temperaturas[i];
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }

        }System.out.println(max - min);

    }

}
