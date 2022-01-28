
package com.mycompany.keke;

import java.util.Scanner;

public class E046split {
    
    //invertir el oreden de las palabras

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();
        
        //Separamos la frase en palabras, con espacios en blanco como separadores
        
        String [] palabras = frase.split(" ");
        //imprimir la frase al reves
        System.out.println("La frase al reves es: ");
        for (int i = palabras.length-1; i>=0 ; i--){
            System.out.print(palabras[i] + " ");
            //le quitamos el "ln" a sou para que no pase de linea al imprimir 
        }
    }
    
}
