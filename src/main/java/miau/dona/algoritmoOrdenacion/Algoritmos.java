package miau.dona.algoritmoOrdenacion;

import miau.dona.utils.UtilsJava;

public class Algoritmos {

    // Lleva el numero mayor al final
    public static void main(String[] args) {
        int[] array = UtilsJava.crearArrayIntsAleatoriosEntreNumeros(150,0,1000);
        UtilsJava.mostrarArrayInts(array);

        int[] arrayBubble = bubbleSort(array);
        UtilsJava.mostrarArrayInts(arrayBubble);

        int[] arrayInsertion = insertionSort(array);
        UtilsJava.mostrarArrayInts(arrayInsertion);

        int[] arrayShell = shellSort(array);
        UtilsJava.mostrarArrayInts(arrayShell);
    }

    public static int[] bubbleSort(int[] array) {
        int cambio;
        int[] arrayBubble = new int[array.length];
        System.arraycopy(array, 0, arrayBubble, 0, array.length);

        System.out.println("\n--Bubble-------------------------------------------------------------------------------------");
        // La i en este caso es el numero de numeros grandes ordenados al final
        for (int i = 0; i < arrayBubble.length; i++) {
            for (int j = 0; j < arrayBubble.length-1-i; j++) {
                if (arrayBubble[j] > arrayBubble[j+1]) {
                    cambio = arrayBubble[j+1];
                    arrayBubble[j+1] = arrayBubble[j];
                    arrayBubble[j] = cambio;
                }
            }
        }

        return arrayBubble;
    }

    public static int[] insertionSort(int[] array) {
        int cambio;
        int[] arrayInsertion = new int[array.length];
        System.arraycopy(array, 0, arrayInsertion, 0, array.length);

        System.out.println("\n--Insertion-------------------------------------------------------------------------------------");
        for (int i = 1; i < arrayInsertion.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayInsertion[j] < arrayInsertion[j-1] ) {
                    cambio = arrayInsertion[j-1];
                    arrayInsertion[j-1] = arrayInsertion[j];
                    arrayInsertion[j] = cambio;
                }
            }
        }

        return arrayInsertion;
    }
    /*
        Se mira el tamaño del array
        Se divide entre 2 y se guarda en una variable ese numero
        Se compara el 0 con el medio y el medio con el ultimo
        Se divide entre 2 el numero y se comparan en esa distancia
        (1, 6, 9, 2, 5, 3) -> distancia es 2, se comparan (1,9) (6,2) (9,5) (2,3)
        se vuelve a dividir la distancia tantas veces hasta que la distancia sea 1
         */
    public static int[] shellSort(int[] array) {
        int[] arrayShell = new int[array.length];
        System.arraycopy(array, 0, arrayShell, 0, array.length);

        System.out.println("\n--Shell-------------------------------------------------------------------------------------");

        int salto = arrayShell.length / 2;
        int cambio;
        for (int i = salto; i > 0; i /= 2) {
            for (int j = 0; j < arrayShell.length-1; j++) {
                if (j + i == arrayShell.length) {
                    break;
                }
                if (arrayShell[j] > arrayShell[j+i]) {
                    cambio = arrayShell[j+i];
                    arrayShell[j+i] = arrayShell[j];
                    arrayShell[j] = cambio;
                }
            }
        }





        return arrayShell;
    }
}


