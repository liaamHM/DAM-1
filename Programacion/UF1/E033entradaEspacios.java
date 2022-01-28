package com.mycompany.keke;

import java.util.Scanner;

public class E033entradaEspacios {

    public static void main(String[] args) {
        //declaramos el tamaño del array con una constante
        final int TAM = 10;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce " + TAM + " numeros enteros");
        //Datos introducidos en la misma linea separados por espacios
        
        //contar los valores
        int contador = 1;
        while(contador < TAM +1) {
            //Antes de leer, validamos si hay un entero en el buffer
            if(entrada.hasNextInt()) {
                int valor = entrada.nextInt();
                System.out.println("Valor " + contador + " leido: " + valor);
                contador++;
            } else {
                //No hay un entero en el buffer
                //se ignora y el contador no avanza
                entrada.next();
            }
        }
        
        //si hay mas valores se descartan
        entrada.nextLine();
        System.out.println("Ya se han leido " + TAM +" valores");
    }
    
}
