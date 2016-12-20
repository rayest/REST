package cn.rayest.algorithm;

import java.util.Arrays;

/**
 * Created by Rayest on 2016/6/29 0029.
 */
public class ArraysApp {
    public static void main(String[] args) {
        int[] numberArray = {1, 10, 2, 0, 3, 54, 4, 18, 5, 6, -12, 7, 8, 9};

        System.out.println(Arrays.toString(numberArray));
        System.out.println(Arrays.binarySearch(numberArray, -12));
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

        for (int number : numberArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(numberArray, -12));
    }
}
