package com.riter.codility.others;

public class CountTotal {

    //time complexity O(n2).
    public int sumQuadraticTime(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result += 1;
            }
        }
        return result;
    }

    //time complexity O(n).
    public int sumLinearTime(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    //time complexity O(1).
    public int sumConstantTime(int n) {
        return n * (n + 1) / 2;
    }
}
