package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamPersonaMain {

    public static void main(String[] args) {
        int numeroDNI =0;
        String sexo = "Otro";
        double altura = 0;
        double peso = 0;
        int edad  =0;
        String nombre  ="";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        boolean salir = false;
        
        while (!salir) {
            if (entrada.hasNextLine()) {
                nombre = entrada.nextLine();
                salir = true;
            } else {
                System.out.println("Error, introduce un nombre valido");
            }
            entrada.nextLine();
        }

        System.out.println("¿Cuantos años tienes?");
        boolean salir2 = false;
        
        while (!salir2) {
            if (entrada.hasNextInt()) {
                edad = entrada.nextInt();
                salir2 = true;
            } else {
                System.out.println("Error, introduce una edad valida");
            }
            entrada.nextLine();
        }

        boolean salir3 = false;

        do {
            System.out.println("Introduce solamente la numeración de tu DNI:");
            if (entrada.hasNextInt()) {
                numeroDNI = entrada.nextInt();
                if (numeroDNI < 99999999 && numeroDNI > 0) {
                    salir = true;
                } else {
                    System.out.println("Numero incorrecto");
                    entrada.nextLine();
                }

            } else {
                System.out.println("Esto no es un numero");
                entrada.nextLine();
            }
            entrada.nextLine();
        } while (!salir3);

        System.out.println("¿Cual es tu sexo? (H/M/Otro)");
        boolean salir4 = false;
        
        while (!salir4) {
            if (entrada.hasNextLine()) {
                sexo = entrada.nextLine().charAt(0);
                if (sexo == "H" || sexo == "M"){
                    salir4 = true;
                } else {
                    sexo = "Otro";
                    salir = true;
                }
            } else {
                System.out.println("Error, introduce un sexo valido");
            }
            entrada.nextLine();
        }

        System.out.println("¿Cuanto pesas?");
        boolean salir5 = false;
        
        while (!salir5) {
            if (entrada.hasNextDouble()) {
                peso = entrada.nextDouble();
                salir5 = true;
            } else {
                System.out.println("Error, introduce un numero valido");
            }
            entrada.nextLine();
        }

        System.out.println("¿Cuanto mides?");
        boolean salir6 = false;
        
        while (!salir6) {
            if (entrada.hasNextDouble()) {
                altura = entrada.nextDouble();
                salir6 = true;
            } else {
                System.out.println("Error, introduce un numero valido");
            }
            entrada.nextLine();
        }

        MedinaLiamPersona p1 = new MedinaLiamPersona(numeroDNI, sexo, altura, peso, edad, nombre);
    }

}
