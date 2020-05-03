package com.riter.codility.lesson5

import spock.lang.Specification
import spock.lang.Unroll

class GenomicRangeQuerySpec extends Specification {

    GenomicRangeQuery clazz

    def setup() {
        clazz = new GenomicRangeQuery()
    }

    @Unroll
    def 'The minimum impact factor of DNA sequence #sequence with queries #P #Q should result #result'() {
        expect:
        clazz.solution(sequence, P as int[], Q as int[]) == result as int[]

        where:
        sequence  | P         | Q         || result
        'C'       | [0]       | [0]       || [2]
        'AA'      | [0, 0]    | [0, 1]    || [1, 1]
        'CAGCCTA' | [2, 5, 0] | [4, 5, 6] || [2, 4, 1]
    }
}
