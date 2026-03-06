import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String room = sc.nextLine();
        String season = sc.nextLine();
        int nights = sc.nextInt();
        sc.nextLine();
        String loyalty = sc.nextLine();

        double base = 0, multiplier = 1, stayDiscount = 0, loyaltyDiscount = 0;

        if(room.equals("Standard")) base = 150;
        else if(room.equals("Deluxe")) base = 300;
        else if(room.equals("Suite")) base = 500;
        else base = 1000;

        if(season.equals("Off-Peak")) multiplier = 0.7;
        else if(season.equals("Peak")) multiplier = 1.5;
        else if(season.equals("Holiday")) multiplier = 2.0;

        if(nights >=5 && nights <=7) stayDiscount = 5;
        else if(nights >=8 && nights <=14) stayDiscount = 10;
        else if(nights >=15) stayDiscount = 20;

        if(loyalty.equals("Member")) loyaltyDiscount = 10;
        else if(loyalty.equals("Gold")) loyaltyDiscount = 15;
        else if(loyalty.equals("Platinum")) loyaltyDiscount = 20;

        double rate = base * multiplier;
        double nightly = rate * (1 - stayDiscount/100) * (1 - loyaltyDiscount/100);
        double total = nightly * nights;

        String upgrade="None";
        if(loyalty.equals("Member")) upgrade="Free breakfast";
        else if(loyalty.equals("Gold")) upgrade="Free breakfast and spa access";
        else if(loyalty.equals("Platinum")) upgrade="Concierge service, airport transfer, and fine dining";

        System.out.println("Room Category: " + room);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nights);
        System.out.println("Loyalty Tier: " + loyalty);
        System.out.println("Base Rate Per Night: $" + base);
        System.out.println("Seasonal Multiplier: " + multiplier + "x");
        System.out.println("Extended Stay Discount: " + (int)stayDiscount + "%");
        System.out.println("Loyalty Discount: " + (int)loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + nightly);
        System.out.println("Total Booking Cost: $" + total);
        System.out.println("Complimentary Upgrades: " + upgrade);
    }
}
