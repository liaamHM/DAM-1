
package com.mycompany.keke;

import java.util.Scanner;

public class UF1_004 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe un número entero de 5 cifras:");
        String num = entrada.next();
        System.out.println(num.charAt(0));
        System.out.println(num.charAt(0) + "" + num.charAt(1));
        System.out.println(num.charAt(0) + "" + num.charAt(1) + "" +  num.charAt(2));
        System.out.println(num.charAt(0) + "" + num.charAt(1) + "" + num.charAt(2) + "" + num.charAt(3));
        System.out.println(num.charAt(0) + "" + num.charAt(1) + "" + num.charAt(2) + "" + num.charAt(3) + "" + num.charAt(4));
        

    }
    
}
