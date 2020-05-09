package com.riter.codility.lesson5

import spock.lang.Specification
import spock.lang.Unroll

class MinAvgTwoSliceSpec extends Specification {

    MinAvgTwoSlice clazz

    def setup() {
        clazz = new MinAvgTwoSlice()
    }

    @Unroll
    def 'The minimal average of any slice containing at least two elements of the array #A should result #result'() {
        expect:
        clazz.solution(A as int[]) == result

        where:
        A                     || result
        [1, 2, 3]             || 0
        [4, 5]                || 0
        [1, 2]                || 0
        [3, 4, 5]             || 0
        [-22, 0, -22]         || 0
        [4, 2, 2, 5, 1, 5, 8] || 1
    }
}
