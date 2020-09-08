package com.queue;


import com.linkedlist.Node;

public class QueueLinkedList {
    public Node front;
    public Node rear;


    /**
     * @param data
     * Insert Data into the Queue
     * Time Complexity O(1)
     */
    public void enqueue(int data){
        if(front == null){
            front = rear = new Node(data);
        } else {
            Node node = new Node(data);
            rear.next = node;
            rear = rear.next;
        }
    }

    /**
     * @return Data from the Queue
     * Time Complexity O(1)
     */
    public int dequeue(){
        int value = -1;
        if(front == null){
            System.out.println("Queue is Empty!!");
        } else {
            value = front.value;
            front = front.next;
        }

        return value;
    }

    /**
     * @return first element in the queue
     */
    public int first(){
        int value = -1;
        if(front != null){
            value = front.value;
        }
        return value;
    }

    /**
     * @return last element in the queue
     */
    public int last(){
        int value = -1;
        if(front != null){
            value = rear.value;
        }
        return value;
    }

    /**
     * Traverse the queue.
     */
    public void traverse(){
        Node temp = front;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

        System.out.println("");
    }
}
