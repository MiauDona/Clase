package miau.dona.utils;

import java.util.Random;
import java.util.Scanner;

public class UtilsJava {
    // Crea un random
    public static final Random RANDOM = new Random();

    public static String pedir(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static int pedirInt(String mensaje) {
        return Integer.parseInt(pedir(mensaje));
    }

    public static double pedirDouble(String mensaje) {
        return Double.parseDouble(pedir(mensaje));
    }

    public static float pedirFloat(String mensaje) {
        return Float.parseFloat(pedir(mensaje));
    }

    public static int pedirNumerosParaRandom() {
        int min = pedirInt("Vamos a hacer un número aleatorio en un rango entre 2 numeros. Dime el número mínimo");
        int max = pedirInt("Dime el número máximo");

        // return Math.random() * (max - min) + min;
        return RANDOM.nextInt(min, max + 1);
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

    public static void mostrarArrayInts(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
    }

    public static void mostrarArrayStrings(String[] array) {
        for (String valor : array) {
            System.out.print(valor + " ");
        }
    }

    public static void mostrarArrayBooleans(boolean[] array) {
        for (boolean valor : array) {
            System.out.print(valor + " ");
        }
    }

    public static void mostrarArrayCharDeString(String string) {
        for (char valor : string.toCharArray()) {
            System.out.print(valor + " ");
        }
    }
}
