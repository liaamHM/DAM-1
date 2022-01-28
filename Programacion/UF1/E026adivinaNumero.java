
package com.mycompany.keke;

import java.util.Scanner;

public class E026adivinaNumero {

    public static void main(String[] args) {
        //generar un numero aleatorio
        //clase math, metodo random
        //random devuelve un double entre 0.0 y 1.0
        
        //(Int)(Math.random()*max)+min)
        
        int numrandom = (int) ((Math.random()*9)+1);
        Scanner entrada = new Scanner(System.in);
        //variable para el intento del usuario
        int num;
        //variable boolean bandera
        boolean salir = false;
        
        do {
            System.out.println("Adivina el numero entre 1 y 10");
            System.out.println("Pon 0 para salir");
            num = entrada.nextInt();
            if(num==0) {
                
            salir = true;
                
            } else {
                if (num == numrandom) {
                    System.out.println("Acertaste!");
                    salir = true;
                    
                } else {
                    System.out.println("Fallaste");
                }
            }
        } while (!salir);
        System.out.println("FIN");
    }
    
}
