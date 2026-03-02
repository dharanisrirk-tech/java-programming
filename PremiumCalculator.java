import java.util.Scanner;

public class PremiumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String smoking = sc.nextLine();
        String condition = sc.nextLine();
        String tier = sc.nextLine();

        double base = 0, surcharge = 0;

       
        if (age <= 30) {
            if (tier.equals("Basic")) base = 200;
            else if (tier.equals("Standard")) base = 300;
            else base = 500;
        } 
        else if (age <= 50) {
            if (tier.equals("Basic")) base = 250;
            else if (tier.equals("Standard")) base = 350;
            else base = 600;
        } 
        else if (age <= 65) {
            if (tier.equals("Basic")) base = 350;
            else if (tier.equals("Standard")) base = 450;
            else base = 700;
        } 
        else {
            if (tier.equals("Basic")) base = 400;
            else if (tier.equals("Standard")) base = 550;
            else base = 800;
        }

       
        if (smoking.equals("Smoker") && condition.equals("Yes"))
            surcharge = base * 0.70;
        else if (smoking.equals("Smoker"))
            surcharge = base * 0.40;
        else if (condition.equals("Yes"))
            surcharge = base * 0.30;

        double total = base + surcharge;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smoking);
        System.out.println("Pre-existing Conditions: " + condition);
        System.out.println("Coverage Tier: " + tier);
        System.out.println("Base Premium: $" + base);
        System.out.println("Risk Surcharge: $" + surcharge);
        System.out.println("Total Monthly Premium: $" + total);

        sc.close();
    }
}
