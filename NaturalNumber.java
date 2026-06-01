import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit (N): ");
        int n = scanner.nextInt();
        
        System.out.println("The first " + n + " natural numbers are:");
               for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}
