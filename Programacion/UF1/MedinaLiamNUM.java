package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamNUM {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //creo la variables necesarias para le programa
        int num = 0, invertido = 0, resto;
        //creo un bucle con bandera para verificar los datos introducidos
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
        //Aqui hago las operaciones necesarias para conseguir el numero invertido
        int reduc = num;
        while (reduc > 0) {
            resto = reduc % 10;
            invertido = invertido * 10 + resto;
            reduc /= 10;

        }
        //Por ultimo hacemos la detección de si el numero es capicua o no
        if (num == invertido) {
            System.out.println("El numero " + (num) + "es capicua!");
        } else {
            System.out.println("El numero introducido no es capicua");
        }
    }

}

//La mejora de mi programa seria cambiar el "for" por un "while" ya que simplifica bastante el
//bucle con banera, a continuación pondre todo el codigo con el bucle sustituido para que sea mas fácil comprobar que funciona.
/* "borrar esta linea para activar el código"
package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamNUM {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 0, invertido = 0, resto;
        boolean salir = false;

        while (!salir) {
            System.out.println("Introduce un numero mayor que 10:");
            num = entrada.nextInt();
            if ((entrada.hasNextInt()) && (entrada.nextInt() > 10)) {

                salir = true;

            } else {

                System.out.println("Error");
                entrada.nextLine();

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
