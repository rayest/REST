package cn.rayest.object.generic.extend;

/**
 * Created by Rayest on 2016/12/18 0018.
 */
public class Generic<T extends Person>{
    private T object;

    public Generic(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void print(){
        System.out.println("4" + object.getClass().getName());
    }
}
