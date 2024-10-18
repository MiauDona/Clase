package miau.dona.leetcode;

import jdk.jshell.execution.Util;
import miau.dona.utils.UtilsJava;

public class RegularExpresionMatching {
    public static void main(String[] args) {
        String miString = "cdffdsb";
        String miPatron = "c*a*b";
        System.out.println(isMatch(miString, miPatron));
    }

    // TODO: Si mi patron tiene letras distintas pero coincide de todas formas deberia de devolver true
    // Por ejemplo c*a*b es true.

    public static boolean isMatch(String s, String p) {
        boolean coincide = false;
        boolean[] pBooleans = new boolean[p.length()] ;

        char[] pArray = p.toCharArray();
        char[] sArray = s.toCharArray();

        // Recorrer pArray
        // Si el pArray no tiene *, conserva el orden
        int contador = contarAsteriscos(pArray);

        // Si el pArray tiene *, seguir el orden hasta *, despues de eso, debe de contener el siguiente patron
        // Si tiene varios, debe de contener el patron entre los *, y si acaba con letra, la ultima letra debe de ser la letra

        if (contador > 0) {
            int[] listaIndiceAsteriscos = new int[contador];
            int posicionAsteriscos=0;

            int[] listaIndiceLetras = new int[pArray.length-contador];
            int posicionLetras=0;

            for (int i = 0; i < pArray.length; i++) {
                // Devuelve las posiciones donde hay un *
                if (pArray[i] == '*') {
                    listaIndiceAsteriscos[posicionAsteriscos] = i;
                    posicionAsteriscos++;
                } else {
                    listaIndiceLetras[posicionLetras] = i;
                    posicionLetras++;
                }
            }
            System.out.println("Lista indice asteriscos");
            UtilsJava.mostrarArrayInts(listaIndiceAsteriscos);
            System.out.println();
            System.out.println("Lista indice letras");
            UtilsJava.mostrarArrayInts(listaIndiceLetras);
            System.out.println();

            for (int i = 0; i < listaIndiceAsteriscos.length; i++) {
                for (int j = 0; j < listaIndiceAsteriscos[i]; j++) {
                    if (listaIndiceAsteriscos[i] == '*') {
                        break;
                    } else {
                        for (int k = 0; k < sArray.length; k++) {

                        }
                    }
                }
            }

        }

        return true;
    }

    public static int contarAsteriscos(char[] patron) {
        int contador=0;

        for (int i = 0; i < patron.length; i++) {
            contador = patron[i] == '*' ? contador+1 : contador;
        }
        return contador;
    }
    public static boolean comprobarArrayBooleanTrue(boolean[] booleans) {
        for (boolean b : booleans) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba si la letra entre el patron y la string son iguales
     * @param patternChar pArray[i]
     * @param stringChar sArray[i]
     * @return Devuelve un boolean dependiendo de si son iguales o no
     */
    public static boolean comprobarSiLetraEsIgual(char patternChar, char stringChar) {
            if (patternChar == stringChar ||patternChar == '*' || patternChar == '.') {
                return true;
            } else {
                return false;
            }
    }


    /*
    Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
    '.' Matches any single character.​​​​
    '*' Matches zero or more of the preceding element.
    The matching should cover the entire input string (not partial).

    Example 1:
    Input: s = "aa", p = "a"
    Output: false
    Explanation: "a" does not match the entire string "aa".

    Example 2:
    Input: s = "aa", p = "a*"
    Output: true
    Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

    Example 3:
    Input: s = "ab", p = ".*"
    Output: true
    Explanation: ".*" means "zero or more (*) of any character (.)".
    */
}
