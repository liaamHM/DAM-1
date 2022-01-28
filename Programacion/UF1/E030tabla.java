
package com.mycompany.keke;

import java.util.Scanner;

public class E030tabla {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Que tabla imprimimos?");
        int num = entrada.nextInt();
        
        for (int i=0; i<11; i++){
            System.out.println(i + " X " + num + " = " + i*num );
        }
        System.out.println("FIN");
        
    }
    
}
