import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = reader.next().toLowerCase().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
        reader.close();
    }
}
