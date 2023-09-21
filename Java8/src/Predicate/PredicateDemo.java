package Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public boolean testLength(String s){
        if(s.length()>=5)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicateDemo.testLength("Oligergre"));

        Predicate<String> predicate = (s) -> s.length()>5;
        System.out.println(predicate.test("OliGanguly"));
    }
}
