import java.util.Scanner;
public class Forloop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalRevenue = 0;
        int peakVehicles = 0;

        for (int i = 1; i <= n; i++) {
            String vehicleType = sc.next();
            double hours = sc.nextDouble();

            double rate = 0;
            double cap = 0;

            if (vehicleType.equalsIgnoreCase("Car")) {
                rate = 3;
                cap = 30;
            } 
            else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
                rate = 2;
                cap = 20;
            } 
            else if (vehicleType.equalsIgnoreCase("Truck")) {
                rate = 5;
                cap = 60;
            } 
            else if (vehicleType.equalsIgnoreCase("Bus")) {
                rate = 7;
                cap = 100;
            }

            double fee = hours * rate;
            boolean capApplied = false;
            if (fee > cap) {
                fee = cap;
                capApplied = true;
            }
            if (hours > 8) {
                peakVehicles++;
            }

            System.out.println("Vehicle " + i + ": " + vehicleType);
            System.out.println("Hours Parked: " + hours);
            System.out.println("Hourly Rate: $" + rate);
            System.out.println("Parking Fee: $" + fee);
            System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));

            totalRevenue += fee;
        }

        double avgFee = totalRevenue / n;

        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fee: $" + avgFee);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakVehicles);
    }
}
