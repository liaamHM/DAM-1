//precio de transporte con compra minima en 30 euros transporte gratos, con compra minima de 100 euros 15% de descuento
package com.mycompany.keke;

import java.util.Scanner;

public class E016PrecioRebajado {

    public static void main(String[] args) {
        final float TRANSPORTE = 5;
        final float DESCUENTO = 0.15F; //los elementos float se tiene que poner "F" al final para determina loq es
        final float COMPRA_MIN = 30;
        final float COMPRA_MIN_DESC = 100;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿Cuál es el valor de la compra que desea realizar?");
        float precio = entrada.nextFloat();
        entrada.nextLine();
        
        if (precio < COMPRA_MIN) {
            precio = precio + TRANSPORTE;
        }
        
        if (precio >= COMPRA_MIN_DESC) {
            precio = precio - precio * DESCUENTO;
        
        }
        System.out.println("El precio final de la compra es " + precio + " euros");
        //lo escrito esta bien pero podemos poner esto y es mas facil
        
        //if (precio < COMPRA_MIN) {
        //    precio = precio + TRANSPORTE;
        //} else if (precio >= COMPRA_MIN_DESC) {
        //      precio = precio - precio * DESCUENTO;
        //}
        //LO ANTERIOR CUENTA COMO E017
    }
    
}
