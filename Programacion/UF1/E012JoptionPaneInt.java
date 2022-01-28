
package com.mycompany.keke;

import javax.swing.JOptionPane;

public class E012JoptionPaneInt {

    public static void main(String[] args) {
        //int num = JOptionPane.showInputDialog(null, "Cuentos años tienes");
        //Da error porque JOptionPane recibe String por defecto
        //necesitamos hacer una conversion de tipo
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero entero:"));

    }
    
}
