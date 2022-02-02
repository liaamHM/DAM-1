package com.mycompany.keke;

public class MedinaLiam {
    
                
    public static void main(String[] args) {
        MedinaLiam programa = new MedinaLiam();
        programa.inicio();
    }

    public void inicio() {
        
    }
    
   public int operador ( int n){
       int factor_primo = 2;
        do {
            if (n % factor_primo == 0) {
                
                n /= factor_primo;
            } else {
                factor_primo++;
            }
        } while (n > 1);
   }
   
   public int guardadoArray(int x){
       
   }

}
