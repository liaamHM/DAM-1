
package com.mycompany.keke;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UF1_002 {

    public static void main(String[] args) {
        //Creamos unn scanner para que nuestro usuario ponga el numero
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe un número entero:");
        //creamos variable para que se introduzca el numero escaneado
        int num = entrada.nextInt();
        //hacemos las operaciones necesarias creando otras variables
        int numx2 = num*2;
        int numx3 = num*3;
        ////Por ultimo haces un JOptionPane de tipo .showMessageDialog para mostrar el mensaje que queremos
        JOptionPane.showMessageDialog(null, "Número introducido: " + num + "\nEl doble de " + num + " es " + numx2 + "\nEl triple de " + num + " es " + numx3);
       
     

    }
    
}
