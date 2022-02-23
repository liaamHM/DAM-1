
package com.mycompany.keke;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class E019enterosOrdenados {

    public static void main(String[] args) {
        E019enterosOrdenados programa = new E019enterosOrdenados();
        programa.inicio();
    }
    
    public void inicio(){
        int [] valores = leerDatos("C:/Temp/Enteros.txt");
        if(valores != null){
            //obtengo datos
            Arrays.sort(valores);
            escribirArray("C:/Temp/Ordenados.txt", valores);
        }else {
            System.out.println("Algo ha pasao");
        }
    }
    
    public int[] leerDatos (String nombre){
        try{
            File f = new File (nombre);
            Scanner lectura = new Scanner(f);
            int medida = lectura.nextInt();
            int[] datos = new int [medida];
            for (int i = 0; i < medida; i++) {
                datos[i] = lectura.nextInt();
            }
            return datos;
        } catch (Exception e){
            System.out.println("Error: " + e);
            return null;
        }
    }
    
    public void escribirArray (String nombre, int[]datos){
        try{
            File f = new File (nombre);
            PrintStream escribir = new PrintStream(f);
            escribir.print(datos.length);
            for (int i = 0; i < datos.length; i++) {
                escribir.print(" " + datos[i]);
                
            }
            System.out.println("Fichero creado");
            escribir.close();
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
    
}
