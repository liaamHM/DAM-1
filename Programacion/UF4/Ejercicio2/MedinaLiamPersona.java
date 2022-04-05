
package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamPersona {
    //creamos las variables necesaris donde se guardara de informacion de nuestro usuario
        int numeroDNI;
        char letraDNI;
        char sexo = 'O';
        double altura;
        double peso;
        int edad;
        String nombre;

        //creamos un constructor para guardar la informacion en las variables necesarias

    public MedinaLiamPersona(int numeroDNI, char sexo, double altura, double peso, int edad, String nombre) {
        this.numeroDNI = numeroDNI;
        this.letraDNI = letraDNI;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    //creo la clase donde hare la operacion para calcular la letra del DNI del usuario
    //esta operacion ya la hiciamos en otro ejercicio asi que no creo que sea neceasrio comentar esta clase
    public void letraNum(int num){
        char letras[] = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int residuo = num % 23;
        char letra = letras[residuo];
        letraDNI = letra;
    }

    //en la siguiente clase calculamos el IMC
    //de enrada introducimos la altura y el peso para poder hacer las operaciones mas adelnate
    //de salida devolvemos -1/0/1, depende de el indice que haya obtneido el usuario
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

    //en esta clase calculamos si la edad del usuario es mayor o igual a 18 para saber si es mayor de edad o no
    //en esta clase la salida sera un boleano, ya que si es mayor de edad saldra true y si es menor saldra false, de esta manera sabremos si es mayor de edad o no
    public boolean legalidadEdad (){
        boolean respuesta;
        if (edad < 18){
            respuesta = false;
        } else {
           respuesta = true;
        }

        return respuesta;
    }

    //por ultimo esta clase es una clase donde se imprime practicamnete toda la informacion que nos ha facilitado el usuario y 
    //alguna que hemos conseguido nosotros a traves de operaciones
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


