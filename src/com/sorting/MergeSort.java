package com.sorting;

public class MergeSort {
    public static void main (String... s) {
        int [] arr = {13, 56, 34, 7, 98, 56, 12, 65, 83, 63, 28, 71, 52, 97, 47};

        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

    }

    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Dividing First Half Recursively
            mergeSort(array, left, mid);

            // Dividing Second Half Recursively
            mergeSort(array, mid + 1, right);

            // Merging Both the Halves
            merge(array, left, mid, right);

        }
    }

    public void merge(int[] array, int left, int mid, int right) {
        // Find the sizes of the two new array
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftHalf = new int[n1];
        int[] rightHalf = new int[n2];

        //Copying the element to the two new arrays

        //To the left half
        for (int i = 0; i < n1; i++) {
            leftHalf[i] = array[left + i];
        }

        //To the right half
        for (int i = 0; i < n2; i++) {
            // Why (mid + 1), bcz after dividing the right half always start with (mid + 1)!
            rightHalf[i] = array[mid + 1 + i];
        }

        // Now we got two separate arrays, so start merging them
        int i = 0, j = 0;

        // Important Initialization of k to be start from left
        int k = left;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] < rightHalf[j]) {
                array[k++] = leftHalf[i++];
            } else {
                array[k++] = rightHalf[j++];
            }
        }

        // Jo Bach gaye unko bhi thikane lagana hai, means merge karna hai
        while (i < leftHalf.length) {
            array[k++] = leftHalf[i++];
        }

        while (j < rightHalf.length) {
            array[k++] = rightHalf[j++];
        }
    }
}
