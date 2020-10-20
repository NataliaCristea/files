package com.company;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree("green", 158);
        Tree newTree = new Tree("green", 158);
        tree.growing();
        newTree.growing();
        Apple apple = new Apple();
        apple.basket();
        Banana banana = new Banana();
        banana.bag();

        System.out.println("leaf is: " + tree.getLeaf());
        System.out.println("leaf is: " + newTree.getLeaf());


        

    }
}
