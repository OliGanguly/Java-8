package StreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       list.add(3);
       list.add(2);
       list.add(7);
//        List<Integer> filtered_Result = list.stream().filter(i -> i > 20).collect(Collectors.toList());
//        filtered_Result.stream().forEach(x-> System.out.println(x));
//        Stream<Integer> sorted = list.stream().sorted((i1,i2)->i2.compareTo(i1));
//        sorted.forEach(x-> System.out.println(x));


        String [] names={"Oli","Oli1","Oliii2"};
        Stream.of(names).filter((i)->i.length()==3).forEach(System.out::println);
    }
}
