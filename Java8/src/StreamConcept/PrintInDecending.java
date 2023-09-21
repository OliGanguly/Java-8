package StreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PrintInDecending {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=20;i<=40;i++){
            list.add(i);
        }
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
//        collect.forEach(i-> System.out.println(i));
        System.out.println("/////////////////////////////////");
        List<Integer> d_collect = list.stream().filter(i -> i % 2 == 0).sorted((a1,a2)->a2.compareTo(a1)).collect(Collectors.toList());
//        d_collect.forEach(i-> System.out.println(i));
        //min max
        //min in assending order
        Integer i = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        Integer j = list.stream().min((i1, i2) -> i2.compareTo(i1)).get();
        System.out.println("Min : " + i);
        System.out.println("Min Decending: " + j);
        //max in assending order
        Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        Integer maxdecending = list.stream().max((i1, i2) -> i2.compareTo(i1)).get();
        System.out.println("Max : " + max);
        System.out.println("Max dec: " + maxdecending);

    }
}
