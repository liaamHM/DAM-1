package com.mycompany.keke;

import java.io.File;

import java.util.Scanner;

public class E020alumnos {

    public static final String MARCA = "fin";

    public static void main(String[] args) {
        E020alumnos programa = new E020alumnos();
        programa.inicio();
    }

    public void inicio() {
        try {
            File f = new File("C:/Temp/Notas.txt");
            Scanner lectura = new Scanner(f);
            boolean leer = true;
            while (leer) {
                String nombre = lectura.next();
                if (MARCA.equals(nombre)) {
                    leer = false;
                } else {
                    String apellido = lectura.next();
                    System.out.println("Estuiamte: " + nombre + " " + apellido);
                    double media = leerNotas(lectura);
                    System.out.println(" - Media: " + media);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public double leerNotas(Scanner lectura){
        double resultado = 0;
        try{
            int numNotas = lectura.nextInt();
            for (int i = 0; i < numNotas; i++) {
                resultado = resultado + lectura.nextDouble();
            }
            resultado = resultado /numNotas;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            
        }
        return resultado;
    }

}
