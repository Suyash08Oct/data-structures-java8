package com.binarytree;


public class Test {
    public static void main(String... s){
        RecursiveBinarySearchTree searchTree = new RecursiveBinarySearchTree();
        Node node = searchTree.insert(12);
        node = searchTree.insert(node, 5);
        node = searchTree.insert(node, 15);
        node = searchTree.insert(node, 3);
        node = searchTree.insert(node, 7);
        node = searchTree.insert(node, 13);
        node = searchTree.insert(node, 17);
        node = searchTree.insert(node, 1);
        node = searchTree.insert(node, 9);
        node = searchTree.insert(node, 14);
        node = searchTree.insert(node, 20);
        node = searchTree.insert(node, 8);
        node = searchTree.insert(node, 11);
        node = searchTree.insert(node, 18);

        searchTree.inorder(node);


        System.out.println("");
        node = searchTree.delete(node, 5);
        System.out.println("");
        searchTree.inorder(node);

    }
}
