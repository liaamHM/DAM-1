package com.mycompany.keke;

import java.util.Scanner;

public class E002codificacionMetodos {

    //declaraciÃ³n de variable global
    private int[] listaEnteros = new int[10];
    private int contador = 0;

    public static void main(String[] args) {
        //nombre de la clase + identificador!!        
        E002codificacionMetodos programa = new E002codificacionMetodos();
        programa.inicio();
    }

    public void inicio() {
        //Instrucciones del mÃ©todo principal
        //problema general
        leerLista();
        ordenarLista();
        contadorNumeros();
        imprimirLista();
        imprimirContador();
    }

    //MÃ©todo con las instrucciones (bloque de cÃ³digo) para leer una lista
    public void leerLista() {
        //Instrucciones - bloque de cÃ³digo
        System.out.println("Escribe 10 enteros");
        Scanner entrada = new Scanner(System.in);
        int indice = 0;
        while (indice < listaEnteros.length) {
            if (entrada.hasNextInt()) {
                listaEnteros[indice] = entrada.nextInt();
                indice++;
            } else {
                entrada.next();
            }
        }
        entrada.nextLine();
    }

    //MÃ©todo para ordenar una lista
    public void ordenarLista() {
        //Instrucciones
        for(int i = 0; i < listaEnteros.length; i++){
            for(int j = 0; j < listaEnteros.length; j++){
                //Si la posiciÃ³n actual tiene un valor mayor que la de la bÃºsqueda, se intercambian
                if( listaEnteros[i] < listaEnteros[j]){
                    //necesitamos una variable auxiliar para hacer el intercambia
                    int cambio = listaEnteros[i];
                    listaEnteros[i] = listaEnteros[j];
                    listaEnteros[j] = cambio;
                }
            }
        }
    }
   
    //MÃ©todo para imprimir una lista
    public void imprimirLista() {
        //Instrucciones
        System.out.println("El array ordenado es: [");
        for (int i = 0; i < listaEnteros.length; i++){
            System.out.println(listaEnteros[i] + " ");
        }
        System.out.println("]");
    }

    public void contadorNumeros(){
        int numero = listaEnteros[9] /2;
        for(int i=0; i<listaEnteros.length; i++){
            if(listaEnteros[i] < numero){
                contador++;
            }
        }
    }
    
    public void imprimirContador(){
        System.out.println("Hay " + contador + " mas pequeños que lamitad del numero mas grande.");
    }
}
