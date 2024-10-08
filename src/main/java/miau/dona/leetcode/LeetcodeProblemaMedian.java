package miau.dona.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class LeetcodeProblemaMedian {
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 8, 3,1, 2,3,4,5};
        int[] nums2 = {2, 3, 5,6,4,2,4,8,78,6};

        double num = findMedianSortedArrays(nums1, nums2);
        System.out.println(num);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] numeros = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, numeros, 0, nums1.length);
        System.arraycopy(nums2, 0, numeros, nums1.length, nums2.length);

        Arrays.sort(numeros);

        return numeros.length % 2 == 1 ? numeros[numeros.length / 2] : (double) (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) /2;
    }


}
