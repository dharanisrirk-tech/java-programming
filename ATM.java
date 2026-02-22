import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();  
        int w = sc.nextInt();  
        int l = sc.nextInt();  

        if (w <= b && w <= l) {
            System.out.println("Approved");
        } else {
            System.out.println("Declined");
        }

        sc.close();
    }
}