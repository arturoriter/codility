package com.riter.codility.lesson6;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 */
public class MaxProductOfThree {

    //Time complexity: O(N * log(N))
    public int solution(int[] A) {
        Arrays.sort(A);

        int first3 = A[0] * A[1] * A[2];
        int last3 = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        int first2AndLast = A[0] * A[1] * A[A.length - 1];
        int firstAnd2Last = A[0] * A[A.length - 2] * A[A.length - 1];

        return Math.max(Math.max(first3, last3), Math.max(first2AndLast, firstAnd2Last));
    }
}