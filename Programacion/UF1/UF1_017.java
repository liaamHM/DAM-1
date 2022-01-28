package com.mycompany.keke;

import java.util.Scanner;

public class UF1_017 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        entrada.nextLine();
        if (num1 >= num2) {
            do {
                System.out.println("El primer numero debe ser menor que el segundo \nVuelve a intreoducir dos numeros");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
            } while (num1 >= num2);
        }
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }

    }

}
