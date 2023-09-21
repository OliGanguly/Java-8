package StreamConcept;

import java.util.Arrays;
import java.util.List;

public class ReducePeek {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        list.stream().map(i->i+2).filter(i->i>=5).forEach(i-> System.out.println(i));
//        System.out.println(list.stream().map(i -> i + 2).filter(i -> i >= 5).peek(System.out::println));
//        System.out.println(count);
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6);
        //combine elements return single value
        //acc - value of previous instance
        //current is current one
        Integer i = arrayList.stream().reduce((acc, current) -> current + acc).get();
        System.out.println(i);
    }
}
