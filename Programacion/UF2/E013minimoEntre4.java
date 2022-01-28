package com.mycompany.keke;

public class E013minimoEntre4 {

    public static void main(String[] args) {
        E013minimoEntre4 programa = new E013minimoEntre4();
        programa.inicio();
    }

    public void inicio() {
        int resultado = minimo(20, 30, 45, 8);
        System.out.println(resultado);
    }

    public int minimo(int a, int b, int c, int d) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }
        return min;
    }

}
