package FI;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface CustomFi {
  int add(int i,int j);
//  int add2(int i,int j);
  default void aboutMe(){
      System.out.println("I am a Functionl Interface");
  }
}
class test{
    public static void main(String[] args) {
        CustomFi customFi = (a,b) ->{
            return a+b;
        };
        customFi.aboutMe();
        System.out.println(customFi.add(5, 5));
        BiConsumer<Integer,Integer>biConsumer = (a,b) -> System.out.println(a+b);
//        biConsumer.accept(8,9);
    }

}
