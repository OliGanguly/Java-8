package Predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicteJoining {
    public static void main(String[] args) {
        Predicate<String> checkLength = s->s.length()>=5;
        System.out.println("Length is more than 5 : " + checkLength.test("Oli ganguly")); //true

        Predicate<String> checkEvenLength = s->s.length()%2==0;
        System.out.println("Length os String is even : " + checkEvenLength.test("Oli Ganguly"));//false

        //join with AND
        System.out.println("with and : "+ checkLength.and(checkEvenLength).test("OliG"));
        //or
        System.out.println("Or and : "+ checkLength.or(checkEvenLength).test("OliG"));
        //negate
        System.out.println("Negate and : "+ checkLength.negate().test("Oli ganguly"));

    }
}
