package miau.dona.leetcode;

import miau.dona.utils.UtilsJava;

import java.util.Arrays;

public class RegularExpresionMatching {
    public static void main(String[] args) {
        String miString = "aaaaaaa";
        String miPatron = "aaaaaaa";
        System.out.println(isMatch(miString, miPatron));

        // TODO Falta hacer que cuando miString sea mayor que miPatron pero miPatron tenga * al final, sea todo lo anterior true
    }

    public static boolean isMatch(String s, String p) {

        boolean[] booleans = new boolean[p.length()];
        char[] pArray = p.toCharArray();
        char[] sArray = s.toCharArray();


        // TODO: Falta hacer que si una letra de pArray es distinta de sArray que sea false
        if (pArray[pArray.length-1] == '*' && sArray.length >= pArray.length) {
            for (int i = 0; i < pArray.length-1; i++) {
                if (pArray[i] != sArray[i]) {
                    System.out.println("***");
                    return false;
                }
            }
        }

        if (pArray.length == sArray.length) {
            for (int i = 0; i < pArray.length; i++) {
                if (pArray[i] == sArray[i] || pArray[i] == '.' || pArray[i] == '*') {
                    booleans[i] = true;
                } else {
                    booleans[i] = false;
                }
            }
            for (boolean b : booleans) {
                if (b) {
                    return true;
                }
            }
            UtilsJava.mostrarArrayBooleans(booleans);
        }
        return false;
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
