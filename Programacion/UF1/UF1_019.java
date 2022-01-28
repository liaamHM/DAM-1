package com.mycompany.keke;

import java.util.Scanner;

public class UF1_019 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAM = 10;
        int valores[] = new int[TAM];
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduce el valor " + (i + 1));
            if (entrada.hasNextInt()) {
                valores[i] = entrada.nextInt();
            } else {
                i--;
                System.out.println("Esto no es lo que hemos pedido");

            }
            entrada.nextLine();
        }
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println("El elemento " + (i + 1) + " vale " + valores[i]);
        }
        
        double par = 0;
        int parCount = 0;
        double impar = 0;
        int imparCount = 0;
        
        for (int i = 0; i < valores.length; i++){
            int residuo = valores[i]%2;
            
            if(residuo==0) {
                par += valores[i];
                parCount++;   
            } else {
                impar += valores[i];
                imparCount++;
            }
        }
        
        System.out.println("La media de los valores pares del array es: " + par/parCount);
        System.out.println("La media de los valores impares del array es: " + impar/imparCount);
    }
    
}
