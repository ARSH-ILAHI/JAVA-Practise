package com.company;

public class Main {

    public static void main(String[] args) {
        sumDigits(1);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int Digit = number % 10;
            sum += Digit;
            number /= 10;

        }
        System.out.println("Sum " + sum);
        return sum;
    }
}
