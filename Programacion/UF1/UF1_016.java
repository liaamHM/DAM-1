package com.mycompany.keke;

import java.util.Scanner;

public class UF1_016 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        if (num1 == num2) {
            do {
                System.out.println("Los numeros son iguales, introduce numeros diferentes");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
            } while (num1 == num2);
        }
        if (num1 < num2) {
            while (num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        } else {
            while (num2 <= num1) {
                System.out.println(num2);
                num2++;
            }
        }

    }
}
