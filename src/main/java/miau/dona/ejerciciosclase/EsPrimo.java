package miau.dona.ejerciciosclase;

import miau.dona.utils.UtilsJava;

public class EsPrimo {
    public static void main(String[] args) {
        numeroPrimo();
    }

    public static void numeroPrimo() {
        int numPrimo = UtilsJava.pedirInt("Dame un numero y comprobamos si es primo");
        boolean esPrimo = true;
        /*for (int i = numPrimo - 1; i > 1; i--) {
            if (numPrimo % i == 0) {
                System.out.println(numPrimo + " No es primo");
                esPrimo = false;
                break;
            }
        }*/




        if (esPrimo) {
            System.out.println("Es primo");
        }

    }
}
