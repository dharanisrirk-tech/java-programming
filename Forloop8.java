import java.util.Scanner;

public class Forloop8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        int totalItems = 0;

        double originalTotal = 0;
        double finalTotal = 0;

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            int discount = 0;

            if (qty == 1)
                discount = 0;
            else if (qty >= 2 && qty <= 4)
                discount = 10;
            else if (qty >= 5 && qty <= 9)
                discount = 15;
            else
                discount = 20;

            double originalPrice = price * qty;
            double subtotal = originalPrice * (1 - discount / 100.0);

            System.out.println("Product: " + name);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + qty);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Subtotal: $" + subtotal);

            totalItems += qty;
            originalTotal += originalPrice;
            finalTotal += subtotal;
        }

        double totalDiscount = originalTotal - finalTotal;
        double savings = (totalDiscount / originalTotal) * 100;

        System.out.println("Total Items: " + totalItems);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Savings: " + savings + "%");
    }
}