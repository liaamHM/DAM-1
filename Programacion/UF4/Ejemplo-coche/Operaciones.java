
package com.mycompany.keke;

import javax.swing.JOptionPane;

public class Operaciones {
    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //mÃ©todos
    
    //mÃ©todo que pida nÃºmeros
    public void leerNums(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Â¿CuÃ¡l es el primer nÃºmero?"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Â¿CuÃ¡l es el segundo nÃºmero?"));
    }
    
    //mÃ©todo sumar
    public void sumar(){
        suma = num1 + num2;
    }
    
    //mÃ©todo restar
    public void restar(){
        resta = num1 - num2;
    }
    
    //mÃ©todo multiplicar
    public void multiplicar(){
        multiplicacion = num1 * num2;
    }
    
    //mÃ©todo dividir
    public void dividir(){
        division = num1 / num2;
    }
    
    //mÃ©todo imprimir
    public void imprimir(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La divisiÃ³n es: " + division);
        System.out.println("La multiplicaciÃ³n es: " + multiplicacion);
    }
}
