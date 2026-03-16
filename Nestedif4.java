import java.util.*;

public class Nestedif4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int subjects = sc.nextInt();

        String[] names = new String[students];
        int[][] marks = new int[students][subjects];
        
        for (int i = 0; i < students; i++) {
            names[i] = sc.next();
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("Grade Sheet:");
        System.out.print("Student ");
        for (int j = 1; j <= subjects; j++) {
            System.out.print("Sub" + j + " ");
        }
        System.out.println("Average");

        for (int i = 0; i < students; i++) {
            System.out.print(names[i] + " ");
            int sum = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + " ");
                sum += marks[i][j];
            }

            double avg = (double) sum / subjects;
            System.out.printf("%.2f\n", avg);
        }

        sc.close();
    }
}
