
package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamPersona {
        int numeroDNI;
        char letraDNI;
        char sexo = 'O';
        double altura;
        double peso;
        int edad;
        String nombre;

    public MedinaLiamPersona(int numeroDNI, char sexo, double altura, double peso, int edad, String nombre) {
        this.numeroDNI = numeroDNI;
        this.letraDNI = letraDNI;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
    }

    public MedinaLiamPersona() {
    }
    
    
    public char letraNum(int num){
        char letras[] = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int residuo = num % 23;
        char letra = letras[residuo];
        letraDNI = letra;
        return letra;
    }

    public int IMC(double altura, double peso){
        double IMC;
        int respuesta;
        altura = this.altura;
        peso = this.peso;

        IMC = peso/(altura*altura);

        if(IMC < 20){
            respuesta = -1;
        } else if (IMC > 25){
            respuesta  =1;
        } else {
            respuesta = 0;
        }

        return respuesta;
    }

    public boolean legalidadEdad (){
        boolean respuesta;
        if (edad < 18){
            respuesta = false;
        } else {
           respuesta = true;
        }

        return respuesta;
    }


    public void informacionCompleta(){
        System.out.println("");
        System.out.println("INFORMACION COMPLETA:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("DNI: " + numeroDNI + letraDNI);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "m");
    }
}


