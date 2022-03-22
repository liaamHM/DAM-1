/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

/**
 *
 * @author Alumno
 */
public class CocheConLlavePrincipal {

   
    public static void main(String[] args) {
        // instancia del coche
        CocheConLlave polo = new CocheConLlave();
        
        //acceder a los atributos
        polo.marca = "VW";
        polo.kms = 0f;
        polo.color = "blanco";
        
        polo.usarLlave("123456");
        polo.mando("arranca");
        
        //polo.arranca();
        polo.acelera();
        polo.frena();
        System.out.println("Marca: " + polo.marca);
    }
    
}
