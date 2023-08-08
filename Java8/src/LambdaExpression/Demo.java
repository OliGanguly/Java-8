package LambdaExpression;

import java.util.Arrays;
import java.util.List;


interface  A{
    void show(int i);
}
//class C implements A{
//    public void show() {
//        System.out.println("Hello");
//    }
//}
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,4,5,6);

        /*
        * -> arrow called Lambda expression
        * */
//        list.forEach(e-> System.out.print(e+" "));

        /*A obj;
        // u can create Reference of A
        //but u can not create object of Interface
        //cause we dont have the implementation of shoe
        obj = new C();
        obj.show();
        */


        /*
        * Here we can see the use of C just to Implement show
        * it has no other use , So no Need to Crete C ,
        * What we can do to fix this issue??
        * */

        /*
        * This {} block is a class
        * its called Anonymous Class which has no name
        * */
//        A obj = new A() {
//            public void show() {
//                System.out.println("Hello");
//            }
//        };
//        obj.show();

        //ANother way
//        A obj1 = () -> {
//            System.out.println("Hello 2");
//        };
        //New way of Implementing Interface
        A obj2 = (j) -> System.out.println("Hello "+j);

        obj2.show(5);



    }
}
