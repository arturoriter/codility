package com.riter.codility.lesson2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 */
public class OddOccurrencesInArray {

    // bad performance
    public int solutionStream(int[] A) {
        return Arrays.stream(A).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);
    }

    public int solution(int[] A) {
        //stream fails on the performance tests
//        Map<Integer, Long> map = Arrays.stream(A).boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) return entry.getKey();
        }
        throw new RuntimeException("Could not find element that was left unpaired.");
    }
}
