package com.search;

public class BinarySearch {
    public static void main(String... args) {
        int [] arr = {7, 12, 13, 28, 34, 47, 52, 56, 63, 65, 71, 83, 97, 98};
        int item = 6;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        int result = binarySearch(arr, item, leftIndex, rightIndex);

        if(result == -1) {
            System.out.println("Item is not in the list");
        } else {
            System.out.println("Item: " + item + " found at index: " + result);
        }
    }

    public static int binarySearch (int [] arr, int item, int leftIndex, int rightIndex) {
        if(leftIndex <= rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;

            if(arr[middle] == item) {
                return middle;
            } else if (item > arr[middle]) {
                leftIndex = middle + 1;
                return binarySearch(arr, item, leftIndex, rightIndex);
            } else {
                rightIndex = middle - 1;
                return binarySearch(arr, item, leftIndex, rightIndex);
            }
        }

        return -1;
    }
}
