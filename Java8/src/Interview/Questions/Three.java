package Interview.Questions;

//multiply two no using functional interface

@FunctionalInterface
interface Multiply{
    int multiply(int a,int b);
}

public class Three  {
    public static void main(String[] args) {
        Multiply mul =(a,b)->{
            return a*b;
        };
        System.out.println(mul.multiply(2, 4));
    }
}
