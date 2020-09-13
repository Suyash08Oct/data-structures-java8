package com.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Program to Find Duplicate Elements and there count in an array.
 */
public class FindingDuplicateElements {
    public static void main(String[] args) {
        int [] array = {8, 9, 10, 10, 12, 13, 14, 16, 16, 16, 19};

        HashMap<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            if(result.containsKey(array[i])){
                result.put(array[i], result.get(array[i]) + 1);
            } else {
                result.put(array[i], 1);
            }
        }

        for(Map.Entry e : result.entrySet()){
            int value = (int) e.getValue();
            if (value > 1){
                System.out.println("The Element: " + e.getKey() + " is duplicated for " + e.getValue() + " times.");
            }
        }
    }

}
