/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keke;

import java.util.Scanner;

public class AlumnoMain {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre y nota media de los alumnos:");

        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Alumno();
            System.out.println("Alumno " + (i + 1));
            System.out.println("Nombre: ");
            String nombreTeclado = entrada.nextLine();
            
            alumnos[i].setNombre(nombreTeclado);
            System.out.println("Nota media: ");
            double notaTeclado = entrada.nextDouble();
            alumnos[i].setNotaMedia(notaTeclado);
            entrada.nextLine();
        }

        System.out.println("Los datos introducidos son: ");
        double sumaNotas = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i + 1));
            System.out.println("Nombre: " + alumnos[i].getNombre());
            System.out.println("Nota media: " + alumnos[i].getNotaMedia());
            System.out.println("*****************************************");

            sumaNotas += alumnos[i].getNotaMedia();
        }
        
        System.out.println("La media de la clse es " + sumaNotas/5);
    }

}
