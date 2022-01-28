package com.mycompany.keke;

import java.util.Scanner;

public class UF1_023 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 5 numeros");
        final int TAM = 5;
        int valores[] = new int [TAM];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = entrada.nextInt();  
        }
        
        for (int i = 5-1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
    
}
