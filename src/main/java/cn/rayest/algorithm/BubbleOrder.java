package cn.rayest.algorithm;

/**
 * Created by Rayest on 2016/6/29 0029.
 */
public class BubbleOrder {

    public static void main(String[] args) {
        int tem;
        int[] numberArray = {4, 21, 0, -12, -3, 100, -123, 34, 2, 432};
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = 0; j < numberArray.length - 1 - i; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    tem = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = tem;
                }
            }
        }
        for (int i : numberArray) {
            System.out.print(i + " ");
        }
    }
}
