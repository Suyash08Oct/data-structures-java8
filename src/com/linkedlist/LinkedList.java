package com.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;

    /**
     * @param data
     * The Method inserts Node at the last
     * Time Complexity O(1)
     */
    public void insert(int data){
        if(head == null){
            head = tail = new Node(data);
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = tail.next;
        }
    }

    /**
     * @param data
     * The Method inserts Node at the last
     * Time Complexity O(1)
     */
    public void insertAtHead(int data){
        if(head == null){
            head = new Node(data);
        } else {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
    }

    /**
     * @param data
     * @param position
     * The Method inserts Node at the specified position
     * Time Complexity O(n)
     */
    public void insertAtPosition(int data, int position){
        if(position == 0){
            insertAtHead(data);
        } else {
            Node temp = head;
            for(int i = 1; i < position && temp != null; i++){
                temp = temp.next;
            }

            if(temp != null){
                Node node = new Node(data);
                Node hold = temp.next;
                temp.next = node;
                node.next = hold;
            }
        }
    }

    /**
     * @param data
     * The Method inserts Node and maintains its Sorting Order
     */
    public void insertInOrder(int data){
        if(head == null){
            head = new Node(data);
        } else {
            Node temp = head;
            Node previous = null;
            while(temp != null && temp.value < data){
                previous = temp;
                temp = temp.next;
            }

            Node node = new Node(data);

            if(previous == null){
                // Means only one node is there, the new node need to be on head
                node.next = head;
                head = node;
            } else {
                previous.next = node;
                node.next = temp;
            }
        }
    }

    /**
     * @return int
     * Pops the first element if exists else return -1
     */
    public int pop(){
        if(head == null)
            return -1;

        Node temp = head;
        head = head.next;
        return temp.value;
    }

    /**
     * @param position
     * @return
     * Deletes the element from the specified position
     */
    public int delete(int position){
        if(head == null){
            return -1;
        }
        else if(position == 0){
            return pop();
        } else {
            Node temp = head;
            Node previous = null;

            for(int i = 0; i < position && temp != null; i++){
                previous = temp;
                temp = temp.next;
            }

            if(temp != null){
                previous.next = temp.next;
                return temp.value;
            }

            return -1;
        }
    }

    /**
     * @param data
     * @return
     * Deletes the element if found, else return false
     */
    public boolean deleteIfFound(int data){
        if(head == null){
            return false;
        } else {
            Node temp = head;
            Node previous = null;

            while(temp != null && temp.value != data){
                previous = temp;
                temp = temp.next;
            }

            if(previous == null){
                // Means the first node
                head = head.next;
                return true;
            }

            if(temp != null){
                previous.next = temp.next;
                return true;
            }

            return false;
        }
    }


    /**
     * Reverse the Linked List
     */
    public void reverse(){
        Node lower = null;
        Node middle = null;
        Node upper = head;

        while(upper != null){
            lower = middle;
            middle = upper;
            upper = upper.next;

            // Magic
            middle.next = lower;
        }

        head = middle;
    }


    /**
     * Traverse Linked List
     */
    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
