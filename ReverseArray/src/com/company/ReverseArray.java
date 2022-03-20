package com.company;

public class ReverseArray {

    private static void reverse(int[] array) {
        int maxIdx = array.length - 1;
        int halfIdx = array.length / 2;

        for (int i=0; i< halfIdx; i++) {
            int temp = array[i];
            array[i] = array[maxIdx - i];
            array[maxIdx - i] = temp;
        }
    }
}
