package cn.rayest.animal;

/**
 * Created by Rayest on 2016/12/18 0018.
 */
public class Application {

    public static void doSomething(Animal animal) {
        animal.say();
        animal.show();
        if (animal instanceof Dog) {
            animal.show();
        }
        if (animal instanceof Cat) {
            animal.show();
        }
    }

    public static void main(String[] args) {
        doSomething(new Dog());
        doSomething(new Cat());
    }
}
