
package com.mycompany.keke;

import java.util.Scanner;

public class E023while {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número del 1 al 8");
        num = entrada.nextInt();
        
        while (num < 5) {
            System.out.println("El numero " + num + " es mayor que 5");
            num++;
            
        }
          
    }
    
}
