package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        double Method1Value = calcFeetAndInchesToCentimeters(6,15);
        System.out.println(Method1Value);
        double Method2Value = calcFeetAndInchesToCentimeters(30);
        System.out.println(Method2Value);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        } else {
            return (feet * 12 * 2.54) + (inches * 2.54);
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        } else {
            return (inches * 2.54);
        }
    }

}
