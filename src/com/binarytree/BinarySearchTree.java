package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public boolean insert(int value){
        Node node = new Node(value);

        if(this.root == null){
            this.root = node;
            return true;
        } else {
            Node currentNode = root;
            while(true){
                if(currentNode.value > value){
                    if(currentNode.left == null){
                        currentNode.left = node;
                        return true;
                    }
                    currentNode = currentNode.left;
                } else if(currentNode.value < value) {
                    if(currentNode.right == null){
                        currentNode.right = node;
                        return true;
                    }
                    currentNode = currentNode.right;
                } else {
                    System.out.println("Value is already there!");
                    return false;
                }
            }
        }
    }

    public Node search(int key){
        Node current = this.root;
        while(current != null){
            if(current.value > key){
                current = current.left;
            } else if(current.value < key){
                current = current.right;
            } else if (current.value == key) {
                System.out.println("Value Found");
                return current;
            }
        }

        System.out.println("Value is not there!!");
        return null;
    }

    public void levelOrderTraversal(){
        if(this.root == null){
            System.out.println("Empty Tree !!");
        } else {
            Queue<Node> queue = new LinkedList<>();
            Node current = this.root;
            queue.add(current);

            while(!queue.isEmpty()){
                Node node = queue.poll();
                System.out.print(node.value + " ");

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }
        }
    }

    public void inorder(Node current){
        if(current == null)
            return;

        inorder(current.left);
        System.out.print(current.value + " ");
        inorder(current.right);
    }

    public void preorder(Node current){
        if(current == null)
            return;

        System.out.print(current.value + " ");
        preorder(current.left);
        preorder(current.right);
    }

    public void postorder(Node current){
        if(current == null)
            return;

        postorder(current.left);
        postorder(current.right);
        System.out.print(current.value + " ");
    }

    public void traversal(int option){
        Node current = this.root;

        switch (option){
            case 1:
                System.out.println("Inorder Traversal:");
                inorder(current);
                break;

            case 2:
                System.out.println("Pre order Traversal:");
                preorder(current);
                break;

            case 3:
                System.out.println("Post order Traversal:");
                postorder(current);
                break;

            default:
                System.out.println("Wrong Type!!");
                break;
        }
    }
}
