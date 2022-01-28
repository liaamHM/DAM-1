
package com.mycompany.keke;

import java.util.Scanner;

public class E044substring {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();
        //Buscamos el prier y el ultimo espacio en blanco
        int inicioSubstring = frase.indexOf(' ');
        int finSubstring = frase.lastIndexOf(' ');
        
        System.out.println("La frase sin la primera palabra ni la ultima es:");
        
        if (inicioSubstring == finSubstring) {
            //no hay espacios, evalua -1
            //solo hay dos palabras, evalua a la misma posiciom
            //no muestar nada
        } else {
            //hay que mostrar una cadena intermedia
            //la segunda palabra empieza tras el primer espacio en blanco
            String fraseFinal = frase.substring(inicioSubstring +1 , finSubstring);
            System.out.println(fraseFinal);
        }
    } 
}
