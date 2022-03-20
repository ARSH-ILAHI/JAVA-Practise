package com.company;

public class Main {

    public static void main(String[] args) {

        char NewVar = 'A';
        switch (NewVar) {
            case 'A':
            case 'B': case 'C': case 'D': case 'E':
                System.out.println("Either of A, B, C, D or E");
                break;
            default:
                System.out.println("None of ABCDE");
                break;
        }
    }
}
