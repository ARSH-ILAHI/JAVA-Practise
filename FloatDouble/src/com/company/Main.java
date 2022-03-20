package com.company;

public class Main {

    public static void main(String[] args) {
//	    float myFloatminVal = Float.MIN_VALUE;
//        float myFloatmaxVal = Float.MAX_VALUE;
//
//        //System.out.println(myFloatminVal);
//        //System.out.println(myFloatmaxVal);
//
//        int myIntVal = (int) 5.95;
//        float myFloatVal = 5.25F;
//        double myDoubleVal = 5.25;
        //System.out.println(myIntVal);
        //System.out.println(myFloatVal);
        //System.out.println(myDoubleVal);

        /*double myWeighPd = 200d;
        double myWeighKg = myWeighPd * 0.45359237d;
        System.out.println("The Weight " + myWeighPd + " Pd = " + myWeighKg + " Kgs!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Not Alien");

        }
        boolean VW = true;
        boolean Skoda = VW ? true:false;
        if (Skoda) {
            System.out.println("Skoda is " + Skoda);
        }
        if (VW) {
            System.out.println("VW is " + Skoda);
        }*/

//        double Val1 = 20.00d;
//        double Val2 = 80.00d;
//        double Val3 = (Val1 + Val2) * 100.00d;
//        double Val4 = Val3 % 40.00d;
//
//        boolean Val5 = (Val4 == 0) ? true : false;
//
//        if (Val5){
//            System.out.println("Boolean output is " + Val5);
//        } else {
//            System.out.println("Boolean output is " + Val5);
//        }
//        int a = 5;
//        int b = 0;
//
//        if (true) {
//            b = a;
//        }
//        System.out.println("Print " + b);


        int highScore = CalcScore(true, 800, 5, 100);
        System.out.println("Your final score is : " + highScore);

        highScore = CalcScore(true, 10000, 8, 200);
        System.out.println("Your final score is : " + highScore);
    }

    public static int CalcScore(boolean GameOver, int score, int levelcompleted, int bonus) {
        if (GameOver) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 1000;
            return finalscore;
        }
            return -1;

    }

}
