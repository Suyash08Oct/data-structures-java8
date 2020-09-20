package com.binarytree;


public class Test {
    public static void main(String... s){
        RecursiveBinarySearchTree recursiveTree = new RecursiveBinarySearchTree();
        Node node = recursiveTree.insert(12);
        node = recursiveTree.insert(node, 5);
        node = recursiveTree.insert(node, 15);
        node = recursiveTree.insert(node, 3);
        node = recursiveTree.insert(node, 7);
        node = recursiveTree.insert(node, 13);
        node = recursiveTree.insert(node, 17);
        node = recursiveTree.insert(node, 1);
        node = recursiveTree.insert(node, 9);
        node = recursiveTree.insert(node, 14);
        node = recursiveTree.insert(node, 20);
        node = recursiveTree.insert(node, 8);
        node = recursiveTree.insert(node, 11);
        node = recursiveTree.insert(node, 18);

        recursiveTree.inorder(node);


        System.out.println("");
        node = recursiveTree.delete(node, 25);
        System.out.println("");
        recursiveTree.inorder(node);


        BinarySearchTree iterativeTree = new BinarySearchTree();
        iterativeTree.insert(12);
        iterativeTree.insert(5);
        iterativeTree.insert(15);
        iterativeTree.insert(3);
        iterativeTree.insert(7);
        iterativeTree.insert(13);
        iterativeTree.insert(17);
        iterativeTree.insert(1);
        iterativeTree.insert(9);
        iterativeTree.insert(14);
        iterativeTree.insert(20);
        iterativeTree.insert(8);
        iterativeTree.insert(11);
        iterativeTree.insert(18);

        iterativeTree.inOrder();


        System.out.println("");
        iterativeTree.delete(5);
        System.out.println("");
        iterativeTree.inOrder();

    }
}
