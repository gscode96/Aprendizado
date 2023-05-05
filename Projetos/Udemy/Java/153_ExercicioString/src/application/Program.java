import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.orderItem;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product("tv", 1000.00);
        orderItem oi1 = new orderItem(1, 1000.00, p);
        System.out.println(oi1);

        sc.close();

    }
}
