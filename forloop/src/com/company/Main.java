package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count =0;
        for (int i=1; i<1000; i++) {
            if ((i % 3)==0 && (i % 5) ==0) {
                sum += i;
                System.out.println("Number is " + i);
                count++;
                if (count == 5) {
                    System.out.println("Five consecutive numbers reached");
                    break;
                }
            }

        }
    }
}
