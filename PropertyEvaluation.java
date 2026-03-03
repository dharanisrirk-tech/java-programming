import java.util.Scanner;

public class PropertyEvaluation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String location = sc.nextLine();
        int sqft = sc.nextInt();
        int age = sc.nextInt();
        int amenity = sc.nextInt();

        double basePrice = 0, ageAdj = 0, amenityBonus = 0, estimatedValue = 0;
        String market = "";


        if (location.equals("Prime")) basePrice = 400;
        else if (location.equals("Urban")) basePrice = 300;
        else if (location.equals("Suburban")) basePrice = 180;
        else basePrice = 100;

        if (age <= 5) ageAdj = 0;
        else if (age <= 15) ageAdj = -10;
        else if (age <= 30) ageAdj = -15;
        else ageAdj = -25;

        double baseValue = sqft * basePrice;
        if (amenity >= 80) amenityBonus = baseValue * 0.10;
        else if (amenity >= 60) amenityBonus = baseValue * 0.05;
        else if (amenity >= 40) amenityBonus = baseValue * 0.02;

        estimatedValue = baseValue * (1 + ageAdj / 100) + amenityBonus;

        if ((location.equals("Prime") || location.equals("Urban")) && age < 15) market = "Hot";
        else if (location.equals("Suburban")) market = "Stable";
        else market = "Slow";

        System.out.println("Location Tier: " + location);
        System.out.println("Square Footage: " + sqft + " sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + amenity);
        System.out.println("Base Price Per Sq Ft: $" + basePrice);
        System.out.println("Age Adjustment: " + ageAdj + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + estimatedValue);
        System.out.println("Market Category: " + market);

        sc.close();
    }
}