package com.mycompany.keke;

import java.util.Scanner;

public class E032arrayMedio {
    
    //introducimos x valores
    //calculamos la suma acumulada
    //calculamos la media de todos los valores

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        final int TAM = 7;
        //declaración de array
        double valores [] = new double [TAM];
        
        //inicializar el array con valores por teclado
        
        for(int i=0; i<valores.length; i++) {
            System.out.println("Introduce el valor " + (i+1));
            //validación del tipo de dato
            if(entrada.hasNextDouble()) {
                valores[i] = entrada.nextDouble();
            } else {
                i--;
                System.out.println("Esto no es lo que hemos pedido");
  
            }
            entrada.nextLine();
            
        }
        
        //calcular la suma acumulada
        double sumaAcumulada = 0;
        for(int i=0; i<valores.length; i++) {
            System.out.println("El elemento " + (i+1) + " vale " + valores[i]);
            sumaAcumulada += valores[i];
            
        }
        System.out.println("La suma acumulada es: " + sumaAcumulada);
        System.out.println("La media de los valores es: " + (sumaAcumulada/valores.length));
        
                
    }
    
}

