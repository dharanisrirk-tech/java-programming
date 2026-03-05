import java.util.Scanner;

public class UniversityFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String status = sc.nextLine();
        int credit = sc.nextInt();
        sc.nextLine();
        String program = sc.nextLine();
        String residency = sc.nextLine();

        double base = 0, multiplier = 1, programFee = 0, activityFee = 0;

        if(program.equals("Undergraduate")) base = 350;
        else if(program.equals("Graduate")) base = 550;
        else base = 800;

        if(residency.equals("Out-of-State")) multiplier = 2.5;
        else if(residency.equals("International")) multiplier = 3.0;

        if(status.equals("Full-Time")){
            if(program.equals("Undergraduate")) programFee = 500;
            else if(program.equals("Graduate")) programFee = 750;
            else programFee = 1200;
        }
        else if(status.equals("Part-Time")){
            if(program.equals("Undergraduate")) programFee = 300;
            else if(program.equals("Graduate")) programFee = 750;
            else programFee = 900;
        }
        else programFee = 150;

        if(status.equals("Full-Time")) activityFee = 200;
        else if(status.equals("Part-Time")) activityFee = 100;
        else activityFee = 50;

        double tuition = credit * base * multiplier;
        double total = tuition + programFee + activityFee;

        String category;
        if(status.equals("Continuing-Education")) category = "Reduced";
        else if(residency.equals("Out-of-State") || residency.equals("International")) category = "Premium";
        else category = "Standard";

        System.out.println("Student Status: " + status);
        System.out.println("Credit Hours: " + credit);
        System.out.println("Program Type: " + program);
        System.out.println("Residency: " + residency);
        System.out.println("Base Tuition Per Credit: $" + base);
        System.out.println("Residency Multiplier: " + multiplier + "x");
        System.out.println("Program Fee: $" + programFee);
        System.out.println("Student Activity Fee: $" + activityFee);
        System.out.println("Total Registration Fee: $" + total);
        System.out.println("Fee Category: " + category);
    }
}