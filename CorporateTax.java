import java.util.Scanner;

public class CorporateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double revenue = sc.nextDouble();
        sc.nextLine();
        String type = sc.nextLine();
        double deductions = sc.nextDouble();
        double credits = sc.nextDouble();

        double taxable = revenue - deductions;
        double taxRate = 0, grossTax = 0, netTax = 0, effectiveRate = 0;

        if (type.equals("C-Corp")) {
            if (taxable < 500000) taxRate = 21;
            else if (taxable <= 1000000) taxRate = 24;
            else if (taxable <= 2000000) taxRate = 28;
            else taxRate = 30;
        } else if (type.equals("S-Corp")) {
            if (taxable < 500000) taxRate = 20;
            else if (taxable <= 1000000) taxRate = 25;
            else taxRate = 28;
        } else if (type.equals("LLC")) {
            if (taxable < 200000) taxRate = 15;
            else if (taxable <= 500000) taxRate = 18;
            else taxRate = 22;
        } else if (type.equals("Partnership")) {
            if (taxable < 300000) taxRate = 18;
            else if (taxable <= 800000) taxRate = 22;
            else taxRate = 26;
        }

        grossTax = taxable * taxRate / 100;
        netTax = grossTax - credits;
        if (netTax < 0) netTax = 0;
        effectiveRate = netTax / revenue * 100;

        System.out.println("Annual Revenue: $" + revenue);
        System.out.println("Business Type: " + type);
        System.out.println("Deductible Expenses: $" + deductions);
        System.out.println("Tax Credits: $" + credits);
        System.out.println("Taxable Income: $" + taxable);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Gross Tax: $" + grossTax);
        System.out.println("Net Tax After Credits: $" + netTax);
        System.out.println("Effective Tax Rate: " + effectiveRate + "%");

        sc.close();
    }
}
