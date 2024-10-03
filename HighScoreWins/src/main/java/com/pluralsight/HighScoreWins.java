package com.pluralsight;

/**
 * The HighScoreWins class provides a way to split the user's input, which is String
 * it compares their scores and print out the winner's name
 */
public class HighScoreWins {

    // storing the user's input
    private StringBuilder userGameScore;

    /**
     * default constructor
     */
    HighScoreWins() {}

    /**
     * constructor with one String type argument
     * accept an input as the user's name and score
     * @param userGameScore
     */
    public HighScoreWins(String userGameScore) {

        if (userGameScore.length() < 0) {
            throw  new RuntimeException("the input length is not valid.");
        }

        this.userGameScore =  new StringBuilder(userGameScore);
    }

    /**
     * split users' name and scores
     * compare their score and print the one who is highest.
     */
    public void printWinner() {

        String[] data = filteringData();

        String userOne  = data[0];
        String userTwo  = data[1];
        Double scoreOne = Double.parseDouble(data[2]);
        Double scoreTwo = Double.parseDouble(data[3]);

        if (scoreOne > scoreTwo) {
            System.out.println("Winner: " + userOne);
        } else if (scoreOne < scoreTwo) {
            System.out.println("Winner: " + userTwo);
        } else {
            System.out.println("Tied");
        }

        System.out.println(userOne  + " has " + scoreOne + " scores");
        System.out.println(userTwo + " has " + scoreTwo + " scores");


    }

    public String[] filteringData() {
        int firstColon= userGameScore.indexOf(":"); // get the split symbol between users
        int verticalBar = userGameScore.indexOf("|"); // get the split symbol between users and scores

//        get the user's name
        String userOne = userGameScore.substring(0, firstColon);
        String userTwo = userGameScore.substring(firstColon + 1, verticalBar);

        String scores = userGameScore.substring(verticalBar, userGameScore.length()); // get the score part of String
        int secondColon = scores.indexOf(":"); // get the split symbol between scores

//        get the scores
        String scoreOne = scores.substring(1, secondColon);
        String scoreTwo = scores.substring(secondColon + 1, scores.length());

        return new String[] {userOne, userTwo, scoreOne, scoreTwo};
    }
}
