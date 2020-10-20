package com.company;

public class Tree {
    private String leaf;
    private int height;
    private String colour;
    private boolean healthy;

    public Tree() {
        this.leaf = leaf;
        this.height = height;
        this.colour = colour;
        this.healthy = healthy;
    }

    public Tree(String green, int i) {
        this.leaf = leaf;
        this.height = height;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public void growing() {
        System.out.println("the tree is growing.current height is " + this.height);
    }

}
