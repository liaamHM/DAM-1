
package com.mycompany.keke;

public class E053mediaNotas {
    //calcular nota media de las notas del array
    public static void main(String[] args) {
        //array de notas
        float [] notas = { 2f, 5.5f, 9f, 10f, 4.9f, 8f ,8.5f , 7f, 6.6f, 5f, 9.7f};
        //declarar sumatorio
        float suma =0;
        //recorrer el array
        for (int i = 1; i < notas.length; i++){
            suma = suma + notas[i];
        }
        float media = suma / notas.length;
        System.out.print("La nota media es: ");
        System.out.printf("%.2f",media);
        /* float max = 0;
            for (int i = 1; i < notas.length; i++){
            if (max<notas[i]){
                max = notas[i];
            }
        }
        sou balbla bla
        */
    }
    
}
