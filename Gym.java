import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int sessions = sc.nextInt();
        int pay = sc.nextInt();
        int bonus = sc.nextInt();
        int maintenance = sc.nextInt();

        System.out.println("Final Salary = " + 
        (base + (sessions * pay) + bonus - maintenance));
    }
}
