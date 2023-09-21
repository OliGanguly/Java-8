package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=10;i<=20;i++){
            list.add(i);
        }
       List<Integer> evenList =   list.stream().filter(i -> i % 2 == 0).sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
        evenList.forEach(i-> System.out.println(i));

    }
}
