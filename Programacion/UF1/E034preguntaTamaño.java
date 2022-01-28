package com.mycompany.keke;

import java.util.Scanner;

public class E034preguntaTamaño {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int tam = 0;
        boolean salir = false;
        
        //estructura de validacion do . . . while (+if)
        
        do {
            System.out.println("Que tamaño desea que tenga el array: ");
            if (entrada.hasNextInt()) {
                tam = entrada.nextInt();
                salir = true;
            } else {
                entrada.nextLine();
                System.out.println("Error");
            }
        } while (!salir);
        
        //array
        
        double valores[] = new double [tam];
        
        for(int i=0; i<valores.length; i++){
            System.out.println("Introduce el valor " + (i+1));
            if(entrada.hasNextDouble()) {
                valores[i] = entrada.nextDouble();
            } else {
                i--;
                System.out.println("Error");
            }
            entrada.nextLine();
        
        }

    }
    
}
