
//Programa Java que lea dos números enteros por teclado y muestre por pantalla:
//“Has introducido los números x e y”

package com.mycompany.keke;

import javax.swing.JOptionPane;

public class UF1_000 {

    public static void main(String[] args) {
        //hacemos unas variables donde se van a introducirlos numeros que introduzcamos y un JOptionPane con una conversion para poder poner los numeros
         int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero entero:"));
          int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero entero:"));
          //Por ultimo hacemos otro JOptionPane de .showMessageDialog para mostrar los numeros que hemos introducido en las variables
          JOptionPane.showMessageDialog(null, "Has introducido los números " + num + " y " + num2);

    }
    
}
