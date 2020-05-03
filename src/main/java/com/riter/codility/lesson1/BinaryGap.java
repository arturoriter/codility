package com.riter.codility.lesson1;

/**
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 */
public class BinaryGap {

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        int biggestSequence = 0;
        int count = 0;
        for (char character : binaryString.toCharArray()) {
            if (character == '1') {
                if (count > biggestSequence) {
                    biggestSequence = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return biggestSequence;
    }
}
