package com.riter.codility.lesson5

import spock.lang.Specification
import spock.lang.Unroll

class CountDivSpec extends Specification {

    CountDiv clazz

    def setup() {
        clazz = new CountDiv()
    }

    @Unroll
    def 'The number of integers within the range [#A-#B] that are divisible by #K should result #result'() {
        expect:
        clazz.solution(A, B, K) == result

        where:
        A  | B  | K  || result
        0  | 11 | 5  || 3
        0  | 11 | 12 || 1 //K>B, A==0
        1  | 11 | 12 || 0 //K>B, A>0
        0  | 0  | 12 || 1 //K>B, A==0, B==0
        20 | 20 | 20 || 1
        6  | 11 | 2  || 3
    }
}
