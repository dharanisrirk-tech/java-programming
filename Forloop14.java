import java.util.Scanner;
public class Forloop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalFines = 0;
        int overdueBooks = 0;

        for (int i = 1; i <= n; i++) {
            String bookType = sc.next();
            int daysLate = sc.nextInt();

            double dailyFine = 0;
            double cap = 0;

            if (bookType.equals("Regular")) {
                dailyFine = 0.5;
                cap = 10;
            } 
            else if (bookType.equals("Reference")) {
                dailyFine = 1.0;
                cap = 20;
            } 
            else if (bookType.equals("Magazine")) {
                dailyFine = 0.25;
                cap = 5;
            }

            double calculatedFine = daysLate * dailyFine;
            double actualFine = calculatedFine;
            String capApplied = "No";

            if (calculatedFine > cap) {
                actualFine = cap;
                capApplied = "Yes";
            }

            if (daysLate > 0) {
                overdueBooks++;
            }

            totalFines += actualFine;

            System.out.println("Book " + i + ": " + bookType);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Daily Fine: $" + dailyFine);
            System.out.println("Calculated Fine: $" + calculatedFine);
            System.out.println("Actual Fine: $" + actualFine);
            System.out.println("Cap Applied: " + capApplied);
        }

        double averageFine = totalFines / n;

        System.out.println("Total Books: " + n);
        System.out.println("Total Fines Collected: $" + totalFines);
        System.out.println("Books Overdue: " + overdueBooks);
        System.out.println("Average Fine: $" + averageFine);
    }
}
