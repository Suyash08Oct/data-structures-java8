package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

        System.out.println("Level Order Traversal!");

        Queue<Node> level = new LinkedList<>();
        level.add(root);

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
    }
}
