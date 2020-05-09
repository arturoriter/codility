package com.riter.codility.others.sorting;

public class SelectionSort {

    //Time Complexity = O(n2)
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            int smallerNumber = arr[lowestIndex];
            arr[lowestIndex] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    //Time Complexity = O(n + k)
    public static int[] countingSort(int[] arr, int k) {
        int[] count = new int[k + 1];

        for (int value : arr) {
            ++count[value];
        }

        int p = 0;
        for (int i = 0; i < k + 1; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[p] = i;
                p += 1;
            }
        }

        return count;
    }
}
