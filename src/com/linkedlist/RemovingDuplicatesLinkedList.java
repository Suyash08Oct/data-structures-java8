package com.linkedlist;

/**
 * Program to remove the duplicate elements from the linked list.
 */
public class RemovingDuplicatesLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(8);
        list.insert(8);
        list.insert(8);
        list.insert(8);
        list.insert(16);
        list.insert(16);
        list.insert(20);
        list.insert(25);
        list.insert(25);
        list.insert(29);
        list.insert(29);
        list.insert(29);

        removingDuplicate(list);
    }

    public static void removingDuplicate(LinkedList list){
        Node head = list.getHead();
        Node previous = head;
        Node forward = previous.next;

        while (forward != null){
            if(previous.value == forward.value){
                previous.next = forward.next;
                forward = forward.next;
            } else {
                previous = forward;
                forward = forward.next;
            }
        }

        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
    }
}
