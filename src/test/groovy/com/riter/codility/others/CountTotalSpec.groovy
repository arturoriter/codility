package com.riter.codility.others

import spock.lang.Specification
import spock.lang.Unroll

class CountTotalSpec extends Specification {

    CountTotal clazz

    def setup() {
        clazz = new CountTotal()
    }

    @Unroll
    def 'The sum of all elements of #N should result #result'() {
        expect:
        clazz.sumQuadraticTime(N) == result
        clazz.sumLinearTime(N) == result
        clazz.sumConstantTime(N) == result

        where:
        N || result
        4 || 10
    }
}
