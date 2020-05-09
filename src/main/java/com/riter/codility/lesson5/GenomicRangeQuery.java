package com.riter.codility.lesson5;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 */
public class GenomicRangeQuery {

    // time complexity: O(N * M)
    // Fail in the performance tests
    public int[] simpleSolution(String S, int[] P, int[] Q) {
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

    public int[] solution(String S, int[] P, int[] Q) {
        int[][] aux = countOccurrences(S);

        addOccurrencesFromPreviousRow(S, aux);

        return calculateResultCheckEachSlice(P, Q, aux);
    }

    private static int[][] countOccurrences(String S) {
        int[][] aux = new int[S.length()][4];

        for (int i = 0; i < aux.length; i++) {
            if (S.charAt(i) == 'A') {
                aux[i][0] = 1;
            } else if (S.charAt(i) == 'C') {
                aux[i][1] = 1;
            } else if (S.charAt(i) == 'G') {
                aux[i][2] = 1;
            } else if (S.charAt(i) == 'T') {
                aux[i][3] = 1;
            }
        }

        return aux;
    }

    private static void addOccurrencesFromPreviousRow(String S, int[][] aux) {
        for (int i = 1; i < S.length(); i++) {
            for (int j = 0; j < 4; j++) {
                aux[i][j] += aux[i - 1][j];
            }
        }
    }

    private static int[] calculateResultCheckEachSlice(int[] P, int[] Q, int[][] aux) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < 4; j++) {
                int lowerIndexCount = 0;
                if (P[i] - 1 >= 0) {
                    lowerIndexCount = aux[P[i] - 1][j];
                }

                if (aux[Q[i]][j] - lowerIndexCount > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }
        return result;
    }
}
