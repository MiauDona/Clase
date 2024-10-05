package miau.dona.utils;

import java.util.Scanner;

public class UtilsJava {
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

    public static double pedirNumerosParaRandom() {
        int min = pedirInt("Vamos a hacer un número aleatorio en un rango entre 2 numeros. Dime el número mínimo");
        int max = pedirInt("Dime el número máximo");

        return Math.random() * (max - min) + min;
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
}
