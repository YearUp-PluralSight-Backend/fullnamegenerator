package com.pluralsight;

public class Score {

    private double number;


    public Score() {
    }

    public Score(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Score{" +
                "number=" + number +
                '}';
    }
}
