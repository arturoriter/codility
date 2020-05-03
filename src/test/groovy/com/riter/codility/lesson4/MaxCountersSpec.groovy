package com.riter.codility.lesson4

import spock.lang.Specification
import spock.lang.Unroll

class MaxCountersSpec extends Specification {

    MaxCounters clazz

    def setup() {
        clazz = new MaxCounters()
    }

    @Unroll
    def 'Calculate the values of counters of #A and given #N counters should result #result'() {
        expect:
        clazz.solution(N, A as int[]) == result as int[]

        where:
        N | A                     || result
        3 | [1, 2, 2]             || [1, 2, 0]
        3 | [4, 2, 2]             || [0, 2, 0]
        3 | [2, 4, 2]             || [1, 2, 1]
        3 | [2, 4, 4]             || [1, 1, 1]
        3 | [2, 4, 4, 2]          || [1, 2, 1]
        3 | [2, 4, 2, 4]          || [2, 2, 2]
        5 | [3, 4, 4, 6, 1, 4, 4] || [3, 2, 2, 4, 2]
    }
}
