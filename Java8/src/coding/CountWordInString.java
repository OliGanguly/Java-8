package coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordInString {
    public static void main(String[] args) {
//        String str = "Hi Hi I am Oli Oli Ganguly";
//        List<String> list = Arrays.asList(str.split(" "));
////        System.out.println(list);
//        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//  collect.entrySet().forEach(x-> System.out.println(x.getKey() + " = "+x.getValue()));
//        Function<String,String> fn = Function.identity();
//        System.out.println(fn.apply("Oli"));//collect each words

        String str = "Hi Hi I am am Oli Oli Ganguly Oli Oli";
        List<String> list = Arrays.asList(str.split(" "));
//        System.out.println(list);
        Map<String, Long> resultDataSet = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        resultDataSet.entrySet().forEach(x-> System.out.println(x.getKey()+"="+x.getValue()));
//        Function<String,String> fn = Function.identity();//collect each word
//        System.out.println(fn.apply("OLI fdgdfh"));
    }
}
