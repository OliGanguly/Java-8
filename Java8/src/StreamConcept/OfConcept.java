package StreamConcept;


import java.util.stream.Stream;

/*
* Stream is not applicable for Collections only it is also applicable for any group of values
* Stream.of() takes any group of values and convert them to stream , so multiple stream operations can applied to it
* */
public class OfConcept {
    public static void main(String[] args) {

        Stream.of(1,11,111,1111).forEach(i-> System.out.println(i));
        String [] arr={"Oli","Oli2","Oli3"};
        String oli = Stream.of(arr).filter(i -> i.equals("Oli2")).findFirst().get();
        System.out.println("My name : "+oli);

    }
}
