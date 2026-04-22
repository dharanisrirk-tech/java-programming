import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Course: " + course;
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
            
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        
        studentList.add(new Student(name, id, course));
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    private static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.println("Found: " + s);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        boolean removed = studentList.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }
}

