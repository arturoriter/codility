package com.riter.codility.others.sorting


import spock.lang.Specification
import spock.lang.Unroll

class MergeSortSpec extends Specification {

    @Unroll
    def 'Selection sort of the array #array should result #result'() {
        expect:
        MergeSort.sort(array as int[]) == result as int[]

        where:
        array                 || result
        [2, 3, 7, 5, 1, 3, 9] || [1, 2, 3, 3, 5, 7, 9]
    }
}
