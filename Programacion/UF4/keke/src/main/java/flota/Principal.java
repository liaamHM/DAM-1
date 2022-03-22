
package flota;

public class Principal {

    public static void main(String[] args) {
        //las clases abtractas no se pueden instaciar
        Moto m = new Moto ();
        m.ruedas();
        
        m.acelerar();
    }
    
}
