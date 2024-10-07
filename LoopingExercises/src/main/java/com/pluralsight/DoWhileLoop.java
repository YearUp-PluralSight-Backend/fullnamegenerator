package com.pluralsight;

public class DoWhileLoop {

    public static void main(String[] args) {


        doWhileExample();
    }

    public static void doWhileExample() {

        int count = 0;
        do {
            System.out.println("I love Java");
            count++;
        } while (count < 5);
    }
}
