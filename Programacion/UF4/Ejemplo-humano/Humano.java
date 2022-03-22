
package com.mycompany.keke;

public class Humano {
    //Atributos
    String nombre;
    int edad;
    //nuevo atributo creado a posteriori del primer constructor
    String dni;
    
    //MÃ©todos
    
    //Generar el constructor -> Inser code -> constructor

    public Humano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //generar otro constructor para el nuevo atributo
    //insert code -> constructor

    public Humano(String dni) {
        this.dni = dni;
    }
    
    public void volar(){
        System.out.println("Nombre: " + nombre + ", edad: " + edad + " y puedo volar");
    }
    
    //puede haber otro mÃ©todo volar, siempre que cambien los parÃ¡metros
    public void volar(int km){
        System.out.println("Distancia recorrida volando: " + km + " kilÃ³metros");
    }
    
    
}