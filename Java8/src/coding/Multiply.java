package coding;

//Write a program to multiply 2 using functional interface
@FunctionalInterface
interface Req{
    void multiply(int a);
}
public class Multiply {
    public static void main(String[] args) {
        Req obj = (a)->{
            for(int i=1;i<=10;i++){
                System.out.println(a + "*"+ i + "="+(a*i));
            }
        };
        obj.multiply(2);
    }
}
