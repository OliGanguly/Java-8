package FI;

import java.util.function.BiConsumer;

public class FuncationalInterface {
    /*
    * A functional interface is an interface that contains only one abstract method.
    * They can have only one functionality to exhibit.
    *  From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
    *  A functional interface can have any number of default methods. Runnable,
    * ActionListener, and Comparable are some of the examples of functional interfaces.
     * */
    //Functional Interface is used to provide reference to lambda expression
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(3,5);
    }
}
