package com.company;

import javax.swing.*;

public class Tree {
    private int branch;
    private String colour;
    private String typeTree;
    private boolean isOld;

    public void getBranch() {
        JOptionPane.showMessageDialog(null, "It has " + this.branch + " branches ");
    }

    public void setBranch() {
        String branch = JOptionPane.showInputDialog(null, "How many branches does the tree have? ");
        this.branch = Integer.parseInt(branch);
    }

    public void getColour() {
        JOptionPane.showMessageDialog(null, "It has " + this.colour + " colour ");
    }

    public void setColour() {
        String colour = JOptionPane.showInputDialog(null, "What colour does the tree have? ");
    }

    public void getTypeTree() {
        JOptionPane.showMessageDialog(null, "It is a  " + this.typeTree);

    }

    public void setTypeTree() {
        typeTree = JOptionPane.showInputDialog(null, "What type of tree is it? ");
    }

    public boolean getIsOld() {
        if (this.isOld == false) {
            JOptionPane.showMessageDialog(null, this.isOld + ",is a young tree");
            return this.isOld;
        } else {
            JOptionPane.showMessageDialog(null, this.isOld + ",is an old tree");
            return this.isOld;
        }

    }

    public void setIsOld() {
        String isOld = JOptionPane.showInputDialog(null, "Is the tree old? ");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "branch=" + branch +
                ", colour='" + colour + '\'' +
                ", typeTree='" + typeTree + '\'' +
                ", isOld=" + isOld +
                '}';

    }
}
