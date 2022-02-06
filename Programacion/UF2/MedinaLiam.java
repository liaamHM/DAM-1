package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiam {

    //creo una variable que utilizare en mas de una función.
    int num = 0;

    public static void main(String[] args) {
        MedinaLiam programa = new MedinaLiam();
        programa.inicio();
    }

    public void inicio() {
        pedirNumero();
        operador(num);
        //por ultimo llamo a las funciones de una forma simple ya que dentro de estas se hacen todas las operaciones necesarias
        //ya que el programa solo esta hecho para que funcione 1 vez (ya que en el enunciado no indica que el ususario tenga que introducir mas de 1 numero)
    }
    //creo la función donde haré la operación y ademas informare al usuario sobre que es su numero 
    //ya que no he encontrado una forma de hacer las dos cosas por separado
    public int operador(int n) {
        int numi = n;
        int factor_primo = 2;
        //creo tanto la variable que modificare para encontrar los factores primos como el la variable de los factores primos
        //a continuación hago un bucle para que de esta forma pueda repetir la operación de forma infinita hasta encontrar los numeros que quiero.
        do {
            if (factor_primo == n) {
                System.out.println(n + " es un numero primo.");
                numi = 1;
                //para empezar detecto si el numero introducido es primo fijandome si el programa
                //ha detectado que el numero solo se puede dividir por si mismo
            } else if (numi % factor_primo == 0) {
                numi /= factor_primo;
                System.out.print(factor_primo + " ");
                // si no es primo primero detecto en el "else if" si el numero es divisible por el factor primo que hay en la variable en este momento
                //si lo es hago la operación e indico al usuario cual es el factor primo
            } else {
                //si el numero no es divisible le sumo 1 hasta que lo sea
                factor_primo++;
            }
        } while (numi > 1);
        //cuando el numero introducido por el usuario llega a 1 significa que el programa ya ha disminuido al maximo el numero y por lo tanto que ya ha acabado la operación

        return n;
        //hago un return que no sirve de nada pero si no el programa me da error
    }
    //creo la función donde recogo el numero del ususario
    public void pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero entero mayor al numero 2.");
        //le pido al usuario el numero
        boolean salir = false;
        //creo un boleano para salir del bucle que he creado para la validación de datos
        while (!salir) {
            if (entrada.hasNextInt()) {
                num = entrada.nextInt();
                //primero detecto si lo que hay en el buffer es un entero.
                if (num >= 2){
                    salir = true;
                    //después detecto si este es igual o mayor a 2 y si es asi el programa sale del bucle 
                    //con el numero guardado en la variable "num"
                }else {
                    System.out.println("Error, vuelve a intentarlo.");
                    entrada.nextLine();
                    //si el numero es mas pequeño que 2 informo al usuario y limpio el buffer
                }
            } else {
                System.out.println("Error, vuelve a intentarlo.");
                entrada.nextLine();
                //si el usuario ha introducido algo que no es un entero se lo comunico y limpio el buffer.
            }
        }
    }
}
