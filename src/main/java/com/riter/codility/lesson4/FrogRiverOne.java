package com.riter.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
