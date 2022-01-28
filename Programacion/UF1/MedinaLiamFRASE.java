package com.mycompany.keke;

import java.text.Normalizer;
import java.util.Scanner;

public class MedinaLiamFRASE {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String frase = "";
        for (int i = 0; i < 1; i++) {
            System.out.println("Introduce un frase:");
            if (entrada.hasNextLine()) {
                frase = entrada.nextLine().toLowerCase();
                frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
                frase = frase.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                frase = frase.replace(" ", "");

            } else {
                System.out.println("Error");
                i--;
            }
            entrada.nextLine();

        }
        String str2;
        StringBuilder strb = new StringBuilder(frase);
        str2 = strb.reverse().toString().toLowerCase();

        if (frase.equals(str2)) {
            System.out.println("La frase se le igual de derecha a izquierda que de izquierda a derecha.");
        } else {
            System.out.println("La frase no se le igual de derecha a izquierda que de izquierda a derecha.");
        }

    }

}
