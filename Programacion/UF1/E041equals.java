
package com.mycompany.keke;

public class E041equals {

    public static void main(String[] args) {
        //comprobar si en array args existe cierto argumento
        //tiene argumentos?
        if(args.length >0 ){
            //recorrer el array
            for(int i=0; i<args.length; i++){
                if(args[i].equals("cinco")){
                    System.out.println("El argumento " + (i+1) + " es \"cinco\"");
                } else {
                    System.out.println("El argumento " + (i+1) + " no es \"cinco\"");
                }
            }
        }
    }
    
}
