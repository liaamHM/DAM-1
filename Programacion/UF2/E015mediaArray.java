
package com.mycompany.keke;

public class E015mediaArray {

    public static void main(String[] args) {
        E015mediaArray programa = new E015mediaArray();
        programa.inicio();
    }
    
   public void inicio(){
       double[] valores = {4.5,7.8,3.6,5.4,7.2,6.4};
       double resultado = media(valores);
       System.out.println("La media es: " + resultado);
   }
   
   public double media(double[]a){
       double sum = 0;
       double media=0;
       for(int i= 0; i<a.length;i++){
           sum =+ a[i];
       }
       media = sum/a.length;
       return media;
   }
    
}
