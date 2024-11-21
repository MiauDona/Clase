package examenes.examen20241107;

import miau.dona.utils.UtilsJava;

public class ejercicio4 {
    public static void main(String[] args) {
        int maxAleatorio = 30;

        // Se declara un  de 50 valores con numeros aleatorios del 1 al 30 y lo muestra
        int[] miArray = UtilsJava.crearArrayIntsAleatoriosEntreNumeros(50, 1, maxAleatorio);
        UtilsJava.mostrarArrayInts(miArray);
        System.out.println();

        // Se guarda un array con las veces que se ha encontrado un numero
        int[] vecesEncontrado = new int[miArray.length];

        // Se recorre to-do el array desde el primer valor buscando cada valor
        for (int i = 0; i < miArray.length ; i++) {

            // Se busca numero y se guarda en el array
            vecesEncontrado[i] = contarNumeros(miArray[i], miArray);
        }

        // Comprueba cual es el mayor de todos los que ha contado y lo muestra
        int mayor = 1;
        for (int i = 0; i < vecesEncontrado.length; i++) {
            if (mayor < vecesEncontrado[i]) {
                mayor = vecesEncontrado[i];
                System.out.println(miArray[i] + " se repite " + vecesEncontrado[i] + " veces");
            }
        }
    }

    // Metodo para contar cuantas veces sale un numero dentro de un array
    public static int contarNumeros(int numero, int[] array) {
        int contador = 0;

        // Recorre el array entero y si encuentra el numero introducido añade 1 al contador
        for (int i = 0; i < array.length ; i++) {
            if (numero == array[i]) {
                contador++;
            }
        }
        return contador;
    }
}
