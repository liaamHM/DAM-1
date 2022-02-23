package com.mycompany.keke;

import java.io.File;
import java.util.Scanner;

public class E018vocales {

    public static final String MARCA = "fin";

    public static void main(String[] args) {
        E018vocales programa = new E018vocales();
        programa.inicio();
    }

    //contar vocales
    //contarlas
    public void inicio() {
        try {
            File f = new File("C:/Temp/Demo.txt");
            Scanner lectura = new Scanner(f);
            //datos necesarios

            int numPalabras = 0;
            int numVocales = 0;

            //marca de finalizacion
            boolean leer = true;

            while (leer) {
                String palabra = lectura.next();
                if (MARCA.equals(palabra)) {
                    leer = false;
                } else {
                    numPalabras++;
                    numVocales = numVocales + contador(palabra);
                }
                System.out.println("Hay " + numPalabras + " palabras");
                System.out.println("Hay " + numVocales + " vocales");
                lectura.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e );
        }
    }

    //metodo para sabes q es vocal
    public boolean esvocal(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;

        }
    }

    //metodo para contar vocales
    public int contador(String palabra) {
        int total = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            if (esvocal(palabra.charAt(i))) {
                total++;
            }
        }
        return total;
    }

}
