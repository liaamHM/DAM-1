
package com.mycompany.keke;

import java.util.Scanner;

public class E058inicializacionBidimensional {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //variable para almacenar filas
        int numFilas = 0;
        //lectura de filas
        while (numFilas<=0){
            System.out.println("Cuantas filas tendra la tabla");
            if(entrada.hasNextInt()){
                numFilas= entrada.nextInt();
            } else {
                entrada.next();
                System.out.println("Valor incorrecto");
            }
        }
        entrada.nextLine();
        
        int numCol = 0;
        //lectura de filas
        while (numCol<=0){
            System.out.println("Cuantas columnas tendra la tabla");
            if(entrada.hasNextInt()){
                numCol= entrada.nextInt();
            } else {
                entrada.next();
                System.out.println("Valor incorrecto");
            }
        }
        entrada.nextLine();
        
        //inicializacion 
        
        //declarar array bidimensional
        
        int [][] bidimensional = new int [numFilas][numCol];
        //atributo length
        System.out.println("Hay " + (bidimensional.length) + " filas");
        System.out.println("Hay " + (bidimensional[0].length) + " columnas");
        
        //bucle para recorrer cada fila
        //i recorre filas
        for(int i  = 0; i<numFilas; i++){
            System.out.println("Fila " + i + " { ");
            for (int j = 0; j< numCol; j++){
                System.out.println(bidimensional[i][j] + " ");
            }
            //al final de cada fila cierro la llave de fila
            System.out.println(" }   ");
        }
    }
    
}
