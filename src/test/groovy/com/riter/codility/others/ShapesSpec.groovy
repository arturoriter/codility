package com.riter.codility.others

import spock.lang.Specification
import spock.lang.Unroll

class ShapesSpec extends Specification {

    Shapes clazz

    def setup() {
        clazz = new Shapes()
    }

    @Unroll
    def 'Triangle shape of #N'() {
        expect:
        clazz.triangleShape(N)

        where:
        N  || _
        1  || _
        2  || _
        3  || _
        4  || _
        10 || _
    }

    @Unroll
    def 'Symmetrical triangle shape of #N'() {
        expect:
        clazz.symmetricalTriangleShape(N)

        where:
        N  || _
        1  || _
        2  || _
        3  || _
        4  || _
        10 || _
    }
}
