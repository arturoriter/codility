package com.riter.codility.lesson6;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/triangle/
 */
public class Triangle {

    //Time complexity: O(N*log(N))
    public int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = A.length -1; i >= 2; i--) {
            if (((long) A[i - 1] + A[i - 2]) > A[i]) {
                return 1;
            }
        }
        return 0;
    }
}
