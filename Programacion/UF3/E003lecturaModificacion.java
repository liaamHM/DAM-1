
package com.mycompany.keke;

import java.io.File;
import java.util.Date;

public class E003lecturaModificacion {

    public static void main(String[] args) {
        E003lecturaModificacion programa =  new E003lecturaModificacion();
        programa.inicio();
    }
    
    public void inicio(){
        File documento = new File("C:/Temp/doc.txt");
        System.out.println(documento.getAbsoluteFile());
        //ojo! tipo Date
        Date fecha  = new Date (documento.lastModified());
        System.out.println("ultima modificacion: " + fecha);
        System.out.println("Tamaño del fichero: " + documento.length());
                        
    }
    
}
