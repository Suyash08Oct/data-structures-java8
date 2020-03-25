package com.searching.linearsearch;

public class LinearSearch {

    public static void main(String... args) {
        int [] arr = {13, 56, 34, 7, 98, 56, 12, 65, 83, 63, 28, 71, 52, 97, 47};
        int item = 200;

        // Linear Search
        int result = linearSearch(arr, item);

        if(result == -1) {
            System.out.println("Item is not in the list");
        } else {
            System.out.println("Item: " + item + " found at index: " + result);
        }
    }

    public static int linearSearch (int [] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
