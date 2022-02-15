
package com.mycompany.keke;

import java.io.File;

public class E002estado {

    public static void main(String[] args) {
        E002estado programa = new E002estado();
        programa.inicio();
    }
    
    public void inicio(){
        File temp = new File ("C:/Temp");
        File fotos = new File ("C:/Temp/Fotos");
        File documentos = new File ("C:/Temp/Fotos/Documentos.txt");
        System.out.println(temp.getAbsoluteFile() + "existe?" + temp.exists());
        mostrarEstado(fotos);
        mostrarEstado(documentos);
    }
    
    public void mostrarEstado(File f){
        System.out.println(f.getAbsoluteFile() + " es un fichero? - " +  f.isFile());
        System.out.println(f.getAbsoluteFile() + "es una carpeta? - " + f.isDirectory());
    }
    
}
