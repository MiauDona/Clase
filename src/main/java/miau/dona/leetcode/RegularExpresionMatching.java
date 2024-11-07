package miau.dona.leetcode;

import jdk.jshell.execution.Util;
import miau.dona.utils.UtilsJava;

public class RegularExpresionMatching {
    public static void main(String[] args) {
        String miString = "cdffdsb";
        String miPatron = "c*a*b";
        System.out.println(isMatch(miString, miPatron));
    }



    public static boolean isMatch(String s, String p) {
        // Si el anterior es una letra, tener coincidencia exacta y si la hay guardar donde esta y continuar a leer desde ahi
        // Si el anterior es un asterisco continuar hasta la siguiente letra

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
