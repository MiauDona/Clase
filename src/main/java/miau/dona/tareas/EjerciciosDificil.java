package miau.dona.tareas;

import miau.dona.utils.UtilsJava;

public class EjerciciosDificil {
    public static void main(String[] args) {
        // sumaDigitos();
        // fibonacci();
        // numeroPerfectoRango();
        // frioCaliente();
        trianguloPascal();
    }

    // 1.- Desarrolla un programa que sume los dígitos de un número entero.
    public static void sumaDigitos() {
        int miNumero = UtilsJava.pedirInt("Dame un numero de varios digitos para sumarlos entre si");
        String numeroString = String.valueOf(miNumero);
        int suma = 0;

        for (char i : numeroString.toCharArray()) {
            suma = Integer.parseInt(String.valueOf(i)) + suma;
        }

        System.out.println(suma);
    }

    // 2.- Escribe un programa que imprima los primeros n términos de la secuencia de Fibonacci.
    // La secuencia empieza en 0,1 y se tienen que sumar los 2 números anteriores
    public static void fibonacci() {
        int num1 = 0;
        int num2 = 1;

        System.out.println(num1 + "\n" + num2);

        int cifraFibonacci;
        int cuantosNumeros = UtilsJava.pedirInt("Cuantos numeros quieres ver de la secuencia de fibonacci");

        while (cuantosNumeros > 0) {
            cifraFibonacci = num1 + num2;
            num1 = num2;
            num2 = cifraFibonacci;
            cuantosNumeros--;
            System.out.println(cifraFibonacci);
        }
    }

    /*3.- Desarrolla un programa que encuentre y muestre los números perfectos en un rango
    dado. Descubre los números perfectos aquí:
    https://es.wikipedia.org/wiki/N%C3%BAmero_perfecto */

    public static void numeroPerfectoRango() {
        int max, min;
        min = UtilsJava.pedirInt("Dime un numero minimo");
        max = UtilsJava.pedirInt("Dime un numero maximo");

        for (int i = min; i <= max; i++) { // i es la "n" de la formula del numero perfecto (NumPrimo)
            if (i == 1) {
                continue;
            }
            if (esNumeroPerfecto(i)) {
                System.out.println("El numero de perfecto es: " + i);
            }
        }
    }

    public static boolean esNumeroPerfecto(int numeroIntroducido) {
        int n;
        int formulaPerfecto;

        for (int i = 1; i < numeroIntroducido; i++) {
            n = i;
            formulaPerfecto = (int) ((Math.pow(2, n) - 1) * Math.pow(2, n - 1));

            if (formulaPerfecto == numeroIntroducido) {
                System.out.println("Es un numero perfecto. NumAcomprobar " + numeroIntroducido + " resultadoFormula " + formulaPerfecto);
                return true;
            }
        }

        return false;
    }

    /*4.- Haz un juego donde el programa elige un número aleatorio y el usuario debe adivinarlo
    con pistas de "mayor" o "menor".*/
    public static void frioCaliente() {
        int miRandom = UtilsJava.RANDOM.nextInt(11);
        boolean adivinado = false;

        while (!adivinado) {
            int numUser = UtilsJava.pedirInt("Dime un numero");
            if (numUser == miRandom) {
                adivinado = true;
            } else if (numUser > miRandom) {
                System.out.println("Tu num es mu grande");
            } else {
                System.out.println("Tu num es mu xico");
            }
        }
    }

    /* 5.- Escribe un programa que imprima las primeras n filas del triángulo de Pascal. Descubre el
    triángulo de Pascal aquí: https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_de_Pascal
    */
    public static void trianguloPascal() {
        int numFilas = UtilsJava.pedirInt("Dime un numero de filas");
        // Factorial.factorial();
        System.out.println(1);
        System.out.println("1 1");

        for (int i = 0; i < numFilas; i++) {
            for (int j = i+1 ; j < numFilas; j++) {
                System.out.print(i + j + i);
            }
            System.out.println();



        }
    }

}
