package com.pluralsight;

public class WhileLoop {

    public static void main(String[] args) {


        printFiveTime("I love Java");
    }

    public static void printFiveTime(String words) {

        int count = 0;

        while (count < 5) {
            System.out.println(words);
            count++;
        }
    }
}
