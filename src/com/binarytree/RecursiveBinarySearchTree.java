package com.binarytree;

public class RecursiveBinarySearchTree {
    private Node root;


    /**
     * Only for first time use, to create binary tree from scratch.
     */
    public Node insert(int value){
        if(root == null){
            root = new Node(value);
        }
        return root;
    }

    /**
     * Insert in the tree, once root is present
     */
    public Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value > node.value){
            node.right =  insert(node.right, value);
        } else if(value < node.value) {
            node.left =  insert(node.left, value);
        }

        return node;
    }

    /**
     * Recursive Search in Binary Search Tree
     */
    public Node search(Node node, int data){
        if (node != null){
            if(node.value > data){
                return search(node.left, data);
            } else if(node.value < data){
                return search(node.right, data);
            } else if(node.value == data){
                return node;
            }
        }
        
        return null;
    }


    /**
     * Deleting the Node from Binary Search Tree, Recursive Approach
     */
    public Node delete(Node node, int data) {
        if (node == null) {
            System.out.println("Value Not Found");
            return node;
        }

        if (node.value > data) {
            node.left = delete(node.left, data);
        } else if (node.value < data) {
            node.right = delete(node.right, data);
        } else if (node.value == data) {
            // Data Found, Deletion Process Started

            // Case 1: Leaf Node, having no child
            if (node.left == null && node.right == null) {
                node = null;
            }
            // Case 2: One child node, either left or right
            else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            }
            // Case 3: Having two children
            else {
                Node min = findMin(node.right);
                node.value = min.value;
                node.right = delete(node.right, min.value);
            }
        }

        return node;
    }

    /**
     * Finding Maximum Value Node
     */
    public Node findMax(Node node){
        // In Binary Search Tree, the maximum node is the most right child.
        if(node == null){
            return null;
        }

        while (node.right != null){
            node = node.right;
        }

        return node;
    }

    /**
     * Finding Minimum value node.
     */
    public Node findMin(Node node){
        // In Binary Search Tree, the minimum node is the most left child.
        if(node == null){
            return null;
        }

        while (node.left != null){
            node = node.left;
        }

        return node;
    }

    /**
     * Recursive Inorder Traversal
     */
    public void inorder(Node current){
        if(current == null)
            return;

        inorder(current.left);
        System.out.print(current.value + " ");
        inorder(current.right);
    }

    /**
     * Recursive Pre Order Traversal
     */
    public void preorder(Node current){
        if(current == null)
            return;

        System.out.print(current.value + " ");
        preorder(current.left);
        preorder(current.right);
    }

    /**
     * Recursive Post Order Traversal
     */
    public void postorder(Node current){
        if(current == null)
            return;

        postorder(current.left);
        postorder(current.right);
        System.out.print(current.value + " ");
    }

}
