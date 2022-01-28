package com.mycompany.keke;

import java.util.Scanner;

public class E021diasMes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Â¿QuÃ© mes quieres analizar [1 al 12]?");
        int mes = entrada.nextInt();
        entrada.nextLine();

        //switch
        switch (mes) {
            case 2:
                System.out.println("Este mes tiene 28 o 29 dÃ­as");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes tiene 30 dÃ­as");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Este mes tiene 31 dÃ­as");
                break;
            default:
                System.out.println("Este mes no existe");

        }
    }

}