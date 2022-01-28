package com.mycompany.keke;

import java.util.Scanner;

public class UF1_007 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce el Dividendo:");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el divisor:");
        int num2 = entrada.nextInt();
        if (num1 <= 0){
            System.out.println("El 0 no esta permitido");
        } else if (num2 <= 0){
            System.out.println("El 0 no esta permitido");
        } else {
            System.out.println(num1 + "/" + num2 + "=" + num1/num2);
        }
        
        
    }
    
}

