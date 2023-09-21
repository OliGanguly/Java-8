package Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        /*Consumer
        * Takes any type returns nothing Consumer<T>
        public void accept(T t)
        * */

        Consumer<Integer> squareMe = (a) -> System.out.println("Result : "+ a*a);
        squareMe.accept(6);
    }
}
