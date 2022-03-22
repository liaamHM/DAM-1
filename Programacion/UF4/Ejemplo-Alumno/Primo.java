/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class Primo {

    //atributos
    private int edad;
    private final String nombre;

    //constructor

    public Primo(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    //mÃ©todo imprimir datos
    public void imprimir(){
        System.out.println("Mi primo se llama: " + nombre + ", ");
        System.out.println("tiene " + edad + " aÃ±os.");
    }
    
    //hay que modificar la edad del primo, porque ya no tiene 23
    //utilizamos set

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
