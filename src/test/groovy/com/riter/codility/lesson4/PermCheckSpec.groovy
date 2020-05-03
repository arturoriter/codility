package com.riter.codility.lesson4

import spock.lang.Specification
import spock.lang.Unroll

class PermCheckSpec extends Specification {

    PermCheck clazz

    def setup() {
        clazz = new PermCheck()
    }

    @Unroll
    def 'Check whether array #A is a permutation should result #result'() {
        expect:
        clazz.solution(A as int[]) == result

        where:
        A            || result
        [1]          || 1
        [2]          || 0
        [1, 2]       || 1
        [2, 2]       || 0
        [2, 2, 1]    || 0
        [1, 2, 1]    || 0
        [4, 1, 3, 2] || 1
        [4, 1, 3]    || 0
        [1000000]    || 0
        [1, 1000000] || 0
    }
}
