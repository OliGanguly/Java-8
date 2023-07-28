package Interface;


interface Phone{
    void call();
    //I dont want other class to override it
    //default is keyword mandetory here
    default void messgage(){
        System.out.println("Sent..");
    }
}
class Android implements Phone{
    public void call(){
        System.out.println("Calling...");
    }
    public  void message(){
        System.out.println("Sent By android..");
    }
}
public class DemoInterface {
    public static void main(String[] args) {
       Phone p = new Android();
       Android a=new Android();
       p.call();
       p.messgage();
       a.message();

    }
}
