
package com.mycompany.keke;



public class MedinaLiamNotas {

    public static void main(String[] args) {
        //creo las variables necesarias para poder hacer las operaciones que necesito
        float[ ] notas = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
        int contador = 0;
        float suma = 0f;
        //recorro el array para comprobar que alumnos han superado el 7 y ademas sumo las notas para la media
        for(int i = 0; i<notas.length; i++){
            suma += notas[i];
            float nota = 6.9f;
            if (notas[i] > nota){
                contador++;
            }
        }
        //imprimo el contador de alumnos con 7 o mas y ademas hago la media y la imprimo
        System.out.println("El numero de alumnos que ha superado el 7 es: " + contador);
        System.out.println("La media de notas de los alumnos es: " + suma / notas.length);
    }
    
}
