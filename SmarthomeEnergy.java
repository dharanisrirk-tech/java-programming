import java.util.Scanner;

public class SmarthomeEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        double power = sc.nextDouble();
        double renewable = sc.nextDouble();
        sc.nextLine();
        String tier = sc.nextLine();

        double baseRate = 0, multiplier = 0, renewableCredit = 0, totalCost = 0;
        String recommendation = "";
        double potentialSavings = 0;

        if (tier.equals("Basic")) baseRate = 0.18;
        else if (tier.equals("Time-of-Use")) baseRate = 0.15;
        else baseRate = 0.12;

        if (time.equals("Peak")) {
            multiplier = (tier.equals("Time-of-Use")) ? 1.8 : 1.5;
        } else if (time.equals("Off-Peak")) {
            multiplier = (tier.equals("Basic")) ? 1.0 : 0.8;
        } else multiplier = 0.6;

        renewableCredit = power * (renewable / 100) * baseRate;

        totalCost = power * baseRate * multiplier - renewableCredit;
        if (totalCost < 0) totalCost = 0;

        if (time.equals("Peak") && renewable < 30) {
            recommendation = "Shift high-power appliances to Off-Peak hours";
            potentialSavings = power * baseRate * (multiplier - 0.8); 
        } else if (renewable > 50) {
            recommendation = "Excellent! Maximize appliance use during this period";
            potentialSavings = 0;
        } else if (tier.equals("Basic")) {
            recommendation = "Consider upgrading to Time-of-Use plan";
            potentialSavings = power * (0.18 - 0.15);
        } else {
            recommendation = "Good timing! Consider increasing renewable capacity";
            potentialSavings = 0;
        }

        System.out.println("Time of Day: " + time);
        System.out.println("Power Consumption: " + power + " kWh");
        System.out.println("Renewable Energy: " + renewable + "%");
        System.out.println("Rate Tier: " + tier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.println("Renewable Credit: $" + String.format("%.2f", renewableCredit));
        System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + String.format("%.2f", potentialSavings));

        sc.close();
    }
}
