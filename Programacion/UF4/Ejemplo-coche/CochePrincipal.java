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
public class CochePrincipal {

   
    public static void main(String[] args) {
        //instanciando objetos de la clase Coche
        Coche fiesta = new Coche();
        Coche s600 = new Coche();
        
        //acceder a sus atributos
        fiesta.marca = "Ford";
        fiesta.kms = 10000f;
        fiesta.color = "rojo";
        
        s600.color = "blanco";
        
        //llamar a los mÃ©todos
        fiesta.arranca();
        fiesta.acelera();
        fiesta.frena();
        System.out.println("Marca: " + fiesta.marca);
        
    }
    
}