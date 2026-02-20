import java.util.Scanner;

class Apartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maintenance = sc.nextDouble();
        double parking = sc.nextDouble();
        double hall = sc.nextDouble();
        double security = sc.nextDouble();
        double electricity = sc.nextDouble();
        double cleaning = sc.nextDouble();

        double balance = maintenance + parking + hall - security - electricity - cleaning;

        System.out.println(balance);
    }
}