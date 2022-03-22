/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class PersonaMain {

   
    public static void main(String[] args) {
        // instanciar un objeto de la clase persona
        Persona pepe = new Persona("Pepe", 25); //si hago lo de siempre, aparece un error porque detecta el mÃ©todo constructor, 
        //necesito pasarle argumentos
        pepe.imprimir();
    }
    
}
