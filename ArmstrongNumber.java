import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num, res = 0, n = String.valueOf(num).length();
        while (original != 0) {
            res += Math.pow(original % 10, n);
            original /= 10;
        }
        System.out.println(res == num);
    }
}
