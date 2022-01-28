
package com.mycompany.keke;

public class E006parametros {

    public static void main(String[] args) {
        E006parametros programa = new E006parametros();
        programa.inicio();
    }
    public void inicio(){
        mostrarMax(4, 10);
        mostrarMax(0, -2);
        mostrarMax(0,6);
    }
    
    public void mostrarMax(int a, int b){
        System.out.println("El maximo enntre " + a + " y " + b + " es:");
        if (a>b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    
}
