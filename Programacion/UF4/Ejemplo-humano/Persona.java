/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

public class Persona {
  //atributos
    String nombre;
    int edad;
    
    //mÃ©todos
    
    //constructor
    public Persona(String _nombre, int _edad){
        //inicializaciÃ³n de atributos
        nombre = _nombre; //el primero es el atributo, el segundo el argumento
        edad = _edad;
    }
    
    //mÃ©todo que imprima los datos
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
