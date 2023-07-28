package ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        list.add(3);
//        list.add(4);
//        list.add(5);

        List<Integer> l= Arrays.asList(2,3,4,5);
//        System.out.println("Type"+(l));
        //way 1
         for(int i=0;i<l.toArray().length;i++){
             System.out.print(l.get(i)+" ");

         }
         //way 2
         for(int j : l){
             System.out.print(j+" ");
           }
         //way 3

         l.forEach(e-> System.out.println(e));
    }
}
