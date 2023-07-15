package org.example.Arrays_01;

import java.util.Arrays;

public class Arrays02Iterate {
    public static void main(String[] args){
        // declaring an integer array with the following 4 values
        int[] arr = new int[] {92, 12, 38, 74};

        System.out.println();
        // for loop forwards
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // for loop backwards
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        System.out.println();

        // for in loop
        for (int item: arr){
            System.out.println(item);
        }
        System.out.println();
        // Java Streams
        Arrays.stream(arr).forEach(System.out::println);
        // Arrays.stream(arr).filter()
        // Arrays.stream(arr).average()
        // Arrays.stream(arr).sum()
    }
}
