package com.mycompany.keke;

import java.util.Scanner;

public class LiamMedinaNUM {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 0, invertido = 0, resto;

        for (int i = 0; i < 1; i++) {
            System.out.println("Introduce un numero mayor que 10:");
            if ((entrada.hasNextInt())) {
                num = entrada.nextInt();
                if (num <= 10) {
                    System.out.println("Error");
                    entrada.nextLine();
                    i--;
                }

            } else {

                System.out.println("Error");
                entrada.nextLine();
                i--;

            }
        }

        int reduc = num;
        while (reduc > 0) {
            resto = reduc % 10;
            invertido = invertido * 10 + resto;
            reduc /= 10;

        }

        if (num == invertido) {
            System.out.println("El numero invertido es capicua!");
        } else {
            System.out.println("El numero introducido no es capicua");
        }
    }

}
        /*while (!salir) {
            System.out.println("Introduce un numero mayor que 10:");
            if ((entrada.hasNextInt()) && (entrada.nextInt() > 10)) {
                
                num = entrada.nextInt();
                salir = true;
                
            } else {
                
                System.out.println("Error");
                entrada.nextLine();
                
            }
        }
*/
