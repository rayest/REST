package cn.rayest.object;

/**
 * Created by Rayest on 2016/6/29 0029.
 */
public class CodeBlock {
    {
        System.out.println("1");
    }

    static {
        System.out.println("2");
    }

    public CodeBlock() {
        System.out.println("3");
        System.out.println();
    }

    public CodeBlock(int i) {
        System.out.println("4");
        System.out.println();
    }

    public CodeBlock(int i, int j) {
        System.out.println("5");
    }

    public static void main(String[] args) {
        new CodeBlock();
        new CodeBlock(2);
        new CodeBlock(2, 3);
    }
}
