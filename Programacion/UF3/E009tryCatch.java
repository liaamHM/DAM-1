
package com.mycompany.keke;

import java.io.File;
import java.util.Scanner;

public class E009tryCatch {

    
    public static void main(String[] args) {
        E009tryCatch programa = new E009tryCatch();
        programa.inicio();
    }
    
    public void inicio(){
        try {
            //bloque try
            //intentar abrir un fichero para leerlo
            File f = new File("C:/Temp/doc.txt");
            Scanner lectura = new Scanner(f);
            //El fichero existe?
            System.out.println("Fichero abierto correctamente ");
            
        } catch (Exception e){
            //tratamiento de errores
            //excepción en algún lugar del try
            System.out.println("Error: " + e);            
        }
        //las instrucciones fuera de try / catch se ejecutan
        System.out.println("Finalización del programa");
    }
    
}
