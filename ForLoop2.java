import java.util.Scanner;
public class ForLoop2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        int highest = 0;
        int pass = 0;
        int fail = 0;
        for(int i = 0; i<N; i++){
            String name =  sc.next();
            int score = sc.nextInt();

            char grade = 'F';
            if(score >= 85 && score <= 100){
                grade = 'A';
            }
            else if(score >= 70 && score <= 84){
                grade = 'B';
            }
            else if(score >= 60 && score <= 69){
                grade = 'C';
            }
            else if(score >= 50 && score <= 59){
                grade = 'D';
            }
            else if(score >= 0 && score <= 49){
                grade = 'F';
            }

            String status;
            if(score >= 60){
                status = "Pass";
                pass++;
            }
            else{
                status = "Fail";
                fail++;
            }  

            total += score;
            highest = Math.max(highest, score);

            System.out.println("Student : " + name);
            System.out.println("Score : " + score);
            System.out.println("Grade : " + grade);
            System.out.println("Status : " + status);
        }
        double average = total/N;
        System.out.println("Total Students: " + N);
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Students Passed: " + pass);
        System.out.println("Students Failed: " + fail);
    }
}
