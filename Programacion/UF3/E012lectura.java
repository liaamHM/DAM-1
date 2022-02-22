
package com.mycompany.keke;

import java.io.File;
import java.util.Scanner;

public class E012lectura {

    public static void main(String[] args) {
        E012lectura programa = new E012lectura();
        programa.inicio();
    }
    
    public void inicio (){
        try{
            //intentar abrir el fichero
            File f = new File("C:/Temp/Enteros.txt");
            Scanner lectura = new Scanner (f);
            //si se ejecuta, se ha abierto el fichero
            for(int i = 0; i<10; i++){
                int valor = lectura.nextInt();
                System.out.println("El valor leido es: " + valor);
            }
            lectura.close();
        } catch (Exception e){
            System.out.println("Error " + e);
        }
    }
    
}
