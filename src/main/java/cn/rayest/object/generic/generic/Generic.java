package cn.rayest.object.generic.generic;

/**
* Created by Rayest on 2016/12/18 0018.
*/
class Generic<T>{
   private T number;

   public Generic(T number) {
       this.number = number;
   }

   public T getNumber() {
       return number;
   }

   public void setNumber(T number) {
       this.number = number;
   }

   public void print(){
       System.out.println("1" + number.getClass().getName());
   }
}
