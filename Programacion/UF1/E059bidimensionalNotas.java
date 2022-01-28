package com.mycompany.keke;

public class E059bidimensionalNotas {
//programa que calcule notas media sne un array bidmensional

    public static void main(String[] args) {
        //notas
        float[][] notas = {
            {5.5f, 6f, 5.9f, 8f, 1f},
            {10f, 4.5f, 8.9f, 1f, 9.8f},
            {2f, 4.2f, 7f, 0f, 3f},
            {2.1f, 10f, 9.9f, 6f, 3.5f},
            {1.5f, 8.5f, 4.3f, 7.9f, 2.9f},};

        //media aritmetica del curso para todos los estudiantes
        float sumaFinales = 0;
        //recorrida fila por fila, segun i
        //cada fila es un estudiante

        //noras.length nos dará el numero de estudiantes
        for (int i = 0; i < notas.length; i++) {
            //acumulabdo de notas de UN estudiante
            float sumaNotasUno = 0;

            //recorrido de cada fila - cada estudiante
            //las notas las indexa j
            //notas[i].length evalua el numero de posiciones de la fila
            for (int j = 0; j < notas[i].length; j++) {
                //estamos en la ulrima posocion de la fila?
                //es importante pq al final de la fila se hata la media
                if (j != (notas[i].length - 1)) {
                    sumaNotasUno = sumaNotasUno + notas[i][j];
                } else {
                    //si es la ultima posicion, hay que escribir la media
                    float notaMedia = sumaNotasUno / (notas[i].length - 1);
                    notas[i][j] = notaMedia;
                    System.out.println("El estudiante " + i + " ha sacado " + (notaMedia) + " de media");
                    //se acutaliz aa sima de las medias de todos los estudiantes
                    sumaFinales = sumaFinales + notaMedia;
                }

            }
            //fin del recorrido filas
        }
        //calculo de la media
        float mediaFinal = sumaFinales /notas.length;
        System.out.println("La nota media del curso es " + mediaFinal);
    }

}
