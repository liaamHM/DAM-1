package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamDNI {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaramos el array de letras de DNI y las variables necesarias
        char letras[] = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        boolean salir = false;
        int num = 0;
        do {
            //hacemos una validación con una bandera para saber si se ha introducido un numero y si este está entre los numeros pedidos.
            System.out.println("Introduce solamente la numeración de tu DNI:");
            if (entrada.hasNextInt()) {
                num = entrada.nextInt();
                if (num < 99999999 && num > 0) {
                    salir = true;
                } else {
                    System.out.println("Numero incorrecto");
                    entrada.nextLine();
                }

            } else {
                System.out.println("Esto no es un numero");
                entrada.nextLine();
            }
        } while (!salir);
        //creamos variantes necesarias y hacemos la operación para saber la letra que realmente le corresponde al numero
        int residuo = num % 23;
        boolean letraCorrecta = false;
        do {
            //hacemos otra validación con bandera pero esta vez no acpetara nada excepto la misma letra que ha optenido el programa del array
            System.out.println("Intruduce la letra de tu DNI:");
            char letra = (char) entrada.next().charAt(0);
            if (letras[residuo] == letra) {
                letraCorrecta = true;
            } else {
                System.out.println("Caracter incorrecto, vuelve a intentarlo.");
                entrada.nextLine();
            }
        } while (!letraCorrecta);
        System.out.println("El DNI " + num + letras[residuo] + " es correcto");
    }

}
