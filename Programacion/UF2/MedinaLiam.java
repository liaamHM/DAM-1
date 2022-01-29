package com.mycompany.keke;

public class MedinaLiam {

    //Creo las variables que utilizare en varias funciones
    final int MAX = 20;
    int numerosFinales[] = new int[MAX];
    //Creo el Array donde se gaurdaran primeros numeros Spencer
    int Aux2 = 0;

    public static void main(String[] args) {
        MedinaLiam programa = new MedinaLiam();
        programa.inicio();
    }

    public void inicio() {
        int numero = 1;
        int Aux = 0;
        //Creo la variable con el numero que quiero saber si es Spencer
        //Además creo otra variable Auxiliar para que una vez el Array guarde 20 numeros el programa salga del "while"
        while (Aux < 20) {
            //Hago un if para saber si el numero es igual al resultado de la operación
            if (numero == operacion(numero)) {
                //si es igual lo garda en el Array principal y suma 1 a las variables auxiliares que he creado
                guardadoDatos(numero);
                Aux2++;
                Aux++;

            }
            //sumo uno a "numero" para que el programa haga la operación con todos los numeros
            numero++;
        }
        Impresiones();
        //por ultimo llamo a la función de Impresiones para imprimir los numeros Spencer
    }

    //entrtada -> int (el numero con el que quiero hacer la operación)
    //salida -> int (el resultado que me da la operación con el numero de entrada)
    public int operacion(int x) {
        String numeros = Integer.toString(x);
        int cifras = numeros.length();
        //Convierto el numero entero en Stirng para poder sacar el numero de cifras
        //que tiene el "x"
        String[] sueltos = numeros.split("");
        //Separo los numeros y los guardo en un Array de String auxiliar
        int[] numerosSeparados = new int[sueltos.length];
        int[] numerosElevados = new int[sueltos.length];
        //Creo otros Arrays para poder hacer las operaciones adecuadas
        int resultado = 0;
        for (int i = 0; i < numeros.length(); i++) {
            numerosSeparados[i] = Integer.parseInt(sueltos[i]);
            //convierto los numeros de String a int de nuevo
            numerosElevados[i] = (int) Math.pow(numerosSeparados[i], cifras);
            //Elevo los numeros y los guardo en el Array
            resultado = resultado + numerosElevados[i];
            //Hago la sumatoria de los numeros elevados que hay dentro del Array
        }
        return resultado;
        //devuelvo el resultado ya que es la salida que tiene esta funcion
    }

    //entrada -> no hay
    //salida -> no hay
    public void Impresiones() {
        System.out.println("Los primeros 20 numeros Spencer són:");
        for (int i = 0; i < MAX - 1; i++) {
            //Imprimo los 19 primeros numeros ya que quiero que en el ultimo la impresión sea diferente
            System.out.print(numerosFinales[i] + ", ");
        }
        System.out.print(numerosFinales[MAX - 1] + ".");

    }

    //entrada -> int (el numero que queremos guardar)
    //salida -> int (devolvemos el Array con el numero guardardo)
    public int guardadoDatos(int x) {
        numerosFinales[Aux2] = x;
        //Utilizo la variabel auxiliar para saber en que espacio lo quiero guardar
        return numerosFinales[Aux2];
    }
}

