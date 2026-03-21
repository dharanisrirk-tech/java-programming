import java.util.*;

public class Nestedif8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int days = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[students];
        char[][] attendance = new char[students][days];

        for (int i = 0; i < students; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            names[i] = parts[0];
            for (int j = 0; j < days; j++) {
                attendance[i][j] = parts[j + 1].charAt(0);
            }
        }

        System.out.println("Attendance Matrix:");

        System.out.print("Student ");
        for (int d = 1; d <= days; d++) {
            System.out.print("Day" + d + " ");
        }
        System.out.println("Attendance%");

        int perfectCount = 0;

        for (int i = 0; i < students; i++) {
            System.out.print(names[i] + " ");

            int present = 0;

            for (int j = 0; j < days; j++) {
                System.out.print(attendance[i][j] + " ");
                if (attendance[i][j] == 'P') {
                    present++;
                }
            }

            double percentage = (present * 100.0) / days;

            if (percentage == 100.0) {
                perfectCount++;
            }

            System.out.printf("%.2f%%\n", percentage);
        }

        System.out.println("Perfect Attendance: " + perfectCount + " students");

        sc.close();
    }
}
