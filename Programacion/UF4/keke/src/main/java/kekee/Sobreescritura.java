
package kekee;

public class Sobreescritura {

    public static void main(String[] args) {
        Animal a = new Animal();
        Gato g = new Gato();
        Pajaro p = new Pajaro();
        
        a.comer();
        
        g.comer();
        g.correr();
        
        p.comer();
        p.volar();
    }
    
}
