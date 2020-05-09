package com.riter.codility.lesson6


import spock.lang.Specification
import spock.lang.Unroll

class MaxProductOfThreeSpec extends Specification {

    MaxProductOfThree clazz

    def setup() {
        clazz = new MaxProductOfThree()
    }

    @Unroll
    def 'The max product of three of the array #array should result #result'() {
        expect:
        clazz.solution(array as int[]) == result

        where:
        array                    || result
        [1, 2, 3, 4, 5]          || 60
        [-3, -2, -1, 0, 1, 2, 3] || 18
        [-3, 1, 2, 3]            || 6
        [-3, -3, 3, 4]           || 36
        [-2, -3, 3, 4]           || 24
    }
}
