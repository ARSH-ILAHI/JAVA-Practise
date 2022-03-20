package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int elem = readInteger();
        int[] myArray = readIntegers(elem);
        System.out.println("Min Value : "+ findMin(myArray));
        
    }

    public static int readInteger() {
        System.out.println("Enter the number of Elements : \r");
        int elem = scanner.nextInt();
        scanner.nextLine();
        return elem;
    }
    public static int[] readIntegers(int elem) {
        System.out.println("Enter "+ elem + " Elements : \r");

        int[] array = new int[elem];
        for (int i=0; i<elem; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array) {

        int[] sortDesc = new int[array.length];
        for (int i=0; i<array.length; i++){
            sortDesc[i] = array[i];
        }

        boolean flag = true;
        int temp ;
        while(flag) {
            flag = false;
            for (int i=0; i< sortDesc.length-1; i++){
                if (sortDesc[i] < sortDesc[i+1]) {
                    temp = sortDesc[i];
                    sortDesc[i]= sortDesc[i+1];
                    sortDesc[i+1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(sortDesc));
        return sortDesc[sortDesc.length-1];
    }
}
