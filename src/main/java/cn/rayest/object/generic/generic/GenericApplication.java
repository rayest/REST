package cn.rayest.object.generic.generic;

/**
 * Created by Rayest on 2016/6/29 0029.
 */

public class GenericApplication {
    public static void main(String[] args) {
        Generic generic = new Generic(123);
        generic.print();

        Generic c3 = new Generic("Hello");
        c3.print();

        Generic<Integer> c4 = new Generic<Integer>(456);
        c4.print();
    }
}

