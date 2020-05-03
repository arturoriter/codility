package com.riter.codility.lesson1

import spock.lang.Specification
import spock.lang.Unroll

class BinaryGapSpec extends Specification {
    BinaryGap clazz

    def setup() {
        clazz = new BinaryGap()
    }

    @Unroll
    def 'The longest sequence of zeros in binary representation of the integer #n should result #result'() {
        expect:
        clazz.solution(n) == result

        where:
        n    || result
        2    || 0
        3    || 0
        4    || 0
        5    || 1
        1041 || 5
    }
}
