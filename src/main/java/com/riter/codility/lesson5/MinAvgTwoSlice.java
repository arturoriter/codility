package com.riter.codility.lesson5;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
 */
public class MinAvgTwoSlice {

    public int solution(int[] A) {
        double minAverage = Double.MAX_VALUE;
        int minAverageIndex = 0;

        for (int i = 0; i < A.length - 2; i++) {
            double avg = (A[i] + A[i + 1]) / 2d;
            if (avg < minAverage) {
                minAverage = avg;
                minAverageIndex = i;
            }

            avg = (A[i] + A[i + 1] + A[i + 2]) / 3d;
            if (avg < minAverage) {
                minAverage = avg;
                minAverageIndex = i;
            }
        }

        double avg = (A[A.length - 1] + A[A.length - 2]) / 2d;
        if (avg < minAverage) {
            minAverageIndex = A.length - 2;
        }

        return minAverageIndex;
    }
}
