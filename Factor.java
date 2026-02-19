import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int h = sc.nextInt();
        int o = sc.nextInt();
        int rej = sc.nextInt();

        System.out.println("Usable Rods = " + ((r * h) + o - rej));
    }
}

