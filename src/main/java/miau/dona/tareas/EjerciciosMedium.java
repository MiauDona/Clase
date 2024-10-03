package miau.dona.tareas;

import miau.dona.utils.UtilsJava;

public class EjerciciosMedium {
    public static void main(String[] args) {
        //primosEntreNumeros();
        //tablasMultiplicarWhile();
        //numeroBinario();

    }

    /*
    1º.- Crea un programa que compruebe si un número es primo o no. Debes pedir al usuario un
    número y después informar de si se trata de un número primo o compuesto. Tienes prohibido
    el uso del bucle "for".
    */
    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        int divisor;
        divisor = numero - 1;
        while (divisor > 1) {
            if (numero % divisor == 0) {
                esPrimo = false;
                break;
            }
            divisor--;
        }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
        return esPrimo;
    }

    /*
    2º.- Crea un programa que compruebe si son primos o compuestos todos los números entre
    un límite inferior y uno superior que debes pedir al usuario. Tienes prohibido el uso del bucle
    "for".
    */

    public static void primosEntreNumeros() {
        int numeroAComprobar = (int) Math.round(UtilsJava.pedirNumerosParaRandom());
        System.out.println(numeroAComprobar);

        esPrimo(numeroAComprobar);
    }

    /*
    3º.- Crea un ejercicio que imprima en pantalla todas las tablas de multiplicar desde el 1 hasta
    el 15. Debes utilizar únicamente bucles de tipo "do...while". */

    public static void tablasMultiplicarWhile() {
        int factor = 1;
        int ordenTabla = 1;
        do {
            System.out.println("---------- Tabla del " + factor);
            ordenTabla = 1;
            do {
                System.out.println(factor * ordenTabla);
                ordenTabla++;
            } while (ordenTabla <= 10);
            factor++;
        } while(factor <= 15);
    }

    /*
    4º.- Crea un programa que pida al usuario un número e imprima ese número en binario.
    Tienes prohibido el uso del bucle "for".
    */

    public static void numeroBinario() {
        int numero = UtilsJava.pedirInt("Dame un int para convertirlo a binario");
        int numDividido = numero;
        int digitoBinario;


        String miResultado ="";
        while (numDividido != 0 && numDividido != 1) {
            if (numDividido < 0) {
                break;
            }
            digitoBinario = numDividido % 2;
            numDividido = (numDividido / 2);
            miResultado = digitoBinario + miResultado;
            if (numDividido == 0 || numDividido == 1) {
                miResultado = numDividido + miResultado;
            }
        }
        if (numero == 1 || numero == 0) {
            System.out.println(numero);
        } else if (numero < 0) {
            System.out.println("Es negativo, no te lo convierto");
        }
        System.out.println(miResultado);
    }



}
