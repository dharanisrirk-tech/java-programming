import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();

        double baseDiscount = 0, timeAdjustment = 0, serviceFee = 0;
        String priority = "";
        int prepTime = 0;

        if (loyaltyStatus.equals("Gold")) baseDiscount = 15;
        else if (loyaltyStatus.equals("Silver")) baseDiscount = 10;
        else if (loyaltyStatus.equals("Bronze")) baseDiscount = 5;

        if (timeSlot.equals("Late-Night")) timeAdjustment = -5;

        if (orderType.equals("Delivery")) serviceFee = orderValue * 0.10;
        else if (orderType.equals("Takeout")) serviceFee = orderValue * 0.03;

        double finalAmount = orderValue * (1 - (baseDiscount + timeAdjustment) / 100) + serviceFee;

        if (timeSlot.equals("Peak") && orderType.equals("Delivery")) priority = "High";
        else if (timeSlot.equals("Late-Night")) priority = "Low";
        else priority = "Medium";

        if (orderType.equals("Delivery")) prepTime = (orderValue >= 80) ? 25 : 30;
        else if (orderType.equals("Takeout")) prepTime = 15;
        else prepTime = (orderValue >= 100) ? 25 : 20;

        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + (int)baseDiscount + "%");
        System.out.println("Time-Based Adjustment: " + (int)timeAdjustment + "%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");

        sc.close();
    }
}
