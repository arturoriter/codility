package com.riter.codility.lesson4;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 */
public class MaxCounters {

    //TIMEOUT ERROR
    public int[] solutionSimple(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        for (int value : A) {
            if (value > N) {
                Arrays.fill(counters, max);
            } else {
                max = Math.max(max, ++counters[value - 1]);
            }
        }
        return counters;
    }

    //O(N + M)
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int allCounters = 0;
        for (int value : A) {
            if (value > N) {
                allCounters = max;
            } else {
                counters[value - 1] = Math.max(allCounters, counters[value - 1]) + 1;
                max = Math.max(max, counters[value - 1]);
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < allCounters) {
                counters[i] = allCounters;
            }
        }
        return counters;
    }
}
