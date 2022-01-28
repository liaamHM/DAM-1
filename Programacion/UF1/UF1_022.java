package com.mycompany.keke;
import java.util.Scanner;
public class UF1_022 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas perosnas hay?");
        int TAM = 0;
        if (entrada.nextInt() <= 0) {
            do {
                System.out.println("El valor tiene que ser positivo, vuelve a ontroducirlo: ");
                TAM = entrada.nextInt();
            } while (TAM <= 0);
        }
        double alturas[] = new double[TAM];
        System.out.println("Introduce las alturas: ");
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = entrada.nextDouble();
        }
        double sumaAcumulada = 0;
        for (int i = 0; i < alturas.length; i++) {
            sumaAcumulada += alturas[i];
        }
        System.out.println("La media de las alturas es: " + sumaAcumulada / alturas.length + " m.");
        int sup = 0;
        int inf = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > sumaAcumulada / alturas.length) {
                sup++;
            } else {
                inf++;
            }
        }
        System.out.println("Hay un total de " + sup + " personas por encima de la media y \n" + inf + " personas por debajo de la media");
    }
}
