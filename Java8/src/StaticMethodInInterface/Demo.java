package StaticMethodInInterface;

interface A{
    default void show(){
        System.out.println("Oli");
    }
    static void name(){
        System.out.println("static");
    }
}
class example implements A{

}
public class Demo {
    public static void main(String[] args) {
    A obj = new example();
    obj.show();
    A.name();

    }


}
