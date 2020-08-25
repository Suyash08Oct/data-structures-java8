package com.array;

public class ReverseArray {
    public static void main(String... s){
        int array[] = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int first = 0, last = array.length -1 ; first < last; first++, last--){
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        //Time Complexity => O(n/2) + O(n) = O(n).
    }
}
