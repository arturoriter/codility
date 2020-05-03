package com.riter.codility.lesson2;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int index = (i + K) % A.length;
            result[index] = A[i];
        }
        return result;
    }
}
