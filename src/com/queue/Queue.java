package com.queue;

public class Queue {
    public int size;
    public int front;
    public int rear;
    public char [] array;

    public Queue(int size){
        this.size = size;
        front = rear = -1;
        this.array = new char[size];
    }

    /**
     * @param data
     * Adding Data into the Queue
     * Time Complexity O(1).
     */
    public void enqueue(char data){
        if(rear == front){
            // If Queue is empty, Reset the queue
            rear = front = -1;
        }

        if(rear + 1 == size){
            System.out.println("Queue is Full!");
        } else {
            rear = rear + 1;
            array[rear] = data;
        }
    }

    /**
     * @return Element from the queue
     * Time Complexity O(1).
     */
    public char dequeue(){
        if(rear == front){
            System.out.println("Queue is Empty!!");

            // If Queue is empty, Reset the queue
            rear = front = -1;

            return '\0';
        } else {
            front = front + 1;
            return array[front];
        }
    }

    public void traverse(){
        for (int i = front + 1; i <= rear; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
