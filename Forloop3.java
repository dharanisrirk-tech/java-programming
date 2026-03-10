import java.util.Scanner;

public class Forloop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int lowStockCount = 0;
        int criticalCount = 0;
        int totalReorder = 0;

        for (int i = 0; i < N; i++) {

            String productName = sc.next();
            int currentStock = sc.nextInt();
            int minimumStock = sc.nextInt();

            String status;
            int reorderQty = 0;

            if (currentStock >= minimumStock) {
                status = "Adequate";
                reorderQty = 0;
            } 
            else if (currentStock >= minimumStock / 2) {
                status = "Low Stock";
                reorderQty = (minimumStock - currentStock) + (minimumStock / 2);
                lowStockCount++;
            } 
            else {
                status = "Critical";
                reorderQty = (minimumStock - currentStock) + (int)(minimumStock * 1.5);
                criticalCount++;
            }

            totalReorder += reorderQty;

            System.out.println("Product: " + productName);
            System.out.println("Current Stock: " + currentStock);
            System.out.println("Minimum Stock: " + minimumStock);
            System.out.println("Status: " + status);
            System.out.println("Reorder Quantity: " + reorderQty);
            System.out.println();
        }

        System.out.println("Total Products: " + N);
        System.out.println("Low Stock Items: " + lowStockCount);
        System.out.println("Critical Items: " + criticalCount);
        System.out.println("Total Reorder Quantity: " + totalReorder);

        sc.close();
    }
}