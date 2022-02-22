
package com.mycompany.keke;


public class E010tryCatchGeneral {

  
    public static void main(String[] args) {
        E010tryCatchGeneral programa = new E010tryCatchGeneral();
        programa.inicio();
    }
    
    public void inicio(){
        try {
            System.out.println("Ejecutamos un bloque de instrucciones");
            System.out.println("Instrucción 1");
            int n = Integer.parseInt("M");
            System.out.println("Instrucción 2");
            System.out.println("Instrucción 3");
        } catch (Exception e){
            System.out.println("Se ha producido un error " + e); 
        }
        System.out.println("Esto sigue funcionando");
    }
    
}
