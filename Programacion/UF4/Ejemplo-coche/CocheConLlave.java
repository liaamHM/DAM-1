
package com.mycompany.keke;

public class CocheConLlave {
    //atributos
    String marca;
    float kms;
    String color;
    private boolean acceso = false;
    
    public void usarLlave(String clave){
        if(clave.equals("123456")){
            acceso = true;
        } else {
            acceso = false;
            System.out.println("Te estÃ¡n robando el coche");
        }
    }
    
    public void mando(String accion){
        if(acceso == true){
            if(accion.equals("arranca")){
                arranca();
            }
        }
    }
    
    private void arranca(){
        System.out.println("mÃ©todo arranca");
    }
    
    public void acelera(){
        System.out.println("mÃ©todo acelera");
    }
    
    public void frena(){
        System.out.println("mÃ©todo frena");
    }
    
    
}
