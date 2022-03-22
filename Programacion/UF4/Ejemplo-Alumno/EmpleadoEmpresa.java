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
public class EmpleadoEmpresa {

    
    public static void main(String[] args) {
        // instanciar objeto Empleado
        Empleado fernando = new Empleado();
        //fernando.edad(32);
        
        fernando.setEdad(32);
        
        System.out.println("Edad: " + fernando.getEdad());
        fernando.setNombre("Fernando");
        System.out.println("Nombre: " + fernando.getNombre());
        
    }
    
}
