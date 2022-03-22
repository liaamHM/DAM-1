/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class Pizza {
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    
    //atributos
    private String nombre;
    private String tam;
    private String estado;

    public Pizza(String nombre, String tam) {
        this.nombre = nombre;
        this.tam = tam;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

   
    public String toString() {
        return "Pizza{" + "nombre=" + nombre + ", tam=" + tam + ", estado=" + estado + '}';
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }
    
    //incremento se TotalServidas
    public void servir(){
        if(this.estado.equals("pedida")){
            this.estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("Pizza servida");
        }
    }
    
   
    
    
}
