package com.mycompany.keke;

import java.util.ArrayList;
import java.util.Scanner;

public class E049arrayList {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //no hace falta establecer el tamaño del array
        
        //declara ArrayList e inicializacion
        
        //entre <> va el tipo de dato de inicializacion del array
        ArrayList <String> cosas = new ArrayList <> ();
        //en el contructor, <> puede contener el tipo de dato
        
        //inicializar
        
        char respuesta;
            
        do{
            System.out.println("Introduce un valor");
            String valor = entrada.next();
            //grabar eld ato en el arrayList
            cosas.add(valor);
            System.out.println("Algun dato ue introducir ? s/n");
            respuesta = entrada.next().charAt(0);
            
        }while  (respuesta =='s'|| respuesta == 'S');
        
        for(int i = 0; i<cosas.size(); i++){
            System.out.println(cosas.get(i));
            //.get(i) sustituye al [i]
        }
    }
    
}
