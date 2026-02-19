import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int deliveries = sc.nextInt();
        int pay = sc.nextInt();
        int bonus = sc.nextInt();
        int fuel = sc.nextInt();

        System.out.println("Driver Earnings = " + ((deliveries * pay) + bonus - fuel));
    }
}
