import java.util.Scanner;
class Youtube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ads = sc.nextDouble();
        double sponsor = sc.nextDouble();
        double affiliate = sc.nextDouble();
        double tax = sc.nextDouble();
        double production = sc.nextDouble();

        double income = ads + sponsor + affiliate - tax - production;
        System.out.println(income);
    }
}