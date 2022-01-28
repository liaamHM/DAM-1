
package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamAnimal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //A continuación doy las instrucciones del programa y creo las variables necesarias
        String palabraSecreta = "oso panda";
        
        System.out.println("Introduce el nombre de un animal hasta adivinar cual es el animal secreto \nPuede ser un nombre de mas de una apalabra\nNo se permiten nungún tipo de signo de puntuación");
        
        String palabra = "";
        boolean salir = false;
        //hago un bucle con bandera
        do{
            //hago una validación del tipo de dato
            if (entrada.hasNextLine()){
                palabra = entrada.nextLine().toLowerCase();
                palabra = palabra.replace("á", "a").replace("ó","o");
            }else{
                System.out.println("Error \nVuelve a intentarlo");
            }
            //compruebo si la palabra introducida es la que buscamos
            if(palabra.equals(palabraSecreta)){
                salir = true;
            } else {
                System.out.println("Fallaste! \nVuelve a intentarlo");
            }
            
        }while (!salir);
        
        System.out.println("Has acertado \nel juego ha terminado");
        
    }
    
}
