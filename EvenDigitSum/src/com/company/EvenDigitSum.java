package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int number2 = number;
        int instDigit = 0;

        while (number2 > 0) {
                instDigit = number2 % 10;
                if (instDigit % 2 == 0) {
                    sum += instDigit;
                }
                number2 /= 10;
        }
        return sum;
    }
}
