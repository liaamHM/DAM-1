// "mini ejercicio" el precio del transporte es de 5e pero si gastas +30 el trasnporte te sale gratis
package com.mycompany.keke;

import java.util.Scanner;

public class E015PrecioTransporte {

    public static void main(String[] args) {
       //declaro como constante el precio del transporte
       final float TRANSPORTE = 5; //float es para poner decimales, sino lo pones tienen que ser numeros enteros
       //declaro como constante la compra minima
       final float COMPRA_MIN = 30;
       //declaro un objeto scanner
       Scanner entrada = new Scanner (System.in);
       
       //conseguir los valores
        System.out.println("¿Cuál es el valor de la compra que desea realizar?");
        float precio = entrada.nextFloat();
        
        //limpiar el buffer por si queremos meter mas datos en un futuro y no se mezclen
        
        entrada.nextLine();
       
        //evaluacion
        //si evalua true ejectua el bloque del codigo
        //si evalua false lo ignora
        
        if (precio < COMPRA_MIN) {
            precio = precio + TRANSPORTE;
            
        }
        System.out.println("El precio final es " + precio + " euros");
    }
    
}
