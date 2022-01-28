
package com.mycompany.keke;

import java.util.Scanner;

public class E024dowhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        
        do {
            System.out.println("Pon un 0 para salir");
            num = entrada.nextInt();
        } while (num!=0);
        
        System.out.println("FIN");
        
        
    }
    
}
