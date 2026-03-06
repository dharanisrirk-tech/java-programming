import java.util.*;
public class ShippingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double packageWeight = sc.nextDouble();
        sc.nextLine();
        String destinationZone = sc.nextLine();
        String shippingSpeed = sc.nextLine();
        String packageSize = sc.nextLine();
        double baseRate = 0;
        double zoneMultiplier = 1;
        double sizeSurcharge = 0;
        String delivery = "";
        String serviceLevel = "";

        if (shippingSpeed.equalsIgnoreCase("Economy")) {
            baseRate = 5;
            serviceLevel = "Budget";

            if (destinationZone.equalsIgnoreCase("Local"))
                delivery = "7 business days";
            else if (destinationZone.equalsIgnoreCase("Regional"))
                delivery = "7 business days";
            else if (destinationZone.equalsIgnoreCase("National"))
                delivery = "10 business days";
            else
                delivery = "21 business days";
        }
        else if (shippingSpeed.equalsIgnoreCase("Standard")) {
            baseRate = 10;
            serviceLevel = "Standard";

            if (destinationZone.equalsIgnoreCase("Local"))
                delivery = "3 business days";
            else if (destinationZone.equalsIgnoreCase("Regional"))
                delivery = "5 business days";
            else if (destinationZone.equalsIgnoreCase("National"))
                delivery = "7 business days";
            else
                delivery = "14 business days";
        }
        else if (shippingSpeed.equalsIgnoreCase("Express")) {
            baseRate = 25;
            serviceLevel = "Priority";

            if (destinationZone.equalsIgnoreCase("Local"))
                delivery = "1 business days";
            else if (destinationZone.equalsIgnoreCase("Regional"))
                delivery = "2 business days";
            else if (destinationZone.equalsIgnoreCase("National"))
                delivery = "2 business days";
            else
                delivery = "5 business days";
        }
        else if (shippingSpeed.equalsIgnoreCase("Overnight")) {
            baseRate = 50;
            serviceLevel = "Premium";
            delivery = "1 business days";
        }

        if (destinationZone.equalsIgnoreCase("Local"))
            zoneMultiplier = 1.0;
        else if (destinationZone.equalsIgnoreCase("Regional"))
            zoneMultiplier = 1.2;
        else if (destinationZone.equalsIgnoreCase("National"))
            zoneMultiplier = 1.5;
        else if (destinationZone.equalsIgnoreCase("International"))
            zoneMultiplier = 3.0;

        if (packageSize.equalsIgnoreCase("Small"))
            sizeSurcharge = 0;
        else if (packageSize.equalsIgnoreCase("Medium"))
            sizeSurcharge = 5;
        else if (packageSize.equalsIgnoreCase("Large"))
            sizeSurcharge = 15;
        else if (packageSize.equalsIgnoreCase("Oversized"))
            sizeSurcharge = 30;
        double weightSurcharge = packageWeight * 1;
        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;yt+
        System.out.println("Package Weight: " + packageWeight + " lbs");
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package Size: " + packageSize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + delivery);
        System.out.println("Service Level: " + serviceLevel);

    }
}
