import java.util.Scanner;
public class Forloop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   

        int totalItems = 0;
        double subtotal = 0;

        for (int i = 0; i < n; i++) {
            String itemName = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            double itemSubtotal = price * qty;

            System.out.println("Item: " + itemName);
            System.out.println("Price: $" + price + " x " + qty);
            System.out.println("Subtotal: $" + itemSubtotal);

            subtotal += itemSubtotal;
            totalItems += qty;
        }

        double tax = subtotal * 0.08;
        double serviceCharge = subtotal * 0.10;
        double grandTotal = subtotal + tax + serviceCharge;

        System.out.println("Total Items: " + totalItems);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (8%): $" + tax);
        System.out.println("Service Charge (10%): $" + serviceCharge);
        System.out.println("Grand Total: $" + grandTotal);
    }
}