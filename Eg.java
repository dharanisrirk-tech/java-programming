import java.util.Scanner;
public class Eg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basic = scan.nextInt();
        int hra = scan.nextInt();
        int bonus = scan.nextInt();
        int tax = scan.nextInt();
        int pf = scan.nextInt();
        int salary = basic + hra + bonus - tax - pf;
        System.out.println("Take Home Salary = " + salary);
    }
}
