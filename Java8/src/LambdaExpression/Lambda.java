package LambdaExpression;

/* Lambda Expression is a Anonymous Fuction
         No name
         No modifier
         No Return type

//Concise code
//use  it only with functional Interface

         ()->{
         sop("Test");
         }
         Functional Interface : If a Interface contaion only one abstact Method then it is called Fuctional Interface.
         Runnable Interface
         Comparable Interface
         */



public class Lambda {
    public static void main(String[] args) {
//     LambdaInterface obj = (i)->{
//       System.out.println("Hi : value "+ i);
//   };
//     obj.show(23);

        LambdaInterface obj =(i)-> System.out.println(i);

    }
}
