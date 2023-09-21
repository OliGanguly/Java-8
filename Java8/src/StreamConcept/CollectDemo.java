package StreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(46);
        list.add(12);
        list.add(45);
        list.add(43);
//Collect demo
        Stream<Integer> stream = list.stream();
        Stream<Integer> filteredData = stream.filter(i->i>=15);
        List<Integer> collect = filteredData.collect(Collectors.toList());
//        collect.stream().forEach(i-> System.out.println(i));
//CountDemo-how many elements are there in the stream
//        long count = list.stream().filter(i -> i >= 15).count();//2
        long count = list.stream().count();//3
//        System.out.println("Count : " + count);

   //sort
   /*
   * sorted Method
   * */
//        List<Integer> sortedVal = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedVal);

        Stream<Integer> sorted = list.stream().sorted();
//        sorted.forEach(i-> System.out.println(i));
        //customized sorting order

       Stream<Integer> sortedData = list.stream().sorted((i1,i2)-> i2.compareTo(i1));
       sortedData.forEach(i-> System.out.println(i));
    }
}
