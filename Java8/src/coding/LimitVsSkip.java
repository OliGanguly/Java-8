package coding;

import java.util.Arrays;
import java.util.List;

public class LimitVsSkip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60);
        list.stream().limit(3).forEach(System.out::println);//print a stream of max size n
        list.stream().skip(3).forEach(System.out::println);//discard n elements
    }
}
