/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class PrimoMain {

    
    public static void main(String[] args) {
        // inicializo un primo
        Primo ernesto = new Primo(23, "Ernesto");        
        ernesto.imprimir();
        
        ernesto.setEdad(24);
        ernesto.imprimir();
    }
    
}
