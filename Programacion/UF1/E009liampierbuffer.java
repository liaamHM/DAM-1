
package com.mycompany.e001pruebas;

import java.util.Scanner;

public class E009liampierbuffer {

    public static void main(String[] args) {
        //creamos un objeto scanner
        Scanner entrada = new Scanner(System.in);
        //declaramos las variables necesarias
        String nombre, direccion;
        int edad;
        //pedimo sle nombre del usuario
        System.out.println("Como te llamas?");
        //leemos el nombre desde el buffer
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Cual es tu edad");
        //leemos la edad desde el buffer
        edad = entrada.nextInt();
        System.out.println("Tienes " + edad + " años" );
        //limpiar el buffer > aplicar el metodo sin asignar el valor a ninguna variable
        entrada.nextLine();
        System.out.println("Cual es tu direccion?");
        direccion = entrada.nextLine();
        System.out.println("Vives en: " + direccion);
        System.out.println("");
        System.out.println("*********");
        System.out.println("");
        System.out.println("Datos introducidos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        
        

    }
    
}
