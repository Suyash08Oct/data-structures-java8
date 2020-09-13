package com.array;

/**
 * Find the missing element, in a sorted array.
 */
public class SingleMissingElement {
    public static void main(String[] args) {
        int [] array = {8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19};
        boolean found = false;

        int difference = array[0] - 0;

        for(int i = 1; i < array.length; i++){
            if(array[i] - i != difference){
                System.out.println("Missing Element: " + (i + difference));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No Missing Element");
        }
    }
}
