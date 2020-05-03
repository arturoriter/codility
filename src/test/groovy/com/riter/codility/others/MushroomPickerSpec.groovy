package com.riter.codility.others

import spock.lang.Specification
import spock.lang.Unroll

class MushroomPickerSpec extends Specification {

    MushroomPicker clazz

    def setup() {
        clazz = new MushroomPicker()
    }

    @Unroll
    def 'The mushroom picker starts at spot #spot and perform #moves in the #array should result #result'() {
        expect:
        clazz.solution(array as int[], spot, moves) == result

        where:
        array                 | spot | moves || result
        [2, 3, 7, 5, 1, 3, 9] | 4    | 6     || 25
    }
}
