package miau.dona.ejerciciosclase;

import miau.dona.utils.UtilsJava;

import static miau.dona.utils.UtilsJava.RANDOM;

/*
5º.- Realiza un ejercicio igual al anterior, pero en el que el usuario pueda indicar la cantidad de
posiciones que deseamos desplazar. Debes realizar el ejercicio mediante un méto-do que
admita el array como argumento, un número entero indicando el número de posiciones que se
debe desplazar y realice la acción pedida. Cabecera del méto-do 'public static void
desplazaCiclicoDerecha (int a[], int posiciones)'

 */

public class BeginnerPlusCinco {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(101);
        }

        int veces = UtilsJava.pedirInt("Cuantas veces quieres desplazar el array");
        int direccion = UtilsJava.pedirInt("Hacia donde (0 derecha, 1 izquierda)");
        UtilsJava.mostrarArrayInts(array);
        desplazaCiclico(array,veces,direccion);
    }

    public static void desplazaCiclicoDerecha (int[] a, int posiciones) {
        int[] arrayAux = new int[a.length];

        for ( ; posiciones > 0 ; posiciones--){
            arrayAux[0] = a[a.length-1];
            for (int i = 1; i < a.length ; i++) {
                arrayAux[i] = a[i-1];
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = arrayAux[i];
            }

            System.out.println();
            UtilsJava.mostrarArrayInts(arrayAux);
        }
    }

    public static void desplazaCiclicoIzquierda(int[] a, int posiciones) {
        int[] arrayAux = new int[a.length];

        for (; posiciones > 0 ; posiciones--){
            arrayAux[arrayAux.length-1] = a[0];
            for (int i = 0; i < a.length-1 ; i++) {
                arrayAux[i] = a[i+1];
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = arrayAux[i];
            }

            System.out.println();
            UtilsJava.mostrarArrayInts(arrayAux);
        }
    }

    public static void desplazaCiclico(int[] a, int posiciones, int direccion) {
        if (direccion == 0) {
            desplazaCiclicoDerecha(a, posiciones);
        } else if (direccion == 1) {
            desplazaCiclicoIzquierda(a, posiciones);
        } else {
            System.out.println("Direccion no valida");
        }
    }



}
