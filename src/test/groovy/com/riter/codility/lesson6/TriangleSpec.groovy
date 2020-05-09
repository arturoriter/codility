package com.riter.codility.lesson6


import spock.lang.Specification
import spock.lang.Unroll

/**
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 */
class TriangleSpec extends Specification {

    Triangle clazz

    def setup() {
        clazz = new Triangle()
    }

    @Unroll
    def 'The number of distinct values of the array #array should result #result'() {
        expect:
        clazz.solution(array as int[]) == result

        where:
        array                                                             || result
        [10]                                                              || 0
        [10, 10]                                                          || 0
        [10, 10, 10, 10]                                                  || 1
        [10, 2, 5, 1, 8, 20]                                              || 1//1, 2, 5, 8, 10, 20
        [10, 50, 5, 1]                                                    || 0//1, 5, 10, 50
        [Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE]         || 1
        [Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1] || 1
    }
}
