package com.mycompany.keke;

import java.io.File;

public class E001file {

    public static void main(String[] args) {
        E001file programa = new E001file();
        programa.inicio();
    }

    public void inicio() {
        //inicializar dos rutas absolutas
        File carpetaAbs = new File("C:/Carpeta");
        File ficheroAbs = new File("C:/Carpeta/documento.txt");

        //inicializamos rutas relativas
        File carpetaRel = new File("Carpeta");
        File ficheroRel = new File("Carpeta/Documento.txt");
        MostrarRutas(carpetaAbs);
        MostrarRutas(ficheroAbs);
        MostrarRutas(carpetaRel);
        MostrarRutas(ficheroRel);

    }

    public void MostrarRutas(File f) {
        System.out.println("La ruta es: " + f.getAbsolutePath());
        System.out.println("Su padre es: " + f.getParent());
        System.out.println("su nombre es: " + f.getName());
    }

}
