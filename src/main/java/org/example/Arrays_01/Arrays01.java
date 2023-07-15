package org.example.Arrays_01;

public class Arrays01 {
    public static void main(String[] args){

        // declare an array of doubles of size 5 that has element value of 0
        double[] lotteryNumsArray = new double[5];

        double[] lotteryNums = {45, 92, 38, 33, 21};

        System.out.println(lotteryNumsArray);
        System.out.println(lotteryNums[2]);
        System.out.println(lotteryNumsArray[0]);
        lotteryNumsArray[0] = 24;
        System.out.println(lotteryNumsArray[0]);
    }
}
