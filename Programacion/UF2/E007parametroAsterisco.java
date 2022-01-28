
package com.mycompany.keke;

public class E007parametroAsterisco {

    public static void main(String[] args) {
        E007parametroAsterisco programa = new E007parametroAsterisco();
        programa.inicio();
    }
    public void inicio(){
        astersicos(5);
        astersicos(10);
        astersicos(0);
        astersicos(15);
    }
    
    public void astersicos(int n){
        for(int i = 0; i<n; i++){
            System.out.println("*");
        }
        System.out.println("");
    }
    
}
