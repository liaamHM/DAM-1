
package com.mycompany.keke;

public class E014arrayReales {

    public static void main(String[] args) {
        E014arrayReales programa = new E014arrayReales();
        programa.inicio();
    }
    
    public void inicio(){
        double[] valores = {4.5,7.8,3.6,5.4,7.2,6.4};
        double resultado = maximo(valores);
        System.out.println("El valor maximo es: " + resultado);
    }
    
    //entrada ->array
    //salida -> double maximo
    
    public double maximo(double[]a){
        //a contiene el valor a tratar
        double max = a[0];
        for (int i = 1; i<a.length; i++){
            if (max < a[i]){
                max  = a[i];
            }
        }
        return max;
    }
}
