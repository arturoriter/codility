package com.riter.codility.lesson3;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
public class PermMissingElem {

    public int solution(int[] A) {
        Set<Integer> mySet = new HashSet<>();
        for (int value : A) {
            mySet.add(value);
        }

        //missing element could be the last one, that's why we need to go one more number
        int max = A.length + 1;
        for (int i = 1; i < max + 1; i++) {
            if (!mySet.contains(i)) {
                return i;
            }
        }
        throw new RuntimeException("Could not find missing element");
    }
}
