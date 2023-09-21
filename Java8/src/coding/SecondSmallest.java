package coding;

import java.util.Arrays;

public class SecondSmallest {
    public static void findSecondSmallest(int a[]){
     int second = Arrays.stream(a).sorted().skip(1).sum();

    }
    public static void main(String[] args) {
        int [] arr ={1,5,7,9,2};
        findSecondSmallest(arr);
    }
}
