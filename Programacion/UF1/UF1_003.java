
package com.mycompany.keke;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UF1_003 {

    public static void main(String[] args) {
        //Lo mismo que en el anterior ejercicio
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe un número entero:");
        int gradosCel = entrada.nextInt();
        int gradosFar = 32 + (9 * gradosCel / 5);
        JOptionPane.showMessageDialog(null, gradosCel + " ºC equivale a " + gradosFar + " ºF");
        

    }
    
}
