import java.util.Scanner;

public class Nestedif3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();     
        String type = sc.next();       

        System.out.println("Right Triangle Pattern:");

        for (int i = 1; i <= height; i++) {        
            for (int j = 1; j <= i; j++) {         
                if (type.equals("star")) {
                    System.out.print("*");
                } else if (type.equals("number")) {
                    System.out.print(j);
                }
            }
            System.out.println();   
        }

        sc.close();
    }
}