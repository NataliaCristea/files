package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            File obj = new File("filename.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
            }


        } catch (IOException e) {
            System.out.println("an error");
            e.printStackTrace();
        }

    }
}
