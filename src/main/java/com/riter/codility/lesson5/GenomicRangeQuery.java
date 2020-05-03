package com.riter.codility.lesson5;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 */
public class GenomicRangeQuery {

    // time complexity: O(N * M)
    // fails in performance tests
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            String substring = S.substring(P[i], Q[i] + 1);
            int factor = 4;
            if (substring.contains("A")) {
                factor = 1;
            } else if (substring.contains("C")) {
                factor = 2;
            } else if (substring.contains("G")) {
                factor = 3;
            }
            result[i] = factor;
        }
        return result;
    }
}
