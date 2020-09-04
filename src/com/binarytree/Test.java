package com.binarytree;


public class Test {
    public static void main(String... s){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.search(4);
        //tree.levelOrderTraversal();
        tree.traversal(3);
    }
}
