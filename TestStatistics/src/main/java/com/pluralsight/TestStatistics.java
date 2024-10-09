package com.pluralsight;

/**
 * This class provides a way to calculate the average of score, lowest score, highest score.
 * There are four variables to score the scores[], average, lowestScore, highestScore.
 * Five methods: initializingScores, getHighScore, getAverageScore, getLowScore, displayArray
 */
public class TestStatistics {

    public static void main(String[] args) {

        Score[] scores = initializingScores();
        double average = getAverageScore(scores);
        double lowScore = getLowScore(scores);
        double highScore = getHighScore(scores);

        System.out.printf("Average score: %.3f".formatted(average));
        System.out.printf("Lowest  score: %.3f".formatted(lowScore));
        System.out.printf("Highest score: %.3f".formatted(highScore));

        displayArray(scores);


    }

    public static void displayArray(Score[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {
            System.out.printf( "%d :  %.2f \n".formatted(i + 1, scores[i].getNumber()));
        }
    }

    public static double getLowScore(Score[] scores) {
        double lowestScore = 0;
        for (int i = 0; i < scores.length - 1; i++) {

            if (scores[i].getNumber() > scores[i + 1].getNumber()) {
                lowestScore = scores[i + 1].getNumber();
            }
        }
        return lowestScore;
    }

    public static double getAverageScore(Score[] scores) {

        double average = 0;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {

            sum += scores[i].getNumber();

        }

        average = sum / scores.length;

        return average;
    }


    public static double getHighScore(Score[] scores) {

        double highestScore = 0;
        for (int i = 0; i < scores.length - 1; i++) {

            if (scores[i].getNumber() > scores[i + 1].getNumber()) {
                highestScore = scores[i].getNumber();

            }
        }

        return highestScore;
    }


    public static Score[] initializingScores() {

        Score[] scores = new Score[10];
        for (int i = 0; i < 10; i++) {
            double random = Math.random() * 100;
            Score score = new Score(random);
            scores[i] = score;
        }
        return scores;
    }
}
