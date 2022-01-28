package com.mycompany.keke;

import java.util.Scanner;

public class UF1_024 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 10 numeros");
        final int TAM = 10;
        int valores[] = new int [TAM];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = entrada.nextInt();  
        }
        for (int i = 0; 1 < TAM; i++) {
            System.out.println(valores[i]);
            System.out.println(valores[(TAM-1)-i]);
        }
    }
    
}
