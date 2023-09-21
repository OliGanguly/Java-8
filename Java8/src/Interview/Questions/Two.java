package Interview.Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Input -[10,28,87,10,20,75,28,80
* Output - [10,28]
* */
public class Two {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,28,87,10,20,75,28,80,80,80);
        Set<Integer>set=new HashSet<>();
//        list.stream().filter(x->set.add(x)).forEach(x-> System.out.println(x));
        //set.add()is not present add it and returns true
        //!set.add() filter out only those which returns false means they are duplicated
        list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.println(x));
    }
}
