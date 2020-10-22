package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Josephus.getJosephusPosition;

public class Main {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
	Scanner in= new Scanner(System.in);
        System.out.println("Total kids: ");
	int n = in.nextInt();
        System.out.println("Kid eliminated: ");
	int m = in.nextInt();
        getJosephusPosition(m,n);

    }
}
