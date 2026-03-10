import java.util.Scanner;
public class Forloop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double totalSales = 0;
        double totalCommissions = 0;
        double highestSales = 0;
        String topPerformer = "";

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double salesAmount = sc.nextDouble();

            double rate;
            double bonus = 0;

            if (salesAmount <= 40000) {
                rate = 5;
            } else if (salesAmount <= 80000) {
                rate = 8;
            } else if (salesAmount <= 100000) {
                rate = 10;
            } else if (salesAmount <= 150000) {
                rate = 12;
                bonus = 2000;
            } else {
                rate = 15;
                bonus = 3000;
            }

            double commission = salesAmount * (rate / 100);
            double totalPayout = commission + bonus;

            totalSales += salesAmount;
            totalCommissions += totalPayout;

            if (salesAmount > highestSales) {
                highestSales = salesAmount;
                topPerformer = name;
            }

            System.out.println("Sales Rep: " + name);
            System.out.println("Sales Amount: $" + salesAmount);
            System.out.println("Commission Rate: " + (int)rate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + totalPayout);
            System.out.println();
        }

        System.out.println("Total Sales Reps: " + N);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCommissions);
        System.out.println("Top Performer: " + topPerformer);

        sc.close();
    }
}




