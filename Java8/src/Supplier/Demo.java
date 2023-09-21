package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Supplier supplier = () -> {
            return new Date();
        };
        System.out.println(supplier.get());
    }
}


