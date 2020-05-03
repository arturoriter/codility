package com.riter.codility.lesson4

import spock.lang.Specification
import spock.lang.Unroll

class MissingIntegerSpec extends Specification {

    MissingInteger clazz

    def setup() {
        clazz = new MissingInteger()
    }

    @Unroll
    def 'Find the smallest positive integer that does not occur in #A should result #result'() {
        expect:
        clazz.solution(A as int[]) == result

        where:
        A                               || result
        [1, 3, 6, 4, 1, 2]              || 5
        [1, 3, 6, 4, 1, 2, 5]           || 7
        [1, 2, 3]                       || 4
        [-1, -3]                        || 1
        [-1, -3, 2]                     || 1
        [-1, -3, 1]                     || 2
        [0]                             || 1
        [-1000000]                      || 1
        [-1000000, 1]                   || 2
        [999999, 999998, 1000000]       || 1
        [1, 3, 999999, 999998, 1000000] || 2
    }
}
