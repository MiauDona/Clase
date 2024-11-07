package examenes.examen20241107;

import jdk.jshell.execution.Util;
import miau.dona.utils.UtilsJava;

public class ejercicio3 {
    public static void main(String[] args) {


        int[] miArray = UtilsJava.crearArrayIntsAleatoriosEntreNumeros(10, 1, 30);
        UtilsJava.mostrarArrayInts(miArray);
        System.out.println();

        int numeroUsuario = UtilsJava.pedirInt("Dame un numero no mas grande de la suma de 2 de ellos");
        String resultado = numerosParaSuma(miArray, numeroUsuario);
        System.out.println(resultado);
    }

    public static String numerosParaSuma(int[] miArray, int numeroUsuario) {
        for (int i = 0; i < miArray.length ; i++) {
            for (int j = 0; j < miArray.length; j++) {
                if (miArray[i] +  miArray[j]== numeroUsuario && miArray[i] != miArray[j]) {
                    return miArray[i] + " + " + miArray[j] + " son los numeros que debes sumar para obtener tu numero";
                }
            }
        }
        return "No hay 2 numeros que tengan de suma tu numero";
    }
}
