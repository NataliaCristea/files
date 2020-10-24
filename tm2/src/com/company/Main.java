package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog(null, "How many trees would you like to have? ");
        int nr = Integer.parseInt(x);

        Tree[] tree;
        tree = new Tree[nr];

        for (int i = 0; i < nr; i++) {
            tree[i] = new Tree();
            tree[i].setBranch();
            tree[i].setColour();
            tree[i].setTypeTree();
            tree[i].setIsOld();

            tree[i].getBranch();
            tree[i].getColour();
            tree[i].getTypeTree();
            tree[i].getIsOld();

        }
        for (int i = 0; i < nr; i++) {
            JOptionPane.showMessageDialog(null, tree[i].toString());

        }

    }
}
