package com.queue;

public class CircularQueue {
    public int size;
    public int front;
    public int rear;
    public char [] array;

    public CircularQueue(int size){
        this.size = size;
        front = 0;
        rear = 0;
        this.array = new char[size];
    }

    /**
     * @param data
     * Adding Data into the Queue
     * Time Complexity O(1).
     */
    public void enqueue(char data){
        if((rear + 1) % size == front){
            System.out.println("Queue is Full!");
        } else {
            rear = (rear + 1) % size;
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
            return '\0';
        } else {
            front = (front + 1) % size;
            return array[front];
        }
    }

    public void traverse(){
        if(front == rear){
            System.out.print("Queue is Empty!!");
        } else {
            int i = (front + 1) % size;
            while ( i != (rear + 1) % size){
                System.out.print(array[i] + " ");
                i = (i + 1) % size;
            }
        }
        System.out.println("");
    }
}
