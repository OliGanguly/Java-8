package Interview;
@FunctionalInterface
 interface MyOwnFunctionalInterface{
    int add(int a, int b);
    default void aboutMe(){
        System.out.println("I am a FI");
    }
}
public class OwnFunctionalInterface {
    public static void main(String[] args) {
        MyOwnFunctionalInterface MyOwnFunctionalInterface =(a,b)-> {
            return a + b;
        };
        MyOwnFunctionalInterface.aboutMe();
        System.out.println(MyOwnFunctionalInterface.add(10, 6));
    }
}
