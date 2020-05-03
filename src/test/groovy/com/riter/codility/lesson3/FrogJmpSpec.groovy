package com.riter.codility.lesson3

import spock.lang.Specification
import spock.lang.Unroll

class FrogJmpSpec extends Specification {

    FrogJmp clazz

    def setup() {
        clazz = new FrogJmp()
    }

    @Unroll
    def 'The minimal number of jumps from position #X to #Y and distance #D should result #result'() {
        expect:
        clazz.solution(X, Y, D) == result

        where:
        X  | Y   | D  || result
        1  | 3   | 1  || 2
        1  | 30  | 40 || 1
        1  | 1   | 1  || 0
        10 | 85  | 30 || 3
        10 | 100 | 10 || 9
    }
}
