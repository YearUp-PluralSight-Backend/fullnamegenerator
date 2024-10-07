package com.pluralsight;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *  The Main class provides a way to execute the TheaterReservations' class method!
 *  It basically asks user for name, reservation date, and number of tickets
 *  and then print out the result.
 */
public class Main {


    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter your name: ");
            String name  = scanner.nextLine();

            System.out.println("Pick the date: (MM/dd/yyyy) ");
            String date = scanner.nextLine();

            System.out.println("How many tickets would you like to buy? ");
            int tickets = scanner.nextInt();


//            Date formatter
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
            dateTimeFormatter = dateTimeFormatter.withLocale(Locale.US);
            LocalDate reservationDate = LocalDate.parse(date, dateTimeFormatter);


//            Create an instance of TheaterReservations with three arguments and call the function.
            TheaterReservations theaterReservations = new TheaterReservations(name, reservationDate, tickets);
            theaterReservations.printReservationInfo();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}