package Predicate;

import java.lang.reflect.Type;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //Function is again a predefined FunctionalInterface
        // R apply(T t)
        //return type can be anything
        //take some input perforn some operation return a result not necessary as a boolean
//      Function<Type,Return>
        Function<Integer,Integer> function = (a)->a*a;
        System.out.println(function.apply(5));
        //Function chaining
        /*
        * f1.andThen(f2).apply(Input) - first f1 then f2
        *  f1.andThen(f2).apply(Input) - first f2 then f1
        *  f1.andThen(f2).andThen(f3).apply(Input)
         * */
        Function<Integer,Integer> doubleIt = (a)->a*a;
        System.out.println("Double : " +doubleIt.apply(5));

        Function<Integer,Integer> cubeIt = (a)->a*a*a;
        System.out.println("Double : " +doubleIt.apply(5));

        System.out.println("First double using apply : "+doubleIt.andThen(cubeIt).apply(5));
        System.out.println("First cube using apply : "+doubleIt.compose(cubeIt).apply(5));
    }
}
