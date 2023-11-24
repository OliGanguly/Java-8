package StreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//toArray()
//Copy elements present in a stream to specified array
public class ArrayConcept {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for (int i=10;i<=20;i++){
            list.add(i);
        }
        //return object  array
        Object[] array = list.stream().filter(i -> i % 2 == 0).toArray();
        for (Object o:array){
            System.out.println(o);
        }

    }
}
