package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        rollDice(100);
    }


    /**
     *  loop based on user's input
     *
     *  each of the loop get two random numbers, if the sum of the random numbers = 2 or 4 or 6 or 7
     *  increment the variable: twoCounter, fourCounter, sixCounter, sevenCounter
     * @param times
     */
    public static void rollDice(int times) {

//        declaration and initialization
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;


//        create the two instance of Dice object
        Dice diceOne = new Dice();
        Dice diceTwo = new Dice();


//        loop 100 times
        for (int i = 0; i < times; i ++) {

//            call the instance method
            int dice1 = diceOne.rollTheDice();
            int dice2 = diceTwo.rollTheDice();

            System.out.println("Roll " + i + ":   " + dice1 + " - " + dice2 + "     Sum: " + (dice1 + dice2));

//            check if it meets condition, plus one. else not plus one.
            twoCounter = (dice1 + dice2 == 2) ? twoCounter + 1 : twoCounter;
            fourCounter = (dice1 +  dice2 == 4) ? fourCounter + 1 : fourCounter;
            sixCounter = (dice1 + dice2 == 6) ? sixCounter + 1 : sixCounter;
            sevenCounter = (dice1 + dice2 == 7) ? sevenCounter + 1 : sevenCounter;
        }

//        print out the result
        System.out.println("twoCounter: " + twoCounter);
        System.out.println("fourCounter: " + fourCounter);
        System.out.println("sixCounter: " + sixCounter);
        System.out.println("sevenCounter: " + sevenCounter);
    }
}