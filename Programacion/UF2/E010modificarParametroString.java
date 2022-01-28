
package com.mycompany.keke;

public class E010modificarParametroString {
    
    public static void main(String[] args) {
        E010modificarParametroString programa = new E010modificarParametroString();
        programa.inicio();
    }
    
    public void inicio(){
        String i = "Hola";
        System.out.println("Antes era" + i);
        modificarString(i);
        System.out.println("Ahora es " + i);
    }
    
    public void modificarString(String a){
        a = "Adios";
        System.out.println("Se ha modificado el valor a " + a);
    }
    
}
