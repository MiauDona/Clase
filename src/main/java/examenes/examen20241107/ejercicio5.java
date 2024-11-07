package examenes.examen20241107;

import miau.dona.utils.UtilsJava;

import java.util.concurrent.TimeUnit;

public class ejercicio5 {
    public static void main(String[] args) {
        String micadena = UtilsJava.pedir("Dame una cadena para comprimir");

        // Comprime la cadena
        comprimirCadena(micadena);
    }

    // Metodo para comprimir la cadena
    public static void comprimirCadena(String cadena) {

        // Convertir a un array de char la cadena para tratar sus letras una a una
        char[] cadenaArray = cadena.toCharArray();

        // Inicializar un contador para las veces que sale una letra
        int contador = 1;

        for (int i = 0; i < cadena.length(); i++) {

            // Si el indice es el ultimo, no comprobar mas
            if (i == cadenaArray.length-1) {
                System.out.print(String.valueOf(cadenaArray[i]) + String.valueOf(contador));
                break;
            }

            // Si el caracter que comprueba es igual al siguiente sumar uno al contador
            if (cadenaArray[i] == cadenaArray[i+1]) {
                contador++;
            // Si no es igual, mostrar en pantalla la letra junto a las veces que sale
            } else {
                System.out.print(String.valueOf(cadenaArray[i]) + String.valueOf(contador));
                contador = 1;
            }


            // Para el ultimo caracter que no entra en el else, mostrar en pantalla la letra junto a las veces que sale




        }

    }
}
