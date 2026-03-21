import java.util.Scanner;

public class Nestedif9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); 
        int middle = size / 2;

        System.out.println("Diamond Pattern:");

        for (int i = 0; i <= middle; i++) {
            for (int j = 0; j < middle - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = middle - 1; i >= 0; i--) {
            for (int j = 0; j < middle - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

