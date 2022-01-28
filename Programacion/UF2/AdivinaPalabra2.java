package keke;

import java.util.Scanner;

public class AdivinarPalabra2 {

    //constates
    public final static char CORRECTO = 'O';
    public final static char POS_INCORRECTA = 'X';
    public final static char INCORRECTO = '-';
    public final static String ABC = "abcdefghijklmnopqrstuvwxyz";
    public final static String ACIERTO = "OOOOO";

    public static void main(String[] args) {
        AdivinarPalabra2 programa = new AdivinarPalabra2();
        programa.inicio();
    }

    public void inicio() {
        String secreto = generarPalabraSecreta();
        System.out.println(secreto); //chivato
        //"acierto" dice si se ha acabado el programa
        boolean acierto = false;
        while (!acierto) {
            String respuesta = preguntarRespuesta();
            resolverRespuesta(secreto, respuesta);
        }
    }
    
    //****PRIMER NIVEL DE DESCOMPOSICIÓN
    
    //**GENERAR PALABRA SECRETA
    //entrada -> no
    //salida-> string, la palabra secreta de 5 letras
    public String generarPalabraSecreta(){
        String res = "";
        for (int i=0; i<5; i++){
            res = res + generarLetraAleatoria();
        }
        return res;
    }
    
    
    //**PREGUNTAR RESPUESTA
    //entrada -> no, se obtiene por teclado
    //salida -> string, la palabra de respuesta
    public String preguntarRespuesta(){
        Scanner entrada = new Scanner(System.in);
        boolean lecturaOk = false;
        String res = null;
        do {
            System.out.println("Escribe 5 letras");
            res = entrada.next();
            entrada.nextLine();
            lecturaOk = comprobarRespuesta(res);
            if (!lecturaOk){
                System.out.println("Respuesta no válida");
            } 
        } while (!lecturaOk);
        return res;
    }
    
        
    //**COMPROBAR RESPUESTA
    //entrada -> texto a comprobar
    //salida -> booleano, correcto o incorrecto
    public boolean comprobarRespuesta(String respuesta){
        if(respuesta.length()!=5){
            //si no tiene 5 caracteres, false
            return false;
        }
        for(int i = 0; i < respuesta.length(); i++){
            //si no está compuesta por lo que hay en ABC, false
            char c = respuesta.charAt(i);
            if ( -1 == ABC.indexOf(c)){
            return false;
            }
        }
        //resto de casos, true
        return true;
    }
    
    
    //**RESOLVER RESPUESTA VERSIÓN 1
    //entrada -> la respuesta y el valor secreto
    //salida -> no, solo imprimir
//    public void resolverRespuesta(String secreto, String respuesta){
//        String res = generarPista(secreto, respuesta);
//        System.out.print("La respuesta es [" + res + "].");
//        if(res.equals("OOOOO")){
//            System.out.println("¡Ganador!");
//        } else {
//            System.out.println("Sigue intentándolo");
//        }
//    }
    
    //**RESOLVER RESPUESTA VERSIÓN 2
    //entrada -> la respuesta y el valor secreto
    //salida -> Booleano, si se ha acertado
    public boolean resolverRespuesta(String secreto, String respuesta){
        String res = generarPista(secreto, respuesta);
        boolean fin = false;
        System.out.print("La respuesta es [" + res + "].");
        if(res.equals(ACIERTO)){
            System.out.println("¡Ganador!");
            fin = true;
        } else {
            System.out.println("Sigue intentándolo");
        }
        return fin;
    }
    
    
//****SEGNDO NIVEL DE DESCOMPOSICIÓN
    
    //**GENERAR LETRA ALEATORIA
    //entrada -> no
    //salida -> char
    public char generarLetraAleatoria(){
        long nano = System.nanoTime();
        int index = (int)(nano % ABC.length());
        return ABC.charAt(index);
    }
    
    
    //**GENERAR PISTA
    //entrada -> la respuesta y el secreto (String)
    //salida -> String, la pista
    public String generarPista(String s, String r){
        String res ="";
        //comparar cada caracter de la solución y la respuesta
        for (int i = 0; i < s.length(); i++){
            //obtener los dos caracteres a comparar
            char charSecreto = s.charAt(i);
            char charRespuesta = r.charAt(i);
            if (charSecreto == charRespuesta){
                res = res + CORRECTO;
           } else if (s.indexOf(charRespuesta) != -1){
               //busca si el caracter existe en el string
               res = res + POS_INCORRECTA;
           } else {
               res = res + INCORRECTO;
           }
        }
        return res;
    }

}