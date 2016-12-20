package cn.rayest.object.clazz;

/**
 * Created by Rayest on 2016/12/18 0018.
 */
public class Clazz {
    private Integer a;

    public Clazz(Integer a) {
        this.a = a;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void print(){
         System.out.println(a.getClass().getName());
    }
}
