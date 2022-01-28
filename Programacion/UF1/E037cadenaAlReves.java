
package com.mycompany.keke;

import java.util.Scanner;

public class E037cadenaAlReves {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = entrada.next();

        for (int i = palabra.length()-1; i >=0; i--) {
            System.out.println(palabra.charAt(i));
        }
    }
    
}
