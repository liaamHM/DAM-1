package com.mycompany.keke;

import java.util.Scanner;

public class UF1_026 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 10 numeros para el array");
        final int TAM = 10;
        int valores[] = new int[TAM];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = entrada.nextInt();
        }

        int asce = 0;
        int desc = 0;

        for (int i = 0; i < valores.length; i++) {
            
            if ((valores[i] + 1) == valores[i + 1]) {
                asce++;
            }
            if ((valores[i] - 1) == valores[i + 1]) {
                desc++;
            }

        }
        if (asce == 10) {
            System.out.println("Los valores estan ordenados de forma creciente");
        } else if (desc == 10) {
            System.out.println("Los valores estan ordenados de forma decreciente");
        } else {
            System.out.println("Los valores estan desordenados");
        }
    }

}











//hacer unn for donde dentro hay 3 ifs, donde if(valores[i]<valores[i+1] sume uno a una variable creada, si no es asi pasara al siguiente if
//fuera del for haremos un if donde si alguna de las variables ha llegado a a10 sera esa la respuesa, si no me entiende piensa
