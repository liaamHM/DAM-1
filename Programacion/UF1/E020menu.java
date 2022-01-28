package com.mycompany.keke;

import java.util.Scanner;

public class E020menu {

    //generar un menÃº de selecciÃ³n
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecciona una opciÃ³n\n1: OpciÃ³n 1\n2: OpciÃ³n 2\n3: OpciÃ³n 3");
        int seleccion = entrada.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Seleccionaste 1");
                break;
            case 2:
                System.out.println("Seleccionaste 2");
                break;
            case 3:
                System.out.println("Seleccionaste 3");
                break;
            default:
                System.out.println("Esa opciÃ³n no existe");
        }
    }

}