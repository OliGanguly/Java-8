package Interview;

import java.util.Arrays;
import java.util.List;

interface A{
    default void show(){
        System.out.println("I am a Interface");
    }
    //you can not provide default implementation of hashcode to the classess
    //default method can not override java.lang.Object class
//    default  int hashCode(){
//        //common implementation
//        return 2*4;
//    }
}
public class OverrideDefaultMethod implements A{
     public  void show(){


    }
    public static void main(String[] args) {
       A a=new OverrideDefaultMethod();
       a.show();
//        Interview.OverrideDefaultMethod obj = new Interview.OverrideDefaultMethod();
//        obj.show();
//        List<Integer> list = Arrays.asList(12,34);
//        list.stream()
    }
}
