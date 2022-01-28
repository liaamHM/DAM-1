
package com.mycompany.keke;

public class E055buscar10 {

    public static void main(String[] args) {
        float [] notas = { 2f, 5.5f, 9f, 10f, 4.9f, 8f ,8.5f , 7f, 6.6f, 5f, 9.7f};
        
        boolean encontrado = false;
        int i = 0;
        
        while ((i<notas.length) && !encontrado){
            if(notas[i]==10){
                encontrado = true;
            }
            i++;
        }
        if(encontrado){
            System.out.println("Alguien ha sacado un 10");
        } else {
            System.out.println("Nadie ha sacado un 10");
        }
    }
    
}
//la profe quiere q el 056 sea lo mismo pero con notas supendidas, es cambier el if del whiel de un == 10 
//a un < 5 y ya sta xd
//057 es lo mismo pero con una letra xd

