package com.company;

public class Main {

    public static void main(String[] args) {
        double score = 50;

        displayHighScorePosition("Arun", score);

        int Position = calculateHighScorePosition(score);
        System.out.println("The Calculated position of score " + score + " is " + Position);
    }

    public static void displayHighScorePosition(String Name, double score) {
        if (score > 1000) {
            System.out.println(Name + " Managed to get into Position 1");
        } else if (score > 500 && score < 1000){
            System.out.println(Name + " Managed to get into Position 2");
        } else if (score > 100 && score < 500) {
            System.out.println(Name + " Managed to get into Position 3");
        } else {
            System.out.println(Name + " Managed to get into Position 4");
        }
    }

    public static int calculateHighScorePosition(double score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000){
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
