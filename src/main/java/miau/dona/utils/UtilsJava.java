package miau.dona.utils;

import java.util.Scanner;

public class UtilsJava {
    public static int pedirInt(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public static String pedirString(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextLine();
    }
    public static double pedirDouble(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextDouble();
    }
    public static float pedirFloat(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextFloat();
    }

    public static double pedirNumerosParaRandom() {
        Scanner scanner = new Scanner(System.in);

        int min = pedirInt("Dime el número mínimo");
        int max = pedirInt("Dime el número máximo");
        double numRandom = Math.random() * (max - min) + min ;
        return numRandom;
    }

}
