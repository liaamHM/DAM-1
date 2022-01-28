package com.mycompany.keke;

import java.util.Scanner;

public class UF1_015 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        int num = 0;
        
        if(entrada.hasNextInt()){
            num = entrada.nextInt();
        }else{
            System.out.println("Error");
        }
        entrada.nextLine();
        
        int i = 0;
        
        do{
           i++;
            System.out.println(i);
        } while (i<num);
    }
    
}
