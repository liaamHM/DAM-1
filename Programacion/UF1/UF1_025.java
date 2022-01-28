
package com.mycompany.keke;

import java.util.Scanner;

public class UF1_025 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 10 numeros para la primera tabla");
        final int TAM = 10;
        int valores1[] = new int [TAM];
        
        for (int i = 0; i < valores1.length; i++) {
            valores1[i] = entrada.nextInt();  
        }
        entrada.nextLine();
        System.out.println("Introduce 10 numeros para la segunda tabla");
        int valores2[] = new int [TAM];
        for (int i = 0; i < valores2.length; i++) {
            valores2[i] = entrada.nextInt();  
        }
        for (int i = 0; i<TAM; i++){
            System.out.println("Valor " + (i+1) + " de la primera tabla: " + valores1[i]);
            System.out.println("Valor " + (i+1) + " de la segunda tabla: " + valores2[i]);
        }
    }
    
}
