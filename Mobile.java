import java.util.Scanner;

public class Mobile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double extra = sc.nextDouble();
        double rate = sc.nextDouble();
        double tax = sc.nextDouble();

        double total = base + (extra * rate);
        total = total + (total * tax / 100);

        System.out.println("Total Bill = " + total);
    }
}