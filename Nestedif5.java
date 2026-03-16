import java.util.*;

public class Nestedif5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysInMonth = sc.nextInt();
        int startDay = sc.nextInt();

        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        int date = 1;

        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = startDay; i <= 7; i++) {
            if (date <= daysInMonth) {
                System.out.printf("%-4d", date++);
            }
        }
        System.out.println();

        // Remaining weeks
        while (date <= daysInMonth) {
            for (int i = 1; i <= 7; i++) {
                if (date <= daysInMonth) {
                    System.out.printf("%-4d", date++);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
