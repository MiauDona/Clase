package miau.dona;

import miau.dona.utils.UtilsJava;
import java.util.Random;

public class Apuntes {
    public static void main(String[] args) {
        // arrays();
    }

    public static void random() {
        int miRandom = UtilsJava.RANDOM.nextInt(2, 3);
        // System.out.println(miRandom);

        int mivariable = 11;
        System.out.println("Mivariable " + mivariable);
    }

    public static void arrays() {
        String array = "miau.dona.arrays";
        System.out.println(array);

        for (char c : array.toCharArray()) {
            System.out.println(c);
        }

        int tamano = 10;
        int[] intArray = new int[tamano];

        int[] intArray2 = {1, 2, 3, 4, 5};

        int[][] matriz = new int[tamano][tamano];

        // Para meter un valor en un sitio de la matriz
        matriz[0][0] = 1;

        int valor = 10;
        matriz[0][1] = valor;
        System.out.println(matriz[0][1]);
        matriz[0][1] = 2;
        System.out.println(matriz[0][1]);
    }
}
