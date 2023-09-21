package StreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoWithOutStream {
    public static List<Integer> findElements(List<Integer> arr){
        List<Integer> newList = new ArrayList<>();
        for(int i : arr){
            if(i>=15){
                newList.add(i);
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);  arr.add(30);
        List<Integer> resultList = StreamDemoWithOutStream.findElements(arr);
        for (int j : resultList){
//            System.out.print(j);
        }
        //with stream
        System.out.println("With stream");
        List<Integer> collect = arr.stream().filter(i -> i >= 15).collect(Collectors.toList());
//        collect.forEach(i-> System.out.println(i));
        //find i>=15

       List<Integer> list = new ArrayList<>();
       for(int i=1;i<=10;i++){
           list.add(i);
       }
       List<Integer> result = list.stream().filter(i->i%2==0).collect(Collectors.toList());
       List<Integer> mapResult = list.stream().map(i->i*2).collect(Collectors.toList());
//        result.forEach(j-> System.out.println(j));
//        mapResult.forEach(j-> System.out.println(j));



    }



}
/* Stream source - arrayList/ collection
* .stream() method creates a stream Instance from u
* Perfrom Intermediate Operations Filter / map /sort
* terminal operations Collect , Count , Collection , Collecting
* Produce result
* */
