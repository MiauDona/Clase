package miau.dona.ejerciciosclase;

import miau.dona.utils.UtilsJava;

import static miau.dona.utils.UtilsJava.RANDOM;

public class BeginnerPlusUno {
    /*
    1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y
    100. Debes conseguir que todos los números pares del array cambien de signo, los positivos
    deben pasar a negativos y viceversa. Debes realizar el ejercicio mediante un méto-do que
    admita el array como argumento y realice la acción pedida. Cabecera del méto-do 'public static
    void cambiaSignoEnValores(int array[])'
     */

    public static void main(String[] args) {
        int[] arrayAzar = new int[150];

        for (int i = 0; i < arrayAzar.length; i++) {
            arrayAzar[i] = RANDOM.nextInt(-100, 101);
        }
        UtilsJava.mostrarArrayInts(arrayAzar);

        for (int i = 0; i < arrayAzar.length; i++) {
            if (arrayAzar[i] == 0) {
                continue;
            }
            if (arrayAzar[i] % 2 == 0) {
                arrayAzar[i] = cambiarNumero(arrayAzar[i]);
            }
        }
        System.out.println("--------\n");
        UtilsJava.mostrarArrayInts(arrayAzar);

    }

    public static int cambiarNumero(int numeroPar) {
        return -numeroPar;
    }
}
