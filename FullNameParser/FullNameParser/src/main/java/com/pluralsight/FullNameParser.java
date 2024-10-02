package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        FullNameParser fullNameParser = new FullNameParser();
        fullNameParser.nameParser();
    }

    /**
     * Ask user to enter full name.
     * by using the split and trim method to get the first name, last name, middle name.
     */
    public void nameParser() {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Please enter your full name: ");
            String fullName = scanner.nextLine();
            String[] names = fullName.trim().split("\\s+");

            int length = names.length;
            String firstName = "";
            String lastName = "";
            String middleName = "";

            for (String name: names) {

            }

            System.out.println(length);
            if (length < 0) {
                System.out.println("Please enter your name");
            } else if (length == 3){
                firstName = names[0];
                middleName = names[1].isBlank() ? "(None)" : names[1];
                lastName = names[2];
            } else if (length == 2) {
                firstName = names[0];
                lastName = names[1];

            }

            System.out.print("Last name  : " + lastName + "\n");
            System.out.print("Middle name: " + middleName+ "\n");
            System.out.print("First name : " + firstName  + "\n");
            System.out.print("full name  : " + fullName + "\n");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
