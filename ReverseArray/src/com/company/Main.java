package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array is " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse Array is " + Arrays.toString(array));

    }

    private static void reverse(int[] array) {
        int maxIdx = array.length - 1;
        int halfIdx = array.length / 2;

        for (int i = 0; i < halfIdx; i++) {
            int temp = array[i];
            array[i] = array[maxIdx - i];
            array[maxIdx - i] = temp;
        }
    }
}
