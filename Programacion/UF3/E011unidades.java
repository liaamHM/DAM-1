
package com.mycompany.keke;

import java.io.File;


public class E011unidades {

   
    public static void main(String[] args) {
       E011unidades programa = new E011unidades();
       programa.inicio();
    }
    
    public void inicio(){
        
        try {
            File [] unidades = File.listRoots();
            for(int i = 0; i < unidades.length; i++){
                System.out.println(unidades[i] + " - Tamaño total: " + unidades[i].getTotalSpace()+ " - Tamaño disponible: " + unidades[i].getFreeSpace());
                
            }
            
        } catch (Exception e){
            System.out.println("Se ha producido un error " + e);
        }
    }
    
}
