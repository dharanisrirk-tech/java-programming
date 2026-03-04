
import java.util.Scanner;

public class VehicleInsurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); sc.nextLine();
        String type = sc.nextLine();
        String record = sc.nextLine();
        String coverage = sc.nextLine();

        double base = coverage.equalsIgnoreCase("Basic") ? 500 :
                      coverage.equalsIgnoreCase("Standard") ? 800 : 1500;
        double ageFactor = (age<=21)?1.8:(age<=25)?1.5:(age<=40)?1.0:(age<=60)?0.9:1.1;
        double vehicleFactor = type.equalsIgnoreCase("Sedan")?1.0:
                               type.equalsIgnoreCase("SUV")?1.2:
                               type.equalsIgnoreCase("Sports")?1.5:1.1;
        double recordAdj = record.equalsIgnoreCase("Clean")?-10:
                           record.equalsIgnoreCase("Minor-Violations")?25:50;

        double adjusted = base*ageFactor*vehicleFactor;
        double finalPremium = adjusted*(1+recordAdj/100);
        double monthly = finalPremium/12;

        String risk = "";
        double score = ageFactor*vehicleFactor*(1+recordAdj/100);
        if(score<=1) risk="Low";
        else if(score<=1.5) risk="Medium";
        else if(score<=2) risk="High";
        else risk="Very High";

        System.out.println("Driver Age: "+age);
        System.out.println("Vehicle Type: "+type);
        System.out.println("Driving Record: "+record);
        System.out.println("Coverage Level: "+coverage);
        System.out.println("Base Premium: $"+base);
        System.out.println("Age Factor: "+ageFactor+"x");
        System.out.println("Vehicle Risk Factor: "+vehicleFactor+"x");
        System.out.println("Record Adjustment: "+(recordAdj>=0?"+":"")+recordAdj+"%");
        System.out.printf("Monthly Premium: $%.2f\n", monthly);
        System.out.printf("Annual Premium: $%.2f\n", finalPremium);
        System.out.println("Risk Category: "+risk);
        sc.close();
    }
}