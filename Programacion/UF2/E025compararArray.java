
package com.mycompany.keke;

public class E025compararArray {

    public static void main(String[] args) {
        E025compararArray programa = new E025compararArray();
        programa.inicio();
    }
    
    public void inicio(){
        double [] temp = {20.0, 21.0, 30.0, 25.5, 15.32, 28.70, 22.24};
        double [] temp2 = {24.0, 20.0, 32.0, 22.5, 17.32, 25.70, 22.24};
        E022calculoArray calculador = new E022calculoArray();
        double media = calculador.calcularMedia(temp);
        double media2 = calculador.calcularMedia(temp2);
        if(media < media2){
            System.out.println("El segundo array tiene la media mas grande");
        }else{
            System.out.println("El primer arraytiene la media mas grande");
        }
    }
    
}
