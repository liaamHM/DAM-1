
package com.mycompany.keke;

import java.util.Scanner;

public class UF1_005 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int num = entrada.nextInt();
        int residuo = num%2;
        if (residuo == 0){
            System.out.println("El numero " + num + " es par");
            
        } else {
            System.out.println("El numero " + num + " es impar");
            
                
        }
        
    }
    
}
