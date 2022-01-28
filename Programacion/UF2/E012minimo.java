
package com.mycompany.keke;

public class E012minimo {

    public static void main(String[] args) {
        E012minimo programa  = new E012minimo();
        programa.inicio();
    }
    
    public void inicio(){
        int resultado = minimo(20,30);
        System.out.println(resultado);
    }
    
    //entraa -> los dos int
    //salida -> el menor
    
    public int minimo (int a, int b){
        //a y b contienen valores a tratar
        int min = b;
         if (a<b){
             min = a;
         }
         //el resultado esta en min
         return min;
    }
    
}
