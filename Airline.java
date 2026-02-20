import java.util.Scanner;

class Airline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double rate = sc.nextDouble();
        double priority = sc.nextDouble();
        double insurance = sc.nextDouble();
        double handling = sc.nextDouble();
        double fuel = sc.nextDouble();

        double revenue = (weight * rate) + priority + insurance - handling - fuel;

        System.out.println(revenue);
    }
}