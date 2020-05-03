package com.riter.codility.lesson5;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 */
public class CountDiv {

    //Time Complexity: O(n)
    public int solution1(int A, int B, int K) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }
        return count;
    }

    public int solution(int A, int B, int K) {
        if (K > B) {
            if (A == 0 || B == 0) {
                return 1; //K mod 0 == 0
            }
            return 0;
        }

        int firstDivisor = 0;
        for (int i = Math.max(K, A); i <= B; i++) {
            if (i % K == 0) {
                firstDivisor = i;
                break;
            }
        }

        int lastDivisor = 0;
        for (int i = B; i >= Math.max(K, A); i--) {
            if (i % K == 0) {
                lastDivisor = i;
                break;
            }
        }

        if (firstDivisor != 0 && lastDivisor != 0) {
            int divisors = ((lastDivisor - firstDivisor) / K) + 1;
            if (A == 0) {
                divisors++;//K mod 0 == 0
            }
            return divisors;
        }

        return 0;
    }
}
