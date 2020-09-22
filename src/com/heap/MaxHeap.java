package com.heap;

public class MaxHeap {
    private int heap_size;
    private int [] array;

    public MaxHeap(int capacity){
        this.heap_size = -1;
        array = new int[capacity];
    }

    public void insert(int value){
        heap_size++;
        array[heap_size] = value;

        int index = heap_size;
        while(index > 0 && array[(index - 1) / 2] < value){
            // Note: Parent : A[(index-1)/2]
            // Means Inserted value is greater than its parent, For maintaining max heap, swap the value.
            int temp = array[index];
            array[index] = array[(index - 1) / 2];
            array[(index - 1) / 2] = temp;


            index = (index - 1) / 2;
        }
    }

    public void traverse(){
        for (int i = 0; i <= heap_size; i++){
            System.out.print(array[i] + ", ");
        }

        System.out.println("");
    }

    public int getRightChild(int index){
        //Right Child :: A[(2 * index) + 2]
        int right = (2 * index) + 2;
        if(right > heap_size){
            return -1;
        } else {
            return array[right];
        }
    }

    public int getLeftChild(int index){
        // Left Child :: A[(2 * index) + 1]
        int left = (2 * index) + 1;
        if(left > heap_size){
            return -1;
        } else {
            return array[left];
        }
    }

    public boolean isLeaf(int index){
        //Right Child :: A[(2 * index) + 2]
        int right = (2 * index) + 2;
        // Left Child :: A[(2 * index) + 1]
        int left = (2 * index) + 1;

        if(left > heap_size && right > heap_size){
            return true;
        } else {
            return false;
        }

    }

    public int remove() {
        if (heap_size == -1) {
            return -1;
        }

        int del = array[0];
        array[0] = array[heap_size];
        heap_size--;

        int index = 0;
        while (array[index] < getLeftChild(index) || array[index] < getRightChild(index)) {
            int leftChild = getLeftChild(index);
            int rightChild = getRightChild(index);

            if (leftChild > rightChild) {
                array[(2 * index) + 1] = array[index];
                array[index] = leftChild;

                index = (2 * index) + 1;
            } else {
                array[(2 * index) + 2] = array[index];
                array[index] = rightChild;

                index = (2 * index) + 2;
            }
        }
        return del;
    }

    public void heapify(int index){
        if(isLeaf(index)){
            return;
        }

        if(array[index] < getLeftChild(index) || array[index] < getRightChild(index)){
            int leftChild = getLeftChild(index);
            int rightChild = getRightChild(index);

            if (leftChild > rightChild) {
                array[(2 * index) + 1] = array[index];
                array[index] = leftChild;

                heapify((2 * index) + 1);
            } else {
                array[(2 * index) + 2] = array[index];
                array[index] = rightChild;

                heapify((2 * index) + 2);
            }
        }
    }
}
