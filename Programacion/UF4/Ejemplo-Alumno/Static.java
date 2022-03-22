/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class Static {

    //atributos
    //private String frase = "Frase molona";
    private static String frase = "Frase molona";
    
    //mÃ©todo estÃ¡tico
    public static int sumar(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    
    public static void main(String[] args) {
        // instanciar dos objetos
        Static uno = new Static();
        Static dos = new Static();
        
        System.out.println(uno.frase);
        System.out.println(dos.frase);
        
        //cada objeto hace una copia de los atributos NO estÃ¡ticos
        
        dos.frase = "Frase increÃ­ble";
        System.out.println(dos.frase);
        
        //cambiamos el atributo a estatico
        System.out.println(uno.frase);
        
        //si el atributo es de clase, no hace falta instanciar el objeto
        System.out.println(Static.frase);
        
        //mÃ©todo estÃ¡tico
        System.out.println("La suma es: " + Static.sumar(54, 1));
        
    }
    
}
