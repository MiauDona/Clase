package miau.dona;
import miau.dona.utils.*;

import java.util.Scanner;

public class pruebaclase {
    public static void main(String[] args) {
        /* 1º.- Realiza un programa que pida al usuario cuatro números enteros, y calcule la suma solo
de aquellos números introducidos por el usuario, que sean mayores de 10. Es decir, que si el
usuario introduce el 5, el 15, el 6 y el 25, el programa debe calcular la suma solo de 15 más
25, ya que 5 y 6 son menores de 10.
*/
        Scanner scanner = new Scanner(System.in);
        int numSuma = 0;
        int numeroPedido;
        for (int i = 0; i < 4; i++) {
            numeroPedido = scanner.nextInt();
            if (numeroPedido > 10){
                numSuma = numSuma + numeroPedido;
            }
        }
        System.out.println("numero " + numSuma);


    }
}
