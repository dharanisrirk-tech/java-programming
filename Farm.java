
import java.util.Scanner;

public class Farm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yield = sc.nextInt();
        int acres = sc.nextInt();
        int extra = sc.nextInt();
        int damaged = sc.nextInt();

        System.out.println("Marketable Yield = " + 
        ((yield * acres) + extra - damaged));
    }
}