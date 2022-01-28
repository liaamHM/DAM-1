package com.mycompany.keke;
import java.util.Scanner;
public class UF1_020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos hay?");
        final int TAM = entrada.nextInt();
        String alumnos[] = new String [TAM];
        double notas[] = new double [TAM];
        
        for (int i=0; i<TAM; i++){
            System.out.println("Introduce el nombre del alumno:");
            alumnos[i] = entrada.next();
            System.out.println("Introduce su nota");
            notas[i] = entrada.nextDouble();
        }
        
        double sumaAcumulada = 0;
        for (int i=0; i<TAM; i++){
            sumaAcumulada += notas[i];
        }
        System.out.println("La nota media de la clase es: " + sumaAcumulada/notas.length);
        System.out.println("Los alumnos con la nota superior a la media son:");
        for (int i=0; i<TAM; i++){
            if (notas [i] > sumaAcumulada/notas.length){
                System.out.println(alumnos[i]);
            }
        }
    }    
}
