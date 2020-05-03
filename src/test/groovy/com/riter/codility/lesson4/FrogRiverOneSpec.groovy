package com.riter.codility.lesson4

import spock.lang.Specification
import spock.lang.Unroll

class FrogRiverOneSpec extends Specification {

    FrogRiverOne clazz

    def setup() {
        clazz = new FrogRiverOne()
    }

    @Unroll
    def 'The earliest time the frog can jump with the falling leaves #A to position #X should result #result'() {
        expect:
        clazz.solution(X, A as int[]) == result

        where:
        X | A                        || result
        5 | [1, 3, 1, 4, 2, 3, 5, 4] || 6
        2 | [1, 1]                   || -1
        2 | [1, 1, 2, 3]             || 2
        3 | [1, 3]                   || -1
    }
}
