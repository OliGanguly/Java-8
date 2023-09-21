package Interview.Questions;

public class Five {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    public static boolean isPrime(int n){
    boolean isDivisibale = false;
    for(int i=2;i<n;i++){
        if(n%i==0){
            isDivisibale=true;
            break;
        }
    }
    return n>1 && !isDivisibale;
    }
}
