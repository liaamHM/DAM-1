/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class PizzaMain {

   
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("peperoni" , "familiar");
        
        //p1.toString();
        //toString() tiene return, no puedo invocarlo sin variable
        System.out.println(p1.toString());
        
        p1.servir();
        
        System.out.println(p1);
        
        Pizza p3 = new Pizza("barbacoa", "familiar");
        
        System.out.println(p3);
        
        p3.servir();
                
        
        
        
        System.out.println("Pizzas pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Pizzas servidas: " + Pizza.getTotalServidas());
        
        
        
        
    }
    
}
