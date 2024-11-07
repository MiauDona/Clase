package examenes.examen20241107;

import miau.dona.utils.UtilsJava;

public class ejercicio2 {
    public static void main(String[] args) {

        // Inicializa un array de 100 numeros, que cada valor puede estar entre 0 y 100, y lo muestra
        int[] arrayAleatorio = UtilsJava.crearArrayIntsAleatoriosEntreNumeros(100, 0, 100);
        UtilsJava.mostrarArrayInts(arrayAleatorio);

        // Recorre el array comprobando
        int contadorPrimos = 0;
        for (int i = 0; i < arrayAleatorio.length; i++) {

            // Si el numero que esta comprobando es primo entonces lo muestra y lo suma
            if (UtilsJava.esNumeroPrimo(arrayAleatorio[i])) {
                System.out.println("El " + arrayAleatorio[i] + " es primo");
                contadorPrimos++;
            }
        }

        // Muestra el numero de primos que hay
        // FIXME el primer numero primo NO LO MUESTRA pero lo cuenta
        System.out.println("Hay " + contadorPrimos + " numeros primos");
    }

}
