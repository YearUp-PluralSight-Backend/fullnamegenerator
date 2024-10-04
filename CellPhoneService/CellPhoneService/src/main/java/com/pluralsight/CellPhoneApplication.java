package com.pluralsight;


import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {


        CellPhone cellPhone = new CellPhone();

        // input
        System.out.print("What is the serial number? ");
        int serialNumber = Integer.parseInt(askForInput());

        System.out.print("What model is the phone? ");
        String model = askForInput();

        System.out.print("Who is the carrier? ");
        String carrier = askForInput();

        System.out.print("What is the phone number? ");
        String phoneNumber = askForInput();

        System.out.print("Who is the owner of the phone? ");
        String owner = askForInput();

        // processing
        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setOwner(owner);

        // output
        System.out.println("\n");
        System.out.println("serialNumber: " + cellPhone.getSerialNumber());
        System.out.println("model: " + cellPhone.getModel());
        System.out.println("carrier: " + cellPhone.getCarrier());
        System.out.println("phoneNumber: " + cellPhone.getPhoneNumber());
        System.out.println("owner: " + cellPhone.getOwner());

    }

    public static String askForInput() {
        Scanner scanner = new Scanner(System.in);
        String value  = scanner.nextLine().trim();
        return value;
    }

    public static void printData(String words, String data) {
        System.out.println(words + data);
    }
}