package com.riter.codility.lesson5

import spock.lang.Specification
import spock.lang.Unroll

class PassingCarsSpec extends Specification {

    PassingCars clazz

    def setup() {
        clazz = new PassingCars()
    }

    @Unroll
    def 'The number of passing cars for #cars should result #result'() {
        expect:
        clazz.solution(cars as int[]) == result

        where:
        cars            || result
        [0]             || 0
        [1]             || 0

        [0, 1]          || 1
        [0, 1, 0]       || 1

        [0, 1, 1, 0]    || 2
        [0, 1, 1, 0, 0] || 2
        [0, 1, 1]       || 2

        [0, 1, 1, 1]    || 3
        [0, 1, 1, 0, 1] || 4
        [0, 1, 0, 1, 1] || 5
    }
}
