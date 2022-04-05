package com.mycompany.keke;

import java.util.Scanner;

public class MedinaLiamPersonaPrincipal {

    public static void main(String[] args) {
        
        //aqui como en el aterior archivo creo las variables para guardar la informacion del usuario y asi poder enviarlas al contructor en un momento dado

        int numeroDNI = 0;
        char sexo = 'O';
        double altura = 0;
        double peso = 0;
        int edad = 0;
        String nombre = "";

        //creo un scanner para preguntar el nombre al usuario

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        boolean salir = false;

        //hago una validacion de datos simple con bandera

        do {
            if (entrada.hasNextLine()) {
                nombre = entrada.nextLine();
                salir = true;
            } else {
                System.out.println("Error, introduce un nombre valido");
            }

        } while (!salir);

        //aqui pregunto la edad al usuario

        System.out.println("¿Cuantos años tienes?");
        boolean salir2 = false;

        //vulevo a hacer una validacion simple con bandera para saber si el usuario ha introduciod un valor valido

        while (!salir2) {
            if (entrada.hasNextInt()) {
                edad = entrada.nextInt();
                salir2 = true;
            } else {
                System.out.println("Error, introduce una edad valida");
            }
            entrada.nextLine();
            //limpio el buffer para que no se cree un bucle con el while
        }

        boolean salir3 = false;
        //esta vez pregunto dentro del bucle la numeracion del DNI ya que si el usuario se confunde prefiero que vuelva a salir
        //la pregunta completa para que se de cuenta de lo que realmente estoy pidiendo 
        do {
            System.out.println("Introduce solamente la numeración de tu DNI:");
            //valido si hay alguna letra en lo que ha introducido el usuario
            if (entrada.hasNextInt()) {
                numeroDNI = entrada.nextInt();
                //despues valido si el numero que ha introducido es valido y no supera los 100 millones o es negativo
                if (numeroDNI < 99999999 && numeroDNI > 0) {
                    salir3 = true;
                } else {
                    System.out.println("Numero incorrecto");
                    entrada.nextLine();
                }

            } else {
                System.out.println("Esto no es un numero");
                entrada.nextLine();
            }
            entrada.nextLine();
            //antes de salir limpio el buffer para que no se haga un bucle infinito con el while
        } while (!salir3);

        //pregunto al usuario cual es su sexo y le expongo las opciones

        System.out.println("¿Cual es tu sexo? (H/M/Otro)");
        boolean salir4 = false;

        while (!salir4) {
            if (entrada.hasNextLine()) {
                //aqui pongo que si no es o hombre o mujer que el programa automaticamnete ponga la opcion de "Otro" 
                sexo = entrada.nextLine().charAt(0);
                if (sexo == 'H' || sexo == 'M') {
                    salir4 = true;
                } else {
                    sexo = 'O';
                    salir = true;
                }
            } else {
                System.out.println("Error, introduce un sexo valido");
            }

        }

        //pregunto cuanto pesa al usuario

        System.out.println("¿Cuanto pesas?");
        boolean salir5 = false;

        // validacion de dato con un bucle con bandera

        while (!salir5) {
            if (entrada.hasNextDouble()) {
                peso = entrada.nextDouble();
                salir5 = true;
            } else {
                System.out.println("Error, introduce un numero valido");
            }
            //limpio el buffer para que no se cree un bucle con el while y porque ademas el siguiente valor que tiene que
            //introducir el usuario tambies es un double y no quier que se introduzca el mismo valor en la altura
            entrada.nextLine();
        }

        //hago exactamente lo mismo que cuando pregunto el peso pero esta vez con la altrua

        System.out.println("¿Cuanto mides?");
        boolean salir6 = false;

        while (!salir6) {
            if (entrada.hasNextDouble()) {
                altura = entrada.nextDouble();
                salir6 = true;
            } else {
                System.out.println("Error, introduce un numero valido");
            }
            entrada.nextLine();
        }

        //una vez tengo introducidos todos los datos se los envio al constructor para que este introduzca los datos en el otro .java
        MedinaLiamPersona p1 = new MedinaLiamPersona(numeroDNI, sexo, altura, peso, edad, nombre);
        //pido al programa que me calcule la letra del numero de DNI
        p1.letraNum(numeroDNI);
        //pido al programa que imprima la informacion completa del usuario ya que ya tengo todo lo que necesito para poder imprimir todo
        p1.informacionCompleta();
        //pido al programa que me calcule el IMC con la clase que he creado y lo introduzco en una variable
        int IMC = p1.IMC(altura, peso);

        //creo un switch para diferenciar que numero tengo y que es necesario imprimir en cada caso
        switch (IMC) {
            case -1:
                System.out.println("Tu peso esta por debajo de lo normal.");
                break;
            case 0:
                System.out.println("Tu peso es ideal.");
                break;
            case 1:
                System.out.println("Tienes sobrepeso.");
                break;
        }
        //pido al programa que me detecte si la persona es mayor de edad y lo introduzco en una variabel boleana 
        boolean respuesta = p1.legalidadEdad();

        //cre un if donde si el boleano es true imrpima que es mayor de edad y si no que imprima que es menor
        if (respuesta == true) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

    }

}
