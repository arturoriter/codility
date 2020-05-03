package com.riter.codility.lesson4;

import java.util.*;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
 */
public class PermCheck {

    //Failed in the performance tests
    public int solutionFirstAttempt(int[] A) {
        TreeSet<Integer> mySet = new TreeSet<>();
        for (int elem : A) {
            mySet.add(elem);
        }

        return mySet.last() == A.length && mySet.size() == A.length ? 1 : 0;
    }

    public int solution(int[] A) {
        Set<Integer> calculatedSet = new HashSet<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            calculatedSet.add(A[i]);
            numbers.add(i + 1);
        }
        return calculatedSet.containsAll(numbers) ? 1 : 0;
    }
}
