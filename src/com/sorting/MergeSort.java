package com.sorting;

public class MergeSort {

    public static void main (String... s) {

        int [] arr = {13, 56, 34, 7, 98, 56, 12, 65, 83, 63, 28, 71, 52, 97, 47};
        mergeSort(arr, arr.length);

    }

    public static void mergeSort (int [] array, int length) {
        if(length <= 1) {
            // Array has only one or no element
            return;
        }

        int mid = length / 2;
        int [] leftPart = new int [mid];
        int [] rightPart = new int [length - mid];

        // Inserting Values to the created array
        for(int i = 0; i < mid; i++){
            leftPart[i] = array [i];
        }

        for (int i = mid; i < length; i++) {
            // Getting 0th index for right part array
            rightPart[i - mid] = array [i];
        }

        mergeSort(leftPart, leftPart.length);
        mergeSort(rightPart, rightPart.length);

    }

    public static void merge () {

    }
}
