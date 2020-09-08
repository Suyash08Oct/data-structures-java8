package com.queue;

public class Test {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');
        queue.enqueue('D');
        queue.traverse();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue('E');
        queue.enqueue('F');
        System.out.println(queue.dequeue());
        queue.traverse();

        System.out.println(queue.dequeue());
        queue.traverse();
        queue.enqueue('G');
        queue.enqueue('H');
        queue.enqueue('I');
        queue.enqueue('J');
        queue.traverse();
        System.out.println(queue.dequeue());
        queue.traverse();
        System.out.println(queue.dequeue());
        queue.traverse();
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');
        queue.enqueue('D');
        queue.traverse();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue('E');
        queue.enqueue('F');
        System.out.println(queue.dequeue());
        queue.traverse();

        System.out.println(queue.dequeue());
        queue.traverse();
        queue.enqueue('G');
        queue.enqueue('H');
        queue.enqueue('I');
        queue.enqueue('J');
        queue.traverse();
        System.out.println(queue.dequeue());
        queue.traverse();
        System.out.println(queue.dequeue());
        queue.traverse();
        System.out.println("Front: " + queue.first());
        System.out.println(queue.dequeue());
        System.out.println("Front: " + queue.first());
        System.out.println(queue.dequeue());
        System.out.println("Last: " + queue.last());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Last: " + queue.last());
    }
}
