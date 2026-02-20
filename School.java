import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int rate = sc.nextInt();
        int maintenance = sc.nextInt();
        int allowance = sc.nextInt();
        int subsidy = sc.nextInt();

        System.out.println("Total Transport Fee = " + ((distance * rate) + maintenance + allowance - subsidy));
    }
}

