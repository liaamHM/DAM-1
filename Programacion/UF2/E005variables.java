
package com.mycompany.keke;

public class E005variables {

    public static void main(String[] args) {
        int contador = 1;
        //reasignar el valor de la variable contador:
        contador = duplicar_valor(contador);
        //asi se modifica el valor variable principal
        System.out.println(contador);
    }
    //si hay parametros de salida, cambiaremos el void por int
    private static int duplicar_valor(int contador) {
        contador = contador * 2;
        //devolver la variable con un parámetro de salida
        return contador;
    }
    
}
