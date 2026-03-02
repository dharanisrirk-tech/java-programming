import java.util.Scanner;

public class AirlineTicketFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bookingClass = sc.nextLine();
        int days = sc.nextInt();
        double availability = sc.nextDouble();
        sc.nextLine();
        String route = sc.nextLine();

        double base = 0, multiplier = 1.0;
        String category = "Moderate";

        if (bookingClass.equals("Economy")) {
            if (route.equals("Domestic")) base = 200;
            else if (route.equals("International-Short")) base = 500;
            else base = 800;
        }
        else if (bookingClass.equals("Business")) {
            if (route.equals("Domestic")) base = 600;
            else if (route.equals("International-Short")) base = 1500;
            else base = 2500;
        }
        else if (bookingClass.equals("First")) {
            if (route.equals("Domestic")) base = 1000;
            else if (route.equals("International-Short")) base = 3000;
            else base = 5000;
        }

        if (availability < 30 && days < 14) {
            multiplier = 1.8;
            category = "High Demand";
        }
        else if (availability < 50 && days < 30) {
            multiplier = 1.5;
            category = "High Demand";
        }
        else if (availability >= 60 && days > 60) {
            multiplier = 0.8;
            category = "Low Demand";
        }
        else {
            multiplier = 1.0;
            category = "Moderate";
        }

        double finalPrice = base * multiplier;

        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + days);
        System.out.println("Seat Availability: " + availability + "%");
        System.out.println("Route Type: " + route);
        System.out.println("Base Price: $" + base);
        System.out.println("Demand Multiplier: " + multiplier + "x");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Pricing Category: " + category);

        sc.close();
    }
}