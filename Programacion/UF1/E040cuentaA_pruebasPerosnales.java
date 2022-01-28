
package com.mycompany.keke;

import java.util.Scanner;

public class E040cuentaA_pruebasPerosnales {

    public static void main(String[] args) {
        final int TAM = 10;
        Scanner entrada = new Scanner (System.in);
        String palabras [] = new String [TAM];
        System.out.println("Introduce 10 palabras");
        for (int i = 0; i<palabras.length; i++){
        palabras[i]= entrada.next();
    }
        
    }
    
}
