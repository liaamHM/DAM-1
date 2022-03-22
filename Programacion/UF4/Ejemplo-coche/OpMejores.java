
package com.mycompany.keke;

import javax.swing.JOptionPane;

public class OpMejores {

    //atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //mÃ©todos
      

    //mÃ©todo sumar
    public void sumar(int num1, int num2) {
        suma = num1 + num2;
    }

    //mÃ©todo restar
    public void restar(int num1, int num2) {
        resta = num1 - num2;
    }

    //mÃ©todo multiplicar
    public void multiplicar(int num1, int num2) {
        multiplicacion = num1 * num2;
    }

    //mÃ©todo dividir
    public void dividir(int num1, int num2) {
        division = num1 / num2;
    }

    //mÃ©todo imprimir
    public void imprimir() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La divisiÃ³n es: " + division);
        System.out.println("La multiplicaciÃ³n es: " + multiplicacion);
    }
}