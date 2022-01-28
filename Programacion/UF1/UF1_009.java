
package com.mycompany.keke;

import java.util.Scanner;

public class UF1_009 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int hora = 0, min = 0, seg = 0;
        System.out.println("Introduce una hora ");
        if (entrada.hasNextInt()) {
            hora = entrada.nextInt();
            System.out.println(hora);
        } else {
            System.out.println("Eso no es un numero entero");
        }
        
        System.out.println("Introduce los minutos");
        
        if (entrada.hasNextInt()) {
            min = entrada.nextInt();
            System.out.println(min);
        } else {
            System.out.println("Eso no es un numero entero");
        }
        
        System.out.println("Introduce los segundos");
        
        if (entrada.hasNextInt()) {
            seg = entrada.nextInt();
            System.out.println(seg);
        } else {
            System.out.println("Eso no es un numero entero");
        }
        entrada.nextLine();
        
        
        
        
        
        
        System.out.println("Son las " + hora + ":" + min + ":" + seg);
        
        if (hora>=0 && hora<=24 && min>=0 && min<=60 && seg>=0 && seg<=60) {
            System.out.println("Es una hora correcta");
        } else {
            System.out.println("No es una hora correcta");
        }

    }
    
}
