package Interview.Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//count the no of occurrence of words in a given string
//" I am Oli I am a Femaile"
//I - 2
//am-2
//Oli-1
//a-2
//Female-1
public class One {
    public static void main(String[] args) {
        String str="I am Oli I am a Female Oli";
        List<String> list = Arrays.asList(str.split(" "));
//        System.out.println(list);
        //create a map key - string value- occurence
        //kind of groupByclouse collect same element return count
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);
        Function<String,String> fn = Function.identity();//returns its input

        String string ="I am Oli Oli I am I am a Female";
        List<String> list1 = Arrays.asList(string.split(" "));
        System.out.println(list1);
        list1.stream().filter(name->Collection.frequency)
        //Map -Key:Value
        //collect-groupingBy-create a key value pair , ist args Function ->makes input as a key : second one os value
        //key is my input : fun.identity returns what it gets
        Map<String,Long> map = list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream().forEach(i-> System.out.println("Oli : "+i.getKey()+" : "+i.getValue()));

        Set<String> strings = map.keySet();
        Set<Map.Entry<String, Long>> entries = map.entrySet();
        for (Map.Entry<String, Long> i :entries){
            System.out.println(i.getKey()+ " - "+i.getValue());
        }
        System.out.println("/////////////////////////////////////////");
        strings.forEach(i-> System.out.println(i + " = " + map.get(i)));




    }
}
