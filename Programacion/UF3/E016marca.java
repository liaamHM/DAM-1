
package com.mycompany.keke;

import java.io.File;
import java.util.Scanner;

public class E016marca {
    public static final int MARCA = 100;
    public static void main(String[] args) {
        E016marca programa =  new E016marca();
        programa.inicio();
        
    }
    
    public void inicio(){
        try{
            File f = new File ("C:/Temp/Rneteros.txt");
            Scanner lectura = new Scanner(f);
            //semaforo-flag
            boolean leer = false;
            
            while(leer){
                int valor = lectura.nextInt();
                if (valor == MARCA){
                    leer= false;
                }else{
                    System.out.println("El valor leido es: " + valor);
                }
            }
            lectura.close();
        } catch (Exception e){
            System.out.println("Error " + e);
        }
    }
    
}
