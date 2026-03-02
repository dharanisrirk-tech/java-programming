import java.util.Scanner;

public class DiscountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();
        double cart = sc.nextDouble();
        sc.nextLine();
        String category = sc.nextLine();
        String member = sc.nextLine();

        double base = 0, extra = 0;

        if (tier.equals("Bronze")) base = 5;
        else if (tier.equals("Silver")) base = 8;
        else if (tier.equals("Gold")) base = 12;
        else if (tier.equals("Platinum")) base = 15;

        if (cart >= 500 && cart < 1000) extra += 3;
        else if (cart >= 1000 && cart < 2000) extra += 5;
        else if (cart >= 2000) extra += 7;

   
        if (category.equals("Electronics") && member.equals("Prime"))
            extra += 5;
        else if (category.equals("Fashion"))
            extra += 3;
        else if (category.equals("Books") && member.equals("Prime"))
            extra += 5;
        else if (category.equals("Groceries") && cart > 300)
            extra += 2;

        double totalDiscount = base + extra;
        double finalPrice = cart - (cart * totalDiscount / 100);
        double savings = cart - finalPrice;

        System.out.println("Loyalty Tier: " + tier);
        System.out.println("Cart Value: $" + cart);
        System.out.println("Product Category: " + category);
        System.out.println("Membership: " + member);
        System.out.println("Base Discount: " + base + "%");
        System.out.println("Additional Discount: " + extra + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);

        sc.close();
    }
}