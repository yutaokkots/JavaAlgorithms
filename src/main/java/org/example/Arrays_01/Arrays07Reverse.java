package org.example.Arrays_01;
import java.util.Arrays;

public class Arrays07Reverse {
    public static void reverse(int[] arr) {
        // create a program that reverses an array *in place*
        // input {9,3,4,1} -> {1,4,3,9}
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left ++;
            right --;
        }
    }

    public static void main(String args[]) {
        int[] arr = new int[] {};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] arr2 = new int[] {1};
        System.out.println(Arrays.toString(arr2));
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        int[] arr3 = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(arr3));
        reverse(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        int[] arr4 = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr4));
        reverse(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println();

        int[] arr5 = new int[] {9, 3, 4, 1};
        System.out.println(Arrays.toString(arr5));
        reverse(arr5);
        System.out.println(Arrays.toString(arr5));
        System.out.println();

        int[] arr6 = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr6));
        reverse(arr6);
        System.out.println(Arrays.toString(arr6));
        System.out.println();
    }
}
