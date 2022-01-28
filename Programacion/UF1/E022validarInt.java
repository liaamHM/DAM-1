package com.mycompany.keke;

import java.util.Scanner;


public class E022validarInt {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nÃºmero entero");
        int num;
        
        if(entrada.hasNextInt()){
            num = entrada.nextInt();
            System.out.println("Este es tu nÃºmero, usuario: " + num);
        } else {
            System.out.println("Eso no era un nÃºmero, usuario!");
        }
    }
    
}