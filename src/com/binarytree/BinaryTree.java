package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree{
    public static void main(String[] args){
        Node root = null;
        Queue<Node> queue = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Root Node");
        int data = scan.nextInt();

        root = new Node(data);
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println("Enter Left Child of " + temp.value);
            int left = scan.nextInt();

            System.out.println("Enter Right Child of " + temp.value);
            int right = scan.nextInt();

            if(left != -1){
                temp.left = new Node(left);
                queue.add(temp.left);
            }

            if(right != -1){
                temp.right = new Node(right);
                queue.add(temp.right);
            }
        }

        System.out.println("Binary Tree Created Successfully!");

        levelOrder(root);
        preOrder(root);
        inOrder(root);
        postOrder(root);
    }

    public static void levelOrder(Node temp){
        System.out.println("Level Order Traversal!");

        Queue<Node> level = new LinkedList<>();
        level.add(temp);

        while (!level.isEmpty()){
            Node node = level.poll();

            System.out.print(node.value + ", ");

            if(node.left != null){
                level.add(node.left);
            }

            if(node.right != null){
                level.add(node.right);
            }
        }

        System.out.println("");
    }

    public static void preOrder(Node temp){
        System.out.println("Pre Order Traversal!");

        Stack<Node> preOrder = new Stack<>();

        while(temp != null || !preOrder.isEmpty()){
            if(temp != null){
                System.out.print(temp.value + ", ");
                preOrder.push(temp);
                temp = temp.left;
            } else {
                temp = preOrder.pop();
                temp = temp.right;
            }
        }

        System.out.println("");
    }

    public static void inOrder(Node current){
        System.out.println("In Order Traversal!");

        Stack<Node> inOrder = new Stack<>();

        while(current != null || !inOrder.isEmpty()){
            if(current != null){
                inOrder.push(current);
                current = current.left;
            } else {
                current = inOrder.pop();
                System.out.print(current.value + ", ");
                current = current.right;
            }
        }

        System.out.println("");
    }

    public static void postOrder(Node temp){
        System.out.println("Post Order Traversal!");

        Stack<Object> postOrder = new Stack<>();

        while (temp != null || !postOrder.isEmpty()){
            if(temp != null){
                postOrder.push(temp);
                temp = temp.left;
            } else {
                Object object = postOrder.pop();
                if(object instanceof Node){
                    temp = (Node) object;
                    postOrder.push(temp.value);
                    temp = temp.right;
                } else {
                    System.out.print(object + ", ");
                }
            }
        }

        System.out.println("");
    }
}
