package miau.dona.ejerciciosclase.normales;
import miau.dona.utils.*;

/*1º.- Realiza un ejercicio que pida números al usuario. El programa debe detenerse cuando el
usuario introduzca el número 0 (cero), que no debe tenerse en cuenta para ninguna
operación aritmética, simplemente para salir de la aplicación. Cuando el programa haya
terminado, se debe sacar en pantalla el valor de la suma y de la media de todos los
números.*/
public class EjercicioDificilFor {
    public static void main(String[] args) {
    int numero;
    int suma = 0;
    int veces = 0;
    do {
        numero = UtilsJava.pedirInt("Dame un int");
        suma = suma + numero;
        veces++;
    } while (numero != 0);
    veces--;
        System.out.println("Suma: " + suma + " Media: " + (suma / veces) + " Veces " + veces );
    }
}
