
package com.mycompany.keke;

import java.util.Scanner;

public class E048cargaEstatica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Cuantos elementeos tiene el array?");
        int numElementos = entrada.nextInt();
         //declarar y crear el array
         String cosas [] = new String [numElementos];
         
         //inicializar el array
         for (int i = 0; i<cosas.length; i++){
             System.out.println("Introduce el valor del elemento " + (i+1));
             cosas[i] = entrada.nextLine();
             
         }
         //imprimr los elementos
         System.out.println("Cosas contiene: ");
         for (int i = 0; i<cosas.length; i++){
             System.out.print(cosas[i] + " ");
         } 
    }
    
}
