package com.mycompany.mavenproject1;

public class E005especiales {
    public static void main(String[] args) {
        //declaracion de constante
        final double PI = 3.1416;
        System.out.println(PI);
        //modificar el valor de PI
        //PI = 23.0; // nopermite cambiar el valor > final
        
        //declaracion de variable tipo char
        char a = 'B';
        // declarar variable tipo int
        int i = a;
        System.out.println(i);
        
        //caracteres especiales > escape
        System.out.println("Salto de linea \nTabulacion \tEstoy tabulando \n Fin \"Fin\" ");
    }
    
}
