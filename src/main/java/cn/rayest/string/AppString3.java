package cn.rayest.string;

/**
 * Created by Rayest on 2016/6/29 0029.
 */
public class AppString3 {
    public static void main(String[] args) {
        String s = "13579";
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = s.charAt(i);

        }
        for (int i: array){
            System.out.print(i + " ");
        }
    }
}
