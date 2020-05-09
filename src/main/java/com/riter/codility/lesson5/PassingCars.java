package com.riter.codility.lesson5;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 */
public class PassingCars {

    public int simpleSolution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                for (int j = i; j < A.length; j++) {
                    if (A[j] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //time complexity: O(N)
    public int solution(int[] A) {
        int cars = 0;
        int carPasses = 0;

        for (int value : A) {
            if (value == 0) {
                cars++;
            } else {
                carPasses += cars;
                if (carPasses > 1000000000) {
                    return -1;
                }
            }
        }
        return carPasses;
    }
}
