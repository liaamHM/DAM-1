package com.mycompany.keke;

import java.util.Scanner;


public class E019semanaSwitch {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Introduc el nÃºmero correspondiente al dÃ­a de la semana:");
        dia = entrada.nextInt();
        
        switch(dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("MiÃ©rcoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de semana");
        }
    }
    
}