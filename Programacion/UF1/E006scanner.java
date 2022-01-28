package com.mycompany.e001pruebas;
import java.util.Scanner;
public class E006scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = entrada.next ();
        System.out.println("Te llamas " + nombre);
        
        System.out.println("Escribe tu edad:");
        int edad = entrada.nextInt();
        System.out.println("Tienes " + edad + " años");
    }
    
}
