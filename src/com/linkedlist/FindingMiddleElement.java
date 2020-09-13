package com.linkedlist;

/**
 * Program to find middle node of the linked list.
 */
public class FindingMiddleElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(8);
        list.insert(16);
        list.insert(20);
        list.insert(25);
        list.insert(29);
        list.insert(79);

        findMiddle(list);
    }

    public static void findMiddle(LinkedList list){
        Node slow = list.getHead();
        Node fast = list.getHead();

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow != null){
            System.out.println("Middle Element: " + slow.value);
        }

    }
}
