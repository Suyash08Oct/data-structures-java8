package com.array;

/**
 * Program to find multiple missing elements.
 */
public class MultipleMissingElement {
    public static void main(String[] args) {
        int [] array = {8, 9, 10, 11, 13, 14, 15, 18, 19, 20, 21, 26};
        boolean found = false;

        int difference = array[0] - 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] - i != difference){
                found = true;
                int newDifference = array[i] - i;
                while(difference < newDifference){
                    System.out.println("Missing Element is: " + (difference + i));
                    difference++;
                }
            }
        }

        if(!found){
            System.out.println("No Missing Element");
        }
    }
}
