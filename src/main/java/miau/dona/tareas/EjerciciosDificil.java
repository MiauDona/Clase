package miau.dona.tareas;

import jdk.jshell.execution.Util;
import miau.dona.utils.UtilsJava;

public class EjerciciosDificil {
    public static void main(String[] args) {
        // sumaDigitos();
        // fibonacci();
        numeroPerfectoRango();
    }
/*
    /* 1.- Desarrolla un programa que sume los dígitos de un número entero.
    public static void sumaDigitos() {
        int miNumero = UtilsJava.pedirInt("Dame un numero de varios digitos para sumarlos entre si");
        String numeroString = String.valueOf(miNumero);
        int suma = 0;
        for (char i : numeroString.toCharArray()) {
            Integer.parseInt(String.valueOf(i));
            suma = Integer.parseInt(String.valueOf(i)) + suma;
        }
        System.out.println(suma);
    }


    /* 2.- Escribe un programa que imprima los primeros n términos de la secuencia de Fibonacci.
    // La secuencia empieza en 0,1 y se tienen que sumar los 2 números anteriores
    public static void fibonacci() {
        int num1 = 0;
        int num2 = 1;
        int cifraFibonacci = 0;
        int contador = 0;
        int cuantosNumeros = UtilsJava.pedirInt("Cuantos numeros quieres ver de la secuencia de fibonacci");
        System.out.println(num1);
        System.out.println(num2);
        while (contador < cuantosNumeros) {
            cifraFibonacci = num1 + num2;
            num1 = num2;
            num2 = cifraFibonacci;
            contador++;
            System.out.println(cifraFibonacci);
        }

    }
*/


    /*3.- Desarrolla un programa que encuentre y muestre los números perfectos en un rango
    dado. Descubre los números perfectos aquí:
    https://es.wikipedia.org/wiki/N%C3%BAmero_perfecto */

    public static void numeroPerfectoRango() {;
        int max, min;
        min = 1;
        max = 28;
        for (int i = min; i <= max; i++) { // i es la "n" de la formula del numero perfecto (NumPrimo)
            if (i == 1) {
                continue;
            }
            esNumeroPerfecto(i);

        }


    }
    public static void crearNumeroPerfecto(int numeroIntroducido) {
        int numPrimo = numeroIntroducido; // Numero de veces que se ejecuta el programa tambien, debe de ser primo
        int formulaNumPrimo = (int) Math.pow(2, numPrimo) - 1;
        int formulaUltimoNumero = (int) Math.pow(2, numPrimo - 1);
        int formulaPerfecto = formulaNumPrimo * formulaUltimoNumero;
        int var = 0;
        int num = 1;
        for (int i= 0; i < numPrimo; i++) {
            var = var + num;
            num = num * 2;
            // System.out.println("Num " + num + " Var " + var);
        }

        // System.out.println("Ultimo numero a partir de la formula " + formulaUltimoNumero);
        System.out.println("Numero perfecto " + formulaPerfecto);
        // System.out.println("Numero primo con la formula " + formulaNumPrimo);

        /*int ultimoNumero = var;
        if (ultimoNumero == formulaNumPrimo) {
            System.out.println("Es un numero de Menesser o cmo se llame");
        }*/
    }

    public static boolean esNumeroPrimo(int numeroIntroducido) {
        boolean esPrimo = true;
        for (int i = numeroIntroducido-1; i > 1; i--) {
            if (numeroIntroducido % i == 0) {
                esPrimo = false;
                System.out.println("El número no es primo");
                break;
            }
        }

        return esPrimo;

    }

    public static void esNumeroPerfecto(int numeroIntroducido) {
        int numAComprobar = numeroIntroducido; // Numero de veces que se ejecuta el programa tambien, debe de ser primo
        int n = 0;
        int formulaPerfecto;
        for (int i = 1; i < numeroIntroducido; i++) {
            n=i;
            formulaPerfecto = (int) ((Math.pow(2,n) - 1) * Math.pow(2,n-1));
            if (formulaPerfecto == numAComprobar) {
                System.out.println("Es un numero perfecto. NumAcomprobar " + numAComprobar + " resultadoFormula " + formulaPerfecto);
            }
        }

        // ultimonum * numprimosumaserie = numeroperfecto
        // 6 = ultimonum * numPrimoSumaSerie
        // n=x;
        // 6 = (2^x - 1) * ((2^x) - 1)


        //System.out.println("Numeros " + numeroIntroducido + " " + formulaPerfecto);
       /* if (numeroIntroducido == formulaPerfecto ) {
            System.out.println("Es igual");
        }*/


    }



    /*4.- Haz un juego donde el programa elige un número aleatorio y el usuario debe adivinarlo
    con pistas de "mayor" o "menor".*/
    /* 5.- Escribe un programa que imprima las primeras n filas del triángulo de Pascal. Descubre el
    triángulo de Pascal aquí: https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_de_Pascal
    */



}
