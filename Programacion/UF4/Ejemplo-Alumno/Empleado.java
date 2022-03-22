/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class Empleado {

    //atributos
    private int edad;
    private String nombre;

    //setter para asignar la edad
    public void setEdad(int _edad) {
        if (edad > 15 && edad < 66) {
            this.edad = _edad;
        } else {
            System.out.println("Con esa edad no se puede trabajar.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}