package com.array;

/**
 * Program to find first 3 maximum number.
 */
public class Find3LargestNumber {
    public static void main(String[] args) {
        int [] array = {3,8,2,67,98,12,65,23,56,9,89,72,24,86,45};

        int first = 0, second = 0, third = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > first){
                third = second;
                second = first;
                first = array[i];
            } else if(array[i] > second){
                third = second;
                second = array[i];
            } else if(array[i] > third){
                third = array[i];
            }
        }

        System.out.println("First: " + first + " Second: " + second + " Third: " + third);
    }
}
