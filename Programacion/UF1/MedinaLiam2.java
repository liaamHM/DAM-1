package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiam2 {

    public static void main(String[] args) {
        //IMPORTANTE: Leer el ultimo comentario
        //leo los numeros del usuario y creo las variables que necesito
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        boolean salir = false;
        int nums;
        String num;
        int contador = 0;
        //hago un bucle con bandera para hacer la validación y aprobecho para hacer las operaciones necesarias para contar cuantos numero contienen un 2
        while (!salir) {
            if (entrada.hasNextInt()) {
                nums = entrada.nextInt();
                if (nums < 0) {
                    salir = true;
                } else {
                    num = entrada.nextLine();
                    String numeros[];
                    numeros = num.split("");

                    if (numeros[numeros.length].equals('2')) {
                        contador++;
                    }
                }

            } else {
                System.out.println("Error\nVuelve a introducir un numero válido");
                entrada.nextLine();
            }
        }
        //le digo al usuario cuantos numeros acaban en 2
        System.out.println("Ha habido un total de " + contador + " numeros terminados en 2");
        //considero que mi codigo tiene sentido y NetBeans no me muestra ningun error, estaria muy agradecido de que le hecharas un
        //vistazo y vieras si mi codigo tiene sentido o no, si no lo tiene pues no entraré en debate sobre tener un 0, pero si tu también
        //le ves sentido me gustaría que, aunque no funcione, me sumases unos puntos. Gracias

    }

}
