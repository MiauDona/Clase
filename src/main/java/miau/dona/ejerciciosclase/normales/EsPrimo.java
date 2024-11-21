package miau.dona.ejerciciosclase.normales;

public class EsPrimo {
    public static void main(String[] args) {
        esNumeroPrimo(2);
    }

    public static boolean esNumeroPrimo(int numPrimo) {
        for (int i = numPrimo - 1; i > 1; i--) {
            if (numPrimo % i == 0) {
                System.out.println(numPrimo + " No es primo");
                return false;
            }
        }

        return true;
    }
}
