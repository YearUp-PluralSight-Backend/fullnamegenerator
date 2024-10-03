package com.pluralsight;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        String name = askUserForString();

        System.out.println("Enter your street: ");
        String street = askUserForString();

        System.out.println("Enter your city: ");
        String city = askUserForString();

        System.out.println("Enter your state: ");
        String state = askUserForString();

        System.out.println("Enter your zipCode: ");
        String zipCode = askUserForString();

        AddressBuilder addressBuilder = new AddressBuilder(street, city, state, zipCode);
        addressBuilder.setName(name);
        addressBuilder.setBillingAddress();
        addressBuilder.setShippingAddress();


        System.out.println(addressBuilder.toString());




    }

    private static String askUserForString() {

        String stringValue = "";
        Scanner scanner = new Scanner(System.in);
        stringValue = scanner.nextLine().trim();

        return stringValue;
    }
}