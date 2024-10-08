package com.pluralsight;

/**
 *  The {@code Dice}
 */
public class Dice {

    /**
     *  generating a random number between 1 - 7
     * @return integer
     */
    public int rollTheDice() {
        int minValue = 1;
        int maxValue = 7;
        int randomNumber = (int) (Math.random() * maxValue) + minValue;
        return randomNumber;
    }
}
