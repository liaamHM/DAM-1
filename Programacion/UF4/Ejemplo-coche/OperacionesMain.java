
package com.mycompany.keke;

public class OperacionesMain {

    
    public static void main(String[] args) {
        // instanciar un objeto de la clase operaciones
        Operaciones calculadora = new Operaciones();
        
        calculadora.leerNums();
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.dividir();
        calculadora.imprimir();
    }
    
}
