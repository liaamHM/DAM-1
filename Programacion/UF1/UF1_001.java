
package com.mycompany.keke;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UF1_001 {

    public static void main(String[] args) {
        //Creas un scanner para que el usuario escriba su nombre
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe tu nombre:");
        //aqui creas una variable para tipo String para que en eesta se introduzca el nmbre del usuario
        String nombre = entrada.next ();
        //Por ultimo haces un JOptionPane de tipo .showMessageDialog para mostrar el mensaje y el nombre del usuario
        JOptionPane.showMessageDialog(null, "Buenos días, " + nombre);

    }
    
}
