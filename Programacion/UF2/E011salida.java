package com.mycompany.keke;

import java.util.Scanner;

public class E011salida {

    public static void main(String[] args) {
        E011salida programa = new E011salida();
        programa.inicio();
    }

    public void inicio() {
        System.out.println("Introduce un numero entero");
        int a = leerNumero();
        System.out.println("Has introducido " + a + ".");
        System.out.println("Introduce otro numero");
        a = leerNumero();
        System.out.println("El nuevo numero ha sido " + a);
        
    }
    
    // metodo que lle un numero netero desde le teclado
    //paramteros de netrada --> nopr
    //param salida --> int
    public int leerNumero(){
        Scanner entrada = new Scanner(System.in);
        int numLeido = 0;
        boolean leido = false;
        while(!leido){
            if(entrada.hasNextInt()){
                numLeido = entrada.nextInt();
                leido  = true;
            } else {
                System.out.println("Error! Introduce un numero nuevo");
                entrada.nextLine();
            }
        }
        entrada.nextLine();
        //que variable teien el resultado?
        return numLeido;
        
    }

}
