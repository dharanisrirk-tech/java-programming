import java.util.Scanner;
public class Fuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double mileage = sc.nextDouble();
        double price = sc.nextDouble();
        double toll = sc.nextDouble();

        double cost = (distance / mileage) * price + toll;

        System.out.println("Total Trip Cost = " + cost);
    }
}