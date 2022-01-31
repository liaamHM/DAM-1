
package com.mycompany.keke;

public class E021monolitico {

    public static void main(String[] args) {
        E021monolitico programa = new E021monolitico();
        programa.inicio();
    }
    
    public void inicio(){
        double[] notas = {4.5,7.8,3.6,5.4,7.2,6.4};
        double max = calcularMaximo(notas);
        double min = calcularMinimo(notas);
        double media = calcularMedia(notas);
        System.out.println(max + ", " + min + ", " + media);
    }
    
    public double calcularMaximo(double[]array){
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    
    public double calcularMinimo(double []array){
        double min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    
    public double calcularMedia(double[]array){
        double suma  =0;
        for (int i = 0; i < array.length; i++){
            suma = suma + array[i];
        }
        return suma/array.length;
    }
    
}
