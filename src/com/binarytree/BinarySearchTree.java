package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    /**
     * Iterative Approach of Insertion in a Binary Search Tree
     */
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

    /**
     * Iterative Approach of Searching in a Binary Search Tree
     */
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

    /**
     * Iterative Approach of Deletion in a Binary Search Tree
     */
    public void delete(int value){
        Node previous = null;
        Node temp = root;

        while (temp != null){
            if(temp.value < value){
                previous =  temp;
                temp = temp.right;
            } else if(temp.value > value){
                previous =  temp;
                temp = temp.left;
            } else if(temp.value == value){
                // Value Found.
                // Case 1: Leaf Node, No Child
                if(temp.left == null && temp.right == null){
                    temp = null;
                }
                // Case 2: Only One Child
                else if (temp.left == null){
                    if(previous != null){
                        if(previous.value > temp.value){
                            previous.left = temp.right;
                        } else {
                            previous.right = temp.right;
                        }
                    } else {
                        // Means you are trying to delete the root only.
                        this.root = temp.right;
                    }
                } else if (temp.right == null){
                    if(previous != null){
                        if(previous.value > temp.value){
                            previous.left = temp.left;
                        } else {
                            previous.right = temp.left;
                        }
                    } else {
                        // Means you are trying to delete the root only.
                        this.root = temp.left;
                    }
                }
                // Case 3: Having Both the Children
                else if(temp.left != null && temp.right != null) {
                    // Finding Successor, which will be the minimum node in the right sub tree
                    Node parent = temp;
                    Node current = temp.right;
                    while (current.left != null){
                        parent = current;
                        current = current.left;
                    }

                    Node successor = current;

                    // We know that, successor node will the be the most left possible node in right subtree
                    // so by the above statement we are sure, the successor.left is null.

                    //Coping the element
                    temp.value = successor.value;

                    // Case 1: if successor.right is also null, then its leaf node
                    if(successor.right == null){
                        successor = null;
                    }
                    // Case 2: If Right Child Exists, Means only one child
                    else {
                        if(parent.value > successor.value){
                            parent.left = successor.right;
                        } else {
                            parent.right = successor.right;
                        }
                    }
                }

                // Stopping the loop,
                break;
            }
        }
    }

    /**
     * Iterative Level Order Traversal
     */
    public void levelOrder(){
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

        System.out.println("");
    }

    /**
     * Iterative Pre Order Traversal
     */
    public void preOrder(){
        System.out.println("Pre Order Traversal!");
        Node temp = root;

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

    /**
     * Iterative In Order Traversal
     */
    public void inOrder(){
        System.out.println("In Order Traversal!");
        Node current = root;

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

    /**
     * Iterative Post Order Traversal
     */
    public void postOrder(){
        System.out.println("Post Order Traversal!");
        Node temp = root;

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
