package com.pluralsight;

import java.util.Scanner;

public class FullnameGenerator {

    public static void main(String[] args) {

        FullnameGenerator fullnameGenerator = new FullnameGenerator();
        fullnameGenerator.nameGenerate1();
        fullnameGenerator.nameGenerate2();
        fullnameGenerator.nameGenerate3();
    }

    private void nameGenerate3() {
        StringBuilder fullNameWithStringBuilder = new StringBuilder();


        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Please enter your name: ");
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Middle name: ");
            String middleName = scanner.nextLine();

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Suffix: ");
            String suffix = scanner.nextLine();



            String fullName = firstName + (middleName.isBlank()? "" : " " + middleName + " ") + lastName + (suffix.isBlank()? "" : ", " + suffix);

            System.out.println("Full name: " + fullName);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void nameGenerate2() {
        StringBuilder fullNameWithStringBuilder = new StringBuilder();


        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Please enter your name: ");
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Middle name: ");
            String middleName = scanner.nextLine();

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Suffix: ");
            String suffix = scanner.nextLine();

            middleName += middleName.isBlank()? "" : " " + middleName + " ";
            suffix += suffix.isBlank()? "" : ", " + suffix;

            String fullName = firstName + middleName + lastName + suffix;

            System.out.println("Full name: " + fullName);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Ask user to enter their firstName, middle name, last name, and suffix.
     *
     */
    public void nameGenerate1() {

        StringBuilder fullNameWithStringBuilder = new StringBuilder();


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
            String fullName = "";


//          one way
            if (suffix.isBlank() && middleName.isBlank()) {
                fullName = firstName + " " + lastName;
            } else {
                if (suffix.isBlank()) {
                    fullName = firstName + " " + middleName + " " + lastName;
                } else if (middleName.isBlank()) {
                    fullName = firstName + " " + lastName + ", " + suffix;
                } else {
                    fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;

                }
            }

            System.out.print("Last name  : " + lastName + "\n");
            System.out.print("Middle name: " + middleName + "\n");
            System.out.print("First name : " + firstName  + "\n");
            System.out.print("Suffix     : " + suffix + "\n");

            System.out.print("full name  : " + fullName + "\n");
//            System.out.println("StringBuilder Full name: " + nameWithStringBuilder);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

