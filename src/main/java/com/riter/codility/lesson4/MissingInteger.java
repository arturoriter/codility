package com.riter.codility.lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */
public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> calculated = new HashSet<>();
        List<Integer> numbers = new ArrayList<>();
        int i = 1;
        for (int value : A) {
            if (value > 0) {
                numbers.add(i++);
                calculated.add(value);
            }
        }

        for (int n : numbers) {
            if (!calculated.contains(n)) {
                return n;
            }
        }

        return calculated.size() == numbers.size() ? calculated.size() + 1 : 1;
    }
}
