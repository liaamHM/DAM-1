
package com.mycompany.keke;

import java.util.Scanner;

public class UF1_008 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("Introduce el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("Introduce el tercero numero");
        num3 = entrada.nextInt();
        
        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println(num1 + "es el mayor");
            } else {
                System.out.println(num3 + "es el mayor");
            }
        } else if(num2 > num3){ 
            System.out.println(num2 + "es le mayor");

    } else { 
            System.out.println(num3 + "es el mayor");
        }
        
    
}
    
}
