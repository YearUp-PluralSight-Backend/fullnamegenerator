package com.pluralsight;

import java.util.Scanner;

public class FullnameGenerator {

    public static void main(String[] args) {

        FullnameGenerator fullnameGenerator = new FullnameGenerator();
        fullnameGenerator.nameGenerate();

    }


    /**
     * Ask user to enter their firstName, middle name, last name, and suffix.
     *
     */
    public void nameGenerate() {



        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Please enter your name: ");
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Middle name: ");
            String middleName = scanner.nextLine();

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Suffix: ");
            String suffix = scanner.nextLine();

            String fullName = suffix.equals("") ? lastName + " " + middleName + " " + firstName:  lastName + " " + middleName + " " + firstName + ", " + suffix;

            StringBuilder fullNameWithStringBuilder = new StringBuilder();
            String nameWithStringBuilder = fullNameWithStringBuilder.append(lastName).append(" ").append(middleName).append(" ").append(firstName).toString();

            if (!suffix.equals("")) {
                nameWithStringBuilder = fullNameWithStringBuilder.append(", ").append(suffix).toString();
            }

            System.out.print("Last name  : " + lastName + "\n");
            System.out.print("Middle name: " + middleName + "\n");
            System.out.print("First name : " + firstName  + "\n");
            System.out.print("Suffix     : " + suffix + "\n");

            System.out.print("full name  : " + fullName + "\n");
            System.out.println("StringBuilder Full name: " + nameWithStringBuilder);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

