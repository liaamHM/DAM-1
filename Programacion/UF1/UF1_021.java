package com.mycompany.keke;

import java.util.Scanner;

public class UF1_021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM = 20;
        int pares[] = new int[TAM];
        System.out.println("Introduce numeros pares:");
        for (int i = 0; i < TAM; i++) {
            pares[i] = entrada.nextInt();
            if (pares[i]% 2 == 0) {
                pares[i] = entrada.nextInt();
            } else {
                i--;
            }
        }
        System.out.println("Contenido del array:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }

}
