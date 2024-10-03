package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in) ) {
            System.out.println("Please enter a game score:");
            String gameScore = scanner.nextLine().trim();
            HighScoreWins highScoreWins = new HighScoreWins(gameScore);
            highScoreWins.printWinner();
//            Java:Python|20:40

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public static String askForString() {
        Scanner scanner = new Scanner(System.in);
        String gameScore = scanner.nextLine().trim();
        scanner.close();
        return gameScore;
    }


}