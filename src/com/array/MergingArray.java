package com.array;

import java.util.Arrays;

/**
 * Merging two sorted arrays.
 */
public class MergingArray {
    public static void main(String[] args) {
        int [] a = {3,8,16,20,25,29};
        int [] b = {4,10,12,22,23};

        int [] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length){
            merged[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length){
            merged[k] = b[j];
            j++;
            k++;
        }

        System.out.print("Merged Array: ");
        Arrays.stream(merged).forEach(x -> System.out.print(x + ", "));
    }
}
