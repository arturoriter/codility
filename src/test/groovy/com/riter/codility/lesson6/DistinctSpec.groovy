package com.riter.codility.lesson6


import spock.lang.Specification
import spock.lang.Unroll

/**
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 */
class DistinctSpec extends Specification {

    Distinct clazz

    def setup() {
        clazz = new Distinct()
    }

    @Unroll
    def 'The number of distinct values of the array #array should result #result'() {
        expect:
        clazz.solution(array as int[]) == result

        where:
        array                          || result
        [2, 1, 1, 2, 3, 1]             || 3
        [2, 5, 3, 7, 5, 1, 3, 7, 7, 9] || 6
    }
}
