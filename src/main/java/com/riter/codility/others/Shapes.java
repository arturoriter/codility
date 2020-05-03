package com.riter.codility.others;

public class Shapes {

    public void triangleShape(int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void symmetricalTriangleShape(int size) {
        for (int i = size, j = 0; i > 0; i--, j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
