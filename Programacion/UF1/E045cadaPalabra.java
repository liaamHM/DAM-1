
package com.mycompany.keke;

import java.util.Scanner;

public class E045cadaPalabra {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introsuce una palabra");
        String frase = entrada.nextLine();
        boolean fin = false;
        //Bucle que acorte una palabra a cada iteración
        do{
            //La primera palabra va desde el inicio hasta el primer espacio en blanco
            int primerEspacio = frase.indexOf(' ');
            //si no hay espacios, solo hay unapalabra
            if (primerEspacio ==-1){
                System.out.println(frase);
                fin = true;
            } else {
                //hay algun espacio
                //extraemos la palabra y la imprimimos
                String palabra = frase.substring(0 ,primerEspacio);
                System.out.println(palabra);
                //eliminar la palabra del resto
                frase = frase.substring(primerEspacio + 1, frase.length());
            }
        }
    }
    
}
