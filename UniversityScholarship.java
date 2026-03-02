import java.util.Scanner;

public class UniversityScholarship {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double income = sc.nextDouble();
        int extra = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();

        String eligibility = "Not Eligible", category = "None";
        double award = 0;

        if (gpa >= 2.5) {

            if (type.equals("Merit")) {
                if (gpa >= 3.8 && extra >= 80) { award = 25000; category = "Full"; }
                else if (gpa >= 3.5 && extra >= 70) { award = 15000; category = "Partial"; }
                else if (gpa >= 3.0 && extra >= 60) { award = 8000; category = "Minimal"; }
            }

            else if (type.equals("Need-Based")) {
                if (income <= 30000 && gpa >= 3.5) { award = 30000; category = "Full"; }
                else if (income <= 50000 && gpa >= 3.0) { award = 18000; category = "Partial"; }
                else if (income <= 70000 && gpa >= 2.8) { award = 10000; category = "Minimal"; }
            }

            else if (type.equals("Sports")) {
                if (extra >= 85 && gpa >= 3.0) { award = 22000; category = "Full"; }
                else if (extra >= 75 && gpa >= 2.8) { award = 20000; category = "Partial"; }
                else if (extra >= 65 && gpa >= 2.5) { award = 12000; category = "Minimal"; }
            }

            if (award > 0) eligibility = "Eligible";
        }

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + income);
        System.out.println("Extracurricular Score: " + extra);
        System.out.println("Scholarship Type: " + type);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Award Amount: $" + award);
        System.out.println("Award Category: " + category);

        sc.close();
    }
}