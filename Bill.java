import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();
        double service = sc.nextDouble();
        double gst = sc.nextDouble();
        int people = sc.nextInt();

        bill = bill + (bill * service / 100);
        bill = bill + (bill * gst / 100);

        System.out.println("Amount Per Person = " + (bill / people));
    }
}
