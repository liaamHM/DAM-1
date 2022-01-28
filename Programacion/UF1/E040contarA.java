
package com.mycompany.keke;

public class E040contarA {
//file, project properties(keke), seleccionamos main class en la que queremos actuar y en los argumentos ponemos los valores de array
//en este caso son los meses, estos se van a aguardar en un array llamado "args"    
    public static void main(String[] args) {
        //contar cuantas palabras tienen la letra "a"
        int contador = 0;
        //arg es un array
        //lo que hemos introducido en args son elementos del array
        for(int i = 0; i<args.length; i++){
            //comprobar si hay alguna "a" en la iteracion
            if(-1 != args[i].indexOf("a")){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " argumentos con la letra a");
    }
    
}
