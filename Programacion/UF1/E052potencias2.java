
package com.mycompany.keke;

public class E052potencias2 {
//iniciacion porcentual potencia2
    //array de 20 posiciones
    public static void main(String[] args) {
        //declarar el array de 20 posiciones
        
        int [] valores = new int [20];
        //el primer valor lo damos manualmente
        valores[0] = 1;
        //el resto de valores se inicializa secuencialmente, haciendo calculos necesarios
        for (int i = 1; i < valores.length; i++){
            valores[i] = 2 * valores [i-1];
            
        }
        System.out.println("Se ha generado el siguiente array[ ");
        for (int i = 1; i < valores.length; i++){
            System.out.println(valores[i] + " ");
        }
        System.out.println(" ]");
    }
    
}
