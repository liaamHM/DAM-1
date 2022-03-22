/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class PerroProtectora {

  
    public static void main(String[] args) {
        Perro[] perros = new Perro[5];
        
        perros[0] = new Perro("MilÃº", "blanco", "Fox Terrier");
        perros[1] = new Perro("PatÃ¡n", "marron", "Russell");
        perros[2] = new Perro("Scoby Doo", "marrÃ³n", "Gran DanÃ©s");
        perros[3] = new Perro("Odi", "amarillo", "perro cualquiera");
        perros[4] = new Perro("Hong Kong Phooey", "naranja", "ni idea");
        
        System.out.println("Registro de perros:");
        
        for(int i = 0; i<5; i++){
            System.out.println("Perro nÂº "+ (i+1));
            System.out.println("Nombre: " + perros[i].getNombre());
            System.out.println("Color: " + perros[i].getColor());
            System.out.println("Raza: " + perros[i].getRaza());
            System.out.println("************************************");
        }
        
    }
    
}