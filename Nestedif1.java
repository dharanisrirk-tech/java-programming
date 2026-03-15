import java.util.Scanner;
public class Nestedif1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        System.out.println("Multiplication Table (" + rows + " x " + columns + "):");

        System.out.print("   ");
        for (int j = 1; j <= columns; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            System.out.printf("%4d", i); 

            for (int j = 1; j <= columns; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        sc.close();
    }
}