import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rooms = sc.nextInt();
        int price = sc.nextInt();
        int service = sc.nextInt();
        int commission = sc.nextInt();

        System.out.println("Total Revenue = " + 
        ((rooms * price) + service - commission));
    }
}
