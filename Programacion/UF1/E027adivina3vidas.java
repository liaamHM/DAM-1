
package com.mycompany.keke;

import java.util.Scanner;

public class E027adivina3vidas {

    public static void main(String[] args) {
        //num aleatorio
        int numRandom = (int)((Math.random()*10)+1);
        
        Scanner entrada = new Scanner (System.in);
        int num;
        //numero de vidas
        int vidas = 3;
        //bandera
        boolean acierto = false;
        
        do {
            System.out.println("Introduce un numero del 1 al 10");
            System.out.println("Te quedan " + vidas + " vidas.");
            num = entrada.nextInt();
            //comparar el valor con el numero aleatorio
            if (num==numRandom) {
                acierto = true;
            } else { 
                System.out.println("Fallaste!");
                vidas--;
                if (num > numRandom) {
                    System.out.println("El numero secreto es menor");
                } else {
                    System.out.println("El numero secreto es mayor");
                }
                if (vidas == 0) {
                    acierto = true;
                } else { 
                    System.out.println("Te quedan " + vidas + " vidas.");
                }
                
            }
            
        } while(!acierto);
        
            System.out.println("El numero secreto era " + numRandom);
            System.out.println("FIN");

    }
    
}
