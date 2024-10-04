package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) {

        forLoopExample(10);

    }

    public static void forLoopExample(int count) {

        try {
            for (int i = 0; count > i; count--) {
    
                System.out.println("Count: " + count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Launch!");

    }
}
