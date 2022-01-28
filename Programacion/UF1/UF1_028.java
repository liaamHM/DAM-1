package com.mycompany.keke;
//introducir datos hasta que entre -1

import java.util.Scanner;

public class UF1_028 {
//imprimir elementos del array

    public static void main(String[] args) {
        final int TAM = 5;
        //declaracion de array
        int[] valores = new int[TAM];
        int tamActual = 0;
        Scanner entrada = new Scanner(System.in);
        int num = 0;

        //bucle dowhile que funciona mientras no se introduzca -1
        do {
            System.out.println("introduce -1 para salir");
            if (entrada.hasNextInt()) { //validacion del tipo de dato en el buffer
                num = entrada.nextInt(); //si es entero lo guardo en num
                if (num >= 0) { //si num es positivo
                    valores[tamActual] = num; //lo guardo en la ACTUAL POSICION del array
                    tamActual++;
                    //hay que controlar que no crezca mas que TAM
                    if (tamActual >= valores.length) { //mal, porque sibrepasa el rango del array
                        //nuevo array
                        int aux[] = new int[valores.length + TAM];
                        for (int i = 0; i < valores.length; i++) {
                            aux[i] = valores[i];
                        }
                        valores = aux;
                    }
                }
            }

        } while (num != -1);
        //imprimir
        for (int i = 0; i < tamActual; i++) {
            System.out.println("En la posicion " + i + " esta el valor " + valores[i]);
        }

    }
}
