package com.riter.codility.lesson3;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 */
public class FrogJmp {

    // Fail in the performance tests
    public int solutionUsingIteration(int X, int Y, int D) {
        int jumpNumber = 0;
        int result = X;
        while (result < Y) {
            jumpNumber++;
            result += D;
        }
        return jumpNumber;
    }

    public int solution(int X, int Y, int D) {
        int jumps = (Y - X) / D;
        if ((Y - X) % D != 0) {
            jumps++;
        }
        return jumps;
    }
}