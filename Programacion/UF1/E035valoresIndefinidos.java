package com.mycompany.keke;

import java.util.Scanner;

public class E035valoresIndefinidos {
//declarar un array
//cargamos cantidad indefinida de valores
//creamos una bandera para salir (s)
//calular suma acumulada
//calcular media

    public static void main(String[] args) {
        final int TAM = 10;
        Scanner entrada = new Scanner(System.in);
        double valores[] = new double[TAM];
        boolean salir = false;
        int contador = 0;
        //estructura para pedir valores
        //si es double se guarda en el array eincrementamos el contador (indice)
        do {
            System.out.println("Introduce un valor " + (contador + 1));
            System.out.println("S para salir");
            if (entrada.hasNextDouble()) {
                valores[contador] = entrada.nextDouble();
                contador++;
            } else {
                //si no es double vamos a ver si es s o S
                char leido = (char) entrada.next().charAt(0);
                if (leido == 's' || leido == 'S') {
                    salir = true;

                } else {
                    System.out.println("Valor no valido");
                }

            }
            //limpiar el buffer
            entrada.nextLine();
            //comprobar si el indice ha llegado a TAM
            //TAM es la cantidad màxima, por lo tanto el ultimo indice es TAM-1
            //Si llega a TAM, nos hemos pasado
            if (contador == TAM) {
                salir = true;
                System.out.println("Has superado el limite");
            }
        } while (!salir);
        //calucar suma acumulada y media
        //recorrer el array con un for
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("El elemento " + (i + 1) + " vale " + valores[i]);
            suma += valores[i];
        }

        //imprimir la solucion
        System.out.println("La suma acumulada de los elementos del array es: " + suma);
        System.out.println("La meda es: " + suma / contador);
    }

}
