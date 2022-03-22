
package com.mycompany.keke;

public class SuperCoche {
    //atributos
    String marca;
    float kms;
    String color;
    
    //mÃ©todo principal
    public static void main(String[] args){
        SuperCoche deLorean = new SuperCoche();
        
        deLorean.color = "gris";
        deLorean.kms = 0f;
        deLorean.marca = "DMC";
        
        System.out.println("El color de mi coche es: " + deLorean.color);
        System.out.println("La marca de mi coche es: " + deLorean.marca);
        System.out.println("El kilometraje de mi coche es: " + deLorean.kms + " kms.");
        
        SuperCoche granTorino = new SuperCoche();
        granTorino.color = "rojo";
        granTorino.kms = 10000f;
        granTorino.marca = "Ford";
        
        System.out.println("\nEl color de mi coche es: " + granTorino.color);
        System.out.println("La marca de mi coche es: " + granTorino.marca);
        System.out.println("El kilometraje de mi coche es: " + granTorino.kms + " kms.");
    }
}
