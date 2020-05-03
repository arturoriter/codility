package com.riter.codility.lesson3

import spock.lang.Specification
import spock.lang.Unroll

class PermMissingElemSpec extends Specification {

    PermMissingElem clazz

    def setup() {
        clazz = new PermMissingElem()
    }

    @Unroll
    def 'The missing element in the permutation #A should result #result'() {
        expect:
        clazz.solution(A as int[]) == result

        where:
        A            || result
        []           || 1
        [2, 3, 1, 5] || 4
        [2, 3, 4, 5] || 1
        [2, 3, 1, 4] || 5
    }
}
