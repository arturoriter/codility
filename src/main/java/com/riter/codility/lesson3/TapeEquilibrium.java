package com.riter.codility.lesson3;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
public class TapeEquilibrium {

    // Fail in the performance tests
    public int simpleSolution(int[] A) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            int sumPart1 = 0;
            for (int j = 0; j <= i; j++) {
                sumPart1 += A[j];
            }
            int sumPart2 = 0;
            for (int j = A.length - 1; j > i; j--) {
                sumPart2 += A[j];
            }
            min = Math.min(min, Math.abs(sumPart1 - sumPart2));
        }
        return min;
    }

    public int solution(int[] A) {
//        int sumTotal = Arrays.stream(A).sum(); //fails on the performance tests
        int sumTotal = 0;
        for (int value : A) {
            sumTotal += value;
        }

        int minDifference = Integer.MAX_VALUE;
        int sumFirstPart = 0;

        for (int i = 0; i < A.length - 1; i++) {
            sumFirstPart += A[i];
            int sumSecondPart = sumTotal - sumFirstPart;
            int difference = Math.abs(sumFirstPart - sumSecondPart);
            minDifference = Math.min(difference, minDifference);
        }
        return minDifference;
    }
}
