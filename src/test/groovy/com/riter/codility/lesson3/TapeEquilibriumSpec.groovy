package com.riter.codility.lesson3

import spock.lang.Specification
import spock.lang.Unroll

class TapeEquilibriumSpec extends Specification {

    TapeEquilibrium clazz

    def setup() {
        clazz = new TapeEquilibrium()
    }

    @Unroll
    def 'The minimize value #A should result #result'() {
        expect:
        clazz.solution(A as int[]) == result

        where:
        A               || result
        [1, 1]          || 0
        [10, 20]        || 10
        [3, 1, 2, 4, 3] || 1
    }
}
