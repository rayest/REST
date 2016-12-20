package cn.rayest.object.generic.extend;

/**
 * Created by Rayest on 2016/6/29 0029.
 */
public class GenericApplication {
    public static void main(String[] args) {
        Generic<Student> generic1 = new Generic<Student>(new Student());
        Student student = generic1.getObject();
        student.print();
    }
}

