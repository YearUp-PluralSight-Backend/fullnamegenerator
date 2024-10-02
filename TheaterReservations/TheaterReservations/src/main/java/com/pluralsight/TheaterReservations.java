package com.pluralsight;

import java.time.LocalDate;

/**
 *
 * The TheaterReservations ask user's reservation information and then printout
 * It has three fields : fullName, reservationDate, numberOfTickets
 * one non-parameters constructor and one with parameters
 * One method to print out the user's reservation information
 *
 */


public class TheaterReservations {

    private String fullName;

    private LocalDate reservationDate;

    private int numberOfTickets;



//    constructors, getter and setters
    public TheaterReservations() {
    }

    public TheaterReservations(String fullName, LocalDate reservationDate, int numberOfTickets) {
        this.fullName = fullName;
        this.reservationDate = reservationDate;
        this.numberOfTickets = numberOfTickets;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }


    /**
     * format the reservationInfo to print out
     */
    public void printReservationInfo() {

        String reservationInfo;
        String notes = "Have a wonder day!";

        reservationInfo =(numberOfTickets > 1) ? String.format(
                """
                        Reservation Details:
                        -----------------------
                        Name        : %s
                        Date        : %s
                        Guests      : %d
                        Notes:      : %s
                        -----------------------
                        %d tickets reserved for %s under %s.
                        """,
                this.fullName,
                this.reservationDate.toString(),
                this.numberOfTickets,
                notes,
                this.numberOfTickets,
                this.reservationDate,
                this.fullName
        ) : String.format(
                        """
                        Reservation Details:
                        -----------------------
                        Name        : %s
                        Date        : %s
                        Guests      : %d
                        Notes:      : %s
                        -----------------------
                        %d ticket reserved for %s under %s.
                        """,
                this.fullName,
                this.reservationDate.toString(),
                this.numberOfTickets,
                notes,
                this.numberOfTickets,
                this.reservationDate,
                this.fullName
                );

        System.out.println(reservationInfo);
    }


    @Override
    public String toString() {
        return "TheaterReservations{" +
                "fullName='" + fullName + '\'' +
                ", reservationDate=" + reservationDate +
                ", numberOfTickets=" + numberOfTickets +
                '}';
    }
}

