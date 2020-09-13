package com.linkedlist;

/**
 * Program to Merge Two Linked List maintaining its sorted order.
 */
public class MergingLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(3);
        list1.insert(8);
        list1.insert(16);
        list1.insert(20);
        list1.insert(25);
        list1.insert(29);

        LinkedList list2 = new LinkedList();
        list2.insert(4);
        list2.insert(10);
        list2.insert(12);
        list2.insert(22);
        list2.insert(23);

        merge(list1, list2);
    }

    public static void merge(LinkedList list1, LinkedList list2){
        Node first = list1.getHead();
        Node second = list2.getHead();

        // Initialization Phase
        Node third = null, last = null;

        if(first.value < second.value){
            // First Node, from the first list is smaller
            third = last = first;
            first = first.next;
            last.next = null;
        } else {
            // First Node, from the second list is smaller
            third = last = second;
            second = second.next;
            last.next = null;
        }

        // Merging Phase

        while (first != null && second != null){
            if(first.value < second.value){
                last.next = first;
                first = first.next;
                last = last.next;
                last.next = null;
            } else {
                last.next = second;
                second = second.next;
                last = last.next;
                last.next = null;
            }
        }

        // Closing Phase

        // One of the list is ended, or merged completely, so concatenate the other list.
        // We are not sure, that which list is ended, so trying with both.

        if (first != null){
            last.next = first;
        }

        if (second != null){
            last.next = second;
        }

        // Optional Phase

        // Merging is done, but last is not pointing to the last node of the merged list
        //So below is a optional approach,  to move last, as the tail in the linked list

        while (last.next != null){
            last = last.next;
        }


        // Traversing the Merged Linked List. It is also the optional step

        Node current = third;
        while (current != null){
            System.out.print(current.value + ", ");
            current = current.next;
        }

    }
}
