
package com.mycompany.keke;

import java.util.Scanner;

public class E045cadaPalabraPropio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();
        int espacios [] = new int [frase.length()];
        
        /*for (int i  = 0; i<frase.length(); i++){
            if (frase.indexOf(i) == ' '){
                int x = 0;
                x++;
                espacios[x] = i;
            }
            
        }
        System.out.println(espacios);
*/
    }
    
}
