package com.searching.jumpSearch;

public class JumpSearch {

    public static void main (String... s) {
        int [] arr = {7, 12, 13, 28, 34, 47, 52, 56, 63, 65, 71, 83, 97, 98};
        int item = 52;

        int result = jumpSearch(arr, item);

        if(result == -1) {
            System.out.println("Item is not in the list");
        } else {
            System.out.println("Item: " + item + " found at index: " + result);
        }
    }

    public static int jumpSearch (int [] arr, int item) {
        int initialValue = 0;
        int jumpBlock = (int)Math.sqrt(arr.length);

        //control wil continue to jump the block
        while (item >= arr[jumpBlock] && jumpBlock < arr.length) {
            initialValue = jumpBlock;
            jumpBlock = jumpBlock + (int)Math.sqrt(arr.length);

            if(jumpBlock > arr.length - 1)
                return -1;
        }

        // Linear Search
        for (int i = initialValue; i < jumpBlock; i++) {
            if (arr[i] == item) {
                return i;
            }
        }

        return -1;
    }
}
