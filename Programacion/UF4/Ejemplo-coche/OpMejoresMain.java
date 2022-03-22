
package com.mycompany.keke;


import javax.swing.JOptionPane;


public class OpMejoresMain {

   
    public static void main(String[] args) {
        // crear objeto
        OpMejores calculadora = new OpMejores();
        
        //conseguir los nÃºmeros
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Â¿CuÃ¡l es el primer nÃºmero?"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Â¿CuÃ¡l es el segundo nÃºmero?"));
        
        //invocar los mÃ©todos
        calculadora.sumar(num1, num2);
        calculadora.restar(num1, num2);
        calculadora.multiplicar(num1, num2);
        calculadora.dividir(num1, num2);
        calculadora.imprimir();
    }
    
}

