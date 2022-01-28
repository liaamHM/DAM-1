package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamFib {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pido al usuario que introduzca un numero y creo las variables necesarias
        System.out.println("Introduce cuantos numeros de la serie de Fibonacci quieres que e impriman");
        boolean salir = false;
        int num = 0;
        //hago una validacion para saber si el usuario introduce un numero entero
        while (!salir) {
            if (entrada.hasNextInt()) {
                num = entrada.nextInt();
                salir = true;
            } else {
                System.out.println("Error\nVuelve a introducir un numero válido");
                entrada.nextLine();
            }
        }
        //inicializo el array con los 2 primer numeros ya puestos ya que asi puedo hacer la operación necesaria mas adelante
        int fib[] = new int[num];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < num; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        //imprimo el numero de veces la serie que me ha pedido el usuario
        for (int i = 0; i < num; i++) {
            System.out.print(fib[i] + " ");
        }

    }

}
