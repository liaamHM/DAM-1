
package com.mycompany.keke;

import java.io.File;
import java.io.PrintStream;

public class E014escribirEnteros {

    public static void main(String[] args) {
        E014escribirEnteros programa = new E014escribirEnteros();
        programa.inicio();
    }
    
    public void inicio(){
        try {
            //intentemos abrir fichero
            File f = new File ("C:/Temp/Rneteros.txt");
            PrintStream escribe = new PrintStream(f);
            //escribir le primer valor
            int valor = 1;
            escribe.print(valor);
            //calculo y escirbir
            for (int i = 0; i < 20; i++) {
                //escibir el espacio en blanco
                System.out.print(" ");
                //calcular el siguiente valor
                valor = valor * 2;
                escribe.print(valor);
            }
            escribe.close();
            System.out.println("Fivhero escito correctamente");
        } catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    
}
