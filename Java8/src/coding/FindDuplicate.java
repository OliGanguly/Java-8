package coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
* Input [10,20,30,30,40,40]
* output= 30,40
* */
public class FindDuplicate {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(10,20,30,30,40,40,70,70,90,90,90);
       Set<Integer> set = new HashSet<>();
       list.stream().filter(x-> !set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
