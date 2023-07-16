package org.example.Arrays_01;
import java.util.Arrays;

public class Arrays05RotateTriangle {
    public static Object[] rotateRight(Object[] arr) {
        // rotate the array such that
        // input: {1, 2, 3, 4, 5}
        // output: {5, 1, 2, 3, 4}

        Object[] result = new Object[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                result[i] = arr[arr.length - 1];
//            } else if (i == arr.length) {
//                result[i] = arr[0];
//            } else {
//                result[i] = arr[i - 1];
//            }
//        }
//        return result;
        for (int i = 0; i < arr.length; i++) {
            result[(i+1) % result.length] = arr[i];
        }
        return result;
    }

    public static void main(String args[]) {
        Object[] arr = new Integer[] {1, 2, 3, 4, 5};

        arr = rotateRight(arr);
        System.out.println(Arrays.toString(arr));
        arr = rotateRight(arr);
        System.out.println(Arrays.toString(arr));
        arr = rotateRight(arr);
        System.out.println(Arrays.toString(arr));
        arr = rotateRight(arr);
        System.out.println(Arrays.toString(arr));
        arr = rotateRight(arr);
        System.out.println(Arrays.toString(arr));

        Object[] arr2 = new String[] {"Hello", "there", "my friend"};

        arr2 = rotateRight(arr2);
        System.out.println(Arrays.toString(arr2));
        arr2 = rotateRight(arr2);
        System.out.println(Arrays.toString(arr2));
        arr2 = rotateRight(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
