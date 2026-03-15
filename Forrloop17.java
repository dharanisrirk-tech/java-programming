import java.util.Scanner;
public class Forrloop17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalTemp = 0;
        double highestTemp = Double.MIN_VALUE;
        double lowestTemp = Double.MAX_VALUE;
        int highestHour = 0;
        int lowestHour = 0;
        int hotHours = 0;
        int coldHours = 0;

        for (int i = 0; i < n; i++) {
            int hour = sc.nextInt();
            double temp = sc.nextDouble();
            totalTemp += temp;
            if (temp > highestTemp) {
                highestTemp = temp;
                highestHour = hour;
            }
            if (temp < lowestTemp) {
                lowestTemp = temp;
                lowestHour = hour;
            }

            String status;
            if (temp > 40 || temp < 0) {
                status = "Extreme";
            }
            else if (temp >= 32) {
                status = "Hot";
                hotHours++;
            }
            else if (temp <= 10) {
                status = "Cold";
                coldHours++;
            }
            else {
                status = "Normal";
            }

            if (temp >= 32) {
                hotHours++;
            }

            if (temp <= 10 && temp >= 0) {
                coldHours++;
            }

            System.out.println("Hour " + hour + ": " + temp + "°C");
            System.out.println("Status: " + status);
        }

        double averageTemp = totalTemp / n;

        System.out.println("Total Readings: " + n);
        System.out.println("Average Temperature: " + averageTemp + "°C");
        System.out.println("Highest Temperature: " + highestTemp + "°C at Hour " + highestHour);
        System.out.println("Lowest Temperature: " + lowestTemp + "°C at Hour " + lowestHour);
        System.out.println("Hot Hours: " + hotHours);
        System.out.println("Cold Hours: " + coldHours);
    }
}
