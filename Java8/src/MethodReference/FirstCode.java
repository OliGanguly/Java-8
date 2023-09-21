package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FirstCode {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("oli","abc");

//        list.forEach((str)-> System.out.println(str));
        list.forEach(System.out::println);
    }
}
