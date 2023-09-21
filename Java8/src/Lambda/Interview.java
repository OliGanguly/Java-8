package Lambda;

import java.util.function.BiConsumer;

public class Interview {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer =(i,j)-> System.out.println(i+j);
        biConsumer.accept(3,6);
    }
}
