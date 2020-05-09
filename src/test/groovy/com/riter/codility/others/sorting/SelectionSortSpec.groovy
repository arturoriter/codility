package com.riter.codility.others.sorting


import spock.lang.Specification
import spock.lang.Unroll

class SelectionSortSpec extends Specification {

    @Unroll
    def 'Selection sort of the array #array should result #result'() {
        expect:
        SelectionSort.sort(array as int[]) == result as int[]

        where:
        array                 || result
        [2, 3, 7, 5, 1, 3, 9] || [1, 2, 3, 3, 5, 7, 9]
    }

    @Unroll
    def 'Counting sort of the array #array with #k should result #result'() {
        expect:
        SelectionSort.countingSort(array as int[], k) == result as int[]

        where:
        array                                   | k || result
        [4, 3, 2, 5, 4, 3, 5, 1, 0, 2, 5]       | 5 || [1, 1, 2, 2, 2, 3]
        [2, 3, 7, 5, 1, 3, 9]                   | 9 || [0, 1, 1, 2, 0, 1, 0, 1, 0, 1]
        [1, 4, 7, 3, 4, 5, 6, 3, 4, 8, 6, 4, 4] | 9 || [0, 1, 0, 2, 5, 1, 2, 1, 1, 0]
    }
}
