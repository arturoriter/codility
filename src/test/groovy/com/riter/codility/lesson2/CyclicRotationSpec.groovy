package com.riter.codility.lesson2

import spock.lang.Specification
import spock.lang.Unroll

class CyclicRotationSpec extends Specification {
    CyclicRotation clazz

    def setup() {
        clazz = new CyclicRotation()
    }

    @Unroll
    def 'The rotation of the array #A to the right by #k steps should result #result'() {
        expect:
        clazz.solution(A as int[], k) == result as int[]

        where:
        A               | k || result
        [0, 0, 0]       | 1 || [0, 0, 0]
        [1, 2, 3, 4]    | 4 || [1, 2, 3, 4]
        [3, 8, 9, 7, 6] | 3 || [9, 7, 6, 3, 8]
    }
}
