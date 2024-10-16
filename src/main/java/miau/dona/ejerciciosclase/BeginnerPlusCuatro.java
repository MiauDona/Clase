package miau.dona.ejerciciosclase;

import jdk.jshell.execution.Util;
import miau.dona.utils.UtilsJava;

import static miau.dona.utils.UtilsJava.RANDOM;

public class BeginnerPlusCuatro {
    /*
    4º.- Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100.
Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el
desplazamiento sea circular, si un número sale por la derecha volverá a entrar por la izquierda.
Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3. Debes realizar el ejercicio
mediante un méto-do que admita el array como argumento y realice la acción pedida. Cabecera
del méto-do 'public static void desplazaCiclicoDerecha (int a[])'.
     */

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(101);
        }

        UtilsJava.mostrarArrayInts(array);
        desplazaCiclicoDerecha(array);
    }

    public static void desplazaCiclicoDerecha (int a[]) {
        int[] arrayAux = new int[a.length];
        arrayAux[0] = a[a.length-1];

        for (int i = 1; i < a.length ; i++) {
            arrayAux[i] = a[i-1];
        }
        System.out.println();
        UtilsJava.mostrarArrayInts(arrayAux);
    }
}
