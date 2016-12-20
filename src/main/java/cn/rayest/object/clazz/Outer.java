package cn.rayest.object.clazz;

/**
 * Created by Rayest on 2016/6/29 0029.
 */
public class Outer {
    int a = 1;

    public class Inner {
        public void show() {
            System.out.println("1");
            System.out.println("2" + a);
        }
    }

    public void show() {
        Inner inner = new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
