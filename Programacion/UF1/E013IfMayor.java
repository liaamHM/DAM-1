
package com.mycompany.keke;

import java.util.Scanner;

public class E013IfMayor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b;
        System.out.println("Introduce un numero:");
        a = entrada.nextInt();
        System.out.println("Introduce otro numero:");
        b = entrada.nextInt();
        
        if (a > b) { 
            System.out.println(a + " es mayor que " + b + "\n" + b + " es meor que " + a);
        }
        //lo siguiente lo he puesto yo, no es de la clase, no lo cuentes como leccion de la profe si no invencion propia
        else {System.out.println(b + " es mayor que " + a + "\n" + a + " es meor que " + b);
        }
        System.out.println("Fin del programa");
        }

    }
    

