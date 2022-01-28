
package com.mycompany.keke;

import java.util.Scanner;

public class E042compareTo {
    
    public static final String MES_SECRETO = "julio";

    public static void main(String[] args) {
        //adivinar un mes dando pistas
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivina el mes secreto");
        boolean acierto = false;
        while (!acierto) {
            System.out.println("Que mes crees que es el secreto?");
            String intento = entrada.next();
            entrada.nextLine();
            int posicion = intento.compareTo(MES_SECRETO);
            System.out.println(posicion);
            if (posicion<0){
                System.out.println("Has fallado, el mes va despues alfabeticamente");
            }else if(posicion>0){
                System.out.println("Has fallado, el mes va antes alfabeticamente");
            }else{
                acierto = true;
            }
        }
        System.out.println("Acertaste!");
    }
    
}
