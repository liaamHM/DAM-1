package com.mycompany.keke;

import java.util.Scanner;

public class UF1_018 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM = 10;

        int valores[] = new int[TAM];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduce el valor " + (i + 1));
            if (entrada.hasNextInt()) {
                valores[i] = entrada.nextInt();
            } else {
                i--;
                System.out.println("Esto no es lo que hemos pedido");

            }
            entrada.nextLine();

        }

        double plus = 0;
        double min = 0;
        int plusCont = 0;
        int minCont = 0;

        for (int i = 0; i < valores.length; i++) {

            System.out.println("El elemento " + (i + 1) + " vale " + valores[i]);
        }

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] < 0) {

                min += valores[i];
                minCont++;

            } else {
                plus += valores[i];
                plusCont++;
            }
        }
        System.out.println("La media de los valores positivos es: " + plus / plusCont);
        System.out.println("La media de los valores negativos es: " + min / minCont);
    }

}
