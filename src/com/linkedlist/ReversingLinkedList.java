package com.linkedlist;

/**
 * Program to reverse linked list, by reversing its pointers
 */
public class ReversingLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(8);
        list.insert(16);
        list.insert(20);
        list.insert(25);
        list.insert(29);

        reverse(list);
    }

    public static void reverse(LinkedList list){
        Node lower = null;
        Node middle = null;
        Node upper = list.getHead();

        while (upper != null){
            lower = middle;
            middle = upper;
            upper = upper.next;

            middle.next = lower;
        }

        // List is Reversed. middle is pointing to the last element, which is the first element after reversal.

        Node current = middle;
        while(current != null){
            System.out.print(current.value + ", ");
            current = current.next;
        }

    }
}
