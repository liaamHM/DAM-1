package com.mycompany.keke;

import java.util.Scanner;

public class E047acronimo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();

        String[] palabras = frase.split(" ");

        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i].charAt(0));

        }

    }
}
