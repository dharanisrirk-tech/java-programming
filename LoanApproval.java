import java.util.Scanner;

public class LoanApproval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int credit = sc.nextInt();
        double income = sc.nextDouble();
        double debt = sc.nextDouble();
        sc.nextLine();
        String type = sc.nextLine();

        String decision = "Rejected";
        double maxLoan = 0.0;

        if (credit < 600 || debt > 50) {
            decision = "Rejected";
        } 
        else {
            if (type.equalsIgnoreCase("Home")) {
                if (credit >= 750 && debt <= 30) {
                    decision = "Approved";
                    maxLoan = income * 4;
                } else if (credit >= 650 && debt <= 40) {
                    decision = "Needs Review";
                    maxLoan = income * 3;
                }
            }
            else if (type.equalsIgnoreCase("Personal")) {
                if (credit >= 750 && debt <= 30) {
                    decision = "Approved";
                    maxLoan = income * 1;
                } else if (credit >= 650 && debt <= 40) {
                    decision = "Needs Review";
                    maxLoan = income * 0.5;
                }
            }
            else if (type.equalsIgnoreCase("Business")) {
                if (credit >= 700 && debt <= 40) {
                    decision = "Approved";
                    maxLoan = income * 3;
                }
            }
        }

        System.out.println("Credit Score: " + credit);
        System.out.println("Annual Income: $" + income);
        System.out.println("Debt-to-Income Ratio: " + debt + "%");
        System.out.println("Loan Type: " + type);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoan);

        sc.close();
    }
}
