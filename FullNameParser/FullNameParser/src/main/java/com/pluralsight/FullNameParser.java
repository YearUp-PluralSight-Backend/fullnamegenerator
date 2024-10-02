package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        FullNameParser fullNameParser = new FullNameParser();
        fullNameParser.nameParser();
    }

    /**
     * Ask user to enter full name. by using the split and trim method to get the first name, last name, middle name.
     *
     */
    public void nameParser() {



        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Please enter your full name: ");
            System.out.print("Last name: ");
            String fullName = scanner.nextLine();

            String[] names = fullName.trim().split(" ");
            int length = names.length;

            if (length < 0) {
                System.out.println("Please enter your name");
            } else if (length >= 3){
                String firstName = names[0];
                String middleName = names[1].equals("") ? "(None)" : names[1];
                String lastName = names[2];
//                String suffix = names[3];

                System.out.print("Last name  : " + lastName + "\n");
                System.out.print("Middle name: " + middleName+ "\n");
                System.out.print("First name : " + firstName  + "\n");
//                System.out.print("Suffix     : " + suffix + "\n");

                System.out.print("full name  : " + fullName + "\n");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
