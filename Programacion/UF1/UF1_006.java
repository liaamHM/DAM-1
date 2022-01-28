package com.mycompany.keke;

import java.util.Scanner;

public class UF1_006 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int num = entrada.nextInt();
        
        if (num >= 0) {
            System.out.println("El numero " + num + " es positivo");
        } else { 
            System.out.println("El numero " + num + " es negativo");
        }
        int residuo2 = num%2;
        if (residuo2 == 0){
            System.out.println("El numero " + num + " es par");
            
        } else {
            System.out.println("El numero " + num + " es impar");
        }
        int residuo5 = num%5;
        if (residuo5 == 0){
            System.out.println("El numero " + num + " es multiplo de 5");
            
        } else {
            System.out.println("El numero " + num + " no es multiplo de 5");
        }
        int residuo10 = num%10;
        if (residuo10 == 0){
            System.out.println("El numero " + num + " es multiplo de 10");
            
        } else {
            System.out.println("El numero " + num + " no es multiplo de 10");
        }
        if (num == 100) {
            System.out.println("El numero es igual a 100");
        } else if(num < 100) {
            System.out.println("El numero " + num + " es menor a 100");
            
        } else { 
            System.out.println("El numero " + num + " es mayor a 100");
        }
        System.out.println("FIN");
        
    
    
}
}
