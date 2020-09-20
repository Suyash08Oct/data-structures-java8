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

    public void inorder(Node node){
        if(node == null)
            return;

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

}
