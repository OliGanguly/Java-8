package Interview.DiamondProblem;
interface A{
    default void show(){
        System.out.println("A");
    }
}
interface B{
    default void show(){
        System.out.println("B");
    }
}
public class DiamondProblem implements A,B{

   public void show(){
       //InterfaceName.super.method()
       A.super.show();
       B.super.show();
       System.out.println("I am class");
   }


    public static void main(String[] args) {
        DiamondProblem diamondProblem = new DiamondProblem();
        diamondProblem.show();
    }


}
