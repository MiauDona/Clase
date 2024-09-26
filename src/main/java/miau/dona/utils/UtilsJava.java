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

}
