import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ticket = sc.nextInt();
        int snacks = sc.nextInt();
        int maintenance = sc.nextInt();
        int electricity = sc.nextInt();

        System.out.println("Net Profit = " + 
        (ticket + snacks - maintenance - electricity));
    }
}
