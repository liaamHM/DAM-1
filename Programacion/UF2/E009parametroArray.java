
package com.mycompany.keke;

public class E009parametroArray {

    public static void main(String[] args) {
        E009parametroArray programa = new E009parametroArray();
        programa.inicio();
    }
    public void inicio(){
        int []i={1,2,3,4,5};
        System.out.println("Antes de invoar el meteodo i[3] vale" + i[3]);
        modificarArray(i);
        System.out.println("Despues de invocar el metodo i[3] vale " + i[3]);
    }
    
    public void modificarArray(int[]a){
        a[3]= 0;
        System.out.println("Se ha modificado el valor a " + a[3]);
    }
    
}
