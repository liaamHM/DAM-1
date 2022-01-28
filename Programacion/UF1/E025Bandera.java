
package com.mycompany.keke;

import java.util.Scanner;

public class E025Bandera {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        boolean salir = false;
        
        do {
            System.out.println("Pon un 0 para salir");
            num = entrada.nextInt();
            if (num == 0) { 
                salir = true;
            }
        } while (!salir);
        System.out.println("FIN");
    }
    
}
