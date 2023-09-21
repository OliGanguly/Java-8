package Interview.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Diff between Limit and skip*/
public class Four {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,23,45,24,56,78);
        list.stream().limit(3).forEach(i-> System.out.println(i));//Return a new stream of size n
        list.stream().skip(2).forEach(i-> System.out.println(i));//skip or discard first n elements

    }
}
