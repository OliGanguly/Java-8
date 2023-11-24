package Lambda;
@FunctionalInterface
interface A{
     void show(int x);
}
interface B{
    public void showB();
}
//The way u instanciaate A
//class C implements A{
//    @Override
//    public int show(int i) {
//        return i;
//    }
//}
public class Demo {
    public static void main(String[] args) {
        A obj = (a)-> System.out.println("OLi"+ ":" + a);
        obj.show(30);
//        Runnable

//    A obj = new A(){ //ANonymous Inner class
////        public int show(int i) {
////           return i;
////        }
////    };
//        A obj = () -> System.out.println(i);

 B objb =()-> System.out.println("Hello");

//        System.out.println(obj.show());
        objb.showB();
    }
}
