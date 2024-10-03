package miau.dona.tareas;

import jdk.jshell.execution.Util;
import miau.dona.utils.UtilsJava;

public class EjerciciosDificil {
    public static void main(String[] args) {
        // sumaDigitos();
    }

    /* 1.- Desarrolla un programa que sume los dígitos de un número entero.*/
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


    /* 2.- Escribe un programa que imprima los primeros n términos de la secuencia de Fibonacci.*/
    // La secuencia empieza en 0,1 y se tienen que sumar los 2 números anteriores
    public static void fibonacci() {
        int num1 = 0;
        int num2 = 1;
        int cifraFibonacci = 0;
        int contador = 0;
        int cuantosNumeros = UtilsJava.pedirInt("Cuantos numeros quieres ver de la secuencia de fibonacci");
        while (contador < cuantosNumeros) {
            cifraFibonacci = num1 + num2;
            num1 = num2;
            num2 = cifraFibonacci;
            contador++;
        }
        System.out.println(cifraFibonacci);
    }



    /*3.- Desarrolla un programa que encuentre y muestre los números perfectos en un rango
    dado. Descubre los números perfectos aquí:
    https://es.wikipedia.org/wiki/N%C3%BAmero_perfecto */
    /*4.- Haz un juego donde el programa elige un número aleatorio y el usuario debe adivinarlo
    con pistas de "mayor" o "menor".*/
    /* 5.- Escribe un programa que imprima las primeras n filas del triángulo de Pascal. Descubre el
    triángulo de Pascal aquí: https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_de_Pascal
    */



}
