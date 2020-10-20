package com.company;

public class Apple extends Tree {

    public int appleTail;
    public int weight;


    public Apple(String green, int i, int appleTail, int weight) {
        super(green, i);
        this.appleTail = appleTail;
        this.weight = weight;
    }

    public Apple() {
        super();
    }

    public void basket() {
        if (appleTail > 20) {
            System.out.println("there are a lot of apple tails");
        } else {
            System.out.println("there are not so many");
        }
    }

}

