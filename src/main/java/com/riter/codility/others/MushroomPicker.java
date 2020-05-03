package com.riter.codility.others;

public class MushroomPicker {

    private static int[] countingPrefixSums(int[] A) {
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        return prefix;
    }

    // Time: O(M + N)
    // Space: O(N)
    public static int solution(int[] A, int k, int m) {
        int[] prefix = countingPrefixSums(A);

        int max = 0;
        for (int i = 0; i < Math.min(k, m); i++) {
            int first = k - i;
            int last = Math.max(k, Math.min(k + (m - i * 2), A.length - 1));
            max = Math.max(max, first > 0 ? prefix[last] - prefix[first - 1] : prefix[last]);
        }

        return max;
    }
}
