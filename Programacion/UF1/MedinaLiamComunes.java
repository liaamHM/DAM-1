
package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamComunes {

    public static void main(String[] args) {
        //creo las variables necesarias y le pido al usuario que introduza los animales
        Scanner entrada = new Scanner(System.in);
        int TAM = 10;
        String patas[] = new String [TAM];
        String marinos[] = new String [TAM];
        System.out.println("Introduce un maximo de 10 nombres de animales a cuadrupedos, una vez ahyas acabado de poner animales introduce el número 0 para salir");
        boolean salirUno = false;
        //creo dos un bucle con bandera para que introduzca los animales en los array
        do {
            for (int i = 0; i<patas.length  ; i++){
                if(entrada.hasNextLine()){
                    patas[i] = entrada.nextLine();
                    if (patas[i].contains("0")){
                        salirUno = true;
                        patas[i] = "";
                    }
                    
                    
                }else{
                    System.out.println("Introduce un nombre de un animal");
                    i--;
                }
            }
        }while (!salirUno);
        //hago lo mismo pero ocn el otro array
        System.out.println("Introduce un maximo de 10 nombres de animales a marinos, una vez ahyas acabado de poner animales introduce el número 0 para salir");
        boolean salirDos = false;
        
        do {
            for (int i = 0; i<patas.length  ; i++){
                if(entrada.hasNextLine()){
                    marinos[i] = entrada.nextLine();
                    if (marinos[i].contains("0")){
                        salirDos = true;
                        marinos[i] = "";
                    }
                    
                    
                }else{
                    System.out.println("Introduce un nombre de un animal");
                    i--;
                }
            }
        }while (!salirDos);
        //compruebo si hay animales iguales en el array y los imprimo si es así.
        for(int i  = 0; i<TAM; i++){
            if (patas[i].equals(marinos[i])){
                System.out.println(patas[i] + " Esta en las dos listas");
            }
        }
    }
    
}
