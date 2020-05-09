package com.riter.codility.lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {

    //Time complexity: O(n log n)
    public int solutionUsingSort(int[] A) {
        Arrays.sort(A);
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                count += 1;
            }
        }
        return count;
    }

    public int solution(int[] A) {
        Set<Integer> mySet = new HashSet<>();
        for (int value : A) {
            mySet.add(value);
        }
        return mySet.size();
    }
}
