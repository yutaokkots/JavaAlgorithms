package org.example.Arrays_01;

import java.util.Arrays;


public class Arrays03arraymethod {
    public static Integer findSecondSmallestItem2(Integer[] arr){
        if (arr.length <= 1){
            return null;
        }
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] != arr[i+1]){
                return arr[i+1];
            }
        }
        return null;
    }

    public static Integer findSecondSmallestItem(Integer[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int item: arr){
            // if item is smaller than secondSmallest, then it is smallest
            if (item < secondSmallest && item > smallest){
                secondSmallest = item;
            }
            else if (item < secondSmallest && item < smallest){
                secondSmallest = smallest;
                smallest = item;
            }
            if (item < smallest) {
                smallest = item;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE){
            return 0;
        } else {
            return secondSmallest;
        }
    }

    public static void main(String args[]) {
        Integer[] arr = new Integer[]{ 5, 8, 3, 2, 6 };
        System.out.println(findSecondSmallestItem(arr));

        Integer[] arr2 = new Integer[]{ 3, 8, 5, 2, 6 };
        System.out.println(findSecondSmallestItem(arr2));

        Integer[] arr3 = new Integer[]{ 6, 8, 5, 2, 3 };
        System.out.println(findSecondSmallestItem(arr3));

        Integer[] arr4 = new Integer[]{ 3, 3, 3, 3, 3 };
        System.out.println(findSecondSmallestItem(arr4));

        Integer[] arr5 = new Integer[]{ 3, 3, 3, 2, 3 };
        System.out.println(findSecondSmallestItem(arr5));

        Integer[] arr6 = new Integer[]{ 3, 4, 3, 3, 3 };
        System.out.println(findSecondSmallestItem(arr6));

        Integer[] arrEmpty = new Integer[] {};
        System.out.println(findSecondSmallestItem(arrEmpty));

        Integer[] arrOne = new Integer[] { 1 };
        System.out.println(findSecondSmallestItem(arrOne));
    }

}

