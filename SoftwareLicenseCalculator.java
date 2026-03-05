import java.util.Scanner;

public class SoftwareLicenseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int users = sc.nextInt();
        sc.nextLine();
        String license = sc.nextLine();
        String support = sc.nextLine();
        int years = sc.nextInt();

        double basePrice = 0, volumeDiscount = 0, supportFee = 0, multiDiscount = 0;

        if (license.equals("Standard")) basePrice = 60;
        else if (license.equals("Professional")) basePrice = 120;
        else basePrice = 200;

        if (users <= 50) volumeDiscount = 0;
        else if (users <= 200) volumeDiscount = 15;
        else if (users <= 500) volumeDiscount = 20;
        else if (users <= 1000) volumeDiscount = 25;
        else volumeDiscount = 35;

        if (support.equals("Basic")) supportFee = 10;
        else if (support.equals("Priority")) supportFee = 30;
        else supportFee = 80;

        if (years == 2) multiDiscount = 5;
        else if (years == 3) multiDiscount = 10;
        else if (years == 5) multiDiscount = 20;

        double discountedBase = basePrice * (1 - volumeDiscount / 100);
        double annualPerUser = (discountedBase + supportFee) * (1 - multiDiscount / 100);
        double totalAnnual = annualPerUser * users;
        double contractValue = totalAnnual * years;

        String tier;
        if (users < 200) tier = "Small Business";
        else if (users <= 1000) tier = "Mid-Market";
        else tier = "Enterprise";

        System.out.println("User Count: " + users);
        System.out.println("License Type: " + license);
        System.out.println("Support Level: " + support);
        System.out.println("Contract Duration: " + years + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount: " + (int)volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFee);
        System.out.println("Multi-Year Discount: " + (int)multiDiscount + "%");
        System.out.println("Annual Cost Per User: $" + annualPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnual);
        System.out.println("Total Contract Value: $" + contractValue);
        System.out.println("Pricing Tier: " + tier);
    }
}