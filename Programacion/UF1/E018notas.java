
package com.mycompany.keke;

import java.util.Scanner;

public class E018notas {

    //a partir de una nota cuantitativa, sacamos una nora cualitativa
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿Cuál estu nota?");
        float nota  = entrada.nextFloat();
        entrada.nextLine();
        
        if ((nota <= 4) && (nota >= 0)) {
            System.out.println("Tu nota final es insuficiente.");
        }
        else if ((nota >=5) && (nota <= 6.5)) {
            System.out.println("Tu nota final es sufuiciente");
        }
        else if ((nota > 6.5) && (nota <= 9)) {
            System.out.println("Tu nota final es un notable");
        }
        else if ((nota > 9) && (nota <= 10)) {
        System.out.println("Tu nota final es excelente");
    }
        
        

    }
    
}
