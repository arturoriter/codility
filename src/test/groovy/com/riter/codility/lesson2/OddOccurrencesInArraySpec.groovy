package com.riter.codility.lesson2

import spock.lang.Specification
import spock.lang.Unroll

class OddOccurrencesInArraySpec extends Specification {

    OddOccurrencesInArray clazz

    def setup() {
        clazz = new OddOccurrencesInArray()
    }

    @Unroll
    def 'The value found that occurs in odd number of elements #A should result #result'() {
        expect:
        clazz.solution(A as int[]) == result

        where:
        A                     || result
        [1]                   || 1
        [1, 1, 3]             || 3
        [1, 1, 3, 1, 3]       || 1
        [9, 3, 9, 3, 9, 7, 9] || 7
    }
}
