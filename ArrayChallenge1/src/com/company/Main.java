package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        int[] sortedArray = sortIntegers(myArray);
        printArrays(sortedArray);

    }

    public static int[] getIntegers (int elements) {
        Scanner scanner = new Scanner(System.in);
        int[] myarray = new int[elements];
        System.out.println("Enter "+ elements+ " values below: \r");
        for (int i=0; i<elements; i++) {
            myarray[i] = scanner.nextInt();
        }
        scanner.close();
        return myarray;
    }

    public static void printArrays (int[] array) {
        for (int i=0; i < array.length; i++){
            System.out.println("Element at "+ i + " is "+ array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sorted = new int[array.length];
        for (int i=0; i<array.length;i++){
            sorted[i] = array[i];
        }

        boolean flag = true;
        int temp ;

        while(flag) {
            flag = false;
            for (int i =0; i < sorted.length-1; i++) {
                if (sorted[i] < sorted[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
