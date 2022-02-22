
package com.mycompany.keke;

import java.io.File;
import java.util.Scanner;

public class E007TextoTeclado {


    public static void main(String[] args) {
        E007TextoTeclado programa = new E007TextoTeclado();
        programa.inicio();
    }
    
    public void inicio(){
        File rutaFichero = leerNombreFichero();
        //comprobar que existe
        if(rutaFichero.isFile()){
            File nuevaRuta = quitarExt(rutaFichero);
            System.out.println("Nombre cambiado de " + rutaFichero + " a " + nuevaRuta);
        } else {
            System.out.println("Este fichero no existe");
        }
    }
    
    //preguntar al usuario el nombre del fichero -> obtener la ruta
    //param entrada -> nope
    //param salida -> fichero, la ruta asociada al texto introducido
    public File leerNombreFichero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la ruta de un fichero existente");
        String nombreFichero = entrada.nextLine();
        //se puede hacer return de una variable tipo File
        File f = new File(nombreFichero);
        return f;
    }
    
    
    //teniendo la ruta, crear otra igual pero sin extensión
    //param entrada -> la ruta que ha llegado por el teclado
    //param salida -> la ruta sin extensión
    public File quitarExt(File original){
        String nombre = original.getName();
        String padre = original.getParent();
        //buscar el punto para encontrar la extensión
        int posPunto = nombre.lastIndexOf(".");
        if(posPunto > 0){
            //eliminar lo que quede tras el punto
            String nuevoNombre = nombre.substring(0, posPunto);
            //nueva ruta -> sin extensión
            String nuevoTexto = padre + File.separator + nuevoNombre;
            File nuevaRuta = new File(nuevoTexto);
            return nuevaRuta;
        } else {
            //si no hay extensión, se deja igual
            return original;
        }
    }
    
}
