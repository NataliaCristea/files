package com.company;

import javax.swing.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        float sum = 0;
        Scanner in = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, " Enter the values: ");
        float n = in.nextInt();
        JOptionPane.showMessageDialog(null, " Type in " + n + " values: ");


        for (int i = 1; i <= n; i++) {
            int nr = in.nextInt();
            sum += nr;
        }
        float average = sum / n;

        JOptionPane.showMessageDialog(null, " The average is " + average);


    }
}



