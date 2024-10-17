package miau.dona.algoritmoOrdenacion;

import jdk.jshell.execution.Util;
import miau.dona.utils.UtilsJava;

public class BubbleSort {

    // Lleva el numero mayor al final
    public static void main(String[] args) {
        int[] array = UtilsJava.crearArrayIntsAleatoriosEntreNumeros(150,0,1000);

        UtilsJava.mostrarArrayInts(array);
        int cambio;
        for (int i = 0; i < array.length; i++) {
            System.out.println("---------------------------" + i + "-----------------------------");
            UtilsJava.mostrarArrayInts(array);

            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    cambio = array[j+1];
                    array[j+1] = array[j];
                    array[j] = cambio;
                }
            }
        }
        System.out.println();
        UtilsJava.mostrarArrayInts(array);
    }
}
