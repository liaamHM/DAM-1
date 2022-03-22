
package com.mycompany.keke;

public class Estudiante extends Persona{
    private String codEstudiante;
    private float nota;

    public Estudiante(String codEstudiante, float nota, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codEstudiante = codEstudiante;
        this.nota = nota;
    }

    public String getCodEstudiante() {
        return codEstudiante;
    }

    public float getNota() {
        return nota;
    }
    
    public void mostrarNombre (){
        //System.out.println("Nombre: " + this.nombre);
        //es un atributo provado, por eso no se puede acceder con this
        System.out.println("Nombre: " + this.getNombre() + " " + this.getApellido());
    }
}
