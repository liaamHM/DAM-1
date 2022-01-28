package com.mycompany.keke;

import java.util.Scanner;

public class E031array {

    public static void main(String[] args) {
        //declarar valores
        final int TAM = 5;
        int valores [] = new int [TAM];
        Scanner entrada = new Scanner (System.in);
        
        //inicializar el array -> asignacion
        for(int i=0; i<valores.length; i++) {
            System.out.println("Introduce un numero entero");
            valores[i] = entrada.nextInt();
            //imprimir los valores del array
            System.out.println("El elemento " + (i+1) + " vale " + valores[i]);
        }
        
    }
    
}
