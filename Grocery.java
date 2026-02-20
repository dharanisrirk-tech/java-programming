import java.util.Scanner;
public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sales = sc.nextDouble();
        double discount = sc.nextDouble();
        double gst = sc.nextDouble();

        sales = sales - (sales * discount / 100);
        sales = sales + (sales * gst / 100);

        System.out.println("Final Revenue = " + sales);
    }
}