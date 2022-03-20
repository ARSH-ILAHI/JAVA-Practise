package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);

        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));

        int myNum = 2_147_483_646;

        Byte myMinVal = Byte.MIN_VALUE;
        Byte myMaxVal = Byte.MAX_VALUE;

        System.out.println("Byte Min Value = " + myMinVal);
        System.out.println("Byte Max Value = " + myMaxVal);


        Short myShortMinVal = Short.MIN_VALUE;
        Short myShortMaxVal = Short.MAX_VALUE;

        System.out.println("Short Min Value = " + myShortMinVal);
        System.out.println("Short Max Value = " + myShortMaxVal);

        Long myLongVal = 100L;

        Long myLongMinVal = Long.MIN_VALUE;
        Long myLongMaxVal = Long.MAX_VALUE;

        System.out.println("Long Min Value = " + myLongMinVal);
        System.out.println("Long Max Value = " + myLongMaxVal);

        short myNewShortVal = (short) (myShortMinVal / 2);

    }
}
