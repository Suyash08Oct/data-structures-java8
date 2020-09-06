package com.stack;

import com.linkedlist.Node;

/**
 * Stack Using Linked List is same as Linked List, only insertion and deletion
 * is allowed from the top (similar to head in linked list) end.
 */
public class StackLinkedList {
    private Node top;

    public boolean isEmpty(){
        return top == null ? true : false;
    }

    /**
     * @param data
     * Pushes the element in the stack
     * Time Complexity O(n)
     */
    public void push(int data){
        if(isEmpty()){
            top = new Node(data);
        } else {
            Node node = new Node(data);
            node.next = top;
            top = node;
        }
    }

    /**
     * @return Pops the element from the stack
     * Time Complexity O(n)
     */
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int value = top.value;
            top = top.next;
            return value;
        }
    }

    /**
     * @return top element from the stack
     * Time Complexity O(n)
     */
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return top.value;
        }
    }

    /**
     * Traverses the stack
     * Time Complexity O(n)
     */
    public void traverse(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

}
