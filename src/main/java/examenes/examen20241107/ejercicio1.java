package examenes.examen20241107;

import miau.dona.utils.UtilsJava;

public class ejercicio1 {
    public static void main(String[] args) {
        // Pide un numero para saber si es perfecto
        int numeroAComprobar = UtilsJava.pedirInt("Dame un numero para saber si es perfecto.");

        // Comprueba si el número introducido es perfecto
        if (esNumeroPerfecto(numeroAComprobar)) {
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }

    // Méto-do para comprobar si un numero es perfecto o no
    public static boolean esNumeroPerfecto(int numeroIntroducido) {
        // Se inicializan los valores que se van a usar
        // La n será un número primo
        int n;
        int formulaPerfecto;

        // Sigue la formula de los numeros perfectos
        // Comprueba si algun primo anterior consigue llegar al numero introducido gracias a la formula
        for (int i = 1; i < numeroIntroducido; i++) {
            // Por comodidad con la formula, se iguala la n con la i
            n = i;

            // Si la n no es prima, no ejecuta el siguiente código
            if (!esNumeroPrimo(n)) {
                continue;
            }

            // Indica la fórmula de los números perfectos
            formulaPerfecto = (int) ((Math.pow(2, n) - 1) * Math.pow(2, n - 1));

            // Si el número introducido sigue la fórmula entonces devuelve true
            if (formulaPerfecto == numeroIntroducido) {
                return true;
            }
        }

        // Si despues de ejecutarse el bucle no ha devuelto true, devuelve false
        return false;
    }


    // Metodo para saber si es primo
    public static boolean esNumeroPrimo(int numPrimo) {
        // Divide el numero introducido entre todos los anteriores
        for (int i = numPrimo - 1; i > 1; i--) {
            // Si el resto es 0, no es primo
            if (numPrimo % i == 0) {
                return false;
            }
        }
        // Devuelve true si no ha devuelto antes false
        return true;
    }
}
