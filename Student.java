import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fees = sc.nextDouble();
        double scholarship = sc.nextDouble();
        double exam = sc.nextDouble();
        double library = sc.nextDouble();

        fees = fees - (fees * scholarship / 100);
        fees = fees + exam + library;

        System.out.println("Final Payable Fee = " + fees);
    }
}