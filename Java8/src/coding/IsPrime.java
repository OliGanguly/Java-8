package coding;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(7));
    }

//    public static boolean isPrime(int number){
//        boolean is_Divisible = false;
//        for(int i=2;i<number;i++){
//            if(number%i==0){
//                is_Divisible=true;
//                break;
//            }
//        }
//        return number>1 && !is_Divisible;
//    }

    public static boolean isPrime(int number){
        boolean is_Divisible = false;
//        for(int i=2;i<number;i++){
//            if(number%i==0){
//                is_Divisible=true;
//                break;
//            }
//        }
        return number>1 && IntStream.range(2,number).noneMatch(n->number%n==0);
    }
}


//    public static void main(String[] args) {
//
//        int num = 33, i = 2;
//        boolean flag = false;
//        while (i <= num / 2) {
//            // condition for nonprime number
//            if (num % i == 0) {
//                flag = true;
//                break;
//            }
//
//            ++i;
//        }
//
//        if (!flag)
//            System.out.println(num + " is a prime number.");
//        else
//            System.out.println(num + " is not a prime number.");
//    }
//}
//        Predicate<Integer> p = (n)->{
//            boolean is_divisible = false;
//            for(int i=2;i<n;i++){
//                if(n%i==0){
//                    is_divisible=true;
//                    break;
//                }
//            }
//            return n>1 && !is_divisible;
//        };
//       if(p.test(29)){
//           System.out.println("Prime");
//       }else {
//           System.out.println("Not prime");
//       }